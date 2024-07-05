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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of a document for risk signal analysis
 */
@JsonAdapter(RiskSignalDocumentStatus.Adapter.class)
public enum RiskSignalDocumentStatus {
  
  PROCESSING("PROCESSING"),
  
  PROCESSING_COMPLETE("PROCESSING_COMPLETE"),
  
  PROCESSING_ERROR("PROCESSING_ERROR"),
  
  PASSWORD_PROTECTED("PASSWORD_PROTECTED"),
  
  VIRUS_DETECTED("VIRUS_DETECTED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskSignalDocumentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskSignalDocumentStatus fromValue(String value) {
    for (RiskSignalDocumentStatus b : RiskSignalDocumentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskSignalDocumentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskSignalDocumentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskSignalDocumentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskSignalDocumentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskSignalDocumentStatus.fromValue(value);
    }
  }
}

