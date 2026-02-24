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
import org.thingsboard.client.model.ThingsboardErrorCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ThingsboardCredentialsExpiredResponse
 */
@JsonPropertyOrder({
  ThingsboardCredentialsExpiredResponse.JSON_PROPERTY_STATUS,
  ThingsboardCredentialsExpiredResponse.JSON_PROPERTY_MESSAGE,
  ThingsboardCredentialsExpiredResponse.JSON_PROPERTY_ERROR_CODE,
  ThingsboardCredentialsExpiredResponse.JSON_PROPERTY_TIMESTAMP,
  ThingsboardCredentialsExpiredResponse.JSON_PROPERTY_RESET_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ThingsboardCredentialsExpiredResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private Integer status;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  @javax.annotation.Nullable
  private ThingsboardErrorCode errorCode;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @javax.annotation.Nullable
  private Long timestamp;

  public static final String JSON_PROPERTY_RESET_TOKEN = "resetToken";
  @javax.annotation.Nullable
  private String resetToken;

  public ThingsboardCredentialsExpiredResponse() { 
  }

  @JsonCreator
  public ThingsboardCredentialsExpiredResponse(
    @JsonProperty(JSON_PROPERTY_STATUS) Integer status, 
    @JsonProperty(JSON_PROPERTY_MESSAGE) String message, 
    @JsonProperty(JSON_PROPERTY_TIMESTAMP) Long timestamp, 
    @JsonProperty(JSON_PROPERTY_RESET_TOKEN) String resetToken
  ) {
  this();
    this.status = status;
    this.message = message;
    this.timestamp = timestamp;
    this.resetToken = resetToken;
  }

  /**
   * HTTP Response Status Code
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getStatus() {
    return status;
  }




  /**
   * Error message
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }




  public ThingsboardCredentialsExpiredResponse errorCode(@javax.annotation.Nullable ThingsboardErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ThingsboardErrorCode getErrorCode() {
    return errorCode;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR_CODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(@javax.annotation.Nullable ThingsboardErrorCode errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Timestamp
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMESTAMP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimestamp() {
    return timestamp;
  }




  /**
   * Password reset token
   * @return resetToken
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESET_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResetToken() {
    return resetToken;
  }




  /**
   * Return true if this ThingsboardCredentialsExpiredResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingsboardCredentialsExpiredResponse thingsboardCredentialsExpiredResponse = (ThingsboardCredentialsExpiredResponse) o;
    return Objects.equals(this.status, thingsboardCredentialsExpiredResponse.status) &&
        Objects.equals(this.message, thingsboardCredentialsExpiredResponse.message) &&
        Objects.equals(this.errorCode, thingsboardCredentialsExpiredResponse.errorCode) &&
        Objects.equals(this.timestamp, thingsboardCredentialsExpiredResponse.timestamp) &&
        Objects.equals(this.resetToken, thingsboardCredentialsExpiredResponse.resetToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, errorCode, timestamp, resetToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingsboardCredentialsExpiredResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
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

    // add `resetToken` to the URL query string
    if (getResetToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresetToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResetToken()))));
    }

    return joiner.toString();
  }
}

