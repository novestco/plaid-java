/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.FraudAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Request input for creating a Beacon Report
 */
@ApiModel(description = "Request input for creating a Beacon Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class BeaconReportCreateRequest {
  public static final String SERIALIZED_NAME_BEACON_USER_ID = "beacon_user_id";
  @SerializedName(SERIALIZED_NAME_BEACON_USER_ID)
  private String beaconUserId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BeaconReportType type;

  public static final String SERIALIZED_NAME_FRAUD_DATE = "fraud_date";
  @SerializedName(SERIALIZED_NAME_FRAUD_DATE)
  private LocalDate fraudDate;

  public static final String SERIALIZED_NAME_FRAUD_AMOUNT = "fraud_amount";
  @SerializedName(SERIALIZED_NAME_FRAUD_AMOUNT)
  private FraudAmount fraudAmount;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;


  public BeaconReportCreateRequest beaconUserId(String beaconUserId) {
    
    this.beaconUserId = beaconUserId;
    return this;
  }

   /**
   * ID of the associated Beacon User.
   * @return beaconUserId
  **/
  @ApiModelProperty(example = "becusr_42cF1MNo42r9Xj", required = true, value = "ID of the associated Beacon User.")

  public String getBeaconUserId() {
    return beaconUserId;
  }


  public void setBeaconUserId(String beaconUserId) {
    this.beaconUserId = beaconUserId;
  }


  public BeaconReportCreateRequest type(BeaconReportType type) {
    
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


  public BeaconReportCreateRequest fraudDate(LocalDate fraudDate) {
    
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


  public BeaconReportCreateRequest fraudAmount(FraudAmount fraudAmount) {
    
    this.fraudAmount = fraudAmount;
    return this;
  }

   /**
   * Get fraudAmount
   * @return fraudAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudAmount getFraudAmount() {
    return fraudAmount;
  }


  public void setFraudAmount(FraudAmount fraudAmount) {
    this.fraudAmount = fraudAmount;
  }


  public BeaconReportCreateRequest clientId(String clientId) {
    
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


  public BeaconReportCreateRequest secret(String secret) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconReportCreateRequest beaconReportCreateRequest = (BeaconReportCreateRequest) o;
    return Objects.equals(this.beaconUserId, beaconReportCreateRequest.beaconUserId) &&
        Objects.equals(this.type, beaconReportCreateRequest.type) &&
        Objects.equals(this.fraudDate, beaconReportCreateRequest.fraudDate) &&
        Objects.equals(this.fraudAmount, beaconReportCreateRequest.fraudAmount) &&
        Objects.equals(this.clientId, beaconReportCreateRequest.clientId) &&
        Objects.equals(this.secret, beaconReportCreateRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beaconUserId, type, fraudDate, fraudAmount, clientId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportCreateRequest {\n");
    sb.append("    beaconUserId: ").append(toIndentedString(beaconUserId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fraudDate: ").append(toIndentedString(fraudDate)).append("\n");
    sb.append("    fraudAmount: ").append(toIndentedString(fraudAmount)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

