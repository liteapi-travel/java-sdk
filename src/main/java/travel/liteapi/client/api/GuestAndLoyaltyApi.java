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

public class GuestAndLoyaltyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GuestAndLoyaltyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GuestAndLoyaltyApi(ApiClient apiClient) {
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
     * Build call for guestsGet
     * 
     * @param email     Email ID of the guest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * 
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
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
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
     *                        </table>
     */
    public okhttp3.Call getGuestsCall(String email, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/guests";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (email != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email", email));
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
    private okhttp3.Call getGuestsValidateBeforeCall(String email, final ApiCallback _callback) throws ApiException {
        return getGuestsCall(email, _callback);

    }

    /**
     * guests
     * The guests API returns the unique guest ID of a user based on the users email
     * ID
     * 
     * @param email Email ID of the guest (optional)
     * @return Object
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
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
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
     *                        </table>
     */
    public Object getGuests(String email) {
        try {
            ApiResponse<Object> localVarResp = getGuestsWithHttpInfo(email);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#getGuests");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * guests
     * The guests API returns the unique guest ID of a user based on the users email
     * ID
     * 
     * @param email Email ID of the guest (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body
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
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
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
     *                        </table>
     */
    public ApiResponse<Object> getGuestsWithHttpInfo(String email) throws ApiException {
        okhttp3.Call localVarCall = getGuestsValidateBeforeCall(email, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * guests (asynchronously)
     * The guests API returns the unique guest ID of a user based on the users email
     * ID
     * 
     * @param email     Email ID of the guest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object
     * 
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
     *                        <td>401</td>
     *                        <td>Unauthorized</td>
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
     *                        </table>
     */
    public okhttp3.Call getGuestsAsync(String email, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGuestsValidateBeforeCall(email, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
