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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.ColorRange;
import org.thingsboard.client.model.ComparisonDuration;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.LegendConfig;
import org.thingsboard.client.model.LineSeriesSettings;
import org.thingsboard.client.model.TextAlignment;
import org.thingsboard.client.model.TimeSeriesChartBarWidthSettings;
import org.thingsboard.client.model.TimeSeriesChartGridSettings;
import org.thingsboard.client.model.TimeSeriesChartNoAggregationBarWidthSettings;
import org.thingsboard.client.model.TimeSeriesChartStateSettings;
import org.thingsboard.client.model.TimeSeriesChartThreshold;
import org.thingsboard.client.model.TimeSeriesChartXAxisSettings;
import org.thingsboard.client.model.TimeSeriesChartYAxisSettings;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ReportRangeChartSettings
 */
@JsonPropertyOrder({
  ReportRangeChartSettings.JSON_PROPERTY_SHOW_TITLE,
  ReportRangeChartSettings.JSON_PROPERTY_TITLE,
  ReportRangeChartSettings.JSON_PROPERTY_TITLE_FONT,
  ReportRangeChartSettings.JSON_PROPERTY_TITLE_COLOR,
  ReportRangeChartSettings.JSON_PROPERTY_TITLE_ALIGNMENT,
  ReportRangeChartSettings.JSON_PROPERTY_THRESHOLDS,
  ReportRangeChartSettings.JSON_PROPERTY_STACK,
  ReportRangeChartSettings.JSON_PROPERTY_GRID,
  ReportRangeChartSettings.JSON_PROPERTY_Y_AXES,
  ReportRangeChartSettings.JSON_PROPERTY_X_AXIS,
  ReportRangeChartSettings.JSON_PROPERTY_BAR_WIDTH_SETTINGS,
  ReportRangeChartSettings.JSON_PROPERTY_NO_AGGREGATION_BAR_WIDTH_SETTINGS,
  ReportRangeChartSettings.JSON_PROPERTY_STATES,
  ReportRangeChartSettings.JSON_PROPERTY_COMPARISON_ENABLED,
  ReportRangeChartSettings.JSON_PROPERTY_TIME_FOR_COMPARISON,
  ReportRangeChartSettings.JSON_PROPERTY_COMPARISON_CUSTOM_INTERVAL_VALUE,
  ReportRangeChartSettings.JSON_PROPERTY_COMPARISON_X_AXIS,
  ReportRangeChartSettings.JSON_PROPERTY_SHOW_LEGEND,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_COLUMN_TITLE_FONT,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_COLUMN_TITLE_COLOR,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_LABEL_FONT,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_LABEL_COLOR,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_VALUE_FONT,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_VALUE_COLOR,
  ReportRangeChartSettings.JSON_PROPERTY_LEGEND_CONFIG,
  ReportRangeChartSettings.JSON_PROPERTY_XAXIS,
  ReportRangeChartSettings.JSON_PROPERTY_YAXES,
  ReportRangeChartSettings.JSON_PROPERTY_RANGE_COLORS,
  ReportRangeChartSettings.JSON_PROPERTY_OUT_OF_RANGE_COLOR,
  ReportRangeChartSettings.JSON_PROPERTY_SHOW_RANGE_THRESHOLDS,
  ReportRangeChartSettings.JSON_PROPERTY_RANGE_THRESHOLD,
  ReportRangeChartSettings.JSON_PROPERTY_FILL_AREA,
  ReportRangeChartSettings.JSON_PROPERTY_FILL_AREA_OPACITY,
  ReportRangeChartSettings.JSON_PROPERTY_LINE_SETTINGS,
  ReportRangeChartSettings.JSON_PROPERTY_RANGE_UNITS,
  ReportRangeChartSettings.JSON_PROPERTY_RANGE_DECIMALS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReportRangeChartSettings {
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

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  @Nullable
  private List<TimeSeriesChartThreshold> thresholds = new ArrayList<>();

  public static final String JSON_PROPERTY_STACK = "stack";
  @Nullable
  private Boolean stack;

  public static final String JSON_PROPERTY_GRID = "grid";
  @Nullable
  private TimeSeriesChartGridSettings grid;

  public static final String JSON_PROPERTY_Y_AXES = "yAxes";
  @Nullable
  private Map<String, TimeSeriesChartYAxisSettings> yAxes = new HashMap<>();

  public static final String JSON_PROPERTY_X_AXIS = "xAxis";
  @Nullable
  private TimeSeriesChartXAxisSettings xAxis;

  public static final String JSON_PROPERTY_BAR_WIDTH_SETTINGS = "barWidthSettings";
  @Nullable
  private TimeSeriesChartBarWidthSettings barWidthSettings;

  public static final String JSON_PROPERTY_NO_AGGREGATION_BAR_WIDTH_SETTINGS = "noAggregationBarWidthSettings";
  @Nullable
  private TimeSeriesChartNoAggregationBarWidthSettings noAggregationBarWidthSettings;

  public static final String JSON_PROPERTY_STATES = "states";
  @Nullable
  private List<TimeSeriesChartStateSettings> states = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPARISON_ENABLED = "comparisonEnabled";
  @Nullable
  private Boolean comparisonEnabled;

  public static final String JSON_PROPERTY_TIME_FOR_COMPARISON = "timeForComparison";
  @Nullable
  private ComparisonDuration timeForComparison;

  public static final String JSON_PROPERTY_COMPARISON_CUSTOM_INTERVAL_VALUE = "comparisonCustomIntervalValue";
  @Nullable
  private Long comparisonCustomIntervalValue;

  public static final String JSON_PROPERTY_COMPARISON_X_AXIS = "comparisonXAxis";
  @Nullable
  private TimeSeriesChartXAxisSettings comparisonXAxis;

  public static final String JSON_PROPERTY_SHOW_LEGEND = "showLegend";
  @Nullable
  private Boolean showLegend;

  public static final String JSON_PROPERTY_LEGEND_COLUMN_TITLE_FONT = "legendColumnTitleFont";
  @Nullable
  private Font legendColumnTitleFont;

  public static final String JSON_PROPERTY_LEGEND_COLUMN_TITLE_COLOR = "legendColumnTitleColor";
  @Nullable
  private String legendColumnTitleColor;

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

  public static final String JSON_PROPERTY_LEGEND_CONFIG = "legendConfig";
  @Nullable
  private LegendConfig legendConfig;

  public static final String JSON_PROPERTY_XAXIS = "xaxis";
  @Nullable
  private TimeSeriesChartXAxisSettings xaxis;

  public static final String JSON_PROPERTY_YAXES = "yaxes";
  @Nullable
  private Map<String, TimeSeriesChartYAxisSettings> yaxes = new HashMap<>();

  public static final String JSON_PROPERTY_RANGE_COLORS = "rangeColors";
  @Nullable
  private List<ColorRange> rangeColors = new ArrayList<>();

  public static final String JSON_PROPERTY_OUT_OF_RANGE_COLOR = "outOfRangeColor";
  @Nullable
  private String outOfRangeColor;

  public static final String JSON_PROPERTY_SHOW_RANGE_THRESHOLDS = "showRangeThresholds";
  @Nullable
  private Boolean showRangeThresholds;

  public static final String JSON_PROPERTY_RANGE_THRESHOLD = "rangeThreshold";
  @Nullable
  private TimeSeriesChartThreshold rangeThreshold;

  public static final String JSON_PROPERTY_FILL_AREA = "fillArea";
  @Nullable
  private Boolean fillArea;

  public static final String JSON_PROPERTY_FILL_AREA_OPACITY = "fillAreaOpacity";
  @Nullable
  private Float fillAreaOpacity;

  public static final String JSON_PROPERTY_LINE_SETTINGS = "lineSettings";
  @Nullable
  private LineSeriesSettings lineSettings;

  public static final String JSON_PROPERTY_RANGE_UNITS = "rangeUnits";
  @Nullable
  private String rangeUnits;

  public static final String JSON_PROPERTY_RANGE_DECIMALS = "rangeDecimals";
  @Nullable
  private Integer rangeDecimals;

  public ReportRangeChartSettings() { 
  }

  public ReportRangeChartSettings showTitle(@Nullable Boolean showTitle) {
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


  public ReportRangeChartSettings title(@Nullable String title) {
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


  public ReportRangeChartSettings titleFont(@Nullable Font titleFont) {
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


  public ReportRangeChartSettings titleColor(@Nullable String titleColor) {
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


  public ReportRangeChartSettings titleAlignment(@Nullable TextAlignment titleAlignment) {
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


  public ReportRangeChartSettings thresholds(@Nullable List<TimeSeriesChartThreshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public ReportRangeChartSettings addThresholdsItem(TimeSeriesChartThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

  /**
   * Get thresholds
   * @return thresholds
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_THRESHOLDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeSeriesChartThreshold> getThresholds() {
    return thresholds;
  }


  @JsonProperty(value = JSON_PROPERTY_THRESHOLDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholds(@Nullable List<TimeSeriesChartThreshold> thresholds) {
    this.thresholds = thresholds;
  }


  public ReportRangeChartSettings stack(@Nullable Boolean stack) {
    this.stack = stack;
    return this;
  }

  /**
   * Get stack
   * @return stack
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STACK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getStack() {
    return stack;
  }


  @JsonProperty(value = JSON_PROPERTY_STACK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStack(@Nullable Boolean stack) {
    this.stack = stack;
  }


  public ReportRangeChartSettings grid(@Nullable TimeSeriesChartGridSettings grid) {
    this.grid = grid;
    return this;
  }

  /**
   * Get grid
   * @return grid
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_GRID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartGridSettings getGrid() {
    return grid;
  }


  @JsonProperty(value = JSON_PROPERTY_GRID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrid(@Nullable TimeSeriesChartGridSettings grid) {
    this.grid = grid;
  }


  public ReportRangeChartSettings yAxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yAxes) {
    this.yAxes = yAxes;
    return this;
  }

  public ReportRangeChartSettings putYAxesItem(String key, TimeSeriesChartYAxisSettings yAxesItem) {
    if (this.yAxes == null) {
      this.yAxes = new HashMap<>();
    }
    this.yAxes.put(key, yAxesItem);
    return this;
  }

  /**
   * Get yAxes
   * @return yAxes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_Y_AXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, TimeSeriesChartYAxisSettings> getyAxes() {
    return yAxes;
  }


  @JsonProperty(value = JSON_PROPERTY_Y_AXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setyAxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yAxes) {
    this.yAxes = yAxes;
  }


  public ReportRangeChartSettings xAxis(@Nullable TimeSeriesChartXAxisSettings xAxis) {
    this.xAxis = xAxis;
    return this;
  }

  /**
   * Get xAxis
   * @return xAxis
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_X_AXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartXAxisSettings getxAxis() {
    return xAxis;
  }


  @JsonProperty(value = JSON_PROPERTY_X_AXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setxAxis(@Nullable TimeSeriesChartXAxisSettings xAxis) {
    this.xAxis = xAxis;
  }


  public ReportRangeChartSettings barWidthSettings(@Nullable TimeSeriesChartBarWidthSettings barWidthSettings) {
    this.barWidthSettings = barWidthSettings;
    return this;
  }

  /**
   * Get barWidthSettings
   * @return barWidthSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartBarWidthSettings getBarWidthSettings() {
    return barWidthSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_WIDTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarWidthSettings(@Nullable TimeSeriesChartBarWidthSettings barWidthSettings) {
    this.barWidthSettings = barWidthSettings;
  }


  public ReportRangeChartSettings noAggregationBarWidthSettings(@Nullable TimeSeriesChartNoAggregationBarWidthSettings noAggregationBarWidthSettings) {
    this.noAggregationBarWidthSettings = noAggregationBarWidthSettings;
    return this;
  }

  /**
   * Get noAggregationBarWidthSettings
   * @return noAggregationBarWidthSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NO_AGGREGATION_BAR_WIDTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartNoAggregationBarWidthSettings getNoAggregationBarWidthSettings() {
    return noAggregationBarWidthSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_NO_AGGREGATION_BAR_WIDTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoAggregationBarWidthSettings(@Nullable TimeSeriesChartNoAggregationBarWidthSettings noAggregationBarWidthSettings) {
    this.noAggregationBarWidthSettings = noAggregationBarWidthSettings;
  }


  public ReportRangeChartSettings states(@Nullable List<TimeSeriesChartStateSettings> states) {
    this.states = states;
    return this;
  }

  public ReportRangeChartSettings addStatesItem(TimeSeriesChartStateSettings statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeSeriesChartStateSettings> getStates() {
    return states;
  }


  @JsonProperty(value = JSON_PROPERTY_STATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStates(@Nullable List<TimeSeriesChartStateSettings> states) {
    this.states = states;
  }


  public ReportRangeChartSettings comparisonEnabled(@Nullable Boolean comparisonEnabled) {
    this.comparisonEnabled = comparisonEnabled;
    return this;
  }

  /**
   * Get comparisonEnabled
   * @return comparisonEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPARISON_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getComparisonEnabled() {
    return comparisonEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPARISON_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisonEnabled(@Nullable Boolean comparisonEnabled) {
    this.comparisonEnabled = comparisonEnabled;
  }


  public ReportRangeChartSettings timeForComparison(@Nullable ComparisonDuration timeForComparison) {
    this.timeForComparison = timeForComparison;
    return this;
  }

  /**
   * Get timeForComparison
   * @return timeForComparison
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME_FOR_COMPARISON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComparisonDuration getTimeForComparison() {
    return timeForComparison;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_FOR_COMPARISON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeForComparison(@Nullable ComparisonDuration timeForComparison) {
    this.timeForComparison = timeForComparison;
  }


  public ReportRangeChartSettings comparisonCustomIntervalValue(@Nullable Long comparisonCustomIntervalValue) {
    this.comparisonCustomIntervalValue = comparisonCustomIntervalValue;
    return this;
  }

  /**
   * Get comparisonCustomIntervalValue
   * @return comparisonCustomIntervalValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPARISON_CUSTOM_INTERVAL_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getComparisonCustomIntervalValue() {
    return comparisonCustomIntervalValue;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPARISON_CUSTOM_INTERVAL_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisonCustomIntervalValue(@Nullable Long comparisonCustomIntervalValue) {
    this.comparisonCustomIntervalValue = comparisonCustomIntervalValue;
  }


  public ReportRangeChartSettings comparisonXAxis(@Nullable TimeSeriesChartXAxisSettings comparisonXAxis) {
    this.comparisonXAxis = comparisonXAxis;
    return this;
  }

  /**
   * Get comparisonXAxis
   * @return comparisonXAxis
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPARISON_X_AXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartXAxisSettings getComparisonXAxis() {
    return comparisonXAxis;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPARISON_X_AXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisonXAxis(@Nullable TimeSeriesChartXAxisSettings comparisonXAxis) {
    this.comparisonXAxis = comparisonXAxis;
  }


  public ReportRangeChartSettings showLegend(@Nullable Boolean showLegend) {
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


  public ReportRangeChartSettings legendColumnTitleFont(@Nullable Font legendColumnTitleFont) {
    this.legendColumnTitleFont = legendColumnTitleFont;
    return this;
  }

  /**
   * Get legendColumnTitleFont
   * @return legendColumnTitleFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_COLUMN_TITLE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getLegendColumnTitleFont() {
    return legendColumnTitleFont;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_COLUMN_TITLE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendColumnTitleFont(@Nullable Font legendColumnTitleFont) {
    this.legendColumnTitleFont = legendColumnTitleFont;
  }


  public ReportRangeChartSettings legendColumnTitleColor(@Nullable String legendColumnTitleColor) {
    this.legendColumnTitleColor = legendColumnTitleColor;
    return this;
  }

  /**
   * Get legendColumnTitleColor
   * @return legendColumnTitleColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_COLUMN_TITLE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLegendColumnTitleColor() {
    return legendColumnTitleColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_COLUMN_TITLE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendColumnTitleColor(@Nullable String legendColumnTitleColor) {
    this.legendColumnTitleColor = legendColumnTitleColor;
  }


  public ReportRangeChartSettings legendLabelFont(@Nullable Font legendLabelFont) {
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


  public ReportRangeChartSettings legendLabelColor(@Nullable String legendLabelColor) {
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


  public ReportRangeChartSettings legendValueFont(@Nullable Font legendValueFont) {
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


  public ReportRangeChartSettings legendValueColor(@Nullable String legendValueColor) {
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


  public ReportRangeChartSettings legendConfig(@Nullable LegendConfig legendConfig) {
    this.legendConfig = legendConfig;
    return this;
  }

  /**
   * Get legendConfig
   * @return legendConfig
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEGEND_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LegendConfig getLegendConfig() {
    return legendConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_LEGEND_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegendConfig(@Nullable LegendConfig legendConfig) {
    this.legendConfig = legendConfig;
  }


  public ReportRangeChartSettings xaxis(@Nullable TimeSeriesChartXAxisSettings xaxis) {
    this.xaxis = xaxis;
    return this;
  }

  /**
   * Get xaxis
   * @return xaxis
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_XAXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartXAxisSettings getXaxis() {
    return xaxis;
  }


  @JsonProperty(value = JSON_PROPERTY_XAXIS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXaxis(@Nullable TimeSeriesChartXAxisSettings xaxis) {
    this.xaxis = xaxis;
  }


  public ReportRangeChartSettings yaxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yaxes) {
    this.yaxes = yaxes;
    return this;
  }

  public ReportRangeChartSettings putYaxesItem(String key, TimeSeriesChartYAxisSettings yaxesItem) {
    if (this.yaxes == null) {
      this.yaxes = new HashMap<>();
    }
    this.yaxes.put(key, yaxesItem);
    return this;
  }

  /**
   * Get yaxes
   * @return yaxes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_YAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, TimeSeriesChartYAxisSettings> getYaxes() {
    return yaxes;
  }


  @JsonProperty(value = JSON_PROPERTY_YAXES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYaxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yaxes) {
    this.yaxes = yaxes;
  }


  public ReportRangeChartSettings rangeColors(@Nullable List<ColorRange> rangeColors) {
    this.rangeColors = rangeColors;
    return this;
  }

  public ReportRangeChartSettings addRangeColorsItem(ColorRange rangeColorsItem) {
    if (this.rangeColors == null) {
      this.rangeColors = new ArrayList<>();
    }
    this.rangeColors.add(rangeColorsItem);
    return this;
  }

  /**
   * Get rangeColors
   * @return rangeColors
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE_COLORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ColorRange> getRangeColors() {
    return rangeColors;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE_COLORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeColors(@Nullable List<ColorRange> rangeColors) {
    this.rangeColors = rangeColors;
  }


  public ReportRangeChartSettings outOfRangeColor(@Nullable String outOfRangeColor) {
    this.outOfRangeColor = outOfRangeColor;
    return this;
  }

  /**
   * Get outOfRangeColor
   * @return outOfRangeColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OUT_OF_RANGE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOutOfRangeColor() {
    return outOfRangeColor;
  }


  @JsonProperty(value = JSON_PROPERTY_OUT_OF_RANGE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutOfRangeColor(@Nullable String outOfRangeColor) {
    this.outOfRangeColor = outOfRangeColor;
  }


  public ReportRangeChartSettings showRangeThresholds(@Nullable Boolean showRangeThresholds) {
    this.showRangeThresholds = showRangeThresholds;
    return this;
  }

  /**
   * Get showRangeThresholds
   * @return showRangeThresholds
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_RANGE_THRESHOLDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowRangeThresholds() {
    return showRangeThresholds;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_RANGE_THRESHOLDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowRangeThresholds(@Nullable Boolean showRangeThresholds) {
    this.showRangeThresholds = showRangeThresholds;
  }


  public ReportRangeChartSettings rangeThreshold(@Nullable TimeSeriesChartThreshold rangeThreshold) {
    this.rangeThreshold = rangeThreshold;
    return this;
  }

  /**
   * Get rangeThreshold
   * @return rangeThreshold
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeSeriesChartThreshold getRangeThreshold() {
    return rangeThreshold;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeThreshold(@Nullable TimeSeriesChartThreshold rangeThreshold) {
    this.rangeThreshold = rangeThreshold;
  }


  public ReportRangeChartSettings fillArea(@Nullable Boolean fillArea) {
    this.fillArea = fillArea;
    return this;
  }

  /**
   * Get fillArea
   * @return fillArea
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FILL_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFillArea() {
    return fillArea;
  }


  @JsonProperty(value = JSON_PROPERTY_FILL_AREA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillArea(@Nullable Boolean fillArea) {
    this.fillArea = fillArea;
  }


  public ReportRangeChartSettings fillAreaOpacity(@Nullable Float fillAreaOpacity) {
    this.fillAreaOpacity = fillAreaOpacity;
    return this;
  }

  /**
   * Get fillAreaOpacity
   * @return fillAreaOpacity
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FILL_AREA_OPACITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getFillAreaOpacity() {
    return fillAreaOpacity;
  }


  @JsonProperty(value = JSON_PROPERTY_FILL_AREA_OPACITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillAreaOpacity(@Nullable Float fillAreaOpacity) {
    this.fillAreaOpacity = fillAreaOpacity;
  }


  public ReportRangeChartSettings lineSettings(@Nullable LineSeriesSettings lineSettings) {
    this.lineSettings = lineSettings;
    return this;
  }

  /**
   * Get lineSettings
   * @return lineSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LineSeriesSettings getLineSettings() {
    return lineSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineSettings(@Nullable LineSeriesSettings lineSettings) {
    this.lineSettings = lineSettings;
  }


  public ReportRangeChartSettings rangeUnits(@Nullable String rangeUnits) {
    this.rangeUnits = rangeUnits;
    return this;
  }

  /**
   * Get rangeUnits
   * @return rangeUnits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRangeUnits() {
    return rangeUnits;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeUnits(@Nullable String rangeUnits) {
    this.rangeUnits = rangeUnits;
  }


  public ReportRangeChartSettings rangeDecimals(@Nullable Integer rangeDecimals) {
    this.rangeDecimals = rangeDecimals;
    return this;
  }

  /**
   * Get rangeDecimals
   * @return rangeDecimals
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RANGE_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRangeDecimals() {
    return rangeDecimals;
  }


  @JsonProperty(value = JSON_PROPERTY_RANGE_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeDecimals(@Nullable Integer rangeDecimals) {
    this.rangeDecimals = rangeDecimals;
  }


  /**
   * Return true if this ReportRangeChartSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRangeChartSettings reportRangeChartSettings = (ReportRangeChartSettings) o;
    return Objects.equals(this.showTitle, reportRangeChartSettings.showTitle) &&
        Objects.equals(this.title, reportRangeChartSettings.title) &&
        Objects.equals(this.titleFont, reportRangeChartSettings.titleFont) &&
        Objects.equals(this.titleColor, reportRangeChartSettings.titleColor) &&
        Objects.equals(this.titleAlignment, reportRangeChartSettings.titleAlignment) &&
        Objects.equals(this.thresholds, reportRangeChartSettings.thresholds) &&
        Objects.equals(this.stack, reportRangeChartSettings.stack) &&
        Objects.equals(this.grid, reportRangeChartSettings.grid) &&
        Objects.equals(this.yAxes, reportRangeChartSettings.yAxes) &&
        Objects.equals(this.xAxis, reportRangeChartSettings.xAxis) &&
        Objects.equals(this.barWidthSettings, reportRangeChartSettings.barWidthSettings) &&
        Objects.equals(this.noAggregationBarWidthSettings, reportRangeChartSettings.noAggregationBarWidthSettings) &&
        Objects.equals(this.states, reportRangeChartSettings.states) &&
        Objects.equals(this.comparisonEnabled, reportRangeChartSettings.comparisonEnabled) &&
        Objects.equals(this.timeForComparison, reportRangeChartSettings.timeForComparison) &&
        Objects.equals(this.comparisonCustomIntervalValue, reportRangeChartSettings.comparisonCustomIntervalValue) &&
        Objects.equals(this.comparisonXAxis, reportRangeChartSettings.comparisonXAxis) &&
        Objects.equals(this.showLegend, reportRangeChartSettings.showLegend) &&
        Objects.equals(this.legendColumnTitleFont, reportRangeChartSettings.legendColumnTitleFont) &&
        Objects.equals(this.legendColumnTitleColor, reportRangeChartSettings.legendColumnTitleColor) &&
        Objects.equals(this.legendLabelFont, reportRangeChartSettings.legendLabelFont) &&
        Objects.equals(this.legendLabelColor, reportRangeChartSettings.legendLabelColor) &&
        Objects.equals(this.legendValueFont, reportRangeChartSettings.legendValueFont) &&
        Objects.equals(this.legendValueColor, reportRangeChartSettings.legendValueColor) &&
        Objects.equals(this.legendConfig, reportRangeChartSettings.legendConfig) &&
        Objects.equals(this.xaxis, reportRangeChartSettings.xaxis) &&
        Objects.equals(this.yaxes, reportRangeChartSettings.yaxes) &&
        Objects.equals(this.rangeColors, reportRangeChartSettings.rangeColors) &&
        Objects.equals(this.outOfRangeColor, reportRangeChartSettings.outOfRangeColor) &&
        Objects.equals(this.showRangeThresholds, reportRangeChartSettings.showRangeThresholds) &&
        Objects.equals(this.rangeThreshold, reportRangeChartSettings.rangeThreshold) &&
        Objects.equals(this.fillArea, reportRangeChartSettings.fillArea) &&
        Objects.equals(this.fillAreaOpacity, reportRangeChartSettings.fillAreaOpacity) &&
        Objects.equals(this.lineSettings, reportRangeChartSettings.lineSettings) &&
        Objects.equals(this.rangeUnits, reportRangeChartSettings.rangeUnits) &&
        Objects.equals(this.rangeDecimals, reportRangeChartSettings.rangeDecimals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showTitle, title, titleFont, titleColor, titleAlignment, thresholds, stack, grid, yAxes, xAxis, barWidthSettings, noAggregationBarWidthSettings, states, comparisonEnabled, timeForComparison, comparisonCustomIntervalValue, comparisonXAxis, showLegend, legendColumnTitleFont, legendColumnTitleColor, legendLabelFont, legendLabelColor, legendValueFont, legendValueColor, legendConfig, xaxis, yaxes, rangeColors, outOfRangeColor, showRangeThresholds, rangeThreshold, fillArea, fillAreaOpacity, lineSettings, rangeUnits, rangeDecimals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRangeChartSettings {\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleFont: ").append(toIndentedString(titleFont)).append("\n");
    sb.append("    titleColor: ").append(toIndentedString(titleColor)).append("\n");
    sb.append("    titleAlignment: ").append(toIndentedString(titleAlignment)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
    sb.append("    yAxes: ").append(toIndentedString(yAxes)).append("\n");
    sb.append("    xAxis: ").append(toIndentedString(xAxis)).append("\n");
    sb.append("    barWidthSettings: ").append(toIndentedString(barWidthSettings)).append("\n");
    sb.append("    noAggregationBarWidthSettings: ").append(toIndentedString(noAggregationBarWidthSettings)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    comparisonEnabled: ").append(toIndentedString(comparisonEnabled)).append("\n");
    sb.append("    timeForComparison: ").append(toIndentedString(timeForComparison)).append("\n");
    sb.append("    comparisonCustomIntervalValue: ").append(toIndentedString(comparisonCustomIntervalValue)).append("\n");
    sb.append("    comparisonXAxis: ").append(toIndentedString(comparisonXAxis)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    legendColumnTitleFont: ").append(toIndentedString(legendColumnTitleFont)).append("\n");
    sb.append("    legendColumnTitleColor: ").append(toIndentedString(legendColumnTitleColor)).append("\n");
    sb.append("    legendLabelFont: ").append(toIndentedString(legendLabelFont)).append("\n");
    sb.append("    legendLabelColor: ").append(toIndentedString(legendLabelColor)).append("\n");
    sb.append("    legendValueFont: ").append(toIndentedString(legendValueFont)).append("\n");
    sb.append("    legendValueColor: ").append(toIndentedString(legendValueColor)).append("\n");
    sb.append("    legendConfig: ").append(toIndentedString(legendConfig)).append("\n");
    sb.append("    xaxis: ").append(toIndentedString(xaxis)).append("\n");
    sb.append("    yaxes: ").append(toIndentedString(yaxes)).append("\n");
    sb.append("    rangeColors: ").append(toIndentedString(rangeColors)).append("\n");
    sb.append("    outOfRangeColor: ").append(toIndentedString(outOfRangeColor)).append("\n");
    sb.append("    showRangeThresholds: ").append(toIndentedString(showRangeThresholds)).append("\n");
    sb.append("    rangeThreshold: ").append(toIndentedString(rangeThreshold)).append("\n");
    sb.append("    fillArea: ").append(toIndentedString(fillArea)).append("\n");
    sb.append("    fillAreaOpacity: ").append(toIndentedString(fillAreaOpacity)).append("\n");
    sb.append("    lineSettings: ").append(toIndentedString(lineSettings)).append("\n");
    sb.append("    rangeUnits: ").append(toIndentedString(rangeUnits)).append("\n");
    sb.append("    rangeDecimals: ").append(toIndentedString(rangeDecimals)).append("\n");
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

    // add `thresholds` to the URL query string
    if (getThresholds() != null) {
      for (int i = 0; i < getThresholds().size(); i++) {
        if (getThresholds().get(i) != null) {
          joiner.add(getThresholds().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sthresholds%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `stack` to the URL query string
    if (getStack() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstack%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStack()))));
    }

    // add `grid` to the URL query string
    if (getGrid() != null) {
      joiner.add(getGrid().toUrlQueryString(prefix + "grid" + suffix));
    }

    // add `yAxes` to the URL query string
    if (getyAxes() != null) {
      for (String _key : getyAxes().keySet()) {
        if (getyAxes().get(_key) != null) {
          joiner.add(getyAxes().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%syAxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `xAxis` to the URL query string
    if (getxAxis() != null) {
      joiner.add(getxAxis().toUrlQueryString(prefix + "xAxis" + suffix));
    }

    // add `barWidthSettings` to the URL query string
    if (getBarWidthSettings() != null) {
      joiner.add(getBarWidthSettings().toUrlQueryString(prefix + "barWidthSettings" + suffix));
    }

    // add `noAggregationBarWidthSettings` to the URL query string
    if (getNoAggregationBarWidthSettings() != null) {
      joiner.add(getNoAggregationBarWidthSettings().toUrlQueryString(prefix + "noAggregationBarWidthSettings" + suffix));
    }

    // add `states` to the URL query string
    if (getStates() != null) {
      for (int i = 0; i < getStates().size(); i++) {
        if (getStates().get(i) != null) {
          joiner.add(getStates().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `comparisonEnabled` to the URL query string
    if (getComparisonEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomparisonEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComparisonEnabled()))));
    }

    // add `timeForComparison` to the URL query string
    if (getTimeForComparison() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimeForComparison%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeForComparison()))));
    }

    // add `comparisonCustomIntervalValue` to the URL query string
    if (getComparisonCustomIntervalValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomparisonCustomIntervalValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComparisonCustomIntervalValue()))));
    }

    // add `comparisonXAxis` to the URL query string
    if (getComparisonXAxis() != null) {
      joiner.add(getComparisonXAxis().toUrlQueryString(prefix + "comparisonXAxis" + suffix));
    }

    // add `showLegend` to the URL query string
    if (getShowLegend() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLegend%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLegend()))));
    }

    // add `legendColumnTitleFont` to the URL query string
    if (getLegendColumnTitleFont() != null) {
      joiner.add(getLegendColumnTitleFont().toUrlQueryString(prefix + "legendColumnTitleFont" + suffix));
    }

    // add `legendColumnTitleColor` to the URL query string
    if (getLegendColumnTitleColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slegendColumnTitleColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLegendColumnTitleColor()))));
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

    // add `legendConfig` to the URL query string
    if (getLegendConfig() != null) {
      joiner.add(getLegendConfig().toUrlQueryString(prefix + "legendConfig" + suffix));
    }

    // add `xaxis` to the URL query string
    if (getXaxis() != null) {
      joiner.add(getXaxis().toUrlQueryString(prefix + "xaxis" + suffix));
    }

    // add `yaxes` to the URL query string
    if (getYaxes() != null) {
      for (String _key : getYaxes().keySet()) {
        if (getYaxes().get(_key) != null) {
          joiner.add(getYaxes().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%syaxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `rangeColors` to the URL query string
    if (getRangeColors() != null) {
      for (int i = 0; i < getRangeColors().size(); i++) {
        if (getRangeColors().get(i) != null) {
          joiner.add(getRangeColors().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%srangeColors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `outOfRangeColor` to the URL query string
    if (getOutOfRangeColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soutOfRangeColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOutOfRangeColor()))));
    }

    // add `showRangeThresholds` to the URL query string
    if (getShowRangeThresholds() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowRangeThresholds%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowRangeThresholds()))));
    }

    // add `rangeThreshold` to the URL query string
    if (getRangeThreshold() != null) {
      joiner.add(getRangeThreshold().toUrlQueryString(prefix + "rangeThreshold" + suffix));
    }

    // add `fillArea` to the URL query string
    if (getFillArea() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfillArea%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFillArea()))));
    }

    // add `fillAreaOpacity` to the URL query string
    if (getFillAreaOpacity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfillAreaOpacity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFillAreaOpacity()))));
    }

    // add `lineSettings` to the URL query string
    if (getLineSettings() != null) {
      joiner.add(getLineSettings().toUrlQueryString(prefix + "lineSettings" + suffix));
    }

    // add `rangeUnits` to the URL query string
    if (getRangeUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srangeUnits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRangeUnits()))));
    }

    // add `rangeDecimals` to the URL query string
    if (getRangeDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srangeDecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRangeDecimals()))));
    }

    return joiner.toString();
  }
}

