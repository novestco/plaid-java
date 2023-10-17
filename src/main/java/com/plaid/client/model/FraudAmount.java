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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.ISOCurrencyCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The amount and currency of the fraud or attempted fraud. &#x60;fraud_amount&#x60; should be omitted to indicate an unknown fraud amount.
 */
@ApiModel(description = "The amount and currency of the fraud or attempted fraud. `fraud_amount` should be omitted to indicate an unknown fraud amount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class FraudAmount {
  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private ISOCurrencyCode isoCurrencyCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public FraudAmount isoCurrencyCode(ISOCurrencyCode isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * Get isoCurrencyCode
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "")

  public ISOCurrencyCode getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(ISOCurrencyCode isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public FraudAmount value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount value. This value can be 0 to indicate no money was lost. Must not contain more than two digits of precision (e.g., &#x60;1.23&#x60;).
   * @return value
  **/
  @ApiModelProperty(example = "100", required = true, value = "The amount value. This value can be 0 to indicate no money was lost. Must not contain more than two digits of precision (e.g., `1.23`).")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudAmount fraudAmount = (FraudAmount) o;
    return Objects.equals(this.isoCurrencyCode, fraudAmount.isoCurrencyCode) &&
        Objects.equals(this.value, fraudAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCurrencyCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudAmount {\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

