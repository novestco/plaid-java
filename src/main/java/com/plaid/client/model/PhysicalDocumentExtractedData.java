/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.431.7
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
import com.plaid.client.model.IdentityVerificationDocumentAddressResponse;
import com.plaid.client.model.PhysicalDocumentCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Data extracted from a user-submitted document.
 */
@ApiModel(description = "Data extracted from a user-submitted document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class PhysicalDocumentExtractedData {
  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private PhysicalDocumentCategory category;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private String issuingCountry;

  public static final String SERIALIZED_NAME_ISSUING_REGION = "issuing_region";
  @SerializedName(SERIALIZED_NAME_ISSUING_REGION)
  private String issuingRegion;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private IdentityVerificationDocumentAddressResponse address;


  public PhysicalDocumentExtractedData idNumber(String idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Alpha-numeric ID number extracted via OCR from the user&#39;s document image.
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AB123456", required = true, value = "Alpha-numeric ID number extracted via OCR from the user's document image.")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public PhysicalDocumentExtractedData category(PhysicalDocumentCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")

  public PhysicalDocumentCategory getCategory() {
    return category;
  }


  public void setCategory(PhysicalDocumentCategory category) {
    this.category = category;
  }


  public PhysicalDocumentExtractedData expirationDate(LocalDate expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PhysicalDocumentExtractedData issuingCountry(String issuingCountry) {
    
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return issuingCountry
  **/
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getIssuingCountry() {
    return issuingCountry;
  }


  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public PhysicalDocumentExtractedData issuingRegion(String issuingRegion) {
    
    this.issuingRegion = issuingRegion;
    return this;
  }

   /**
   * An ISO 3166-2 subdivision code. Related terms would be \&quot;state\&quot;, \&quot;province\&quot;, \&quot;prefecture\&quot;, \&quot;zone\&quot;, \&quot;subdivision\&quot;, etc.
   * @return issuingRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IN", required = true, value = "An ISO 3166-2 subdivision code. Related terms would be \"state\", \"province\", \"prefecture\", \"zone\", \"subdivision\", etc.")

  public String getIssuingRegion() {
    return issuingRegion;
  }


  public void setIssuingRegion(String issuingRegion) {
    this.issuingRegion = issuingRegion;
  }


  public PhysicalDocumentExtractedData dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date extracted from the document in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date extracted from the document in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PhysicalDocumentExtractedData address(IdentityVerificationDocumentAddressResponse address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationDocumentAddressResponse getAddress() {
    return address;
  }


  public void setAddress(IdentityVerificationDocumentAddressResponse address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalDocumentExtractedData physicalDocumentExtractedData = (PhysicalDocumentExtractedData) o;
    return Objects.equals(this.idNumber, physicalDocumentExtractedData.idNumber) &&
        Objects.equals(this.category, physicalDocumentExtractedData.category) &&
        Objects.equals(this.expirationDate, physicalDocumentExtractedData.expirationDate) &&
        Objects.equals(this.issuingCountry, physicalDocumentExtractedData.issuingCountry) &&
        Objects.equals(this.issuingRegion, physicalDocumentExtractedData.issuingRegion) &&
        Objects.equals(this.dateOfBirth, physicalDocumentExtractedData.dateOfBirth) &&
        Objects.equals(this.address, physicalDocumentExtractedData.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, category, expirationDate, issuingCountry, issuingRegion, dateOfBirth, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalDocumentExtractedData {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    issuingRegion: ").append(toIndentedString(issuingRegion)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

