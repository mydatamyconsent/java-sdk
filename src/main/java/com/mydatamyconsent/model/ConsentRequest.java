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
import com.mydatamyconsent.model.CollectibleTypes;
import com.mydatamyconsent.model.ConsentRequestReceiver;
import com.mydatamyconsent.model.DataConsentStatus;
import com.mydatamyconsent.model.Life;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ConsentRequest :Consent request details.
 */
@ApiModel(description = "ConsentRequest :Consent request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T10:38:51.740024692Z[Etc/UTC]")
public class ConsentRequest {
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

  public static final String SERIALIZED_NAME_DATA_LIFE = "dataLife";
  @SerializedName(SERIALIZED_NAME_DATA_LIFE)
  private Life dataLife;

  public static final String SERIALIZED_NAME_COLLECTABLES = "collectables";
  @SerializedName(SERIALIZED_NAME_COLLECTABLES)
  private List<CollectibleTypes> collectables = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ConsentRequestReceiver receiver;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC = "dataAccessExpiresAtUtc";
  @SerializedName(SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC)
  private OffsetDateTime dataAccessExpiresAtUtc;

  public static final String SERIALIZED_NAME_REJECTED_AT_UTC = "rejectedAtUtc";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT_UTC)
  private OffsetDateTime rejectedAtUtc;

  public static final String SERIALIZED_NAME_REVOKED_AT_UTC = "revokedAtUtc";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT_UTC)
  private OffsetDateTime revokedAtUtc;

  public ConsentRequest() {
  }

  public ConsentRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentRequest templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Consent request template id.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template id.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public ConsentRequest consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * Consent id.
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent id.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public ConsentRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Consent title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ConsentRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Consent description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ConsentRequest purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Consent purpose.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent purpose.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public ConsentRequest dataLife(Life dataLife) {
    
    this.dataLife = dataLife;
    return this;
  }

   /**
   * Get dataLife
   * @return dataLife
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Life getDataLife() {
    return dataLife;
  }


  public void setDataLife(Life dataLife) {
    this.dataLife = dataLife;
  }


  public ConsentRequest collectables(List<CollectibleTypes> collectables) {
    
    this.collectables = collectables;
    return this;
  }

  public ConsentRequest addCollectablesItem(CollectibleTypes collectablesItem) {
    this.collectables.add(collectablesItem);
    return this;
  }

   /**
   * List of supported collectables.
   * @return collectables
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of supported collectables.")

  public List<CollectibleTypes> getCollectables() {
    return collectables;
  }


  public void setCollectables(List<CollectibleTypes> collectables) {
    this.collectables = collectables;
  }


  public ConsentRequest receiver(ConsentRequestReceiver receiver) {
    
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


  public ConsentRequest status(DataConsentStatus status) {
    
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


  public ConsentRequest createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Request creation datetime in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request creation datetime in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public ConsentRequest expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Request expiration datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request expiration datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public ConsentRequest approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Request approval datetime in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request approval datetime in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public ConsentRequest dataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
    return this;
  }

   /**
   * Data access expiration datetime in UTC timezone.
   * @return dataAccessExpiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data access expiration datetime in UTC timezone.")

  public OffsetDateTime getDataAccessExpiresAtUtc() {
    return dataAccessExpiresAtUtc;
  }


  public void setDataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
  }


  public ConsentRequest rejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    
    this.rejectedAtUtc = rejectedAtUtc;
    return this;
  }

   /**
   * Request rejection datetime in UTC timezone.
   * @return rejectedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request rejection datetime in UTC timezone.")

  public OffsetDateTime getRejectedAtUtc() {
    return rejectedAtUtc;
  }


  public void setRejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    this.rejectedAtUtc = rejectedAtUtc;
  }


  public ConsentRequest revokedAtUtc(OffsetDateTime revokedAtUtc) {
    
    this.revokedAtUtc = revokedAtUtc;
    return this;
  }

   /**
   * Request revocation datetime in UTC timezone.
   * @return revokedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request revocation datetime in UTC timezone.")

  public OffsetDateTime getRevokedAtUtc() {
    return revokedAtUtc;
  }


  public void setRevokedAtUtc(OffsetDateTime revokedAtUtc) {
    this.revokedAtUtc = revokedAtUtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.id, consentRequest.id) &&
        Objects.equals(this.templateId, consentRequest.templateId) &&
        Objects.equals(this.consentId, consentRequest.consentId) &&
        Objects.equals(this.title, consentRequest.title) &&
        Objects.equals(this.description, consentRequest.description) &&
        Objects.equals(this.purpose, consentRequest.purpose) &&
        Objects.equals(this.dataLife, consentRequest.dataLife) &&
        Objects.equals(this.collectables, consentRequest.collectables) &&
        Objects.equals(this.receiver, consentRequest.receiver) &&
        Objects.equals(this.status, consentRequest.status) &&
        Objects.equals(this.createdAtUtc, consentRequest.createdAtUtc) &&
        Objects.equals(this.expiresAtUtc, consentRequest.expiresAtUtc) &&
        Objects.equals(this.approvedAtUtc, consentRequest.approvedAtUtc) &&
        Objects.equals(this.dataAccessExpiresAtUtc, consentRequest.dataAccessExpiresAtUtc) &&
        Objects.equals(this.rejectedAtUtc, consentRequest.rejectedAtUtc) &&
        Objects.equals(this.revokedAtUtc, consentRequest.revokedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, consentId, title, description, purpose, dataLife, collectables, receiver, status, createdAtUtc, expiresAtUtc, approvedAtUtc, dataAccessExpiresAtUtc, rejectedAtUtc, revokedAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    dataLife: ").append(toIndentedString(dataLife)).append("\n");
    sb.append("    collectables: ").append(toIndentedString(collectables)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    dataAccessExpiresAtUtc: ").append(toIndentedString(dataAccessExpiresAtUtc)).append("\n");
    sb.append("    rejectedAtUtc: ").append(toIndentedString(rejectedAtUtc)).append("\n");
    sb.append("    revokedAtUtc: ").append(toIndentedString(revokedAtUtc)).append("\n");
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
    openapiFields.add("templateId");
    openapiFields.add("consentId");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("purpose");
    openapiFields.add("dataLife");
    openapiFields.add("collectables");
    openapiFields.add("receiver");
    openapiFields.add("status");
    openapiFields.add("createdAtUtc");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("approvedAtUtc");
    openapiFields.add("dataAccessExpiresAtUtc");
    openapiFields.add("rejectedAtUtc");
    openapiFields.add("revokedAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("collectables");
    openapiRequiredFields.add("receiver");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdAtUtc");
    openapiRequiredFields.add("expiresAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentRequest is not found in the empty JSON string", ConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      // validate the optional field `dataLife`
      if (jsonObj.get("dataLife") != null && !jsonObj.get("dataLife").isJsonNull()) {
        Life.validateJsonObject(jsonObj.getAsJsonObject("dataLife"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("collectables") != null && !jsonObj.get("collectables").isJsonNull()) && !jsonObj.get("collectables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectables` to be an array in the JSON string but got `%s`", jsonObj.get("collectables").toString()));
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
       if (!ConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentRequest>() {
           @Override
           public void write(JsonWriter out, ConsentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentRequest
  * @throws IOException if the JSON string is invalid with respect to ConsentRequest
  */
  public static ConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentRequest.class);
  }

 /**
  * Convert an instance of ConsentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

