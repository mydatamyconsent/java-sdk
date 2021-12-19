# DataConsentRequestsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelConsentRequest**](DataConsentRequestsApi.md#cancelConsentRequest) | **DELETE** /v1/consent-requests/{requestId}/cancel | Cancel a Consent Request by ID.
[**createRequest**](DataConsentRequestsApi.md#createRequest) | **POST** /v1/consent-requests | Create a consent request.
[**getAllConsentRequests**](DataConsentRequestsApi.md#getAllConsentRequests) | **GET** /v1/consent-requests | Get all Consent Requests.
[**getConsentRequestById**](DataConsentRequestsApi.md#getConsentRequestById) | **GET** /v1/consent-requests/{requestId} | Get a Consent Request by ID.


<a name="cancelConsentRequest"></a>
# **cancelConsentRequest**
> cancelConsentRequest(requestId)

Cancel a Consent Request by ID.

.

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
    UUID requestId = new UUID(); // UUID | consent request id.
    try {
      apiInstance.cancelConsentRequest(requestId);
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
 **requestId** | [**UUID**](.md)| consent request id. |

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
**200** | Success |  -  |

<a name="createRequest"></a>
# **createRequest**
> DataConsent createRequest(dataConsentRequestModel)

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
      DataConsent result = apiInstance.createRequest(dataConsentRequestModel);
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

[**DataConsent**](DataConsent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="getAllConsentRequests"></a>
# **getAllConsentRequests**
> Object getAllConsentRequests(status)

Get all Consent Requests.

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
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    try {
      Object result = apiInstance.getAllConsentRequests(status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getAllConsentRequests");
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
 **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="getConsentRequestById"></a>
# **getConsentRequestById**
> DataConsentDetailsDto getConsentRequestById(requestId)

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
    UUID requestId = new UUID(); // UUID | 
    try {
      DataConsentDetailsDto result = apiInstance.getConsentRequestById(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#getConsentRequestById");
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
 **requestId** | [**UUID**](.md)|  |

### Return type

[**DataConsentDetailsDto**](DataConsentDetailsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

