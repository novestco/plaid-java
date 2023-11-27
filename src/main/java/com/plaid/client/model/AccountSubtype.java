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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * See the [Account type schema](https://plaid.com/docs/api/accounts/#account-type-schema) for a full listing of account types and corresponding subtypes.
 */
@JsonAdapter(AccountSubtype.Adapter.class)
public enum AccountSubtype {
  
  _401A("401a"),
  
  _401K("401k"),
  
  _403B("403B"),
  
  _457B("457b"),
  
  _529("529"),
  
  BROKERAGE("brokerage"),
  
  CASH_ISA("cash isa"),
  
  CRYPTO_EXCHANGE("crypto exchange"),
  
  EDUCATION_SAVINGS_ACCOUNT("education savings account"),
  
  EBT("ebt"),
  
  FIXED_ANNUITY("fixed annuity"),
  
  GIC("gic"),
  
  HEALTH_REIMBURSEMENT_ARRANGEMENT("health reimbursement arrangement"),
  
  HSA("hsa"),
  
  ISA("isa"),
  
  IRA("ira"),
  
  LIF("lif"),
  
  LIFE_INSURANCE("life insurance"),
  
  LIRA("lira"),
  
  LRIF("lrif"),
  
  LRSP("lrsp"),
  
  NON_CUSTODIAL_WALLET("non-custodial wallet"),
  
  NON_TAXABLE_BROKERAGE_ACCOUNT("non-taxable brokerage account"),
  
  OTHER("other"),
  
  OTHER_INSURANCE("other insurance"),
  
  OTHER_ANNUITY("other annuity"),
  
  PRIF("prif"),
  
  RDSP("rdsp"),
  
  RESP("resp"),
  
  RLIF("rlif"),
  
  RRIF("rrif"),
  
  PENSION("pension"),
  
  PROFIT_SHARING_PLAN("profit sharing plan"),
  
  RETIREMENT("retirement"),
  
  ROTH("roth"),
  
  ROTH_401K("roth 401k"),
  
  RRSP("rrsp"),
  
  SEP_IRA("sep ira"),
  
  SIMPLE_IRA("simple ira"),
  
  SIPP("sipp"),
  
  STOCK_PLAN("stock plan"),
  
  THRIFT_SAVINGS_PLAN("thrift savings plan"),
  
  TFSA("tfsa"),
  
  TRUST("trust"),
  
  UGMA("ugma"),
  
  UTMA("utma"),
  
  VARIABLE_ANNUITY("variable annuity"),
  
  CREDIT_CARD("credit card"),
  
  PAYPAL("paypal"),
  
  CD("cd"),
  
  CHECKING("checking"),
  
  SAVINGS("savings"),
  
  MONEY_MARKET("money market"),
  
  PREPAID("prepaid"),
  
  AUTO("auto"),
  
  BUSINESS("business"),
  
  COMMERCIAL("commercial"),
  
  CONSTRUCTION("construction"),
  
  CONSUMER("consumer"),
  
  HOME_EQUITY("home equity"),
  
  LOAN("loan"),
  
  MORTGAGE("mortgage"),
  
  OVERDRAFT("overdraft"),
  
  LINE_OF_CREDIT("line of credit"),
  
  STUDENT("student"),
  
  CASH_MANAGEMENT("cash management"),
  
  KEOGH("keogh"),
  
  MUTUAL_FUND("mutual fund"),
  
  RECURRING("recurring"),
  
  REWARDS("rewards"),
  
  SAFE_DEPOSIT("safe deposit"),
  
  SARSEP("sarsep"),
  
  PAYROLL("payroll"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AccountSubtype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountSubtype fromValue(String value) {
    for (AccountSubtype b : AccountSubtype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<AccountSubtype> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountSubtype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountSubtype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountSubtype.fromValue(value);
    }
  }
}

