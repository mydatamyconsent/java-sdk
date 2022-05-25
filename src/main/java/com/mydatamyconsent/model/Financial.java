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

/**
 * Financial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-25T10:37:12.390012540Z[Etc/UTC]")
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
      this.accounts = new ArrayList<FinancialAccounts>();
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

}

