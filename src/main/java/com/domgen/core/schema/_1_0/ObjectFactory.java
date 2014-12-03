
package com.domgen.core.schema._1_0;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.domgen.core.schema._1_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Channel_QNAME = new QName("http://domgen.com/core/schema/1_0", "Channel");
    private final static QName _CompanyCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "CompanyCode");
    private final static QName _BranchNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "BranchNumber");
    private final static QName _ApplianceFamilyCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ApplianceFamilyCode");
    private final static QName _CoverType_QNAME = new QName("http://domgen.com/core/schema/1_0", "CoverType");
    private final static QName _AdditionalMessageText_QNAME = new QName("http://domgen.com/core/schema/1_0", "AdditionalMessageText");
    private final static QName _PreferredPaymentFlag_QNAME = new QName("http://domgen.com/core/schema/1_0", "PreferredPaymentFlag");
    private final static QName _CreditCardType_QNAME = new QName("http://domgen.com/core/schema/1_0", "CreditCardType");
    private final static QName _PaymentProfile_QNAME = new QName("http://domgen.com/core/schema/1_0", "PaymentProfile");
    private final static QName _EmailAddress_QNAME = new QName("http://domgen.com/core/schema/1_0", "EmailAddress");
    private final static QName _SinglePaymentDay_QNAME = new QName("http://domgen.com/core/schema/1_0", "SinglePaymentDay");
    private final static QName _ApplianceFamilyDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "ApplianceFamilyDescription");
    private final static QName _LumpSum_QNAME = new QName("http://domgen.com/core/schema/1_0", "LumpSum");
    private final static QName _CostPerMonth_QNAME = new QName("http://domgen.com/core/schema/1_0", "CostPerMonth");
    private final static QName _PurchasePrice_QNAME = new QName("http://domgen.com/core/schema/1_0", "PurchasePrice");
    private final static QName _PaymentFrequency_QNAME = new QName("http://domgen.com/core/schema/1_0", "PaymentFrequency");
    private final static QName _GlobalGatewayReference_QNAME = new QName("http://domgen.com/core/schema/1_0", "GlobalGatewayReference");
    private final static QName _InstalmentPremium_QNAME = new QName("http://domgen.com/core/schema/1_0", "InstalmentPremium");
    private final static QName _Premium_QNAME = new QName("http://domgen.com/core/schema/1_0", "Premium");
    private final static QName _Country_QNAME = new QName("http://domgen.com/core/schema/1_0", "Country");
    private final static QName _BoilerType_QNAME = new QName("http://domgen.com/core/schema/1_0", "BoilerType");
    private final static QName _DateOfBirth_QNAME = new QName("http://domgen.com/core/schema/1_0", "DateOfBirth");
    private final static QName _ExpiryDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "ExpiryDate");
    private final static QName _SerialNumber2_QNAME = new QName("http://domgen.com/core/schema/1_0", "SerialNumber2");
    private final static QName _SerialNumber1_QNAME = new QName("http://domgen.com/core/schema/1_0", "SerialNumber1");
    private final static QName _ClientMakerCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientMakerCode");
    private final static QName _AddressLine4_QNAME = new QName("http://domgen.com/core/schema/1_0", "AddressLine4");
    private final static QName _NoMarketingLiterature_QNAME = new QName("http://domgen.com/core/schema/1_0", "NoMarketingLiterature");
    private final static QName _WaitPeriod_QNAME = new QName("http://domgen.com/core/schema/1_0", "WaitPeriod");
    private final static QName _AddressLine1_QNAME = new QName("http://domgen.com/core/schema/1_0", "AddressLine1");
    private final static QName _ClientApplianceDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientApplianceDescription");
    private final static QName _ErrorCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ErrorCode");
    private final static QName _AddressLine3_QNAME = new QName("http://domgen.com/core/schema/1_0", "AddressLine3");
    private final static QName _AddressLine2_QNAME = new QName("http://domgen.com/core/schema/1_0", "AddressLine2");
    private final static QName _Branch_QNAME = new QName("http://domgen.com/core/schema/1_0", "Branch");
    private final static QName _ThisPayType_QNAME = new QName("http://domgen.com/core/schema/1_0", "ThisPayType");
    private final static QName _DDFee_QNAME = new QName("http://domgen.com/core/schema/1_0", "DDFee");
    private final static QName _SwitchIssueNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "SwitchIssueNumber");
    private final static QName _Telephone_QNAME = new QName("http://domgen.com/core/schema/1_0", "Telephone");
    private final static QName _ReprintFlagEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "ReprintFlagEnum");
    private final static QName _Password_QNAME = new QName("http://domgen.com/core/schema/1_0", "Password");
    private final static QName _UniqueProductIdentifier_QNAME = new QName("http://domgen.com/core/schema/1_0", "UniqueProductIdentifier");
    private final static QName _Disability_QNAME = new QName("http://domgen.com/core/schema/1_0", "Disability");
    private final static QName _ExternalRefNo_QNAME = new QName("http://domgen.com/core/schema/1_0", "ExternalRefNo");
    private final static QName _ClientReferenceNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientReferenceNumber");
    private final static QName _GoodsColour_QNAME = new QName("http://domgen.com/core/schema/1_0", "GoodsColour");
    private final static QName _AccountCheckDigit_QNAME = new QName("http://domgen.com/core/schema/1_0", "AccountCheckDigit");
    private final static QName _BankSortCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "BankSortCode");
    private final static QName _MultiplanApplianceCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "MultiplanApplianceCode");
    private final static QName _AgentNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "AgentNumber");
    private final static QName _OperationEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "OperationEnum");
    private final static QName _FirstName_QNAME = new QName("http://domgen.com/core/schema/1_0", "FirstName");
    private final static QName _BreakdownStartDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "BreakdownStartDate");
    private final static QName _CashPaymentType_QNAME = new QName("http://domgen.com/core/schema/1_0", "CashPaymentType");
    private final static QName _WicType_QNAME = new QName("http://domgen.com/core/schema/1_0", "WicType");
    private final static QName _Client_QNAME = new QName("http://domgen.com/core/schema/1_0", "Client");
    private final static QName _CardNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "CardNumber");
    private final static QName _Message_QNAME = new QName("http://domgen.com/core/schema/1_0", "Message");
    private final static QName _LatePaymentWarning_QNAME = new QName("http://domgen.com/core/schema/1_0", "LatePaymentWarning");
    private final static QName _SystemName_QNAME = new QName("http://domgen.com/core/schema/1_0", "SystemName");
    private final static QName _ContactName_QNAME = new QName("http://domgen.com/core/schema/1_0", "ContactName");
    private final static QName _Fee_QNAME = new QName("http://domgen.com/core/schema/1_0", "Fee");
    private final static QName _TelephoneTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "TelephoneTypeEnum");
    private final static QName _Title_QNAME = new QName("http://domgen.com/core/schema/1_0", "Title");
    private final static QName _FSAMessageType_QNAME = new QName("http://domgen.com/core/schema/1_0", "FSAMessageType");
    private final static QName _Bollettino_QNAME = new QName("http://domgen.com/core/schema/1_0", "Bollettino");
    private final static QName _FirstPayment_QNAME = new QName("http://domgen.com/core/schema/1_0", "FirstPayment");
    private final static QName _PriceBand_QNAME = new QName("http://domgen.com/core/schema/1_0", "PriceBand");
    private final static QName _ReferenceNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "ReferenceNumber");
    private final static QName _PostCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "PostCode");
    private final static QName _SchemeCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "SchemeCode");
    private final static QName _CollectionNo_QNAME = new QName("http://domgen.com/core/schema/1_0", "CollectionNo");
    private final static QName _ApplianceCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ApplianceCode");
    private final static QName _MessageText_QNAME = new QName("http://domgen.com/core/schema/1_0", "MessageText");
    private final static QName _MultiplanFlagEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "MultiplanFlagEnum");
    private final static QName _NameOnCard_QNAME = new QName("http://domgen.com/core/schema/1_0", "NameOnCard");
    private final static QName _WorkTelephone_QNAME = new QName("http://domgen.com/core/schema/1_0", "WorkTelephone");
    private final static QName _SequenceNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "SequenceNumber");
    private final static QName _EligibilityFlagEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "EligibilityFlagEnum");
    private final static QName _PaymentProfileDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "PaymentProfileDescription");
    private final static QName _OfferStatusEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "OfferStatusEnum");
    private final static QName _PurchaseDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "PurchaseDate");
    private final static QName _AcceptanceDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "AcceptanceDate");
    private final static QName _CheckDigit_QNAME = new QName("http://domgen.com/core/schema/1_0", "CheckDigit");
    private final static QName _CostPerDay_QNAME = new QName("http://domgen.com/core/schema/1_0", "CostPerDay");
    private final static QName _CollectionAmount_QNAME = new QName("http://domgen.com/core/schema/1_0", "CollectionAmount");
    private final static QName _MakerCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "MakerCode");
    private final static QName _CallSource_QNAME = new QName("http://domgen.com/core/schema/1_0", "CallSource");
    private final static QName _ModelNumber2_QNAME = new QName("http://domgen.com/core/schema/1_0", "ModelNumber2");
    private final static QName _CreditCardNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "CreditCardNumber");
    private final static QName _DPA_QNAME = new QName("http://domgen.com/core/schema/1_0", "DPA");
    private final static QName _ContactTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "ContactTypeEnum");
    private final static QName _AccountNumber_QNAME = new QName("http://domgen.com/core/schema/1_0", "AccountNumber");
    private final static QName _ClientLocation_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientLocation");
    private final static QName _SinglePaymentFlagEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "SinglePaymentFlagEnum");
    private final static QName _ReferenceTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "ReferenceTypeEnum");
    private final static QName _NationalIdentifier_QNAME = new QName("http://domgen.com/core/schema/1_0", "NationalIdentifier");
    private final static QName _IBAN_QNAME = new QName("http://domgen.com/core/schema/1_0", "IBAN");
    private final static QName _ClientApplianceCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientApplianceCode");
    private final static QName _MultiplanType_QNAME = new QName("http://domgen.com/core/schema/1_0", "MultiplanType");
    private final static QName _PaymentType_QNAME = new QName("http://domgen.com/core/schema/1_0", "PaymentType");
    private final static QName _HouseholdToken_QNAME = new QName("http://domgen.com/core/schema/1_0", "HouseholdToken");
    private final static QName _StatusDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "StatusDescription");
    private final static QName _Gender_QNAME = new QName("http://domgen.com/core/schema/1_0", "Gender");
    private final static QName _YearOfManufacture_QNAME = new QName("http://domgen.com/core/schema/1_0", "YearOfManufacture");
    private final static QName _MessageTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "MessageTypeEnum");
    private final static QName _MultiplanWarrantyType_QNAME = new QName("http://domgen.com/core/schema/1_0", "MultiplanWarrantyType");
    private final static QName _BIC_QNAME = new QName("http://domgen.com/core/schema/1_0", "BIC");
    private final static QName _SendMethod_QNAME = new QName("http://domgen.com/core/schema/1_0", "SendMethod");
    private final static QName _BusinessTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "BusinessTypeEnum");
    private final static QName _NumberOfPayments_QNAME = new QName("http://domgen.com/core/schema/1_0", "NumberOfPayments");
    private final static QName _Type_QNAME = new QName("http://domgen.com/core/schema/1_0", "Type");
    private final static QName _MaxReturn_QNAME = new QName("http://domgen.com/core/schema/1_0", "MaxReturn");
    private final static QName _EligibilityFlag_QNAME = new QName("http://domgen.com/core/schema/1_0", "EligibilityFlag");
    private final static QName _CashReference_QNAME = new QName("http://domgen.com/core/schema/1_0", "CashReference");
    private final static QName _HomeTelephone_QNAME = new QName("http://domgen.com/core/schema/1_0", "HomeTelephone");
    private final static QName _NominatedPaymentDay_QNAME = new QName("http://domgen.com/core/schema/1_0", "NominatedPaymentDay");
    private final static QName _ExcessAmount_QNAME = new QName("http://domgen.com/core/schema/1_0", "ExcessAmount");
    private final static QName _LanguageCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "LanguageCode");
    private final static QName _MobileTelephone_QNAME = new QName("http://domgen.com/core/schema/1_0", "MobileTelephone");
    private final static QName _PeriodOfCover_QNAME = new QName("http://domgen.com/core/schema/1_0", "PeriodOfCover");
    private final static QName _BankCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "BankCode");
    private final static QName _MultiplanSize_QNAME = new QName("http://domgen.com/core/schema/1_0", "MultiplanSize");
    private final static QName _ModelNumber1_QNAME = new QName("http://domgen.com/core/schema/1_0", "ModelNumber1");
    private final static QName _CCFee_QNAME = new QName("http://domgen.com/core/schema/1_0", "CCFee");
    private final static QName _AllowCustomer_QNAME = new QName("http://domgen.com/core/schema/1_0", "AllowCustomer");
    private final static QName _CreditCardSecurityCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "CreditCardSecurityCode");
    private final static QName _ResponseDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "ResponseDescription");
    private final static QName _SchemeDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "SchemeDescription");
    private final static QName _NumberOfAppliances_QNAME = new QName("http://domgen.com/core/schema/1_0", "NumberOfAppliances");
    private final static QName _CustomerToken_QNAME = new QName("http://domgen.com/core/schema/1_0", "CustomerToken");
    private final static QName _MakerDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "MakerDescription");
    private final static QName _PlanTypeEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "PlanTypeEnum");
    private final static QName _Bank_QNAME = new QName("http://domgen.com/core/schema/1_0", "Bank");
    private final static QName _IsBundle_QNAME = new QName("http://domgen.com/core/schema/1_0", "IsBundle");
    private final static QName _ResponseCode_QNAME = new QName("http://domgen.com/core/schema/1_0", "ResponseCode");
    private final static QName _MonthsBetweenPayments_QNAME = new QName("http://domgen.com/core/schema/1_0", "MonthsBetweenPayments");
    private final static QName _SubsequentPayment_QNAME = new QName("http://domgen.com/core/schema/1_0", "SubsequentPayment");
    private final static QName _CreditCardExpiryDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "CreditCardExpiryDate");
    private final static QName _ProtectMessage_QNAME = new QName("http://domgen.com/core/schema/1_0", "ProtectMessage");
    private final static QName _Status_QNAME = new QName("http://domgen.com/core/schema/1_0", "Status");
    private final static QName _StatusEnum_QNAME = new QName("http://domgen.com/core/schema/1_0", "StatusEnum");
    private final static QName _ManuGuarPeriod_QNAME = new QName("http://domgen.com/core/schema/1_0", "ManuGuarPeriod");
    private final static QName _AdjustedPaymentWarning_QNAME = new QName("http://domgen.com/core/schema/1_0", "AdjustedPaymentWarning");
    private final static QName _IMEI_QNAME = new QName("http://domgen.com/core/schema/1_0", "IMEI");
    private final static QName _ErrorDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "ErrorDescription");
    private final static QName _Username_QNAME = new QName("http://domgen.com/core/schema/1_0", "Username");
    private final static QName _Initials_QNAME = new QName("http://domgen.com/core/schema/1_0", "Initials");
    private final static QName _AccountName_QNAME = new QName("http://domgen.com/core/schema/1_0", "AccountName");
    private final static QName _WaitDays_QNAME = new QName("http://domgen.com/core/schema/1_0", "WaitDays");
    private final static QName _RenewalDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "RenewalDate");
    private final static QName _Surname_QNAME = new QName("http://domgen.com/core/schema/1_0", "Surname");
    private final static QName _ClientIdentifier_QNAME = new QName("http://domgen.com/core/schema/1_0", "ClientIdentifier");
    private final static QName _ApplianceDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "ApplianceDescription");
    private final static QName _CollectionDate_QNAME = new QName("http://domgen.com/core/schema/1_0", "CollectionDate");
    private final static QName _EligibilityDescription_QNAME = new QName("http://domgen.com/core/schema/1_0", "EligibilityDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.domgen.core.schema._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorResponseType }
     * 
     */
    public ErrorResponseType createErrorResponseType() {
        return new ErrorResponseType();
    }

    /**
     * Create an instance of {@link DPAFlagType }
     * 
     */
    public DPAFlagType createDPAFlagType() {
        return new DPAFlagType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link ApplianceRateDetailsType }
     * 
     */
    public ApplianceRateDetailsType createApplianceRateDetailsType() {
        return new ApplianceRateDetailsType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link AgentType }
     * 
     */
    public AgentType createAgentType() {
        return new AgentType();
    }

    /**
     * Create an instance of {@link ApplianceDetailsType }
     * 
     */
    public ApplianceDetailsType createApplianceDetailsType() {
        return new ApplianceDetailsType();
    }

    /**
     * Create an instance of {@link SchemeType }
     * 
     */
    public SchemeType createSchemeType() {
        return new SchemeType();
    }

    /**
     * Create an instance of {@link IBANType }
     * 
     */
    public IBANType createIBANType() {
        return new IBANType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DPAType }
     * 
     */
    public DPAType createDPAType() {
        return new DPAType();
    }

    /**
     * Create an instance of {@link PaymentProfileType }
     * 
     */
    public PaymentProfileType createPaymentProfileType() {
        return new PaymentProfileType();
    }

    /**
     * Create an instance of {@link ClientDetailsType }
     * 
     */
    public ClientDetailsType createClientDetailsType() {
        return new ClientDetailsType();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link BBANType }
     * 
     */
    public BBANType createBBANType() {
        return new BBANType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Channel")
    public JAXBElement<String> createChannel(String value) {
        return new JAXBElement<String>(_Channel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CompanyCode")
    public JAXBElement<String> createCompanyCode(String value) {
        return new JAXBElement<String>(_CompanyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BranchNumber")
    public JAXBElement<String> createBranchNumber(String value) {
        return new JAXBElement<String>(_BranchNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ApplianceFamilyCode")
    public JAXBElement<String> createApplianceFamilyCode(String value) {
        return new JAXBElement<String>(_ApplianceFamilyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CoverType")
    public JAXBElement<String> createCoverType(String value) {
        return new JAXBElement<String>(_CoverType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AdditionalMessageText")
    public JAXBElement<String> createAdditionalMessageText(String value) {
        return new JAXBElement<String>(_AdditionalMessageText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PreferredPaymentFlag")
    public JAXBElement<String> createPreferredPaymentFlag(String value) {
        return new JAXBElement<String>(_PreferredPaymentFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CreditCardType")
    public JAXBElement<String> createCreditCardType(String value) {
        return new JAXBElement<String>(_CreditCardType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PaymentProfile")
    public JAXBElement<String> createPaymentProfile(String value) {
        return new JAXBElement<String>(_PaymentProfile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SinglePaymentDay")
    public JAXBElement<String> createSinglePaymentDay(String value) {
        return new JAXBElement<String>(_SinglePaymentDay_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ApplianceFamilyDescription")
    public JAXBElement<String> createApplianceFamilyDescription(String value) {
        return new JAXBElement<String>(_ApplianceFamilyDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "LumpSum")
    public JAXBElement<BigDecimal> createLumpSum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LumpSum_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CostPerMonth")
    public JAXBElement<BigDecimal> createCostPerMonth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CostPerMonth_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PurchasePrice")
    public JAXBElement<BigDecimal> createPurchasePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PurchasePrice_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PaymentFrequency")
    public JAXBElement<Integer> createPaymentFrequency(Integer value) {
        return new JAXBElement<Integer>(_PaymentFrequency_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "GlobalGatewayReference")
    public JAXBElement<String> createGlobalGatewayReference(String value) {
        return new JAXBElement<String>(_GlobalGatewayReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "InstalmentPremium")
    public JAXBElement<BigDecimal> createInstalmentPremium(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InstalmentPremium_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Premium")
    public JAXBElement<BigDecimal> createPremium(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Premium_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BoilerType")
    public JAXBElement<String> createBoilerType(String value) {
        return new JAXBElement<String>(_BoilerType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "DateOfBirth")
    public JAXBElement<XMLGregorianCalendar> createDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfBirth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ExpiryDate")
    public JAXBElement<String> createExpiryDate(String value) {
        return new JAXBElement<String>(_ExpiryDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SerialNumber2")
    public JAXBElement<String> createSerialNumber2(String value) {
        return new JAXBElement<String>(_SerialNumber2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SerialNumber1")
    public JAXBElement<String> createSerialNumber1(String value) {
        return new JAXBElement<String>(_SerialNumber1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientMakerCode")
    public JAXBElement<String> createClientMakerCode(String value) {
        return new JAXBElement<String>(_ClientMakerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AddressLine4")
    public JAXBElement<String> createAddressLine4(String value) {
        return new JAXBElement<String>(_AddressLine4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NoMarketingLiterature")
    public JAXBElement<String> createNoMarketingLiterature(String value) {
        return new JAXBElement<String>(_NoMarketingLiterature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "WaitPeriod")
    public JAXBElement<String> createWaitPeriod(String value) {
        return new JAXBElement<String>(_WaitPeriod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AddressLine1")
    public JAXBElement<String> createAddressLine1(String value) {
        return new JAXBElement<String>(_AddressLine1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientApplianceDescription")
    public JAXBElement<String> createClientApplianceDescription(String value) {
        return new JAXBElement<String>(_ClientApplianceDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ErrorCode")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AddressLine3")
    public JAXBElement<String> createAddressLine3(String value) {
        return new JAXBElement<String>(_AddressLine3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AddressLine2")
    public JAXBElement<String> createAddressLine2(String value) {
        return new JAXBElement<String>(_AddressLine2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Branch")
    public JAXBElement<String> createBranch(String value) {
        return new JAXBElement<String>(_Branch_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ThisPayType")
    public JAXBElement<String> createThisPayType(String value) {
        return new JAXBElement<String>(_ThisPayType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "DDFee")
    public JAXBElement<BigDecimal> createDDFee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DDFee_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SwitchIssueNumber")
    public JAXBElement<String> createSwitchIssueNumber(String value) {
        return new JAXBElement<String>(_SwitchIssueNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Telephone")
    public JAXBElement<String> createTelephone(String value) {
        return new JAXBElement<String>(_Telephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ReprintFlagEnum")
    public JAXBElement<String> createReprintFlagEnum(String value) {
        return new JAXBElement<String>(_ReprintFlagEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "UniqueProductIdentifier")
    public JAXBElement<String> createUniqueProductIdentifier(String value) {
        return new JAXBElement<String>(_UniqueProductIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Disability")
    public JAXBElement<String> createDisability(String value) {
        return new JAXBElement<String>(_Disability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ExternalRefNo")
    public JAXBElement<String> createExternalRefNo(String value) {
        return new JAXBElement<String>(_ExternalRefNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientReferenceNumber")
    public JAXBElement<String> createClientReferenceNumber(String value) {
        return new JAXBElement<String>(_ClientReferenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "GoodsColour")
    public JAXBElement<String> createGoodsColour(String value) {
        return new JAXBElement<String>(_GoodsColour_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AccountCheckDigit")
    public JAXBElement<String> createAccountCheckDigit(String value) {
        return new JAXBElement<String>(_AccountCheckDigit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BankSortCode")
    public JAXBElement<String> createBankSortCode(String value) {
        return new JAXBElement<String>(_BankSortCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MultiplanApplianceCode")
    public JAXBElement<String> createMultiplanApplianceCode(String value) {
        return new JAXBElement<String>(_MultiplanApplianceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AgentNumber")
    public JAXBElement<String> createAgentNumber(String value) {
        return new JAXBElement<String>(_AgentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "OperationEnum")
    public JAXBElement<String> createOperationEnum(String value) {
        return new JAXBElement<String>(_OperationEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BreakdownStartDate")
    public JAXBElement<XMLGregorianCalendar> createBreakdownStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BreakdownStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CashPaymentType")
    public JAXBElement<String> createCashPaymentType(String value) {
        return new JAXBElement<String>(_CashPaymentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "WicType")
    public JAXBElement<String> createWicType(String value) {
        return new JAXBElement<String>(_WicType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Client")
    public JAXBElement<String> createClient(String value) {
        return new JAXBElement<String>(_Client_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CardNumber")
    public JAXBElement<String> createCardNumber(String value) {
        return new JAXBElement<String>(_CardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "LatePaymentWarning")
    public JAXBElement<Boolean> createLatePaymentWarning(Boolean value) {
        return new JAXBElement<Boolean>(_LatePaymentWarning_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SystemName")
    public JAXBElement<String> createSystemName(String value) {
        return new JAXBElement<String>(_SystemName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ContactName")
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(_ContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Fee")
    public JAXBElement<BigDecimal> createFee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Fee_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "TelephoneTypeEnum")
    public JAXBElement<String> createTelephoneTypeEnum(String value) {
        return new JAXBElement<String>(_TelephoneTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "FSAMessageType")
    public JAXBElement<String> createFSAMessageType(String value) {
        return new JAXBElement<String>(_FSAMessageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Bollettino")
    public JAXBElement<String> createBollettino(String value) {
        return new JAXBElement<String>(_Bollettino_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "FirstPayment")
    public JAXBElement<BigDecimal> createFirstPayment(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FirstPayment_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PriceBand")
    public JAXBElement<String> createPriceBand(String value) {
        return new JAXBElement<String>(_PriceBand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ReferenceNumber")
    public JAXBElement<String> createReferenceNumber(String value) {
        return new JAXBElement<String>(_ReferenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PostCode")
    public JAXBElement<String> createPostCode(String value) {
        return new JAXBElement<String>(_PostCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SchemeCode")
    public JAXBElement<String> createSchemeCode(String value) {
        return new JAXBElement<String>(_SchemeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CollectionNo")
    public JAXBElement<Integer> createCollectionNo(Integer value) {
        return new JAXBElement<Integer>(_CollectionNo_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ApplianceCode")
    public JAXBElement<String> createApplianceCode(String value) {
        return new JAXBElement<String>(_ApplianceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MessageText")
    public JAXBElement<String> createMessageText(String value) {
        return new JAXBElement<String>(_MessageText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MultiplanFlagEnum")
    public JAXBElement<String> createMultiplanFlagEnum(String value) {
        return new JAXBElement<String>(_MultiplanFlagEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NameOnCard")
    public JAXBElement<String> createNameOnCard(String value) {
        return new JAXBElement<String>(_NameOnCard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "WorkTelephone")
    public JAXBElement<String> createWorkTelephone(String value) {
        return new JAXBElement<String>(_WorkTelephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SequenceNumber")
    public JAXBElement<Integer> createSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_SequenceNumber_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "EligibilityFlagEnum")
    public JAXBElement<String> createEligibilityFlagEnum(String value) {
        return new JAXBElement<String>(_EligibilityFlagEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PaymentProfileDescription")
    public JAXBElement<String> createPaymentProfileDescription(String value) {
        return new JAXBElement<String>(_PaymentProfileDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "OfferStatusEnum")
    public JAXBElement<String> createOfferStatusEnum(String value) {
        return new JAXBElement<String>(_OfferStatusEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PurchaseDate")
    public JAXBElement<XMLGregorianCalendar> createPurchaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchaseDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AcceptanceDate")
    public JAXBElement<XMLGregorianCalendar> createAcceptanceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcceptanceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CheckDigit")
    public JAXBElement<String> createCheckDigit(String value) {
        return new JAXBElement<String>(_CheckDigit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CostPerDay")
    public JAXBElement<BigDecimal> createCostPerDay(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CostPerDay_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CollectionAmount")
    public JAXBElement<BigDecimal> createCollectionAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CollectionAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MakerCode")
    public JAXBElement<String> createMakerCode(String value) {
        return new JAXBElement<String>(_MakerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CallSource")
    public JAXBElement<String> createCallSource(String value) {
        return new JAXBElement<String>(_CallSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ModelNumber2")
    public JAXBElement<String> createModelNumber2(String value) {
        return new JAXBElement<String>(_ModelNumber2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CreditCardNumber")
    public JAXBElement<String> createCreditCardNumber(String value) {
        return new JAXBElement<String>(_CreditCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "DPA")
    public JAXBElement<String> createDPA(String value) {
        return new JAXBElement<String>(_DPA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ContactTypeEnum")
    public JAXBElement<String> createContactTypeEnum(String value) {
        return new JAXBElement<String>(_ContactTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AccountNumber")
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<String>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientLocation")
    public JAXBElement<String> createClientLocation(String value) {
        return new JAXBElement<String>(_ClientLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SinglePaymentFlagEnum")
    public JAXBElement<String> createSinglePaymentFlagEnum(String value) {
        return new JAXBElement<String>(_SinglePaymentFlagEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ReferenceTypeEnum")
    public JAXBElement<String> createReferenceTypeEnum(String value) {
        return new JAXBElement<String>(_ReferenceTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NationalIdentifier")
    public JAXBElement<String> createNationalIdentifier(String value) {
        return new JAXBElement<String>(_NationalIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "IBAN")
    public JAXBElement<String> createIBAN(String value) {
        return new JAXBElement<String>(_IBAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientApplianceCode")
    public JAXBElement<String> createClientApplianceCode(String value) {
        return new JAXBElement<String>(_ClientApplianceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MultiplanType")
    public JAXBElement<String> createMultiplanType(String value) {
        return new JAXBElement<String>(_MultiplanType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PaymentType")
    public JAXBElement<String> createPaymentType(String value) {
        return new JAXBElement<String>(_PaymentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "HouseholdToken")
    public JAXBElement<String> createHouseholdToken(String value) {
        return new JAXBElement<String>(_HouseholdToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "StatusDescription")
    public JAXBElement<String> createStatusDescription(String value) {
        return new JAXBElement<String>(_StatusDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Gender")
    public JAXBElement<String> createGender(String value) {
        return new JAXBElement<String>(_Gender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "YearOfManufacture")
    public JAXBElement<String> createYearOfManufacture(String value) {
        return new JAXBElement<String>(_YearOfManufacture_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MessageTypeEnum")
    public JAXBElement<String> createMessageTypeEnum(String value) {
        return new JAXBElement<String>(_MessageTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MultiplanWarrantyType")
    public JAXBElement<String> createMultiplanWarrantyType(String value) {
        return new JAXBElement<String>(_MultiplanWarrantyType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BIC")
    public JAXBElement<String> createBIC(String value) {
        return new JAXBElement<String>(_BIC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SendMethod")
    public JAXBElement<String> createSendMethod(String value) {
        return new JAXBElement<String>(_SendMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BusinessTypeEnum")
    public JAXBElement<String> createBusinessTypeEnum(String value) {
        return new JAXBElement<String>(_BusinessTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NumberOfPayments")
    public JAXBElement<Integer> createNumberOfPayments(Integer value) {
        return new JAXBElement<Integer>(_NumberOfPayments_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MaxReturn")
    public JAXBElement<Integer> createMaxReturn(Integer value) {
        return new JAXBElement<Integer>(_MaxReturn_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "EligibilityFlag")
    public JAXBElement<String> createEligibilityFlag(String value) {
        return new JAXBElement<String>(_EligibilityFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CashReference")
    public JAXBElement<String> createCashReference(String value) {
        return new JAXBElement<String>(_CashReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "HomeTelephone")
    public JAXBElement<String> createHomeTelephone(String value) {
        return new JAXBElement<String>(_HomeTelephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NominatedPaymentDay")
    public JAXBElement<Integer> createNominatedPaymentDay(Integer value) {
        return new JAXBElement<Integer>(_NominatedPaymentDay_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ExcessAmount")
    public JAXBElement<BigDecimal> createExcessAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExcessAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "LanguageCode")
    public JAXBElement<String> createLanguageCode(String value) {
        return new JAXBElement<String>(_LanguageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MobileTelephone")
    public JAXBElement<String> createMobileTelephone(String value) {
        return new JAXBElement<String>(_MobileTelephone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PeriodOfCover")
    public JAXBElement<String> createPeriodOfCover(String value) {
        return new JAXBElement<String>(_PeriodOfCover_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "BankCode")
    public JAXBElement<String> createBankCode(String value) {
        return new JAXBElement<String>(_BankCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MultiplanSize")
    public JAXBElement<Integer> createMultiplanSize(Integer value) {
        return new JAXBElement<Integer>(_MultiplanSize_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ModelNumber1")
    public JAXBElement<String> createModelNumber1(String value) {
        return new JAXBElement<String>(_ModelNumber1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CCFee")
    public JAXBElement<BigDecimal> createCCFee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CCFee_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AllowCustomer")
    public JAXBElement<String> createAllowCustomer(String value) {
        return new JAXBElement<String>(_AllowCustomer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CreditCardSecurityCode")
    public JAXBElement<Integer> createCreditCardSecurityCode(Integer value) {
        return new JAXBElement<Integer>(_CreditCardSecurityCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ResponseDescription")
    public JAXBElement<String> createResponseDescription(String value) {
        return new JAXBElement<String>(_ResponseDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SchemeDescription")
    public JAXBElement<String> createSchemeDescription(String value) {
        return new JAXBElement<String>(_SchemeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "NumberOfAppliances")
    public JAXBElement<Integer> createNumberOfAppliances(Integer value) {
        return new JAXBElement<Integer>(_NumberOfAppliances_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CustomerToken")
    public JAXBElement<String> createCustomerToken(String value) {
        return new JAXBElement<String>(_CustomerToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MakerDescription")
    public JAXBElement<String> createMakerDescription(String value) {
        return new JAXBElement<String>(_MakerDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "PlanTypeEnum")
    public JAXBElement<String> createPlanTypeEnum(String value) {
        return new JAXBElement<String>(_PlanTypeEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Bank")
    public JAXBElement<String> createBank(String value) {
        return new JAXBElement<String>(_Bank_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "IsBundle")
    public JAXBElement<String> createIsBundle(String value) {
        return new JAXBElement<String>(_IsBundle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ResponseCode")
    public JAXBElement<String> createResponseCode(String value) {
        return new JAXBElement<String>(_ResponseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "MonthsBetweenPayments")
    public JAXBElement<Integer> createMonthsBetweenPayments(Integer value) {
        return new JAXBElement<Integer>(_MonthsBetweenPayments_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "SubsequentPayment")
    public JAXBElement<BigDecimal> createSubsequentPayment(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SubsequentPayment_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CreditCardExpiryDate")
    public JAXBElement<String> createCreditCardExpiryDate(String value) {
        return new JAXBElement<String>(_CreditCardExpiryDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ProtectMessage")
    public JAXBElement<Boolean> createProtectMessage(Boolean value) {
        return new JAXBElement<Boolean>(_ProtectMessage_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "StatusEnum")
    public JAXBElement<String> createStatusEnum(String value) {
        return new JAXBElement<String>(_StatusEnum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ManuGuarPeriod")
    public JAXBElement<String> createManuGuarPeriod(String value) {
        return new JAXBElement<String>(_ManuGuarPeriod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AdjustedPaymentWarning")
    public JAXBElement<Boolean> createAdjustedPaymentWarning(Boolean value) {
        return new JAXBElement<Boolean>(_AdjustedPaymentWarning_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "IMEI")
    public JAXBElement<String> createIMEI(String value) {
        return new JAXBElement<String>(_IMEI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ErrorDescription")
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Initials")
    public JAXBElement<String> createInitials(String value) {
        return new JAXBElement<String>(_Initials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "AccountName")
    public JAXBElement<String> createAccountName(String value) {
        return new JAXBElement<String>(_AccountName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "WaitDays")
    public JAXBElement<Integer> createWaitDays(Integer value) {
        return new JAXBElement<Integer>(_WaitDays_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "RenewalDate")
    public JAXBElement<XMLGregorianCalendar> createRenewalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RenewalDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "Surname")
    public JAXBElement<String> createSurname(String value) {
        return new JAXBElement<String>(_Surname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ClientIdentifier")
    public JAXBElement<String> createClientIdentifier(String value) {
        return new JAXBElement<String>(_ClientIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "ApplianceDescription")
    public JAXBElement<String> createApplianceDescription(String value) {
        return new JAXBElement<String>(_ApplianceDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "CollectionDate")
    public JAXBElement<XMLGregorianCalendar> createCollectionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CollectionDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domgen.com/core/schema/1_0", name = "EligibilityDescription")
    public JAXBElement<String> createEligibilityDescription(String value) {
        return new JAXBElement<String>(_EligibilityDescription_QNAME, String.class, null, value);
    }

}
