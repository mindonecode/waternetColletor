
package kw.lws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>GetWATERRATE complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GetWATERRATE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strSVCKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strREGMNGRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCSTMRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strCSTRMNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strADJYM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWATERRATE", propOrder = {
    "strSVCKEY",
    "strREGMNGRIP",
    "strCSTMRNO",
    "strCSTRMNM",
    "strADJYM"
})
public class GetWATERRATE {

    protected String strSVCKEY;
    protected String strREGMNGRIP;
    protected String strCSTMRNO;
    protected String strCSTRMNM;
    protected String strADJYM;

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
     * strCSTMRNO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCSTMRNO() {
        return strCSTMRNO;
    }

    /**
     * strCSTMRNO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCSTMRNO(String value) {
        this.strCSTMRNO = value;
    }

    /**
     * strCSTRMNM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCSTRMNM() {
        return strCSTRMNM;
    }

    /**
     * strCSTRMNM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCSTRMNM(String value) {
        this.strCSTRMNM = value;
    }

    /**
     * strADJYM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrADJYM() {
        return strADJYM;
    }

    /**
     * strADJYM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrADJYM(String value) {
        this.strADJYM = value;
    }

}
