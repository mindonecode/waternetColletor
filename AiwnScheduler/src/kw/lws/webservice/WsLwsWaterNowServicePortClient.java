package kw.lws.webservice;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import kw.lws.webservice.impl.WsLwsWaterNowService;

@Component("WsLwsWaterNowService")
public class WsLwsWaterNowServicePortClient {

	private static final QName SERVICE_NAME = new QName("http://impl.webservice.lws.kw/", "WsLwsWaterNowService");

	private static final Logger LOGGER = LoggerFactory.getLogger(WsLwsWaterNowServicePortClient.class);

	public WsLwsWaterNow getServicePort() {

		URL wsdlURL = WsLwsWaterNowService.WSDL_LOCATION;
		WsLwsWaterNowService ss = new WsLwsWaterNowService(wsdlURL, SERVICE_NAME);
		WsLwsWaterNow port = ss.getWsLwsWaterNowServicePort();
		return port;
	}

	public List<WsLwsWaterNowVo> GetINSDHOUSPIPNGDGNSSCLNSG2(String strSVCKEY, String strREGMNGRIP, String strRQSTDTFR,
			String strRQSTDTTO, String strLASTUPDTDT) throws Exception_Exception {

//		LOGGER.info("Invoking GetINSDHOUSPIPNGDGNSSCLNSG2...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getINSDHOUSPIPNGDGNSSCLNSG2__return = port.getINSDHOUSPIPNGDGNSSCLNSG2(strSVCKEY,
				strREGMNGRIP, strRQSTDTFR, strRQSTDTTO, strLASTUPDTDT);

		return _getINSDHOUSPIPNGDGNSSCLNSG2__return;
	}

	public List<WsLwsWaterNowVo> getSAFETYCNFIRM2(String strSVCKEY, String strREGMNGRIP, String strRQSTDTFR,
			String strRQSTDTTO, String strLASTUPDTDT) throws Exception_Exception {

//		LOGGER.info("Invoking getSAFETYCNFIRM2...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getSAFETYCNFIRM2__return = port.getSAFETYCNFIRM2(strSVCKEY, strREGMNGRIP, strRQSTDTFR,
				strRQSTDTTO, strLASTUPDTDT);

		return _getSAFETYCNFIRM2__return;
	}

	public List<WsLwsWaterNowVo> getCSTMRADDR(String strSVCKEY, String strREGMNGRIP, String strCSTMRNO)
			throws Exception_Exception {

//		LOGGER.info("Invoking getCSTMRADDR...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getCSTMRADDR__return = port.getCSTMRADDR(strSVCKEY, strREGMNGRIP, strCSTMRNO);

		return _getCSTMRADDR__return;
	}

	public List<WsLwsWaterNowVo> getSAFETYCNFIRM(String strSVCKEY, String strREGMNGRIP, String strRQSTDTFR,
			String strRQSTDTTO, String strLASTUPDTDT) throws Exception_Exception {

//		LOGGER.info("Invoking getSAFETYCNFIRM...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getSAFETYCNFIRM__return = port.getSAFETYCNFIRM(strSVCKEY, strREGMNGRIP, strRQSTDTFR,
				strRQSTDTTO, strLASTUPDTDT);

		return _getSAFETYCNFIRM__return;
	}

	public List<WsLwsWaterNowVo> getWATERRATE(String strSVCKEY, String strREGMNGRIP, String strCSTMRNO,
			String strCSTRMNM, String strADJYM) throws Exception_Exception {

//		LOGGER.info("Invoking getWATERRATE...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getWATERRATE__return = port.getWATERRATE(strSVCKEY, strREGMNGRIP, strCSTMRNO, strCSTRMNM,
				strADJYM);

		return _getWATERRATE__return;
	}

	public List<WsLwsWaterNowVo> getINSDHOUSPIPNGDGNSSCLNSG(String strSVCKEY, String strREGMNGRIP,
			String strVISITINSPCTDTFR, String strVISITINSPCTDTTO, String strLASTUPDTDT) throws Exception_Exception {

//		LOGGER.info("Invoking getINSDHOUSPIPNGDGNSSCLNSG...");
		WsLwsWaterNow port = getServicePort();

		List<WsLwsWaterNowVo> _getINSDHOUSPIPNGDGNSSCLNSG__return = port.getINSDHOUSPIPNGDGNSSCLNSG(strSVCKEY,
				strREGMNGRIP, strVISITINSPCTDTFR, strVISITINSPCTDTTO, strLASTUPDTDT);

		return _getINSDHOUSPIPNGDGNSSCLNSG__return;
	}

}
