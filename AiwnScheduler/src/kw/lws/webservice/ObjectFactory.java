
package kw.lws.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kw.lws.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCSTMRADDR_QNAME = new QName("http://webservice.lws.kw/", "GetCSTMRADDR");
    private final static QName _GetCSTMRADDRResponse_QNAME = new QName("http://webservice.lws.kw/", "GetCSTMRADDRResponse");
    private final static QName _GetINSDHOUSPIPNGDGNSSCLNSG_QNAME = new QName("http://webservice.lws.kw/", "GetINSDHOUSPIPNGDGNSSCLNSG");
    private final static QName _GetINSDHOUSPIPNGDGNSSCLNSG2_QNAME = new QName("http://webservice.lws.kw/", "GetINSDHOUSPIPNGDGNSSCLNSG2");
    private final static QName _GetINSDHOUSPIPNGDGNSSCLNSG2Response_QNAME = new QName("http://webservice.lws.kw/", "GetINSDHOUSPIPNGDGNSSCLNSG2Response");
    private final static QName _GetINSDHOUSPIPNGDGNSSCLNSGResponse_QNAME = new QName("http://webservice.lws.kw/", "GetINSDHOUSPIPNGDGNSSCLNSGResponse");
    private final static QName _GetSAFETYCNFIRM_QNAME = new QName("http://webservice.lws.kw/", "GetSAFETYCNFIRM");
    private final static QName _GetSAFETYCNFIRM2_QNAME = new QName("http://webservice.lws.kw/", "GetSAFETYCNFIRM2");
    private final static QName _GetSAFETYCNFIRM2Response_QNAME = new QName("http://webservice.lws.kw/", "GetSAFETYCNFIRM2Response");
    private final static QName _GetSAFETYCNFIRMResponse_QNAME = new QName("http://webservice.lws.kw/", "GetSAFETYCNFIRMResponse");
    private final static QName _GetWATERRATE_QNAME = new QName("http://webservice.lws.kw/", "GetWATERRATE");
    private final static QName _GetWATERRATEResponse_QNAME = new QName("http://webservice.lws.kw/", "GetWATERRATEResponse");
    private final static QName _Exception_QNAME = new QName("http://webservice.lws.kw/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kw.lws.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCSTMRADDR }
     * 
     */
    public GetCSTMRADDR createGetCSTMRADDR() {
        return new GetCSTMRADDR();
    }

    /**
     * Create an instance of {@link GetCSTMRADDRResponse }
     * 
     */
    public GetCSTMRADDRResponse createGetCSTMRADDRResponse() {
        return new GetCSTMRADDRResponse();
    }

    /**
     * Create an instance of {@link GetINSDHOUSPIPNGDGNSSCLNSG }
     * 
     */
    public GetINSDHOUSPIPNGDGNSSCLNSG createGetINSDHOUSPIPNGDGNSSCLNSG() {
        return new GetINSDHOUSPIPNGDGNSSCLNSG();
    }

    /**
     * Create an instance of {@link GetINSDHOUSPIPNGDGNSSCLNSG2 }
     * 
     */
    public GetINSDHOUSPIPNGDGNSSCLNSG2 createGetINSDHOUSPIPNGDGNSSCLNSG2() {
        return new GetINSDHOUSPIPNGDGNSSCLNSG2();
    }

    /**
     * Create an instance of {@link GetINSDHOUSPIPNGDGNSSCLNSG2Response }
     * 
     */
    public GetINSDHOUSPIPNGDGNSSCLNSG2Response createGetINSDHOUSPIPNGDGNSSCLNSG2Response() {
        return new GetINSDHOUSPIPNGDGNSSCLNSG2Response();
    }

    /**
     * Create an instance of {@link GetINSDHOUSPIPNGDGNSSCLNSGResponse }
     * 
     */
    public GetINSDHOUSPIPNGDGNSSCLNSGResponse createGetINSDHOUSPIPNGDGNSSCLNSGResponse() {
        return new GetINSDHOUSPIPNGDGNSSCLNSGResponse();
    }

    /**
     * Create an instance of {@link GetSAFETYCNFIRM }
     * 
     */
    public GetSAFETYCNFIRM createGetSAFETYCNFIRM() {
        return new GetSAFETYCNFIRM();
    }

    /**
     * Create an instance of {@link GetSAFETYCNFIRM2 }
     * 
     */
    public GetSAFETYCNFIRM2 createGetSAFETYCNFIRM2() {
        return new GetSAFETYCNFIRM2();
    }

    /**
     * Create an instance of {@link GetSAFETYCNFIRM2Response }
     * 
     */
    public GetSAFETYCNFIRM2Response createGetSAFETYCNFIRM2Response() {
        return new GetSAFETYCNFIRM2Response();
    }

    /**
     * Create an instance of {@link GetSAFETYCNFIRMResponse }
     * 
     */
    public GetSAFETYCNFIRMResponse createGetSAFETYCNFIRMResponse() {
        return new GetSAFETYCNFIRMResponse();
    }

    /**
     * Create an instance of {@link GetWATERRATE }
     * 
     */
    public GetWATERRATE createGetWATERRATE() {
        return new GetWATERRATE();
    }

    /**
     * Create an instance of {@link GetWATERRATEResponse }
     * 
     */
    public GetWATERRATEResponse createGetWATERRATEResponse() {
        return new GetWATERRATEResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link WsLwsWaterNowVo }
     * 
     */
    public WsLwsWaterNowVo createWsLwsWaterNowVo() {
        return new WsLwsWaterNowVo();
    }

    /**
     * Create an instance of {@link DefaultVo }
     * 
     */
    public DefaultVo createDefaultVo() {
        return new DefaultVo();
    }

    /**
     * Create an instance of {@link DefaultPageVo }
     * 
     */
    public DefaultPageVo createDefaultPageVo() {
        return new DefaultPageVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCSTMRADDR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCSTMRADDR }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetCSTMRADDR")
    public JAXBElement<GetCSTMRADDR> createGetCSTMRADDR(GetCSTMRADDR value) {
        return new JAXBElement<GetCSTMRADDR>(_GetCSTMRADDR_QNAME, GetCSTMRADDR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCSTMRADDRResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCSTMRADDRResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetCSTMRADDRResponse")
    public JAXBElement<GetCSTMRADDRResponse> createGetCSTMRADDRResponse(GetCSTMRADDRResponse value) {
        return new JAXBElement<GetCSTMRADDRResponse>(_GetCSTMRADDRResponse_QNAME, GetCSTMRADDRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetINSDHOUSPIPNGDGNSSCLNSG")
    public JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG> createGetINSDHOUSPIPNGDGNSSCLNSG(GetINSDHOUSPIPNGDGNSSCLNSG value) {
        return new JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG>(_GetINSDHOUSPIPNGDGNSSCLNSG_QNAME, GetINSDHOUSPIPNGDGNSSCLNSG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetINSDHOUSPIPNGDGNSSCLNSG2")
    public JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG2> createGetINSDHOUSPIPNGDGNSSCLNSG2(GetINSDHOUSPIPNGDGNSSCLNSG2 value) {
        return new JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG2>(_GetINSDHOUSPIPNGDGNSSCLNSG2_QNAME, GetINSDHOUSPIPNGDGNSSCLNSG2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSG2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetINSDHOUSPIPNGDGNSSCLNSG2Response")
    public JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG2Response> createGetINSDHOUSPIPNGDGNSSCLNSG2Response(GetINSDHOUSPIPNGDGNSSCLNSG2Response value) {
        return new JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSG2Response>(_GetINSDHOUSPIPNGDGNSSCLNSG2Response_QNAME, GetINSDHOUSPIPNGDGNSSCLNSG2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSGResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetINSDHOUSPIPNGDGNSSCLNSGResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetINSDHOUSPIPNGDGNSSCLNSGResponse")
    public JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSGResponse> createGetINSDHOUSPIPNGDGNSSCLNSGResponse(GetINSDHOUSPIPNGDGNSSCLNSGResponse value) {
        return new JAXBElement<GetINSDHOUSPIPNGDGNSSCLNSGResponse>(_GetINSDHOUSPIPNGDGNSSCLNSGResponse_QNAME, GetINSDHOUSPIPNGDGNSSCLNSGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetSAFETYCNFIRM")
    public JAXBElement<GetSAFETYCNFIRM> createGetSAFETYCNFIRM(GetSAFETYCNFIRM value) {
        return new JAXBElement<GetSAFETYCNFIRM>(_GetSAFETYCNFIRM_QNAME, GetSAFETYCNFIRM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetSAFETYCNFIRM2")
    public JAXBElement<GetSAFETYCNFIRM2> createGetSAFETYCNFIRM2(GetSAFETYCNFIRM2 value) {
        return new JAXBElement<GetSAFETYCNFIRM2>(_GetSAFETYCNFIRM2_QNAME, GetSAFETYCNFIRM2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRM2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetSAFETYCNFIRM2Response")
    public JAXBElement<GetSAFETYCNFIRM2Response> createGetSAFETYCNFIRM2Response(GetSAFETYCNFIRM2Response value) {
        return new JAXBElement<GetSAFETYCNFIRM2Response>(_GetSAFETYCNFIRM2Response_QNAME, GetSAFETYCNFIRM2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSAFETYCNFIRMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetSAFETYCNFIRMResponse")
    public JAXBElement<GetSAFETYCNFIRMResponse> createGetSAFETYCNFIRMResponse(GetSAFETYCNFIRMResponse value) {
        return new JAXBElement<GetSAFETYCNFIRMResponse>(_GetSAFETYCNFIRMResponse_QNAME, GetSAFETYCNFIRMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWATERRATE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWATERRATE }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetWATERRATE")
    public JAXBElement<GetWATERRATE> createGetWATERRATE(GetWATERRATE value) {
        return new JAXBElement<GetWATERRATE>(_GetWATERRATE_QNAME, GetWATERRATE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWATERRATEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWATERRATEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "GetWATERRATEResponse")
    public JAXBElement<GetWATERRATEResponse> createGetWATERRATEResponse(GetWATERRATEResponse value) {
        return new JAXBElement<GetWATERRATEResponse>(_GetWATERRATEResponse_QNAME, GetWATERRATEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.lws.kw/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
