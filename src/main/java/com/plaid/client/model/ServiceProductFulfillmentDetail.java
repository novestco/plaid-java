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
import com.plaid.client.model.ServiceProductFulfillmentIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class ServiceProductFulfillmentDetail {
  public static final String SERIALIZED_NAME_VENDOR_ORDER_IDENTIFIER = "VendorOrderIdentifier";
  @SerializedName(SERIALIZED_NAME_VENDOR_ORDER_IDENTIFIER)
  private String vendorOrderIdentifier;

  public static final String SERIALIZED_NAME_SERVICE_PRODUCT_FULFILLMENT_IDENTIFIER = "ServiceProductFulfillmentIdentifier";
  @SerializedName(SERIALIZED_NAME_SERVICE_PRODUCT_FULFILLMENT_IDENTIFIER)
  private ServiceProductFulfillmentIdentifier serviceProductFulfillmentIdentifier;


  public ServiceProductFulfillmentDetail vendorOrderIdentifier(String vendorOrderIdentifier) {
    
    this.vendorOrderIdentifier = vendorOrderIdentifier;
    return this;
  }

   /**
   * A string that uniquely identifies a type of order Verification of Asset.
   * @return vendorOrderIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string that uniquely identifies a type of order Verification of Asset.")

  public String getVendorOrderIdentifier() {
    return vendorOrderIdentifier;
  }


  public void setVendorOrderIdentifier(String vendorOrderIdentifier) {
    this.vendorOrderIdentifier = vendorOrderIdentifier;
  }


  public ServiceProductFulfillmentDetail serviceProductFulfillmentIdentifier(ServiceProductFulfillmentIdentifier serviceProductFulfillmentIdentifier) {
    
    this.serviceProductFulfillmentIdentifier = serviceProductFulfillmentIdentifier;
    return this;
  }

   /**
   * Get serviceProductFulfillmentIdentifier
   * @return serviceProductFulfillmentIdentifier
  **/
  @ApiModelProperty(required = true, value = "")

  public ServiceProductFulfillmentIdentifier getServiceProductFulfillmentIdentifier() {
    return serviceProductFulfillmentIdentifier;
  }


  public void setServiceProductFulfillmentIdentifier(ServiceProductFulfillmentIdentifier serviceProductFulfillmentIdentifier) {
    this.serviceProductFulfillmentIdentifier = serviceProductFulfillmentIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProductFulfillmentDetail serviceProductFulfillmentDetail = (ServiceProductFulfillmentDetail) o;
    return Objects.equals(this.vendorOrderIdentifier, serviceProductFulfillmentDetail.vendorOrderIdentifier) &&
        Objects.equals(this.serviceProductFulfillmentIdentifier, serviceProductFulfillmentDetail.serviceProductFulfillmentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorOrderIdentifier, serviceProductFulfillmentIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProductFulfillmentDetail {\n");
    sb.append("    vendorOrderIdentifier: ").append(toIndentedString(vendorOrderIdentifier)).append("\n");
    sb.append("    serviceProductFulfillmentIdentifier: ").append(toIndentedString(serviceProductFulfillmentIdentifier)).append("\n");
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

