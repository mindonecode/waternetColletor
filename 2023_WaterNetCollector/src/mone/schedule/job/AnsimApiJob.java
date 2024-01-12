package mone.schedule.job;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.common.util.Utils;
import mone.db.dao.PrcsDAO;
import mone.db.dao.AnsimApiPrcsDAO;
import mone.db.dto.AnsimApiReqDTO;
import mone.db.dto.AnsimApiResDTO;
import mone.schedule.scheduler.AnsimApiScheduleManager;

/**
 * 초단기실황 api 연계
 * @author iby
 *
 */
public class AnsimApiJob implements Job {
	// 로그
	private static final Logger logger = LogManager.getLogger(AnsimApiJob.class);

	/**
	 * constructor
	 */
	public AnsimApiJob() {
	}

	/*
	 * 실행
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {


		/************* wsdl ansim soup ui api **************/
		try {
			System.out.println(" ::::::::::::::::  ansim API check ::::::::::::::::  ");
			sendSoap();
		} catch (Exception e) {
			System.out.println("ansim API  Exception Message "  + e.getClass().getSimpleName() +"  [[[  " + e.getMessage() + "  ]]] " );
		}




		try {
			List<AnsimApiResDTO> resultList = new ArrayList<AnsimApiResDTO>();
//			Map<String, String> chkResultMap = new HashMap<String, String>();


			/* api 요청 파라미터 */
			String reqDate_yyyyMMdd = Utils.getDate(ConstDef.EnumDateFormat.YYYYMMDD);

			/* api 응답메시지 객체 */
			AnsimApiResDTO ansimApiResDTO = new AnsimApiResDTO();

			/* api 요청 url 생성 */
	        StringBuilder urlBuilder = new StringBuilder(ConfigManager.getProps("ansimaApi.api.endpoint"));
			urlBuilder.append("?" + URLEncoder.encode("strSVCKEY","UTF-8") + "=" + ConfigManager.getProps("ansimaApi.api.key"));

			urlBuilder.append("&" + URLEncoder.encode("strREGMNGRIP","UTF-8")  + "=" + URLEncoder.encode("172.30.179.30", "UTF-8"));
	        urlBuilder.append("&" + URLEncoder.encode("strRQSTDTFR","UTF-8")   + "=" + URLEncoder.encode(reqDate_yyyyMMdd, "UTF-8"));
	        urlBuilder.append("&" + URLEncoder.encode("strRQSTDTTO","UTF-8")   + "=" + URLEncoder.encode(reqDate_yyyyMMdd, "UTF-8"));
	        urlBuilder.append("&" + URLEncoder.encode("strLASTUPDTDT","UTF-8") + "=" + URLEncoder.encode(reqDate_yyyyMMdd, "UTF-8"));

	        // POST방식으로 전달 후 파라미터 받아옴
	        URL url = new URL(urlBuilder.toString());
	        System.out.println(url);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.setRequestProperty("Content-type", "application/xml");

	        System.out.println("Response code(200 ok) : " + conn.getResponseCode());

	        BufferedReader rd;

	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }

