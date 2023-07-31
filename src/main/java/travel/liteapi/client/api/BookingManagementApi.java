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

public class BookingManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BookingManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BookingManagementApi(ApiClient apiClient) {
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
     * Build call for bookingsBookingIdGet
     * 
     * @param bookingId The Booking Id that needs to be retrieved (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
   
     */
    public okhttp3.Call retrievedBookingCall(String bookingId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/bookings/{bookingId}"
                .replace("{" + "bookingId" + "}", localVarApiClient.escapeString(bookingId.toString()));

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
    private okhttp3.Call retrievedBookingValidateBeforeCall(String bookingId, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException(
                    "Missing the required parameter 'bookingId' when calling bookingsBookingIdGet(Async)");
        }

        return retrievedBookingCall(bookingId, _callback);

    }

    /**
     * Booking retrieve
     * The API returns the status and the details for the a specific booking Id.
     * 
     * @param bookingId The Booking Id that needs to be retrieved (required)
     * @return Object
   
     */
    public Object retrievedBooking(String bookingId) {
        try {
            ApiResponse<Object> localVarResp = retrievedBookingWithHttpInfo(bookingId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#retrievedBooking");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Booking retrieve
     * The API returns the status and the details for the a specific booking Id.
     * 
     * @param bookingId The Booking Id that needs to be retrieved (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
   
     */
    public ApiResponse<Object> retrievedBookingWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = retrievedBookingValidateBeforeCall(bookingId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Booking retrieve (asynchronously)
     * The API returns the status and the details for the a specific booking Id.
     * 
     * @param bookingId The Booking Id that needs to be retrieved (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
   
     */
    public okhttp3.Call retrievedBookingAsync(String bookingId, final ApiCallback<Object> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = retrievedBookingValidateBeforeCall(bookingId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for bookingsBookingIdPut
     * 
     * @param bookingId (Required) The unique identifier of the booking you would
     *                  like to update. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object

     */
    public okhttp3.Call cancelBookingCall(String bookingId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/bookings/{bookingId}"
                .replace("{" + "bookingId" + "}", localVarApiClient.escapeString(bookingId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelBookingValidateBeforeCall(String bookingId, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException(
                    "Missing the required parameter 'bookingId' when calling bookingsBookingIdPut(Async)");
        }

        return cancelBookingCall(bookingId, _callback);

    }

    /**
     * Booking cancel
     * &lt;!-- theme: danger --&gt; This API is used to request a cancellation of an
     * existing confirmed booking. Cancellation policies and conditions will be used
     * to determine the success of the cancellation. For example a booking with
     * non-refundable (NRFN) tag or a booking with a cancellation policy that was
     * requested past the cancellation date will not be able to cancel the confirmed
     * booking.
     * 
     * @param bookingId (Required) The unique identifier of the booking you would
     *                  like to update. (required)
     * @return Object

     */
    public Object cancelBooking(String bookingId) {
        try {
            ApiResponse<Object> localVarResp = cancelBookingWithHttpInfo(bookingId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#cancelBooking");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Booking cancel
     * &lt;!-- theme: danger --&gt; This API is used to request a cancellation of an
     * existing confirmed booking. Cancellation policies and conditions will be used
     * to determine the success of the cancellation. For example a booking with
     * non-refundable (NRFN) tag or a booking with a cancellation policy that was
     * requested past the cancellation date will not be able to cancel the confirmed
     * booking.
     * 
     * @param bookingId (Required) The unique identifier of the booking you would
     *                  like to update. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body

     */
    public ApiResponse<Object> cancelBookingWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = cancelBookingValidateBeforeCall(bookingId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Booking cancel (asynchronously)
     * &lt;!-- theme: danger --&gt; This API is used to request a cancellation of an
     * existing confirmed booking. Cancellation policies and conditions will be used
     * to determine the success of the cancellation. For example a booking with
     * non-refundable (NRFN) tag or a booking with a cancellation policy that was
     * requested past the cancellation date will not be able to cancel the confirmed
     * booking.
     * 
     * @param bookingId (Required) The unique identifier of the booking you would
     *                  like to update. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object

     */
    public okhttp3.Call cancelBookingAsync(String bookingId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelBookingValidateBeforeCall(bookingId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for bookingsGet
     * 
     * @param guestId   The Guest Id of the user (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     
     */
    public okhttp3.Call getBookingListCall(String guestId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/bookings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getBookingListValidateBeforeCall(String guestId, final ApiCallback _callback)
            throws ApiException {
        // verify the required parameter 'guestId' is set
        if (guestId == null) {
            throw new ApiException("Missing the required parameter 'guestId' when calling bookingsGet(Async)");
        }

        return getBookingListCall(guestId, _callback);

    }

    /**
     * Booking list
     * The API returns the list of booking Id&#39;s for a given guest Id.
     * 
     * @param guestId The Guest Id of the user (required)
     * @return Object
     
     */
    public Object getBookingListByGuestId(String guestId) {
        try {
            ApiResponse<Object> localVarResp = getBookingListWithHttpInfo(guestId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getBookingListByGuestId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * Booking list
     * The API returns the list of booking Id&#39;s for a given guest Id.
     * 
     * @param guestId The Guest Id of the user (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
     
     */
    public ApiResponse<Object> getBookingListWithHttpInfo(String guestId) throws ApiException {
        okhttp3.Call localVarCall = getBookingListValidateBeforeCall(guestId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Booking list (asynchronously)
     * The API returns the list of booking Id&#39;s for a given guest Id.
     * 
     * @param guestId   The Guest Id of the user (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     
     */
    public okhttp3.Call getBookingListAsync(String guestId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBookingListValidateBeforeCall(guestId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
