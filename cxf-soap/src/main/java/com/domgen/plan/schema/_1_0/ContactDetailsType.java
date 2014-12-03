
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ContactDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcontactTypeEnum���Ե�ֵ��
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
     * ����contactTypeEnum���Ե�ֵ��
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
     * ��ȡsurname���Ե�ֵ��
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
     * ����surname���Ե�ֵ��
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
     * ��ȡfirstName���Ե�ֵ��
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
     * ����firstName���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡinitials���Ե�ֵ��
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
     * ����initials���Ե�ֵ��
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

    /**
     * ��ȡhomeTelephone���Ե�ֵ��
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
     * ����homeTelephone���Ե�ֵ��
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
     * ��ȡworkTelephone���Ե�ֵ��
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
     * ����workTelephone���Ե�ֵ��
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
     * ��ȡmobileTelephone���Ե�ֵ��
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
     * ����mobileTelephone���Ե�ֵ��
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
     * ��ȡemailAddress���Ե�ֵ��
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
     * ����emailAddress���Ե�ֵ��
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
     * ��ȡnationalIdentifier���Ե�ֵ��
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
     * ����nationalIdentifier���Ե�ֵ��
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
     * ��ȡdateOfBirth���Ե�ֵ��
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
     * ����dateOfBirth���Ե�ֵ��
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
     * ��ȡgender���Ե�ֵ��
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
     * ����gender���Ե�ֵ��
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
     * ��ȡallowCustomer���Ե�ֵ��
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
     * ����allowCustomer���Ե�ֵ��
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
     * ��ȡlanguageCode���Ե�ֵ��
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
     * ����languageCode���Ե�ֵ��
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
     * ��ȡcontactName���Ե�ֵ��
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
     * ����contactName���Ե�ֵ��
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
     * ��ȡnoMarketingLiterature���Ե�ֵ��
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
     * ����noMarketingLiterature���Ե�ֵ��
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
     * ��ȡdisabilityList���Ե�ֵ��
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
     * ����disabilityList���Ե�ֵ��
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
