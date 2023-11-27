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
import com.plaid.client.model.BeaconUserRequestData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request input for creating a Beacon User.  The primary use for this endpoint is to add a new end user to Beacon for fraud and duplicate scanning. This endpoint can also be used to import historical fraud cases into the Beacon Network without being charged for creating a Beacon User. To import historical fraud cases, embed the fraud report in the optional &#x60;report&#x60; section of the request payload.
 */
@ApiModel(description = "Request input for creating a Beacon User.  The primary use for this endpoint is to add a new end user to Beacon for fraud and duplicate scanning. This endpoint can also be used to import historical fraud cases into the Beacon Network without being charged for creating a Beacon User. To import historical fraud cases, embed the fraud report in the optional `report` section of the request payload.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class BeaconUserCreateRequest {
  public static final String SERIALIZED_NAME_PROGRAM_ID = "program_id";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private String programId;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private BeaconUserRequestData user;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;


  public BeaconUserCreateRequest programId(String programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * ID of the associated Beacon Program.
   * @return programId
  **/
  @ApiModelProperty(example = "becprg_11111111111111", required = true, value = "ID of the associated Beacon Program.")

  public String getProgramId() {
    return programId;
  }


  public void setProgramId(String programId) {
    this.programId = programId;
  }


  public BeaconUserCreateRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the &#x60;/link/token/create&#x60; &#x60;client_user_id&#x60; to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the `/link/token/create` `client_user_id` to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public BeaconUserCreateRequest user(BeaconUserRequestData user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserRequestData getUser() {
    return user;
  }


  public void setUser(BeaconUserRequestData user) {
    this.user = user;
  }


  public BeaconUserCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public BeaconUserCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserCreateRequest beaconUserCreateRequest = (BeaconUserCreateRequest) o;
    return Objects.equals(this.programId, beaconUserCreateRequest.programId) &&
        Objects.equals(this.clientUserId, beaconUserCreateRequest.clientUserId) &&
        Objects.equals(this.user, beaconUserCreateRequest.user) &&
        Objects.equals(this.clientId, beaconUserCreateRequest.clientId) &&
        Objects.equals(this.secret, beaconUserCreateRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId, clientUserId, user, clientId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserCreateRequest {\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

