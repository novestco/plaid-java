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
import com.plaid.client.model.CraPartnerInsightsItem;
import com.plaid.client.model.CraPartnerInsightsPrism;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The Partner Insights report of the bank data for an end user.
 */
@ApiModel(description = "The Partner Insights report of the bank data for an end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class CraPartnerInsights {
  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_GENERATED_TIME = "generated_time";
  @SerializedName(SERIALIZED_NAME_GENERATED_TIME)
  private OffsetDateTime generatedTime;

  public static final String SERIALIZED_NAME_PRISM = "prism";
  @SerializedName(SERIALIZED_NAME_PRISM)
  private CraPartnerInsightsPrism prism;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CraPartnerInsightsItem> items = null;


  public CraPartnerInsights reportId(String reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * A unique identifier associated with the Partner Insights object.
   * @return reportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier associated with the Partner Insights object.")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public CraPartnerInsights generatedTime(OffsetDateTime generatedTime) {
    
    this.generatedTime = generatedTime;
    return this;
  }

   /**
   * The time when the Partner Insights report was generated.
   * @return generatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the Partner Insights report was generated.")

  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }


  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }


  public CraPartnerInsights prism(CraPartnerInsightsPrism prism) {
    
    this.prism = prism;
    return this;
  }

   /**
   * Get prism
   * @return prism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraPartnerInsightsPrism getPrism() {
    return prism;
  }


  public void setPrism(CraPartnerInsightsPrism prism) {
    this.prism = prism;
  }


  public CraPartnerInsights items(List<CraPartnerInsightsItem> items) {
    
    this.items = items;
    return this;
  }

  public CraPartnerInsights addItemsItem(CraPartnerInsightsItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of Items used in the report along with the associated metadata about the Item.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Items used in the report along with the associated metadata about the Item.")

  public List<CraPartnerInsightsItem> getItems() {
    return items;
  }


  public void setItems(List<CraPartnerInsightsItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraPartnerInsights craPartnerInsights = (CraPartnerInsights) o;
    return Objects.equals(this.reportId, craPartnerInsights.reportId) &&
        Objects.equals(this.generatedTime, craPartnerInsights.generatedTime) &&
        Objects.equals(this.prism, craPartnerInsights.prism) &&
        Objects.equals(this.items, craPartnerInsights.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, generatedTime, prism, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraPartnerInsights {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
    sb.append("    prism: ").append(toIndentedString(prism)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

