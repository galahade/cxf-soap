
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ContactDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ContactTypeEnum"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Surname"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}FirstName"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Title"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Initials"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine1"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine2"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine3"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AddressLine4"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PostCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}HomeTelephone"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}WorkTelephone"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MobileTelephone"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}EmailAddress" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NationalIdentifier"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}DateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Gender"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AllowCustomer"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}LanguageCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ContactName"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NoMarketingLiterature"/>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}DisabilityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailsType", propOrder = {
    "contactTypeEnum",
    "surname",
    "firstName",
    "title",
    "initials",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "postCode",
    "homeTelephone",
    "workTelephone",
    "mobileTelephone",
    "emailAddress",
    "nationalIdentifier",
    "dateOfBirth",
    "gender",
    "allowCustomer",
    "languageCode",
    "contactName",
    "noMarketingLiterature",
    "disabilityList"
})
public class ContactDetailsType {

    @XmlElement(name = "ContactTypeEnum", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String contactTypeEnum;
    @XmlElement(name = "Surname", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String surname;
    @XmlElement(name = "FirstName", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String firstName;
    @XmlElement(name = "Title", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String title;
    @XmlElement(name = "Initials", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String initials;
    @XmlElement(name = "AddressLine1", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String addressLine1;
    @XmlElement(name = "AddressLine2", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected String addressLine2;
    @XmlElement(name = "AddressLine3", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected String addressLine3;
    @XmlElement(name = "AddressLine4", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected String addressLine4;
    @XmlElement(name = "PostCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String postCode;
    @XmlElement(name = "HomeTelephone", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String homeTelephone;
    @XmlElement(name = "WorkTelephone", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String workTelephone;
    @XmlElement(name = "MobileTelephone", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String mobileTelephone;
    @XmlElement(name = "EmailAddress", namespace = "http://domgen.com/core/schema/1_0", nillable = true)
    protected String emailAddress;
    @XmlElement(name = "NationalIdentifier", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String nationalIdentifier;
    @XmlElement(name = "DateOfBirth", namespace = "http://domgen.com/core/schema/1_0", nillable = true)
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Gender", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String gender;
    @XmlElement(name = "AllowCustomer", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String allowCustomer;
    @XmlElement(name = "LanguageCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String languageCode;
    @XmlElement(name = "ContactName", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String contactName;
    @XmlElement(name = "NoMarketingLiterature", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String noMarketingLiterature;
    @XmlElement(name = "DisabilityList")
    protected DisabilityList disabilityList;

    /**
     * 获取contactTypeEnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeEnum() {
        return contactTypeEnum;
    }

    /**
     * 设置contactTypeEnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeEnum(String value) {
        this.contactTypeEnum = value;
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
     * 获取addressLine1属性的值。
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
     * 设置addressLine1属性的值。
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
     * 获取addressLine2属性的值。
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
     * 设置addressLine2属性的值。
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
     * 获取addressLine3属性的值。
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
     * 设置addressLine3属性的值。
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
     * 获取addressLine4属性的值。
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
     * 设置addressLine4属性的值。
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
     * 获取postCode属性的值。
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
     * 设置postCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     * 获取nationalIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * 设置nationalIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
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
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * 获取allowCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowCustomer() {
        return allowCustomer;
    }

    /**
     * 设置allowCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowCustomer(String value) {
        this.allowCustomer = value;
    }

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * 获取contactName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置contactName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * 获取noMarketingLiterature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMarketingLiterature() {
        return noMarketingLiterature;
    }

    /**
     * 设置noMarketingLiterature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMarketingLiterature(String value) {
        this.noMarketingLiterature = value;
    }

    /**
     * 获取disabilityList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DisabilityList }
     *     
     */
    public DisabilityList getDisabilityList() {
        return disabilityList;
    }

    /**
     * 设置disabilityList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityList }
     *     
     */
    public void setDisabilityList(DisabilityList value) {
        this.disabilityList = value;
    }

}
