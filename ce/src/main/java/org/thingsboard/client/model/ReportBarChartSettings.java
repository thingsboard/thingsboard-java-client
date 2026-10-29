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
import org.thingsboard.client.model.BarSeriesSettings;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.LegendPosition;
import org.thingsboard.client.model.TextAlignment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ReportBarChartSettings
 */
@JsonPropertyOrder({
  ReportBarChartSettings.JSON_PROPERTY_SHOW_TITLE,
  ReportBarChartSettings.JSON_PROPERTY_TITLE,
  ReportBarChartSettings.JSON_PROPERTY_TITLE_FONT,
  ReportBarChartSettings.JSON_PROPERTY_TITLE_COLOR,
  ReportBarChartSettings.JSON_PROPERTY_TITLE_ALIGNMENT,
  ReportBarChartSettings.JSON_PROPERTY_UNITS,
  ReportBarChartSettings.JSON_PROPERTY_DECIMALS,
  ReportBarChartSettings.JSON_PROPERTY_AUTO_SCALE,
  ReportBarChartSettings.JSON_PROPERTY_SORT_SERIES,
  ReportBarChartSettings.JSON_PROPERTY_SHOW_TOTAL,
  ReportBarChartSettings.JSON_PROPERTY_SHOW_LEGEND,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_POSITION,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_LABEL_FONT,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_LABEL_COLOR,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_VALUE_FONT,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_VALUE_COLOR,
  ReportBarChartSettings.JSON_PROPERTY_LEGEND_SHOW_TOTAL,
  ReportBarChartSettings.JSON_PROPERTY_AXIS_MIN,
  ReportBarChartSettings.JSON_PROPERTY_AXIS_MAX,
  ReportBarChartSettings.JSON_PROPERTY_AXIS_TICK_LABEL_FONT,
  ReportBarChartSettings.JSON_PROPERTY_AXIS_TICK_LABEL_COLOR,
  ReportBarChartSettings.JSON_PROPERTY_BAR_SETTINGS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReportBarChartSettings {
  public static final String JSON_PROPERTY_SHOW_TITLE = "showTitle";
  @Nullable
  private Boolean showTitle;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nullable
  private String title;

  public static final String JSON_PROPERTY_TITLE_FONT = "titleFont";
  @Nullable
  private Font titleFont;

  public static final String JSON_PROPERTY_TITLE_COLOR = "titleColor";
  @Nullable
  private String titleColor;

  public static final String JSON_PROPERTY_TITLE_ALIGNMENT = "titleAlignment";
  @Nullable
  private TextAlignment titleAlignment;

  public static final String JSON_PROPERTY_UNITS = "units";
  @Nullable
  private String units;

  public static final String JSON_PROPERTY_DECIMALS = "decimals";
  @Nullable
  private Integer decimals;

  public static final String JSON_PROPERTY_AUTO_SCALE = "autoScale";
  @Nullable
  private Boolean autoScale;

  public static final String JSON_PROPERTY_SORT_SERIES = "sortSeries";
  @Nullable
  private Boolean sortSeries;

  public static final String JSON_PROPERTY_SHOW_TOTAL = "showTotal";
  @Nullable
  private Boolean showTotal;

  public static final String JSON_PROPERTY_SHOW_LEGEND = "showLegend";
  @Nullable
  private Boolean showLegend;

  public static final String JSON_PROPERTY_LEGEND_POSITION = "legendPosition";
  @Nullable
  private LegendPosition legendPosition;

  public static final String JSON_PROPERTY_LEGEND_LABEL_FONT = "legendLabelFont";
  @Nullable
  private Font legendLabelFont;

  public static final String JSON_PROPERTY_LEGEND_LABEL_COLOR = "legendLabelColor";
  @Nullable
  private String legendLabelColor;

  public static final String JSON_PROPERTY_LEGEND_VALUE_FONT = "legendValueFont";
  @Nullable
  private Font legendValueFont;

  public static final String JSON_PROPERTY_LEGEND_VALUE_COLOR = "legendValueColor";
  @Nullable
  private String legendValueColor;

  public static final String JSON_PROPERTY_LEGEND_SHOW_TOTAL = "legendShowTotal";
  @Nullable
  private Boolean legendShowTotal;

  public static final String JSON_PROPERTY_AXIS_MIN = "axisMin";
  @Nullable
  private Double axisMin;

  public static final String JSON_PROPERTY_AXIS_MAX = "axisMax";
  @Nullable
  private Double axisMax;

  public static final String JSON_PROPERTY_AXIS_TICK_LABEL_FONT = "axisTickLabelFont";
  @Nullable
  private Font axisTickLabelFont;

  public static final String JSON_PROPERTY_AXIS_TICK_LABEL_COLOR = "axisTickLabelColor";
  @Nullable
  private String axisTickLabelColor;

  public static final String JSON_PROPERTY_BAR_SETTINGS = "barSettings";
  @Nullable
  private BarSeriesSettings barSettings;

  public ReportBarChartSettings() { 
  }

  public ReportBarChartSettings showTitle(@Nullable Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * Get showTitle
   * @return showTitle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTitle() {
    return showTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTitle(@Nullable Boolean showTitle) {
    this.showTitle = showTitle;
  }


  public ReportBarChartSettings title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@Nullable String title) {
    this.title = title;
  }


  public ReportBarChartSettings titleFont(@Nullable Font titleFont) {
    this.titleFont = titleFont;
    return this;
  }

  /**
   * Get titleFont
   * @return titleFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getTitleFont() {
    return titleFont;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitleFont(@Nullable Font titleFont) {
    this.titleFont = titleFont;
  }


  public ReportBarChartSettings titleColor(@Nullable String titleColor) {
    this.titleColor = titleColor;
    return this;
  }

  /**
   * Get titleColor
   * @return titleColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleColor() {
    return titleColor;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitleColor(@Nullable String titleColor) {
    this.titleColor = titleColor;
  }


  public ReportBarChartSettings titleAlignment(@Nullable TextAlignment titleAlignment) {
    this.titleAlignment = titleAlignment;
    return this;
  }

  /**
   * Get titleAlignment
   * @return titleAlignment
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TextAlignment getTitleAlignment() {
    return titleAlignment;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE_ALIGNMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitleAlignment(@Nullable TextAlignment titleAlignment) {
    this.titleAlignment = titleAlignment;
  }


  public ReportBarChartSettings units(@Nullable String units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnits() {
    return units;
  }


  @JsonProperty(value = JSON_PROPERTY_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(@Nullable String units) {
    this.units = units;
  }


  public ReportBarChartSettings decimals(@Nullable Integer decimals) {
    this.decimals = decimals;
    return this;
  }

  /**
   * Get decimals
   * @return decimals
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDecimals() {
    return decimals;
  }


  @JsonProperty(value = JSON_PROPERTY_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecimals(@Nullable Integer decimals) {
    this.decimals = decimals;
  }


  public ReportBarChartSettings autoScale(@Nullable Boolean autoScale) {
    this.autoScale = autoScale;
    return this;
  }

  /**
   * Get autoScale
   * @return autoScale
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AUTO_SCALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoScale() {
    return autoScale;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTO_SCALE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoScale(@Nullable Boolean autoScale) {
    this.autoScale = autoScale;
  }


  public ReportBarChartSettings sortSeries(@Nullable Boolean sortSeries) {
    this.sortSeries = sortSeries;
    return this;
  }

  /**
   * Get sortSeries
   * @return sortSeries
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SORT_SERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSortSeries() {
    return sortSeries;
  }


  @JsonProperty(value = JSON_PROPERTY_SORT_SERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortSeries(@Nullable Boolean sortSeries) {
    this.sortSeries = sortSeries;
  }


  public ReportBarChartSettings showTotal(@Nullable Boolean showTotal) {
    this.showTotal = showTotal;
    return this;
  }

  /**
   * Get showTotal
   * @return showTotal
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTotal() {
    return showTotal;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTotal(@Nullable Boolean showTotal) {
    this.showTotal = showTotal;
  }


  public ReportBarChartSettings showLegend(@Nullable Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

  /**
   * Get showLegend
   * @return showLegend
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_LEGEND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLegend() {
    return showLegend;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_LEGEND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLegend(@Nullable Boolean showLegend) {
    this.showLegend = showLegend;
  }


  public ReportBarChartSettings legendPosition(@Nullable LegendPosition legendPosition) {
    this.legendPosition = legendPosition;
    return this;
  }

  /**
   * Get legendPosition
   * @return legendPosition
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LegendPosition getLegendPosition() {
    return legendPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendPosition(@Nullable LegendPosition legendPosition) {
    this.legendPosition = legendPosition;
  }


  public ReportBarChartSettings legendLabelFont(@Nullable Font legendLabelFont) {
    this.legendLabelFont = legendLabelFont;
    return this;
  }

  /**
   * Get legendLabelFont
   * @return legendLabelFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getLegendLabelFont() {
    return legendLabelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendLabelFont(@Nullable Font legendLabelFont) {
    this.legendLabelFont = legendLabelFont;
  }


  public ReportBarChartSettings legendLabelColor(@Nullable String legendLabelColor) {
    this.legendLabelColor = legendLabelColor;
    return this;
  }

  /**
   * Get legendLabelColor
   * @return legendLabelColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendLabelColor() {
    return legendLabelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendLabelColor(@Nullable String legendLabelColor) {
    this.legendLabelColor = legendLabelColor;
  }


  public ReportBarChartSettings legendValueFont(@Nullable Font legendValueFont) {
    this.legendValueFont = legendValueFont;
    return this;
  }

  /**
   * Get legendValueFont
   * @return legendValueFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getLegendValueFont() {
    return legendValueFont;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendValueFont(@Nullable Font legendValueFont) {
    this.legendValueFont = legendValueFont;
  }


  public ReportBarChartSettings legendValueColor(@Nullable String legendValueColor) {
    this.legendValueColor = legendValueColor;
    return this;
  }

  /**
   * Get legendValueColor
   * @return legendValueColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendValueColor() {
    return legendValueColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendValueColor(@Nullable String legendValueColor) {
    this.legendValueColor = legendValueColor;
  }


  public ReportBarChartSettings legendShowTotal(@Nullable Boolean legendShowTotal) {
    this.legendShowTotal = legendShowTotal;
    return this;
  }

  /**
   * Get legendShowTotal
   * @return legendShowTotal
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLegendShowTotal() {
    return legendShowTotal;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendShowTotal(@Nullable Boolean legendShowTotal) {
    this.legendShowTotal = legendShowTotal;
  }


  public ReportBarChartSettings axisMin(@Nullable Double axisMin) {
    this.axisMin = axisMin;
    return this;
  }

  /**
   * Get axisMin
   * @return axisMin
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AXIS_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAxisMin() {
    return axisMin;
  }


  @JsonProperty(value = JSON_PROPERTY_AXIS_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxisMin(@Nullable Double axisMin) {
    this.axisMin = axisMin;
  }


  public ReportBarChartSettings axisMax(@Nullable Double axisMax) {
    this.axisMax = axisMax;
    return this;
  }

  /**
   * Get axisMax
   * @return axisMax
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AXIS_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAxisMax() {
    return axisMax;
  }


  @JsonProperty(value = JSON_PROPERTY_AXIS_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxisMax(@Nullable Double axisMax) {
    this.axisMax = axisMax;
  }


  public ReportBarChartSettings axisTickLabelFont(@Nullable Font axisTickLabelFont) {
    this.axisTickLabelFont = axisTickLabelFont;
    return this;
  }

  /**
   * Get axisTickLabelFont
   * @return axisTickLabelFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AXIS_TICK_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getAxisTickLabelFont() {
    return axisTickLabelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_AXIS_TICK_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxisTickLabelFont(@Nullable Font axisTickLabelFont) {
    this.axisTickLabelFont = axisTickLabelFont;
  }


  public ReportBarChartSettings axisTickLabelColor(@Nullable String axisTickLabelColor) {
    this.axisTickLabelColor = axisTickLabelColor;
    return this;
  }

  /**
   * Get axisTickLabelColor
   * @return axisTickLabelColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AXIS_TICK_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAxisTickLabelColor() {
    return axisTickLabelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_AXIS_TICK_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxisTickLabelColor(@Nullable String axisTickLabelColor) {
    this.axisTickLabelColor = axisTickLabelColor;
  }


  public ReportBarChartSettings barSettings(@Nullable BarSeriesSettings barSettings) {
    this.barSettings = barSettings;
    return this;
  }

  /**
   * Get barSettings
   * @return barSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BarSeriesSettings getBarSettings() {
    return barSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarSettings(@Nullable BarSeriesSettings barSettings) {
    this.barSettings = barSettings;
  }


  /**
   * Return true if this ReportBarChartSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBarChartSettings reportBarChartSettings = (ReportBarChartSettings) o;
    return Objects.equals(this.showTitle, reportBarChartSettings.showTitle) &&
        Objects.equals(this.title, reportBarChartSettings.title) &&
        Objects.equals(this.titleFont, reportBarChartSettings.titleFont) &&
        Objects.equals(this.titleColor, reportBarChartSettings.titleColor) &&
        Objects.equals(this.titleAlignment, reportBarChartSettings.titleAlignment) &&
        Objects.equals(this.units, reportBarChartSettings.units) &&
        Objects.equals(this.decimals, reportBarChartSettings.decimals) &&
        Objects.equals(this.autoScale, reportBarChartSettings.autoScale) &&
        Objects.equals(this.sortSeries, reportBarChartSettings.sortSeries) &&
        Objects.equals(this.showTotal, reportBarChartSettings.showTotal) &&
        Objects.equals(this.showLegend, reportBarChartSettings.showLegend) &&
        Objects.equals(this.legendPosition, reportBarChartSettings.legendPosition) &&
        Objects.equals(this.legendLabelFont, reportBarChartSettings.legendLabelFont) &&
        Objects.equals(this.legendLabelColor, reportBarChartSettings.legendLabelColor) &&
        Objects.equals(this.legendValueFont, reportBarChartSettings.legendValueFont) &&
        Objects.equals(this.legendValueColor, reportBarChartSettings.legendValueColor) &&
        Objects.equals(this.legendShowTotal, reportBarChartSettings.legendShowTotal) &&
        Objects.equals(this.axisMin, reportBarChartSettings.axisMin) &&
        Objects.equals(this.axisMax, reportBarChartSettings.axisMax) &&
        Objects.equals(this.axisTickLabelFont, reportBarChartSettings.axisTickLabelFont) &&
        Objects.equals(this.axisTickLabelColor, reportBarChartSettings.axisTickLabelColor) &&
        Objects.equals(this.barSettings, reportBarChartSettings.barSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showTitle, title, titleFont, titleColor, titleAlignment, units, decimals, autoScale, sortSeries, showTotal, showLegend, legendPosition, legendLabelFont, legendLabelColor, legendValueFont, legendValueColor, legendShowTotal, axisMin, axisMax, axisTickLabelFont, axisTickLabelColor, barSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportBarChartSettings {\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleFont: ").append(toIndentedString(titleFont)).append("\n");
    sb.append("    titleColor: ").append(toIndentedString(titleColor)).append("\n");
    sb.append("    titleAlignment: ").append(toIndentedString(titleAlignment)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    autoScale: ").append(toIndentedString(autoScale)).append("\n");
    sb.append("    sortSeries: ").append(toIndentedString(sortSeries)).append("\n");
    sb.append("    showTotal: ").append(toIndentedString(showTotal)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    legendPosition: ").append(toIndentedString(legendPosition)).append("\n");
    sb.append("    legendLabelFont: ").append(toIndentedString(legendLabelFont)).append("\n");
    sb.append("    legendLabelColor: ").append(toIndentedString(legendLabelColor)).append("\n");
    sb.append("    legendValueFont: ").append(toIndentedString(legendValueFont)).append("\n");
    sb.append("    legendValueColor: ").append(toIndentedString(legendValueColor)).append("\n");
    sb.append("    legendShowTotal: ").append(toIndentedString(legendShowTotal)).append("\n");
    sb.append("    axisMin: ").append(toIndentedString(axisMin)).append("\n");
    sb.append("    axisMax: ").append(toIndentedString(axisMax)).append("\n");
    sb.append("    axisTickLabelFont: ").append(toIndentedString(axisTickLabelFont)).append("\n");
    sb.append("    axisTickLabelColor: ").append(toIndentedString(axisTickLabelColor)).append("\n");
    sb.append("    barSettings: ").append(toIndentedString(barSettings)).append("\n");
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

    // add `showTitle` to the URL query string
    if (getShowTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTitle()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `titleFont` to the URL query string
    if (getTitleFont() != null) {
      joiner.add(getTitleFont().toUrlQueryString(prefix + "titleFont" + suffix));
    }

    // add `titleColor` to the URL query string
    if (getTitleColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitleColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitleColor()))));
    }

    // add `titleAlignment` to the URL query string
    if (getTitleAlignment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitleAlignment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitleAlignment()))));
    }

    // add `units` to the URL query string
    if (getUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnits()))));
    }

    // add `decimals` to the URL query string
    if (getDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDecimals()))));
    }

    // add `autoScale` to the URL query string
    if (getAutoScale() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sautoScale%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAutoScale()))));
    }

    // add `sortSeries` to the URL query string
    if (getSortSeries() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssortSeries%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSortSeries()))));
    }

    // add `showTotal` to the URL query string
    if (getShowTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTotal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTotal()))));
    }

    // add `showLegend` to the URL query string
    if (getShowLegend() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLegend%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLegend()))));
    }

    // add `legendPosition` to the URL query string
    if (getLegendPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slegendPosition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLegendPosition()))));
    }

    // add `legendLabelFont` to the URL query string
    if (getLegendLabelFont() != null) {
      joiner.add(getLegendLabelFont().toUrlQueryString(prefix + "legendLabelFont" + suffix));
    }

    // add `legendLabelColor` to the URL query string
    if (getLegendLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slegendLabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLegendLabelColor()))));
    }

    // add `legendValueFont` to the URL query string
    if (getLegendValueFont() != null) {
      joiner.add(getLegendValueFont().toUrlQueryString(prefix + "legendValueFont" + suffix));
    }

    // add `legendValueColor` to the URL query string
    if (getLegendValueColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slegendValueColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLegendValueColor()))));
    }

    // add `legendShowTotal` to the URL query string
    if (getLegendShowTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slegendShowTotal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLegendShowTotal()))));
    }

    // add `axisMin` to the URL query string
    if (getAxisMin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saxisMin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAxisMin()))));
    }

    // add `axisMax` to the URL query string
    if (getAxisMax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saxisMax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAxisMax()))));
    }

    // add `axisTickLabelFont` to the URL query string
    if (getAxisTickLabelFont() != null) {
      joiner.add(getAxisTickLabelFont().toUrlQueryString(prefix + "axisTickLabelFont" + suffix));
    }

    // add `axisTickLabelColor` to the URL query string
    if (getAxisTickLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saxisTickLabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAxisTickLabelColor()))));
    }

    // add `barSettings` to the URL query string
    if (getBarSettings() != null) {
      joiner.add(getBarSettings().toUrlQueryString(prefix + "barSettings" + suffix));
    }

    return joiner.toString();
  }
}

