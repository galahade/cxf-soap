
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreditCardType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreditCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NameOnCard"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CreditCardType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CreditCardExpiryDate"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SwitchIssueNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CreditCardNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CreditCardSecurityCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardType", propOrder = {
    "nameOnCard",
    "creditCardType",
    "creditCardExpiryDate",
    "switchIssueNumber",
    "creditCardNumber",
    "creditCardSecurityCode"
})
public class CreditCardType {

    @XmlElement(name = "NameOnCard", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String nameOnCard;
    @XmlElement(name = "CreditCardType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String creditCardType;
    @XmlElement(name = "CreditCardExpiryDate", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String creditCardExpiryDate;
    @XmlElement(name = "SwitchIssueNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String switchIssueNumber;
    @XmlElement(name = "CreditCardNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardSecurityCode", namespace = "http://domgen.com/core/schema/1_0", required = true, type = Integer.class, nillable = true)
    protected Integer creditCardSecurityCode;

    /**
     * 获取nameOnCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * 设置nameOnCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * 获取creditCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * 设置creditCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * 获取creditCardExpiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiryDate() {
        return creditCardExpiryDate;
    }

    /**
     * 设置creditCardExpiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiryDate(String value) {
        this.creditCardExpiryDate = value;
    }

    /**
     * 获取switchIssueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchIssueNumber() {
        return switchIssueNumber;
    }

    /**
     * 设置switchIssueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchIssueNumber(String value) {
        this.switchIssueNumber = value;
    }

    /**
     * 获取creditCardNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * 设置creditCardNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * 获取creditCardSecurityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditCardSecurityCode() {
        return creditCardSecurityCode;
    }

    /**
     * 设置creditCardSecurityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditCardSecurityCode(Integer value) {
        this.creditCardSecurityCode = value;
    }

}
