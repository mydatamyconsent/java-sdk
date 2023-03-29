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
import com.mydatamyconsent.model.DocumentIssueRequestPaymentRequest;
import com.mydatamyconsent.model.DocumentIssueRequestReceiver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

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
 * DocumentIssueRequest : Document Issue Request.
 */
@ApiModel(description = "DocumentIssueRequest : Document Issue Request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-29T10:35:53.433540359Z[Etc/UTC]")
public class DocumentIssueRequest {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private String documentTypeId;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private DocumentIssueRequestReceiver receiver;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST = "paymentRequest";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST)
  private DocumentIssueRequestPaymentRequest paymentRequest;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_VALID_FROM_UTC = "validFromUtc";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_UTC)
  private OffsetDateTime validFromUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public DocumentIssueRequest() {
  }

  public DocumentIssueRequest documentTypeId(String documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Document type id.
   * @return documentTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type id.")

  public String getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DocumentIssueRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public DocumentIssueRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Document description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentIssueRequest receiver(DocumentIssueRequestReceiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentIssueRequestReceiver getReceiver() {
    return receiver;
  }


  public void setReceiver(DocumentIssueRequestReceiver receiver) {
    this.receiver = receiver;
  }


  public DocumentIssueRequest paymentRequest(DocumentIssueRequestPaymentRequest paymentRequest) {
    
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentIssueRequestPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }


  public void setPaymentRequest(DocumentIssueRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  public DocumentIssueRequest issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Datetime of issue in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Datetime of issue in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public DocumentIssueRequest validFromUtc(OffsetDateTime validFromUtc) {
    
    this.validFromUtc = validFromUtc;
    return this;
  }

   /**
   * Valid from datetime in UTC timezone.
   * @return validFromUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Valid from datetime in UTC timezone.")

  public OffsetDateTime getValidFromUtc() {
    return validFromUtc;
  }


  public void setValidFromUtc(OffsetDateTime validFromUtc) {
    this.validFromUtc = validFromUtc;
  }


  public DocumentIssueRequest expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Datetime of expiry in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime of expiry in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DocumentIssueRequest metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public DocumentIssueRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIssueRequest documentIssueRequest = (DocumentIssueRequest) o;
    return Objects.equals(this.documentTypeId, documentIssueRequest.documentTypeId) &&
        Objects.equals(this.identifier, documentIssueRequest.identifier) &&
        Objects.equals(this.description, documentIssueRequest.description) &&
        Objects.equals(this.receiver, documentIssueRequest.receiver) &&
        Objects.equals(this.paymentRequest, documentIssueRequest.paymentRequest) &&
        Objects.equals(this.issuedAtUtc, documentIssueRequest.issuedAtUtc) &&
        Objects.equals(this.validFromUtc, documentIssueRequest.validFromUtc) &&
        Objects.equals(this.expiresAtUtc, documentIssueRequest.expiresAtUtc) &&
        Objects.equals(this.metadata, documentIssueRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypeId, identifier, description, receiver, paymentRequest, issuedAtUtc, validFromUtc, expiresAtUtc, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentIssueRequest {\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    validFromUtc: ").append(toIndentedString(validFromUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("documentTypeId");
    openapiFields.add("identifier");
    openapiFields.add("description");
    openapiFields.add("receiver");
    openapiFields.add("paymentRequest");
    openapiFields.add("issuedAtUtc");
    openapiFields.add("validFromUtc");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documentTypeId");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("receiver");
    openapiRequiredFields.add("issuedAtUtc");
    openapiRequiredFields.add("validFromUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentIssueRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DocumentIssueRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentIssueRequest is not found in the empty JSON string", DocumentIssueRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentIssueRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentIssueRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentIssueRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("documentTypeId") != null && !jsonObj.get("documentTypeId").isJsonNull()) && !jsonObj.get("documentTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentTypeId").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) {
        DocumentIssueRequestReceiver.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
      // validate the optional field `paymentRequest`
      if (jsonObj.get("paymentRequest") != null && !jsonObj.get("paymentRequest").isJsonNull()) {
        DocumentIssueRequestPaymentRequest.validateJsonObject(jsonObj.getAsJsonObject("paymentRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentIssueRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentIssueRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentIssueRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentIssueRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentIssueRequest>() {
           @Override
           public void write(JsonWriter out, DocumentIssueRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentIssueRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentIssueRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentIssueRequest
  * @throws IOException if the JSON string is invalid with respect to DocumentIssueRequest
  */
  public static DocumentIssueRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentIssueRequest.class);
  }

 /**
  * Convert an instance of DocumentIssueRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

