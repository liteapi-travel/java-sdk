<h1 style="font-weight: 500;">liteAPI SDK</h1>

# Table of Contents
- [Table of Contents](#table-of-contents)
- [Introduction](#introduction)
- [Installing](#installing)
  - [Requirements](#requirements)
  - [Gradle users](#gradle-users)
  - [Maven users](#maven-users)
- [Usage](#usage)
- [Static data](#static-data)
  - [List of cities](#list-of-cities)
  - [List of Countries](#list-of-countries)
  - [List of available currencies](#list-of-available-currencies)
  - [List of hotels](#list-of-hotels)
  - [Hotel details](#hotel-details)
  - [IATA code list](#iata-code-list)
- [Booking flow](#booking-flow)
  - [Search](#search)
    - [Minimum Rates availability](#minimum-rates-availability)
    - [Hotel full rates availability](#hotel-full-rates-availability)
  - [Book](#book)
    - [Hotel rate prebook](#hotel-rate-prebook)
    - [Hotel rate book](#hotel-rate-book)
  - [Booking management](#booking-management)
    - [Booking list](#booking-list)
    - [Booking retrieve](#booking-retrieve)
    - [Booking cancel](#booking-cancel)
- [Guest and loyalty](#guest-and-loyalty)
  - [Guests](#guests)
- [Example Project](#example-project)

# Introduction
[liteAPI](https://www.liteapi.travel/) The fastest way to build travel apps
Launch your hospitality product in minutes. Effortlessly monetize by selling accommodations at over 2 million properties worldwide.


The liteAPI can be used to to do the following:
- Get room rates & availability for a set of hotels. 
- Select a specific hotel with room availability and make a booking 
- Manage the bookings 
- retrieve and cancel existing bookings.
- Get static content for hotels.
- Search hotels by destination.

Don't have an account yet?  Sign Up [Here](https://dashboard.liteapi.travel/register/).


# Installing

## Requirements

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Gradle users

Add this dependency to your project's build file:

```groovy
implementation "travel.liteapi:liteapi-java-client:2.0.0"

```
## Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>travel.liteapi</groupId>
    <artifactId>liteapi-java-client</artifactId>
    <version>2.0.0</version>
    <scope>compile</scope>
</dependency>
```
# Usage
The package needs to be configured with your account's apikey, which is
available in the [liteAPI Dashboard](https://dashboard.liteapi.travel/apikeys/). Require it with the key's
value:

```java
    import travel.liteapi.client.ApiClient;
    import travel.liteapi.client.Configuration;
    import travel.liteapi.client.auth.ApiKeyAuth;

    public class ConfigLiteApi {
        public static ApiClient getDefaultClient() {
            ApiClient defaultClient = Configuration.getDefaultApiClient();
            ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
            apikeyAuth.setApiKey("YOUR_API_KEY");
            return defaultClient;
        }
    }
```

# Static data

To access the Static Data, you will need to create an instance of the StaticDataApi using the following line:
```java
    import travel.liteapi.client.api.StaticDataApi;

    public class StaticDataService {
        StaticDataApi staticDataInstance = new StaticDataApi(ConfigLiteApi.getDefaultClient());

    }
```
## List of cities

The API returns a list of city names from a specific country. The country codes needs be is in ISO-2 format. To get the country codes in ISO-2 for all countries please use the GET Country list endpoint

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String countryCode = "IT";
    Object result = staticDataInstance.getCitiesByCountryCode(countryCode);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>


| Name            | Type       | Description                                | Notes      |
| --------------- | ---------- | ------------------------------------------ | ---------- |
| **countryCode** | **String** | Country code in iso-2 format (example: US) | [required] |

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of city objects containing the following properties:

| Field    | Type       | Description           |
| -------- | ---------- | --------------------- |
| **city** | **String** | The name of the city. |

<br>

## List of Countries

The API returns the list of countries available along with its ISO-2 code.

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    Object result = staticDataInstance.getCountries();
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

This endpoint does not need any parameter.

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of country objects containing the following properties:

| Field    | Type       | Description                       |
| -------- | ---------- | --------------------------------- |
| **code** | **String** | The country code in iso-2 format. |
| **name** | **String** | The name of the country.          |

<br>

## List of available currencies

The API returns all available currency codes along with its name and the list of supported countries that the currency applies to.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    Object result = staticDataInstance.getCurrencies();
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

This endpoint does not need any parameter.

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of currency objects containing the following properties:

| Name          | Type       | Description                                       |
| ------------- | ---------- | ------------------------------------------------- |
| **code**      | **String** | The currency code.                                |
| **currency**  | **String** | The name of the currency.                         |
| **countries** | **Array**  | An array of countries where the currency is used. |

<br>

## List of hotels

The API returns a list of hotels available based on different search criterion. The minimum required information is the county code in ISO-2 format.

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String countryCode = "IT";
    String cityName = "Rome";
    //Optional values
    Integer offset = 1000;
    Integer limit = 1000;
    String longitude = "-115.16988";
    String latitude = "36.12510";
    Integer distance = 1000;
    Object result = staticDataInstance.getHotels(countryCode, cityName, offset, limit, longitude, latitude, distance);
```

To exclude the optional values, you can simply set them to null in the function call:

```java
    Object result = staticDataInstance.getHotels(countryCode, cityName, null, null, null, null, null);
```

*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

| Name            | Type       | Description                                                         | Notes      |
| --------------- | ---------- | ------------------------------------------------------------------- | ---------- |
| **countryCode** | **String** | country code ISO-2 code - example (US)                              | [required] |
| **cityName**    | **String** | name of the city                                                    | [required] |
| **offset**      | **Integer** | specifies the number of rows to skip before starting to return rows | [optional] |
| **limit**       | **Integer** | limit number of results (max 1000)                                  | [optional] |
| **longitude**   | **String** | longitude geo coordinates                                           | [optional] |
| **latitude**    | **String** | latitude geo coordinates                                            | [optional] |
| **distance**    | **Integer** | distance in meters (min 1000m)                                      | [optional] |


*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of hotel objects containing the following properties:  

| Name                 | Type       | Description                                        |
| -------------------- | ---------- | -------------------------------------------------- |
| **id**               | **String** | The unique identifier of the hotel.                |
| **name**             | **String** | The name of the hotel.                             |
| **hotelDescription** | **String** | The description of the hotel.                      |
| **currency**         | **String** | The currency used in the hotel.                    |
| **country**          | **String** | The country code of the hotel.                     |
| **city**             | **String** | The city where the hotel is located.               |
| **latitude**         | **number** | The latitude coordinates of the hotel's location.  |
| **longitude**        | **number** | The longitude coordinates of the hotel's location. |
| **address**          | **String** | The address of the hotel.                          |
| **zip**              | **String** | The postal code of the hotel.                      |
| **main_photo**       | **String** | The URL of the main photo of the hotel.            |
| **stars**            | **number** | The star rating of the hotel.                      |

<br>

## Hotel details

The hotel details API returns all the static contents details of a hotel or property if the hotel ID is provided. The static content include name, description, address, amenities, cancellation policies, images and more.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String hotelId =  "lp24373";
    Object result = staticDataInstance.getHotelDetails(hotelId);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>
| Name        | Type       | Description          | Notes      |
| ----------- | ---------- | -------------------- | ---------- |
| **hotelId** | **String** | Unique ID of a hotel | [required] |

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

| Name                                                              | Type        | Description                                                                          |
| ----------------------------------------------------------------- | ----------- | ------------------------------------------------------------------------------------ |
| **id**                                                            | **String**  | The unique identifier of the hotel.                                                  |
| **name**                                                          | **String**  | The name of the hotel.                                                               |
| **hotelDescription**                                              | **String**  | The description of the hotel.                                                        |
| **checkinCheckoutTimes**                                          | **Object**  | An object containing the check-in and check-out times of the hotel.                  |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **checkout**     | **String**  | The check-out time of the hotel.                                                     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **checkin**      | **String**  | The check-in time of the hotel.                                                      |
| **hotelImages**                                                   | **Array**   | An array of hotel image objects containing the following properties:                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **url**          | **String**  | The URL of the hotel image.                                                          |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **thumbnailUrl**       | **String**  | The thumbnail URL of the hotel image.                                                |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **caption**      | **String**  | The caption of the hotel image.                                                      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **order**        | **String**  | The order of the hotel image (null if not applicable).                               |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **defaultImage** | **boolean** | Indicates whether the hotel image is the default image or not.                       |
| **currency**                                                      | **String**  | The currency used in the hotel.                                                      |
| **country**                                                       | **String**  | The country code of the hotel.                                                       |
| **city**                                                          | **String**  | The city where the hotel is located.                                                 |
| **starRating**                                                    | **number**  | The star rating of the hotel.                                                        |
| **location**                                                      | **Object**  | An object containing the latitude and longitude coordinates of the hotel's location. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **latitude**     | **number**  | The latitude coordinate of the hotel's location.                                     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **longitude**    | **number**  | The longitude coordinate of the hotel's location.                                    |
| **address**                                                       | **String**  | The address of the hotel.                                                            |
| **zip**                                                           | **String**  | The postal code of the hotel.                                                        |
| **chainId**                                                       | **String**  | The unique identifier of the hotel chain.                                            |
| **hotelFacilities**                                               | **Array**   | An array of hotel facilities offered by the hotel.                                   |

<br>

## IATA code list

The API returns the IATA (International Air Transport Association) codes for all available airports along with the name of the airport, geographical coordinates and country code in ISO-2 format.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    Object result = staticDataInstance.getIataCodes();
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

This endpoint does not need any parameter.

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of IATA objects with the following properties:

| Name            | Type       | Description                            |
| --------------- | ---------- | -------------------------------------- |
| **code**        | **String** | The IATA code.                         |
| **name**        | **String** | The name of the IATA.                  |
| **latitude**    | **number** | The latitude coordinates of the IATA.  |
| **longitude**   | **number** | The longitude coordinates of the IATA. |
| **countryCode** | **String** | The country code of the IATA.          |

<br>

# Booking flow

liteAPI is a comprehensive and simple to implement Hotel Booking API. The booking flow consists of 3 section: Search, Book, and 
booking management.

<br>

## Search

To access the search functionality and retrieve available hotels, you will need to create an instance of the SearchApi using the following line:

```java
    import travel.liteapi.client.api.SearchApi;

    public class SearchService {
        SearchApi searchInstance = new SearchApi(ConfigLiteApi.getDefaultClient());

    }
```

### Minimum Rates availability
------
Hotel Minimum Rates API is to search and return the minimum room rates that are available for a list of hotel ID's on the specified search dates.

For each hotel ID, the minimum room rate that is available is returned.

The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.

If the search is coming from a known guest ID, the guest level is also returned along with the pricing that's appropriate for the guest level.

If it is a new user, the guest ID will be generated at the time of the first confirmed booking.

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String[] hotelIds = {"lp3803c", "lp1f982", "lp19b70", "lp19e75"};
    String checkin = "2023-07-15";
    String checkout = "2023-07-16";
    String currency = "USD";
    String guestNationality = "US";
    Integer adults = 2;
    //Optional values
    Integer[] children = {2,3};
    String guestId = "traveler1";
    Object result = searchInstance.getMinimumRates(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId);
```

To exclude the optional values, you can simply set them to null in the function call:
```java
    Object result = searchInstance.getMinimumRates(hotelIds, checkin, checkout, currency, guestNationality, adults, null, null);
```

*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **array of Strings**| List of hotelIds | [required]
 **checkin** | **String**| Check in data in YYYY-MM-DD format | [required]
 **checkout** | **String**| Check out data in YYYY-MM-DD format | [required]
 **currency** | **String**| Currency code - example (USD) | [required]
 **guestNationality** | **string**| Guest nationality ISO-2 code - example (SG) | [required]
 **adults** | **Integer**| Number of adult guests staying | [required]
 **children** | **array of Integers**| Number of children staying if any | [optional] 
 **guestId** | **String**| Unique traveler ID if available | [optional] 

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of hotel minimum rates objects with the following properties:

| Name         | Type   | Description                                      |
| ------------ | ------ | ------------------------------------------------ |
| **hotelId**    | **String** | The ID of the hotel.                             |
| **currency**   | **String** | The currency code for the price.                  |
| **price**      | **number** | The price of the hotel.                           |
| **supplierId** | **number** | The ID of the supplier.                           |
| **supplier**   | **String** | The name of the supplier.                         |


<br>


### Hotel full rates availability
------
The Full Rates API is to search and return all available rooms along with its rates, cancellation policies for a list of hotel ID's based on the search dates.

For each hotel ID, all available room information is returned.

The API also has a built in loyalty rewards system. The system rewards return users who have made prior bookings.

If the search is coming from a known guest ID, the guest level is also returned along with the pricing that's appropriate for the guest level.

If it is a new user, the guest ID will be generated at the time of the first confirmed booking.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String[] hotelIds = {"lp3803c", "lp1f982", "lp19b70", "lp19e75"};
    String checkin = "2023-07-15";
    String checkout = "2023-07-16";
    String currency = "USD";
    String guestNationality = "US";
    Integer adults = 2;
    //Optional values
    Integer[] children = {2,3};
    String guestId = "traveler1";
    Object result = searchInstance.getFullRatest(hotelIds, checkin, checkout, currency, guestNationality, adults, children, guestId);
```

To exclude the optional values, you can simply set them to null in the function call:
```java
    Object result = searchInstance.getFullRatest(hotelIds, checkin, checkout, currency, guestNationality, adults, null, null);
```

*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **array of Strings**| List of hotelIds | [required]
 **checkin** | **String**| Check in data in YYYY-MM-DD format | [required]
 **checkout** | **String**| Check out data in YYYY-MM-DD format | [required]
 **currency** | **String**| Currency code - example (USD) | [required]
 **guestNationality** | **String**| Guest nationality ISO-2 code - example (SG) | [required]
 **adults** | **Integer**| Number of adult guests staying | [required]
 **children** | **array of Integers**| Number of children staying if any | [optional] 
 **guestId** | **String**| Unique traveler ID if available | [optional] 

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array of hotel full rates with the following properties:

| Name         | Type   | Description                                      |
| ------------ | ------ | ------------------------------------------------ |
| **roomTypeId** | **String** | The ID of the room type.                                                                                |
| **supplier**   | **String** | The name of the supplier.                                                                               |
| **supplierId** | **number** | The ID of the supplier.                                                                                 |
| **rates**      | **Array**  | An array of rate objects containing the pricing and details for each rate within the room type.        |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **rateId**        | **String** | The ID of the rate.                                                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **name**          | **String** | The name of the rate.                                                                                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **maxOccupancy** | **number** | The maximum occupancy of the room.                                                                     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardType**     | **String** | The type of board included (e.g., Bed Only).                                                           |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardName**     | **String** | The name of the board (e.g., Bed Only).                                                                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **priceType**     | **String** | The type of pricing (e.g., commission).                                                                 |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **commission**    | **Array**  | An array of commission objects containing the commission amount and currency.                         |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **retailRate**    | **Object** | An object containing the retail rate information, including total price, MSP (Marked Selling Price), and taxes and fees. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **total**         | **Array**  | An array of total price objects containing the amount and currency.                                    |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **msp**           | **Array**  | An array of MSP (Marked Selling Price) objects containing the amount and currency.                     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **taxesAndFees**  | **Array** | An array of taxes and fees objects containing information about included or additional charges.         |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancellationPolicies** | **Object** | An object containing cancellation policy information.                                                   |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancelPolicyInfos** | **Array**  | An array of cancellation policy info objects containing information about cancellation time, amount, currency, and type. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **hotelRemarks**      | **Array** | An array of hotel remarks.                                                                              |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **refundableTag**      | **String** | The tag indicating if the rate is refundable or non-refundable.                                          |


<br>

## Book

To perform pre booking and booking operations, you will need to create an instance of the BookApi as follows:

```java
    import travel.liteapi.client.api.BookApi;

    public class BookService {
        BookApi bookInstance = new BookApi(ConfigLiteApi.getDefaultClient());
    }
```

### Hotel rate prebook
------

This API is used to confirm if the room and rates for the search criterion. The input to the endpoint is a specific rate Id coming from the GET hotel full rates availability API.

In response, the API generates a prebook Id, a new rate Id and contains information if price, cancellation policy or boarding information has changed.



*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String rateId = "NRYDCZRZHAZHYMRQGIZS2MBXFUYTK7BSGAZDGLJQG4WTCNT4GJ6HYVKTPRDVSWSEJVMVUV2HIUZUOS2OKJKEOWKZKRCU2QSXJVETGRCTJZKEMR2ZGNMFSTKKIRDUSWKEIVGVUUKHGRMVISZXIJJUOQK2IRDU2QSYI5CTGSCZLJGE6TBVJNLEON2DKZFU4NSGJNKTERKQKFNEKQ2NINCFAUK2IRCU6QSUKBJEWVCFKZJVST2KGZCEGTSSLFEEKWKEINHFUV2HKUZVIUKOJJNE6QSELBHVKQSEI5CVURCTJZBFER2BKJKEOTKKJZDUKWSEKNHEEUSHII3EMRKSKNHVAUK2IRAU2USUI5ATGVCDJVJFCR2FLFCECN2CKRIFCWKUJFHEEVCHLFJFMRKULJCEWSSEIU2ESWSTI5AVURCHJRFFCRZUK5KEGTKRPRKVGRD4PR6DCNRWFYYDC7BSGAZDGLJQG4WTCMT4IJHXYMJSHE2DCMD4GI";
    Object result = bookInstance.preBook(rateId);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**rateId** | **String**| rate id retrieved from getFullRates response| [required]

*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An object containing prebook information and room type details.                      

| Name                      | Type   | Description                                                                                            |
| ------------------------- | ------ | ------------------------------------------------------------------------------------------------------ |
| **prebookId**        | **String** | The ID of the prebook.                                                                                |
| **hotelId**          | **String** | The ID of the hotel.                                                                                  |
| **currency**         | **String** | The currency used for pricing.                                                                         |
| **termsAndConditions** | **String** | The terms and conditions (if available).                                                               |
| **roomTypes**        | **Array**  | An array of room type objects containing the following properties:                                    |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **rates**      | **Array**  | An array of rate objects containing pricing and details for each rate within the room type.          |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **rateId**        | **String** | The ID of the rate.                                                                                    |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **name**          | **String** | The name of the rate.                                                                                  |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **maxOccupancy** | **number** | The maximum occupancy of the room.                                                                      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardType**     | **String** | The type of board included (e.g., Bed Only).                                                            |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardName**     | **String** | The name of the board (e.g., Bed Only).                                                                  |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **priceType**     | **String** | The type of pricing (e.g., commission).                                                                  |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **commission**    | **Object**  | An array of commission objects containing the commission amount and currency.                          |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **retailRate**    | **Object** | An object containing the retail rate information, including total price, MSP (Marked Selling Price), and taxes and fees. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **total**         | **Object**   | An array of total price objects containing the amount and currency.                                     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **msp**           | **Object**   | An array of MSP (Marked Selling Price) objects containing the amount and currency.                      |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **taxesAndFees**  | **Object**    | An array of taxes and fees objects containing information about included or additional charges.          |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancellationPolicies** | **Object** | An object containing cancellation policy information.                                                    |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancelPolicyInfos** | **Object** | An array of cancellation policy info objects containing information about cancellation time, amount, and type. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **hotelRemarks**      | **Array**  | An array of hotel remarks.                                                                             |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **refundableTag**      | **String** | The tag indicating if the rate is refundable or non-refundable.                                         |
| **msp**                   | **number** | The Marked Selling Price (MSP) for the prebook.                                                         |
| **commission**            | **number** | The commission amount for the prebook.                                                                  |
| **price**                 | **number** | The price of the prebook.                                                                              |
| **priceType**             | **String** | The type of pricing (e.g., commission).                                                                 |
| **priceDifferencePercent**| **number** | The percentage difference between the retail rate and the Marked Selling Price (MSP).                   |
| **cancellationChanged**   | **boolean** | Indicates if there were changes to the cancellation policy.                                             |
| **boardChanged**          | **boolean** | Indicates if there were changes to the board type.                                                      |
| **supplier**              | **String** | The name of the supplier.                                                                              |
| **supplierId**            | **number** | The ID of the supplier.                                                                                |


<br>

### Hotel rate book
------

This API confirms a booking when the prebook Id and the rate Id from the pre book stage along with the guest and payment information are passed.

The guest information is an object that should include the guest first name, last name and email.

The payment information is an object that should include the name, credit card number, expiry and CVC number.

The response will confirm the booking along with a booking Id and a hotel confirmation code. It will also include the booking details including the dates, price and the cancellation policies.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>

```java
    String prebookId = "8iaO7PXBU";
    String guestFirstName = "Kim";
    String guestLastName = "James";
    String guestEmail = "test@nlite.ml";

    String holderName = "Kim James";
    String paymentMethod = "CREDIT_CARD";
    String card_number  = "4242424242424242";
    String exp_month = "11";
    String exp_year = "23";
    Integer cvc = 123;
    String token = null;
    Object result = bookInstance.book(prebookId, guestFirstName, guestLastName, guestEmail, paymentMethod, holderName, card_number,exp_month,exp_year,cvc,token);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**prebookId** | **String**| prebook id retrieved from prebook response| [required]
**guestInfo** | **object**| traveler informations| [required]|
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **guestFirstName** | **String**| traveler first name | [required]|
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **guestLastName** | **String**| traveler last name | [required]|
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **guestEmail** | **String**| traveler email | [required]|
**paymentMethod** | **String**| methodEnum: "CREDIT_CARD" or "STRIPE_TOKEN" | [required]
**holderName** | **String**| name of the cardholder	| [required]
**paymentInfo** | **object**| payment informations | [required]
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **card_number** | **String**| the card number associated with the credit card| [required if paymentMethod is CREDIT_CARD] 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **exp_month** | **String**| the expiration month of the credit card | [required if paymentMethod is CREDIT_CARD] 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **exp_year** | **String**| the expiration year of the credit card | [required if paymentMethod is CREDIT_CARD] 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cvc** | **Integer**| the card verification code (CVC) associated with the credit card | [required if paymentMethod is CREDIT_CARD] 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **token** | **String**| token provided by Stripe for the payment method. | [required if paymentMethod is STRIPE_TOKEN] 


*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An object containing booking information and room details.   


| Name                      | Type    | Description                          |
| ------------------------- | ------- | ------------------------------------ |
| **bookingId**             | **String**  | The ID of the booking.               |
| **clientReference**       | **String**  | The client reference.                |
| **supplierBookingId**     | **String**  | The supplier booking ID.             |
| **supplierBookingName**   | **String**  | The supplier booking name.           |
| **supplier**              | **String**  | The supplier.                        |
| **supplierId**            | **number**  | The ID of the supplier.              |
| **status**                | **String**  | The status of the booking.           |
| **hotelConfirmationCode** | **String**  | The hotel confirmation code.         |
| **checkin**               | **String**  | The check-in date.                   |
| **checkout**              | **String**  | The check-out date.                  |
| **hotel**                 | **object**  | An object containing hotel details.  |
| **bookedRooms**           | **array**   | An array of booked room objects.     |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **roomType**      | **object**  | An object containing room type details. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **adults**        | **number**  | The number of adults.           |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **children**      | **number**  | The number of children.         |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **rate**          | **object**  | An object containing rate details. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **maxOccupancy**      | **number** | The maximum occupancy.           |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **retailRate**        | **object** | An object containing the retail rate information, including total price. |
| **guestInfo**             | **object**  | An object containing guest details.  |
| **createdAt**             | **String**  | The creation date of the booking.    |
| **cancellationPolicies**  | **object**  | An object containing cancellation policies information.
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancelPolicyInfos** | **Object** | An array of cancellation policy info objects containing information about cancellation time, amount, and type. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **hotelRemarks**      | **Array**  | An array of hotel remarks.                                                                             |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **refundableTag**      | **String** | The tag indicating if the rate is refundable or non-refundable.
| **price**                 | **number**  | The price of the booking.            |
| **msp**                   | **number**  | The MSP (Merchant Service Provider) price. |
| **commission**            | **number**  | The commission amount.               |
| **currency**              | **String**  | The currency of the booking.         |


<br>

## Booking management

To manage bookings to perform various operations such as retrieving a list of bookings, fetching details of a specific booking, and cancelling a booking, you can utilize the BookingManagementApi instance as follows:
```java
    import travel.liteapi.client.api.BookingManagementApi;

    public class BookingManagementService {
        BookingManagementApi bookingManagementInstance = new BookingManagementApi(ConfigLiteApi.getDefaultClient());
    }
```

### Booking list
------
The API returns the list of booking Id's for a given guest Id.

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String guestId = "FrT56hfty";
    Object result = bookingManagementInstance.getBookingListByGuestId(guestId);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestId** | **String** | The Guest Id of the user | [required]


*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array containing objects with the following properties:

| Name        | Type   | Description        |
| ----------- | ------ | ------------------ |
| **bookingId** | **String** | The booking ID.    |


<br>

### Booking retrieve
------
The API returns the status and the details for the a specific booking Id.


*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String bookingId = "uSQ6Zsc5R";
    Object result = bookingManagementInstance.retrievedBooking(bookingId);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String** | The Booking Id that needs to be retrieved | [required]


*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An object containing booking information and room details.   

| Name                  | Type   | Description                      |
| --------------------- | ------ | -------------------------------- |
| **bookingId**         | **String** | The booking ID.                  |
| **clientReference**   | **String** | The client reference.            |
| **status**            | **String** | The booking status.              |
| **hotelConfirmationCode** | **String** | The hotel confirmation code.    |
| **checkin**           | **String** | The check-in date.               |
| **checkout**          | **String** | The check-out date.              |
| **hotel**             | **object** | An object containing hotel details. |
| **bookedRooms**       | **array**  | An array of booked room objects. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **roomType**      | **object**  | An object containing room type details. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **adults**        | **number**  | The number of adults.           |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **children**      | **number**  | The number of children.         |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **rate**          | **object**  | An object containing rate details. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **maxOccupancy**      | **number** | The maximum occupancy.           |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardType**    | **String** | The board type.              |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **boardName**    | **String** | The board name.              |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **retailRate**        | **object** | An object containing the retail rate information, including total price. |
| **guestInfo**         | **object** | An object containing guest information. |
| **createdAt**         | **String** | The creation date of the booking. |
| **cancellationPolicies** | **object** | An object containing cancellation policy details. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **cancelPolicyInfos** | **Object** | An array of cancellation policy info objects containing information about cancellation time, amount, and type. |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **hotelRemarks**      | **Array**  | An array of hotel remarks.                                                                             |
| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **refundableTag**      | **String** | The tag indicating if the rate is refundable or non-refundable.
| **currency**          | **String** | The currency code.               |
| **price**             | **number** | The price of the booking.        |



<br>

### Booking cancel
------

This API is used to request a cancellation of an existing confirmed booking. Cancellation policies and conditions will be used to determine the success of the cancellation. For example a booking with non-refundable (NRFN) tag or a booking with a cancellation policy that was requested past the cancellation date will not be able to cancel the confirmed booking.

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    String bookingId = "K8Hvb-85O";
    Object result = bookingManagementInstance.cancelBooking(bookingId);
```
*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String** | The booking Id of the booking you would like to cancel. |  [required]



*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

| Name             | Type   | Description                 |
| ---------------- | ------ | --------------------------- |
| **bookingId**    | **String** | The booking ID.             |
| **status**       | **String** | The booking status.         |
| **cancellation_fee** | **number** | The cancellation fee.       |
| **refund_amount**    | **number** | The refund amount.          |
| **currency**     | **String** | The currency of the booking. |

<br>

# Guest and loyalty

To handle guest and loyalty operations you can utilize the GuestAndLoyaltyApi as follows:

```java
    import travel.liteapi.client.api.GuestAndLoyaltyApi;

    public class GuestAndLoyaltyService {
        GuestAndLoyaltyApi guestAndLoyaltyInstance = new GuestAndLoyaltyApi(ConfigLiteApi.getDefaultClient());
    }
```
## Guests
The guests API returns the unique guest IDs

*  <h4 style="color:#9155fd; font-weight: 800;"> Example :</h4>
```java
    Object result = guestAndLoyaltyInstance.getGuests(null);
```
If you want to retrieve the guest IDs of a specific user based on their email, you can provide the email as an optional parameter:
```java
    String email = "johndoe@nlite.ml";
    Object result = guestAndLoyaltyInstance.getGuests(email);
```

*  <h4 style="color:#9155fd; font-weight: 800;"> Parameters :</h4>

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| the guest Email | [optional] 


*  <h4 style="color:#9155fd; font-weight: 800;"> Return type :</h4>

An array containing objects with the following properties:

| Name       | Type   | Description      |
| ---------- | ------ | ---------------- |
| **guestId** | **String** | The guest ID.    |


# Example Project
To see an example project demonstrating how to integrate the SDK, visit [liteAPI-java-sdk-example](https://github.com/liteapi-travel/java-sdk-examples)
