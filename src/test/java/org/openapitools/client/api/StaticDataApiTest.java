/*
 * Lite API
 * The **Lite API** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaticDataApi
 */
@Disabled
public class StaticDataApiTest {

    private final StaticDataApi api = new StaticDataApi();

    /**
     * City list
     *
     * The API returns a list of city names from a specific country. The country codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all countries please use the **GET** Country list endpoint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataCitiesGetTest() throws ApiException {
        Object countryCode = null;
        Object response = api.dataCitiesGet(countryCode);
        // TODO: test validations
    }

    /**
     * Country list
     *
     * The API returns the list of countries available along with its ISO-2 code.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataCountriesGetTest() throws ApiException {
        Object response = api.dataCountriesGet();
        // TODO: test validations
    }

    /**
     * Currency list
     *
     * The API returns all available currency codes along with its name and the list of supported countries that the currency applies to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataCurrenciesGetTest() throws ApiException {
        Object response = api.dataCurrenciesGet();
        // TODO: test validations
    }

    /**
     * Hotel details
     *
     * The hotel details API returns all the static contents details of a hotel or property if the hotel ID is provided. The static content include name, description, address, amenities, cancellation policies, images and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataHotelGetTest() throws ApiException {
        Object hotelId = null;
        Object response = api.dataHotelGet(hotelId);
        // TODO: test validations
    }

    /**
     * Hotel list
     *
     * The API returns a list of hotels available based on different search criterion. The minimum required information is the county code in ISO-2 format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataHotelsGetTest() throws ApiException {
        Object countryCode = null;
        Object cityName = null;
        Object offset = null;
        Object limit = null;
        Object longitude = null;
        Object latitude = null;
        Object distance = null;
        Object response = api.dataHotelsGet(countryCode, cityName, offset, limit, longitude, latitude, distance);
        // TODO: test validations
    }

    /**
     * IATA code list
     *
     * The API returns the IATA  (International Air Transport Association) codes  for all available airports along with the name of the airport, geographical coordinates and country code in ISO-2 format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataIataCodesGetTest() throws ApiException {
        Object response = api.dataIataCodesGet();
        // TODO: test validations
    }

}
