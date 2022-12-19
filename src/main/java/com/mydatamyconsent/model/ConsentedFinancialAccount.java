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
import com.mydatamyconsent.model.FinancialAccountCategoryType;
import com.mydatamyconsent.model.FinancialAccountSubCategoryType;
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
 * ConsentedFinancialAccount : Consented financial account details.
 */
@ApiModel(description = "ConsentedFinancialAccount : Consented financial account details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-19T10:34:31.078365366Z[Etc/UTC]")
public class ConsentedFinancialAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private FinancialAccountCategoryType category;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "subCategory";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private FinancialAccountSubCategoryType subCategory;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private String issuerId;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public ConsentedFinancialAccount() {
  }

  public ConsentedFinancialAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Financial account id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentedFinancialAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Financial account name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConsentedFinancialAccount category(FinancialAccountCategoryType category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FinancialAccountCategoryType getCategory() {
    return category;
  }


  public void setCategory(FinancialAccountCategoryType category) {
    this.category = category;
  }


  public ConsentedFinancialAccount subCategory(FinancialAccountSubCategoryType subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FinancialAccountSubCategoryType getSubCategory() {
    return subCategory;
  }


  public void setSubCategory(FinancialAccountSubCategoryType subCategory) {
    this.subCategory = subCategory;
  }


  public ConsentedFinancialAccount identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Financial account identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ConsentedFinancialAccount issuerId(String issuerId) {
    
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Financial account issuer id.
   * @return issuerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account issuer id.")

  public String getIssuerId() {
    return issuerId;
  }


  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public ConsentedFinancialAccount issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Financial account issuer name.
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account issuer name.")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentedFinancialAccount consentedFinancialAccount = (ConsentedFinancialAccount) o;
    return Objects.equals(this.id, consentedFinancialAccount.id) &&
        Objects.equals(this.name, consentedFinancialAccount.name) &&
        Objects.equals(this.category, consentedFinancialAccount.category) &&
        Objects.equals(this.subCategory, consentedFinancialAccount.subCategory) &&
        Objects.equals(this.identifier, consentedFinancialAccount.identifier) &&
        Objects.equals(this.issuerId, consentedFinancialAccount.issuerId) &&
        Objects.equals(this.issuerName, consentedFinancialAccount.issuerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, subCategory, identifier, issuerId, issuerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentedFinancialAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("category");
    openapiFields.add("subCategory");
    openapiFields.add("identifier");
    openapiFields.add("issuerId");
    openapiFields.add("issuerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("subCategory");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("issuerId");
    openapiRequiredFields.add("issuerName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentedFinancialAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentedFinancialAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentedFinancialAccount is not found in the empty JSON string", ConsentedFinancialAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentedFinancialAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentedFinancialAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentedFinancialAccount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `category`
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        FinancialAccountCategoryType.validateJsonObject(jsonObj.getAsJsonObject("category"));
      }
      // validate the optional field `subCategory`
      if (jsonObj.get("subCategory") != null && !jsonObj.get("subCategory").isJsonNull()) {
        FinancialAccountSubCategoryType.validateJsonObject(jsonObj.getAsJsonObject("subCategory"));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("issuerId") != null && !jsonObj.get("issuerId").isJsonNull()) && !jsonObj.get("issuerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerId").toString()));
      }
      if ((jsonObj.get("issuerName") != null && !jsonObj.get("issuerName").isJsonNull()) && !jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentedFinancialAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentedFinancialAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentedFinancialAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentedFinancialAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentedFinancialAccount>() {
           @Override
           public void write(JsonWriter out, ConsentedFinancialAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentedFinancialAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentedFinancialAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentedFinancialAccount
  * @throws IOException if the JSON string is invalid with respect to ConsentedFinancialAccount
  */
  public static ConsentedFinancialAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentedFinancialAccount.class);
  }

 /**
  * Convert an instance of ConsentedFinancialAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

