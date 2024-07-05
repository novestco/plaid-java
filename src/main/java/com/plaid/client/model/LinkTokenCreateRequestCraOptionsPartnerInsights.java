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
import com.plaid.client.model.PrismProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies options for initializing Link for use with the Credit Partner Insights product.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Credit Partner Insights product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class LinkTokenCreateRequestCraOptionsPartnerInsights {
  public static final String SERIALIZED_NAME_PRISM_PRODUCTS = "prism_products";
  @SerializedName(SERIALIZED_NAME_PRISM_PRODUCTS)
  private List<PrismProduct> prismProducts = null;


  public LinkTokenCreateRequestCraOptionsPartnerInsights prismProducts(List<PrismProduct> prismProducts) {
    
    this.prismProducts = prismProducts;
    return this;
  }

  public LinkTokenCreateRequestCraOptionsPartnerInsights addPrismProductsItem(PrismProduct prismProductsItem) {
    if (this.prismProducts == null) {
      this.prismProducts = new ArrayList<>();
    }
    this.prismProducts.add(prismProductsItem);
    return this;
  }

   /**
   * The specific Prism products to return. If none are passed in, then all products will be returned.
   * @return prismProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specific Prism products to return. If none are passed in, then all products will be returned.")

  public List<PrismProduct> getPrismProducts() {
    return prismProducts;
  }


  public void setPrismProducts(List<PrismProduct> prismProducts) {
    this.prismProducts = prismProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestCraOptionsPartnerInsights linkTokenCreateRequestCraOptionsPartnerInsights = (LinkTokenCreateRequestCraOptionsPartnerInsights) o;
    return Objects.equals(this.prismProducts, linkTokenCreateRequestCraOptionsPartnerInsights.prismProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prismProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestCraOptionsPartnerInsights {\n");
    sb.append("    prismProducts: ").append(toIndentedString(prismProducts)).append("\n");
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

