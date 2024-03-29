# mydatamyconsent-java-sdk

My Data My Consent - Developer API
- API version: 1.0
  - Build date: 2023-06-26T10:38:51.740024692Z[Etc/UTC]

Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.

  For more information, please visit [https://mydatamyconsent.com/en-us/contact-us](https://mydatamyconsent.com/en-us/contact-us)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mydatamyconsent</groupId>
  <artifactId>mydatamyconsent-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'mydatamyconsent-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'mydatamyconsent-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.mydatamyconsent:mydatamyconsent-java-sdk:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mydatamyconsent-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDataProcessingAgreements result = apiInstance.v1DataAgreementsGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mydatamyconsent.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataProcessingAgreementsApi* | [**v1DataAgreementsGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsGet) | **GET** /v1/data-agreements | Get paginated data processing agreements.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdDelete**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdDelete) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement this will not delete a published or a agreement in use with consents.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdGet) | **GET** /v1/data-agreements/{id} | Get data processing agreement by id.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdTerminatePut**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdTerminatePut) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement by id.
*DataProvidersDiscoveryApi* | [**v1DataProvidersGet**](docs/DataProvidersDiscoveryApi.md#v1DataProvidersGet) | **GET** /v1/data-providers | Discover all data providers in my data my consent by country and filters.
*DataProvidersDiscoveryApi* | [**v1DataProvidersIdGet**](docs/DataProvidersDiscoveryApi.md#v1DataProvidersIdGet) | **GET** /v1/data-providers/{id} | Get a data provider details by provider id.
*IndividualsApi* | [**issuerIssuedoc1XmlPost**](docs/IndividualsApi.md#issuerIssuedoc1XmlPost) | **POST** /issuer/issuedoc/1/xml | Digilocker compatible endpoint to issue document.
*IndividualsApi* | [**v1IndividualsConsentRequestsGet**](docs/IndividualsApi.md#v1IndividualsConsentRequestsGet) | **GET** /v1/individuals/consent-requests | Get all consent requests sent to Individuals.
*IndividualsApi* | [**v1IndividualsConsentRequestsPost**](docs/IndividualsApi.md#v1IndividualsConsentRequestsPost) | **POST** /v1/individuals/consent-requests | Create individual consent request.
*IndividualsApi* | [**v1IndividualsConsentRequestsRequestIdCancelPut**](docs/IndividualsApi.md#v1IndividualsConsentRequestsRequestIdCancelPut) | **PUT** /v1/individuals/consent-requests/{request_id}/cancel | Cancel the Individual data request by id.
*IndividualsApi* | [**v1IndividualsConsentRequestsRequestIdGet**](docs/IndividualsApi.md#v1IndividualsConsentRequestsRequestIdGet) | **GET** /v1/individuals/consent-requests/{request_id} | Get Individual data consent request by id.
*IndividualsApi* | [**v1IndividualsConsentTemplatesGet**](docs/IndividualsApi.md#v1IndividualsConsentTemplatesGet) | **GET** /v1/individuals/consent-templates | Get the paginated list of individual consent templates.
*IndividualsApi* | [**v1IndividualsConsentTemplatesTemplateIdGet**](docs/IndividualsApi.md#v1IndividualsConsentTemplatesTemplateIdGet) | **GET** /v1/individuals/consent-templates/{template_id} | Get Individual consent template details by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id}/download | Download Individual consented document by document id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsDocumentIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id} | Get Individual consented document by document id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsGet) | **GET** /v1/individuals/consents/{consent_id}/documents | Get Individual consented document by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id} | Get individual consented financial account details.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get individual consented financial account transactions.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts | Get all individual consented financial accounts.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdGet) | **GET** /v1/individuals/consents/{consent_id} | Get Individuals consent details by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdHealthFhirBundleGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdHealthFhirBundleGet) | **GET** /v1/individuals/consents/{consent_id}/health/fhir/bundle | Get Individual consented Health Records by consent id.
*IndividualsApi* | [**v1IndividualsConsentsGet**](docs/IndividualsApi.md#v1IndividualsConsentsGet) | **GET** /v1/individuals/consents | Get the paginated list of Individual consents.
*IndividualsApi* | [**v1IndividualsDocumentsIssueIssueRequestIdUploadPost**](docs/IndividualsApi.md#v1IndividualsDocumentsIssueIssueRequestIdUploadPost) | **POST** /v1/individuals/documents/issue/{issue_request_id}/upload | Upload a document for issuance request of individual.
*IndividualsApi* | [**v1IndividualsDocumentsIssuePost**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuePost) | **POST** /v1/individuals/documents/issue | Issue a new document to an individual user.
*IndividualsApi* | [**v1IndividualsDocumentsIssuedDocumentIdGet**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuedDocumentIdGet) | **GET** /v1/individuals/documents/issued/{document_id} | Get issued document.
*IndividualsApi* | [**v1IndividualsDocumentsIssuedGet**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuedGet) | **GET** /v1/individuals/documents/issued | Get paginated list of issued documents of given document type.
*IndividualsApi* | [**v1IndividualsDocumentsTypesGet**](docs/IndividualsApi.md#v1IndividualsDocumentsTypesGet) | **GET** /v1/individuals/documents/types | Get paginated list of registered document types.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsGet) | **GET** /v1/organizations/consent-requests | Get all consent requests sent to Organizations.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsPost**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsPost) | **POST** /v1/organizations/consent-requests | Create consent request for an Organization.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsRequestIdCancelPut**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdCancelPut) | **PUT** /v1/organizations/consent-requests/{request_id}/cancel | Cancel the  Organization data request by id.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsRequestIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdGet) | **GET** /v1/organizations/consent-requests/{request_id} | Get Organization data request by id.
*OrganizationsApi* | [**v1OrganizationsConsentTemplatesGet**](docs/OrganizationsApi.md#v1OrganizationsConsentTemplatesGet) | **GET** /v1/organizations/consent-templates | Get the paginated list of organization consent templates.
*OrganizationsApi* | [**v1OrganizationsConsentTemplatesTemplateIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentTemplatesTemplateIdGet) | **GET** /v1/organizations/consent-templates/{template_id} | Get Organization consent template details by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id}/download | Download Organization consent document by document id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id} | Get Organization consent document based on document id and consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsGet) | **GET** /v1/organizations/consents/{consent_id}/documents | Get Organization consent document by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id} | Get organization consented financial account details.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get organization consented financial account transactions.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts | Get all organization consented financial accounts.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdGet) | **GET** /v1/organizations/consents/{consent_id} | Get Organization consent request details by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsGet) | **GET** /v1/organizations/consents | Get the paginated list of Organization consents.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuePost**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuePost) | **POST** /v1/organizations/documents/issue | Issue a new document to an organization.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssueUploadIssueRequestIdPost**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssueUploadIssueRequestIdPost) | **POST** /v1/organizations/documents/issue/upload/{issue_request_id} | Upload a document for issuance request of Organization.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuedDocumentIdGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuedDocumentIdGet) | **GET** /v1/organizations/documents/issued/{document_id} | Get issued document.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuedGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuedGet) | **GET** /v1/organizations/documents/issued | Get paginated list of issued documents of given document type.
*OrganizationsApi* | [**v1OrganizationsDocumentsTypesGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsTypesGet) | **GET** /v1/organizations/documents/types | Get paginated list of registered document types.
*SupportedIdentifiersApi* | [**v1SupportedIdentifiersCountryIso2CodeGet**](docs/SupportedIdentifiersApi.md#v1SupportedIdentifiersCountryIso2CodeGet) | **GET** /v1/supported-identifiers/{country_iso2_code} | Get all supported identifiers by country.


## Documentation for Models

 - [ApiErrorType](docs/ApiErrorType.md)
 - [CollectibleTypes](docs/CollectibleTypes.md)
 - [Consent](docs/Consent.md)
 - [ConsentDetails](docs/ConsentDetails.md)
 - [ConsentDocumentIssuer](docs/ConsentDocumentIssuer.md)
 - [ConsentRequest](docs/ConsentRequest.md)
 - [ConsentRequestReceiver](docs/ConsentRequestReceiver.md)
 - [ConsentRequestTemplate](docs/ConsentRequestTemplate.md)
 - [ConsentRequestTemplateStatus](docs/ConsentRequestTemplateStatus.md)
 - [ConsentedDocument](docs/ConsentedDocument.md)
 - [ConsentedFinancialAccount](docs/ConsentedFinancialAccount.md)
 - [ConsentedFinancialAccountField](docs/ConsentedFinancialAccountField.md)
 - [ConsentedFinancialAccountFieldTransactionPeriod](docs/ConsentedFinancialAccountFieldTransactionPeriod.md)
 - [ConsentedIdentifier](docs/ConsentedIdentifier.md)
 - [ConsentedMedicalRecord](docs/ConsentedMedicalRecord.md)
 - [CreateConsentRequest](docs/CreateConsentRequest.md)
 - [DataConsentStatus](docs/DataConsentStatus.md)
 - [DataProcessingAgreement](docs/DataProcessingAgreement.md)
 - [DataProtectionOfficer](docs/DataProtectionOfficer.md)
 - [DataProvider](docs/DataProvider.md)
 - [DataProviderDetails](docs/DataProviderDetails.md)
 - [DocumentCategoryType](docs/DocumentCategoryType.md)
 - [DocumentDigitalSignature](docs/DocumentDigitalSignature.md)
 - [DocumentField](docs/DocumentField.md)
 - [DocumentIssueRequest](docs/DocumentIssueRequest.md)
 - [DocumentIssueRequestDetails](docs/DocumentIssueRequestDetails.md)
 - [DocumentIssueRequestDetailsReceiver](docs/DocumentIssueRequestDetailsReceiver.md)
 - [DocumentIssueRequestPaymentRequest](docs/DocumentIssueRequestPaymentRequest.md)
 - [DocumentIssueRequestReceiver](docs/DocumentIssueRequestReceiver.md)
 - [DocumentIssueRequestStatus](docs/DocumentIssueRequestStatus.md)
 - [DocumentReceiver](docs/DocumentReceiver.md)
 - [DocumentSubCategoryType](docs/DocumentSubCategoryType.md)
 - [DocumentType](docs/DocumentType.md)
 - [Equity](docs/Equity.md)
 - [EquityTransaction](docs/EquityTransaction.md)
 - [EquityTransactionsType](docs/EquityTransactionsType.md)
 - [Error](docs/Error.md)
 - [FhirBundleany](docs/FhirBundleany.md)
 - [FinancialAccount](docs/FinancialAccount.md)
 - [FinancialAccountCategoryType](docs/FinancialAccountCategoryType.md)
 - [FinancialAccountDetailsRequired](docs/FinancialAccountDetailsRequired.md)
 - [FinancialAccountEquity](docs/FinancialAccountEquity.md)
 - [FinancialAccountEquityAllOf](docs/FinancialAccountEquityAllOf.md)
 - [FinancialAccountField](docs/FinancialAccountField.md)
 - [FinancialAccountMutualFund](docs/FinancialAccountMutualFund.md)
 - [FinancialAccountMutualFundAllOf](docs/FinancialAccountMutualFundAllOf.md)
 - [FinancialAccountSip](docs/FinancialAccountSip.md)
 - [FinancialAccountSipAllOf](docs/FinancialAccountSipAllOf.md)
 - [FinancialAccountSubCategoryType](docs/FinancialAccountSubCategoryType.md)
 - [FinancialAccountTermDeposit](docs/FinancialAccountTermDeposit.md)
 - [FinancialAccountTermDepositAllOf](docs/FinancialAccountTermDepositAllOf.md)
 - [FinancialAccountTransaction](docs/FinancialAccountTransaction.md)
 - [FinancialAccountTransactionEquityTransaction](docs/FinancialAccountTransactionEquityTransaction.md)
 - [FinancialAccountTransactionEquityTransactionAllOf](docs/FinancialAccountTransactionEquityTransactionAllOf.md)
 - [FinancialAccountTransactionMutualFundTransaction](docs/FinancialAccountTransactionMutualFundTransaction.md)
 - [FinancialAccountTransactionMutualFundTransactionAllOf](docs/FinancialAccountTransactionMutualFundTransactionAllOf.md)
 - [FinancialAccountTransactionPeriod](docs/FinancialAccountTransactionPeriod.md)
 - [FinancialAccountTransactionSipTransaction](docs/FinancialAccountTransactionSipTransaction.md)
 - [FinancialAccountTransactionSipTransactionAllOf](docs/FinancialAccountTransactionSipTransactionAllOf.md)
 - [FinancialAccountTransactionTermDepositTransaction](docs/FinancialAccountTransactionTermDepositTransaction.md)
 - [FinancialAccountTransactionTermDepositTransactionAllOf](docs/FinancialAccountTransactionTermDepositTransactionAllOf.md)
 - [Holder](docs/Holder.md)
 - [IdentificationStrategy](docs/IdentificationStrategy.md)
 - [Identifier](docs/Identifier.md)
 - [IdentityField](docs/IdentityField.md)
 - [IndividualConsentRequestDetails](docs/IndividualConsentRequestDetails.md)
 - [IndividualConsentRequestTemplateDetails](docs/IndividualConsentRequestTemplateDetails.md)
 - [IndividualConsentRequestTemplateDetailsDataFrequency](docs/IndividualConsentRequestTemplateDetailsDataFrequency.md)
 - [IndividualConsentRequestTemplateDetailsDataLife](docs/IndividualConsentRequestTemplateDetailsDataLife.md)
 - [IndividualConsentRequestTemplateDetailsRequestLife](docs/IndividualConsentRequestTemplateDetailsRequestLife.md)
 - [IssuedDocument](docs/IssuedDocument.md)
 - [IssuerType](docs/IssuerType.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [Life](docs/Life.md)
 - [MedicalRecordField](docs/MedicalRecordField.md)
 - [MutualFund](docs/MutualFund.md)
 - [MutualFundTransaction](docs/MutualFundTransaction.md)
 - [MutualFundTransactionType](docs/MutualFundTransactionType.md)
 - [OrganizationConsentRequestDetails](docs/OrganizationConsentRequestDetails.md)
 - [OrganizationConsentRequestTemplateDetails](docs/OrganizationConsentRequestTemplateDetails.md)
 - [PaginatedListOfConsentRequestTemplates](docs/PaginatedListOfConsentRequestTemplates.md)
 - [PaginatedListOfConsents](docs/PaginatedListOfConsents.md)
 - [PaginatedListOfDataProcessingAgreements](docs/PaginatedListOfDataProcessingAgreements.md)
 - [PaginatedListOfDataProviders](docs/PaginatedListOfDataProviders.md)
 - [PaginatedListOfDocumentTypes](docs/PaginatedListOfDocumentTypes.md)
 - [PaginatedListOfFinancialAccountTransactions](docs/PaginatedListOfFinancialAccountTransactions.md)
 - [PaginatedListOfIndividualConsentRequestDetailss](docs/PaginatedListOfIndividualConsentRequestDetailss.md)
 - [PaginatedListOfIssuedDocuments](docs/PaginatedListOfIssuedDocuments.md)
 - [PaginatedListOfOrganizationConsentRequestDetailss](docs/PaginatedListOfOrganizationConsentRequestDetailss.md)
 - [PaymentOrderItem](docs/PaymentOrderItem.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PushUriRequest](docs/PushUriRequest.md)
 - [PushUriResponse](docs/PushUriResponse.md)
 - [SelectedFinancialAccountType](docs/SelectedFinancialAccountType.md)
 - [Sip](docs/Sip.md)
 - [SipInvestmentInformation](docs/SipInvestmentInformation.md)
 - [SipPlanInformation](docs/SipPlanInformation.md)
 - [SipTransaction](docs/SipTransaction.md)
 - [SipTransactionType](docs/SipTransactionType.md)
 - [SupportedDocumentType](docs/SupportedDocumentType.md)
 - [SupportedEntityType](docs/SupportedEntityType.md)
 - [SupportedIdentifier](docs/SupportedIdentifier.md)
 - [TermDeposit](docs/TermDeposit.md)
 - [TermDepositAccountDetails](docs/TermDepositAccountDetails.md)
 - [TermDepositAccountType](docs/TermDepositAccountType.md)
 - [TermDepositBankInformation](docs/TermDepositBankInformation.md)
 - [TermDepositCompoundingFrequency](docs/TermDepositCompoundingFrequency.md)
 - [TermDepositInformation](docs/TermDepositInformation.md)
 - [TermDepositInterestComputation](docs/TermDepositInterestComputation.md)
 - [TermDepositInterestPayoutType](docs/TermDepositInterestPayoutType.md)
 - [TermDepositTransaction](docs/TermDepositTransaction.md)
 - [TermDepositTransactionMode](docs/TermDepositTransactionMode.md)
 - [TermDepositTransactionType](docs/TermDepositTransactionType.md)
 - [UploadDocumentResponse](docs/UploadDocumentResponse.md)
 - [UriDetails](docs/UriDetails.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2ClientCredentials

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - SupportedIdentifiers:Read: Read SupportedIdentifiers.
  - DataProviders:Read: Read DataProviders.
  - DataProcessingAgreements:Read: Read DataProcessingAgreements.
  - DataProcessingAgreements:Write: Read &amp; Write DataProcessingAgreements.
  - Individuals:DocumentTypes:Read: Read Individual DocumentTypes.
  - Individuals:Documents:Read: Read Individual Issued Documents.
  - Individuals:Documents:Issue: Issue Individual Documents.
  - Organizations:DocumentTypes:Read: Read Organization DocumentTypes.
  - Organizations:Documents:Read: Read Organization Issued Documents.
  - Organizations:Documents:Issue: Issue Organization Documents.
  - Individuals:ConsentRequests:Request: Request Individual Consent requests.
  - Individuals:ConsentRequests:Cancel: Cancel Individual Consent requests.
  - Individuals:ConsentRequests:Read: Read Individual Consent requests.
  - Organizations:ConsentRequests:Request: Request Organization Consent requests.
  - Organizations:ConsentRequests:Cancel: Cancel Organization Consent requests.
  - Organizations:ConsentRequests:Read: Read Organization Consent requests.
  - Individuals:Consents:Read: Read Individual Consents.
  - Organizations:Consents:Read: Read Organization Consents.
  - Individuals:ConsentRequestTemplates:Read: Read Individual Consent Request templates.
  - Organizations:ConsentRequestTemplates:Read: Read Organization Consent Request templates.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mydatamyconsent.com

