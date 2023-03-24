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
import com.mydatamyconsent.model.TermDepositTransactionMode;
import com.mydatamyconsent.model.TermDepositTransactionType;
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
 * FinancialAccountTransactionTermDepositTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-24T10:34:50.607549009Z[Etc/UTC]")
public class FinancialAccountTransactionTermDepositTransaction {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_NARRATION = "narration";
  @SerializedName(SERIALIZED_NAME_NARRATION)
  private String narration;

  public static final String SERIALIZED_NAME_TXN_TYPE = "txn_type";
  @SerializedName(SERIALIZED_NAME_TXN_TYPE)
  private TermDepositTransactionType txnType;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TermDepositTransactionMode mode;

  public static final String SERIALIZED_NAME_TRANSACTED_AT_UTC = "transacted_at_utc";
  @SerializedName(SERIALIZED_NAME_TRANSACTED_AT_UTC)
  private OffsetDateTime transactedAtUtc;

  public FinancialAccountTransactionTermDepositTransaction() {
  }

  public FinancialAccountTransactionTermDepositTransaction type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TermDepositTransaction", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FinancialAccountTransactionTermDepositTransaction id(String id) {
    
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


  public FinancialAccountTransactionTermDepositTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public FinancialAccountTransactionTermDepositTransaction currencyCode(String currencyCode) {
    
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


  public FinancialAccountTransactionTermDepositTransaction narration(String narration) {
    
    this.narration = narration;
    return this;
  }

   /**
   * Get narration
   * @return narration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNarration() {
    return narration;
  }


  public void setNarration(String narration) {
    this.narration = narration;
  }


  public FinancialAccountTransactionTermDepositTransaction txnType(TermDepositTransactionType txnType) {
    
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositTransactionType getTxnType() {
    return txnType;
  }


  public void setTxnType(TermDepositTransactionType txnType) {
    this.txnType = txnType;
  }


  public FinancialAccountTransactionTermDepositTransaction mode(TermDepositTransactionMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositTransactionMode getMode() {
    return mode;
  }


  public void setMode(TermDepositTransactionMode mode) {
    this.mode = mode;
  }


  public FinancialAccountTransactionTermDepositTransaction transactedAtUtc(OffsetDateTime transactedAtUtc) {
    
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
    FinancialAccountTransactionTermDepositTransaction financialAccountTransactionTermDepositTransaction = (FinancialAccountTransactionTermDepositTransaction) o;
    return Objects.equals(this.type, financialAccountTransactionTermDepositTransaction.type) &&
        Objects.equals(this.id, financialAccountTransactionTermDepositTransaction.id) &&
        Objects.equals(this.amount, financialAccountTransactionTermDepositTransaction.amount) &&
        Objects.equals(this.currencyCode, financialAccountTransactionTermDepositTransaction.currencyCode) &&
        Objects.equals(this.narration, financialAccountTransactionTermDepositTransaction.narration) &&
        Objects.equals(this.txnType, financialAccountTransactionTermDepositTransaction.txnType) &&
        Objects.equals(this.mode, financialAccountTransactionTermDepositTransaction.mode) &&
        Objects.equals(this.transactedAtUtc, financialAccountTransactionTermDepositTransaction.transactedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, amount, currencyCode, narration, txnType, mode, transactedAtUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountTransactionTermDepositTransaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    narration: ").append(toIndentedString(narration)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
    openapiFields.add("narration");
    openapiFields.add("txn_type");
    openapiFields.add("mode");
    openapiFields.add("transacted_at_utc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("narration");
    openapiRequiredFields.add("txn_type");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("transacted_at_utc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountTransactionTermDepositTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountTransactionTermDepositTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountTransactionTermDepositTransaction is not found in the empty JSON string", FinancialAccountTransactionTermDepositTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountTransactionTermDepositTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountTransactionTermDepositTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountTransactionTermDepositTransaction.openapiRequiredFields) {
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
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("narration") != null && !jsonObj.get("narration").isJsonNull()) && !jsonObj.get("narration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `narration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("narration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountTransactionTermDepositTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountTransactionTermDepositTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountTransactionTermDepositTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTransactionTermDepositTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountTransactionTermDepositTransaction>() {
           @Override
           public void write(JsonWriter out, FinancialAccountTransactionTermDepositTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountTransactionTermDepositTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountTransactionTermDepositTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountTransactionTermDepositTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountTransactionTermDepositTransaction
  */
  public static FinancialAccountTransactionTermDepositTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountTransactionTermDepositTransaction.class);
  }

 /**
  * Convert an instance of FinancialAccountTransactionTermDepositTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

