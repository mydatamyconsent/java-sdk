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
 * UriDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T10:35:46.908205274Z[Etc/UTC]")
public class UriDetails {
  public static final String SERIALIZED_NAME_AADHAAR = "aadhaar";
  @SerializedName(SERIALIZED_NAME_AADHAAR)
  private String aadhaar;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_DOC_TYPE = "docType";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_DOC_NAME = "docName";
  @SerializedName(SERIALIZED_NAME_DOC_NAME)
  private String docName;

  public static final String SERIALIZED_NAME_DOC_ID = "docId";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_ISSUED_ON = "issuedOn";
  @SerializedName(SERIALIZED_NAME_ISSUED_ON)
  private String issuedOn;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private String validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private String validTo;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public UriDetails() {
  }

  public UriDetails aadhaar(String aadhaar) {
    
    this.aadhaar = aadhaar;
    return this;
  }

   /**
   * Get aadhaar
   * @return aadhaar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAadhaar() {
    return aadhaar;
  }


  public void setAadhaar(String aadhaar) {
    this.aadhaar = aadhaar;
  }


  public UriDetails uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public UriDetails docType(String docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocType() {
    return docType;
  }


  public void setDocType(String docType) {
    this.docType = docType;
  }


  public UriDetails docName(String docName) {
    
    this.docName = docName;
    return this;
  }

   /**
   * Get docName
   * @return docName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocName() {
    return docName;
  }


  public void setDocName(String docName) {
    this.docName = docName;
  }


  public UriDetails docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * Get docId
   * @return docId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public UriDetails issuedOn(String issuedOn) {
    
    this.issuedOn = issuedOn;
    return this;
  }

   /**
   * Get issuedOn
   * @return issuedOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuedOn() {
    return issuedOn;
  }


  public void setIssuedOn(String issuedOn) {
    this.issuedOn = issuedOn;
  }


  public UriDetails validFrom(String validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }


  public UriDetails validTo(String validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidTo() {
    return validTo;
  }


  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  public UriDetails timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public UriDetails action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UriDetails uriDetails = (UriDetails) o;
    return Objects.equals(this.aadhaar, uriDetails.aadhaar) &&
        Objects.equals(this.uri, uriDetails.uri) &&
        Objects.equals(this.docType, uriDetails.docType) &&
        Objects.equals(this.docName, uriDetails.docName) &&
        Objects.equals(this.docId, uriDetails.docId) &&
        Objects.equals(this.issuedOn, uriDetails.issuedOn) &&
        Objects.equals(this.validFrom, uriDetails.validFrom) &&
        Objects.equals(this.validTo, uriDetails.validTo) &&
        Objects.equals(this.timestamp, uriDetails.timestamp) &&
        Objects.equals(this.action, uriDetails.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadhaar, uri, docType, docName, docId, issuedOn, validFrom, validTo, timestamp, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UriDetails {\n");
    sb.append("    aadhaar: ").append(toIndentedString(aadhaar)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("aadhaar");
    openapiFields.add("uri");
    openapiFields.add("docType");
    openapiFields.add("docName");
    openapiFields.add("docId");
    openapiFields.add("issuedOn");
    openapiFields.add("validFrom");
    openapiFields.add("validTo");
    openapiFields.add("timestamp");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aadhaar");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("docType");
    openapiRequiredFields.add("docName");
    openapiRequiredFields.add("docId");
    openapiRequiredFields.add("issuedOn");
    openapiRequiredFields.add("validFrom");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UriDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UriDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UriDetails is not found in the empty JSON string", UriDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UriDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UriDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UriDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("aadhaar") != null && !jsonObj.get("aadhaar").isJsonNull()) && !jsonObj.get("aadhaar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aadhaar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aadhaar").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("docType") != null && !jsonObj.get("docType").isJsonNull()) && !jsonObj.get("docType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docType").toString()));
      }
      if ((jsonObj.get("docName") != null && !jsonObj.get("docName").isJsonNull()) && !jsonObj.get("docName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docName").toString()));
      }
      if ((jsonObj.get("docId") != null && !jsonObj.get("docId").isJsonNull()) && !jsonObj.get("docId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docId").toString()));
      }
      if ((jsonObj.get("issuedOn") != null && !jsonObj.get("issuedOn").isJsonNull()) && !jsonObj.get("issuedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuedOn").toString()));
      }
      if ((jsonObj.get("validFrom") != null && !jsonObj.get("validFrom").isJsonNull()) && !jsonObj.get("validFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validFrom").toString()));
      }
      if ((jsonObj.get("validTo") != null && !jsonObj.get("validTo").isJsonNull()) && !jsonObj.get("validTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validTo").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UriDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UriDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UriDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UriDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UriDetails>() {
           @Override
           public void write(JsonWriter out, UriDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UriDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UriDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UriDetails
  * @throws IOException if the JSON string is invalid with respect to UriDetails
  */
  public static UriDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UriDetails.class);
  }

 /**
  * Convert an instance of UriDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

