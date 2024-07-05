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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/ledger/distribute&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/ledger/distribute`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class TransferLedgerDistributeRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_FROM_CLIENT_ID = "from_client_id";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT_ID)
  private String fromClientId;

  public static final String SERIALIZED_NAME_TO_CLIENT_ID = "to_client_id";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT_ID)
  private String toClientId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public TransferLedgerDistributeRequest clientId(String clientId) {
    
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


  public TransferLedgerDistributeRequest secret(String secret) {
    
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


  public TransferLedgerDistributeRequest fromClientId(String fromClientId) {
    
    this.fromClientId = fromClientId;
    return this;
  }

   /**
   * The client to pull money from. Must be the platform itself or its originator. One of &#x60;from_client_id&#x60; and &#x60;to_client_id&#x60; must be the platform&#39;s &#x60;client_id&#x60;.
   * @return fromClientId
  **/
  @ApiModelProperty(required = true, value = "The client to pull money from. Must be the platform itself or its originator. One of `from_client_id` and `to_client_id` must be the platform's `client_id`.")

  public String getFromClientId() {
    return fromClientId;
  }


  public void setFromClientId(String fromClientId) {
    this.fromClientId = fromClientId;
  }


  public TransferLedgerDistributeRequest toClientId(String toClientId) {
    
    this.toClientId = toClientId;
    return this;
  }

   /**
   * The client to credit money to. Must be the platform itself or its originator. One of &#x60;from_client_id&#x60; and &#x60;to_client_id&#x60; must be the platform&#39;s &#x60;client_id&#x60;.
   * @return toClientId
  **/
  @ApiModelProperty(required = true, value = "The client to credit money to. Must be the platform itself or its originator. One of `from_client_id` and `to_client_id` must be the platform's `client_id`.")

  public String getToClientId() {
    return toClientId;
  }


  public void setToClientId(String toClientId) {
    this.toClientId = toClientId;
  }


  public TransferLedgerDistributeRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount to move (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). Amount must be positive.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount to move (decimal string with two digits of precision e.g. \"10.00\"). Amount must be positive.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferLedgerDistributeRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A unique key provided by the client, per unique ledger distribute. Maximum of 50 characters.  The API supports idempotency for safely retrying the request without accidentally performing the same operation twice. For example, if a request to create a ledger distribute fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single distribute is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A unique key provided by the client, per unique ledger distribute. Maximum of 50 characters.  The API supports idempotency for safely retrying the request without accidentally performing the same operation twice. For example, if a request to create a ledger distribute fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single distribute is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public TransferLedgerDistributeRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An optional description for the ledger distribute operation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional description for the ledger distribute operation.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferLedgerDistributeRequest transferLedgerDistributeRequest = (TransferLedgerDistributeRequest) o;
    return Objects.equals(this.clientId, transferLedgerDistributeRequest.clientId) &&
        Objects.equals(this.secret, transferLedgerDistributeRequest.secret) &&
        Objects.equals(this.fromClientId, transferLedgerDistributeRequest.fromClientId) &&
        Objects.equals(this.toClientId, transferLedgerDistributeRequest.toClientId) &&
        Objects.equals(this.amount, transferLedgerDistributeRequest.amount) &&
        Objects.equals(this.idempotencyKey, transferLedgerDistributeRequest.idempotencyKey) &&
        Objects.equals(this.description, transferLedgerDistributeRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, fromClientId, toClientId, amount, idempotencyKey, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLedgerDistributeRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    fromClientId: ").append(toIndentedString(fromClientId)).append("\n");
    sb.append("    toClientId: ").append(toIndentedString(toClientId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

