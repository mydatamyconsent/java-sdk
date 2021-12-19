# DigiLockerCompatIssuerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuerIssuedoc1XmlPost**](DigiLockerCompatIssuerApi.md#issuerIssuedoc1XmlPost) | **POST** /issuer/issuedoc/1/xml | Digilocker Compatible endpoint to Issue Documents.


<a name="issuerIssuedoc1XmlPost"></a>
# **issuerIssuedoc1XmlPost**
> PushUriResponse issuerIssuedoc1XmlPost(pushUriRequest)

Digilocker Compatible endpoint to Issue Documents.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DigiLockerCompatIssuerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DigiLockerCompatIssuerApi apiInstance = new DigiLockerCompatIssuerApi(defaultClient);
    PushUriRequest pushUriRequest = new PushUriRequest(); // PushUriRequest | 
    try {
      PushUriResponse result = apiInstance.issuerIssuedoc1XmlPost(pushUriRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigiLockerCompatIssuerApi#issuerIssuedoc1XmlPost");
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
 **pushUriRequest** | [**PushUriRequest**](PushUriRequest.md)|  | [optional]

### Return type

[**PushUriResponse**](PushUriResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**500** | Server Error |  -  |
**0** | Error |  -  |

