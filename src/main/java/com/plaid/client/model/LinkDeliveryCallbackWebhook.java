/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.LinkCallbackMetadata;
import com.plaid.client.model.PlaidError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Webhook containing metadata proxied over from Link callback e.g &#x60;onEvent&#x60;, &#x60;onExit&#x60;, &#x60;onSuccess&#x60;.
 */
@ApiModel(description = "Webhook containing metadata proxied over from Link callback e.g `onEvent`, `onExit`, `onSuccess`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class LinkDeliveryCallbackWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_LINK_DELIVERY_SESSION_ID = "link_delivery_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_DELIVERY_SESSION_ID)
  private String linkDeliverySessionId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_LINK_CALLBACK_METADATA = "link_callback_metadata";
  @SerializedName(SERIALIZED_NAME_LINK_CALLBACK_METADATA)
  private LinkCallbackMetadata linkCallbackMetadata;


  public LinkDeliveryCallbackWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LINK_DELIVERY&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LINK_DELIVERY`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public LinkDeliveryCallbackWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;LINK_CALLBACK&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`LINK_CALLBACK`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LinkDeliveryCallbackWebhook linkDeliverySessionId(String linkDeliverySessionId) {
    
    this.linkDeliverySessionId = linkDeliverySessionId;
    return this;
  }

   /**
   * The ID of the Hosted Link session.
   * @return linkDeliverySessionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the Hosted Link session.")

  public String getLinkDeliverySessionId() {
    return linkDeliverySessionId;
  }


  public void setLinkDeliverySessionId(String linkDeliverySessionId) {
    this.linkDeliverySessionId = linkDeliverySessionId;
  }


  public LinkDeliveryCallbackWebhook timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public LinkDeliveryCallbackWebhook error(PlaidError error) {
    
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


  public LinkDeliveryCallbackWebhook linkCallbackMetadata(LinkCallbackMetadata linkCallbackMetadata) {
    
    this.linkCallbackMetadata = linkCallbackMetadata;
    return this;
  }

   /**
   * Get linkCallbackMetadata
   * @return linkCallbackMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkCallbackMetadata getLinkCallbackMetadata() {
    return linkCallbackMetadata;
  }


  public void setLinkCallbackMetadata(LinkCallbackMetadata linkCallbackMetadata) {
    this.linkCallbackMetadata = linkCallbackMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryCallbackWebhook linkDeliveryCallbackWebhook = (LinkDeliveryCallbackWebhook) o;
    return Objects.equals(this.webhookType, linkDeliveryCallbackWebhook.webhookType) &&
        Objects.equals(this.webhookCode, linkDeliveryCallbackWebhook.webhookCode) &&
        Objects.equals(this.linkDeliverySessionId, linkDeliveryCallbackWebhook.linkDeliverySessionId) &&
        Objects.equals(this.timestamp, linkDeliveryCallbackWebhook.timestamp) &&
        Objects.equals(this.error, linkDeliveryCallbackWebhook.error) &&
        Objects.equals(this.linkCallbackMetadata, linkDeliveryCallbackWebhook.linkCallbackMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, linkDeliverySessionId, timestamp, error, linkCallbackMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryCallbackWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    linkDeliverySessionId: ").append(toIndentedString(linkDeliverySessionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    linkCallbackMetadata: ").append(toIndentedString(linkCallbackMetadata)).append("\n");
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

