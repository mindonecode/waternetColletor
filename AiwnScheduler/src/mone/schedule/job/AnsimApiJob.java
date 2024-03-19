package mone.schedule.job;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import mone.db.dao.AnsimApiPrcsDAO;
import mone.db.dao.PrcsDAO;

/**
 * 데이터 조회 후 연계 저장
 * 
 * @author iby
 *
 */
public class AnsimApiJob implements Job {
	// 로그
	private static final Logger logger = LogManager.getLogger(AnsimApiJob.class);

	/**
	 * constructor
	 */
	public AnsimApiJob() {
	}

	public static String selectAnsimApiFinalDb(String TypeNm) throws Exception {
		SqlSession session = null;
		String result = "";

		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE,
				ConstDef.TiberoDB.SQLID_CHECK_ANSIMAPI_FINAL_DATE);
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
			resultMap.put("chkTypeNm", TypeNm);
			resultMap.put("SelectFromDt", ConfigManager.getProps("ansimApi.select.from.date"));
			resultMap.put("SelectEndDt", ConfigManager.getProps("ansimApi.select.end.date"));

			if (session == null) {
				System.out.println(18 + "+++++++++++++++");
			}

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

			String key = ConfigManager.getProps("ansimApi.api.key");

			InetAddress ipAddress = InetAddress.getLocalHost();
			String ip = ipAddress.getHostAddress();

			LocalDateTime date = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

			String toDt = date.format(formatter);
			String lastUpdt = null; // 여기에 날짜를 넣어주면 조건절의 수정일에 들어감 (AND TO_CHAR(A.LAST_UPDT_DT,'YYYYMMDD') = ?)

			String fromDt1 = selectAnsimApiFinalDb("SAFETYCNFIRM2").replaceAll("-", "");
			String fromDt2 = selectAnsimApiFinalDb("INSDHOUSPIPNGDGNSSCLNSG2").replaceAll("-", "");

			/************ 수돗물안심확인제결과조회2 ****************/
			AnsimApiPrcsDAO.execAnsimApiData(PrcsDAO.ansim_data_oper1(key, ip, fromDt1, toDt, lastUpdt),
					"SAFETYCNFIRM2");

			/************ 옥내배관진단세척결과조회2 ****************/
			AnsimApiPrcsDAO.execAnsimApiData(PrcsDAO.ansim_data_oper2(key, ip, fromDt2, toDt, lastUpdt),
					"INSDHOUSPIPNGDGNSSCLNSG2");

		} catch (Exception e) {

			e.printStackTrace();
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
