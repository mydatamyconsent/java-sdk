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
import com.mydatamyconsent.model.ConsentRequestReceiver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Create individual data consent request
 */
@ApiModel(description = "Create individual data consent request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:39:09.377955243Z[Etc/UTC]")
public class CreateDataConsentRequest {
  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private UUID consentTemplateId;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ConsentRequestReceiver receiver;

  public CreateDataConsentRequest() { 
  }

  public CreateDataConsentRequest consentTemplateId(UUID consentTemplateId) {
    
    this.consentTemplateId = consentTemplateId;
    return this;
  }

   /**
   * Consent template id
   * @return consentTemplateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent template id")

  public UUID getConsentTemplateId() {
    return consentTemplateId;
  }


  public void setConsentTemplateId(UUID consentTemplateId) {
    this.consentTemplateId = consentTemplateId;
  }


  public CreateDataConsentRequest receiver(ConsentRequestReceiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsentRequestReceiver getReceiver() {
    return receiver;
  }


  public void setReceiver(ConsentRequestReceiver receiver) {
    this.receiver = receiver;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataConsentRequest createDataConsentRequest = (CreateDataConsentRequest) o;
    return Objects.equals(this.consentTemplateId, createDataConsentRequest.consentTemplateId) &&
        Objects.equals(this.receiver, createDataConsentRequest.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentTemplateId, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataConsentRequest {\n");
    sb.append("    consentTemplateId: ").append(toIndentedString(consentTemplateId)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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

