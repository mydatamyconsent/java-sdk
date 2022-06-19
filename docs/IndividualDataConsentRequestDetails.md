

# IndividualDataConsentRequestDetails

DataConsentRequestResponse

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receiver** | **String** | Name of request receiver individual. |  |
|**id** | **UUID** | Consent request id |  |
|**templateId** | **UUID** | Consent request template id |  [optional] |
|**consentId** | **UUID** | Data Consent id |  [optional] |
|**title** | **String** | Consent request title. |  |
|**description** | **String** | Consent request description. |  |
|**purpose** | **String** | Consent request purpose. |  [optional] |
|**status** | **DataConsentStatus** |  |  |
|**transactionId** | **String** | Transaction id |  [optional] |
|**createdAtUtc** | **OffsetDateTime** | Request creation datetime in UTC timezone |  |
|**expiresAtUtc** | **OffsetDateTime** | Request expiration datetime in UTC timezone |  |



