# DocumentsApi

All URIs are relative to *https://api.mydatamyconsent.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssuedDocumentById**](DocumentsApi.md#getIssuedDocumentById) | **GET** /v1/documents/issued/{documentId} | Get issued document.
[**getIssuedDocuments**](DocumentsApi.md#getIssuedDocuments) | **GET** /v1/documents/issued/{documentTypeId} | Get paginated list of issued documents of given document type.
[**getRegisteredDocumentTypes**](DocumentsApi.md#getRegisteredDocumentTypes) | **GET** /v1/documents/types | Get paginated list of registered document types.
[**issueDocumentToIndividual**](DocumentsApi.md#issueDocumentToIndividual) | **POST** /v1/documents/issue/individual | Issue a new document to an individual user.
[**issueDocumentToOrganization**](DocumentsApi.md#issueDocumentToOrganization) | **POST** /v1/documents/issue/organization | Issue a new document to an organization.
[**uploadDocumentForIndividual**](DocumentsApi.md#uploadDocumentForIndividual) | **POST** /v1/documents/issue/individual/upload/{issueRequestId} | Upload a document for issuance request of individual.
[**uploadDocumentForOrganization**](DocumentsApi.md#uploadDocumentForOrganization) | **POST** /v1/documents/issue/organization/upload/{issueRequestId} | Upload a document for issuance request of organization.


<a name="getIssuedDocumentById"></a>
# **getIssuedDocumentById**
> IssuedDocument getIssuedDocumentById(documentId)

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID documentId = UUID.randomUUID(); // UUID | Document id.
    try {
      IssuedDocument result = apiInstance.getIssuedDocumentById(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getIssuedDocumentById");
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

[**IssuedDocument**](IssuedDocument.md)

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
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

<a name="getIssuedDocuments"></a>
# **getIssuedDocuments**
> IssuedDocumentPaginatedList getIssuedDocuments(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize)

Get paginated list of issued documents of given document type.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID documentTypeId = UUID.randomUUID(); // UUID | Document type id.
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | From DateTime in UTC timezone.
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | To DateTime in UTC timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      IssuedDocumentPaginatedList result = apiInstance.getIssuedDocuments(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getIssuedDocuments");
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
 **documentTypeId** | **UUID**| Document type id. |
 **fromDateTime** | **OffsetDateTime**| From DateTime in UTC timezone. | [optional]
 **toDateTime** | **OffsetDateTime**| To DateTime in UTC timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**IssuedDocumentPaginatedList**](IssuedDocumentPaginatedList.md)

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
**400** | Bad Request |  -  |

<a name="getRegisteredDocumentTypes"></a>
# **getRegisteredDocumentTypes**
> DocumentTypePaginatedList getRegisteredDocumentTypes(pageNo, pageSize)

Get paginated list of registered document types.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      DocumentTypePaginatedList result = apiInstance.getRegisteredDocumentTypes(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getRegisteredDocumentTypes");
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
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**DocumentTypePaginatedList**](DocumentTypePaginatedList.md)

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
**400** | Bad Request |  -  |

<a name="issueDocumentToIndividual"></a>
# **issueDocumentToIndividual**
> DocumentIssueRequestDetails issueDocumentToIndividual(documentIssueRequest)

Issue a new document to an individual user.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentIssueRequest documentIssueRequest = new DocumentIssueRequest(); // DocumentIssueRequest | Document issue request payload
    try {
      DocumentIssueRequestDetails result = apiInstance.issueDocumentToIndividual(documentIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#issueDocumentToIndividual");
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
 **documentIssueRequest** | [**DocumentIssueRequest**](DocumentIssueRequest.md)| Document issue request payload |

### Return type

[**DocumentIssueRequestDetails**](DocumentIssueRequestDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

<a name="issueDocumentToOrganization"></a>
# **issueDocumentToOrganization**
> DocumentIssueRequestDetails issueDocumentToOrganization(documentIssueRequest)

Issue a new document to an organization.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentIssueRequest documentIssueRequest = new DocumentIssueRequest(); // DocumentIssueRequest | Document issue request payload
    try {
      DocumentIssueRequestDetails result = apiInstance.issueDocumentToOrganization(documentIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#issueDocumentToOrganization");
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
 **documentIssueRequest** | [**DocumentIssueRequest**](DocumentIssueRequest.md)| Document issue request payload |

### Return type

[**DocumentIssueRequestDetails**](DocumentIssueRequestDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="uploadDocumentForIndividual"></a>
# **uploadDocumentForIndividual**
> uploadDocumentForIndividual(issueRequestId, formFile)

Upload a document for issuance request of individual.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID issueRequestId = UUID.randomUUID(); // UUID | Document issue request id.
    File formFile = new File("/path/to/file"); // File | 
    try {
      apiInstance.uploadDocumentForIndividual(issueRequestId, formFile);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadDocumentForIndividual");
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
 **issueRequestId** | **UUID**| Document issue request id. |
 **formFile** | **File**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

<a name="uploadDocumentForOrganization"></a>
# **uploadDocumentForOrganization**
> uploadDocumentForOrganization(issueRequestId, formFile)

Upload a document for issuance request of organization.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    UUID issueRequestId = UUID.randomUUID(); // UUID | Document issue request id System.Guid.
    File formFile = new File("/path/to/file"); // File | 
    try {
      apiInstance.uploadDocumentForOrganization(issueRequestId, formFile);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadDocumentForOrganization");
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
 **issueRequestId** | **UUID**| Document issue request id System.Guid. |
 **formFile** | **File**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |
**400** | Bad Request |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

