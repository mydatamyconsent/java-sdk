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
import com.mydatamyconsent.model.BankAccountType;
import com.mydatamyconsent.model.FileType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationFinancialAccountDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-25T10:37:12.390012540Z[Etc/UTC]")
public class OrganizationFinancialAccountDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiaryName";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  private String beneficiaryName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "isVerified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bankAccountType";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private BankAccountType bankAccountType;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_PROOF_URL = "bankAccountProofUrl";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_PROOF_URL)
  private String bankAccountProofUrl;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private FileType fileType;

  public OrganizationFinancialAccountDto() { 
  }

  public OrganizationFinancialAccountDto id(UUID id) {
    
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


  public OrganizationFinancialAccountDto organizationId(UUID organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public OrganizationFinancialAccountDto organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public OrganizationFinancialAccountDto beneficiaryName(String beneficiaryName) {
    
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Get beneficiaryName
   * @return beneficiaryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBeneficiaryName() {
    return beneficiaryName;
  }


  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }


  public OrganizationFinancialAccountDto accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public OrganizationFinancialAccountDto routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public OrganizationFinancialAccountDto isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public OrganizationFinancialAccountDto isVerified(Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public OrganizationFinancialAccountDto logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public OrganizationFinancialAccountDto bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public OrganizationFinancialAccountDto bankAccountType(BankAccountType bankAccountType) {
    
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * Get bankAccountType
   * @return bankAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankAccountType getBankAccountType() {
    return bankAccountType;
  }


  public void setBankAccountType(BankAccountType bankAccountType) {
    this.bankAccountType = bankAccountType;
  }


  public OrganizationFinancialAccountDto bankAccountProofUrl(String bankAccountProofUrl) {
    
    this.bankAccountProofUrl = bankAccountProofUrl;
    return this;
  }

   /**
   * Get bankAccountProofUrl
   * @return bankAccountProofUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankAccountProofUrl() {
    return bankAccountProofUrl;
  }


  public void setBankAccountProofUrl(String bankAccountProofUrl) {
    this.bankAccountProofUrl = bankAccountProofUrl;
  }


  public OrganizationFinancialAccountDto fileType(FileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileType getFileType() {
    return fileType;
  }


  public void setFileType(FileType fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFinancialAccountDto organizationFinancialAccountDto = (OrganizationFinancialAccountDto) o;
    return Objects.equals(this.id, organizationFinancialAccountDto.id) &&
        Objects.equals(this.organizationId, organizationFinancialAccountDto.organizationId) &&
        Objects.equals(this.organizationName, organizationFinancialAccountDto.organizationName) &&
        Objects.equals(this.beneficiaryName, organizationFinancialAccountDto.beneficiaryName) &&
        Objects.equals(this.accountNumber, organizationFinancialAccountDto.accountNumber) &&
        Objects.equals(this.routingNumber, organizationFinancialAccountDto.routingNumber) &&
        Objects.equals(this.isPrimary, organizationFinancialAccountDto.isPrimary) &&
        Objects.equals(this.isVerified, organizationFinancialAccountDto.isVerified) &&
        Objects.equals(this.logoUrl, organizationFinancialAccountDto.logoUrl) &&
        Objects.equals(this.bankName, organizationFinancialAccountDto.bankName) &&
        Objects.equals(this.bankAccountType, organizationFinancialAccountDto.bankAccountType) &&
        Objects.equals(this.bankAccountProofUrl, organizationFinancialAccountDto.bankAccountProofUrl) &&
        Objects.equals(this.fileType, organizationFinancialAccountDto.fileType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, organizationName, beneficiaryName, accountNumber, routingNumber, isPrimary, isVerified, logoUrl, bankName, bankAccountType, bankAccountProofUrl, fileType);
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
    sb.append("class OrganizationFinancialAccountDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    bankAccountProofUrl: ").append(toIndentedString(bankAccountProofUrl)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

