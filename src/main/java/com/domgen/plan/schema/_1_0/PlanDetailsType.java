
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PlanDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PlanDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CompanyCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SchemeCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ReferenceNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BreakdownStartDate"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}RenewalDate"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PlanTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanDetailsType", propOrder = {
    "companyCode",
    "schemeCode",
    "referenceNumber",
    "breakdownStartDate",
    "renewalDate",
    "planTypeEnum"
})
public class PlanDetailsType {

    @XmlElement(name = "CompanyCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String companyCode;
    @XmlElement(name = "SchemeCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String schemeCode;
    @XmlElement(name = "ReferenceNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String referenceNumber;
    @XmlElement(name = "BreakdownStartDate", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected XMLGregorianCalendar breakdownStartDate;
    @XmlElement(name = "RenewalDate", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected XMLGregorianCalendar renewalDate;
    @XmlElement(name = "PlanTypeEnum", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String planTypeEnum;

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
     * 获取referenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 设置referenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

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
     * 获取planTypeEnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTypeEnum() {
        return planTypeEnum;
    }

    /**
     * 设置planTypeEnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTypeEnum(String value) {
        this.planTypeEnum = value;
    }

}
