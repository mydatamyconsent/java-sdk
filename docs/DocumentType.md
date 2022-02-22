

# DocumentType

Issuable Document Type details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Document Type Identifier. | 
**categoryType** | **DocumentCategoryType** |  | 
**subCategoryType** | **DocumentSubCategoryType** |  | 
**name** | **String** | Document Type Name. eg: Driving License. | 
**slug** | **String** | Document Type Unique Slug. eg: \&quot;in.gov.gj.transport.dl\&quot;. | 
**description** | **String** | Document Type description. eg: Gujarat State Driving License. |  [optional]
**logoUrl** | **String** | Logo URL of document type. | 
**searchServiceName** | **String** | Document search repository service name. |  [optional]
**repositoryServiceName** | **String** | Document repository service name. |  [optional]
**supportedEntityTypes** | **List&lt;SupportedEntityType&gt;** | Supported entity types. eg: Individual, Organization. | 
**addedBy** | **String** | Name of the document type creator. | 
**payableAmount** | **Double** | Payable amount if document is chargeable. eg: 10.25. |  [optional]
**payableAmountCurrency** | **String** | Payable amount currency. eg: INR, USD etc.,. |  [optional]
**approvedAtUtc** | **OffsetDateTime** | DateTime of approval in UTC timezone. |  [optional]
**approved** | **Boolean** | Document type approval status. | 



