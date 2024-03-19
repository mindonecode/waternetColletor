
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>defaultVo complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="defaultVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.lws.kw/}defaultPageVo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="athrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="biznDivCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conectIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deptNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frstRegistDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frstRgstrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frstRgstrIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hqNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdusrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdusrIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rowStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sysDivCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultVo", propOrder = {
    "athrId",
    "biznDivCd",
    "chk",
    "conectIp",
    "deptNm",
    "frstRegistDt",
    "frstRgstrId",
    "frstRgstrIp",
    "hqNm",
    "lastUpdtDt",
    "lastUpdusrId",
    "lastUpdusrIp",
    "rowStatus",
    "sysDivCd",
    "usrId",
    "usrNm"
})
@XmlSeeAlso({
    WsLwsWaterNowVo.class
})
public class DefaultVo
    extends DefaultPageVo
{

    protected String athrId;
    protected String biznDivCd;
    protected String chk;
    protected String conectIp;
    protected String deptNm;
    protected String frstRegistDt;
    protected String frstRgstrId;
    protected String frstRgstrIp;
    protected String hqNm;
    protected String lastUpdtDt;
    protected String lastUpdusrId;
    protected String lastUpdusrIp;
    protected String rowStatus;
    protected String sysDivCd;
    protected String usrId;
    protected String usrNm;

    /**
     * athrId �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthrId() {
        return athrId;
    }

    /**
     * athrId �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthrId(String value) {
        this.athrId = value;
    }

    /**
     * biznDivCd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiznDivCd() {
        return biznDivCd;
    }

    /**
     * biznDivCd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiznDivCd(String value) {
        this.biznDivCd = value;
    }

    /**
     * chk �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChk() {
        return chk;
    }

    /**
     * chk �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChk(String value) {
        this.chk = value;
    }

    /**
     * conectIp �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConectIp() {
        return conectIp;
    }

    /**
     * conectIp �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConectIp(String value) {
        this.conectIp = value;
    }

    /**
     * deptNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNm() {
        return deptNm;
    }

    /**
     * deptNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNm(String value) {
        this.deptNm = value;
    }

    /**
     * frstRegistDt �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstRegistDt() {
        return frstRegistDt;
    }

    /**
     * frstRegistDt �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstRegistDt(String value) {
        this.frstRegistDt = value;
    }

    /**
     * frstRgstrId �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstRgstrId() {
        return frstRgstrId;
    }

    /**
     * frstRgstrId �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstRgstrId(String value) {
        this.frstRgstrId = value;
    }

    /**
     * frstRgstrIp �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstRgstrIp() {
        return frstRgstrIp;
    }

    /**
     * frstRgstrIp �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstRgstrIp(String value) {
        this.frstRgstrIp = value;
    }

    /**
     * hqNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHqNm() {
        return hqNm;
    }

    /**
     * hqNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHqNm(String value) {
        this.hqNm = value;
    }

    /**
     * lastUpdtDt �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdtDt() {
        return lastUpdtDt;
    }

    /**
     * lastUpdtDt �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdtDt(String value) {
        this.lastUpdtDt = value;
    }

    /**
     * lastUpdusrId �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdusrId() {
        return lastUpdusrId;
    }

    /**
     * lastUpdusrId �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdusrId(String value) {
        this.lastUpdusrId = value;
    }

    /**
     * lastUpdusrIp �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdusrIp() {
        return lastUpdusrIp;
    }

    /**
     * lastUpdusrIp �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdusrIp(String value) {
        this.lastUpdusrIp = value;
    }

    /**
     * rowStatus �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowStatus() {
        return rowStatus;
    }

    /**
     * rowStatus �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowStatus(String value) {
        this.rowStatus = value;
    }

    /**
     * sysDivCd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysDivCd() {
        return sysDivCd;
    }

    /**
     * sysDivCd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysDivCd(String value) {
        this.sysDivCd = value;
    }

    /**
     * usrId �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * usrId �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrId(String value) {
        this.usrId = value;
    }

    /**
     * usrNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * usrNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

}
