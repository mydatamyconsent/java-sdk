

# DocumentIssueRequestDetails

DocumentIssueRequestDetails : Document issue request details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Document issue request Id. |  |
|**documentTypeId** | **String** | Document type Id. |  |
|**typeName** | **String** | Document type name. |  |
|**identifier** | **String** | Document identifier. |  |
|**status** | **DocumentIssueRequestStatus** |  |  |
|**description** | **String** | Document description. |  |
|**receiver** | [**DocumentIssueRequestDetailsReceiver**](DocumentIssueRequestDetailsReceiver.md) |  |  |
|**paymentRequest** | [**PaymentRequest**](PaymentRequest.md) |  |  [optional] |
|**issuedAtUtc** | **OffsetDateTime** | Datetime of issue in UTC timezone. |  |
|**validFromUtc** | **OffsetDateTime** | Valid from datetime in UTC timezone. |  |
|**expiresAtUtc** | **OffsetDateTime** | Datetime of expiry in UTC timezone. |  [optional] |
|**metaData** | **Object** | Metadata. |  [optional] |
|**createdAtUtc** | **OffsetDateTime** | Creation datetime of issue request in UTC timezone. |  |



