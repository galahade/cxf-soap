
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentProfileType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaymentProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentProfile"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NumberOfPayments"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MonthsBetweenPayments"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentProfileDescription"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProfileType", propOrder = {
    "paymentType",
    "paymentProfile",
    "numberOfPayments",
    "monthsBetweenPayments",
    "paymentProfileDescription"
})
public class PaymentProfileType {

    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "PaymentProfile", required = true)
    protected String paymentProfile;
    @XmlElement(name = "NumberOfPayments", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfPayments;
    @XmlElement(name = "MonthsBetweenPayments", required = true, type = Integer.class, nillable = true)
    protected Integer monthsBetweenPayments;
    @XmlElement(name = "PaymentProfileDescription", required = true)
    protected String paymentProfileDescription;

    /**
     * ��ȡpaymentType���Ե�ֵ��
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
     * ����paymentType���Ե�ֵ��
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
     * ��ȡpaymentProfile���Ե�ֵ��
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
     * ����paymentProfile���Ե�ֵ��
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
     * ��ȡnumberOfPayments���Ե�ֵ��
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
     * ����numberOfPayments���Ե�ֵ��
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
     * ��ȡmonthsBetweenPayments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthsBetweenPayments() {
        return monthsBetweenPayments;
    }

    /**
     * ����monthsBetweenPayments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthsBetweenPayments(Integer value) {
        this.monthsBetweenPayments = value;
    }

    /**
     * ��ȡpaymentProfileDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProfileDescription() {
        return paymentProfileDescription;
    }

    /**
     * ����paymentProfileDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProfileDescription(String value) {
        this.paymentProfileDescription = value;
    }

}
