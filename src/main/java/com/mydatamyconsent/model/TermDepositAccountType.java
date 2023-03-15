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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TermDepositAccountType
 */
@JsonAdapter(TermDepositAccountType.Adapter.class)
public enum TermDepositAccountType {
  
  FIXED("Fixed"),
  
  SWEEP("Sweep"),
  
  RECURRING("Recurring"),
  
  SWEEP1("Sweep1"),
  
  FLEXIBLE("Flexible"),
  
  TAXSAVING("TaxSaving"),
  
  FCNR("Fcnr"),
  
  OTHERS("Others");

  private String value;

  TermDepositAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TermDepositAccountType fromValue(String value) {
    for (TermDepositAccountType b : TermDepositAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TermDepositAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TermDepositAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TermDepositAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TermDepositAccountType.fromValue(value);
    }
  }
}

