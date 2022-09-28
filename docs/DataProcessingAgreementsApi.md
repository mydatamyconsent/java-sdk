# DataProcessingAgreementsApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1DataAgreementsGet**](DataProcessingAgreementsApi.md#v1DataAgreementsGet) | **GET** /v1/data-agreements | Get paginated data processing agreements. |
| [**v1DataAgreementsIdDelete**](DataProcessingAgreementsApi.md#v1DataAgreementsIdDelete) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement this will not delete a published or a agreement in use with consents. |
| [**v1DataAgreementsIdGet**](DataProcessingAgreementsApi.md#v1DataAgreementsIdGet) | **GET** /v1/data-agreements/{id} | Get data processing agreement by id. |
| [**v1DataAgreementsIdPut**](DataProcessingAgreementsApi.md#v1DataAgreementsIdPut) | **PUT** /v1/data-agreements/{id} | Update data processing agreement. |
| [**v1DataAgreementsIdTerminatePut**](DataProcessingAgreementsApi.md#v1DataAgreementsIdTerminatePut) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement by id. |
| [**v1DataAgreementsPost**](DataProcessingAgreementsApi.md#v1DataAgreementsPost) | **POST** /v1/data-agreements | Create a data processing agreement. |


<a name="v1DataAgreementsGet"></a>
# **v1DataAgreementsGet**
> PaginatedListOfDataProcessingAgreements v1DataAgreementsGet(pageNo, pageSize)

Get paginated data processing agreements.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDataProcessingAgreements result = apiInstance.v1DataAgreementsGet(pageNo, pageSize);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNo** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**PaginatedListOfDataProcessingAgreements**](PaginatedListOfDataProcessingAgreements.md)

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

<a name="v1DataAgreementsIdDelete"></a>
# **v1DataAgreementsIdDelete**
> Boolean v1DataAgreementsIdDelete(id)

Delete a data processing agreement this will not delete a published or a agreement in use with consents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Boolean result = apiInstance.v1DataAgreementsIdDelete(id);
      System.out.println(result);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

**Boolean**

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

<a name="v1DataAgreementsIdGet"></a>
# **v1DataAgreementsIdGet**
> DataProcessingAgreement v1DataAgreementsIdGet(id)

Get data processing agreement by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DataProcessingAgreement result = apiInstance.v1DataAgreementsIdGet(id);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**DataProcessingAgreement**](DataProcessingAgreement.md)

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

<a name="v1DataAgreementsIdPut"></a>
# **v1DataAgreementsIdPut**
> DataProcessingAgreement v1DataAgreementsIdPut(id, updateDataProcessingAgreement)

Update data processing agreement.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateDataProcessingAgreement updateDataProcessingAgreement = new UpdateDataProcessingAgreement(); // UpdateDataProcessingAgreement | 
    try {
      DataProcessingAgreement result = apiInstance.v1DataAgreementsIdPut(id, updateDataProcessingAgreement);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateDataProcessingAgreement** | [**UpdateDataProcessingAgreement**](UpdateDataProcessingAgreement.md)|  | |

### Return type

[**DataProcessingAgreement**](DataProcessingAgreement.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

<a name="v1DataAgreementsIdTerminatePut"></a>
# **v1DataAgreementsIdTerminatePut**
> Boolean v1DataAgreementsIdTerminatePut(id)

Terminate a data processing agreement by id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Boolean result = apiInstance.v1DataAgreementsIdTerminatePut(id);
      System.out.println(result);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

**Boolean**

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

<a name="v1DataAgreementsPost"></a>
# **v1DataAgreementsPost**
> DataProcessingAgreement v1DataAgreementsPost(createDataProcessingAgreement)

Create a data processing agreement.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    CreateDataProcessingAgreement createDataProcessingAgreement = new CreateDataProcessingAgreement(); // CreateDataProcessingAgreement | 
    try {
      DataProcessingAgreement result = apiInstance.v1DataAgreementsPost(createDataProcessingAgreement);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataProcessingAgreement** | [**CreateDataProcessingAgreement**](CreateDataProcessingAgreement.md)|  | |

### Return type

[**DataProcessingAgreement**](DataProcessingAgreement.md)

### Authorization

[OAuth2ClientCredentials](../README.md#OAuth2ClientCredentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

