
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddressType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine1"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine2"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine3"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine4"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PostCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "postCode"
})
public class AddressType {

    @XmlElement(name = "AddressLine1", required = true)
    protected String addressLine1;
    @XmlElement(name = "AddressLine2", required = true, nillable = true)
    protected String addressLine2;
    @XmlElement(name = "AddressLine3", required = true, nillable = true)
    protected String addressLine3;
    @XmlElement(name = "AddressLine4", required = true, nillable = true)
    protected String addressLine4;
    @XmlElement(name = "PostCode", required = true)
    protected String postCode;

    /**
     * ��ȡaddressLine1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * ����addressLine1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * ��ȡaddressLine2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * ����addressLine2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * ��ȡaddressLine3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * ����addressLine3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * ��ȡaddressLine4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * ����addressLine4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * ��ȡpostCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * ����postCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

}
