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
 * A code representing the rationale for approving or declining the proposed transfer.  If the &#x60;rationale_code&#x60; is &#x60;null&#x60;, the transfer passed the authorization check.  Any non-&#x60;null&#x60; value for an &#x60;approved&#x60; transfer indicates that the the authorization check could not be run and that you should perform your own risk assessment on the transfer. The code will indicate why the check could not be run. Possible values for an &#x60;approved&#x60; transfer are:  &#x60;MANUALLY_VERIFIED_ITEM&#x60; – Item created via a manual entry flow (i.e. Same Day Micro-deposit, Instant Micro-deposit, Database Insights, or Database Match), limited information available.  &#x60;ITEM_LOGIN_REQUIRED&#x60; – Unable to collect the account information due to Item staleness. Can be resolved by using Link in [update mode](https://www.plaid.com/docs/link/update-mode).  &#x60;MIGRATED_ACCOUNT_ITEM&#x60; - Item created via &#x60;/transfer/account_migration&#x60; endpoint, limited information available.  &#x60;ERROR&#x60; – Unable to collect the account information due to an unspecified error.  The following codes indicate that the authorization decision was &#x60;declined&#x60;:  &#x60;NSF&#x60; – Transaction likely to result in a return due to insufficient funds.  &#x60;RISK&#x60; - Transaction is high-risk.  &#x60;TRANSFER_LIMIT_REACHED&#x60; - One or several transfer limits are reached, e.g. monthly transfer limit. Check the accompanying &#x60;description&#x60; field to understand which limit has been reached.
 */
@JsonAdapter(TransferAuthorizationDecisionRationaleCode.Adapter.class)
public enum TransferAuthorizationDecisionRationaleCode {
  
  NSF("NSF"),
  
  RISK("RISK"),
  
  TRANSFER_LIMIT_REACHED("TRANSFER_LIMIT_REACHED"),
  
  MANUALLY_VERIFIED_ITEM("MANUALLY_VERIFIED_ITEM"),
  
  ITEM_LOGIN_REQUIRED("ITEM_LOGIN_REQUIRED"),
  
  PAYMENT_PROFILE_LOGIN_REQUIRED("PAYMENT_PROFILE_LOGIN_REQUIRED"),
  
  ERROR("ERROR"),
  
  MIGRATED_ACCOUNT_ITEM("MIGRATED_ACCOUNT_ITEM"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferAuthorizationDecisionRationaleCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferAuthorizationDecisionRationaleCode fromValue(String value) {
    for (TransferAuthorizationDecisionRationaleCode b : TransferAuthorizationDecisionRationaleCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferAuthorizationDecisionRationaleCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferAuthorizationDecisionRationaleCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferAuthorizationDecisionRationaleCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferAuthorizationDecisionRationaleCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferAuthorizationDecisionRationaleCode.fromValue(value);
    }
  }
}

