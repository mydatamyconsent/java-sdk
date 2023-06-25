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
import com.mydatamyconsent.model.ConsentedDocument;
import com.mydatamyconsent.model.ConsentedFinancialAccountField;
import com.mydatamyconsent.model.ConsentedIdentifier;
import com.mydatamyconsent.model.ConsentedMedicalRecord;
import com.mydatamyconsent.model.DataConsentStatus;
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
 * ConsentDetails : Consent details.
 */
@ApiModel(description = "ConsentDetails : Consent details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-25T10:37:05.156102047Z[Etc/UTC]")
public class ConsentDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

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

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC = "dataAccessExpiresAtUtc";
  @SerializedName(SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC)
  private OffsetDateTime dataAccessExpiresAtUtc;

  public static final String SERIALIZED_NAME_REVOKED_AT_UTC = "revokedAtUtc";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT_UTC)
  private OffsetDateTime revokedAtUtc;

  public static final String SERIALIZED_NAME_COLLECTABLES = "collectables";
  @SerializedName(SERIALIZED_NAME_COLLECTABLES)
  private List<CollectibleTypes> collectables = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<ConsentedIdentifier> identifiers = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<ConsentedDocument> documents = null;

  public static final String SERIALIZED_NAME_MEDICAL_RECORDS = "medicalRecords";
  @SerializedName(SERIALIZED_NAME_MEDICAL_RECORDS)
  private List<ConsentedMedicalRecord> medicalRecords = null;

  public static final String SERIALIZED_NAME_FINANCIAL_ACCOUNTS = "financialAccounts";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ACCOUNTS)
  private List<ConsentedFinancialAccountField> financialAccounts = null;

  public ConsentDetails() {
  }

  public ConsentDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentDetails requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Consent request id.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request id.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ConsentDetails templateId(String templateId) {
    
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


  public ConsentDetails title(String title) {
    
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


  public ConsentDetails description(String description) {
    
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


  public ConsentDetails purpose(String purpose) {
    
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


  public ConsentDetails status(DataConsentStatus status) {
    
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


  public ConsentDetails transactionId(String transactionId) {
    
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


  public ConsentDetails approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
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


  public ConsentDetails dataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    
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


  public ConsentDetails revokedAtUtc(OffsetDateTime revokedAtUtc) {
    
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


  public ConsentDetails collectables(List<CollectibleTypes> collectables) {
    
    this.collectables = collectables;
    return this;
  }

  public ConsentDetails addCollectablesItem(CollectibleTypes collectablesItem) {
    this.collectables.add(collectablesItem);
    return this;
  }

   /**
   * List of supported collectible types.
   * @return collectables
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of supported collectible types.")

  public List<CollectibleTypes> getCollectables() {
    return collectables;
  }


  public void setCollectables(List<CollectibleTypes> collectables) {
    this.collectables = collectables;
  }


  public ConsentDetails identifiers(List<ConsentedIdentifier> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public ConsentDetails addIdentifiersItem(ConsentedIdentifier identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Consented identity details.
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consented identity details.")

  public List<ConsentedIdentifier> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<ConsentedIdentifier> identifiers) {
    this.identifiers = identifiers;
  }


  public ConsentDetails documents(List<ConsentedDocument> documents) {
    
    this.documents = documents;
    return this;
  }

  public ConsentDetails addDocumentsItem(ConsentedDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * List of consented documents.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of consented documents.")

  public List<ConsentedDocument> getDocuments() {
    return documents;
  }


  public void setDocuments(List<ConsentedDocument> documents) {
    this.documents = documents;
  }


  public ConsentDetails medicalRecords(List<ConsentedMedicalRecord> medicalRecords) {
    
    this.medicalRecords = medicalRecords;
    return this;
  }

  public ConsentDetails addMedicalRecordsItem(ConsentedMedicalRecord medicalRecordsItem) {
    if (this.medicalRecords == null) {
      this.medicalRecords = new ArrayList<>();
    }
    this.medicalRecords.add(medicalRecordsItem);
    return this;
  }

   /**
   * List of consented medical records.
   * @return medicalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of consented medical records.")

  public List<ConsentedMedicalRecord> getMedicalRecords() {
    return medicalRecords;
  }


  public void setMedicalRecords(List<ConsentedMedicalRecord> medicalRecords) {
    this.medicalRecords = medicalRecords;
  }


  public ConsentDetails financialAccounts(List<ConsentedFinancialAccountField> financialAccounts) {
    
    this.financialAccounts = financialAccounts;
    return this;
  }

  public ConsentDetails addFinancialAccountsItem(ConsentedFinancialAccountField financialAccountsItem) {
    if (this.financialAccounts == null) {
      this.financialAccounts = new ArrayList<>();
    }
    this.financialAccounts.add(financialAccountsItem);
    return this;
  }

   /**
   * List of consented financial accounts.
   * @return financialAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of consented financial accounts.")

  public List<ConsentedFinancialAccountField> getFinancialAccounts() {
    return financialAccounts;
  }


  public void setFinancialAccounts(List<ConsentedFinancialAccountField> financialAccounts) {
    this.financialAccounts = financialAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentDetails consentDetails = (ConsentDetails) o;
    return Objects.equals(this.id, consentDetails.id) &&
        Objects.equals(this.requestId, consentDetails.requestId) &&
        Objects.equals(this.templateId, consentDetails.templateId) &&
        Objects.equals(this.title, consentDetails.title) &&
        Objects.equals(this.description, consentDetails.description) &&
        Objects.equals(this.purpose, consentDetails.purpose) &&
        Objects.equals(this.status, consentDetails.status) &&
        Objects.equals(this.transactionId, consentDetails.transactionId) &&
        Objects.equals(this.approvedAtUtc, consentDetails.approvedAtUtc) &&
        Objects.equals(this.dataAccessExpiresAtUtc, consentDetails.dataAccessExpiresAtUtc) &&
        Objects.equals(this.revokedAtUtc, consentDetails.revokedAtUtc) &&
        Objects.equals(this.collectables, consentDetails.collectables) &&
        Objects.equals(this.identifiers, consentDetails.identifiers) &&
        Objects.equals(this.documents, consentDetails.documents) &&
        Objects.equals(this.medicalRecords, consentDetails.medicalRecords) &&
        Objects.equals(this.financialAccounts, consentDetails.financialAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestId, templateId, title, description, purpose, status, transactionId, approvedAtUtc, dataAccessExpiresAtUtc, revokedAtUtc, collectables, identifiers, documents, medicalRecords, financialAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    dataAccessExpiresAtUtc: ").append(toIndentedString(dataAccessExpiresAtUtc)).append("\n");
    sb.append("    revokedAtUtc: ").append(toIndentedString(revokedAtUtc)).append("\n");
    sb.append("    collectables: ").append(toIndentedString(collectables)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    medicalRecords: ").append(toIndentedString(medicalRecords)).append("\n");
    sb.append("    financialAccounts: ").append(toIndentedString(financialAccounts)).append("\n");
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
    openapiFields.add("approvedAtUtc");
    openapiFields.add("dataAccessExpiresAtUtc");
    openapiFields.add("revokedAtUtc");
    openapiFields.add("collectables");
    openapiFields.add("identifiers");
    openapiFields.add("documents");
    openapiFields.add("medicalRecords");
    openapiFields.add("financialAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("requestId");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("approvedAtUtc");
    openapiRequiredFields.add("dataAccessExpiresAtUtc");
    openapiRequiredFields.add("collectables");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentDetails is not found in the empty JSON string", ConsentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if ((jsonObj.get("templateId") != null && !jsonObj.get("templateId").isJsonNull()) && !jsonObj.get("templateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateId").toString()));
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
      // ensure the json data is an array
      if ((jsonObj.get("collectables") != null && !jsonObj.get("collectables").isJsonNull()) && !jsonObj.get("collectables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectables` to be an array in the JSON string but got `%s`", jsonObj.get("collectables").toString()));
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
            ConsentedIdentifier.validateJsonObject(jsonArrayidentifiers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("documents") != null && !jsonObj.get("documents").isJsonNull()) {
        JsonArray jsonArraydocuments = jsonObj.getAsJsonArray("documents");
        if (jsonArraydocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documents` to be an array in the JSON string but got `%s`", jsonObj.get("documents").toString()));
          }

          // validate the optional field `documents` (array)
          for (int i = 0; i < jsonArraydocuments.size(); i++) {
            ConsentedDocument.validateJsonObject(jsonArraydocuments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("medicalRecords") != null && !jsonObj.get("medicalRecords").isJsonNull()) {
        JsonArray jsonArraymedicalRecords = jsonObj.getAsJsonArray("medicalRecords");
        if (jsonArraymedicalRecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("medicalRecords").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `medicalRecords` to be an array in the JSON string but got `%s`", jsonObj.get("medicalRecords").toString()));
          }

          // validate the optional field `medicalRecords` (array)
          for (int i = 0; i < jsonArraymedicalRecords.size(); i++) {
            ConsentedMedicalRecord.validateJsonObject(jsonArraymedicalRecords.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("financialAccounts") != null && !jsonObj.get("financialAccounts").isJsonNull()) {
        JsonArray jsonArrayfinancialAccounts = jsonObj.getAsJsonArray("financialAccounts");
        if (jsonArrayfinancialAccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("financialAccounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `financialAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("financialAccounts").toString()));
          }

          // validate the optional field `financialAccounts` (array)
          for (int i = 0; i < jsonArrayfinancialAccounts.size(); i++) {
            ConsentedFinancialAccountField.validateJsonObject(jsonArrayfinancialAccounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentDetails>() {
           @Override
           public void write(JsonWriter out, ConsentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentDetails
  * @throws IOException if the JSON string is invalid with respect to ConsentDetails
  */
  public static ConsentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentDetails.class);
  }

 /**
  * Convert an instance of ConsentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

