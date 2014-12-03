
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ApplianceGroupDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmakerCode���Ե�ֵ��
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
     * ����makerCode���Ե�ֵ��
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
     * ��ȡapplianceCode���Ե�ֵ��
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
     * ����applianceCode���Ե�ֵ��
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
     * ��ȡserialNumber1���Ե�ֵ��
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
     * ����serialNumber1���Ե�ֵ��
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
     * ��ȡmodelNumber1���Ե�ֵ��
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
     * ����modelNumber1���Ե�ֵ��
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
     * ��ȡserialNumber2���Ե�ֵ��
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
     * ����serialNumber2���Ե�ֵ��
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
     * ��ȡmodelNumber2���Ե�ֵ��
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
     * ����modelNumber2���Ե�ֵ��
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
     * ��ȡpurchaseDate���Ե�ֵ��
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
     * ����purchaseDate���Ե�ֵ��
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
     * ��ȡpurchasePrice���Ե�ֵ��
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
     * ����purchasePrice���Ե�ֵ��
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
     * ��ȡimei���Ե�ֵ��
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
     * ����imei���Ե�ֵ��
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
     * ��ȡperiodOfCover���Ե�ֵ��
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
     * ����periodOfCover���Ե�ֵ��
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
     * ��ȡmanuGuarPeriod���Ե�ֵ��
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
     * ����manuGuarPeriod���Ե�ֵ��
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
     * ��ȡyearOfManufacture���Ե�ֵ��
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
     * ����yearOfManufacture���Ե�ֵ��
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
     * ��ȡbreakdownStartDate���Ե�ֵ��
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
     * ����breakdownStartDate���Ե�ֵ��
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
