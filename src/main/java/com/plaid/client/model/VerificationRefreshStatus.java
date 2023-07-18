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
 * The verification refresh status. One of the following:  &#x60;\&quot;VERIFICATION_REFRESH_STATUS_USER_PRESENCE_REQUIRED\&quot;&#x60; User presence is required to refresh an income verification. &#x60;\&quot;VERIFICATION_REFRESH_SUCCESSFUL\&quot;&#x60; The income verification refresh was successful. &#x60;\&quot;VERIFICATION_REFRESH_NOT_FOUND\&quot;&#x60; No new data was found after the income verification refresh.
 */
@JsonAdapter(VerificationRefreshStatus.Adapter.class)
public enum VerificationRefreshStatus {
  
  STATUS_USER_PRESENCE_REQUIRED("VERIFICATION_REFRESH_STATUS_USER_PRESENCE_REQUIRED"),
  
  SUCCESSFUL("VERIFICATION_REFRESH_SUCCESSFUL"),
  
  NOT_FOUND("VERIFICATION_REFRESH_NOT_FOUND"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  VerificationRefreshStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VerificationRefreshStatus fromValue(String value) {
    for (VerificationRefreshStatus b : VerificationRefreshStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return VerificationRefreshStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<VerificationRefreshStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final VerificationRefreshStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VerificationRefreshStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VerificationRefreshStatus.fromValue(value);
    }
  }
}

