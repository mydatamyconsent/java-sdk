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
import com.mydatamyconsent.model.DataConsentRequestedDocument;
import com.mydatamyconsent.model.Document;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DataConsentDocumentsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T10:35:11.987146036Z[Etc/UTC]")
public class DataConsentDocumentsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<Document> documents = null;

  public static final String SERIALIZED_NAME_APPROVED_DOCUMENTS = "approvedDocuments";
  @SerializedName(SERIALIZED_NAME_APPROVED_DOCUMENTS)
  private List<DataConsentRequestedDocument> approvedDocuments = null;

  public DataConsentDocumentsDto() { 
  }

  public DataConsentDocumentsDto id(UUID id) {
    
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


  public DataConsentDocumentsDto documents(List<Document> documents) {
    
    this.documents = documents;
    return this;
  }

  public DataConsentDocumentsDto addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Document> getDocuments() {
    return documents;
  }


  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }


  public DataConsentDocumentsDto approvedDocuments(List<DataConsentRequestedDocument> approvedDocuments) {
    
    this.approvedDocuments = approvedDocuments;
    return this;
  }

  public DataConsentDocumentsDto addApprovedDocumentsItem(DataConsentRequestedDocument approvedDocumentsItem) {
    if (this.approvedDocuments == null) {
      this.approvedDocuments = new ArrayList<DataConsentRequestedDocument>();
    }
    this.approvedDocuments.add(approvedDocumentsItem);
    return this;
  }

   /**
   * Get approvedDocuments
   * @return approvedDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedDocument> getApprovedDocuments() {
    return approvedDocuments;
  }


  public void setApprovedDocuments(List<DataConsentRequestedDocument> approvedDocuments) {
    this.approvedDocuments = approvedDocuments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentDocumentsDto dataConsentDocumentsDto = (DataConsentDocumentsDto) o;
    return Objects.equals(this.id, dataConsentDocumentsDto.id) &&
        Objects.equals(this.documents, dataConsentDocumentsDto.documents) &&
        Objects.equals(this.approvedDocuments, dataConsentDocumentsDto.approvedDocuments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documents, approvedDocuments);
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
    sb.append("class DataConsentDocumentsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    approvedDocuments: ").append(toIndentedString(approvedDocuments)).append("\n");
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

