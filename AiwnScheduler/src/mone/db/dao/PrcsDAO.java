package mone.db.dao;

import java.io.File;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kw.lws.webservice.WsLwsWaterNowServicePortClient;
import kw.lws.webservice.WsLwsWaterNowVo;
import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dto.SystMngmAgtSttDTO;
import mone.db.dto.TiberoSudoResDTO;
import mone.db.dto.TiberoSudoResDTO.vw_qw_emphs_manage_area;
import mone.db.dto.TiberoSudoResDTO.vw_qw_wqmsm;

/**
 * db 데이터 취득 및 갱신
 * 
 * @author iby
 *
 */
public class PrcsDAO {

	// 로그
	private static final Logger logger = LogManager.getLogger(PrcsDAO.class);

	/**
	 * constructor
	 */
	public PrcsDAO() {
	}

	/**
	 * db 연결 체크
	 * 
	 * @return 정상 : 1, 이상 : -1
	 */
	public static int dbConnectCheckTibero() throws Exception {
		SqlSession session = null;
		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE,
				ConstDef.TiberoDB.SQLID_TIBERO_DB_CONN_CHECK);

		int result = -1;

		session = DbManager.getSqlSessionTibero();
		if (session != null) {
				result = session.selectOne(sqlId);
		}
		return result;
	}

	public static int dbConnectCheckTiberoSudo() throws Exception {
		SqlSession session = null;
		String sqlId = String.format("%s.%s", ConstDef.TiberoSudoDB.NAMESPACE,
				ConstDef.TiberoSudoDB.SQLID_TIBERO_SUDO_DB_CONN_CHECK);

		int result = -1;

		session = DbManager.getSqlSessionTiberoSudo();
		if (session != null) {
			result = session.selectOne(sqlId);
		}

		return result;
	}

	/**
	 * 프로세스 상태 현황 & 이력 갱신
	 * 
	 * @param procs_sttus_code
	 * @return
	 * @throws Exception
	 */
	public static int updateProcsStatus(String procs_sttus_code, String dbType) throws Exception {
		int result = -1;

		if (DbManager.tiberoDbConnVal < 0) {
			logger.warn(dbType + " [tibero] db conn NG..");
			return result;
		}

		if (DbManager.tiberoSudoDbConnVal < 0) {
			logger.warn(dbType + " [tiberoSudo] db conn NG..");
			return result;
		}

		SystMngmAgtSttDTO param = new SystMngmAgtSttDTO();

		param.setProcsType(dbType + "::conn");
		param.setProcsSttusCd(procs_sttus_code);
		param.setProcsCnt(DbManager.tiberoSudoDbConnVal);

		return result;
	}

	public static List<TiberoSudoResDTO.vw_qw_emphs_manage_area> sudo_db_data(String finalChkDt) throws Exception {
		SqlSession session = null;
		String resource = "config/" + ConfigManager.getProps("tiberoSudo.mybatis.conf.name");
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

		String sqlId = String.format("%s.%s", ConstDef.TiberoSudoDB.NAMESPACE,
				ConstDef.TiberoSudoDB.SQLID_VW_QW_EMPHS_MANAGE_AREA);
		List<TiberoSudoResDTO.vw_qw_emphs_manage_area> result = new ArrayList<vw_qw_emphs_manage_area>();

		if (DbManager.tiberoSudoDbConnVal < 0) {
			logger.warn(" [tibero sudo] db conn NG..");
			return null;
		}
		if (DbManager.tiberoDbConnVal < 0) {
			logger.warn(" [tibero] db conn NG..");
			return null;
		}

			session = sqlMapper.openSession();
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			
			resultMap.put("updtDt", finalChkDt);
			
			result = session.selectList(sqlId, resultMap);
//			session.commit();
			

		return result;
	}

	public static List<TiberoSudoResDTO.vw_qw_wqmsm> sudo_detail_data(String finalChkDt) throws Exception {
		SqlSession session = null;
		String resource = "config/" + ConfigManager.getProps("tiberoSudo.mybatis.conf.name");
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

		String sqlId = String.format("%s.%s", ConstDef.TiberoSudoDB.NAMESPACE, ConstDef.TiberoSudoDB.SQLID_VW_QW_WQMSM);
		List<TiberoSudoResDTO.vw_qw_wqmsm> result = new ArrayList<vw_qw_wqmsm>();

		if (DbManager.tiberoSudoDbConnVal < 0) {
			logger.warn(" [tibero sudo] db conn NG..");
			return null;
		}
		if (DbManager.tiberoDbConnVal < 0) {
			logger.warn(" [tibero] db conn NG..");
			return null;
		}

		session = sqlMapper.openSession();

		Map<String, Object> resultMap = new HashMap<String, Object>();

		resultMap.put("updtDt", finalChkDt);

		result = session.selectList(sqlId, resultMap);
//		session.commit();

		return result;
	}

	public static List<WsLwsWaterNowVo> ansim_data_oper1(String key, String ip, String fromDt, String toDt,
			String lastUpdt) throws Exception {

		logger.debug(" ::::::::::::: 수돗물안심확인제결과조회 chk api Start ::::::::::::: ");
		logger.debug(" 수돗물안심확인제결과조회 fromDt : {} | toDt : {} ", fromDt, toDt);

		List<WsLwsWaterNowVo> result = new ArrayList<WsLwsWaterNowVo>();
		WsLwsWaterNowServicePortClient wsLwsWaterNowService = new WsLwsWaterNowServicePortClient();
		result = wsLwsWaterNowService.getSAFETYCNFIRM2(key, ip, fromDt, toDt, lastUpdt);
		return result;
	}

	public static List<WsLwsWaterNowVo> ansim_data_oper2(String key, String ip, String fromDt, String toDt,
			String lastUpdt) throws Exception {

		logger.debug(" ::::::::::::: 옥내배관진단세척결과조회 chk api Start ::::::::::::: ");
		logger.debug(" 옥내배관진단세척결과조회 fromDt : {} | toDt : {} ", fromDt, toDt);

		List<WsLwsWaterNowVo> result = new ArrayList<WsLwsWaterNowVo>();
		WsLwsWaterNowServicePortClient wsLwsWaterNowService = new WsLwsWaterNowServicePortClient();
		result = wsLwsWaterNowService.GetINSDHOUSPIPNGDGNSSCLNSG2(key, ip, fromDt, toDt, lastUpdt);

		return result;
	}

}
