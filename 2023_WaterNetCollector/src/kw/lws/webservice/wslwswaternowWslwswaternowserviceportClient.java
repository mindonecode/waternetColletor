package kw.lws.webservice;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.jws.WebParam;
import kw.lws.webservice.impl.WsLwsWaterNowService;

@Component("WsLwsWaterNowService")
public class wslwswaternowWslwswaternowserviceportClient {

	 private static final QName SERVICE_NAME = new QName("http://impl.webservice.lws.kw/", "WsLwsWaterNowService");

	    private static final Logger LOGGER = LoggerFactory.getLogger(WsLwsWaterNow_WsLwsWaterNowServicePort_Client.class);


	    public WsLwsWaterNow getServicePort() {

			URL wsdlURL = WsLwsWaterNowService.WSDL_LOCATION;
			WsLwsWaterNowService ss = new WsLwsWaterNowService(wsdlURL, SERVICE_NAME);
			WsLwsWaterNow port = ss.getWsLwsWaterNowServicePort();
			return port;
		}

		public List<kw.lws.webservice.WsLwsWaterNowVo>
		getSAFETYCNFIRM2(	String strSVCKEY,
							String strREGMNGRIP,
							String strRQSTDTFR,
							String strRQSTDTTO,
							String strLASTUPDTDT) throws Exception_Exception {


			LOGGER.info("Invoking getSAFETYCNFIRM2...");
			WsLwsWaterNow port = getServicePort();


	        java.util.List<kw.lws.webservice.WsLwsWaterNowVo> _getSAFETYCNFIRM2__return
	        	= port.getSAFETYCNFIRM2(strSVCKEY, strREGMNGRIP, strRQSTDTFR, strRQSTDTTO, strLASTUPDTDT);

	        System.out.println("getSAFETYCNFIRM2.result=" + _getSAFETYCNFIRM2__return);


			return _getSAFETYCNFIRM2__return;
		}


		public List<kw.lws.webservice.WsLwsWaterNowVo>
		GetINSDHOUSPIPNGDGNSSCLNSG2(	String strSVCKEY,
										String strREGMNGRIP,
										String strRQSTDTFR,
										String strRQSTDTTO,
										String strLASTUPDTDT) throws Exception_Exception {


			LOGGER.info("Invoking GetINSDHOUSPIPNGDGNSSCLNSG2...");
			WsLwsWaterNow port = getServicePort();


	        java.util.List<kw.lws.webservice.WsLwsWaterNowVo> _getINSDHOUSPIPNGDGNSSCLNSG2__return
	        	= port.getINSDHOUSPIPNGDGNSSCLNSG2(strSVCKEY, strREGMNGRIP, strRQSTDTFR, strRQSTDTTO, strLASTUPDTDT);

	        System.out.println("GetINSDHOUSPIPNGDGNSSCLNSG2.result=" + _getINSDHOUSPIPNGDGNSSCLNSG2__return);


			return _getINSDHOUSPIPNGDGNSSCLNSG2__return;
		}


}
