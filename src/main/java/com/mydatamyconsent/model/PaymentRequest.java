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
import com.mydatamyconsent.model.BillPaymentOrderItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * PaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-13T10:37:48.248698692Z[Etc/UTC]")
public class PaymentRequest {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BillPaymentOrderItem> items = null;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_PAYMENT_URL = "paymentUrl";
  @SerializedName(SERIALIZED_NAME_PAYMENT_URL)
  private String paymentUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DUE_BY_UTC = "dueByUtc";
  @SerializedName(SERIALIZED_NAME_DUE_BY_UTC)
  private OffsetDateTime dueByUtc;

  public PaymentRequest() { 
  }

  public PaymentRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public PaymentRequest items(List<BillPaymentOrderItem> items) {
    
    this.items = items;
    return this;
  }

  public PaymentRequest addItemsItem(BillPaymentOrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BillPaymentOrderItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BillPaymentOrderItem> getItems() {
    return items;
  }


  public void setItems(List<BillPaymentOrderItem> items) {
    this.items = items;
  }


  public PaymentRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PaymentRequest paymentUrl(String paymentUrl) {
    
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * Get paymentUrl
   * @return paymentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentUrl() {
    return paymentUrl;
  }


  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }


  public PaymentRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentRequest dueByUtc(OffsetDateTime dueByUtc) {
    
    this.dueByUtc = dueByUtc;
    return this;
  }

   /**
   * Get dueByUtc
   * @return dueByUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDueByUtc() {
    return dueByUtc;
  }


  public void setDueByUtc(OffsetDateTime dueByUtc) {
    this.dueByUtc = dueByUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.identifier, paymentRequest.identifier) &&
        Objects.equals(this.items, paymentRequest.items) &&
        Objects.equals(this.currencyCode, paymentRequest.currencyCode) &&
        Objects.equals(this.paymentUrl, paymentRequest.paymentUrl) &&
        Objects.equals(this.description, paymentRequest.description) &&
        Objects.equals(this.dueByUtc, paymentRequest.dueByUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, items, currencyCode, paymentUrl, description, dueByUtc);
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
    sb.append("class PaymentRequest {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueByUtc: ").append(toIndentedString(dueByUtc)).append("\n");
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

