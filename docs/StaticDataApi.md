# StaticDataApi

All URIs are relative to *https://api.liteapi.travel/v2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataCitiesGet**](StaticDataApi.md#dataCitiesGet) | **GET** /data/cities | City list |
| [**dataCountriesGet**](StaticDataApi.md#dataCountriesGet) | **GET** /data/countries | Country list |
| [**dataCurrenciesGet**](StaticDataApi.md#dataCurrenciesGet) | **GET** /data/currencies | Currency list |
| [**dataHotelGet**](StaticDataApi.md#dataHotelGet) | **GET** /data/hotel | Hotel details |
| [**dataHotelsGet**](StaticDataApi.md#dataHotelsGet) | **GET** /data/hotels | Hotel list |
| [**dataIataCodesGet**](StaticDataApi.md#dataIataCodesGet) | **GET** /data/iataCodes | IATA code list |


<a id="dataCitiesGet"></a>
# **dataCitiesGet**
> Object dataCitiesGet(countryCode)

City list

The API returns a list of city names from a specific country. The country codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all countries please use the **GET** Country list endpoint

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    Object countryCode = "SG"; // Object | Country code in iso-2 format (example: SG)
    try {
      Object result = apiInstance.dataCitiesGet(countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataCitiesGet");
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
| **countryCode** | [**Object**](.md)| Country code in iso-2 format (example: SG) | |

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
| **400** | Bad Request |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

<a id="dataCountriesGet"></a>
# **dataCountriesGet**
> Object dataCountriesGet()

Country list

The API returns the list of countries available along with its ISO-2 code.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      Object result = apiInstance.dataCountriesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataCountriesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

<a id="dataCurrenciesGet"></a>
# **dataCurrenciesGet**
> Object dataCurrenciesGet()

Currency list

The API returns all available currency codes along with its name and the list of supported countries that the currency applies to.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      Object result = apiInstance.dataCurrenciesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataCurrenciesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

<a id="dataHotelGet"></a>
# **dataHotelGet**
> Object dataHotelGet(hotelId)

Hotel details

The hotel details API returns all the static contents details of a hotel or property if the hotel ID is provided. The static content include name, description, address, amenities, cancellation policies, images and more.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    Object hotelId = "57871"; // Object | Unique ID of a hotel
    try {
      Object result = apiInstance.dataHotelGet(hotelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataHotelGet");
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
| **hotelId** | [**Object**](.md)| Unique ID of a hotel | |

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
| **400** | Bad Request |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

<a id="dataHotelsGet"></a>
# **dataHotelsGet**
> Object dataHotelsGet(countryCode, cityName, offset, limit, longitude, latitude, distance)

Hotel list

The API returns a list of hotels available based on different search criterion. The minimum required information is the county code in ISO-2 format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    Object countryCode = "SG"; // Object | country code ISO-2 code - example (SG)
    Object cityName = "Singapore"; // Object | name of the city
    Object offset = 0; // Object | specifies the number of rows to skip before starting to return rows
    Object limit = 1000; // Object | limit number of results (max 1000)
    Object longitude = -115.16988; // Object | longitude geo coordinates
    Object latitude = 36.12510; // Object | latitude geo coordinates
    Object distance = 1000; // Object | distance in meters (min 1000m)
    try {
      Object result = apiInstance.dataHotelsGet(countryCode, cityName, offset, limit, longitude, latitude, distance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataHotelsGet");
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
| **countryCode** | [**Object**](.md)| country code ISO-2 code - example (SG) | |
| **cityName** | [**Object**](.md)| name of the city | |
| **offset** | [**Object**](.md)| specifies the number of rows to skip before starting to return rows | [optional] |
| **limit** | [**Object**](.md)| limit number of results (max 1000) | [optional] |
| **longitude** | [**Object**](.md)| longitude geo coordinates | [optional] |
| **latitude** | [**Object**](.md)| latitude geo coordinates | [optional] |
| **distance** | [**Object**](.md)| distance in meters (min 1000m) | [optional] |

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
| **400** | Bad Request |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

<a id="dataIataCodesGet"></a>
# **dataIataCodesGet**
> Object dataIataCodesGet()

IATA code list

The API returns the IATA  (International Air Transport Association) codes  for all available airports along with the name of the airport, geographical coordinates and country code in ISO-2 format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.liteapi.travel/v2.0");
    
    // Configure API key authorization: apikeyAuth
    ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
    apikeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      Object result = apiInstance.dataIataCodesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#dataIataCodesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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
| **401** | Unauthorized |  * Date -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Connection -  <br>  * x-amzn-RequestId -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Encoding -  <br>  * Access-Control-Allow-Headers -  <br>  * x-amz-apigw-id -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Expose-Headers -  <br>  * x-amzn-Remapped-Date -  <br>  * Access-Control-Max-Age -  <br>  * Access-Control-Allow-Credentials -  <br>  |

