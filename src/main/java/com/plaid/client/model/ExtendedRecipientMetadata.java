/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
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
import com.plaid.client.model.ExtendedRecipientMetadataAllOf;
import com.plaid.client.model.FDXRecipientMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Plaid and FDX-defined recipient metadata fields
 */
@ApiModel(description = "Plaid and FDX-defined recipient metadata fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-09T17:51:17.896278Z[Etc/UTC]")
public class ExtendedRecipientMetadata {
  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "client_name";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_LOGO_URI = "logo_uri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private String logoUri;

  public static final String SERIALIZED_NAME_THIRD_PARTY_LEGAL_NAME = "third_party_legal_name";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_LEGAL_NAME)
  private String thirdPartyLegalName;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_JOINED_DATE = "joined_date";
  @SerializedName(SERIALIZED_NAME_JOINED_DATE)
  private LocalDate joinedDate;

  public static final String SERIALIZED_NAME_CONNECTION_COUNT = "connection_count";
  @SerializedName(SERIALIZED_NAME_CONNECTION_COUNT)
  private Integer connectionCount;


  public ExtendedRecipientMetadata recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The recipient identifier
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The recipient identifier")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public ExtendedRecipientMetadata clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * The recipient name displayed by the Data Provider during the consent flow
   * @return clientName
  **/
  @ApiModelProperty(required = true, value = "The recipient name displayed by the Data Provider during the consent flow")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public ExtendedRecipientMetadata logoUri(String logoUri) {
    
    this.logoUri = logoUri;
    return this;
  }

   /**
   * Data Recipient Logo URL location
   * @return logoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data Recipient Logo URL location")

  public String getLogoUri() {
    return logoUri;
  }


  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }


  public ExtendedRecipientMetadata thirdPartyLegalName(String thirdPartyLegalName) {
    
    this.thirdPartyLegalName = thirdPartyLegalName;
    return this;
  }

   /**
   * The legal name of the recipient
   * @return thirdPartyLegalName
  **/
  @ApiModelProperty(required = true, value = "The legal name of the recipient")

  public String getThirdPartyLegalName() {
    return thirdPartyLegalName;
  }


  public void setThirdPartyLegalName(String thirdPartyLegalName) {
    this.thirdPartyLegalName = thirdPartyLegalName;
  }


  public ExtendedRecipientMetadata category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category that the recipient falls under
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The category that the recipient falls under")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ExtendedRecipientMetadata joinedDate(LocalDate joinedDate) {
    
    this.joinedDate = joinedDate;
    return this;
  }

   /**
   * The date at which the recipient gained production access to Plaid
   * @return joinedDate
  **/
  @ApiModelProperty(example = "Thu Jul 15 00:00:00 UTC 2021", required = true, value = "The date at which the recipient gained production access to Plaid")

  public LocalDate getJoinedDate() {
    return joinedDate;
  }


  public void setJoinedDate(LocalDate joinedDate) {
    this.joinedDate = joinedDate;
  }


  public ExtendedRecipientMetadata connectionCount(Integer connectionCount) {
    
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * The number of Data Partner consumers that are connected to the recipient for the specific Data Partner
   * @return connectionCount
  **/
  @ApiModelProperty(required = true, value = "The number of Data Partner consumers that are connected to the recipient for the specific Data Partner")

  public Integer getConnectionCount() {
    return connectionCount;
  }


  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedRecipientMetadata extendedRecipientMetadata = (ExtendedRecipientMetadata) o;
    return Objects.equals(this.recipientId, extendedRecipientMetadata.recipientId) &&
        Objects.equals(this.clientName, extendedRecipientMetadata.clientName) &&
        Objects.equals(this.logoUri, extendedRecipientMetadata.logoUri) &&
        Objects.equals(this.thirdPartyLegalName, extendedRecipientMetadata.thirdPartyLegalName) &&
        Objects.equals(this.category, extendedRecipientMetadata.category) &&
        Objects.equals(this.joinedDate, extendedRecipientMetadata.joinedDate) &&
        Objects.equals(this.connectionCount, extendedRecipientMetadata.connectionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, clientName, logoUri, thirdPartyLegalName, category, joinedDate, connectionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedRecipientMetadata {\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    thirdPartyLegalName: ").append(toIndentedString(thirdPartyLegalName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    joinedDate: ").append(toIndentedString(joinedDate)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
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
