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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Activity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-13T10:37:48.248698692Z[Etc/UTC]")
public class Activity {
  public static final String SERIALIZED_NAME_ACTOR_NAME = "actorName";
  @SerializedName(SERIALIZED_NAME_ACTOR_NAME)
  private String actorName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTOR_PROFILE_URL = "actorProfileUrl";
  @SerializedName(SERIALIZED_NAME_ACTOR_PROFILE_URL)
  private String actorProfileUrl;

  public static final String SERIALIZED_NAME_DATE_TIME_UTC = "dateTimeUtc";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_UTC)
  private OffsetDateTime dateTimeUtc;

  public Activity() { 
  }

  public Activity actorName(String actorName) {
    
    this.actorName = actorName;
    return this;
  }

   /**
   * Get actorName
   * @return actorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActorName() {
    return actorName;
  }


  public void setActorName(String actorName) {
    this.actorName = actorName;
  }


  public Activity description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Activity actorProfileUrl(String actorProfileUrl) {
    
    this.actorProfileUrl = actorProfileUrl;
    return this;
  }

   /**
   * Get actorProfileUrl
   * @return actorProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActorProfileUrl() {
    return actorProfileUrl;
  }


  public void setActorProfileUrl(String actorProfileUrl) {
    this.actorProfileUrl = actorProfileUrl;
  }


  public Activity dateTimeUtc(OffsetDateTime dateTimeUtc) {
    
    this.dateTimeUtc = dateTimeUtc;
    return this;
  }

   /**
   * Get dateTimeUtc
   * @return dateTimeUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateTimeUtc() {
    return dateTimeUtc;
  }


  public void setDateTimeUtc(OffsetDateTime dateTimeUtc) {
    this.dateTimeUtc = dateTimeUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.actorName, activity.actorName) &&
        Objects.equals(this.description, activity.description) &&
        Objects.equals(this.actorProfileUrl, activity.actorProfileUrl) &&
        Objects.equals(this.dateTimeUtc, activity.dateTimeUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorName, description, actorProfileUrl, dateTimeUtc);
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
    sb.append("class Activity {\n");
    sb.append("    actorName: ").append(toIndentedString(actorName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actorProfileUrl: ").append(toIndentedString(actorProfileUrl)).append("\n");
    sb.append("    dateTimeUtc: ").append(toIndentedString(dateTimeUtc)).append("\n");
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

