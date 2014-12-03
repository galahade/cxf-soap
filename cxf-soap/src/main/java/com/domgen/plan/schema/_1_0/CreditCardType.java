
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreditCardType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnameOnCard���Ե�ֵ��
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
     * ����nameOnCard���Ե�ֵ��
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
     * ��ȡcreditCardType���Ե�ֵ��
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
     * ����creditCardType���Ե�ֵ��
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
     * ��ȡcreditCardExpiryDate���Ե�ֵ��
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
     * ����creditCardExpiryDate���Ե�ֵ��
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
     * ��ȡswitchIssueNumber���Ե�ֵ��
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
     * ����switchIssueNumber���Ե�ֵ��
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
     * ��ȡcreditCardNumber���Ե�ֵ��
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
     * ����creditCardNumber���Ե�ֵ��
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
     * ��ȡcreditCardSecurityCode���Ե�ֵ��
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
     * ����creditCardSecurityCode���Ե�ֵ��
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
