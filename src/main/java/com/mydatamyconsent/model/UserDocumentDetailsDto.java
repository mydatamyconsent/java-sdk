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
import com.mydatamyconsent.model.DigitalSignature;
import com.mydatamyconsent.model.DocumentCategoryType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UserDocumentDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-14T10:34:17.192151483Z[Etc/UTC]")
public class UserDocumentDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CATEGORY_TYPE = "categoryType";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TYPE)
  private DocumentCategoryType categoryType;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private UUID typeId;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private UUID accountId;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private UUID issuerId;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_STORAGE_URL = "storageUrl";
  @SerializedName(SERIALIZED_NAME_STORAGE_URL)
  private String storageUrl;

  public static final String SERIALIZED_NAME_IS_QUICK_ACCESS_ENABLED = "isQuickAccessEnabled";
  @SerializedName(SERIALIZED_NAME_IS_QUICK_ACCESS_ENABLED)
  private Boolean isQuickAccessEnabled;

  public static final String SERIALIZED_NAME_IS_OWNER = "isOwner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private Boolean isOwner;

  public static final String SERIALIZED_NAME_DIGITAL_SIGNATURE_DETAILS = "digitalSignatureDetails";
  @SerializedName(SERIALIZED_NAME_DIGITAL_SIGNATURE_DETAILS)
  private List<DigitalSignature> digitalSignatureDetails = null;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private UUID ownerId;

  public UserDocumentDetailsDto() { 
  }

  public UserDocumentDetailsDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UserDocumentDetailsDto categoryType(DocumentCategoryType categoryType) {
    
    this.categoryType = categoryType;
    return this;
  }

   /**
   * Get categoryType
   * @return categoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentCategoryType getCategoryType() {
    return categoryType;
  }


  public void setCategoryType(DocumentCategoryType categoryType) {
    this.categoryType = categoryType;
  }


  public UserDocumentDetailsDto typeId(UUID typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTypeId() {
    return typeId;
  }


  public void setTypeId(UUID typeId) {
    this.typeId = typeId;
  }


  public UserDocumentDetailsDto typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public UserDocumentDetailsDto fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public UserDocumentDetailsDto identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public UserDocumentDetailsDto accountId(UUID accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountId() {
    return accountId;
  }


  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }


  public UserDocumentDetailsDto issuerId(UUID issuerId) {
    
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Get issuerId
   * @return issuerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getIssuerId() {
    return issuerId;
  }


  public void setIssuerId(UUID issuerId) {
    this.issuerId = issuerId;
  }


  public UserDocumentDetailsDto issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public UserDocumentDetailsDto storageUrl(String storageUrl) {
    
    this.storageUrl = storageUrl;
    return this;
  }

   /**
   * Get storageUrl
   * @return storageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageUrl() {
    return storageUrl;
  }


  public void setStorageUrl(String storageUrl) {
    this.storageUrl = storageUrl;
  }


  public UserDocumentDetailsDto isQuickAccessEnabled(Boolean isQuickAccessEnabled) {
    
    this.isQuickAccessEnabled = isQuickAccessEnabled;
    return this;
  }

   /**
   * Get isQuickAccessEnabled
   * @return isQuickAccessEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsQuickAccessEnabled() {
    return isQuickAccessEnabled;
  }


  public void setIsQuickAccessEnabled(Boolean isQuickAccessEnabled) {
    this.isQuickAccessEnabled = isQuickAccessEnabled;
  }


  public UserDocumentDetailsDto isOwner(Boolean isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }


  public UserDocumentDetailsDto digitalSignatureDetails(List<DigitalSignature> digitalSignatureDetails) {
    
    this.digitalSignatureDetails = digitalSignatureDetails;
    return this;
  }

  public UserDocumentDetailsDto addDigitalSignatureDetailsItem(DigitalSignature digitalSignatureDetailsItem) {
    if (this.digitalSignatureDetails == null) {
      this.digitalSignatureDetails = new ArrayList<DigitalSignature>();
    }
    this.digitalSignatureDetails.add(digitalSignatureDetailsItem);
    return this;
  }

   /**
   * Get digitalSignatureDetails
   * @return digitalSignatureDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DigitalSignature> getDigitalSignatureDetails() {
    return digitalSignatureDetails;
  }


  public void setDigitalSignatureDetails(List<DigitalSignature> digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
  }


  public UserDocumentDetailsDto ownerId(UUID ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDocumentDetailsDto userDocumentDetailsDto = (UserDocumentDetailsDto) o;
    return Objects.equals(this.id, userDocumentDetailsDto.id) &&
        Objects.equals(this.categoryType, userDocumentDetailsDto.categoryType) &&
        Objects.equals(this.typeId, userDocumentDetailsDto.typeId) &&
        Objects.equals(this.typeName, userDocumentDetailsDto.typeName) &&
        Objects.equals(this.fullName, userDocumentDetailsDto.fullName) &&
        Objects.equals(this.identifier, userDocumentDetailsDto.identifier) &&
        Objects.equals(this.accountId, userDocumentDetailsDto.accountId) &&
        Objects.equals(this.issuerId, userDocumentDetailsDto.issuerId) &&
        Objects.equals(this.issuerName, userDocumentDetailsDto.issuerName) &&
        Objects.equals(this.storageUrl, userDocumentDetailsDto.storageUrl) &&
        Objects.equals(this.isQuickAccessEnabled, userDocumentDetailsDto.isQuickAccessEnabled) &&
        Objects.equals(this.isOwner, userDocumentDetailsDto.isOwner) &&
        Objects.equals(this.digitalSignatureDetails, userDocumentDetailsDto.digitalSignatureDetails) &&
        Objects.equals(this.ownerId, userDocumentDetailsDto.ownerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryType, typeId, typeName, fullName, identifier, accountId, issuerId, issuerName, storageUrl, isQuickAccessEnabled, isOwner, digitalSignatureDetails, ownerId);
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
    sb.append("class UserDocumentDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    storageUrl: ").append(toIndentedString(storageUrl)).append("\n");
    sb.append("    isQuickAccessEnabled: ").append(toIndentedString(isQuickAccessEnabled)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    digitalSignatureDetails: ").append(toIndentedString(digitalSignatureDetails)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

