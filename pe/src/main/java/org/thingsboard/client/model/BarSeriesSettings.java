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
import org.thingsboard.client.model.ChartFillSettings;
import org.thingsboard.client.model.ChartLabelPosition;
import org.thingsboard.client.model.Font;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BarSeriesSettings
 */
@JsonPropertyOrder({
  BarSeriesSettings.JSON_PROPERTY_SHOW_BORDER,
  BarSeriesSettings.JSON_PROPERTY_BORDER_WIDTH,
  BarSeriesSettings.JSON_PROPERTY_BORDER_RADIUS,
  BarSeriesSettings.JSON_PROPERTY_BAR_WIDTH,
  BarSeriesSettings.JSON_PROPERTY_SHOW_LABEL,
  BarSeriesSettings.JSON_PROPERTY_LABEL_POSITION,
  BarSeriesSettings.JSON_PROPERTY_LABEL_FONT,
  BarSeriesSettings.JSON_PROPERTY_LABEL_COLOR,
  BarSeriesSettings.JSON_PROPERTY_ENABLE_LABEL_BACKGROUND,
  BarSeriesSettings.JSON_PROPERTY_LABEL_BACKGROUND,
  BarSeriesSettings.JSON_PROPERTY_BACKGROUND_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class BarSeriesSettings {
  public static final String JSON_PROPERTY_SHOW_BORDER = "showBorder";
  @javax.annotation.Nullable
  private Boolean showBorder;

  public static final String JSON_PROPERTY_BORDER_WIDTH = "borderWidth";
  @javax.annotation.Nullable
  private Float borderWidth;

  public static final String JSON_PROPERTY_BORDER_RADIUS = "borderRadius";
  @javax.annotation.Nullable
  private Float borderRadius;

  public static final String JSON_PROPERTY_BAR_WIDTH = "barWidth";
  @javax.annotation.Nullable
  private Double barWidth;

  public static final String JSON_PROPERTY_SHOW_LABEL = "showLabel";
  @javax.annotation.Nullable
  private Boolean showLabel;

  public static final String JSON_PROPERTY_LABEL_POSITION = "labelPosition";
  @javax.annotation.Nullable
  private ChartLabelPosition labelPosition;

  public static final String JSON_PROPERTY_LABEL_FONT = "labelFont";
  @javax.annotation.Nullable
  private Font labelFont;

  public static final String JSON_PROPERTY_LABEL_COLOR = "labelColor";
  @javax.annotation.Nullable
  private String labelColor;

  public static final String JSON_PROPERTY_ENABLE_LABEL_BACKGROUND = "enableLabelBackground";
  @javax.annotation.Nullable
  private Boolean enableLabelBackground;

  public static final String JSON_PROPERTY_LABEL_BACKGROUND = "labelBackground";
  @javax.annotation.Nullable
  private String labelBackground;

  public static final String JSON_PROPERTY_BACKGROUND_SETTINGS = "backgroundSettings";
  @javax.annotation.Nullable
  private ChartFillSettings backgroundSettings;

  public BarSeriesSettings() { 
  }

  public BarSeriesSettings showBorder(@javax.annotation.Nullable Boolean showBorder) {
    this.showBorder = showBorder;
    return this;
  }

  /**
   * Get showBorder
   * @return showBorder
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_BORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowBorder() {
    return showBorder;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_BORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowBorder(@javax.annotation.Nullable Boolean showBorder) {
    this.showBorder = showBorder;
  }


  public BarSeriesSettings borderWidth(@javax.annotation.Nullable Float borderWidth) {
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


  public BarSeriesSettings borderRadius(@javax.annotation.Nullable Float borderRadius) {
    this.borderRadius = borderRadius;
    return this;
  }

  /**
   * Get borderRadius
   * @return borderRadius
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BORDER_RADIUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getBorderRadius() {
    return borderRadius;
  }


  @JsonProperty(value = JSON_PROPERTY_BORDER_RADIUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderRadius(@javax.annotation.Nullable Float borderRadius) {
    this.borderRadius = borderRadius;
  }


  public BarSeriesSettings barWidth(@javax.annotation.Nullable Double barWidth) {
    this.barWidth = barWidth;
    return this;
  }

  /**
   * Get barWidth
   * @return barWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBarWidth() {
    return barWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarWidth(@javax.annotation.Nullable Double barWidth) {
    this.barWidth = barWidth;
  }


  public BarSeriesSettings showLabel(@javax.annotation.Nullable Boolean showLabel) {
    this.showLabel = showLabel;
    return this;
  }

  /**
   * Get showLabel
   * @return showLabel
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLabel() {
    return showLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLabel(@javax.annotation.Nullable Boolean showLabel) {
    this.showLabel = showLabel;
  }


  public BarSeriesSettings labelPosition(@javax.annotation.Nullable ChartLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
    return this;
  }

  /**
   * Get labelPosition
   * @return labelPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartLabelPosition getLabelPosition() {
    return labelPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelPosition(@javax.annotation.Nullable ChartLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }


  public BarSeriesSettings labelFont(@javax.annotation.Nullable Font labelFont) {
    this.labelFont = labelFont;
    return this;
  }

  /**
   * Get labelFont
   * @return labelFont
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getLabelFont() {
    return labelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelFont(@javax.annotation.Nullable Font labelFont) {
    this.labelFont = labelFont;
  }


  public BarSeriesSettings labelColor(@javax.annotation.Nullable String labelColor) {
    this.labelColor = labelColor;
    return this;
  }

  /**
   * Get labelColor
   * @return labelColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabelColor() {
    return labelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelColor(@javax.annotation.Nullable String labelColor) {
    this.labelColor = labelColor;
  }


  public BarSeriesSettings enableLabelBackground(@javax.annotation.Nullable Boolean enableLabelBackground) {
    this.enableLabelBackground = enableLabelBackground;
    return this;
  }

  /**
   * Get enableLabelBackground
   * @return enableLabelBackground
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLE_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableLabelBackground() {
    return enableLabelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableLabelBackground(@javax.annotation.Nullable Boolean enableLabelBackground) {
    this.enableLabelBackground = enableLabelBackground;
  }


  public BarSeriesSettings labelBackground(@javax.annotation.Nullable String labelBackground) {
    this.labelBackground = labelBackground;
    return this;
  }

  /**
   * Get labelBackground
   * @return labelBackground
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabelBackground() {
    return labelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelBackground(@javax.annotation.Nullable String labelBackground) {
    this.labelBackground = labelBackground;
  }


  public BarSeriesSettings backgroundSettings(@javax.annotation.Nullable ChartFillSettings backgroundSettings) {
    this.backgroundSettings = backgroundSettings;
    return this;
  }

  /**
   * Get backgroundSettings
   * @return backgroundSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartFillSettings getBackgroundSettings() {
    return backgroundSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_BACKGROUND_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackgroundSettings(@javax.annotation.Nullable ChartFillSettings backgroundSettings) {
    this.backgroundSettings = backgroundSettings;
  }


  /**
   * Return true if this BarSeriesSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarSeriesSettings barSeriesSettings = (BarSeriesSettings) o;
    return Objects.equals(this.showBorder, barSeriesSettings.showBorder) &&
        Objects.equals(this.borderWidth, barSeriesSettings.borderWidth) &&
        Objects.equals(this.borderRadius, barSeriesSettings.borderRadius) &&
        Objects.equals(this.barWidth, barSeriesSettings.barWidth) &&
        Objects.equals(this.showLabel, barSeriesSettings.showLabel) &&
        Objects.equals(this.labelPosition, barSeriesSettings.labelPosition) &&
        Objects.equals(this.labelFont, barSeriesSettings.labelFont) &&
        Objects.equals(this.labelColor, barSeriesSettings.labelColor) &&
        Objects.equals(this.enableLabelBackground, barSeriesSettings.enableLabelBackground) &&
        Objects.equals(this.labelBackground, barSeriesSettings.labelBackground) &&
        Objects.equals(this.backgroundSettings, barSeriesSettings.backgroundSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showBorder, borderWidth, borderRadius, barWidth, showLabel, labelPosition, labelFont, labelColor, enableLabelBackground, labelBackground, backgroundSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarSeriesSettings {\n");
    sb.append("    showBorder: ").append(toIndentedString(showBorder)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    borderRadius: ").append(toIndentedString(borderRadius)).append("\n");
    sb.append("    barWidth: ").append(toIndentedString(barWidth)).append("\n");
    sb.append("    showLabel: ").append(toIndentedString(showLabel)).append("\n");
    sb.append("    labelPosition: ").append(toIndentedString(labelPosition)).append("\n");
    sb.append("    labelFont: ").append(toIndentedString(labelFont)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
    sb.append("    enableLabelBackground: ").append(toIndentedString(enableLabelBackground)).append("\n");
    sb.append("    labelBackground: ").append(toIndentedString(labelBackground)).append("\n");
    sb.append("    backgroundSettings: ").append(toIndentedString(backgroundSettings)).append("\n");
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

    // add `showBorder` to the URL query string
    if (getShowBorder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowBorder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowBorder()))));
    }

    // add `borderWidth` to the URL query string
    if (getBorderWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderWidth()))));
    }

    // add `borderRadius` to the URL query string
    if (getBorderRadius() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sborderRadius%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBorderRadius()))));
    }

    // add `barWidth` to the URL query string
    if (getBarWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarWidth()))));
    }

    // add `showLabel` to the URL query string
    if (getShowLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLabel()))));
    }

    // add `labelPosition` to the URL query string
    if (getLabelPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabelPosition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabelPosition()))));
    }

    // add `labelFont` to the URL query string
    if (getLabelFont() != null) {
      joiner.add(getLabelFont().toUrlQueryString(prefix + "labelFont" + suffix));
    }

    // add `labelColor` to the URL query string
    if (getLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabelColor()))));
    }

    // add `enableLabelBackground` to the URL query string
    if (getEnableLabelBackground() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senableLabelBackground%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnableLabelBackground()))));
    }

    // add `labelBackground` to the URL query string
    if (getLabelBackground() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabelBackground%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabelBackground()))));
    }

    // add `backgroundSettings` to the URL query string
    if (getBackgroundSettings() != null) {
      joiner.add(getBackgroundSettings().toUrlQueryString(prefix + "backgroundSettings" + suffix));
    }

    return joiner.toString();
  }
}

