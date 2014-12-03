
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPlanRateResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡddFee���Ե�ֵ��
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
     * ����ddFee���Ե�ֵ��
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
     * ��ȡlumpSum���Ե�ֵ��
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
     * ����lumpSum���Ե�ֵ��
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
     * ��ȡerrorResponseList���Ե�ֵ��
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
     * ����errorResponseList���Ե�ֵ��
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
