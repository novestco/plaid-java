/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.16.6
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
import com.plaid.client.model.NullableRecipientBACS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExternalPaymentRefundDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-21T20:55:49.221Z[GMT]")
public class ExternalPaymentRefundDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private NullableRecipientBACS bacs = null;


  public ExternalPaymentRefundDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the account holder.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the account holder.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalPaymentRefundDetails iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the account.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the account.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public ExternalPaymentRefundDetails bacs(NullableRecipientBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NullableRecipientBACS getBacs() {
    return bacs;
  }


  public void setBacs(NullableRecipientBACS bacs) {
    this.bacs = bacs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentRefundDetails externalPaymentRefundDetails = (ExternalPaymentRefundDetails) o;
    return Objects.equals(this.name, externalPaymentRefundDetails.name) &&
        Objects.equals(this.iban, externalPaymentRefundDetails.iban) &&
        Objects.equals(this.bacs, externalPaymentRefundDetails.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, iban, bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentRefundDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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

