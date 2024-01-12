package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConstDef;
import mone.db.dao.PrcsDAO;

/**
 * 프로그램 종료 시 처리
 * @author iby
 *
 */
public class TiberoSudoDBShutdownHookThread extends Thread {

	// 로그
	private static final Logger logger = LogManager.getLogger(TiberoSudoDBShutdownHookThread.class);


	@SuppressWarnings("static-access")
	public void run() {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				System.out.println("Exception Message sleep" );
			}

			// 프로세스 상태 현황 & 이력 갱신 - OFF
			PrcsDAO prcsDAO = new PrcsDAO();
			try {
				prcsDAO.updateProcsStatus(ConstDef.PROCS_STTUS_CD.OFF, "TiberoSudo");
			} catch (Exception e) {
				System.out.println("Exception Message updateProcsStatus" );
			}

			logger.info("Tibero Shutdown(OFF:002)");

	}
}
