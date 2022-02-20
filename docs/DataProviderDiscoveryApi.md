# DataProviderDiscoveryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataProviderById**](DataProviderDiscoveryApi.md#getDataProviderById) | **GET** /v1/data-providers/{providerId} | Get a Data Provider details based on provider id.
[**getDataProviders**](DataProviderDiscoveryApi.md#getDataProviders) | **GET** /v1/data-providers | Discover all data providers in My Data My Consent by country and filters.


<a name="getDataProviderById"></a>
# **getDataProviderById**
> DataProvider getDataProviderById(providerId)

Get a Data Provider details based on provider id.

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
    String providerId = "providerId_example"; // String | Provider id.
    try {
      DataProvider result = apiInstance.getDataProviderById(providerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProviderDiscoveryApi#getDataProviderById");
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
 **providerId** | **String**| Provider id. |

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
**200** | Success |  -  |
**500** | Server Error |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**0** | Error |  -  |

<a name="getDataProviders"></a>
# **getDataProviders**
> DataProviderPaginatedList getDataProviders(accountType, documentType, organizationCategory, pageNo, pageSize, country)

Discover all data providers in My Data My Consent by country and filters.

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
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Number of items to return.
    String country = "IN"; // String | ISO2 Country code.
    try {
      DataProviderPaginatedList result = apiInstance.getDataProviders(accountType, documentType, organizationCategory, pageNo, pageSize, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProviderDiscoveryApi#getDataProviders");
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
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items to return. | [optional] [default to 25]
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
**200** | Success |  -  |
**500** | Server Error |  -  |
**400** | Bad Request |  -  |
**0** | Error |  -  |

