/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
 * Defines the request schema for &#x60;/transfer/list&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class TransferListRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 25;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;


  public TransferListRequest clientId(String clientId) {
    
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


  public TransferListRequest secret(String secret) {
    
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


  public TransferListRequest startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start datetime of transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start datetime of transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TransferListRequest endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end datetime of transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end datetime of transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TransferListRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of transfers to return.
   * minimum: 1
   * maximum: 25
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of transfers to return.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public TransferListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of transfers to skip before returning results.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transfers to skip before returning results.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TransferListRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Filter transfers to only those originated through the specified origination account.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter transfers to only those originated through the specified origination account.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferListRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * Filter transfers to only those with the specified originator client.
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter transfers to only those with the specified originator client.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferListRequest fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * Filter transfers to only those with the specified &#x60;funding_account_id&#x60;.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter transfers to only those with the specified `funding_account_id`.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferListRequest transferListRequest = (TransferListRequest) o;
    return Objects.equals(this.clientId, transferListRequest.clientId) &&
        Objects.equals(this.secret, transferListRequest.secret) &&
        Objects.equals(this.startDate, transferListRequest.startDate) &&
        Objects.equals(this.endDate, transferListRequest.endDate) &&
        Objects.equals(this.count, transferListRequest.count) &&
        Objects.equals(this.offset, transferListRequest.offset) &&
        Objects.equals(this.originationAccountId, transferListRequest.originationAccountId) &&
        Objects.equals(this.originatorClientId, transferListRequest.originatorClientId) &&
        Objects.equals(this.fundingAccountId, transferListRequest.fundingAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, startDate, endDate, count, offset, originationAccountId, originatorClientId, fundingAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferListRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
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

