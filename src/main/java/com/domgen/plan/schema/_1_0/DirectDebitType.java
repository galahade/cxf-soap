
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DirectDebitType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DirectDebitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AccountName"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BankCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BankSortCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AccountNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NominatedPaymentDay"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}IBAN"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AccountCheckDigit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitType", propOrder = {
    "accountName",
    "bankCode",
    "bankSortCode",
    "accountNumber",
    "nominatedPaymentDay",
    "iban",
    "accountCheckDigit"
})
public class DirectDebitType {

    @XmlElement(name = "AccountName", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String accountName;
    @XmlElement(name = "BankCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String bankCode;
    @XmlElement(name = "BankSortCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String bankSortCode;
    @XmlElement(name = "AccountNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String accountNumber;
    @XmlElement(name = "NominatedPaymentDay", namespace = "http://domgen.com/core/schema/1_0", required = true, type = Integer.class, nillable = true)
    protected Integer nominatedPaymentDay;
    @XmlElement(name = "IBAN", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String iban;
    @XmlElement(name = "AccountCheckDigit", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String accountCheckDigit;

    /**
     * 获取accountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置accountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * 获取bankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置bankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * 获取bankSortCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * 设置bankSortCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSortCode(String value) {
        this.bankSortCode = value;
    }

    /**
     * 获取accountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * 获取nominatedPaymentDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNominatedPaymentDay() {
        return nominatedPaymentDay;
    }

    /**
     * 设置nominatedPaymentDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNominatedPaymentDay(Integer value) {
        this.nominatedPaymentDay = value;
    }

    /**
     * 获取iban属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * 设置iban属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * 获取accountCheckDigit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCheckDigit() {
        return accountCheckDigit;
    }

    /**
     * 设置accountCheckDigit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCheckDigit(String value) {
        this.accountCheckDigit = value;
    }

}
