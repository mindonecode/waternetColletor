package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConstDef;
import mone.db.dao.PrcsDAO;

/**
 * 프로그램 실행 시 처리
 * @author iby
 *
 */
public class TiberoSudoDBRunProcessThread implements Runnable {

	// 로그
	private static final Logger logger = LogManager.getLogger(TiberoSudoDBRunProcessThread.class);

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			//logger.debug("PostgresDB Run(ON:001)");

			// 프로세스 상태 현황 & 이력 갱신 - ON
			PrcsDAO prcsDAO = new PrcsDAO();
			prcsDAO.updateProcsStatus(ConstDef.PROCS_STTUS_CD.ON, "TiberoSudo");

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(" :::::::::::::: " +  e.toString());
		}
	}
}
