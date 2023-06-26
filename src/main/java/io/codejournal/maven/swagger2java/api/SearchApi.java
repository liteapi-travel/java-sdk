package io.codejournal.maven.swagger2java.api;

import io.codejournal.maven.swagger2java.handler.ApiClient;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-26T12:33:03.375+01:00[Africa/Casablanca]")@Component("io.codejournal.maven.swagger2java.api.SearchApi")
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    @Autowired
    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * hotel minimum rates availability
     * **Hotel Minimum Rates API** is to search and return the minimum room rates that are available for a list of hotel ID&#x27;s on the specified search dates.  For each hotel ID, the minimum room rate that is available is returned.  The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.  If the search is coming from a known guest ID, the guest level is also returned along with pricing has more discounts.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param hotelIds List of hotelIds
     * @param checkin Check in data in YYYY-MM-DD format
     * @param checkout Check out data in YYYY-MM-DD format
     * @param currency Currency code - example (USD)
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     * @param adults Number of adult guests staying
     * @param children Number of children staying if any
     * @param guestId Unique traveler ID if available
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object hotelsGet(String hotelIds, String checkin, String checkout, String currency, String guestNationality, Integer adults, String children, String guestId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'hotelIds' is set
        if (hotelIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelIds' when calling hotelsGet");
        }
        // verify the required parameter 'checkin' is set
        if (checkin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkin' when calling hotelsGet");
        }
        // verify the required parameter 'checkout' is set
        if (checkout == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkout' when calling hotelsGet");
        }
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currency' when calling hotelsGet");
        }
        // verify the required parameter 'guestNationality' is set
        if (guestNationality == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestNationality' when calling hotelsGet");
        }
        // verify the required parameter 'adults' is set
        if (adults == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adults' when calling hotelsGet");
        }
        String path = UriComponentsBuilder.fromPath("/hotels").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hotelIds", hotelIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkin", checkin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkout", checkout));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guestNationality", guestNationality));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adults", adults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "children", children));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guestId", guestId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apikeyAuth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * hotel full rates availability
     * The Full Rates  API is to search and return all available rooms along with its rates, cancellation policies for a list of hotel ID&#x27;s based on the search dates.   For each hotel ID, all available room information is returned.   The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.   If the search is coming from a known guest ID, the guest level is also returned along with the pricing that&#x27;s appropriate for the guest level.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Bad Request
     * @param hotelIds List of hotelIds
     * @param checkin Check in data in YYYY-MM-DD format
     * @param checkout Check out data in YYYY-MM-DD format
     * @param guestNationality Guest nationality ISO-2 code - example (SG)
     * @param currency Currency code - example (USD)
     * @param adults Number of adult guests staying
     * @param children Number of children staying if any
     * @param guestId Unique traveler ID if available
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object hotelsRatesGet(String hotelIds, String checkin, String checkout, String guestNationality, String currency, Integer adults, String children, String guestId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'hotelIds' is set
        if (hotelIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelIds' when calling hotelsRatesGet");
        }
        // verify the required parameter 'checkin' is set
        if (checkin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkin' when calling hotelsRatesGet");
        }
        // verify the required parameter 'checkout' is set
        if (checkout == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkout' when calling hotelsRatesGet");
        }
        // verify the required parameter 'guestNationality' is set
        if (guestNationality == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestNationality' when calling hotelsRatesGet");
        }
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currency' when calling hotelsRatesGet");
        }
        // verify the required parameter 'adults' is set
        if (adults == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adults' when calling hotelsRatesGet");
        }
        String path = UriComponentsBuilder.fromPath("/hotels/rates").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hotelIds", hotelIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkin", checkin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkout", checkout));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guestNationality", guestNationality));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adults", adults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "children", children));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guestId", guestId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "apikeyAuth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
