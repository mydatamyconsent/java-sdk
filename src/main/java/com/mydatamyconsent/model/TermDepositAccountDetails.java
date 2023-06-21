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
import com.mydatamyconsent.model.TermDepositBankInformation;
import com.mydatamyconsent.model.TermDepositInformation;
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
 * TermDepositAccountDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T10:34:43.269734732Z[Etc/UTC]")
public class TermDepositAccountDetails {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private TermDepositInformation info;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private Holder holder;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private TermDepositBankInformation bank;

  public TermDepositAccountDetails() {
  }

  public TermDepositAccountDetails info(TermDepositInformation info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositInformation getInfo() {
    return info;
  }


  public void setInfo(TermDepositInformation info) {
    this.info = info;
  }


  public TermDepositAccountDetails holder(Holder holder) {
    
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


  public TermDepositAccountDetails bank(TermDepositBankInformation bank) {
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositBankInformation getBank() {
    return bank;
  }


  public void setBank(TermDepositBankInformation bank) {
    this.bank = bank;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermDepositAccountDetails termDepositAccountDetails = (TermDepositAccountDetails) o;
    return Objects.equals(this.info, termDepositAccountDetails.info) &&
        Objects.equals(this.holder, termDepositAccountDetails.holder) &&
        Objects.equals(this.bank, termDepositAccountDetails.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, holder, bank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermDepositAccountDetails {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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
    openapiFields.add("info");
    openapiFields.add("holder");
    openapiFields.add("bank");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("info");
    openapiRequiredFields.add("holder");
    openapiRequiredFields.add("bank");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TermDepositAccountDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TermDepositAccountDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TermDepositAccountDetails is not found in the empty JSON string", TermDepositAccountDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TermDepositAccountDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TermDepositAccountDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TermDepositAccountDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `info`
      if (jsonObj.get("info") != null && !jsonObj.get("info").isJsonNull()) {
        TermDepositInformation.validateJsonObject(jsonObj.getAsJsonObject("info"));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        Holder.validateJsonObject(jsonObj.getAsJsonObject("holder"));
      }
      // validate the optional field `bank`
      if (jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) {
        TermDepositBankInformation.validateJsonObject(jsonObj.getAsJsonObject("bank"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TermDepositAccountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TermDepositAccountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TermDepositAccountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TermDepositAccountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TermDepositAccountDetails>() {
           @Override
           public void write(JsonWriter out, TermDepositAccountDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TermDepositAccountDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TermDepositAccountDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TermDepositAccountDetails
  * @throws IOException if the JSON string is invalid with respect to TermDepositAccountDetails
  */
  public static TermDepositAccountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TermDepositAccountDetails.class);
  }

 /**
  * Convert an instance of TermDepositAccountDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

