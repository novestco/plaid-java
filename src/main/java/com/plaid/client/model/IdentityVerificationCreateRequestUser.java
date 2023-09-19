/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.431.7
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
import com.plaid.client.model.IdentityVerificationRequestUserName;
import com.plaid.client.model.UserAddress;
import com.plaid.client.model.UserIDNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * User information collected outside of Link, most likely via your own onboarding process.  Each of the following identity fields are optional:  &#x60;email_address&#x60;  &#x60;phone_number&#x60;  &#x60;date_of_birth&#x60;  &#x60;name&#x60;  &#x60;address&#x60;  &#x60;id_number&#x60;  Specifically, these fields are optional in that they can either be fully provided (satisfying every required field in their subschema) or omitted from the request entirely by not providing the key or value. Providing these fields via the API will result in Link skipping the data collection process for the associated user. All verification steps enabled in the associated Identity Verification Template will still be run. Verification steps will either be run immediately, or once the user completes the &#x60;accept_tos&#x60; step, depending on the value provided to the &#x60;gave_consent&#x60; field. If you are not using the shareable URL feature, you can optionally provide these fields via &#x60;/link/token/create&#x60; instead; both &#x60;/identity_verification/create&#x60; and &#x60;/link/token/create&#x60; are valid ways to provide this information. Note that if you provide a non-&#x60;null&#x60; user data object via &#x60;/identity_verification/create&#x60;, any user data fields entered via &#x60;/link/token/create&#x60; for the same &#x60;client_user_id&#x60; will be ignored when prefilling Link.
 */
@ApiModel(description = "User information collected outside of Link, most likely via your own onboarding process.  Each of the following identity fields are optional:  `email_address`  `phone_number`  `date_of_birth`  `name`  `address`  `id_number`  Specifically, these fields are optional in that they can either be fully provided (satisfying every required field in their subschema) or omitted from the request entirely by not providing the key or value. Providing these fields via the API will result in Link skipping the data collection process for the associated user. All verification steps enabled in the associated Identity Verification Template will still be run. Verification steps will either be run immediately, or once the user completes the `accept_tos` step, depending on the value provided to the `gave_consent` field. If you are not using the shareable URL feature, you can optionally provide these fields via `/link/token/create` instead; both `/identity_verification/create` and `/link/token/create` are valid ways to provide this information. Note that if you provide a non-`null` user data object via `/identity_verification/create`, any user data fields entered via `/link/token/create` for the same `client_user_id` will be ignored when prefilling Link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class IdentityVerificationCreateRequestUser {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private IdentityVerificationRequestUserName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UserAddress address;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private UserIDNumber idNumber;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;


  public IdentityVerificationCreateRequestUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * A valid email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "A valid email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public IdentityVerificationCreateRequestUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19876543212", value = "A phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public IdentityVerificationCreateRequestUser dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public IdentityVerificationCreateRequestUser name(IdentityVerificationRequestUserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationRequestUserName getName() {
    return name;
  }


  public void setName(IdentityVerificationRequestUserName name) {
    this.name = name;
  }


  public IdentityVerificationCreateRequestUser address(UserAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAddress getAddress() {
    return address;
  }


  public void setAddress(UserAddress address) {
    this.address = address;
  }


  public IdentityVerificationCreateRequestUser idNumber(UserIDNumber idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserIDNumber getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(UserIDNumber idNumber) {
    this.idNumber = idNumber;
  }


  public IdentityVerificationCreateRequestUser clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifying &#x60;user.client_user_id&#x60; is deprecated. Please provide &#x60;client_user_id&#x60; at the root level instead.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-db-id-3b24110", value = "Specifying `user.client_user_id` is deprecated. Please provide `client_user_id` at the root level instead.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationCreateRequestUser identityVerificationCreateRequestUser = (IdentityVerificationCreateRequestUser) o;
    return Objects.equals(this.emailAddress, identityVerificationCreateRequestUser.emailAddress) &&
        Objects.equals(this.phoneNumber, identityVerificationCreateRequestUser.phoneNumber) &&
        Objects.equals(this.dateOfBirth, identityVerificationCreateRequestUser.dateOfBirth) &&
        Objects.equals(this.name, identityVerificationCreateRequestUser.name) &&
        Objects.equals(this.address, identityVerificationCreateRequestUser.address) &&
        Objects.equals(this.idNumber, identityVerificationCreateRequestUser.idNumber) &&
        Objects.equals(this.clientUserId, identityVerificationCreateRequestUser.clientUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, phoneNumber, dateOfBirth, name, address, idNumber, clientUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationCreateRequestUser {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
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

