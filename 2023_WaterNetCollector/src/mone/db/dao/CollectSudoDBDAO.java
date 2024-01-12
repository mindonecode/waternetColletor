package mone.db.dao;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mone.common.conf.ConstDef;
import mone.db.conn.DbManager;
import mone.db.dto.TiberoResDTO;
import mone.db.dto.TiberoSudoResDTO;
import mone.db.dto.SystMngmAgtSttDTO;

/**
 * db 데이터 취득 및 갱신
 * @author iby
 *
 */
public class CollectSudoDBDAO {

	// 로그
	private static final Logger logger = LogManager.getLogger(CollectSudoDBDAO.class);

	/**
	 * constructor
	 */
	public CollectSudoDBDAO() {
	}


	public static void execSudoData(List<TiberoSudoResDTO.vw_qw_emphs_manage_area> tagResultList) throws Exception {

		SystMngmAgtSttDTO systMngmAgtStt = new SystMngmAgtSttDTO();
		//systMngmAgtStt.setProcsSttusCd(ConstDef.TiberoDB.SQLID_SYST_MNGM_AGT_STT);

		systMngmAgtStt.setProcsCnt(insertSudoData(tagResultList));
		//PrcsDAO.insertSystMngmAgtStt(systMngmAgtStt);
	}

	public static int insertSudoData(List<TiberoSudoResDTO.vw_qw_emphs_manage_area> tagParams) throws Exception{
		SqlSession session = null;
		String sqlId  = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_VW_QW_EMPHS_MANAGE_AREA);

		int ins_chk = tagParams.size();

			session = DbManager.getSqlSessionTibero();

			TiberoResDTO.vw_qw_emphs_manage_area sudoDB  = new  TiberoResDTO.vw_qw_emphs_manage_area();

			for(int i=0; i<tagParams.size(); i++) {

				sudoDB.setEmphsManageAreaCd(tagParams.get(i).getEmphsManageAreaCd());
				sudoDB.setEmphsManageAreaNm(tagParams.get(i).getEmphsManageAreaNm());
				sudoDB.setWubCd(tagParams.get(i).getWubCd());
				sudoDB.setWubNm(tagParams.get(i).getWubNm());
				sudoDB.setAppnDe(tagParams.get(i).getAppnDe());
				sudoDB.setAblDe(tagParams.get(i).getAblDe());
				sudoDB.setUseYn(tagParams.get(i).getUseYn());
				sudoDB.setUseCdNm(tagParams.get(i).getUseCdNm());
				sudoDB.setInputDt(tagParams.get(i).getInputDt());
				sudoDB.setUpdtDt(tagParams.get(i).getUpdtDt());
				sudoDB.setRm(tagParams.get(i).getRm());
				sudoDB.setChangeYm(tagParams.get(i).getChangeYm());
				sudoDB.setDetailMapAtchmnflNo(tagParams.get(i).getDetailMapAtchmnflNo());
				sudoDB.setSpotPhotoAtchmnflNo(tagParams.get(i).getSpotPhotoAtchmnflNo());
				sudoDB.setLegaldongCd(tagParams.get(i).getLegaldongCd());
				sudoDB.setLegaldongAddr(tagParams.get(i).getLegaldongAddr());
				sudoDB.setRnCd(tagParams.get(i).getRnCd());
				sudoDB.setRnAddr(tagParams.get(i).getRnAddr());
				sudoDB.setPopsrv(tagParams.get(i).getPopsrv());
				sudoDB.setInspctCo(tagParams.get(i).getInspctCo());
				sudoDB.setInspctWqyMdatPrvonsh(tagParams.get(i).getInspctWqyMdatPrvonsh());
				sudoDB.setDetailChangeYm(tagParams.get(i).getDetailChangeYm());
				session.insert(sqlId, sudoDB);
			}

			session.commit();



