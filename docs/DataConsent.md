

# DataConsent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**userId** | **UUID** |  |  [optional]
**organizationId** | **UUID** |  |  [optional]
**requestedByOrgId** | **UUID** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**startDateTime** | **OffsetDateTime** |  |  [optional]
**expiryDateTime** | **OffsetDateTime** |  |  [optional]
**description** | **String** |  |  [optional]
**purposeCode** | **String** |  |  [optional]
**purposeLink** | **String** |  |  [optional]
**location** | **String** |  |  [optional]
**agreementId** | **UUID** |  |  [optional]
**dataLifeUnit** | **DataLifeUnit** |  |  [optional]
**dataLifeValue** | **Integer** |  |  [optional]
**dataFetchFrequencyUnit** | **DataFetchFrequencyUnit** |  |  [optional]
**dataFetchFrequencyUnitValue** | **Integer** |  |  [optional]
**dataFetchType** | **DataFetchType** |  |  [optional]
**status** | **DataConsentStatus** |  |  [optional]
**createdAtUtc** | **OffsetDateTime** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]
**rejectedAtUtc** | **OffsetDateTime** |  |  [optional]
**user** | [**ApplicationUser**](ApplicationUser.md) |  |  [optional]
**organization** | [**Organization**](Organization.md) |  |  [optional]
**requestedByOrg** | [**Organization**](Organization.md) |  |  [optional]
**agreement** | [**DataProcessingAgreement**](DataProcessingAgreement.md) |  |  [optional]
**identityClaims** | **List&lt;IdentityClaim&gt;** |  |  [optional]
**identifiers** | [**List&lt;DataConsentIdentifier&gt;**](DataConsentIdentifier.md) |  |  [optional]
**requestedFinancialAccounts** | [**List&lt;DataConsentRequestedFinancialAccount&gt;**](DataConsentRequestedFinancialAccount.md) |  |  [optional]
**requestedDocuments** | [**List&lt;DataConsentRequestedDocument&gt;**](DataConsentRequestedDocument.md) |  |  [optional]



