
package com.cnct.wsdemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AppService", targetNamespace = "http://wsdemo.cnct.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AppService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.cnct.wsdemo.PageBean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryModels", targetNamespace = "http://wsdemo.cnct.com/", className = "com.cnct.wsdemo.QueryModels")
    @ResponseWrapper(localName = "queryModelsResponse", targetNamespace = "http://wsdemo.cnct.com/", className = "com.cnct.wsdemo.QueryModelsResponse")
    public PageBean queryModels(
        @WebParam(name = "arg0", targetNamespace = "")
        PageVo arg0);


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getmodel", targetNamespace = "http://wsdemo.cnct.com/", className = "com.cnct.wsdemo.Getmodel")
    @ResponseWrapper(localName = "getmodelResponse", targetNamespace = "http://wsdemo.cnct.com/", className = "com.cnct.wsdemo.GetmodelResponse")
    public ModelBean getmodel(
            @WebParam(name = "arg0", targetNamespace = "")
                    Integer arg0);

}
