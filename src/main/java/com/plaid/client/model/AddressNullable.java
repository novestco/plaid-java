/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.508.0
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
import com.plaid.client.model.Address;
import com.plaid.client.model.AddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A physical mailing address.
 */
@ApiModel(description = "A physical mailing address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class AddressNullable {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AddressData data;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;


  public AddressNullable data(AddressData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressData getData() {
    return data;
  }


  public void setData(AddressData data) {
    this.data = data;
  }


  public AddressNullable primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * When &#x60;true&#x60;, identifies the address as the primary address on an account.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, identifies the address as the primary address on an account.")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressNullable addressNullable = (AddressNullable) o;
    return Objects.equals(this.data, addressNullable.data) &&
        Objects.equals(this.primary, addressNullable.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressNullable {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

