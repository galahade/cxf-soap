
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ApplianceGroupDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ApplianceGroupDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MakerCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SerialNumber1"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ModelNumber1"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SerialNumber2"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ModelNumber2"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PurchaseDate"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PurchasePrice"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}IMEI"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PeriodOfCover"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ManuGuarPeriod"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}YearOfManufacture"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BreakdownStartDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplianceGroupDetailsType", propOrder = {
    "makerCode",
    "applianceCode",
    "serialNumber1",
    "modelNumber1",
    "serialNumber2",
    "modelNumber2",
    "purchaseDate",
    "purchasePrice",
    "imei",
    "periodOfCover",
    "manuGuarPeriod",
    "yearOfManufacture",
    "breakdownStartDate"
})
public class ApplianceGroupDetailsType {

    @XmlElement(name = "MakerCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String makerCode;
    @XmlElement(name = "ApplianceCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String applianceCode;
    @XmlElement(name = "SerialNumber1", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String serialNumber1;
    @XmlElement(name = "ModelNumber1", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String modelNumber1;
    @XmlElement(name = "SerialNumber2", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String serialNumber2;
    @XmlElement(name = "ModelNumber2", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String modelNumber2;
    @XmlElement(name = "PurchaseDate", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "PurchasePrice", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected BigDecimal purchasePrice;
    @XmlElement(name = "IMEI", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String imei;
    @XmlElement(name = "PeriodOfCover", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String periodOfCover;
    @XmlElement(name = "ManuGuarPeriod", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String manuGuarPeriod;
    @XmlElement(name = "YearOfManufacture", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String yearOfManufacture;
    @XmlElement(name = "BreakdownStartDate", namespace = "http://domgen.com/core/schema/1_0", nillable = true)
    protected XMLGregorianCalendar breakdownStartDate;

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
     * 获取serialNumber1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber1() {
        return serialNumber1;
    }

    /**
     * 设置serialNumber1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber1(String value) {
        this.serialNumber1 = value;
    }

    /**
     * 获取modelNumber1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber1() {
        return modelNumber1;
    }

    /**
     * 设置modelNumber1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber1(String value) {
        this.modelNumber1 = value;
    }

    /**
     * 获取serialNumber2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber2() {
        return serialNumber2;
    }

    /**
     * 设置serialNumber2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber2(String value) {
        this.serialNumber2 = value;
    }

    /**
     * 获取modelNumber2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber2() {
        return modelNumber2;
    }

    /**
     * 设置modelNumber2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber2(String value) {
        this.modelNumber2 = value;
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
     * 获取imei属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * 设置imei属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * 获取periodOfCover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodOfCover() {
        return periodOfCover;
    }

    /**
     * 设置periodOfCover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodOfCover(String value) {
        this.periodOfCover = value;
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
     * 获取yearOfManufacture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * 设置yearOfManufacture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfManufacture(String value) {
        this.yearOfManufacture = value;
    }

    /**
     * 获取breakdownStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBreakdownStartDate() {
        return breakdownStartDate;
    }

    /**
     * 设置breakdownStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBreakdownStartDate(XMLGregorianCalendar value) {
        this.breakdownStartDate = value;
    }

}
