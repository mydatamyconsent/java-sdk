# SupportedIdentifiersApi

All URIs are relative to *https://api.mydatamyconsent.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1SupportedIdentifiersCountryIso2CodeGet**](SupportedIdentifiersApi.md#v1SupportedIdentifiersCountryIso2CodeGet) | **GET** /v1/supported-identifiers/{country_iso2_code} | Get all supported identifiers by country. |


<a name="v1SupportedIdentifiersCountryIso2CodeGet"></a>
# **v1SupportedIdentifiersCountryIso2CodeGet**
> SupportedIdentifier v1SupportedIdentifiersCountryIso2CodeGet(countryIso2Code)

Get all supported identifiers by country.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.SupportedIdentifiersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    SupportedIdentifiersApi apiInstance = new SupportedIdentifiersApi(defaultClient);
    String countryIso2Code = "countryIso2Code_example"; // String | 
    try {
      SupportedIdentifier result = apiInstance.v1SupportedIdentifiersCountryIso2CodeGet(countryIso2Code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportedIdentifiersApi#v1SupportedIdentifiersCountryIso2CodeGet");
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

### Return type

[**SupportedIdentifier**](SupportedIdentifier.md)

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
| **401** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |

