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
import java.time.OffsetDateTime;

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
 * ConsentedMedicalRecord : Consented medical record details.
 */
@ApiModel(description = "ConsentedMedicalRecord : Consented medical record details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-20T10:35:08.419530832Z[Etc/UTC]")
public class ConsentedMedicalRecord {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private String issuerId;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private OffsetDateTime toDate;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private OffsetDateTime fromDate;

  public ConsentedMedicalRecord() {
  }

  public ConsentedMedicalRecord id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Health id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Health id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentedMedicalRecord fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Health field title.
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Health field title.")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public ConsentedMedicalRecord fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Health field slug.
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Health field slug.")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public ConsentedMedicalRecord issuerId(String issuerId) {
    
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Issuer id.
   * @return issuerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issuer id.")

  public String getIssuerId() {
    return issuerId;
  }


  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public ConsentedMedicalRecord issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Issuer name.
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issuer name.")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public ConsentedMedicalRecord category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * health category type.
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "health category type.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ConsentedMedicalRecord toDate(OffsetDateTime toDate) {
    
    this.toDate = toDate;
    return this;
  }

   /**
   * To Date
   * @return toDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To Date")

  public OffsetDateTime getToDate() {
    return toDate;
  }


  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }


  public ConsentedMedicalRecord fromDate(OffsetDateTime fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * From Date
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From Date")

  public OffsetDateTime getFromDate() {
    return fromDate;
  }


  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentedMedicalRecord consentedMedicalRecord = (ConsentedMedicalRecord) o;
    return Objects.equals(this.id, consentedMedicalRecord.id) &&
        Objects.equals(this.fieldTitle, consentedMedicalRecord.fieldTitle) &&
        Objects.equals(this.fieldSlug, consentedMedicalRecord.fieldSlug) &&
        Objects.equals(this.issuerId, consentedMedicalRecord.issuerId) &&
        Objects.equals(this.issuerName, consentedMedicalRecord.issuerName) &&
        Objects.equals(this.category, consentedMedicalRecord.category) &&
        Objects.equals(this.toDate, consentedMedicalRecord.toDate) &&
        Objects.equals(this.fromDate, consentedMedicalRecord.fromDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fieldTitle, fieldSlug, issuerId, issuerName, category, toDate, fromDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentedMedicalRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("fieldTitle");
    openapiFields.add("fieldSlug");
    openapiFields.add("issuerId");
    openapiFields.add("issuerName");
    openapiFields.add("category");
    openapiFields.add("toDate");
    openapiFields.add("fromDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldTitle");
    openapiRequiredFields.add("fieldSlug");
    openapiRequiredFields.add("issuerId");
    openapiRequiredFields.add("issuerName");
    openapiRequiredFields.add("category");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentedMedicalRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentedMedicalRecord.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentedMedicalRecord is not found in the empty JSON string", ConsentedMedicalRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentedMedicalRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentedMedicalRecord` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentedMedicalRecord.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("fieldTitle") != null && !jsonObj.get("fieldTitle").isJsonNull()) && !jsonObj.get("fieldTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldTitle").toString()));
      }
      if ((jsonObj.get("fieldSlug") != null && !jsonObj.get("fieldSlug").isJsonNull()) && !jsonObj.get("fieldSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldSlug").toString()));
      }
      if ((jsonObj.get("issuerId") != null && !jsonObj.get("issuerId").isJsonNull()) && !jsonObj.get("issuerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerId").toString()));
      }
      if ((jsonObj.get("issuerName") != null && !jsonObj.get("issuerName").isJsonNull()) && !jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentedMedicalRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentedMedicalRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentedMedicalRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentedMedicalRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentedMedicalRecord>() {
           @Override
           public void write(JsonWriter out, ConsentedMedicalRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentedMedicalRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentedMedicalRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentedMedicalRecord
  * @throws IOException if the JSON string is invalid with respect to ConsentedMedicalRecord
  */
  public static ConsentedMedicalRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentedMedicalRecord.class);
  }

 /**
  * Convert an instance of ConsentedMedicalRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

