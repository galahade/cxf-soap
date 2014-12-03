
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PreferredPaymentFlag"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentProfile"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CashPaymentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NumberOfPayments"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentFrequency"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}FirstPayment"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SubsequentPayment"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ExcessAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", propOrder = {
    "preferredPaymentFlag",
    "paymentType",
    "paymentProfile",
    "cashPaymentType",
    "numberOfPayments",
    "paymentFrequency",
    "firstPayment",
    "subsequentPayment",
    "excessAmount"
})
public class PaymentDetailsType {

    @XmlElement(name = "PreferredPaymentFlag", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String preferredPaymentFlag;
    @XmlElement(name = "PaymentType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String paymentType;
    @XmlElement(name = "PaymentProfile", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String paymentProfile;
    @XmlElement(name = "CashPaymentType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String cashPaymentType;
    @XmlElement(name = "NumberOfPayments", namespace = "http://domgen.com/core/schema/1_0", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfPayments;
    @XmlElement(name = "PaymentFrequency", namespace = "http://domgen.com/core/schema/1_0")
    protected int paymentFrequency;
    @XmlElement(name = "FirstPayment", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal firstPayment;
    @XmlElement(name = "SubsequentPayment", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal subsequentPayment;
    @XmlElement(name = "ExcessAmount", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal excessAmount;

    /**
     * 获取preferredPaymentFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredPaymentFlag() {
        return preferredPaymentFlag;
    }

    /**
     * 设置preferredPaymentFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredPaymentFlag(String value) {
        this.preferredPaymentFlag = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * 获取paymentProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * 设置paymentProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProfile(String value) {
        this.paymentProfile = value;
    }

    /**
     * 获取cashPaymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashPaymentType() {
        return cashPaymentType;
    }

    /**
     * 设置cashPaymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashPaymentType(String value) {
        this.cashPaymentType = value;
    }

    /**
     * 获取numberOfPayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * 设置numberOfPayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPayments(Integer value) {
        this.numberOfPayments = value;
    }

    /**
     * 获取paymentFrequency属性的值。
     * 
     */
    public int getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * 设置paymentFrequency属性的值。
     * 
     */
    public void setPaymentFrequency(int value) {
        this.paymentFrequency = value;
    }

    /**
     * 获取firstPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPayment() {
        return firstPayment;
    }

    /**
     * 设置firstPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPayment(BigDecimal value) {
        this.firstPayment = value;
    }

    /**
     * 获取subsequentPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsequentPayment() {
        return subsequentPayment;
    }

    /**
     * 设置subsequentPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsequentPayment(BigDecimal value) {
        this.subsequentPayment = value;
    }

    /**
     * 获取excessAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExcessAmount() {
        return excessAmount;
    }

    /**
     * 设置excessAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExcessAmount(BigDecimal value) {
        this.excessAmount = value;
    }

}
