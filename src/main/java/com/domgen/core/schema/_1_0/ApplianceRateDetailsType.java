
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ApplianceRateDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ApplianceRateDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://domgen.com/core/schema/1_0}ApplianceDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BreakdownStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BoilerType" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BusinessTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplianceRateDetailsType", propOrder = {
    "breakdownStartDate",
    "boilerType",
    "businessTypeEnum"
})
public class ApplianceRateDetailsType
    extends ApplianceDetailsType
{

    @XmlElement(name = "BreakdownStartDate", nillable = true)
    protected XMLGregorianCalendar breakdownStartDate;
    @XmlElement(name = "BoilerType")
    protected String boilerType;
    @XmlElement(name = "BusinessTypeEnum")
    protected String businessTypeEnum;

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
     * 获取boilerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoilerType() {
        return boilerType;
    }

    /**
     * 设置boilerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoilerType(String value) {
        this.boilerType = value;
    }

    /**
     * 获取businessTypeEnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTypeEnum() {
        return businessTypeEnum;
    }

    /**
     * 设置businessTypeEnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTypeEnum(String value) {
        this.businessTypeEnum = value;
    }

}
