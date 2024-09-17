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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the given Hosted Link session.  &#x60;CREATED&#x60;: The session is created but not yet accessed by the user  &#x60;OPENED&#x60;: The session is opened by the user but not yet completed  &#x60;EXITED&#x60;: The session has been exited by the user  &#x60;COMPLETED&#x60;: The session has been completed by the user  &#x60;EXPIRED&#x60;: The session has expired
 */
@JsonAdapter(LinkDeliverySessionStatus.Adapter.class)
public enum LinkDeliverySessionStatus {
  
  CREATED("CREATED"),
  
  OPENED("OPENED"),
  
  EXITED("EXITED"),
  
  COMPLETED("COMPLETED"),
  
  EXPIRED("EXPIRED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LinkDeliverySessionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkDeliverySessionStatus fromValue(String value) {
    for (LinkDeliverySessionStatus b : LinkDeliverySessionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return LinkDeliverySessionStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<LinkDeliverySessionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkDeliverySessionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkDeliverySessionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkDeliverySessionStatus.fromValue(value);
    }
  }
}

