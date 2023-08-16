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
import com.plaid.client.model.BeaconReportType;
import com.plaid.client.model.FraudAmountNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Data for creating a Beacon Report as part of an initial Beacon User creation. Providing a fraud report as part of an initial Beacon User creation will omit the Beacon User from any billing charges.
 */
@ApiModel(description = "Data for creating a Beacon Report as part of an initial Beacon User creation. Providing a fraud report as part of an initial Beacon User creation will omit the Beacon User from any billing charges.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class BeaconUserCreateEmbeddedReport {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BeaconReportType type;

  public static final String SERIALIZED_NAME_FRAUD_DATE = "fraud_date";
  @SerializedName(SERIALIZED_NAME_FRAUD_DATE)
  private LocalDate fraudDate;

  public static final String SERIALIZED_NAME_FRAUD_AMOUNT = "fraud_amount";
  @SerializedName(SERIALIZED_NAME_FRAUD_AMOUNT)
  private FraudAmountNullable fraudAmount;


  public BeaconUserCreateEmbeddedReport type(BeaconReportType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconReportType getType() {
    return type;
  }


  public void setType(BeaconReportType type) {
    this.type = type;
  }


  public BeaconUserCreateEmbeddedReport fraudDate(LocalDate fraudDate) {
    
    this.fraudDate = fraudDate;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return fraudDate
  **/
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", required = true, value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getFraudDate() {
    return fraudDate;
  }


  public void setFraudDate(LocalDate fraudDate) {
    this.fraudDate = fraudDate;
  }


  public BeaconUserCreateEmbeddedReport fraudAmount(FraudAmountNullable fraudAmount) {
    
    this.fraudAmount = fraudAmount;
    return this;
  }

   /**
   * Get fraudAmount
   * @return fraudAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudAmountNullable getFraudAmount() {
    return fraudAmount;
  }


  public void setFraudAmount(FraudAmountNullable fraudAmount) {
    this.fraudAmount = fraudAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserCreateEmbeddedReport beaconUserCreateEmbeddedReport = (BeaconUserCreateEmbeddedReport) o;
    return Objects.equals(this.type, beaconUserCreateEmbeddedReport.type) &&
        Objects.equals(this.fraudDate, beaconUserCreateEmbeddedReport.fraudDate) &&
        Objects.equals(this.fraudAmount, beaconUserCreateEmbeddedReport.fraudAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fraudDate, fraudAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserCreateEmbeddedReport {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fraudDate: ").append(toIndentedString(fraudDate)).append("\n");
    sb.append("    fraudAmount: ").append(toIndentedString(fraudAmount)).append("\n");
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
