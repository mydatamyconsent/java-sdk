# DataConsentRequestsApi

All URIs are relative to *https://api.mydatamyconsent.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelIndividualDataConsentRequest**](DataConsentRequestsApi.md#cancelIndividualDataConsentRequest) | **PUT** /v1/consent-requests/individual/{requestId}/cancel | Cancel the individual data consent request based on Id.
[**cancelOrganizationDataConsentRequest**](DataConsentRequestsApi.md#cancelOrganizationDataConsentRequest) | **PUT** /v1/consent-requests/organization/{requestId}/cancel | Cancel the Organization data consent request based on Id.
[**createIndividualDataConsentRequest**](DataConsentRequestsApi.md#createIndividualDataConsentRequest) | **POST** /v1/consent-requests/individual | Create a individual data consent request.
[**createOrganizationDataConsentRequest**](DataConsentRequestsApi.md#createOrganizationDataConsentRequest) | **POST** /v1/consent-requests/organization | Create a organization data consent request.
[**getAllConsentRequestsToIndividuals**](DataConsentRequestsApi.md#getAllConsentRequestsToIndividuals) | **GET** /v1/consent-requests/individuals | Get all Consent Requests sent to Individuals.
[**getAllConsentRequestsToOrganizations**](DataConsentRequestsApi.md#getAllConsentRequestsToOrganizations) | **GET** /v1/consent-requests/organizations | Get All Consent Requests sent to Organizations.
[**getIndividualConsentRequestById**](DataConsentRequestsApi.md#getIndividualConsentRequestById) | **GET** /v1/consent-requests/individuals/{requestId} | Get a Consent Request by ID.
[**getOrganizationConsentRequestById**](DataConsentRequestsApi.md#getOrganizationConsentRequestById) | **GET** /v1/consent-requests/organizations/{requestId} | Get a OrganizationConsent Request by Id.


<a name="cancelIndividualDataConsentRequest"></a>
# **cancelIndividualDataConsentRequest**
> IndividualDataConsentRequestResponse cancelIndividualDataConsentRequest(requestId)

Cancel the individual data consent request based on Id.

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
      IndividualDataConsentRequestResponse result = apiInstance.cancelIndividualDataConsentRequest(requestId);
      System.out.println(result);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **UUID**| Individual consent request id. |

### Return type

[**IndividualDataConsentRequestResponse**](IndividualDataConsentRequestResponse.md)

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
**404** | Not Found |  -  |
**0** | Error |  -  |

<a name="cancelOrganizationDataConsentRequest"></a>
# **cancelOrganizationDataConsentRequest**
> OrganizationDataConsentRequestResponse cancelOrganizationDataConsentRequest(requestId)

Cancel the Organization data consent request based on Id.

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
      OrganizationDataConsentRequestResponse result = apiInstance.cancelOrganizationDataConsentRequest(requestId);
      System.out.println(result);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **UUID**| Organization consent request id. |

### Return type

[**OrganizationDataConsentRequestResponse**](OrganizationDataConsentRequestResponse.md)

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
**404** | Not Found |  -  |
**0** | Error |  -  |

<a name="createIndividualDataConsentRequest"></a>
# **createIndividualDataConsentRequest**
> IndividualDataConsentRequestResponse createIndividualDataConsentRequest(createIndividualDataConsentRequest)

Create a individual data consent request.

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
    CreateIndividualDataConsentRequest createIndividualDataConsentRequest = new CreateIndividualDataConsentRequest(); // CreateIndividualDataConsentRequest | M:MyDataMyConsent.DeveloperApi.Controllers.DataConsentRequestsController.CreateIndividualDataConsentRequest(MyDataMyConsent.DeveloperApi.Models.CreateIndividualDataConsentRequest).
    try {
      IndividualDataConsentRequestResponse result = apiInstance.createIndividualDataConsentRequest(createIndividualDataConsentRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createIndividualDataConsentRequest** | [**CreateIndividualDataConsentRequest**](CreateIndividualDataConsentRequest.md)| M:MyDataMyConsent.DeveloperApi.Controllers.DataConsentRequestsController.CreateIndividualDataConsentRequest(MyDataMyConsent.DeveloperApi.Models.CreateIndividualDataConsentRequest). |

### Return type

[**IndividualDataConsentRequestResponse**](IndividualDataConsentRequestResponse.md)

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
**404** | Not Found |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

<a name="createOrganizationDataConsentRequest"></a>
# **createOrganizationDataConsentRequest**
> OrganizationDataConsentRequestResponse createOrganizationDataConsentRequest(createOrganizationDataConsentRequest)

Create a organization data consent request.

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
    CreateOrganizationDataConsentRequest createOrganizationDataConsentRequest = new CreateOrganizationDataConsentRequest(); // CreateOrganizationDataConsentRequest | M:MyDataMyConsent.DeveloperApi.Controllers.DataConsentRequestsController.CreateOrganizationDataConsentRequest(MyDataMyConsent.DeveloperApi.Models.CreateOrganizationDataConsentRequest).
    try {
      OrganizationDataConsentRequestResponse result = apiInstance.createOrganizationDataConsentRequest(createOrganizationDataConsentRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrganizationDataConsentRequest** | [**CreateOrganizationDataConsentRequest**](CreateOrganizationDataConsentRequest.md)| M:MyDataMyConsent.DeveloperApi.Controllers.DataConsentRequestsController.CreateOrganizationDataConsentRequest(MyDataMyConsent.DeveloperApi.Models.CreateOrganizationDataConsentRequest). |

### Return type

[**OrganizationDataConsentRequestResponse**](OrganizationDataConsentRequestResponse.md)

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
**404** | Not Found |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

<a name="getAllConsentRequestsToIndividuals"></a>
# **getAllConsentRequestsToIndividuals**
> UserDataConsentInfoDtoPaginatedList getAllConsentRequestsToIndividuals(status, startDateTime, endDateTime, pageNo, pageSize)

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status.
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date time.
    OffsetDateTime endDateTime = OffsetDateTime.now(); // OffsetDateTime | End date time.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      UserDataConsentInfoDtoPaginatedList result = apiInstance.getAllConsentRequestsToIndividuals(status, startDateTime, endDateTime, pageNo, pageSize);
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
 **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **startDateTime** | **OffsetDateTime**| Start date time. | [optional]
 **endDateTime** | **OffsetDateTime**| End date time. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**UserDataConsentInfoDtoPaginatedList**](UserDataConsentInfoDtoPaginatedList.md)

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
> OrganizationDataConsentInfoDtoPaginatedList getAllConsentRequestsToOrganizations(status, startDateTime, endDateTime, pageNo, pageSize)

Get All Consent Requests sent to Organizations.

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
    OffsetDateTime startDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date time.
    OffsetDateTime endDateTime = OffsetDateTime.now(); // OffsetDateTime | End date time.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      OrganizationDataConsentInfoDtoPaginatedList result = apiInstance.getAllConsentRequestsToOrganizations(status, startDateTime, endDateTime, pageNo, pageSize);
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
 **status** | [**DataConsentStatus**](.md)| Data consent status. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **startDateTime** | **OffsetDateTime**| Start date time. | [optional]
 **endDateTime** | **OffsetDateTime**| End date time. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]

### Return type

[**OrganizationDataConsentInfoDtoPaginatedList**](OrganizationDataConsentInfoDtoPaginatedList.md)

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | Individual consent request id.
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
 **requestId** | **UUID**| Individual consent request id. |

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
 **requestId** | **UUID**| Organization consent request id. |

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

