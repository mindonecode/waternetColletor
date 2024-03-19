package mone.db.conn;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;

/**
 * db 연동
 * 
 * @author iby
 *
 */
public class DbManager {

	// 로그
	private static final Logger logger = LogManager.getLogger(DbManager.class);
	// sql 세션
	private static SqlSession _sqlSession_tibero = null;
	private static SqlSession _sqlSession_tibero_sudo = null;

	// 정상 : 1, 이상 : -1
	public static int tiberoDbConnVal = -1;
	public static int tiberoSudoDbConnVal = -1;

	public static void connTibero() throws IOException {

		closeTibero();

		String resource = "config/" + ConfigManager.getProps("tibero.mybatis.conf.name");

		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		_sqlSession_tibero = sqlMapper.openSession();
		
		tiberoDbConnVal = 1;
		logger.info(String.format("success initialize (TiberoDB)" + " : %s", resource));

	}

	public static void connTiberoSudo() throws IOException {

		closeTiberoSudo();

		String resource = "config/" + ConfigManager.getProps("tiberoSudo.mybatis.conf.name");

		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		_sqlSession_tibero_sudo = sqlMapper.openSession();

		tiberoDbConnVal = 1;
		logger.info(String.format("success initialize (TiberoSudoDB)" + " : %s", resource));

	}

	/**
	 * 주기적 db 재연결 시도 각각의 데이터베이스별 연결
	 */
	public static void startReconnectThreadTibero() {
		final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
		// 1분 주기
		executor.scheduleAtFixedRate(new TiberoReconnectThread(), 0, ConstDef.db_reconn_time_ms, TimeUnit.MILLISECONDS);
	}

	public static void startReconnectThreadTiberoSudo() {
		final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
		// 1분 주기
		executor.scheduleAtFixedRate(new TiberoSudoReconnectThread(), 0, ConstDef.db_reconn_time_ms,
				TimeUnit.MILLISECONDS);
	}

	/**
	 * sql 세션 반환
	 * 
	 * @return sql 세션
	 */
	public static SqlSession getSqlSessionTibero() {
		return _sqlSession_tibero;
	}

	public static SqlSession getSqlSessionTiberoSudo() {
		return _sqlSession_tibero_sudo;
	}

	/**
	 * sql 세션 닫기 close ORACLE
	 */
	public static void closeTibero() {

		tiberoDbConnVal = -1;

		if (getSqlSessionTibero() != null) {
			_sqlSession_tibero.close();
			_sqlSession_tibero = null;
		}

	}

	public static void closeTiberoSudo() {

		tiberoDbConnVal = -1;

		if (getSqlSessionTiberoSudo() != null) {
			_sqlSession_tibero_sudo.close();
			_sqlSession_tibero_sudo = null;
		}

	}

} // end of class