		return ins_chk;
	}


	public static void execSudoDetailData(List<TiberoSudoResDTO.vw_qw_wqmsm> tagResultList) throws Exception {

		SystMngmAgtSttDTO systMngmAgtStt = new SystMngmAgtSttDTO();
		//systMngmAgtStt.setProcsSttusCd(ConstDef.TiberoDB.SQLID_SYST_MNGM_AGT_STT);

		systMngmAgtStt.setProcsCnt(insertSudoDetailData(tagResultList));
		//PrcsDAO.insertSystMngmAgtStt(systMngmAgtStt);
	}

	public static int insertSudoDetailData(List<TiberoSudoResDTO.vw_qw_wqmsm> tagParams) throws Exception{
		SqlSession session = null;
		String sqlId  = String.format("%s.%s", ConstDef.TiberoDB.NAMESPACE, ConstDef.TiberoDB.SQLID_INSERT_VW_QW_WQMSM);

		int ins_chk = tagParams.size();

			session = DbManager.getSqlSessionTibero();

			TiberoResDTO.vw_qw_wqmsm sudoDetailDB  = new  TiberoResDTO.vw_qw_wqmsm();

			for(int i=0; i<tagParams.size(); i++) {

				sudoDetailDB.setMesureInfoNo(tagParams.get(i).getMesureInfoNo());
				sudoDetailDB.setFcltsNo(tagParams.get(i).getFcltsNo());
				sudoDetailDB.setFcltyNm(tagParams.get(i).getFcltyNm());
				sudoDetailDB.setFcltsAddr(tagParams.get(i).getFcltsAddr());
				sudoDetailDB.setInspctDe(tagParams.get(i).getInspctDe());
				sudoDetailDB.setInspctSeCd(tagParams.get(i).getInspctSeCd());
				sudoDetailDB.setInspctSeNm(tagParams.get(i).getInspctSeNm());
				sudoDetailDB.setInspctEngnCd(tagParams.get(i).getInspctEngnCd());
				sudoDetailDB.setInspctEngnNm(tagParams.get(i).getInspctEngnNm());
				sudoDetailDB.setWtqltStdrDe(tagParams.get(i).getWtqltStdrDe());
				sudoDetailDB.setInspctPnttmCd(tagParams.get(i).getInspctPnttmCd());
				sudoDetailDB.setInspctPnttmNm(tagParams.get(i).getInspctPnttmNm());
				sudoDetailDB.setInspctMn(tagParams.get(i).getInspctMn());
				sudoDetailDB.setInspctOdr(tagParams.get(i).getInspctOdr());
				sudoDetailDB.setPickDe(tagParams.get(i).getPickDe());
				sudoDetailDB.setInspctIemCo(tagParams.get(i).getInspctIemCo());
				sudoDetailDB.setLegaldongCd(tagParams.get(i).getLegaldongCd());
				sudoDetailDB.setLegaldongNm(tagParams.get(i).getLegaldongNm());
				sudoDetailDB.setMesureSpotDetailAddr(tagParams.get(i).getMesureSpotDetailAddr());
				sudoDetailDB.setRnCd(tagParams.get(i).getRnCd());
				sudoDetailDB.setRnAddr(tagParams.get(i).getRnAddr());
				sudoDetailDB.setGnrlEnlfSeCd(tagParams.get(i).getGnrlEnlfSeCd());
				sudoDetailDB.setGnrlEnlfSeNm(tagParams.get(i).getGnrlEnlfSeNm());
				sudoDetailDB.setWspCrseCd(tagParams.get(i).getWspCrseCd());
				sudoDetailDB.setWspCrseNm(tagParams.get(i).getWspCrseNm());
				sudoDetailDB.setDeleteYn(tagParams.get(i).getDeleteYn());
				sudoDetailDB.setDeleteNm(tagParams.get(i).getDeleteNm());
				sudoDetailDB.setWatsrcSeCd(tagParams.get(i).getWatsrcSeCd());
				sudoDetailDB.setWatsrcSeNm(tagParams.get(i).getWatsrcSeNm());
				sudoDetailDB.setWspMthdCd(tagParams.get(i).getWspMthdCd());
				sudoDetailDB.setWspMthdNm(tagParams.get(i).getWspMthdNm());
				sudoDetailDB.setPlantCd(tagParams.get(i).getPlantCd());
				sudoDetailDB.setPlantNm(tagParams.get(i).getPlantNm());
				sudoDetailDB.setLayCd(tagParams.get(i).getLayCd());
				sudoDetailDB.setLayNm(tagParams.get(i).getLayNm());
				sudoDetailDB.setFctSeCd(tagParams.get(i).getFctSeCd());
				sudoDetailDB.setFctSeNm(tagParams.get(i).getFctSeNm());
				sudoDetailDB.setInputDt(tagParams.get(i).getInputDt());
				sudoDetailDB.setUpdtDt(tagParams.get(i).getUpdtDt());
				sudoDetailDB.setWubCd(tagParams.get(i).getWubCd());
				sudoDetailDB.setWubNm(tagParams.get(i).getWubNm());
				sudoDetailDB.setCnfirmSeCd(tagParams.get(i).getCnfirmSeCd());
				sudoDetailDB.setCnfirmSeNm(tagParams.get(i).getCnfirmSeNm());
				sudoDetailDB.setEmphsManageAreaCd(tagParams.get(i).getEmphsManageAreaCd());
				sudoDetailDB.setEmphsManageAreaNm(tagParams.get(i).getEmphsManageAreaNm());
				sudoDetailDB.setGrdctPblicteDe(tagParams.get(i).getGrdctPblicteDe());
				sudoDetailDB.setInspctIemCd(tagParams.get(i).getInspctIemCd());
				sudoDetailDB.setInspctIemNm(tagParams.get(i).getInspctIemNm());
				sudoDetailDB.setStdr1Val(tagParams.get(i).getStdr1Val());
				sudoDetailDB.setStdr2Val(tagParams.get(i).getStdr2Val());
				sudoDetailDB.setDcmlpointVal(tagParams.get(i).getDcmlpointVal());
				sudoDetailDB.setExcsNm(tagParams.get(i).getExcsNm());
				sudoDetailDB.setExcsCauseCd(tagParams.get(i).getExcsCauseCd());
				sudoDetailDB.setExcsCauseNm(tagParams.get(i).getExcsCauseNm());
				sudoDetailDB.setExcsCauseCn(tagParams.get(i).getExcsCauseCn());
				sudoDetailDB.setManagtCn(tagParams.get(i).getManagtCn());
				sudoDetailDB.setMesureVal(tagParams.get(i).getMesureVal());
				sudoDetailDB.setDetailInputDt(tagParams.get(i).getDetailInputDt());
				sudoDetailDB.setDetailUpdtDt(tagParams.get(i).getDetailUpdtDt());
				sudoDetailDB.setManagtComptDe(tagParams.get(i).getManagtComptDe());
				sudoDetailDB.setManagtSttusCd(tagParams.get(i).getManagtSttusCd());
				sudoDetailDB.setManagtSttusNm(tagParams.get(i).getManagtSttusNm());
				sudoDetailDB.setInhbtntNoticeYn(tagParams.get(i).getInhbtntNoticeYn());
				sudoDetailDB.setInhbtntNoticeNm(tagParams.get(i).getInhbtntNoticeNm());

				session.insert(sqlId, sudoDetailDB);

			}

			session.commit();



		return ins_chk;
	}


}
