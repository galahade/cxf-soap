
package com.domgen.core.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ApplianceDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ApplianceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MakerCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PurchaseDate" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PurchasePrice"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ManuGuarPeriod"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}GoodsColour"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplianceDetailsType", propOrder = {
    "applianceCode",
    "makerCode",
    "purchaseDate",
    "purchasePrice",
    "manuGuarPeriod",
    "goodsColour"
})
@XmlSeeAlso({
    ApplianceRateDetailsType.class
})
public class ApplianceDetailsType {

    @XmlElement(name = "ApplianceCode", required = true)
    protected String applianceCode;
    @XmlElement(name = "MakerCode", required = true)
    protected String makerCode;
    @XmlElement(name = "PurchaseDate", nillable = true)
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "PurchasePrice", required = true)
    protected BigDecimal purchasePrice;
    @XmlElement(name = "ManuGuarPeriod", required = true)
    protected String manuGuarPeriod;
    @XmlElement(name = "GoodsColour", required = true)
    protected String goodsColour;

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
     * 获取makerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakerCode() {
        return makerCode;
    }

    /**
     * 设置makerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakerCode(String value) {
        this.makerCode = value;
    }

    /**
     * 获取purchaseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * 设置purchaseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * 获取purchasePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 设置purchasePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchasePrice(BigDecimal value) {
        this.purchasePrice = value;
    }

    /**
     * 获取manuGuarPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManuGuarPeriod() {
        return manuGuarPeriod;
    }

    /**
     * 设置manuGuarPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManuGuarPeriod(String value) {
        this.manuGuarPeriod = value;
    }

    /**
     * 获取goodsColour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsColour() {
        return goodsColour;
    }

    /**
     * 设置goodsColour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsColour(String value) {
        this.goodsColour = value;
    }

}
