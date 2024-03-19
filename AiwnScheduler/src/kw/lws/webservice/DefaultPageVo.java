
package kw.lws.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>defaultPageVo complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * firstIndex �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getFirstIndex() {
        return firstIndex;
    }

    /**
     * firstIndex �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setFirstIndex(int value) {
        this.firstIndex = value;
    }

    /**
     * lastIndex �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getLastIndex() {
        return lastIndex;
    }

    /**
     * lastIndex �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setLastIndex(int value) {
        this.lastIndex = value;
    }

    /**
     * pageIndex �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * pageIndex �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * pageList �Ӽ��� ���� �����ɴϴ�.
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
     * pageList �Ӽ��� ���� �����մϴ�.
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
     * pageSize �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * pageSize �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * pageUnit �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getPageUnit() {
        return pageUnit;
    }

    /**
     * pageUnit �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setPageUnit(int value) {
        this.pageUnit = value;
    }

    /**
     * recordCountPerPage �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getRecordCountPerPage() {
        return recordCountPerPage;
    }

    /**
     * recordCountPerPage �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setRecordCountPerPage(int value) {
        this.recordCountPerPage = value;
    }

    /**
     * rnum �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getRnum() {
        return rnum;
    }

    /**
     * rnum �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setRnum(int value) {
        this.rnum = value;
    }

    /**
     * totalCount �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * totalCount �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

}
