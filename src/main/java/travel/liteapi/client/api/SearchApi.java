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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
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
     * Build call for hotelsGet
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param currency         Currency code - example (USD) (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @param _callback        Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amzn-Remapped-Content-Length - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getMinimumRatesCall(String[] hotelIds, String checkin, String checkout, String currency,
            String guestNationality, Integer adults, Integer[] children, String guestId, final ApiCallback _callback)
            throws ApiException {
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
        String localVarPath = "/hotels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hotelIds != null && hotelIds.length > 0) {
            String strHotelIds = String.join(",", hotelIds);
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hotelIds", strHotelIds));
        }

        if (checkin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkin", checkin));
        }

        if (checkout != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkout", checkout));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (guestNationality != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("guestNationality", guestNationality));
        }

        if (adults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("adults", adults));
        }

        if (children != null) {
            String strChildren = Arrays.toString(children).replaceAll("\\[|\\]", "");
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("children", strChildren));
        }

        if (guestId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("guestId", guestId));
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
    private okhttp3.Call getMinimumRatesValidateBeforeCall(String[] hotelIds, String checkin, String checkout,
            String currency, String guestNationality, Integer adults, Integer[] children, String guestId,
            final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hotelIds' is set
        if (hotelIds == null) {
            throw new ApiException("Missing the required parameter 'hotelIds' when calling hotelsGet(Async)");
        }

        // verify the required parameter 'checkin' is set
        if (checkin == null) {
            throw new ApiException("Missing the required parameter 'checkin' when calling hotelsGet(Async)");
        }

        // verify the required parameter 'checkout' is set
        if (checkout == null) {
            throw new ApiException("Missing the required parameter 'checkout' when calling hotelsGet(Async)");
        }

        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling hotelsGet(Async)");
        }

        // verify the required parameter 'guestNationality' is set
        if (guestNationality == null) {
            throw new ApiException("Missing the required parameter 'guestNationality' when calling hotelsGet(Async)");
        }

        // verify the required parameter 'adults' is set
        if (adults == null) {
            throw new ApiException("Missing the required parameter 'adults' when calling hotelsGet(Async)");
        }

        return getMinimumRatesCall(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId,
                _callback);

    }

    /**
     * hotel minimum rates availability
     * **Hotel Minimum Rates API** is to search and return the minimum room rates
     * that are available for a list of hotel ID&#39;s on the specified search
     * dates. For each hotel ID, the minimum room rate that is available is
     * returned. The API also has a built in loyalty rewards system. The system
     * rewards return users who have made prior bookings. If the search is coming
     * from a known guest ID, the guest level is also returned along with pricing
     * has more discounts. If it is a new user, the guest ID will be generated at
     * the time of the first confirmed booking. Example API key for test:
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param currency         Currency code - example (USD) (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amzn-Remapped-Content-Length - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public Object getMinimumRates(String[] hotelIds, String checkin, String checkout, String currency,
            String guestNationality, Integer adults, Integer[] children, String guestId) {
        try {
            ApiResponse<Object> localVarResp = getMinimumRatesWithHttpInfo(hotelIds, checkin, checkout, currency,
                    guestNationality, adults, children, guestId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getMinimumRates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * hotel minimum rates availability
     * **Hotel Minimum Rates API** is to search and return the minimum room rates
     * that are available for a list of hotel ID&#39;s on the specified search
     * dates. For each hotel ID, the minimum room rate that is available is
     * returned. The API also has a built in loyalty rewards system. The system
     * rewards return users who have made prior bookings. If the search is coming
     * from a known guest ID, the guest level is also returned along with pricing
     * has more discounts. If it is a new user, the guest ID will be generated at
     * the time of the first confirmed booking. Example API key for test:
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param currency         Currency code - example (USD) (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amzn-Remapped-Content-Length - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Object> getMinimumRatesWithHttpInfo(String[] hotelIds, String checkin, String checkout,
            String currency, String guestNationality, Integer adults, Integer[] children, String guestId)
            throws ApiException {
        okhttp3.Call localVarCall = getMinimumRatesValidateBeforeCall(hotelIds, checkin, checkout, currency,
                guestNationality, adults, children, guestId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * hotel minimum rates availability (asynchronously)
     * **Hotel Minimum Rates API** is to search and return the minimum room rates
     * that are available for a list of hotel ID&#39;s on the specified search
     * dates. For each hotel ID, the minimum room rate that is available is
     * returned. The API also has a built in loyalty rewards system. The system
     * rewards return users who have made prior bookings. If the search is coming
     * from a known guest ID, the guest level is also returned along with pricing
     * has more discounts. If it is a new user, the guest ID will be generated at
     * the time of the first confirmed booking. Example API key for test:
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param currency         Currency code - example (USD) (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @param _callback        The callback to be executed when the API call
     *                         finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amzn-Remapped-Content-Length - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
     *                        <td>* Access-Control-Allow-Credentials - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Content-Type - <br>
     *                        * Date - <br>
     *                        * Content-Length - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getMinimumRatesAsync(String[] hotelIds, String checkin, String checkout, String currency,
            String guestNationality, Integer adults, Integer[] children, String guestId,
            final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMinimumRatesValidateBeforeCall(hotelIds, checkin, checkout, currency,
                guestNationality, adults, children, guestId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for hotelsRatesGet
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param currency         Currency code - example (USD) (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @param _callback        Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getFullRatesCall(String[] hotelIds, String checkin, String checkout, String guestNationality,
            String currency, Integer adults, Integer[] children, String guestId, final ApiCallback _callback)
            throws ApiException {
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
        String localVarPath = "/hotels/rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (hotelIds != null && hotelIds.length > 0) {
            String strHotelIds = String.join(",", hotelIds);
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hotelIds", strHotelIds));
        }

        if (checkin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkin", checkin));
        }

        if (checkout != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("checkout", checkout));
        }

        if (guestNationality != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("guestNationality", guestNationality));
        }

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (adults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("adults", adults));
        }

        if (children != null && children.length > 0) {
            String strChildren = Arrays.toString(children).replaceAll("\\[|\\]", "");
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("children", strChildren));
        }

        if (guestId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("guestId", guestId));
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
    private okhttp3.Call getFullRatesValidateBeforeCall(String[] hotelIds, String checkin, String checkout,
            String guestNationality, String currency, Integer adults, Integer[] children, String guestId,
            final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hotelIds' is set
        if (hotelIds == null) {
            throw new ApiException("Missing the required parameter 'hotelIds' when calling hotelsRatesGet(Async)");
        }

        // verify the required parameter 'checkin' is set
        if (checkin == null) {
            throw new ApiException("Missing the required parameter 'checkin' when calling hotelsRatesGet(Async)");
        }

        // verify the required parameter 'checkout' is set
        if (checkout == null) {
            throw new ApiException("Missing the required parameter 'checkout' when calling hotelsRatesGet(Async)");
        }

        // verify the required parameter 'guestNationality' is set
        if (guestNationality == null) {
            throw new ApiException(
                    "Missing the required parameter 'guestNationality' when calling hotelsRatesGet(Async)");
        }

        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling hotelsRatesGet(Async)");
        }

        // verify the required parameter 'adults' is set
        if (adults == null) {
            throw new ApiException("Missing the required parameter 'adults' when calling hotelsRatesGet(Async)");
        }

        return getFullRatesCall(hotelIds, checkin, checkout, guestNationality, currency, adults, children, guestId,
                _callback);

    }

    /**
     * hotel full rates availability
     * The Full Rates API is to search and return all available rooms along with its
     * rates, cancellation policies for a list of hotel ID&#39;s based on the search
     * dates. For each hotel ID, all available room information is returned. The API
     * also has a built in loyalty rewards system. The system rewards return users
     * who have made prior bookings. If the search is coming from a known guest ID,
     * the guest level is also returned along with the pricing that&#39;s
     * appropriate for the guest level. If it is a new user, the guest ID will be
     * generated at the time of the first confirmed booking. Example API key for
     * test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param currency         Currency code - example (USD) (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public Object getFullRatest(String[] hotelIds, String checkin, String checkout, String currency, 
    String guestNationality, Integer adults, Integer[] children, String guestId) {
        try {
            ApiResponse<Object> localVarResp = getFullRatesWithHttpInfo(hotelIds, checkin, checkout, guestNationality,
                    currency, adults, children, guestId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getFullRatest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }

    }

    /**
     * hotel full rates availability
     * The Full Rates API is to search and return all available rooms along with its
     * rates, cancellation policies for a list of hotel ID&#39;s based on the search
     * dates. For each hotel ID, all available room information is returned. The API
     * also has a built in loyalty rewards system. The system rewards return users
     * who have made prior bookings. If the search is coming from a known guest ID,
     * the guest level is also returned along with the pricing that&#39;s
     * appropriate for the guest level. If it is a new user, the guest ID will be
     * generated at the time of the first confirmed booking. Example API key for
     * test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param currency         Currency code - example (USD) (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<Object> getFullRatesWithHttpInfo(String[] hotelIds, String checkin, String checkout,
            String guestNationality, String currency, Integer adults, Integer[] children, String guestId)
            throws ApiException {
        okhttp3.Call localVarCall = getFullRatesValidateBeforeCall(hotelIds, checkin, checkout, guestNationality,
                currency, adults, children, guestId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * hotel full rates availability (asynchronously)
     * The Full Rates API is to search and return all available rooms along with its
     * rates, cancellation policies for a list of hotel ID&#39;s based on the search
     * dates. For each hotel ID, all available room information is returned. The API
     * also has a built in loyalty rewards system. The system rewards return users
     * who have made prior bookings. If the search is coming from a known guest ID,
     * the guest level is also returned along with the pricing that&#39;s
     * appropriate for the guest level. If it is a new user, the guest ID will be
     * generated at the time of the first confirmed booking. Example API key for
     * test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param hotelIds         List of hotelIds (required)
     * @param checkin          Check in data in YYYY-MM-DD format (required)
     * @param checkout         Check out data in YYYY-MM-DD format (required)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     *                         (required)
     * @param currency         Currency code - example (USD) (required)
     * @param adults           Number of adult guests staying (required)
     * @param children         Number of children staying if any (optional)
     * @param guestId          Unique traveler ID if available (optional)
     * @param _callback        The callback to be executed when the API call
     *                         finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * @http.response.details
     *                        <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>OK</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>204</td>
     *                        <td>No Content</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td>Bad Request</td>
     *                        <td>* Date - <br>
     *                        * Content-Type - <br>
     *                        * Content-Length - <br>
     *                        * Connection - <br>
     *                        * x-amzn-RequestId - <br>
     *                        * Access-Control-Allow-Origin - <br>
     *                        * Content-Encoding - <br>
     *                        * Access-Control-Allow-Headers - <br>
     *                        * x-amz-apigw-id - <br>
     *                        * Access-Control-Allow-Methods - <br>
     *                        * Access-Control-Expose-Headers - <br>
     *                        * x-amzn-Remapped-Date - <br>
     *                        * Access-Control-Max-Age - <br>
     *                        * Access-Control-Allow-Credentials - <br>
     *                        </td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getFullRatesAsync(String[] hotelIds, String checkin, String checkout, String guestNationality,
            String currency, Integer adults, Integer[] children, String guestId, final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getFullRatesValidateBeforeCall(hotelIds, checkin, checkout, guestNationality,
                currency, adults, children, guestId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
