/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
 * The type of event that this transfer represents. Event types with prefix &#x60;sweep&#x60; represents events for Plaid Ledger sweeps.  &#x60;pending&#x60;: A new transfer was created; it is in the pending state.  &#x60;cancelled&#x60;: The transfer was cancelled by the client.  &#x60;failed&#x60;: The transfer failed, no funds were moved.  &#x60;posted&#x60;: The transfer has been successfully submitted to the payment network.  &#x60;settled&#x60;: Credits are available to be withdrawn or debits have been deducted from the Plaid linked account.  &#x60;returned&#x60;: A posted transfer was returned.  &#x60;swept&#x60;: The transfer was swept to / from the sweep account.  &#x60;swept_settled&#x60;: Credits are available to be withdrawn or debits have been deducted from the customer’s business checking account.  &#x60;return_swept&#x60;: Due to the transfer being returned, funds were pulled from or pushed back to the sweep account.  &#x60;sweep.pending&#x60;: A new ledger sweep was created; it is in the pending state.  &#x60;sweep.posted&#x60;: The ledger sweep has been successfully submitted to the payment network.  &#x60;sweep.settled&#x60;: The transaction has settled in the funding account. This means that funds withdrawn from Plaid Ledger balance have reached the funding account, or funds to be deposited into the Plaid Ledger Balance have been pulled, and the hold period has begun.  &#x60;sweep.returned&#x60;: A posted ledger sweep was returned.  &#x60;sweep.failed&#x60;: The ledger sweep failed, no funds were moved.  &#x60;refund.pending&#x60;: A new refund was created; it is in the pending state.  &#x60;refund.cancelled&#x60;: The refund was cancelled.  &#x60;refund.failed&#x60;: The refund failed, no funds were moved.  &#x60;refund.posted&#x60;: The refund has been successfully submitted to the payment network.  &#x60;refund.settled&#x60;: The refund transaction has settled in the Plaid linked account.  &#x60;refund.returned&#x60;: A posted refund was returned.  &#x60;refund.swept&#x60;: The refund was swept from the sweep account.  &#x60;refund.return_swept&#x60;: Due to the refund being returned, funds were pushed back to the sweep account.
 */
@JsonAdapter(TransferEventType.Adapter.class)
public enum TransferEventType {
  
  PENDING("pending"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  POSTED("posted"),
  
  SETTLED("settled"),
  
  RETURNED("returned"),
  
  SWEPT("swept"),
  
  SWEPT_SETTLED("swept_settled"),
  
  RETURN_SWEPT("return_swept"),
  
  SWEEP_PENDING("sweep.pending"),
  
  SWEEP_POSTED("sweep.posted"),
  
  SWEEP_SETTLED("sweep.settled"),
  
  SWEEP_RETURNED("sweep.returned"),
  
  SWEEP_FAILED("sweep.failed"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferEventType fromValue(String value) {
    for (TransferEventType b : TransferEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferEventType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferEventType.fromValue(value);
    }
  }
}

