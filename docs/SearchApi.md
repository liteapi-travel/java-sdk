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
    String hotelIds = "lp3803c,lp1f982,lp19b70,lp19e75"; // String | List of hotelIds
    String checkin = "2023-11-15"; // String | Check in data in YYYY-MM-DD format
    String checkout = "2023-11-16"; // String | Check out data in YYYY-MM-DD format
    String currency = "USD"; // String | Currency code - example (USD)
    String guestNationality = "US"; // String | Guest nationality ISO-2 code - example (SG)
    Integer adults = 1; // Integer | Number of adult guests staying
    String children = "12,9"; // String | Number of children staying if any
    String guestId = "testtraveler1"; // String | Unique traveler ID if available
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
| **hotelIds** | **String**| List of hotelIds | |
| **checkin** | **String**| Check in data in YYYY-MM-DD format | |
| **checkout** | **String**| Check out data in YYYY-MM-DD format | |
| **currency** | **String**| Currency code - example (USD) | |
| **guestNationality** | **String**| Guest nationality ISO-2 code - example (SG) | |
| **adults** | **Integer**| Number of adult guests staying | |
| **children** | **String**| Number of children staying if any | [optional] |
| **guestId** | **String**| Unique traveler ID if available | [optional] |

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
    String hotelIds = "lp3803c,lp1f982,lp19b70,lp19e75"; // String | List of hotelIds
    String checkin = "2023-11-15"; // String | Check in data in YYYY-MM-DD format
    String checkout = "2023-11-16"; // String | Check out data in YYYY-MM-DD format
    String guestNationality = "US"; // String | Guest nationality ISO-2 code - example (SG)
    String currency = "USD"; // String | Currency code - example (USD)
    Integer adults = 1; // Integer | Number of adult guests staying
    String children = "12,9"; // String | Number of children staying if any
    String guestId = "traveler1"; // String | Unique traveler ID if available
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
| **hotelIds** | **String**| List of hotelIds | |
| **checkin** | **String**| Check in data in YYYY-MM-DD format | |
| **checkout** | **String**| Check out data in YYYY-MM-DD format | |
| **guestNationality** | **String**| Guest nationality ISO-2 code - example (SG) | |
| **currency** | **String**| Currency code - example (USD) | |
| **adults** | **Integer**| Number of adult guests staying | |
| **children** | **String**| Number of children staying if any | [optional] |
| **guestId** | **String**| Unique traveler ID if available | [optional] |

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

