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
import com.plaid.client.model.CreditFreddieMacAsset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class CreditFreddieMacAssets {
  public static final String SERIALIZED_NAME_A_S_S_E_T = "ASSET";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T)
  private List<CreditFreddieMacAsset> ASSET = new ArrayList<>();


  public CreditFreddieMacAssets ASSET(List<CreditFreddieMacAsset> ASSET) {
    
    this.ASSET = ASSET;
    return this;
  }

  public CreditFreddieMacAssets addASSETItem(CreditFreddieMacAsset ASSETItem) {
    this.ASSET.add(ASSETItem);
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return ASSET
  **/
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public List<CreditFreddieMacAsset> getASSET() {
    return ASSET;
  }


  public void setASSET(List<CreditFreddieMacAsset> ASSET) {
    this.ASSET = ASSET;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssets creditFreddieMacAssets = (CreditFreddieMacAssets) o;
    return Objects.equals(this.ASSET, creditFreddieMacAssets.ASSET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssets {\n");
    sb.append("    ASSET: ").append(toIndentedString(ASSET)).append("\n");
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

