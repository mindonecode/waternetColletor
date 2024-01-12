package mone.db.dto;

import lombok.Data;
/**
 * 초단기실황 응답메시지
 * @author iby
 *
 */
@Data
public class AnsimApiResDTO {

	private String FNCTLCNM;
	private String INSPCTDIVNM;
	private String PRCSSTATNM;
	private String RSTNM;
	private String CSTMRNO;
	private String VISITINSPCTDT;
	private String RQSTDT;


}
