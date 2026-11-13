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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ColorRange
 */
@JsonPropertyOrder({
  ColorRange.JSON_PROPERTY_FROM,
  ColorRange.JSON_PROPERTY_TO,
  ColorRange.JSON_PROPERTY_COLOR
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ColorRange {
  public static final String JSON_PROPERTY_FROM = "from";
  @Nullable
  private Double from;

  public static final String JSON_PROPERTY_TO = "to";
  @Nullable
  private Double to;

  public static final String JSON_PROPERTY_COLOR = "color";
  @Nullable
  private String color;

  public ColorRange() { 
  }

  public ColorRange from(@Nullable Double from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFrom() {
    return from;
  }


  @JsonProperty(value = JSON_PROPERTY_FROM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(@Nullable Double from) {
    this.from = from;
  }


  public ColorRange to(@Nullable Double to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTo() {
    return to;
  }


  @JsonProperty(value = JSON_PROPERTY_TO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(@Nullable Double to) {
    this.to = to;
  }


  public ColorRange color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColor() {
    return color;
  }


  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(@Nullable String color) {
    this.color = color;
  }


  /**
   * Return true if this ColorRange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorRange colorRange = (ColorRange) o;
    return Objects.equals(this.from, colorRange.from) &&
        Objects.equals(this.to, colorRange.to) &&
        Objects.equals(this.color, colorRange.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorRange {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

    // add `from` to the URL query string
    if (getFrom() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfrom%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFrom()))));
    }

    // add `to` to the URL query string
    if (getTo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sto%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTo()))));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    return joiner.toString();
  }
}

