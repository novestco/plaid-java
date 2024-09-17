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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies options for initializing Link for use with the Base Report product. This field is required if &#x60;assets&#x60; is included in the &#x60;products&#x60; array and the client is CRA-enabled.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Base Report product. This field is required if `assets` is included in the `products` array and the client is CRA-enabled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class LinkTokenCreateRequestBaseReport {
  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;


  public LinkTokenCreateRequestBaseReport daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The maximum integer number of days of history to include in the Base Report.
   * minimum: 1
   * maximum: 730
   * @return daysRequested
  **/
  @ApiModelProperty(required = true, value = "The maximum integer number of days of history to include in the Base Report.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public LinkTokenCreateRequestBaseReport clientReportId(String clientReportId) {
    
    this.clientReportId = clientReportId;
    return this;
  }

   /**
   * Client-generated identifier, which can be used by lenders to track loan applications.
   * @return clientReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client-generated identifier, which can be used by lenders to track loan applications.")

  public String getClientReportId() {
    return clientReportId;
  }


  public void setClientReportId(String clientReportId) {
    this.clientReportId = clientReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestBaseReport linkTokenCreateRequestBaseReport = (LinkTokenCreateRequestBaseReport) o;
    return Objects.equals(this.daysRequested, linkTokenCreateRequestBaseReport.daysRequested) &&
        Objects.equals(this.clientReportId, linkTokenCreateRequestBaseReport.clientReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysRequested, clientReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestBaseReport {\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
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

