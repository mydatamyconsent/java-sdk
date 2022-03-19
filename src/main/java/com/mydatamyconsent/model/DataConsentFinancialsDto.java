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
import com.mydatamyconsent.model.DataConsentRequestedFinancialAccount;
import com.mydatamyconsent.model.Financial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DataConsentFinancialsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-19T10:34:47.251757659Z[Etc/UTC]")
public class DataConsentFinancialsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FINANCIALS = "financials";
  @SerializedName(SERIALIZED_NAME_FINANCIALS)
  private List<Financial> financials = null;

  public static final String SERIALIZED_NAME_APPROVED_FINANCIALS = "approvedFinancials";
  @SerializedName(SERIALIZED_NAME_APPROVED_FINANCIALS)
  private List<DataConsentRequestedFinancialAccount> approvedFinancials = null;

  public DataConsentFinancialsDto() { 
  }

  public DataConsentFinancialsDto id(UUID id) {
    
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


  public DataConsentFinancialsDto financials(List<Financial> financials) {
    
    this.financials = financials;
    return this;
  }

  public DataConsentFinancialsDto addFinancialsItem(Financial financialsItem) {
    if (this.financials == null) {
      this.financials = new ArrayList<Financial>();
    }
    this.financials.add(financialsItem);
    return this;
  }

   /**
   * Get financials
   * @return financials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Financial> getFinancials() {
    return financials;
  }


  public void setFinancials(List<Financial> financials) {
    this.financials = financials;
  }


  public DataConsentFinancialsDto approvedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    
    this.approvedFinancials = approvedFinancials;
    return this;
  }

  public DataConsentFinancialsDto addApprovedFinancialsItem(DataConsentRequestedFinancialAccount approvedFinancialsItem) {
    if (this.approvedFinancials == null) {
      this.approvedFinancials = new ArrayList<DataConsentRequestedFinancialAccount>();
    }
    this.approvedFinancials.add(approvedFinancialsItem);
    return this;
  }

   /**
   * Get approvedFinancials
   * @return approvedFinancials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedFinancialAccount> getApprovedFinancials() {
    return approvedFinancials;
  }


  public void setApprovedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    this.approvedFinancials = approvedFinancials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentFinancialsDto dataConsentFinancialsDto = (DataConsentFinancialsDto) o;
    return Objects.equals(this.id, dataConsentFinancialsDto.id) &&
        Objects.equals(this.financials, dataConsentFinancialsDto.financials) &&
        Objects.equals(this.approvedFinancials, dataConsentFinancialsDto.approvedFinancials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, financials, approvedFinancials);
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
    sb.append("class DataConsentFinancialsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    financials: ").append(toIndentedString(financials)).append("\n");
    sb.append("    approvedFinancials: ").append(toIndentedString(approvedFinancials)).append("\n");
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

}

