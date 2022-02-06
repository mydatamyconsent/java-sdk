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
import com.mydatamyconsent.model.OrganizationFinancialTransactionsDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationFinancialTransactionsDtoPaginatedList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-06T10:33:50.181500939Z[Etc/UTC]")
public class OrganizationFinancialTransactionsDtoPaginatedList {
  public static final String SERIALIZED_NAME_PAGE_INDEX = "pageIndex";
  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private Integer pageIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Long totalItems;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrganizationFinancialTransactionsDto> items = null;

  public OrganizationFinancialTransactionsDtoPaginatedList() { 
  }

  
  public OrganizationFinancialTransactionsDtoPaginatedList(
     Integer totalPages
  ) {
    this();
    this.totalPages = totalPages;
  }

  public OrganizationFinancialTransactionsDtoPaginatedList pageIndex(Integer pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageIndex() {
    return pageIndex;
  }


  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }


  public OrganizationFinancialTransactionsDtoPaginatedList pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPages() {
    return totalPages;
  }




  public OrganizationFinancialTransactionsDtoPaginatedList totalItems(Long totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }


  public OrganizationFinancialTransactionsDtoPaginatedList items(List<OrganizationFinancialTransactionsDto> items) {
    
    this.items = items;
    return this;
  }

  public OrganizationFinancialTransactionsDtoPaginatedList addItemsItem(OrganizationFinancialTransactionsDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<OrganizationFinancialTransactionsDto>();
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

  public List<OrganizationFinancialTransactionsDto> getItems() {
    return items;
  }


  public void setItems(List<OrganizationFinancialTransactionsDto> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFinancialTransactionsDtoPaginatedList organizationFinancialTransactionsDtoPaginatedList = (OrganizationFinancialTransactionsDtoPaginatedList) o;
    return Objects.equals(this.pageIndex, organizationFinancialTransactionsDtoPaginatedList.pageIndex) &&
        Objects.equals(this.pageSize, organizationFinancialTransactionsDtoPaginatedList.pageSize) &&
        Objects.equals(this.totalPages, organizationFinancialTransactionsDtoPaginatedList.totalPages) &&
        Objects.equals(this.totalItems, organizationFinancialTransactionsDtoPaginatedList.totalItems) &&
        Objects.equals(this.items, organizationFinancialTransactionsDtoPaginatedList.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIndex, pageSize, totalPages, totalItems, items);
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
    sb.append("class OrganizationFinancialTransactionsDtoPaginatedList {\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

