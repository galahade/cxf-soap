
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ApplianceRateDetailsType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>GetRatesByCallSourceRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取clientDetails属性的值。
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
     * 设置clientDetails属性的值。
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
     * 获取callSourceList属性的值。
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
     * 设置callSourceList属性的值。
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
     * 获取isBundle属性的值。
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
     * 设置isBundle属性的值。
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
     * 获取numberOfAppliances属性的值。
     * 
     */
    public int getNumberOfAppliances() {
        return numberOfAppliances;
    }

    /**
     * 设置numberOfAppliances属性的值。
     * 
     */
    public void setNumberOfAppliances(int value) {
        this.numberOfAppliances = value;
    }

    /**
     * 获取applianceDetails属性的值。
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
     * 设置applianceDetails属性的值。
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
