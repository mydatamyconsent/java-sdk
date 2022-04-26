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
import com.mydatamyconsent.model.UriDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PushUriRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-26T10:37:12.975215508Z[Etc/UTC]")
public class PushUriRequest {
  public static final String SERIALIZED_NAME_URI_DETAILS = "uriDetails";
  @SerializedName(SERIALIZED_NAME_URI_DETAILS)
  private UriDetails uriDetails;

  public static final String SERIALIZED_NAME_NS2 = "ns2";
  @SerializedName(SERIALIZED_NAME_NS2)
  private String ns2;

  public static final String SERIALIZED_NAME_VER = "ver";
  @SerializedName(SERIALIZED_NAME_VER)
  private String ver;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public static final String SERIALIZED_NAME_TXN = "txn";
  @SerializedName(SERIALIZED_NAME_TXN)
  private String txn;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_KEYHASH = "keyhash";
  @SerializedName(SERIALIZED_NAME_KEYHASH)
  private String keyhash;

  public PushUriRequest() { 
  }

  public PushUriRequest uriDetails(UriDetails uriDetails) {
    
    this.uriDetails = uriDetails;
    return this;
  }

   /**
   * Get uriDetails
   * @return uriDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UriDetails getUriDetails() {
    return uriDetails;
  }


  public void setUriDetails(UriDetails uriDetails) {
    this.uriDetails = uriDetails;
  }


  public PushUriRequest ns2(String ns2) {
    
    this.ns2 = ns2;
    return this;
  }

   /**
   * Get ns2
   * @return ns2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNs2() {
    return ns2;
  }


  public void setNs2(String ns2) {
    this.ns2 = ns2;
  }


  public PushUriRequest ver(String ver) {
    
    this.ver = ver;
    return this;
  }

   /**
   * Get ver
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVer() {
    return ver;
  }


  public void setVer(String ver) {
    this.ver = ver;
  }


  public PushUriRequest ts(String ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTs() {
    return ts;
  }


  public void setTs(String ts) {
    this.ts = ts;
  }


  public PushUriRequest txn(String txn) {
    
    this.txn = txn;
    return this;
  }

   /**
   * Get txn
   * @return txn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxn() {
    return txn;
  }


  public void setTxn(String txn) {
    this.txn = txn;
  }


  public PushUriRequest orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public PushUriRequest keyhash(String keyhash) {
    
    this.keyhash = keyhash;
    return this;
  }

   /**
   * Get keyhash
   * @return keyhash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyhash() {
    return keyhash;
  }


  public void setKeyhash(String keyhash) {
    this.keyhash = keyhash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushUriRequest pushUriRequest = (PushUriRequest) o;
    return Objects.equals(this.uriDetails, pushUriRequest.uriDetails) &&
        Objects.equals(this.ns2, pushUriRequest.ns2) &&
        Objects.equals(this.ver, pushUriRequest.ver) &&
        Objects.equals(this.ts, pushUriRequest.ts) &&
        Objects.equals(this.txn, pushUriRequest.txn) &&
        Objects.equals(this.orgId, pushUriRequest.orgId) &&
        Objects.equals(this.keyhash, pushUriRequest.keyhash);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriDetails, ns2, ver, ts, txn, orgId, keyhash);
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
    sb.append("class PushUriRequest {\n");
    sb.append("    uriDetails: ").append(toIndentedString(uriDetails)).append("\n");
    sb.append("    ns2: ").append(toIndentedString(ns2)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    keyhash: ").append(toIndentedString(keyhash)).append("\n");
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

