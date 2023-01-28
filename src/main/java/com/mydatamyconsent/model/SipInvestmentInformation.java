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
 * SipInvestmentInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-28T10:34:01.343102726Z[Etc/UTC]")
public class SipInvestmentInformation {
  public static final String SERIALIZED_NAME_INSTALMENT_AMOUNT = "instalment_amount";
  @SerializedName(SERIALIZED_NAME_INSTALMENT_AMOUNT)
  private Double instalmentAmount;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private String frequency;

  public static final String SERIALIZED_NAME_COMPLETED_INSTALMENTS = "completed_instalments";
  @SerializedName(SERIALIZED_NAME_COMPLETED_INSTALMENTS)
  private Double completedInstalments;

  public static final String SERIALIZED_NAME_INVESTMENT_VALUE = "investment_value";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_VALUE)
  private Double investmentValue;

  public static final String SERIALIZED_NAME_LAST_INSTALMENT_DATE = "last_instalment_date";
  @SerializedName(SERIALIZED_NAME_LAST_INSTALMENT_DATE)
  private OffsetDateTime lastInstalmentDate;

  public static final String SERIALIZED_NAME_NEXT_INSTALMENT_DATE = "next_instalment_date";
  @SerializedName(SERIALIZED_NAME_NEXT_INSTALMENT_DATE)
  private OffsetDateTime nextInstalmentDate;

  public SipInvestmentInformation() {
  }

  public SipInvestmentInformation instalmentAmount(Double instalmentAmount) {
    
    this.instalmentAmount = instalmentAmount;
    return this;
  }

   /**
   * Get instalmentAmount
   * @return instalmentAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInstalmentAmount() {
    return instalmentAmount;
  }


  public void setInstalmentAmount(Double instalmentAmount) {
    this.instalmentAmount = instalmentAmount;
  }


  public SipInvestmentInformation frequency(String frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFrequency() {
    return frequency;
  }


  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public SipInvestmentInformation completedInstalments(Double completedInstalments) {
    
    this.completedInstalments = completedInstalments;
    return this;
  }

   /**
   * Get completedInstalments
   * @return completedInstalments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCompletedInstalments() {
    return completedInstalments;
  }


  public void setCompletedInstalments(Double completedInstalments) {
    this.completedInstalments = completedInstalments;
  }


  public SipInvestmentInformation investmentValue(Double investmentValue) {
    
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


  public SipInvestmentInformation lastInstalmentDate(OffsetDateTime lastInstalmentDate) {
    
    this.lastInstalmentDate = lastInstalmentDate;
    return this;
  }

   /**
   * Get lastInstalmentDate
   * @return lastInstalmentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastInstalmentDate() {
    return lastInstalmentDate;
  }


  public void setLastInstalmentDate(OffsetDateTime lastInstalmentDate) {
    this.lastInstalmentDate = lastInstalmentDate;
  }


  public SipInvestmentInformation nextInstalmentDate(OffsetDateTime nextInstalmentDate) {
    
    this.nextInstalmentDate = nextInstalmentDate;
    return this;
  }

   /**
   * Get nextInstalmentDate
   * @return nextInstalmentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextInstalmentDate() {
    return nextInstalmentDate;
  }


  public void setNextInstalmentDate(OffsetDateTime nextInstalmentDate) {
    this.nextInstalmentDate = nextInstalmentDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipInvestmentInformation sipInvestmentInformation = (SipInvestmentInformation) o;
    return Objects.equals(this.instalmentAmount, sipInvestmentInformation.instalmentAmount) &&
        Objects.equals(this.frequency, sipInvestmentInformation.frequency) &&
        Objects.equals(this.completedInstalments, sipInvestmentInformation.completedInstalments) &&
        Objects.equals(this.investmentValue, sipInvestmentInformation.investmentValue) &&
        Objects.equals(this.lastInstalmentDate, sipInvestmentInformation.lastInstalmentDate) &&
        Objects.equals(this.nextInstalmentDate, sipInvestmentInformation.nextInstalmentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instalmentAmount, frequency, completedInstalments, investmentValue, lastInstalmentDate, nextInstalmentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipInvestmentInformation {\n");
    sb.append("    instalmentAmount: ").append(toIndentedString(instalmentAmount)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    completedInstalments: ").append(toIndentedString(completedInstalments)).append("\n");
    sb.append("    investmentValue: ").append(toIndentedString(investmentValue)).append("\n");
    sb.append("    lastInstalmentDate: ").append(toIndentedString(lastInstalmentDate)).append("\n");
    sb.append("    nextInstalmentDate: ").append(toIndentedString(nextInstalmentDate)).append("\n");
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
    openapiFields.add("instalment_amount");
    openapiFields.add("frequency");
    openapiFields.add("completed_instalments");
    openapiFields.add("investment_value");
    openapiFields.add("last_instalment_date");
    openapiFields.add("next_instalment_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instalment_amount");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("completed_instalments");
    openapiRequiredFields.add("investment_value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SipInvestmentInformation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SipInvestmentInformation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SipInvestmentInformation is not found in the empty JSON string", SipInvestmentInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SipInvestmentInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SipInvestmentInformation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SipInvestmentInformation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SipInvestmentInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SipInvestmentInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SipInvestmentInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SipInvestmentInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<SipInvestmentInformation>() {
           @Override
           public void write(JsonWriter out, SipInvestmentInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SipInvestmentInformation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SipInvestmentInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SipInvestmentInformation
  * @throws IOException if the JSON string is invalid with respect to SipInvestmentInformation
  */
  public static SipInvestmentInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SipInvestmentInformation.class);
  }

 /**
  * Convert an instance of SipInvestmentInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

