/*
 * liteAPI
 * The **liteAPI** can be used to to do the following  Get room rates & availability for a set of hotels Select a specific hotel with room availability and make a booking Manage the bookings - retrieve and cancel existing bookings Get static content for hotels, search hotels by destination
 * Do not edit the class manually.
 */


package travel.liteapi.client;

import java.util.Collection;
import java.util.Iterator;

@javax.annotation.Generated(value = "travel.liteapi.codegen.languages.JavaClientCodegen", date = "2023-06-26T16:26:32.648+01:00[Africa/Casablanca]")
public class StringUtil {
  /**
   * Check if the given array contains the given value (with case-insensitive comparison).
   *
   * @param array The array
   * @param value The value to search
   * @return true if the array contains the value
   */
  public static boolean containsIgnoreCase(String[] array, String value) {
    for (String str : array) {
      if (value == null && str == null) {
        return true;
      }
      if (value != null && value.equalsIgnoreCase(str)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Join an array of strings with the given separator.
   * <p>
   * Note: This might be replaced by utility method from commons-lang or guava someday
   * if one of those libraries is added as dependency.
   * </p>
   *
   * @param array     The array of strings
   * @param separator The separator
   * @return the resulting string
   */
  public static String join(String[] array, String separator) {
    int len = array.length;
    if (len == 0) {
      return "";
    }

    StringBuilder out = new StringBuilder();
    out.append(array[0]);
    for (int i = 1; i < len; i++) {
      out.append(separator).append(array[i]);
    }
    return out.toString();
  }

  /**
   * Join a list of strings with the given separator.
   *
   * @param list      The list of strings
   * @param separator The separator
   * @return the resulting string
   */
  public static String join(Collection<String> list, String separator) {
    Iterator<String> iterator = list.iterator();
    StringBuilder out = new StringBuilder();
    if (iterator.hasNext()) {
      out.append(iterator.next());
    }
    while (iterator.hasNext()) {
      out.append(separator).append(iterator.next());
    }
    return out.toString();
  }
}
