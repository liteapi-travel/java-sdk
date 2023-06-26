# SearchApi

All URIs are relative to *https://api.liteapi.travel/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hotelsGet**](SearchApi.md#hotelsGet) | **GET** /hotels | hotel minimum rates availability |
| [**hotelsRatesGet**](SearchApi.md#hotelsRatesGet) | **GET** /hotels/rates | hotel full rates availability |


<a id="hotelsGet"></a>
# **hotelsGet**
> Object hotelsGet(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId)

hotel minimum rates availability

**Hotel Minimum Rates API** is to search and return the minimum room rates that are available for a list of hotel ID&#39;s on the specified search dates.  For each hotel ID, the minimum room rate that is available is returned.  The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.  If the search is coming from a known guest ID, the guest level is also returned along with pricing has more discounts.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    Object hotelIds = lp3803c,lp1f982,lp19b70,lp19e75; // Object | List of hotelIds
    Object checkin = 2023-11-15; // Object | Check in data in YYYY-MM-DD format
    Object checkout = 2023-11-16; // Object | Check out data in YYYY-MM-DD format
    Object currency = USD; // Object | Currency code - example (USD)
    Object guestNationality = US; // Object | Guest nationality ISO-2 code - example (SG)
    Object adults = 1; // Object | Number of adult guests staying
    Object children = 12,9; // Object | Number of children staying if any
    Object guestId = testtraveler1; // Object | Unique traveler ID if available
    try {
      Object result = apiInstance.hotelsGet(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#hotelsGet");
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
| **hotelIds** | [**Object**](.md)| List of hotelIds | |
| **checkin** | [**Object**](.md)| Check in data in YYYY-MM-DD format | |
| **checkout** | [**Object**](.md)| Check out data in YYYY-MM-DD format | |
| **currency** | [**Object**](.md)| Currency code - example (USD) | |
| **guestNationality** | [**Object**](.md)| Guest nationality ISO-2 code - example (SG) | |
| **adults** | [**Object**](.md)| Number of adult guests staying | |
| **children** | [**Object**](.md)| Number of children staying if any | [optional] |
| **guestId** | [**Object**](.md)| Unique traveler ID if available | [optional] |

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
| **400** | Bad Request |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **401** | Unauthorized |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |

<a id="hotelsRatesGet"></a>
# **hotelsRatesGet**
> Object hotelsRatesGet(hotelIds, checkin, checkout, guestNationality, currency, adults, children, guestId)

hotel full rates availability

The Full Rates  API is to search and return all available rooms along with its rates, cancellation policies for a list of hotel ID&#39;s based on the search dates.   For each hotel ID, all available room information is returned.   The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.   If the search is coming from a known guest ID, the guest level is also returned along with the pricing that&#39;s appropriate for the guest level.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    Object hotelIds = lp3803c,lp1f982,lp19b70,lp19e75; // Object | List of hotelIds
    Object checkin = 2023-11-15; // Object | Check in data in YYYY-MM-DD format
    Object checkout = 2023-11-16; // Object | Check out data in YYYY-MM-DD format
    Object guestNationality = US; // Object | Guest nationality ISO-2 code - example (SG)
    Object currency = USD; // Object | Currency code - example (USD)
    Object adults = 1; // Object | Number of adult guests staying
    Object children = 12,9; // Object | Number of children staying if any
    Object guestId = traveler1; // Object | Unique traveler ID if available
    try {
      Object result = apiInstance.hotelsRatesGet(hotelIds, checkin, checkout, guestNationality, currency, adults, children, guestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#hotelsRatesGet");
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
| **hotelIds** | [**Object**](.md)| List of hotelIds | |
| **checkin** | [**Object**](.md)| Check in data in YYYY-MM-DD format | |
| **checkout** | [**Object**](.md)| Check out data in YYYY-MM-DD format | |
| **guestNationality** | [**Object**](.md)| Guest nationality ISO-2 code - example (SG) | |
| **currency** | [**Object**](.md)| Currency code - example (USD) | |
| **adults** | [**Object**](.md)| Number of adult guests staying | |
| **children** | [**Object**](.md)| Number of children staying if any | [optional] |
| **guestId** | [**Object**](.md)| Unique traveler ID if available | [optional] |

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
| **200** | OK |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **204** | No Content |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **400** | Bad Request |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

