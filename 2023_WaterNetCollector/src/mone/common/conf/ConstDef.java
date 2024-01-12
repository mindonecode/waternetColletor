package mone.common.conf;

/**
 *
 * @author iby
 *
 */
public class ConstDef {

	// 프로젝트 기본 경로
	public static final String USER_DIR = System.getProperty("user.dir");

	/* 로컬 운영 /resources 경로 확인 */
	// 로컬은 요넘으로
	public static final String CONF_PROPS_PATH_DEV = "/resources/config/config.properties";
	public static final String LOG_CONF_PATH_DEV = "/resources/config/log4j2_dev.xml";

	//운영서버는 요넘으로
	public static final String CONF_PROPS_PATH = "/resources/config/config.properties";
	public static final String LOG_CONF_PATH = "/resources/config/log4j2.xml";

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

		public static final String SQLID_TIBERO_DB_CONN_CHECK 			= "tibero_db_conn_check";
		public static final String SQLID_SYST_MNGM_AGT_STT 				= "insert_syst_mngm_agt_stt";
		public static final String SQLID_CHECK_FINAL_DATE 				= "check_final_date";


		public static final String SQLID_INSERT_VW_QW_EMPHS_MANAGE_AREA	= "insert_vw_qw_emphs_manage_area";
		public static final String SQLID_INSERT_VW_QW_WQMSM				= "insert_vw_qw_wqmsm";


		public static final String SQLID_INSERT_ANSIM_DATA				= "insert_insert_ansim_data";

	}

	/**
	 * API 결과 코드
	 * @author iby
	 *
	 */
	public static class ApiResultCode {
		// 정상
		public static String NORMAL_CODE = "00";
		// 어플리케이션 에러
		public static String APPLICATION_ERROR = "01";
		// 데이터베이스 에러
		public static String DB_ERROR = "02";
		// 데이터없음 에러
		public static String NODATA_ERROR = "03";
		// HTTP 에러
		public static String HTTP_ERROR = "04";
		// 서비스 연결실패 에러
		public static String SERVICETIMEOUT_ERROR = "05";
		// 잘못된 요청 파라메터 에러
		public static String INVALID_REQUEST_PARAMETER_ERROR = "10";
		// 필수요청 파라메터가 없음
		public static String NO_MANDATORY_REQUEST_PARAMETERS_ERROR = "11";
		// 해당 오픈API서비스가 없거나 폐기됨
		public static String NO_OPENAPI_SERVICE_ERROR = "12";
		// 서비스 접근거부
		public static String SERVICE_ACCESS_DENIED_ERROR = "20";
		// 일시적으로 사용할 수 없는 서비스 키
		public static String TEMPORARILY_DISABLE_THE_SERVICEKEY_ERROR = "21";
		// 서비스 요청제한횟수 초과에러
		public static String LIMITED_NUMBER_OF_SERVICE_REQUESTS_EXCEEDS_ERROR = "22";
		// 등록되지 않은 서비스키
		public static String SERVICE_KEY_IS_NOT_REGISTERED_ERROR = "30";
		// 기한만료된 서비스키
		public static String DEADLINE_HAS_EXPIRED_ERROR = "31";
		// 등록되지 않은 IP
		public static String UNREGISTERED_IP_ERROR = "32";
		// 서명되지 않은 호출
		public static String UNSIGNED_CALL_ERROR = "33";
		// 기타에러
		public static String UNKNOWN_ERROR = "99";

	}


}
