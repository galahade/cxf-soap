
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>GetPlanRateRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡclientDetails���Ե�ֵ��
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
     * ����clientDetails���Ե�ֵ��
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
     * ��ȡcompanyCode���Ե�ֵ��
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
     * ����companyCode���Ե�ֵ��
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
     * ��ȡschemeCode���Ե�ֵ��
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
     * ����schemeCode���Ե�ֵ��
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
     * ��ȡapplianceDetails���Ե�ֵ��
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
     * ����applianceDetails���Ե�ֵ��
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

}
