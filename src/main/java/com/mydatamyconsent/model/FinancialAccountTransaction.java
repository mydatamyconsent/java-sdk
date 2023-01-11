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
import com.mydatamyconsent.model.FinancialAccountTransactionEquityTransaction;
import com.mydatamyconsent.model.FinancialAccountTransactionMutualFundTransaction;
import com.mydatamyconsent.model.FinancialAccountTransactionSipTransaction;
import com.mydatamyconsent.model.MutualFundFundType;
import com.mydatamyconsent.model.MutualFundHoldingMode;
import com.mydatamyconsent.model.MutualFundSchemeCategory;
import com.mydatamyconsent.model.MutualFundSchemeOption;
import com.mydatamyconsent.model.MutualFundSchemePlan;
import com.mydatamyconsent.model.MutualFundSchemeType;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T10:40:09.470253337Z[Etc/UTC]")
public class FinancialAccountTransaction extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FinancialAccountTransaction.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FinancialAccountTransaction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FinancialAccountTransaction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FinancialAccountTransactionEquityTransaction> adapterFinancialAccountTransactionEquityTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTransactionEquityTransaction.class));
            final TypeAdapter<FinancialAccountTransactionMutualFundTransaction> adapterFinancialAccountTransactionMutualFundTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTransactionMutualFundTransaction.class));
            final TypeAdapter<FinancialAccountTransactionSipTransaction> adapterFinancialAccountTransactionSipTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTransactionSipTransaction.class));

            return (TypeAdapter<T>) new TypeAdapter<FinancialAccountTransaction>() {
                @Override
                public void write(JsonWriter out, FinancialAccountTransaction value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountTransactionEquityTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountTransactionEquityTransaction) {
                        JsonObject obj = adapterFinancialAccountTransactionEquityTransaction.toJsonTree((FinancialAccountTransactionEquityTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountTransactionMutualFundTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountTransactionMutualFundTransaction) {
                        JsonObject obj = adapterFinancialAccountTransactionMutualFundTransaction.toJsonTree((FinancialAccountTransactionMutualFundTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountTransactionSipTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountTransactionSipTransaction) {
                        JsonObject obj = adapterFinancialAccountTransactionSipTransaction.toJsonTree((FinancialAccountTransactionSipTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction");
                }

                @Override
                public FinancialAccountTransaction read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize FinancialAccountTransactionEquityTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountTransactionEquityTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountTransactionEquityTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountTransactionEquityTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountTransactionEquityTransaction'", e);
                    }

                    // deserialize FinancialAccountTransactionMutualFundTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountTransactionMutualFundTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountTransactionMutualFundTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountTransactionMutualFundTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountTransactionMutualFundTransaction'", e);
                    }

                    // deserialize FinancialAccountTransactionSipTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountTransactionSipTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountTransactionSipTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountTransactionSipTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountTransactionSipTransaction'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for FinancialAccountTransaction: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FinancialAccountTransaction() {
        super("anyOf", Boolean.FALSE);
    }

    public FinancialAccountTransaction(FinancialAccountTransactionEquityTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccountTransaction(FinancialAccountTransactionMutualFundTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccountTransaction(FinancialAccountTransactionSipTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FinancialAccountTransactionEquityTransaction", new GenericType<FinancialAccountTransactionEquityTransaction>() {
        });
        schemas.put("FinancialAccountTransactionMutualFundTransaction", new GenericType<FinancialAccountTransactionMutualFundTransaction>() {
        });
        schemas.put("FinancialAccountTransactionSipTransaction", new GenericType<FinancialAccountTransactionSipTransaction>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FinancialAccountTransaction.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FinancialAccountTransactionEquityTransaction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountTransactionMutualFundTransaction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountTransactionSipTransaction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction");
    }

    /**
     * Get the actual instance, which can be the following:
     * FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction
     *
     * @return The actual instance (FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountTransactionEquityTransaction`. If the actual instance is not `FinancialAccountTransactionEquityTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountTransactionEquityTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountTransactionEquityTransaction`
     */
    public FinancialAccountTransactionEquityTransaction getFinancialAccountTransactionEquityTransaction() throws ClassCastException {
        return (FinancialAccountTransactionEquityTransaction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountTransactionMutualFundTransaction`. If the actual instance is not `FinancialAccountTransactionMutualFundTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountTransactionMutualFundTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountTransactionMutualFundTransaction`
     */
    public FinancialAccountTransactionMutualFundTransaction getFinancialAccountTransactionMutualFundTransaction() throws ClassCastException {
        return (FinancialAccountTransactionMutualFundTransaction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountTransactionSipTransaction`. If the actual instance is not `FinancialAccountTransactionSipTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountTransactionSipTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountTransactionSipTransaction`
     */
    public FinancialAccountTransactionSipTransaction getFinancialAccountTransactionSipTransaction() throws ClassCastException {
        return (FinancialAccountTransactionSipTransaction)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with FinancialAccountTransactionEquityTransaction
    try {
      FinancialAccountTransactionEquityTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountTransactionMutualFundTransaction
    try {
      FinancialAccountTransactionMutualFundTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountTransactionSipTransaction
    try {
      FinancialAccountTransactionSipTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for FinancialAccountTransaction with anyOf schemas: FinancialAccountTransactionEquityTransaction, FinancialAccountTransactionMutualFundTransaction, FinancialAccountTransactionSipTransaction. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of FinancialAccountTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountTransaction
  */
  public static FinancialAccountTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountTransaction.class);
  }

 /**
  * Convert an instance of FinancialAccountTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

