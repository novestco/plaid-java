/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * PaymentInitiationPaymentTokenCreateResponse defines the response schema for &#x60;/payment_initiation/payment/token/create&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentTokenCreateResponse defines the response schema for `/payment_initiation/payment/token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class PaymentInitiationPaymentTokenCreateResponse {
  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "payment_token";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN_EXPIRATION_TIME = "payment_token_expiration_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN_EXPIRATION_TIME)
  private OffsetDateTime paymentTokenExpirationTime;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationPaymentTokenCreateResponse paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * A &#x60;payment_token&#x60; that can be provided to Link initialization to enter the payment initiation flow
   * @return paymentToken
  **/
  @ApiModelProperty(required = true, value = "A `payment_token` that can be provided to Link initialization to enter the payment initiation flow")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentInitiationPaymentTokenCreateResponse paymentTokenExpirationTime(OffsetDateTime paymentTokenExpirationTime) {
    
    this.paymentTokenExpirationTime = paymentTokenExpirationTime;
    return this;
  }

   /**
   * The date and time at which the token will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. A &#x60;payment_token&#x60; expires after 15 minutes.
   * @return paymentTokenExpirationTime
  **/
  @ApiModelProperty(required = true, value = "The date and time at which the token will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. A `payment_token` expires after 15 minutes.")

  public OffsetDateTime getPaymentTokenExpirationTime() {
    return paymentTokenExpirationTime;
  }


  public void setPaymentTokenExpirationTime(OffsetDateTime paymentTokenExpirationTime) {
    this.paymentTokenExpirationTime = paymentTokenExpirationTime;
  }


  public PaymentInitiationPaymentTokenCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationPaymentTokenCreateResponse paymentInitiationPaymentTokenCreateResponse = (PaymentInitiationPaymentTokenCreateResponse) o;
    return Objects.equals(this.paymentToken, paymentInitiationPaymentTokenCreateResponse.paymentToken) &&
        Objects.equals(this.paymentTokenExpirationTime, paymentInitiationPaymentTokenCreateResponse.paymentTokenExpirationTime) &&
        Objects.equals(this.requestId, paymentInitiationPaymentTokenCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, paymentTokenExpirationTime, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPaymentTokenCreateResponse {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTokenExpirationTime: ").append(toIndentedString(paymentTokenExpirationTime)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

