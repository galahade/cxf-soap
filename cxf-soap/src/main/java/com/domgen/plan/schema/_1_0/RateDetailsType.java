
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RateDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallSourceDetails" type="{http://domgen.com/plan/schema/1_0}CallSourceDetailsType"/>
 *         &lt;element name="OfferDetails" type="{http://domgen.com/plan/schema/1_0}OfferDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDetailsType", propOrder = {
    "callSourceDetails",
    "offerDetails"
})
public class RateDetailsType {

    @XmlElement(name = "CallSourceDetails", required = true)
    protected CallSourceDetailsType callSourceDetails;
    @XmlElement(name = "OfferDetails", required = true)
    protected OfferDetailsType offerDetails;

    /**
     * ��ȡcallSourceDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CallSourceDetailsType }
     *     
     */
    public CallSourceDetailsType getCallSourceDetails() {
        return callSourceDetails;
    }

    /**
     * ����callSourceDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CallSourceDetailsType }
     *     
     */
    public void setCallSourceDetails(CallSourceDetailsType value) {
        this.callSourceDetails = value;
    }

    /**
     * ��ȡofferDetails���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailsType }
     *     
     */
    public OfferDetailsType getOfferDetails() {
        return offerDetails;
    }

    /**
     * ����offerDetails���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailsType }
     *     
     */
    public void setOfferDetails(OfferDetailsType value) {
        this.offerDetails = value;
    }

}
