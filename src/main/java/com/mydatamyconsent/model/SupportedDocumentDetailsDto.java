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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * SupportedDocumentDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-11T10:35:08.869182296Z[Etc/UTC]")
public class SupportedDocumentDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private UUID typeId;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_STORAGE_URL = "storageUrl";
  @SerializedName(SERIALIZED_NAME_STORAGE_URL)
  private String storageUrl;

  public static final String SERIALIZED_NAME_ISSUED_BY = "issuedBy";
  @SerializedName(SERIALIZED_NAME_ISSUED_BY)
  private String issuedBy;

  public static final String SERIALIZED_NAME_UPLOADED_AT_UTC = "uploadedAtUtc";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT_UTC)
  private OffsetDateTime uploadedAtUtc;

  public SupportedDocumentDetailsDto() { 
  }

  public SupportedDocumentDetailsDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public SupportedDocumentDetailsDto typeId(UUID typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getTypeId() {
    return typeId;
  }


  public void setTypeId(UUID typeId) {
    this.typeId = typeId;
  }


  public SupportedDocumentDetailsDto logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public SupportedDocumentDetailsDto storageUrl(String storageUrl) {
    
    this.storageUrl = storageUrl;
    return this;
  }

   /**
   * Get storageUrl
   * @return storageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStorageUrl() {
    return storageUrl;
  }


  public void setStorageUrl(String storageUrl) {
    this.storageUrl = storageUrl;
  }


  public SupportedDocumentDetailsDto issuedBy(String issuedBy) {
    
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Get issuedBy
   * @return issuedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuedBy() {
    return issuedBy;
  }


  public void setIssuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
  }


  public SupportedDocumentDetailsDto uploadedAtUtc(OffsetDateTime uploadedAtUtc) {
    
    this.uploadedAtUtc = uploadedAtUtc;
    return this;
  }

   /**
   * Get uploadedAtUtc
   * @return uploadedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUploadedAtUtc() {
    return uploadedAtUtc;
  }


  public void setUploadedAtUtc(OffsetDateTime uploadedAtUtc) {
    this.uploadedAtUtc = uploadedAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedDocumentDetailsDto supportedDocumentDetailsDto = (SupportedDocumentDetailsDto) o;
    return Objects.equals(this.id, supportedDocumentDetailsDto.id) &&
        Objects.equals(this.typeId, supportedDocumentDetailsDto.typeId) &&
        Objects.equals(this.logoUrl, supportedDocumentDetailsDto.logoUrl) &&
        Objects.equals(this.storageUrl, supportedDocumentDetailsDto.storageUrl) &&
        Objects.equals(this.issuedBy, supportedDocumentDetailsDto.issuedBy) &&
        Objects.equals(this.uploadedAtUtc, supportedDocumentDetailsDto.uploadedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeId, logoUrl, storageUrl, issuedBy, uploadedAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedDocumentDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    storageUrl: ").append(toIndentedString(storageUrl)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    uploadedAtUtc: ").append(toIndentedString(uploadedAtUtc)).append("\n");
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

