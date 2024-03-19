package mone.schedule.job;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dao.CollectSudoDBDAO;
import mone.db.dao.PrcsDAO;

/**
 * 데이터 조회 후 연계 저장
 * 
 * @author iby
 *
 */
public class CollectData implements Job {
	// 로그
	private static final Logger logger = LogManager.getLogger(CollectData.class);

	/**
	 * constructor
	 */
	public CollectData() {
	}

	public static String selectFinalDb(String TbNm) throws Exception {
		SqlSession session = null;
		String result = "";

		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_CHECK_FINAL_DATE);
		try {

			if (DbManager.tiberoSudoDbConnVal < 0) {
				logger.warn(" [tibero sudo] db conn NG..");
				return null;
			}
			if (DbManager.tiberoDbConnVal < 0) {
				logger.warn(" [tibero] db conn NG..");
				return null;
			}

			session = DbManager.getSqlSessionTibero();

			Map<String, Object> resultMap = new HashMap<String, Object>();

			resultMap.put("chkTablenm", TbNm);
			resultMap.put("SelectFromDt", ConfigManager.getProps("tibero.select.from.date"));
			resultMap.put("SelectEndDt", ConfigManager.getProps("tibero.select.end.date"));

			logger.info(resultMap.toString());

			result = session.selectOne(sqlId, resultMap);
			session.commit();

		} catch (Exception e) {
			logger.error("Exception Message" + e.getClass().getSimpleName());
			e.printStackTrace();
		}

		return result;
	}

	/*
	 * 실행
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		try {
			logger.info(":::::::::::: 중점관리지역 DB 조회 시작일 " + selectFinalDb("vw_qw_emphs_manage_area"));
			/******************************* START ***********************************/
			CollectSudoDBDAO.execSudoData(PrcsDAO.sudo_db_data(selectFinalDb("vw_qw_emphs_manage_area")));
			/******************************* END ***********************************/

			logger.info(":::::::::::: 중점관리지역 Detail 조회 시작일 " + selectFinalDb("vw_qw_wqmsm"));
			/******************************* START ***********************************/
			CollectSudoDBDAO.execSudoDetailData(PrcsDAO.sudo_detail_data(selectFinalDb("vw_qw_wqmsm")));
			/******************************* END ***********************************/

		} catch (Exception e) {

			logger.error(e.getClass().getSimpleName() + e.getMessage());

			try {
				// 5초동안 대기
				Thread.sleep(1000 * 5);
			} catch (InterruptedException e1) {
			}

			JobExecutionException e2 = new JobExecutionException(e);

			logger.error("즉시 재시도 여부 설정 전:" + e2.refireImmediately()); // 재시도 여부 확인 false

			e2.setRefireImmediately(true); // 재시도 여부 true로 설정.

			logger.error("즉시 재시도 여부 설정 후 :" + e2.refireImmediately()); // 재시도 여부 확인 true

			throw e2; // 예외 발생.

		} 

	}

}
