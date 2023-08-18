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
import travel.liteapi.client.ServerConfiguration;
import travel.liteapi.client.model.RatesBookPostRequest;
import travel.liteapi.client.model.RatesBookPostRequestGuestInfo;
import travel.liteapi.client.model.RatesBookPostRequestPayment;
import travel.liteapi.client.model.RatesBookPostRequestPayment.MethodEnum;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BookApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    protected List<ServerConfiguration> servers = new ArrayList<ServerConfiguration>(Arrays.asList(
        new ServerConfiguration(
          "https://api.liteapi.travel/v2.0",
          "https://book.liteapi.travel/v2.0",
          "No description provided",
          new HashMap<String, ServerVariable>()
        )
    ));

    public BookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BookApi(ApiClient apiClient) {
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
     * Build call for ratesBookPost
     * 
     * @param prebookId (optional)
     * @param guestFirstName, 
     * @param guestLastName, 
     * @param guestEmail,
     * @param paymentMethod, 
     * @param holderName, 
     * @param card_number, 
     * @param exp_month, 
     * @param exp_year, 
     * @param cvc,
     * @param  token,
     * @param _callback            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object

     */
    public okhttp3.Call bookCall(String prebookId, String guestFirstName, String guestLastName, String guestEmail,
            String paymentMethod, String holderName, String card_number, String exp_month, String exp_year, Integer cvc,
            String token,
            final ApiCallback _callback) throws ApiException {
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

        RatesBookPostRequestGuestInfo guestInfo = new RatesBookPostRequestGuestInfo();
        guestInfo.setGuestFirstName(guestFirstName);
        guestInfo.setGuestLastName(guestLastName);
        guestInfo.setGuestEmail(guestEmail);
        RatesBookPostRequestPayment payment = new RatesBookPostRequestPayment();
        payment.setHolderName(guestFirstName);
        if ("CREDIT_CARD".equals(paymentMethod)) {
            payment.setMethod(MethodEnum.CREDIT_CARD);
            payment.setNumber(card_number);
            payment.setExpireDate(exp_month + "/" + exp_year);
            payment.setCvc(cvc.toString());
        } else if ("STRIPE_TOKEN".equals(paymentMethod)) {
            payment.setMethod(MethodEnum.STRIPE_TOKEN);
            payment.setToken(token);
        }
        RatesBookPostRequest localVarPostBody = new RatesBookPostRequest();
        localVarPostBody.setPrebookId(prebookId);
        localVarPostBody.setGuestInfo(guestInfo);
        localVarPostBody.setPayment(payment);

        // create path and map variables
        String localVarPath = "/rates/book";

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
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        basePath = servers.get(0).bookURL(null);
        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bookValidateBeforeCall(String prebookId, String guestFirstName, String guestLastName,
            String guestEmail, String paymentMethod,
            String holderName, String card_number, String exp_month, String exp_year, Integer cvc, String token,
            final ApiCallback _callback) throws ApiException {
        return bookCall(prebookId, guestFirstName, guestLastName, guestEmail, paymentMethod,
                holderName, card_number, exp_month, exp_year, cvc, token, _callback);

    }

    /**
     * hotel rate book
     * This API confirms a booking when the prebook Id and the rate Id from the pre
     * book stage along with the guest and payment information are passed. The guest
     * information is an object that should include the guest first name, last name
     * and email. The payment information is an object that should include the name,
     * credit card number, expiry and CVC number. The response will confirm the
     * booking along with a booking Id and a hotel confirmation code. It will also
     * include the booking details including the dates, price and the cancellation
     * policies. Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param prebookId (optional)
     * @param guestFirstName, 
     * @param guestLastName, 
     * @param guestEmail,
     * @param paymentMethod, 
     * @param holderName, 
     * @param card_number, 
     * @param exp_month, 
     * @param exp_year, 
     * @param cvc,
     * @param  token,
     * @return Object

     */
    public Object book(String prebookId, String guestFirstName, String guestLastName, String guestEmail, String paymentMethod,
            String holderName, String card_number, String exp_month, String exp_year, Integer cvc, String token) {
        try {
            ApiResponse<Object> localVarResp = bookWithHttpInfo(prebookId, guestFirstName, guestLastName, guestEmail, paymentMethod,
                    holderName, card_number, exp_month, exp_year, cvc, token);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#book");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * hotel rate book
     * This API confirms a booking when the prebook Id and the rate Id from the pre
     * book stage along with the guest and payment information are passed. The guest
     * information is an object that should include the guest first name, last name
     * and email. The payment information is an object that should include the name,
     * credit card number, expiry and CVC number. The response will confirm the
     * booking along with a booking Id and a hotel confirmation code. It will also
     * include the booking details including the dates, price and the cancellation
     * policies. Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param prebookId (optional)
     * @param guestFirstName, 
     * @param guestLastName, 
     * @param guestEmail,
     * @param paymentMethod, 
     * @param holderName, 
     * @param card_number, 
     * @param exp_month, 
     * @param exp_year, 
     * @param cvc,
     * @param  token,
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body

     */
    public ApiResponse<Object> bookWithHttpInfo(String prebookId, String guestFirstName, String guestLastName,
            String guestEmail, String paymentMethod,
            String holderName, String card_number, String exp_month, String exp_year, Integer cvc, String token)
            throws ApiException {
        okhttp3.Call localVarCall = bookValidateBeforeCall(prebookId, guestFirstName, guestLastName, guestEmail,
                paymentMethod,
                holderName, card_number, exp_month, exp_year, cvc, token, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * hotel rate book (asynchronously)
     * This API confirms a booking when the prebook Id and the rate Id from the pre
     * book stage along with the guest and payment information are passed. The guest
     * information is an object that should include the guest first name, last name
     * and email. The payment information is an object that should include the name,
     * credit card number, expiry and CVC number. The response will confirm the
     * booking along with a booking Id and a hotel confirmation code. It will also
     * include the booking details including the dates, price and the cancellation
     * policies. Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param prebookId (optional)
     * @param guestFirstName, 
     * @param guestLastName, 
     * @param guestEmail,
     * @param paymentMethod, 
     * @param holderName, 
     * @param card_number, 
     * @param exp_month, 
     * @param exp_year, 
     * @param cvc,
     * @param  token,
     * @param _callback            The callback to be executed when the API call
     *                             finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object

     */
    public okhttp3.Call bookAsync(String prebookId, String guestFirstName, String guestLastName, String guestEmail,
            String paymentMethod,
            String holderName, String card_number, String exp_month, String exp_year, Integer cvc, String token,
            final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = bookValidateBeforeCall(prebookId, guestFirstName, guestLastName, guestEmail,
                paymentMethod,
                holderName, card_number, exp_month, exp_year, cvc, token, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for ratesPrebookPost
     * 
     * @param rateId      (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object

     */
    public okhttp3.Call preBookCall(String rateId, final ApiCallback _callback) throws ApiException {
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

        Map<String, Object> body = new HashMap<>();
        body.put("rateId", rateId);

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/rates/prebook";

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
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        basePath = servers.get(0).bookURL(null);
        String[] localVarAuthNames = new String[] { "apikeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams,
                localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call preBookValidateBeforeCall(String rateId, final ApiCallback _callback) throws ApiException {
        return preBookCall(rateId, _callback);
    }

    /**
     * hotel rate prebook
     * This API is used to confirm if the room and rates for the search criterion.
     * The input to the endpoint is a specific rate Id coming from the **GET** hotel
     * full rates availability API. In response, the API generates a prebook Id, a
     * new rate Id and contains information if price, cancellation policy or
     * boarding information has changed. Example API key for test
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param rateId (optional)
     * @return Object

     */
    public Object preBook(String rateId) {
        try {
            ApiResponse<Object> localVarResp = preBookWithHttpInfo(rateId);
            return localVarResp.getData();
        } catch (ApiException e) {
            System.err.println("Exception when calling StaticDataApi#preBook");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            return e.getResponseBody();
        }
    }

    /**
     * hotel rate prebook
     * This API is used to confirm if the room and rates for the search criterion.
     * The input to the endpoint is a specific rate Id coming from the **GET** hotel
     * full rates availability API. In response, the API generates a prebook Id, a
     * new rate Id and contains information if price, cancellation policy or
     * boarding information has changed. Example API key for test
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param rateId (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot
     *                      deserialize the response body

     */
    public ApiResponse<Object> preBookWithHttpInfo(String rateId) throws ApiException {
        okhttp3.Call localVarCall = preBookValidateBeforeCall(rateId, null);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * hotel rate prebook (asynchronously)
     * This API is used to confirm if the room and rates for the search criterion.
     * The input to the endpoint is a specific rate Id coming from the **GET** hotel
     * full rates availability API. In response, the API generates a prebook Id, a
     * new rate Id and contains information if price, cancellation policy or
     * boarding information has changed. Example API key for test
     * sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * 
     * @param rateId      (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the
     *                      request body object

     */
    public okhttp3.Call ratesPrebookPostAsync(String rateId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = preBookValidateBeforeCall(rateId, _callback);
        Type localVarReturnType = new TypeToken<Object>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
