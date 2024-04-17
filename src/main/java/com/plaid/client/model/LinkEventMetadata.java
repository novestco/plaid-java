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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Metadata about an event that occured while the user was going through Link
 */
@ApiModel(description = "Metadata about an event that occured while the user was going through Link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-17T20:52:19.180696Z[Etc/UTC]")
public class LinkEventMetadata {
  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_EXIT_STATUS = "exit_status";
  @SerializedName(SERIALIZED_NAME_EXIT_STATUS)
  private String exitStatus;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_INSTITUTION_SEARCH_QUERY = "institution_search_query";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_SEARCH_QUERY)
  private String institutionSearchQuery;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_MFA_TYPE = "mfa_type";
  @SerializedName(SERIALIZED_NAME_MFA_TYPE)
  private String mfaType;

  public static final String SERIALIZED_NAME_VIEW_NAME = "view_name";
  @SerializedName(SERIALIZED_NAME_VIEW_NAME)
  private String viewName;

  public static final String SERIALIZED_NAME_SELECTION = "selection";
  @SerializedName(SERIALIZED_NAME_SELECTION)
  private String selection;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_MATCH_REASON = "match_reason";
  @SerializedName(SERIALIZED_NAME_MATCH_REASON)
  private String matchReason;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_MASK = "account_number_mask";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_MASK)
  private String accountNumberMask;


  public LinkEventMetadata errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code that the user encountered. Emitted by &#x60;ERROR&#x60;, &#x60;EXIT&#x60;.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error code that the user encountered. Emitted by `ERROR`, `EXIT`.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public LinkEventMetadata errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message that the user encountered. Emitted by: &#x60;ERROR&#x60;, &#x60;EXIT&#x60;.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message that the user encountered. Emitted by: `ERROR`, `EXIT`.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public LinkEventMetadata errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * The error type that the user encountered. Emitted by: &#x60;ERROR&#x60;, &#x60;EXIT&#x60;.
   * @return errorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error type that the user encountered. Emitted by: `ERROR`, `EXIT`.")

  public String getErrorType() {
    return errorType;
  }


  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public LinkEventMetadata exitStatus(String exitStatus) {
    
    this.exitStatus = exitStatus;
    return this;
  }

   /**
   * The status key indicates the point at which the user exited the Link flow. Emitted by: &#x60;EXIT&#x60;.
   * @return exitStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status key indicates the point at which the user exited the Link flow. Emitted by: `EXIT`.")

  public String getExitStatus() {
    return exitStatus;
  }


  public void setExitStatus(String exitStatus) {
    this.exitStatus = exitStatus;
  }


  public LinkEventMetadata institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of the selected institution. Emitted by: all events.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the selected institution. Emitted by: all events.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public LinkEventMetadata institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the selected institution. Emitted by: all events.
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the selected institution. Emitted by: all events.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public LinkEventMetadata institutionSearchQuery(String institutionSearchQuery) {
    
    this.institutionSearchQuery = institutionSearchQuery;
    return this;
  }

   /**
   * The query used to search for institutions. Emitted by: &#x60;SEARCH_INSTITUTION&#x60;.
   * @return institutionSearchQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The query used to search for institutions. Emitted by: `SEARCH_INSTITUTION`.")

  public String getInstitutionSearchQuery() {
    return institutionSearchQuery;
  }


  public void setInstitutionSearchQuery(String institutionSearchQuery) {
    this.institutionSearchQuery = institutionSearchQuery;
  }


  public LinkEventMetadata requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation. Emitted by: all events.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation. Emitted by: all events.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public LinkEventMetadata mfaType(String mfaType) {
    
    this.mfaType = mfaType;
    return this;
  }

   /**
   * If set, the user has encountered one of the following MFA types: code, device, questions, selections. Emitted by: &#x60;SUBMIT_MFA&#x60; and &#x60;TRANSITION_VIEW&#x60; when view_name is &#x60;MFA&#x60;.
   * @return mfaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, the user has encountered one of the following MFA types: code, device, questions, selections. Emitted by: `SUBMIT_MFA` and `TRANSITION_VIEW` when view_name is `MFA`.")

  public String getMfaType() {
    return mfaType;
  }


  public void setMfaType(String mfaType) {
    this.mfaType = mfaType;
  }


  public LinkEventMetadata viewName(String viewName) {
    
    this.viewName = viewName;
    return this;
  }

   /**
   * The name of the view that is being transitioned to. Emitted by: &#x60;TRANSITION_VIEW&#x60;.
   * @return viewName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the view that is being transitioned to. Emitted by: `TRANSITION_VIEW`.")

  public String getViewName() {
    return viewName;
  }


  public void setViewName(String viewName) {
    this.viewName = viewName;
  }


  public LinkEventMetadata selection(String selection) {
    
    this.selection = selection;
    return this;
  }

   /**
   * Either the verification method for a matched institution selected by the user or the Auth Type Select flow type selected by the user. If selection is used to describe selected verification method, then possible values are &#x60;phoneotp&#x60; or &#x60;password&#x60;;  if selection is used to describe the selected Auth Type Select flow, then possible values are &#x60;flow_type_manual&#x60; or &#x60;flow_type_instant&#x60;. Emitted by: &#x60;MATCHED_SELECT_VERIFY_METHOD&#x60; and &#x60;SELECT_AUTH_TYPE&#x60;.
   * @return selection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Either the verification method for a matched institution selected by the user or the Auth Type Select flow type selected by the user. If selection is used to describe selected verification method, then possible values are `phoneotp` or `password`;  if selection is used to describe the selected Auth Type Select flow, then possible values are `flow_type_manual` or `flow_type_instant`. Emitted by: `MATCHED_SELECT_VERIFY_METHOD` and `SELECT_AUTH_TYPE`.")

  public String getSelection() {
    return selection;
  }


  public void setSelection(String selection) {
    this.selection = selection;
  }


  public LinkEventMetadata brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * The name of the selected brand.
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the selected brand.")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public LinkEventMetadata matchReason(String matchReason) {
    
    this.matchReason = matchReason;
    return this;
  }

   /**
   * The reason this institution was matched, which will be either &#x60;returning_user&#x60; or &#x60;routing_number&#x60;. Emitted by: &#x60;MATCHED_SELECT_INSTITUTION&#x60;.
   * @return matchReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason this institution was matched, which will be either `returning_user` or `routing_number`. Emitted by: `MATCHED_SELECT_INSTITUTION`.")

  public String getMatchReason() {
    return matchReason;
  }


  public void setMatchReason(String matchReason) {
    this.matchReason = matchReason;
  }


  public LinkEventMetadata routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * The routing number submitted by user at the micro-deposits routing number pane. Emitted by &#x60;SUBMIT_ROUTING_NUMBER&#x60;.
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The routing number submitted by user at the micro-deposits routing number pane. Emitted by `SUBMIT_ROUTING_NUMBER`.")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public LinkEventMetadata accountNumberMask(String accountNumberMask) {
    
    this.accountNumberMask = accountNumberMask;
    return this;
  }

   /**
   * The account number mask extracted from the user-provided account number. If the user-inputted account number is four digits long, &#x60;account_number_mask&#x60; is empty. Emitted by &#x60;SUBMIT_ACCOUNT_NUMBER&#x60;.
   * @return accountNumberMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account number mask extracted from the user-provided account number. If the user-inputted account number is four digits long, `account_number_mask` is empty. Emitted by `SUBMIT_ACCOUNT_NUMBER`.")

  public String getAccountNumberMask() {
    return accountNumberMask;
  }


  public void setAccountNumberMask(String accountNumberMask) {
    this.accountNumberMask = accountNumberMask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkEventMetadata linkEventMetadata = (LinkEventMetadata) o;
    return Objects.equals(this.errorCode, linkEventMetadata.errorCode) &&
        Objects.equals(this.errorMessage, linkEventMetadata.errorMessage) &&
        Objects.equals(this.errorType, linkEventMetadata.errorType) &&
        Objects.equals(this.exitStatus, linkEventMetadata.exitStatus) &&
        Objects.equals(this.institutionId, linkEventMetadata.institutionId) &&
        Objects.equals(this.institutionName, linkEventMetadata.institutionName) &&
        Objects.equals(this.institutionSearchQuery, linkEventMetadata.institutionSearchQuery) &&
        Objects.equals(this.requestId, linkEventMetadata.requestId) &&
        Objects.equals(this.mfaType, linkEventMetadata.mfaType) &&
        Objects.equals(this.viewName, linkEventMetadata.viewName) &&
        Objects.equals(this.selection, linkEventMetadata.selection) &&
        Objects.equals(this.brandName, linkEventMetadata.brandName) &&
        Objects.equals(this.matchReason, linkEventMetadata.matchReason) &&
        Objects.equals(this.routingNumber, linkEventMetadata.routingNumber) &&
        Objects.equals(this.accountNumberMask, linkEventMetadata.accountNumberMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, requestId, mfaType, viewName, selection, brandName, matchReason, routingNumber, accountNumberMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkEventMetadata {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    exitStatus: ").append(toIndentedString(exitStatus)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionSearchQuery: ").append(toIndentedString(institutionSearchQuery)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    matchReason: ").append(toIndentedString(matchReason)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumberMask: ").append(toIndentedString(accountNumberMask)).append("\n");
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

