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
import com.mydatamyconsent.model.CollectibleTypes;
import com.mydatamyconsent.model.DataConsentDocument;
import com.mydatamyconsent.model.DataConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Data Consent details.
 */
@ApiModel(description = "Data Consent details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-03T10:36:10.844222939Z[Etc/UTC]")
public class DataConsent {
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
  private List<CollectibleTypes> collectables = new ArrayList<CollectibleTypes>();

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Object identifiers = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DataConsentDocument> documents = null;

  public DataConsent() { 
  }

  public DataConsent id(UUID id) {
    
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


  public DataConsent requestId(UUID requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Data consent request id.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data consent request id.")

  public UUID getRequestId() {
    return requestId;
  }


  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }


  public DataConsent templateId(UUID templateId) {
    
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


  public DataConsent title(String title) {
    
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


  public DataConsent description(String description) {
    
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


  public DataConsent purpose(String purpose) {
    
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


  public DataConsent status(DataConsentStatus status) {
    
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


  public DataConsent transactionId(String transactionId) {
    
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


  public DataConsent approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
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


  public DataConsent dataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    
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


  public DataConsent revokedAtUtc(OffsetDateTime revokedAtUtc) {
    
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


  public DataConsent collectables(List<CollectibleTypes> collectables) {
    
    this.collectables = collectables;
    return this;
  }

  public DataConsent addCollectablesItem(CollectibleTypes collectablesItem) {
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


  public DataConsent identifiers(Object identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Consented identity details.
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consented identity details.")

  public Object getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(Object identifiers) {
    this.identifiers = identifiers;
  }


  public DataConsent documents(List<DataConsentDocument> documents) {
    
    this.documents = documents;
    return this;
  }

  public DataConsent addDocumentsItem(DataConsentDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DataConsentDocument>();
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

  public List<DataConsentDocument> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DataConsentDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsent dataConsent = (DataConsent) o;
    return Objects.equals(this.id, dataConsent.id) &&
        Objects.equals(this.requestId, dataConsent.requestId) &&
        Objects.equals(this.templateId, dataConsent.templateId) &&
        Objects.equals(this.title, dataConsent.title) &&
        Objects.equals(this.description, dataConsent.description) &&
        Objects.equals(this.purpose, dataConsent.purpose) &&
        Objects.equals(this.status, dataConsent.status) &&
        Objects.equals(this.transactionId, dataConsent.transactionId) &&
        Objects.equals(this.approvedAtUtc, dataConsent.approvedAtUtc) &&
        Objects.equals(this.dataAccessExpiresAtUtc, dataConsent.dataAccessExpiresAtUtc) &&
        Objects.equals(this.revokedAtUtc, dataConsent.revokedAtUtc) &&
        Objects.equals(this.collectables, dataConsent.collectables) &&
        Objects.equals(this.identifiers, dataConsent.identifiers) &&
        Objects.equals(this.documents, dataConsent.documents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestId, templateId, title, description, purpose, status, transactionId, approvedAtUtc, dataAccessExpiresAtUtc, revokedAtUtc, collectables, identifiers, documents);
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
    sb.append("class DataConsent {\n");
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

}

