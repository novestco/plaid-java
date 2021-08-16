/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.20.6
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
import com.plaid.client.model.MFA;
import com.plaid.client.model.OverrideAccounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom test accounts are configured with a JSON configuration object formulated according to the schema below. All fields are optional. Sending an empty object as a configuration will result in an account configured with random balances and transaction history.
 */
@ApiModel(description = "Custom test accounts are configured with a JSON configuration object formulated according to the schema below. All fields are optional. Sending an empty object as a configuration will result in an account configured with random balances and transaction history.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-13T23:02:46.991Z[GMT]")
public class UserCustomPassword {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private String seed;

  public static final String SERIALIZED_NAME_OVERRIDE_ACCOUNTS = "override_accounts";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_ACCOUNTS)
  private List<OverrideAccounts> overrideAccounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_MFA = "mfa";
  @SerializedName(SERIALIZED_NAME_MFA)
  private MFA mfa;

  public static final String SERIALIZED_NAME_RECAPTCHA = "recaptcha";
  @SerializedName(SERIALIZED_NAME_RECAPTCHA)
  private String recaptcha;

  public static final String SERIALIZED_NAME_FORCE_ERROR = "force_error";
  @SerializedName(SERIALIZED_NAME_FORCE_ERROR)
  private String forceError;


  public UserCustomPassword version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the password schema to use, possible values are 1 or 2. The default value is 2. You should only specify 1 if you know it is necessary for your test suite.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the password schema to use, possible values are 1 or 2. The default value is 2. You should only specify 1 if you know it is necessary for your test suite.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public UserCustomPassword seed(String seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * A seed, in the form of a string, that will be used to randomly generate account and transaction data, if this data is not specified using the &#x60;override_accounts&#x60; argument. If no seed is specified, the randomly generated data will be different each time.  Note that transactions data is generated relative to the Item&#39;s creation date. Different Items created on different dates with the same seed for transactions data will have different dates for the transactions. The number of days between each transaction and the Item creation will remain constant. For example, an Item created on December 15 might show a transaction on December 14. An Item created on December 20, using the same seed, would show that same transaction occurring on December 19.
   * @return seed
  **/
  @ApiModelProperty(required = true, value = "A seed, in the form of a string, that will be used to randomly generate account and transaction data, if this data is not specified using the `override_accounts` argument. If no seed is specified, the randomly generated data will be different each time.  Note that transactions data is generated relative to the Item's creation date. Different Items created on different dates with the same seed for transactions data will have different dates for the transactions. The number of days between each transaction and the Item creation will remain constant. For example, an Item created on December 15 might show a transaction on December 14. An Item created on December 20, using the same seed, would show that same transaction occurring on December 19.")

  public String getSeed() {
    return seed;
  }


  public void setSeed(String seed) {
    this.seed = seed;
  }


  public UserCustomPassword overrideAccounts(List<OverrideAccounts> overrideAccounts) {
    
    this.overrideAccounts = overrideAccounts;
    return this;
  }

  public UserCustomPassword addOverrideAccountsItem(OverrideAccounts overrideAccountsItem) {
    this.overrideAccounts.add(overrideAccountsItem);
    return this;
  }

   /**
   * An array of account overrides to configure the accounts for the Item. By default, if no override is specified, transactions and account data will be randomly generated based on the account type and subtype, and other products will have fixed or empty data.
   * @return overrideAccounts
  **/
  @ApiModelProperty(required = true, value = "An array of account overrides to configure the accounts for the Item. By default, if no override is specified, transactions and account data will be randomly generated based on the account type and subtype, and other products will have fixed or empty data.")

  public List<OverrideAccounts> getOverrideAccounts() {
    return overrideAccounts;
  }


  public void setOverrideAccounts(List<OverrideAccounts> overrideAccounts) {
    this.overrideAccounts = overrideAccounts;
  }


  public UserCustomPassword mfa(MFA mfa) {
    
    this.mfa = mfa;
    return this;
  }

   /**
   * Get mfa
   * @return mfa
  **/
  @ApiModelProperty(required = true, value = "")

  public MFA getMfa() {
    return mfa;
  }


  public void setMfa(MFA mfa) {
    this.mfa = mfa;
  }


  public UserCustomPassword recaptcha(String recaptcha) {
    
    this.recaptcha = recaptcha;
    return this;
  }

   /**
   * You may trigger a reCAPTCHA in Plaid Link in the Sandbox environment by using the recaptcha field. Possible values are &#x60;good&#x60; or &#x60;bad&#x60;. A value of &#x60;good&#x60; will result in successful Item creation and &#x60;bad&#x60; will result in a &#x60;RECAPTCHA_BAD&#x60; error to simulate a failed reCAPTCHA. Both values require the reCAPTCHA to be manually solved within Plaid Link.
   * @return recaptcha
  **/
  @ApiModelProperty(required = true, value = "You may trigger a reCAPTCHA in Plaid Link in the Sandbox environment by using the recaptcha field. Possible values are `good` or `bad`. A value of `good` will result in successful Item creation and `bad` will result in a `RECAPTCHA_BAD` error to simulate a failed reCAPTCHA. Both values require the reCAPTCHA to be manually solved within Plaid Link.")

  public String getRecaptcha() {
    return recaptcha;
  }


  public void setRecaptcha(String recaptcha) {
    this.recaptcha = recaptcha;
  }


  public UserCustomPassword forceError(String forceError) {
    
    this.forceError = forceError;
    return this;
  }

   /**
   * An error code to force on Item creation. Possible values are:  &#x60;\&quot;INSTITUTION_NOT_RESPONDING\&quot;&#x60; &#x60;\&quot;INSTITUTION_NO_LONGER_SUPPORTED\&quot;&#x60; &#x60;\&quot;INVALID_CREDENTIALS\&quot;&#x60; &#x60;\&quot;INVALID_MFA\&quot;&#x60; &#x60;\&quot;ITEM_LOCKED\&quot;&#x60; &#x60;\&quot;ITEM_LOGIN_REQUIRED\&quot;&#x60; &#x60;\&quot;ITEM_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;INVALID_LINK_TOKEN\&quot;&#x60; &#x60;\&quot;MFA_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;NO_ACCOUNTS\&quot;&#x60; &#x60;\&quot;PLAID_ERROR\&quot;&#x60; &#x60;\&quot;PRODUCTS_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;USER_SETUP_REQUIRED\&quot;&#x60;
   * @return forceError
  **/
  @ApiModelProperty(required = true, value = "An error code to force on Item creation. Possible values are:  `\"INSTITUTION_NOT_RESPONDING\"` `\"INSTITUTION_NO_LONGER_SUPPORTED\"` `\"INVALID_CREDENTIALS\"` `\"INVALID_MFA\"` `\"ITEM_LOCKED\"` `\"ITEM_LOGIN_REQUIRED\"` `\"ITEM_NOT_SUPPORTED\"` `\"INVALID_LINK_TOKEN\"` `\"MFA_NOT_SUPPORTED\"` `\"NO_ACCOUNTS\"` `\"PLAID_ERROR\"` `\"PRODUCTS_NOT_SUPPORTED\"` `\"USER_SETUP_REQUIRED\"`")

  public String getForceError() {
    return forceError;
  }


  public void setForceError(String forceError) {
    this.forceError = forceError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCustomPassword userCustomPassword = (UserCustomPassword) o;
    return Objects.equals(this.version, userCustomPassword.version) &&
        Objects.equals(this.seed, userCustomPassword.seed) &&
        Objects.equals(this.overrideAccounts, userCustomPassword.overrideAccounts) &&
        Objects.equals(this.mfa, userCustomPassword.mfa) &&
        Objects.equals(this.recaptcha, userCustomPassword.recaptcha) &&
        Objects.equals(this.forceError, userCustomPassword.forceError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, seed, overrideAccounts, mfa, recaptcha, forceError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCustomPassword {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    overrideAccounts: ").append(toIndentedString(overrideAccounts)).append("\n");
    sb.append("    mfa: ").append(toIndentedString(mfa)).append("\n");
    sb.append("    recaptcha: ").append(toIndentedString(recaptcha)).append("\n");
    sb.append("    forceError: ").append(toIndentedString(forceError)).append("\n");
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

