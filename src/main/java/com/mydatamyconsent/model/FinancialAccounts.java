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
import com.mydatamyconsent.model.FinancialAccountDetailsRequired;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * FinancialAccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T10:37:48.736273653Z[Etc/UTC]")
public class FinancialAccounts {
  public static final String SERIALIZED_NAME_DRN = "drn";
  @SerializedName(SERIALIZED_NAME_DRN)
  private String drn;

  public static final String SERIALIZED_NAME_REQUIRED_DETAILS = "required_details";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DETAILS)
  private List<FinancialAccountDetailsRequired> requiredDetails = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public FinancialAccounts() { 
  }

  public FinancialAccounts drn(String drn) {
    
    this.drn = drn;
    return this;
  }

   /**
   * Get drn
   * @return drn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDrn() {
    return drn;
  }


  public void setDrn(String drn) {
    this.drn = drn;
  }


  public FinancialAccounts requiredDetails(List<FinancialAccountDetailsRequired> requiredDetails) {
    
    this.requiredDetails = requiredDetails;
    return this;
  }

  public FinancialAccounts addRequiredDetailsItem(FinancialAccountDetailsRequired requiredDetailsItem) {
    if (this.requiredDetails == null) {
      this.requiredDetails = new ArrayList<>();
    }
    this.requiredDetails.add(requiredDetailsItem);
    return this;
  }

   /**
   * Get requiredDetails
   * @return requiredDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FinancialAccountDetailsRequired> getRequiredDetails() {
    return requiredDetails;
  }


  public void setRequiredDetails(List<FinancialAccountDetailsRequired> requiredDetails) {
    this.requiredDetails = requiredDetails;
  }


  public FinancialAccounts startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public FinancialAccounts endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccounts financialAccounts = (FinancialAccounts) o;
    return Objects.equals(this.drn, financialAccounts.drn) &&
        Objects.equals(this.requiredDetails, financialAccounts.requiredDetails) &&
        Objects.equals(this.startDate, financialAccounts.startDate) &&
        Objects.equals(this.endDate, financialAccounts.endDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(drn, requiredDetails, startDate, endDate);
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
    sb.append("class FinancialAccounts {\n");
    sb.append("    drn: ").append(toIndentedString(drn)).append("\n");
    sb.append("    requiredDetails: ").append(toIndentedString(requiredDetails)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("drn");
    openapiFields.add("required_details");
    openapiFields.add("start_date");
    openapiFields.add("end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccounts.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccounts is not found in the empty JSON string", FinancialAccounts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccounts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("drn") != null && !jsonObj.get("drn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `drn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("drn").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("required_details") != null && !jsonObj.get("required_details").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_details` to be an array in the JSON string but got `%s`", jsonObj.get("required_details").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccounts.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccounts>() {
           @Override
           public void write(JsonWriter out, FinancialAccounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccounts
  * @throws IOException if the JSON string is invalid with respect to FinancialAccounts
  */
  public static FinancialAccounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccounts.class);
  }

 /**
  * Convert an instance of FinancialAccounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

