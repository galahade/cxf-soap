package com.domgen.plan.services._1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-12-02T15:47:12.670+08:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://domgen.com/plan/services/1_0", name = "IPlanService")
@XmlSeeAlso({com.domgen.core.schema._1_0.ObjectFactory.class, ObjectFactory.class, com.domgen.plan.schema._1_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IPlanService {

    @WebResult(name = "GetPlanRateResp", targetNamespace = "http://domgen.com/plan/services/1_0", partName = "parameters")
    @WebMethod(operationName = "GetPlanRate")
    public com.domgen.plan.schema._1_0.GetPlanRateResponse getPlanRate(
        @WebParam(partName = "parameters", name = "GetPlanRateReq", targetNamespace = "http://domgen.com/plan/services/1_0")
        com.domgen.plan.schema._1_0.GetPlanRateRequest parameters
    ) throws GetPlanRateFault;

    @WebResult(name = "ValidatePlanDetailsResp", targetNamespace = "http://domgen.com/plan/services/1_0", partName = "parameters")
    @WebMethod(operationName = "ValidatePlanDetails")
    public com.domgen.plan.schema._1_0.ValidatePlanDetailsResponse validatePlanDetails(
        @WebParam(partName = "parameters", name = "ValidatePlanDetailsReq", targetNamespace = "http://domgen.com/plan/services/1_0")
        com.domgen.plan.schema._1_0.ValidatePlanDetailsRequest parameters
    ) throws ValidatePlanDetailsFault;

    @WebResult(name = "GetRatesByCallSourceResp", targetNamespace = "http://domgen.com/plan/services/1_0", partName = "parameters")
    @WebMethod(operationName = "GetRatesByCallSource")
    public com.domgen.plan.schema._1_0.GetRatesByCallSourceResponse getRatesByCallSource(
        @WebParam(partName = "parameters", name = "GetRatesByCallSourceReq", targetNamespace = "http://domgen.com/plan/services/1_0")
        com.domgen.plan.schema._1_0.GetRatesByCallSourceRequest parameters
    ) throws GetRatesByCallSourceFault;

    @WebResult(name = "CreatePlanResp", targetNamespace = "http://domgen.com/plan/services/1_0", partName = "parameters")
    @WebMethod(operationName = "CreatePlan")
    public com.domgen.plan.schema._1_0.CreatePlanResponse createPlan(
        @WebParam(partName = "parameters", name = "CreatePlanReq", targetNamespace = "http://domgen.com/plan/services/1_0")
        com.domgen.plan.schema._1_0.CreatePlanRequest parameters
    ) throws CreatePlanFault;
}