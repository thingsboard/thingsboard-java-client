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
import org.thingsboard.client.model.FontStyle;
import org.thingsboard.client.model.FontWeight;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Font
 */
@JsonPropertyOrder({
  Font.JSON_PROPERTY_SIZE,
  Font.JSON_PROPERTY_WEIGHT,
  Font.JSON_PROPERTY_STYLE,
  Font.JSON_PROPERTY_FAMILY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Font {
  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable
  private Float size;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  @javax.annotation.Nullable
  private FontWeight weight;

  public static final String JSON_PROPERTY_STYLE = "style";
  @javax.annotation.Nullable
  private FontStyle style;

  public static final String JSON_PROPERTY_FAMILY = "family";
  @javax.annotation.Nullable
  private String family;

  public Font() { 
  }

  public Font size(@javax.annotation.Nullable Float size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getSize() {
    return size;
  }


  @JsonProperty(value = JSON_PROPERTY_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(@javax.annotation.Nullable Float size) {
    this.size = size;
  }


  public Font weight(@javax.annotation.Nullable FontWeight weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FontWeight getWeight() {
    return weight;
  }


  @JsonProperty(value = JSON_PROPERTY_WEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(@javax.annotation.Nullable FontWeight weight) {
    this.weight = weight;
  }


  public Font style(@javax.annotation.Nullable FontStyle style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FontStyle getStyle() {
    return style;
  }


  @JsonProperty(value = JSON_PROPERTY_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(@javax.annotation.Nullable FontStyle style) {
    this.style = style;
  }


  public Font family(@javax.annotation.Nullable String family) {
    this.family = family;
    return this;
  }

  /**
   * Get family
   * @return family
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FAMILY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamily() {
    return family;
  }


  @JsonProperty(value = JSON_PROPERTY_FAMILY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamily(@javax.annotation.Nullable String family) {
    this.family = family;
  }


  /**
   * Return true if this Font object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Font font = (Font) o;
    return Objects.equals(this.size, font.size) &&
        Objects.equals(this.weight, font.weight) &&
        Objects.equals(this.style, font.style) &&
        Objects.equals(this.family, font.family);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, weight, style, family);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
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

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSize()))));
    }

    // add `weight` to the URL query string
    if (getWeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sweight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWeight()))));
    }

    // add `style` to the URL query string
    if (getStyle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstyle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStyle()))));
    }

    // add `family` to the URL query string
    if (getFamily() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfamily%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFamily()))));
    }

    return joiner.toString();
  }
}

