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
import com.mydatamyconsent.model.ConsentRequestTemplateStatus;
import com.mydatamyconsent.model.DocumentField;
import com.mydatamyconsent.model.FinancialAccountField;
import com.mydatamyconsent.model.IdentityField;
import com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsDataFrequency;
import com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsDataLife;
import com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsRequestLife;
import com.mydatamyconsent.model.MedicalRecordField;
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
 * IndividualConsentRequestTemplateDetails :  Individual consent request template details.
 */
@ApiModel(description = "IndividualConsentRequestTemplateDetails :  Individual consent request template details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T10:38:51.740024692Z[Etc/UTC]")
public class IndividualConsentRequestTemplateDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public static final String SERIALIZED_NAME_SHORT_ID = "shortId";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ConsentRequestTemplateStatus status;

  public static final String SERIALIZED_NAME_DATA_LIFE = "dataLife";
  @SerializedName(SERIALIZED_NAME_DATA_LIFE)
  private IndividualConsentRequestTemplateDetailsDataLife dataLife;

  public static final String SERIALIZED_NAME_REQUEST_LIFE = "requestLife";
  @SerializedName(SERIALIZED_NAME_REQUEST_LIFE)
  private IndividualConsentRequestTemplateDetailsRequestLife requestLife;

  public static final String SERIALIZED_NAME_DATA_FREQUENCY = "dataFrequency";
  @SerializedName(SERIALIZED_NAME_DATA_FREQUENCY)
  private IndividualConsentRequestTemplateDetailsDataFrequency dataFrequency;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<IdentityField> identifiers = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocumentField> documents = null;

  public static final String SERIALIZED_NAME_MEDICAL_RECORDS = "medicalRecords";
  @SerializedName(SERIALIZED_NAME_MEDICAL_RECORDS)
  private List<MedicalRecordField> medicalRecords = null;

  public static final String SERIALIZED_NAME_FINANCIAL_ACCOUNTS = "financialAccounts";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ACCOUNTS)
  private List<FinancialAccountField> financialAccounts = null;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_PUBLISHED_AT_UTC = "publishedAtUtc";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT_UTC)
  private OffsetDateTime publishedAtUtc;

  public static final String SERIALIZED_NAME_REJECTED_AT_UTC = "rejectedAtUtc";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT_UTC)
  private OffsetDateTime rejectedAtUtc;

  public static final String SERIALIZED_NAME_REJECTION_REASON = "rejectionReason";
  @SerializedName(SERIALIZED_NAME_REJECTION_REASON)
  private String rejectionReason;

  public IndividualConsentRequestTemplateDetails() {
  }

  public IndividualConsentRequestTemplateDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request template id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IndividualConsentRequestTemplateDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Consent request template title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IndividualConsentRequestTemplateDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Consent request template description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IndividualConsentRequestTemplateDetails purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Consent request template purpose.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template purpose.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public IndividualConsentRequestTemplateDetails shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Consent request template short Id.
   * @return shortId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template short Id.")

  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public IndividualConsentRequestTemplateDetails status(ConsentRequestTemplateStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsentRequestTemplateStatus getStatus() {
    return status;
  }


  public void setStatus(ConsentRequestTemplateStatus status) {
    this.status = status;
  }


  public IndividualConsentRequestTemplateDetails dataLife(IndividualConsentRequestTemplateDetailsDataLife dataLife) {
    
    this.dataLife = dataLife;
    return this;
  }

   /**
   * Get dataLife
   * @return dataLife
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndividualConsentRequestTemplateDetailsDataLife getDataLife() {
    return dataLife;
  }


  public void setDataLife(IndividualConsentRequestTemplateDetailsDataLife dataLife) {
    this.dataLife = dataLife;
  }


  public IndividualConsentRequestTemplateDetails requestLife(IndividualConsentRequestTemplateDetailsRequestLife requestLife) {
    
    this.requestLife = requestLife;
    return this;
  }

   /**
   * Get requestLife
   * @return requestLife
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndividualConsentRequestTemplateDetailsRequestLife getRequestLife() {
    return requestLife;
  }


  public void setRequestLife(IndividualConsentRequestTemplateDetailsRequestLife requestLife) {
    this.requestLife = requestLife;
  }


  public IndividualConsentRequestTemplateDetails dataFrequency(IndividualConsentRequestTemplateDetailsDataFrequency dataFrequency) {
    
    this.dataFrequency = dataFrequency;
    return this;
  }

   /**
   * Get dataFrequency
   * @return dataFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndividualConsentRequestTemplateDetailsDataFrequency getDataFrequency() {
    return dataFrequency;
  }


  public void setDataFrequency(IndividualConsentRequestTemplateDetailsDataFrequency dataFrequency) {
    this.dataFrequency = dataFrequency;
  }


  public IndividualConsentRequestTemplateDetails identifiers(List<IdentityField> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public IndividualConsentRequestTemplateDetails addIdentifiersItem(IdentityField identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Consent request template identity fields.
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template identity fields.")

  public List<IdentityField> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<IdentityField> identifiers) {
    this.identifiers = identifiers;
  }


  public IndividualConsentRequestTemplateDetails documents(List<DocumentField> documents) {
    
    this.documents = documents;
    return this;
  }

  public IndividualConsentRequestTemplateDetails addDocumentsItem(DocumentField documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Consent request template document fields.
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template document fields.")

  public List<DocumentField> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DocumentField> documents) {
    this.documents = documents;
  }


  public IndividualConsentRequestTemplateDetails medicalRecords(List<MedicalRecordField> medicalRecords) {
    
    this.medicalRecords = medicalRecords;
    return this;
  }

  public IndividualConsentRequestTemplateDetails addMedicalRecordsItem(MedicalRecordField medicalRecordsItem) {
    if (this.medicalRecords == null) {
      this.medicalRecords = new ArrayList<>();
    }
    this.medicalRecords.add(medicalRecordsItem);
    return this;
  }

   /**
   * Consent request template medical record fields.
   * @return medicalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template medical record fields.")

  public List<MedicalRecordField> getMedicalRecords() {
    return medicalRecords;
  }


  public void setMedicalRecords(List<MedicalRecordField> medicalRecords) {
    this.medicalRecords = medicalRecords;
  }


  public IndividualConsentRequestTemplateDetails financialAccounts(List<FinancialAccountField> financialAccounts) {
    
    this.financialAccounts = financialAccounts;
    return this;
  }

  public IndividualConsentRequestTemplateDetails addFinancialAccountsItem(FinancialAccountField financialAccountsItem) {
    if (this.financialAccounts == null) {
      this.financialAccounts = new ArrayList<>();
    }
    this.financialAccounts.add(financialAccountsItem);
    return this;
  }

   /**
   * Consent request template financial account fields.
   * @return financialAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template financial account fields.")

  public List<FinancialAccountField> getFinancialAccounts() {
    return financialAccounts;
  }


  public void setFinancialAccounts(List<FinancialAccountField> financialAccounts) {
    this.financialAccounts = financialAccounts;
  }


  public IndividualConsentRequestTemplateDetails createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Consent request template created by user.
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template created by user.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public IndividualConsentRequestTemplateDetails createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Consent request template created datetime in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template created datetime in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public IndividualConsentRequestTemplateDetails approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Consent request template approval datetime in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template approval datetime in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public IndividualConsentRequestTemplateDetails publishedAtUtc(OffsetDateTime publishedAtUtc) {
    
    this.publishedAtUtc = publishedAtUtc;
    return this;
  }

   /**
   * Consent request template published datetime in UTC timezone.
   * @return publishedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template published datetime in UTC timezone.")

  public OffsetDateTime getPublishedAtUtc() {
    return publishedAtUtc;
  }


  public void setPublishedAtUtc(OffsetDateTime publishedAtUtc) {
    this.publishedAtUtc = publishedAtUtc;
  }


  public IndividualConsentRequestTemplateDetails rejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    
    this.rejectedAtUtc = rejectedAtUtc;
    return this;
  }

   /**
   * Consent request template rejection datetime in UTC timezone.
   * @return rejectedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template rejection datetime in UTC timezone.")

  public OffsetDateTime getRejectedAtUtc() {
    return rejectedAtUtc;
  }


  public void setRejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    this.rejectedAtUtc = rejectedAtUtc;
  }


  public IndividualConsentRequestTemplateDetails rejectionReason(String rejectionReason) {
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Consent request template rejection reason.
   * @return rejectionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template rejection reason.")

  public String getRejectionReason() {
    return rejectionReason;
  }


  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualConsentRequestTemplateDetails individualConsentRequestTemplateDetails = (IndividualConsentRequestTemplateDetails) o;
    return Objects.equals(this.id, individualConsentRequestTemplateDetails.id) &&
        Objects.equals(this.title, individualConsentRequestTemplateDetails.title) &&
        Objects.equals(this.description, individualConsentRequestTemplateDetails.description) &&
        Objects.equals(this.purpose, individualConsentRequestTemplateDetails.purpose) &&
        Objects.equals(this.shortId, individualConsentRequestTemplateDetails.shortId) &&
        Objects.equals(this.status, individualConsentRequestTemplateDetails.status) &&
        Objects.equals(this.dataLife, individualConsentRequestTemplateDetails.dataLife) &&
        Objects.equals(this.requestLife, individualConsentRequestTemplateDetails.requestLife) &&
        Objects.equals(this.dataFrequency, individualConsentRequestTemplateDetails.dataFrequency) &&
        Objects.equals(this.identifiers, individualConsentRequestTemplateDetails.identifiers) &&
        Objects.equals(this.documents, individualConsentRequestTemplateDetails.documents) &&
        Objects.equals(this.medicalRecords, individualConsentRequestTemplateDetails.medicalRecords) &&
        Objects.equals(this.financialAccounts, individualConsentRequestTemplateDetails.financialAccounts) &&
        Objects.equals(this.createdBy, individualConsentRequestTemplateDetails.createdBy) &&
        Objects.equals(this.createdAtUtc, individualConsentRequestTemplateDetails.createdAtUtc) &&
        Objects.equals(this.approvedAtUtc, individualConsentRequestTemplateDetails.approvedAtUtc) &&
        Objects.equals(this.publishedAtUtc, individualConsentRequestTemplateDetails.publishedAtUtc) &&
        Objects.equals(this.rejectedAtUtc, individualConsentRequestTemplateDetails.rejectedAtUtc) &&
        Objects.equals(this.rejectionReason, individualConsentRequestTemplateDetails.rejectionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, purpose, shortId, status, dataLife, requestLife, dataFrequency, identifiers, documents, medicalRecords, financialAccounts, createdBy, createdAtUtc, approvedAtUtc, publishedAtUtc, rejectedAtUtc, rejectionReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualConsentRequestTemplateDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataLife: ").append(toIndentedString(dataLife)).append("\n");
    sb.append("    requestLife: ").append(toIndentedString(requestLife)).append("\n");
    sb.append("    dataFrequency: ").append(toIndentedString(dataFrequency)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    medicalRecords: ").append(toIndentedString(medicalRecords)).append("\n");
    sb.append("    financialAccounts: ").append(toIndentedString(financialAccounts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    publishedAtUtc: ").append(toIndentedString(publishedAtUtc)).append("\n");
    sb.append("    rejectedAtUtc: ").append(toIndentedString(rejectedAtUtc)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("purpose");
    openapiFields.add("shortId");
    openapiFields.add("status");
    openapiFields.add("dataLife");
    openapiFields.add("requestLife");
    openapiFields.add("dataFrequency");
    openapiFields.add("identifiers");
    openapiFields.add("documents");
    openapiFields.add("medicalRecords");
    openapiFields.add("financialAccounts");
    openapiFields.add("createdBy");
    openapiFields.add("createdAtUtc");
    openapiFields.add("approvedAtUtc");
    openapiFields.add("publishedAtUtc");
    openapiFields.add("rejectedAtUtc");
    openapiFields.add("rejectionReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("shortId");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("createdAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndividualConsentRequestTemplateDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndividualConsentRequestTemplateDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndividualConsentRequestTemplateDetails is not found in the empty JSON string", IndividualConsentRequestTemplateDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndividualConsentRequestTemplateDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndividualConsentRequestTemplateDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IndividualConsentRequestTemplateDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      if ((jsonObj.get("shortId") != null && !jsonObj.get("shortId").isJsonNull()) && !jsonObj.get("shortId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortId").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ConsentRequestTemplateStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `dataLife`
      if (jsonObj.get("dataLife") != null && !jsonObj.get("dataLife").isJsonNull()) {
        IndividualConsentRequestTemplateDetailsDataLife.validateJsonObject(jsonObj.getAsJsonObject("dataLife"));
      }
      // validate the optional field `requestLife`
      if (jsonObj.get("requestLife") != null && !jsonObj.get("requestLife").isJsonNull()) {
        IndividualConsentRequestTemplateDetailsRequestLife.validateJsonObject(jsonObj.getAsJsonObject("requestLife"));
      }
      // validate the optional field `dataFrequency`
      if (jsonObj.get("dataFrequency") != null && !jsonObj.get("dataFrequency").isJsonNull()) {
        IndividualConsentRequestTemplateDetailsDataFrequency.validateJsonObject(jsonObj.getAsJsonObject("dataFrequency"));
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
            IdentityField.validateJsonObject(jsonArrayidentifiers.get(i).getAsJsonObject());
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
            DocumentField.validateJsonObject(jsonArraydocuments.get(i).getAsJsonObject());
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
            MedicalRecordField.validateJsonObject(jsonArraymedicalRecords.get(i).getAsJsonObject());
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
            FinancialAccountField.validateJsonObject(jsonArrayfinancialAccounts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("rejectionReason") != null && !jsonObj.get("rejectionReason").isJsonNull()) && !jsonObj.get("rejectionReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectionReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectionReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndividualConsentRequestTemplateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndividualConsentRequestTemplateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndividualConsentRequestTemplateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndividualConsentRequestTemplateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<IndividualConsentRequestTemplateDetails>() {
           @Override
           public void write(JsonWriter out, IndividualConsentRequestTemplateDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndividualConsentRequestTemplateDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndividualConsentRequestTemplateDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndividualConsentRequestTemplateDetails
  * @throws IOException if the JSON string is invalid with respect to IndividualConsentRequestTemplateDetails
  */
  public static IndividualConsentRequestTemplateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndividualConsentRequestTemplateDetails.class);
  }

 /**
  * Convert an instance of IndividualConsentRequestTemplateDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

