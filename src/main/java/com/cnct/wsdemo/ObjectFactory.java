
package com.cnct.wsdemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cnct.wsdemo package. 
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

    private final static QName _QueryModelsResponse_QNAME = new QName("http://wsdemo.cnct.com/", "queryModelsResponse");
    private final static QName _QueryModels_QNAME = new QName("http://wsdemo.cnct.com/", "queryModels");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cnct.wsdemo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PageVo }
     * 
     */
    public PageVo createPageVo() {
        return new PageVo();
    }

    /**
     * Create an instance of {@link PageBean }
     * 
     */
    public PageBean createPageBean() {
        return new PageBean();
    }

    /**
     * Create an instance of {@link ModelBean }
     * 
     */
    public ModelBean createModelBean() {
        return new ModelBean();
    }

    /**
     * Create an instance of {@link QueryModelsResponse }
     * 
     */
    public QueryModelsResponse createQueryModelsResponse() {
        return new QueryModelsResponse();
    }

    /**
     * Create an instance of {@link QueryModels }
     * 
     */
    public QueryModels createQueryModels() {
        return new QueryModels();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryModelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdemo.cnct.com/", name = "queryModelsResponse")
    public JAXBElement<QueryModelsResponse> createQueryModelsResponse(QueryModelsResponse value) {
        return new JAXBElement<QueryModelsResponse>(_QueryModelsResponse_QNAME, QueryModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryModels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdemo.cnct.com/", name = "queryModels")
    public JAXBElement<QueryModels> createQueryModels(QueryModels value) {
        return new JAXBElement<QueryModels>(_QueryModels_QNAME, QueryModels.class, null, value);
    }

}
