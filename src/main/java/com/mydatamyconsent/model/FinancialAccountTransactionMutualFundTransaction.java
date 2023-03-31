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
import com.mydatamyconsent.model.MutualFundTransactionType;
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
 * FinancialAccountTransactionMutualFundTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-31T10:34:49.651051453Z[Etc/UTC]")
public class FinancialAccountTransactionMutualFundTransaction {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TXN_TYPE = "txn_type";
  @SerializedName(SERIALIZED_NAME_TXN_TYPE)
  private MutualFundTransactionType txnType;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_TRANSACTED_AT_UTC = "transacted_at_utc";
  @SerializedName(SERIALIZED_NAME_TRANSACTED_AT_UTC)
  private OffsetDateTime transactedAtUtc;

  public FinancialAccountTransactionMutualFundTransaction() {
  }

  public FinancialAccountTransactionMutualFundTransaction type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MutualFundTransaction", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FinancialAccountTransactionMutualFundTransaction id(String id) {
    
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


  public FinancialAccountTransactionMutualFundTransaction amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public FinancialAccountTransactionMutualFundTransaction currencyCode(String currencyCode) {
    
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


  public FinancialAccountTransactionMutualFundTransaction txnType(MutualFundTransactionType txnType) {
    
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundTransactionType getTxnType() {
    return txnType;
  }


  public void setTxnType(MutualFundTransactionType txnType) {
    this.txnType = txnType;
  }


  public FinancialAccountTransactionMutualFundTransaction units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUnits() {
    return units;
  }


  public void setUnits(String units) {
    this.units = units;
  }


  public FinancialAccountTransactionMutualFundTransaction transactedAtUtc(OffsetDateTime transactedAtUtc) {
    
    this.transactedAtUtc = transactedAtUtc;
    return this;
  }

   /**
   * Get transactedAtUtc
   * @return transactedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTransactedAtUtc() {
    return transactedAtUtc;
  }


  public void setTransactedAtUtc(OffsetDateTime transactedAtUtc) {
    this.transactedAtUtc = transactedAtUtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountTransactionMutualFundTransaction financialAccountTransactionMutualFundTransaction = (FinancialAccountTransactionMutualFundTransaction) o;
    return Objects.equals(this.type, financialAccountTransactionMutualFundTransaction.type) &&
        Objects.equals(this.id, financialAccountTransactionMutualFundTransaction.id) &&
        Objects.equals(this.amount, financialAccountTransactionMutualFundTransaction.amount) &&
        Objects.equals(this.currencyCode, financialAccountTransactionMutualFundTransaction.currencyCode) &&
        Objects.equals(this.txnType, financialAccountTransactionMutualFundTransaction.txnType) &&
        Objects.equals(this.units, financialAccountTransactionMutualFundTransaction.units) &&
        Objects.equals(this.transactedAtUtc, financialAccountTransactionMutualFundTransaction.transactedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, amount, currencyCode, txnType, units, transactedAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountTransactionMutualFundTransaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    transactedAtUtc: ").append(toIndentedString(transactedAtUtc)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency_code");
    openapiFields.add("txn_type");
    openapiFields.add("units");
    openapiFields.add("transacted_at_utc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("txn_type");
    openapiRequiredFields.add("units");
    openapiRequiredFields.add("transacted_at_utc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountTransactionMutualFundTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountTransactionMutualFundTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountTransactionMutualFundTransaction is not found in the empty JSON string", FinancialAccountTransactionMutualFundTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountTransactionMutualFundTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountTransactionMutualFundTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountTransactionMutualFundTransaction.openapiRequiredFields) {
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
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountTransactionMutualFundTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountTransactionMutualFundTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountTransactionMutualFundTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTransactionMutualFundTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountTransactionMutualFundTransaction>() {
           @Override
           public void write(JsonWriter out, FinancialAccountTransactionMutualFundTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountTransactionMutualFundTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountTransactionMutualFundTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountTransactionMutualFundTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountTransactionMutualFundTransaction
  */
  public static FinancialAccountTransactionMutualFundTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountTransactionMutualFundTransaction.class);
  }

 /**
  * Convert an instance of FinancialAccountTransactionMutualFundTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

