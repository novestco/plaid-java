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
 * Reason why the item is about to be disconnected. &#x60;INSTITUTION_MIGRATION&#x60;: When an institution migrates to API or a different integration, the &#x60;PENDING_DISCONNECT&#x60; webhook will be fired 7 days before the existing Item is scheduled for disconnection. It is recommended to send all Items associated with a given institution through update mode if any Item triggers a &#x60;PENDING_DISCONNECT&#x60; webhook  with a &#x60;reason&#x60; of &#x60;INSTITUTION_MIGRATION&#x60;.
 */
@JsonAdapter(PendingDisconnectWebhookReason.Adapter.class)
public enum PendingDisconnectWebhookReason {
  
  INSTITUTION_MIGRATION("INSTITUTION_MIGRATION"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PendingDisconnectWebhookReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PendingDisconnectWebhookReason fromValue(String value) {
    for (PendingDisconnectWebhookReason b : PendingDisconnectWebhookReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PendingDisconnectWebhookReason.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PendingDisconnectWebhookReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final PendingDisconnectWebhookReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PendingDisconnectWebhookReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PendingDisconnectWebhookReason.fromValue(value);
    }
  }
}
