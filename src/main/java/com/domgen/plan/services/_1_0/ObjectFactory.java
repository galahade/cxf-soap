
package com.domgen.plan.services._1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.domgen.plan.schema._1_0.CreatePlanRequest;
import com.domgen.plan.schema._1_0.CreatePlanResponse;
import com.domgen.plan.schema._1_0.GetPlanRateRequest;
import com.domgen.plan.schema._1_0.GetPlanRateResponse;
import com.domgen.plan.schema._1_0.GetRatesByCallSourceRequest;
import com.domgen.plan.schema._1_0.GetRatesByCallSourceResponse;
import com.domgen.plan.schema._1_0.ValidatePlanDetailsRequest;
import com.domgen.plan.schema._1_0.ValidatePlanDetailsResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.domgen.plan.services._1_0 package. 
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

    private final static QName _ValidatePlanDetailsReq_QNAME = new QName("http://domgen.com/plan/services/1_0", "ValidatePlanDetailsReq");
    private final static QName _GetPlanRateResp_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetPlanRateResp");
    private final static QName _CreatePlanResp_QNAME = new QName("http://domgen.com/plan/services/1_0", "CreatePlanResp");
    private final static QName _GetPlanRateFault_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetPlanRateFault");
    private final static QName _ValidatePlanDetailsFault_QNAME = new QName("http://domgen.com/plan/services/1_0", "ValidatePlanDetailsFault");
    private final static QName _CreatePlanReq_QNAME = new QName("http://domgen.com/plan/services/1_0", "CreatePlanReq");
    private final static QName _CreatePlanFault_QNAME = new QName("http://domgen.com/plan/services/1_0", "CreatePlanFault");
    private final static QName _GetPlanRateReq_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetPlanRateReq");
    private final static QName _GetRatesByCallSourceFault_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetRatesByCallSourceFault");
    private final static QName _GetRatesByCallSourceResp_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetRatesByCallSourceResp");
    private final static QName _GetRatesByCallSourceReq_QNAME = new QName("http://domgen.com/plan/services/1_0", "GetRatesByCallSourceReq");
    private final static QName _ValidatePlanDetailsResp_QNAME = new QName("http://domgen.com/plan/services/1_0", "ValidatePlanDetailsResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.domgen.plan.services._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatePlanDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "ValidatePlanDetailsReq")
    public JAXBElement<ValidatePlanDetailsRequest> createValidatePlanDetailsReq(ValidatePlanDetailsRequest value) {
        return new JAXBElement<ValidatePlanDetailsRequest>(_ValidatePlanDetailsReq_QNAME, ValidatePlanDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetPlanRateResp")
    public JAXBElement<GetPlanRateResponse> createGetPlanRateResp(GetPlanRateResponse value) {
        return new JAXBElement<GetPlanRateResponse>(_GetPlanRateResp_QNAME, GetPlanRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "CreatePlanResp")
    public JAXBElement<CreatePlanResponse> createCreatePlanResp(CreatePlanResponse value) {
        return new JAXBElement<CreatePlanResponse>(_CreatePlanResp_QNAME, CreatePlanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetPlanRateFault")
    public JAXBElement<FaultType> createGetPlanRateFault(FaultType value) {
        return new JAXBElement<FaultType>(_GetPlanRateFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "ValidatePlanDetailsFault")
    public JAXBElement<FaultType> createValidatePlanDetailsFault(FaultType value) {
        return new JAXBElement<FaultType>(_ValidatePlanDetailsFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "CreatePlanReq")
    public JAXBElement<CreatePlanRequest> createCreatePlanReq(CreatePlanRequest value) {
        return new JAXBElement<CreatePlanRequest>(_CreatePlanReq_QNAME, CreatePlanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "CreatePlanFault")
    public JAXBElement<FaultType> createCreatePlanFault(FaultType value) {
        return new JAXBElement<FaultType>(_CreatePlanFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanRateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetPlanRateReq")
    public JAXBElement<GetPlanRateRequest> createGetPlanRateReq(GetPlanRateRequest value) {
        return new JAXBElement<GetPlanRateRequest>(_GetPlanRateReq_QNAME, GetPlanRateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetRatesByCallSourceFault")
    public JAXBElement<FaultType> createGetRatesByCallSourceFault(FaultType value) {
        return new JAXBElement<FaultType>(_GetRatesByCallSourceFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesByCallSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetRatesByCallSourceResp")
    public JAXBElement<GetRatesByCallSourceResponse> createGetRatesByCallSourceResp(GetRatesByCallSourceResponse value) {
        return new JAXBElement<GetRatesByCallSourceResponse>(_GetRatesByCallSourceResp_QNAME, GetRatesByCallSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatesByCallSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "GetRatesByCallSourceReq")
    public JAXBElement<GetRatesByCallSourceRequest> createGetRatesByCallSourceReq(GetRatesByCallSourceRequest value) {
        return new JAXBElement<GetRatesByCallSourceRequest>(_GetRatesByCallSourceReq_QNAME, GetRatesByCallSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatePlanDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/plan/services/1_0", name = "ValidatePlanDetailsResp")
    public JAXBElement<ValidatePlanDetailsResponse> createValidatePlanDetailsResp(ValidatePlanDetailsResponse value) {
        return new JAXBElement<ValidatePlanDetailsResponse>(_ValidatePlanDetailsResp_QNAME, ValidatePlanDetailsResponse.class, null, value);
    }

}
