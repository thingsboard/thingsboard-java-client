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
import org.thingsboard.client.model.DoughnutLayout;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.LegendPosition;
import org.thingsboard.client.model.TextAlignment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ReportDoughnutChartSettings
 */
@JsonPropertyOrder({
  ReportDoughnutChartSettings.JSON_PROPERTY_SHOW_TITLE,
  ReportDoughnutChartSettings.JSON_PROPERTY_TITLE,
  ReportDoughnutChartSettings.JSON_PROPERTY_TITLE_FONT,
  ReportDoughnutChartSettings.JSON_PROPERTY_TITLE_COLOR,
  ReportDoughnutChartSettings.JSON_PROPERTY_TITLE_ALIGNMENT,
  ReportDoughnutChartSettings.JSON_PROPERTY_UNITS,
  ReportDoughnutChartSettings.JSON_PROPERTY_DECIMALS,
  ReportDoughnutChartSettings.JSON_PROPERTY_AUTO_SCALE,
  ReportDoughnutChartSettings.JSON_PROPERTY_SORT_SERIES,
  ReportDoughnutChartSettings.JSON_PROPERTY_SHOW_TOTAL,
  ReportDoughnutChartSettings.JSON_PROPERTY_SHOW_LEGEND,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_POSITION,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_LABEL_FONT,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_LABEL_COLOR,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_VALUE_FONT,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_VALUE_COLOR,
  ReportDoughnutChartSettings.JSON_PROPERTY_LEGEND_SHOW_TOTAL,
  ReportDoughnutChartSettings.JSON_PROPERTY_LAYOUT,
  ReportDoughnutChartSettings.JSON_PROPERTY_CLOCKWISE,
  ReportDoughnutChartSettings.JSON_PROPERTY_TOTAL_VALUE_FONT,
  ReportDoughnutChartSettings.JSON_PROPERTY_TOTAL_VALUE_COLOR
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReportDoughnutChartSettings {
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

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  @Nullable
  private DoughnutLayout layout;

  public static final String JSON_PROPERTY_CLOCKWISE = "clockwise";
  @Nullable
  private Boolean clockwise;

  public static final String JSON_PROPERTY_TOTAL_VALUE_FONT = "totalValueFont";
  @Nullable
  private Font totalValueFont;

  public static final String JSON_PROPERTY_TOTAL_VALUE_COLOR = "totalValueColor";
  @Nullable
  private String totalValueColor;

  public ReportDoughnutChartSettings() { 
  }

  public ReportDoughnutChartSettings showTitle(@Nullable Boolean showTitle) {
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


  public ReportDoughnutChartSettings title(@Nullable String title) {
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


  public ReportDoughnutChartSettings titleFont(@Nullable Font titleFont) {
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


  public ReportDoughnutChartSettings titleColor(@Nullable String titleColor) {
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


  public ReportDoughnutChartSettings titleAlignment(@Nullable TextAlignment titleAlignment) {
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


  public ReportDoughnutChartSettings units(@Nullable String units) {
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


  public ReportDoughnutChartSettings decimals(@Nullable Integer decimals) {
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


  public ReportDoughnutChartSettings autoScale(@Nullable Boolean autoScale) {
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


  public ReportDoughnutChartSettings sortSeries(@Nullable Boolean sortSeries) {
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


  public ReportDoughnutChartSettings showTotal(@Nullable Boolean showTotal) {
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


  public ReportDoughnutChartSettings showLegend(@Nullable Boolean showLegend) {
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


  public ReportDoughnutChartSettings legendPosition(@Nullable LegendPosition legendPosition) {
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


  public ReportDoughnutChartSettings legendLabelFont(@Nullable Font legendLabelFont) {
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


  public ReportDoughnutChartSettings legendLabelColor(@Nullable String legendLabelColor) {
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


  public ReportDoughnutChartSettings legendValueFont(@Nullable Font legendValueFont) {
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


  public ReportDoughnutChartSettings legendValueColor(@Nullable String legendValueColor) {
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


  public ReportDoughnutChartSettings legendShowTotal(@Nullable Boolean legendShowTotal) {
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


  public ReportDoughnutChartSettings layout(@Nullable DoughnutLayout layout) {
    this.layout = layout;
    return this;
  }

  /**
   * Get layout
   * @return layout
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DoughnutLayout getLayout() {
    return layout;
  }


  @JsonProperty(value = JSON_PROPERTY_LAYOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLayout(@Nullable DoughnutLayout layout) {
    this.layout = layout;
  }


  public ReportDoughnutChartSettings clockwise(@Nullable Boolean clockwise) {
    this.clockwise = clockwise;
    return this;
  }

  /**
   * Get clockwise
   * @return clockwise
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CLOCKWISE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getClockwise() {
    return clockwise;
  }


  @JsonProperty(value = JSON_PROPERTY_CLOCKWISE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClockwise(@Nullable Boolean clockwise) {
    this.clockwise = clockwise;
  }


  public ReportDoughnutChartSettings totalValueFont(@Nullable Font totalValueFont) {
    this.totalValueFont = totalValueFont;
    return this;
  }

  /**
   * Get totalValueFont
   * @return totalValueFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getTotalValueFont() {
    return totalValueFont;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalValueFont(@Nullable Font totalValueFont) {
    this.totalValueFont = totalValueFont;
  }


  public ReportDoughnutChartSettings totalValueColor(@Nullable String totalValueColor) {
    this.totalValueColor = totalValueColor;
    return this;
  }

  /**
   * Get totalValueColor
   * @return totalValueColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTotalValueColor() {
    return totalValueColor;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalValueColor(@Nullable String totalValueColor) {
    this.totalValueColor = totalValueColor;
  }


  /**
   * Return true if this ReportDoughnutChartSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDoughnutChartSettings reportDoughnutChartSettings = (ReportDoughnutChartSettings) o;
    return Objects.equals(this.showTitle, reportDoughnutChartSettings.showTitle) &&
        Objects.equals(this.title, reportDoughnutChartSettings.title) &&
        Objects.equals(this.titleFont, reportDoughnutChartSettings.titleFont) &&
        Objects.equals(this.titleColor, reportDoughnutChartSettings.titleColor) &&
        Objects.equals(this.titleAlignment, reportDoughnutChartSettings.titleAlignment) &&
        Objects.equals(this.units, reportDoughnutChartSettings.units) &&
        Objects.equals(this.decimals, reportDoughnutChartSettings.decimals) &&
        Objects.equals(this.autoScale, reportDoughnutChartSettings.autoScale) &&
        Objects.equals(this.sortSeries, reportDoughnutChartSettings.sortSeries) &&
        Objects.equals(this.showTotal, reportDoughnutChartSettings.showTotal) &&
        Objects.equals(this.showLegend, reportDoughnutChartSettings.showLegend) &&
        Objects.equals(this.legendPosition, reportDoughnutChartSettings.legendPosition) &&
        Objects.equals(this.legendLabelFont, reportDoughnutChartSettings.legendLabelFont) &&
        Objects.equals(this.legendLabelColor, reportDoughnutChartSettings.legendLabelColor) &&
        Objects.equals(this.legendValueFont, reportDoughnutChartSettings.legendValueFont) &&
        Objects.equals(this.legendValueColor, reportDoughnutChartSettings.legendValueColor) &&
        Objects.equals(this.legendShowTotal, reportDoughnutChartSettings.legendShowTotal) &&
        Objects.equals(this.layout, reportDoughnutChartSettings.layout) &&
        Objects.equals(this.clockwise, reportDoughnutChartSettings.clockwise) &&
        Objects.equals(this.totalValueFont, reportDoughnutChartSettings.totalValueFont) &&
        Objects.equals(this.totalValueColor, reportDoughnutChartSettings.totalValueColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showTitle, title, titleFont, titleColor, titleAlignment, units, decimals, autoScale, sortSeries, showTotal, showLegend, legendPosition, legendLabelFont, legendLabelColor, legendValueFont, legendValueColor, legendShowTotal, layout, clockwise, totalValueFont, totalValueColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDoughnutChartSettings {\n");
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
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    clockwise: ").append(toIndentedString(clockwise)).append("\n");
    sb.append("    totalValueFont: ").append(toIndentedString(totalValueFont)).append("\n");
    sb.append("    totalValueColor: ").append(toIndentedString(totalValueColor)).append("\n");
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

    // add `layout` to the URL query string
    if (getLayout() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slayout%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLayout()))));
    }

    // add `clockwise` to the URL query string
    if (getClockwise() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclockwise%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClockwise()))));
    }

    // add `totalValueFont` to the URL query string
    if (getTotalValueFont() != null) {
      joiner.add(getTotalValueFont().toUrlQueryString(prefix + "totalValueFont" + suffix));
    }

    // add `totalValueColor` to the URL query string
    if (getTotalValueColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalValueColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalValueColor()))));
    }

    return joiner.toString();
  }
}

