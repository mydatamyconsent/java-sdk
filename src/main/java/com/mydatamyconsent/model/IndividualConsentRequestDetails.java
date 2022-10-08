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
import com.mydatamyconsent.model.DataConsentStatus;
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
 * IndividualConsentRequestDetails : Individual consent request details.
 */
@ApiModel(description = "IndividualConsentRequestDetails : Individual consent request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T10:38:54.719686986Z[Etc/UTC]")
public class IndividualConsentRequestDetails {
  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private String receiver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consentId";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public IndividualConsentRequestDetails() {
  }

  public IndividualConsentRequestDetails receiver(String receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Name of request receiver individual.
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of request receiver individual.")

  public String getReceiver() {
    return receiver;
  }


  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public IndividualConsentRequestDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IndividualConsentRequestDetails templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Consent request template id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template id")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public IndividualConsentRequestDetails consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * Consent id
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent id")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public IndividualConsentRequestDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Consent request title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IndividualConsentRequestDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Consent request description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IndividualConsentRequestDetails purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Consent request purpose.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request purpose.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public IndividualConsentRequestDetails status(DataConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DataConsentStatus getStatus() {
    return status;
  }


  public void setStatus(DataConsentStatus status) {
    this.status = status;
  }


  public IndividualConsentRequestDetails transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction id
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction id")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public IndividualConsentRequestDetails createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Request creation datetime in UTC timezone
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request creation datetime in UTC timezone")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public IndividualConsentRequestDetails expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Request expiration datetime in UTC timezone
   * @return expiresAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request expiration datetime in UTC timezone")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualConsentRequestDetails individualConsentRequestDetails = (IndividualConsentRequestDetails) o;
    return Objects.equals(this.receiver, individualConsentRequestDetails.receiver) &&
        Objects.equals(this.id, individualConsentRequestDetails.id) &&
        Objects.equals(this.templateId, individualConsentRequestDetails.templateId) &&
        Objects.equals(this.consentId, individualConsentRequestDetails.consentId) &&
        Objects.equals(this.title, individualConsentRequestDetails.title) &&
        Objects.equals(this.description, individualConsentRequestDetails.description) &&
        Objects.equals(this.purpose, individualConsentRequestDetails.purpose) &&
        Objects.equals(this.status, individualConsentRequestDetails.status) &&
        Objects.equals(this.transactionId, individualConsentRequestDetails.transactionId) &&
        Objects.equals(this.createdAtUtc, individualConsentRequestDetails.createdAtUtc) &&
        Objects.equals(this.expiresAtUtc, individualConsentRequestDetails.expiresAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiver, id, templateId, consentId, title, description, purpose, status, transactionId, createdAtUtc, expiresAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualConsentRequestDetails {\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
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
    openapiFields.add("receiver");
    openapiFields.add("id");
    openapiFields.add("templateId");
    openapiFields.add("consentId");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("purpose");
    openapiFields.add("status");
    openapiFields.add("transactionId");
    openapiFields.add("createdAtUtc");
    openapiFields.add("expiresAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("receiver");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdAtUtc");
    openapiRequiredFields.add("expiresAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndividualConsentRequestDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndividualConsentRequestDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualConsentRequestDetails is not found in the empty JSON string", IndividualConsentRequestDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndividualConsentRequestDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualConsentRequestDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IndividualConsentRequestDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) && !jsonObj.get("receiver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("templateId") != null && !jsonObj.get("templateId").isJsonNull()) && !jsonObj.get("templateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateId").toString()));
      }
      if ((jsonObj.get("consentId") != null && !jsonObj.get("consentId").isJsonNull()) && !jsonObj.get("consentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consentId").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualConsentRequestDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualConsentRequestDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualConsentRequestDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualConsentRequestDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualConsentRequestDetails>() {
           @Override
           public void write(JsonWriter out, IndividualConsentRequestDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualConsentRequestDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndividualConsentRequestDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndividualConsentRequestDetails
  * @throws IOException if the JSON string is invalid with respect to IndividualConsentRequestDetails
  */
  public static IndividualConsentRequestDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualConsentRequestDetails.class);
  }

 /**
  * Convert an instance of IndividualConsentRequestDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

