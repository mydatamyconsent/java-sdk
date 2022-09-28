

# OrganizationConsentRequestTemplateDetails

OrganizationConsentRequestTemplateDetails : Organization consent request template details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Consent request template id. |  |
|**title** | **String** | Consent request template title. |  |
|**description** | **String** | Consent request template description. |  |
|**purpose** | **String** | Consent request template purpose. |  [optional] |
|**shortId** | **String** | Consent request template short Id. |  |
|**status** | [**ConsentRequestTemplateStatus**](ConsentRequestTemplateStatus.md) |  |  |
|**dataLife** | [**IndividualConsentRequestTemplateDetailsDataLife**](IndividualConsentRequestTemplateDetailsDataLife.md) |  |  [optional] |
|**requestLife** | [**IndividualConsentRequestTemplateDetailsRequestLife**](IndividualConsentRequestTemplateDetailsRequestLife.md) |  |  [optional] |
|**dataFrequency** | [**IndividualConsentRequestTemplateDetailsDataFrequency**](IndividualConsentRequestTemplateDetailsDataFrequency.md) |  |  [optional] |
|**identifiers** | [**List&lt;IdentityField&gt;**](IdentityField.md) | Consent request template identity fields. |  [optional] |
|**documents** | [**List&lt;DocumentField&gt;**](DocumentField.md) | Consent request template document fields. |  [optional] |
|**financialAccounts** | [**List&lt;FinancialAccountField&gt;**](FinancialAccountField.md) | Consent request template financial account fields. |  [optional] |
|**createdBy** | **String** | Consent request template created by user. |  |
|**createdAtUtc** | **OffsetDateTime** | Consent request template created datetime in UTC timezone. |  |
|**approvedAtUtc** | **OffsetDateTime** | Consent request template approval datetime in UTC timezone. |  [optional] |
|**publishedAtUtc** | **OffsetDateTime** | Consent request template published datetime in UTC timezone. |  [optional] |
|**rejectedAtUtc** | **OffsetDateTime** | Consent request template rejection datetime in UTC timezone. |  [optional] |
|**rejectionReason** | **String** | Consent request template rejection reason. |  [optional] |



