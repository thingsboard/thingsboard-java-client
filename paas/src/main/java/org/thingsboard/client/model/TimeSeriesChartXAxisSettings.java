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
import org.thingsboard.client.model.AxisPosition;
import org.thingsboard.client.model.Font;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeSeriesChartXAxisSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SHOW,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_LABEL,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_LABEL_FONT,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_LABEL_COLOR,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_POSITION,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SHOW_TICK_LABELS,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_TICK_LABEL_FONT,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_TICK_LABEL_COLOR,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SHOW_TICKS,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_TICKS_COLOR,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SHOW_LINE,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_LINE_COLOR,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SHOW_SPLIT_LINES,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_SPLIT_LINES_COLOR,
  TimeSeriesChartXAxisSettings.JSON_PROPERTY_TICKS_FORMAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TimeSeriesChartXAxisSettings {
  public static final String JSON_PROPERTY_SHOW = "show";
  @javax.annotation.Nullable
  private Boolean show;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_LABEL_FONT = "labelFont";
  @javax.annotation.Nullable
  private Font labelFont;

  public static final String JSON_PROPERTY_LABEL_COLOR = "labelColor";
  @javax.annotation.Nullable
  private String labelColor;

  public static final String JSON_PROPERTY_POSITION = "position";
  @javax.annotation.Nullable
  private AxisPosition position;

  public static final String JSON_PROPERTY_SHOW_TICK_LABELS = "showTickLabels";
  @javax.annotation.Nullable
  private Boolean showTickLabels;

  public static final String JSON_PROPERTY_TICK_LABEL_FONT = "tickLabelFont";
  @javax.annotation.Nullable
  private Font tickLabelFont;

  public static final String JSON_PROPERTY_TICK_LABEL_COLOR = "tickLabelColor";
  @javax.annotation.Nullable
  private String tickLabelColor;

  public static final String JSON_PROPERTY_SHOW_TICKS = "showTicks";
  @javax.annotation.Nullable
  private Boolean showTicks;

  public static final String JSON_PROPERTY_TICKS_COLOR = "ticksColor";
  @javax.annotation.Nullable
  private String ticksColor;

  public static final String JSON_PROPERTY_SHOW_LINE = "showLine";
  @javax.annotation.Nullable
  private Boolean showLine;

  public static final String JSON_PROPERTY_LINE_COLOR = "lineColor";
  @javax.annotation.Nullable
  private String lineColor;

  public static final String JSON_PROPERTY_SHOW_SPLIT_LINES = "showSplitLines";
  @javax.annotation.Nullable
  private Boolean showSplitLines;

  public static final String JSON_PROPERTY_SPLIT_LINES_COLOR = "splitLinesColor";
  @javax.annotation.Nullable
  private String splitLinesColor;

  public static final String JSON_PROPERTY_TICKS_FORMAT = "ticksFormat";
  @javax.annotation.Nullable
  private Map<String, String> ticksFormat = new HashMap<>();

  public TimeSeriesChartXAxisSettings() { 
  }

  public TimeSeriesChartXAxisSettings show(@javax.annotation.Nullable Boolean show) {
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


  public TimeSeriesChartXAxisSettings label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public TimeSeriesChartXAxisSettings labelFont(@javax.annotation.Nullable Font labelFont) {
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


  public TimeSeriesChartXAxisSettings labelColor(@javax.annotation.Nullable String labelColor) {
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


  public TimeSeriesChartXAxisSettings position(@javax.annotation.Nullable AxisPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AxisPosition getPosition() {
    return position;
  }


  @JsonProperty(value = JSON_PROPERTY_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(@javax.annotation.Nullable AxisPosition position) {
    this.position = position;
  }


  public TimeSeriesChartXAxisSettings showTickLabels(@javax.annotation.Nullable Boolean showTickLabels) {
    this.showTickLabels = showTickLabels;
    return this;
  }

  /**
   * Get showTickLabels
   * @return showTickLabels
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TICK_LABELS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTickLabels() {
    return showTickLabels;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TICK_LABELS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTickLabels(@javax.annotation.Nullable Boolean showTickLabels) {
    this.showTickLabels = showTickLabels;
  }


  public TimeSeriesChartXAxisSettings tickLabelFont(@javax.annotation.Nullable Font tickLabelFont) {
    this.tickLabelFont = tickLabelFont;
    return this;
  }

  /**
   * Get tickLabelFont
   * @return tickLabelFont
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TICK_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getTickLabelFont() {
    return tickLabelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_TICK_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickLabelFont(@javax.annotation.Nullable Font tickLabelFont) {
    this.tickLabelFont = tickLabelFont;
  }


  public TimeSeriesChartXAxisSettings tickLabelColor(@javax.annotation.Nullable String tickLabelColor) {
    this.tickLabelColor = tickLabelColor;
    return this;
  }

  /**
   * Get tickLabelColor
   * @return tickLabelColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TICK_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTickLabelColor() {
    return tickLabelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_TICK_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickLabelColor(@javax.annotation.Nullable String tickLabelColor) {
    this.tickLabelColor = tickLabelColor;
  }


  public TimeSeriesChartXAxisSettings showTicks(@javax.annotation.Nullable Boolean showTicks) {
    this.showTicks = showTicks;
    return this;
  }

  /**
   * Get showTicks
   * @return showTicks
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TICKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTicks() {
    return showTicks;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TICKS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTicks(@javax.annotation.Nullable Boolean showTicks) {
    this.showTicks = showTicks;
  }


  public TimeSeriesChartXAxisSettings ticksColor(@javax.annotation.Nullable String ticksColor) {
    this.ticksColor = ticksColor;
    return this;
  }

  /**
   * Get ticksColor
   * @return ticksColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TICKS_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTicksColor() {
    return ticksColor;
  }


  @JsonProperty(value = JSON_PROPERTY_TICKS_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicksColor(@javax.annotation.Nullable String ticksColor) {
    this.ticksColor = ticksColor;
  }


  public TimeSeriesChartXAxisSettings showLine(@javax.annotation.Nullable Boolean showLine) {
    this.showLine = showLine;
    return this;
  }

  /**
   * Get showLine
   * @return showLine
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_LINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLine() {
    return showLine;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_LINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLine(@javax.annotation.Nullable Boolean showLine) {
    this.showLine = showLine;
  }


  public TimeSeriesChartXAxisSettings lineColor(@javax.annotation.Nullable String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

  /**
   * Get lineColor
   * @return lineColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLineColor() {
    return lineColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineColor(@javax.annotation.Nullable String lineColor) {
    this.lineColor = lineColor;
  }


  public TimeSeriesChartXAxisSettings showSplitLines(@javax.annotation.Nullable Boolean showSplitLines) {
    this.showSplitLines = showSplitLines;
    return this;
  }

  /**
   * Get showSplitLines
   * @return showSplitLines
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_SPLIT_LINES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowSplitLines() {
    return showSplitLines;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_SPLIT_LINES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowSplitLines(@javax.annotation.Nullable Boolean showSplitLines) {
    this.showSplitLines = showSplitLines;
  }


  public TimeSeriesChartXAxisSettings splitLinesColor(@javax.annotation.Nullable String splitLinesColor) {
    this.splitLinesColor = splitLinesColor;
    return this;
  }

  /**
   * Get splitLinesColor
   * @return splitLinesColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPLIT_LINES_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSplitLinesColor() {
    return splitLinesColor;
  }


  @JsonProperty(value = JSON_PROPERTY_SPLIT_LINES_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitLinesColor(@javax.annotation.Nullable String splitLinesColor) {
    this.splitLinesColor = splitLinesColor;
  }


  public TimeSeriesChartXAxisSettings ticksFormat(@javax.annotation.Nullable Map<String, String> ticksFormat) {
    this.ticksFormat = ticksFormat;
    return this;
  }

  public TimeSeriesChartXAxisSettings putTicksFormatItem(String key, String ticksFormatItem) {
    if (this.ticksFormat == null) {
      this.ticksFormat = new HashMap<>();
    }
    this.ticksFormat.put(key, ticksFormatItem);
    return this;
  }

  /**
   * Get ticksFormat
   * @return ticksFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TICKS_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTicksFormat() {
    return ticksFormat;
  }


  @JsonProperty(value = JSON_PROPERTY_TICKS_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicksFormat(@javax.annotation.Nullable Map<String, String> ticksFormat) {
    this.ticksFormat = ticksFormat;
  }


  /**
   * Return true if this TimeSeriesChartXAxisSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartXAxisSettings timeSeriesChartXAxisSettings = (TimeSeriesChartXAxisSettings) o;
    return Objects.equals(this.show, timeSeriesChartXAxisSettings.show) &&
        Objects.equals(this.label, timeSeriesChartXAxisSettings.label) &&
        Objects.equals(this.labelFont, timeSeriesChartXAxisSettings.labelFont) &&
        Objects.equals(this.labelColor, timeSeriesChartXAxisSettings.labelColor) &&
        Objects.equals(this.position, timeSeriesChartXAxisSettings.position) &&
        Objects.equals(this.showTickLabels, timeSeriesChartXAxisSettings.showTickLabels) &&
        Objects.equals(this.tickLabelFont, timeSeriesChartXAxisSettings.tickLabelFont) &&
        Objects.equals(this.tickLabelColor, timeSeriesChartXAxisSettings.tickLabelColor) &&
        Objects.equals(this.showTicks, timeSeriesChartXAxisSettings.showTicks) &&
        Objects.equals(this.ticksColor, timeSeriesChartXAxisSettings.ticksColor) &&
        Objects.equals(this.showLine, timeSeriesChartXAxisSettings.showLine) &&
        Objects.equals(this.lineColor, timeSeriesChartXAxisSettings.lineColor) &&
        Objects.equals(this.showSplitLines, timeSeriesChartXAxisSettings.showSplitLines) &&
        Objects.equals(this.splitLinesColor, timeSeriesChartXAxisSettings.splitLinesColor) &&
        Objects.equals(this.ticksFormat, timeSeriesChartXAxisSettings.ticksFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(show, label, labelFont, labelColor, position, showTickLabels, tickLabelFont, tickLabelColor, showTicks, ticksColor, showLine, lineColor, showSplitLines, splitLinesColor, ticksFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartXAxisSettings {\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelFont: ").append(toIndentedString(labelFont)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    showTickLabels: ").append(toIndentedString(showTickLabels)).append("\n");
    sb.append("    tickLabelFont: ").append(toIndentedString(tickLabelFont)).append("\n");
    sb.append("    tickLabelColor: ").append(toIndentedString(tickLabelColor)).append("\n");
    sb.append("    showTicks: ").append(toIndentedString(showTicks)).append("\n");
    sb.append("    ticksColor: ").append(toIndentedString(ticksColor)).append("\n");
    sb.append("    showLine: ").append(toIndentedString(showLine)).append("\n");
    sb.append("    lineColor: ").append(toIndentedString(lineColor)).append("\n");
    sb.append("    showSplitLines: ").append(toIndentedString(showSplitLines)).append("\n");
    sb.append("    splitLinesColor: ").append(toIndentedString(splitLinesColor)).append("\n");
    sb.append("    ticksFormat: ").append(toIndentedString(ticksFormat)).append("\n");
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

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `labelFont` to the URL query string
    if (getLabelFont() != null) {
      joiner.add(getLabelFont().toUrlQueryString(prefix + "labelFont" + suffix));
    }

    // add `labelColor` to the URL query string
    if (getLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabelColor()))));
    }

    // add `position` to the URL query string
    if (getPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sposition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPosition()))));
    }

    // add `showTickLabels` to the URL query string
    if (getShowTickLabels() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTickLabels%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTickLabels()))));
    }

    // add `tickLabelFont` to the URL query string
    if (getTickLabelFont() != null) {
      joiner.add(getTickLabelFont().toUrlQueryString(prefix + "tickLabelFont" + suffix));
    }

    // add `tickLabelColor` to the URL query string
    if (getTickLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stickLabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTickLabelColor()))));
    }

    // add `showTicks` to the URL query string
    if (getShowTicks() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTicks%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTicks()))));
    }

    // add `ticksColor` to the URL query string
    if (getTicksColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sticksColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTicksColor()))));
    }

    // add `showLine` to the URL query string
    if (getShowLine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLine%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLine()))));
    }

    // add `lineColor` to the URL query string
    if (getLineColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineColor()))));
    }

    // add `showSplitLines` to the URL query string
    if (getShowSplitLines() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowSplitLines%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowSplitLines()))));
    }

    // add `splitLinesColor` to the URL query string
    if (getSplitLinesColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssplitLinesColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSplitLinesColor()))));
    }

    // add `ticksFormat` to the URL query string
    if (getTicksFormat() != null) {
      for (String _key : getTicksFormat().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sticksFormat%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getTicksFormat().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getTicksFormat().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

