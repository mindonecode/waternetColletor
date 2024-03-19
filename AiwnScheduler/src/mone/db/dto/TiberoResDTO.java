package mone.db.dto;

import java.util.List;

import lombok.Data;

/**
 * postgres db
 * @author iby
 *
 */
@Data
public class TiberoResDTO {

	private String  chkTableNm;

	@Data
    public static class sudo_data {

		private String  chkTableNm;


	}


	@Data
    public static class vw_qw_emphs_manage_area {

		private String  emphsManageAreaCd;
		private String  emphsManageAreaNm;
		private String  wubCd;
		private String  wubNm;
		private String  appnDe;
		private String  ablDe;
		private String  useYn;
		private String  useCdNm;
		private String  inputDt;
		private String  updtDt;
		private String  rm;
		private String  changeYm;
		private String  detailMapAtchmnflNo;
		private String  spotPhotoAtchmnflNo;
		private String  legaldongCd;
		private String  legaldongAddr;
		private String  rnCd;
		private String  rnAddr;
		private String  popsrv;
		private String  inspctCo;
		private String  inspctWqyMdatPrvonsh;
		private String  detailChangeYm;
		private String	 stdCo;
	}


	@Data
    public static class vw_qw_wqmsm {
		private String  mesureInfoNo;
		private String  fcltsNo;
		private String  fcltyNm;
		private String  fcltsAddr;
		private String  inspctDe;
		private String  inspctSeCd;
		private String  inspctSeNm;
		private String  inspctEngnCd;
		private String  inspctEngnNm;
		private String  wtqltStdrDe;
		private String  inspctPnttmCd;
		private String  inspctPnttmNm;
		private String  inspctMn;
		private String  inspctOdr;
		private String  pickDe;
		private String  inspctIemCo;
		private String  legaldongCd;
		private String  legaldongNm;
		private String  mesureSpotDetailAddr;
		private String  rnCd;
		private String  rnAddr;
		private String  gnrlEnlfSeCd;
		private String  gnrlEnlfSeNm;
		private String  wspCrseCd;
		private String  wspCrseNm;
		private String  deleteYn;
		private String  deleteNm;
		private String  watsrcSeCd;
		private String  watsrcSeNm;
		private String  wspMthdCd;
		private String  wspMthdNm;
		private String  plantCd;
		private String  plantNm;
		private String  layCd;
		private String  layNm;
		private String  fctSeCd;
		private String  fctSeNm;
		private String  inputDt;
		private String  updtDt;
		private String  wubCd;
		private String  wubNm;
		private String  cnfirmSeCd;
		private String  cnfirmSeNm;
		private String  emphsManageAreaCd;
		private String  emphsManageAreaNm;
		private String  grdctPblicteDe;
		private String  inspctIemCd;
		private String  inspctIemNm;
		private String  stdr1Val;
		private String  stdr2Val;
		private String  dcmlpointVal;
		private String  excsNm;
		private String  excsCauseCd;
		private String  excsCauseNm;
		private String  excsCauseCn;
		private String  managtCn;
		private String  mesureVal;
		private String  detailInputDt;
		private String  detailUpdtDt;
		private String  managtComptDe;
		private String  managtSttusCd;
		private String  managtSttusNm;
		private String  inhbtntNoticeYn;
		private String  inhbtntNoticeNm;
		private String	 inspctIemAlias;
		private String  stdr1UnitNm;
		private String	 stdr2UnitNm;

	}


}
