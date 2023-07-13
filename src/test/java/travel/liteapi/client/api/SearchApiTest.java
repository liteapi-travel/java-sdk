/*
 * liteAPI
 * The **liteAPI** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 *
 * Do not edit the class manually.
 */


package travel.liteapi.client.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import travel.liteapi.client.ApiException;
import travel.liteapi.client.api.SearchApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Disabled
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    /**
     * hotel minimum rates availability
     *
     * **Hotel Minimum Rates API** is to search and return the minimum room rates that are available for a list of hotel ID&#39;s on the specified search dates.  For each hotel ID, the minimum room rate that is available is returned.  The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.  If the search is coming from a known guest ID, the guest level is also returned along with pricing has more discounts.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMinimumRatesTest() {
        String[] hotelIds = null;
        String checkin = null;
        String checkout = null;
        String currency = null;
        String guestNationality = null;
        Integer adults = null;
        Integer[] children = null;
        String guestId = null;
        Object response = api.getMinimumRates(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId);
        // TODO: test validations
    }

    /**
     * hotel full rates availability
     *
     * The Full Rates  API is to search and return all available rooms along with its rates, cancellation policies for a list of hotel ID&#39;s based on the search dates.   For each hotel ID, all available room information is returned.   The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.   If the search is coming from a known guest ID, the guest level is also returned along with the pricing that&#39;s appropriate for the guest level.  If it is a new user, the guest ID will be generated at the time of the first confirmed booking.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void  getFullRatestTest() throws ApiException {
        String[] hotelIds = null;
        String checkin = null;
        String checkout = null;
        String currency = null;
        String guestNationality = null;
        Integer adults = null;
        Integer[] children = null;
        String guestId = null;
        Object response = api.getFullRatest(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId);
        // TODO: test validations
    }

}
