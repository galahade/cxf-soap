
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustomerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Title"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Surname"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}FirstName"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Initials" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}DateOfBirth" minOccurs="0"/>
 *         &lt;element name="OwnerAddress" type="{http://domgen.com/core/schema/1_0}AddressType"/>
 *         &lt;element name="RiskAddress" type="{http://domgen.com/core/schema/1_0}AddressType" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}EmailAddress" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}HomeTelephone" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}WorkTelephone" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MobileTelephone" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CustomerToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "title",
    "surname",
    "firstName",
    "initials",
    "dateOfBirth",
    "ownerAddress",
    "riskAddress",
    "emailAddress",
    "homeTelephone",
    "workTelephone",
    "mobileTelephone",
    "customerToken"
})
public class CustomerType {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "DateOfBirth", nillable = true)
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "OwnerAddress", required = true, nillable = true)
    protected AddressType ownerAddress;
    @XmlElement(name = "RiskAddress")
    protected AddressType riskAddress;
    @XmlElement(name = "EmailAddress", nillable = true)
    protected String emailAddress;
    @XmlElement(name = "HomeTelephone")
    protected String homeTelephone;
    @XmlElement(name = "WorkTelephone")
    protected String workTelephone;
    @XmlElement(name = "MobileTelephone")
    protected String mobileTelephone;
    @XmlElement(name = "CustomerToken", required = true)
    protected String customerToken;

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取initials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * 设置initials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * 获取dateOfBirth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * 设置dateOfBirth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * 获取ownerAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * 设置ownerAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOwnerAddress(AddressType value) {
        this.ownerAddress = value;
    }

    /**
     * 获取riskAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRiskAddress() {
        return riskAddress;
    }

    /**
     * 设置riskAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRiskAddress(AddressType value) {
        this.riskAddress = value;
    }

    /**
     * 获取emailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * 获取homeTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTelephone() {
        return homeTelephone;
    }

    /**
     * 设置homeTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTelephone(String value) {
        this.homeTelephone = value;
    }

    /**
     * 获取workTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTelephone() {
        return workTelephone;
    }

    /**
     * 设置workTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTelephone(String value) {
        this.workTelephone = value;
    }

    /**
     * 获取mobileTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileTelephone() {
        return mobileTelephone;
    }

    /**
     * 设置mobileTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileTelephone(String value) {
        this.mobileTelephone = value;
    }

    /**
     * 获取customerToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerToken() {
        return customerToken;
    }

    /**
     * 设置customerToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerToken(String value) {
        this.customerToken = value;
    }

}
