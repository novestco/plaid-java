/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
import com.plaid.client.model.LinkDeliveryMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Webhook indicating that the status of the delivery of the hosted link session to a user
 */
@ApiModel(description = "Webhook indicating that the status of the delivery of the hosted link session to a user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class LinkUserDeliveryStatusWebhook {
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

  public static final String SERIALIZED_NAME_LINK_DELIVERY_METADATA = "link_delivery_metadata";
  @SerializedName(SERIALIZED_NAME_LINK_DELIVERY_METADATA)
  private LinkDeliveryMetadata linkDeliveryMetadata;


  public LinkUserDeliveryStatusWebhook webhookType(String webhookType) {
    
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


  public LinkUserDeliveryStatusWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DELIVERY_STATUS&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DELIVERY_STATUS`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LinkUserDeliveryStatusWebhook linkDeliverySessionId(String linkDeliverySessionId) {
    
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


  public LinkUserDeliveryStatusWebhook timestamp(String timestamp) {
    
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


  public LinkUserDeliveryStatusWebhook linkDeliveryMetadata(LinkDeliveryMetadata linkDeliveryMetadata) {
    
    this.linkDeliveryMetadata = linkDeliveryMetadata;
    return this;
  }

   /**
   * Get linkDeliveryMetadata
   * @return linkDeliveryMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkDeliveryMetadata getLinkDeliveryMetadata() {
    return linkDeliveryMetadata;
  }


  public void setLinkDeliveryMetadata(LinkDeliveryMetadata linkDeliveryMetadata) {
    this.linkDeliveryMetadata = linkDeliveryMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkUserDeliveryStatusWebhook linkUserDeliveryStatusWebhook = (LinkUserDeliveryStatusWebhook) o;
    return Objects.equals(this.webhookType, linkUserDeliveryStatusWebhook.webhookType) &&
        Objects.equals(this.webhookCode, linkUserDeliveryStatusWebhook.webhookCode) &&
        Objects.equals(this.linkDeliverySessionId, linkUserDeliveryStatusWebhook.linkDeliverySessionId) &&
        Objects.equals(this.timestamp, linkUserDeliveryStatusWebhook.timestamp) &&
        Objects.equals(this.linkDeliveryMetadata, linkUserDeliveryStatusWebhook.linkDeliveryMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, linkDeliverySessionId, timestamp, linkDeliveryMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkUserDeliveryStatusWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    linkDeliverySessionId: ").append(toIndentedString(linkDeliverySessionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    linkDeliveryMetadata: ").append(toIndentedString(linkDeliveryMetadata)).append("\n");
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

