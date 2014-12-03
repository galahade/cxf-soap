
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>CreatePlanRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreatePlanRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientDetails" type="{http://domgen.com/core/schema/1_0}ClientDetailsType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}HouseholdToken"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CompanyCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SchemeCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}Fee"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}FSAMessageType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AdditionalMessageText"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}ClientReferenceNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}AgentNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}BranchNumber"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}PaymentProfile"/>
 *         &lt;element name="DirectDebit" type="{http://domgen.com/plan/schema/1_0}DirectDebitType" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{http://domgen.com/plan/schema/1_0}CreditCardType" minOccurs="0"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}GlobalGatewayReference"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}CashReference"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}SendMethod"/>
 *         &lt;element name="PlanToCancel" type="{http://domgen.com/plan/schema/1_0}PlanToCancelDetailsType"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MultiplanApplianceCode"/>
 *         &lt;element ref="{http://domgen.com/core/schema/1_0}MultiplanSize"/>
 *         &lt;element ref="{http://domgen.com/plan/schema/1_0}ApplianceGroupWithContactType"/>
 *         &lt;choice>
 *           &lt;element ref="{http://domgen.com/core/schema/1_0}CustomerToken"/>
 *           &lt;element name="AddressContact" type="{http://domgen.com/plan/schema/1_0}ContactDetailsType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePlanRequest", propOrder = {
    "clientDetails",
    "householdToken",
    "companyCode",
    "schemeCode",
    "fee",
    "fsaMessageType",
    "additionalMessageText",
    "clientReferenceNumber",
    "agentNumber",
    "branchNumber",
    "paymentType",
    "paymentProfile",
    "directDebit",
    "creditCard",
    "globalGatewayReference",
    "cashReference",
    "sendMethod",
    "planToCancel",
    "multiplanApplianceCode",
    "multiplanSize",
    "applianceGroupWithContactType",
    "customerToken",
    "addressContact"
})
public class CreatePlanRequest {

    @XmlElement(name = "ClientDetails", required = true)
    protected ClientDetailsType clientDetails;
    @XmlElement(name = "HouseholdToken", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String householdToken;
    @XmlElement(name = "CompanyCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String companyCode;
    @XmlElement(name = "SchemeCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String schemeCode;
    @XmlElement(name = "Fee", namespace = "http://domgen.com/core/schema/1_0", required = true, nillable = true)
    protected BigDecimal fee;
    @XmlElement(name = "FSAMessageType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String fsaMessageType;
    @XmlElement(name = "AdditionalMessageText", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String additionalMessageText;
    @XmlElement(name = "ClientReferenceNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String clientReferenceNumber;
    @XmlElement(name = "AgentNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String agentNumber;
    @XmlElement(name = "BranchNumber", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String branchNumber;
    @XmlElement(name = "PaymentType", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String paymentType;
    @XmlElement(name = "PaymentProfile", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String paymentProfile;
    @XmlElement(name = "DirectDebit")
    protected DirectDebitType directDebit;
    @XmlElement(name = "CreditCard")
    protected CreditCardType creditCard;
    @XmlElement(name = "GlobalGatewayReference", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String globalGatewayReference;
    @XmlElement(name = "CashReference", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String cashReference;
    @XmlElement(name = "SendMethod", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String sendMethod;
    @XmlElement(name = "PlanToCancel", required = true)
    protected PlanToCancelDetailsType planToCancel;
    @XmlElement(name = "MultiplanApplianceCode", namespace = "http://domgen.com/core/schema/1_0", required = true)
    protected String multiplanApplianceCode;
    @XmlElement(name = "MultiplanSize", namespace = "http://domgen.com/core/schema/1_0", required = true, type = Integer.class, nillable = true)
    protected Integer multiplanSize;
    @XmlElement(name = "ApplianceGroupWithContactType", required = true)
    protected ApplianceGroupWithContactType applianceGroupWithContactType;
    @XmlElement(name = "CustomerToken", namespace = "http://domgen.com/core/schema/1_0")
    protected String customerToken;
    @XmlElement(name = "AddressContact")
    protected ContactDetailsType addressContact;

    /**
     * 获取clientDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientDetailsType }
     *     
     */
    public ClientDetailsType getClientDetails() {
        return clientDetails;
    }

    /**
     * 设置clientDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetailsType }
     *     
     */
    public void setClientDetails(ClientDetailsType value) {
        this.clientDetails = value;
    }

    /**
     * 获取householdToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdToken() {
        return householdToken;
    }

    /**
     * 设置householdToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdToken(String value) {
        this.householdToken = value;
    }

    /**
     * 获取companyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置companyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * 获取schemeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * 设置schemeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCode(String value) {
        this.schemeCode = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * 获取fsaMessageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSAMessageType() {
        return fsaMessageType;
    }

    /**
     * 设置fsaMessageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSAMessageType(String value) {
        this.fsaMessageType = value;
    }

    /**
     * 获取additionalMessageText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalMessageText() {
        return additionalMessageText;
    }

    /**
     * 设置additionalMessageText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalMessageText(String value) {
        this.additionalMessageText = value;
    }

    /**
     * 获取clientReferenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * 设置clientReferenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReferenceNumber(String value) {
        this.clientReferenceNumber = value;
    }

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

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * 获取paymentProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * 设置paymentProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProfile(String value) {
        this.paymentProfile = value;
    }

    /**
     * 获取directDebit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitType }
     *     
     */
    public DirectDebitType getDirectDebit() {
        return directDebit;
    }

    /**
     * 设置directDebit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitType }
     *     
     */
    public void setDirectDebit(DirectDebitType value) {
        this.directDebit = value;
    }

    /**
     * 获取creditCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * 设置creditCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * 获取globalGatewayReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalGatewayReference() {
        return globalGatewayReference;
    }

    /**
     * 设置globalGatewayReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalGatewayReference(String value) {
        this.globalGatewayReference = value;
    }

    /**
     * 获取cashReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashReference() {
        return cashReference;
    }

    /**
     * 设置cashReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashReference(String value) {
        this.cashReference = value;
    }

    /**
     * 获取sendMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMethod() {
        return sendMethod;
    }

    /**
     * 设置sendMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMethod(String value) {
        this.sendMethod = value;
    }

    /**
     * 获取planToCancel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanToCancelDetailsType }
     *     
     */
    public PlanToCancelDetailsType getPlanToCancel() {
        return planToCancel;
    }

    /**
     * 设置planToCancel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanToCancelDetailsType }
     *     
     */
    public void setPlanToCancel(PlanToCancelDetailsType value) {
        this.planToCancel = value;
    }

    /**
     * 获取multiplanApplianceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplanApplianceCode() {
        return multiplanApplianceCode;
    }

    /**
     * 设置multiplanApplianceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplanApplianceCode(String value) {
        this.multiplanApplianceCode = value;
    }

    /**
     * 获取multiplanSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiplanSize() {
        return multiplanSize;
    }

    /**
     * 设置multiplanSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiplanSize(Integer value) {
        this.multiplanSize = value;
    }

    /**
     * 获取applianceGroupWithContactType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApplianceGroupWithContactType }
     *     
     */
    public ApplianceGroupWithContactType getApplianceGroupWithContactType() {
        return applianceGroupWithContactType;
    }

    /**
     * 设置applianceGroupWithContactType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApplianceGroupWithContactType }
     *     
     */
    public void setApplianceGroupWithContactType(ApplianceGroupWithContactType value) {
        this.applianceGroupWithContactType = value;
    }

    /**
     * 获取customerToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerToken() {
        return customerToken;
    }

    /**
     * 设置customerToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerToken(String value) {
        this.customerToken = value;
    }

    /**
     * 获取addressContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailsType }
     *     
     */
    public ContactDetailsType getAddressContact() {
        return addressContact;
    }

    /**
     * 设置addressContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailsType }
     *     
     */
    public void setAddressContact(ContactDetailsType value) {
        this.addressContact = value;
    }

}
