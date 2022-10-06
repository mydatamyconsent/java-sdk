/*
 * My Data My Consent - Developer API
 * Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: 1.0
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
import com.mydatamyconsent.model.EquitySummary;
import com.mydatamyconsent.model.Profile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * FinancialAccountEquity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-06T10:39:53.544792429Z[Etc/UTC]")
public class FinancialAccountEquity {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private Profile profile;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private EquitySummary summary;

  public static final String SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER = "masked_account_number";
  @SerializedName(SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER)
  private String maskedAccountNumber;

  public static final String SERIALIZED_NAME_LINKED_ACCOUNT_REF = "linked_account_ref";
  @SerializedName(SERIALIZED_NAME_LINKED_ACCOUNT_REF)
  private String linkedAccountRef;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Float version;

  public FinancialAccountEquity() {
  }

  public FinancialAccountEquity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Equity", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FinancialAccountEquity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FinancialAccountEquity name(String name) {
    
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


  public FinancialAccountEquity identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public FinancialAccountEquity balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public FinancialAccountEquity profile(Profile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Profile getProfile() {
    return profile;
  }


  public void setProfile(Profile profile) {
    this.profile = profile;
  }


  public FinancialAccountEquity summary(EquitySummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EquitySummary getSummary() {
    return summary;
  }


  public void setSummary(EquitySummary summary) {
    this.summary = summary;
  }


  public FinancialAccountEquity maskedAccountNumber(String maskedAccountNumber) {
    
    this.maskedAccountNumber = maskedAccountNumber;
    return this;
  }

   /**
   * Get maskedAccountNumber
   * @return maskedAccountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMaskedAccountNumber() {
    return maskedAccountNumber;
  }


  public void setMaskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
  }


  public FinancialAccountEquity linkedAccountRef(String linkedAccountRef) {
    
    this.linkedAccountRef = linkedAccountRef;
    return this;
  }

   /**
   * Get linkedAccountRef
   * @return linkedAccountRef
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLinkedAccountRef() {
    return linkedAccountRef;
  }


  public void setLinkedAccountRef(String linkedAccountRef) {
    this.linkedAccountRef = linkedAccountRef;
  }


  public FinancialAccountEquity version(Float version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getVersion() {
    return version;
  }


  public void setVersion(Float version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountEquity financialAccountEquity = (FinancialAccountEquity) o;
    return Objects.equals(this.type, financialAccountEquity.type) &&
        Objects.equals(this.id, financialAccountEquity.id) &&
        Objects.equals(this.name, financialAccountEquity.name) &&
        Objects.equals(this.identifier, financialAccountEquity.identifier) &&
        Objects.equals(this.balance, financialAccountEquity.balance) &&
        Objects.equals(this.profile, financialAccountEquity.profile) &&
        Objects.equals(this.summary, financialAccountEquity.summary) &&
        Objects.equals(this.maskedAccountNumber, financialAccountEquity.maskedAccountNumber) &&
        Objects.equals(this.linkedAccountRef, financialAccountEquity.linkedAccountRef) &&
        Objects.equals(this.version, financialAccountEquity.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, identifier, balance, profile, summary, maskedAccountNumber, linkedAccountRef, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountEquity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    maskedAccountNumber: ").append(toIndentedString(maskedAccountNumber)).append("\n");
    sb.append("    linkedAccountRef: ").append(toIndentedString(linkedAccountRef)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("identifier");
    openapiFields.add("balance");
    openapiFields.add("profile");
    openapiFields.add("summary");
    openapiFields.add("masked_account_number");
    openapiFields.add("linked_account_ref");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("profile");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("masked_account_number");
    openapiRequiredFields.add("linked_account_ref");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountEquity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountEquity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountEquity is not found in the empty JSON string", FinancialAccountEquity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountEquity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountEquity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountEquity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        Profile.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        EquitySummary.validateJsonObject(jsonObj.getAsJsonObject("summary"));
      }
      if ((jsonObj.get("masked_account_number") != null && !jsonObj.get("masked_account_number").isJsonNull()) && !jsonObj.get("masked_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masked_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masked_account_number").toString()));
      }
      if ((jsonObj.get("linked_account_ref") != null && !jsonObj.get("linked_account_ref").isJsonNull()) && !jsonObj.get("linked_account_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linked_account_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linked_account_ref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountEquity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountEquity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountEquity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountEquity.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountEquity>() {
           @Override
           public void write(JsonWriter out, FinancialAccountEquity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountEquity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountEquity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountEquity
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountEquity
  */
  public static FinancialAccountEquity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountEquity.class);
  }

 /**
  * Convert an instance of FinancialAccountEquity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

