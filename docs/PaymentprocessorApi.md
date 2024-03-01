# PaymentprocessorApi

All URIs are relative to *https://payment-processor.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizePayment**](PaymentprocessorApi.md#authorizePayment) | **POST** /paymentprocessor.Paymentprocessor/AuthorizePayment | Authorize Payment |
| [**createPaymentMethod**](PaymentprocessorApi.md#createPaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/CreatePaymentMethod | Create Payment Method |
| [**finalizePayment**](PaymentprocessorApi.md#finalizePayment) | **POST** /paymentprocessor.Paymentprocessor/FinalizePayment | Finalize Payment |
| [**getAvailablePaymentMethod**](PaymentprocessorApi.md#getAvailablePaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/GetAvailablePaymentMethod | Get Available Payment Method |
| [**getPaymentMethod**](PaymentprocessorApi.md#getPaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/GetPaymentMethod | Get Payment Method |
| [**getPaymentMethodConfiguration**](PaymentprocessorApi.md#getPaymentMethodConfiguration) | **POST** /paymentprocessor.Paymentprocessor/GetPaymentMethodConfiguration | Get Payment Method Configuration |
| [**initPayment**](PaymentprocessorApi.md#initPayment) | **POST** /paymentprocessor.Paymentprocessor/InitPayment | Init Payment |
| [**listAvailablePaymentMethods**](PaymentprocessorApi.md#listAvailablePaymentMethods) | **POST** /paymentprocessor.Paymentprocessor/ListAvailablePaymentMethods | List Available Payment Methods |
| [**listPaymentMethods**](PaymentprocessorApi.md#listPaymentMethods) | **POST** /paymentprocessor.Paymentprocessor/ListPaymentMethods | List Payment Methods |
| [**performPayment**](PaymentprocessorApi.md#performPayment) | **POST** /paymentprocessor.Paymentprocessor/PerformPayment | Perform Payment |
| [**performRefund**](PaymentprocessorApi.md#performRefund) | **POST** /paymentprocessor.Paymentprocessor/PerformRefund | Perform Refund |
| [**updatePayment**](PaymentprocessorApi.md#updatePayment) | **POST** /paymentprocessor.Paymentprocessor/UpdatePayment | Update Payment |
| [**updatePaymentMethod**](PaymentprocessorApi.md#updatePaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/UpdatePaymentMethod | Update Payment Method |
| [**voidPayment**](PaymentprocessorApi.md#voidPayment) | **POST** /paymentprocessor.Paymentprocessor/VoidPayment | Void Payment |


<a id="authorizePayment"></a>
# **authorizePayment**
> PaymentprocessorAuthorizePaymentResponse authorizePayment(body)

Authorize Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorAuthorizePaymentRequest body = new PaymentprocessorAuthorizePaymentRequest(); // PaymentprocessorAuthorizePaymentRequest | 
    try {
      PaymentprocessorAuthorizePaymentResponse result = apiInstance.authorizePayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#authorizePayment");
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
| **body** | [**PaymentprocessorAuthorizePaymentRequest**](PaymentprocessorAuthorizePaymentRequest.md)|  | |

### Return type

[**PaymentprocessorAuthorizePaymentResponse**](PaymentprocessorAuthorizePaymentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createPaymentMethod"></a>
# **createPaymentMethod**
> PaymentprocessorPaymentMethod createPaymentMethod(body)

Create Payment Method

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorCreatePaymentMethodRequest body = new PaymentprocessorCreatePaymentMethodRequest(); // PaymentprocessorCreatePaymentMethodRequest | 
    try {
      PaymentprocessorPaymentMethod result = apiInstance.createPaymentMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#createPaymentMethod");
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
| **body** | [**PaymentprocessorCreatePaymentMethodRequest**](PaymentprocessorCreatePaymentMethodRequest.md)|  | |

### Return type

[**PaymentprocessorPaymentMethod**](PaymentprocessorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="finalizePayment"></a>
# **finalizePayment**
> PaymentprocessorFinalizePaymentResponse finalizePayment(body)

Finalize Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorFinalizePaymentRequest body = new PaymentprocessorFinalizePaymentRequest(); // PaymentprocessorFinalizePaymentRequest | 
    try {
      PaymentprocessorFinalizePaymentResponse result = apiInstance.finalizePayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#finalizePayment");
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
| **body** | [**PaymentprocessorFinalizePaymentRequest**](PaymentprocessorFinalizePaymentRequest.md)|  | |

### Return type

[**PaymentprocessorFinalizePaymentResponse**](PaymentprocessorFinalizePaymentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getAvailablePaymentMethod"></a>
# **getAvailablePaymentMethod**
> PaymentprocessorPaymentMethod getAvailablePaymentMethod(body)

Get Available Payment Method

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorGetAvailablePaymentMethodRequest body = new PaymentprocessorGetAvailablePaymentMethodRequest(); // PaymentprocessorGetAvailablePaymentMethodRequest | 
    try {
      PaymentprocessorPaymentMethod result = apiInstance.getAvailablePaymentMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#getAvailablePaymentMethod");
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
| **body** | [**PaymentprocessorGetAvailablePaymentMethodRequest**](PaymentprocessorGetAvailablePaymentMethodRequest.md)|  | |

### Return type

[**PaymentprocessorPaymentMethod**](PaymentprocessorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPaymentMethod"></a>
# **getPaymentMethod**
> PaymentprocessorPaymentMethod getPaymentMethod(body)

Get Payment Method

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorGetPaymentMethodRequest body = new PaymentprocessorGetPaymentMethodRequest(); // PaymentprocessorGetPaymentMethodRequest | 
    try {
      PaymentprocessorPaymentMethod result = apiInstance.getPaymentMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#getPaymentMethod");
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
| **body** | [**PaymentprocessorGetPaymentMethodRequest**](PaymentprocessorGetPaymentMethodRequest.md)|  | |

### Return type

[**PaymentprocessorPaymentMethod**](PaymentprocessorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPaymentMethodConfiguration"></a>
# **getPaymentMethodConfiguration**
> PaymentprocessorGetPaymentMethodConfigurationResponse getPaymentMethodConfiguration(body)

Get Payment Method Configuration

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorGetPaymentMethodConfigurationRequest body = new PaymentprocessorGetPaymentMethodConfigurationRequest(); // PaymentprocessorGetPaymentMethodConfigurationRequest | 
    try {
      PaymentprocessorGetPaymentMethodConfigurationResponse result = apiInstance.getPaymentMethodConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#getPaymentMethodConfiguration");
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
| **body** | [**PaymentprocessorGetPaymentMethodConfigurationRequest**](PaymentprocessorGetPaymentMethodConfigurationRequest.md)|  | |

### Return type

[**PaymentprocessorGetPaymentMethodConfigurationResponse**](PaymentprocessorGetPaymentMethodConfigurationResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="initPayment"></a>
# **initPayment**
> PaymentprocessorInitPaymentResponse initPayment(body)

Init Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorInitPaymentRequest body = new PaymentprocessorInitPaymentRequest(); // PaymentprocessorInitPaymentRequest | 
    try {
      PaymentprocessorInitPaymentResponse result = apiInstance.initPayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#initPayment");
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
| **body** | [**PaymentprocessorInitPaymentRequest**](PaymentprocessorInitPaymentRequest.md)|  | |

### Return type

[**PaymentprocessorInitPaymentResponse**](PaymentprocessorInitPaymentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listAvailablePaymentMethods"></a>
# **listAvailablePaymentMethods**
> PaymentprocessorListAvailablePaymentMethodsResponse listAvailablePaymentMethods(body)

List Available Payment Methods

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorListAvailablePaymentMethodsRequest body = new PaymentprocessorListAvailablePaymentMethodsRequest(); // PaymentprocessorListAvailablePaymentMethodsRequest | 
    try {
      PaymentprocessorListAvailablePaymentMethodsResponse result = apiInstance.listAvailablePaymentMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#listAvailablePaymentMethods");
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
| **body** | [**PaymentprocessorListAvailablePaymentMethodsRequest**](PaymentprocessorListAvailablePaymentMethodsRequest.md)|  | |

### Return type

[**PaymentprocessorListAvailablePaymentMethodsResponse**](PaymentprocessorListAvailablePaymentMethodsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listPaymentMethods"></a>
# **listPaymentMethods**
> PaymentprocessorListPaymentMethodsResponse listPaymentMethods(body)

List Payment Methods

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorListPaymentMethodsRequest body = new PaymentprocessorListPaymentMethodsRequest(); // PaymentprocessorListPaymentMethodsRequest | 
    try {
      PaymentprocessorListPaymentMethodsResponse result = apiInstance.listPaymentMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#listPaymentMethods");
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
| **body** | [**PaymentprocessorListPaymentMethodsRequest**](PaymentprocessorListPaymentMethodsRequest.md)|  | |

### Return type

[**PaymentprocessorListPaymentMethodsResponse**](PaymentprocessorListPaymentMethodsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="performPayment"></a>
# **performPayment**
> PaymentprocessorPerformPaymentResponse performPayment(body)

Perform Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorPerformPaymentRequest body = new PaymentprocessorPerformPaymentRequest(); // PaymentprocessorPerformPaymentRequest | 
    try {
      PaymentprocessorPerformPaymentResponse result = apiInstance.performPayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#performPayment");
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
| **body** | [**PaymentprocessorPerformPaymentRequest**](PaymentprocessorPerformPaymentRequest.md)|  | |

### Return type

[**PaymentprocessorPerformPaymentResponse**](PaymentprocessorPerformPaymentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="performRefund"></a>
# **performRefund**
> Object performRefund(body)

Perform Refund

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorPerformRefundRequest body = new PaymentprocessorPerformRefundRequest(); // PaymentprocessorPerformRefundRequest | 
    try {
      Object result = apiInstance.performRefund(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#performRefund");
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
| **body** | [**PaymentprocessorPerformRefundRequest**](PaymentprocessorPerformRefundRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updatePayment"></a>
# **updatePayment**
> Object updatePayment(body)

Update Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorUpdatePaymentRequest body = new PaymentprocessorUpdatePaymentRequest(); // PaymentprocessorUpdatePaymentRequest | 
    try {
      Object result = apiInstance.updatePayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#updatePayment");
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
| **body** | [**PaymentprocessorUpdatePaymentRequest**](PaymentprocessorUpdatePaymentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updatePaymentMethod"></a>
# **updatePaymentMethod**
> PaymentprocessorPaymentMethod updatePaymentMethod(body)

Update Payment Method

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorUpdatePaymentMethodRequest body = new PaymentprocessorUpdatePaymentMethodRequest(); // PaymentprocessorUpdatePaymentMethodRequest | 
    try {
      PaymentprocessorPaymentMethod result = apiInstance.updatePaymentMethod(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#updatePaymentMethod");
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
| **body** | [**PaymentprocessorUpdatePaymentMethodRequest**](PaymentprocessorUpdatePaymentMethodRequest.md)|  | |

### Return type

[**PaymentprocessorPaymentMethod**](PaymentprocessorPaymentMethod.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="voidPayment"></a>
# **voidPayment**
> PaymentprocessorVoidPaymentResponse voidPayment(body)

Void Payment

### Example
```java
// Import classes:
import GeminiCommerce_Paymentprocessor.ApiClient;
import GeminiCommerce_Paymentprocessor.ApiException;
import GeminiCommerce_Paymentprocessor.Configuration;
import GeminiCommerce_Paymentprocessor.auth.*;
import GeminiCommerce_Paymentprocessor.models.*;
import org.openapitools.client.api.PaymentprocessorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://payment-processor.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentprocessorApi apiInstance = new PaymentprocessorApi(defaultClient);
    PaymentprocessorVoidPaymentRequest body = new PaymentprocessorVoidPaymentRequest(); // PaymentprocessorVoidPaymentRequest | 
    try {
      PaymentprocessorVoidPaymentResponse result = apiInstance.voidPayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentprocessorApi#voidPayment");
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
| **body** | [**PaymentprocessorVoidPaymentRequest**](PaymentprocessorVoidPaymentRequest.md)|  | |

### Return type

[**PaymentprocessorVoidPaymentResponse**](PaymentprocessorVoidPaymentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

