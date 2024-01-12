package mone.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dto.TnProcsSttusDto;
import mone.db.dto.AnsimApiReqDTO;

/**
 * db 데이터 취득 및 갱신
 * @author iby
 *
 */
public class AnsimApiPrcsDAO {

	// 로그
	private static final Logger logger = LogManager.getLogger(PrcsDAO.class);

	/**
	 * constructor
	 */
	public AnsimApiPrcsDAO() {
	}


	/**
	 * 프로세스 상태 현황 & 이력 갱신
	 * @param procs_sttus_code
	 * @return
	 */
	public static int updateProcsStatus(String procs_sttus_code) throws Exception {
		int result = -1;


			if(DbManager.tiberoDbConnVal < 0) {
				logger.warn("db conn NG..");
				return result;
			}

			TnProcsSttusDto param = new TnProcsSttusDto();
			param.setProcs_id(ConstDef.TIBERO_PROCESS_ID);
			param.setProcs_sttus_cd(procs_sttus_code);

			// MERGE TN_PROCS_STTUS (프로세스 상태)
			// result = mergeTnProcsSttus(param);

			// INSERT TH_PROCS_STTUS (프로세스 상태이력)
			insertThProcsSttus(param);


		return result;
	}

	private static void insertThProcsSttus(TnProcsSttusDto param) {
		// TODO Auto-generated method stub
	}


	/**
	 * MERGE TN_PROCS_STTUS (프로세스 상태)
	 * @param param
	 * @return
	 */
	private static int mergeTnProcsSttus(TnProcsSttusDto param) throws Exception{
		SqlSession session = null;
		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_SYST_MNGM_AGT_STT);

		int result = 0;

			session = DbManager.getSqlSessionTibero();
			result = session.update(sqlId, param);
			session.commit();


		return result;
	}

	/**
	 * SELECT Sudo
	 * @return
	 */
	/*
	public static List<AnsimApiReqDTO> selectSudo() throws Exception{
		SqlSession session = null;
		String sqlId = String.format("%s.%s", ConstDef.TiberoSudoDB.NAMESPACE, ConstDef.TiberoSudoDB.SQLID_SUDO_DATA);

		List<AnsimApiReqDTO> resultList = null;

			if(DbManager.tiberoSudoDbConnVal < 0) {
				logger.warn("db conn NG..");
				return resultList;
			}

			logger.debug(String.format("SQLID:%s, getSize:%s", sqlId, resultList));

			session = DbManager.getSqlSessionTiberoSudo();
			resultList = session.selectList(sqlId);
			session.commit();


		return resultList;
	}
	 */


	public static void insertAnsimApi(Map<String, Object> dataMap) throws Exception{
		SqlSession session = null;
		String sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_ANSIM_DATA);


			if(DbManager.tiberoDbConnVal < 0) {
				logger.warn("db conn NG..");
				return;
			}

			session = DbManager.getSqlSessionTibero();
			int result = session.insert(sqlId, dataMap);
			session.commit();
			//logger.debug(" [안심확인제 api]db commit insertAnsimApi() " + result);

	}




}
