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
import com.mydatamyconsent.model.DocumentCategoryType;
import com.mydatamyconsent.model.DocumentSubCategoryType;
import com.mydatamyconsent.model.SupportedEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DocumentTypeDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-20T20:13:46.154803077Z[Etc/UTC]")
public class DocumentTypeDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_CATEGORY_TYPE = "categoryType";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TYPE)
  private DocumentCategoryType categoryType;

  public static final String SERIALIZED_NAME_SUB_CATEGORY_TYPE = "subCategoryType";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_TYPE)
  private DocumentSubCategoryType subCategoryType;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_ID = "documentTypeCategoryId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_ID)
  private UUID documentTypeCategoryId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private UUID countryId;

  public static final String SERIALIZED_NAME_SEARCH_SERVICE_ID = "searchServiceId";
  @SerializedName(SERIALIZED_NAME_SEARCH_SERVICE_ID)
  private UUID searchServiceId;

  public static final String SERIALIZED_NAME_REPOSITORY_SERVICE_ID = "repositoryServiceId";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SERVICE_ID)
  private UUID repositoryServiceId;

  public static final String SERIALIZED_NAME_SUPPORTED_ENTITY_TYPE = "supportedEntityType";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ENTITY_TYPE)
  private SupportedEntityType supportedEntityType;

  public static final String SERIALIZED_NAME_ADDED_BY = "addedBy";
  @SerializedName(SERIALIZED_NAME_ADDED_BY)
  private String addedBy;

  public static final String SERIALIZED_NAME_PAYABLE_AMOUNT = "payableAmount";
  @SerializedName(SERIALIZED_NAME_PAYABLE_AMOUNT)
  private Double payableAmount;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public DocumentTypeDetailsDto() { 
  }

  public DocumentTypeDetailsDto id(UUID id) {
    
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


  public DocumentTypeDetailsDto organizationId(UUID organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public DocumentTypeDetailsDto categoryType(DocumentCategoryType categoryType) {
    
    this.categoryType = categoryType;
    return this;
  }

   /**
   * Get categoryType
   * @return categoryType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentCategoryType getCategoryType() {
    return categoryType;
  }


  public void setCategoryType(DocumentCategoryType categoryType) {
    this.categoryType = categoryType;
  }


  public DocumentTypeDetailsDto subCategoryType(DocumentSubCategoryType subCategoryType) {
    
    this.subCategoryType = subCategoryType;
    return this;
  }

   /**
   * Get subCategoryType
   * @return subCategoryType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentSubCategoryType getSubCategoryType() {
    return subCategoryType;
  }


  public void setSubCategoryType(DocumentSubCategoryType subCategoryType) {
    this.subCategoryType = subCategoryType;
  }


  public DocumentTypeDetailsDto documentTypeCategoryId(UUID documentTypeCategoryId) {
    
    this.documentTypeCategoryId = documentTypeCategoryId;
    return this;
  }

   /**
   * Get documentTypeCategoryId
   * @return documentTypeCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getDocumentTypeCategoryId() {
    return documentTypeCategoryId;
  }


  public void setDocumentTypeCategoryId(UUID documentTypeCategoryId) {
    this.documentTypeCategoryId = documentTypeCategoryId;
  }


  public DocumentTypeDetailsDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentTypeDetailsDto slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public DocumentTypeDetailsDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentTypeDetailsDto logoUrl(String logoUrl) {
    
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


  public DocumentTypeDetailsDto countryIso2(String countryIso2) {
    
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * Get countryIso2
   * @return countryIso2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountryIso2() {
    return countryIso2;
  }


  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }


  public DocumentTypeDetailsDto countryId(UUID countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getCountryId() {
    return countryId;
  }


  public void setCountryId(UUID countryId) {
    this.countryId = countryId;
  }


  public DocumentTypeDetailsDto searchServiceId(UUID searchServiceId) {
    
    this.searchServiceId = searchServiceId;
    return this;
  }

   /**
   * Get searchServiceId
   * @return searchServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getSearchServiceId() {
    return searchServiceId;
  }


  public void setSearchServiceId(UUID searchServiceId) {
    this.searchServiceId = searchServiceId;
  }


  public DocumentTypeDetailsDto repositoryServiceId(UUID repositoryServiceId) {
    
    this.repositoryServiceId = repositoryServiceId;
    return this;
  }

   /**
   * Get repositoryServiceId
   * @return repositoryServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getRepositoryServiceId() {
    return repositoryServiceId;
  }


  public void setRepositoryServiceId(UUID repositoryServiceId) {
    this.repositoryServiceId = repositoryServiceId;
  }


  public DocumentTypeDetailsDto supportedEntityType(SupportedEntityType supportedEntityType) {
    
    this.supportedEntityType = supportedEntityType;
    return this;
  }

   /**
   * Get supportedEntityType
   * @return supportedEntityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SupportedEntityType getSupportedEntityType() {
    return supportedEntityType;
  }


  public void setSupportedEntityType(SupportedEntityType supportedEntityType) {
    this.supportedEntityType = supportedEntityType;
  }


  public DocumentTypeDetailsDto addedBy(String addedBy) {
    
    this.addedBy = addedBy;
    return this;
  }

   /**
   * Get addedBy
   * @return addedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAddedBy() {
    return addedBy;
  }


  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }


  public DocumentTypeDetailsDto payableAmount(Double payableAmount) {
    
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Get payableAmount
   * @return payableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPayableAmount() {
    return payableAmount;
  }


  public void setPayableAmount(Double payableAmount) {
    this.payableAmount = payableAmount;
  }


  public DocumentTypeDetailsDto approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Get approvedAtUtc
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypeDetailsDto documentTypeDetailsDto = (DocumentTypeDetailsDto) o;
    return Objects.equals(this.id, documentTypeDetailsDto.id) &&
        Objects.equals(this.organizationId, documentTypeDetailsDto.organizationId) &&
        Objects.equals(this.categoryType, documentTypeDetailsDto.categoryType) &&
        Objects.equals(this.subCategoryType, documentTypeDetailsDto.subCategoryType) &&
        Objects.equals(this.documentTypeCategoryId, documentTypeDetailsDto.documentTypeCategoryId) &&
        Objects.equals(this.name, documentTypeDetailsDto.name) &&
        Objects.equals(this.slug, documentTypeDetailsDto.slug) &&
        Objects.equals(this.description, documentTypeDetailsDto.description) &&
        Objects.equals(this.logoUrl, documentTypeDetailsDto.logoUrl) &&
        Objects.equals(this.countryIso2, documentTypeDetailsDto.countryIso2) &&
        Objects.equals(this.countryId, documentTypeDetailsDto.countryId) &&
        Objects.equals(this.searchServiceId, documentTypeDetailsDto.searchServiceId) &&
        Objects.equals(this.repositoryServiceId, documentTypeDetailsDto.repositoryServiceId) &&
        Objects.equals(this.supportedEntityType, documentTypeDetailsDto.supportedEntityType) &&
        Objects.equals(this.addedBy, documentTypeDetailsDto.addedBy) &&
        Objects.equals(this.payableAmount, documentTypeDetailsDto.payableAmount) &&
        Objects.equals(this.approvedAtUtc, documentTypeDetailsDto.approvedAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, categoryType, subCategoryType, documentTypeCategoryId, name, slug, description, logoUrl, countryIso2, countryId, searchServiceId, repositoryServiceId, supportedEntityType, addedBy, payableAmount, approvedAtUtc);
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
    sb.append("class DocumentTypeDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    subCategoryType: ").append(toIndentedString(subCategoryType)).append("\n");
    sb.append("    documentTypeCategoryId: ").append(toIndentedString(documentTypeCategoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    searchServiceId: ").append(toIndentedString(searchServiceId)).append("\n");
    sb.append("    repositoryServiceId: ").append(toIndentedString(repositoryServiceId)).append("\n");
    sb.append("    supportedEntityType: ").append(toIndentedString(supportedEntityType)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
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
