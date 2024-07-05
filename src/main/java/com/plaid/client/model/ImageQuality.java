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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A high level description of the quality of the image the user submitted.  For example, an image that is blurry, distorted by glare from a nearby light source, or improperly framed might be marked as low or medium quality. Poor quality images are more likely to fail OCR and/or template conformity checks.  Note: By default, Plaid will let a user recapture document images twice before failing the entire session if we attribute the failure to low image quality.
 */
@JsonAdapter(ImageQuality.Adapter.class)
public enum ImageQuality {
  
  HIGH("high"),
  
  MEDIUM("medium"),
  
  LOW("low"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ImageQuality(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageQuality fromValue(String value) {
    for (ImageQuality b : ImageQuality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ImageQuality.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ImageQuality> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageQuality enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageQuality read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageQuality.fromValue(value);
    }
  }
}

