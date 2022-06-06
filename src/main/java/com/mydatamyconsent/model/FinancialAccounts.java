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
import com.mydatamyconsent.model.FinancialAccountDetailsRequired;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * FinancialAccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-06T10:37:20.042343723Z[Etc/UTC]")
public class FinancialAccounts {
  public static final String SERIALIZED_NAME_DRN = "drn";
  @SerializedName(SERIALIZED_NAME_DRN)
  private String drn;

  public static final String SERIALIZED_NAME_REQUIRED_DETAILS = "required_details";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DETAILS)
  private List<FinancialAccountDetailsRequired> requiredDetails = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public FinancialAccounts() { 
  }

  public FinancialAccounts drn(String drn) {
    
    this.drn = drn;
    return this;
  }

   /**
   * Get drn
   * @return drn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDrn() {
    return drn;
  }


  public void setDrn(String drn) {
    this.drn = drn;
  }


  public FinancialAccounts requiredDetails(List<FinancialAccountDetailsRequired> requiredDetails) {
    
    this.requiredDetails = requiredDetails;
    return this;
  }

  public FinancialAccounts addRequiredDetailsItem(FinancialAccountDetailsRequired requiredDetailsItem) {
    if (this.requiredDetails == null) {
      this.requiredDetails = new ArrayList<FinancialAccountDetailsRequired>();
    }
    this.requiredDetails.add(requiredDetailsItem);
    return this;
  }

   /**
   * Get requiredDetails
   * @return requiredDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FinancialAccountDetailsRequired> getRequiredDetails() {
    return requiredDetails;
  }


  public void setRequiredDetails(List<FinancialAccountDetailsRequired> requiredDetails) {
    this.requiredDetails = requiredDetails;
  }


  public FinancialAccounts startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public FinancialAccounts endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccounts financialAccounts = (FinancialAccounts) o;
    return Objects.equals(this.drn, financialAccounts.drn) &&
        Objects.equals(this.requiredDetails, financialAccounts.requiredDetails) &&
        Objects.equals(this.startDate, financialAccounts.startDate) &&
        Objects.equals(this.endDate, financialAccounts.endDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(drn, requiredDetails, startDate, endDate);
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
    sb.append("class FinancialAccounts {\n");
    sb.append("    drn: ").append(toIndentedString(drn)).append("\n");
    sb.append("    requiredDetails: ").append(toIndentedString(requiredDetails)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

