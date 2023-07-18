/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
import com.plaid.client.model.CreditPayStubAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing a payer used by 1099-MISC tax documents.
 */
@ApiModel(description = "An object representing a payer used by 1099-MISC tax documents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class Credit1099Payer {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CreditPayStubAddress address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephone_number";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;


  public Credit1099Payer address(CreditPayStubAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditPayStubAddress getAddress() {
    return address;
  }


  public void setAddress(CreditPayStubAddress address) {
    this.address = address;
  }


  public Credit1099Payer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of payer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of payer.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Credit1099Payer tin(String tin) {
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number of payer.
   * @return tin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax identification number of payer.")

  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    this.tin = tin;
  }


  public Credit1099Payer telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * Telephone number of payer.
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Telephone number of payer.")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit1099Payer credit1099Payer = (Credit1099Payer) o;
    return Objects.equals(this.address, credit1099Payer.address) &&
        Objects.equals(this.name, credit1099Payer.name) &&
        Objects.equals(this.tin, credit1099Payer.tin) &&
        Objects.equals(this.telephoneNumber, credit1099Payer.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, tin, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit1099Payer {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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

