
package kw.lws.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>defaultPageVo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="defaultPageVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pageList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pageUnit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="recordCountPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rnum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultPageVo", propOrder = {
    "firstIndex",
    "lastIndex",
    "pageIndex",
    "pageList",
    "pageSize",
    "pageUnit",
    "recordCountPerPage",
    "rnum",
    "totalCount"
})
@XmlSeeAlso({
    DefaultVo.class
})
public class DefaultPageVo {

    protected int firstIndex;
    protected int lastIndex;
    protected int pageIndex;
    protected String pageList;
    protected int pageSize;
    protected int pageUnit;
    protected int recordCountPerPage;
    protected int rnum;
    protected int totalCount;

    /**
     * firstIndex 속성의 값을 가져옵니다.
     * 
     */
    public int getFirstIndex() {
        return firstIndex;
    }

    /**
     * firstIndex 속성의 값을 설정합니다.
     * 
     */
    public void setFirstIndex(int value) {
        this.firstIndex = value;
    }

    /**
     * lastIndex 속성의 값을 가져옵니다.
     * 
     */
    public int getLastIndex() {
        return lastIndex;
    }

    /**
     * lastIndex 속성의 값을 설정합니다.
     * 
     */
    public void setLastIndex(int value) {
        this.lastIndex = value;
    }

    /**
     * pageIndex 속성의 값을 가져옵니다.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * pageIndex 속성의 값을 설정합니다.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * pageList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageList() {
        return pageList;
    }

    /**
     * pageList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageList(String value) {
        this.pageList = value;
    }

    /**
     * pageSize 속성의 값을 가져옵니다.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * pageSize 속성의 값을 설정합니다.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * pageUnit 속성의 값을 가져옵니다.
     * 
     */
    public int getPageUnit() {
        return pageUnit;
    }

    /**
     * pageUnit 속성의 값을 설정합니다.
     * 
     */
    public void setPageUnit(int value) {
        this.pageUnit = value;
    }

    /**
     * recordCountPerPage 속성의 값을 가져옵니다.
     * 
     */
    public int getRecordCountPerPage() {
        return recordCountPerPage;
    }

    /**
     * recordCountPerPage 속성의 값을 설정합니다.
     * 
     */
    public void setRecordCountPerPage(int value) {
        this.recordCountPerPage = value;
    }

    /**
     * rnum 속성의 값을 가져옵니다.
     * 
     */
    public int getRnum() {
        return rnum;
    }

    /**
     * rnum 속성의 값을 설정합니다.
     * 
     */
    public void setRnum(int value) {
        this.rnum = value;
    }

    /**
     * totalCount 속성의 값을 가져옵니다.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * totalCount 속성의 값을 설정합니다.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

}
