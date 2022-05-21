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
import com.mydatamyconsent.model.DataConsentRequestDetails;
import com.mydatamyconsent.model.DataConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DataConsentRequestResponse
 */
@ApiModel(description = "DataConsentRequestResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T10:36:21.253037183Z[Etc/UTC]")
public class IndividualDataConsentRequestDetails {
  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private String receiver;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consentId";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private UUID consentId;

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

  public IndividualDataConsentRequestDetails() { 
  }

  public IndividualDataConsentRequestDetails receiver(String receiver) {
    
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


  public IndividualDataConsentRequestDetails id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public IndividualDataConsentRequestDetails templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Consent request template id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template id")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public IndividualDataConsentRequestDetails consentId(UUID consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * Data Consent id
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data Consent id")

  public UUID getConsentId() {
    return consentId;
  }


  public void setConsentId(UUID consentId) {
    this.consentId = consentId;
  }


  public IndividualDataConsentRequestDetails title(String title) {
    
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


  public IndividualDataConsentRequestDetails description(String description) {
    
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


  public IndividualDataConsentRequestDetails purpose(String purpose) {
    
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


  public IndividualDataConsentRequestDetails status(DataConsentStatus status) {
    
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


  public IndividualDataConsentRequestDetails transactionId(String transactionId) {
    
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


  public IndividualDataConsentRequestDetails createdAtUtc(OffsetDateTime createdAtUtc) {
    
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


  public IndividualDataConsentRequestDetails expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
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
    IndividualDataConsentRequestDetails individualDataConsentRequestDetails = (IndividualDataConsentRequestDetails) o;
    return Objects.equals(this.receiver, individualDataConsentRequestDetails.receiver) &&
        Objects.equals(this.id, individualDataConsentRequestDetails.id) &&
        Objects.equals(this.templateId, individualDataConsentRequestDetails.templateId) &&
        Objects.equals(this.consentId, individualDataConsentRequestDetails.consentId) &&
        Objects.equals(this.title, individualDataConsentRequestDetails.title) &&
        Objects.equals(this.description, individualDataConsentRequestDetails.description) &&
        Objects.equals(this.purpose, individualDataConsentRequestDetails.purpose) &&
        Objects.equals(this.status, individualDataConsentRequestDetails.status) &&
        Objects.equals(this.transactionId, individualDataConsentRequestDetails.transactionId) &&
        Objects.equals(this.createdAtUtc, individualDataConsentRequestDetails.createdAtUtc) &&
        Objects.equals(this.expiresAtUtc, individualDataConsentRequestDetails.expiresAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiver, id, templateId, consentId, title, description, purpose, status, transactionId, createdAtUtc, expiresAtUtc);
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
    sb.append("class IndividualDataConsentRequestDetails {\n");
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

}

