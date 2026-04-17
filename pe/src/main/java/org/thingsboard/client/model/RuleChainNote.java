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
 * RuleChainNote
 */
@JsonPropertyOrder({
  RuleChainNote.JSON_PROPERTY_ID,
  RuleChainNote.JSON_PROPERTY_X,
  RuleChainNote.JSON_PROPERTY_Y,
  RuleChainNote.JSON_PROPERTY_WIDTH,
  RuleChainNote.JSON_PROPERTY_HEIGHT,
  RuleChainNote.JSON_PROPERTY_CONTENT,
  RuleChainNote.JSON_PROPERTY_BACKGROUND_COLOR,
  RuleChainNote.JSON_PROPERTY_BORDER_COLOR,
  RuleChainNote.JSON_PROPERTY_BORDER_WIDTH,
  RuleChainNote.JSON_PROPERTY_APPLY_DEFAULT_MARKDOWN_STYLE,
  RuleChainNote.JSON_PROPERTY_MARKDOWN_CSS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RuleChainNote {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private String id;

  public static final String JSON_PROPERTY_X = "x";
  @Nullable
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  @Nullable
  private Integer y;

  public static final String JSON_PROPERTY_WIDTH = "width";
  @Nullable
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  @Nullable
  private Integer height;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @Nullable
  private String content;

  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
  @Nullable
  private String backgroundColor;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  @Nullable
  private String borderColor;

  public static final String JSON_PROPERTY_BORDER_WIDTH = "borderWidth";
  @Nullable
  private Integer borderWidth;

  public static final String JSON_PROPERTY_APPLY_DEFAULT_MARKDOWN_STYLE = "applyDefaultMarkdownStyle";
  @Nullable
  private Boolean applyDefaultMarkdownStyle;

  public static final String JSON_PROPERTY_MARKDOWN_CSS = "markdownCss";
  @Nullable
  private String markdownCss;

  public RuleChainNote() { 
  }

  public RuleChainNote id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the note on the canvas
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable String id) {
    this.id = id;
  }


  public RuleChainNote x(@Nullable Integer x) {
    this.x = x;
    return this;
  }

  /**
   * Horizontal position of the note on the canvas, in pixels
   * @return x
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getX() {
    return x;
  }


  @JsonProperty(value = JSON_PROPERTY_X, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(@Nullable Integer x) {
    this.x = x;
  }


  public RuleChainNote y(@Nullable Integer y) {
    this.y = y;
    return this;
  }

  /**
   * Vertical position of the note on the canvas, in pixels
   * @return y
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_Y, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getY() {
    return y;
  }


  @JsonProperty(value = JSON_PROPERTY_Y, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(@Nullable Integer y) {
    this.y = y;
  }


  public RuleChainNote width(@Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the note, in pixels
   * @return width
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getWidth() {
    return width;
  }


  @JsonProperty(value = JSON_PROPERTY_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(@Nullable Integer width) {
    this.width = width;
  }


  public RuleChainNote height(@Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the note, in pixels
   * @return height
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHeight() {
    return height;
  }


  @JsonProperty(value = JSON_PROPERTY_HEIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(@Nullable Integer height) {
    this.height = height;
  }


  public RuleChainNote content(@Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * Markdown or HTML content of the note
   * @return content
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContent() {
    return content;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@Nullable String content) {
    this.content = content;
  }


  public RuleChainNote backgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Background color of the note in CSS hex format, e.g. &#39;#FFF9C4&#39;
   * @return backgroundColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundColor(@Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public RuleChainNote borderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Border color of the note in CSS hex format, e.g. &#39;#E6C800&#39;
   * @return borderColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BORDER_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BORDER_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(@Nullable String borderColor) {
    this.borderColor = borderColor;
  }


  public RuleChainNote borderWidth(@Nullable Integer borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Border width of the note in pixels
   * @return borderWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBorderWidth() {
    return borderWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderWidth(@Nullable Integer borderWidth) {
    this.borderWidth = borderWidth;
  }


  public RuleChainNote applyDefaultMarkdownStyle(@Nullable Boolean applyDefaultMarkdownStyle) {
    this.applyDefaultMarkdownStyle = applyDefaultMarkdownStyle;
    return this;
  }

  /**
   * Whether to apply the default markdown stylesheet to the note content
   * @return applyDefaultMarkdownStyle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLY_DEFAULT_MARKDOWN_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getApplyDefaultMarkdownStyle() {
    return applyDefaultMarkdownStyle;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLY_DEFAULT_MARKDOWN_STYLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyDefaultMarkdownStyle(@Nullable Boolean applyDefaultMarkdownStyle) {
    this.applyDefaultMarkdownStyle = applyDefaultMarkdownStyle;
  }


  public RuleChainNote markdownCss(@Nullable String markdownCss) {
    this.markdownCss = markdownCss;
    return this;
  }

  /**
   * Custom CSS styles applied to the note content
   * @return markdownCss
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MARKDOWN_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMarkdownCss() {
    return markdownCss;
  }


  @JsonProperty(value = JSON_PROPERTY_MARKDOWN_CSS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkdownCss(@Nullable String markdownCss) {
    this.markdownCss = markdownCss;
  }


  /**
   * Return true if this RuleChainNote object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChainNote ruleChainNote = (RuleChainNote) o;
    return Objects.equals(this.id, ruleChainNote.id) &&
        Objects.equals(this.x, ruleChainNote.x) &&
        Objects.equals(this.y, ruleChainNote.y) &&
        Objects.equals(this.width, ruleChainNote.width) &&
        Objects.equals(this.height, ruleChainNote.height) &&
        Objects.equals(this.content, ruleChainNote.content) &&
        Objects.equals(this.backgroundColor, ruleChainNote.backgroundColor) &&
        Objects.equals(this.borderColor, ruleChainNote.borderColor) &&
        Objects.equals(this.borderWidth, ruleChainNote.borderWidth) &&
        Objects.equals(this.applyDefaultMarkdownStyle, ruleChainNote.applyDefaultMarkdownStyle) &&
        Objects.equals(this.markdownCss, ruleChainNote.markdownCss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, x, y, width, height, content, backgroundColor, borderColor, borderWidth, applyDefaultMarkdownStyle, markdownCss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChainNote {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    applyDefaultMarkdownStyle: ").append(toIndentedString(applyDefaultMarkdownStyle)).append("\n");
    sb.append("    markdownCss: ").append(toIndentedString(markdownCss)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `x` to the URL query string
    if (getX() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sx%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getX()))));
    }

    // add `y` to the URL query string
    if (getY() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getY()))));
    }

    // add `width` to the URL query string
    if (getWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWidth()))));
    }

    // add `height` to the URL query string
    if (getHeight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheight%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeight()))));
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontent%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContent()))));
    }

    // add `backgroundColor` to the URL query string
    if (getBackgroundColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbackgroundColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBackgroundColor()))));
    }

    // add `borderColor` to the URL query string
    if (getBorderColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderColor()))));
    }

    // add `borderWidth` to the URL query string
    if (getBorderWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderWidth()))));
    }

    // add `applyDefaultMarkdownStyle` to the URL query string
    if (getApplyDefaultMarkdownStyle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapplyDefaultMarkdownStyle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApplyDefaultMarkdownStyle()))));
    }

    // add `markdownCss` to the URL query string
    if (getMarkdownCss() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smarkdownCss%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMarkdownCss()))));
    }

    return joiner.toString();
  }
}

