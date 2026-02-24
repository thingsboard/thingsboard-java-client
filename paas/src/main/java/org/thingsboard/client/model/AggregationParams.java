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
import org.thingsboard.client.model.Aggregation;
import org.thingsboard.client.model.IntervalType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AggregationParams
 */
@JsonPropertyOrder({
  AggregationParams.JSON_PROPERTY_AGGREGATION,
  AggregationParams.JSON_PROPERTY_INTERVAL_TYPE,
  AggregationParams.JSON_PROPERTY_TZ_ID,
  AggregationParams.JSON_PROPERTY_INTERVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AggregationParams {
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  @javax.annotation.Nullable
  private Aggregation aggregation;

  public static final String JSON_PROPERTY_INTERVAL_TYPE = "intervalType";
  @javax.annotation.Nullable
  private IntervalType intervalType;

  public static final String JSON_PROPERTY_TZ_ID = "tzId";
  @javax.annotation.Nullable
  private String tzId;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nullable
  private Long interval;

  public AggregationParams() { 
  }

  public AggregationParams aggregation(@javax.annotation.Nullable Aggregation aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * Get aggregation
   * @return aggregation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AGGREGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Aggregation getAggregation() {
    return aggregation;
  }


  @JsonProperty(value = JSON_PROPERTY_AGGREGATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregation(@javax.annotation.Nullable Aggregation aggregation) {
    this.aggregation = aggregation;
  }


  public AggregationParams intervalType(@javax.annotation.Nullable IntervalType intervalType) {
    this.intervalType = intervalType;
    return this;
  }

  /**
   * Get intervalType
   * @return intervalType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntervalType getIntervalType() {
    return intervalType;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalType(@javax.annotation.Nullable IntervalType intervalType) {
    this.intervalType = intervalType;
  }


  public AggregationParams tzId(@javax.annotation.Nullable String tzId) {
    this.tzId = tzId;
    return this;
  }

  /**
   * Get tzId
   * @return tzId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TZ_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTzId() {
    return tzId;
  }


  @JsonProperty(value = JSON_PROPERTY_TZ_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTzId(@javax.annotation.Nullable String tzId) {
    this.tzId = tzId;
  }


  public AggregationParams interval(@javax.annotation.Nullable Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInterval() {
    return interval;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(@javax.annotation.Nullable Long interval) {
    this.interval = interval;
  }


  /**
   * Return true if this AggregationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationParams aggregationParams = (AggregationParams) o;
    return Objects.equals(this.aggregation, aggregationParams.aggregation) &&
        Objects.equals(this.intervalType, aggregationParams.intervalType) &&
        Objects.equals(this.tzId, aggregationParams.tzId) &&
        Objects.equals(this.interval, aggregationParams.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, intervalType, tzId, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationParams {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    tzId: ").append(toIndentedString(tzId)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

    // add `aggregation` to the URL query string
    if (getAggregation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saggregation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAggregation()))));
    }

    // add `intervalType` to the URL query string
    if (getIntervalType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintervalType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntervalType()))));
    }

    // add `tzId` to the URL query string
    if (getTzId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stzId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTzId()))));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterval()))));
    }

    return joiner.toString();
  }
}

