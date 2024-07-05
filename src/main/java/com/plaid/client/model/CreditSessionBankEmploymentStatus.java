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
 * Status of the Bank Employment Link session.  &#x60;APPROVED&#x60;: User has approved and verified their employment.  &#x60;NO_EMPLOYMENTS_FOUND&#x60;: We attempted, but were unable to find any employment in the connected account.  &#x60;EMPLOYER_NOT_LISTED&#x60;: The user explicitly indicated that they did not see their current or previous employer in the list of employer names found.  &#x60;STARTED&#x60;: The user began the bank income portion of the link flow.  &#x60;INTERNAL_ERROR&#x60;: The user encountered an internal error.
 */
@JsonAdapter(CreditSessionBankEmploymentStatus.Adapter.class)
public enum CreditSessionBankEmploymentStatus {
  
  APPROVED("APPROVED"),
  
  NO_EMPLOYERS_FOUND("NO_EMPLOYERS_FOUND"),
  
  EMPLOYER_NOT_LISTED("EMPLOYER_NOT_LISTED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CreditSessionBankEmploymentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreditSessionBankEmploymentStatus fromValue(String value) {
    for (CreditSessionBankEmploymentStatus b : CreditSessionBankEmploymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CreditSessionBankEmploymentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CreditSessionBankEmploymentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreditSessionBankEmploymentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreditSessionBankEmploymentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreditSessionBankEmploymentStatus.fromValue(value);
    }
  }
}

