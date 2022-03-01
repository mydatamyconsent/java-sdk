

# DataConsentDetailsDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  | 
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dataLife** | [**Life**](Life.md) |  |  [optional]
**requestedByOrg** | [**Requester**](Requester.md) |  |  [optional]
**status** | **DataConsentStatus** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]
**rejectedAtUtc** | **OffsetDateTime** |  |  [optional]
**expiresAtUtc** | **OffsetDateTime** |  |  [optional]
**requestedAtUtc** | **OffsetDateTime** |  |  [optional]
**identifiers** | **Object** |  |  [optional]
**documents** | [**List&lt;DataConsentDocumentDetailsDto&gt;**](DataConsentDocumentDetailsDto.md) |  |  [optional]
**financials** | **String** |  |  [optional]
**healthRecords** | **String** |  |  [optional]



