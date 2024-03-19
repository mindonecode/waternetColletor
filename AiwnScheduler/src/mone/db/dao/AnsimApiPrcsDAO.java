package mone.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kw.lws.webservice.WsLwsWaterNowVo;
import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dto.SystMngmAgtSttDTO;

/**
 * db 데이터 취득 및 갱신
 * 
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

	public static void execAnsimApiData(List<WsLwsWaterNowVo> tagResultList, String apiType) throws Exception {

		insertAnsimApiData(tagResultList, apiType);
	}

	public static int insertAnsimApiData(List<WsLwsWaterNowVo> tagParams, String apiType) throws Exception {
		SqlSession session = null;
		String sqlId = "";

		if ("INSDHOUSPIPNGDGNSSCLNSG2".equals(apiType)) {
			sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE,
					ConstDef.TiberoDB.SQLID_INSERT_INSDHOUSPIPNGDGNSSCLNSG2);
		} else if ("SAFETYCNFIRM2".equals(apiType)) {
			sqlId = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_SAFETYCNFIRM2);
		}

		int ins_chk = tagParams.size();

		session = DbManager.getSqlSessionTibero();

		for (int i = 0; i < tagParams.size(); i++) {

			WsLwsWaterNowVo ansimApi = new WsLwsWaterNowVo();
			ansimApi.setFnctlcnm(tagParams.get(i).getFnctlcnm());
			ansimApi.setInspctdivnm(tagParams.get(i).getInspctdivnm());
			ansimApi.setPrcsstatnm(tagParams.get(i).getPrcsstatnm());
			ansimApi.setRstnm(tagParams.get(i).getRstnm());
			ansimApi.setCstmrno(tagParams.get(i).getCstmrno());
			ansimApi.setVisitinspctdt(tagParams.get(i).getVisitinspctdt());
			ansimApi.setRqstdt(tagParams.get(i).getRqstdt());

			session.insert(sqlId, ansimApi);
		}
		
		logger.info("안심확인제 : {} 건 처리완료",tagParams.size());

		session.commit();

		return ins_chk;
	}

}
