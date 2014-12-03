
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPlanRateResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetPlanRateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}DDFee"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}LumpSum"/>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}ErrorResponseList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPlanRateResponse", propOrder = {
    "ddFee",
    "lumpSum",
    "errorResponseList"
})
public class GetPlanRateResponse {

    @XmlElement(name = "DDFee", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal ddFee;
    @XmlElement(name = "LumpSum", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal lumpSum;
    @XmlElement(name = "ErrorResponseList")
    protected ErrorResponseList errorResponseList;

    /**
     * 获取ddFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDDFee() {
        return ddFee;
    }

    /**
     * 设置ddFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDDFee(BigDecimal value) {
        this.ddFee = value;
    }

    /**
     * 获取lumpSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLumpSum() {
        return lumpSum;
    }

    /**
     * 设置lumpSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLumpSum(BigDecimal value) {
        this.lumpSum = value;
    }

    /**
     * 获取errorResponseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseList }
     *     
     */
    public ErrorResponseList getErrorResponseList() {
        return errorResponseList;
    }

    /**
     * 设置errorResponseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseList }
     *     
     */
    public void setErrorResponseList(ErrorResponseList value) {
        this.errorResponseList = value;
    }

}
