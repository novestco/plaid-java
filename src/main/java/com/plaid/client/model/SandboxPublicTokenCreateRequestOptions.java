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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.SandboxPublicTokenCreateRequestOptionsIncomeVerification;
import com.plaid.client.model.SandboxPublicTokenCreateRequestOptionsStatements;
import com.plaid.client.model.SandboxPublicTokenCreateRequestOptionsTransactions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional set of options to be used when configuring the Item. If specified, must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional set of options to be used when configuring the Item. If specified, must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T16:42:02.150702Z[Etc/UTC]")
public class SandboxPublicTokenCreateRequestOptions {
  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_OVERRIDE_USERNAME = "override_username";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_USERNAME)
  private String overrideUsername = "user_good";

  public static final String SERIALIZED_NAME_OVERRIDE_PASSWORD = "override_password";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_PASSWORD)
  private String overridePassword = "pass_good";

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private SandboxPublicTokenCreateRequestOptionsTransactions transactions;

  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private SandboxPublicTokenCreateRequestOptionsStatements statements;

  public static final String SERIALIZED_NAME_INCOME_VERIFICATION = "income_verification";
  @SerializedName(SERIALIZED_NAME_INCOME_VERIFICATION)
  private SandboxPublicTokenCreateRequestOptionsIncomeVerification incomeVerification;


  public SandboxPublicTokenCreateRequestOptions webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Specify a webhook to associate with the new Item.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify a webhook to associate with the new Item.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public SandboxPublicTokenCreateRequestOptions overrideUsername(String overrideUsername) {
    
    this.overrideUsername = overrideUsername;
    return this;
  }

   /**
   * Test username to use for the creation of the Sandbox Item. Default value is &#x60;user_good&#x60;.
   * @return overrideUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test username to use for the creation of the Sandbox Item. Default value is `user_good`.")

  public String getOverrideUsername() {
    return overrideUsername;
  }


  public void setOverrideUsername(String overrideUsername) {
    this.overrideUsername = overrideUsername;
  }


  public SandboxPublicTokenCreateRequestOptions overridePassword(String overridePassword) {
    
    this.overridePassword = overridePassword;
    return this;
  }

   /**
   * Test password to use for the creation of the Sandbox Item. Default value is &#x60;pass_good&#x60;.
   * @return overridePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test password to use for the creation of the Sandbox Item. Default value is `pass_good`.")

  public String getOverridePassword() {
    return overridePassword;
  }


  public void setOverridePassword(String overridePassword) {
    this.overridePassword = overridePassword;
  }


  public SandboxPublicTokenCreateRequestOptions transactions(SandboxPublicTokenCreateRequestOptionsTransactions transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestOptionsTransactions getTransactions() {
    return transactions;
  }


  public void setTransactions(SandboxPublicTokenCreateRequestOptionsTransactions transactions) {
    this.transactions = transactions;
  }


  public SandboxPublicTokenCreateRequestOptions statements(SandboxPublicTokenCreateRequestOptionsStatements statements) {
    
    this.statements = statements;
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestOptionsStatements getStatements() {
    return statements;
  }


  public void setStatements(SandboxPublicTokenCreateRequestOptionsStatements statements) {
    this.statements = statements;
  }


  public SandboxPublicTokenCreateRequestOptions incomeVerification(SandboxPublicTokenCreateRequestOptionsIncomeVerification incomeVerification) {
    
    this.incomeVerification = incomeVerification;
    return this;
  }

   /**
   * Get incomeVerification
   * @return incomeVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestOptionsIncomeVerification getIncomeVerification() {
    return incomeVerification;
  }


  public void setIncomeVerification(SandboxPublicTokenCreateRequestOptionsIncomeVerification incomeVerification) {
    this.incomeVerification = incomeVerification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequestOptions sandboxPublicTokenCreateRequestOptions = (SandboxPublicTokenCreateRequestOptions) o;
    return Objects.equals(this.webhook, sandboxPublicTokenCreateRequestOptions.webhook) &&
        Objects.equals(this.overrideUsername, sandboxPublicTokenCreateRequestOptions.overrideUsername) &&
        Objects.equals(this.overridePassword, sandboxPublicTokenCreateRequestOptions.overridePassword) &&
        Objects.equals(this.transactions, sandboxPublicTokenCreateRequestOptions.transactions) &&
        Objects.equals(this.statements, sandboxPublicTokenCreateRequestOptions.statements) &&
        Objects.equals(this.incomeVerification, sandboxPublicTokenCreateRequestOptions.incomeVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook, overrideUsername, overridePassword, transactions, statements, incomeVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequestOptions {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    overrideUsername: ").append(toIndentedString(overrideUsername)).append("\n");
    sb.append("    overridePassword: ").append(toIndentedString(overridePassword)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    incomeVerification: ").append(toIndentedString(incomeVerification)).append("\n");
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

