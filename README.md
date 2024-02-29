# openapi-java-client

Payment Processor Service
- API version: v1
  - Build date: 2024-02-29T16:06:34.958279831Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://payment-processor.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentprocessorApi* | [**authorizePayment**](docs/PaymentprocessorApi.md#authorizePayment) | **POST** /paymentprocessor.Paymentprocessor/AuthorizePayment | Authorize Payment
*PaymentprocessorApi* | [**createPaymentMethod**](docs/PaymentprocessorApi.md#createPaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/CreatePaymentMethod | Create Payment Method
*PaymentprocessorApi* | [**finalizePayment**](docs/PaymentprocessorApi.md#finalizePayment) | **POST** /paymentprocessor.Paymentprocessor/FinalizePayment | Finalize Payment
*PaymentprocessorApi* | [**getAvailablePaymentMethod**](docs/PaymentprocessorApi.md#getAvailablePaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/GetAvailablePaymentMethod | Get Available Payment Method
*PaymentprocessorApi* | [**getPaymentMethod**](docs/PaymentprocessorApi.md#getPaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/GetPaymentMethod | Get Payment Method
*PaymentprocessorApi* | [**getPaymentMethodConfiguration**](docs/PaymentprocessorApi.md#getPaymentMethodConfiguration) | **POST** /paymentprocessor.Paymentprocessor/GetPaymentMethodConfiguration | Get Payment Method Configuration
*PaymentprocessorApi* | [**initPayment**](docs/PaymentprocessorApi.md#initPayment) | **POST** /paymentprocessor.Paymentprocessor/InitPayment | Init Payment
*PaymentprocessorApi* | [**listAvailablePaymentMethods**](docs/PaymentprocessorApi.md#listAvailablePaymentMethods) | **POST** /paymentprocessor.Paymentprocessor/ListAvailablePaymentMethods | List Available Payment Methods
*PaymentprocessorApi* | [**listPaymentMethods**](docs/PaymentprocessorApi.md#listPaymentMethods) | **POST** /paymentprocessor.Paymentprocessor/ListPaymentMethods | List Payment Methods
*PaymentprocessorApi* | [**performPayment**](docs/PaymentprocessorApi.md#performPayment) | **POST** /paymentprocessor.Paymentprocessor/PerformPayment | Perform Payment
*PaymentprocessorApi* | [**performRefund**](docs/PaymentprocessorApi.md#performRefund) | **POST** /paymentprocessor.Paymentprocessor/PerformRefund | Perform Refund
*PaymentprocessorApi* | [**updatePayment**](docs/PaymentprocessorApi.md#updatePayment) | **POST** /paymentprocessor.Paymentprocessor/UpdatePayment | Update Payment
*PaymentprocessorApi* | [**updatePaymentMethod**](docs/PaymentprocessorApi.md#updatePaymentMethod) | **POST** /paymentprocessor.Paymentprocessor/UpdatePaymentMethod | Update Payment Method
*PaymentprocessorApi* | [**voidPayment**](docs/PaymentprocessorApi.md#voidPayment) | **POST** /paymentprocessor.Paymentprocessor/VoidPayment | Void Payment


## Documentation for Models

 - [AvailabilityContextCustomer](docs/AvailabilityContextCustomer.md)
 - [ConditionAction](docs/ConditionAction.md)
 - [PaymentContextOrderInfo](docs/PaymentContextOrderInfo.md)
 - [PaymentMethodRestrictionConditionCondition](docs/PaymentMethodRestrictionConditionCondition.md)
 - [PaymentprocessorAuthorizePaymentRequest](docs/PaymentprocessorAuthorizePaymentRequest.md)
 - [PaymentprocessorAuthorizePaymentResponse](docs/PaymentprocessorAuthorizePaymentResponse.md)
 - [PaymentprocessorAvailabilityContext](docs/PaymentprocessorAvailabilityContext.md)
 - [PaymentprocessorAvailabilityContextPostalAddress](docs/PaymentprocessorAvailabilityContextPostalAddress.md)
 - [PaymentprocessorCreatePaymentMethodRequest](docs/PaymentprocessorCreatePaymentMethodRequest.md)
 - [PaymentprocessorCurrency](docs/PaymentprocessorCurrency.md)
 - [PaymentprocessorFinalizePaymentRequest](docs/PaymentprocessorFinalizePaymentRequest.md)
 - [PaymentprocessorFinalizePaymentResponse](docs/PaymentprocessorFinalizePaymentResponse.md)
 - [PaymentprocessorGetAvailablePaymentMethodRequest](docs/PaymentprocessorGetAvailablePaymentMethodRequest.md)
 - [PaymentprocessorGetPaymentMethodConfigurationRequest](docs/PaymentprocessorGetPaymentMethodConfigurationRequest.md)
 - [PaymentprocessorGetPaymentMethodConfigurationResponse](docs/PaymentprocessorGetPaymentMethodConfigurationResponse.md)
 - [PaymentprocessorGetPaymentMethodRequest](docs/PaymentprocessorGetPaymentMethodRequest.md)
 - [PaymentprocessorInitPaymentRequest](docs/PaymentprocessorInitPaymentRequest.md)
 - [PaymentprocessorInitPaymentResponse](docs/PaymentprocessorInitPaymentResponse.md)
 - [PaymentprocessorItem](docs/PaymentprocessorItem.md)
 - [PaymentprocessorListAvailablePaymentMethodsRequest](docs/PaymentprocessorListAvailablePaymentMethodsRequest.md)
 - [PaymentprocessorListAvailablePaymentMethodsResponse](docs/PaymentprocessorListAvailablePaymentMethodsResponse.md)
 - [PaymentprocessorListPaymentMethodsRequest](docs/PaymentprocessorListPaymentMethodsRequest.md)
 - [PaymentprocessorListPaymentMethodsResponse](docs/PaymentprocessorListPaymentMethodsResponse.md)
 - [PaymentprocessorLocalizedText](docs/PaymentprocessorLocalizedText.md)
 - [PaymentprocessorMoney](docs/PaymentprocessorMoney.md)
 - [PaymentprocessorPayment](docs/PaymentprocessorPayment.md)
 - [PaymentprocessorPaymentContext](docs/PaymentprocessorPaymentContext.md)
 - [PaymentprocessorPaymentMethod](docs/PaymentprocessorPaymentMethod.md)
 - [PaymentprocessorPaymentMethodRestriction](docs/PaymentprocessorPaymentMethodRestriction.md)
 - [PaymentprocessorPaymentMethodRestrictionCondition](docs/PaymentprocessorPaymentMethodRestrictionCondition.md)
 - [PaymentprocessorPerformPaymentRequest](docs/PaymentprocessorPerformPaymentRequest.md)
 - [PaymentprocessorPerformPaymentResponse](docs/PaymentprocessorPerformPaymentResponse.md)
 - [PaymentprocessorPerformRefundRequest](docs/PaymentprocessorPerformRefundRequest.md)
 - [PaymentprocessorPostalAddress](docs/PaymentprocessorPostalAddress.md)
 - [PaymentprocessorTransaction](docs/PaymentprocessorTransaction.md)
 - [PaymentprocessorTransactionType](docs/PaymentprocessorTransactionType.md)
 - [PaymentprocessorUpdatePaymentMethodRequest](docs/PaymentprocessorUpdatePaymentMethodRequest.md)
 - [PaymentprocessorUpdatePaymentRequest](docs/PaymentprocessorUpdatePaymentRequest.md)
 - [PaymentprocessorVoidPaymentRequest](docs/PaymentprocessorVoidPaymentRequest.md)
 - [PaymentprocessorVoidPaymentResponse](docs/PaymentprocessorVoidPaymentResponse.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [RpcStatus](docs/RpcStatus.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com
