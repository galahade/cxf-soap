package com.domgen.plan.services._1_0;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-12-02T15:47:12.679+08:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "PlanService", 
                  wsdlLocation = "PlanServices.wsdl",
                  targetNamespace = "http://domgen.com/plan/services/1_0") 
public class PlanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://domgen.com/plan/services/1_0", "PlanService");
    public final static QName PlanServiceSoapPort = new QName("http://domgen.com/plan/services/1_0", "PlanServiceSoapPort");
    static {
        URL url = PlanService.class.getResource("PlanServices.wsdl");
        if (url == null) {
            url = PlanService.class.getClassLoader().getResource("PlanServices.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(PlanService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "PlanServices.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public PlanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PlanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PlanService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PlanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PlanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PlanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IPlanService
     */
    @WebEndpoint(name = "PlanServiceSoapPort")
    public IPlanService getPlanServiceSoapPort() {
        return super.getPort(PlanServiceSoapPort, IPlanService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPlanService
     */
    @WebEndpoint(name = "PlanServiceSoapPort")
    public IPlanService getPlanServiceSoapPort(WebServiceFeature... features) {
        return super.getPort(PlanServiceSoapPort, IPlanService.class, features);
    }

}
