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
 * SharedWith
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:37:20.042343723Z[Etc/UTC]")
public class SharedWith {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_RECEIVER_ID = "receiverId";
  @SerializedName(SERIALIZED_NAME_RECEIVER_ID)
  private UUID receiverId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTACT_NUMBER = "contactNumber";
  @SerializedName(SERIALIZED_NAME_CONTACT_NUMBER)
  private String contactNumber;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profileUrl";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public SharedWith() { 
  }

  public SharedWith id(UUID id) {
    
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


  public SharedWith receiverId(UUID receiverId) {
    
    this.receiverId = receiverId;
    return this;
  }

   /**
   * Get receiverId
   * @return receiverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getReceiverId() {
    return receiverId;
  }


  public void setReceiverId(UUID receiverId) {
    this.receiverId = receiverId;
  }


  public SharedWith name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SharedWith contactNumber(String contactNumber) {
    
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * Get contactNumber
   * @return contactNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContactNumber() {
    return contactNumber;
  }


  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }


  public SharedWith profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public SharedWith expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWith sharedWith = (SharedWith) o;
    return Objects.equals(this.id, sharedWith.id) &&
        Objects.equals(this.receiverId, sharedWith.receiverId) &&
        Objects.equals(this.name, sharedWith.name) &&
        Objects.equals(this.contactNumber, sharedWith.contactNumber) &&
        Objects.equals(this.profileUrl, sharedWith.profileUrl) &&
        Objects.equals(this.expiresAtUtc, sharedWith.expiresAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, receiverId, name, contactNumber, profileUrl, expiresAtUtc);
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
    sb.append("class SharedWith {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    receiverId: ").append(toIndentedString(receiverId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
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

