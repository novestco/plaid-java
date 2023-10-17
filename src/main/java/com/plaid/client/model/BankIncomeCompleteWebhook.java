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
import com.plaid.client.model.BankIncomeCompleteResult;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when a bank income report has finished generating or failed to generate, triggered by calling &#x60;/credit/bank_income/get&#x60; in CRA enabled client.
 */
@ApiModel(description = "Fired when a bank income report has finished generating or failed to generate, triggered by calling `/credit/bank_income/get` in CRA enabled client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class BankIncomeCompleteWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private BankIncomeCompleteResult result;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public BankIncomeCompleteWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;INCOME&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`INCOME`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public BankIncomeCompleteWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;BANK_INCOME_COMPLETE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`BANK_INCOME_COMPLETE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public BankIncomeCompleteWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The &#x60;user_id&#x60; corresponding to the user the webhook has fired for.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The `user_id` corresponding to the user the webhook has fired for.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public BankIncomeCompleteWebhook result(BankIncomeCompleteResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")

  public BankIncomeCompleteResult getResult() {
    return result;
  }


  public void setResult(BankIncomeCompleteResult result) {
    this.result = result;
  }


  public BankIncomeCompleteWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankIncomeCompleteWebhook bankIncomeCompleteWebhook = (BankIncomeCompleteWebhook) o;
    return Objects.equals(this.webhookType, bankIncomeCompleteWebhook.webhookType) &&
        Objects.equals(this.webhookCode, bankIncomeCompleteWebhook.webhookCode) &&
        Objects.equals(this.userId, bankIncomeCompleteWebhook.userId) &&
        Objects.equals(this.result, bankIncomeCompleteWebhook.result) &&
        Objects.equals(this.environment, bankIncomeCompleteWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, userId, result, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankIncomeCompleteWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

