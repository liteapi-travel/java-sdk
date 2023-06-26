# BookingManagementApi

All URIs are relative to *https://api.liteapi.travel/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookingsBookingIdGet**](BookingManagementApi.md#bookingsBookingIdGet) | **GET** /bookings/{bookingId} | Booking retrieve |
| [**bookingsBookingIdPut**](BookingManagementApi.md#bookingsBookingIdPut) | **PUT** /bookings/{bookingId} | Booking cancel |
| [**bookingsGet**](BookingManagementApi.md#bookingsGet) | **GET** /bookings | Booking list |


<a id="bookingsBookingIdGet"></a>
# **bookingsBookingIdGet**
> Object bookingsBookingIdGet(bookingId)

Booking retrieve

The API returns the status and the details for the a specific booking Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    Object bookingId =  hSq2gVDrf; // Object | The Booking Id that needs to be retrieved
    try {
      Object result = apiInstance.bookingsBookingIdGet(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdGet");
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
| **bookingId** | [**Object**](.md)| The Booking Id that needs to be retrieved | |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **204** | No Content |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **401** | Unauthorized |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |

<a id="bookingsBookingIdPut"></a>
# **bookingsBookingIdPut**
> Object bookingsBookingIdPut(bookingId)

Booking cancel

&lt;!-- theme: danger --&gt; This API is used to request a cancellation of an existing confirmed booking. Cancellation policies and conditions will be used to determine the success of the cancellation. For example a booking with non-refundable (NRFN) tag or a booking with a cancellation policy that was requested past the cancellation date will not be able to cancel the confirmed booking.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    Object bookingId = hSq2gVDrf; // Object | (Required) The unique identifier of the booking you would like to update.
    try {
      Object result = apiInstance.bookingsBookingIdPut(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdPut");
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
| **bookingId** | [**Object**](.md)| (Required) The unique identifier of the booking you would like to update. | |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **204** | No Content |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **304** | Not Modified |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **401** | Unauthorized |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |

<a id="bookingsGet"></a>
# **bookingsGet**
> Object bookingsGet(guestId)

Booking list

The API returns the list of booking Id&#39;s for a given guest Id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    Object guestId = FrT56hfty; // Object | The Guest Id of the user
    try {
      Object result = apiInstance.bookingsGet(guestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#bookingsGet");
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
| **guestId** | [**Object**](.md)| The Guest Id of the user | |

### Return type

**Object**

### Authorization

[apikeyAuth](../README.md#apikeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **204** | No Content |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

