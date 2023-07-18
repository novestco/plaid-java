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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Flow types to retrieve payroll income data
 */
@JsonAdapter(IncomeVerificationPayrollFlowType.Adapter.class)
public enum IncomeVerificationPayrollFlowType {
  
  DIGITAL_INCOME("payroll_digital_income"),
  
  DOCUMENT_INCOME("payroll_document_income"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IncomeVerificationPayrollFlowType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IncomeVerificationPayrollFlowType fromValue(String value) {
    for (IncomeVerificationPayrollFlowType b : IncomeVerificationPayrollFlowType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IncomeVerificationPayrollFlowType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IncomeVerificationPayrollFlowType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IncomeVerificationPayrollFlowType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IncomeVerificationPayrollFlowType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IncomeVerificationPayrollFlowType.fromValue(value);
    }
  }
}

