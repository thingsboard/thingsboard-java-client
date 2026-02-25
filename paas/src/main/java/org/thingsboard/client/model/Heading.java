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
 * Heading
 */
@JsonPropertyOrder({
  Heading.JSON_PROPERTY_TEXT,
  Heading.JSON_PROPERTY_FONT,
  Heading.JSON_PROPERTY_COLOR,
  Heading.JSON_PROPERTY_TEXT_ALIGNMENT,
  Heading.JSON_PROPERTY_VERTICAL_ALIGNMENT,
  Heading.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Heading {
  public static final String JSON_PROPERTY_TEXT = "text";
  @javax.annotation.Nullable
  private String text;

  public static final String JSON_PROPERTY_FONT = "font";
  @javax.annotation.Nullable
  private Font font;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private String color;

  public static final String JSON_PROPERTY_TEXT_ALIGNMENT = "textAlignment";
  @javax.annotation.Nullable
  private TextAlignment textAlignment;

  public static final String JSON_PROPERTY_VERTICAL_ALIGNMENT = "verticalAlignment";
  @javax.annotation.Nullable
  private VerticalAlignment verticalAlignment;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @javax.annotation.Nullable
  private Integer height;

  public Heading() { 
  }

  public Heading text(@javax.annotation.Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }


  public Heading font(@javax.annotation.Nullable Font font) {
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


  public Heading color(@javax.annotation.Nullable String color) {
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


  public Heading textAlignment(@javax.annotation.Nullable TextAlignment textAlignment) {
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


  public Heading verticalAlignment(@javax.annotation.Nullable VerticalAlignment verticalAlignment) {
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


  public Heading height(@javax.annotation.Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHeight() {
    return height;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = height;
  }


  /**
   * Return true if this Heading object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Heading heading = (Heading) o;
    return Objects.equals(this.text, heading.text) &&
        Objects.equals(this.font, heading.font) &&
        Objects.equals(this.color, heading.color) &&
        Objects.equals(this.textAlignment, heading.textAlignment) &&
        Objects.equals(this.verticalAlignment, heading.verticalAlignment) &&
        Objects.equals(this.height, heading.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, font, color, textAlignment, verticalAlignment, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Heading {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

    // add `text` to the URL query string
    if (getText() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getText()))));
    }

    // add `font` to the URL query string
    if (getFont() != null) {
      joiner.add(getFont().toUrlQueryString(prefix + "font" + suffix));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    // add `textAlignment` to the URL query string
    if (getTextAlignment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stextAlignment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTextAlignment()))));
    }

    // add `verticalAlignment` to the URL query string
    if (getVerticalAlignment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sverticalAlignment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVerticalAlignment()))));
    }

    // add `height` to the URL query string
    if (getHeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeight()))));
    }

    return joiner.toString();
  }
}

