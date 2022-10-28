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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

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
 * CreditCardSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T10:37:22.081217108Z[Etc/UTC]")
public class CreditCardSummary {
  public static final String SERIALIZED_NAME_CREDIT_CARD_ID = "creditCardId";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD_ID)
  private UUID creditCardId;

  public static final String SERIALIZED_NAME_CURRENT_DUE = "currentDue";
  @SerializedName(SERIALIZED_NAME_CURRENT_DUE)
  private Double currentDue;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_DATE = "lastStatementDate";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_DATE)
  private OffsetDateTime lastStatementDate;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_PREVIOUS_DUE_AMOUNT = "previousDueAmount";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_DUE_AMOUNT)
  private Double previousDueAmount;

  public static final String SERIALIZED_NAME_TOTAL_DUE_AMOUNT = "totalDueAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DUE_AMOUNT)
  private Double totalDueAmount;

  public static final String SERIALIZED_NAME_MIN_DUE_AMOUNT = "minDueAmount";
  @SerializedName(SERIALIZED_NAME_MIN_DUE_AMOUNT)
  private Double minDueAmount;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "creditLimit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private Double creditLimit;

  public static final String SERIALIZED_NAME_CASH_LIMIT = "cashLimit";
  @SerializedName(SERIALIZED_NAME_CASH_LIMIT)
  private Double cashLimit;

  public static final String SERIALIZED_NAME_AVAILABLE_CREDIT = "availableCredit";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CREDIT)
  private Double availableCredit;

  public static final String SERIALIZED_NAME_LOYALTY_POINTS = "loyaltyPoints";
  @SerializedName(SERIALIZED_NAME_LOYALTY_POINTS)
  private String loyaltyPoints;

  public static final String SERIALIZED_NAME_FINANCE_CHARGES = "financeCharges";
  @SerializedName(SERIALIZED_NAME_FINANCE_CHARGES)
  private Double financeCharges;

  public CreditCardSummary() {
  }

  public CreditCardSummary creditCardId(UUID creditCardId) {
    
    this.creditCardId = creditCardId;
    return this;
  }

   /**
   * Get creditCardId
   * @return creditCardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getCreditCardId() {
    return creditCardId;
  }


  public void setCreditCardId(UUID creditCardId) {
    this.creditCardId = creditCardId;
  }


  public CreditCardSummary currentDue(Double currentDue) {
    
    this.currentDue = currentDue;
    return this;
  }

   /**
   * Get currentDue
   * @return currentDue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCurrentDue() {
    return currentDue;
  }


  public void setCurrentDue(Double currentDue) {
    this.currentDue = currentDue;
  }


  public CreditCardSummary lastStatementDate(OffsetDateTime lastStatementDate) {
    
    this.lastStatementDate = lastStatementDate;
    return this;
  }

   /**
   * Get lastStatementDate
   * @return lastStatementDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getLastStatementDate() {
    return lastStatementDate;
  }


  public void setLastStatementDate(OffsetDateTime lastStatementDate) {
    this.lastStatementDate = lastStatementDate;
  }


  public CreditCardSummary dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public CreditCardSummary previousDueAmount(Double previousDueAmount) {
    
    this.previousDueAmount = previousDueAmount;
    return this;
  }

   /**
   * Get previousDueAmount
   * @return previousDueAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getPreviousDueAmount() {
    return previousDueAmount;
  }


  public void setPreviousDueAmount(Double previousDueAmount) {
    this.previousDueAmount = previousDueAmount;
  }


  public CreditCardSummary totalDueAmount(Double totalDueAmount) {
    
    this.totalDueAmount = totalDueAmount;
    return this;
  }

   /**
   * Get totalDueAmount
   * @return totalDueAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getTotalDueAmount() {
    return totalDueAmount;
  }


  public void setTotalDueAmount(Double totalDueAmount) {
    this.totalDueAmount = totalDueAmount;
  }


  public CreditCardSummary minDueAmount(Double minDueAmount) {
    
    this.minDueAmount = minDueAmount;
    return this;
  }

   /**
   * Get minDueAmount
   * @return minDueAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMinDueAmount() {
    return minDueAmount;
  }


  public void setMinDueAmount(Double minDueAmount) {
    this.minDueAmount = minDueAmount;
  }


  public CreditCardSummary creditLimit(Double creditLimit) {
    
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCreditLimit() {
    return creditLimit;
  }


  public void setCreditLimit(Double creditLimit) {
    this.creditLimit = creditLimit;
  }


  public CreditCardSummary cashLimit(Double cashLimit) {
    
    this.cashLimit = cashLimit;
    return this;
  }

   /**
   * Get cashLimit
   * @return cashLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCashLimit() {
    return cashLimit;
  }


  public void setCashLimit(Double cashLimit) {
    this.cashLimit = cashLimit;
  }


  public CreditCardSummary availableCredit(Double availableCredit) {
    
    this.availableCredit = availableCredit;
    return this;
  }

   /**
   * Get availableCredit
   * @return availableCredit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getAvailableCredit() {
    return availableCredit;
  }


  public void setAvailableCredit(Double availableCredit) {
    this.availableCredit = availableCredit;
  }


  public CreditCardSummary loyaltyPoints(String loyaltyPoints) {
    
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

   /**
   * Get loyaltyPoints
   * @return loyaltyPoints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLoyaltyPoints() {
    return loyaltyPoints;
  }


  public void setLoyaltyPoints(String loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }


  public CreditCardSummary financeCharges(Double financeCharges) {
    
    this.financeCharges = financeCharges;
    return this;
  }

   /**
   * Get financeCharges
   * @return financeCharges
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getFinanceCharges() {
    return financeCharges;
  }


  public void setFinanceCharges(Double financeCharges) {
    this.financeCharges = financeCharges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardSummary creditCardSummary = (CreditCardSummary) o;
    return Objects.equals(this.creditCardId, creditCardSummary.creditCardId) &&
        Objects.equals(this.currentDue, creditCardSummary.currentDue) &&
        Objects.equals(this.lastStatementDate, creditCardSummary.lastStatementDate) &&
        Objects.equals(this.dueDate, creditCardSummary.dueDate) &&
        Objects.equals(this.previousDueAmount, creditCardSummary.previousDueAmount) &&
        Objects.equals(this.totalDueAmount, creditCardSummary.totalDueAmount) &&
        Objects.equals(this.minDueAmount, creditCardSummary.minDueAmount) &&
        Objects.equals(this.creditLimit, creditCardSummary.creditLimit) &&
        Objects.equals(this.cashLimit, creditCardSummary.cashLimit) &&
        Objects.equals(this.availableCredit, creditCardSummary.availableCredit) &&
        Objects.equals(this.loyaltyPoints, creditCardSummary.loyaltyPoints) &&
        Objects.equals(this.financeCharges, creditCardSummary.financeCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardId, currentDue, lastStatementDate, dueDate, previousDueAmount, totalDueAmount, minDueAmount, creditLimit, cashLimit, availableCredit, loyaltyPoints, financeCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardSummary {\n");
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    currentDue: ").append(toIndentedString(currentDue)).append("\n");
    sb.append("    lastStatementDate: ").append(toIndentedString(lastStatementDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    previousDueAmount: ").append(toIndentedString(previousDueAmount)).append("\n");
    sb.append("    totalDueAmount: ").append(toIndentedString(totalDueAmount)).append("\n");
    sb.append("    minDueAmount: ").append(toIndentedString(minDueAmount)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    cashLimit: ").append(toIndentedString(cashLimit)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
    sb.append("    financeCharges: ").append(toIndentedString(financeCharges)).append("\n");
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
    openapiFields.add("creditCardId");
    openapiFields.add("currentDue");
    openapiFields.add("lastStatementDate");
    openapiFields.add("dueDate");
    openapiFields.add("previousDueAmount");
    openapiFields.add("totalDueAmount");
    openapiFields.add("minDueAmount");
    openapiFields.add("creditLimit");
    openapiFields.add("cashLimit");
    openapiFields.add("availableCredit");
    openapiFields.add("loyaltyPoints");
    openapiFields.add("financeCharges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creditCardId");
    openapiRequiredFields.add("currentDue");
    openapiRequiredFields.add("lastStatementDate");
    openapiRequiredFields.add("dueDate");
    openapiRequiredFields.add("previousDueAmount");
    openapiRequiredFields.add("totalDueAmount");
    openapiRequiredFields.add("minDueAmount");
    openapiRequiredFields.add("creditLimit");
    openapiRequiredFields.add("cashLimit");
    openapiRequiredFields.add("availableCredit");
    openapiRequiredFields.add("loyaltyPoints");
    openapiRequiredFields.add("financeCharges");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditCardSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreditCardSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditCardSummary is not found in the empty JSON string", CreditCardSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditCardSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditCardSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditCardSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("creditCardId") != null && !jsonObj.get("creditCardId").isJsonNull()) && !jsonObj.get("creditCardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creditCardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creditCardId").toString()));
      }
      if ((jsonObj.get("loyaltyPoints") != null && !jsonObj.get("loyaltyPoints").isJsonNull()) && !jsonObj.get("loyaltyPoints").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loyaltyPoints` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loyaltyPoints").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditCardSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditCardSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditCardSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditCardSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditCardSummary>() {
           @Override
           public void write(JsonWriter out, CreditCardSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditCardSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditCardSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditCardSummary
  * @throws IOException if the JSON string is invalid with respect to CreditCardSummary
  */
  public static CreditCardSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditCardSummary.class);
  }

 /**
  * Convert an instance of CreditCardSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

