
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreatePlanResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreatePlanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}PlanList" minOccurs="0"/>
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
@XmlType(name = "CreatePlanResponse", propOrder = {
    "planList",
    "errorResponseList"
})
public class CreatePlanResponse {

    @XmlElement(name = "PlanList")
    protected PlanList planList;
    @XmlElement(name = "ErrorResponseList")
    protected ErrorResponseList errorResponseList;

    /**
     * 获取planList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanList }
     *     
     */
    public PlanList getPlanList() {
        return planList;
    }

    /**
     * 设置planList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanList }
     *     
     */
    public void setPlanList(PlanList value) {
        this.planList = value;
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
