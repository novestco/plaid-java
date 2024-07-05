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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when a user successfully adds a Plaid item during a Link session. Contains the public token for the item.
 */
@ApiModel(description = "Fired when a user successfully adds a Plaid item during a Link session. Contains the public token for the item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class ItemAddResultWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "public_token";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  private String publicToken;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public ItemAddResultWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LINK&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LINK`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ItemAddResultWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;ITEM_ADD_RESULT&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`ITEM_ADD_RESULT`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ItemAddResultWebhook linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * The identifier for the Link session.
   * @return linkSessionId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the Link session.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public ItemAddResultWebhook linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * The link token used to create the Link session.
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "The link token used to create the Link session.")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  public ItemAddResultWebhook publicToken(String publicToken) {
    
    this.publicToken = publicToken;
    return this;
  }

   /**
   * The public token corresponding to the item that was added.
   * @return publicToken
  **/
  @ApiModelProperty(required = true, value = "The public token corresponding to the item that was added.")

  public String getPublicToken() {
    return publicToken;
  }


  public void setPublicToken(String publicToken) {
    this.publicToken = publicToken;
  }


  public ItemAddResultWebhook environment(WebhookEnvironmentValues environment) {
    
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
    ItemAddResultWebhook itemAddResultWebhook = (ItemAddResultWebhook) o;
    return Objects.equals(this.webhookType, itemAddResultWebhook.webhookType) &&
        Objects.equals(this.webhookCode, itemAddResultWebhook.webhookCode) &&
        Objects.equals(this.linkSessionId, itemAddResultWebhook.linkSessionId) &&
        Objects.equals(this.linkToken, itemAddResultWebhook.linkToken) &&
        Objects.equals(this.publicToken, itemAddResultWebhook.publicToken) &&
        Objects.equals(this.environment, itemAddResultWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, linkSessionId, linkToken, publicToken, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAddResultWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
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

