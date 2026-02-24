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
 * TimeSeriesChartBarWidthSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartBarWidthSettings.JSON_PROPERTY_BAR_GAP,
  TimeSeriesChartBarWidthSettings.JSON_PROPERTY_INTERVAL_GAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TimeSeriesChartBarWidthSettings {
  public static final String JSON_PROPERTY_BAR_GAP = "barGap";
  @javax.annotation.Nullable
  private Double barGap;

  public static final String JSON_PROPERTY_INTERVAL_GAP = "intervalGap";
  @javax.annotation.Nullable
  private Double intervalGap;

  public TimeSeriesChartBarWidthSettings() { 
  }

  public TimeSeriesChartBarWidthSettings barGap(@javax.annotation.Nullable Double barGap) {
    this.barGap = barGap;
    return this;
  }

  /**
   * Get barGap
   * @return barGap
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_GAP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBarGap() {
    return barGap;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_GAP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarGap(@javax.annotation.Nullable Double barGap) {
    this.barGap = barGap;
  }


  public TimeSeriesChartBarWidthSettings intervalGap(@javax.annotation.Nullable Double intervalGap) {
    this.intervalGap = intervalGap;
    return this;
  }

  /**
   * Get intervalGap
   * @return intervalGap
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL_GAP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIntervalGap() {
    return intervalGap;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL_GAP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalGap(@javax.annotation.Nullable Double intervalGap) {
    this.intervalGap = intervalGap;
  }


  /**
   * Return true if this TimeSeriesChartBarWidthSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartBarWidthSettings timeSeriesChartBarWidthSettings = (TimeSeriesChartBarWidthSettings) o;
    return Objects.equals(this.barGap, timeSeriesChartBarWidthSettings.barGap) &&
        Objects.equals(this.intervalGap, timeSeriesChartBarWidthSettings.intervalGap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barGap, intervalGap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartBarWidthSettings {\n");
    sb.append("    barGap: ").append(toIndentedString(barGap)).append("\n");
    sb.append("    intervalGap: ").append(toIndentedString(intervalGap)).append("\n");
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

    // add `barGap` to the URL query string
    if (getBarGap() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarGap%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarGap()))));
    }

    // add `intervalGap` to the URL query string
    if (getIntervalGap() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintervalGap%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntervalGap()))));
    }

    return joiner.toString();
  }
}

