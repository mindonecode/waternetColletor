
package kw.lws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>defaultVo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
     * athrId 속성의 값을 가져옵니다.
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
     * athrId 속성의 값을 설정합니다.
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
     * biznDivCd 속성의 값을 가져옵니다.
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
     * biznDivCd 속성의 값을 설정합니다.
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
     * chk 속성의 값을 가져옵니다.
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
     * chk 속성의 값을 설정합니다.
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
     * conectIp 속성의 값을 가져옵니다.
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
     * conectIp 속성의 값을 설정합니다.
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
     * deptNm 속성의 값을 가져옵니다.
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
     * deptNm 속성의 값을 설정합니다.
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
     * frstRegistDt 속성의 값을 가져옵니다.
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
     * frstRegistDt 속성의 값을 설정합니다.
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
     * frstRgstrId 속성의 값을 가져옵니다.
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
     * frstRgstrId 속성의 값을 설정합니다.
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
     * frstRgstrIp 속성의 값을 가져옵니다.
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
     * frstRgstrIp 속성의 값을 설정합니다.
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
     * hqNm 속성의 값을 가져옵니다.
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
     * hqNm 속성의 값을 설정합니다.
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
     * lastUpdtDt 속성의 값을 가져옵니다.
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
     * lastUpdtDt 속성의 값을 설정합니다.
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
     * lastUpdusrId 속성의 값을 가져옵니다.
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
     * lastUpdusrId 속성의 값을 설정합니다.
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
     * lastUpdusrIp 속성의 값을 가져옵니다.
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
     * lastUpdusrIp 속성의 값을 설정합니다.
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
     * rowStatus 속성의 값을 가져옵니다.
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
     * rowStatus 속성의 값을 설정합니다.
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
     * sysDivCd 속성의 값을 가져옵니다.
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
     * sysDivCd 속성의 값을 설정합니다.
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
     * usrId 속성의 값을 가져옵니다.
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
     * usrId 속성의 값을 설정합니다.
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
     * usrNm 속성의 값을 가져옵니다.
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
     * usrNm 속성의 값을 설정합니다.
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
