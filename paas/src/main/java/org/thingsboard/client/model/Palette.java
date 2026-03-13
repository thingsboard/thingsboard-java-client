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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Palette
 */
@JsonPropertyOrder({
  Palette.JSON_PROPERTY_TYPE,
  Palette.JSON_PROPERTY_EXTENDS,
  Palette.JSON_PROPERTY_COLORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Palette {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_EXTENDS = "extends";
  @javax.annotation.Nullable
  private String _extends;

  public static final String JSON_PROPERTY_COLORS = "colors";
  @javax.annotation.Nullable
  private Map<String, String> colors = new HashMap<>();

  public Palette() { 
  }

  public Palette type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Name of the pre-defined palette, or &#39;custom&#39;
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public Palette _extends(@javax.annotation.Nullable String _extends) {
    this._extends = _extends;
    return this;
  }

  /**
   * Pre-defined palette name that the custom palette extends
   * @return _extends
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtends() {
    return _extends;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTENDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtends(@javax.annotation.Nullable String _extends) {
    this._extends = _extends;
  }


  public Palette colors(@javax.annotation.Nullable Map<String, String> colors) {
    this.colors = colors;
    return this;
  }

  public Palette putColorsItem(String key, String colorsItem) {
    if (this.colors == null) {
      this.colors = new HashMap<>();
    }
    this.colors.put(key, colorsItem);
    return this;
  }

  /**
   * Mapping of hue identifier number to the rgb(a) color code
   * @return colors
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COLORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getColors() {
    return colors;
  }


  @JsonProperty(value = JSON_PROPERTY_COLORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColors(@javax.annotation.Nullable Map<String, String> colors) {
    this.colors = colors;
  }


  /**
   * Return true if this Palette object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Palette palette = (Palette) o;
    return Objects.equals(this.type, palette.type) &&
        Objects.equals(this._extends, palette._extends) &&
        Objects.equals(this.colors, palette.colors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _extends, colors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Palette {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _extends: ").append(toIndentedString(_extends)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
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

    // add `extends` to the URL query string
    if (getExtends() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextends%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtends()))));
    }

    // add `colors` to the URL query string
    if (getColors() != null) {
      for (String _key : getColors().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scolors%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getColors().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getColors().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

