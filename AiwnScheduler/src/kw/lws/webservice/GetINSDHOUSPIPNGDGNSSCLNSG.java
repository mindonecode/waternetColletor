
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetINSDHOUSPIPNGDGNSSCLNSG complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="GetINSDHOUSPIPNGDGNSSCLNSG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strSVCKEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strREGMNGRIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVISITINSPCTDTFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strVISITINSPCTDTTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GetINSDHOUSPIPNGDGNSSCLNSG", propOrder = {
    "strSVCKEY",
    "strREGMNGRIP",
    "strVISITINSPCTDTFR",
    "strVISITINSPCTDTTO",
    "strLASTUPDTDT"
})
public class GetINSDHOUSPIPNGDGNSSCLNSG {

    protected String strSVCKEY;
    protected String strREGMNGRIP;
    protected String strVISITINSPCTDTFR;
    protected String strVISITINSPCTDTTO;
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
     * strVISITINSPCTDTFR �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVISITINSPCTDTFR() {
        return strVISITINSPCTDTFR;
    }

    /**
     * strVISITINSPCTDTFR �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVISITINSPCTDTFR(String value) {
        this.strVISITINSPCTDTFR = value;
    }

    /**
     * strVISITINSPCTDTTO �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVISITINSPCTDTTO() {
        return strVISITINSPCTDTTO;
    }

    /**
     * strVISITINSPCTDTTO �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVISITINSPCTDTTO(String value) {
        this.strVISITINSPCTDTTO = value;
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
