package mone.db.dto;

import lombok.Data;
/**
 * 초단기실황 응답메시지
 * @author iby
 *
 */
@Data
public class AnsimApiResDTO {

	private String dataset;
	private String fnctlcnm;
	private String inspctdivnm;
	private String prcsstatnm;
	private String rstnm;
	private String cstmrno;
	private String visitinspctdt;
	private String rqstdt;


}
