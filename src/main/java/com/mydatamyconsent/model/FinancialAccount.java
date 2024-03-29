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
import com.mydatamyconsent.model.FinancialAccountEquity;
import com.mydatamyconsent.model.FinancialAccountMutualFund;
import com.mydatamyconsent.model.FinancialAccountSip;
import com.mydatamyconsent.model.FinancialAccountTermDeposit;
import com.mydatamyconsent.model.Holder;
import com.mydatamyconsent.model.SipInvestmentInformation;
import com.mydatamyconsent.model.SipPlanInformation;
import com.mydatamyconsent.model.TermDepositAccountDetails;
import com.mydatamyconsent.model.TermDepositAccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.mydatamyconsent.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-26T10:38:51.740024692Z[Etc/UTC]")
public class FinancialAccount extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FinancialAccount.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FinancialAccount.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FinancialAccount' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FinancialAccountEquity> adapterFinancialAccountEquity = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountEquity.class));
            final TypeAdapter<FinancialAccountMutualFund> adapterFinancialAccountMutualFund = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountMutualFund.class));
            final TypeAdapter<FinancialAccountSip> adapterFinancialAccountSip = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountSip.class));
            final TypeAdapter<FinancialAccountTermDeposit> adapterFinancialAccountTermDeposit = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTermDeposit.class));

            return (TypeAdapter<T>) new TypeAdapter<FinancialAccount>() {
                @Override
                public void write(JsonWriter out, FinancialAccount value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountEquity`
                    if (value.getActualInstance() instanceof FinancialAccountEquity) {
                        JsonObject obj = adapterFinancialAccountEquity.toJsonTree((FinancialAccountEquity)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountMutualFund`
                    if (value.getActualInstance() instanceof FinancialAccountMutualFund) {
                        JsonObject obj = adapterFinancialAccountMutualFund.toJsonTree((FinancialAccountMutualFund)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountSip`
                    if (value.getActualInstance() instanceof FinancialAccountSip) {
                        JsonObject obj = adapterFinancialAccountSip.toJsonTree((FinancialAccountSip)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountTermDeposit`
                    if (value.getActualInstance() instanceof FinancialAccountTermDeposit) {
                        JsonObject obj = adapterFinancialAccountTermDeposit.toJsonTree((FinancialAccountTermDeposit)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit");
                }

                @Override
                public FinancialAccount read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize FinancialAccountEquity
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountEquity.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountEquity'");
                        FinancialAccount ret = new FinancialAccount();
                        ret.setActualInstance(adapterFinancialAccountEquity.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountEquity'", e);
                    }

                    // deserialize FinancialAccountMutualFund
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountMutualFund.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountMutualFund'");
                        FinancialAccount ret = new FinancialAccount();
                        ret.setActualInstance(adapterFinancialAccountMutualFund.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountMutualFund'", e);
                    }

                    // deserialize FinancialAccountSip
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountSip.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountSip'");
                        FinancialAccount ret = new FinancialAccount();
                        ret.setActualInstance(adapterFinancialAccountSip.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountSip'", e);
                    }

                    // deserialize FinancialAccountTermDeposit
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountTermDeposit.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountTermDeposit'");
                        FinancialAccount ret = new FinancialAccount();
                        ret.setActualInstance(adapterFinancialAccountTermDeposit.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountTermDeposit'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for FinancialAccount: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FinancialAccount() {
        super("anyOf", Boolean.FALSE);
    }

    public FinancialAccount(FinancialAccountEquity o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccount(FinancialAccountMutualFund o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccount(FinancialAccountSip o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccount(FinancialAccountTermDeposit o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FinancialAccountEquity", new GenericType<FinancialAccountEquity>() {
        });
        schemas.put("FinancialAccountMutualFund", new GenericType<FinancialAccountMutualFund>() {
        });
        schemas.put("FinancialAccountSip", new GenericType<FinancialAccountSip>() {
        });
        schemas.put("FinancialAccountTermDeposit", new GenericType<FinancialAccountTermDeposit>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FinancialAccount.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FinancialAccountEquity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountMutualFund) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountSip) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountTermDeposit) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit");
    }

    /**
     * Get the actual instance, which can be the following:
     * FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit
     *
     * @return The actual instance (FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountEquity`. If the actual instance is not `FinancialAccountEquity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountEquity`
     * @throws ClassCastException if the instance is not `FinancialAccountEquity`
     */
    public FinancialAccountEquity getFinancialAccountEquity() throws ClassCastException {
        return (FinancialAccountEquity)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountMutualFund`. If the actual instance is not `FinancialAccountMutualFund`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountMutualFund`
     * @throws ClassCastException if the instance is not `FinancialAccountMutualFund`
     */
    public FinancialAccountMutualFund getFinancialAccountMutualFund() throws ClassCastException {
        return (FinancialAccountMutualFund)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountSip`. If the actual instance is not `FinancialAccountSip`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountSip`
     * @throws ClassCastException if the instance is not `FinancialAccountSip`
     */
    public FinancialAccountSip getFinancialAccountSip() throws ClassCastException {
        return (FinancialAccountSip)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountTermDeposit`. If the actual instance is not `FinancialAccountTermDeposit`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountTermDeposit`
     * @throws ClassCastException if the instance is not `FinancialAccountTermDeposit`
     */
    public FinancialAccountTermDeposit getFinancialAccountTermDeposit() throws ClassCastException {
        return (FinancialAccountTermDeposit)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with FinancialAccountEquity
    try {
      FinancialAccountEquity.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountMutualFund
    try {
      FinancialAccountMutualFund.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountSip
    try {
      FinancialAccountSip.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountTermDeposit
    try {
      FinancialAccountTermDeposit.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for FinancialAccount with anyOf schemas: FinancialAccountEquity, FinancialAccountMutualFund, FinancialAccountSip, FinancialAccountTermDeposit. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of FinancialAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccount
  * @throws IOException if the JSON string is invalid with respect to FinancialAccount
  */
  public static FinancialAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccount.class);
  }

 /**
  * Convert an instance of FinancialAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

