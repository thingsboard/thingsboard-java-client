/**
 * Copyright © 2026-2026 ThingsBoard, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Notification request processing statistics
 */
@JsonPropertyOrder({
  NotificationRequestStats.JSON_PROPERTY_SENT,
  NotificationRequestStats.JSON_PROPERTY_ERRORS,
  NotificationRequestStats.JSON_PROPERTY_TOTAL_ERRORS,
  NotificationRequestStats.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class NotificationRequestStats {
  public static final String JSON_PROPERTY_SENT = "sent";
  @javax.annotation.Nullable
  private Map<String, Object> sent = new HashMap<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nullable
  private Map<String, Map<String, String>> errors = new HashMap<>();

  public static final String JSON_PROPERTY_TOTAL_ERRORS = "totalErrors";
  private JsonNullable<Object> totalErrors = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public NotificationRequestStats() { 
  }

  public NotificationRequestStats sent(@javax.annotation.Nullable Map<String, Object> sent) {
    this.sent = sent;
    return this;
  }

  public NotificationRequestStats putSentItem(String key, Object sentItem) {
    if (this.sent == null) {
      this.sent = new HashMap<>();
    }
    this.sent.put(key, sentItem);
    return this;
  }

  /**
   * Number of successfully sent notifications per delivery method
   * @return sent
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SENT, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSent() {
    return sent;
  }


  @JsonProperty(value = JSON_PROPERTY_SENT, required = false)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setSent(@javax.annotation.Nullable Map<String, Object> sent) {
    this.sent = sent;
  }


  public NotificationRequestStats errors(@javax.annotation.Nullable Map<String, Map<String, String>> errors) {
    this.errors = errors;
    return this;
  }

  public NotificationRequestStats putErrorsItem(String key, Map<String, String> errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

  /**
   * Errors per delivery method. Each entry maps recipient name to error message
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Map<String, String>> getErrors() {
    return errors;
  }


  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(@javax.annotation.Nullable Map<String, Map<String, String>> errors) {
    this.errors = errors;
  }


  public NotificationRequestStats totalErrors(@javax.annotation.Nullable Object totalErrors) {
    this.totalErrors = JsonNullable.<Object>of(totalErrors);
    return this;
  }

  /**
   * Get totalErrors
   * @return totalErrors
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getTotalErrors() {
        return totalErrors.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_TOTAL_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTotalErrors_JsonNullable() {
    return totalErrors;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_ERRORS)
  public void setTotalErrors_JsonNullable(JsonNullable<Object> totalErrors) {
    this.totalErrors = totalErrors;
  }

  public void setTotalErrors(@javax.annotation.Nullable Object totalErrors) {
    this.totalErrors = JsonNullable.<Object>of(totalErrors);
  }


  public NotificationRequestStats error(@javax.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * General error message if the entire request failed
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }


  /**
   * Return true if this NotificationRequestStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequestStats notificationRequestStats = (NotificationRequestStats) o;
    return Objects.equals(this.sent, notificationRequestStats.sent) &&
        Objects.equals(this.errors, notificationRequestStats.errors) &&
        equalsNullable(this.totalErrors, notificationRequestStats.totalErrors) &&
        Objects.equals(this.error, notificationRequestStats.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, errors, hashCodeNullable(totalErrors), error);
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
    sb.append("class NotificationRequestStats {\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    totalErrors: ").append(toIndentedString(totalErrors)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `sent` to the URL query string
    if (getSent() != null) {
      for (String _key : getSent().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%ssent%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getSent().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getSent().get(_key)))));
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (String _key : getErrors().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%serrors%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getErrors().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getErrors().get(_key)))));
      }
    }

    // add `totalErrors` to the URL query string
    if (getTotalErrors() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalErrors%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalErrors()))));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serror%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getError()))));
    }

    return joiner.toString();
  }
}

