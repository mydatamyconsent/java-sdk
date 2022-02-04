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
import com.mydatamyconsent.model.Receiver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * DataConsentRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T22:01:19.170059642Z[Etc/UTC]")
public class DataConsentRequestModel {
  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private UUID consentTemplateId;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_EXPIRY_DATE_TIME = "expiryDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE_TIME)
  private OffsetDateTime expiryDateTime;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private Receiver receiver;

  public DataConsentRequestModel() { 
  }

  public DataConsentRequestModel consentTemplateId(UUID consentTemplateId) {
    
    this.consentTemplateId = consentTemplateId;
    return this;
  }

   /**
   * Get consentTemplateId
   * @return consentTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getConsentTemplateId() {
    return consentTemplateId;
  }


  public void setConsentTemplateId(UUID consentTemplateId) {
    this.consentTemplateId = consentTemplateId;
  }


  public DataConsentRequestModel startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public DataConsentRequestModel expiryDateTime(OffsetDateTime expiryDateTime) {
    
    this.expiryDateTime = expiryDateTime;
    return this;
  }

   /**
   * Get expiryDateTime
   * @return expiryDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiryDateTime() {
    return expiryDateTime;
  }


  public void setExpiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }


  public DataConsentRequestModel receiver(Receiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Receiver getReceiver() {
    return receiver;
  }


  public void setReceiver(Receiver receiver) {
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
    DataConsentRequestModel dataConsentRequestModel = (DataConsentRequestModel) o;
    return Objects.equals(this.consentTemplateId, dataConsentRequestModel.consentTemplateId) &&
        Objects.equals(this.startDateTime, dataConsentRequestModel.startDateTime) &&
        Objects.equals(this.expiryDateTime, dataConsentRequestModel.expiryDateTime) &&
        Objects.equals(this.receiver, dataConsentRequestModel.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentTemplateId, startDateTime, expiryDateTime, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataConsentRequestModel {\n");
    sb.append("    consentTemplateId: ").append(toIndentedString(consentTemplateId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
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

}

