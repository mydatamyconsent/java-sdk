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
import com.mydatamyconsent.model.IdentificationStrategy;
import com.mydatamyconsent.model.KeyValuePair;
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
 * DocumentIssueRequestReceiver
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-05T10:34:19.654057893Z[Etc/UTC]")
public class DocumentIssueRequestReceiver {
  public static final String SERIALIZED_NAME_COUNTRY_ISO2_CODE = "countryIso2Code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2_CODE)
  private String countryIso2Code;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<KeyValuePair> identifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDENTIFICATION_STRATEGY = "identificationStrategy";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_STRATEGY)
  private IdentificationStrategy identificationStrategy;

  public DocumentIssueRequestReceiver() {
  }

  public DocumentIssueRequestReceiver countryIso2Code(String countryIso2Code) {
    
    this.countryIso2Code = countryIso2Code;
    return this;
  }

   /**
   * Get countryIso2Code
   * @return countryIso2Code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountryIso2Code() {
    return countryIso2Code;
  }


  public void setCountryIso2Code(String countryIso2Code) {
    this.countryIso2Code = countryIso2Code;
  }


  public DocumentIssueRequestReceiver identifiers(List<KeyValuePair> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public DocumentIssueRequestReceiver addIdentifiersItem(KeyValuePair identifiersItem) {
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<KeyValuePair> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<KeyValuePair> identifiers) {
    this.identifiers = identifiers;
  }


  public DocumentIssueRequestReceiver identificationStrategy(IdentificationStrategy identificationStrategy) {
    
    this.identificationStrategy = identificationStrategy;
    return this;
  }

   /**
   * Get identificationStrategy
   * @return identificationStrategy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IdentificationStrategy getIdentificationStrategy() {
    return identificationStrategy;
  }


  public void setIdentificationStrategy(IdentificationStrategy identificationStrategy) {
    this.identificationStrategy = identificationStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIssueRequestReceiver documentIssueRequestReceiver = (DocumentIssueRequestReceiver) o;
    return Objects.equals(this.countryIso2Code, documentIssueRequestReceiver.countryIso2Code) &&
        Objects.equals(this.identifiers, documentIssueRequestReceiver.identifiers) &&
        Objects.equals(this.identificationStrategy, documentIssueRequestReceiver.identificationStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryIso2Code, identifiers, identificationStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentIssueRequestReceiver {\n");
    sb.append("    countryIso2Code: ").append(toIndentedString(countryIso2Code)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    identificationStrategy: ").append(toIndentedString(identificationStrategy)).append("\n");
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
    openapiFields.add("countryIso2Code");
    openapiFields.add("identifiers");
    openapiFields.add("identificationStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("countryIso2Code");
    openapiRequiredFields.add("identifiers");
    openapiRequiredFields.add("identificationStrategy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentIssueRequestReceiver
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DocumentIssueRequestReceiver.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentIssueRequestReceiver is not found in the empty JSON string", DocumentIssueRequestReceiver.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentIssueRequestReceiver.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentIssueRequestReceiver` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentIssueRequestReceiver.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("countryIso2Code") != null && !jsonObj.get("countryIso2Code").isJsonNull()) && !jsonObj.get("countryIso2Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryIso2Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryIso2Code").toString()));
      }
      if (jsonObj.get("identifiers") != null && !jsonObj.get("identifiers").isJsonNull()) {
        JsonArray jsonArrayidentifiers = jsonObj.getAsJsonArray("identifiers");
        if (jsonArrayidentifiers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identifiers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("identifiers").toString()));
          }

          // validate the optional field `identifiers` (array)
          for (int i = 0; i < jsonArrayidentifiers.size(); i++) {
            KeyValuePair.validateJsonObject(jsonArrayidentifiers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentIssueRequestReceiver.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentIssueRequestReceiver' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentIssueRequestReceiver> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentIssueRequestReceiver.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentIssueRequestReceiver>() {
           @Override
           public void write(JsonWriter out, DocumentIssueRequestReceiver value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentIssueRequestReceiver read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentIssueRequestReceiver given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentIssueRequestReceiver
  * @throws IOException if the JSON string is invalid with respect to DocumentIssueRequestReceiver
  */
  public static DocumentIssueRequestReceiver fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentIssueRequestReceiver.class);
  }

 /**
  * Convert an instance of DocumentIssueRequestReceiver to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

