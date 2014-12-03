
package com.domgen.plan.schema._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability" type="{http://domgen.com/plan/schema/1_0}DisabilityDetailsType" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disability"
})
@XmlRootElement(name = "DisabilityList")
public class DisabilityList {

    @XmlElement(name = "Disability", required = true)
    protected List<DisabilityDetailsType> disability;

    /**
     * Gets the value of the disability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilityDetailsType }
     * 
     * 
     */
    public List<DisabilityDetailsType> getDisability() {
        if (disability == null) {
            disability = new ArrayList<DisabilityDetailsType>();
        }
        return this.disability;
    }

}
