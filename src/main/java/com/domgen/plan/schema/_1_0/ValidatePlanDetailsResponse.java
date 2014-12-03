
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ValidatePlanDetailsResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbreakdownStartDate���Ե�ֵ��
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
     * ����breakdownStartDate���Ե�ֵ��
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
     * ��ȡrenewalDate���Ե�ֵ��
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
     * ����renewalDate���Ե�ֵ��
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
     * ��ȡmakerCode���Ե�ֵ��
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
     * ����makerCode���Ե�ֵ��
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
     * ��ȡmakerDescription���Ե�ֵ��
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
     * ����makerDescription���Ե�ֵ��
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
     * ��ȡapplianceCode���Ե�ֵ��
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
     * ����applianceCode���Ե�ֵ��
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
     * ��ȡapplianceDescription���Ե�ֵ��
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
     * ����applianceDescription���Ե�ֵ��
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
     * ��ȡmodelNumber1���Ե�ֵ��
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
     * ����modelNumber1���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡstatusDescription���Ե�ֵ��
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
     * ����statusDescription���Ե�ֵ��
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
     * ��ȡcustomerToken���Ե�ֵ��
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
     * ����customerToken���Ե�ֵ��
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
     * ��ȡhouseholdToken���Ե�ֵ��
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
     * ����householdToken���Ե�ֵ��
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
     * ��ȡerrorResponseList���Ե�ֵ��
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
     * ����errorResponseList���Ե�ֵ��
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
