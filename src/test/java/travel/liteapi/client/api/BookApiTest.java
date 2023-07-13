/*
 * liteAPI
 * The **liteAPI** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 *
 */


package travel.liteapi.client.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import travel.liteapi.client.ApiException;
import travel.liteapi.client.api.BookApi;
import travel.liteapi.client.model.RatesBookPostRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookApi
 */
@Disabled
public class BookApiTest {

    private final BookApi api = new BookApi();

    /**
     * hotel rate book
     *
     * This API confirms a booking when the prebook Id and the rate Id from the pre book stage along with the guest and payment information are passed.  The guest information is an object that should include the guest first name, last name and email.  The payment information is an object that should include the name, credit card number, expiry and CVC number.  The response will confirm the booking along with a booking Id and a hotel confirmation code. It will also include the booking details including the dates, price and the cancellation policies.   Example API key for test: sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ratesBookPostTest(){
        // const prebookID = "8iaO7PXBU";
        // const guestInfo = { guestFirstName: 'Kim', guestLastName: 'James', guestEmail: 'test@nlite.ml' };
        // const paymentMethod = "CREDIT_CARD";
        // const holderName = "Kim James";

        String prebookId = null;
        String guestFirstName = null;
        String guestLastName = null;
        String guestEmail = null;

        String holderName = null;
        String paymentMethod = null;
        String card_number  = null;
        String exp_month = null;
        String exp_year = null;
        Integer cvc = null;
        String token = null;
        Object response = api.book(prebookId, guestFirstName, guestLastName, guestEmail, paymentMethod, holderName, card_number,exp_month,exp_year,cvc,token);
        // TODO: test validations
    }

    /**
     * hotel rate prebook
     *
     * This API is used to confirm if the room and rates for the search criterion. The input to the endpoint is a specific rate Id coming from the **GET** hotel full rates availability API. In response, the API generates a prebook Id, a new rate Id and contains information if  price, cancellation policy or boarding information has changed. Example API key for test sand_c0155ab8-c683-4f26-8f94-b5e92c5797b9
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ratesPrebookPostTest(){
        String rateId = null;
        Object response = api.preBook(rateId);
        // TODO: test validations
    }

}
