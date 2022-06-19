/*
 * My Data My Consent - Developer API
 * Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: v1
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
import java.util.UUID;

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
 * Create individual data consent request
 */
@ApiModel(description = "Create individual data consent request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-20T00:03:27.327039+05:30[Asia/Kolkata]")
public class CreateDataConsentRequest {
  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private UUID consentTemplateId;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ConsentRequestReceiver receiver;

  public CreateDataConsentRequest() { 
  }

  public CreateDataConsentRequest consentTemplateId(UUID consentTemplateId) {
    
    this.consentTemplateId = consentTemplateId;
    return this;
  }

   /**
   * Consent template id
   * @return consentTemplateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent template id")

  public UUID getConsentTemplateId() {
    return consentTemplateId;
  }


  public void setConsentTemplateId(UUID consentTemplateId) {
    this.consentTemplateId = consentTemplateId;
  }


  public CreateDataConsentRequest receiver(ConsentRequestReceiver receiver) {
    
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
    CreateDataConsentRequest createDataConsentRequest = (CreateDataConsentRequest) o;
    return Objects.equals(this.consentTemplateId, createDataConsentRequest.consentTemplateId) &&
        Objects.equals(this.receiver, createDataConsentRequest.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentTemplateId, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataConsentRequest {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to CreateDataConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateDataConsentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDataConsentRequest is not found in the empty JSON string", CreateDataConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateDataConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDataConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDataConsentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("consentTemplateId") != null && !jsonObj.get("consentTemplateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentTemplateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consentTemplateId").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.getAsJsonObject("receiver") != null) {
        ConsentRequestReceiver.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDataConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDataConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDataConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDataConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDataConsentRequest>() {
           @Override
           public void write(JsonWriter out, CreateDataConsentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDataConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDataConsentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDataConsentRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDataConsentRequest
  */
  public static CreateDataConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDataConsentRequest.class);
  }

 /**
  * Convert an instance of CreateDataConsentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

