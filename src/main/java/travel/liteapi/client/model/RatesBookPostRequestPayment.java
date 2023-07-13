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
import org.openapitools.jackson.nullable.JsonNullable;


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
 * RatesBookPostRequestPayment
 */
@javax.annotation.Generated(value = "travel.liteapi.codegen.languages.JavaClientCodegen", date = "2023-06-26T16:26:32.648+01:00[Africa/Casablanca]")
public class RatesBookPostRequestPayment {
  public static final String SERIALIZED_NAME_HOLDER_NAME = "holderName";
  @SerializedName(SERIALIZED_NAME_HOLDER_NAME)
  private String holderName = null;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number = null;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expireDate";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private String expireDate = null;

  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc = null;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CREDIT_CARD("CREDIT_CARD"),
    
    STRIPE_TOKEN("STRIPE_TOKEN");

    private Object value;

    MethodEnum(Object value) {
      this.value = value;
    }

    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(Object value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value((String) enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token = null;

  public RatesBookPostRequestPayment() {
  }

  public RatesBookPostRequestPayment holderName(String holderName) {
    
    this.holderName = holderName;
    return this;
  }

   /**
   * Get holderName
   * @return holderName
  **/
  @javax.annotation.Nullable
  public Object getHolderName() {
    return holderName;
  }


  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public RatesBookPostRequestPayment number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  public Object getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public RatesBookPostRequestPayment expireDate(String expireDate) {
    
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @javax.annotation.Nullable
  public Object getExpireDate() {
    return expireDate;
  }


  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }


  public RatesBookPostRequestPayment cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * Get cvc
   * @return cvc
  **/
  @javax.annotation.Nullable
  public Object getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public RatesBookPostRequestPayment method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public RatesBookPostRequestPayment token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  public Object getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatesBookPostRequestPayment ratesBookPostRequestPayment = (RatesBookPostRequestPayment) o;
    return Objects.equals(this.holderName, ratesBookPostRequestPayment.holderName) &&
        Objects.equals(this.number, ratesBookPostRequestPayment.number) &&
        Objects.equals(this.expireDate, ratesBookPostRequestPayment.expireDate) &&
        Objects.equals(this.cvc, ratesBookPostRequestPayment.cvc) &&
        Objects.equals(this.method, ratesBookPostRequestPayment.method) &&
        Objects.equals(this.token, ratesBookPostRequestPayment.token);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderName, number, expireDate, cvc, method, token);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatesBookPostRequestPayment {\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    liteapiFields.add("holderName");
    liteapiFields.add("number");
    liteapiFields.add("expireDate");
    liteapiFields.add("cvc");
    liteapiFields.add("method");
    liteapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    liteapiRequiredFields = new HashSet<String>();
    liteapiRequiredFields.add("holderName");
    liteapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RatesBookPostRequestPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RatesBookPostRequestPayment.liteapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RatesBookPostRequestPayment is not found in the empty JSON string", RatesBookPostRequestPayment.liteapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RatesBookPostRequestPayment.liteapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RatesBookPostRequestPayment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RatesBookPostRequestPayment.liteapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RatesBookPostRequestPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RatesBookPostRequestPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RatesBookPostRequestPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RatesBookPostRequestPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<RatesBookPostRequestPayment>() {
           @Override
           public void write(JsonWriter out, RatesBookPostRequestPayment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RatesBookPostRequestPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RatesBookPostRequestPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RatesBookPostRequestPayment
  * @throws IOException if the JSON string is invalid with respect to RatesBookPostRequestPayment
  */
  public static RatesBookPostRequestPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RatesBookPostRequestPayment.class);
  }

 /**
  * Convert an instance of RatesBookPostRequestPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

