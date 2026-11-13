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

import javax.annotation.Generated;
import javax.annotation.Nullable;
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
import org.thingsboard.client.model.SubscriptionEntry;
import org.thingsboard.client.model.SubscriptionErrorCode;
import org.thingsboard.client.model.ThingsboardErrorCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ThingsboardErrorResponse
 */
@JsonPropertyOrder({
  ThingsboardErrorResponse.JSON_PROPERTY_STATUS,
  ThingsboardErrorResponse.JSON_PROPERTY_MESSAGE,
  ThingsboardErrorResponse.JSON_PROPERTY_ERROR_CODE,
  ThingsboardErrorResponse.JSON_PROPERTY_TIMESTAMP,
  ThingsboardErrorResponse.JSON_PROPERTY_SUBSCRIPTION_ERROR_CODE,
  ThingsboardErrorResponse.JSON_PROPERTY_SUBSCRIPTION_ENTRY,
  ThingsboardErrorResponse.JSON_PROPERTY_SUBSCRIPTION_VALUE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ThingsboardErrorResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private Integer status;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @Nullable
  private String message;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  @Nullable
  private ThingsboardErrorCode errorCode;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @Nullable
  private Long timestamp;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ERROR_CODE = "subscriptionErrorCode";
  @Nullable
  private SubscriptionErrorCode subscriptionErrorCode;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ENTRY = "subscriptionEntry";
  @Nullable
  private SubscriptionEntry subscriptionEntry;

  public static final String JSON_PROPERTY_SUBSCRIPTION_VALUE = "subscriptionValue";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode subscriptionValue = null;

  public ThingsboardErrorResponse() { 
  }

  @JsonCreator
  public ThingsboardErrorResponse(
    @JsonProperty(JSON_PROPERTY_STATUS) Integer status, 
    @JsonProperty(JSON_PROPERTY_MESSAGE) String message, 
    @JsonProperty(JSON_PROPERTY_ERROR_CODE) ThingsboardErrorCode errorCode, 
    @JsonProperty(JSON_PROPERTY_TIMESTAMP) Long timestamp
  ) {
  this();
    this.status = status;
    this.message = message;
    this.errorCode = errorCode;
    this.timestamp = timestamp;
  }

  /**
   * HTTP Response Status Code
   * @return status
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStatus() {
    return status;
  }




  /**
   * Error message
   * @return message
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }




  /**
   * Platform error code: * &#x60;2&#x60; - General error (HTTP: 500 - Internal Server Error)  * &#x60;10&#x60; - Authentication failed (HTTP: 401 - Unauthorized)  * &#x60;11&#x60; - JWT token expired (HTTP: 401 - Unauthorized)  * &#x60;15&#x60; - Credentials expired (HTTP: 401 - Unauthorized)  * &#x60;20&#x60; - Permission denied (HTTP: 403 - Forbidden)  * &#x60;30&#x60; - Invalid arguments (HTTP: 400 - Bad Request)  * &#x60;31&#x60; - Bad request params (HTTP: 400 - Bad Request)  * &#x60;32&#x60; - Item not found (HTTP: 404 - Not Found)  * &#x60;33&#x60; - Too many requests (HTTP: 429 - Too Many Requests)  * &#x60;34&#x60; - Too many updates (Too many updates over Websocket session)  * &#x60;35&#x60; - Version conflict (HTTP: 409 - Conflict)  * &#x60;40&#x60; - Subscription violation (HTTP: 403 - Forbidden)  * &#x60;41&#x60; - Entities limit exceeded (HTTP: 403 - Forbidden)  * &#x60;47&#x60; - Setup incomplete (HTTP: 423 - Locked)
   * @return errorCode
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ThingsboardErrorCode getErrorCode() {
    return errorCode;
  }




  /**
   * Timestamp
   * @return timestamp
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimestamp() {
    return timestamp;
  }




  public ThingsboardErrorResponse subscriptionErrorCode(@Nullable SubscriptionErrorCode subscriptionErrorCode) {
    this.subscriptionErrorCode = subscriptionErrorCode;
    return this;
  }

  /**
   * Get subscriptionErrorCode
   * @return subscriptionErrorCode
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ERROR_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubscriptionErrorCode getSubscriptionErrorCode() {
    return subscriptionErrorCode;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ERROR_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionErrorCode(@Nullable SubscriptionErrorCode subscriptionErrorCode) {
    this.subscriptionErrorCode = subscriptionErrorCode;
  }


  public ThingsboardErrorResponse subscriptionEntry(@Nullable SubscriptionEntry subscriptionEntry) {
    this.subscriptionEntry = subscriptionEntry;
    return this;
  }

  /**
   * Get subscriptionEntry
   * @return subscriptionEntry
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ENTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubscriptionEntry getSubscriptionEntry() {
    return subscriptionEntry;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ENTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionEntry(@Nullable SubscriptionEntry subscriptionEntry) {
    this.subscriptionEntry = subscriptionEntry;
  }


  public ThingsboardErrorResponse subscriptionValue(@Nullable com.fasterxml.jackson.databind.JsonNode subscriptionValue) {
    this.subscriptionValue = subscriptionValue;
    return this;
  }

  /**
   * Get subscriptionValue
   * @return subscriptionValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getSubscriptionValue() {
    return subscriptionValue;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionValue(@Nullable com.fasterxml.jackson.databind.JsonNode subscriptionValue) {
    this.subscriptionValue = subscriptionValue;
  }


  /**
   * Return true if this ThingsboardErrorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingsboardErrorResponse thingsboardErrorResponse = (ThingsboardErrorResponse) o;
    return Objects.equals(this.status, thingsboardErrorResponse.status) &&
        Objects.equals(this.message, thingsboardErrorResponse.message) &&
        Objects.equals(this.errorCode, thingsboardErrorResponse.errorCode) &&
        Objects.equals(this.timestamp, thingsboardErrorResponse.timestamp) &&
        Objects.equals(this.subscriptionErrorCode, thingsboardErrorResponse.subscriptionErrorCode) &&
        Objects.equals(this.subscriptionEntry, thingsboardErrorResponse.subscriptionEntry) &&
        Objects.equals(this.subscriptionValue, thingsboardErrorResponse.subscriptionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, errorCode, timestamp, subscriptionErrorCode, subscriptionEntry, subscriptionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingsboardErrorResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    subscriptionErrorCode: ").append(toIndentedString(subscriptionErrorCode)).append("\n");
    sb.append("    subscriptionEntry: ").append(toIndentedString(subscriptionEntry)).append("\n");
    sb.append("    subscriptionValue: ").append(toIndentedString(subscriptionValue)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMessage()))));
    }

    // add `errorCode` to the URL query string
    if (getErrorCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serrorCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getErrorCode()))));
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimestamp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimestamp()))));
    }

    // add `subscriptionErrorCode` to the URL query string
    if (getSubscriptionErrorCode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionErrorCode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionErrorCode()))));
    }

    // add `subscriptionEntry` to the URL query string
    if (getSubscriptionEntry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionEntry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionEntry()))));
    }

    // add `subscriptionValue` to the URL query string
    if (getSubscriptionValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionValue()))));
    }

    return joiner.toString();
  }
}

