

# DataConsentDetailsDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**status** | **DataConsentStatus** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]
**rejectedAtUtc** | **OffsetDateTime** |  |  [optional]
**expiresAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedAtUtc** | **OffsetDateTime** |  |  [optional]
**requester** | [**DataConsentRequesterDto**](DataConsentRequesterDto.md) |  |  [optional]
**consentDetails** | [**GetConsentTemplateDetailsDto**](GetConsentTemplateDetailsDto.md) |  |  [optional]
**identifiers** | [**List&lt;DataConsentIdentifier&gt;**](DataConsentIdentifier.md) |  |  [optional]
**approvedDocuments** | [**List&lt;DataConsentRequestedDocument&gt;**](DataConsentRequestedDocument.md) |  |  [optional]
**approvedFinancials** | [**List&lt;DataConsentRequestedFinancialAccount&gt;**](DataConsentRequestedFinancialAccount.md) |  |  [optional]



