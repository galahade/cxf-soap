
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flag to identify DPA preference
 * 
 * <p>DPAFlagType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DPAFlagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}DPA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DPAFlagType", propOrder = {
    "dpa"
})
public class DPAFlagType {

    @XmlElement(name = "DPA", required = true)
    protected String dpa;

    /**
     * 获取dpa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPA() {
        return dpa;
    }

    /**
     * 设置dpa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPA(String value) {
        this.dpa = value;
    }

}
