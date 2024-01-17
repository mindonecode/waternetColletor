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
import mone.db.dao.AnsimApiPrcsDAO;
import mone.db.dao.CollectSudoDBDAO;
import mone.db.dao.PrcsDAO;

/**
 * 데이터 조회 후 연계 저장
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
		String resource   = "config" + File.separator + ConfigManager.getProps("tibero.mybatis.conf.name");
        Reader reader 	= Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        String result = "";

		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_CHECK_ANSIMAPI_FINAL_DATE);
		try {

			if(DbManager.tiberoSudoDbConnVal < 0) 	{	logger.warn(" [tibero sudo] db conn NG..");		return null;	}
			if(DbManager.tiberoDbConnVal < 0) {	logger.warn(" [tibero] db conn NG..");	return null;	}

			session = sqlMapper.openSession();

			Map<String, Object> resultMap = new HashMap<String, Object>();

			resultMap.put("chkTypeNm", TypeNm);

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

				/************ 수돗물안심확인제결과조회2 ****************/
				AnsimApiPrcsDAO.execAnsimApiData(PrcsDAO.ansim_data_oper1(selectAnsimApiFinalDb("SAFETYCNFIRM2")), "SAFETYCNFIRM2");


				/************ 옥내배관진단세척결과조회2 ****************/
				AnsimApiPrcsDAO.execAnsimApiData(PrcsDAO.ansim_data_oper2(selectAnsimApiFinalDb("INSDHOUSPIPNGDGNSSCLNSG2")), "INSDHOUSPIPNGDGNSSCLNSG2");



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
