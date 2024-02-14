
package kw.lws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>wsLwsWaterNowVo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="wsLwsWaterNowVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.lws.kw/}defaultVo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amt01ago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amt12ago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buldty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calbrcg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clnsgdtlctnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clnsgnextntu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clnsgrstdiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clnsgtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cstmrnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cstmrno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dgnssdtlctnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dgnssrstdiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam1value07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exam2value13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fldevtdiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fnctlcnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspctdivnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastupdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="layingyear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mesurede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pipedtlknd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pipeknd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prcsstatnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rqstdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rstnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rstty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rstty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seweramt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sewerecamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sewerrntfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sewerrprsindutynm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sewerusgqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sgccd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tastesmellty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtramt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrecamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrpmonguidncvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrrntfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrrprsindutynm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrthsmonguidncvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ugrwtrusgqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visitinspctdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="watsmpde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppcalbrnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppecamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrpppmonguidncvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrpprntfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrpprprsindutynm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppthsmonguidncvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppusgqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppusgqty01ago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wrppusgqty12ago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsppdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wttnkinstdiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wusealltamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wusealltecamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wusealltrntfee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wusealltrprsindutynm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wusealltusgqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsLwsWaterNowVo", propOrder = {
    "addr",
    "adjym",
    "amt01Ago",
    "amt12Ago",
    "buldty",
    "calbrcg",
    "clnsgdtlctnt",
    "clnsgnextntu",
    "clnsgrstdiv",
    "clnsgtime",
    "cstmrnm",
    "cstmrno",
    "dgnssdtlctnt",
    "dgnssrstdiv",
    "exam1Value01",
    "exam1Value02",
    "exam1Value03",
    "exam1Value04",
    "exam1Value05",
    "exam1Value06",
    "exam1Value07",
    "exam2Value01",
    "exam2Value02",
    "exam2Value03",
    "exam2Value04",
    "exam2Value05",
    "exam2Value06",
    "exam2Value07",
    "exam2Value08",
    "exam2Value09",
    "exam2Value10",
    "exam2Value11",
    "exam2Value12",
    "exam2Value13",
    "fldevtdiv",
    "fnctlcnm",
    "inspctdivnm",
    "lastupdt",
    "layingyear",
    "mesurede",
    "pipedtlknd",
    "pipeknd",
    "prcsstatnm",
    "rqstdt",
    "rstnm",
    "rstty",
    "rstty2",
    "seweramt",
    "sewerecamt",
    "sewerrntfee",
    "sewerrprsindutynm",
    "sewerusgqty",
    "sgccd",
    "tastesmellty",
    "ugrwtramt",
    "ugrwtrecamt",
    "ugrwtrpmonguidncvu",
    "ugrwtrrntfee",
    "ugrwtrrprsindutynm",
    "ugrwtrthsmonguidncvu",
    "ugrwtrusgqty",
    "usedt",
    "visitdt",
    "visitinspctdt",
    "watsmpde",
    "wrppamt",
    "wrppcalbrnm",
    "wrppecamt",
    "wrpppmonguidncvu",
    "wrpprntfee",
    "wrpprprsindutynm",
    "wrppthsmonguidncvu",
    "wrppusgqty",
    "wrppusgqty01Ago",
    "wrppusgqty12Ago",
    "wsppdm",
    "wttnkinstdiv",
    "wusealltamt",
    "wusealltecamt",
    "wusealltrntfee",
    "wusealltrprsindutynm",
    "wusealltusgqty"
})
public class WsLwsWaterNowVo
    extends DefaultVo
{

    protected String addr;
    protected String adjym;
    @XmlElement(name = "amt01ago")
    protected String amt01Ago;
    @XmlElement(name = "amt12ago")
    protected String amt12Ago;
    protected String buldty;
    protected String calbrcg;
    protected String clnsgdtlctnt;
    protected String clnsgnextntu;
    protected String clnsgrstdiv;
    protected String clnsgtime;
    protected String cstmrnm;
    protected String cstmrno;
    protected String dgnssdtlctnt;
    protected String dgnssrstdiv;
    @XmlElement(name = "exam1value01")
    protected String exam1Value01;
    @XmlElement(name = "exam1value02")
    protected String exam1Value02;
    @XmlElement(name = "exam1value03")
    protected String exam1Value03;
    @XmlElement(name = "exam1value04")
    protected String exam1Value04;
    @XmlElement(name = "exam1value05")
    protected String exam1Value05;
    @XmlElement(name = "exam1value06")
    protected String exam1Value06;
    @XmlElement(name = "exam1value07")
    protected String exam1Value07;
    @XmlElement(name = "exam2value01")
    protected String exam2Value01;
    @XmlElement(name = "exam2value02")
    protected String exam2Value02;
    @XmlElement(name = "exam2value03")
    protected String exam2Value03;
    @XmlElement(name = "exam2value04")
    protected String exam2Value04;
    @XmlElement(name = "exam2value05")
    protected String exam2Value05;
    @XmlElement(name = "exam2value06")
    protected String exam2Value06;
    @XmlElement(name = "exam2value07")
    protected String exam2Value07;
    @XmlElement(name = "exam2value08")
    protected String exam2Value08;
    @XmlElement(name = "exam2value09")
    protected String exam2Value09;
    @XmlElement(name = "exam2value10")
    protected String exam2Value10;
    @XmlElement(name = "exam2value11")
    protected String exam2Value11;
    @XmlElement(name = "exam2value12")
    protected String exam2Value12;
    @XmlElement(name = "exam2value13")
    protected String exam2Value13;
    protected String fldevtdiv;
    protected String fnctlcnm;
    protected String inspctdivnm;
    protected String lastupdt;
    protected String layingyear;
    protected String mesurede;
    protected String pipedtlknd;
    protected String pipeknd;
    protected String prcsstatnm;
    protected String rqstdt;
    protected String rstnm;
    protected String rstty;
    protected String rstty2;
    protected String seweramt;
    protected String sewerecamt;
    protected String sewerrntfee;
    protected String sewerrprsindutynm;
    protected String sewerusgqty;
    protected String sgccd;
    protected String tastesmellty;
    protected String ugrwtramt;
    protected String ugrwtrecamt;
    protected String ugrwtrpmonguidncvu;
    protected String ugrwtrrntfee;
    protected String ugrwtrrprsindutynm;
    protected String ugrwtrthsmonguidncvu;
    protected String ugrwtrusgqty;
    protected String usedt;
    protected String visitdt;
    protected String visitinspctdt;
    protected String watsmpde;
    protected String wrppamt;
    protected String wrppcalbrnm;
    protected String wrppecamt;
    protected String wrpppmonguidncvu;
    protected String wrpprntfee;
    protected String wrpprprsindutynm;
    protected String wrppthsmonguidncvu;
    protected String wrppusgqty;
    @XmlElement(name = "wrppusgqty01ago")
    protected String wrppusgqty01Ago;
    @XmlElement(name = "wrppusgqty12ago")
    protected String wrppusgqty12Ago;
    protected String wsppdm;
    protected String wttnkinstdiv;
    protected String wusealltamt;
    protected String wusealltecamt;
    protected String wusealltrntfee;
    protected String wusealltrprsindutynm;
    protected String wusealltusgqty;

    /**
     * addr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * addr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * adjym 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjym() {
        return adjym;
    }

    /**
     * adjym 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjym(String value) {
        this.adjym = value;
    }

    /**
     * amt01Ago 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt01Ago() {
        return amt01Ago;
    }

    /**
     * amt01Ago 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt01Ago(String value) {
        this.amt01Ago = value;
    }

    /**
     * amt12Ago 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt12Ago() {
        return amt12Ago;
    }

    /**
     * amt12Ago 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt12Ago(String value) {
        this.amt12Ago = value;
    }

    /**
     * buldty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuldty() {
        return buldty;
    }

    /**
     * buldty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuldty(String value) {
        this.buldty = value;
    }

    /**
     * calbrcg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalbrcg() {
        return calbrcg;
    }

    /**
     * calbrcg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalbrcg(String value) {
        this.calbrcg = value;
    }

    /**
     * clnsgdtlctnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClnsgdtlctnt() {
        return clnsgdtlctnt;
    }

    /**
     * clnsgdtlctnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClnsgdtlctnt(String value) {
        this.clnsgdtlctnt = value;
    }

    /**
     * clnsgnextntu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClnsgnextntu() {
        return clnsgnextntu;
    }

    /**
     * clnsgnextntu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClnsgnextntu(String value) {
        this.clnsgnextntu = value;
    }

    /**
     * clnsgrstdiv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClnsgrstdiv() {
        return clnsgrstdiv;
    }

    /**
     * clnsgrstdiv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClnsgrstdiv(String value) {
        this.clnsgrstdiv = value;
    }

    /**
     * clnsgtime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClnsgtime() {
        return clnsgtime;
    }

    /**
     * clnsgtime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClnsgtime(String value) {
        this.clnsgtime = value;
    }

    /**
     * cstmrnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrnm() {
        return cstmrnm;
    }

    /**
     * cstmrnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrnm(String value) {
        this.cstmrnm = value;
    }

    /**
     * cstmrno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrno() {
        return cstmrno;
    }

    /**
     * cstmrno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrno(String value) {
        this.cstmrno = value;
    }

    /**
     * dgnssdtlctnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgnssdtlctnt() {
        return dgnssdtlctnt;
    }

    /**
     * dgnssdtlctnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDgnssdtlctnt(String value) {
        this.dgnssdtlctnt = value;
    }

    /**
     * dgnssrstdiv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgnssrstdiv() {
        return dgnssrstdiv;
    }

    /**
     * dgnssrstdiv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDgnssrstdiv(String value) {
        this.dgnssrstdiv = value;
    }

    /**
     * exam1Value01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value01() {
        return exam1Value01;
    }

    /**
     * exam1Value01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value01(String value) {
        this.exam1Value01 = value;
    }

    /**
     * exam1Value02 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value02() {
        return exam1Value02;
    }

    /**
     * exam1Value02 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value02(String value) {
        this.exam1Value02 = value;
    }

    /**
     * exam1Value03 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value03() {
        return exam1Value03;
    }

    /**
     * exam1Value03 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value03(String value) {
        this.exam1Value03 = value;
    }

    /**
     * exam1Value04 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value04() {
        return exam1Value04;
    }

    /**
     * exam1Value04 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value04(String value) {
        this.exam1Value04 = value;
    }

    /**
     * exam1Value05 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value05() {
        return exam1Value05;
    }

    /**
     * exam1Value05 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value05(String value) {
        this.exam1Value05 = value;
    }

    /**
     * exam1Value06 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value06() {
        return exam1Value06;
    }

    /**
     * exam1Value06 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value06(String value) {
        this.exam1Value06 = value;
    }

    /**
     * exam1Value07 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam1Value07() {
        return exam1Value07;
    }

    /**
     * exam1Value07 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam1Value07(String value) {
        this.exam1Value07 = value;
    }

    /**
     * exam2Value01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value01() {
        return exam2Value01;
    }

    /**
     * exam2Value01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value01(String value) {
        this.exam2Value01 = value;
    }

    /**
     * exam2Value02 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value02() {
        return exam2Value02;
    }

    /**
     * exam2Value02 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value02(String value) {
        this.exam2Value02 = value;
    }

    /**
     * exam2Value03 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value03() {
        return exam2Value03;
    }

    /**
     * exam2Value03 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value03(String value) {
        this.exam2Value03 = value;
    }

    /**
     * exam2Value04 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value04() {
        return exam2Value04;
    }

    /**
     * exam2Value04 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value04(String value) {
        this.exam2Value04 = value;
    }

    /**
     * exam2Value05 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value05() {
        return exam2Value05;
    }

    /**
     * exam2Value05 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value05(String value) {
        this.exam2Value05 = value;
    }

    /**
     * exam2Value06 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value06() {
        return exam2Value06;
    }

    /**
     * exam2Value06 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value06(String value) {
        this.exam2Value06 = value;
    }

    /**
     * exam2Value07 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value07() {
        return exam2Value07;
    }

    /**
     * exam2Value07 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value07(String value) {
        this.exam2Value07 = value;
    }

    /**
     * exam2Value08 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value08() {
        return exam2Value08;
    }

    /**
     * exam2Value08 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value08(String value) {
        this.exam2Value08 = value;
    }

    /**
     * exam2Value09 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value09() {
        return exam2Value09;
    }

    /**
     * exam2Value09 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value09(String value) {
        this.exam2Value09 = value;
    }

    /**
     * exam2Value10 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value10() {
        return exam2Value10;
    }

    /**
     * exam2Value10 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value10(String value) {
        this.exam2Value10 = value;
    }

    /**
     * exam2Value11 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value11() {
        return exam2Value11;
    }

    /**
     * exam2Value11 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value11(String value) {
        this.exam2Value11 = value;
    }

    /**
     * exam2Value12 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value12() {
        return exam2Value12;
    }

    /**
     * exam2Value12 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value12(String value) {
        this.exam2Value12 = value;
    }

    /**
     * exam2Value13 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExam2Value13() {
        return exam2Value13;
    }

    /**
     * exam2Value13 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExam2Value13(String value) {
        this.exam2Value13 = value;
    }

    /**
     * fldevtdiv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldevtdiv() {
        return fldevtdiv;
    }

    /**
     * fldevtdiv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldevtdiv(String value) {
        this.fldevtdiv = value;
    }

    /**
     * fnctlcnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnctlcnm() {
        return fnctlcnm;
    }

    /**
     * fnctlcnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnctlcnm(String value) {
        this.fnctlcnm = value;
    }

    /**
     * inspctdivnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspctdivnm() {
        return inspctdivnm;
    }

    /**
     * inspctdivnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspctdivnm(String value) {
        this.inspctdivnm = value;
    }

    /**
     * lastupdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastupdt() {
        return lastupdt;
    }

    /**
     * lastupdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastupdt(String value) {
        this.lastupdt = value;
    }

    /**
     * layingyear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayingyear() {
        return layingyear;
    }

    /**
     * layingyear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayingyear(String value) {
        this.layingyear = value;
    }

    /**
     * mesurede 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesurede() {
        return mesurede;
    }

    /**
     * mesurede 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesurede(String value) {
        this.mesurede = value;
    }

    /**
     * pipedtlknd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipedtlknd() {
        return pipedtlknd;
    }

    /**
     * pipedtlknd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipedtlknd(String value) {
        this.pipedtlknd = value;
    }

    /**
     * pipeknd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeknd() {
        return pipeknd;
    }

    /**
     * pipeknd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeknd(String value) {
        this.pipeknd = value;
    }

    /**
     * prcsstatnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcsstatnm() {
        return prcsstatnm;
    }

    /**
     * prcsstatnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcsstatnm(String value) {
        this.prcsstatnm = value;
    }

    /**
     * rqstdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstdt() {
        return rqstdt;
    }

    /**
     * rqstdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqstdt(String value) {
        this.rqstdt = value;
    }

    /**
     * rstnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstnm() {
        return rstnm;
    }

    /**
     * rstnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstnm(String value) {
        this.rstnm = value;
    }

    /**
     * rstty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstty() {
        return rstty;
    }

    /**
     * rstty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstty(String value) {
        this.rstty = value;
    }

    /**
     * rstty2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstty2() {
        return rstty2;
    }

    /**
     * rstty2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstty2(String value) {
        this.rstty2 = value;
    }

    /**
     * seweramt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeweramt() {
        return seweramt;
    }

    /**
     * seweramt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeweramt(String value) {
        this.seweramt = value;
    }

    /**
     * sewerecamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSewerecamt() {
        return sewerecamt;
    }

    /**
     * sewerecamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSewerecamt(String value) {
        this.sewerecamt = value;
    }

    /**
     * sewerrntfee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSewerrntfee() {
        return sewerrntfee;
    }

    /**
     * sewerrntfee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSewerrntfee(String value) {
        this.sewerrntfee = value;
    }

    /**
     * sewerrprsindutynm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSewerrprsindutynm() {
        return sewerrprsindutynm;
    }

    /**
     * sewerrprsindutynm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSewerrprsindutynm(String value) {
        this.sewerrprsindutynm = value;
    }

    /**
     * sewerusgqty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSewerusgqty() {
        return sewerusgqty;
    }

    /**
     * sewerusgqty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSewerusgqty(String value) {
        this.sewerusgqty = value;
    }

    /**
     * sgccd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgccd() {
        return sgccd;
    }

    /**
     * sgccd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgccd(String value) {
        this.sgccd = value;
    }

    /**
     * tastesmellty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTastesmellty() {
        return tastesmellty;
    }

    /**
     * tastesmellty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTastesmellty(String value) {
        this.tastesmellty = value;
    }

    /**
     * ugrwtramt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtramt() {
        return ugrwtramt;
    }

    /**
     * ugrwtramt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtramt(String value) {
        this.ugrwtramt = value;
    }

    /**
     * ugrwtrecamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrecamt() {
        return ugrwtrecamt;
    }

    /**
     * ugrwtrecamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrecamt(String value) {
        this.ugrwtrecamt = value;
    }

    /**
     * ugrwtrpmonguidncvu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrpmonguidncvu() {
        return ugrwtrpmonguidncvu;
    }

    /**
     * ugrwtrpmonguidncvu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrpmonguidncvu(String value) {
        this.ugrwtrpmonguidncvu = value;
    }

    /**
     * ugrwtrrntfee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrrntfee() {
        return ugrwtrrntfee;
    }

    /**
     * ugrwtrrntfee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrrntfee(String value) {
        this.ugrwtrrntfee = value;
    }

    /**
     * ugrwtrrprsindutynm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrrprsindutynm() {
        return ugrwtrrprsindutynm;
    }

    /**
     * ugrwtrrprsindutynm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrrprsindutynm(String value) {
        this.ugrwtrrprsindutynm = value;
    }

    /**
     * ugrwtrthsmonguidncvu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrthsmonguidncvu() {
        return ugrwtrthsmonguidncvu;
    }

    /**
     * ugrwtrthsmonguidncvu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrthsmonguidncvu(String value) {
        this.ugrwtrthsmonguidncvu = value;
    }

    /**
     * ugrwtrusgqty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUgrwtrusgqty() {
        return ugrwtrusgqty;
    }

    /**
     * ugrwtrusgqty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUgrwtrusgqty(String value) {
        this.ugrwtrusgqty = value;
    }

    /**
     * usedt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedt() {
        return usedt;
    }

    /**
     * usedt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedt(String value) {
        this.usedt = value;
    }

    /**
     * visitdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitdt() {
        return visitdt;
    }

    /**
     * visitdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitdt(String value) {
        this.visitdt = value;
    }

    /**
     * visitinspctdt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitinspctdt() {
        return visitinspctdt;
    }

    /**
     * visitinspctdt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitinspctdt(String value) {
        this.visitinspctdt = value;
    }

    /**
     * watsmpde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatsmpde() {
        return watsmpde;
    }

    /**
     * watsmpde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatsmpde(String value) {
        this.watsmpde = value;
    }

    /**
     * wrppamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppamt() {
        return wrppamt;
    }

    /**
     * wrppamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppamt(String value) {
        this.wrppamt = value;
    }

    /**
     * wrppcalbrnm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppcalbrnm() {
        return wrppcalbrnm;
    }

    /**
     * wrppcalbrnm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppcalbrnm(String value) {
        this.wrppcalbrnm = value;
    }

    /**
     * wrppecamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppecamt() {
        return wrppecamt;
    }

    /**
     * wrppecamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppecamt(String value) {
        this.wrppecamt = value;
    }

    /**
     * wrpppmonguidncvu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrpppmonguidncvu() {
        return wrpppmonguidncvu;
    }

    /**
     * wrpppmonguidncvu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrpppmonguidncvu(String value) {
        this.wrpppmonguidncvu = value;
    }

    /**
     * wrpprntfee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrpprntfee() {
        return wrpprntfee;
    }

    /**
     * wrpprntfee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrpprntfee(String value) {
        this.wrpprntfee = value;
    }

    /**
     * wrpprprsindutynm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrpprprsindutynm() {
        return wrpprprsindutynm;
    }

    /**
     * wrpprprsindutynm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrpprprsindutynm(String value) {
        this.wrpprprsindutynm = value;
    }

    /**
     * wrppthsmonguidncvu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppthsmonguidncvu() {
        return wrppthsmonguidncvu;
    }

    /**
     * wrppthsmonguidncvu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppthsmonguidncvu(String value) {
        this.wrppthsmonguidncvu = value;
    }

    /**
     * wrppusgqty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppusgqty() {
        return wrppusgqty;
    }

    /**
     * wrppusgqty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppusgqty(String value) {
        this.wrppusgqty = value;
    }

    /**
     * wrppusgqty01Ago 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppusgqty01Ago() {
        return wrppusgqty01Ago;
    }

    /**
     * wrppusgqty01Ago 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppusgqty01Ago(String value) {
        this.wrppusgqty01Ago = value;
    }

    /**
     * wrppusgqty12Ago 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrppusgqty12Ago() {
        return wrppusgqty12Ago;
    }

    /**
     * wrppusgqty12Ago 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrppusgqty12Ago(String value) {
        this.wrppusgqty12Ago = value;
    }

    /**
     * wsppdm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsppdm() {
        return wsppdm;
    }

    /**
     * wsppdm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsppdm(String value) {
        this.wsppdm = value;
    }

    /**
     * wttnkinstdiv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWttnkinstdiv() {
        return wttnkinstdiv;
    }

    /**
     * wttnkinstdiv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWttnkinstdiv(String value) {
        this.wttnkinstdiv = value;
    }

    /**
     * wusealltamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWusealltamt() {
        return wusealltamt;
    }

    /**
     * wusealltamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWusealltamt(String value) {
        this.wusealltamt = value;
    }

    /**
     * wusealltecamt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWusealltecamt() {
        return wusealltecamt;
    }

    /**
     * wusealltecamt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWusealltecamt(String value) {
        this.wusealltecamt = value;
    }

    /**
     * wusealltrntfee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWusealltrntfee() {
        return wusealltrntfee;
    }

    /**
     * wusealltrntfee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWusealltrntfee(String value) {
        this.wusealltrntfee = value;
    }

    /**
     * wusealltrprsindutynm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWusealltrprsindutynm() {
        return wusealltrprsindutynm;
    }

    /**
     * wusealltrprsindutynm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWusealltrprsindutynm(String value) {
        this.wusealltrprsindutynm = value;
    }

    /**
     * wusealltusgqty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWusealltusgqty() {
        return wusealltusgqty;
    }

    /**
     * wusealltusgqty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWusealltusgqty(String value) {
        this.wusealltusgqty = value;
    }

}
