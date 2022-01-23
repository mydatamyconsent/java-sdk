# DataProcessingAgreementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1DataAgreementsGet**](DataProcessingAgreementsApi.md#v1DataAgreementsGet) | **GET** /v1/data-agreements | Get all data processing agreements.
[**v1DataAgreementsIdDelete**](DataProcessingAgreementsApi.md#v1DataAgreementsIdDelete) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement. This will not delete a published or a agreement in use with consents.
[**v1DataAgreementsIdGet**](DataProcessingAgreementsApi.md#v1DataAgreementsIdGet) | **GET** /v1/data-agreements/{id} | Get data processing agreement by Id.
[**v1DataAgreementsIdPut**](DataProcessingAgreementsApi.md#v1DataAgreementsIdPut) | **PUT** /v1/data-agreements/{id} | Update a data processing agreement.
[**v1DataAgreementsIdTerminatePut**](DataProcessingAgreementsApi.md#v1DataAgreementsIdTerminatePut) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement.
[**v1DataAgreementsPost**](DataProcessingAgreementsApi.md#v1DataAgreementsPost) | **POST** /v1/data-agreements | Create a data processing agreement.


<a name="v1DataAgreementsGet"></a>
# **v1DataAgreementsGet**
> DataProcessingAgreementDtoPaginatedList v1DataAgreementsGet(pageNo, pageSize)

Get all data processing agreements.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    try {
      DataProcessingAgreementDtoPaginatedList result = apiInstance.v1DataAgreementsGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsGet");
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

[**DataProcessingAgreementDtoPaginatedList**](DataProcessingAgreementDtoPaginatedList.md)

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

<a name="v1DataAgreementsIdDelete"></a>
# **v1DataAgreementsIdDelete**
> v1DataAgreementsIdDelete(id)

Delete a data processing agreement. This will not delete a published or a agreement in use with consents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.v1DataAgreementsIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsIdDelete");
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
 **id** | [**UUID**](.md)|  |

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
**204** | Success |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="v1DataAgreementsIdGet"></a>
# **v1DataAgreementsIdGet**
> DataProcessingAgreementDto v1DataAgreementsIdGet(id)

Get data processing agreement by Id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      DataProcessingAgreementDto result = apiInstance.v1DataAgreementsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsIdGet");
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
 **id** | [**UUID**](.md)|  |

### Return type

[**DataProcessingAgreementDto**](DataProcessingAgreementDto.md)

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

<a name="v1DataAgreementsIdPut"></a>
# **v1DataAgreementsIdPut**
> DataProcessingAgreementDto v1DataAgreementsIdPut(id, updateDataProcessingAgreementRequestModel)

Update a data processing agreement.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    UpdateDataProcessingAgreementRequestModel updateDataProcessingAgreementRequestModel = new UpdateDataProcessingAgreementRequestModel(); // UpdateDataProcessingAgreementRequestModel | 
    try {
      DataProcessingAgreementDto result = apiInstance.v1DataAgreementsIdPut(id, updateDataProcessingAgreementRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsIdPut");
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
 **id** | [**UUID**](.md)|  |
 **updateDataProcessingAgreementRequestModel** | [**UpdateDataProcessingAgreementRequestModel**](UpdateDataProcessingAgreementRequestModel.md)|  | [optional]

### Return type

[**DataProcessingAgreementDto**](DataProcessingAgreementDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="v1DataAgreementsIdTerminatePut"></a>
# **v1DataAgreementsIdTerminatePut**
> v1DataAgreementsIdTerminatePut(id)

Terminate a data processing agreement.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.v1DataAgreementsIdTerminatePut(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsIdTerminatePut");
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
 **id** | [**UUID**](.md)|  |

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
**204** | Success |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

<a name="v1DataAgreementsPost"></a>
# **v1DataAgreementsPost**
> DataProcessingAgreementDto v1DataAgreementsPost(createDataProcessingAgreementRequestModel)

Create a data processing agreement.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    CreateDataProcessingAgreementRequestModel createDataProcessingAgreementRequestModel = new CreateDataProcessingAgreementRequestModel(); // CreateDataProcessingAgreementRequestModel | 
    try {
      DataProcessingAgreementDto result = apiInstance.v1DataAgreementsPost(createDataProcessingAgreementRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsPost");
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
 **createDataProcessingAgreementRequestModel** | [**CreateDataProcessingAgreementRequestModel**](CreateDataProcessingAgreementRequestModel.md)|  | [optional]

### Return type

[**DataProcessingAgreementDto**](DataProcessingAgreementDto.md)

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

