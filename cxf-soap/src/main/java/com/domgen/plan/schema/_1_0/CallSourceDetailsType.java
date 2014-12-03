
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.AgentType;
import com.domgen.core.schema._1_0.SchemeType;


/**
 * <p>CallSourceDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CallSourceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CallSource"/>
 *         &lt;element name="Scheme" type="{http://domgen.com/core/schema/1_0}SchemeType"/>
 *         &lt;element name="Agent" type="{http://domgen.com/core/schema/1_0}AgentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PriceBand"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NumberOfAppliances"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CoverType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallSourceDetailsType", propOrder = {
    "callSource",
    "scheme",
    "agent",
    "applianceCode",
    "priceBand",
    "numberOfAppliances",
    "coverType"
})
public class CallSourceDetailsType {

    @XmlElement(name = "CallSource", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String callSource;
    @XmlElement(name = "Scheme", required = true)
    protected SchemeType scheme;
    @XmlElement(name = "Agent", required = true)
    protected AgentType agent;
    @XmlElement(name = "ApplianceCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String applianceCode;
    @XmlElement(name = "PriceBand", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String priceBand;
    @XmlElement(name = "NumberOfAppliances", namespace = "http://domgen.com/core/schema/1_0")
    protected int numberOfAppliances;
    @XmlElement(name = "CoverType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String coverType;

    /**
     * 获取callSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSource() {
        return callSource;
    }

    /**
     * 设置callSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSource(String value) {
        this.callSource = value;
    }

    /**
     * 获取scheme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SchemeType }
     *     
     */
    public SchemeType getScheme() {
        return scheme;
    }

    /**
     * 设置scheme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeType }
     *     
     */
    public void setScheme(SchemeType value) {
        this.scheme = value;
    }

    /**
     * 获取agent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getAgent() {
        return agent;
    }

    /**
     * 设置agent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setAgent(AgentType value) {
        this.agent = value;
    }

    /**
     * 获取applianceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceCode() {
        return applianceCode;
    }

    /**
     * 设置applianceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceCode(String value) {
        this.applianceCode = value;
    }

    /**
     * 获取priceBand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBand() {
        return priceBand;
    }

    /**
     * 设置priceBand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBand(String value) {
        this.priceBand = value;
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
     * 获取coverType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverType() {
        return coverType;
    }

    /**
     * 设置coverType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverType(String value) {
        this.coverType = value;
    }

}
