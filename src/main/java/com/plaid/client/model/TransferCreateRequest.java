/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferNetwork;
import com.plaid.client.model.TransferType;
import com.plaid.client.model.TransferUserInRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines the request schema for &#x60;/transfer/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T23:03:50.146Z[GMT]")
public class TransferCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AUTHORIZATION_ID = "authorization_id";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_ID)
  private String authorizationId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferType type;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferNetwork network;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInRequest user;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;


  public TransferCreateRequest clientId(String clientId) {
    
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


  public TransferCreateRequest secret(String secret) {
    
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


  public TransferCreateRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a transfer fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single transfer is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique transfer. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a transfer fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single transfer is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public TransferCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The Plaid &#x60;access_token&#x60; for the account that will be debited or credited.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The Plaid `access_token` for the account that will be debited or credited.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public TransferCreateRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; for the account that will be debited or credited.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `account_id` for the account that will be debited or credited.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferCreateRequest authorizationId(String authorizationId) {
    
    this.authorizationId = authorizationId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer authorization.
   * @return authorizationId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer authorization.")

  public String getAuthorizationId() {
    return authorizationId;
  }


  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  public TransferCreateRequest type(TransferType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferType getType() {
    return type;
  }


  public void setType(TransferType type) {
    this.type = type;
  }


  public TransferCreateRequest network(TransferNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferNetwork network) {
    this.network = network;
  }


  public TransferCreateRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. “10.00”).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. “10.00”).")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The transfer description. Maximum of 10 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transfer description. Maximum of 10 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferCreateRequest achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @ApiModelProperty(required = true, value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public TransferCreateRequest user(TransferUserInRequest user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInRequest getUser() {
    return user;
  }


  public void setUser(TransferUserInRequest user) {
    this.user = user;
  }


  public TransferCreateRequest metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransferCreateRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public TransferCreateRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account for this transfer. If you have more than one origination account, this value must be specified.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for the origination account for this transfer. If you have more than one origination account, this value must be specified.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCreateRequest transferCreateRequest = (TransferCreateRequest) o;
    return Objects.equals(this.clientId, transferCreateRequest.clientId) &&
        Objects.equals(this.secret, transferCreateRequest.secret) &&
        Objects.equals(this.idempotencyKey, transferCreateRequest.idempotencyKey) &&
        Objects.equals(this.accessToken, transferCreateRequest.accessToken) &&
        Objects.equals(this.accountId, transferCreateRequest.accountId) &&
        Objects.equals(this.authorizationId, transferCreateRequest.authorizationId) &&
        Objects.equals(this.type, transferCreateRequest.type) &&
        Objects.equals(this.network, transferCreateRequest.network) &&
        Objects.equals(this.amount, transferCreateRequest.amount) &&
        Objects.equals(this.description, transferCreateRequest.description) &&
        Objects.equals(this.achClass, transferCreateRequest.achClass) &&
        Objects.equals(this.user, transferCreateRequest.user) &&
        Objects.equals(this.metadata, transferCreateRequest.metadata) &&
        Objects.equals(this.originationAccountId, transferCreateRequest.originationAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, idempotencyKey, accessToken, accountId, authorizationId, type, network, amount, description, achClass, user, metadata, originationAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
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
