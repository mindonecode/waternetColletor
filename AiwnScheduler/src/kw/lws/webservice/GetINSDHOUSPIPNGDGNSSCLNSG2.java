
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetINSDHOUSPIPNGDGNSSCLNSG2 complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="GetINSDHOUSPIPNGDGNSSCLNSG2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strSVCKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strREGMNGRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strRQSTDTFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strRQSTDTTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GetINSDHOUSPIPNGDGNSSCLNSG2", propOrder = {
    "strSVCKEY",
    "strREGMNGRIP",
    "strRQSTDTFR",
    "strRQSTDTTO",
    "strLASTUPDTDT"
})
public class GetINSDHOUSPIPNGDGNSSCLNSG2 {

    protected String strSVCKEY;
    protected String strREGMNGRIP;
    protected String strRQSTDTFR;
    protected String strRQSTDTTO;
    protected String strLASTUPDTDT;

    /**
     * strSVCKEY �Ӽ��� ���� �����ɴϴ�.
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
     * strSVCKEY �Ӽ��� ���� �����մϴ�.
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
     * strREGMNGRIP �Ӽ��� ���� �����ɴϴ�.
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
     * strREGMNGRIP �Ӽ��� ���� �����մϴ�.
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
     * strRQSTDTFR �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRQSTDTFR() {
        return strRQSTDTFR;
    }

    /**
     * strRQSTDTFR �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRQSTDTFR(String value) {
        this.strRQSTDTFR = value;
    }

    /**
     * strRQSTDTTO �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRQSTDTTO() {
        return strRQSTDTTO;
    }

    /**
     * strRQSTDTTO �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRQSTDTTO(String value) {
        this.strRQSTDTTO = value;
    }

    /**
     * strLASTUPDTDT �Ӽ��� ���� �����ɴϴ�.
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
     * strLASTUPDTDT �Ӽ��� ���� �����մϴ�.
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
