# DigiLockerCompatIssuerApi

All URIs are relative to *https://api.mydatamyconsent.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**digilockerCompatIssueDocument**](DigiLockerCompatIssuerApi.md#digilockerCompatIssueDocument) | **POST** /issuer/issuedoc/1/xml | Digilocker Compatible endpoint to issue document.


<a name="digilockerCompatIssueDocument"></a>
# **digilockerCompatIssueDocument**
> PushUriResponse digilockerCompatIssueDocument(pushUriRequest)

Digilocker Compatible endpoint to issue document.

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
    defaultClient.setBasePath("https://api.mydatamyconsent.com");

    DigiLockerCompatIssuerApi apiInstance = new DigiLockerCompatIssuerApi(defaultClient);
    PushUriRequest pushUriRequest = new PushUriRequest(); // PushUriRequest | Push uri request MyDataMyConsent.DeveloperApi.Models.DigiLocker.PushUriRequest.
    try {
      PushUriResponse result = apiInstance.digilockerCompatIssueDocument(pushUriRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigiLockerCompatIssuerApi#digilockerCompatIssueDocument");
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
 **pushUriRequest** | [**PushUriRequest**](PushUriRequest.md)| Push uri request MyDataMyConsent.DeveloperApi.Models.DigiLocker.PushUriRequest. | [optional]

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
**404** | Not Found |  -  |
**0** | Error |  -  |

