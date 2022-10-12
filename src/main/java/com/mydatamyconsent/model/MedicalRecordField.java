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
import java.util.ArrayList;
import java.util.List;

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
 * MedicalRecordField : Medical record field of consent request template.
 */
@ApiModel(description = "MedicalRecordField : Medical record field of consent request template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-12T10:40:04.735801161Z[Etc/UTC]")
public class MedicalRecordField {
  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_DRNS = "drns";
  @SerializedName(SERIALIZED_NAME_DRNS)
  private List<String> drns = new ArrayList<>();

  public MedicalRecordField() {
  }

  public MedicalRecordField fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Field title.
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Field title.")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public MedicalRecordField fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Field slug.
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Field slug.")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public MedicalRecordField drns(List<String> drns) {
    
    this.drns = drns;
    return this;
  }

  public MedicalRecordField addDrnsItem(String drnsItem) {
    this.drns.add(drnsItem);
    return this;
  }

   /**
   * Field DRNs.
   * @return drns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Field DRNs.")

  public List<String> getDrns() {
    return drns;
  }


  public void setDrns(List<String> drns) {
    this.drns = drns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedicalRecordField medicalRecordField = (MedicalRecordField) o;
    return Objects.equals(this.fieldTitle, medicalRecordField.fieldTitle) &&
        Objects.equals(this.fieldSlug, medicalRecordField.fieldSlug) &&
        Objects.equals(this.drns, medicalRecordField.drns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTitle, fieldSlug, drns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedicalRecordField {\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    drns: ").append(toIndentedString(drns)).append("\n");
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
    openapiFields.add("fieldTitle");
    openapiFields.add("fieldSlug");
    openapiFields.add("drns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldTitle");
    openapiRequiredFields.add("fieldSlug");
    openapiRequiredFields.add("drns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MedicalRecordField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MedicalRecordField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MedicalRecordField is not found in the empty JSON string", MedicalRecordField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MedicalRecordField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MedicalRecordField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MedicalRecordField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fieldTitle") != null && !jsonObj.get("fieldTitle").isJsonNull()) && !jsonObj.get("fieldTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldTitle").toString()));
      }
      if ((jsonObj.get("fieldSlug") != null && !jsonObj.get("fieldSlug").isJsonNull()) && !jsonObj.get("fieldSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldSlug").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("drns") != null && !jsonObj.get("drns").isJsonNull()) && !jsonObj.get("drns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drns` to be an array in the JSON string but got `%s`", jsonObj.get("drns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MedicalRecordField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MedicalRecordField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MedicalRecordField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MedicalRecordField.class));

       return (TypeAdapter<T>) new TypeAdapter<MedicalRecordField>() {
           @Override
           public void write(JsonWriter out, MedicalRecordField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MedicalRecordField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MedicalRecordField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MedicalRecordField
  * @throws IOException if the JSON string is invalid with respect to MedicalRecordField
  */
  public static MedicalRecordField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MedicalRecordField.class);
  }

 /**
  * Convert an instance of MedicalRecordField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

