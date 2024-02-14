
package kw.lws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GetSAFETYCNFIRM complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetSAFETYCNFIRM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strSVCKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strREGMNGRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strWATSMPDEFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strWATSMPDETO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strLASTUPDTDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSAFETYCNFIRM", propOrder = {
    "strSVCKEY",
    "strREGMNGRIP",
    "strWATSMPDEFR",
    "strWATSMPDETO",
    "strLASTUPDTDT"
})
public class GetSAFETYCNFIRM {

    protected String strSVCKEY;
    protected String strREGMNGRIP;
    protected String strWATSMPDEFR;
    protected String strWATSMPDETO;
    protected String strLASTUPDTDT;

    /**
     * strSVCKEY 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSVCKEY() {
        return strSVCKEY;
    }

    /**
     * strSVCKEY 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSVCKEY(String value) {
        this.strSVCKEY = value;
    }

    /**
     * strREGMNGRIP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrREGMNGRIP() {
        return strREGMNGRIP;
    }

    /**
     * strREGMNGRIP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrREGMNGRIP(String value) {
        this.strREGMNGRIP = value;
    }

    /**
     * strWATSMPDEFR 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWATSMPDEFR() {
        return strWATSMPDEFR;
    }

    /**
     * strWATSMPDEFR 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWATSMPDEFR(String value) {
        this.strWATSMPDEFR = value;
    }

    /**
     * strWATSMPDETO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWATSMPDETO() {
        return strWATSMPDETO;
    }

    /**
     * strWATSMPDETO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWATSMPDETO(String value) {
        this.strWATSMPDETO = value;
    }

    /**
     * strLASTUPDTDT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLASTUPDTDT() {
        return strLASTUPDTDT;
    }

    /**
     * strLASTUPDTDT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLASTUPDTDT(String value) {
        this.strLASTUPDTDT = value;
    }

}
