package mone.db.conn;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.db.dao.PrcsDAO;

/**
 * db 재연결
 * 
 * @author iby
 *
 */
public class TiberoSudoReconnectThread implements Runnable {

	// 로그
	private static final Logger logger = LogManager.getLogger(TiberoSudoReconnectThread.class);

	/**
	 * 실행
	 */
	public void run() {

		// 테스트 쿼리, 정상 : 1, 이상 : -1
		try {
			DbManager.tiberoSudoDbConnVal = PrcsDAO.dbConnectCheckTiberoSudo();
		} catch (Exception e1) {
			logger.error("Exception tiberoSudoDbConnVal 1st");
		}

		if (DbManager.tiberoSudoDbConnVal < 0) {
			logger.info("(NG)disconnected db, try connection ::: TiberoSudoDB ");
			try {
				DbManager.connTiberoSudo();
			} catch (IOException e1) {
				logger.error("Exception connTiberoSudo ");
			}

			// 테스트 쿼리, 정상 : 1, 이상 : -1
			try {
				DbManager.tiberoSudoDbConnVal = PrcsDAO.dbConnectCheckTiberoSudo();
			} catch (Exception e) {
				logger.error("Exception tiberoSudoDbConnVal 2nd");
			}
			if (DbManager.tiberoSudoDbConnVal < 0) {
				logger.debug("(OK)db connected  ::: TberoSudoDB ");
			}
		} else {
			logger.debug("(OK)db connected  ::: TberoSudoDB ");
		}

	}
}