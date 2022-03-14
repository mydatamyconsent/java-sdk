

# OrganizationDataConsentDetails

Organization data consent details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approver** | **String** | Name of consent approver organization. | 
**id** | **UUID** | Data consent id. | 
**templateId** | **UUID** | Consent template id. |  [optional]
**title** | **String** | Consent title. | 
**description** | **String** | Consent description. | 
**purpose** | **String** | Consent purpose. |  [optional]
**status** | **DataConsentStatus** |  | 
**transactionId** | **String** | Transaction id. |  [optional]
**approvedAtUtc** | **OffsetDateTime** | Consent approval datetime in UTC timezone. | 
**dataAccessExpiresAtUtc** | **OffsetDateTime** | Data access expiration datetime in UTC timezone. | 
**revokedAtUtc** | **OffsetDateTime** | Consent revocation datetime in UTC timezone. |  [optional]



