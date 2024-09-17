/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.PaymentConsentPeriodicAlignment;
import com.plaid.client.model.PaymentConsentPeriodicAmountAmount;
import com.plaid.client.model.PaymentConsentPeriodicInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines consent payments limitations per period.
 */
@ApiModel(description = "Defines consent payments limitations per period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class PaymentConsentPeriodicAmount {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentConsentPeriodicAmountAmount amount;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private PaymentConsentPeriodicInterval interval;

  public static final String SERIALIZED_NAME_ALIGNMENT = "alignment";
  @SerializedName(SERIALIZED_NAME_ALIGNMENT)
  private PaymentConsentPeriodicAlignment alignment;


  public PaymentConsentPeriodicAmount amount(PaymentConsentPeriodicAmountAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentConsentPeriodicAmountAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentConsentPeriodicAmountAmount amount) {
    this.amount = amount;
  }


  public PaymentConsentPeriodicAmount interval(PaymentConsentPeriodicInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentConsentPeriodicInterval getInterval() {
    return interval;
  }


  public void setInterval(PaymentConsentPeriodicInterval interval) {
    this.interval = interval;
  }


  public PaymentConsentPeriodicAmount alignment(PaymentConsentPeriodicAlignment alignment) {
    
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentConsentPeriodicAlignment getAlignment() {
    return alignment;
  }


  public void setAlignment(PaymentConsentPeriodicAlignment alignment) {
    this.alignment = alignment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConsentPeriodicAmount paymentConsentPeriodicAmount = (PaymentConsentPeriodicAmount) o;
    return Objects.equals(this.amount, paymentConsentPeriodicAmount.amount) &&
        Objects.equals(this.interval, paymentConsentPeriodicAmount.interval) &&
        Objects.equals(this.alignment, paymentConsentPeriodicAmount.alignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, interval, alignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConsentPeriodicAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
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

