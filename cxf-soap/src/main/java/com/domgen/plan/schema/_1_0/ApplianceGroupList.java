
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
 *         &lt;element name="Appliance" type="{http://domgen.com/plan/schema/1_0}ApplianceGroupDetailsType" maxOccurs="unbounded"/>
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
    "appliance"
})
@XmlRootElement(name = "ApplianceGroupList")
public class ApplianceGroupList {

    @XmlElement(name = "Appliance", required = true)
    protected List<ApplianceGroupDetailsType> appliance;

    /**
     * Gets the value of the appliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplianceGroupDetailsType }
     * 
     * 
     */
    public List<ApplianceGroupDetailsType> getAppliance() {
        if (appliance == null) {
            appliance = new ArrayList<ApplianceGroupDetailsType>();
        }
        return this.appliance;
    }

}
