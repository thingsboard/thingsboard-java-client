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
import org.thingsboard.client.model.ChartFillSettingsGradient;
import org.thingsboard.client.model.ChartFillType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ChartFillSettings
 */
@JsonPropertyOrder({
  ChartFillSettings.JSON_PROPERTY_TYPE,
  ChartFillSettings.JSON_PROPERTY_OPACITY,
  ChartFillSettings.JSON_PROPERTY_GRADIENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ChartFillSettings {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ChartFillType type;

  public static final String JSON_PROPERTY_OPACITY = "opacity";
  @javax.annotation.Nullable
  private Float opacity;

  public static final String JSON_PROPERTY_GRADIENT = "gradient";
  @javax.annotation.Nullable
  private ChartFillSettingsGradient gradient;

  public ChartFillSettings() { 
  }

  public ChartFillSettings type(@javax.annotation.Nullable ChartFillType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartFillType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ChartFillType type) {
    this.type = type;
  }


  public ChartFillSettings opacity(@javax.annotation.Nullable Float opacity) {
    this.opacity = opacity;
    return this;
  }

  /**
   * Get opacity
   * @return opacity
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPACITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getOpacity() {
    return opacity;
  }


  @JsonProperty(value = JSON_PROPERTY_OPACITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpacity(@javax.annotation.Nullable Float opacity) {
    this.opacity = opacity;
  }


  public ChartFillSettings gradient(@javax.annotation.Nullable ChartFillSettingsGradient gradient) {
    this.gradient = gradient;
    return this;
  }

  /**
   * Get gradient
   * @return gradient
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GRADIENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartFillSettingsGradient getGradient() {
    return gradient;
  }


  @JsonProperty(value = JSON_PROPERTY_GRADIENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGradient(@javax.annotation.Nullable ChartFillSettingsGradient gradient) {
    this.gradient = gradient;
  }


  /**
   * Return true if this ChartFillSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartFillSettings chartFillSettings = (ChartFillSettings) o;
    return Objects.equals(this.type, chartFillSettings.type) &&
        Objects.equals(this.opacity, chartFillSettings.opacity) &&
        Objects.equals(this.gradient, chartFillSettings.gradient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, opacity, gradient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartFillSettings {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    gradient: ").append(toIndentedString(gradient)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `opacity` to the URL query string
    if (getOpacity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sopacity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOpacity()))));
    }

    // add `gradient` to the URL query string
    if (getGradient() != null) {
      joiner.add(getGradient().toUrlQueryString(prefix + "gradient" + suffix));
    }

    return joiner.toString();
  }
}

