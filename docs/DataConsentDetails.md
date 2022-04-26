

# DataConsentDetails

Data Consent details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Data consent id. | 
**requestId** | **UUID** | Consent request id. | 
**templateId** | **UUID** | Consent template id. |  [optional]
**title** | **String** | Consent title. | 
**description** | **String** | Consent description. | 
**purpose** | **String** | Consent purpose. |  [optional]
**status** | **DataConsentStatus** |  | 
**transactionId** | **String** | Transaction id. |  [optional]
**requestedAtUtc** | **OffsetDateTime** | Consent requested datetime in UTC timezone. | 
**approvedAtUtc** | **OffsetDateTime** | Consent approval datetime in UTC timezone. | 
**dataAccessExpiresAtUtc** | **OffsetDateTime** | Data access expiration datetime in UTC timezone. | 
**revokedAtUtc** | **OffsetDateTime** | Consent revocation datetime in UTC timezone. |  [optional]



