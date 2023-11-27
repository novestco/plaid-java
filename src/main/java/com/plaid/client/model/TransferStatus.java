/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.474.0
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
 * The status of the transfer.  &#x60;pending&#x60;: A new transfer was created; it is in the pending state. &#x60;posted&#x60;: The transfer has been successfully submitted to the payment network. &#x60;settled&#x60;: Credits are available to be withdrawn or debits have been deducted from the Plaid linked account. &#x60;cancelled&#x60;: The transfer was cancelled by the client. &#x60;failed&#x60;: The transfer failed, no funds were moved. &#x60;returned&#x60;: A posted transfer was returned.
 */
@JsonAdapter(TransferStatus.Adapter.class)
public enum TransferStatus {
  
  PENDING("pending"),
  
  POSTED("posted"),
  
  SETTLED("settled"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  RETURNED("returned"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferStatus fromValue(String value) {
    for (TransferStatus b : TransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferStatus.fromValue(value);
    }
  }
}

