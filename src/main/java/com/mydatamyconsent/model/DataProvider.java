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
import com.mydatamyconsent.model.DataProtectionOfficer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DataProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T10:35:11.987146036Z[Etc/UTC]")
public class DataProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SUPPORT_PHONE_NUMBER = "supportPhoneNumber";
  @SerializedName(SERIALIZED_NAME_SUPPORT_PHONE_NUMBER)
  private String supportPhoneNumber;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY = "privacyPolicy";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY)
  private String privacyPolicy;

  public static final String SERIALIZED_NAME_TERM_OF_SERVICE = "termOfService";
  @SerializedName(SERIALIZED_NAME_TERM_OF_SERVICE)
  private String termOfService;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DATA_PROTECTION_OFFICER = "dataProtectionOfficer";
  @SerializedName(SERIALIZED_NAME_DATA_PROTECTION_OFFICER)
  private DataProtectionOfficer dataProtectionOfficer;

  public static final String SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES = "supportedAccountTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES)
  private List<String> supportedAccountTypes = null;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES = "supportedDocumentTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES)
  private List<String> supportedDocumentTypes = null;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
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


  public DataProvider email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public DataProvider supportPhoneNumber(String supportPhoneNumber) {
    
    this.supportPhoneNumber = supportPhoneNumber;
    return this;
  }

   /**
   * Get supportPhoneNumber
   * @return supportPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSupportPhoneNumber() {
    return supportPhoneNumber;
  }


  public void setSupportPhoneNumber(String supportPhoneNumber) {
    this.supportPhoneNumber = supportPhoneNumber;
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


  public DataProvider category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public DataProvider dataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    
    this.dataProtectionOfficer = dataProtectionOfficer;
    return this;
  }

   /**
   * Get dataProtectionOfficer
   * @return dataProtectionOfficer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataProtectionOfficer getDataProtectionOfficer() {
    return dataProtectionOfficer;
  }


  public void setDataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    this.dataProtectionOfficer = dataProtectionOfficer;
  }


  public DataProvider supportedAccountTypes(List<String> supportedAccountTypes) {
    
    this.supportedAccountTypes = supportedAccountTypes;
    return this;
  }

  public DataProvider addSupportedAccountTypesItem(String supportedAccountTypesItem) {
    if (this.supportedAccountTypes == null) {
      this.supportedAccountTypes = new ArrayList<String>();
    }
    this.supportedAccountTypes.add(supportedAccountTypesItem);
    return this;
  }

   /**
   * Get supportedAccountTypes
   * @return supportedAccountTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupportedAccountTypes() {
    return supportedAccountTypes;
  }


  public void setSupportedAccountTypes(List<String> supportedAccountTypes) {
    this.supportedAccountTypes = supportedAccountTypes;
  }


  public DataProvider supportedDocumentTypes(List<String> supportedDocumentTypes) {
    
    this.supportedDocumentTypes = supportedDocumentTypes;
    return this;
  }

  public DataProvider addSupportedDocumentTypesItem(String supportedDocumentTypesItem) {
    if (this.supportedDocumentTypes == null) {
      this.supportedDocumentTypes = new ArrayList<String>();
    }
    this.supportedDocumentTypes.add(supportedDocumentTypesItem);
    return this;
  }

   /**
   * Get supportedDocumentTypes
   * @return supportedDocumentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupportedDocumentTypes() {
    return supportedDocumentTypes;
  }


  public void setSupportedDocumentTypes(List<String> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
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
        Objects.equals(this.logoUrl, dataProvider.logoUrl) &&
        Objects.equals(this.website, dataProvider.website) &&
        Objects.equals(this.email, dataProvider.email) &&
        Objects.equals(this.supportPhoneNumber, dataProvider.supportPhoneNumber) &&
        Objects.equals(this.privacyPolicy, dataProvider.privacyPolicy) &&
        Objects.equals(this.termOfService, dataProvider.termOfService) &&
        Objects.equals(this.category, dataProvider.category) &&
        Objects.equals(this.dataProtectionOfficer, dataProvider.dataProtectionOfficer) &&
        Objects.equals(this.supportedAccountTypes, dataProvider.supportedAccountTypes) &&
        Objects.equals(this.supportedDocumentTypes, dataProvider.supportedDocumentTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logoUrl, website, email, supportPhoneNumber, privacyPolicy, termOfService, category, dataProtectionOfficer, supportedAccountTypes, supportedDocumentTypes);
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
    sb.append("class DataProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    supportPhoneNumber: ").append(toIndentedString(supportPhoneNumber)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    termOfService: ").append(toIndentedString(termOfService)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dataProtectionOfficer: ").append(toIndentedString(dataProtectionOfficer)).append("\n");
    sb.append("    supportedAccountTypes: ").append(toIndentedString(supportedAccountTypes)).append("\n");
    sb.append("    supportedDocumentTypes: ").append(toIndentedString(supportedDocumentTypes)).append("\n");
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

