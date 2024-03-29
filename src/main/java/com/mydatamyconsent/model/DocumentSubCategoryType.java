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
 * Gets or Sets DocumentSubCategoryType
 */
@JsonAdapter(DocumentSubCategoryType.Adapter.class)
public enum DocumentSubCategoryType {
  
  IDENTITY("Identity"),
  
  PROPERTY("Property"),
  
  VEHICLE("Vehicle"),
  
  ADMITANDIDCARDS("AdmitAndIdCards"),
  
  MARKSHEETS("Marksheets"),
  
  TRANSCRIPTS("Transcripts"),
  
  CERTIFICATES("Certificates"),
  
  PRESCRIPTIONS("Prescriptions"),
  
  MEDICALREPORTS("MedicalReports"),
  
  DISCHARGESUMMARY("DischargeSummary"),
  
  ACCOUNTANDCERTIFICATES("AccountAndCertificates"),
  
  BILLSANDINVOICES("BillsAndInvoices"),
  
  INSURANCE("Insurance"),
  
  RECEIPTSANDSUBSCRIPTIONS("ReceiptsAndSubscriptions"),
  
  TAXES("Taxes"),
  
  CORPORATES("Corporates"),
  
  COMPETITIONS("Competitions"),
  
  INTELLECTUALPROPERTIES("IntellectualProperties"),
  
  OTHERS("Others"),
  
  APPLICATIONSANDCERTIFICATES("ApplicationsAndCertificates"),
  
  LICENSES("Licenses"),
  
  ORGANIZATIONIDS("OrganizationIds"),
  
  PERMITS("Permits"),
  
  LEGAL("Legal");

  private String value;

  DocumentSubCategoryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentSubCategoryType fromValue(String value) {
    for (DocumentSubCategoryType b : DocumentSubCategoryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentSubCategoryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentSubCategoryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentSubCategoryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentSubCategoryType.fromValue(value);
    }
  }
}

