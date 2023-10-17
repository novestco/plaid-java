/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
import com.plaid.client.model.TransferFailure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/sandbox/transfer/refund/simulate&#x60;
 */
@ApiModel(description = "Defines the request schema for `/sandbox/transfer/refund/simulate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class SandboxTransferRefundSimulateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferFailure failureReason;


  public SandboxTransferRefundSimulateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SandboxTransferRefundSimulateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SandboxTransferRefundSimulateRequest refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a refund.
   * @return refundId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a refund.")

  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public SandboxTransferRefundSimulateRequest testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock. If provided, the event to be simulated is created at the &#x60;virtual_time&#x60; on the provided &#x60;test_clock&#x60;.
   * @return testClockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a test clock. If provided, the event to be simulated is created at the `virtual_time` on the provided `test_clock`.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public SandboxTransferRefundSimulateRequest eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The asynchronous event to be simulated. May be: &#x60;refund.posted&#x60;, &#x60;refund.settled&#x60;, &#x60;refund.failed&#x60;, or &#x60;refund.returned&#x60;.  An error will be returned if the event type is incompatible with the current refund status. Compatible status --&gt; event type transitions include:  &#x60;refund.pending&#x60; --&gt; &#x60;refund.failed&#x60;  &#x60;refund.pending&#x60; --&gt; &#x60;refund.posted&#x60;  &#x60;refund.posted&#x60; --&gt; &#x60;refund.returned&#x60;  &#x60;refund.posted&#x60; --&gt; &#x60;refund.settled&#x60; 
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The asynchronous event to be simulated. May be: `refund.posted`, `refund.settled`, `refund.failed`, or `refund.returned`.  An error will be returned if the event type is incompatible with the current refund status. Compatible status --> event type transitions include:  `refund.pending` --> `refund.failed`  `refund.pending` --> `refund.posted`  `refund.posted` --> `refund.returned`  `refund.posted` --> `refund.settled` ")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public SandboxTransferRefundSimulateRequest failureReason(TransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTransferRefundSimulateRequest sandboxTransferRefundSimulateRequest = (SandboxTransferRefundSimulateRequest) o;
    return Objects.equals(this.clientId, sandboxTransferRefundSimulateRequest.clientId) &&
        Objects.equals(this.secret, sandboxTransferRefundSimulateRequest.secret) &&
        Objects.equals(this.refundId, sandboxTransferRefundSimulateRequest.refundId) &&
        Objects.equals(this.testClockId, sandboxTransferRefundSimulateRequest.testClockId) &&
        Objects.equals(this.eventType, sandboxTransferRefundSimulateRequest.eventType) &&
        Objects.equals(this.failureReason, sandboxTransferRefundSimulateRequest.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, refundId, testClockId, eventType, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTransferRefundSimulateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

