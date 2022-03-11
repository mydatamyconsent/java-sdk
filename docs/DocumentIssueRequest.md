

# DocumentIssueRequest

Document Issue Request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentTypeId** | **UUID** | Document type id. | 
**identifier** | **String** | Document identifier. | 
**description** | **String** | Document description. | 
**receiver** | [**DocumentReceiver**](DocumentReceiver.md) |  | 
**issuedAtUtc** | **OffsetDateTime** | Datetime of issue in UTC timezone. | 
**validFromUtc** | **OffsetDateTime** | Valid from datetime in UTC timezone. | 
**expiresAtUtc** | **OffsetDateTime** | Datetime of expiry in UTC timezone. |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata. |  [optional]