	        StringBuilder sb = new StringBuilder();
	        String line;

	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }

	        rd.close();
	        conn.disconnect();

	        //boolean isValid = parseJsonData(ansimApiResDTO, sb.toString());

	        boolean isValid = parseJsonData(ansimApiResDTO, sb.toString());

	        if(isValid == true) {
	        	resultList.add(ansimApiResDTO);
	        }


			logger.info(String.format("[ api ]수집:%s(건)", resultList.size()));

			if(resultList.size() > 0) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("resultList", resultList);
				AnsimApiPrcsDAO.insertAnsimApi(resultMap);
			}
		} catch (Exception e) {
			System.out.println("Exception Message"  + e.getClass().getSimpleName() );
		}




	}



	   private void sendSoap() throws Exception {
           String message =
    		  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://webservice.lws.kw/\">\r\n"
       		+ "   <soapenv:Header/>\r\n"
       		+ "   <soapenv:Body>\r\n"
       		+ "      <web:GetSAFETYCNFIRM2>\r\n"
       		+ "         <strSVCKEY>70670B9F034DEAAAE5B4</strSVCKEY>\r\n"
       		+ "         <strREGMNGRIP>172.30.179.30</strREGMNGRIP>\r\n"
       		+ "         <strRQSTDTFR>20231001</strRQSTDTFR>\r\n"
       		+ "         <strRQSTDTTO>20240105</strRQSTDTTO>\r\n"
       		+ "         <strLASTUPDTDT>20240105</strLASTUPDTDT>\r\n"
       		+ "      </web:GetSAFETYCNFIRM2>\r\n"
       		+ "   </soapenv:Body>\r\n"
       		+ "</soapenv:Envelope>";

           String strURL = "https://lws.kwater.or.kr/WS/wsLwsWaterNowService";

           //System.out.println(" ::::::::::: "  + message );


           HttpClient httpclient = HttpClientBuilder.create().build();
           HttpPost post = new HttpPost(strURL);
           StringEntity entity = new StringEntity(message);
           post.setEntity(entity);
           post.setHeader("Content-Type", "text/xml;charset=UTF-8");
           post.setHeader("Connection", "Keep-Alive");


           try {
               HttpResponse response = httpclient.execute(post);
               System.out.println(" ::::::::::: " + response.getEntity().getContent());

               readSoap(response.getEntity().getContent());

           } finally {

           }



       }

       private void readSoap(InputStream is) throws Exception{

    	   List<AnsimApiResDTO> resultList = new ArrayList<AnsimApiResDTO>();
    	   AnsimApiResDTO ansimApiResDTO = new AnsimApiResDTO();

           Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
           Element el = document.getDocumentElement();

           System.out.println("el ::: " +  el );

           NodeList list = el.getElementsByTagName("GetSAFETYCNFIRM2");
           System.out.println(list.getLength());

           boolean first = true;

           for(int i = 0 ; i < list.getLength() ; i++){
               Node node = list.item(i);

                node.getTextContent();

                System.out.println("i ::: " +  node.getTextContent() );

           }

           if(resultList.size() > 0) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("resultList", resultList);
				AnsimApiPrcsDAO.insertAnsimApi(resultMap);
			}

       }

	/**
	 *
	 * @param resDTO
	 * @param resData
	 */
	private boolean parseJsonData(AnsimApiResDTO resDTO, String resData) {

		boolean isOk = false;

		try {
			// 데이터타입 체크
			boolean isJson = checkResDataType(resData);
			if(isJson == false) {
				return isOk;
			}

			// json 변환 객체
			JSONParser parser = new JSONParser();
			//
			JSONObject obj = (JSONObject)parser.parse(resData);
			//
			JSONObject parse_response = (JSONObject)obj.get("response");

			/* 헤더 체크 */
			isOk = checkValidJsonData((JSONObject)parse_response.get("header"));
			if(isOk == false) {
				return isOk;
			}


			//
			JSONObject parse_body = (JSONObject)parse_response.get("body");
			//
			JSONObject parse_items = (JSONObject)parse_body.get("items");
			//
			JSONArray parse_item = (JSONArray)parse_items.get("item");


			String category = "";

			JSONObject element;

			String day = "";
			String time = "";

			for(int i=0; i<parse_item.size(); i++) {
				element = (JSONObject)parse_item.get(i);

				Object objBaseDate = element.get("baseDate");
				Object objBaseTime = element.get("baseTime");
				Object objObsrValue = element.get("obsrValue");

				category = (String)element.get("category");

				if(objBaseDate != null && day.equals(objBaseDate.toString()) == false) {
					day = objBaseDate.toString();
				}
				if(objBaseDate != null && time.equals(objBaseTime.toString()) == false) {
					time = objBaseTime.toString();
				}
				if(objObsrValue == null || objBaseDate == null || objBaseTime == null) {
					continue;
				}

				String val = objObsrValue.toString();

				switch (category) {
					case "FNCTLCNM":		// 급수구역
						resDTO.setFNCTLCNM(val);
						break;
					case "INSPCTDIVNM":		// 검사구분
						resDTO.setINSPCTDIVNM(val);
						break;
					case "PRCSSTATNM":		// 처리상태
						resDTO.setPRCSSTATNM(val);
						break;
					case "RSTNM":			// 적합
						resDTO.setRSTNM(val);
						break;
					case "CSTMRNO":			// 고객번호
						resDTO.setCSTMRNO(val);
						break;
					case "VISITINSPCTDT":	// 검사일시
						resDTO.setVISITINSPCTDT(val);
						break;
					case "RQSTDT":			// 신청일시
						resDTO.setRQSTDT(val);
						break;
					default:
						break;
				}

			}

			// LOG : 수집 데이터 로그 출력
			logger.debug(String.format("%s%s,%s,%s,%s,%s,%s,%s,%s"
					, resDTO.getFNCTLCNM(), resDTO.getINSPCTDIVNM(), resDTO.getPRCSSTATNM()
					, resDTO.getRSTNM(), resDTO.getCSTMRNO(), resDTO.getVISITINSPCTDT(), resDTO.getVISITINSPCTDT()));

		} catch (ParseException e) {
			System.out.println("Exception Message"  + e.getClass().getSimpleName() );
		}

		return isOk;
	}



	private boolean parseXMLData(AnsimApiResDTO resDTO, String resData) {
		boolean isOk = false;

		try {
		     String wsdlFilePath = "your_wsdl_file.wsdl";

		     // DocumentBuilder 생성
		     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		     DocumentBuilder builder = factory.newDocumentBuilder();

		     // WSDL 파일을 파싱하여 Document 객체로 읽어오기
		     Document document = builder.parse(wsdlFilePath);

		     // WSDL 네임스페이스 설정
		     document.getDocumentElement().normalize();
		     String wsdlNamespace = "http://schemas.xmlsoap.org/wsdl/";

		     // 예제: 모든 포트 찾기
		     NodeList portList = document.getElementsByTagNameNS(wsdlNamespace, "port");
		     for (int i = 0; i < portList.getLength(); i++) {
		         Node portNode = portList.item(i);
		         if (portNode.getNodeType() == Node.ELEMENT_NODE) {
		             String portName = portNode.getAttributes().getNamedItem("name").getNodeValue();
		             System.out.println("Port Name: " + portName);
		             // 필요한 작업 수행
		         }
		     }

		 } catch (Exception e) {
		     e.printStackTrace();
		 }

		return isOk;

	}
	/**
	 * API 취득 데이터의 타입이 JSON인지 체크
	 * @param resData
	 * @return
	 */
	private boolean checkResDataType(String resData) {
		boolean isJson = false;

		try {
			if(resData == null || resData.isEmpty() == true) {
				logger.debug(String.format("[API][response NG] response data is null"));
				return isJson;
			}
			if(resData.startsWith(ConstDef.START_TAG_JSON) == true) {
				isJson = true;
			} else {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document d = db.parse(new InputSource(new StringReader(resData)));
				NodeList nodelist =  d.getElementsByTagName("returnAuthMsg");
//				Node node =  nodelist.item(0);
				Node textNode =  nodelist.item(0).getChildNodes().item(0);
				String resultMsg = textNode.getNodeValue();

				nodelist =  d.getElementsByTagName("returnReasonCode");

//				node =  nodelist.item(0);
				textNode =  nodelist.item(0).getChildNodes().item(0);
				String resultCd = textNode.getNodeValue();

				//logger.debug(String.format("[API][response NG]CD:%s, MSG:%s", resultCd.toString(), resultMsg.toString()));
			}
		} catch (Exception e) {
			System.out.println("Exception Message"  + e.getClass().getSimpleName() );
		}

		return isJson;
	}

	/**
	 * 응답메시지 정상여부 체크
	 * @param header
	 * @return
	 */
	private boolean checkValidJsonData(JSONObject header) {

		boolean isValid = false;

		try {
			if(header != null) {
				Object resultCd = header.get("resultCode");
				Object resultMsg = header.get("resultMsg");

				if(ConstDef.ApiResultCode.NORMAL_CODE.equals(resultCd.toString()) == true) {
					isValid = true;
				} else {
					//logger.debug(String.format("[api][response NG]CD:%s, MSG:%s", resultCd.toString(), resultMsg.toString()));
				}
			}
		} catch (Exception e) {
			System.out.println("Exception Message"  + e.getClass().getSimpleName() );
		}

		return isValid;
	}
}
