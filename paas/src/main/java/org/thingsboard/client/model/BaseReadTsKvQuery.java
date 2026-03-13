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
import org.thingsboard.client.model.AggregationParams;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BaseReadTsKvQuery
 */
@JsonPropertyOrder({
  BaseReadTsKvQuery.JSON_PROPERTY_ID,
  BaseReadTsKvQuery.JSON_PROPERTY_KEY,
  BaseReadTsKvQuery.JSON_PROPERTY_START_TS,
  BaseReadTsKvQuery.JSON_PROPERTY_END_TS,
  BaseReadTsKvQuery.JSON_PROPERTY_AGG_PARAMETERS,
  BaseReadTsKvQuery.JSON_PROPERTY_LIMIT,
  BaseReadTsKvQuery.JSON_PROPERTY_ORDER,
  BaseReadTsKvQuery.JSON_PROPERTY_AGGREGATION,
  BaseReadTsKvQuery.JSON_PROPERTY_INTERVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class BaseReadTsKvQuery {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private String key;

  public static final String JSON_PROPERTY_START_TS = "startTs";
  @javax.annotation.Nullable
  private Long startTs;

  public static final String JSON_PROPERTY_END_TS = "endTs";
  @javax.annotation.Nullable
  private Long endTs;

  public static final String JSON_PROPERTY_AGG_PARAMETERS = "aggParameters";
  @javax.annotation.Nullable
  private AggregationParams aggParameters;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable
  private String order;

  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  @javax.annotation.Nullable
  private Aggregation aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nullable
  private Long interval;

  public BaseReadTsKvQuery() { 
  }

  public BaseReadTsKvQuery id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public BaseReadTsKvQuery key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public BaseReadTsKvQuery startTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Get startTs
   * @return startTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTs() {
    return startTs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
  }


  public BaseReadTsKvQuery endTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTs() {
    return endTs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
  }


  public BaseReadTsKvQuery aggParameters(@javax.annotation.Nullable AggregationParams aggParameters) {
    this.aggParameters = aggParameters;
    return this;
  }

  /**
   * Get aggParameters
   * @return aggParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AGG_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggregationParams getAggParameters() {
    return aggParameters;
  }


  @JsonProperty(value = JSON_PROPERTY_AGG_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggParameters(@javax.annotation.Nullable AggregationParams aggParameters) {
    this.aggParameters = aggParameters;
  }


  public BaseReadTsKvQuery limit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }


  public BaseReadTsKvQuery order(@javax.annotation.Nullable String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrder() {
    return order;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(@javax.annotation.Nullable String order) {
    this.order = order;
  }


  public BaseReadTsKvQuery aggregation(@javax.annotation.Nullable Aggregation aggregation) {
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


  public BaseReadTsKvQuery interval(@javax.annotation.Nullable Long interval) {
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
   * Return true if this BaseReadTsKvQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReadTsKvQuery baseReadTsKvQuery = (BaseReadTsKvQuery) o;
    return Objects.equals(this.id, baseReadTsKvQuery.id) &&
        Objects.equals(this.key, baseReadTsKvQuery.key) &&
        Objects.equals(this.startTs, baseReadTsKvQuery.startTs) &&
        Objects.equals(this.endTs, baseReadTsKvQuery.endTs) &&
        Objects.equals(this.aggParameters, baseReadTsKvQuery.aggParameters) &&
        Objects.equals(this.limit, baseReadTsKvQuery.limit) &&
        Objects.equals(this.order, baseReadTsKvQuery.order) &&
        Objects.equals(this.aggregation, baseReadTsKvQuery.aggregation) &&
        Objects.equals(this.interval, baseReadTsKvQuery.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, startTs, endTs, aggParameters, limit, order, aggregation, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReadTsKvQuery {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    aggParameters: ").append(toIndentedString(aggParameters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `startTs` to the URL query string
    if (getStartTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTs()))));
    }

    // add `endTs` to the URL query string
    if (getEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTs()))));
    }

    // add `aggParameters` to the URL query string
    if (getAggParameters() != null) {
      joiner.add(getAggParameters().toUrlQueryString(prefix + "aggParameters" + suffix));
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLimit()))));
    }

    // add `order` to the URL query string
    if (getOrder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sorder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrder()))));
    }

    // add `aggregation` to the URL query string
    if (getAggregation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saggregation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAggregation()))));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterval()))));
    }

    return joiner.toString();
  }
}

