

# DataConsentRequest

Data consent request details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Data consent request id. | 
**templateId** | **UUID** | Data consent template id. |  [optional]
**title** | **String** | Data consent title. | 
**description** | **String** | Data consent description. | 
**purpose** | **String** | Data consent purpose. |  [optional]
**dataLife** | [**Life**](Life.md) |  |  [optional]
**collectables** | **List&lt;CollectibleTypes&gt;** | List of supported collectables. | 
**status** | **DataConsentStatus** |  | 
**createdAtUtc** | **OffsetDateTime** | Request creation datetime in UTC timezone. | 
**expiresAtUtc** | **OffsetDateTime** | Request expiration datetime in UTC timezone. | 
**approvedAtUtc** | **OffsetDateTime** | Request approval datetime in UTC timezone. |  [optional]
**dataAccessExpiresAtUtc** | **OffsetDateTime** | Data access expiration datetime in UTC timezone. |  [optional]
**rejectedAtUtc** | **OffsetDateTime** | Request rejection datetime in UTC timezone. |  [optional]
**revokedAtUtc** | **OffsetDateTime** | Request revocation datetime in UTC timezone. |  [optional]



