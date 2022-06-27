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
import com.mydatamyconsent.model.DataConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Data Consent details.
 */
@ApiModel(description = "Data Consent details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-27T10:37:06.619147647Z[Etc/UTC]")
public class DataConsentDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private UUID requestId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

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

  public static final String SERIALIZED_NAME_REQUESTED_AT_UTC = "requestedAtUtc";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT_UTC)
  private OffsetDateTime requestedAtUtc;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC = "dataAccessExpiresAtUtc";
  @SerializedName(SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC)
  private OffsetDateTime dataAccessExpiresAtUtc;

  public static final String SERIALIZED_NAME_REVOKED_AT_UTC = "revokedAtUtc";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT_UTC)
  private OffsetDateTime revokedAtUtc;

  public DataConsentDetails() { 
  }

  public DataConsentDetails id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Data consent id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data consent id.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DataConsentDetails requestId(UUID requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Consent request id.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request id.")

  public UUID getRequestId() {
    return requestId;
  }


  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }


  public DataConsentDetails templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Consent template id.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent template id.")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public DataConsentDetails title(String title) {
    
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


  public DataConsentDetails description(String description) {
    
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


  public DataConsentDetails purpose(String purpose) {
    
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


  public DataConsentDetails status(DataConsentStatus status) {
    
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


  public DataConsentDetails transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction id.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction id.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public DataConsentDetails requestedAtUtc(OffsetDateTime requestedAtUtc) {
    
    this.requestedAtUtc = requestedAtUtc;
    return this;
  }

   /**
   * Consent requested datetime in UTC timezone.
   * @return requestedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent requested datetime in UTC timezone.")

  public OffsetDateTime getRequestedAtUtc() {
    return requestedAtUtc;
  }


  public void setRequestedAtUtc(OffsetDateTime requestedAtUtc) {
    this.requestedAtUtc = requestedAtUtc;
  }


  public DataConsentDetails approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Consent approval datetime in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent approval datetime in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public DataConsentDetails dataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
    return this;
  }

   /**
   * Data access expiration datetime in UTC timezone.
   * @return dataAccessExpiresAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data access expiration datetime in UTC timezone.")

  public OffsetDateTime getDataAccessExpiresAtUtc() {
    return dataAccessExpiresAtUtc;
  }


  public void setDataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
  }


  public DataConsentDetails revokedAtUtc(OffsetDateTime revokedAtUtc) {
    
    this.revokedAtUtc = revokedAtUtc;
    return this;
  }

   /**
   * Consent revocation datetime in UTC timezone.
   * @return revokedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent revocation datetime in UTC timezone.")

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
    DataConsentDetails dataConsentDetails = (DataConsentDetails) o;
    return Objects.equals(this.id, dataConsentDetails.id) &&
        Objects.equals(this.requestId, dataConsentDetails.requestId) &&
        Objects.equals(this.templateId, dataConsentDetails.templateId) &&
        Objects.equals(this.title, dataConsentDetails.title) &&
        Objects.equals(this.description, dataConsentDetails.description) &&
        Objects.equals(this.purpose, dataConsentDetails.purpose) &&
        Objects.equals(this.status, dataConsentDetails.status) &&
        Objects.equals(this.transactionId, dataConsentDetails.transactionId) &&
        Objects.equals(this.requestedAtUtc, dataConsentDetails.requestedAtUtc) &&
        Objects.equals(this.approvedAtUtc, dataConsentDetails.approvedAtUtc) &&
        Objects.equals(this.dataAccessExpiresAtUtc, dataConsentDetails.dataAccessExpiresAtUtc) &&
        Objects.equals(this.revokedAtUtc, dataConsentDetails.revokedAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestId, templateId, title, description, purpose, status, transactionId, requestedAtUtc, approvedAtUtc, dataAccessExpiresAtUtc, revokedAtUtc);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataConsentDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    requestedAtUtc: ").append(toIndentedString(requestedAtUtc)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    dataAccessExpiresAtUtc: ").append(toIndentedString(dataAccessExpiresAtUtc)).append("\n");
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
    openapiFields.add("requestId");
    openapiFields.add("templateId");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("purpose");
    openapiFields.add("status");
    openapiFields.add("transactionId");
    openapiFields.add("requestedAtUtc");
    openapiFields.add("approvedAtUtc");
    openapiFields.add("dataAccessExpiresAtUtc");
    openapiFields.add("revokedAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("requestId");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("requestedAtUtc");
    openapiRequiredFields.add("approvedAtUtc");
    openapiRequiredFields.add("dataAccessExpiresAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataConsentDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataConsentDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataConsentDetails is not found in the empty JSON string", DataConsentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataConsentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataConsentDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataConsentDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if (jsonObj.get("templateId") != null && !jsonObj.get("templateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateId").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataConsentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataConsentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataConsentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataConsentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DataConsentDetails>() {
           @Override
           public void write(JsonWriter out, DataConsentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataConsentDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataConsentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataConsentDetails
  * @throws IOException if the JSON string is invalid with respect to DataConsentDetails
  */
  public static DataConsentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataConsentDetails.class);
  }

 /**
  * Convert an instance of DataConsentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

