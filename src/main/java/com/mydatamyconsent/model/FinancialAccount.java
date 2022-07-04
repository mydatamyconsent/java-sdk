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
import com.mydatamyconsent.model.Activity;
import com.mydatamyconsent.model.ApprovedConsentRequest;
import com.mydatamyconsent.model.SharedWith;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
 * FinancialAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T10:46:44.544696794Z[Etc/UTC]")
public class FinancialAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "categoryName";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_LOGO_URL = "accountLogoUrl";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LOGO_URL)
  private String accountLogoUrl;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_BALANCE_TYPE = "balanceType";
  @SerializedName(SERIALIZED_NAME_BALANCE_TYPE)
  private String balanceType;

  public static final String SERIALIZED_NAME_IS_SHARED = "isShared";
  @SerializedName(SERIALIZED_NAME_IS_SHARED)
  private Boolean isShared;

  public static final String SERIALIZED_NAME_SHARED_WITH = "sharedWith";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH)
  private List<SharedWith> sharedWith = null;

  public static final String SERIALIZED_NAME_IS_RECEIVED = "isReceived";
  @SerializedName(SERIALIZED_NAME_IS_RECEIVED)
  private Boolean isReceived;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_ACTIVITIES = "activities";
  @SerializedName(SERIALIZED_NAME_ACTIVITIES)
  private List<Activity> activities = null;

  public static final String SERIALIZED_NAME_APPROVED_CONSENT_REQUESTS = "approvedConsentRequests";
  @SerializedName(SERIALIZED_NAME_APPROVED_CONSENT_REQUESTS)
  private List<ApprovedConsentRequest> approvedConsentRequests = null;

  public FinancialAccount() { 
  }

  public FinancialAccount id(UUID id) {
    
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


  public FinancialAccount issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public FinancialAccount logoUrl(String logoUrl) {
    
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


  public FinancialAccount categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public FinancialAccount categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public FinancialAccount accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public FinancialAccount accountLogoUrl(String accountLogoUrl) {
    
    this.accountLogoUrl = accountLogoUrl;
    return this;
  }

   /**
   * Get accountLogoUrl
   * @return accountLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountLogoUrl() {
    return accountLogoUrl;
  }


  public void setAccountLogoUrl(String accountLogoUrl) {
    this.accountLogoUrl = accountLogoUrl;
  }


  public FinancialAccount balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
    this.balance = balance;
  }


  public FinancialAccount balanceType(String balanceType) {
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBalanceType() {
    return balanceType;
  }


  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  public FinancialAccount isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * Get isShared
   * @return isShared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsShared() {
    return isShared;
  }


  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public FinancialAccount sharedWith(List<SharedWith> sharedWith) {
    
    this.sharedWith = sharedWith;
    return this;
  }

  public FinancialAccount addSharedWithItem(SharedWith sharedWithItem) {
    if (this.sharedWith == null) {
      this.sharedWith = new ArrayList<>();
    }
    this.sharedWith.add(sharedWithItem);
    return this;
  }

   /**
   * Get sharedWith
   * @return sharedWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SharedWith> getSharedWith() {
    return sharedWith;
  }


  public void setSharedWith(List<SharedWith> sharedWith) {
    this.sharedWith = sharedWith;
  }


  public FinancialAccount isReceived(Boolean isReceived) {
    
    this.isReceived = isReceived;
    return this;
  }

   /**
   * Get isReceived
   * @return isReceived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsReceived() {
    return isReceived;
  }


  public void setIsReceived(Boolean isReceived) {
    this.isReceived = isReceived;
  }


  public FinancialAccount expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
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


  public FinancialAccount activities(List<Activity> activities) {
    
    this.activities = activities;
    return this;
  }

  public FinancialAccount addActivitiesItem(Activity activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Activity> getActivities() {
    return activities;
  }


  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }


  public FinancialAccount approvedConsentRequests(List<ApprovedConsentRequest> approvedConsentRequests) {
    
    this.approvedConsentRequests = approvedConsentRequests;
    return this;
  }

  public FinancialAccount addApprovedConsentRequestsItem(ApprovedConsentRequest approvedConsentRequestsItem) {
    if (this.approvedConsentRequests == null) {
      this.approvedConsentRequests = new ArrayList<>();
    }
    this.approvedConsentRequests.add(approvedConsentRequestsItem);
    return this;
  }

   /**
   * Get approvedConsentRequests
   * @return approvedConsentRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApprovedConsentRequest> getApprovedConsentRequests() {
    return approvedConsentRequests;
  }


  public void setApprovedConsentRequests(List<ApprovedConsentRequest> approvedConsentRequests) {
    this.approvedConsentRequests = approvedConsentRequests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccount financialAccount = (FinancialAccount) o;
    return Objects.equals(this.id, financialAccount.id) &&
        Objects.equals(this.issuer, financialAccount.issuer) &&
        Objects.equals(this.logoUrl, financialAccount.logoUrl) &&
        Objects.equals(this.categoryId, financialAccount.categoryId) &&
        Objects.equals(this.categoryName, financialAccount.categoryName) &&
        Objects.equals(this.accountName, financialAccount.accountName) &&
        Objects.equals(this.accountLogoUrl, financialAccount.accountLogoUrl) &&
        Objects.equals(this.balance, financialAccount.balance) &&
        Objects.equals(this.balanceType, financialAccount.balanceType) &&
        Objects.equals(this.isShared, financialAccount.isShared) &&
        Objects.equals(this.sharedWith, financialAccount.sharedWith) &&
        Objects.equals(this.isReceived, financialAccount.isReceived) &&
        Objects.equals(this.expiresAtUtc, financialAccount.expiresAtUtc) &&
        Objects.equals(this.activities, financialAccount.activities) &&
        Objects.equals(this.approvedConsentRequests, financialAccount.approvedConsentRequests);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issuer, logoUrl, categoryId, categoryName, accountName, accountLogoUrl, balance, balanceType, isShared, sharedWith, isReceived, expiresAtUtc, activities, approvedConsentRequests);
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
    sb.append("class FinancialAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountLogoUrl: ").append(toIndentedString(accountLogoUrl)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    isReceived: ").append(toIndentedString(isReceived)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    approvedConsentRequests: ").append(toIndentedString(approvedConsentRequests)).append("\n");
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
    openapiFields.add("issuer");
    openapiFields.add("logoUrl");
    openapiFields.add("categoryId");
    openapiFields.add("categoryName");
    openapiFields.add("accountName");
    openapiFields.add("accountLogoUrl");
    openapiFields.add("balance");
    openapiFields.add("balanceType");
    openapiFields.add("isShared");
    openapiFields.add("sharedWith");
    openapiFields.add("isReceived");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("activities");
    openapiFields.add("approvedConsentRequests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccount is not found in the empty JSON string", FinancialAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if (jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
      if (jsonObj.get("categoryId") != null && !jsonObj.get("categoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryId").toString()));
      }
      if (jsonObj.get("categoryName") != null && !jsonObj.get("categoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryName").toString()));
      }
      if (jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      if (jsonObj.get("accountLogoUrl") != null && !jsonObj.get("accountLogoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountLogoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountLogoUrl").toString()));
      }
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance").toString()));
      }
      if (jsonObj.get("balanceType") != null && !jsonObj.get("balanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceType").toString()));
      }
      JsonArray jsonArraysharedWith = jsonObj.getAsJsonArray("sharedWith");
      if (jsonArraysharedWith != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sharedWith").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sharedWith` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWith").toString()));
        }

        // validate the optional field `sharedWith` (array)
        for (int i = 0; i < jsonArraysharedWith.size(); i++) {
          SharedWith.validateJsonObject(jsonArraysharedWith.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayactivities = jsonObj.getAsJsonArray("activities");
      if (jsonArrayactivities != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activities").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activities` to be an array in the JSON string but got `%s`", jsonObj.get("activities").toString()));
        }

        // validate the optional field `activities` (array)
        for (int i = 0; i < jsonArrayactivities.size(); i++) {
          Activity.validateJsonObject(jsonArrayactivities.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayapprovedConsentRequests = jsonObj.getAsJsonArray("approvedConsentRequests");
      if (jsonArrayapprovedConsentRequests != null) {
        // ensure the json data is an array
        if (!jsonObj.get("approvedConsentRequests").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `approvedConsentRequests` to be an array in the JSON string but got `%s`", jsonObj.get("approvedConsentRequests").toString()));
        }

        // validate the optional field `approvedConsentRequests` (array)
        for (int i = 0; i < jsonArrayapprovedConsentRequests.size(); i++) {
          ApprovedConsentRequest.validateJsonObject(jsonArrayapprovedConsentRequests.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccount>() {
           @Override
           public void write(JsonWriter out, FinancialAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccount
  * @throws IOException if the JSON string is invalid with respect to FinancialAccount
  */
  public static FinancialAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccount.class);
  }

 /**
  * Convert an instance of FinancialAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

