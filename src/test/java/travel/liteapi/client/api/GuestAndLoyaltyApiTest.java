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
import travel.liteapi.client.api.GuestAndLoyaltyApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GuestAndLoyaltyApi
 */
@Disabled
public class GuestAndLoyaltyApiTest {

    private final GuestAndLoyaltyApi api = new GuestAndLoyaltyApi();

    /**
     * guests
     *
     * The guests API returns the unique guest ID of a user based on the users email ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGuestsTest() {
        String email = null;
        Object response = api.getGuests(email);
        // TODO: test validations
    }

}
