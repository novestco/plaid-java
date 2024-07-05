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
 * A code representing the reason Plaid declined to guarantee this transfer:  &#x60;RETURN_BANK&#x60;: The risk of a bank-initiated return (for example, an R01/NSF) is too high to guarantee this transfer.  &#x60;RETURN_CUSTOMER&#x60;: The risk of a customer-initiated return (for example, a R10/Unauthorized) is too high to guarantee this transfer.  &#x60;GUARANTEE_LIMIT_REACHED&#x60;: This transfer is low-risk, but Guarantee has exhausted an internal limit on the number or rate of guarantees that applies to this transfer.  &#x60;RISK_ESTIMATE_UNAVAILABLE&#x60;: A risk estimate is unavailable for this Item.  &#x60;REQUIRED_PARAM_MISSING&#x60;: Required fields are missing.
 */
@JsonAdapter(TransferAuthorizationGuaranteeDecisionRationaleCode.Adapter.class)
public enum TransferAuthorizationGuaranteeDecisionRationaleCode {
  
  RETURN_BANK("RETURN_BANK"),
  
  RETURN_CUSTOMER("RETURN_CUSTOMER"),
  
  GUARANTEE_LIMIT_REACHED("GUARANTEE_LIMIT_REACHED"),
  
  RISK_ESTIMATE_UNAVAILABLE("RISK_ESTIMATE_UNAVAILABLE"),
  
  REQUIRED_PARAM_MISSING("REQUIRED_PARAM_MISSING"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferAuthorizationGuaranteeDecisionRationaleCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferAuthorizationGuaranteeDecisionRationaleCode fromValue(String value) {
    for (TransferAuthorizationGuaranteeDecisionRationaleCode b : TransferAuthorizationGuaranteeDecisionRationaleCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferAuthorizationGuaranteeDecisionRationaleCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferAuthorizationGuaranteeDecisionRationaleCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferAuthorizationGuaranteeDecisionRationaleCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferAuthorizationGuaranteeDecisionRationaleCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferAuthorizationGuaranteeDecisionRationaleCode.fromValue(value);
    }
  }
}

