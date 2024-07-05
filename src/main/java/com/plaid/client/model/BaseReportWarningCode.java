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
 * The warning code identifies a specific kind of warning. &#x60;OWNERS_UNAVAILABLE&#x60; indicates that account-owner information is not available. &#x60;TRANSACTIONS_UNAVAILABLE&#x60; indicates that transactions information associated with Credit and Depository accounts are unavailable.
 */
@JsonAdapter(BaseReportWarningCode.Adapter.class)
public enum BaseReportWarningCode {
  
  OWNERS_UNAVAILABLE("OWNERS_UNAVAILABLE"),
  
  TRANSACTIONS_UNAVAILABLE("TRANSACTIONS_UNAVAILABLE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BaseReportWarningCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BaseReportWarningCode fromValue(String value) {
    for (BaseReportWarningCode b : BaseReportWarningCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BaseReportWarningCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BaseReportWarningCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final BaseReportWarningCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BaseReportWarningCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BaseReportWarningCode.fromValue(value);
    }
  }
}

