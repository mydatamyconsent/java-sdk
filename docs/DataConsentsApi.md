# DataConsentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ConsentsConsentIdAccountsAccountIdGet**](DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdGet) | **GET** /v1/consents/{consentId}/accounts/{accountId} | Get consented financial account details.
[**v1ConsentsConsentIdAccountsAccountIdInsightsGet**](DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdInsightsGet) | **GET** /v1/consents/{consentId}/accounts/{accountId}/insights | Get consented financial account insights.
[**v1ConsentsConsentIdAccountsAccountIdTransactionsGet**](DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdTransactionsGet) | **GET** /v1/consents/{consentId}/accounts/{accountId}/transactions | Get consented financial account transactions.
[**v1ConsentsConsentIdAccountsGet**](DataConsentsApi.md#v1ConsentsConsentIdAccountsGet) | **GET** /v1/consents/{consentId}/accounts | Get all accounts in a consent.
[**v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet**](DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet) | **GET** /v1/consents/{consentId}/documents/{documentId}/analysis | Get analysis of a consented document.
[**v1ConsentsConsentIdDocumentsDocumentIdDownloadGet**](DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/consents/{consentId}/documents/{documentId}/download | Download a consented document.
[**v1ConsentsConsentIdDocumentsDocumentIdGet**](DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/consents/{consentId}/documents/{documentId} | Get consented document details.
[**v1ConsentsConsentIdDocumentsGet**](DataConsentsApi.md#v1ConsentsConsentIdDocumentsGet) | **GET** /v1/consents/{consentId}/documents | Get all documents in a consent.
[**v1ConsentsConsentIdGet**](DataConsentsApi.md#v1ConsentsConsentIdGet) | **GET** /v1/consents/{consentId} | Get consent details by consent id.
[**v1ConsentsGet**](DataConsentsApi.md#v1ConsentsGet) | **GET** /v1/consents | Get all consents filtered by status and time.


<a name="v1ConsentsConsentIdAccountsAccountIdGet"></a>
# **v1ConsentsConsentIdAccountsAccountIdGet**
> Object v1ConsentsConsentIdAccountsAccountIdGet(consentId, accountId)

Get consented financial account details.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdAccountsAccountIdGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdAccountsAccountIdGet");
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

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdAccountsAccountIdInsightsGet"></a>
# **v1ConsentsConsentIdAccountsAccountIdInsightsGet**
> Object v1ConsentsConsentIdAccountsAccountIdInsightsGet(consentId, accountId)

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdAccountsAccountIdInsightsGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdAccountsAccountIdInsightsGet");
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

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdAccountsAccountIdTransactionsGet"></a>
# **v1ConsentsConsentIdAccountsAccountIdTransactionsGet**
> Object v1ConsentsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDate, toDate)

Get consented financial account transactions.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String filters = "filters_example"; // String | 
    OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDate, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdAccountsAccountIdTransactionsGet");
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
 **filters** | **String**|  | [optional]
 **fromDate** | **OffsetDateTime**|  | [optional]
 **toDate** | **OffsetDateTime**|  | [optional]

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdAccountsGet"></a>
# **v1ConsentsConsentIdAccountsGet**
> Object v1ConsentsConsentIdAccountsGet(consentId)

Get all accounts in a consent.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdAccountsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdAccountsGet");
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

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet"></a>
# **v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet**
> Object v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet(consentId, documentId)

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | Document Id.
    try {
      Object result = apiInstance.v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet");
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
 **documentId** | **String**| Document Id. |

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdDocumentsDocumentIdDownloadGet"></a>
# **v1ConsentsConsentIdDocumentsDocumentIdDownloadGet**
> Object v1ConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId)

Download a consented document.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | Document Id.
    try {
      Object result = apiInstance.v1ConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdDocumentsDocumentIdDownloadGet");
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
 **documentId** | **String**| Document Id. |

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdDocumentsDocumentIdGet"></a>
# **v1ConsentsConsentIdDocumentsDocumentIdGet**
> Object v1ConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId)

Get consented document details.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | Document Id.
    try {
      Object result = apiInstance.v1ConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdDocumentsDocumentIdGet");
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
 **documentId** | **String**| Document Id. |

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdDocumentsGet"></a>
# **v1ConsentsConsentIdDocumentsGet**
> Object v1ConsentsConsentIdDocumentsGet(consentId)

Get all documents in a consent.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdDocumentsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdDocumentsGet");
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

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsConsentIdGet"></a>
# **v1ConsentsConsentIdGet**
> Object v1ConsentsConsentIdGet(consentId)

Get consent details by consent id.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      Object result = apiInstance.v1ConsentsConsentIdGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsConsentIdGet");
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

### Return type

**Object**

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
**0** | Error |  -  |

<a name="v1ConsentsGet"></a>
# **v1ConsentsGet**
> Object v1ConsentsGet(status, startDate, endDate)

Get all consents filtered by status and time.

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
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | System.DateTime.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | till dateSystem.DateTime.
    try {
      Object result = apiInstance.v1ConsentsGet(status, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsGet");
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
 **status** | [**DataConsentStatus**](.md)| MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired]
 **startDate** | **OffsetDateTime**| System.DateTime. | [optional]
 **endDate** | **OffsetDateTime**| till dateSystem.DateTime. | [optional]

### Return type

**Object**

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
**0** | Error |  -  |

