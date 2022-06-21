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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * OrganizationFinancialTransactionsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-21T10:37:48.736273653Z[Etc/UTC]")
public class OrganizationFinancialTransactionsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private UUID accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrumentId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private UUID instrumentId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_AVERAGE_PRICE = "averagePrice";
  @SerializedName(SERIALIZED_NAME_AVERAGE_PRICE)
  private Double averagePrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public OrganizationFinancialTransactionsDto() { 
  }

  public OrganizationFinancialTransactionsDto id(UUID id) {
    
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


  public OrganizationFinancialTransactionsDto accountId(UUID accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountId() {
    return accountId;
  }


  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }


  public OrganizationFinancialTransactionsDto name(String name) {
    
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


  public OrganizationFinancialTransactionsDto instrumentId(UUID instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * Get instrumentId
   * @return instrumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(UUID instrumentId) {
    this.instrumentId = instrumentId;
  }


  public OrganizationFinancialTransactionsDto transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public OrganizationFinancialTransactionsDto quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrganizationFinancialTransactionsDto averagePrice(Double averagePrice) {
    
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * Get averagePrice
   * @return averagePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAveragePrice() {
    return averagePrice;
  }


  public void setAveragePrice(Double averagePrice) {
    this.averagePrice = averagePrice;
  }


  public OrganizationFinancialTransactionsDto currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFinancialTransactionsDto organizationFinancialTransactionsDto = (OrganizationFinancialTransactionsDto) o;
    return Objects.equals(this.id, organizationFinancialTransactionsDto.id) &&
        Objects.equals(this.accountId, organizationFinancialTransactionsDto.accountId) &&
        Objects.equals(this.name, organizationFinancialTransactionsDto.name) &&
        Objects.equals(this.instrumentId, organizationFinancialTransactionsDto.instrumentId) &&
        Objects.equals(this.transactionType, organizationFinancialTransactionsDto.transactionType) &&
        Objects.equals(this.quantity, organizationFinancialTransactionsDto.quantity) &&
        Objects.equals(this.averagePrice, organizationFinancialTransactionsDto.averagePrice) &&
        Objects.equals(this.currency, organizationFinancialTransactionsDto.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, name, instrumentId, transactionType, quantity, averagePrice, currency);
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
    sb.append("class OrganizationFinancialTransactionsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("name");
    openapiFields.add("instrumentId");
    openapiFields.add("transactionType");
    openapiFields.add("quantity");
    openapiFields.add("averagePrice");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationFinancialTransactionsDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrganizationFinancialTransactionsDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationFinancialTransactionsDto is not found in the empty JSON string", OrganizationFinancialTransactionsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrganizationFinancialTransactionsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationFinancialTransactionsDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("instrumentId") != null && !jsonObj.get("instrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentId").toString()));
      }
      if (jsonObj.get("transactionType") != null && !jsonObj.get("transactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionType").toString()));
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationFinancialTransactionsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationFinancialTransactionsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationFinancialTransactionsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationFinancialTransactionsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationFinancialTransactionsDto>() {
           @Override
           public void write(JsonWriter out, OrganizationFinancialTransactionsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationFinancialTransactionsDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationFinancialTransactionsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationFinancialTransactionsDto
  * @throws IOException if the JSON string is invalid with respect to OrganizationFinancialTransactionsDto
  */
  public static OrganizationFinancialTransactionsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationFinancialTransactionsDto.class);
  }

 /**
  * Convert an instance of OrganizationFinancialTransactionsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

