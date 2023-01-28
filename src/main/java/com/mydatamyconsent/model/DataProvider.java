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
 * DataProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-28T10:34:01.343102726Z[Etc/UTC]")
public class DataProvider {
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

  public DataProvider() {
  }

  public DataProvider id(String id) {
    
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


  public DataProvider name(String name) {
    
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


  public DataProvider category(String category) {
    
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


  public DataProvider logoUrl(String logoUrl) {
    
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


  public DataProvider website(String website) {
    
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


  public DataProvider supportEmail(String supportEmail) {
    
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


  public DataProvider helpLineNumber(String helpLineNumber) {
    
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


  public DataProvider privacyPolicy(String privacyPolicy) {
    
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


  public DataProvider termOfService(String termOfService) {
    
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


  public DataProvider dataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProvider dataProvider = (DataProvider) o;
    return Objects.equals(this.id, dataProvider.id) &&
        Objects.equals(this.name, dataProvider.name) &&
        Objects.equals(this.category, dataProvider.category) &&
        Objects.equals(this.logoUrl, dataProvider.logoUrl) &&
        Objects.equals(this.website, dataProvider.website) &&
        Objects.equals(this.supportEmail, dataProvider.supportEmail) &&
        Objects.equals(this.helpLineNumber, dataProvider.helpLineNumber) &&
        Objects.equals(this.privacyPolicy, dataProvider.privacyPolicy) &&
        Objects.equals(this.termOfService, dataProvider.termOfService) &&
        Objects.equals(this.dataProtectionOfficer, dataProvider.dataProtectionOfficer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, logoUrl, website, supportEmail, helpLineNumber, privacyPolicy, termOfService, dataProtectionOfficer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProvider {\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("dataProtectionOfficer");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataProvider
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataProvider.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataProvider is not found in the empty JSON string", DataProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataProvider` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataProvider.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<DataProvider>() {
           @Override
           public void write(JsonWriter out, DataProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataProvider read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataProvider
  * @throws IOException if the JSON string is invalid with respect to DataProvider
  */
  public static DataProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataProvider.class);
  }

 /**
  * Convert an instance of DataProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

