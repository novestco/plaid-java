/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The details of a digital payroll income verification in Link
 */
@ApiModel(description = "The details of a digital payroll income verification in Link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class CreditSessionPayrollIncomeResult {
  public static final String SERIALIZED_NAME_NUM_PAYSTUBS_RETRIEVED = "num_paystubs_retrieved";
  @SerializedName(SERIALIZED_NAME_NUM_PAYSTUBS_RETRIEVED)
  private Integer numPaystubsRetrieved;

  public static final String SERIALIZED_NAME_NUM_W2S_RETRIEVED = "num_w2s_retrieved";
  @SerializedName(SERIALIZED_NAME_NUM_W2S_RETRIEVED)
  private Integer numW2sRetrieved;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;


  public CreditSessionPayrollIncomeResult numPaystubsRetrieved(Integer numPaystubsRetrieved) {
    
    this.numPaystubsRetrieved = numPaystubsRetrieved;
    return this;
  }

   /**
   * The number of paystubs retrieved from a payroll provider.
   * @return numPaystubsRetrieved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of paystubs retrieved from a payroll provider.")

  public Integer getNumPaystubsRetrieved() {
    return numPaystubsRetrieved;
  }


  public void setNumPaystubsRetrieved(Integer numPaystubsRetrieved) {
    this.numPaystubsRetrieved = numPaystubsRetrieved;
  }


  public CreditSessionPayrollIncomeResult numW2sRetrieved(Integer numW2sRetrieved) {
    
    this.numW2sRetrieved = numW2sRetrieved;
    return this;
  }

   /**
   * The number of w2s retrieved from a payroll provider.
   * @return numW2sRetrieved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of w2s retrieved from a payroll provider.")

  public Integer getNumW2sRetrieved() {
    return numW2sRetrieved;
  }


  public void setNumW2sRetrieved(Integer numW2sRetrieved) {
    this.numW2sRetrieved = numW2sRetrieved;
  }


  public CreditSessionPayrollIncomeResult institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid Institution ID associated with the Item.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid Institution ID associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public CreditSessionPayrollIncomeResult institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The Institution Name associated with the Item.
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Institution Name associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionPayrollIncomeResult creditSessionPayrollIncomeResult = (CreditSessionPayrollIncomeResult) o;
    return Objects.equals(this.numPaystubsRetrieved, creditSessionPayrollIncomeResult.numPaystubsRetrieved) &&
        Objects.equals(this.numW2sRetrieved, creditSessionPayrollIncomeResult.numW2sRetrieved) &&
        Objects.equals(this.institutionId, creditSessionPayrollIncomeResult.institutionId) &&
        Objects.equals(this.institutionName, creditSessionPayrollIncomeResult.institutionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPaystubsRetrieved, numW2sRetrieved, institutionId, institutionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionPayrollIncomeResult {\n");
    sb.append("    numPaystubsRetrieved: ").append(toIndentedString(numPaystubsRetrieved)).append("\n");
    sb.append("    numW2sRetrieved: ").append(toIndentedString(numW2sRetrieved)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
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

