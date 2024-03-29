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
import com.mydatamyconsent.model.DataProtectionOfficer;
import com.mydatamyconsent.model.SupportedDocumentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DataProviderDetails: Data provider details.
 */
@ApiModel(description = "DataProviderDetails: Data provider details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T10:38:51.740024692Z[Etc/UTC]")
public class DataProviderDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "supportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public static final String SERIALIZED_NAME_HELP_LINE_NUMBER = "helpLineNumber";
  @SerializedName(SERIALIZED_NAME_HELP_LINE_NUMBER)
  private String helpLineNumber;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY = "privacyPolicy";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY)
  private String privacyPolicy;

  public static final String SERIALIZED_NAME_TERM_OF_SERVICE = "termOfService";
  @SerializedName(SERIALIZED_NAME_TERM_OF_SERVICE)
  private String termOfService;

  public static final String SERIALIZED_NAME_DATA_PROTECTION_OFFICER = "dataProtectionOfficer";
  @SerializedName(SERIALIZED_NAME_DATA_PROTECTION_OFFICER)
  private DataProtectionOfficer dataProtectionOfficer;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES = "supportedDocumentTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES)
  private List<SupportedDocumentType> supportedDocumentTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES = "supportedAccountTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES)
  private List<String> supportedAccountTypes = new ArrayList<>();

  public DataProviderDetails() {
  }

  public DataProviderDetails id(String id) {
    
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


  public DataProviderDetails name(String name) {
    
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


  public DataProviderDetails category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public DataProviderDetails logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public DataProviderDetails website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public DataProviderDetails supportEmail(String supportEmail) {
    
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * Get supportEmail
   * @return supportEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSupportEmail() {
    return supportEmail;
  }


  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }


  public DataProviderDetails helpLineNumber(String helpLineNumber) {
    
    this.helpLineNumber = helpLineNumber;
    return this;
  }

   /**
   * Get helpLineNumber
   * @return helpLineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpLineNumber() {
    return helpLineNumber;
  }


  public void setHelpLineNumber(String helpLineNumber) {
    this.helpLineNumber = helpLineNumber;
  }


  public DataProviderDetails privacyPolicy(String privacyPolicy) {
    
    this.privacyPolicy = privacyPolicy;
    return this;
  }

   /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyPolicy() {
    return privacyPolicy;
  }


  public void setPrivacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }


  public DataProviderDetails termOfService(String termOfService) {
    
    this.termOfService = termOfService;
    return this;
  }

   /**
   * Get termOfService
   * @return termOfService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTermOfService() {
    return termOfService;
  }


  public void setTermOfService(String termOfService) {
    this.termOfService = termOfService;
  }


  public DataProviderDetails dataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    
    this.dataProtectionOfficer = dataProtectionOfficer;
    return this;
  }

   /**
   * Get dataProtectionOfficer
   * @return dataProtectionOfficer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DataProtectionOfficer getDataProtectionOfficer() {
    return dataProtectionOfficer;
  }


  public void setDataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    this.dataProtectionOfficer = dataProtectionOfficer;
  }


  public DataProviderDetails supportedDocumentTypes(List<SupportedDocumentType> supportedDocumentTypes) {
    
    this.supportedDocumentTypes = supportedDocumentTypes;
    return this;
  }

  public DataProviderDetails addSupportedDocumentTypesItem(SupportedDocumentType supportedDocumentTypesItem) {
    this.supportedDocumentTypes.add(supportedDocumentTypesItem);
    return this;
  }

   /**
   * Get supportedDocumentTypes
   * @return supportedDocumentTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SupportedDocumentType> getSupportedDocumentTypes() {
    return supportedDocumentTypes;
  }


  public void setSupportedDocumentTypes(List<SupportedDocumentType> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
  }


  public DataProviderDetails supportedAccountTypes(List<String> supportedAccountTypes) {
    
    this.supportedAccountTypes = supportedAccountTypes;
    return this;
  }

  public DataProviderDetails addSupportedAccountTypesItem(String supportedAccountTypesItem) {
    this.supportedAccountTypes.add(supportedAccountTypesItem);
    return this;
  }

   /**
   * Get supportedAccountTypes
   * @return supportedAccountTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getSupportedAccountTypes() {
    return supportedAccountTypes;
  }


  public void setSupportedAccountTypes(List<String> supportedAccountTypes) {
    this.supportedAccountTypes = supportedAccountTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProviderDetails dataProviderDetails = (DataProviderDetails) o;
    return Objects.equals(this.id, dataProviderDetails.id) &&
        Objects.equals(this.name, dataProviderDetails.name) &&
        Objects.equals(this.category, dataProviderDetails.category) &&
        Objects.equals(this.logoUrl, dataProviderDetails.logoUrl) &&
        Objects.equals(this.website, dataProviderDetails.website) &&
        Objects.equals(this.supportEmail, dataProviderDetails.supportEmail) &&
        Objects.equals(this.helpLineNumber, dataProviderDetails.helpLineNumber) &&
        Objects.equals(this.privacyPolicy, dataProviderDetails.privacyPolicy) &&
        Objects.equals(this.termOfService, dataProviderDetails.termOfService) &&
        Objects.equals(this.dataProtectionOfficer, dataProviderDetails.dataProtectionOfficer) &&
        Objects.equals(this.supportedDocumentTypes, dataProviderDetails.supportedDocumentTypes) &&
        Objects.equals(this.supportedAccountTypes, dataProviderDetails.supportedAccountTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, logoUrl, website, supportEmail, helpLineNumber, privacyPolicy, termOfService, dataProtectionOfficer, supportedDocumentTypes, supportedAccountTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProviderDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    helpLineNumber: ").append(toIndentedString(helpLineNumber)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    termOfService: ").append(toIndentedString(termOfService)).append("\n");
    sb.append("    dataProtectionOfficer: ").append(toIndentedString(dataProtectionOfficer)).append("\n");
    sb.append("    supportedDocumentTypes: ").append(toIndentedString(supportedDocumentTypes)).append("\n");
    sb.append("    supportedAccountTypes: ").append(toIndentedString(supportedAccountTypes)).append("\n");
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
    openapiFields.add("logoUrl");
    openapiFields.add("website");
    openapiFields.add("supportEmail");
    openapiFields.add("helpLineNumber");
    openapiFields.add("privacyPolicy");
    openapiFields.add("termOfService");
    openapiFields.add("dataProtectionOfficer");
    openapiFields.add("supportedDocumentTypes");
    openapiFields.add("supportedAccountTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("dataProtectionOfficer");
    openapiRequiredFields.add("supportedDocumentTypes");
    openapiRequiredFields.add("supportedAccountTypes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataProviderDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataProviderDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataProviderDetails is not found in the empty JSON string", DataProviderDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataProviderDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataProviderDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataProviderDetails.openapiRequiredFields) {
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
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull()) && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if ((jsonObj.get("supportEmail") != null && !jsonObj.get("supportEmail").isJsonNull()) && !jsonObj.get("supportEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportEmail").toString()));
      }
      if ((jsonObj.get("helpLineNumber") != null && !jsonObj.get("helpLineNumber").isJsonNull()) && !jsonObj.get("helpLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helpLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helpLineNumber").toString()));
      }
      if ((jsonObj.get("privacyPolicy") != null && !jsonObj.get("privacyPolicy").isJsonNull()) && !jsonObj.get("privacyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacyPolicy").toString()));
      }
      if ((jsonObj.get("termOfService") != null && !jsonObj.get("termOfService").isJsonNull()) && !jsonObj.get("termOfService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termOfService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termOfService").toString()));
      }
      // validate the optional field `dataProtectionOfficer`
      if (jsonObj.get("dataProtectionOfficer") != null && !jsonObj.get("dataProtectionOfficer").isJsonNull()) {
        DataProtectionOfficer.validateJsonObject(jsonObj.getAsJsonObject("dataProtectionOfficer"));
      }
      if (jsonObj.get("supportedDocumentTypes") != null && !jsonObj.get("supportedDocumentTypes").isJsonNull()) {
        JsonArray jsonArraysupportedDocumentTypes = jsonObj.getAsJsonArray("supportedDocumentTypes");
        if (jsonArraysupportedDocumentTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedDocumentTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedDocumentTypes` to be an array in the JSON string but got `%s`", jsonObj.get("supportedDocumentTypes").toString()));
          }

          // validate the optional field `supportedDocumentTypes` (array)
          for (int i = 0; i < jsonArraysupportedDocumentTypes.size(); i++) {
            SupportedDocumentType.validateJsonObject(jsonArraysupportedDocumentTypes.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("supportedAccountTypes") != null && !jsonObj.get("supportedAccountTypes").isJsonNull()) && !jsonObj.get("supportedAccountTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedAccountTypes` to be an array in the JSON string but got `%s`", jsonObj.get("supportedAccountTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataProviderDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataProviderDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataProviderDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataProviderDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DataProviderDetails>() {
           @Override
           public void write(JsonWriter out, DataProviderDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataProviderDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataProviderDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataProviderDetails
  * @throws IOException if the JSON string is invalid with respect to DataProviderDetails
  */
  public static DataProviderDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataProviderDetails.class);
  }

 /**
  * Convert an instance of DataProviderDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

