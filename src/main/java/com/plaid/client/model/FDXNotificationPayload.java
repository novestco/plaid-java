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
import com.plaid.client.model.FDXFiAttribute;
import com.plaid.client.model.FDXNotificationPayloadIdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom key-value pairs payload for a notification
 */
@ApiModel(description = "Custom key-value pairs payload for a notification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class FDXNotificationPayload {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private FDXNotificationPayloadIdType idType;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<FDXFiAttribute> customFields = null;


  public FDXNotificationPayload id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID for the origination entity related to the notification
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID for the origination entity related to the notification")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FDXNotificationPayload idType(FDXNotificationPayloadIdType idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXNotificationPayloadIdType getIdType() {
    return idType;
  }


  public void setIdType(FDXNotificationPayloadIdType idType) {
    this.idType = idType;
  }


  public FDXNotificationPayload customFields(List<FDXFiAttribute> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public FDXNotificationPayload addCustomFieldsItem(FDXFiAttribute customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FDXFiAttribute> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<FDXFiAttribute> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDXNotificationPayload fdXNotificationPayload = (FDXNotificationPayload) o;
    return Objects.equals(this.id, fdXNotificationPayload.id) &&
        Objects.equals(this.idType, fdXNotificationPayload.idType) &&
        Objects.equals(this.customFields, fdXNotificationPayload.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDXNotificationPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

