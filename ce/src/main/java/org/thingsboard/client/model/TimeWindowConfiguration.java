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
import org.thingsboard.client.model.AggregationConfiguration;
import org.thingsboard.client.model.History;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeWindowConfiguration
 */
@JsonPropertyOrder({
  TimeWindowConfiguration.JSON_PROPERTY_HISTORY,
  TimeWindowConfiguration.JSON_PROPERTY_AGGREGATION,
  TimeWindowConfiguration.JSON_PROPERTY_TIMEZONE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TimeWindowConfiguration {
  public static final String JSON_PROPERTY_HISTORY = "history";
  @Nullable
  private History history;

  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  @Nullable
  private AggregationConfiguration aggregation;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  @Nullable
  private String timezone;

  public TimeWindowConfiguration() { 
  }

  public TimeWindowConfiguration history(@Nullable History history) {
    this.history = history;
    return this;
  }

  /**
   * Get history
   * @return history
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HISTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public History getHistory() {
    return history;
  }


  @JsonProperty(value = JSON_PROPERTY_HISTORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHistory(@Nullable History history) {
    this.history = history;
  }


  public TimeWindowConfiguration aggregation(@Nullable AggregationConfiguration aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Get aggregation
   * @return aggregation
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGGREGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggregationConfiguration getAggregation() {
    return aggregation;
  }


  @JsonProperty(value = JSON_PROPERTY_AGGREGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregation(@Nullable AggregationConfiguration aggregation) {
    this.aggregation = aggregation;
  }


  public TimeWindowConfiguration timezone(@Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(@Nullable String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this TimeWindowConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeWindowConfiguration timeWindowConfiguration = (TimeWindowConfiguration) o;
    return Objects.equals(this.history, timeWindowConfiguration.history) &&
        Objects.equals(this.aggregation, timeWindowConfiguration.aggregation) &&
        Objects.equals(this.timezone, timeWindowConfiguration.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, aggregation, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindowConfiguration {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

    // add `history` to the URL query string
    if (getHistory() != null) {
      joiner.add(getHistory().toUrlQueryString(prefix + "history" + suffix));
    }

    // add `aggregation` to the URL query string
    if (getAggregation() != null) {
      joiner.add(getAggregation().toUrlQueryString(prefix + "aggregation" + suffix));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimezone()))));
    }

    return joiner.toString();
  }
}

