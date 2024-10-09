/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.575.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Describes the reason you are generating a Consumer Report for this user.   &#x60;ACCOUNT_REVIEW_CREDIT&#x60;: In connection with a consumer credit transaction for the review or collection of an account pursuant to FCRA Section 604(a)(3)(A).  &#x60;WRITTEN_INSTRUCTION_OTHER&#x60;: In accordance with the written instructions of the consumer pursuant to FCRA Section 604(a)(2), such as when an individual agrees to act as a guarantor or assumes personal liability for a consumer, business, or commercial loan.
 */
@JsonAdapter(MonitoringConsumerReportPermissiblePurpose.Adapter.class)
public enum MonitoringConsumerReportPermissiblePurpose {
  
  ACCOUNT_REVIEW_CREDIT("ACCOUNT_REVIEW_CREDIT"),
  
  WRITTEN_INSTRUCTION_OTHER("WRITTEN_INSTRUCTION_OTHER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  MonitoringConsumerReportPermissiblePurpose(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MonitoringConsumerReportPermissiblePurpose fromValue(String value) {
    for (MonitoringConsumerReportPermissiblePurpose b : MonitoringConsumerReportPermissiblePurpose.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return MonitoringConsumerReportPermissiblePurpose.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<MonitoringConsumerReportPermissiblePurpose> {
    @Override
    public void write(final JsonWriter jsonWriter, final MonitoringConsumerReportPermissiblePurpose enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MonitoringConsumerReportPermissiblePurpose read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MonitoringConsumerReportPermissiblePurpose.fromValue(value);
    }
  }
}
