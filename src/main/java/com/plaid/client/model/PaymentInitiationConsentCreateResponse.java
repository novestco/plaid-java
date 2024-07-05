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
import com.plaid.client.model.PaymentInitiationConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInitiationConsentCreateResponse defines the response schema for &#x60;/payment_initiation/consent/create&#x60;
 */
@ApiModel(description = "PaymentInitiationConsentCreateResponse defines the response schema for `/payment_initiation/consent/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class PaymentInitiationConsentCreateResponse {
  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentInitiationConsentStatus status;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationConsentCreateResponse consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * A unique ID identifying the payment consent.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying the payment consent.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public PaymentInitiationConsentCreateResponse status(PaymentInitiationConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentInitiationConsentStatus status) {
    this.status = status;
  }


  public PaymentInitiationConsentCreateResponse requestId(String requestId) {
    
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
    PaymentInitiationConsentCreateResponse paymentInitiationConsentCreateResponse = (PaymentInitiationConsentCreateResponse) o;
    return Objects.equals(this.consentId, paymentInitiationConsentCreateResponse.consentId) &&
        Objects.equals(this.status, paymentInitiationConsentCreateResponse.status) &&
        Objects.equals(this.requestId, paymentInitiationConsentCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, status, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentCreateResponse {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

