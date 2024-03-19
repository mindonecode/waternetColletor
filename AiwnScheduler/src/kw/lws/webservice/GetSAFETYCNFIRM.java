
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSAFETYCNFIRM complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * strWATSMPDEFR �Ӽ��� ���� �����ɴϴ�.
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
     * strWATSMPDEFR �Ӽ��� ���� �����մϴ�.
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
     * strWATSMPDETO �Ӽ��� ���� �����ɴϴ�.
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
     * strWATSMPDETO �Ӽ��� ���� �����մϴ�.
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
