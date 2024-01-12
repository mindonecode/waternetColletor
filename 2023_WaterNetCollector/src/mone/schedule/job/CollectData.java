package mone.schedule.job;

import java.io.File;
import java.io.Reader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dao.CollectSudoDBDAO;
import mone.db.dao.PrcsDAO;

/**
 * 데이터 조회 후 연계 저장
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
		String resource   = "config" + File.separator + ConfigManager.getProps("tibero.mybatis.conf.name");
        Reader reader 	= Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        String result = "";

		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_CHECK_FINAL_DATE);
		try {

			if(DbManager.tiberoSudoDbConnVal < 0) 	{	logger.warn(" [tibero sudo] db conn NG..");		return null;	}
			if(DbManager.tiberoDbConnVal < 0) {	logger.warn(" [tibero] db conn NG..");	return null;	}

			session = sqlMapper.openSession();

			Map<String, Object> resultMap = new HashMap<String, Object>();

			resultMap.put("chkTablenm", TbNm);

			resultMap.put("SelectFromDt", ConfigManager.getProps("tibero.select.from.date"));
			resultMap.put("SelectEndDt", ConfigManager.getProps("tibero.select.end.date"));

			result = session.selectOne(sqlId, resultMap);
			session.commit();

			//System.out.println(":::::::::::: " + TbNm + "   " + result );

		} catch (Exception e) {
			System.out.println("Exception Message"  + e.getClass().getSimpleName() );
			e.printStackTrace();
		}finally {
			if(session!=null) {	session.close();}
		}

		return result;
	}


	/*
	 * 실행
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		Calendar now = Calendar.getInstance();
		int minute = now.get(Calendar.MINUTE);
		int intMin = 0;
		if(minute<10) {
			intMin = minute;
		}else {
			intMin = minute%10;
		}

		String nowReordTime = String.format("%02d", now.get(Calendar.HOUR_OF_DAY));
		String nowReordMin = String.format("%02d", now.get(Calendar.MINUTE));

			try {
					System.out.println(":::::::::::: 중점관리지역 DB 조회 시작일 " + selectFinalDb("vw_qw_emphs_manage_area")  );
					/*******************************START   ***********************************/
					CollectSudoDBDAO.execSudoData(PrcsDAO.sudo_db_data(selectFinalDb("vw_qw_emphs_manage_area")));
					/*******************************END     ***********************************/

					System.out.println(":::::::::::: 중점관리지역 Detail 조회 시작일 " + selectFinalDb("vw_qw_wqmsm")  );
					/*******************************START   ***********************************/
					CollectSudoDBDAO.execSudoDetailData(PrcsDAO.sudo_detail_data(selectFinalDb("vw_qw_wqmsm")));
					/*******************************END     ***********************************/


			} catch (Exception e) {
				System.out.println("Exception Message"  + e.getClass().getSimpleName() );

				if(!"real".equals(ConfigManager.getProps("waternet.oper.mode"))) {
					//운영 모드에서는 로그 출력을 하지 않기 위함
					logger.error(e.getClass().getSimpleName() + e.getMessage() );
				}

				try {
	                //5초동안 대기
	                Thread.sleep(1000*5);
	            } catch (InterruptedException e1) { }

	            JobExecutionException e2 = new JobExecutionException(e);

	            System.out.println("즉시 재시도 여부 설정 전:"+e2.refireImmediately()); //재시도 여부 확인 false

	            e2.setRefireImmediately(true); //재시도 여부 true로 설정.

	            System.out.println("즉시 재시도 여부 설정 후 :"+e2.refireImmediately()); //재시도 여부 확인 true

	            throw e2; //예외 발생.

			}

	}


}
