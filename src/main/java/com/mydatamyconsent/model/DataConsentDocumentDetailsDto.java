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
import com.mydatamyconsent.model.DocumentsRequired;
import com.mydatamyconsent.model.SupportedDocumentTypeCategoryDetailsDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DataConsentDocumentDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T10:35:05.887960544Z[Etc/UTC]")
public class DataConsentDocumentDetailsDto {
  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPE_CATEGORY_DETAILS = "supportedDocumentTypeCategoryDetails";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPE_CATEGORY_DETAILS)
  private List<SupportedDocumentTypeCategoryDetailsDto> supportedDocumentTypeCategoryDetails = new ArrayList<SupportedDocumentTypeCategoryDetailsDto>();

  public static final String SERIALIZED_NAME_REQUIREMENT = "requirement";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT)
  private DocumentsRequired requirement;

  public DataConsentDocumentDetailsDto() { 
  }

  public DataConsentDocumentDetailsDto fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Get fieldTitle
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public DataConsentDocumentDetailsDto fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Get fieldSlug
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public DataConsentDocumentDetailsDto supportedDocumentTypeCategoryDetails(List<SupportedDocumentTypeCategoryDetailsDto> supportedDocumentTypeCategoryDetails) {
    
    this.supportedDocumentTypeCategoryDetails = supportedDocumentTypeCategoryDetails;
    return this;
  }

  public DataConsentDocumentDetailsDto addSupportedDocumentTypeCategoryDetailsItem(SupportedDocumentTypeCategoryDetailsDto supportedDocumentTypeCategoryDetailsItem) {
    this.supportedDocumentTypeCategoryDetails.add(supportedDocumentTypeCategoryDetailsItem);
    return this;
  }

   /**
   * Get supportedDocumentTypeCategoryDetails
   * @return supportedDocumentTypeCategoryDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SupportedDocumentTypeCategoryDetailsDto> getSupportedDocumentTypeCategoryDetails() {
    return supportedDocumentTypeCategoryDetails;
  }


  public void setSupportedDocumentTypeCategoryDetails(List<SupportedDocumentTypeCategoryDetailsDto> supportedDocumentTypeCategoryDetails) {
    this.supportedDocumentTypeCategoryDetails = supportedDocumentTypeCategoryDetails;
  }


  public DataConsentDocumentDetailsDto requirement(DocumentsRequired requirement) {
    
    this.requirement = requirement;
    return this;
  }

   /**
   * Get requirement
   * @return requirement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentsRequired getRequirement() {
    return requirement;
  }


  public void setRequirement(DocumentsRequired requirement) {
    this.requirement = requirement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentDocumentDetailsDto dataConsentDocumentDetailsDto = (DataConsentDocumentDetailsDto) o;
    return Objects.equals(this.fieldTitle, dataConsentDocumentDetailsDto.fieldTitle) &&
        Objects.equals(this.fieldSlug, dataConsentDocumentDetailsDto.fieldSlug) &&
        Objects.equals(this.supportedDocumentTypeCategoryDetails, dataConsentDocumentDetailsDto.supportedDocumentTypeCategoryDetails) &&
        Objects.equals(this.requirement, dataConsentDocumentDetailsDto.requirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTitle, fieldSlug, supportedDocumentTypeCategoryDetails, requirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataConsentDocumentDetailsDto {\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    supportedDocumentTypeCategoryDetails: ").append(toIndentedString(supportedDocumentTypeCategoryDetails)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
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

