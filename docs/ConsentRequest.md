

# ConsentRequest

ConsentRequest :Consent request details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Consent request id. |  |
|**templateId** | **String** | Consent request template id. |  [optional] |
|**consentId** | **String** | Consent id. |  [optional] |
|**title** | **String** | Consent title. |  |
|**description** | **String** | Consent description. |  |
|**purpose** | **String** | Consent purpose. |  [optional] |
|**dataLife** | [**Life**](Life.md) |  |  [optional] |
|**collectables** | **List&lt;CollectibleTypes&gt;** | List of supported collectables. |  |
|**receiver** | [**ConsentRequestReceiver**](ConsentRequestReceiver.md) |  |  |
|**status** | **DataConsentStatus** |  |  |
|**createdAtUtc** | **OffsetDateTime** | Request creation datetime in UTC timezone. |  |
|**expiresAtUtc** | **OffsetDateTime** | Request expiration datetime in UTC timezone. |  |
|**approvedAtUtc** | **OffsetDateTime** | Request approval datetime in UTC timezone. |  [optional] |
|**dataAccessExpiresAtUtc** | **OffsetDateTime** | Data access expiration datetime in UTC timezone. |  [optional] |
|**rejectedAtUtc** | **OffsetDateTime** | Request rejection datetime in UTC timezone. |  [optional] |
|**revokedAtUtc** | **OffsetDateTime** | Request revocation datetime in UTC timezone. |  [optional] |



