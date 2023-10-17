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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferAuthorizationDevice;
import com.plaid.client.model.TransferAuthorizationUserInRequest;
import com.plaid.client.model.TransferCreditFundsSource;
import com.plaid.client.model.TransferNetwork;
import com.plaid.client.model.TransferType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/authorization/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/authorization/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class TransferAuthorizationCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_PAYMENT_PROFILE_TOKEN = "payment_profile_token";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROFILE_TOKEN)
  private String paymentProfileToken;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferType type;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferNetwork network;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferAuthorizationUserInRequest user;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private TransferAuthorizationDevice device;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_USER_PRESENT = "user_present";
  @SerializedName(SERIALIZED_NAME_USER_PRESENT)
  private Boolean userPresent;

  public static final String SERIALIZED_NAME_WITH_GUARANTEE = "with_guarantee";
  @SerializedName(SERIALIZED_NAME_WITH_GUARANTEE)
  private Boolean withGuarantee = true;

  public static final String SERIALIZED_NAME_BEACON_SESSION_ID = "beacon_session_id";
  @SerializedName(SERIALIZED_NAME_BEACON_SESSION_ID)
  private String beaconSessionId;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_CREDIT_FUNDS_SOURCE = "credit_funds_source";
  @SerializedName(SERIALIZED_NAME_CREDIT_FUNDS_SOURCE)
  private TransferCreditFundsSource creditFundsSource;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;


  public TransferAuthorizationCreateRequest clientId(String clientId) {
    
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


  public TransferAuthorizationCreateRequest secret(String secret) {
    
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


  public TransferAuthorizationCreateRequest accessToken(String accessToken) {
    
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


  public TransferAuthorizationCreateRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; corresponding to the end-user account that will be debited or credited.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `account_id` corresponding to the end-user account that will be debited or credited.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferAuthorizationCreateRequest fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * Specify the account used to fund the transfer. Should be specified if using legacy funding methods only. If using Plaid Ledger, leave this field blank. Customers can find a list of &#x60;funding_account_id&#x60;s in the Accounts page of your Plaid Dashboard, under the \&quot;Account ID\&quot; column. If this field is left blank and you are using legacy funding methods, this will default to the default &#x60;funding_account_id&#x60; specified during onboarding. Otherwise, Plaid Ledger will be used.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the account used to fund the transfer. Should be specified if using legacy funding methods only. If using Plaid Ledger, leave this field blank. Customers can find a list of `funding_account_id`s in the Accounts page of your Plaid Dashboard, under the \"Account ID\" column. If this field is left blank and you are using legacy funding methods, this will default to the default `funding_account_id` specified during onboarding. Otherwise, Plaid Ledger will be used.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferAuthorizationCreateRequest paymentProfileToken(String paymentProfileToken) {
    
    this.paymentProfileToken = paymentProfileToken;
    return this;
  }

   /**
   * The payment profile token associated with the Payment Profile that will be debited or credited. Required if not using &#x60;access_token&#x60;.
   * @return paymentProfileToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment profile token associated with the Payment Profile that will be debited or credited. Required if not using `access_token`.")

  public String getPaymentProfileToken() {
    return paymentProfileToken;
  }


  public void setPaymentProfileToken(String paymentProfileToken) {
    this.paymentProfileToken = paymentProfileToken;
  }


  public TransferAuthorizationCreateRequest type(TransferType type) {
    
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


  public TransferAuthorizationCreateRequest network(TransferNetwork network) {
    
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


  public TransferAuthorizationCreateRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferAuthorizationCreateRequest achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public TransferAuthorizationCreateRequest user(TransferAuthorizationUserInRequest user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationUserInRequest getUser() {
    return user;
  }


  public void setUser(TransferAuthorizationUserInRequest user) {
    this.user = user;
  }


  public TransferAuthorizationCreateRequest device(TransferAuthorizationDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferAuthorizationDevice getDevice() {
    return device;
  }


  public void setDevice(TransferAuthorizationDevice device) {
    this.device = device;
  }


  public TransferAuthorizationCreateRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the origination account for this authorization. If not specified, the default account will be used.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid's unique identifier for the origination account for this authorization. If not specified, the default account will be used.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferAuthorizationCreateRequest isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount. The default value is \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency of the transfer amount. The default value is \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferAuthorizationCreateRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique authorization, which expires after 48 hours. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create an authorization fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single authorization is created.  This idempotency key expires after 48 hours, after which the same key can be reused. Failure to provide this key may result in duplicate charges.
   * @return idempotencyKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A random key provided by the client, per unique authorization, which expires after 48 hours. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create an authorization fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single authorization is created.  This idempotency key expires after 48 hours, after which the same key can be reused. Failure to provide this key may result in duplicate charges.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public TransferAuthorizationCreateRequest userPresent(Boolean userPresent) {
    
    this.userPresent = userPresent;
    return this;
  }

   /**
   * If the end user is initiating the specific transfer themselves via an interactive UI, this should be &#x60;true&#x60;; for automatic recurring payments where the end user is not actually initiating each individual transfer, it should be &#x60;false&#x60;. This field is not currently used and is present to support planned future functionality.
   * @return userPresent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the end user is initiating the specific transfer themselves via an interactive UI, this should be `true`; for automatic recurring payments where the end user is not actually initiating each individual transfer, it should be `false`. This field is not currently used and is present to support planned future functionality.")

  public Boolean getUserPresent() {
    return userPresent;
  }


  public void setUserPresent(Boolean userPresent) {
    this.userPresent = userPresent;
  }


  public TransferAuthorizationCreateRequest withGuarantee(Boolean withGuarantee) {
    
    this.withGuarantee = withGuarantee;
    return this;
  }

   /**
   * If set to &#x60;false&#x60;, Plaid will not offer a &#x60;guarantee_decision&#x60; for this request (Guarantee customers only).
   * @return withGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to `false`, Plaid will not offer a `guarantee_decision` for this request (Guarantee customers only).")

  public Boolean getWithGuarantee() {
    return withGuarantee;
  }


  public void setWithGuarantee(Boolean withGuarantee) {
    this.withGuarantee = withGuarantee;
  }


  public TransferAuthorizationCreateRequest beaconSessionId(String beaconSessionId) {
    
    this.beaconSessionId = beaconSessionId;
    return this;
  }

   /**
   * The unique identifier returned by Plaid&#39;s [beacon](https://plaid.com/docs/transfer/guarantee/#using-a-beacon) when it is run on your webpage.
   * @return beaconSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier returned by Plaid's [beacon](https://plaid.com/docs/transfer/guarantee/#using-a-beacon) when it is run on your webpage.")

  public String getBeaconSessionId() {
    return beaconSessionId;
  }


  public void setBeaconSessionId(String beaconSessionId) {
    this.beaconSessionId = beaconSessionId;
  }


  public TransferAuthorizationCreateRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * The Plaid client ID that is the originator of this transfer. Only needed if creating transfers on behalf of another client as a [Platform customer](https://plaid.com/docs/transfer/application/#originators-vs-platforms).
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid client ID that is the originator of this transfer. Only needed if creating transfers on behalf of another client as a [Platform customer](https://plaid.com/docs/transfer/application/#originators-vs-platforms).")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferAuthorizationCreateRequest creditFundsSource(TransferCreditFundsSource creditFundsSource) {
    
    this.creditFundsSource = creditFundsSource;
    return this;
  }

   /**
   * Get creditFundsSource
   * @return creditFundsSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferCreditFundsSource getCreditFundsSource() {
    return creditFundsSource;
  }


  public void setCreditFundsSource(TransferCreditFundsSource creditFundsSource) {
    this.creditFundsSource = creditFundsSource;
  }


  public TransferAuthorizationCreateRequest testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock. This field may only be used when using &#x60;sandbox&#x60; environment. If provided, the &#x60;authorization&#x60; is created at the &#x60;virtual_time&#x60; on the provided test clock.
   * @return testClockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a test clock. This field may only be used when using `sandbox` environment. If provided, the `authorization` is created at the `virtual_time` on the provided test clock.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorizationCreateRequest transferAuthorizationCreateRequest = (TransferAuthorizationCreateRequest) o;
    return Objects.equals(this.clientId, transferAuthorizationCreateRequest.clientId) &&
        Objects.equals(this.secret, transferAuthorizationCreateRequest.secret) &&
        Objects.equals(this.accessToken, transferAuthorizationCreateRequest.accessToken) &&
        Objects.equals(this.accountId, transferAuthorizationCreateRequest.accountId) &&
        Objects.equals(this.fundingAccountId, transferAuthorizationCreateRequest.fundingAccountId) &&
        Objects.equals(this.paymentProfileToken, transferAuthorizationCreateRequest.paymentProfileToken) &&
        Objects.equals(this.type, transferAuthorizationCreateRequest.type) &&
        Objects.equals(this.network, transferAuthorizationCreateRequest.network) &&
        Objects.equals(this.amount, transferAuthorizationCreateRequest.amount) &&
        Objects.equals(this.achClass, transferAuthorizationCreateRequest.achClass) &&
        Objects.equals(this.user, transferAuthorizationCreateRequest.user) &&
        Objects.equals(this.device, transferAuthorizationCreateRequest.device) &&
        Objects.equals(this.originationAccountId, transferAuthorizationCreateRequest.originationAccountId) &&
        Objects.equals(this.isoCurrencyCode, transferAuthorizationCreateRequest.isoCurrencyCode) &&
        Objects.equals(this.idempotencyKey, transferAuthorizationCreateRequest.idempotencyKey) &&
        Objects.equals(this.userPresent, transferAuthorizationCreateRequest.userPresent) &&
        Objects.equals(this.withGuarantee, transferAuthorizationCreateRequest.withGuarantee) &&
        Objects.equals(this.beaconSessionId, transferAuthorizationCreateRequest.beaconSessionId) &&
        Objects.equals(this.originatorClientId, transferAuthorizationCreateRequest.originatorClientId) &&
        Objects.equals(this.creditFundsSource, transferAuthorizationCreateRequest.creditFundsSource) &&
        Objects.equals(this.testClockId, transferAuthorizationCreateRequest.testClockId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessToken, accountId, fundingAccountId, paymentProfileToken, type, network, amount, achClass, user, device, originationAccountId, isoCurrencyCode, idempotencyKey, userPresent, withGuarantee, beaconSessionId, originatorClientId, creditFundsSource, testClockId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorizationCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    paymentProfileToken: ").append(toIndentedString(paymentProfileToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    userPresent: ").append(toIndentedString(userPresent)).append("\n");
    sb.append("    withGuarantee: ").append(toIndentedString(withGuarantee)).append("\n");
    sb.append("    beaconSessionId: ").append(toIndentedString(beaconSessionId)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    creditFundsSource: ").append(toIndentedString(creditFundsSource)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
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

