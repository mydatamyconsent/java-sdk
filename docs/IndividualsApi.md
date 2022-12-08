# IndividualsApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**issuerIssuedoc1XmlPost**](IndividualsApi.md#issuerIssuedoc1XmlPost) | **POST** /issuer/issuedoc/1/xml | Digilocker compatible endpoint to issue document. |
| [**v1IndividualsConsentRequestsGet**](IndividualsApi.md#v1IndividualsConsentRequestsGet) | **GET** /v1/individuals/consent-requests | Get all consent requests sent to Individuals. |
| [**v1IndividualsConsentRequestsPost**](IndividualsApi.md#v1IndividualsConsentRequestsPost) | **POST** /v1/individuals/consent-requests | Create individual consent request. |
| [**v1IndividualsConsentRequestsRequestIdCancelPut**](IndividualsApi.md#v1IndividualsConsentRequestsRequestIdCancelPut) | **PUT** /v1/individuals/consent-requests/{request_id}/cancel | Cancel the Individual data request by id. |
| [**v1IndividualsConsentRequestsRequestIdGet**](IndividualsApi.md#v1IndividualsConsentRequestsRequestIdGet) | **GET** /v1/individuals/consent-requests/{request_id} | Get Individual data consent request by id. |
| [**v1IndividualsConsentTemplatesGet**](IndividualsApi.md#v1IndividualsConsentTemplatesGet) | **GET** /v1/individuals/consent-templates | Get the paginated list of individual consent templates. |
| [**v1IndividualsConsentTemplatesTemplateIdGet**](IndividualsApi.md#v1IndividualsConsentTemplatesTemplateIdGet) | **GET** /v1/individuals/consent-templates/{template_id} | Get Individual consent template details by consent id. |
| [**v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id}/download | Download Individual consented document by document id. |
| [**v1IndividualsConsentsConsentIdDocumentsDocumentIdGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id} | Get Individual consented document by document id. |
| [**v1IndividualsConsentsConsentIdDocumentsGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsGet) | **GET** /v1/individuals/consents/{consent_id}/documents | Get Individual consented document by consent id. |
| [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id} | Get individual consented financial account details. |
| [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get individual consented financial account transactions. |
| [**v1IndividualsConsentsConsentIdFinancialAccountsGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts | Get all individual consented financial accounts. |
| [**v1IndividualsConsentsConsentIdGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdGet) | **GET** /v1/individuals/consents/{consent_id} | Get Individuals consent details by consent id. |
| [**v1IndividualsConsentsConsentIdHealthFhirBundleGet**](IndividualsApi.md#v1IndividualsConsentsConsentIdHealthFhirBundleGet) | **GET** /v1/individuals/consents/{consent_id}/health/fhir/bundle | Get Individual consented Health Records by consent id. |
| [**v1IndividualsConsentsGet**](IndividualsApi.md#v1IndividualsConsentsGet) | **GET** /v1/individuals/consents | Get the paginated list of Individual consents. |
| [**v1IndividualsDocumentsIssueIssueRequestIdUploadPost**](IndividualsApi.md#v1IndividualsDocumentsIssueIssueRequestIdUploadPost) | **POST** /v1/individuals/documents/issue/{issue_request_id}/upload | Upload a document for issuance request of individual. |
| [**v1IndividualsDocumentsIssuePost**](IndividualsApi.md#v1IndividualsDocumentsIssuePost) | **POST** /v1/individuals/documents/issue | Issue a new document to an individual user. |
| [**v1IndividualsDocumentsIssuedDocumentIdGet**](IndividualsApi.md#v1IndividualsDocumentsIssuedDocumentIdGet) | **GET** /v1/individuals/documents/issued/{document_id} | Get issued document. |
| [**v1IndividualsDocumentsIssuedGet**](IndividualsApi.md#v1IndividualsDocumentsIssuedGet) | **GET** /v1/individuals/documents/issued | Get paginated list of issued documents of given document type. |
| [**v1IndividualsDocumentsTypesGet**](IndividualsApi.md#v1IndividualsDocumentsTypesGet) | **GET** /v1/individuals/documents/types | Get paginated list of registered document types. |


<a name="issuerIssuedoc1XmlPost"></a>
# **issuerIssuedoc1XmlPost**
> PushUriResponse issuerIssuedoc1XmlPost(pushUriRequest)

Digilocker compatible endpoint to issue document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    PushUriRequest pushUriRequest = new PushUriRequest(); // PushUriRequest | 
    try {
      PushUriResponse result = apiInstance.issuerIssuedoc1XmlPost(pushUriRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#issuerIssuedoc1XmlPost");
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
| **pushUriRequest** | [**PushUriRequest**](PushUriRequest.md)|  | |

### Return type

[**PushUriResponse**](PushUriResponse.md)

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

<a name="v1IndividualsConsentRequestsGet"></a>
# **v1IndividualsConsentRequestsGet**
> PaginatedListOfIndividualConsentRequestDetailss v1IndividualsConsentRequestsGet(status, fromDateTime, toDateTime, pageNo, pageSize)

Get all consent requests sent to Individuals.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfIndividualConsentRequestDetailss result = apiInstance.v1IndividualsConsentRequestsGet(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentRequestsGet");
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

[**PaginatedListOfIndividualConsentRequestDetailss**](PaginatedListOfIndividualConsentRequestDetailss.md)

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

<a name="v1IndividualsConsentRequestsPost"></a>
# **v1IndividualsConsentRequestsPost**
> IndividualConsentRequestDetails v1IndividualsConsentRequestsPost(createConsentRequest)

Create individual consent request.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    CreateConsentRequest createConsentRequest = new CreateConsentRequest(); // CreateConsentRequest | 
    try {
      IndividualConsentRequestDetails result = apiInstance.v1IndividualsConsentRequestsPost(createConsentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentRequestsPost");
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

[**IndividualConsentRequestDetails**](IndividualConsentRequestDetails.md)

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

<a name="v1IndividualsConsentRequestsRequestIdCancelPut"></a>
# **v1IndividualsConsentRequestsRequestIdCancelPut**
> Boolean v1IndividualsConsentRequestsRequestIdCancelPut(requestId)

Cancel the Individual data request by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      Boolean result = apiInstance.v1IndividualsConsentRequestsRequestIdCancelPut(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentRequestsRequestIdCancelPut");
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

<a name="v1IndividualsConsentRequestsRequestIdGet"></a>
# **v1IndividualsConsentRequestsRequestIdGet**
> ConsentRequest v1IndividualsConsentRequestsRequestIdGet(requestId)

Get Individual data consent request by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      ConsentRequest result = apiInstance.v1IndividualsConsentRequestsRequestIdGet(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentRequestsRequestIdGet");
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

<a name="v1IndividualsConsentTemplatesGet"></a>
# **v1IndividualsConsentTemplatesGet**
> PaginatedListOfConsentRequestTemplates v1IndividualsConsentTemplatesGet(pageNo, pageSize)

Get the paginated list of individual consent templates.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfConsentRequestTemplates result = apiInstance.v1IndividualsConsentTemplatesGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentTemplatesGet");
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

<a name="v1IndividualsConsentTemplatesTemplateIdGet"></a>
# **v1IndividualsConsentTemplatesTemplateIdGet**
> IndividualConsentRequestTemplateDetails v1IndividualsConsentTemplatesTemplateIdGet(templateId)

Get Individual consent template details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String templateId = "templateId_example"; // String | 
    try {
      IndividualConsentRequestTemplateDetails result = apiInstance.v1IndividualsConsentTemplatesTemplateIdGet(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentTemplatesTemplateIdGet");
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

[**IndividualConsentRequestTemplateDetails**](IndividualConsentRequestTemplateDetails.md)

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

<a name="v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet"></a>
# **v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet**
> File v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId)

Download Individual consented document by document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      File result = apiInstance.v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet");
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

<a name="v1IndividualsConsentsConsentIdDocumentsDocumentIdGet"></a>
# **v1IndividualsConsentsConsentIdDocumentsDocumentIdGet**
> ConsentedDocument v1IndividualsConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId)

Get Individual consented document by document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String documentId = "documentId_example"; // String | 
    try {
      ConsentedDocument result = apiInstance.v1IndividualsConsentsConsentIdDocumentsDocumentIdGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdDocumentsDocumentIdGet");
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

<a name="v1IndividualsConsentsConsentIdDocumentsGet"></a>
# **v1IndividualsConsentsConsentIdDocumentsGet**
> List&lt;ConsentedDocument&gt; v1IndividualsConsentsConsentIdDocumentsGet(consentId)

Get Individual consented document by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      List<ConsentedDocument> result = apiInstance.v1IndividualsConsentsConsentIdDocumentsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdDocumentsGet");
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

<a name="v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet"></a>
# **v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet**
> FinancialAccount v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet(consentId, accountId)

Get individual consented financial account details.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      FinancialAccount result = apiInstance.v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet");
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

<a name="v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet"></a>
# **v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**
> PaginatedListOfFinancialAccountTransactions v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDateTime, toDateTime, pageNo, pageSize)

Get individual consented financial account transactions.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    String filters = "filters_example"; // String | 
    String fromDateTime = "fromDateTime_example"; // String | 
    String toDateTime = "toDateTime_example"; // String | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfFinancialAccountTransactions result = apiInstance.v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet(consentId, accountId, filters, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet");
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

<a name="v1IndividualsConsentsConsentIdFinancialAccountsGet"></a>
# **v1IndividualsConsentsConsentIdFinancialAccountsGet**
> List&lt;FinancialAccount&gt; v1IndividualsConsentsConsentIdFinancialAccountsGet(consentId)

Get all individual consented financial accounts.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      List<FinancialAccount> result = apiInstance.v1IndividualsConsentsConsentIdFinancialAccountsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdFinancialAccountsGet");
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

<a name="v1IndividualsConsentsConsentIdGet"></a>
# **v1IndividualsConsentsConsentIdGet**
> ConsentDetails v1IndividualsConsentsConsentIdGet(consentId)

Get Individuals consent details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      ConsentDetails result = apiInstance.v1IndividualsConsentsConsentIdGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdGet");
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

<a name="v1IndividualsConsentsConsentIdHealthFhirBundleGet"></a>
# **v1IndividualsConsentsConsentIdHealthFhirBundleGet**
> List&lt;HealthRecord&gt; v1IndividualsConsentsConsentIdHealthFhirBundleGet(consentId)

Get Individual consented Health Records by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String consentId = "consentId_example"; // String | 
    try {
      List<HealthRecord> result = apiInstance.v1IndividualsConsentsConsentIdHealthFhirBundleGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsConsentIdHealthFhirBundleGet");
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

[**List&lt;HealthRecord&gt;**](HealthRecord.md)

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

<a name="v1IndividualsConsentsGet"></a>
# **v1IndividualsConsentsGet**
> PaginatedListOfConsents v1IndividualsConsentsGet(status, fromDateTime, toDateTime, pageNo, pageSize)

Get the paginated list of Individual consents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfConsents result = apiInstance.v1IndividualsConsentsGet(status, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsConsentsGet");
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

<a name="v1IndividualsDocumentsIssueIssueRequestIdUploadPost"></a>
# **v1IndividualsDocumentsIssueIssueRequestIdUploadPost**
> UploadDocumentResponse v1IndividualsDocumentsIssueIssueRequestIdUploadPost(issueRequestId, _file)

Upload a document for issuance request of individual.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String issueRequestId = "issueRequestId_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      UploadDocumentResponse result = apiInstance.v1IndividualsDocumentsIssueIssueRequestIdUploadPost(issueRequestId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsDocumentsIssueIssueRequestIdUploadPost");
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

<a name="v1IndividualsDocumentsIssuePost"></a>
# **v1IndividualsDocumentsIssuePost**
> DocumentIssueRequestDetails v1IndividualsDocumentsIssuePost(documentIssueRequest)

Issue a new document to an individual user.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    DocumentIssueRequest documentIssueRequest = new DocumentIssueRequest(); // DocumentIssueRequest | 
    try {
      DocumentIssueRequestDetails result = apiInstance.v1IndividualsDocumentsIssuePost(documentIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsDocumentsIssuePost");
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

<a name="v1IndividualsDocumentsIssuedDocumentIdGet"></a>
# **v1IndividualsDocumentsIssuedDocumentIdGet**
> IssuedDocument v1IndividualsDocumentsIssuedDocumentIdGet(documentId)

Get issued document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String documentId = "documentId_example"; // String | 
    try {
      IssuedDocument result = apiInstance.v1IndividualsDocumentsIssuedDocumentIdGet(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsDocumentsIssuedDocumentIdGet");
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

<a name="v1IndividualsDocumentsIssuedGet"></a>
# **v1IndividualsDocumentsIssuedGet**
> PaginatedListOfIssuedDocuments v1IndividualsDocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize)

Get paginated list of issued documents of given document type.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    String documentTypeId = "documentTypeId_example"; // String | 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfIssuedDocuments result = apiInstance.v1IndividualsDocumentsIssuedGet(documentTypeId, fromDateTime, toDateTime, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsDocumentsIssuedGet");
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

<a name="v1IndividualsDocumentsTypesGet"></a>
# **v1IndividualsDocumentsTypesGet**
> PaginatedListOfDocumentTypes v1IndividualsDocumentsTypesGet(pageNo, pageSize)

Get paginated list of registered document types.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.IndividualsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    IndividualsApi apiInstance = new IndividualsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDocumentTypes result = apiInstance.v1IndividualsDocumentsTypesGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndividualsApi#v1IndividualsDocumentsTypesGet");
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

