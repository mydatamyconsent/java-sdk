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
import com.mydatamyconsent.model.DocumentsRequired;
import com.mydatamyconsent.model.FinancialAccounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Financial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T10:46:44.544696794Z[Etc/UTC]")
public class Financial {
  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private String customKey;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<FinancialAccounts> accounts = null;

  public static final String SERIALIZED_NAME_REQUIREMENT = "requirement";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT)
  private DocumentsRequired requirement;

  public Financial() { 
  }

  public Financial fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public Financial customKey(String customKey) {
    
    this.customKey = customKey;
    return this;
  }

   /**
   * Get customKey
   * @return customKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomKey() {
    return customKey;
  }


  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }


  public Financial accounts(List<FinancialAccounts> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public Financial addAccountsItem(FinancialAccounts accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FinancialAccounts> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<FinancialAccounts> accounts) {
    this.accounts = accounts;
  }


  public Financial requirement(DocumentsRequired requirement) {
    
    this.requirement = requirement;
    return this;
  }

   /**
   * Get requirement
   * @return requirement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentsRequired getRequirement() {
    return requirement;
  }


  public void setRequirement(DocumentsRequired requirement) {
    this.requirement = requirement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Financial financial = (Financial) o;
    return Objects.equals(this.fieldName, financial.fieldName) &&
        Objects.equals(this.customKey, financial.customKey) &&
        Objects.equals(this.accounts, financial.accounts) &&
        Objects.equals(this.requirement, financial.requirement);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, customKey, accounts, requirement);
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
    sb.append("class Financial {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
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
    openapiFields.add("field_name");
    openapiFields.add("custom_key");
    openapiFields.add("accounts");
    openapiFields.add("requirement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Financial
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Financial.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Financial is not found in the empty JSON string", Financial.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Financial.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Financial` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if (jsonObj.get("custom_key") != null && !jsonObj.get("custom_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_key").toString()));
      }
      JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
      if (jsonArrayaccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
        }

        // validate the optional field `accounts` (array)
        for (int i = 0; i < jsonArrayaccounts.size(); i++) {
          FinancialAccounts.validateJsonObject(jsonArrayaccounts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Financial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Financial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Financial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Financial.class));

       return (TypeAdapter<T>) new TypeAdapter<Financial>() {
           @Override
           public void write(JsonWriter out, Financial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Financial read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Financial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Financial
  * @throws IOException if the JSON string is invalid with respect to Financial
  */
  public static Financial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Financial.class);
  }

 /**
  * Convert an instance of Financial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

