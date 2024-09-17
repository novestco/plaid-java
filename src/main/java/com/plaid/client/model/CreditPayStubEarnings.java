/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.565.0
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
import com.plaid.client.model.PayStubEarningsBreakdown;
import com.plaid.client.model.PayStubEarningsTotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing both a breakdown of earnings on a pay stub and the total earnings.
 */
@ApiModel(description = "An object representing both a breakdown of earnings on a pay stub and the total earnings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class CreditPayStubEarnings {
  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private List<PayStubEarningsBreakdown> breakdown = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private PayStubEarningsTotal total;


  public CreditPayStubEarnings breakdown(List<PayStubEarningsBreakdown> breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

  public CreditPayStubEarnings addBreakdownItem(PayStubEarningsBreakdown breakdownItem) {
    this.breakdown.add(breakdownItem);
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PayStubEarningsBreakdown> getBreakdown() {
    return breakdown;
  }


  public void setBreakdown(List<PayStubEarningsBreakdown> breakdown) {
    this.breakdown = breakdown;
  }


  public CreditPayStubEarnings total(PayStubEarningsTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")

  public PayStubEarningsTotal getTotal() {
    return total;
  }


  public void setTotal(PayStubEarningsTotal total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayStubEarnings creditPayStubEarnings = (CreditPayStubEarnings) o;
    return Objects.equals(this.breakdown, creditPayStubEarnings.breakdown) &&
        Objects.equals(this.total, creditPayStubEarnings.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdown, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayStubEarnings {\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

