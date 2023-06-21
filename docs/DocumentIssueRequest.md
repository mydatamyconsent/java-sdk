

# DocumentIssueRequest

DocumentIssueRequest : Document Issue Request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentTypeId** | **String** | Document type id. |  |
|**identifier** | **String** | Document identifier. |  |
|**name** | **String** | Document name (Optional). |  [optional] |
|**description** | **String** | Document description. |  |
|**receiver** | [**DocumentIssueRequestReceiver**](DocumentIssueRequestReceiver.md) |  |  |
|**paymentRequest** | [**DocumentIssueRequestPaymentRequest**](DocumentIssueRequestPaymentRequest.md) |  |  [optional] |
|**issuedAtUtc** | **OffsetDateTime** | Datetime of issue in UTC timezone. |  |
|**validFromUtc** | **OffsetDateTime** | Valid from datetime in UTC timezone. |  |
|**expiresAtUtc** | **OffsetDateTime** | Datetime of expiry in UTC timezone. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Metadata. |  [optional] |



