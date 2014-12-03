
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>GetPlanRateRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetPlanRateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientDetails" type="{http://domgen.com/core/schema/1_0}ClientDetailsType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CompanyCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SchemeCode"/>
 *         &lt;element name="ApplianceDetails" type="{http://domgen.com/plan/schema/1_0}ApplianceDetailsType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CustomerToken"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}HouseholdToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPlanRateRequest", propOrder = {
    "clientDetails",
    "companyCode",
    "schemeCode",
    "applianceDetails",
    "customerToken",
    "householdToken"
})
public class GetPlanRateRequest {

    @XmlElement(name = "ClientDetails", required = true)
    protected ClientDetailsType clientDetails;
    @XmlElement(name = "CompanyCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String companyCode;
    @XmlElement(name = "SchemeCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String schemeCode;
    @XmlElement(name = "ApplianceDetails", required = true)
    protected ApplianceDetailsType applianceDetails;
    @XmlElement(name = "CustomerToken", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String customerToken;
    @XmlElement(name = "HouseholdToken", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String householdToken;

    /**
     * 获取clientDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientDetailsType }
     *     
     */
    public ClientDetailsType getClientDetails() {
        return clientDetails;
    }

    /**
     * 设置clientDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetailsType }
     *     
     */
    public void setClientDetails(ClientDetailsType value) {
        this.clientDetails = value;
    }

    /**
     * 获取companyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置companyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * 获取schemeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * 设置schemeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCode(String value) {
        this.schemeCode = value;
    }

    /**
     * 获取applianceDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplianceDetailsType }
     *     
     */
    public ApplianceDetailsType getApplianceDetails() {
        return applianceDetails;
    }

    /**
     * 设置applianceDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplianceDetailsType }
     *     
     */
    public void setApplianceDetails(ApplianceDetailsType value) {
        this.applianceDetails = value;
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

}
