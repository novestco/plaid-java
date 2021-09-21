/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
 * &#x60;investment:&#x60; Investment account  &#x60;credit:&#x60; Credit card  &#x60;depository:&#x60; Depository account  &#x60;loan:&#x60; Loan account  &#x60;brokerage&#x60;: An investment account. Used for &#x60;/assets/&#x60; endpoints only; other endpoints use &#x60;investment&#x60;.  &#x60;other:&#x60; Non-specified account type  See the [Account type schema](https://plaid.com/docs/api/accounts#account-type-schema) for a full listing of account types and corresponding subtypes.
 */
@JsonAdapter(AccountType.Adapter.class)
public enum AccountType {
  
  INVESTMENT("investment"),
  
  CREDIT("credit"),
  
  DEPOSITORY("depository"),
  
  LOAN("loan"),
  
  BROKERAGE("brokerage"),
  
  OTHER("other"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountType fromValue(String value) {
    for (AccountType b : AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AccountType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountType.fromValue(value);
    }
  }
}
