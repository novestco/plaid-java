/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.534.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.Address;
import com.plaid.client.model.PSLFStatus;
import com.plaid.client.model.StudentLoanRepaymentModel;
import com.plaid.client.model.StudentLoanStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Used to configure Sandbox test data for the Liabilities product
 */
@ApiModel(description = "Used to configure Sandbox test data for the Liabilities product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class LiabilityOverride {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PURCHASE_APR = "purchase_apr";
  @SerializedName(SERIALIZED_NAME_PURCHASE_APR)
  private Double purchaseApr;

  public static final String SERIALIZED_NAME_CASH_APR = "cash_apr";
  @SerializedName(SERIALIZED_NAME_CASH_APR)
  private Double cashApr;

  public static final String SERIALIZED_NAME_BALANCE_TRANSFER_APR = "balance_transfer_apr";
  @SerializedName(SERIALIZED_NAME_BALANCE_TRANSFER_APR)
  private Double balanceTransferApr;

  public static final String SERIALIZED_NAME_SPECIAL_APR = "special_apr";
  @SerializedName(SERIALIZED_NAME_SPECIAL_APR)
  private Double specialApr;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AMOUNT = "last_payment_amount";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AMOUNT)
  private Double lastPaymentAmount;

  public static final String SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT = "minimum_payment_amount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT)
  private Double minimumPaymentAmount;

  public static final String SERIALIZED_NAME_IS_OVERDUE = "is_overdue";
  @SerializedName(SERIALIZED_NAME_IS_OVERDUE)
  private Boolean isOverdue;

  public static final String SERIALIZED_NAME_ORIGINATION_DATE = "origination_date";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_DATE)
  private LocalDate originationDate;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Double principal;

  public static final String SERIALIZED_NAME_NOMINAL_APR = "nominal_apr";
  @SerializedName(SERIALIZED_NAME_NOMINAL_APR)
  private Double nominalApr;

  public static final String SERIALIZED_NAME_INTEREST_CAPITALIZATION_GRACE_PERIOD_MONTHS = "interest_capitalization_grace_period_months";
  @SerializedName(SERIALIZED_NAME_INTEREST_CAPITALIZATION_GRACE_PERIOD_MONTHS)
  private Double interestCapitalizationGracePeriodMonths;

  public static final String SERIALIZED_NAME_REPAYMENT_MODEL = "repayment_model";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_MODEL)
  private StudentLoanRepaymentModel repaymentModel;

  public static final String SERIALIZED_NAME_EXPECTED_PAYOFF_DATE = "expected_payoff_date";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PAYOFF_DATE)
  private LocalDate expectedPayoffDate;

  public static final String SERIALIZED_NAME_GUARANTOR = "guarantor";
  @SerializedName(SERIALIZED_NAME_GUARANTOR)
  private String guarantor;

  public static final String SERIALIZED_NAME_IS_FEDERAL = "is_federal";
  @SerializedName(SERIALIZED_NAME_IS_FEDERAL)
  private Boolean isFederal;

  public static final String SERIALIZED_NAME_LOAN_NAME = "loan_name";
  @SerializedName(SERIALIZED_NAME_LOAN_NAME)
  private String loanName;

  public static final String SERIALIZED_NAME_LOAN_STATUS = "loan_status";
  @SerializedName(SERIALIZED_NAME_LOAN_STATUS)
  private StudentLoanStatus loanStatus;

  public static final String SERIALIZED_NAME_PAYMENT_REFERENCE_NUMBER = "payment_reference_number";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REFERENCE_NUMBER)
  private String paymentReferenceNumber;

  public static final String SERIALIZED_NAME_PSLF_STATUS = "pslf_status";
  @SerializedName(SERIALIZED_NAME_PSLF_STATUS)
  private PSLFStatus pslfStatus;

  public static final String SERIALIZED_NAME_REPAYMENT_PLAN_DESCRIPTION = "repayment_plan_description";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_PLAN_DESCRIPTION)
  private String repaymentPlanDescription;

  public static final String SERIALIZED_NAME_REPAYMENT_PLAN_TYPE = "repayment_plan_type";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_PLAN_TYPE)
  private String repaymentPlanType;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequence_number";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private String sequenceNumber;

  public static final String SERIALIZED_NAME_SERVICER_ADDRESS = "servicer_address";
  @SerializedName(SERIALIZED_NAME_SERVICER_ADDRESS)
  private Address servicerAddress;


  public LiabilityOverride type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the liability object, either &#x60;credit&#x60; or &#x60;student&#x60;. Mortgages are not currently supported in the custom Sandbox.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the liability object, either `credit` or `student`. Mortgages are not currently supported in the custom Sandbox.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LiabilityOverride purchaseApr(Double purchaseApr) {
    
    this.purchaseApr = purchaseApr;
    return this;
  }

   /**
   * The purchase APR percentage value. For simplicity, this is the only interest rate used to calculate interest charges. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60;.
   * @return purchaseApr
  **/
  @ApiModelProperty(required = true, value = "The purchase APR percentage value. For simplicity, this is the only interest rate used to calculate interest charges. Can only be set if `type` is `credit`.")

  public Double getPurchaseApr() {
    return purchaseApr;
  }


  public void setPurchaseApr(Double purchaseApr) {
    this.purchaseApr = purchaseApr;
  }


  public LiabilityOverride cashApr(Double cashApr) {
    
    this.cashApr = cashApr;
    return this;
  }

   /**
   * The cash APR percentage value. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60;.
   * @return cashApr
  **/
  @ApiModelProperty(required = true, value = "The cash APR percentage value. Can only be set if `type` is `credit`.")

  public Double getCashApr() {
    return cashApr;
  }


  public void setCashApr(Double cashApr) {
    this.cashApr = cashApr;
  }


  public LiabilityOverride balanceTransferApr(Double balanceTransferApr) {
    
    this.balanceTransferApr = balanceTransferApr;
    return this;
  }

   /**
   * The balance transfer APR percentage value. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60;.
   * @return balanceTransferApr
  **/
  @ApiModelProperty(required = true, value = "The balance transfer APR percentage value. Can only be set if `type` is `credit`.")

  public Double getBalanceTransferApr() {
    return balanceTransferApr;
  }


  public void setBalanceTransferApr(Double balanceTransferApr) {
    this.balanceTransferApr = balanceTransferApr;
  }


  public LiabilityOverride specialApr(Double specialApr) {
    
    this.specialApr = specialApr;
    return this;
  }

   /**
   * The special APR percentage value. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60;.
   * @return specialApr
  **/
  @ApiModelProperty(required = true, value = "The special APR percentage value. Can only be set if `type` is `credit`.")

  public Double getSpecialApr() {
    return specialApr;
  }


  public void setSpecialApr(Double specialApr) {
    this.specialApr = specialApr;
  }


  public LiabilityOverride lastPaymentAmount(Double lastPaymentAmount) {
    
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * Override the &#x60;last_payment_amount&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60;.
   * @return lastPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "Override the `last_payment_amount` field. Can only be set if `type` is `credit`.")

  public Double getLastPaymentAmount() {
    return lastPaymentAmount;
  }


  public void setLastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }


  public LiabilityOverride minimumPaymentAmount(Double minimumPaymentAmount) {
    
    this.minimumPaymentAmount = minimumPaymentAmount;
    return this;
  }

   /**
   * Override the &#x60;minimum_payment_amount&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;credit&#x60; or &#x60;student&#x60;.
   * @return minimumPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "Override the `minimum_payment_amount` field. Can only be set if `type` is `credit` or `student`.")

  public Double getMinimumPaymentAmount() {
    return minimumPaymentAmount;
  }


  public void setMinimumPaymentAmount(Double minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
  }


  public LiabilityOverride isOverdue(Boolean isOverdue) {
    
    this.isOverdue = isOverdue;
    return this;
  }

   /**
   * Override the &#x60;is_overdue&#x60; field
   * @return isOverdue
  **/
  @ApiModelProperty(required = true, value = "Override the `is_overdue` field")

  public Boolean getIsOverdue() {
    return isOverdue;
  }


  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }


  public LiabilityOverride originationDate(LocalDate originationDate) {
    
    this.originationDate = originationDate;
    return this;
  }

   /**
   * The date on which the loan was initially lent, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return originationDate
  **/
  @ApiModelProperty(required = true, value = "The date on which the loan was initially lent, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Can only be set if `type` is `student`.")

  public LocalDate getOriginationDate() {
    return originationDate;
  }


  public void setOriginationDate(LocalDate originationDate) {
    this.originationDate = originationDate;
  }


  public LiabilityOverride principal(Double principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * The original loan principal. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return principal
  **/
  @ApiModelProperty(required = true, value = "The original loan principal. Can only be set if `type` is `student`.")

  public Double getPrincipal() {
    return principal;
  }


  public void setPrincipal(Double principal) {
    this.principal = principal;
  }


  public LiabilityOverride nominalApr(Double nominalApr) {
    
    this.nominalApr = nominalApr;
    return this;
  }

   /**
   * The interest rate on the loan as a percentage. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return nominalApr
  **/
  @ApiModelProperty(required = true, value = "The interest rate on the loan as a percentage. Can only be set if `type` is `student`.")

  public Double getNominalApr() {
    return nominalApr;
  }


  public void setNominalApr(Double nominalApr) {
    this.nominalApr = nominalApr;
  }


  public LiabilityOverride interestCapitalizationGracePeriodMonths(Double interestCapitalizationGracePeriodMonths) {
    
    this.interestCapitalizationGracePeriodMonths = interestCapitalizationGracePeriodMonths;
    return this;
  }

   /**
   * If set, interest capitalization begins at the given number of months after loan origination. By default interest is never capitalized. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return interestCapitalizationGracePeriodMonths
  **/
  @ApiModelProperty(required = true, value = "If set, interest capitalization begins at the given number of months after loan origination. By default interest is never capitalized. Can only be set if `type` is `student`.")

  public Double getInterestCapitalizationGracePeriodMonths() {
    return interestCapitalizationGracePeriodMonths;
  }


  public void setInterestCapitalizationGracePeriodMonths(Double interestCapitalizationGracePeriodMonths) {
    this.interestCapitalizationGracePeriodMonths = interestCapitalizationGracePeriodMonths;
  }


  public LiabilityOverride repaymentModel(StudentLoanRepaymentModel repaymentModel) {
    
    this.repaymentModel = repaymentModel;
    return this;
  }

   /**
   * Get repaymentModel
   * @return repaymentModel
  **/
  @ApiModelProperty(required = true, value = "")

  public StudentLoanRepaymentModel getRepaymentModel() {
    return repaymentModel;
  }


  public void setRepaymentModel(StudentLoanRepaymentModel repaymentModel) {
    this.repaymentModel = repaymentModel;
  }


  public LiabilityOverride expectedPayoffDate(LocalDate expectedPayoffDate) {
    
    this.expectedPayoffDate = expectedPayoffDate;
    return this;
  }

   /**
   * Override the &#x60;expected_payoff_date&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return expectedPayoffDate
  **/
  @ApiModelProperty(required = true, value = "Override the `expected_payoff_date` field. Can only be set if `type` is `student`.")

  public LocalDate getExpectedPayoffDate() {
    return expectedPayoffDate;
  }


  public void setExpectedPayoffDate(LocalDate expectedPayoffDate) {
    this.expectedPayoffDate = expectedPayoffDate;
  }


  public LiabilityOverride guarantor(String guarantor) {
    
    this.guarantor = guarantor;
    return this;
  }

   /**
   * Override the &#x60;guarantor&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return guarantor
  **/
  @ApiModelProperty(required = true, value = "Override the `guarantor` field. Can only be set if `type` is `student`.")

  public String getGuarantor() {
    return guarantor;
  }


  public void setGuarantor(String guarantor) {
    this.guarantor = guarantor;
  }


  public LiabilityOverride isFederal(Boolean isFederal) {
    
    this.isFederal = isFederal;
    return this;
  }

   /**
   * Override the &#x60;is_federal&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return isFederal
  **/
  @ApiModelProperty(required = true, value = "Override the `is_federal` field. Can only be set if `type` is `student`.")

  public Boolean getIsFederal() {
    return isFederal;
  }


  public void setIsFederal(Boolean isFederal) {
    this.isFederal = isFederal;
  }


  public LiabilityOverride loanName(String loanName) {
    
    this.loanName = loanName;
    return this;
  }

   /**
   * Override the &#x60;loan_name&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return loanName
  **/
  @ApiModelProperty(required = true, value = "Override the `loan_name` field. Can only be set if `type` is `student`.")

  public String getLoanName() {
    return loanName;
  }


  public void setLoanName(String loanName) {
    this.loanName = loanName;
  }


  public LiabilityOverride loanStatus(StudentLoanStatus loanStatus) {
    
    this.loanStatus = loanStatus;
    return this;
  }

   /**
   * Get loanStatus
   * @return loanStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public StudentLoanStatus getLoanStatus() {
    return loanStatus;
  }


  public void setLoanStatus(StudentLoanStatus loanStatus) {
    this.loanStatus = loanStatus;
  }


  public LiabilityOverride paymentReferenceNumber(String paymentReferenceNumber) {
    
    this.paymentReferenceNumber = paymentReferenceNumber;
    return this;
  }

   /**
   * Override the &#x60;payment_reference_number&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return paymentReferenceNumber
  **/
  @ApiModelProperty(required = true, value = "Override the `payment_reference_number` field. Can only be set if `type` is `student`.")

  public String getPaymentReferenceNumber() {
    return paymentReferenceNumber;
  }


  public void setPaymentReferenceNumber(String paymentReferenceNumber) {
    this.paymentReferenceNumber = paymentReferenceNumber;
  }


  public LiabilityOverride pslfStatus(PSLFStatus pslfStatus) {
    
    this.pslfStatus = pslfStatus;
    return this;
  }

   /**
   * Get pslfStatus
   * @return pslfStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PSLFStatus getPslfStatus() {
    return pslfStatus;
  }


  public void setPslfStatus(PSLFStatus pslfStatus) {
    this.pslfStatus = pslfStatus;
  }


  public LiabilityOverride repaymentPlanDescription(String repaymentPlanDescription) {
    
    this.repaymentPlanDescription = repaymentPlanDescription;
    return this;
  }

   /**
   * Override the &#x60;repayment_plan.description&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return repaymentPlanDescription
  **/
  @ApiModelProperty(required = true, value = "Override the `repayment_plan.description` field. Can only be set if `type` is `student`.")

  public String getRepaymentPlanDescription() {
    return repaymentPlanDescription;
  }


  public void setRepaymentPlanDescription(String repaymentPlanDescription) {
    this.repaymentPlanDescription = repaymentPlanDescription;
  }


  public LiabilityOverride repaymentPlanType(String repaymentPlanType) {
    
    this.repaymentPlanType = repaymentPlanType;
    return this;
  }

   /**
   * Override the &#x60;repayment_plan.type&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;. Possible values are: &#x60;\&quot;extended graduated\&quot;&#x60;, &#x60;\&quot;extended standard\&quot;&#x60;, &#x60;\&quot;graduated\&quot;&#x60;, &#x60;\&quot;income-contingent repayment\&quot;&#x60;, &#x60;\&quot;income-based repayment\&quot;&#x60;, &#x60;\&quot;income-sensitive repayment\&quot;&#x60;, &#x60;\&quot;interest only\&quot;&#x60;, &#x60;\&quot;other\&quot;&#x60;, &#x60;\&quot;pay as you earn\&quot;&#x60;, &#x60;\&quot;revised pay as you earn\&quot;&#x60;, &#x60;\&quot;standard\&quot;&#x60;, or &#x60;\&quot;saving on a valuable education\&quot;&#x60;.
   * @return repaymentPlanType
  **/
  @ApiModelProperty(required = true, value = "Override the `repayment_plan.type` field. Can only be set if `type` is `student`. Possible values are: `\"extended graduated\"`, `\"extended standard\"`, `\"graduated\"`, `\"income-contingent repayment\"`, `\"income-based repayment\"`, `\"income-sensitive repayment\"`, `\"interest only\"`, `\"other\"`, `\"pay as you earn\"`, `\"revised pay as you earn\"`, `\"standard\"`, or `\"saving on a valuable education\"`.")

  public String getRepaymentPlanType() {
    return repaymentPlanType;
  }


  public void setRepaymentPlanType(String repaymentPlanType) {
    this.repaymentPlanType = repaymentPlanType;
  }


  public LiabilityOverride sequenceNumber(String sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Override the &#x60;sequence_number&#x60; field. Can only be set if &#x60;type&#x60; is &#x60;student&#x60;.
   * @return sequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Override the `sequence_number` field. Can only be set if `type` is `student`.")

  public String getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public LiabilityOverride servicerAddress(Address servicerAddress) {
    
    this.servicerAddress = servicerAddress;
    return this;
  }

   /**
   * Get servicerAddress
   * @return servicerAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public Address getServicerAddress() {
    return servicerAddress;
  }


  public void setServicerAddress(Address servicerAddress) {
    this.servicerAddress = servicerAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiabilityOverride liabilityOverride = (LiabilityOverride) o;
    return Objects.equals(this.type, liabilityOverride.type) &&
        Objects.equals(this.purchaseApr, liabilityOverride.purchaseApr) &&
        Objects.equals(this.cashApr, liabilityOverride.cashApr) &&
        Objects.equals(this.balanceTransferApr, liabilityOverride.balanceTransferApr) &&
        Objects.equals(this.specialApr, liabilityOverride.specialApr) &&
        Objects.equals(this.lastPaymentAmount, liabilityOverride.lastPaymentAmount) &&
        Objects.equals(this.minimumPaymentAmount, liabilityOverride.minimumPaymentAmount) &&
        Objects.equals(this.isOverdue, liabilityOverride.isOverdue) &&
        Objects.equals(this.originationDate, liabilityOverride.originationDate) &&
        Objects.equals(this.principal, liabilityOverride.principal) &&
        Objects.equals(this.nominalApr, liabilityOverride.nominalApr) &&
        Objects.equals(this.interestCapitalizationGracePeriodMonths, liabilityOverride.interestCapitalizationGracePeriodMonths) &&
        Objects.equals(this.repaymentModel, liabilityOverride.repaymentModel) &&
        Objects.equals(this.expectedPayoffDate, liabilityOverride.expectedPayoffDate) &&
        Objects.equals(this.guarantor, liabilityOverride.guarantor) &&
        Objects.equals(this.isFederal, liabilityOverride.isFederal) &&
        Objects.equals(this.loanName, liabilityOverride.loanName) &&
        Objects.equals(this.loanStatus, liabilityOverride.loanStatus) &&
        Objects.equals(this.paymentReferenceNumber, liabilityOverride.paymentReferenceNumber) &&
        Objects.equals(this.pslfStatus, liabilityOverride.pslfStatus) &&
        Objects.equals(this.repaymentPlanDescription, liabilityOverride.repaymentPlanDescription) &&
        Objects.equals(this.repaymentPlanType, liabilityOverride.repaymentPlanType) &&
        Objects.equals(this.sequenceNumber, liabilityOverride.sequenceNumber) &&
        Objects.equals(this.servicerAddress, liabilityOverride.servicerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, purchaseApr, cashApr, balanceTransferApr, specialApr, lastPaymentAmount, minimumPaymentAmount, isOverdue, originationDate, principal, nominalApr, interestCapitalizationGracePeriodMonths, repaymentModel, expectedPayoffDate, guarantor, isFederal, loanName, loanStatus, paymentReferenceNumber, pslfStatus, repaymentPlanDescription, repaymentPlanType, sequenceNumber, servicerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiabilityOverride {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    purchaseApr: ").append(toIndentedString(purchaseApr)).append("\n");
    sb.append("    cashApr: ").append(toIndentedString(cashApr)).append("\n");
    sb.append("    balanceTransferApr: ").append(toIndentedString(balanceTransferApr)).append("\n");
    sb.append("    specialApr: ").append(toIndentedString(specialApr)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    minimumPaymentAmount: ").append(toIndentedString(minimumPaymentAmount)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    nominalApr: ").append(toIndentedString(nominalApr)).append("\n");
    sb.append("    interestCapitalizationGracePeriodMonths: ").append(toIndentedString(interestCapitalizationGracePeriodMonths)).append("\n");
    sb.append("    repaymentModel: ").append(toIndentedString(repaymentModel)).append("\n");
    sb.append("    expectedPayoffDate: ").append(toIndentedString(expectedPayoffDate)).append("\n");
    sb.append("    guarantor: ").append(toIndentedString(guarantor)).append("\n");
    sb.append("    isFederal: ").append(toIndentedString(isFederal)).append("\n");
    sb.append("    loanName: ").append(toIndentedString(loanName)).append("\n");
    sb.append("    loanStatus: ").append(toIndentedString(loanStatus)).append("\n");
    sb.append("    paymentReferenceNumber: ").append(toIndentedString(paymentReferenceNumber)).append("\n");
    sb.append("    pslfStatus: ").append(toIndentedString(pslfStatus)).append("\n");
    sb.append("    repaymentPlanDescription: ").append(toIndentedString(repaymentPlanDescription)).append("\n");
    sb.append("    repaymentPlanType: ").append(toIndentedString(repaymentPlanType)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    servicerAddress: ").append(toIndentedString(servicerAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

