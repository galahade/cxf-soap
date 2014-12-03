
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OfferDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OfferDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PeriodOfCover"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Premium"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}WaitDays"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}WicType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MultiplanType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MultiplanWarrantyType"/>
 *         &lt;element name="PaymentDetails" type="{http://domgen.com/plan/schema/1_0}PaymentDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailsType", propOrder = {
    "periodOfCover",
    "premium",
    "waitDays",
    "wicType",
    "multiplanType",
    "multiplanWarrantyType",
    "paymentDetails"
})
public class OfferDetailsType {

    @XmlElement(name = "PeriodOfCover", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String periodOfCover;
    @XmlElement(name = "Premium", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal premium;
    @XmlElement(name = "WaitDays", namespace = "http://domgen.com/core/schema/1_0")
    protected int waitDays;
    @XmlElement(name = "WicType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String wicType;
    @XmlElement(name = "MultiplanType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String multiplanType;
    @XmlElement(name = "MultiplanWarrantyType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String multiplanWarrantyType;
    @XmlElement(name = "PaymentDetails", required = true)
    protected PaymentDetailsType paymentDetails;

    /**
     * ��ȡperiodOfCover���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodOfCover() {
        return periodOfCover;
    }

    /**
     * ����periodOfCover���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodOfCover(String value) {
        this.periodOfCover = value;
    }

    /**
     * ��ȡpremium���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * ����premium���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremium(BigDecimal value) {
        this.premium = value;
    }

    /**
     * ��ȡwaitDays���Ե�ֵ��
     * 
     */
    public int getWaitDays() {
        return waitDays;
    }

    /**
     * ����waitDays���Ե�ֵ��
     * 
     */
    public void setWaitDays(int value) {
        this.waitDays = value;
    }

    /**
     * ��ȡwicType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWicType() {
        return wicType;
    }

    /**
     * ����wicType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWicType(String value) {
        this.wicType = value;
    }

    /**
     * ��ȡmultiplanType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplanType() {
        return multiplanType;
    }

    /**
     * ����multiplanType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplanType(String value) {
        this.multiplanType = value;
    }

    /**
     * ��ȡmultiplanWarrantyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplanWarrantyType() {
        return multiplanWarrantyType;
    }

    /**
     * ����multiplanWarrantyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplanWarrantyType(String value) {
        this.multiplanWarrantyType = value;
    }

    /**
     * ��ȡpaymentDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * ����paymentDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

}
