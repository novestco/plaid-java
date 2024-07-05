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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when a processor updates the webhook URL for a processor token via &#x60;/processor/token/webhook/update&#x60;.
 */
@ApiModel(description = "This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when a processor updates the webhook URL for a processor token via `/processor/token/webhook/update`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class ProcessorTokenWebhookUpdate {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_NEW_WEBHOOK_URL = "new_webhook_url";
  @SerializedName(SERIALIZED_NAME_NEW_WEBHOOK_URL)
  private String newWebhookUrl;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public ProcessorTokenWebhookUpdate webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;PROCESSOR_TOKEN&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`PROCESSOR_TOKEN`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ProcessorTokenWebhookUpdate webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`WEBHOOK_UPDATE_ACKNOWLEDGED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ProcessorTokenWebhookUpdate error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public ProcessorTokenWebhookUpdate accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProcessorTokenWebhookUpdate newWebhookUrl(String newWebhookUrl) {
    
    this.newWebhookUrl = newWebhookUrl;
    return this;
  }

   /**
   * The new webhook URL.
   * @return newWebhookUrl
  **/
  @ApiModelProperty(required = true, value = "The new webhook URL.")

  public String getNewWebhookUrl() {
    return newWebhookUrl;
  }


  public void setNewWebhookUrl(String newWebhookUrl) {
    this.newWebhookUrl = newWebhookUrl;
  }


  public ProcessorTokenWebhookUpdate environment(WebhookEnvironmentValues environment) {
    
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
    ProcessorTokenWebhookUpdate processorTokenWebhookUpdate = (ProcessorTokenWebhookUpdate) o;
    return Objects.equals(this.webhookType, processorTokenWebhookUpdate.webhookType) &&
        Objects.equals(this.webhookCode, processorTokenWebhookUpdate.webhookCode) &&
        Objects.equals(this.error, processorTokenWebhookUpdate.error) &&
        Objects.equals(this.accountId, processorTokenWebhookUpdate.accountId) &&
        Objects.equals(this.newWebhookUrl, processorTokenWebhookUpdate.newWebhookUrl) &&
        Objects.equals(this.environment, processorTokenWebhookUpdate.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, accountId, newWebhookUrl, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTokenWebhookUpdate {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    newWebhookUrl: ").append(toIndentedString(newWebhookUrl)).append("\n");
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

