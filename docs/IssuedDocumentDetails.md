

# IssuedDocumentDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Document Id. | 
**identifier** | **String** | Document Identifier. | 
**documentType** | **String** | Document type name. | 
**issuedTo** | **String** | User name. | 
**issuedAtUtc** | **OffsetDateTime** | Issued datetime in UTC timezone. | 
**expiresAtUtc** | **OffsetDateTime** | Expires datetime in UTC timezone. |  [optional]
**acceptedAtUtc** | **OffsetDateTime** | Accepted datetime in UTC timezone. |  [optional]
**receiver** | [**DocumentReceiver**](DocumentReceiver.md) |  | 
**metadata** | **Map&lt;String, String&gt;** | Metadata. |  [optional]
**digitalSignatures** | [**List&lt;DocumentDigitalSignature&gt;**](DocumentDigitalSignature.md) | Digital signatures. | 



