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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mydatamyconsent.JSON;

/**
 * Activity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T10:46:44.544696794Z[Etc/UTC]")
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("actorName");
    openapiFields.add("description");
    openapiFields.add("actorProfileUrl");
    openapiFields.add("dateTimeUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Activity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Activity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Activity is not found in the empty JSON string", Activity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Activity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Activity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actorName") != null && !jsonObj.get("actorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actorName").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("actorProfileUrl") != null && !jsonObj.get("actorProfileUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actorProfileUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actorProfileUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Activity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Activity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Activity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Activity.class));

       return (TypeAdapter<T>) new TypeAdapter<Activity>() {
           @Override
           public void write(JsonWriter out, Activity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Activity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Activity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Activity
  * @throws IOException if the JSON string is invalid with respect to Activity
  */
  public static Activity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Activity.class);
  }

 /**
  * Convert an instance of Activity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

