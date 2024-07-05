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
import com.plaid.client.model.TransactionsRuleDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionsRulesCreateRequest defines the request schema for &#x60;beta/transactions/rules/v1/create&#x60;
 */
@ApiModel(description = "TransactionsRulesCreateRequest defines the request schema for `beta/transactions/rules/v1/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class TransactionsRulesCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private String personalFinanceCategory;

  public static final String SERIALIZED_NAME_RULE_DETAILS = "rule_details";
  @SerializedName(SERIALIZED_NAME_RULE_DETAILS)
  private TransactionsRuleDetails ruleDetails;


  public TransactionsRulesCreateRequest clientId(String clientId) {
    
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


  public TransactionsRulesCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public TransactionsRulesCreateRequest secret(String secret) {
    
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


  public TransactionsRulesCreateRequest personalFinanceCategory(String personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Personal finance detailed category.  All implementations are encouraged to use this field instead of &#x60;category&#x60;, as it provides more meaningful and accurate categorization.  See the [&#x60;taxonomy csv file&#x60;](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories. 
   * @return personalFinanceCategory
  **/
  @ApiModelProperty(required = true, value = "Personal finance detailed category.  All implementations are encouraged to use this field instead of `category`, as it provides more meaningful and accurate categorization.  See the [`taxonomy csv file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories. ")

  public String getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(String personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  public TransactionsRulesCreateRequest ruleDetails(TransactionsRuleDetails ruleDetails) {
    
    this.ruleDetails = ruleDetails;
    return this;
  }

   /**
   * Get ruleDetails
   * @return ruleDetails
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionsRuleDetails getRuleDetails() {
    return ruleDetails;
  }


  public void setRuleDetails(TransactionsRuleDetails ruleDetails) {
    this.ruleDetails = ruleDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRulesCreateRequest transactionsRulesCreateRequest = (TransactionsRulesCreateRequest) o;
    return Objects.equals(this.clientId, transactionsRulesCreateRequest.clientId) &&
        Objects.equals(this.accessToken, transactionsRulesCreateRequest.accessToken) &&
        Objects.equals(this.secret, transactionsRulesCreateRequest.secret) &&
        Objects.equals(this.personalFinanceCategory, transactionsRulesCreateRequest.personalFinanceCategory) &&
        Objects.equals(this.ruleDetails, transactionsRulesCreateRequest.ruleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, accessToken, secret, personalFinanceCategory, ruleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRulesCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
    sb.append("    ruleDetails: ").append(toIndentedString(ruleDetails)).append("\n");
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

