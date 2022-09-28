

# ConsentDetails

ConsentDetails : Consent details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Consent id. |  |
|**requestId** | **String** | Consent request id. |  |
|**templateId** | **String** | Consent request template id. |  [optional] |
|**title** | **String** | Consent title. |  |
|**description** | **String** | Consent description. |  |
|**purpose** | **String** | Consent purpose. |  [optional] |
|**status** | **DataConsentStatus** |  |  |
|**transactionId** | **String** | Transaction id. |  [optional] |
|**approvedAtUtc** | **OffsetDateTime** | Consent approval datetime in UTC timezone. |  |
|**dataAccessExpiresAtUtc** | **OffsetDateTime** | Data access expiration datetime in UTC timezone. |  |
|**revokedAtUtc** | **OffsetDateTime** | Consent revocation datetime in UTC timezone. |  [optional] |
|**collectables** | **List&lt;CollectibleTypes&gt;** | List of supported collectible types. |  |
|**identifiers** | [**List&lt;ConsentedIdentifier&gt;**](ConsentedIdentifier.md) | Consented identity details. |  [optional] |
|**documents** | [**List&lt;ConsentedDocument&gt;**](ConsentedDocument.md) | List of consented documents. |  [optional] |
|**medicalRecords** | [**List&lt;ConsentedMedicalRecord&gt;**](ConsentedMedicalRecord.md) | List of consented medical records. |  [optional] |
|**financialAccounts** | [**List&lt;ConsentedFinancialAccount&gt;**](ConsentedFinancialAccount.md) | List of consented financial accounts. |  [optional] |



