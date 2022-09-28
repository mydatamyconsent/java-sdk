# DataProvidersDiscoveryApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1DataProvidersGet**](DataProvidersDiscoveryApi.md#v1DataProvidersGet) | **GET** /v1/data-providers | Discover all data providers in my data my consent by country and filters. |
| [**v1DataProvidersIdGet**](DataProvidersDiscoveryApi.md#v1DataProvidersIdGet) | **GET** /v1/data-providers/{id} | Get a data provider details by provider id. |


<a name="v1DataProvidersGet"></a>
# **v1DataProvidersGet**
> PaginatedListOfDataProviders v1DataProvidersGet(countryIso2Code, pageNo, pageSize)

Discover all data providers in my data my consent by country and filters.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProvidersDiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProvidersDiscoveryApi apiInstance = new DataProvidersDiscoveryApi(defaultClient);
    String countryIso2Code = "countryIso2Code_example"; // String | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDataProviders result = apiInstance.v1DataProvidersGet(countryIso2Code, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProvidersDiscoveryApi#v1DataProvidersGet");
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
| **countryIso2Code** | **String**|  | |
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfDataProviders**](PaginatedListOfDataProviders.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1DataProvidersIdGet"></a>
# **v1DataProvidersIdGet**
> DataProviderDetails v1DataProvidersIdGet(id)

Get a data provider details by provider id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProvidersDiscoveryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProvidersDiscoveryApi apiInstance = new DataProvidersDiscoveryApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DataProviderDetails result = apiInstance.v1DataProvidersIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProvidersDiscoveryApi#v1DataProvidersIdGet");
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
| **id** | **String**|  | |

### Return type

[**DataProviderDetails**](DataProviderDetails.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

