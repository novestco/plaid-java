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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the device being used to initiate the authorization.
 */
@ApiModel(description = "Information about the device being used to initiate the authorization.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class TransferDevice {
  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;


  public TransferDevice ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the device being used to initiate the authorization.
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "The IP address of the device being used to initiate the authorization.")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public TransferDevice userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user agent of the device being used to initiate the authorization.
   * @return userAgent
  **/
  @ApiModelProperty(required = true, value = "The user agent of the device being used to initiate the authorization.")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDevice transferDevice = (TransferDevice) o;
    return Objects.equals(this.ipAddress, transferDevice.ipAddress) &&
        Objects.equals(this.userAgent, transferDevice.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDevice {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

