/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.181.1
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
import com.plaid.client.model.PersonalFinanceCategory;
import com.plaid.client.model.RecurringTransactionFrequency;
import com.plaid.client.model.TransactionStreamAmount;
import com.plaid.client.model.TransactionStreamStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A grouping of related transactions
 */
@ApiModel(description = "A grouping of related transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class TransactionStream {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<String> category = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_FIRST_DATE = "first_date";
  @SerializedName(SERIALIZED_NAME_FIRST_DATE)
  private LocalDate firstDate;

  public static final String SERIALIZED_NAME_LAST_DATE = "last_date";
  @SerializedName(SERIALIZED_NAME_LAST_DATE)
  private LocalDate lastDate;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private RecurringTransactionFrequency frequency;

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVERAGE_AMOUNT = "average_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_AMOUNT)
  private TransactionStreamAmount averageAmount;

  public static final String SERIALIZED_NAME_LAST_AMOUNT = "last_amount";
  @SerializedName(SERIALIZED_NAME_LAST_AMOUNT)
  private TransactionStreamAmount lastAmount;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStreamStatus status;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory;


  public TransactionStream accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the stream belongs
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account to which the stream belongs")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransactionStream streamId(String streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * A unique id for the stream
   * @return streamId
  **/
  @ApiModelProperty(required = true, value = "A unique id for the stream")

  public String getStreamId() {
    return streamId;
  }


  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public TransactionStream categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public TransactionStream category(List<String> category) {
    
    this.category = category;
    return this;
  }

  public TransactionStream addCategoryItem(String categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).
   * @return category
  **/
  @ApiModelProperty(required = true, value = "A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).")

  public List<String> getCategory() {
    return category;
  }


  public void setCategory(List<String> category) {
    this.category = category;
  }


  public TransactionStream description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the transaction stream.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of the transaction stream.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionStream merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant associated with the transaction stream.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The merchant associated with the transaction stream.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public TransactionStream firstDate(LocalDate firstDate) {
    
    this.firstDate = firstDate;
    return this;
  }

   /**
   * The posted date of the earliest transaction in the stream.
   * @return firstDate
  **/
  @ApiModelProperty(required = true, value = "The posted date of the earliest transaction in the stream.")

  public LocalDate getFirstDate() {
    return firstDate;
  }


  public void setFirstDate(LocalDate firstDate) {
    this.firstDate = firstDate;
  }


  public TransactionStream lastDate(LocalDate lastDate) {
    
    this.lastDate = lastDate;
    return this;
  }

   /**
   * The posted date of the latest transaction in the stream.
   * @return lastDate
  **/
  @ApiModelProperty(required = true, value = "The posted date of the latest transaction in the stream.")

  public LocalDate getLastDate() {
    return lastDate;
  }


  public void setLastDate(LocalDate lastDate) {
    this.lastDate = lastDate;
  }


  public TransactionStream frequency(RecurringTransactionFrequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "")

  public RecurringTransactionFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(RecurringTransactionFrequency frequency) {
    this.frequency = frequency;
  }


  public TransactionStream transactionIds(List<String> transactionIds) {
    
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionStream addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * An array of Plaid transaction IDs belonging to the stream, sorted by posted date.
   * @return transactionIds
  **/
  @ApiModelProperty(required = true, value = "An array of Plaid transaction IDs belonging to the stream, sorted by posted date.")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }


  public TransactionStream averageAmount(TransactionStreamAmount averageAmount) {
    
    this.averageAmount = averageAmount;
    return this;
  }

   /**
   * Get averageAmount
   * @return averageAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionStreamAmount getAverageAmount() {
    return averageAmount;
  }


  public void setAverageAmount(TransactionStreamAmount averageAmount) {
    this.averageAmount = averageAmount;
  }


  public TransactionStream lastAmount(TransactionStreamAmount lastAmount) {
    
    this.lastAmount = lastAmount;
    return this;
  }

   /**
   * Get lastAmount
   * @return lastAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionStreamAmount getLastAmount() {
    return lastAmount;
  }


  public void setLastAmount(TransactionStreamAmount lastAmount) {
    this.lastAmount = lastAmount;
  }


  public TransactionStream isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates whether the transaction stream is still live.
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the transaction stream is still live.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public TransactionStream status(TransactionStreamStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionStreamStatus getStatus() {
    return status;
  }


  public void setStatus(TransactionStreamStatus status) {
    this.status = status;
  }


  public TransactionStream personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStream transactionStream = (TransactionStream) o;
    return Objects.equals(this.accountId, transactionStream.accountId) &&
        Objects.equals(this.streamId, transactionStream.streamId) &&
        Objects.equals(this.categoryId, transactionStream.categoryId) &&
        Objects.equals(this.category, transactionStream.category) &&
        Objects.equals(this.description, transactionStream.description) &&
        Objects.equals(this.merchantName, transactionStream.merchantName) &&
        Objects.equals(this.firstDate, transactionStream.firstDate) &&
        Objects.equals(this.lastDate, transactionStream.lastDate) &&
        Objects.equals(this.frequency, transactionStream.frequency) &&
        Objects.equals(this.transactionIds, transactionStream.transactionIds) &&
        Objects.equals(this.averageAmount, transactionStream.averageAmount) &&
        Objects.equals(this.lastAmount, transactionStream.lastAmount) &&
        Objects.equals(this.isActive, transactionStream.isActive) &&
        Objects.equals(this.status, transactionStream.status) &&
        Objects.equals(this.personalFinanceCategory, transactionStream.personalFinanceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, streamId, categoryId, category, description, merchantName, firstDate, lastDate, frequency, transactionIds, averageAmount, lastAmount, isActive, status, personalFinanceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStream {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
    sb.append("    averageAmount: ").append(toIndentedString(averageAmount)).append("\n");
    sb.append("    lastAmount: ").append(toIndentedString(lastAmount)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
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

