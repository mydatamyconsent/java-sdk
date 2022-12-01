# OrganizationsApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1OrganizationsConsentRequestsGet**](OrganizationsApi.md#v1OrganizationsConsentRequestsGet) | **GET** /v1/organizations/consent-requests | Get all consent requests sent to Organizations. |
| [**v1OrganizationsConsentRequestsPost**](OrganizationsApi.md#v1OrganizationsConsentRequestsPost) | **POST** /v1/organizations/consent-requests | Create consent request for an Organization. |
| [**v1OrganizationsConsentRequestsRequestIdCancelPut**](OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdCancelPut) | **PUT** /v1/organizations/consent-requests/{request_id}/cancel | Cancel the  Organization data request by id. |
| [**v1OrganizationsConsentRequestsRequestIdGet**](OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdGet) | **GET** /v1/organizations/consent-requests/{request_id} | Get Organization data request by id. |
| [**v1OrganizationsConsentTemplatesGet**](OrganizationsApi.md#v1OrganizationsConsentTemplatesGet) | **GET** /v1/organizations/consent-templates | Get the paginated list of organization consent templates. |
| [**v1OrganizationsConsentTemplatesTemplateIdGet**](OrganizationsApi.md#v1OrganizationsConsentTemplatesTemplateIdGet) | **GET** /v1/organizations/consent-templates/{template_id} | Get Organization consent template details by consent id. |
| [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id}/download | Download Organization consent document by document id. |
| [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id} | Get Organization consent document based on document id and consent id. |
| [**v1OrganizationsConsentsConsentIdDocumentsGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsGet) | **GET** /v1/organizations/consents/{consent_id}/documents | Get Organization consent document by consent id. |
| [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id} | Get organization consented financial account details. |
| [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get organization consented financial account transactions. |
| [**v1OrganizationsConsentsConsentIdFinancialAccountsGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts | Get all organization consented financial accounts. |
| [**v1OrganizationsConsentsConsentIdGet**](OrganizationsApi.md#v1OrganizationsConsentsConsentIdGet) | **GET** /v1/organizations/consents/{consent_id} | Get Organization consent request details by consent id. |
| [**v1OrganizationsConsentsGet**](OrganizationsApi.md#v1OrganizationsConsentsGet) | **GET** /v1/organizations/consents | Get the paginated list of Organization consents. |
| [**v1OrganizationsDocumentsIssuePost**](OrganizationsApi.md#v1OrganizationsDocumentsIssuePost) | **POST** /v1/organizations/documents/issue | Issue a new document to an organization. |
| [**v1OrganizationsDocumentsIssueUploadIssueRequestIdPost**](OrganizationsApi.md#v1OrganizationsDocumentsIssueUploadIssueRequestIdPost) | **POST** /v1/organizations/documents/issue/upload/{issue_request_id} | Upload a document for issuance request of Organization. |
| [**v1OrganizationsDocumentsIssuedDocumentIdGet**](OrganizationsApi.md#v1OrganizationsDocumentsIssuedDocumentIdGet) | **GET** /v1/organizations/documents/issued/{document_id} | Get issued document. |
| [**v1OrganizationsDocumentsIssuedGet**](OrganizationsApi.md#v1OrganizationsDocumentsIssuedGet) | **GET** /v1/organizations/documents/issued | Get paginated list of issued documents of given document type. |
| [**v1OrganizationsDocumentsTypesGet**](OrganizationsApi.md#v1OrganizationsDocumentsTypesGet) | **GET** /v1/organizations/documents/types | Get paginated list of registered document types. |


<a name="v1OrganizationsConsentRequestsGet"></a>
# **v1OrganizationsConsentRequestsGet**
> PaginatedListOfOrganizationConsentRequestDetailss v1OrganizationsConsentRequestsGet(status, fromDateTime, toDateTime, pageNo, pageSize)

Get all consent requests sent to Organizations.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfOrganizationConsentRequestDetailss result = apiInstance.v1OrganizationsConsentRequestsGet(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentRequestsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled] |
| **fromDateTime** | **OffsetDateTime**|  | [optional] |
| **toDateTime** | **OffsetDateTime**|  | [optional] |
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfOrganizationConsentRequestDetailss**](PaginatedListOfOrganizationConsentRequestDetailss.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentRequestsPost"></a>
# **v1OrganizationsConsentRequestsPost**
> OrganizationConsentRequestDetails v1OrganizationsConsentRequestsPost(createConsentRequest)

Create consent request for an Organization.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    CreateConsentRequest createConsentRequest = new CreateConsentRequest(); // CreateConsentRequest | 
    try {
      OrganizationConsentRequestDetails result = apiInstance.v1OrganizationsConsentRequestsPost(createConsentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentRequestsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createConsentRequest** | [**CreateConsentRequest**](CreateConsentRequest.md)|  | |

### Return type

[**OrganizationConsentRequestDetails**](OrganizationConsentRequestDetails.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentRequestsRequestIdCancelPut"></a>
# **v1OrganizationsConsentRequestsRequestIdCancelPut**
> Boolean v1OrganizationsConsentRequestsRequestIdCancelPut(requestId)

Cancel the  Organization data request by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      Boolean result = apiInstance.v1OrganizationsConsentRequestsRequestIdCancelPut(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentRequestsRequestIdCancelPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**|  | |

### Return type

**Boolean**

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentRequestsRequestIdGet"></a>
# **v1OrganizationsConsentRequestsRequestIdGet**
> ConsentRequest v1OrganizationsConsentRequestsRequestIdGet(requestId)

Get Organization data request by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      ConsentRequest result = apiInstance.v1OrganizationsConsentRequestsRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentRequestsRequestIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**|  | |

### Return type

[**ConsentRequest**](ConsentRequest.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentTemplatesGet"></a>
# **v1OrganizationsConsentTemplatesGet**
> PaginatedListOfConsentRequestTemplates v1OrganizationsConsentTemplatesGet(pageNo, pageSize)

Get the paginated list of organization consent templates.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfConsentRequestTemplates result = apiInstance.v1OrganizationsConsentTemplatesGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentTemplatesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfConsentRequestTemplates**](PaginatedListOfConsentRequestTemplates.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentTemplatesTemplateIdGet"></a>
# **v1OrganizationsConsentTemplatesTemplateIdGet**
> OrganizationConsentRequestTemplateDetails v1OrganizationsConsentTemplatesTemplateIdGet(templateId)

Get Organization consent template details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String templateId = "templateId_example"; // String | 
    try {
      OrganizationConsentRequestTemplateDetails result = apiInstance.v1OrganizationsConsentTemplatesTemplateIdGet(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentTemplatesTemplateIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateId** | **String**|  | |

### Return type

[**OrganizationConsentRequestTemplateDetails**](OrganizationConsentRequestTemplateDetails.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet"></a>
# **v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet**
> File v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId)

Download Organization consent document by document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      File result = apiInstance.v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |
| **documentId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * CONTENT-DISPOSITION -  <br>  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet"></a>
# **v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet**
> ConsentedDocument v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId)

Get Organization consent document based on document id and consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      ConsentedDocument result = apiInstance.v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |
| **documentId** | **String**|  | |

### Return type

[**ConsentedDocument**](ConsentedDocument.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdDocumentsGet"></a>
# **v1OrganizationsConsentsConsentIdDocumentsGet**
> List&lt;ConsentedDocument&gt; v1OrganizationsConsentsConsentIdDocumentsGet(consentId)

Get Organization consent document by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      List<ConsentedDocument> result = apiInstance.v1OrganizationsConsentsConsentIdDocumentsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdDocumentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |

### Return type

[**List&lt;ConsentedDocument&gt;**](ConsentedDocument.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet"></a>
# **v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet**
> FinancialAccount v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet(consentId, accountId)

Get organization consented financial account details.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      FinancialAccount result = apiInstance.v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**FinancialAccount**](FinancialAccount.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet"></a>
# **v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**
> PaginatedListOfFinancialAccountTransactions v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDateTime, toDateTime, pageNo, pageSize)

Get organization consented financial account transactions.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String filters = "filters_example"; // String | 
    String fromDateTime = "fromDateTime_example"; // String | 
    String toDateTime = "toDateTime_example"; // String | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfFinancialAccountTransactions result = apiInstance.v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |
| **accountId** | **String**|  | |
| **filters** | **String**|  | [optional] |
| **fromDateTime** | **String**|  | [optional] |
| **toDateTime** | **String**|  | [optional] |
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfFinancialAccountTransactions**](PaginatedListOfFinancialAccountTransactions.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdFinancialAccountsGet"></a>
# **v1OrganizationsConsentsConsentIdFinancialAccountsGet**
> List&lt;FinancialAccount&gt; v1OrganizationsConsentsConsentIdFinancialAccountsGet(consentId)

Get all organization consented financial accounts.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      List<FinancialAccount> result = apiInstance.v1OrganizationsConsentsConsentIdFinancialAccountsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdFinancialAccountsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |

### Return type

[**List&lt;FinancialAccount&gt;**](FinancialAccount.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsConsentIdGet"></a>
# **v1OrganizationsConsentsConsentIdGet**
> ConsentDetails v1OrganizationsConsentsConsentIdGet(consentId)

Get Organization consent request details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      ConsentDetails result = apiInstance.v1OrganizationsConsentsConsentIdGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsConsentIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**|  | |

### Return type

[**ConsentDetails**](ConsentDetails.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsConsentsGet"></a>
# **v1OrganizationsConsentsGet**
> PaginatedListOfConsents v1OrganizationsConsentsGet(status, fromDateTime, toDateTime, pageNo, pageSize)

Get the paginated list of Organization consents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfConsents result = apiInstance.v1OrganizationsConsentsGet(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsConsentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled] |
| **fromDateTime** | **OffsetDateTime**|  | [optional] |
| **toDateTime** | **OffsetDateTime**|  | [optional] |
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfConsents**](PaginatedListOfConsents.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsDocumentsIssuePost"></a>
# **v1OrganizationsDocumentsIssuePost**
> DocumentIssueRequestDetails v1OrganizationsDocumentsIssuePost(documentIssueRequest)

Issue a new document to an organization.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    DocumentIssueRequest documentIssueRequest = new DocumentIssueRequest(); // DocumentIssueRequest | 
    try {
      DocumentIssueRequestDetails result = apiInstance.v1OrganizationsDocumentsIssuePost(documentIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsDocumentsIssuePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentIssueRequest** | [**DocumentIssueRequest**](DocumentIssueRequest.md)|  | |

### Return type

[**DocumentIssueRequestDetails**](DocumentIssueRequestDetails.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsDocumentsIssueUploadIssueRequestIdPost"></a>
# **v1OrganizationsDocumentsIssueUploadIssueRequestIdPost**
> UploadDocumentResponse v1OrganizationsDocumentsIssueUploadIssueRequestIdPost(issueRequestId, _file)

Upload a document for issuance request of Organization.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String issueRequestId = "issueRequestId_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      UploadDocumentResponse result = apiInstance.v1OrganizationsDocumentsIssueUploadIssueRequestIdPost(issueRequestId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsDocumentsIssueUploadIssueRequestIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **issueRequestId** | **String**|  | |
| **_file** | **File**|  | |

### Return type

[**UploadDocumentResponse**](UploadDocumentResponse.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsDocumentsIssuedDocumentIdGet"></a>
# **v1OrganizationsDocumentsIssuedDocumentIdGet**
> IssuedDocument v1OrganizationsDocumentsIssuedDocumentIdGet(documentId)

Get issued document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String documentId = "documentId_example"; // String | 
    try {
      IssuedDocument result = apiInstance.v1OrganizationsDocumentsIssuedDocumentIdGet(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsDocumentsIssuedDocumentIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**|  | |

### Return type

[**IssuedDocument**](IssuedDocument.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsDocumentsIssuedGet"></a>
# **v1OrganizationsDocumentsIssuedGet**
> PaginatedListOfIssuedDocuments v1OrganizationsDocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize)

Get paginated list of issued documents of given document type.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    String documentTypeId = "documentTypeId_example"; // String | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfIssuedDocuments result = apiInstance.v1OrganizationsDocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsDocumentsIssuedGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentTypeId** | **String**|  | |
| **fromDateTime** | **OffsetDateTime**|  | [optional] |
| **toDateTime** | **OffsetDateTime**|  | [optional] |
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfIssuedDocuments**](PaginatedListOfIssuedDocuments.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1OrganizationsDocumentsTypesGet"></a>
# **v1OrganizationsDocumentsTypesGet**
> PaginatedListOfDocumentTypes v1OrganizationsDocumentsTypesGet(pageNo, pageSize)

Get paginated list of registered document types.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDocumentTypes result = apiInstance.v1OrganizationsDocumentsTypesGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#v1OrganizationsDocumentsTypesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfDocumentTypes**](PaginatedListOfDocumentTypes.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

