/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.PayPeriodDetailsPayFrequency;
import com.plaid.client.model.PaystubOverrideDistributionBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about the pay period.
 */
@ApiModel(description = "Details about the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class PaystubOverridePayPeriodDetails {
  public static final String SERIALIZED_NAME_CHECK_AMOUNT = "check_amount";
  @SerializedName(SERIALIZED_NAME_CHECK_AMOUNT)
  private Double checkAmount;

  public static final String SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN = "distribution_breakdown";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN)
  private List<PaystubOverrideDistributionBreakdown> distributionBreakdown = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private Double grossEarnings;

  public static final String SERIALIZED_NAME_PAY_DATE = "pay_date";
  @SerializedName(SERIALIZED_NAME_PAY_DATE)
  private LocalDate payDate;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayPeriodDetailsPayFrequency payFrequency;

  public static final String SERIALIZED_NAME_PAY_DAY = "pay_day";
  @SerializedName(SERIALIZED_NAME_PAY_DAY)
  private LocalDate payDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;


  public PaystubOverridePayPeriodDetails checkAmount(Double checkAmount) {
    
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * The amount of the paycheck.
   * @return checkAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the paycheck.")

  public Double getCheckAmount() {
    return checkAmount;
  }


  public void setCheckAmount(Double checkAmount) {
    this.checkAmount = checkAmount;
  }


  public PaystubOverridePayPeriodDetails distributionBreakdown(List<PaystubOverrideDistributionBreakdown> distributionBreakdown) {
    
    this.distributionBreakdown = distributionBreakdown;
    return this;
  }

  public PaystubOverridePayPeriodDetails addDistributionBreakdownItem(PaystubOverrideDistributionBreakdown distributionBreakdownItem) {
    if (this.distributionBreakdown == null) {
      this.distributionBreakdown = new ArrayList<>();
    }
    this.distributionBreakdown.add(distributionBreakdownItem);
    return this;
  }

   /**
   * Get distributionBreakdown
   * @return distributionBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaystubOverrideDistributionBreakdown> getDistributionBreakdown() {
    return distributionBreakdown;
  }


  public void setDistributionBreakdown(List<PaystubOverrideDistributionBreakdown> distributionBreakdown) {
    this.distributionBreakdown = distributionBreakdown;
  }


  public PaystubOverridePayPeriodDetails endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PaystubOverridePayPeriodDetails grossEarnings(Double grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Total earnings before tax/deductions.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total earnings before tax/deductions.")

  public Double getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PaystubOverridePayPeriodDetails payDate(LocalDate payDate) {
    
    this.payDate = payDate;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDate() {
    return payDate;
  }


  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }


  public PaystubOverridePayPeriodDetails payFrequency(PayPeriodDetailsPayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayPeriodDetailsPayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayPeriodDetailsPayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  public PaystubOverridePayPeriodDetails payDay(LocalDate payDay) {
    
    this.payDay = payDay;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDay() {
    return payDay;
  }


  public void setPayDay(LocalDate payDay) {
    this.payDay = payDay;
  }


  public PaystubOverridePayPeriodDetails startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubOverridePayPeriodDetails paystubOverridePayPeriodDetails = (PaystubOverridePayPeriodDetails) o;
    return Objects.equals(this.checkAmount, paystubOverridePayPeriodDetails.checkAmount) &&
        Objects.equals(this.distributionBreakdown, paystubOverridePayPeriodDetails.distributionBreakdown) &&
        Objects.equals(this.endDate, paystubOverridePayPeriodDetails.endDate) &&
        Objects.equals(this.grossEarnings, paystubOverridePayPeriodDetails.grossEarnings) &&
        Objects.equals(this.payDate, paystubOverridePayPeriodDetails.payDate) &&
        Objects.equals(this.payFrequency, paystubOverridePayPeriodDetails.payFrequency) &&
        Objects.equals(this.payDay, paystubOverridePayPeriodDetails.payDay) &&
        Objects.equals(this.startDate, paystubOverridePayPeriodDetails.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkAmount, distributionBreakdown, endDate, grossEarnings, payDate, payFrequency, payDay, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubOverridePayPeriodDetails {\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
    sb.append("    distributionBreakdown: ").append(toIndentedString(distributionBreakdown)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payDay: ").append(toIndentedString(payDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

