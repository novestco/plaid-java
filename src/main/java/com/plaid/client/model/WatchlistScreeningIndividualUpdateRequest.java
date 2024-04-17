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
import com.plaid.client.model.UpdateIndividualScreeningRequestSearchTerms;
import com.plaid.client.model.WatchlistScreeningIndividualUpdateRequestResettableField;
import com.plaid.client.model.WatchlistScreeningStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request input for editing an individual watchlist screening
 */
@ApiModel(description = "Request input for editing an individual watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class WatchlistScreeningIndividualUpdateRequest {
  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING_ID = "watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING_ID)
  private String watchlistScreeningId;

  public static final String SERIALIZED_NAME_SEARCH_TERMS = "search_terms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  private UpdateIndividualScreeningRequestSearchTerms searchTerms;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private String assignee;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WatchlistScreeningStatus status;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_RESET_FIELDS = "reset_fields";
  @SerializedName(SERIALIZED_NAME_RESET_FIELDS)
  private List<WatchlistScreeningIndividualUpdateRequestResettableField> resetFields = null;


  public WatchlistScreeningIndividualUpdateRequest watchlistScreeningId(String watchlistScreeningId) {
    
    this.watchlistScreeningId = watchlistScreeningId;
    return this;
  }

   /**
   * ID of the associated screening.
   * @return watchlistScreeningId
  **/
  @ApiModelProperty(example = "scr_52xR9LKo77r1Np", required = true, value = "ID of the associated screening.")

  public String getWatchlistScreeningId() {
    return watchlistScreeningId;
  }


  public void setWatchlistScreeningId(String watchlistScreeningId) {
    this.watchlistScreeningId = watchlistScreeningId;
  }


  public WatchlistScreeningIndividualUpdateRequest searchTerms(UpdateIndividualScreeningRequestSearchTerms searchTerms) {
    
    this.searchTerms = searchTerms;
    return this;
  }

   /**
   * Get searchTerms
   * @return searchTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateIndividualScreeningRequestSearchTerms getSearchTerms() {
    return searchTerms;
  }


  public void setSearchTerms(UpdateIndividualScreeningRequestSearchTerms searchTerms) {
    this.searchTerms = searchTerms;
  }


  public WatchlistScreeningIndividualUpdateRequest assignee(String assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * ID of the associated user.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "54350110fedcbaf01234ffee", value = "ID of the associated user.")

  public String getAssignee() {
    return assignee;
  }


  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }


  public WatchlistScreeningIndividualUpdateRequest status(WatchlistScreeningStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WatchlistScreeningStatus getStatus() {
    return status;
  }


  public void setStatus(WatchlistScreeningStatus status) {
    this.status = status;
  }


  public WatchlistScreeningIndividualUpdateRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the &#x60;/link/token/create&#x60; &#x60;client_user_id&#x60; to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-db-id-3b24110", value = "A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the `/link/token/create` `client_user_id` to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public WatchlistScreeningIndividualUpdateRequest clientId(String clientId) {
    
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


  public WatchlistScreeningIndividualUpdateRequest secret(String secret) {
    
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


  public WatchlistScreeningIndividualUpdateRequest resetFields(List<WatchlistScreeningIndividualUpdateRequestResettableField> resetFields) {
    
    this.resetFields = resetFields;
    return this;
  }

  public WatchlistScreeningIndividualUpdateRequest addResetFieldsItem(WatchlistScreeningIndividualUpdateRequestResettableField resetFieldsItem) {
    if (this.resetFields == null) {
      this.resetFields = new ArrayList<>();
    }
    this.resetFields.add(resetFieldsItem);
    return this;
  }

   /**
   * A list of fields to reset back to null
   * @return resetFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of fields to reset back to null")

  public List<WatchlistScreeningIndividualUpdateRequestResettableField> getResetFields() {
    return resetFields;
  }


  public void setResetFields(List<WatchlistScreeningIndividualUpdateRequestResettableField> resetFields) {
    this.resetFields = resetFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningIndividualUpdateRequest watchlistScreeningIndividualUpdateRequest = (WatchlistScreeningIndividualUpdateRequest) o;
    return Objects.equals(this.watchlistScreeningId, watchlistScreeningIndividualUpdateRequest.watchlistScreeningId) &&
        Objects.equals(this.searchTerms, watchlistScreeningIndividualUpdateRequest.searchTerms) &&
        Objects.equals(this.assignee, watchlistScreeningIndividualUpdateRequest.assignee) &&
        Objects.equals(this.status, watchlistScreeningIndividualUpdateRequest.status) &&
        Objects.equals(this.clientUserId, watchlistScreeningIndividualUpdateRequest.clientUserId) &&
        Objects.equals(this.clientId, watchlistScreeningIndividualUpdateRequest.clientId) &&
        Objects.equals(this.secret, watchlistScreeningIndividualUpdateRequest.secret) &&
        Objects.equals(this.resetFields, watchlistScreeningIndividualUpdateRequest.resetFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistScreeningId, searchTerms, assignee, status, clientUserId, clientId, secret, resetFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningIndividualUpdateRequest {\n");
    sb.append("    watchlistScreeningId: ").append(toIndentedString(watchlistScreeningId)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    resetFields: ").append(toIndentedString(resetFields)).append("\n");
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

