/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
import com.plaid.client.model.TransferDocumentPurpose;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/diligence/document/upload&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/diligence/document/upload`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class TransferDiligenceDocumentUploadRequest {
  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File file;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private TransferDocumentPurpose purpose;


  public TransferDiligenceDocumentUploadRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * The Client ID of the originator whose document that you want to upload.
   * @return originatorClientId
  **/
  @ApiModelProperty(required = true, value = "The Client ID of the originator whose document that you want to upload.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferDiligenceDocumentUploadRequest file(File file) {
    
    this.file = file;
    return this;
  }

   /**
   * A file to upload.
   * @return file
  **/
  @ApiModelProperty(required = true, value = "A file to upload.")

  public File getFile() {
    return file;
  }


  public void setFile(File file) {
    this.file = file;
  }


  public TransferDiligenceDocumentUploadRequest purpose(TransferDocumentPurpose purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferDocumentPurpose getPurpose() {
    return purpose;
  }


  public void setPurpose(TransferDocumentPurpose purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDiligenceDocumentUploadRequest transferDiligenceDocumentUploadRequest = (TransferDiligenceDocumentUploadRequest) o;
    return Objects.equals(this.originatorClientId, transferDiligenceDocumentUploadRequest.originatorClientId) &&
        Objects.equals(this.file, transferDiligenceDocumentUploadRequest.file) &&
        Objects.equals(this.purpose, transferDiligenceDocumentUploadRequest.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatorClientId, file, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDiligenceDocumentUploadRequest {\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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
