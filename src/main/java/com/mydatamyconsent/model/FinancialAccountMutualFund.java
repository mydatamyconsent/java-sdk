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
import com.mydatamyconsent.model.Holder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * FinancialAccountMutualFund
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T10:38:29.361865301Z[Etc/UTC]")
public class FinancialAccountMutualFund {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INVESTMENT_VALUE = "investment_value";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_VALUE)
  private Double investmentValue;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "current_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Double currentValue;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_AMC = "amc";
  @SerializedName(SERIALIZED_NAME_AMC)
  private String amc;

  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public static final String SERIALIZED_NAME_FUND_NAME = "fund_name";
  @SerializedName(SERIALIZED_NAME_FUND_NAME)
  private String fundName;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_FOLIO_NUMBER = "folio_number";
  @SerializedName(SERIALIZED_NAME_FOLIO_NUMBER)
  private String folioNumber;

  public static final String SERIALIZED_NAME_SCHEME_CODE = "scheme_code";
  @SerializedName(SERIALIZED_NAME_SCHEME_CODE)
  private String schemeCode;

  public static final String SERIALIZED_NAME_FUND_TYPE = "fund_type";
  @SerializedName(SERIALIZED_NAME_FUND_TYPE)
  private String fundType;

  public static final String SERIALIZED_NAME_FUND_CATEGORY = "fund_category";
  @SerializedName(SERIALIZED_NAME_FUND_CATEGORY)
  private String fundCategory;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_LIEN_UNITS = "lien_units";
  @SerializedName(SERIALIZED_NAME_LIEN_UNITS)
  private String lienUnits;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private Holder holder;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Boolean transactions;

  public FinancialAccountMutualFund() {
  }

  public FinancialAccountMutualFund type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MutualFund", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FinancialAccountMutualFund id(String id) {
    
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


  public FinancialAccountMutualFund name(String name) {
    
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


  public FinancialAccountMutualFund investmentValue(Double investmentValue) {
    
    this.investmentValue = investmentValue;
    return this;
  }

   /**
   * Get investmentValue
   * @return investmentValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInvestmentValue() {
    return investmentValue;
  }


  public void setInvestmentValue(Double investmentValue) {
    this.investmentValue = investmentValue;
  }


  public FinancialAccountMutualFund currentValue(Double currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * Get currentValue
   * @return currentValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCurrentValue() {
    return currentValue;
  }


  public void setCurrentValue(Double currentValue) {
    this.currentValue = currentValue;
  }


  public FinancialAccountMutualFund currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public FinancialAccountMutualFund amc(String amc) {
    
    this.amc = amc;
    return this;
  }

   /**
   * Get amc
   * @return amc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmc() {
    return amc;
  }


  public void setAmc(String amc) {
    this.amc = amc;
  }


  public FinancialAccountMutualFund registrar(String registrar) {
    
    this.registrar = registrar;
    return this;
  }

   /**
   * Get registrar
   * @return registrar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegistrar() {
    return registrar;
  }


  public void setRegistrar(String registrar) {
    this.registrar = registrar;
  }


  public FinancialAccountMutualFund fundName(String fundName) {
    
    this.fundName = fundName;
    return this;
  }

   /**
   * Get fundName
   * @return fundName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFundName() {
    return fundName;
  }


  public void setFundName(String fundName) {
    this.fundName = fundName;
  }


  public FinancialAccountMutualFund isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public FinancialAccountMutualFund folioNumber(String folioNumber) {
    
    this.folioNumber = folioNumber;
    return this;
  }

   /**
   * Get folioNumber
   * @return folioNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFolioNumber() {
    return folioNumber;
  }


  public void setFolioNumber(String folioNumber) {
    this.folioNumber = folioNumber;
  }


  public FinancialAccountMutualFund schemeCode(String schemeCode) {
    
    this.schemeCode = schemeCode;
    return this;
  }

   /**
   * Get schemeCode
   * @return schemeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchemeCode() {
    return schemeCode;
  }


  public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
  }


  public FinancialAccountMutualFund fundType(String fundType) {
    
    this.fundType = fundType;
    return this;
  }

   /**
   * Get fundType
   * @return fundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFundType() {
    return fundType;
  }


  public void setFundType(String fundType) {
    this.fundType = fundType;
  }


  public FinancialAccountMutualFund fundCategory(String fundCategory) {
    
    this.fundCategory = fundCategory;
    return this;
  }

   /**
   * Get fundCategory
   * @return fundCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFundCategory() {
    return fundCategory;
  }


  public void setFundCategory(String fundCategory) {
    this.fundCategory = fundCategory;
  }


  public FinancialAccountMutualFund units(Double units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getUnits() {
    return units;
  }


  public void setUnits(Double units) {
    this.units = units;
  }


  public FinancialAccountMutualFund lienUnits(String lienUnits) {
    
    this.lienUnits = lienUnits;
    return this;
  }

   /**
   * Get lienUnits
   * @return lienUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLienUnits() {
    return lienUnits;
  }


  public void setLienUnits(String lienUnits) {
    this.lienUnits = lienUnits;
  }


  public FinancialAccountMutualFund creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public FinancialAccountMutualFund holder(Holder holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Holder getHolder() {
    return holder;
  }


  public void setHolder(Holder holder) {
    this.holder = holder;
  }


  public FinancialAccountMutualFund transactions(Boolean transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTransactions() {
    return transactions;
  }


  public void setTransactions(Boolean transactions) {
    this.transactions = transactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountMutualFund financialAccountMutualFund = (FinancialAccountMutualFund) o;
    return Objects.equals(this.type, financialAccountMutualFund.type) &&
        Objects.equals(this.id, financialAccountMutualFund.id) &&
        Objects.equals(this.name, financialAccountMutualFund.name) &&
        Objects.equals(this.investmentValue, financialAccountMutualFund.investmentValue) &&
        Objects.equals(this.currentValue, financialAccountMutualFund.currentValue) &&
        Objects.equals(this.currencyCode, financialAccountMutualFund.currencyCode) &&
        Objects.equals(this.amc, financialAccountMutualFund.amc) &&
        Objects.equals(this.registrar, financialAccountMutualFund.registrar) &&
        Objects.equals(this.fundName, financialAccountMutualFund.fundName) &&
        Objects.equals(this.isin, financialAccountMutualFund.isin) &&
        Objects.equals(this.folioNumber, financialAccountMutualFund.folioNumber) &&
        Objects.equals(this.schemeCode, financialAccountMutualFund.schemeCode) &&
        Objects.equals(this.fundType, financialAccountMutualFund.fundType) &&
        Objects.equals(this.fundCategory, financialAccountMutualFund.fundCategory) &&
        Objects.equals(this.units, financialAccountMutualFund.units) &&
        Objects.equals(this.lienUnits, financialAccountMutualFund.lienUnits) &&
        Objects.equals(this.creationDate, financialAccountMutualFund.creationDate) &&
        Objects.equals(this.holder, financialAccountMutualFund.holder) &&
        Objects.equals(this.transactions, financialAccountMutualFund.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, investmentValue, currentValue, currencyCode, amc, registrar, fundName, isin, folioNumber, schemeCode, fundType, fundCategory, units, lienUnits, creationDate, holder, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountMutualFund {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    investmentValue: ").append(toIndentedString(investmentValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    amc: ").append(toIndentedString(amc)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    folioNumber: ").append(toIndentedString(folioNumber)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    fundCategory: ").append(toIndentedString(fundCategory)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    lienUnits: ").append(toIndentedString(lienUnits)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
    openapiFields.add("investment_value");
    openapiFields.add("current_value");
    openapiFields.add("currency_code");
    openapiFields.add("amc");
    openapiFields.add("registrar");
    openapiFields.add("fund_name");
    openapiFields.add("isin");
    openapiFields.add("folio_number");
    openapiFields.add("scheme_code");
    openapiFields.add("fund_type");
    openapiFields.add("fund_category");
    openapiFields.add("units");
    openapiFields.add("lien_units");
    openapiFields.add("creation_date");
    openapiFields.add("holder");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("investment_value");
    openapiRequiredFields.add("current_value");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("fund_name");
    openapiRequiredFields.add("isin");
    openapiRequiredFields.add("folio_number");
    openapiRequiredFields.add("units");
    openapiRequiredFields.add("holder");
    openapiRequiredFields.add("transactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountMutualFund
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountMutualFund.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountMutualFund is not found in the empty JSON string", FinancialAccountMutualFund.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountMutualFund.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountMutualFund` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountMutualFund.openapiRequiredFields) {
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
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("amc") != null && !jsonObj.get("amc").isJsonNull()) && !jsonObj.get("amc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amc").toString()));
      }
      if ((jsonObj.get("registrar") != null && !jsonObj.get("registrar").isJsonNull()) && !jsonObj.get("registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrar").toString()));
      }
      if ((jsonObj.get("fund_name") != null && !jsonObj.get("fund_name").isJsonNull()) && !jsonObj.get("fund_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_name").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("folio_number") != null && !jsonObj.get("folio_number").isJsonNull()) && !jsonObj.get("folio_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folio_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folio_number").toString()));
      }
      if ((jsonObj.get("scheme_code") != null && !jsonObj.get("scheme_code").isJsonNull()) && !jsonObj.get("scheme_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme_code").toString()));
      }
      if ((jsonObj.get("fund_type") != null && !jsonObj.get("fund_type").isJsonNull()) && !jsonObj.get("fund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_type").toString()));
      }
      if ((jsonObj.get("fund_category") != null && !jsonObj.get("fund_category").isJsonNull()) && !jsonObj.get("fund_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_category").toString()));
      }
      if ((jsonObj.get("lien_units") != null && !jsonObj.get("lien_units").isJsonNull()) && !jsonObj.get("lien_units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lien_units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lien_units").toString()));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        Holder.validateJsonObject(jsonObj.getAsJsonObject("holder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountMutualFund.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountMutualFund' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountMutualFund> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountMutualFund.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountMutualFund>() {
           @Override
           public void write(JsonWriter out, FinancialAccountMutualFund value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountMutualFund read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountMutualFund given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountMutualFund
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountMutualFund
  */
  public static FinancialAccountMutualFund fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountMutualFund.class);
  }

 /**
  * Convert an instance of FinancialAccountMutualFund to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

