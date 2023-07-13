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
import travel.liteapi.client.api.BookingManagementApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookingManagementApi
 */
@Disabled
public class BookingManagementApiTest {

    private final BookingManagementApi api = new BookingManagementApi();

    /**
     * Booking retrieve
     *
     * The API returns the status and the details for the a specific booking Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrievedBookingTest(){
        String bookingId = null;
        Object response = api.retrievedBooking(bookingId);
        // TODO: test validations
    }

    /**
     * Booking cancel
     *
     * &lt;!-- theme: danger --&gt; This API is used to request a cancellation of an existing confirmed booking. Cancellation policies and conditions will be used to determine the success of the cancellation. For example a booking with non-refundable (NRFN) tag or a booking with a cancellation policy that was requested past the cancellation date will not be able to cancel the confirmed booking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelBookingTest(){
        String bookingId = null;
        Object response = api.cancelBooking(bookingId);
        // TODO: test validations
    }

    /**
     * Booking list
     *
     * The API returns the list of booking Id&#39;s for a given guest Id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBookingListByGuestIdTest(){
        String guestId = null;
        Object response = api.getBookingListByGuestId(guestId);
        // TODO: test validations
    }

}
