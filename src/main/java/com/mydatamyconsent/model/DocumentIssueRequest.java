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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DocumentIssueRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-21T10:35:00.633063535Z[Etc/UTC]")
public class DocumentIssueRequest {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private String documentTypeId;

  public static final String SERIALIZED_NAME_DOCUMENT_IDENTIFIER = "documentIdentifier";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDENTIFIER)
  private String documentIdentifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private Receiver receiver;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_BASE64_PDF_DOCUMENT = "base64PdfDocument";
  @SerializedName(SERIALIZED_NAME_BASE64_PDF_DOCUMENT)
  private String base64PdfDocument;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public DocumentIssueRequest() { 
  }

  public DocumentIssueRequest documentTypeId(String documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Get documentTypeId
   * @return documentTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DocumentIssueRequest documentIdentifier(String documentIdentifier) {
    
    this.documentIdentifier = documentIdentifier;
    return this;
  }

   /**
   * Get documentIdentifier
   * @return documentIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocumentIdentifier() {
    return documentIdentifier;
  }


  public void setDocumentIdentifier(String documentIdentifier) {
    this.documentIdentifier = documentIdentifier;
  }


  public DocumentIssueRequest name(String name) {
    
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


  public DocumentIssueRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentIssueRequest receiver(Receiver receiver) {
    
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


  public DocumentIssueRequest expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Get expiresAtUtc
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DocumentIssueRequest base64PdfDocument(String base64PdfDocument) {
    
    this.base64PdfDocument = base64PdfDocument;
    return this;
  }

   /**
   * Get base64PdfDocument
   * @return base64PdfDocument
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBase64PdfDocument() {
    return base64PdfDocument;
  }


  public void setBase64PdfDocument(String base64PdfDocument) {
    this.base64PdfDocument = base64PdfDocument;
  }


  public DocumentIssueRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIssueRequest documentIssueRequest = (DocumentIssueRequest) o;
    return Objects.equals(this.documentTypeId, documentIssueRequest.documentTypeId) &&
        Objects.equals(this.documentIdentifier, documentIssueRequest.documentIdentifier) &&
        Objects.equals(this.name, documentIssueRequest.name) &&
        Objects.equals(this.description, documentIssueRequest.description) &&
        Objects.equals(this.receiver, documentIssueRequest.receiver) &&
        Objects.equals(this.expiresAtUtc, documentIssueRequest.expiresAtUtc) &&
        Objects.equals(this.base64PdfDocument, documentIssueRequest.base64PdfDocument) &&
        Objects.equals(this.metadata, documentIssueRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypeId, documentIdentifier, name, description, receiver, expiresAtUtc, base64PdfDocument, metadata);
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
    sb.append("class DocumentIssueRequest {\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    documentIdentifier: ").append(toIndentedString(documentIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    base64PdfDocument: ").append(toIndentedString(base64PdfDocument)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

