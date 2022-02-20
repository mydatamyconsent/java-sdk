# DataConsentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadConsentedDocumentById**](DataConsentsApi.md#downloadConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId}/download | Download a individuals consented document.
[**downloadOrgConsentedDocumentById**](DataConsentsApi.md#downloadOrgConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId}/download | Download a organizations consented document.
[**getAllConsentedDocuments**](DataConsentsApi.md#getAllConsentedDocuments) | **GET** /v1/consents/individuals/{consentId}/documents | Get the individual documents based on ConsentId.
[**getAllConsentedFinancialAccounts**](DataConsentsApi.md#getAllConsentedFinancialAccounts) | **GET** /v1/consents/individuals/{consentId}/accounts | Get all individual consented financial accounts.
[**getAllOrganizationConsentedAccounts**](DataConsentsApi.md#getAllOrganizationConsentedAccounts) | **GET** /v1/consents/organizations/{consentId}/accounts | Get all organizational consented financial accounts.
[**getAllOrganizationConsentedDocuments**](DataConsentsApi.md#getAllOrganizationConsentedDocuments) | **GET** /v1/consents/organizations/{consentId}/documents | Get the organization documents based on ConsentId.
[**getConsentDetailsById**](DataConsentsApi.md#getConsentDetailsById) | **GET** /v1/consents/individuals/{consentId} | Get all individuals consent details by consent id.
[**getConsentedAccountById**](DataConsentsApi.md#getConsentedAccountById) | **GET** /v1/consents/individuals/{consentId}/accounts/{accountId} | Get individual consented financial account details based on account id.
[**getConsentedDocumentById**](DataConsentsApi.md#getConsentedDocumentById) | **GET** /v1/consents/individuals/{consentId}/documents/{documentId} | Get individuals consent document based on document id.
[**getConsentedFinancialAccount**](DataConsentsApi.md#getConsentedFinancialAccount) | **GET** /v1/consents/organizations/{consentId}/accounts/{accountId} | Get organization consented financial account details based on account id.
[**getConsentedFinancialAccountTransactions**](DataConsentsApi.md#getConsentedFinancialAccountTransactions) | **GET** /v1/consents/individuals/{consentId}/accounts/{accountId}/transactions | Get individual consented financial account transactions of an individual based on accountId.
[**getConsents**](DataConsentsApi.md#getConsents) | **GET** /v1/consents/individuals | Get the list of Consents Sent to Individuals.
[**getConsentsForOrganizations**](DataConsentsApi.md#getConsentsForOrganizations) | **GET** /v1/consents/organizations | Get the list of data consents sent for organizations.
[**getOrgConsentedAccountTransactions**](DataConsentsApi.md#getOrgConsentedAccountTransactions) | **GET** /v1/consents/organizations/{consentId}/accounts/{accountId}/transactions | Get organization consented financial account transactions of an individual based on accountId.
[**getOrganizationConsentDetailsById**](DataConsentsApi.md#getOrganizationConsentDetailsById) | **GET** /v1/consents/organizations/{consentId} | Get all organization consent details by consent id.
[**getOrganizationConsentedDocumentById**](DataConsentsApi.md#getOrganizationConsentedDocumentById) | **GET** /v1/consents/organizations/{consentId}/documents/{documentId} | Get organization consent document based on document id.


<a name="downloadConsentedDocumentById"></a>
# **downloadConsentedDocumentById**
> UserDocumentDownloadDto downloadConsentedDocumentById(consentId, documentId)

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID documentId = UUID.randomUUID(); // UUID | Document id.
    try {
      UserDocumentDownloadDto result = apiInstance.downloadConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#downloadConsentedDocumentById");
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
 **consentId** | **UUID**| Consent id. |
 **documentId** | **UUID**| Document id. |

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

<a name="downloadOrgConsentedDocumentById"></a>
# **downloadOrgConsentedDocumentById**
> OrganizationDocumentDownloadDto downloadOrgConsentedDocumentById(consentId, documentId)

Download a organizations consented document.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID documentId = UUID.randomUUID(); // UUID | Document id.
    try {
      OrganizationDocumentDownloadDto result = apiInstance.downloadOrgConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#downloadOrgConsentedDocumentById");
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
 **consentId** | **UUID**| Consent id. |
 **documentId** | **UUID**| Document id. |

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

<a name="getAllConsentedDocuments"></a>
# **getAllConsentedDocuments**
> DataConsentDocumentsDto getAllConsentedDocuments(consentId)

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentDocumentsDto result = apiInstance.getAllConsentedDocuments(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getAllConsentedDocuments");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getAllConsentedFinancialAccounts"></a>
# **getAllConsentedFinancialAccounts**
> DataConsentFinancialsDto getAllConsentedFinancialAccounts(consentId)

Get all individual consented financial accounts.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentFinancialsDto result = apiInstance.getAllConsentedFinancialAccounts(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getAllConsentedFinancialAccounts");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getAllOrganizationConsentedAccounts"></a>
# **getAllOrganizationConsentedAccounts**
> DataConsentFinancialsDto getAllOrganizationConsentedAccounts(consentId)

Get all organizational consented financial accounts.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentFinancialsDto result = apiInstance.getAllOrganizationConsentedAccounts(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getAllOrganizationConsentedAccounts");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getAllOrganizationConsentedDocuments"></a>
# **getAllOrganizationConsentedDocuments**
> DataConsentDocumentsDto getAllOrganizationConsentedDocuments(consentId)

Get the organization documents based on ConsentId.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentDocumentsDto result = apiInstance.getAllOrganizationConsentedDocuments(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getAllOrganizationConsentedDocuments");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getConsentDetailsById"></a>
# **getConsentDetailsById**
> DataConsentDetailsDto getConsentDetailsById(consentId)

Get all individuals consent details by consent id.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentDetailsDto result = apiInstance.getConsentDetailsById(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentDetailsById");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getConsentedAccountById"></a>
# **getConsentedAccountById**
> FinancialAccount getConsentedAccountById(consentId, accountId)

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    try {
      FinancialAccount result = apiInstance.getConsentedAccountById(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedAccountById");
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
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |

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

<a name="getConsentedDocumentById"></a>
# **getConsentedDocumentById**
> UserDocumentDetailsDto getConsentedDocumentById(consentId, documentId)

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID documentId = UUID.randomUUID(); // UUID | Document Id.
    try {
      UserDocumentDetailsDto result = apiInstance.getConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedDocumentById");
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
 **consentId** | **UUID**| Consent id. |
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

<a name="getConsentedFinancialAccount"></a>
# **getConsentedFinancialAccount**
> OrganizationFinancialAccountDto getConsentedFinancialAccount(consentId, accountId)

Get organization consented financial account details based on account id.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    try {
      OrganizationFinancialAccountDto result = apiInstance.getConsentedFinancialAccount(consentId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedFinancialAccount");
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
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |

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

<a name="getConsentedFinancialAccountTransactions"></a>
# **getConsentedFinancialAccountTransactions**
> UserAccountFinancialTransactionsDtoPaginatedList getConsentedFinancialAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize)

Get individual consented financial account transactions of an individual based on accountId.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    String filters = "filters_example"; // String | Filters.
    OffsetDateTime fromDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime toDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 10; // Integer | Page no.
    Integer pageSize = 25; // Integer | Page size.
    try {
      UserAccountFinancialTransactionsDtoPaginatedList result = apiInstance.getConsentedFinancialAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentedFinancialAccountTransactions");
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
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |
 **filters** | **String**| Filters. | [optional]
 **fromDateTimeUtc** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **toDateTimeUtc** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page no. | [optional] [default to 10]
 **pageSize** | **Integer**| Page size. | [optional] [default to 25]

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

<a name="getConsents"></a>
# **getConsents**
> UserDataConsentInfoDtoPaginatedList getConsents(status, from, to, pageNo, pageSize)

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
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus.
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Page size.
    try {
      UserDataConsentInfoDtoPaginatedList result = apiInstance.getConsents(status, from, to, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsents");
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
 **status** | [**DataConsentStatus**](.md)| Data consent status MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **from** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **to** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Page size. | [optional] [default to 25]

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

<a name="getConsentsForOrganizations"></a>
# **getConsentsForOrganizations**
> OrganizationDataConsentInfoDtoPaginatedList getConsentsForOrganizations(status, from, to, pageNo, pageSize)

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
    DataConsentStatus status = DataConsentStatus.fromValue("Pending"); // DataConsentStatus | Data consent status MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus.
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 1; // Integer | Page number.
    Integer pageSize = 25; // Integer | Page size.
    try {
      OrganizationDataConsentInfoDtoPaginatedList result = apiInstance.getConsentsForOrganizations(status, from, to, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getConsentsForOrganizations");
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
 **status** | [**DataConsentStatus**](.md)| Data consent status MyDataMyConsent.Domain.Entities.ConsentAggregate.Enums.DataConsentStatus. | [optional] [enum: Pending, Approved, Rejected, Revoked, Expired, Canceled]
 **from** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **to** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page number. | [optional] [default to 1]
 **pageSize** | **Integer**| Page size. | [optional] [default to 25]

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

<a name="getOrgConsentedAccountTransactions"></a>
# **getOrgConsentedAccountTransactions**
> OrganizationFinancialTransactionsDtoPaginatedList getOrgConsentedAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize)

Get organization consented financial account transactions of an individual based on accountId.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID accountId = UUID.randomUUID(); // UUID | Account id.
    String filters = "filters_example"; // String | Filters.
    OffsetDateTime fromDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | From date time in utc timezone.
    OffsetDateTime toDateTimeUtc = OffsetDateTime.now(); // OffsetDateTime | Til date time in utc timezone.
    Integer pageNo = 1; // Integer | Page no.
    Integer pageSize = 25; // Integer | Page size.
    try {
      OrganizationFinancialTransactionsDtoPaginatedList result = apiInstance.getOrgConsentedAccountTransactions(consentId, accountId, filters, fromDateTimeUtc, toDateTimeUtc, pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrgConsentedAccountTransactions");
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
 **consentId** | **UUID**| Consent id. |
 **accountId** | **UUID**| Account id. |
 **filters** | **String**| Filters. | [optional]
 **fromDateTimeUtc** | **OffsetDateTime**| From date time in utc timezone. | [optional]
 **toDateTimeUtc** | **OffsetDateTime**| Til date time in utc timezone. | [optional]
 **pageNo** | **Integer**| Page no. | [optional] [default to 1]
 **pageSize** | **Integer**| Page size. | [optional] [default to 25]

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

<a name="getOrganizationConsentDetailsById"></a>
# **getOrganizationConsentDetailsById**
> DataConsentDetailsDto getOrganizationConsentDetailsById(consentId)

Get all organization consent details by consent id.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    try {
      DataConsentDetailsDto result = apiInstance.getOrganizationConsentDetailsById(consentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationConsentDetailsById");
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
 **consentId** | **UUID**| Consent id. |

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

<a name="getOrganizationConsentedDocumentById"></a>
# **getOrganizationConsentedDocumentById**
> OrganizationDocumentDetailsDto getOrganizationConsentedDocumentById(consentId, documentId)

Get organization consent document based on document id.

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
    UUID consentId = UUID.randomUUID(); // UUID | Consent id.
    UUID documentId = UUID.randomUUID(); // UUID | Document Id.
    try {
      OrganizationDocumentDetailsDto result = apiInstance.getOrganizationConsentedDocumentById(consentId, documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentsApi#getOrganizationConsentedDocumentById");
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
 **consentId** | **UUID**| Consent id. |
 **documentId** | **UUID**| Document Id. |

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

