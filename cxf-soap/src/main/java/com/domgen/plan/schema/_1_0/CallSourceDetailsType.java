
package com.domgen.plan.schema._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.AgentType;
import com.domgen.core.schema._1_0.SchemeType;


/**
 * <p>CallSourceDetailsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CallSourceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CallSource"/>
 *         &lt;element name="Scheme" type="{http://domgen.com/core/schema/1_0}SchemeType"/>
 *         &lt;element name="Agent" type="{http://domgen.com/core/schema/1_0}AgentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PriceBand"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}NumberOfAppliances"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CoverType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallSourceDetailsType", propOrder = {
    "callSource",
    "scheme",
    "agent",
    "applianceCode",
    "priceBand",
    "numberOfAppliances",
    "coverType"
})
public class CallSourceDetailsType {

    @XmlElement(name = "CallSource", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String callSource;
    @XmlElement(name = "Scheme", required = true)
    protected SchemeType scheme;
    @XmlElement(name = "Agent", required = true)
    protected AgentType agent;
    @XmlElement(name = "ApplianceCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String applianceCode;
    @XmlElement(name = "PriceBand", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String priceBand;
    @XmlElement(name = "NumberOfAppliances", namespace = "http://domgen.com/core/schema/1_0")
    protected int numberOfAppliances;
    @XmlElement(name = "CoverType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String coverType;

    /**
     * ��ȡcallSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSource() {
        return callSource;
    }

    /**
     * ����callSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSource(String value) {
        this.callSource = value;
    }

    /**
     * ��ȡscheme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SchemeType }
     *     
     */
    public SchemeType getScheme() {
        return scheme;
    }

    /**
     * ����scheme���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeType }
     *     
     */
    public void setScheme(SchemeType value) {
        this.scheme = value;
    }

    /**
     * ��ȡagent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getAgent() {
        return agent;
    }

    /**
     * ����agent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setAgent(AgentType value) {
        this.agent = value;
    }

    /**
     * ��ȡapplianceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceCode() {
        return applianceCode;
    }

    /**
     * ����applianceCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceCode(String value) {
        this.applianceCode = value;
    }

    /**
     * ��ȡpriceBand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBand() {
        return priceBand;
    }

    /**
     * ����priceBand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBand(String value) {
        this.priceBand = value;
    }

    /**
     * ��ȡnumberOfAppliances���Ե�ֵ��
     * 
     */
    public int getNumberOfAppliances() {
        return numberOfAppliances;
    }

    /**
     * ����numberOfAppliances���Ե�ֵ��
     * 
     */
    public void setNumberOfAppliances(int value) {
        this.numberOfAppliances = value;
    }

    /**
     * ��ȡcoverType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverType() {
        return coverType;
    }

    /**
     * ����coverType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverType(String value) {
        this.coverType = value;
    }

}
