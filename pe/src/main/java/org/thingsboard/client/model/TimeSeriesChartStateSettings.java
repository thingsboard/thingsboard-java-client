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
import org.thingsboard.client.model.TimeSeriesChartStateSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeSeriesChartStateSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartStateSettings.JSON_PROPERTY_LABEL,
  TimeSeriesChartStateSettings.JSON_PROPERTY_VALUE,
  TimeSeriesChartStateSettings.JSON_PROPERTY_SOURCE_TYPE,
  TimeSeriesChartStateSettings.JSON_PROPERTY_SOURCE_RANGE_FROM,
  TimeSeriesChartStateSettings.JSON_PROPERTY_SOURCE_RANGE_TO,
  TimeSeriesChartStateSettings.JSON_PROPERTY_SOURCE_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TimeSeriesChartStateSettings {
  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private Double value;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  @javax.annotation.Nullable
  private TimeSeriesChartStateSourceType sourceType;

  public static final String JSON_PROPERTY_SOURCE_RANGE_FROM = "sourceRangeFrom";
  @javax.annotation.Nullable
  private Double sourceRangeFrom;

  public static final String JSON_PROPERTY_SOURCE_RANGE_TO = "sourceRangeTo";
  @javax.annotation.Nullable
  private Double sourceRangeTo;

  public static final String JSON_PROPERTY_SOURCE_VALUE = "sourceValue";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode sourceValue = null;

  public TimeSeriesChartStateSettings() { 
  }

  public TimeSeriesChartStateSettings label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public TimeSeriesChartStateSettings value(@javax.annotation.Nullable Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@javax.annotation.Nullable Double value) {
    this.value = value;
  }


  public TimeSeriesChartStateSettings sourceType(@javax.annotation.Nullable TimeSeriesChartStateSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartStateSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(@javax.annotation.Nullable TimeSeriesChartStateSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public TimeSeriesChartStateSettings sourceRangeFrom(@javax.annotation.Nullable Double sourceRangeFrom) {
    this.sourceRangeFrom = sourceRangeFrom;
    return this;
  }

  /**
   * Get sourceRangeFrom
   * @return sourceRangeFrom
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_RANGE_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSourceRangeFrom() {
    return sourceRangeFrom;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_RANGE_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceRangeFrom(@javax.annotation.Nullable Double sourceRangeFrom) {
    this.sourceRangeFrom = sourceRangeFrom;
  }


  public TimeSeriesChartStateSettings sourceRangeTo(@javax.annotation.Nullable Double sourceRangeTo) {
    this.sourceRangeTo = sourceRangeTo;
    return this;
  }

  /**
   * Get sourceRangeTo
   * @return sourceRangeTo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_RANGE_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSourceRangeTo() {
    return sourceRangeTo;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_RANGE_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceRangeTo(@javax.annotation.Nullable Double sourceRangeTo) {
    this.sourceRangeTo = sourceRangeTo;
  }


  public TimeSeriesChartStateSettings sourceValue(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode sourceValue) {
    this.sourceValue = sourceValue;
    return this;
  }

  /**
   * Get sourceValue
   * @return sourceValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getSourceValue() {
    return sourceValue;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceValue(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode sourceValue) {
    this.sourceValue = sourceValue;
  }


  /**
   * Return true if this TimeSeriesChartStateSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartStateSettings timeSeriesChartStateSettings = (TimeSeriesChartStateSettings) o;
    return Objects.equals(this.label, timeSeriesChartStateSettings.label) &&
        Objects.equals(this.value, timeSeriesChartStateSettings.value) &&
        Objects.equals(this.sourceType, timeSeriesChartStateSettings.sourceType) &&
        Objects.equals(this.sourceRangeFrom, timeSeriesChartStateSettings.sourceRangeFrom) &&
        Objects.equals(this.sourceRangeTo, timeSeriesChartStateSettings.sourceRangeTo) &&
        Objects.equals(this.sourceValue, timeSeriesChartStateSettings.sourceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value, sourceType, sourceRangeFrom, sourceRangeTo, sourceValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartStateSettings {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceRangeFrom: ").append(toIndentedString(sourceRangeFrom)).append("\n");
    sb.append("    sourceRangeTo: ").append(toIndentedString(sourceRangeTo)).append("\n");
    sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
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

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `sourceType` to the URL query string
    if (getSourceType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceType()))));
    }

    // add `sourceRangeFrom` to the URL query string
    if (getSourceRangeFrom() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceRangeFrom%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceRangeFrom()))));
    }

    // add `sourceRangeTo` to the URL query string
    if (getSourceRangeTo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceRangeTo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceRangeTo()))));
    }

    // add `sourceValue` to the URL query string
    if (getSourceValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceValue()))));
    }

    return joiner.toString();
  }
}

