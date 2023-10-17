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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when identity verification has been retried, which can be triggered via the dashboard or the API.
 */
@ApiModel(description = "Fired when identity verification has been retried, which can be triggered via the dashboard or the API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class IdentityVerificationRetriedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_ID = "identity_verification_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_ID)
  private String identityVerificationId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public IdentityVerificationRetriedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;IDENTITY_VERIFICATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`IDENTITY_VERIFICATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IdentityVerificationRetriedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;RETRIED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`RETRIED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IdentityVerificationRetriedWebhook identityVerificationId(String identityVerificationId) {
    
    this.identityVerificationId = identityVerificationId;
    return this;
  }

   /**
   * The ID of the associated Identity Verification attempt.
   * @return identityVerificationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated Identity Verification attempt.")

  public String getIdentityVerificationId() {
    return identityVerificationId;
  }


  public void setIdentityVerificationId(String identityVerificationId) {
    this.identityVerificationId = identityVerificationId;
  }


  public IdentityVerificationRetriedWebhook environment(WebhookEnvironmentValues environment) {
    
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
    IdentityVerificationRetriedWebhook identityVerificationRetriedWebhook = (IdentityVerificationRetriedWebhook) o;
    return Objects.equals(this.webhookType, identityVerificationRetriedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, identityVerificationRetriedWebhook.webhookCode) &&
        Objects.equals(this.identityVerificationId, identityVerificationRetriedWebhook.identityVerificationId) &&
        Objects.equals(this.environment, identityVerificationRetriedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, identityVerificationId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationRetriedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    identityVerificationId: ").append(toIndentedString(identityVerificationId)).append("\n");
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

