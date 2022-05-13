# mydatamyconsent-java-sdk

My Data My Consent - Developer API
- API version: v1
  - Build date: 2022-05-13T10:37:48.248698692Z[Etc/UTC]

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
      apiInstance.cancelIndividualDataConsentRequest(requestId);
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
*DataConsentRequestsApi* | [**cancelIndividualDataConsentRequest**](docs/DataConsentRequestsApi.md#cancelIndividualDataConsentRequest) | **PUT** /v1/consent-requests/individual/{requestId}/cancel | Cancel the individual data consent request by Id.
*DataConsentRequestsApi* | [**cancelOrganizationDataConsentRequest**](docs/DataConsentRequestsApi.md#cancelOrganizationDataConsentRequest) | **PUT** /v1/consent-requests/organization/{requestId}/cancel | Cancel the organization data consent request by Id.
*DataConsentRequestsApi* | [**createIndividualDataConsentRequest**](docs/DataConsentRequestsApi.md#createIndividualDataConsentRequest) | **POST** /v1/consent-requests/individual | Create data consent request for an individual.
*DataConsentRequestsApi* | [**createOrganizationDataConsentRequest**](docs/DataConsentRequestsApi.md#createOrganizationDataConsentRequest) | **POST** /v1/consent-requests/organization | Create data consent request for an organization.
*DataConsentRequestsApi* | [**getAllConsentRequestsToIndividuals**](docs/DataConsentRequestsApi.md#getAllConsentRequestsToIndividuals) | **GET** /v1/consent-requests/individuals | Get all Consent Requests sent to individuals.
*DataConsentRequestsApi* | [**getAllConsentRequestsToOrganizations**](docs/DataConsentRequestsApi.md#getAllConsentRequestsToOrganizations) | **GET** /v1/consent-requests/organizations | Get all Consent Requests sent to organizations.
*DataConsentRequestsApi* | [**getIndividualConsentRequestById**](docs/DataConsentRequestsApi.md#getIndividualConsentRequestById) | **GET** /v1/consent-requests/individuals/{requestId} | Get individual data consent request by id.
*DataConsentRequestsApi* | [**getOrganizationConsentRequestById**](docs/DataConsentRequestsApi.md#getOrganizationConsentRequestById) | **GET** /v1/consent-requests/organizations/{requestId} | Get a OrganizationConsent Request by Id.
*DataConsentsApi* | [**downloadConsentedDocumentAnalysis**](docs/DataConsentsApi.md#downloadConsentedDocumentAnalysis) | **GET** /v1/consents/{consentId}/documents/{documentId}/analysis | Get analysis of a consented document.
*DataConsentsApi* | [**downloadIndividualConsentedDocumentById**](docs/DataConsentsApi.md#downloadIndividualConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId}/download | Download individual consented document by document id.
*DataConsentsApi* | [**downloadOrganizationConsentedDocumentById**](docs/DataConsentsApi.md#downloadOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId}/download | Download organization consent document based on document id.
*DataConsentsApi* | [**getAllConsentedFinancialAccounts**](docs/DataConsentsApi.md#getAllConsentedFinancialAccounts) | **GET** /v1/consents/individuals/{consentId}/financial-accounts | Get all individual consented financial accounts.
*DataConsentsApi* | [**getConsentFinancialAccounts**](docs/DataConsentsApi.md#getConsentFinancialAccounts) | **GET** /v1/consents/organizations/{consentId}/financial-accounts | Get all organizational consented financial accounts.
*DataConsentsApi* | [**getConsentedAccountById**](docs/DataConsentsApi.md#getConsentedAccountById) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId} | Get individual consented financial account details based on account id.
*DataConsentsApi* | [**getConsentedDocumentById**](docs/DataConsentsApi.md#getConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId} | Get individual consented document by document id.
*DataConsentsApi* | [**getConsentedFinancialAccount**](docs/DataConsentsApi.md#getConsentedFinancialAccount) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId} | Get organization consented financial account details based on account id.
*DataConsentsApi* | [**getConsentedFinancialAccountInsights**](docs/DataConsentsApi.md#getConsentedFinancialAccountInsights) | **GET** /v1/consents/{consentId}/financial-accounts/{accountId}/insights | Get consented financial account insights.
*DataConsentsApi* | [**getConsentedFinancialAccountTransactions**](docs/DataConsentsApi.md#getConsentedFinancialAccountTransactions) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId}/transactions | Get individual consented financial account transactions of an individual based on accountId.
*DataConsentsApi* | [**getConsents**](docs/DataConsentsApi.md#getConsents) | **GET** /v1/consents/individuals | Get the paginated list of individual data consents.
*DataConsentsApi* | [**getIndividualConsentedDocuments**](docs/DataConsentsApi.md#getIndividualConsentedDocuments) | **GET** /v1/consents/individuals/{consentId}/documents | Get individual consented documents by consent id.
*DataConsentsApi* | [**getIndividualDataConsentById**](docs/DataConsentsApi.md#getIndividualDataConsentById) | **GET** /v1/consents/individuals/{consentId} | Get individuals data consent details by consent id.
*DataConsentsApi* | [**getOrgConsentedAccountTransactions**](docs/DataConsentsApi.md#getOrgConsentedAccountTransactions) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId}/transactions | Get organization consented financial account transactions of an individual based on accountId.
*DataConsentsApi* | [**getOrganizationConsentedDocumentById**](docs/DataConsentsApi.md#getOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId} | Get organization consent document based on document id.
*DataConsentsApi* | [**getOrganizationConsentedDocuments**](docs/DataConsentsApi.md#getOrganizationConsentedDocuments) | **GET** /v1/consents/organizations/{consentId}/documents | Get organization consented documents by consent id.
*DataConsentsApi* | [**getOrganizationDataConsentById**](docs/DataConsentsApi.md#getOrganizationDataConsentById) | **GET** /v1/consents/organizations/{consentId} | Get organizations data consent details by consent id.
*DataConsentsApi* | [**getOrganizationDataConsents**](docs/DataConsentsApi.md#getOrganizationDataConsents) | **GET** /v1/consents/organizations | Get the paginated list of organization data consents.
*DataProcessingAgreementsApi* | [**createDataProcessingAgreement**](docs/DataProcessingAgreementsApi.md#createDataProcessingAgreement) | **POST** /v1/data-agreements | Create a data processing agreement.
*DataProcessingAgreementsApi* | [**deleteDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#deleteDataProcessingAgreementById) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement. This will not delete a published or a agreement in use with consents.
*DataProcessingAgreementsApi* | [**getDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#getDataProcessingAgreementById) | **GET** /v1/data-agreements/{id} | Get data processing agreement by id.
*DataProcessingAgreementsApi* | [**getDataProcessingAgreements**](docs/DataProcessingAgreementsApi.md#getDataProcessingAgreements) | **GET** /v1/data-agreements | Get paginated data processing agreements.
*DataProcessingAgreementsApi* | [**terminateDataProcessingAgreementById**](docs/DataProcessingAgreementsApi.md#terminateDataProcessingAgreementById) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement.
*DataProcessingAgreementsApi* | [**updateDataProcessingAgreement**](docs/DataProcessingAgreementsApi.md#updateDataProcessingAgreement) | **PUT** /v1/data-agreements/{id} | Update a data processing agreement.
*DataProviderDiscoveryApi* | [**getDataProviderById**](docs/DataProviderDiscoveryApi.md#getDataProviderById) | **GET** /v1/data-providers/{providerId} | Get a Data Provider details by provider id.
*DataProviderDiscoveryApi* | [**getDataProviders**](docs/DataProviderDiscoveryApi.md#getDataProviders) | **GET** /v1/data-providers | Discover all data providers in My Data My Consent by country and filters.
*DigiLockerCompatIssuerApi* | [**digilockerCompatIssueDocument**](docs/DigiLockerCompatIssuerApi.md#digilockerCompatIssueDocument) | **POST** /issuer/issuedoc/1/xml | Digilocker Compatible endpoint to issue document.
*DocumentsApi* | [**getIssuedDocumentById**](docs/DocumentsApi.md#getIssuedDocumentById) | **GET** /v1/documents/issued/{documentId} | Get issued document.
*DocumentsApi* | [**getIssuedDocuments**](docs/DocumentsApi.md#getIssuedDocuments) | **GET** /v1/documents/issued | Get paginated list of issued documents of given document type.
*DocumentsApi* | [**getRegisteredDocumentTypes**](docs/DocumentsApi.md#getRegisteredDocumentTypes) | **GET** /v1/documents/types | Get paginated list of registered document types.
*DocumentsApi* | [**issueDocumentToIndividual**](docs/DocumentsApi.md#issueDocumentToIndividual) | **POST** /v1/documents/issue/individual | Issue a new document to an individual user.
*DocumentsApi* | [**issueDocumentToOrganization**](docs/DocumentsApi.md#issueDocumentToOrganization) | **POST** /v1/documents/issue/organization | Issue a new document to an organization.
*DocumentsApi* | [**uploadDocumentForIndividual**](docs/DocumentsApi.md#uploadDocumentForIndividual) | **POST** /v1/documents/issue/individual/upload/{issueRequestId} | Upload a document for issuance request of individual.
*DocumentsApi* | [**uploadDocumentForOrganization**](docs/DocumentsApi.md#uploadDocumentForOrganization) | **POST** /v1/documents/issue/organization/upload/{issueRequestId} | Upload a document for issuance request of organization.
*SupportedIdentifiersApi* | [**getAllSupportedIdentifiers**](docs/SupportedIdentifiersApi.md#getAllSupportedIdentifiers) | **GET** /v1/supported-identifiers/{countryIso2Code} | Get all supported identifiers by country.


## Documentation for Models

 - [Activity](docs/Activity.md)
 - [ApprovedConsentRequest](docs/ApprovedConsentRequest.md)
 - [BankAccountType](docs/BankAccountType.md)
 - [BillPaymentOrderItem](docs/BillPaymentOrderItem.md)
 - [CollectibleTypes](docs/CollectibleTypes.md)
 - [ConsentRequestReceiver](docs/ConsentRequestReceiver.md)
 - [CreateDataConsentRequest](docs/CreateDataConsentRequest.md)
 - [CreateDataProcessingAgreement](docs/CreateDataProcessingAgreement.md)
 - [DataConsent](docs/DataConsent.md)
 - [DataConsentDetails](docs/DataConsentDetails.md)
 - [DataConsentDetailsPaginatedList](docs/DataConsentDetailsPaginatedList.md)
 - [DataConsentDocument](docs/DataConsentDocument.md)
 - [DataConsentDocumentIssuer](docs/DataConsentDocumentIssuer.md)
 - [DataConsentFinancialsDto](docs/DataConsentFinancialsDto.md)
 - [DataConsentRequest](docs/DataConsentRequest.md)
 - [DataConsentRequestDetails](docs/DataConsentRequestDetails.md)
 - [DataConsentRequestedFinancialAccount](docs/DataConsentRequestedFinancialAccount.md)
 - [DataConsentStatus](docs/DataConsentStatus.md)
 - [DataProcessingAgreement](docs/DataProcessingAgreement.md)
 - [DataProcessingAgreementBase](docs/DataProcessingAgreementBase.md)
 - [DataProcessingAgreementPaginatedList](docs/DataProcessingAgreementPaginatedList.md)
 - [DataProtectionOfficer](docs/DataProtectionOfficer.md)
 - [DataProvider](docs/DataProvider.md)
 - [DataProviderPaginatedList](docs/DataProviderPaginatedList.md)
 - [DocumentCategoryType](docs/DocumentCategoryType.md)
 - [DocumentDigitalSignature](docs/DocumentDigitalSignature.md)
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
 - [IndividualDataConsentRequestDetails](docs/IndividualDataConsentRequestDetails.md)
 - [IndividualDataConsentRequestDetailsPaginatedList](docs/IndividualDataConsentRequestDetailsPaginatedList.md)
 - [IssuedDocument](docs/IssuedDocument.md)
 - [IssuedDocumentDetails](docs/IssuedDocumentDetails.md)
 - [IssuedDocumentPaginatedList](docs/IssuedDocumentPaginatedList.md)
 - [Life](docs/Life.md)
 - [OrganizationDataConsentRequestDetails](docs/OrganizationDataConsentRequestDetails.md)
 - [OrganizationDataConsentRequestDetailsPaginatedList](docs/OrganizationDataConsentRequestDetailsPaginatedList.md)
 - [OrganizationFinancialAccountDto](docs/OrganizationFinancialAccountDto.md)
 - [OrganizationFinancialTransactionsDto](docs/OrganizationFinancialTransactionsDto.md)
 - [OrganizationFinancialTransactionsDtoPaginatedList](docs/OrganizationFinancialTransactionsDtoPaginatedList.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [PushUriRequest](docs/PushUriRequest.md)
 - [PushUriResponse](docs/PushUriResponse.md)
 - [SharedWith](docs/SharedWith.md)
 - [StringStringKeyValuePair](docs/StringStringKeyValuePair.md)
 - [SupportedEntityType](docs/SupportedEntityType.md)
 - [SupportedIdentifier](docs/SupportedIdentifier.md)
 - [UpdateDataProcessingAgreement](docs/UpdateDataProcessingAgreement.md)
 - [UriDetails](docs/UriDetails.md)
 - [UserAccountFinancialTransactionsDto](docs/UserAccountFinancialTransactionsDto.md)
 - [UserAccountFinancialTransactionsDtoPaginatedList](docs/UserAccountFinancialTransactionsDtoPaginatedList.md)


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

