# DataConsentRequestsApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelIndividualDataConsentRequest**](DataConsentRequestsApi.md#cancelIndividualDataConsentRequest) | **PUT** /v1/consent-requests/individual/{requestId}/cancel | Cancel the individual data consent request by Id. |
| [**cancelOrganizationDataConsentRequest**](DataConsentRequestsApi.md#cancelOrganizationDataConsentRequest) | **PUT** /v1/consent-requests/organization/{requestId}/cancel | Cancel the organization data consent request by Id. |
| [**createIndividualDataConsentRequest**](DataConsentRequestsApi.md#createIndividualDataConsentRequest) | **POST** /v1/consent-requests/individual | Create data consent request for an individual. |
| [**createOrganizationDataConsentRequest**](DataConsentRequestsApi.md#createOrganizationDataConsentRequest) | **POST** /v1/consent-requests/organization | Create data consent request for an organization. |
| [**getAllConsentRequestsToIndividuals**](DataConsentRequestsApi.md#getAllConsentRequestsToIndividuals) | **GET** /v1/consent-requests/individuals | Get all Consent Requests sent to individuals. |
| [**getAllConsentRequestsToOrganizations**](DataConsentRequestsApi.md#getAllConsentRequestsToOrganizations) | **GET** /v1/consent-requests/organizations | Get all Consent Requests sent to organizations. |
| [**getIndividualConsentRequestById**](DataConsentRequestsApi.md#getIndividualConsentRequestById) | **GET** /v1/consent-requests/individuals/{requestId} | Get individual data consent request by id. |
| [**getOrganizationConsentRequestById**](DataConsentRequestsApi.md#getOrganizationConsentRequestById) | **GET** /v1/consent-requests/organizations/{requestId} | Get a OrganizationConsent Request by Id. |


<a name="cancelIndividualDataConsentRequest"></a>
# **cancelIndividualDataConsentRequest**
> cancelIndividualDataConsentRequest(requestId)

Cancel the individual data consent request by Id.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Individual consent request id.
    try {
      apiInstance.cancelIndividualDataConsentRequest(requestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#cancelIndividualDataConsentRequest");
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
| **requestId** | **UUID**| Individual consent request id. | |

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
| **200** | Success |  -  |
| **500** | Server Error |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

<a name="cancelOrganizationDataConsentRequest"></a>
# **cancelOrganizationDataConsentRequest**
> cancelOrganizationDataConsentRequest(requestId)

Cancel the organization data consent request by Id.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Organization consent request id.
    try {
      apiInstance.cancelOrganizationDataConsentRequest(requestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#cancelOrganizationDataConsentRequest");
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
| **requestId** | **UUID**| Organization consent request id. | |

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
| **200** | Success |  -  |
| **500** | Server Error |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

<a name="createIndividualDataConsentRequest"></a>
# **createIndividualDataConsentRequest**
> IndividualDataConsentRequestDetails createIndividualDataConsentRequest(createDataConsentRequest)

Create data consent request for an individual.

Create data consent request for an individual.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    CreateDataConsentRequest createDataConsentRequest = new CreateDataConsentRequest(); // CreateDataConsentRequest | The Individual data consent request payload
    try {
      IndividualDataConsentRequestDetails result = apiInstance.createIndividualDataConsentRequest(createDataConsentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#createIndividualDataConsentRequest");
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
| **createDataConsentRequest** | [**CreateDataConsentRequest**](CreateDataConsentRequest.md)| The Individual data consent request payload | |

### Return type

[**IndividualDataConsentRequestDetails**](IndividualDataConsentRequestDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Server Error |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a name="createOrganizationDataConsentRequest"></a>
# **createOrganizationDataConsentRequest**
> OrganizationDataConsentRequestDetails createOrganizationDataConsentRequest(createDataConsentRequest)

Create data consent request for an organization.

Create data consent request for an organization.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    CreateDataConsentRequest createDataConsentRequest = new CreateDataConsentRequest(); // CreateDataConsentRequest | The Organization data consent request payload
    try {
      OrganizationDataConsentRequestDetails result = apiInstance.createOrganizationDataConsentRequest(createDataConsentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#createOrganizationDataConsentRequest");
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
| **createDataConsentRequest** | [**CreateDataConsentRequest**](CreateDataConsentRequest.md)| The Organization data consent request payload | |

### Return type

[**OrganizationDataConsentRequestDetails**](OrganizationDataConsentRequestDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Server Error |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a name="getAllConsentRequestsToIndividuals"></a>
# **getAllConsentRequestsToIndividuals**
> IndividualDataConsentRequestDetailsPaginatedList getAllConsentRequestsToIndividuals(status, startDateTime, endDateTime, pageNo, pageSize)

Get all Consent Requests sent to individuals.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status.
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | Start datetime in UTC timezone.
    OffsetDateTime endDateTime = OffsetDateTime.now(); // OffsetDateTime | End datetime in UTC timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      IndividualDataConsentRequestDetailsPaginatedList result = apiInstance.getAllConsentRequestsToIndividuals(status, startDateTime, endDateTime, pageNo, pageSize);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled] |
| **startDateTime** | **OffsetDateTime**| Start datetime in UTC timezone. | [optional] |
| **endDateTime** | **OffsetDateTime**| End datetime in UTC timezone. | [optional] |
| **pageNo** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25] |

### Return type

[**IndividualDataConsentRequestDetailsPaginatedList**](IndividualDataConsentRequestDetailsPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |
| **0** | Error |  -  |

<a name="getAllConsentRequestsToOrganizations"></a>
# **getAllConsentRequestsToOrganizations**
> OrganizationDataConsentRequestDetailsPaginatedList getAllConsentRequestsToOrganizations(status, startDateTime, endDateTime, pageNo, pageSize)

Get all Consent Requests sent to organizations.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status.
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | Start datetime in UTC timezone.
    OffsetDateTime endDateTime = OffsetDateTime.now(); // OffsetDateTime | End datetime in UTC timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      OrganizationDataConsentRequestDetailsPaginatedList result = apiInstance.getAllConsentRequestsToOrganizations(status, startDateTime, endDateTime, pageNo, pageSize);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Timeout, Canceled] |
| **startDateTime** | **OffsetDateTime**| Start datetime in UTC timezone. | [optional] |
| **endDateTime** | **OffsetDateTime**| End datetime in UTC timezone. | [optional] |
| **pageNo** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25] |

### Return type

[**OrganizationDataConsentRequestDetailsPaginatedList**](OrganizationDataConsentRequestDetailsPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |
| **0** | Error |  -  |

<a name="getIndividualConsentRequestById"></a>
# **getIndividualConsentRequestById**
> DataConsentRequest getIndividualConsentRequestById(requestId)

Get individual data consent request by id.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Individual data consent request id.
    try {
      DataConsentRequest result = apiInstance.getIndividualConsentRequestById(requestId);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID**| Individual data consent request id. | |

### Return type

[**DataConsentRequest**](DataConsentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |
| **0** | Error |  -  |

<a name="getOrganizationConsentRequestById"></a>
# **getOrganizationConsentRequestById**
> DataConsentRequest getOrganizationConsentRequestById(requestId)

Get a OrganizationConsent Request by Id.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Organization consent request id.
    try {
      DataConsentRequest result = apiInstance.getOrganizationConsentRequestById(requestId);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID**| Organization consent request id. | |

### Return type

[**DataConsentRequest**](DataConsentRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |
| **0** | Error |  -  |

