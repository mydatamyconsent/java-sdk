/*
 * My Data My Consent - Developer API
 * Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@mydatamyconsent.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mydatamyconsent.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mydatamyconsent.JSON;

/**
 * IndividualConsentRequestTemplateDetailsDataFrequency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-31T10:33:29.427947749Z[Etc/UTC]")
public class IndividualConsentRequestTemplateDetailsDataFrequency {
  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public IndividualConsentRequestTemplateDetailsDataFrequency() {
  }

  public IndividualConsentRequestTemplateDetailsDataFrequency unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Life unit. Example: days, hours, minutes.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Life unit. Example: days, hours, minutes.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public IndividualConsentRequestTemplateDetailsDataFrequency value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Life value in number.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Life value in number.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualConsentRequestTemplateDetailsDataFrequency individualConsentRequestTemplateDetailsDataFrequency = (IndividualConsentRequestTemplateDetailsDataFrequency) o;
    return Objects.equals(this.unit, individualConsentRequestTemplateDetailsDataFrequency.unit) &&
        Objects.equals(this.value, individualConsentRequestTemplateDetailsDataFrequency.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualConsentRequestTemplateDetailsDataFrequency {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("unit");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("unit");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndividualConsentRequestTemplateDetailsDataFrequency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndividualConsentRequestTemplateDetailsDataFrequency.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualConsentRequestTemplateDetailsDataFrequency is not found in the empty JSON string", IndividualConsentRequestTemplateDetailsDataFrequency.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndividualConsentRequestTemplateDetailsDataFrequency.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualConsentRequestTemplateDetailsDataFrequency` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IndividualConsentRequestTemplateDetailsDataFrequency.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualConsentRequestTemplateDetailsDataFrequency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualConsentRequestTemplateDetailsDataFrequency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualConsentRequestTemplateDetailsDataFrequency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualConsentRequestTemplateDetailsDataFrequency.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualConsentRequestTemplateDetailsDataFrequency>() {
           @Override
           public void write(JsonWriter out, IndividualConsentRequestTemplateDetailsDataFrequency value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualConsentRequestTemplateDetailsDataFrequency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndividualConsentRequestTemplateDetailsDataFrequency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndividualConsentRequestTemplateDetailsDataFrequency
  * @throws IOException if the JSON string is invalid with respect to IndividualConsentRequestTemplateDetailsDataFrequency
  */
  public static IndividualConsentRequestTemplateDetailsDataFrequency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualConsentRequestTemplateDetailsDataFrequency.class);
  }

 /**
  * Convert an instance of IndividualConsentRequestTemplateDetailsDataFrequency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

