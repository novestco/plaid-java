/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
import com.plaid.client.model.CountryCode;
import com.plaid.client.model.InstitutionsGetByIdRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InstitutionsGetByIdRequest defines the request schema for &#x60;/institutions/get_by_id&#x60;
 */
@ApiModel(description = "InstitutionsGetByIdRequest defines the request schema for `/institutions/get_by_id`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T23:03:50.146Z[GMT]")
public class InstitutionsGetByIdRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private InstitutionsGetByIdRequestOptions options;


  public InstitutionsGetByIdRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public InstitutionsGetByIdRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public InstitutionsGetByIdRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of the institution to get details about
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the institution to get details about")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public InstitutionsGetByIdRequest countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public InstitutionsGetByIdRequest addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * Specify an array of Plaid-supported country codes this institution supports, using the ISO-3166-1 alpha-2 country code standard. 
   * @return countryCodes
  **/
  @ApiModelProperty(required = true, value = "Specify an array of Plaid-supported country codes this institution supports, using the ISO-3166-1 alpha-2 country code standard. ")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public InstitutionsGetByIdRequest options(InstitutionsGetByIdRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionsGetByIdRequestOptions getOptions() {
    return options;
  }


  public void setOptions(InstitutionsGetByIdRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsGetByIdRequest institutionsGetByIdRequest = (InstitutionsGetByIdRequest) o;
    return Objects.equals(this.clientId, institutionsGetByIdRequest.clientId) &&
        Objects.equals(this.secret, institutionsGetByIdRequest.secret) &&
        Objects.equals(this.institutionId, institutionsGetByIdRequest.institutionId) &&
        Objects.equals(this.countryCodes, institutionsGetByIdRequest.countryCodes) &&
        Objects.equals(this.options, institutionsGetByIdRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, institutionId, countryCodes, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsGetByIdRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
