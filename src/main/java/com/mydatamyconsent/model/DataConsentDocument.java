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
import com.mydatamyconsent.model.DataConsentDocumentIssuer;
import com.mydatamyconsent.model.DocumentDigitalSignature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Data Consent document details.
 */
@ApiModel(description = "Data Consent document details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-08T10:36:08.635625198Z[Etc/UTC]")
public class DataConsentDocument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private DataConsentDocumentIssuer issuer;

  public static final String SERIALIZED_NAME_DIGITAL_SIGNATURES = "digitalSignatures";
  @SerializedName(SERIALIZED_NAME_DIGITAL_SIGNATURES)
  private List<DocumentDigitalSignature> digitalSignatures = new ArrayList<DocumentDigitalSignature>();

  public DataConsentDocument() { 
  }

  public DataConsentDocument id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DataConsentDocument name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Document name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataConsentDocument category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Document category.
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document category.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public DataConsentDocument identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public DataConsentDocument fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Document field title.
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document field title.")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public DataConsentDocument fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Document field slug.
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document field slug.")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public DataConsentDocument issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Document issued at datetime in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document issued at datetime in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public DataConsentDocument expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Document expires at datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document expires at datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DataConsentDocument issuer(DataConsentDocumentIssuer issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DataConsentDocumentIssuer getIssuer() {
    return issuer;
  }


  public void setIssuer(DataConsentDocumentIssuer issuer) {
    this.issuer = issuer;
  }


  public DataConsentDocument digitalSignatures(List<DocumentDigitalSignature> digitalSignatures) {
    
    this.digitalSignatures = digitalSignatures;
    return this;
  }

  public DataConsentDocument addDigitalSignaturesItem(DocumentDigitalSignature digitalSignaturesItem) {
    this.digitalSignatures.add(digitalSignaturesItem);
    return this;
  }

   /**
   * Digital signatures.
   * @return digitalSignatures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Digital signatures.")

  public List<DocumentDigitalSignature> getDigitalSignatures() {
    return digitalSignatures;
  }


  public void setDigitalSignatures(List<DocumentDigitalSignature> digitalSignatures) {
    this.digitalSignatures = digitalSignatures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentDocument dataConsentDocument = (DataConsentDocument) o;
    return Objects.equals(this.id, dataConsentDocument.id) &&
        Objects.equals(this.name, dataConsentDocument.name) &&
        Objects.equals(this.category, dataConsentDocument.category) &&
        Objects.equals(this.identifier, dataConsentDocument.identifier) &&
        Objects.equals(this.fieldTitle, dataConsentDocument.fieldTitle) &&
        Objects.equals(this.fieldSlug, dataConsentDocument.fieldSlug) &&
        Objects.equals(this.issuedAtUtc, dataConsentDocument.issuedAtUtc) &&
        Objects.equals(this.expiresAtUtc, dataConsentDocument.expiresAtUtc) &&
        Objects.equals(this.issuer, dataConsentDocument.issuer) &&
        Objects.equals(this.digitalSignatures, dataConsentDocument.digitalSignatures);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, identifier, fieldTitle, fieldSlug, issuedAtUtc, expiresAtUtc, issuer, digitalSignatures);
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
    sb.append("class DataConsentDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    digitalSignatures: ").append(toIndentedString(digitalSignatures)).append("\n");
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

