# DataProviderDiscoveryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1DataProvidersGet**](DataProviderDiscoveryApi.md#v1DataProvidersGet) | **GET** /v1/data-providers | Discover all data providers in My Data My Consent by country and filters.
[**v1DataProvidersProviderIdGet**](DataProviderDiscoveryApi.md#v1DataProvidersProviderIdGet) | **GET** /v1/data-providers/{providerId} | Get a Data Provider details.


<a name="v1DataProvidersGet"></a>
# **v1DataProvidersGet**
> DataProviderPaginatedList v1DataProvidersGet(accountType, documentType, organizationCategory, pageNo, pageSize, country)

Discover all data providers in My Data My Consent by country and filters.

.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProviderDiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProviderDiscoveryApi apiInstance = new DataProviderDiscoveryApi(defaultClient);
    String accountType = "accountType_example"; // String | Account type.
    String documentType = "documentType_example"; // String | Document type.
    String organizationCategory = "organizationCategory_example"; // String | Organization category.
    Integer pageNo = 56; // Integer | Page number.
    Integer pageSize = 56; // Integer | Page size.
    String country = "IN"; // String | ISO2 Country code.
    try {
      DataProviderPaginatedList result = apiInstance.v1DataProvidersGet(accountType, documentType, organizationCategory, pageNo, pageSize, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProviderDiscoveryApi#v1DataProvidersGet");
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
 **accountType** | **String**| Account type. | [optional]
 **documentType** | **String**| Document type. | [optional]
 **organizationCategory** | **String**| Organization category. | [optional]
 **pageNo** | **Integer**| Page number. | [optional]
 **pageSize** | **Integer**| Page size. | [optional]
 **country** | **String**| ISO2 Country code. | [optional] [default to IN]

### Return type

[**DataProviderPaginatedList**](DataProviderPaginatedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |
**401** | Unauthorized. |  -  |
**500** | Internal Server Error. |  -  |

<a name="v1DataProvidersProviderIdGet"></a>
# **v1DataProvidersProviderIdGet**
> DataProvider v1DataProvidersProviderIdGet(providerId)

Get a Data Provider details.

.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProviderDiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataProviderDiscoveryApi apiInstance = new DataProviderDiscoveryApi(defaultClient);
    String providerId = "providerId_example"; // String | Provider Id.
    try {
      DataProvider result = apiInstance.v1DataProvidersProviderIdGet(providerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProviderDiscoveryApi#v1DataProvidersProviderIdGet");
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
 **providerId** | **String**| Provider Id. |

### Return type

[**DataProvider**](DataProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. |  -  |
**401** | Unauthorized. |  -  |
**500** | Internal Server Error. |  -  |

