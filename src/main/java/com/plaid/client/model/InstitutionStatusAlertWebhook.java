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
 * Fired when institution status meets the conditions configured in the developer dashboard.
 */
@ApiModel(description = "Fired when institution status meets the conditions configured in the developer dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class InstitutionStatusAlertWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_OVERALL_SUCCESS_RATE = "institution_overall_success_rate";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_OVERALL_SUCCESS_RATE)
  private Double institutionOverallSuccessRate;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public InstitutionStatusAlertWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;DASHBOARD_CONFIGURED_ALERT&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`DASHBOARD_CONFIGURED_ALERT`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public InstitutionStatusAlertWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;INSTITUTION_STATUS_ALERT_TRIGGERED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`INSTITUTION_STATUS_ALERT_TRIGGERED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public InstitutionStatusAlertWebhook institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of the associated institution.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated institution.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public InstitutionStatusAlertWebhook institutionOverallSuccessRate(Double institutionOverallSuccessRate) {
    
    this.institutionOverallSuccessRate = institutionOverallSuccessRate;
    return this;
  }

   /**
   * The global success rate of the institution, calculated based on item add health.
   * @return institutionOverallSuccessRate
  **/
  @ApiModelProperty(required = true, value = "The global success rate of the institution, calculated based on item add health.")

  public Double getInstitutionOverallSuccessRate() {
    return institutionOverallSuccessRate;
  }


  public void setInstitutionOverallSuccessRate(Double institutionOverallSuccessRate) {
    this.institutionOverallSuccessRate = institutionOverallSuccessRate;
  }


  public InstitutionStatusAlertWebhook environment(WebhookEnvironmentValues environment) {
    
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
    InstitutionStatusAlertWebhook institutionStatusAlertWebhook = (InstitutionStatusAlertWebhook) o;
    return Objects.equals(this.webhookType, institutionStatusAlertWebhook.webhookType) &&
        Objects.equals(this.webhookCode, institutionStatusAlertWebhook.webhookCode) &&
        Objects.equals(this.institutionId, institutionStatusAlertWebhook.institutionId) &&
        Objects.equals(this.institutionOverallSuccessRate, institutionStatusAlertWebhook.institutionOverallSuccessRate) &&
        Objects.equals(this.environment, institutionStatusAlertWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, institutionId, institutionOverallSuccessRate, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionStatusAlertWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionOverallSuccessRate: ").append(toIndentedString(institutionOverallSuccessRate)).append("\n");
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

