/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.181.1
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
import com.plaid.client.model.MatchSummaryCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Analysis information describing why a screening hit matched the provided entity information
 */
@ApiModel(description = "Analysis information describing why a screening hit matched the provided entity information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class EntityScreeningHitAnalysis {
  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private MatchSummaryCode documents;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email_addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private MatchSummaryCode emailAddresses;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private MatchSummaryCode locations;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private MatchSummaryCode names;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phone_numbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private MatchSummaryCode phoneNumbers;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private MatchSummaryCode urls;

  public static final String SERIALIZED_NAME_SEARCH_TERMS_VERSION = "search_terms_version";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS_VERSION)
  private Double searchTermsVersion;


  public EntityScreeningHitAnalysis documents(MatchSummaryCode documents) {
    
    this.documents = documents;
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getDocuments() {
    return documents;
  }


  public void setDocuments(MatchSummaryCode documents) {
    this.documents = documents;
  }


  public EntityScreeningHitAnalysis emailAddresses(MatchSummaryCode emailAddresses) {
    
    this.emailAddresses = emailAddresses;
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(MatchSummaryCode emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public EntityScreeningHitAnalysis locations(MatchSummaryCode locations) {
    
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getLocations() {
    return locations;
  }


  public void setLocations(MatchSummaryCode locations) {
    this.locations = locations;
  }


  public EntityScreeningHitAnalysis names(MatchSummaryCode names) {
    
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getNames() {
    return names;
  }


  public void setNames(MatchSummaryCode names) {
    this.names = names;
  }


  public EntityScreeningHitAnalysis phoneNumbers(MatchSummaryCode phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(MatchSummaryCode phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public EntityScreeningHitAnalysis urls(MatchSummaryCode urls) {
    
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummaryCode getUrls() {
    return urls;
  }


  public void setUrls(MatchSummaryCode urls) {
    this.urls = urls;
  }


  public EntityScreeningHitAnalysis searchTermsVersion(Double searchTermsVersion) {
    
    this.searchTermsVersion = searchTermsVersion;
    return this;
  }

   /**
   * The version of the entity screening&#39;s &#x60;search_terms&#x60; that were compared when the entity screening hit was added. entity screening hits are immutable once they have been reviewed. If changes are detected due to updates to the entity screening&#39;s &#x60;search_terms&#x60;, the associated entity program, or the list&#39;s source data prior to review, the entity screening hit will be updated to reflect those changes.
   * @return searchTermsVersion
  **/
  @ApiModelProperty(example = "1", required = true, value = "The version of the entity screening's `search_terms` that were compared when the entity screening hit was added. entity screening hits are immutable once they have been reviewed. If changes are detected due to updates to the entity screening's `search_terms`, the associated entity program, or the list's source data prior to review, the entity screening hit will be updated to reflect those changes.")

  public Double getSearchTermsVersion() {
    return searchTermsVersion;
  }


  public void setSearchTermsVersion(Double searchTermsVersion) {
    this.searchTermsVersion = searchTermsVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityScreeningHitAnalysis entityScreeningHitAnalysis = (EntityScreeningHitAnalysis) o;
    return Objects.equals(this.documents, entityScreeningHitAnalysis.documents) &&
        Objects.equals(this.emailAddresses, entityScreeningHitAnalysis.emailAddresses) &&
        Objects.equals(this.locations, entityScreeningHitAnalysis.locations) &&
        Objects.equals(this.names, entityScreeningHitAnalysis.names) &&
        Objects.equals(this.phoneNumbers, entityScreeningHitAnalysis.phoneNumbers) &&
        Objects.equals(this.urls, entityScreeningHitAnalysis.urls) &&
        Objects.equals(this.searchTermsVersion, entityScreeningHitAnalysis.searchTermsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, emailAddresses, locations, names, phoneNumbers, urls, searchTermsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityScreeningHitAnalysis {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    searchTermsVersion: ").append(toIndentedString(searchTermsVersion)).append("\n");
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

