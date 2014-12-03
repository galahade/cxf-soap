
package com.domgen.core.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AgentNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BranchNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentType", propOrder = {
    "agentNumber",
    "branchNumber"
})
public class AgentType {

    @XmlElement(name = "AgentNumber", required = true)
    protected String agentNumber;
    @XmlElement(name = "BranchNumber", required = true)
    protected String branchNumber;

    /**
     * 获取agentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentNumber() {
        return agentNumber;
    }

    /**
     * 设置agentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentNumber(String value) {
        this.agentNumber = value;
    }

    /**
     * 获取branchNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * 设置branchNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNumber(String value) {
        this.branchNumber = value;
    }

}
