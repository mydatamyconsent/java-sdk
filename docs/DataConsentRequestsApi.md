# DataConsentRequestsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelConsentRequest**](DataConsentRequestsApi.md#cancelConsentRequest) | **DELETE** /v1/consent-requests/{requestId}/cancel | Revoke / Cancel the ConsentRequest based on Id.
[**createRequest**](DataConsentRequestsApi.md#createRequest) | **POST** /v1/consent-requests | Create a consent request.
[**getAllConsentRequestsToIndividuals**](DataConsentRequestsApi.md#getAllConsentRequestsToIndividuals) | **GET** /v1/consent-requests/individuals | Get all Consent Requests sent to Individuals.
[**getAllConsentRequestsToOrganizations**](DataConsentRequestsApi.md#getAllConsentRequestsToOrganizations) | **GET** /v1/consent-requests/organizations | Get All Consent Requests sent to Organizations
[**getIndividualConsentRequestById**](DataConsentRequestsApi.md#getIndividualConsentRequestById) | **GET** /v1/consent-requests/individuals/{requestId} | Get a Consent Request by ID.
[**getOrganizationConsentRequestById**](DataConsentRequestsApi.md#getOrganizationConsentRequestById) | **GET** /v1/consent-requests/organizations/{requestId} | Get a OrganizationConsent Request by Id


<a name="cancelConsentRequest"></a>
# **cancelConsentRequest**
> Boolean cancelConsentRequest(requestId)

Revoke / Cancel the ConsentRequest based on Id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | 
    try {
      Boolean result = apiInstance.cancelConsentRequest(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#cancelConsentRequest");
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
 **requestId** | **UUID**|  |

### Return type

**Boolean**

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

<a name="createRequest"></a>
# **createRequest**
> Boolean createRequest(dataConsentRequestModel)

Create a consent request.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    DataConsentRequestModel dataConsentRequestModel = new DataConsentRequestModel(); // DataConsentRequestModel | MyDataMyConsent.Models.Consents.DataConsentRequestModel.
    try {
      Boolean result = apiInstance.createRequest(dataConsentRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#createRequest");
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
 **dataConsentRequestModel** | [**DataConsentRequestModel**](DataConsentRequestModel.md)| MyDataMyConsent.Models.Consents.DataConsentRequestModel. | [optional]

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
**200** | Success |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="getAllConsentRequestsToIndividuals"></a>
# **getAllConsentRequestsToIndividuals**
> Object getAllConsentRequestsToIndividuals(pageNo, pageSize, status)

Get all Consent Requests sent to Individuals.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    try {
      Object result = apiInstance.getAllConsentRequestsToIndividuals(pageNo, pageSize, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getAllConsentRequestsToIndividuals");
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
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired]

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

<a name="getAllConsentRequestsToOrganizations"></a>
# **getAllConsentRequestsToOrganizations**
> Object getAllConsentRequestsToOrganizations(pageNo, pageSize, status)

Get All Consent Requests sent to Organizations

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    try {
      Object result = apiInstance.getAllConsentRequestsToOrganizations(pageNo, pageSize, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getAllConsentRequestsToOrganizations");
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
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired]

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

<a name="getIndividualConsentRequestById"></a>
# **getIndividualConsentRequestById**
> DataConsentDetailsDto getIndividualConsentRequestById(requestId)

Get a Consent Request by ID.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDetailsDto result = apiInstance.getIndividualConsentRequestById(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getIndividualConsentRequestById");
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
 **requestId** | **UUID**|  |

### Return type

[**DataConsentDetailsDto**](DataConsentDetailsDto.md)

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

<a name="getOrganizationConsentRequestById"></a>
# **getOrganizationConsentRequestById**
> DataConsentDetailsDto getOrganizationConsentRequestById(requestId)

Get a OrganizationConsent Request by Id

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDetailsDto result = apiInstance.getOrganizationConsentRequestById(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getOrganizationConsentRequestById");
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
 **requestId** | **UUID**|  |

### Return type

[**DataConsentDetailsDto**](DataConsentDetailsDto.md)

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

