/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.534.3
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
import com.plaid.client.model.TransactionStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRecurringCreateResponse defines the response schema for the &#x60;/transactions/recurring/streams/create&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringCreateResponse defines the response schema for the `/transactions/recurring/streams/create` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class TransactionsRecurringCreateResponse {
  public static final String SERIALIZED_NAME_ADDED_STREAMS = "added_streams";
  @SerializedName(SERIALIZED_NAME_ADDED_STREAMS)
  private List<TransactionStream> addedStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIED_STREAMS = "modified_streams";
  @SerializedName(SERIALIZED_NAME_MODIFIED_STREAMS)
  private List<TransactionStream> modifiedStreams = null;

  public static final String SERIALIZED_NAME_REMOVED_STREAM_IDS = "removed_stream_ids";
  @SerializedName(SERIALIZED_NAME_REMOVED_STREAM_IDS)
  private List<String> removedStreamIds = null;


  public TransactionsRecurringCreateResponse addedStreams(List<TransactionStream> addedStreams) {
    
    this.addedStreams = addedStreams;
    return this;
  }

  public TransactionsRecurringCreateResponse addAddedStreamsItem(TransactionStream addedStreamsItem) {
    this.addedStreams.add(addedStreamsItem);
    return this;
  }

   /**
   * Streams created as a result of the operation.
   * @return addedStreams
  **/
  @ApiModelProperty(required = true, value = "Streams created as a result of the operation.")

  public List<TransactionStream> getAddedStreams() {
    return addedStreams;
  }


  public void setAddedStreams(List<TransactionStream> addedStreams) {
    this.addedStreams = addedStreams;
  }


  public TransactionsRecurringCreateResponse modifiedStreams(List<TransactionStream> modifiedStreams) {
    
    this.modifiedStreams = modifiedStreams;
    return this;
  }

  public TransactionsRecurringCreateResponse addModifiedStreamsItem(TransactionStream modifiedStreamsItem) {
    if (this.modifiedStreams == null) {
      this.modifiedStreams = new ArrayList<>();
    }
    this.modifiedStreams.add(modifiedStreamsItem);
    return this;
  }

   /**
   * Other streams with transactions removed from them as a result of the operation (in no particular order).
   * @return modifiedStreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other streams with transactions removed from them as a result of the operation (in no particular order).")

  public List<TransactionStream> getModifiedStreams() {
    return modifiedStreams;
  }


  public void setModifiedStreams(List<TransactionStream> modifiedStreams) {
    this.modifiedStreams = modifiedStreams;
  }


  public TransactionsRecurringCreateResponse removedStreamIds(List<String> removedStreamIds) {
    
    this.removedStreamIds = removedStreamIds;
    return this;
  }

  public TransactionsRecurringCreateResponse addRemovedStreamIdsItem(String removedStreamIdsItem) {
    if (this.removedStreamIds == null) {
      this.removedStreamIds = new ArrayList<>();
    }
    this.removedStreamIds.add(removedStreamIdsItem);
    return this;
  }

   /**
   * The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).
   * @return removedStreamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).")

  public List<String> getRemovedStreamIds() {
    return removedStreamIds;
  }


  public void setRemovedStreamIds(List<String> removedStreamIds) {
    this.removedStreamIds = removedStreamIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRecurringCreateResponse transactionsRecurringCreateResponse = (TransactionsRecurringCreateResponse) o;
    return Objects.equals(this.addedStreams, transactionsRecurringCreateResponse.addedStreams) &&
        Objects.equals(this.modifiedStreams, transactionsRecurringCreateResponse.modifiedStreams) &&
        Objects.equals(this.removedStreamIds, transactionsRecurringCreateResponse.removedStreamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedStreams, modifiedStreams, removedStreamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringCreateResponse {\n");
    sb.append("    addedStreams: ").append(toIndentedString(addedStreams)).append("\n");
    sb.append("    modifiedStreams: ").append(toIndentedString(modifiedStreams)).append("\n");
    sb.append("    removedStreamIds: ").append(toIndentedString(removedStreamIds)).append("\n");
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

