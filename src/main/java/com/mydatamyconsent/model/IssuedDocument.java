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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * IssuedDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-20T20:13:46.154803077Z[Etc/UTC]")
public class IssuedDocument {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private UUID documentId;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_ISSUED_TO = "issuedTo";
  @SerializedName(SERIALIZED_NAME_ISSUED_TO)
  private String issuedTo;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public IssuedDocument() { 
  }

  public IssuedDocument documentId(UUID documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getDocumentId() {
    return documentId;
  }


  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  public IssuedDocument identifier(String identifier) {
    
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


  public IssuedDocument documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IssuedDocument issuedTo(String issuedTo) {
    
    this.issuedTo = issuedTo;
    return this;
  }

   /**
   * Get issuedTo
   * @return issuedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuedTo() {
    return issuedTo;
  }


  public void setIssuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
  }


  public IssuedDocument issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Get issuedAtUtc
   * @return issuedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocument issuedDocument = (IssuedDocument) o;
    return Objects.equals(this.documentId, issuedDocument.documentId) &&
        Objects.equals(this.identifier, issuedDocument.identifier) &&
        Objects.equals(this.documentType, issuedDocument.documentType) &&
        Objects.equals(this.issuedTo, issuedDocument.issuedTo) &&
        Objects.equals(this.issuedAtUtc, issuedDocument.issuedAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, identifier, documentType, issuedTo, issuedAtUtc);
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
    sb.append("class IssuedDocument {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
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
