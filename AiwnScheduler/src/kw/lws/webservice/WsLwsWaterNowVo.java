
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.ToString;

/**
 * <p>wsLwsWaterNowVo complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
@ToString
public class WsLwsWaterNowVo
    extends DefaultVo
{

    protected String addr;
    protected String adjym;
    protected String amt01Ago;
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
    protected String exam1Value01;
    protected String exam1Value02;
    protected String exam1Value03;
    protected String exam1Value04;
    protected String exam1Value05;
    protected String exam1Value06;
    protected String exam1Value07;
    protected String exam2Value01;
    protected String exam2Value02;
    protected String exam2Value03;
    protected String exam2Value04;
    protected String exam2Value05;
    protected String exam2Value06;
    protected String exam2Value07;
    protected String exam2Value08;
    protected String exam2Value09;
    protected String exam2Value10;
    protected String exam2Value11;
    protected String exam2Value12;
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
    protected String wrppusgqty01Ago;
    protected String wrppusgqty12Ago;
    protected String wsppdm;
    protected String wttnkinstdiv;
    protected String wusealltamt;
    protected String wusealltecamt;
    protected String wusealltrntfee;
    protected String wusealltrprsindutynm;
    protected String wusealltusgqty;

    /**
     * addr �Ӽ��� ���� �����ɴϴ�.
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
     * addr �Ӽ��� ���� �����մϴ�.
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
     * adjym �Ӽ��� ���� �����ɴϴ�.
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
     * adjym �Ӽ��� ���� �����մϴ�.
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
     * amt01Ago �Ӽ��� ���� �����ɴϴ�.
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
     * amt01Ago �Ӽ��� ���� �����մϴ�.
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
     * amt12Ago �Ӽ��� ���� �����ɴϴ�.
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
     * amt12Ago �Ӽ��� ���� �����մϴ�.
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
     * buldty �Ӽ��� ���� �����ɴϴ�.
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
     * buldty �Ӽ��� ���� �����մϴ�.
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
     * calbrcg �Ӽ��� ���� �����ɴϴ�.
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
     * calbrcg �Ӽ��� ���� �����մϴ�.
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
     * clnsgdtlctnt �Ӽ��� ���� �����ɴϴ�.
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
     * clnsgdtlctnt �Ӽ��� ���� �����մϴ�.
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
     * clnsgnextntu �Ӽ��� ���� �����ɴϴ�.
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
     * clnsgnextntu �Ӽ��� ���� �����մϴ�.
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
     * clnsgrstdiv �Ӽ��� ���� �����ɴϴ�.
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
     * clnsgrstdiv �Ӽ��� ���� �����մϴ�.
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
     * clnsgtime �Ӽ��� ���� �����ɴϴ�.
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
     * clnsgtime �Ӽ��� ���� �����մϴ�.
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
     * cstmrnm �Ӽ��� ���� �����ɴϴ�.
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
     * cstmrnm �Ӽ��� ���� �����մϴ�.
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
     * cstmrno �Ӽ��� ���� �����ɴϴ�.
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
     * cstmrno �Ӽ��� ���� �����մϴ�.
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
     * dgnssdtlctnt �Ӽ��� ���� �����ɴϴ�.
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
     * dgnssdtlctnt �Ӽ��� ���� �����մϴ�.
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
     * dgnssrstdiv �Ӽ��� ���� �����ɴϴ�.
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
     * dgnssrstdiv �Ӽ��� ���� �����մϴ�.
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
     * exam1Value01 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value01 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value02 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value02 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value03 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value03 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value04 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value04 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value05 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value05 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value06 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value06 �Ӽ��� ���� �����մϴ�.
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
     * exam1Value07 �Ӽ��� ���� �����ɴϴ�.
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
     * exam1Value07 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value01 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value01 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value02 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value02 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value03 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value03 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value04 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value04 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value05 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value05 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value06 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value06 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value07 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value07 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value08 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value08 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value09 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value09 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value10 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value10 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value11 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value11 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value12 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value12 �Ӽ��� ���� �����մϴ�.
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
     * exam2Value13 �Ӽ��� ���� �����ɴϴ�.
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
     * exam2Value13 �Ӽ��� ���� �����մϴ�.
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
     * fldevtdiv �Ӽ��� ���� �����ɴϴ�.
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
     * fldevtdiv �Ӽ��� ���� �����մϴ�.
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
     * fnctlcnm �Ӽ��� ���� �����ɴϴ�.
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
     * fnctlcnm �Ӽ��� ���� �����մϴ�.
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
     * inspctdivnm �Ӽ��� ���� �����ɴϴ�.
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
     * inspctdivnm �Ӽ��� ���� �����մϴ�.
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
     * lastupdt �Ӽ��� ���� �����ɴϴ�.
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
     * lastupdt �Ӽ��� ���� �����մϴ�.
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
     * layingyear �Ӽ��� ���� �����ɴϴ�.
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
     * layingyear �Ӽ��� ���� �����մϴ�.
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
     * mesurede �Ӽ��� ���� �����ɴϴ�.
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
     * mesurede �Ӽ��� ���� �����մϴ�.
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
     * pipedtlknd �Ӽ��� ���� �����ɴϴ�.
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
     * pipedtlknd �Ӽ��� ���� �����մϴ�.
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
     * pipeknd �Ӽ��� ���� �����ɴϴ�.
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
     * pipeknd �Ӽ��� ���� �����մϴ�.
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
     * prcsstatnm �Ӽ��� ���� �����ɴϴ�.
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
     * prcsstatnm �Ӽ��� ���� �����մϴ�.
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
     * rqstdt �Ӽ��� ���� �����ɴϴ�.
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
     * rqstdt �Ӽ��� ���� �����մϴ�.
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
     * rstnm �Ӽ��� ���� �����ɴϴ�.
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
     * rstnm �Ӽ��� ���� �����մϴ�.
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
     * rstty �Ӽ��� ���� �����ɴϴ�.
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
     * rstty �Ӽ��� ���� �����մϴ�.
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
     * rstty2 �Ӽ��� ���� �����ɴϴ�.
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
     * rstty2 �Ӽ��� ���� �����մϴ�.
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
     * seweramt �Ӽ��� ���� �����ɴϴ�.
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
     * seweramt �Ӽ��� ���� �����մϴ�.
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
     * sewerecamt �Ӽ��� ���� �����ɴϴ�.
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
     * sewerecamt �Ӽ��� ���� �����մϴ�.
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
     * sewerrntfee �Ӽ��� ���� �����ɴϴ�.
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
     * sewerrntfee �Ӽ��� ���� �����մϴ�.
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
     * sewerrprsindutynm �Ӽ��� ���� �����ɴϴ�.
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
     * sewerrprsindutynm �Ӽ��� ���� �����մϴ�.
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
     * sewerusgqty �Ӽ��� ���� �����ɴϴ�.
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
     * sewerusgqty �Ӽ��� ���� �����մϴ�.
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
     * sgccd �Ӽ��� ���� �����ɴϴ�.
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
     * sgccd �Ӽ��� ���� �����մϴ�.
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
     * tastesmellty �Ӽ��� ���� �����ɴϴ�.
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
     * tastesmellty �Ӽ��� ���� �����մϴ�.
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
     * ugrwtramt �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtramt �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrecamt �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrecamt �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrpmonguidncvu �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrpmonguidncvu �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrrntfee �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrrntfee �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrrprsindutynm �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrrprsindutynm �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrthsmonguidncvu �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrthsmonguidncvu �Ӽ��� ���� �����մϴ�.
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
     * ugrwtrusgqty �Ӽ��� ���� �����ɴϴ�.
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
     * ugrwtrusgqty �Ӽ��� ���� �����մϴ�.
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
     * usedt �Ӽ��� ���� �����ɴϴ�.
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
     * usedt �Ӽ��� ���� �����մϴ�.
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
     * visitdt �Ӽ��� ���� �����ɴϴ�.
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
     * visitdt �Ӽ��� ���� �����մϴ�.
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
     * visitinspctdt �Ӽ��� ���� �����ɴϴ�.
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
     * visitinspctdt �Ӽ��� ���� �����մϴ�.
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
     * watsmpde �Ӽ��� ���� �����ɴϴ�.
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
     * watsmpde �Ӽ��� ���� �����մϴ�.
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
     * wrppamt �Ӽ��� ���� �����ɴϴ�.
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
     * wrppamt �Ӽ��� ���� �����մϴ�.
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
     * wrppcalbrnm �Ӽ��� ���� �����ɴϴ�.
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
     * wrppcalbrnm �Ӽ��� ���� �����մϴ�.
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
     * wrppecamt �Ӽ��� ���� �����ɴϴ�.
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
     * wrppecamt �Ӽ��� ���� �����մϴ�.
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
     * wrpppmonguidncvu �Ӽ��� ���� �����ɴϴ�.
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
     * wrpppmonguidncvu �Ӽ��� ���� �����մϴ�.
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
     * wrpprntfee �Ӽ��� ���� �����ɴϴ�.
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
     * wrpprntfee �Ӽ��� ���� �����մϴ�.
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
     * wrpprprsindutynm �Ӽ��� ���� �����ɴϴ�.
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
     * wrpprprsindutynm �Ӽ��� ���� �����մϴ�.
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
     * wrppthsmonguidncvu �Ӽ��� ���� �����ɴϴ�.
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
     * wrppthsmonguidncvu �Ӽ��� ���� �����մϴ�.
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
     * wrppusgqty �Ӽ��� ���� �����ɴϴ�.
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
     * wrppusgqty �Ӽ��� ���� �����մϴ�.
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
     * wrppusgqty01Ago �Ӽ��� ���� �����ɴϴ�.
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
     * wrppusgqty01Ago �Ӽ��� ���� �����մϴ�.
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
     * wrppusgqty12Ago �Ӽ��� ���� �����ɴϴ�.
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
     * wrppusgqty12Ago �Ӽ��� ���� �����մϴ�.
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
     * wsppdm �Ӽ��� ���� �����ɴϴ�.
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
     * wsppdm �Ӽ��� ���� �����մϴ�.
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
     * wttnkinstdiv �Ӽ��� ���� �����ɴϴ�.
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
     * wttnkinstdiv �Ӽ��� ���� �����մϴ�.
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
     * wusealltamt �Ӽ��� ���� �����ɴϴ�.
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
     * wusealltamt �Ӽ��� ���� �����մϴ�.
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
     * wusealltecamt �Ӽ��� ���� �����ɴϴ�.
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
     * wusealltecamt �Ӽ��� ���� �����մϴ�.
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
     * wusealltrntfee �Ӽ��� ���� �����ɴϴ�.
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
     * wusealltrntfee �Ӽ��� ���� �����մϴ�.
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
     * wusealltrprsindutynm �Ӽ��� ���� �����ɴϴ�.
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
     * wusealltrprsindutynm �Ӽ��� ���� �����մϴ�.
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
     * wusealltusgqty �Ӽ��� ���� �����ɴϴ�.
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
     * wusealltusgqty �Ӽ��� ���� �����մϴ�.
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
