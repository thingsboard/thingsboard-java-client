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
import org.thingsboard.client.model.AxisPosition;
import org.thingsboard.client.model.Font;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeSeriesChartYAxisSettings
 */
@JsonPropertyOrder({
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SHOW,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_LABEL,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_LABEL_FONT,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_LABEL_COLOR,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_POSITION,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SHOW_TICK_LABELS,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_TICK_LABEL_FONT,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_TICK_LABEL_COLOR,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SHOW_TICKS,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_TICKS_COLOR,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SHOW_LINE,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_LINE_COLOR,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SHOW_SPLIT_LINES,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SPLIT_LINES_COLOR,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_ID,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_ORDER,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_UNITS,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_DECIMALS,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_INTERVAL,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_SPLIT_NUMBER,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_MIN,
  TimeSeriesChartYAxisSettings.JSON_PROPERTY_MAX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TimeSeriesChartYAxisSettings {
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

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_ORDER = "order";
  @javax.annotation.Nullable
  private Integer order;

  public static final String JSON_PROPERTY_UNITS = "units";
  @javax.annotation.Nullable
  private String units;

  public static final String JSON_PROPERTY_DECIMALS = "decimals";
  @javax.annotation.Nullable
  private Integer decimals;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  @javax.annotation.Nullable
  private Double interval;

  public static final String JSON_PROPERTY_SPLIT_NUMBER = "splitNumber";
  @javax.annotation.Nullable
  private Integer splitNumber;

  public static final String JSON_PROPERTY_MIN = "min";
  @javax.annotation.Nullable
  private Double min;

  public static final String JSON_PROPERTY_MAX = "max";
  @javax.annotation.Nullable
  private Double max;

  public TimeSeriesChartYAxisSettings() { 
  }

  public TimeSeriesChartYAxisSettings show(@javax.annotation.Nullable Boolean show) {
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


  public TimeSeriesChartYAxisSettings label(@javax.annotation.Nullable String label) {
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


  public TimeSeriesChartYAxisSettings labelFont(@javax.annotation.Nullable Font labelFont) {
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


  public TimeSeriesChartYAxisSettings labelColor(@javax.annotation.Nullable String labelColor) {
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


  public TimeSeriesChartYAxisSettings position(@javax.annotation.Nullable AxisPosition position) {
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


  public TimeSeriesChartYAxisSettings showTickLabels(@javax.annotation.Nullable Boolean showTickLabels) {
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


  public TimeSeriesChartYAxisSettings tickLabelFont(@javax.annotation.Nullable Font tickLabelFont) {
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


  public TimeSeriesChartYAxisSettings tickLabelColor(@javax.annotation.Nullable String tickLabelColor) {
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


  public TimeSeriesChartYAxisSettings showTicks(@javax.annotation.Nullable Boolean showTicks) {
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


  public TimeSeriesChartYAxisSettings ticksColor(@javax.annotation.Nullable String ticksColor) {
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


  public TimeSeriesChartYAxisSettings showLine(@javax.annotation.Nullable Boolean showLine) {
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


  public TimeSeriesChartYAxisSettings lineColor(@javax.annotation.Nullable String lineColor) {
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


  public TimeSeriesChartYAxisSettings showSplitLines(@javax.annotation.Nullable Boolean showSplitLines) {
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


  public TimeSeriesChartYAxisSettings splitLinesColor(@javax.annotation.Nullable String splitLinesColor) {
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


  public TimeSeriesChartYAxisSettings id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public TimeSeriesChartYAxisSettings order(@javax.annotation.Nullable Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getOrder() {
    return order;
  }


  @JsonProperty(value = JSON_PROPERTY_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(@javax.annotation.Nullable Integer order) {
    this.order = order;
  }


  public TimeSeriesChartYAxisSettings units(@javax.annotation.Nullable String units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnits() {
    return units;
  }


  @JsonProperty(value = JSON_PROPERTY_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(@javax.annotation.Nullable String units) {
    this.units = units;
  }


  public TimeSeriesChartYAxisSettings decimals(@javax.annotation.Nullable Integer decimals) {
    this.decimals = decimals;
    return this;
  }

  /**
   * Get decimals
   * @return decimals
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDecimals() {
    return decimals;
  }


  @JsonProperty(value = JSON_PROPERTY_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecimals(@javax.annotation.Nullable Integer decimals) {
    this.decimals = decimals;
  }


  public TimeSeriesChartYAxisSettings interval(@javax.annotation.Nullable Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getInterval() {
    return interval;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(@javax.annotation.Nullable Double interval) {
    this.interval = interval;
  }


  public TimeSeriesChartYAxisSettings splitNumber(@javax.annotation.Nullable Integer splitNumber) {
    this.splitNumber = splitNumber;
    return this;
  }

  /**
   * Get splitNumber
   * @return splitNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPLIT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSplitNumber() {
    return splitNumber;
  }


  @JsonProperty(value = JSON_PROPERTY_SPLIT_NUMBER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitNumber(@javax.annotation.Nullable Integer splitNumber) {
    this.splitNumber = splitNumber;
  }


  public TimeSeriesChartYAxisSettings min(@javax.annotation.Nullable Double min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMin() {
    return min;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(@javax.annotation.Nullable Double min) {
    this.min = min;
  }


  public TimeSeriesChartYAxisSettings max(@javax.annotation.Nullable Double max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMax() {
    return max;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(@javax.annotation.Nullable Double max) {
    this.max = max;
  }


  /**
   * Return true if this TimeSeriesChartYAxisSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartYAxisSettings timeSeriesChartYAxisSettings = (TimeSeriesChartYAxisSettings) o;
    return Objects.equals(this.show, timeSeriesChartYAxisSettings.show) &&
        Objects.equals(this.label, timeSeriesChartYAxisSettings.label) &&
        Objects.equals(this.labelFont, timeSeriesChartYAxisSettings.labelFont) &&
        Objects.equals(this.labelColor, timeSeriesChartYAxisSettings.labelColor) &&
        Objects.equals(this.position, timeSeriesChartYAxisSettings.position) &&
        Objects.equals(this.showTickLabels, timeSeriesChartYAxisSettings.showTickLabels) &&
        Objects.equals(this.tickLabelFont, timeSeriesChartYAxisSettings.tickLabelFont) &&
        Objects.equals(this.tickLabelColor, timeSeriesChartYAxisSettings.tickLabelColor) &&
        Objects.equals(this.showTicks, timeSeriesChartYAxisSettings.showTicks) &&
        Objects.equals(this.ticksColor, timeSeriesChartYAxisSettings.ticksColor) &&
        Objects.equals(this.showLine, timeSeriesChartYAxisSettings.showLine) &&
        Objects.equals(this.lineColor, timeSeriesChartYAxisSettings.lineColor) &&
        Objects.equals(this.showSplitLines, timeSeriesChartYAxisSettings.showSplitLines) &&
        Objects.equals(this.splitLinesColor, timeSeriesChartYAxisSettings.splitLinesColor) &&
        Objects.equals(this.id, timeSeriesChartYAxisSettings.id) &&
        Objects.equals(this.order, timeSeriesChartYAxisSettings.order) &&
        Objects.equals(this.units, timeSeriesChartYAxisSettings.units) &&
        Objects.equals(this.decimals, timeSeriesChartYAxisSettings.decimals) &&
        Objects.equals(this.interval, timeSeriesChartYAxisSettings.interval) &&
        Objects.equals(this.splitNumber, timeSeriesChartYAxisSettings.splitNumber) &&
        Objects.equals(this.min, timeSeriesChartYAxisSettings.min) &&
        Objects.equals(this.max, timeSeriesChartYAxisSettings.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(show, label, labelFont, labelColor, position, showTickLabels, tickLabelFont, tickLabelColor, showTicks, ticksColor, showLine, lineColor, showSplitLines, splitLinesColor, id, order, units, decimals, interval, splitNumber, min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartYAxisSettings {\n");
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    splitNumber: ").append(toIndentedString(splitNumber)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `order` to the URL query string
    if (getOrder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sorder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrder()))));
    }

    // add `units` to the URL query string
    if (getUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnits()))));
    }

    // add `decimals` to the URL query string
    if (getDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDecimals()))));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInterval()))));
    }

    // add `splitNumber` to the URL query string
    if (getSplitNumber() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssplitNumber%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSplitNumber()))));
    }

    // add `min` to the URL query string
    if (getMin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMin()))));
    }

    // add `max` to the URL query string
    if (getMax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMax()))));
    }

    return joiner.toString();
  }
}

