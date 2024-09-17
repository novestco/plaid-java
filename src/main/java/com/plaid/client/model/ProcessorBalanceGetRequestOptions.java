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
import java.time.OffsetDateTime;

/**
 * Optional parameters to &#x60;/processor/balance/get&#x60;.
 */
@ApiModel(description = "Optional parameters to `/processor/balance/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class ProcessorBalanceGetRequestOptions {
  public static final String SERIALIZED_NAME_MIN_LAST_UPDATED_DATETIME = "min_last_updated_datetime";
  @SerializedName(SERIALIZED_NAME_MIN_LAST_UPDATED_DATETIME)
  private OffsetDateTime minLastUpdatedDatetime;


  public ProcessorBalanceGetRequestOptions minLastUpdatedDatetime(OffsetDateTime minLastUpdatedDatetime) {
    
    this.minLastUpdatedDatetime = minLastUpdatedDatetime;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the oldest acceptable balance when making a request to &#x60;/accounts/balance/get&#x60;.  This field is only necessary when the institution is &#x60;ins_128026&#x60; (Capital One), *and* one or more account types being requested is a non-depository account (such as a credit card) as Capital One does not provide real-time balance for non-depository accounts. In this case, a value must be provided or an &#x60;INVALID_REQUEST&#x60; error with the code of &#x60;INVALID_FIELD&#x60; will be returned. For all other institutions, as well as for depository accounts at Capital One (including all checking and savings accounts) this field is ignored and real-time balance information will be fetched.  If this field is not ignored, and no acceptable balance is available, an &#x60;INVALID_RESULT&#x60; error with the code &#x60;LAST_UPDATED_DATETIME_OUT_OF_RANGE&#x60; will be returned.
   * @return minLastUpdatedDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the oldest acceptable balance when making a request to `/accounts/balance/get`.  This field is only necessary when the institution is `ins_128026` (Capital One), *and* one or more account types being requested is a non-depository account (such as a credit card) as Capital One does not provide real-time balance for non-depository accounts. In this case, a value must be provided or an `INVALID_REQUEST` error with the code of `INVALID_FIELD` will be returned. For all other institutions, as well as for depository accounts at Capital One (including all checking and savings accounts) this field is ignored and real-time balance information will be fetched.  If this field is not ignored, and no acceptable balance is available, an `INVALID_RESULT` error with the code `LAST_UPDATED_DATETIME_OUT_OF_RANGE` will be returned.")

  public OffsetDateTime getMinLastUpdatedDatetime() {
    return minLastUpdatedDatetime;
  }


  public void setMinLastUpdatedDatetime(OffsetDateTime minLastUpdatedDatetime) {
    this.minLastUpdatedDatetime = minLastUpdatedDatetime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorBalanceGetRequestOptions processorBalanceGetRequestOptions = (ProcessorBalanceGetRequestOptions) o;
    return Objects.equals(this.minLastUpdatedDatetime, processorBalanceGetRequestOptions.minLastUpdatedDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLastUpdatedDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorBalanceGetRequestOptions {\n");
    sb.append("    minLastUpdatedDatetime: ").append(toIndentedString(minLastUpdatedDatetime)).append("\n");
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

