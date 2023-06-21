# GuestAndLoyaltyApi

All URIs are relative to *https://api.liteapi.travel/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**guestsGet**](GuestAndLoyaltyApi.md#guestsGet) | **GET** /guests | guests |


<a id="guestsGet"></a>
# **guestsGet**
> Object guestsGet(email)

guests

The guests API returns the unique guest ID of a user based on the users email ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GuestAndLoyaltyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    GuestAndLoyaltyApi apiInstance = new GuestAndLoyaltyApi(defaultClient);
    String email = "johndoe@nlite.ml"; // String | Email ID of the guest
    try {
      Object result = apiInstance.guestsGet(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestAndLoyaltyApi#guestsGet");
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
| **email** | **String**| Email ID of the guest | [optional] |

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
| **400** | Bad Request |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amzn-Remapped-Content-Length -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

