
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DPAType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DPAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DPA1prcDGC" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA2mktDG" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA3mktC" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA4mktDGC" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA5mktThird" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA6mktEmail" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA7mktSMS" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA8mktPhone" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA9mktPost" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *         &lt;element name="DPA10allTC" type="{http://domgen.com/core/schema/1_0}DPAFlagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DPAType", propOrder = {
    "dpa1PrcDGC",
    "dpa2MktDG",
    "dpa3MktC",
    "dpa4MktDGC",
    "dpa5MktThird",
    "dpa6MktEmail",
    "dpa7MktSMS",
    "dpa8MktPhone",
    "dpa9MktPost",
    "dpa10AllTC"
})
public class DPAType {

    @XmlElement(name = "DPA1prcDGC")
    protected DPAFlagType dpa1PrcDGC;
    @XmlElement(name = "DPA2mktDG")
    protected DPAFlagType dpa2MktDG;
    @XmlElement(name = "DPA3mktC")
    protected DPAFlagType dpa3MktC;
    @XmlElement(name = "DPA4mktDGC")
    protected DPAFlagType dpa4MktDGC;
    @XmlElement(name = "DPA5mktThird")
    protected DPAFlagType dpa5MktThird;
    @XmlElement(name = "DPA6mktEmail")
    protected DPAFlagType dpa6MktEmail;
    @XmlElement(name = "DPA7mktSMS")
    protected DPAFlagType dpa7MktSMS;
    @XmlElement(name = "DPA8mktPhone")
    protected DPAFlagType dpa8MktPhone;
    @XmlElement(name = "DPA9mktPost")
    protected DPAFlagType dpa9MktPost;
    @XmlElement(name = "DPA10allTC")
    protected DPAFlagType dpa10AllTC;

    /**
     * 获取dpa1PrcDGC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA1PrcDGC() {
        return dpa1PrcDGC;
    }

    /**
     * 设置dpa1PrcDGC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA1PrcDGC(DPAFlagType value) {
        this.dpa1PrcDGC = value;
    }

    /**
     * 获取dpa2MktDG属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA2MktDG() {
        return dpa2MktDG;
    }

    /**
     * 设置dpa2MktDG属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA2MktDG(DPAFlagType value) {
        this.dpa2MktDG = value;
    }

    /**
     * 获取dpa3MktC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA3MktC() {
        return dpa3MktC;
    }

    /**
     * 设置dpa3MktC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA3MktC(DPAFlagType value) {
        this.dpa3MktC = value;
    }

    /**
     * 获取dpa4MktDGC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA4MktDGC() {
        return dpa4MktDGC;
    }

    /**
     * 设置dpa4MktDGC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA4MktDGC(DPAFlagType value) {
        this.dpa4MktDGC = value;
    }

    /**
     * 获取dpa5MktThird属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA5MktThird() {
        return dpa5MktThird;
    }

    /**
     * 设置dpa5MktThird属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA5MktThird(DPAFlagType value) {
        this.dpa5MktThird = value;
    }

    /**
     * 获取dpa6MktEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA6MktEmail() {
        return dpa6MktEmail;
    }

    /**
     * 设置dpa6MktEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA6MktEmail(DPAFlagType value) {
        this.dpa6MktEmail = value;
    }

    /**
     * 获取dpa7MktSMS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA7MktSMS() {
        return dpa7MktSMS;
    }

    /**
     * 设置dpa7MktSMS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA7MktSMS(DPAFlagType value) {
        this.dpa7MktSMS = value;
    }

    /**
     * 获取dpa8MktPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA8MktPhone() {
        return dpa8MktPhone;
    }

    /**
     * 设置dpa8MktPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA8MktPhone(DPAFlagType value) {
        this.dpa8MktPhone = value;
    }

    /**
     * 获取dpa9MktPost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA9MktPost() {
        return dpa9MktPost;
    }

    /**
     * 设置dpa9MktPost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA9MktPost(DPAFlagType value) {
        this.dpa9MktPost = value;
    }

    /**
     * 获取dpa10AllTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DPAFlagType }
     *     
     */
    public DPAFlagType getDPA10AllTC() {
        return dpa10AllTC;
    }

    /**
     * 设置dpa10AllTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DPAFlagType }
     *     
     */
    public void setDPA10AllTC(DPAFlagType value) {
        this.dpa10AllTC = value;
    }

}
