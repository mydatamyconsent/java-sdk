

# DataConsentDetailsDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**requester** | [**DataConsentRequesterDto**](DataConsentRequesterDto.md) |  |  [optional]
**location** | **String** |  |  [optional]
**personalInfoRequested** | **Boolean** |  |  [optional]
**documents** | **Integer** |  |  [optional]
**financialAccounts** | **Integer** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**purposeCode** | **String** |  |  [optional]
**purposeLink** | **String** |  |  [optional]
**agreementId** | **UUID** |  |  [optional]
**dataLifeUnit** | **DataLifeUnit** |  |  [optional]
**dataLifeValue** | **Integer** |  |  [optional]
**dataFetchFrequencyUnit** | **DataFetchFrequencyUnit** |  |  [optional]
**dataFetchFrequencyUnitValue** | **Integer** |  |  [optional]
**dataFetchType** | **DataFetchType** |  |  [optional]
**status** | **DataConsentStatus** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]
**rejectedAtUtc** | **OffsetDateTime** |  |  [optional]
**expiresAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedFinancialAccounts** | [**List&lt;DataConsentRequestedAccountDto&gt;**](DataConsentRequestedAccountDto.md) |  |  [optional]
**requestedDocuments** | [**List&lt;DataConsentRequestedDocumentDto&gt;**](DataConsentRequestedDocumentDto.md) |  |  [optional]
**requestedHealthData** | [**List&lt;DataConsentRequestedDocument&gt;**](DataConsentRequestedDocument.md) |  |  [optional]
**requestedIdentityDetails** | [**JsonSchema**](JsonSchema.md) |  |  [optional]



