
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ValidatePlanDetailsResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ValidatePlanDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BreakdownStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}RenewalDate" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MakerCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MakerDescription"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceDescription"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ModelNumber1"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Status"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}StatusDescription"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CustomerToken"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}HouseholdToken"/>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}ErrorResponseList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatePlanDetailsResponse", propOrder = {
    "breakdownStartDate",
    "renewalDate",
    "makerCode",
    "makerDescription",
    "applianceCode",
    "applianceDescription",
    "modelNumber1",
    "status",
    "statusDescription",
    "customerToken",
    "householdToken",
    "errorResponseList"
})
public class ValidatePlanDetailsResponse {

    @XmlElement(name = "BreakdownStartDate", namespace = "http://domgen.com/core/schema/1_0", nillable = true)
    protected XMLGregorianCalendar breakdownStartDate;
    @XmlElement(name = "RenewalDate", namespace = "http://domgen.com/core/schema/1_0", nillable = true)
    protected XMLGregorianCalendar renewalDate;
    @XmlElement(name = "MakerCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String makerCode;
    @XmlElement(name = "MakerDescription", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String makerDescription;
    @XmlElement(name = "ApplianceCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String applianceCode;
    @XmlElement(name = "ApplianceDescription", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String applianceDescription;
    @XmlElement(name = "ModelNumber1", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String modelNumber1;
    @XmlElement(name = "Status", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String status;
    @XmlElement(name = "StatusDescription", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String statusDescription;
    @XmlElement(name = "CustomerToken", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String customerToken;
    @XmlElement(name = "HouseholdToken", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String householdToken;
    @XmlElement(name = "ErrorResponseList")
    protected ErrorResponseList errorResponseList;

    /**
     * 获取breakdownStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBreakdownStartDate() {
        return breakdownStartDate;
    }

    /**
     * 设置breakdownStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBreakdownStartDate(XMLGregorianCalendar value) {
        this.breakdownStartDate = value;
    }

    /**
     * 获取renewalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenewalDate() {
        return renewalDate;
    }

    /**
     * 设置renewalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenewalDate(XMLGregorianCalendar value) {
        this.renewalDate = value;
    }

    /**
     * 获取makerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakerCode() {
        return makerCode;
    }

    /**
     * 设置makerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakerCode(String value) {
        this.makerCode = value;
    }

    /**
     * 获取makerDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakerDescription() {
        return makerDescription;
    }

    /**
     * 设置makerDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakerDescription(String value) {
        this.makerDescription = value;
    }

    /**
     * 获取applianceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceCode() {
        return applianceCode;
    }

    /**
     * 设置applianceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceCode(String value) {
        this.applianceCode = value;
    }

    /**
     * 获取applianceDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceDescription() {
        return applianceDescription;
    }

    /**
     * 设置applianceDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceDescription(String value) {
        this.applianceDescription = value;
    }

    /**
     * 获取modelNumber1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber1() {
        return modelNumber1;
    }

    /**
     * 设置modelNumber1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber1(String value) {
        this.modelNumber1 = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取statusDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * 设置statusDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * 获取customerToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerToken() {
        return customerToken;
    }

    /**
     * 设置customerToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerToken(String value) {
        this.customerToken = value;
    }

    /**
     * 获取householdToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdToken() {
        return householdToken;
    }

    /**
     * 设置householdToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdToken(String value) {
        this.householdToken = value;
    }

    /**
     * 获取errorResponseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseList }
     *     
     */
    public ErrorResponseList getErrorResponseList() {
        return errorResponseList;
    }

    /**
     * 设置errorResponseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseList }
     *     
     */
    public void setErrorResponseList(ErrorResponseList value) {
        this.errorResponseList = value;
    }

}
