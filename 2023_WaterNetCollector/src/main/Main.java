package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.common.util.Utils;
import mone.db.conn.DbManager;
import mone.db.dao.PrcsDAO;
import mone.schedule.scheduler.AnsimApiScheduleManager;
import mone.schedule.scheduler.ScheduleManager;

/**
 * 메인
 * 실시간 수질정보 및 민원 정보 스케줄링
 *
 * @author iby
 *
 */
public class Main {
	// 로그
	private static Logger logger = null;
	static String dbType;

	/**
	 * 메인메소드
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

			// [STEP 0] 프로세스 중복 기동 체크
			if (isAleadyRunning() == true) {
	            return;
	        }

			// [STEP 1] 로그 설정
			if(initLog() == true) {

				// [STEP 2] 설정 파일 로드
				if(loadConfigFile() == true) {

					logger.info("process run!");
					logger.info("success load log file");
					logger.info(String.format("pid@hostname:%s", Utils.getJVMName()));

					// [STEP 3-1] 프로세스 종료 시 실행할 처리 설정
					Runtime.getRuntime().addShutdownHook(new TiberoSudoDBShutdownHookThread());

					// [STEP 3-2] tibero sudo DB 연결 & 체크
					DbManager.connTiberoSudo();
					DbManager.startReconnectThreadTiberoSudo();
					//  정상 : 1, 이상 : -1

					int tiberoSudoDbConnChk = PrcsDAO.dbConnectCheckTiberoSudo();
					if(tiberoSudoDbConnChk < 0) {
						logger.warn("1: [tiberoSudo] db conn NG..");
						return;
					}


					// [STEP 4-1] 프로세스 종료 시 실행할 처리 설정
					Runtime.getRuntime().addShutdownHook(new TiberoDBShutdownHookThread());

					// [STEP 4-2] tibero DB 연결 & 체크
					DbManager.connTibero();
					DbManager.startReconnectThreadTibero();
					//  정상 : 1, 이상 : -1

					int tiberoDbConnChk = PrcsDAO.dbConnectCheckTibero();
					if(tiberoDbConnChk < 0) {
						logger.warn("2: [tibero] db conn NG..");
						return;
					}

					// [STEP 6] 프로세스 실행 중 주기적 처리 (30초 주기)
					final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

					//tibero sudo db 상태는 미 저장
					executor.scheduleAtFixedRate(new TiberoSudoDBRunProcessThread(), 0, ConstDef.prcs_heartbeat_tims_ms, TimeUnit.MILLISECONDS);
					executor.scheduleAtFixedRate(new TiberoDBRunProcessThread(), 0, ConstDef.prcs_heartbeat_tims_ms, TimeUnit.MILLISECONDS);

					// [STEP 7] db to db 스케쥴링 시작
					startScheduler();


				}
			}

	}

	/**
	 * 로그 설정 파일 로드
	 * @throws UnknownHostException
	 */
	private static boolean initLog() throws UnknownHostException {
		boolean result = false;

		String logConfFile = "";

			// 운영과 개발의 자동 스위칭을 위한 조건 설정
			/*if(!"192.168.1.19".equals(InetAddress.getLocalHost().getHostAddress()) &&
				!"121.152.181.163".equals(InetAddress.getLocalHost().getHostAddress())	) {

			 }else{
				 logConfFile = ConstDef.USER_DIR + ConstDef.LOG_CONF_PATH_DEV;
			 }
			*/

			logConfFile = ConstDef.USER_DIR + ConstDef.LOG_CONF_PATH;
			System.setProperty(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, logConfFile);
			logger = LogManager.getLogger(Main.class);

			result = true;


		return result;
	}

	/**
	 * 프로세스 기동 준비(설정파일 로드 등)
	 * @throws IOException
	 */
	private static boolean loadConfigFile() throws IOException {
		ConfigManager configManager = new ConfigManager();
		boolean result = configManager.init();
		return result;
	}

	/**
	 * db to db 수집 스케쥴링 초기화 및 시작
	 * @return
	 * @throws Exception
	 */
	private static void startScheduler() throws Exception {
		startCollectDBScheduler();		// <==DB2DB Polling 스케쥴러

		//startAnsimScheduler();			// <=APIPolling 스케쥴러
	}

	private static void startCollectDBScheduler() throws Exception{
		ScheduleManager scheduleManager = new ScheduleManager();
		scheduleManager.init();
		scheduleManager.start();
	}

	private static void startAnsimScheduler() throws Exception{
		AnsimApiScheduleManager ansimScheduleManager = new AnsimApiScheduleManager();
		ansimScheduleManager.init();
		ansimScheduleManager.start();
	}

	/**
	 * 프로세스 기동여부 확인.
	 *  이미 기동 중의 경우 종료.
	 * @throws Exception
	 */
	private static boolean isAleadyRunning() throws Exception {
		boolean result = true;


			final File file = new File("file.lock");
	        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
				final FileChannel fc = randomAccessFile.getChannel();
				final FileLock fileLock = fc.tryLock();
				if(fileLock == null) {
					fc.close();
					throw new Exception();
				}
			}
	        result = false;


		return result;
	}
}
