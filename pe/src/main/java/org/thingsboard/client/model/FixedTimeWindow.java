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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * FixedTimeWindow
 */
@JsonPropertyOrder({
  FixedTimeWindow.JSON_PROPERTY_START_TIME_MS,
  FixedTimeWindow.JSON_PROPERTY_END_TIME_MS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class FixedTimeWindow {
  public static final String JSON_PROPERTY_START_TIME_MS = "startTimeMs";
  @javax.annotation.Nullable
  private Long startTimeMs;

  public static final String JSON_PROPERTY_END_TIME_MS = "endTimeMs";
  @javax.annotation.Nullable
  private Long endTimeMs;

  public FixedTimeWindow() { 
  }

  public FixedTimeWindow startTimeMs(@javax.annotation.Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * Get startTimeMs
   * @return startTimeMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTimeMs() {
    return startTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimeMs(@javax.annotation.Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  public FixedTimeWindow endTimeMs(@javax.annotation.Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * Get endTimeMs
   * @return endTimeMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTimeMs() {
    return endTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTimeMs(@javax.annotation.Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
  }


  /**
   * Return true if this FixedTimeWindow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedTimeWindow fixedTimeWindow = (FixedTimeWindow) o;
    return Objects.equals(this.startTimeMs, fixedTimeWindow.startTimeMs) &&
        Objects.equals(this.endTimeMs, fixedTimeWindow.endTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeMs, endTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedTimeWindow {\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
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

    // add `startTimeMs` to the URL query string
    if (getStartTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTimeMs()))));
    }

    // add `endTimeMs` to the URL query string
    if (getEndTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTimeMs()))));
    }

    return joiner.toString();
  }
}

