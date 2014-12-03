
package com.domgen.plan.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.domgen.core.schema._1_0.ClientDetailsType;


/**
 * <p>CreatePlanRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡclientDetails���Ե�ֵ��
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
     * ����clientDetails���Ե�ֵ��
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
     * ��ȡhouseholdToken���Ե�ֵ��
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
     * ����householdToken���Ե�ֵ��
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
     * ��ȡcompanyCode���Ե�ֵ��
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
     * ����companyCode���Ե�ֵ��
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
     * ��ȡschemeCode���Ե�ֵ��
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
     * ����schemeCode���Ե�ֵ��
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
     * ��ȡfee���Ե�ֵ��
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
     * ����fee���Ե�ֵ��
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
     * ��ȡfsaMessageType���Ե�ֵ��
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
     * ����fsaMessageType���Ե�ֵ��
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
     * ��ȡadditionalMessageText���Ե�ֵ��
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
     * ����additionalMessageText���Ե�ֵ��
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
     * ��ȡclientReferenceNumber���Ե�ֵ��
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
     * ����clientReferenceNumber���Ե�ֵ��
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
     * ��ȡagentNumber���Ե�ֵ��
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
     * ����agentNumber���Ե�ֵ��
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
     * ��ȡbranchNumber���Ե�ֵ��
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
     * ����branchNumber���Ե�ֵ��
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
     * ��ȡpaymentType���Ե�ֵ��
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
     * ����paymentType���Ե�ֵ��
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
     * ��ȡpaymentProfile���Ե�ֵ��
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
     * ����paymentProfile���Ե�ֵ��
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
     * ��ȡdirectDebit���Ե�ֵ��
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
     * ����directDebit���Ե�ֵ��
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
     * ��ȡcreditCard���Ե�ֵ��
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
     * ����creditCard���Ե�ֵ��
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
     * ��ȡglobalGatewayReference���Ե�ֵ��
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
     * ����globalGatewayReference���Ե�ֵ��
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
     * ��ȡcashReference���Ե�ֵ��
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
     * ����cashReference���Ե�ֵ��
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
     * ��ȡsendMethod���Ե�ֵ��
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
     * ����sendMethod���Ե�ֵ��
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
     * ��ȡplanToCancel���Ե�ֵ��
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
     * ����planToCancel���Ե�ֵ��
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
     * ��ȡmultiplanApplianceCode���Ե�ֵ��
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
     * ����multiplanApplianceCode���Ե�ֵ��
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
     * ��ȡmultiplanSize���Ե�ֵ��
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
     * ����multiplanSize���Ե�ֵ��
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
     * ��ȡapplianceGroupWithContactType���Ե�ֵ��
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
     * ����applianceGroupWithContactType���Ե�ֵ��
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
     * ��ȡcustomerToken���Ե�ֵ��
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
     * ����customerToken���Ե�ֵ��
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
     * ��ȡaddressContact���Ե�ֵ��
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
     * ����addressContact���Ե�ֵ��
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
