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
import com.mydatamyconsent.model.DocumentDigitalSignature;
import com.mydatamyconsent.model.DocumentReceiver;
import com.mydatamyconsent.model.IssuedDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * IssuedDocumentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T10:37:12.975215508Z[Etc/UTC]")
public class IssuedDocumentDetails {
  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private DocumentReceiver receiver;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_DIGITAL_SIGNATURES = "digitalSignatures";
  @SerializedName(SERIALIZED_NAME_DIGITAL_SIGNATURES)
  private List<DocumentDigitalSignature> digitalSignatures = new ArrayList<DocumentDigitalSignature>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

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

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_ACCEPTED_AT_UTC = "acceptedAtUtc";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_AT_UTC)
  private OffsetDateTime acceptedAtUtc;

  public IssuedDocumentDetails() { 
  }

  public IssuedDocumentDetails receiver(DocumentReceiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentReceiver getReceiver() {
    return receiver;
  }


  public void setReceiver(DocumentReceiver receiver) {
    this.receiver = receiver;
  }


  public IssuedDocumentDetails metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IssuedDocumentDetails putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IssuedDocumentDetails digitalSignatures(List<DocumentDigitalSignature> digitalSignatures) {
    
    this.digitalSignatures = digitalSignatures;
    return this;
  }

  public IssuedDocumentDetails addDigitalSignaturesItem(DocumentDigitalSignature digitalSignaturesItem) {
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


  public IssuedDocumentDetails id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document Id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Id.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public IssuedDocumentDetails identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document Identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GJ05FG67866586.", required = true, value = "Document Identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public IssuedDocumentDetails documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Document type name.
   * @return documentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Driving License.", required = true, value = "Document type name.")

  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public IssuedDocumentDetails issuedTo(String issuedTo) {
    
    this.issuedTo = issuedTo;
    return this;
  }

   /**
   * User name.
   * @return issuedTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "User name.")

  public String getIssuedTo() {
    return issuedTo;
  }


  public void setIssuedTo(String issuedTo) {
    this.issuedTo = issuedTo;
  }


  public IssuedDocumentDetails issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Issued datetime in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issued datetime in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public IssuedDocumentDetails expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Expires datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expires datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public IssuedDocumentDetails acceptedAtUtc(OffsetDateTime acceptedAtUtc) {
    
    this.acceptedAtUtc = acceptedAtUtc;
    return this;
  }

   /**
   * Accepted datetime in UTC timezone.
   * @return acceptedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accepted datetime in UTC timezone.")

  public OffsetDateTime getAcceptedAtUtc() {
    return acceptedAtUtc;
  }


  public void setAcceptedAtUtc(OffsetDateTime acceptedAtUtc) {
    this.acceptedAtUtc = acceptedAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedDocumentDetails issuedDocumentDetails = (IssuedDocumentDetails) o;
    return Objects.equals(this.receiver, issuedDocumentDetails.receiver) &&
        Objects.equals(this.metadata, issuedDocumentDetails.metadata) &&
        Objects.equals(this.digitalSignatures, issuedDocumentDetails.digitalSignatures) &&
        Objects.equals(this.id, issuedDocumentDetails.id) &&
        Objects.equals(this.identifier, issuedDocumentDetails.identifier) &&
        Objects.equals(this.documentType, issuedDocumentDetails.documentType) &&
        Objects.equals(this.issuedTo, issuedDocumentDetails.issuedTo) &&
        Objects.equals(this.issuedAtUtc, issuedDocumentDetails.issuedAtUtc) &&
        Objects.equals(this.expiresAtUtc, issuedDocumentDetails.expiresAtUtc) &&
        Objects.equals(this.acceptedAtUtc, issuedDocumentDetails.acceptedAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiver, metadata, digitalSignatures, id, identifier, documentType, issuedTo, issuedAtUtc, expiresAtUtc, acceptedAtUtc);
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
    sb.append("class IssuedDocumentDetails {\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    digitalSignatures: ").append(toIndentedString(digitalSignatures)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    acceptedAtUtc: ").append(toIndentedString(acceptedAtUtc)).append("\n");
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

