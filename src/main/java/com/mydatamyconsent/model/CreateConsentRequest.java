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
import com.mydatamyconsent.model.ConsentRequestReceiver;
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
 * CreateConsentRequest : Create consent request.
 */
@ApiModel(description = "CreateConsentRequest : Create consent request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-21T10:37:23.539168289Z[Etc/UTC]")
public class CreateConsentRequest {
  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private String consentTemplateId;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ConsentRequestReceiver receiver;

  public CreateConsentRequest() {
  }

  public CreateConsentRequest consentTemplateId(String consentTemplateId) {
    
    this.consentTemplateId = consentTemplateId;
    return this;
  }

   /**
   * Consent request template id
   * @return consentTemplateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template id")

  public String getConsentTemplateId() {
    return consentTemplateId;
  }


  public void setConsentTemplateId(String consentTemplateId) {
    this.consentTemplateId = consentTemplateId;
  }


  public CreateConsentRequest receiver(ConsentRequestReceiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsentRequestReceiver getReceiver() {
    return receiver;
  }


  public void setReceiver(ConsentRequestReceiver receiver) {
    this.receiver = receiver;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConsentRequest createConsentRequest = (CreateConsentRequest) o;
    return Objects.equals(this.consentTemplateId, createConsentRequest.consentTemplateId) &&
        Objects.equals(this.receiver, createConsentRequest.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentTemplateId, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConsentRequest {\n");
    sb.append("    consentTemplateId: ").append(toIndentedString(consentTemplateId)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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
    openapiFields.add("consentTemplateId");
    openapiFields.add("receiver");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consentTemplateId");
    openapiRequiredFields.add("receiver");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateConsentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConsentRequest is not found in the empty JSON string", CreateConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConsentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("consentTemplateId") != null && !jsonObj.get("consentTemplateId").isJsonNull()) && !jsonObj.get("consentTemplateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentTemplateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consentTemplateId").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) {
        ConsentRequestReceiver.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConsentRequest>() {
           @Override
           public void write(JsonWriter out, CreateConsentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConsentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConsentRequest
  * @throws IOException if the JSON string is invalid with respect to CreateConsentRequest
  */
  public static CreateConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConsentRequest.class);
  }

 /**
  * Convert an instance of CreateConsentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

