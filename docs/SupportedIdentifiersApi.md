# SupportedIdentifiersApi

All URIs are relative to *https://api.mydatamyconsent.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSupportedIdentifiers**](SupportedIdentifiersApi.md#getAllSupportedIdentifiers) | **GET** /v1/supported-identifiers/{countryIso2Code} | Get all supported identifiers by country.


<a name="getAllSupportedIdentifiers"></a>
# **getAllSupportedIdentifiers**
> SupportedIdentifier getAllSupportedIdentifiers(countryIso2Code)

Get all supported identifiers by country.

Get all supported identifiers by country.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.SupportedIdentifiersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    SupportedIdentifiersApi apiInstance = new SupportedIdentifiersApi(defaultClient);
    String countryIso2Code = "countryIso2Code_example"; // String | Country ISO 2 code.
    try {
      SupportedIdentifier result = apiInstance.getAllSupportedIdentifiers(countryIso2Code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportedIdentifiersApi#getAllSupportedIdentifiers");
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
 **countryIso2Code** | **String**| Country ISO 2 code. |

### Return type

[**SupportedIdentifier**](SupportedIdentifier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

