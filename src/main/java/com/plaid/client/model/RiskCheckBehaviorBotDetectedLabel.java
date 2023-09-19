/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.431.7
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
 * Field describing the outcome of a bot detection behavior risk check.  &#x60;yes&#x60; indicates that automated activity was detected.  &#x60;no&#x60; indicates that automated activity was not detected.  &#x60;no_data&#x60; indicates there was not enough information available to give an accurate signal.
 */
@JsonAdapter(RiskCheckBehaviorBotDetectedLabel.Adapter.class)
public enum RiskCheckBehaviorBotDetectedLabel {
  
  YES("yes"),
  
  NO("no"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskCheckBehaviorBotDetectedLabel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskCheckBehaviorBotDetectedLabel fromValue(String value) {
    for (RiskCheckBehaviorBotDetectedLabel b : RiskCheckBehaviorBotDetectedLabel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskCheckBehaviorBotDetectedLabel.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskCheckBehaviorBotDetectedLabel> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskCheckBehaviorBotDetectedLabel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskCheckBehaviorBotDetectedLabel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskCheckBehaviorBotDetectedLabel.fromValue(value);
    }
  }
}

