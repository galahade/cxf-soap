
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetRatesByCallSourceResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetRatesByCallSourceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}RateList" minOccurs="0"/>
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
@XmlType(name = "GetRatesByCallSourceResponse", propOrder = {
    "rateList",
    "errorResponseList"
})
public class GetRatesByCallSourceResponse {

    @XmlElement(name = "RateList")
    protected RateList rateList;
    @XmlElement(name = "ErrorResponseList")
    protected ErrorResponseList errorResponseList;

    /**
     * ��ȡrateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RateList }
     *     
     */
    public RateList getRateList() {
        return rateList;
    }

    /**
     * ����rateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RateList }
     *     
     */
    public void setRateList(RateList value) {
        this.rateList = value;
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
