/*
 * liteAPI
 * The **liteAPI** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 *
 * Do not edit the class manually.
 */

package travel.liteapi.client.api;

import com.google.gson.reflect.TypeToken;

import travel.liteapi.client.ApiCallback;
import travel.liteapi.client.ApiClient;
import travel.liteapi.client.ApiException;
import travel.liteapi.client.ApiResponse;
import travel.liteapi.client.Configuration;
import travel.liteapi.client.Pair;
import travel.liteapi.client.ProgressRequestBody;
import travel.liteapi.client.ProgressResponseBody;

import java.io.IOException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StaticDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StaticDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StaticDataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for dataCitiesGet
     * 
     * @param countryCode Country code in iso-2 format (example: SG) (required)
     * @param _callback   Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 

     */
    public okhttp3.Call getCitiesCall(String countryCode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/cities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (countryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countryCode", countryCode));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCitiesValidateBeforeCall(String countryCode, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling dataCitiesGet(Async)");
        }

        return getCitiesCall(countryCode, _callback);

    }

    /**
     * City list
     * The API returns a list of city names from a specific country. The country
     * codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all
     * countries please use the **GET** Country list endpoint
     * 
     * @param countryCode Country code in iso-2 format (example: SG) (required)
     * @return Object
     * 

     */
    public Object getCitiesByCountryCode(String countryCode) {
        try {
            ApiResponse<Object> localVarResp = getCitiesWithHttpInfo(countryCode);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getCitiesByCountryCode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * City list
     * The API returns a list of city names from a specific country. The country
     * codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all
     * countries please use the **GET** Country list endpoint
     * 
     * @param countryCode Country code in iso-2 format (example: SG) (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 

     */
    public ApiResponse<Object> getCitiesWithHttpInfo(String countryCode) throws ApiException {
        okhttp3.Call localVarCall = getCitiesValidateBeforeCall(countryCode, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * City list (asynchronously)
     * The API returns a list of city names from a specific country. The country
     * codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all
     * countries please use the **GET** Country list endpoint
     * 
     * @param countryCode Country code in iso-2 format (example: SG) (required)
     * @param _callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 

     */
    public okhttp3.Call getCitiesAsync(String countryCode, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCitiesValidateBeforeCall(countryCode, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for dataCountriesGet
     * 
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 
    
     */
    public okhttp3.Call getCountriesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/countries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCountriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCountriesCall(_callback);

    }

    /**
     * Country list
     * The API returns the list of countries available along with its ISO-2 code.
     * 
     * @return Object
     * 
    
     */
    public Object getCountries() {
        try {
            ApiResponse<Object> localVarResp = getCountriesWithHttpInfo();
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getCountries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Country list
     * The API returns the list of countries available along with its ISO-2 code.
     * 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 
    
     */
    public ApiResponse<Object> getCountriesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCountriesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Country list (asynchronously)
     * The API returns the list of countries available along with its ISO-2 code.
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 
    
     */
    public okhttp3.Call getCountriesAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCountriesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for dataCurrenciesGet
     * 
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 
    
     */
    public okhttp3.Call getCurrenciesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/currencies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCurrenciesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCurrenciesCall(_callback);

    }

    /**
     * Currency list
     * The API returns all available currency codes along with its name and the list
     * of supported countries that the currency applies to.
     * 
     * @return Object
     * 
    
     */
    public Object getCurrencies() {
        try {
            ApiResponse<Object> localVarResp = getCurrenciesWithHttpInfo();
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getCurrencies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Currency list
     * The API returns all available currency codes along with its name and the list
     * of supported countries that the currency applies to.
     * 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 
    
     */
    public ApiResponse<Object> getCurrenciesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrenciesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Currency list (asynchronously)
     * The API returns all available currency codes along with its name and the list
     * of supported countries that the currency applies to.
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 
    
     */
    public okhttp3.Call getCurrenciesAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrenciesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for dataHotelGet
     * 
     * @param hotelId   Unique ID of a hotel (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 

     */
    public okhttp3.Call getHotelDetailsCall(String hotelId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/hotel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hotelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hotelId", hotelId));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHotelValidateBeforeCall(String hotelId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new ApiException("Missing the required parameter 'hotelId' when calling dataHotelGet(Async)");
        }

        return getHotelDetailsCall(hotelId, _callback);

    }

    /**
     * Hotel details
     * The hotel details API returns all the static contents details of a hotel or
     * property if the hotel ID is provided. The static content include name,
     * description, address, amenities, cancellation policies, images and more.
     * 
     * @param hotelId Unique ID of a hotel (required)
     * @return Object
     * 

     */
    public Object getHotelDetails(String hotelId) {
        try {
            ApiResponse<Object> localVarResp = getHotelWithHttpInfo(hotelId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getHotelDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Hotel details
     * The hotel details API returns all the static contents details of a hotel or
     * property if the hotel ID is provided. The static content include name,
     * description, address, amenities, cancellation policies, images and more.
     * 
     * @param hotelId Unique ID of a hotel (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 

     */
    public ApiResponse<Object> getHotelWithHttpInfo(String hotelId) throws ApiException {
        okhttp3.Call localVarCall = getHotelValidateBeforeCall(hotelId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Hotel details (asynchronously)
     * The hotel details API returns all the static contents details of a hotel or
     * property if the hotel ID is provided. The static content include name,
     * description, address, amenities, cancellation policies, images and more.
     * 
     * @param hotelId   Unique ID of a hotel (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 

     */
    public okhttp3.Call getHotelAsync(String hotelId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHotelValidateBeforeCall(hotelId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for dataHotelsGet
     * 
     * @param countryCode country code ISO-2 code - example (SG) (required)
     * @param cityName    name of the city (required)
     * @param offset      specifies the number of rows to skip before starting to
     *                    return rows (optional)
     * @param limit       limit number of results (max 1000) (optional)
     * @param longitude   longitude geo coordinates (optional)
     * @param latitude    latitude geo coordinates (optional)
     * @param distance    distance in meters (min 1000m) (optional)
     * @param _callback   Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 

     */
    public okhttp3.Call getHotelsCall(String countryCode, String cityName, Integer offset, Integer limit,
            String longitude, String latitude, Integer distance, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/hotels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (countryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countryCode", countryCode));
        }

        if (cityName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cityName", cityName));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (longitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("longitude", longitude));
        }

        if (latitude != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latitude", latitude));
        }

        if (distance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("distance", distance));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHotelsValidateBeforeCall(String countryCode, String cityName, Integer offset, Integer limit,
            String longitude, String latitude, Integer distance, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling dataHotelsGet(Async)");
        }

        // verify the required parameter 'cityName' is set
        if (cityName == null) {
            throw new ApiException("Missing the required parameter 'cityName' when calling dataHotelsGet(Async)");
        }

        return getHotelsCall(countryCode, cityName, offset, limit, longitude, latitude, distance, _callback);

    }

    /**
     * Hotel list
     * The API returns a list of hotels available based on different search
     * criterion. The minimum required information is the county code in ISO-2
     * format.
     * 
     * @param countryCode country code ISO-2 code - example (SG) (required)
     * @param cityName    name of the city (required)
     * @param offset      specifies the number of rows to skip before starting to
     *                    return rows (optional)
     * @param limit       limit number of results (max 1000) (optional)
     * @param longitude   longitude geo coordinates (optional)
     * @param latitude    latitude geo coordinates (optional)
     * @param distance    distance in meters (min 1000m) (optional)
     * @return Object
     * 

     */
    public Object getHotels(String countryCode, String cityName, Integer offset, Integer limit, String longitude,
            String latitude, Integer distance) {
        try {
            ApiResponse<Object> localVarResp = getHotelsWithHttpInfo(countryCode, cityName, offset, limit, longitude,
                    latitude, distance);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getHotels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Hotel list
     * The API returns a list of hotels available based on different search
     * criterion. The minimum required information is the county code in ISO-2
     * format.
     * 
     * @param countryCode country code ISO-2 code - example (SG) (required)
     * @param cityName    name of the city (required)
     * @param offset      specifies the number of rows to skip before starting to
     *                    return rows (optional)
     * @param limit       limit number of results (max 1000) (optional)
     * @param longitude   longitude geo coordinates (optional)
     * @param latitude    latitude geo coordinates (optional)
     * @param distance    distance in meters (min 1000m) (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 

     */
    public ApiResponse<Object> getHotelsWithHttpInfo(String countryCode, String cityName, Integer offset, Integer limit,
            String longitude, String latitude, Integer distance) throws ApiException {
        okhttp3.Call localVarCall = getHotelsValidateBeforeCall(countryCode, cityName, offset, limit, longitude,
                latitude, distance, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Hotel list (asynchronously)
     * The API returns a list of hotels available based on different search
     * criterion. The minimum required information is the county code in ISO-2
     * format.
     * 
     * @param countryCode country code ISO-2 code - example (SG) (required)
     * @param cityName    name of the city (required)
     * @param offset      specifies the number of rows to skip before starting to
     *                    return rows (optional)
     * @param limit       limit number of results (max 1000) (optional)
     * @param longitude   longitude geo coordinates (optional)
     * @param latitude    latitude geo coordinates (optional)
     * @param distance    distance in meters (min 1000m) (optional)
     * @param _callback   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 

     */
    public okhttp3.Call getHotelsAsync(String countryCode, String cityName, Integer offset, Integer limit,
            String longitude, String latitude, Integer distance, final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getHotelsValidateBeforeCall(countryCode, cityName, offset, limit, longitude,
                latitude, distance, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for dataIataCodesGet
     * 
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 
    
     */
    public okhttp3.Call getIataCodesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/iataCodes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIataCodesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getIataCodesCall(_callback);
    }

    /**
     * IATA code list
     * The API returns the IATA (International Air Transport Association) codes for
     * all available airports along with the name of the airport, geographical
     * coordinates and country code in ISO-2 format.
     * 
     * @return Object
    
     */
    public Object getIataCodes() {
        try {
            ApiResponse<Object> localVarResp = getIataCodesWithHttpInfo();
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getIataCodes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * IATA code list
     * The API returns the IATA (International Air Transport Association) codes for
     * all available airports along with the name of the airport, geographical
     * coordinates and country code in ISO-2 format.
     * 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * 
    
     */
    public ApiResponse<Object> getIataCodesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getIataCodesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * IATA code list (asynchronously)
     * The API returns the IATA (International Air Transport Association) codes for
     * all available airports along with the name of the airport, geographical
     * coordinates and country code in ISO-2 format.
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 
    
     */
    public okhttp3.Call getIataCodesAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIataCodesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
