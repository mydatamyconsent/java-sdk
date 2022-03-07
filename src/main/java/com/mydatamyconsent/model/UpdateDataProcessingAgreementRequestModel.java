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

/**
 * UpdateDataProcessingAgreementRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T10:35:05.887960544Z[Etc/UTC]")
public class UpdateDataProcessingAgreementRequestModel {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachmentUrl";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public UpdateDataProcessingAgreementRequestModel() { 
  }

  public UpdateDataProcessingAgreementRequestModel version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public UpdateDataProcessingAgreementRequestModel body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public UpdateDataProcessingAgreementRequestModel attachmentUrl(String attachmentUrl) {
    
    this.attachmentUrl = attachmentUrl;
    return this;
  }

   /**
   * Get attachmentUrl
   * @return attachmentUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAttachmentUrl() {
    return attachmentUrl;
  }


  public void setAttachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDataProcessingAgreementRequestModel updateDataProcessingAgreementRequestModel = (UpdateDataProcessingAgreementRequestModel) o;
    return Objects.equals(this.version, updateDataProcessingAgreementRequestModel.version) &&
        Objects.equals(this.body, updateDataProcessingAgreementRequestModel.body) &&
        Objects.equals(this.attachmentUrl, updateDataProcessingAgreementRequestModel.attachmentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, body, attachmentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataProcessingAgreementRequestModel {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
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

