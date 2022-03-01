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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * UserDataConsentInfoDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T10:35:11.987146036Z[Etc/UTC]")
public class UserDataConsentInfoDto {
  public static final String SERIALIZED_NAME_CONSENT_REQUEST_ID = "consentRequestId";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST_ID)
  private UUID consentRequestId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private UUID consentTemplateId;

  public static final String SERIALIZED_NAME_CONSENT_PURPOSE = "consentPurpose";
  @SerializedName(SERIALIZED_NAME_CONSENT_PURPOSE)
  private String consentPurpose;

  public static final String SERIALIZED_NAME_CONSENT_DESCRIPTION = "consentDescription";
  @SerializedName(SERIALIZED_NAME_CONSENT_DESCRIPTION)
  private String consentDescription;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_CONSENT_SENT_TO_USER = "consentSentToUser";
  @SerializedName(SERIALIZED_NAME_CONSENT_SENT_TO_USER)
  private String consentSentToUser;

  public UserDataConsentInfoDto() { 
  }

  public UserDataConsentInfoDto consentRequestId(UUID consentRequestId) {
    
    this.consentRequestId = consentRequestId;
    return this;
  }

   /**
   * Get consentRequestId
   * @return consentRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getConsentRequestId() {
    return consentRequestId;
  }


  public void setConsentRequestId(UUID consentRequestId) {
    this.consentRequestId = consentRequestId;
  }


  public UserDataConsentInfoDto userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public UserDataConsentInfoDto consentTemplateId(UUID consentTemplateId) {
    
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


  public UserDataConsentInfoDto consentPurpose(String consentPurpose) {
    
    this.consentPurpose = consentPurpose;
    return this;
  }

   /**
   * Get consentPurpose
   * @return consentPurpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentPurpose() {
    return consentPurpose;
  }


  public void setConsentPurpose(String consentPurpose) {
    this.consentPurpose = consentPurpose;
  }


  public UserDataConsentInfoDto consentDescription(String consentDescription) {
    
    this.consentDescription = consentDescription;
    return this;
  }

   /**
   * Get consentDescription
   * @return consentDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentDescription() {
    return consentDescription;
  }


  public void setConsentDescription(String consentDescription) {
    this.consentDescription = consentDescription;
  }


  public UserDataConsentInfoDto status(DataConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataConsentStatus getStatus() {
    return status;
  }


  public void setStatus(DataConsentStatus status) {
    this.status = status;
  }


  public UserDataConsentInfoDto createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Get createdAtUtc
   * @return createdAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public UserDataConsentInfoDto consentSentToUser(String consentSentToUser) {
    
    this.consentSentToUser = consentSentToUser;
    return this;
  }

   /**
   * Get consentSentToUser
   * @return consentSentToUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentSentToUser() {
    return consentSentToUser;
  }


  public void setConsentSentToUser(String consentSentToUser) {
    this.consentSentToUser = consentSentToUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataConsentInfoDto userDataConsentInfoDto = (UserDataConsentInfoDto) o;
    return Objects.equals(this.consentRequestId, userDataConsentInfoDto.consentRequestId) &&
        Objects.equals(this.userId, userDataConsentInfoDto.userId) &&
        Objects.equals(this.consentTemplateId, userDataConsentInfoDto.consentTemplateId) &&
        Objects.equals(this.consentPurpose, userDataConsentInfoDto.consentPurpose) &&
        Objects.equals(this.consentDescription, userDataConsentInfoDto.consentDescription) &&
        Objects.equals(this.status, userDataConsentInfoDto.status) &&
        Objects.equals(this.createdAtUtc, userDataConsentInfoDto.createdAtUtc) &&
        Objects.equals(this.consentSentToUser, userDataConsentInfoDto.consentSentToUser);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequestId, userId, consentTemplateId, consentPurpose, consentDescription, status, createdAtUtc, consentSentToUser);
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
    sb.append("class UserDataConsentInfoDto {\n");
    sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    consentTemplateId: ").append(toIndentedString(consentTemplateId)).append("\n");
    sb.append("    consentPurpose: ").append(toIndentedString(consentPurpose)).append("\n");
    sb.append("    consentDescription: ").append(toIndentedString(consentDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    consentSentToUser: ").append(toIndentedString(consentSentToUser)).append("\n");
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

