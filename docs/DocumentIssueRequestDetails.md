

# DocumentIssueRequestDetails

Document issue request details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Document issue request Id. | 
**documentTypeId** | **UUID** | Document type Id. | 
**typeName** | **String** | Document type name. | 
**identifier** | **String** | Document identifier. | 
**status** | **DocumentIssueRequestStatus** |  | 
**description** | **String** | Document description. | 
**receiver** | **Object** | Document receiver details. | 
**issuedAtUtc** | **OffsetDateTime** | Datetime of issue in UTC timezone. | 
**validFromUtc** | **OffsetDateTime** | Valid from datetime in UTC timezone. | 
**expiresAtUtc** | **OffsetDateTime** | Datetime of expiry in UTC timezone. |  [optional]
**metaData** | **Object** | Metadata. |  [optional]
**createdAtUtc** | **OffsetDateTime** | Creation datetime of issue request in UTC timezone. | 



