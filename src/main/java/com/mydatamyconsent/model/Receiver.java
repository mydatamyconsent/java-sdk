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
import com.mydatamyconsent.model.IdentificationStrategy;
import com.mydatamyconsent.model.IdentifierStringKeyValuePair;
import com.mydatamyconsent.model.ReceiverType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Receiver
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T10:35:06.869577626Z[Etc/UTC]")
public class Receiver {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReceiverType type;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<IdentifierStringKeyValuePair> identifiers = null;

  public static final String SERIALIZED_NAME_IDENTIFICATION_STRATEGY = "identificationStrategy";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_STRATEGY)
  private IdentificationStrategy identificationStrategy;

  public Receiver() { 
  }

  public Receiver type(ReceiverType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReceiverType getType() {
    return type;
  }


  public void setType(ReceiverType type) {
    this.type = type;
  }


  public Receiver identifiers(List<IdentifierStringKeyValuePair> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public Receiver addIdentifiersItem(IdentifierStringKeyValuePair identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<IdentifierStringKeyValuePair>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IdentifierStringKeyValuePair> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<IdentifierStringKeyValuePair> identifiers) {
    this.identifiers = identifiers;
  }


  public Receiver identificationStrategy(IdentificationStrategy identificationStrategy) {
    
    this.identificationStrategy = identificationStrategy;
    return this;
  }

   /**
   * Get identificationStrategy
   * @return identificationStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentificationStrategy getIdentificationStrategy() {
    return identificationStrategy;
  }


  public void setIdentificationStrategy(IdentificationStrategy identificationStrategy) {
    this.identificationStrategy = identificationStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receiver receiver = (Receiver) o;
    return Objects.equals(this.type, receiver.type) &&
        Objects.equals(this.identifiers, receiver.identifiers) &&
        Objects.equals(this.identificationStrategy, receiver.identificationStrategy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, identifiers, identificationStrategy);
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
    sb.append("class Receiver {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    identificationStrategy: ").append(toIndentedString(identificationStrategy)).append("\n");
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

