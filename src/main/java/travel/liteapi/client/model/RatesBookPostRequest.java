/*
 * liteAPI
 * The **liteAPI** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 *
 * Do not edit the class manually.
 */


package travel.liteapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import travel.liteapi.client.JSON;
import travel.liteapi.client.model.RatesBookPostRequestGuestInfo;
import travel.liteapi.client.model.RatesBookPostRequestPayment;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * RatesBookPostRequest
 */
@javax.annotation.Generated(value = "travel.liteapi.codegen.languages.JavaClientCodegen", date = "2023-06-26T16:26:32.648+01:00[Africa/Casablanca]")
public class RatesBookPostRequest {
  public static final String SERIALIZED_NAME_PREBOOK_ID = "prebookId";
  @SerializedName(SERIALIZED_NAME_PREBOOK_ID)
  private String prebookId = null;

  public static final String SERIALIZED_NAME_GUEST_INFO = "guestInfo";
  @SerializedName(SERIALIZED_NAME_GUEST_INFO)
  private RatesBookPostRequestGuestInfo guestInfo;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private RatesBookPostRequestPayment payment;

  public RatesBookPostRequest() {
  }

  public RatesBookPostRequest prebookId(String prebookId) {
    
    this.prebookId = prebookId;
    return this;
  }

   /**
   * prebook id retrived from prebook response
   * @return prebookId
  **/
  @javax.annotation.Nullable
  public Object getPrebookId() {
    return prebookId;
  }


  public void setPrebookId(String prebookId) {
    this.prebookId = prebookId;
  }


  public RatesBookPostRequest guestInfo(RatesBookPostRequestGuestInfo guestInfo) {
    
    this.guestInfo = guestInfo;
    return this;
  }

   /**
   * Get guestInfo
   * @return guestInfo
  **/
  @javax.annotation.Nonnull
  public RatesBookPostRequestGuestInfo getGuestInfo() {
    return guestInfo;
  }


  public void setGuestInfo(RatesBookPostRequestGuestInfo guestInfo) {
    this.guestInfo = guestInfo;
  }


  public RatesBookPostRequest payment(RatesBookPostRequestPayment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  public RatesBookPostRequestPayment getPayment() {
    return payment;
  }


  public void setPayment(RatesBookPostRequestPayment payment) {
    this.payment = payment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatesBookPostRequest ratesBookPostRequest = (RatesBookPostRequest) o;
    return Objects.equals(this.prebookId, ratesBookPostRequest.prebookId) &&
        Objects.equals(this.guestInfo, ratesBookPostRequest.guestInfo) &&
        Objects.equals(this.payment, ratesBookPostRequest.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prebookId, guestInfo, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatesBookPostRequest {\n");
    sb.append("    prebookId: ").append(toIndentedString(prebookId)).append("\n");
    sb.append("    guestInfo: ").append(toIndentedString(guestInfo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> liteapiFields;
  public static HashSet<String> liteapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    liteapiFields = new HashSet<String>();
    liteapiFields.add("prebookId");
    liteapiFields.add("guestInfo");
    liteapiFields.add("payment");

    // a set of required properties/fields (JSON key names)
    liteapiRequiredFields = new HashSet<String>();
    liteapiRequiredFields.add("prebookId");
    liteapiRequiredFields.add("guestInfo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RatesBookPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RatesBookPostRequest.liteapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RatesBookPostRequest is not found in the empty JSON string", RatesBookPostRequest.liteapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RatesBookPostRequest.liteapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RatesBookPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RatesBookPostRequest.liteapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `guestInfo`
      RatesBookPostRequestGuestInfo.validateJsonObject(jsonObj.getAsJsonObject("guestInfo"));
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        RatesBookPostRequestPayment.validateJsonObject(jsonObj.getAsJsonObject("payment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RatesBookPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RatesBookPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RatesBookPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RatesBookPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RatesBookPostRequest>() {
           @Override
           public void write(JsonWriter out, RatesBookPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RatesBookPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RatesBookPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RatesBookPostRequest
  * @throws IOException if the JSON string is invalid with respect to RatesBookPostRequest
  */
  public static RatesBookPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RatesBookPostRequest.class);
  }

 /**
  * Convert an instance of RatesBookPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

