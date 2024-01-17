
package kw.lws.webservice;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2024-01-17T13:37:38.523+09:00
 * Generated source version: 4.0.3
 */

@WebFault(name = "Exception", targetNamespace = "http://webservice.lws.kw/")
public class Exception_Exception extends java.lang.Exception {

    private kw.lws.webservice.Exception faultInfo;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, kw.lws.webservice.Exception exception) {
        super(message);
        this.faultInfo = exception;
    }

    public Exception_Exception(String message, kw.lws.webservice.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = exception;
    }

    public kw.lws.webservice.Exception getFaultInfo() {
        return this.faultInfo;
    }
}
