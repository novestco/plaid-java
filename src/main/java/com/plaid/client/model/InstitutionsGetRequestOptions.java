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
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object to filter &#x60;/institutions/get&#x60; results.
 */
@ApiModel(description = "An optional object to filter `/institutions/get` results.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-05T19:36:13.426392Z[Etc/UTC]")
public class InstitutionsGetRequestOptions {
  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = null;

  public static final String SERIALIZED_NAME_ROUTING_NUMBERS = "routing_numbers";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBERS)
  private List<String> routingNumbers = null;

  public static final String SERIALIZED_NAME_OAUTH = "oauth";
  @SerializedName(SERIALIZED_NAME_OAUTH)
  private Boolean oauth;

  public static final String SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA = "include_optional_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OPTIONAL_METADATA)
  private Boolean includeOptionalMetadata;

  public static final String SERIALIZED_NAME_INCLUDE_AUTH_METADATA = "include_auth_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_AUTH_METADATA)
  private Boolean includeAuthMetadata = false;

  public static final String SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA = "include_payment_initiation_metadata";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PAYMENT_INITIATION_METADATA)
  private Boolean includePaymentInitiationMetadata = false;


  public InstitutionsGetRequestOptions products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public InstitutionsGetRequestOptions addProductsItem(Products productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Filter the Institutions based on which products they support. Will only return institutions that support all listed products. When filtering based on &#x60;auth&#x60;, an institution must support Instant Auth to match the criterion.
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter the Institutions based on which products they support. Will only return institutions that support all listed products. When filtering based on `auth`, an institution must support Instant Auth to match the criterion.")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public InstitutionsGetRequestOptions routingNumbers(List<String> routingNumbers) {
    
    this.routingNumbers = routingNumbers;
    return this;
  }

  public InstitutionsGetRequestOptions addRoutingNumbersItem(String routingNumbersItem) {
    if (this.routingNumbers == null) {
      this.routingNumbers = new ArrayList<>();
    }
    this.routingNumbers.add(routingNumbersItem);
    return this;
  }

   /**
   * Specify an array of routing numbers to filter institutions. The response will only return institutions that match all of the routing numbers in the array. Routing number records used for this matching are generally comprehensive; however, failure to match a given routing number to an institution does not necessarily mean that the institution is unsupported by Plaid.
   * @return routingNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify an array of routing numbers to filter institutions. The response will only return institutions that match all of the routing numbers in the array. Routing number records used for this matching are generally comprehensive; however, failure to match a given routing number to an institution does not necessarily mean that the institution is unsupported by Plaid.")

  public List<String> getRoutingNumbers() {
    return routingNumbers;
  }


  public void setRoutingNumbers(List<String> routingNumbers) {
    this.routingNumbers = routingNumbers;
  }


  public InstitutionsGetRequestOptions oauth(Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

   /**
   * Limit results to institutions with or without OAuth login flows. Note that institutions will have &#x60;oauth&#x60; set to &#x60;true&#x60; if some Items associated with that institution are required to use OAuth flows; institutions in a state of migration to OAuth will have the &#x60;oauth&#x60; attribute set to &#x60;true&#x60;.
   * @return oauth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit results to institutions with or without OAuth login flows. Note that institutions will have `oauth` set to `true` if some Items associated with that institution are required to use OAuth flows; institutions in a state of migration to OAuth will have the `oauth` attribute set to `true`.")

  public Boolean getOauth() {
    return oauth;
  }


  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
  }


  public InstitutionsGetRequestOptions includeOptionalMetadata(Boolean includeOptionalMetadata) {
    
    this.includeOptionalMetadata = includeOptionalMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, return the institution&#39;s homepage URL, logo and primary brand color.  Note that Plaid does not own any of the logos shared by the API, and that by accessing or using these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all required permissions from the appropriate rights holders and adhere to any applicable usage guidelines. Plaid disclaims all express or implied warranties with respect to the logos.
   * @return includeOptionalMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, return the institution's homepage URL, logo and primary brand color.  Note that Plaid does not own any of the logos shared by the API, and that by accessing or using these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all required permissions from the appropriate rights holders and adhere to any applicable usage guidelines. Plaid disclaims all express or implied warranties with respect to the logos.")

  public Boolean getIncludeOptionalMetadata() {
    return includeOptionalMetadata;
  }


  public void setIncludeOptionalMetadata(Boolean includeOptionalMetadata) {
    this.includeOptionalMetadata = includeOptionalMetadata;
  }


  public InstitutionsGetRequestOptions includeAuthMetadata(Boolean includeAuthMetadata) {
    
    this.includeAuthMetadata = includeAuthMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, returns metadata related to the Auth product indicating which auth methods are supported.
   * @return includeAuthMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, returns metadata related to the Auth product indicating which auth methods are supported.")

  public Boolean getIncludeAuthMetadata() {
    return includeAuthMetadata;
  }


  public void setIncludeAuthMetadata(Boolean includeAuthMetadata) {
    this.includeAuthMetadata = includeAuthMetadata;
  }


  public InstitutionsGetRequestOptions includePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
    return this;
  }

   /**
   * When &#x60;true&#x60;, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.
   * @return includePaymentInitiationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, returns metadata related to the Payment Initiation product indicating which payment configurations are supported.")

  public Boolean getIncludePaymentInitiationMetadata() {
    return includePaymentInitiationMetadata;
  }


  public void setIncludePaymentInitiationMetadata(Boolean includePaymentInitiationMetadata) {
    this.includePaymentInitiationMetadata = includePaymentInitiationMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsGetRequestOptions institutionsGetRequestOptions = (InstitutionsGetRequestOptions) o;
    return Objects.equals(this.products, institutionsGetRequestOptions.products) &&
        Objects.equals(this.routingNumbers, institutionsGetRequestOptions.routingNumbers) &&
        Objects.equals(this.oauth, institutionsGetRequestOptions.oauth) &&
        Objects.equals(this.includeOptionalMetadata, institutionsGetRequestOptions.includeOptionalMetadata) &&
        Objects.equals(this.includeAuthMetadata, institutionsGetRequestOptions.includeAuthMetadata) &&
        Objects.equals(this.includePaymentInitiationMetadata, institutionsGetRequestOptions.includePaymentInitiationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, routingNumbers, oauth, includeOptionalMetadata, includeAuthMetadata, includePaymentInitiationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsGetRequestOptions {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    routingNumbers: ").append(toIndentedString(routingNumbers)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    includeOptionalMetadata: ").append(toIndentedString(includeOptionalMetadata)).append("\n");
    sb.append("    includeAuthMetadata: ").append(toIndentedString(includeAuthMetadata)).append("\n");
    sb.append("    includePaymentInitiationMetadata: ").append(toIndentedString(includePaymentInitiationMetadata)).append("\n");
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

