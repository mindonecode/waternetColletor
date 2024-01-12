package mone.db.conn;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.db.dao.PrcsDAO;

/**
 * db 재연결
 * @author iby
 *
 */
public class TiberoReconnectThread implements Runnable {

	// 로그
	private static final Logger logger = LogManager.getLogger(TiberoReconnectThread.class);

	/**
	 * 실행
	 */
	@Override
	public void run(){

			// 테스트 쿼리, 정상 : 1, 이상 : -1
			try {
				DbManager.tiberoDbConnVal = PrcsDAO.dbConnectCheckTibero();
			} catch (Exception e1) {
				System.out.println("Exception tiberoDbConnVal 1st");
			}

			if(DbManager.tiberoDbConnVal < 0) {
				logger.info("(NG)disconnected db, try connection ::: TiberoDB ");
				try {
					DbManager.connTibero();
				} catch (IOException e1) {
					System.out.println("Exception connTibero ");
				}

				// 테스트 쿼리, 정상 : 1, 이상 : -1
				try {
					DbManager.tiberoDbConnVal = PrcsDAO.dbConnectCheckTibero();
				} catch (Exception e) {
				System.out.println("Exception tiberoDbConnVal 2nd");
				}
				if(DbManager.tiberoDbConnVal < 0) {
					logger.debug("(OK)db connected  ::: TiberoDB ");
				}
			} else {
				logger.debug("(OK)db connected  ::: TiberoDB ");
			}

	}
}
