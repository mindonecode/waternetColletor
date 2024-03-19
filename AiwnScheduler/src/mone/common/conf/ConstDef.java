package mone.common.conf;

/**
 *
 * @author iby
 *
 */
public class ConstDef {

	// 프로젝트 기본 경로
	public static final String USER_DIR = System.getProperty("user.dir");

	//운영서버는 요넘으로
	public static final String CONF_PROPS_PATH = "config/config.properties";
	public static final String LOG_CONF_PATH = "config/log4j2.xml";

	// 프로세스 ID
	public static final String TIBERO_SUDO_PROCESS_ID = "00MRA00000302";
	public static final String TIBERO_PROCESS_ID = "00PST00000902";

	// 파일 속성값 구분자 "|"
	public static final String SEPARATOR = "|";


	// json의 시작 태그 문자
	public static final String START_TAG_JSON = "{";
	// xml의 시작 태그 문자
	public static final String START_TAG_XML = "<";

	// db 재연결 시도 주기 (ms)
	public static final int db_reconn_time_ms = 1000 * 60;
	// 프로세스 정상 기동 체크 주기 (ms)
	public static final int prcs_heartbeat_tims_ms = 1000 * 30;

	/**
	 * 시간 포맷별 번호
	 * @author iby
	 * @date 2023.09.21
	 */
	public enum EnumDateFormat {
		YYYY_MM_DD_HH24_MM_SS,
		YYYYMMDDHH24MMSS,
		YYYYMMDD,
		HH24MM,
		HH12MM,
		HH24MMSS, YYYY_MM_DD,
	}

	/**
	 *
	 * @author iby
	 *
	 */
	public static class OnOff {
		public static String ON = "on";
		public static String OFF = "off";
	}

	/**
	 * 상태코드
	 * @author iby
	 *
	 */
	public static class PROCS_STTUS_CD {
		public static String ON = "001";
		public static String OFF = "002";
	}



	/**
	 * SQL.xml id 정의
	 * @author iby
	 *
	 */

	//중점관리질역 수질 연계 DB
	public static class TiberoSudoDB {
		public static String NAMESPACE = "TiberoSudoDB";

		public static final String SQLID_TIBERO_SUDO_DB_CONN_CHECK 		= "tibero_sudo_db_conn_check";
		public static final String SQLID_SYST_MNGM_AGT_STT 				= "insert_syst_mngm_agt_stt";

		public static final String SQLID_VW_QW_EMPHS_MANAGE_AREA 		= "select_vw_qw_emphs_manage_area";
		public static final String SQLID_VW_QW_WQMSM					= "select_vw_qw_wqmsm";

	}


	public static class TiberoDB {
		public static String NAMESPACE = "TiberoDB";

		/*Ansim API 최종 데이터 확인*/
		public static final String SQLID_CHECK_ANSIMAPI_FINAL_DATE 		= "check_ansimApi_final_date";

		public static final String SQLID_TIBERO_DB_CONN_CHECK 			= "tibero_db_conn_check";

		/*중점관리지역 최종 데이터 확인*/
		public static final String SQLID_CHECK_FINAL_DATE 				= "check_final_date";


		public static final String SQLID_INSERT_VW_QW_EMPHS_MANAGE_AREA	= "insert_vw_qw_emphs_manage_area_test";
		public static final String SQLID_INSERT_VW_QW_WQMSM				= "insert_vw_qw_wqmsm_test";


		public static final String SQLID_INSERT_INSDHOUSPIPNGDGNSSCLNSG2= "insert_insdhouspipngdgnssclnsg2";
		public static final String SQLID_INSERT_SAFETYCNFIRM2			= "insert_safetycnfirm2";


	}



	/**
	 * API 결과 코드
	 * @author iby
	 *
	 */
	public static class ApiResultCode {


	}


}
