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
import com.mydatamyconsent.model.TermDepositAccountType;
import com.mydatamyconsent.model.TermDepositCompoundingFrequency;
import com.mydatamyconsent.model.TermDepositInterestComputation;
import com.mydatamyconsent.model.TermDepositInterestPayoutType;
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
 * TermDepositInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-24T10:34:50.607549009Z[Etc/UTC]")
public class TermDepositInformation {
  public static final String SERIALIZED_NAME_DEPOSIT_TYPE = "deposit_type";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_TYPE)
  private TermDepositAccountType depositType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_PRINCIPAL_AMOUNT = "principal_amount";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_AMOUNT)
  private Double principalAmount;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Float interestRate;

  public static final String SERIALIZED_NAME_INTEREST_PAYOUT = "interest_payout";
  @SerializedName(SERIALIZED_NAME_INTEREST_PAYOUT)
  private TermDepositInterestPayoutType interestPayout;

  public static final String SERIALIZED_NAME_INTEREST_COMPUTATION = "interest_computation";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPUTATION)
  private TermDepositInterestComputation interestComputation;

  public static final String SERIALIZED_NAME_COMPOUNDING_FREQUENCY = "compounding_frequency";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING_FREQUENCY)
  private TermDepositCompoundingFrequency compoundingFrequency;

  public static final String SERIALIZED_NAME_INTEREST_PERIODIC_PAYOUT_AMOUNT = "interest_periodic_payout_amount";
  @SerializedName(SERIALIZED_NAME_INTEREST_PERIODIC_PAYOUT_AMOUNT)
  private Double interestPeriodicPayoutAmount;

  public static final String SERIALIZED_NAME_INTEREST_ON_MATURITY = "interest_on_maturity";
  @SerializedName(SERIALIZED_NAME_INTEREST_ON_MATURITY)
  private Double interestOnMaturity;

  public static final String SERIALIZED_NAME_DEPOSIT_OPENING_DATE = "deposit_opening_date";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_OPENING_DATE)
  private OffsetDateTime depositOpeningDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturity_date";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_MATURITY_AMOUNT = "maturity_amount";
  @SerializedName(SERIALIZED_NAME_MATURITY_AMOUNT)
  private Double maturityAmount;

  public static final String SERIALIZED_NAME_TENURE_DAYS = "tenure_days";
  @SerializedName(SERIALIZED_NAME_TENURE_DAYS)
  private Integer tenureDays;

  public static final String SERIALIZED_NAME_TENURE_MONTHS = "tenure_months";
  @SerializedName(SERIALIZED_NAME_TENURE_MONTHS)
  private Integer tenureMonths;

  public static final String SERIALIZED_NAME_TENURE_YEARS = "tenure_years";
  @SerializedName(SERIALIZED_NAME_TENURE_YEARS)
  private Integer tenureYears;

  public TermDepositInformation() {
  }

  public TermDepositInformation depositType(TermDepositAccountType depositType) {
    
    this.depositType = depositType;
    return this;
  }

   /**
   * Get depositType
   * @return depositType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositAccountType getDepositType() {
    return depositType;
  }


  public void setDepositType(TermDepositAccountType depositType) {
    this.depositType = depositType;
  }


  public TermDepositInformation description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TermDepositInformation currencyCode(String currencyCode) {
    
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


  public TermDepositInformation principalAmount(Double principalAmount) {
    
    this.principalAmount = principalAmount;
    return this;
  }

   /**
   * Get principalAmount
   * @return principalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getPrincipalAmount() {
    return principalAmount;
  }


  public void setPrincipalAmount(Double principalAmount) {
    this.principalAmount = principalAmount;
  }


  public TermDepositInformation interestRate(Float interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Float interestRate) {
    this.interestRate = interestRate;
  }


  public TermDepositInformation interestPayout(TermDepositInterestPayoutType interestPayout) {
    
    this.interestPayout = interestPayout;
    return this;
  }

   /**
   * Get interestPayout
   * @return interestPayout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositInterestPayoutType getInterestPayout() {
    return interestPayout;
  }


  public void setInterestPayout(TermDepositInterestPayoutType interestPayout) {
    this.interestPayout = interestPayout;
  }


  public TermDepositInformation interestComputation(TermDepositInterestComputation interestComputation) {
    
    this.interestComputation = interestComputation;
    return this;
  }

   /**
   * Get interestComputation
   * @return interestComputation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositInterestComputation getInterestComputation() {
    return interestComputation;
  }


  public void setInterestComputation(TermDepositInterestComputation interestComputation) {
    this.interestComputation = interestComputation;
  }


  public TermDepositInformation compoundingFrequency(TermDepositCompoundingFrequency compoundingFrequency) {
    
    this.compoundingFrequency = compoundingFrequency;
    return this;
  }

   /**
   * Get compoundingFrequency
   * @return compoundingFrequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositCompoundingFrequency getCompoundingFrequency() {
    return compoundingFrequency;
  }


  public void setCompoundingFrequency(TermDepositCompoundingFrequency compoundingFrequency) {
    this.compoundingFrequency = compoundingFrequency;
  }


  public TermDepositInformation interestPeriodicPayoutAmount(Double interestPeriodicPayoutAmount) {
    
    this.interestPeriodicPayoutAmount = interestPeriodicPayoutAmount;
    return this;
  }

   /**
   * Get interestPeriodicPayoutAmount
   * @return interestPeriodicPayoutAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInterestPeriodicPayoutAmount() {
    return interestPeriodicPayoutAmount;
  }


  public void setInterestPeriodicPayoutAmount(Double interestPeriodicPayoutAmount) {
    this.interestPeriodicPayoutAmount = interestPeriodicPayoutAmount;
  }


  public TermDepositInformation interestOnMaturity(Double interestOnMaturity) {
    
    this.interestOnMaturity = interestOnMaturity;
    return this;
  }

   /**
   * Get interestOnMaturity
   * @return interestOnMaturity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInterestOnMaturity() {
    return interestOnMaturity;
  }


  public void setInterestOnMaturity(Double interestOnMaturity) {
    this.interestOnMaturity = interestOnMaturity;
  }


  public TermDepositInformation depositOpeningDate(OffsetDateTime depositOpeningDate) {
    
    this.depositOpeningDate = depositOpeningDate;
    return this;
  }

   /**
   * Get depositOpeningDate
   * @return depositOpeningDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getDepositOpeningDate() {
    return depositOpeningDate;
  }


  public void setDepositOpeningDate(OffsetDateTime depositOpeningDate) {
    this.depositOpeningDate = depositOpeningDate;
  }


  public TermDepositInformation maturityDate(OffsetDateTime maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }


  public TermDepositInformation maturityAmount(Double maturityAmount) {
    
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Get maturityAmount
   * @return maturityAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getMaturityAmount() {
    return maturityAmount;
  }


  public void setMaturityAmount(Double maturityAmount) {
    this.maturityAmount = maturityAmount;
  }


  public TermDepositInformation tenureDays(Integer tenureDays) {
    
    this.tenureDays = tenureDays;
    return this;
  }

   /**
   * Get tenureDays
   * @return tenureDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTenureDays() {
    return tenureDays;
  }


  public void setTenureDays(Integer tenureDays) {
    this.tenureDays = tenureDays;
  }


  public TermDepositInformation tenureMonths(Integer tenureMonths) {
    
    this.tenureMonths = tenureMonths;
    return this;
  }

   /**
   * Get tenureMonths
   * @return tenureMonths
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTenureMonths() {
    return tenureMonths;
  }


  public void setTenureMonths(Integer tenureMonths) {
    this.tenureMonths = tenureMonths;
  }


  public TermDepositInformation tenureYears(Integer tenureYears) {
    
    this.tenureYears = tenureYears;
    return this;
  }

   /**
   * Get tenureYears
   * @return tenureYears
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTenureYears() {
    return tenureYears;
  }


  public void setTenureYears(Integer tenureYears) {
    this.tenureYears = tenureYears;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermDepositInformation termDepositInformation = (TermDepositInformation) o;
    return Objects.equals(this.depositType, termDepositInformation.depositType) &&
        Objects.equals(this.description, termDepositInformation.description) &&
        Objects.equals(this.currencyCode, termDepositInformation.currencyCode) &&
        Objects.equals(this.principalAmount, termDepositInformation.principalAmount) &&
        Objects.equals(this.interestRate, termDepositInformation.interestRate) &&
        Objects.equals(this.interestPayout, termDepositInformation.interestPayout) &&
        Objects.equals(this.interestComputation, termDepositInformation.interestComputation) &&
        Objects.equals(this.compoundingFrequency, termDepositInformation.compoundingFrequency) &&
        Objects.equals(this.interestPeriodicPayoutAmount, termDepositInformation.interestPeriodicPayoutAmount) &&
        Objects.equals(this.interestOnMaturity, termDepositInformation.interestOnMaturity) &&
        Objects.equals(this.depositOpeningDate, termDepositInformation.depositOpeningDate) &&
        Objects.equals(this.maturityDate, termDepositInformation.maturityDate) &&
        Objects.equals(this.maturityAmount, termDepositInformation.maturityAmount) &&
        Objects.equals(this.tenureDays, termDepositInformation.tenureDays) &&
        Objects.equals(this.tenureMonths, termDepositInformation.tenureMonths) &&
        Objects.equals(this.tenureYears, termDepositInformation.tenureYears);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, description, currencyCode, principalAmount, interestRate, interestPayout, interestComputation, compoundingFrequency, interestPeriodicPayoutAmount, interestOnMaturity, depositOpeningDate, maturityDate, maturityAmount, tenureDays, tenureMonths, tenureYears);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermDepositInformation {\n");
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    principalAmount: ").append(toIndentedString(principalAmount)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    interestPayout: ").append(toIndentedString(interestPayout)).append("\n");
    sb.append("    interestComputation: ").append(toIndentedString(interestComputation)).append("\n");
    sb.append("    compoundingFrequency: ").append(toIndentedString(compoundingFrequency)).append("\n");
    sb.append("    interestPeriodicPayoutAmount: ").append(toIndentedString(interestPeriodicPayoutAmount)).append("\n");
    sb.append("    interestOnMaturity: ").append(toIndentedString(interestOnMaturity)).append("\n");
    sb.append("    depositOpeningDate: ").append(toIndentedString(depositOpeningDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    tenureDays: ").append(toIndentedString(tenureDays)).append("\n");
    sb.append("    tenureMonths: ").append(toIndentedString(tenureMonths)).append("\n");
    sb.append("    tenureYears: ").append(toIndentedString(tenureYears)).append("\n");
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
    openapiFields.add("deposit_type");
    openapiFields.add("description");
    openapiFields.add("currency_code");
    openapiFields.add("principal_amount");
    openapiFields.add("interest_rate");
    openapiFields.add("interest_payout");
    openapiFields.add("interest_computation");
    openapiFields.add("compounding_frequency");
    openapiFields.add("interest_periodic_payout_amount");
    openapiFields.add("interest_on_maturity");
    openapiFields.add("deposit_opening_date");
    openapiFields.add("maturity_date");
    openapiFields.add("maturity_amount");
    openapiFields.add("tenure_days");
    openapiFields.add("tenure_months");
    openapiFields.add("tenure_years");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deposit_type");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("principal_amount");
    openapiRequiredFields.add("interest_rate");
    openapiRequiredFields.add("interest_payout");
    openapiRequiredFields.add("interest_computation");
    openapiRequiredFields.add("compounding_frequency");
    openapiRequiredFields.add("interest_periodic_payout_amount");
    openapiRequiredFields.add("interest_on_maturity");
    openapiRequiredFields.add("deposit_opening_date");
    openapiRequiredFields.add("maturity_date");
    openapiRequiredFields.add("maturity_amount");
    openapiRequiredFields.add("tenure_days");
    openapiRequiredFields.add("tenure_months");
    openapiRequiredFields.add("tenure_years");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TermDepositInformation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TermDepositInformation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TermDepositInformation is not found in the empty JSON string", TermDepositInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TermDepositInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TermDepositInformation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TermDepositInformation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TermDepositInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TermDepositInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TermDepositInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TermDepositInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<TermDepositInformation>() {
           @Override
           public void write(JsonWriter out, TermDepositInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TermDepositInformation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TermDepositInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TermDepositInformation
  * @throws IOException if the JSON string is invalid with respect to TermDepositInformation
  */
  public static TermDepositInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TermDepositInformation.class);
  }

 /**
  * Convert an instance of TermDepositInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

