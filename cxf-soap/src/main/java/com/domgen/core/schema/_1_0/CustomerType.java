
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustomerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡownerAddress���Ե�ֵ��
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
     * ����ownerAddress���Ե�ֵ��
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
     * ��ȡriskAddress���Ե�ֵ��
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
     * ����riskAddress���Ե�ֵ��
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
     * ��ȡcustomerToken���Ե�ֵ��
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
     * ����customerToken���Ե�ֵ��
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
