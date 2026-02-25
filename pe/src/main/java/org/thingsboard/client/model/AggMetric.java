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
import org.thingsboard.client.model.AggFunction;
import org.thingsboard.client.model.AggInput;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AggMetric
 */
@JsonPropertyOrder({
  AggMetric.JSON_PROPERTY_FUNCTION,
  AggMetric.JSON_PROPERTY_FILTER,
  AggMetric.JSON_PROPERTY_INPUT,
  AggMetric.JSON_PROPERTY_DEFAULT_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AggMetric {
  public static final String JSON_PROPERTY_FUNCTION = "function";
  @javax.annotation.Nullable
  private AggFunction function;

  public static final String JSON_PROPERTY_FILTER = "filter";
  @javax.annotation.Nullable
  private String filter;

  public static final String JSON_PROPERTY_INPUT = "input";
  @javax.annotation.Nullable
  private AggInput input;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  @javax.annotation.Nullable
  private Double defaultValue;

  public AggMetric() { 
  }

  public AggMetric function(@javax.annotation.Nullable AggFunction function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FUNCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggFunction getFunction() {
    return function;
  }


  @JsonProperty(value = JSON_PROPERTY_FUNCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(@javax.annotation.Nullable AggFunction function) {
    this.function = function;
  }


  public AggMetric filter(@javax.annotation.Nullable String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }


  @JsonProperty(value = JSON_PROPERTY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(@javax.annotation.Nullable String filter) {
    this.filter = filter;
  }


  public AggMetric input(@javax.annotation.Nullable AggInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INPUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggInput getInput() {
    return input;
  }


  @JsonProperty(value = JSON_PROPERTY_INPUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInput(@javax.annotation.Nullable AggInput input) {
    this.input = input;
  }


  public AggMetric defaultValue(@javax.annotation.Nullable Double defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(@javax.annotation.Nullable Double defaultValue) {
    this.defaultValue = defaultValue;
  }


  /**
   * Return true if this AggMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggMetric aggMetric = (AggMetric) o;
    return Objects.equals(this.function, aggMetric.function) &&
        Objects.equals(this.filter, aggMetric.filter) &&
        Objects.equals(this.input, aggMetric.input) &&
        Objects.equals(this.defaultValue, aggMetric.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, filter, input, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggMetric {\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

    // add `function` to the URL query string
    if (getFunction() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfunction%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFunction()))));
    }

    // add `filter` to the URL query string
    if (getFilter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfilter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFilter()))));
    }

    // add `input` to the URL query string
    if (getInput() != null) {
      joiner.add(getInput().toUrlQueryString(prefix + "input" + suffix));
    }

    // add `defaultValue` to the URL query string
    if (getDefaultValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultValue()))));
    }

    return joiner.toString();
  }
}

