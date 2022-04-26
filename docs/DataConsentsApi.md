# DataConsentsApi

All URIs are relative to *https://api.mydatamyconsent.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadConsentedDocumentAnalysis**](DataConsentsApi.md#downloadConsentedDocumentAnalysis) | **GET** /v1/consents/{consentId}/documents/{documentId}/analysis | Get analysis of a consented document.
[**downloadIndividualConsentedDocumentById**](DataConsentsApi.md#downloadIndividualConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId}/download | Download individual consented document by document id.
[**downloadOrganizationConsentedDocumentById**](DataConsentsApi.md#downloadOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId}/download | Download organization consent document based on document id.
[**getAllConsentedFinancialAccounts**](DataConsentsApi.md#getAllConsentedFinancialAccounts) | **GET** /v1/consents/individuals/{consentId}/financial-accounts | Get all individual consented financial accounts.
[**getConsentFinancialAccounts**](DataConsentsApi.md#getConsentFinancialAccounts) | **GET** /v1/consents/organizations/{consentId}/financial-accounts | Get all organizational consented financial accounts.
[**getConsentedAccountById**](DataConsentsApi.md#getConsentedAccountById) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId} | Get individual consented financial account details based on account id.
[**getConsentedDocumentById**](DataConsentsApi.md#getConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId} | Get individual consented document by document id.
[**getConsentedFinancialAccount**](DataConsentsApi.md#getConsentedFinancialAccount) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId} | Get organization consented financial account details based on account id.
[**getConsentedFinancialAccountInsights**](DataConsentsApi.md#getConsentedFinancialAccountInsights) | **GET** /v1/consents/{consentId}/financial-accounts/{accountId}/insights | Get consented financial account insights.
[**getConsentedFinancialAccountTransactions**](DataConsentsApi.md#getConsentedFinancialAccountTransactions) | **GET** /v1/consents/individuals/{consentId}/financial-accounts/{accountId}/transactions | Get individual consented financial account transactions of an individual based on accountId.
[**getConsents**](DataConsentsApi.md#getConsents) | **GET** /v1/consents/individuals | Get the paginated list of individual data consents.
[**getIndividualConsentedDocuments**](DataConsentsApi.md#getIndividualConsentedDocuments) | **GET** /v1/consents/individuals/{consentId}/documents | Get individual consented documents by consent id.
[**getIndividualDataConsentById**](DataConsentsApi.md#getIndividualDataConsentById) | **GET** /v1/consents/individuals/{consentId} | Get individuals data consent details by consent id.
[**getOrgConsentedAccountTransactions**](DataConsentsApi.md#getOrgConsentedAccountTransactions) | **GET** /v1/consents/organizations/{consentId}/financial-accounts/{accountId}/transactions | Get organization consented financial account transactions of an individual based on accountId.
[**getOrganizationConsentedDocumentById**](DataConsentsApi.md#getOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId} | Get organization consent document based on document id.
[**getOrganizationConsentedDocuments**](DataConsentsApi.md#getOrganizationConsentedDocuments) | **GET** /v1/consents/organizations/{consentId}/documents | Get organization consented documents by consent id.
[**getOrganizationDataConsentById**](DataConsentsApi.md#getOrganizationDataConsentById) | **GET** /v1/consents/organizations/{consentId} | Get organizations data consent details by consent id.
[**getOrganizationDataConsents**](DataConsentsApi.md#getOrganizationDataConsents) | **GET** /v1/consents/organizations | Get the paginated list of organization data consents.


<a name="downloadConsentedDocumentAnalysis"></a>
# **downloadConsentedDocumentAnalysis**
> downloadConsentedDocumentAnalysis(consentId, documentId)

Get analysis of a consented document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | Data consent id.
    String documentId = "documentId_example"; // String | Consented document Id.
    try {
      apiInstance.downloadConsentedDocumentAnalysis(consentId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#downloadConsentedDocumentAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| Data consent id. |
 **documentId** | **String**| Consented document Id. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="downloadIndividualConsentedDocumentById"></a>
# **downloadIndividualConsentedDocumentById**
> downloadIndividualConsentedDocumentById(consentId, documentId)

Download individual consented document by document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Individual data consent id.
    String documentId = "documentId_example"; // String | Consented document id.
    try {
      apiInstance.downloadIndividualConsentedDocumentById(consentId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#downloadIndividualConsentedDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Individual data consent id. |
 **documentId** | **String**| Consented document id. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="downloadOrganizationConsentedDocumentById"></a>
# **downloadOrganizationConsentedDocumentById**
> downloadOrganizationConsentedDocumentById(consentId, documentId)

Download organization consent document based on document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Organization data consent id.
    String documentId = "documentId_example"; // String | Organization consented document Id.
    try {
      apiInstance.downloadOrganizationConsentedDocumentById(consentId, documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#downloadOrganizationConsentedDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Organization data consent id. |
 **documentId** | **String**| Organization consented document Id. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getAllConsentedFinancialAccounts"></a>
# **getAllConsentedFinancialAccounts**
> DataConsentFinancialsDto getAllConsentedFinancialAccounts(consentId)

Get all individual consented financial accounts.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentFinancialsDto result = apiInstance.getAllConsentedFinancialAccounts(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getAllConsentedFinancialAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |

### Return type

[**DataConsentFinancialsDto**](DataConsentFinancialsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsentFinancialAccounts"></a>
# **getConsentFinancialAccounts**
> DataConsentFinancialsDto getConsentFinancialAccounts(consentId)

Get all organizational consented financial accounts.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentFinancialsDto result = apiInstance.getConsentFinancialAccounts(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentFinancialAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |

### Return type

[**DataConsentFinancialsDto**](DataConsentFinancialsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsentedAccountById"></a>
# **getConsentedAccountById**
> FinancialAccount getConsentedAccountById(consentId, accountId)

Get individual consented financial account details based on account id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    try {
      FinancialAccount result = apiInstance.getConsentedAccountById(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedAccountById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |

### Return type

[**FinancialAccount**](FinancialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsentedDocumentById"></a>
# **getConsentedDocumentById**
> DataConsentDocument getConsentedDocumentById(consentId, documentId)

Get individual consented document by document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Individual data consent id.
    String documentId = "documentId_example"; // String | Consented document id.
    try {
      DataConsentDocument result = apiInstance.getConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Individual data consent id. |
 **documentId** | **String**| Consented document id. |

### Return type

[**DataConsentDocument**](DataConsentDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getConsentedFinancialAccount"></a>
# **getConsentedFinancialAccount**
> OrganizationFinancialAccountDto getConsentedFinancialAccount(consentId, accountId)

Get organization consented financial account details based on account id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    try {
      OrganizationFinancialAccountDto result = apiInstance.getConsentedFinancialAccount(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedFinancialAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |

### Return type

[**OrganizationFinancialAccountDto**](OrganizationFinancialAccountDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsentedFinancialAccountInsights"></a>
# **getConsentedFinancialAccountInsights**
> getConsentedFinancialAccountInsights(consentId, accountId)

Get consented financial account insights.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      apiInstance.getConsentedFinancialAccountInsights(consentId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedFinancialAccountInsights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**|  |
 **accountId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsentedFinancialAccountTransactions"></a>
# **getConsentedFinancialAccountTransactions**
> UserAccountFinancialTransactionsDtoPaginatedList getConsentedFinancialAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize)

Get individual consented financial account transactions of an individual based on accountId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    String filters = "filters_example"; // String | Filters.
    OffsetDateTime fromDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime toDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 10; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      UserAccountFinancialTransactionsDtoPaginatedList result = apiInstance.getConsentedFinancialAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedFinancialAccountTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |
 **filters** | **String**| Filters. | [optional]
 **fromDateTimeUtc** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **toDateTimeUtc** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 10]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**UserAccountFinancialTransactionsDtoPaginatedList**](UserAccountFinancialTransactionsDtoPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getConsents"></a>
# **getConsents**
> DataConsentDetailsPaginatedList getConsents(status, fromDateTime, toDateTime, pageNo, pageSize)

Get the paginated list of individual data consents.

GetIndividualDataConsents

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status.
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | From datetime in UTC timezone.
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | To datetime in UTC timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      DataConsentDetailsPaginatedList result = apiInstance.getConsents(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled]
 **fromDateTime** | **OffsetDateTime**| From datetime in UTC timezone. | [optional]
 **toDateTime** | **OffsetDateTime**| To datetime in UTC timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**DataConsentDetailsPaginatedList**](DataConsentDetailsPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

<a name="getIndividualConsentedDocuments"></a>
# **getIndividualConsentedDocuments**
> List&lt;DataConsentDocument&gt; getIndividualConsentedDocuments(consentId)

Get individual consented documents by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Individual data consent id.
    try {
      List<DataConsentDocument> result = apiInstance.getIndividualConsentedDocuments(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getIndividualConsentedDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Individual data consent id. |

### Return type

[**List&lt;DataConsentDocument&gt;**](DataConsentDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getIndividualDataConsentById"></a>
# **getIndividualDataConsentById**
> DataConsent getIndividualDataConsentById(consentId)

Get individuals data consent details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Individual data consent id.
    try {
      DataConsent result = apiInstance.getIndividualDataConsentById(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getIndividualDataConsentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Individual data consent id. |

### Return type

[**DataConsent**](DataConsent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getOrgConsentedAccountTransactions"></a>
# **getOrgConsentedAccountTransactions**
> OrganizationFinancialTransactionsDtoPaginatedList getOrgConsentedAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize)

Get organization consented financial account transactions of an individual based on accountId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    String filters = "filters_example"; // String | Filters.
    OffsetDateTime fromDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime toDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      OrganizationFinancialTransactionsDtoPaginatedList result = apiInstance.getOrgConsentedAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrgConsentedAccountTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |
 **filters** | **String**| Filters. | [optional]
 **fromDateTimeUtc** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **toDateTimeUtc** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**OrganizationFinancialTransactionsDtoPaginatedList**](OrganizationFinancialTransactionsDtoPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |

<a name="getOrganizationConsentedDocumentById"></a>
# **getOrganizationConsentedDocumentById**
> DataConsentDocument getOrganizationConsentedDocumentById(consentId, documentId)

Get organization consent document based on document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Organization data consent id.
    String documentId = "documentId_example"; // String | Organization consented document Id.
    try {
      DataConsentDocument result = apiInstance.getOrganizationConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationConsentedDocumentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Organization data consent id. |
 **documentId** | **String**| Organization consented document Id. |

### Return type

[**DataConsentDocument**](DataConsentDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getOrganizationConsentedDocuments"></a>
# **getOrganizationConsentedDocuments**
> List&lt;DataConsentDocument&gt; getOrganizationConsentedDocuments(consentId)

Get organization consented documents by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Organization data consent id.
    try {
      List<DataConsentDocument> result = apiInstance.getOrganizationConsentedDocuments(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationConsentedDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Organization data consent id. |

### Return type

[**List&lt;DataConsentDocument&gt;**](DataConsentDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getOrganizationDataConsentById"></a>
# **getOrganizationDataConsentById**
> DataConsent getOrganizationDataConsentById(consentId)

Get organizations data consent details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | Organization data consent id.
    try {
      DataConsent result = apiInstance.getOrganizationDataConsentById(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationDataConsentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **UUID**| Organization data consent id. |

### Return type

[**DataConsent**](DataConsent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="getOrganizationDataConsents"></a>
# **getOrganizationDataConsents**
> DataConsentDetailsPaginatedList getOrganizationDataConsents(status, fromDateTime, toDateTime, pageNo, pageSize)

Get the paginated list of organization data consents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status.
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | From datetime in UTC timezone.
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | To datetime in UTC timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      DataConsentDetailsPaginatedList result = apiInstance.getOrganizationDataConsents(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationDataConsents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled]
 **fromDateTime** | **OffsetDateTime**| From datetime in UTC timezone. | [optional]
 **toDateTime** | **OffsetDateTime**| To datetime in UTC timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**DataConsentDetailsPaginatedList**](DataConsentDetailsPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

