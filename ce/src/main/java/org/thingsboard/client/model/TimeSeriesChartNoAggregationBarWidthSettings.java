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
import org.thingsboard.client.model.TimeSeriesChartBarWidth;
import org.thingsboard.client.model.TimeSeriesChartNoAggregationBarWidthStrategy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeSeriesChartNoAggregationBarWidthSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartNoAggregationBarWidthSettings.JSON_PROPERTY_STRATEGY,
  TimeSeriesChartNoAggregationBarWidthSettings.JSON_PROPERTY_GROUP_WIDTH,
  TimeSeriesChartNoAggregationBarWidthSettings.JSON_PROPERTY_BAR_WIDTH
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TimeSeriesChartNoAggregationBarWidthSettings {
  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  @Nullable
  private TimeSeriesChartNoAggregationBarWidthStrategy strategy;

  public static final String JSON_PROPERTY_GROUP_WIDTH = "groupWidth";
  @Nullable
  private TimeSeriesChartBarWidth groupWidth;

  public static final String JSON_PROPERTY_BAR_WIDTH = "barWidth";
  @Nullable
  private TimeSeriesChartBarWidth barWidth;

  public TimeSeriesChartNoAggregationBarWidthSettings() { 
  }

  public TimeSeriesChartNoAggregationBarWidthSettings strategy(@Nullable TimeSeriesChartNoAggregationBarWidthStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartNoAggregationBarWidthStrategy getStrategy() {
    return strategy;
  }


  @JsonProperty(value = JSON_PROPERTY_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategy(@Nullable TimeSeriesChartNoAggregationBarWidthStrategy strategy) {
    this.strategy = strategy;
  }


  public TimeSeriesChartNoAggregationBarWidthSettings groupWidth(@Nullable TimeSeriesChartBarWidth groupWidth) {
    this.groupWidth = groupWidth;
    return this;
  }

  /**
   * Get groupWidth
   * @return groupWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUP_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartBarWidth getGroupWidth() {
    return groupWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupWidth(@Nullable TimeSeriesChartBarWidth groupWidth) {
    this.groupWidth = groupWidth;
  }


  public TimeSeriesChartNoAggregationBarWidthSettings barWidth(@Nullable TimeSeriesChartBarWidth barWidth) {
    this.barWidth = barWidth;
    return this;
  }

  /**
   * Get barWidth
   * @return barWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartBarWidth getBarWidth() {
    return barWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarWidth(@Nullable TimeSeriesChartBarWidth barWidth) {
    this.barWidth = barWidth;
  }


  /**
   * Return true if this TimeSeriesChartNoAggregationBarWidthSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartNoAggregationBarWidthSettings timeSeriesChartNoAggregationBarWidthSettings = (TimeSeriesChartNoAggregationBarWidthSettings) o;
    return Objects.equals(this.strategy, timeSeriesChartNoAggregationBarWidthSettings.strategy) &&
        Objects.equals(this.groupWidth, timeSeriesChartNoAggregationBarWidthSettings.groupWidth) &&
        Objects.equals(this.barWidth, timeSeriesChartNoAggregationBarWidthSettings.barWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, groupWidth, barWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartNoAggregationBarWidthSettings {\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    groupWidth: ").append(toIndentedString(groupWidth)).append("\n");
    sb.append("    barWidth: ").append(toIndentedString(barWidth)).append("\n");
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

    // add `strategy` to the URL query string
    if (getStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrategy()))));
    }

    // add `groupWidth` to the URL query string
    if (getGroupWidth() != null) {
      joiner.add(getGroupWidth().toUrlQueryString(prefix + "groupWidth" + suffix));
    }

    // add `barWidth` to the URL query string
    if (getBarWidth() != null) {
      joiner.add(getBarWidth().toUrlQueryString(prefix + "barWidth" + suffix));
    }

    return joiner.toString();
  }
}

