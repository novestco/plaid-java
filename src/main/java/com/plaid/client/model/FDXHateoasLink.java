/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.431.7
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
import com.plaid.client.model.FDXContentTypes;
import com.plaid.client.model.FDXHateoasLinkAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * REST application constraint (Hypermedia As The Engine Of Application State)
 */
@ApiModel(description = "REST application constraint (Hypermedia As The Engine Of Application State)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class FDXHateoasLink {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private FDXHateoasLinkAction action;

  public static final String SERIALIZED_NAME_REL = "rel";
  @SerializedName(SERIALIZED_NAME_REL)
  private String rel;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<FDXContentTypes> types = null;


  public FDXHateoasLink href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * URL to invoke the action on the resource
   * @return href
  **/
  @ApiModelProperty(example = "https://api.fi.com/fdx/v4/accounts/12345", required = true, value = "URL to invoke the action on the resource")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public FDXHateoasLink action(FDXHateoasLinkAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXHateoasLinkAction getAction() {
    return action;
  }


  public void setAction(FDXHateoasLinkAction action) {
    this.action = action;
  }


  public FDXHateoasLink rel(String rel) {
    
    this.rel = rel;
    return this;
  }

   /**
   * Relation of this link to its containing entity, as defined by and with many example relation values at [IETF RFC5988](https://datatracker.ietf.org/doc/html/rfc5988)
   * @return rel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Relation of this link to its containing entity, as defined by and with many example relation values at [IETF RFC5988](https://datatracker.ietf.org/doc/html/rfc5988)")

  public String getRel() {
    return rel;
  }


  public void setRel(String rel) {
    this.rel = rel;
  }


  public FDXHateoasLink types(List<FDXContentTypes> types) {
    
    this.types = types;
    return this;
  }

  public FDXHateoasLink addTypesItem(FDXContentTypes typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Content-types that can be used in the Accept header
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content-types that can be used in the Accept header")

  public List<FDXContentTypes> getTypes() {
    return types;
  }


  public void setTypes(List<FDXContentTypes> types) {
    this.types = types;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDXHateoasLink fdXHateoasLink = (FDXHateoasLink) o;
    return Objects.equals(this.href, fdXHateoasLink.href) &&
        Objects.equals(this.action, fdXHateoasLink.action) &&
        Objects.equals(this.rel, fdXHateoasLink.rel) &&
        Objects.equals(this.types, fdXHateoasLink.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, action, rel, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDXHateoasLink {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

