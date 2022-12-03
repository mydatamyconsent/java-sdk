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
 * IssuedDocument : Issued Document Identifier.
 */
@ApiModel(description = "IssuedDocument : Issued Document Identifier.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-03T10:32:50.794319334Z[Etc/UTC]")
public class IssuedDocument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ISSUED_TO = "issuedTo";
  @SerializedName(SERIALIZED_NAME_ISSUED_TO)
  private String issuedTo;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_ACCEPTED_AT_UTC = "acceptedAtUtc";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_AT_UTC)
  private OffsetDateTime acceptedAtUtc;

  public IssuedDocument() {
  }

  public IssuedDocument id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document Id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IssuedDocument identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document Identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public IssuedDocument documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Document type name.
   * @return documentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type name.")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IssuedDocument issuedTo(String issuedTo) {
    
    this.issuedTo = issuedTo;
    return this;
  }

   /**
   * User name.
   * @return issuedTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User name.")

  public String getIssuedTo() {
    return issuedTo;
  }


  public void setIssuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
  }


  public IssuedDocument issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Issued datetime in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issued datetime in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public IssuedDocument expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Expires datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expires datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public IssuedDocument acceptedAtUtc(OffsetDateTime acceptedAtUtc) {
    
    this.acceptedAtUtc = acceptedAtUtc;
    return this;
  }

   /**
   * Accepted datetime in UTC timezone.
   * @return acceptedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Accepted datetime in UTC timezone.")

  public OffsetDateTime getAcceptedAtUtc() {
    return acceptedAtUtc;
  }


  public void setAcceptedAtUtc(OffsetDateTime acceptedAtUtc) {
    this.acceptedAtUtc = acceptedAtUtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocument issuedDocument = (IssuedDocument) o;
    return Objects.equals(this.id, issuedDocument.id) &&
        Objects.equals(this.identifier, issuedDocument.identifier) &&
        Objects.equals(this.documentType, issuedDocument.documentType) &&
        Objects.equals(this.issuedTo, issuedDocument.issuedTo) &&
        Objects.equals(this.issuedAtUtc, issuedDocument.issuedAtUtc) &&
        Objects.equals(this.expiresAtUtc, issuedDocument.expiresAtUtc) &&
        Objects.equals(this.acceptedAtUtc, issuedDocument.acceptedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier, documentType, issuedTo, issuedAtUtc, expiresAtUtc, acceptedAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    acceptedAtUtc: ").append(toIndentedString(acceptedAtUtc)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("documentType");
    openapiFields.add("issuedTo");
    openapiFields.add("issuedAtUtc");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("acceptedAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("documentType");
    openapiRequiredFields.add("issuedTo");
    openapiRequiredFields.add("issuedAtUtc");
    openapiRequiredFields.add("acceptedAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuedDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssuedDocument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuedDocument is not found in the empty JSON string", IssuedDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssuedDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuedDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssuedDocument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("issuedTo") != null && !jsonObj.get("issuedTo").isJsonNull()) && !jsonObj.get("issuedTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuedTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuedTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuedDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuedDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuedDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuedDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuedDocument>() {
           @Override
           public void write(JsonWriter out, IssuedDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuedDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssuedDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuedDocument
  * @throws IOException if the JSON string is invalid with respect to IssuedDocument
  */
  public static IssuedDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuedDocument.class);
  }

 /**
  * Convert an instance of IssuedDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

