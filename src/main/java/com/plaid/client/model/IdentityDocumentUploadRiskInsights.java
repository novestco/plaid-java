/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.534.3
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
import com.plaid.client.model.IdentityDocumentUploadRiskSignal;
import com.plaid.client.model.IdentityDocumentUploadRiskSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * In closed beta. Object representing fraud risk data of the document
 */
@ApiModel(description = "In closed beta. Object representing fraud risk data of the document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class IdentityDocumentUploadRiskInsights {
  public static final String SERIALIZED_NAME_RISK_SUMMARY = "risk_summary";
  @SerializedName(SERIALIZED_NAME_RISK_SUMMARY)
  private IdentityDocumentUploadRiskSummary riskSummary;

  public static final String SERIALIZED_NAME_RISK_SIGNALS = "risk_signals";
  @SerializedName(SERIALIZED_NAME_RISK_SIGNALS)
  private List<IdentityDocumentUploadRiskSignal> riskSignals = null;


  public IdentityDocumentUploadRiskInsights riskSummary(IdentityDocumentUploadRiskSummary riskSummary) {
    
    this.riskSummary = riskSummary;
    return this;
  }

   /**
   * Get riskSummary
   * @return riskSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityDocumentUploadRiskSummary getRiskSummary() {
    return riskSummary;
  }


  public void setRiskSummary(IdentityDocumentUploadRiskSummary riskSummary) {
    this.riskSummary = riskSummary;
  }


  public IdentityDocumentUploadRiskInsights riskSignals(List<IdentityDocumentUploadRiskSignal> riskSignals) {
    
    this.riskSignals = riskSignals;
    return this;
  }

  public IdentityDocumentUploadRiskInsights addRiskSignalsItem(IdentityDocumentUploadRiskSignal riskSignalsItem) {
    if (this.riskSignals == null) {
      this.riskSignals = new ArrayList<>();
    }
    this.riskSignals.add(riskSignalsItem);
    return this;
  }

   /**
   * an array of risk signals
   * @return riskSignals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an array of risk signals")

  public List<IdentityDocumentUploadRiskSignal> getRiskSignals() {
    return riskSignals;
  }


  public void setRiskSignals(List<IdentityDocumentUploadRiskSignal> riskSignals) {
    this.riskSignals = riskSignals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDocumentUploadRiskInsights identityDocumentUploadRiskInsights = (IdentityDocumentUploadRiskInsights) o;
    return Objects.equals(this.riskSummary, identityDocumentUploadRiskInsights.riskSummary) &&
        Objects.equals(this.riskSignals, identityDocumentUploadRiskInsights.riskSignals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskSummary, riskSignals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDocumentUploadRiskInsights {\n");
    sb.append("    riskSummary: ").append(toIndentedString(riskSummary)).append("\n");
    sb.append("    riskSignals: ").append(toIndentedString(riskSignals)).append("\n");
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

