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
import mone.db.dto.AnsimApiResDTO;
import mone.db.dto.SystMngmAgtSttDTO;
import mone.db.dto.TiberoResDTO;
import mone.db.dto.TiberoSudoResDTO;

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

	public static void execAnsimApiData(List<kw.lws.webservice.WsLwsWaterNowVo> tagResultList, String apiType) throws Exception {

		SystMngmAgtSttDTO systMngmAgtStt = new SystMngmAgtSttDTO();
		//systMngmAgtStt.setProcsSttusCd(ConstDef.TiberoDB.SQLID_SYST_MNGM_AGT_STT);

		systMngmAgtStt.setProcsCnt(insertAnsimApiData(tagResultList, apiType));
		//PrcsDAO.insertSystMngmAgtStt(systMngmAgtStt);
	}

	public static int insertAnsimApiData(List<kw.lws.webservice.WsLwsWaterNowVo> tagParams, String apiType) throws Exception{
		SqlSession session = null;
		String sqlId  = "";

		if("INSDHOUSPIPNGDGNSSCLNSG2".equals(apiType)) {
			String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_INSDHOUSPIPNGDGNSSCLNSG2);
		}else if("INSERT_SAFETYCNFIRM2".equals(apiType)) {
			String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_SAFETYCNFIRM2);
		}


		int ins_chk = tagParams.size();

			session = DbManager.getSqlSessionTibero();

			kw.lws.webservice.WsLwsWaterNowVo ansimApi  = new  kw.lws.webservice.WsLwsWaterNowVo();

			for(int i=0; i<tagParams.size(); i++) {

				ansimApi.setFnctlcnm (tagParams.get(i).getFnctlcnm());
				ansimApi.setInspctdivnm(tagParams.get(i).getInspctdivnm());
				ansimApi.setPrcsstatnm(tagParams.get(i).getPrcsstatnm());
				ansimApi.setRstnm(tagParams.get(i).getRstnm());
				ansimApi.setCstmrno(tagParams.get(i).getCstmrno());
				ansimApi.setVisitinspctdt(tagParams.get(i).getVisitinspctdt());
				ansimApi.setRqstdt(tagParams.get(i).getRqstdt());

				session.insert(sqlId, ansimApi);
			}

			session.commit();



		return ins_chk;
	}




}
