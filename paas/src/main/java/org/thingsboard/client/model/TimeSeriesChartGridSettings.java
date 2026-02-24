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
 * TimeSeriesChartGridSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartGridSettings.JSON_PROPERTY_SHOW,
  TimeSeriesChartGridSettings.JSON_PROPERTY_BACKGROUND_COLOR,
  TimeSeriesChartGridSettings.JSON_PROPERTY_BORDER_WIDTH,
  TimeSeriesChartGridSettings.JSON_PROPERTY_BORDER_COLOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TimeSeriesChartGridSettings {
  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable
  private Boolean show;

  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
  @javax.annotation.Nullable
  private String backgroundColor;

  public static final String JSON_PROPERTY_BORDER_WIDTH = "borderWidth";
  @javax.annotation.Nullable
  private Float borderWidth;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  @javax.annotation.Nullable
  private String borderColor;

  public TimeSeriesChartGridSettings() { 
  }

  public TimeSeriesChartGridSettings show(@javax.annotation.Nullable Boolean show) {
    this.show = show;
    return this;
  }

  /**
   * Get show
   * @return show
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShow() {
    return show;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShow(@javax.annotation.Nullable Boolean show) {
    this.show = show;
  }


  public TimeSeriesChartGridSettings backgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Get backgroundColor
   * @return backgroundColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public TimeSeriesChartGridSettings borderWidth(@javax.annotation.Nullable Float borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Get borderWidth
   * @return borderWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getBorderWidth() {
    return borderWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderWidth(@javax.annotation.Nullable Float borderWidth) {
    this.borderWidth = borderWidth;
  }


  public TimeSeriesChartGridSettings borderColor(@javax.annotation.Nullable String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Get borderColor
   * @return borderColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BORDER_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BORDER_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(@javax.annotation.Nullable String borderColor) {
    this.borderColor = borderColor;
  }


  /**
   * Return true if this TimeSeriesChartGridSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartGridSettings timeSeriesChartGridSettings = (TimeSeriesChartGridSettings) o;
    return Objects.equals(this.show, timeSeriesChartGridSettings.show) &&
        Objects.equals(this.backgroundColor, timeSeriesChartGridSettings.backgroundColor) &&
        Objects.equals(this.borderWidth, timeSeriesChartGridSettings.borderWidth) &&
        Objects.equals(this.borderColor, timeSeriesChartGridSettings.borderColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(show, backgroundColor, borderWidth, borderColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartGridSettings {\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
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

    // add `show` to the URL query string
    if (getShow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShow()))));
    }

    // add `backgroundColor` to the URL query string
    if (getBackgroundColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbackgroundColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBackgroundColor()))));
    }

    // add `borderWidth` to the URL query string
    if (getBorderWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderWidth()))));
    }

    // add `borderColor` to the URL query string
    if (getBorderColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderColor()))));
    }

    return joiner.toString();
  }
}

