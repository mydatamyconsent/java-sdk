

# ConsentedDocument

ConsentedDocument : Consented document details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Document id. |  |
|**name** | **String** | Document name. |  |
|**category** | **String** | Document category. |  |
|**identifier** | **String** | Document identifier. |  |
|**fieldTitle** | **String** | Document field title. |  |
|**fieldSlug** | **String** | Document field slug. |  |
|**issuedAtUtc** | **OffsetDateTime** | Document issued at datetime in UTC timezone. |  |
|**expiresAtUtc** | **OffsetDateTime** | Document expires at datetime in UTC timezone. |  [optional] |
|**issuer** | [**ConsentDocumentIssuer**](ConsentDocumentIssuer.md) |  |  |
|**digitalSignatures** | [**List&lt;DocumentDigitalSignature&gt;**](DocumentDigitalSignature.md) | Digital signatures. |  |



