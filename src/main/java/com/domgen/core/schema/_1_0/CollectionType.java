
package com.domgen.core.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CollectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CollectionNo"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CollectionDate"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CollectionAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionType", propOrder = {
    "collectionNo",
    "collectionDate",
    "collectionAmount"
})
public class CollectionType {

    @XmlElement(name = "CollectionNo", required = true, type = Integer.class, nillable = true)
    protected Integer collectionNo;
    @XmlElement(name = "CollectionDate", required = true, nillable = true)
    protected XMLGregorianCalendar collectionDate;
    @XmlElement(name = "CollectionAmount", required = true, nillable = true)
    protected BigDecimal collectionAmount;

    /**
     * 获取collectionNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollectionNo() {
        return collectionNo;
    }

    /**
     * 设置collectionNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollectionNo(Integer value) {
        this.collectionNo = value;
    }

    /**
     * 获取collectionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionDate() {
        return collectionDate;
    }

    /**
     * 设置collectionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionDate(XMLGregorianCalendar value) {
        this.collectionDate = value;
    }

    /**
     * 获取collectionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectionAmount() {
        return collectionAmount;
    }

    /**
     * 设置collectionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectionAmount(BigDecimal value) {
        this.collectionAmount = value;
    }

}
