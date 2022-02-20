# DataConsentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ConsentsIndividualsConsentIdAccountsAccountIdGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdAccountsAccountIdGet) | **GET** /v1/consents/individuals/{consentId}/accounts/{accountId} | Get individual consented financial account details based on account id.
[**v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet) | **GET** /v1/consents/individuals/{consentId}/accounts/{accountId}/transactions | Get consented financial account transactions of an individual based on accountId.
[**v1ConsentsIndividualsConsentIdAccountsGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdAccountsGet) | **GET** /v1/consents/individuals/{consentId}/accounts | Get all individual financial accounts in a consent.
[**v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId}/download | Download a individuals consented document.
[**v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId} | Get individuals consent document based on document id.
[**v1ConsentsIndividualsConsentIdDocumentsGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdDocumentsGet) | **GET** /v1/consents/individuals/{consentId}/documents | Get the individual documents based on ConsentId.
[**v1ConsentsIndividualsConsentIdGet**](DataConsentsApi.md#v1ConsentsIndividualsConsentIdGet) | **GET** /v1/consents/individuals/{consentId} | Get individuals consent details by consent id.
[**v1ConsentsIndividualsGet**](DataConsentsApi.md#v1ConsentsIndividualsGet) | **GET** /v1/consents/individuals | Get the list of Consents Sent to Individuals.
[**v1ConsentsOrganizationsConsentIdAccountsAccountIdGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdAccountsAccountIdGet) | **GET** /v1/consents/organizations/{consentId}/accounts/{accountId} | Get orgnization consented financial account details based on account id.
[**v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet) | **GET** /v1/consents/organizations/{consentId}/accounts/{accountId}/transactions | Get consented financial account transactions of an organization based on accountId.
[**v1ConsentsOrganizationsConsentIdAccountsGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdAccountsGet) | **GET** /v1/consents/organizations/{consentId}/accounts | Get all organizational financial accounts in a consent.
[**v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId}/download | Download organizations consented document.
[**v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId} | Get organizations consent document based on document id.
[**v1ConsentsOrganizationsConsentIdDocumentsGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdDocumentsGet) | **GET** /v1/consents/organizations/{consentId}/documents | Get the organizations documents based on ConsentId.
[**v1ConsentsOrganizationsConsentIdGet**](DataConsentsApi.md#v1ConsentsOrganizationsConsentIdGet) | **GET** /v1/consents/organizations/{consentId} | Get organizations consent details by consent id.
[**v1ConsentsOrganizationsGet**](DataConsentsApi.md#v1ConsentsOrganizationsGet) | **GET** /v1/consents/organizations | Get the list of data consents sent for organizations.


<a name="v1ConsentsIndividualsConsentIdAccountsAccountIdGet"></a>
# **v1ConsentsIndividualsConsentIdAccountsAccountIdGet**
> FinancialAccount v1ConsentsIndividualsConsentIdAccountsAccountIdGet(consentId, accountId)

Get individual consented financial account details based on account id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    try {
      FinancialAccount result = apiInstance.v1ConsentsIndividualsConsentIdAccountsAccountIdGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdAccountsAccountIdGet");
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
 **consentId** | **UUID**|  |
 **accountId** | **UUID**|  |

### Return type

[**FinancialAccount**](FinancialAccount.md)

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

<a name="v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet"></a>
# **v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet**
> UserAccountFinancialTransactionsDtoPaginatedList v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, pageNo, pageSize, fromDate, toDate)

Get consented financial account transactions of an individual based on accountId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String filters = "filters_example"; // String | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      UserAccountFinancialTransactionsDtoPaginatedList result = apiInstance.v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, pageNo, pageSize, fromDate, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdAccountsAccountIdTransactionsGet");
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
 **consentId** | **UUID**|  |
 **accountId** | **UUID**|  |
 **filters** | **String**|  | [optional]
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **fromDate** | **OffsetDateTime**|  | [optional]
 **toDate** | **OffsetDateTime**|  | [optional]

### Return type

[**UserAccountFinancialTransactionsDtoPaginatedList**](UserAccountFinancialTransactionsDtoPaginatedList.md)

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

<a name="v1ConsentsIndividualsConsentIdAccountsGet"></a>
# **v1ConsentsIndividualsConsentIdAccountsGet**
> DataConsentFinancialsDto v1ConsentsIndividualsConsentIdAccountsGet(consentId)

Get all individual financial accounts in a consent.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentFinancialsDto result = apiInstance.v1ConsentsIndividualsConsentIdAccountsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdAccountsGet");
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
 **consentId** | **UUID**|  |

### Return type

[**DataConsentFinancialsDto**](DataConsentFinancialsDto.md)

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

<a name="v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet"></a>
# **v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet**
> UserDocumentDownloadDto v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId)

Download a individuals consented document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | consentId.
    UUID documentId = UUID.randomUUID(); // UUID | documentId.
    try {
      UserDocumentDownloadDto result = apiInstance.v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdDocumentsDocumentIdDownloadGet");
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
 **consentId** | **UUID**| consentId. |
 **documentId** | **UUID**| documentId. |

### Return type

[**UserDocumentDownloadDto**](UserDocumentDownloadDto.md)

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

<a name="v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet"></a>
# **v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet**
> UserDocumentDetailsDto v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet(consentId, documentId)

Get individuals consent document based on document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID documentId = UUID.randomUUID(); // UUID | Document Id.
    try {
      UserDocumentDetailsDto result = apiInstance.v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdDocumentsDocumentIdGet");
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
 **consentId** | **UUID**|  |
 **documentId** | **UUID**| Document Id. |

### Return type

[**UserDocumentDetailsDto**](UserDocumentDetailsDto.md)

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

<a name="v1ConsentsIndividualsConsentIdDocumentsGet"></a>
# **v1ConsentsIndividualsConsentIdDocumentsGet**
> DataConsentDocumentsDto v1ConsentsIndividualsConsentIdDocumentsGet(consentId)

Get the individual documents based on ConsentId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDocumentsDto result = apiInstance.v1ConsentsIndividualsConsentIdDocumentsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdDocumentsGet");
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
 **consentId** | **UUID**|  |

### Return type

[**DataConsentDocumentsDto**](DataConsentDocumentsDto.md)

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

<a name="v1ConsentsIndividualsConsentIdGet"></a>
# **v1ConsentsIndividualsConsentIdGet**
> DataConsentDetailsDto v1ConsentsIndividualsConsentIdGet(consentId)

Get individuals consent details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDetailsDto result = apiInstance.v1ConsentsIndividualsConsentIdGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsConsentIdGet");
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
 **consentId** | **UUID**|  |

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

<a name="v1ConsentsIndividualsGet"></a>
# **v1ConsentsIndividualsGet**
> UserDataConsentInfoDtoPaginatedList v1ConsentsIndividualsGet(pageNo, pageSize, status, startDate, endDate)

Get the list of Consents Sent to Individuals.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      UserDataConsentInfoDtoPaginatedList result = apiInstance.v1ConsentsIndividualsGet(pageNo, pageSize, status, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsIndividualsGet");
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
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]

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

<a name="v1ConsentsOrganizationsConsentIdAccountsAccountIdGet"></a>
# **v1ConsentsOrganizationsConsentIdAccountsAccountIdGet**
> OrganizationFinancialAccountDto v1ConsentsOrganizationsConsentIdAccountsAccountIdGet(consentId, accountId)

Get orgnization consented financial account details based on account id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    try {
      OrganizationFinancialAccountDto result = apiInstance.v1ConsentsOrganizationsConsentIdAccountsAccountIdGet(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdAccountsAccountIdGet");
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
 **consentId** | **UUID**|  |
 **accountId** | **UUID**|  |

### Return type

[**OrganizationFinancialAccountDto**](OrganizationFinancialAccountDto.md)

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

<a name="v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet"></a>
# **v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet**
> OrganizationFinancialTransactionsDtoPaginatedList v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, pageNo, pageSize, fromDate, toDate)

Get consented financial account transactions of an organization based on accountId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String filters = "filters_example"; // String | 
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      OrganizationFinancialTransactionsDtoPaginatedList result = apiInstance.v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet(consentId, accountId, filters, pageNo, pageSize, fromDate, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdAccountsAccountIdTransactionsGet");
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
 **consentId** | **UUID**|  |
 **accountId** | **UUID**|  |
 **filters** | **String**|  | [optional]
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **fromDate** | **OffsetDateTime**|  | [optional]
 **toDate** | **OffsetDateTime**|  | [optional]

### Return type

[**OrganizationFinancialTransactionsDtoPaginatedList**](OrganizationFinancialTransactionsDtoPaginatedList.md)

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

<a name="v1ConsentsOrganizationsConsentIdAccountsGet"></a>
# **v1ConsentsOrganizationsConsentIdAccountsGet**
> DataConsentFinancialsDto v1ConsentsOrganizationsConsentIdAccountsGet(consentId)

Get all organizational financial accounts in a consent.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentFinancialsDto result = apiInstance.v1ConsentsOrganizationsConsentIdAccountsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdAccountsGet");
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
 **consentId** | **UUID**|  |

### Return type

[**DataConsentFinancialsDto**](DataConsentFinancialsDto.md)

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

<a name="v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet"></a>
# **v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet**
> OrganizationDocumentDownloadDto v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId)

Download organizations consented document.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID documentId = UUID.randomUUID(); // UUID | 
    try {
      OrganizationDocumentDownloadDto result = apiInstance.v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdDocumentsDocumentIdDownloadGet");
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
 **consentId** | **UUID**|  |
 **documentId** | **UUID**|  |

### Return type

[**OrganizationDocumentDownloadDto**](OrganizationDocumentDownloadDto.md)

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

<a name="v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet"></a>
# **v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet**
> OrganizationDocumentDetailsDto v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet(consentId, documentId)

Get organizations consent document based on document id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    UUID documentId = UUID.randomUUID(); // UUID | 
    try {
      OrganizationDocumentDetailsDto result = apiInstance.v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdDocumentsDocumentIdGet");
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
 **consentId** | **UUID**|  |
 **documentId** | **UUID**|  |

### Return type

[**OrganizationDocumentDetailsDto**](OrganizationDocumentDetailsDto.md)

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

<a name="v1ConsentsOrganizationsConsentIdDocumentsGet"></a>
# **v1ConsentsOrganizationsConsentIdDocumentsGet**
> DataConsentDocumentsDto v1ConsentsOrganizationsConsentIdDocumentsGet(consentId)

Get the organizations documents based on ConsentId.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDocumentsDto result = apiInstance.v1ConsentsOrganizationsConsentIdDocumentsGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdDocumentsGet");
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
 **consentId** | **UUID**|  |

### Return type

[**DataConsentDocumentsDto**](DataConsentDocumentsDto.md)

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

<a name="v1ConsentsOrganizationsConsentIdGet"></a>
# **v1ConsentsOrganizationsConsentIdGet**
> DataConsentDetailsDto v1ConsentsOrganizationsConsentIdGet(consentId)

Get organizations consent details by consent id.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    UUID consentId = UUID.randomUUID(); // UUID | 
    try {
      DataConsentDetailsDto result = apiInstance.v1ConsentsOrganizationsConsentIdGet(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsConsentIdGet");
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
 **consentId** | **UUID**|  |

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

<a name="v1ConsentsOrganizationsGet"></a>
# **v1ConsentsOrganizationsGet**
> OrganizationDataConsentInfoDtoPaginatedList v1ConsentsOrganizationsGet(pageNo, pageSize, status, startDate, endDate)

Get the list of data consents sent for organizations.

### Example
```java
// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentsApi apiInstance = new DataConsentsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      OrganizationDataConsentInfoDtoPaginatedList result = apiInstance.v1ConsentsOrganizationsGet(pageNo, pageSize, status, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#v1ConsentsOrganizationsGet");
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
 **pageNo** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | [**DataConsentStatus**](.md)|  | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]

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

