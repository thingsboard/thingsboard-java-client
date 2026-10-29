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
import org.thingsboard.client.model.FixedTimeWindow;
import org.thingsboard.client.model.Interval;
import org.thingsboard.client.model.QuickTimeInterval;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * History
 */
@JsonPropertyOrder({
  History.JSON_PROPERTY_HISTORY_TYPE,
  History.JSON_PROPERTY_INTERVAL,
  History.JSON_PROPERTY_TIMEWINDOW_MS,
  History.JSON_PROPERTY_FIXED_TIMEWINDOW,
  History.JSON_PROPERTY_QUICK_INTERVAL
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class History {
  public static final String JSON_PROPERTY_HISTORY_TYPE = "historyType";
  @Nullable
  private Integer historyType;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @Nullable
  private Interval interval;

  public static final String JSON_PROPERTY_TIMEWINDOW_MS = "timewindowMs";
  @Nullable
  private Long timewindowMs;

  public static final String JSON_PROPERTY_FIXED_TIMEWINDOW = "fixedTimewindow";
  @Nullable
  private FixedTimeWindow fixedTimewindow;

  public static final String JSON_PROPERTY_QUICK_INTERVAL = "quickInterval";
  @Nullable
  private QuickTimeInterval quickInterval;

  public History() { 
  }

  public History historyType(@Nullable Integer historyType) {
    this.historyType = historyType;
    return this;
  }

  /**
   * Get historyType
   * @return historyType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HISTORY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHistoryType() {
    return historyType;
  }


  @JsonProperty(value = JSON_PROPERTY_HISTORY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHistoryType(@Nullable Integer historyType) {
    this.historyType = historyType;
  }


  public History interval(@Nullable Interval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Interval getInterval() {
    return interval;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(@Nullable Interval interval) {
    this.interval = interval;
  }


  public History timewindowMs(@Nullable Long timewindowMs) {
    this.timewindowMs = timewindowMs;
    return this;
  }

  /**
   * Get timewindowMs
   * @return timewindowMs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimewindowMs() {
    return timewindowMs;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimewindowMs(@Nullable Long timewindowMs) {
    this.timewindowMs = timewindowMs;
  }


  public History fixedTimewindow(@Nullable FixedTimeWindow fixedTimewindow) {
    this.fixedTimewindow = fixedTimewindow;
    return this;
  }

  /**
   * Get fixedTimewindow
   * @return fixedTimewindow
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FIXED_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FixedTimeWindow getFixedTimewindow() {
    return fixedTimewindow;
  }


  @JsonProperty(value = JSON_PROPERTY_FIXED_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedTimewindow(@Nullable FixedTimeWindow fixedTimewindow) {
    this.fixedTimewindow = fixedTimewindow;
  }


  public History quickInterval(@Nullable QuickTimeInterval quickInterval) {
    this.quickInterval = quickInterval;
    return this;
  }

  /**
   * Get quickInterval
   * @return quickInterval
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QUICK_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuickTimeInterval getQuickInterval() {
    return quickInterval;
  }


  @JsonProperty(value = JSON_PROPERTY_QUICK_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuickInterval(@Nullable QuickTimeInterval quickInterval) {
    this.quickInterval = quickInterval;
  }


  /**
   * Return true if this History object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.historyType, history.historyType) &&
        Objects.equals(this.interval, history.interval) &&
        Objects.equals(this.timewindowMs, history.timewindowMs) &&
        Objects.equals(this.fixedTimewindow, history.fixedTimewindow) &&
        Objects.equals(this.quickInterval, history.quickInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyType, interval, timewindowMs, fixedTimewindow, quickInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    sb.append("    historyType: ").append(toIndentedString(historyType)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timewindowMs: ").append(toIndentedString(timewindowMs)).append("\n");
    sb.append("    fixedTimewindow: ").append(toIndentedString(fixedTimewindow)).append("\n");
    sb.append("    quickInterval: ").append(toIndentedString(quickInterval)).append("\n");
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

    // add `historyType` to the URL query string
    if (getHistoryType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shistoryType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHistoryType()))));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(getInterval().toUrlQueryString(prefix + "interval" + suffix));
    }

    // add `timewindowMs` to the URL query string
    if (getTimewindowMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimewindowMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimewindowMs()))));
    }

    // add `fixedTimewindow` to the URL query string
    if (getFixedTimewindow() != null) {
      joiner.add(getFixedTimewindow().toUrlQueryString(prefix + "fixedTimewindow" + suffix));
    }

    // add `quickInterval` to the URL query string
    if (getQuickInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squickInterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQuickInterval()))));
    }

    return joiner.toString();
  }
}

