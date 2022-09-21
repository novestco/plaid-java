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
import com.plaid.client.model.ItemImportRequestOptions;
import com.plaid.client.model.ItemImportRequestUserAuth;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemImportRequest defines the request schema for &#x60;/item/import&#x60;
 */
@ApiModel(description = "ItemImportRequest defines the request schema for `/item/import`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class ItemImportRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_AUTH = "user_auth";
  @SerializedName(SERIALIZED_NAME_USER_AUTH)
  private ItemImportRequestUserAuth userAuth;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ItemImportRequestOptions options;


  public ItemImportRequest clientId(String clientId) {
    
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


  public ItemImportRequest secret(String secret) {
    
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


  public ItemImportRequest products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public ItemImportRequest addProductsItem(Products productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Array of product strings
   * @return products
  **/
  @ApiModelProperty(required = true, value = "Array of product strings")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public ItemImportRequest userAuth(ItemImportRequestUserAuth userAuth) {
    
    this.userAuth = userAuth;
    return this;
  }

   /**
   * Get userAuth
   * @return userAuth
  **/
  @ApiModelProperty(required = true, value = "")

  public ItemImportRequestUserAuth getUserAuth() {
    return userAuth;
  }


  public void setUserAuth(ItemImportRequestUserAuth userAuth) {
    this.userAuth = userAuth;
  }


  public ItemImportRequest options(ItemImportRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemImportRequestOptions getOptions() {
    return options;
  }


  public void setOptions(ItemImportRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImportRequest itemImportRequest = (ItemImportRequest) o;
    return Objects.equals(this.clientId, itemImportRequest.clientId) &&
        Objects.equals(this.secret, itemImportRequest.secret) &&
        Objects.equals(this.products, itemImportRequest.products) &&
        Objects.equals(this.userAuth, itemImportRequest.userAuth) &&
        Objects.equals(this.options, itemImportRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, products, userAuth, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImportRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    userAuth: ").append(toIndentedString(userAuth)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

