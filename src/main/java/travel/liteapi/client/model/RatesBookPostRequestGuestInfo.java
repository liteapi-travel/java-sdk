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
 * RatesBookPostRequestGuestInfo
 */
@javax.annotation.Generated(value = "travel.liteapi.codegen.languages.JavaClientCodegen", date = "2023-06-26T16:26:32.648+01:00[Africa/Casablanca]")
public class RatesBookPostRequestGuestInfo {
  public static final String SERIALIZED_NAME_GUEST_FIRST_NAME = "guestFirstName";
  @SerializedName(SERIALIZED_NAME_GUEST_FIRST_NAME)
  private String guestFirstName = null;

  public static final String SERIALIZED_NAME_GUEST_LAST_NAME = "guestLastName";
  @SerializedName(SERIALIZED_NAME_GUEST_LAST_NAME)
  private String guestLastName = null;

  public static final String SERIALIZED_NAME_GUEST_EMAIL = "guestEmail";
  @SerializedName(SERIALIZED_NAME_GUEST_EMAIL)
  private String guestEmail = null;

  public RatesBookPostRequestGuestInfo() {
  }

  public RatesBookPostRequestGuestInfo guestFirstName(String guestFirstName) {
    
    this.guestFirstName = guestFirstName;
    return this;
  }

   /**
   * traveler first name
   * @return guestFirstName
  **/
  @javax.annotation.Nullable
  public Object getGuestFirstName() {
    return guestFirstName;
  }


  public void setGuestFirstName(String guestFirstName) {
    this.guestFirstName = guestFirstName;
  }


  public RatesBookPostRequestGuestInfo guestLastName(String guestLastName) {
    
    this.guestLastName = guestLastName;
    return this;
  }

   /**
   * traveler last name
   * @return guestLastName
  **/
  @javax.annotation.Nullable
  public Object getGuestLastName() {
    return guestLastName;
  }


  public void setGuestLastName(String guestLastName) {
    this.guestLastName = guestLastName;
  }


  public RatesBookPostRequestGuestInfo guestEmail(String guestEmail) {
    
    this.guestEmail = guestEmail;
    return this;
  }

   /**
   * traveler email
   * @return guestEmail
  **/
  @javax.annotation.Nullable
  public Object getGuestEmail() {
    return guestEmail;
  }


  public void setGuestEmail(String guestEmail) {
    this.guestEmail = guestEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatesBookPostRequestGuestInfo ratesBookPostRequestGuestInfo = (RatesBookPostRequestGuestInfo) o;
    return Objects.equals(this.guestFirstName, ratesBookPostRequestGuestInfo.guestFirstName) &&
        Objects.equals(this.guestLastName, ratesBookPostRequestGuestInfo.guestLastName) &&
        Objects.equals(this.guestEmail, ratesBookPostRequestGuestInfo.guestEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestFirstName, guestLastName, guestEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatesBookPostRequestGuestInfo {\n");
    sb.append("    guestFirstName: ").append(toIndentedString(guestFirstName)).append("\n");
    sb.append("    guestLastName: ").append(toIndentedString(guestLastName)).append("\n");
    sb.append("    guestEmail: ").append(toIndentedString(guestEmail)).append("\n");
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
    liteapiFields.add("guestFirstName");
    liteapiFields.add("guestLastName");
    liteapiFields.add("guestEmail");

    // a set of required properties/fields (JSON key names)
    liteapiRequiredFields = new HashSet<String>();
    liteapiRequiredFields.add("guestFirstName");
    liteapiRequiredFields.add("guestLastName");
    liteapiRequiredFields.add("guestEmail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RatesBookPostRequestGuestInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RatesBookPostRequestGuestInfo.liteapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RatesBookPostRequestGuestInfo is not found in the empty JSON string", RatesBookPostRequestGuestInfo.liteapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RatesBookPostRequestGuestInfo.liteapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RatesBookPostRequestGuestInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RatesBookPostRequestGuestInfo.liteapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RatesBookPostRequestGuestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RatesBookPostRequestGuestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RatesBookPostRequestGuestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RatesBookPostRequestGuestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<RatesBookPostRequestGuestInfo>() {
           @Override
           public void write(JsonWriter out, RatesBookPostRequestGuestInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RatesBookPostRequestGuestInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RatesBookPostRequestGuestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RatesBookPostRequestGuestInfo
  * @throws IOException if the JSON string is invalid with respect to RatesBookPostRequestGuestInfo
  */
  public static RatesBookPostRequestGuestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RatesBookPostRequestGuestInfo.class);
  }

 /**
  * Convert an instance of RatesBookPostRequestGuestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

