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
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.TextAlignment;
import org.thingsboard.client.model.VerticalAlignment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CellSettings
 */
@JsonPropertyOrder({
  CellSettings.JSON_PROPERTY_FONT,
  CellSettings.JSON_PROPERTY_COLOR,
  CellSettings.JSON_PROPERTY_BACKGROUND_COLOR,
  CellSettings.JSON_PROPERTY_TEXT_ALIGNMENT,
  CellSettings.JSON_PROPERTY_VERTICAL_ALIGNMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class CellSettings {
  public static final String JSON_PROPERTY_FONT = "font";
  @javax.annotation.Nullable
  private Font font;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private String color;

  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
  @javax.annotation.Nullable
  private String backgroundColor;

  public static final String JSON_PROPERTY_TEXT_ALIGNMENT = "textAlignment";
  @javax.annotation.Nullable
  private TextAlignment textAlignment;

  public static final String JSON_PROPERTY_VERTICAL_ALIGNMENT = "verticalAlignment";
  @javax.annotation.Nullable
  private VerticalAlignment verticalAlignment;

  public CellSettings() { 
  }

  public CellSettings font(@javax.annotation.Nullable Font font) {
    this.font = font;
    return this;
  }

  /**
   * Get font
   * @return font
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getFont() {
    return font;
  }


  @JsonProperty(value = JSON_PROPERTY_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFont(@javax.annotation.Nullable Font font) {
    this.font = font;
  }


  public CellSettings color(@javax.annotation.Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColor() {
    return color;
  }


  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(@javax.annotation.Nullable String color) {
    this.color = color;
  }


  public CellSettings backgroundColor(@javax.annotation.Nullable String backgroundColor) {
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


  public CellSettings textAlignment(@javax.annotation.Nullable TextAlignment textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

  /**
   * Get textAlignment
   * @return textAlignment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TextAlignment getTextAlignment() {
    return textAlignment;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextAlignment(@javax.annotation.Nullable TextAlignment textAlignment) {
    this.textAlignment = textAlignment;
  }


  public CellSettings verticalAlignment(@javax.annotation.Nullable VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

  /**
   * Get verticalAlignment
   * @return verticalAlignment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERTICAL_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }


  @JsonProperty(value = JSON_PROPERTY_VERTICAL_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerticalAlignment(@javax.annotation.Nullable VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }


  /**
   * Return true if this CellSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellSettings cellSettings = (CellSettings) o;
    return Objects.equals(this.font, cellSettings.font) &&
        Objects.equals(this.color, cellSettings.color) &&
        Objects.equals(this.backgroundColor, cellSettings.backgroundColor) &&
        Objects.equals(this.textAlignment, cellSettings.textAlignment) &&
        Objects.equals(this.verticalAlignment, cellSettings.verticalAlignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, color, backgroundColor, textAlignment, verticalAlignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellSettings {\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
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

    // add `font` to the URL query string
    if (getFont() != null) {
      joiner.add(getFont().toUrlQueryString(prefix + "font" + suffix));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    // add `backgroundColor` to the URL query string
    if (getBackgroundColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbackgroundColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBackgroundColor()))));
    }

    // add `textAlignment` to the URL query string
    if (getTextAlignment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stextAlignment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTextAlignment()))));
    }

    // add `verticalAlignment` to the URL query string
    if (getVerticalAlignment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sverticalAlignment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVerticalAlignment()))));
    }

    return joiner.toString();
  }
}

