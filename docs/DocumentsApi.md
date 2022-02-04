# DocumentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issueDocument**](DocumentsApi.md#issueDocument) | **POST** /v1/documents/issue | Issue a new document.
[**v1DocumentsIssuedDocumentIdGet**](DocumentsApi.md#v1DocumentsIssuedDocumentIdGet) | **GET** /v1/documents/issued/{documentId} | Get issued document.
[**v1DocumentsIssuedGet**](DocumentsApi.md#v1DocumentsIssuedGet) | **GET** /v1/documents/issued | Get issued documents.
[**v1DocumentsTypesGet**](DocumentsApi.md#v1DocumentsTypesGet) | **GET** /v1/documents/types | Get registered document types.


<a name="issueDocument"></a>
# **issueDocument**
> Boolean issueDocument(documentIssueRequest)

Issue a new document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentIssueRequest documentIssueRequest = new DocumentIssueRequest(); // DocumentIssueRequest | 
    try {
      Boolean result = apiInstance.issueDocument(documentIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#issueDocument");
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
 **documentIssueRequest** | [**DocumentIssueRequest**](DocumentIssueRequest.md)|  | [optional]

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Server Error |  -  |
**200** | Success |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

<a name="v1DocumentsIssuedDocumentIdGet"></a>
# **v1DocumentsIssuedDocumentIdGet**
> v1DocumentsIssuedDocumentIdGet(documentId)

Get issued document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID documentId = UUID.randomUUID(); // UUID | Document id.
    try {
      apiInstance.v1DocumentsIssuedDocumentIdGet(documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#v1DocumentsIssuedDocumentIdGet");
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
 **documentId** | **UUID**| Document id. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Server Error |  -  |

<a name="v1DocumentsIssuedGet"></a>
# **v1DocumentsIssuedGet**
> v1DocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageSize, pageNo)

Get issued documents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID documentTypeId = UUID.randomUUID(); // UUID | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageSize = 25; // Integer | 
    Integer pageNo = 1; // Integer | 
    try {
      apiInstance.v1DocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageSize, pageNo);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#v1DocumentsIssuedGet");
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
 **documentTypeId** | **UUID**|  | [optional]
 **fromDateTime** | **OffsetDateTime**|  | [optional]
 **toDateTime** | **OffsetDateTime**|  | [optional]
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **pageNo** | **Integer**|  | [optional] [default to 1]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Server Error |  -  |

<a name="v1DocumentsTypesGet"></a>
# **v1DocumentsTypesGet**
> v1DocumentsTypesGet(pageSize, pageNo)

Get registered document types.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    Integer pageSize = 25; // Integer | 
    Integer pageNo = 1; // Integer | 
    try {
      apiInstance.v1DocumentsTypesGet(pageSize, pageNo);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#v1DocumentsTypesGet");
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
 **pageSize** | **Integer**|  | [optional] [default to 25]
 **pageNo** | **Integer**|  | [optional] [default to 1]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Server Error |  -  |

