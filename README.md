# mydatamyconsent-java-sdk

My Data My Consent - Developer API
- API version: v1
  - Build date: 2022-03-04T10:35:04.021220362Z[Etc/UTC]

Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.

  For more information, please visit [https://mydatamyconsent.com/en-us/developers](https://mydatamyconsent.com/en-us/developers)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
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
  <version>v1</version>
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
     implementation "com.mydatamyconsent:mydatamyconsent-java-sdk:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mydatamyconsent-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Individual consent request id.
    try {
      IndividualDataConsentRequestResponse result = apiInstance.cancelIndividualDataConsentRequest(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#cancelIndividualDataConsentRequest");
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
*DataConsentRequestsApi* | [**cancelIndividualDataConsentRequest**](docs/DataConsentRequestsApi.md#cancelIndividualDataConsentRequest) | **PUT** /v1/consent-requests/individual/{requestId}/cancel | Cancel the individual data consent request based on Id.
*DataConsentRequestsApi* | [**cancelOrganizationDataConsentRequest**](docs/DataConsentRequestsApi.md#cancelOrganizationDataConsentRequest) | **PUT** /v1/consent-requests/organization/{requestId}/cancel | Cancel the Organization data consent request based on Id.
*DataConsentRequestsApi* | [**createIndividualDataConsentRequest**](docs/DataConsentRequestsApi.md#createIndividualDataConsentRequest) | **POST** /v1/consent-requests/individual | Create a individual data consent request.
*DataConsentRequestsApi* | [**createOrganizationDataConsentRequest**](docs/DataConsentRequestsApi.md#createOrganizationDataConsentRequest) | **POST** /v1/consent-requests/organization | Create a organization data consent request.
*DataConsentRequestsApi* | [**getAllConsentRequestsToIndividuals**](docs/DataConsentRequestsApi.md#getAllConsentRequestsToIndividuals) | **GET** /v1/consent-requests/individuals | Get all Consent Requests sent to Individuals.
*DataConsentRequestsApi* | [**getAllConsentRequestsToOrganizations**](docs/DataConsentRequestsApi.md#getAllConsentRequestsToOrganizations) | **GET** /v1/consent-requests/organizations | Get All Consent Requests sent to Organizations.
*DataConsentRequestsApi* | [**getIndividualConsentRequestById**](docs/DataConsentRequestsApi.md#getIndividualConsentRequestById) | **GET** /v1/consent-requests/individuals/{requestId} | Get a Consent Request by ID.
*DataConsentRequestsApi* | [**getOrganizationConsentRequestById**](docs/DataConsentRequestsApi.md#getOrganizationConsentRequestById) | **GET** /v1/consent-requests/organizations/{requestId} | Get a OrganizationConsent Request by Id.
*DataConsentsApi* | [**downloadConsentedDocumentById**](docs/DataConsentsApi.md#downloadConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId}/download | Download a individuals consented document.
*DataConsentsApi* | [**downloadOrgConsentedDocumentById**](docs/DataConsentsApi.md#downloadOrgConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId}/download | Download a organizations consented document.
*DataConsentsApi* | [**getAllConsentedDocuments**](docs/DataConsentsApi.md#getAllConsentedDocuments) | **GET** /v1/consents/individuals/{consentId}/documents | Get the individual documents based on ConsentId.
*DataConsentsApi* | [**getAllConsentedFinancialAccounts**](docs/DataConsentsApi.md#getAllConsentedFinancialAccounts) | **GET** /v1/consents/individuals/{consentId}/financial-accounts | Get all individual consented financial accounts.
*DataConsentsApi* | [**getAllOrganizationConsentedDocuments**](docs/DataConsentsApi.md#getAllOrganizationConsentedDocuments) | **GET** /v1/consents/organizations/{consentId}/documents | Get the organization documents based on ConsentId.
*DataConsentsApi* | [**getConsentDetailsById**](docs/DataConsentsApi.md#getConsentDetailsById) | **GET** /v1/consents/individuals/{consentId} | Get all individuals consent details by consent id.
*DataConsentsApi* | [**getConsentFinancialAccounts**](docs/DataConsentsApi.md#getConsentFinancialAccounts) | **GET** /v1/consents/organizations/{consentId}/financial-accounts | Get all organizational consented financial accounts.
*DataConsentsApi* | [**getConsentedAccountById**](docs/DataConsentsApi.md#getConsentedAccountById) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId} | Get individual consented financial account details based on account id.
*DataConsentsApi* | [**getConsentedDocumentById**](docs/DataConsentsApi.md#getConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId} | Get individuals consent document based on document id.
*DataConsentsApi* | [**getConsentedFinancialAccount**](docs/DataConsentsApi.md#getConsentedFinancialAccount) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId} | Get organization consented financial account details based on account id.
*DataConsentsApi* | [**getConsentedFinancialAccountTransactions**](docs/DataConsentsApi.md#getConsentedFinancialAccountTransactions) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId}/transactions | Get individual consented financial account transactions of an individual based on accountId.
*DataConsentsApi* | [**getConsentsForOrganizations**](docs/DataConsentsApi.md#getConsentsForOrganizations) | **GET** /v1/consents/organizations | Get the list of data consents sent for organizations.
*DataConsentsApi* | [**getConsentsSentToIndividuals**](docs/DataConsentsApi.md#getConsentsSentToIndividuals) | **GET** /v1/consents/individuals | Get the list of Consents Sent to Individuals.
*DataConsentsApi* | [**getOrgConsentedAccountTransactions**](docs/DataConsentsApi.md#getOrgConsentedAccountTransactions) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId}/transactions | Get organization consented financial account transactions of an individual based on accountId.
*DataConsentsApi* | [**getOrganizationConsentDetailsById**](docs/DataConsentsApi.md#getOrganizationConsentDetailsById) | **GET** /v1/consents/organizations/{consentId} | Get all organization consent details by consent id.
*DataConsentsApi* | [**getOrganizationConsentedDocumentById**](docs/DataConsentsApi.md#getOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId} | Get organization consent document based on document id.
*DataProcessingAgreementsApi* | [**createDataProcessingAgreement**](docs/DataProcessingAgreementsApi.md#createDataProcessingAgreement) | **POST** /v1/data-agreements | Create a data processing agreement.
*DataProcessingAgreementsApi* | [**deleteDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#deleteDataProcessingAgreementById) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement. This will not delete a published or a agreement in use with consents.
*DataProcessingAgreementsApi* | [**getDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#getDataProcessingAgreementById) | **GET** /v1/data-agreements/{id} | Get data processing agreement by id.
*DataProcessingAgreementsApi* | [**getDataProcessingAgreements**](docs/DataProcessingAgreementsApi.md#getDataProcessingAgreements) | **GET** /v1/data-agreements | Get all data processing agreements.
*DataProcessingAgreementsApi* | [**terminateDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#terminateDataProcessingAgreementById) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement.
*DataProcessingAgreementsApi* | [**updateDataProcessingAgreement**](docs/DataProcessingAgreementsApi.md#updateDataProcessingAgreement) | **PUT** /v1/data-agreements/{id} | Update a data processing agreement.
*DataProviderDiscoveryApi* | [**getDataProviderById**](docs/DataProviderDiscoveryApi.md#getDataProviderById) | **GET** /v1/data-providers/{providerId} | Get a Data Provider details based on provider id.
*DataProviderDiscoveryApi* | [**getDataProviders**](docs/DataProviderDiscoveryApi.md#getDataProviders) | **GET** /v1/data-providers | Discover all data providers in My Data My Consent by country and filters.
*DigiLockerCompatIssuerApi* | [**digilockerCompatIssueDocument**](docs/DigiLockerCompatIssuerApi.md#digilockerCompatIssueDocument) | **POST** /issuer/issuedoc/1/xml | Digilocker Compatible endpoint to issue document.
*DocumentsApi* | [**getIssuedDocumentById**](docs/DocumentsApi.md#getIssuedDocumentById) | **GET** /v1/documents/issued/{documentId} | Get issued document.
*DocumentsApi* | [**getIssuedDocuments**](docs/DocumentsApi.md#getIssuedDocuments) | **GET** /v1/documents/issued/{documentTypeId} | Get paginated list of issued documents of given document type.
*DocumentsApi* | [**getRegisteredDocumentTypes**](docs/DocumentsApi.md#getRegisteredDocumentTypes) | **GET** /v1/documents/types | Get registered document types.
*DocumentsApi* | [**issueDocumentToIndividual**](docs/DocumentsApi.md#issueDocumentToIndividual) | **POST** /v1/documents/issue/individual | Issue a new document to an individual user.
*DocumentsApi* | [**issueDocumentToOrganization**](docs/DocumentsApi.md#issueDocumentToOrganization) | **POST** /v1/documents/issue/organization | Issue a new document to an organization.
*DocumentsApi* | [**uploadDocumentForIndividual**](docs/DocumentsApi.md#uploadDocumentForIndividual) | **POST** /v1/documents/issue/individual/upload/{issueRequestId} | Upload a document for issuance request of individual.
*DocumentsApi* | [**uploadDocumentForOrganization**](docs/DocumentsApi.md#uploadDocumentForOrganization) | **POST** /v1/documents/issue/organization/upload/{issueRequestId} | Upload a document for issuance request of organization.
*SupportedIdentifiersApi* | [**getAllSupportedIdentifiers**](docs/SupportedIdentifiersApi.md#getAllSupportedIdentifiers) | **GET** /v1/supported-identifiers/{countryIso2Code} | Get all supported identifiers by country.


## Documentation for Models

 - [Activity](docs/Activity.md)
 - [ApprovedConsentRequest](docs/ApprovedConsentRequest.md)
 - [BankAccountType](docs/BankAccountType.md)
 - [ConsentRequestReceiver](docs/ConsentRequestReceiver.md)
 - [CreateDataProcessingAgreementRequestModel](docs/CreateDataProcessingAgreementRequestModel.md)
 - [CreateIndividualDataConsentRequest](docs/CreateIndividualDataConsentRequest.md)
 - [CreateOrganizationDataConsentRequest](docs/CreateOrganizationDataConsentRequest.md)
 - [DataConsentDetailsDto](docs/DataConsentDetailsDto.md)
 - [DataConsentDocumentDetailsDto](docs/DataConsentDocumentDetailsDto.md)
 - [DataConsentDocumentsDto](docs/DataConsentDocumentsDto.md)
 - [DataConsentFinancialsDto](docs/DataConsentFinancialsDto.md)
 - [DataConsentRequestedDocument](docs/DataConsentRequestedDocument.md)
 - [DataConsentRequestedFinancialAccount](docs/DataConsentRequestedFinancialAccount.md)
 - [DataConsentStatus](docs/DataConsentStatus.md)
 - [DataProcessingAgreementDto](docs/DataProcessingAgreementDto.md)
 - [DataProcessingAgreementDtoPaginatedList](docs/DataProcessingAgreementDtoPaginatedList.md)
 - [DataProtectionOfficer](docs/DataProtectionOfficer.md)
 - [DataProvider](docs/DataProvider.md)
 - [DataProviderPaginatedList](docs/DataProviderPaginatedList.md)
 - [DigitalSignature](docs/DigitalSignature.md)
 - [Document](docs/Document.md)
 - [DocumentCategoryType](docs/DocumentCategoryType.md)
 - [DocumentIssueRequest](docs/DocumentIssueRequest.md)
 - [DocumentIssueRequestDetails](docs/DocumentIssueRequestDetails.md)
 - [DocumentIssueRequestStatus](docs/DocumentIssueRequestStatus.md)
 - [DocumentReceiver](docs/DocumentReceiver.md)
 - [DocumentSubCategoryType](docs/DocumentSubCategoryType.md)
 - [DocumentType](docs/DocumentType.md)
 - [DocumentTypePaginatedList](docs/DocumentTypePaginatedList.md)
 - [DocumentsRequired](docs/DocumentsRequired.md)
 - [FileType](docs/FileType.md)
 - [Financial](docs/Financial.md)
 - [FinancialAccount](docs/FinancialAccount.md)
 - [FinancialAccountDetailsRequired](docs/FinancialAccountDetailsRequired.md)
 - [FinancialAccounts](docs/FinancialAccounts.md)
 - [IdentificationStrategy](docs/IdentificationStrategy.md)
 - [Identifier](docs/Identifier.md)
 - [IndividualDataConsentRequestResponse](docs/IndividualDataConsentRequestResponse.md)
 - [IssuedDocument](docs/IssuedDocument.md)
 - [IssuedDocumentPaginatedList](docs/IssuedDocumentPaginatedList.md)
 - [Life](docs/Life.md)
 - [OrganizationDataConsentInfoDto](docs/OrganizationDataConsentInfoDto.md)
 - [OrganizationDataConsentInfoDtoPaginatedList](docs/OrganizationDataConsentInfoDtoPaginatedList.md)
 - [OrganizationDataConsentRequestResponse](docs/OrganizationDataConsentRequestResponse.md)
 - [OrganizationDocumentDetails](docs/OrganizationDocumentDetails.md)
 - [OrganizationDocumentDownloadDto](docs/OrganizationDocumentDownloadDto.md)
 - [OrganizationFinancialAccountDto](docs/OrganizationFinancialAccountDto.md)
 - [OrganizationFinancialTransactionsDto](docs/OrganizationFinancialTransactionsDto.md)
 - [OrganizationFinancialTransactionsDtoPaginatedList](docs/OrganizationFinancialTransactionsDtoPaginatedList.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [PushUriRequest](docs/PushUriRequest.md)
 - [PushUriResponse](docs/PushUriResponse.md)
 - [Requester](docs/Requester.md)
 - [SharedWith](docs/SharedWith.md)
 - [StringStringKeyValuePair](docs/StringStringKeyValuePair.md)
 - [SupportedDocumentDetailsDto](docs/SupportedDocumentDetailsDto.md)
 - [SupportedDocumentProviderDetailsDto](docs/SupportedDocumentProviderDetailsDto.md)
 - [SupportedDocumentTypeCategoryDetailsDto](docs/SupportedDocumentTypeCategoryDetailsDto.md)
 - [SupportedEntityType](docs/SupportedEntityType.md)
 - [SupportedIdentifier](docs/SupportedIdentifier.md)
 - [UpdateDataProcessingAgreementRequestModel](docs/UpdateDataProcessingAgreementRequestModel.md)
 - [UriDetails](docs/UriDetails.md)
 - [UserAccountFinancialTransactionsDto](docs/UserAccountFinancialTransactionsDto.md)
 - [UserAccountFinancialTransactionsDtoPaginatedList](docs/UserAccountFinancialTransactionsDtoPaginatedList.md)
 - [UserDataConsentInfoDto](docs/UserDataConsentInfoDto.md)
 - [UserDataConsentInfoDtoPaginatedList](docs/UserDataConsentInfoDtoPaginatedList.md)
 - [UserDocumentDetails](docs/UserDocumentDetails.md)
 - [UserDocumentDownload](docs/UserDocumentDownload.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: https://accounts.mydatamyconsent.com/connect/authorize
- **Scopes**: 
  - developer: Developer API


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mydatamyconsent.com

