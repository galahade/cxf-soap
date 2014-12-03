
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DirectDebitType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccountName���Ե�ֵ��
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
     * ����accountName���Ե�ֵ��
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
     * ��ȡbankCode���Ե�ֵ��
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
     * ����bankCode���Ե�ֵ��
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
     * ��ȡbankSortCode���Ե�ֵ��
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
     * ����bankSortCode���Ե�ֵ��
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
     * ��ȡaccountNumber���Ե�ֵ��
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
     * ����accountNumber���Ե�ֵ��
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
     * ��ȡnominatedPaymentDay���Ե�ֵ��
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
     * ����nominatedPaymentDay���Ե�ֵ��
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
     * ��ȡiban���Ե�ֵ��
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
     * ����iban���Ե�ֵ��
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
     * ��ȡaccountCheckDigit���Ե�ֵ��
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
     * ����accountCheckDigit���Ե�ֵ��
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
