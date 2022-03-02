

# DataConsentDetailsDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentRequestId** | **UUID** |  | 
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dataLife** | [**Life**](Life.md) |  |  [optional]
**requestedByOrg** | [**Requester**](Requester.md) |  |  [optional]
**status** | **DataConsentStatus** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]
**rejectedAtUtc** | **OffsetDateTime** |  |  [optional]
**revokedAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedExpiresAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedAtUtc** | **OffsetDateTime** |  |  [optional]
**identifiers** | **Object** |  |  [optional]
**documents** | [**List&lt;DataConsentDocumentDetailsDto&gt;**](DataConsentDocumentDetailsDto.md) |  |  [optional]



