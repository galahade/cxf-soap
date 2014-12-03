
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ApplianceRateDetailsType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>GetRatesByCallSourceRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetRatesByCallSourceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientDetails" type="{http://domgen.com/core/schema/1_0}ClientDetailsType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}LanguageCode"/>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}CallSourceList"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}IsBundle"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NumberOfAppliances"/>
 *         &lt;element name="ApplianceDetails" type="{http://domgen.com/core/schema/1_0}ApplianceRateDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRatesByCallSourceRequest", propOrder = {
    "clientDetails",
    "languageCode",
    "callSourceList",
    "isBundle",
    "numberOfAppliances",
    "applianceDetails"
})
public class GetRatesByCallSourceRequest {

    @XmlElement(name = "ClientDetails", required = true)
    protected ClientDetailsType clientDetails;
    @XmlElement(name = "LanguageCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String languageCode;
    @XmlElement(name = "CallSourceList", required = true)
    protected CallSourceList callSourceList;
    @XmlElement(name = "IsBundle", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String isBundle;
    @XmlElement(name = "NumberOfAppliances", namespace = "http://domgen.com/core/schema/1_0")
    protected int numberOfAppliances;
    @XmlElement(name = "ApplianceDetails", required = true)
    protected ApplianceRateDetailsType applianceDetails;

    /**
     * ��ȡclientDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClientDetailsType }
     *     
     */
    public ClientDetailsType getClientDetails() {
        return clientDetails;
    }

    /**
     * ����clientDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetailsType }
     *     
     */
    public void setClientDetails(ClientDetailsType value) {
        this.clientDetails = value;
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
     * ��ȡcallSourceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CallSourceList }
     *     
     */
    public CallSourceList getCallSourceList() {
        return callSourceList;
    }

    /**
     * ����callSourceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CallSourceList }
     *     
     */
    public void setCallSourceList(CallSourceList value) {
        this.callSourceList = value;
    }

    /**
     * ��ȡisBundle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBundle() {
        return isBundle;
    }

    /**
     * ����isBundle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBundle(String value) {
        this.isBundle = value;
    }

    /**
     * ��ȡnumberOfAppliances���Ե�ֵ��
     * 
     */
    public int getNumberOfAppliances() {
        return numberOfAppliances;
    }

    /**
     * ����numberOfAppliances���Ե�ֵ��
     * 
     */
    public void setNumberOfAppliances(int value) {
        this.numberOfAppliances = value;
    }

    /**
     * ��ȡapplianceDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ApplianceRateDetailsType }
     *     
     */
    public ApplianceRateDetailsType getApplianceDetails() {
        return applianceDetails;
    }

    /**
     * ����applianceDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ApplianceRateDetailsType }
     *     
     */
    public void setApplianceDetails(ApplianceRateDetailsType value) {
        this.applianceDetails = value;
    }

}
