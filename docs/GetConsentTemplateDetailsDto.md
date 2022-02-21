

# GetConsentTemplateDetailsDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**consentPurpose** | **String** |  |  [optional]
**collectables** | **List&lt;CollectibleTypes&gt;** |  |  [optional]
**fetchType** | **FetchTypes** |  |  [optional]
**shortId** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdAtUtc** | **OffsetDateTime** |  |  [optional]
**status** | **String** |  |  [optional]
**templateType** | **ConsentTemplateTypes** |  |  [optional]
**dataLife** | [**Life**](Life.md) |  |  [optional]
**requestLife** | [**Life**](Life.md) |  |  [optional]
**frequency** | [**Life**](Life.md) |  |  [optional]
**identity** | [**List&lt;IdentitySupportedFields&gt;**](IdentitySupportedFields.md) |  |  [optional]
**documents** | [**List&lt;Document&gt;**](Document.md) |  |  [optional]
**financials** | [**List&lt;Financial&gt;**](Financial.md) |  |  [optional]
**healthRecords** | **List&lt;Object&gt;** |  |  [optional]
**approvedBy** | **UUID** |  |  [optional]
**approvedAtUtc** | **OffsetDateTime** |  |  [optional]



