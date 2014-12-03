
package com.domgen.core.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ApplianceDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgoodsColour���Ե�ֵ��
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
     * ����goodsColour���Ե�ֵ��
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
