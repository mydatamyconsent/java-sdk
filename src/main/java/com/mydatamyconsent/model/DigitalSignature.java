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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DigitalSignature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T10:35:07.927237150Z[Etc/UTC]")
public class DigitalSignature {
  public static final String SERIALIZED_NAME_SIGNED_BY = "signedBy";
  @SerializedName(SERIALIZED_NAME_SIGNED_BY)
  private String signedBy;

  public static final String SERIALIZED_NAME_CERT_ISSUED_BY = "certIssuedBy";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUED_BY)
  private String certIssuedBy;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_VALID_TILL = "validTill";
  @SerializedName(SERIALIZED_NAME_VALID_TILL)
  private OffsetDateTime validTill;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SHA1_DIGEST = "sha1Digest";
  @SerializedName(SERIALIZED_NAME_SHA1_DIGEST)
  private String sha1Digest;

  public DigitalSignature() { 
  }

  public DigitalSignature signedBy(String signedBy) {
    
    this.signedBy = signedBy;
    return this;
  }

   /**
   * Get signedBy
   * @return signedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignedBy() {
    return signedBy;
  }


  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }


  public DigitalSignature certIssuedBy(String certIssuedBy) {
    
    this.certIssuedBy = certIssuedBy;
    return this;
  }

   /**
   * Get certIssuedBy
   * @return certIssuedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertIssuedBy() {
    return certIssuedBy;
  }


  public void setCertIssuedBy(String certIssuedBy) {
    this.certIssuedBy = certIssuedBy;
  }


  public DigitalSignature validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public DigitalSignature validTill(OffsetDateTime validTill) {
    
    this.validTill = validTill;
    return this;
  }

   /**
   * Get validTill
   * @return validTill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getValidTill() {
    return validTill;
  }


  public void setValidTill(OffsetDateTime validTill) {
    this.validTill = validTill;
  }


  public DigitalSignature reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public DigitalSignature location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public DigitalSignature sha1Digest(String sha1Digest) {
    
    this.sha1Digest = sha1Digest;
    return this;
  }

   /**
   * Get sha1Digest
   * @return sha1Digest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSha1Digest() {
    return sha1Digest;
  }


  public void setSha1Digest(String sha1Digest) {
    this.sha1Digest = sha1Digest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalSignature digitalSignature = (DigitalSignature) o;
    return Objects.equals(this.signedBy, digitalSignature.signedBy) &&
        Objects.equals(this.certIssuedBy, digitalSignature.certIssuedBy) &&
        Objects.equals(this.validFrom, digitalSignature.validFrom) &&
        Objects.equals(this.validTill, digitalSignature.validTill) &&
        Objects.equals(this.reason, digitalSignature.reason) &&
        Objects.equals(this.location, digitalSignature.location) &&
        Objects.equals(this.sha1Digest, digitalSignature.sha1Digest);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedBy, certIssuedBy, validFrom, validTill, reason, location, sha1Digest);
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
    sb.append("class DigitalSignature {\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
    sb.append("    certIssuedBy: ").append(toIndentedString(certIssuedBy)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    sha1Digest: ").append(toIndentedString(sha1Digest)).append("\n");
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

