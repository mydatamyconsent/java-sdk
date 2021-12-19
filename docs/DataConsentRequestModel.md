

# DataConsentRequestModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationId** | **UUID** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**identifiers** | **Map&lt;String, String&gt;** |  |  [optional]
**startDateTime** | **OffsetDateTime** |  |  [optional]
**expiryDateTime** | **OffsetDateTime** |  |  [optional]
**description** | **String** |  |  [optional]
**purposeCode** | **String** |  |  [optional]
**purposeLink** | **String** |  |  [optional]
**dataLifeUnit** | **DataLifeUnit** |  |  [optional]
**dataLifeValue** | **Integer** |  |  [optional]
**dataFetchFrequencyUnit** | **DataFetchFrequencyUnit** |  |  [optional]
**dataFetchFrequencyUnitValue** | **Integer** |  |  [optional]
**dataFetchType** | **DataFetchType** |  |  [optional]
**agreementId** | **UUID** |  |  [optional]
**identityClaims** | **List&lt;IdentityClaim&gt;** |  |  [optional]
**financialAccounts** | [**List&lt;DataConsentRequestedFaDto&gt;**](DataConsentRequestedFaDto.md) |  |  [optional]
**documents** | [**List&lt;DataConsentRequestedDocumentDto&gt;**](DataConsentRequestedDocumentDto.md) |  |  [optional]



