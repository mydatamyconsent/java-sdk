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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-05T10:34:14.346303633Z[Etc/UTC]")
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

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuer_name";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  private String exchange;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Long units;

  public static final String SERIALIZED_NAME_INVESTMENT_VALUE = "investment_value";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_VALUE)
  private Double investmentValue;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "current_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Double currentValue;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private Holder holder;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Boolean transactions;

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


  public FinancialAccountEquity issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public FinancialAccountEquity exchange(String exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExchange() {
    return exchange;
  }


  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  public FinancialAccountEquity isin(String isin) {
    
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


  public FinancialAccountEquity units(Long units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUnits() {
    return units;
  }


  public void setUnits(Long units) {
    this.units = units;
  }


  public FinancialAccountEquity investmentValue(Double investmentValue) {
    
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


  public FinancialAccountEquity currentValue(Double currentValue) {
    
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


  public FinancialAccountEquity currencyCode(String currencyCode) {
    
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


  public FinancialAccountEquity holder(Holder holder) {
    
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


  public FinancialAccountEquity transactions(Boolean transactions) {
    
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
    FinancialAccountEquity financialAccountEquity = (FinancialAccountEquity) o;
    return Objects.equals(this.type, financialAccountEquity.type) &&
        Objects.equals(this.id, financialAccountEquity.id) &&
        Objects.equals(this.name, financialAccountEquity.name) &&
        Objects.equals(this.issuerName, financialAccountEquity.issuerName) &&
        Objects.equals(this.exchange, financialAccountEquity.exchange) &&
        Objects.equals(this.isin, financialAccountEquity.isin) &&
        Objects.equals(this.units, financialAccountEquity.units) &&
        Objects.equals(this.investmentValue, financialAccountEquity.investmentValue) &&
        Objects.equals(this.currentValue, financialAccountEquity.currentValue) &&
        Objects.equals(this.currencyCode, financialAccountEquity.currencyCode) &&
        Objects.equals(this.holder, financialAccountEquity.holder) &&
        Objects.equals(this.transactions, financialAccountEquity.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, issuerName, exchange, isin, units, investmentValue, currentValue, currencyCode, holder, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountEquity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    investmentValue: ").append(toIndentedString(investmentValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("issuer_name");
    openapiFields.add("exchange");
    openapiFields.add("isin");
    openapiFields.add("units");
    openapiFields.add("investment_value");
    openapiFields.add("current_value");
    openapiFields.add("currency_code");
    openapiFields.add("holder");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("issuer_name");
    openapiRequiredFields.add("exchange");
    openapiRequiredFields.add("isin");
    openapiRequiredFields.add("units");
    openapiRequiredFields.add("investment_value");
    openapiRequiredFields.add("current_value");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("holder");
    openapiRequiredFields.add("transactions");
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
      if ((jsonObj.get("issuer_name") != null && !jsonObj.get("issuer_name").isJsonNull()) && !jsonObj.get("issuer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_name").toString()));
      }
      if ((jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull()) && !jsonObj.get("exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
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

