package io.codejournal.maven.swagger2java.api;

import io.codejournal.maven.swagger2java.handler.ApiClient;

import java.math.BigDecimal;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-26T12:33:03.375+01:00[Africa/Casablanca]")@Component("io.codejournal.maven.swagger2java.api.StaticDataApi")
public class StaticDataApi {
    private ApiClient apiClient;

    public StaticDataApi() {
        this(new ApiClient());
    }

    @Autowired
    public StaticDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * City list
     * The API returns a list of city names from a specific country. The country codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all countries please use the **GET** Country list endpoint
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param countryCode Country code in iso-2 format (example: SG)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataCitiesGet(String countryCode) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling dataCitiesGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/cities").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "countryCode", countryCode));

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
     * Country list
     * The API returns the list of countries available along with its ISO-2 code.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataCountriesGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/data/countries").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
     * Currency list
     * The API returns all available currency codes along with its name and the list of supported countries that the currency applies to.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataCurrenciesGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/data/currencies").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
     * Hotel details
     * The hotel details API returns all the static contents details of a hotel or property if the hotel ID is provided. The static content include name, description, address, amenities, cancellation policies, images and more.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param hotelId Unique ID of a hotel
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataHotelGet(Integer hotelId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling dataHotelGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/hotel").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hotelId", hotelId));

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
     * Hotel list
     * The API returns a list of hotels available based on different search criterion. The minimum required information is the county code in ISO-2 format.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param countryCode country code ISO-2 code - example (SG)
     * @param cityName name of the city
     * @param offset specifies the number of rows to skip before starting to return rows
     * @param limit limit number of results (max 1000)
     * @param longitude longitude geo coordinates
     * @param latitude latitude geo coordinates
     * @param distance distance in meters (min 1000m)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataHotelsGet(String countryCode, String cityName, Integer offset, Integer limit, BigDecimal longitude, BigDecimal latitude, Integer distance) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling dataHotelsGet");
        }
        // verify the required parameter 'cityName' is set
        if (cityName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cityName' when calling dataHotelsGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/hotels").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "countryCode", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cityName", cityName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "longitude", longitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "latitude", latitude));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "distance", distance));

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
     * IATA code list
     * The API returns the IATA  (International Air Transport Association) codes  for all available airports along with the name of the airport, geographical coordinates and country code in ISO-2 format.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataIataCodesGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/data/iataCodes").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
