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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.ErrorComponentAllOfExceptionCauseStackTrace;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ErrorComponentAllOfExceptionCause
 */
@JsonPropertyOrder({
  ErrorComponentAllOfExceptionCause.JSON_PROPERTY_STACK_TRACE,
  ErrorComponentAllOfExceptionCause.JSON_PROPERTY_MESSAGE,
  ErrorComponentAllOfExceptionCause.JSON_PROPERTY_LOCALIZED_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ErrorComponentAllOfExceptionCause {
  public static final String JSON_PROPERTY_STACK_TRACE = "stackTrace";
  @javax.annotation.Nullable
  private List<ErrorComponentAllOfExceptionCauseStackTrace> stackTrace = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @javax.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_LOCALIZED_MESSAGE = "localizedMessage";
  @javax.annotation.Nullable
  private String localizedMessage;

  public ErrorComponentAllOfExceptionCause() { 
  }

  public ErrorComponentAllOfExceptionCause stackTrace(@javax.annotation.Nullable List<ErrorComponentAllOfExceptionCauseStackTrace> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public ErrorComponentAllOfExceptionCause addStackTraceItem(ErrorComponentAllOfExceptionCauseStackTrace stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * Get stackTrace
   * @return stackTrace
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STACK_TRACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ErrorComponentAllOfExceptionCauseStackTrace> getStackTrace() {
    return stackTrace;
  }


  @JsonProperty(value = JSON_PROPERTY_STACK_TRACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStackTrace(@javax.annotation.Nullable List<ErrorComponentAllOfExceptionCauseStackTrace> stackTrace) {
    this.stackTrace = stackTrace;
  }


  public ErrorComponentAllOfExceptionCause message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }


  @JsonProperty(value = JSON_PROPERTY_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public ErrorComponentAllOfExceptionCause localizedMessage(@javax.annotation.Nullable String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * Get localizedMessage
   * @return localizedMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOCALIZED_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocalizedMessage() {
    return localizedMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_LOCALIZED_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalizedMessage(@javax.annotation.Nullable String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }


  /**
   * Return true if this ErrorComponent_allOf_exception_cause object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorComponentAllOfExceptionCause errorComponentAllOfExceptionCause = (ErrorComponentAllOfExceptionCause) o;
    return Objects.equals(this.stackTrace, errorComponentAllOfExceptionCause.stackTrace) &&
        Objects.equals(this.message, errorComponentAllOfExceptionCause.message) &&
        Objects.equals(this.localizedMessage, errorComponentAllOfExceptionCause.localizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackTrace, message, localizedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorComponentAllOfExceptionCause {\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
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

    // add `stackTrace` to the URL query string
    if (getStackTrace() != null) {
      for (int i = 0; i < getStackTrace().size(); i++) {
        if (getStackTrace().get(i) != null) {
          joiner.add(getStackTrace().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstackTrace%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMessage()))));
    }

    // add `localizedMessage` to the URL query string
    if (getLocalizedMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slocalizedMessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLocalizedMessage()))));
    }

    return joiner.toString();
  }
}

