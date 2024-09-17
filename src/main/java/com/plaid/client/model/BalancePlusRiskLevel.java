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
 * A five-tier risk assessment for the transaction, based on the probability distribution of ACH returns, measured by the incident rate.   Each tier corresponds to a distribution with a different mean (average) probability.   &#x60;HIGH&#x60;: The mean probability of ACH return risk is above 40%. &#x60;MEDIUM_HIGH&#x60;: The mean probability of ACH return risk is 15%-40%.  &#x60;MEDIUM&#x60;: The mean probability of ACH return risk is 5-10%. &#x60;MEDIUM_LOW&#x60;: The mean probability of ACH return risk is 1%-2%. &#x60;LOW&#x60;: The mean probability of ACH return risk is below 1%.   Note that these tiers correspond to probability *distributions* and not to discrete probabilities.   These tier definitions are specific to Balance Plus and do not apply to risk tiers generated by other Plaid endpoints. 
 */
@JsonAdapter(BalancePlusRiskLevel.Adapter.class)
public enum BalancePlusRiskLevel {
  
  HIGH("HIGH"),
  
  MEDIUM_HIGH("MEDIUM_HIGH"),
  
  MEDIUM("MEDIUM"),
  
  MEDIUM_LOW("MEDIUM_LOW"),
  
  LOW("LOW"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BalancePlusRiskLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BalancePlusRiskLevel fromValue(String value) {
    for (BalancePlusRiskLevel b : BalancePlusRiskLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BalancePlusRiskLevel.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BalancePlusRiskLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final BalancePlusRiskLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BalancePlusRiskLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BalancePlusRiskLevel.fromValue(value);
    }
  }
}

