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
 * TimeSeriesChartBarWidth
 */
@JsonPropertyOrder({
  TimeSeriesChartBarWidth.JSON_PROPERTY_RELATIVE,
  TimeSeriesChartBarWidth.JSON_PROPERTY_RELATIVE_WIDTH,
  TimeSeriesChartBarWidth.JSON_PROPERTY_ABSOLUTE_WIDTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TimeSeriesChartBarWidth {
  public static final String JSON_PROPERTY_RELATIVE = "relative";
  @javax.annotation.Nullable
  private Boolean relative;

  public static final String JSON_PROPERTY_RELATIVE_WIDTH = "relativeWidth";
  @javax.annotation.Nullable
  private Double relativeWidth;

  public static final String JSON_PROPERTY_ABSOLUTE_WIDTH = "absoluteWidth";
  @javax.annotation.Nullable
  private Double absoluteWidth;

  public TimeSeriesChartBarWidth() { 
  }

  public TimeSeriesChartBarWidth relative(@javax.annotation.Nullable Boolean relative) {
    this.relative = relative;
    return this;
  }

  /**
   * Get relative
   * @return relative
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRelative() {
    return relative;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(@javax.annotation.Nullable Boolean relative) {
    this.relative = relative;
  }


  public TimeSeriesChartBarWidth relativeWidth(@javax.annotation.Nullable Double relativeWidth) {
    this.relativeWidth = relativeWidth;
    return this;
  }

  /**
   * Get relativeWidth
   * @return relativeWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATIVE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRelativeWidth() {
    return relativeWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATIVE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeWidth(@javax.annotation.Nullable Double relativeWidth) {
    this.relativeWidth = relativeWidth;
  }


  public TimeSeriesChartBarWidth absoluteWidth(@javax.annotation.Nullable Double absoluteWidth) {
    this.absoluteWidth = absoluteWidth;
    return this;
  }

  /**
   * Get absoluteWidth
   * @return absoluteWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ABSOLUTE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAbsoluteWidth() {
    return absoluteWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_ABSOLUTE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsoluteWidth(@javax.annotation.Nullable Double absoluteWidth) {
    this.absoluteWidth = absoluteWidth;
  }


  /**
   * Return true if this TimeSeriesChartBarWidth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartBarWidth timeSeriesChartBarWidth = (TimeSeriesChartBarWidth) o;
    return Objects.equals(this.relative, timeSeriesChartBarWidth.relative) &&
        Objects.equals(this.relativeWidth, timeSeriesChartBarWidth.relativeWidth) &&
        Objects.equals(this.absoluteWidth, timeSeriesChartBarWidth.absoluteWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relative, relativeWidth, absoluteWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartBarWidth {\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
    sb.append("    relativeWidth: ").append(toIndentedString(relativeWidth)).append("\n");
    sb.append("    absoluteWidth: ").append(toIndentedString(absoluteWidth)).append("\n");
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

    // add `relative` to the URL query string
    if (getRelative() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelative%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelative()))));
    }

    // add `relativeWidth` to the URL query string
    if (getRelativeWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelativeWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelativeWidth()))));
    }

    // add `absoluteWidth` to the URL query string
    if (getAbsoluteWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sabsoluteWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAbsoluteWidth()))));
    }

    return joiner.toString();
  }
}

