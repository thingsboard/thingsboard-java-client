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
import org.thingsboard.client.model.ChartFillSettings;
import org.thingsboard.client.model.ComparisonDuration;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.LegendConfig;
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
 * ReportBarChartWithLabelsSettings
 */
@JsonPropertyOrder({
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_SHOW_TITLE,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_TITLE,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_TITLE_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_TITLE_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_TITLE_ALIGNMENT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_THRESHOLDS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_STACK,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_GRID,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_Y_AXES,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_X_AXIS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_WIDTH_SETTINGS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_NO_AGGREGATION_BAR_WIDTH_SETTINGS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_STATES,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_COMPARISON_ENABLED,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_TIME_FOR_COMPARISON,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_COMPARISON_CUSTOM_INTERVAL_VALUE,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_COMPARISON_X_AXIS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_SHOW_LEGEND,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_COLUMN_TITLE_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_COLUMN_TITLE_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_LABEL_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_LABEL_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_VALUE_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_VALUE_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_LEGEND_CONFIG,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_XAXIS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_YAXES,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_SHOW_BAR_LABEL,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_LABEL_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_LABEL_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_SHOW_BAR_VALUE,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_VALUE_FONT,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_VALUE_COLOR,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_SHOW_BAR_BORDER,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_BORDER_WIDTH,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_BORDER_RADIUS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_BACKGROUND_SETTINGS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_UNITS,
  ReportBarChartWithLabelsSettings.JSON_PROPERTY_BAR_DECIMALS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReportBarChartWithLabelsSettings {
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

  public static final String JSON_PROPERTY_SHOW_BAR_LABEL = "showBarLabel";
  @Nullable
  private Boolean showBarLabel;

  public static final String JSON_PROPERTY_BAR_LABEL_FONT = "barLabelFont";
  @Nullable
  private Font barLabelFont;

  public static final String JSON_PROPERTY_BAR_LABEL_COLOR = "barLabelColor";
  @Nullable
  private String barLabelColor;

  public static final String JSON_PROPERTY_SHOW_BAR_VALUE = "showBarValue";
  @Nullable
  private Boolean showBarValue;

  public static final String JSON_PROPERTY_BAR_VALUE_FONT = "barValueFont";
  @Nullable
  private Font barValueFont;

  public static final String JSON_PROPERTY_BAR_VALUE_COLOR = "barValueColor";
  @Nullable
  private String barValueColor;

  public static final String JSON_PROPERTY_SHOW_BAR_BORDER = "showBarBorder";
  @Nullable
  private Boolean showBarBorder;

  public static final String JSON_PROPERTY_BAR_BORDER_WIDTH = "barBorderWidth";
  @Nullable
  private Float barBorderWidth;

  public static final String JSON_PROPERTY_BAR_BORDER_RADIUS = "barBorderRadius";
  @Nullable
  private Float barBorderRadius;

  public static final String JSON_PROPERTY_BAR_BACKGROUND_SETTINGS = "barBackgroundSettings";
  @Nullable
  private ChartFillSettings barBackgroundSettings;

  public static final String JSON_PROPERTY_BAR_UNITS = "barUnits";
  @Nullable
  private String barUnits;

  public static final String JSON_PROPERTY_BAR_DECIMALS = "barDecimals";
  @Nullable
  private Integer barDecimals;

  public ReportBarChartWithLabelsSettings() { 
  }

  public ReportBarChartWithLabelsSettings showTitle(@Nullable Boolean showTitle) {
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


  public ReportBarChartWithLabelsSettings title(@Nullable String title) {
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


  public ReportBarChartWithLabelsSettings titleFont(@Nullable Font titleFont) {
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


  public ReportBarChartWithLabelsSettings titleColor(@Nullable String titleColor) {
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


  public ReportBarChartWithLabelsSettings titleAlignment(@Nullable TextAlignment titleAlignment) {
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


  public ReportBarChartWithLabelsSettings thresholds(@Nullable List<TimeSeriesChartThreshold> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public ReportBarChartWithLabelsSettings addThresholdsItem(TimeSeriesChartThreshold thresholdsItem) {
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


  public ReportBarChartWithLabelsSettings stack(@Nullable Boolean stack) {
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


  public ReportBarChartWithLabelsSettings grid(@Nullable TimeSeriesChartGridSettings grid) {
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


  public ReportBarChartWithLabelsSettings yAxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yAxes) {
    this.yAxes = yAxes;
    return this;
  }

  public ReportBarChartWithLabelsSettings putYAxesItem(String key, TimeSeriesChartYAxisSettings yAxesItem) {
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


  public ReportBarChartWithLabelsSettings xAxis(@Nullable TimeSeriesChartXAxisSettings xAxis) {
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


  public ReportBarChartWithLabelsSettings barWidthSettings(@Nullable TimeSeriesChartBarWidthSettings barWidthSettings) {
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


  public ReportBarChartWithLabelsSettings noAggregationBarWidthSettings(@Nullable TimeSeriesChartNoAggregationBarWidthSettings noAggregationBarWidthSettings) {
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


  public ReportBarChartWithLabelsSettings states(@Nullable List<TimeSeriesChartStateSettings> states) {
    this.states = states;
    return this;
  }

  public ReportBarChartWithLabelsSettings addStatesItem(TimeSeriesChartStateSettings statesItem) {
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


  public ReportBarChartWithLabelsSettings comparisonEnabled(@Nullable Boolean comparisonEnabled) {
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


  public ReportBarChartWithLabelsSettings timeForComparison(@Nullable ComparisonDuration timeForComparison) {
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


  public ReportBarChartWithLabelsSettings comparisonCustomIntervalValue(@Nullable Long comparisonCustomIntervalValue) {
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


  public ReportBarChartWithLabelsSettings comparisonXAxis(@Nullable TimeSeriesChartXAxisSettings comparisonXAxis) {
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


  public ReportBarChartWithLabelsSettings showLegend(@Nullable Boolean showLegend) {
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


  public ReportBarChartWithLabelsSettings legendColumnTitleFont(@Nullable Font legendColumnTitleFont) {
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


  public ReportBarChartWithLabelsSettings legendColumnTitleColor(@Nullable String legendColumnTitleColor) {
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


  public ReportBarChartWithLabelsSettings legendLabelFont(@Nullable Font legendLabelFont) {
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


  public ReportBarChartWithLabelsSettings legendLabelColor(@Nullable String legendLabelColor) {
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


  public ReportBarChartWithLabelsSettings legendValueFont(@Nullable Font legendValueFont) {
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


  public ReportBarChartWithLabelsSettings legendValueColor(@Nullable String legendValueColor) {
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


  public ReportBarChartWithLabelsSettings legendConfig(@Nullable LegendConfig legendConfig) {
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


  public ReportBarChartWithLabelsSettings xaxis(@Nullable TimeSeriesChartXAxisSettings xaxis) {
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


  public ReportBarChartWithLabelsSettings yaxes(@Nullable Map<String, TimeSeriesChartYAxisSettings> yaxes) {
    this.yaxes = yaxes;
    return this;
  }

  public ReportBarChartWithLabelsSettings putYaxesItem(String key, TimeSeriesChartYAxisSettings yaxesItem) {
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


  public ReportBarChartWithLabelsSettings showBarLabel(@Nullable Boolean showBarLabel) {
    this.showBarLabel = showBarLabel;
    return this;
  }

  /**
   * Get showBarLabel
   * @return showBarLabel
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowBarLabel() {
    return showBarLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowBarLabel(@Nullable Boolean showBarLabel) {
    this.showBarLabel = showBarLabel;
  }


  public ReportBarChartWithLabelsSettings barLabelFont(@Nullable Font barLabelFont) {
    this.barLabelFont = barLabelFont;
    return this;
  }

  /**
   * Get barLabelFont
   * @return barLabelFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getBarLabelFont() {
    return barLabelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarLabelFont(@Nullable Font barLabelFont) {
    this.barLabelFont = barLabelFont;
  }


  public ReportBarChartWithLabelsSettings barLabelColor(@Nullable String barLabelColor) {
    this.barLabelColor = barLabelColor;
    return this;
  }

  /**
   * Get barLabelColor
   * @return barLabelColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBarLabelColor() {
    return barLabelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarLabelColor(@Nullable String barLabelColor) {
    this.barLabelColor = barLabelColor;
  }


  public ReportBarChartWithLabelsSettings showBarValue(@Nullable Boolean showBarValue) {
    this.showBarValue = showBarValue;
    return this;
  }

  /**
   * Get showBarValue
   * @return showBarValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowBarValue() {
    return showBarValue;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowBarValue(@Nullable Boolean showBarValue) {
    this.showBarValue = showBarValue;
  }


  public ReportBarChartWithLabelsSettings barValueFont(@Nullable Font barValueFont) {
    this.barValueFont = barValueFont;
    return this;
  }

  /**
   * Get barValueFont
   * @return barValueFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getBarValueFont() {
    return barValueFont;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_VALUE_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarValueFont(@Nullable Font barValueFont) {
    this.barValueFont = barValueFont;
  }


  public ReportBarChartWithLabelsSettings barValueColor(@Nullable String barValueColor) {
    this.barValueColor = barValueColor;
    return this;
  }

  /**
   * Get barValueColor
   * @return barValueColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBarValueColor() {
    return barValueColor;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_VALUE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarValueColor(@Nullable String barValueColor) {
    this.barValueColor = barValueColor;
  }


  public ReportBarChartWithLabelsSettings showBarBorder(@Nullable Boolean showBarBorder) {
    this.showBarBorder = showBarBorder;
    return this;
  }

  /**
   * Get showBarBorder
   * @return showBarBorder
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_BORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowBarBorder() {
    return showBarBorder;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_BAR_BORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowBarBorder(@Nullable Boolean showBarBorder) {
    this.showBarBorder = showBarBorder;
  }


  public ReportBarChartWithLabelsSettings barBorderWidth(@Nullable Float barBorderWidth) {
    this.barBorderWidth = barBorderWidth;
    return this;
  }

  /**
   * Get barBorderWidth
   * @return barBorderWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getBarBorderWidth() {
    return barBorderWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_BORDER_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarBorderWidth(@Nullable Float barBorderWidth) {
    this.barBorderWidth = barBorderWidth;
  }


  public ReportBarChartWithLabelsSettings barBorderRadius(@Nullable Float barBorderRadius) {
    this.barBorderRadius = barBorderRadius;
    return this;
  }

  /**
   * Get barBorderRadius
   * @return barBorderRadius
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_BORDER_RADIUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getBarBorderRadius() {
    return barBorderRadius;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_BORDER_RADIUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarBorderRadius(@Nullable Float barBorderRadius) {
    this.barBorderRadius = barBorderRadius;
  }


  public ReportBarChartWithLabelsSettings barBackgroundSettings(@Nullable ChartFillSettings barBackgroundSettings) {
    this.barBackgroundSettings = barBackgroundSettings;
    return this;
  }

  /**
   * Get barBackgroundSettings
   * @return barBackgroundSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_BACKGROUND_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartFillSettings getBarBackgroundSettings() {
    return barBackgroundSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_BACKGROUND_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarBackgroundSettings(@Nullable ChartFillSettings barBackgroundSettings) {
    this.barBackgroundSettings = barBackgroundSettings;
  }


  public ReportBarChartWithLabelsSettings barUnits(@Nullable String barUnits) {
    this.barUnits = barUnits;
    return this;
  }

  /**
   * Get barUnits
   * @return barUnits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBarUnits() {
    return barUnits;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_UNITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarUnits(@Nullable String barUnits) {
    this.barUnits = barUnits;
  }


  public ReportBarChartWithLabelsSettings barDecimals(@Nullable Integer barDecimals) {
    this.barDecimals = barDecimals;
    return this;
  }

  /**
   * Get barDecimals
   * @return barDecimals
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BAR_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBarDecimals() {
    return barDecimals;
  }


  @JsonProperty(value = JSON_PROPERTY_BAR_DECIMALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarDecimals(@Nullable Integer barDecimals) {
    this.barDecimals = barDecimals;
  }


  /**
   * Return true if this ReportBarChartWithLabelsSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBarChartWithLabelsSettings reportBarChartWithLabelsSettings = (ReportBarChartWithLabelsSettings) o;
    return Objects.equals(this.showTitle, reportBarChartWithLabelsSettings.showTitle) &&
        Objects.equals(this.title, reportBarChartWithLabelsSettings.title) &&
        Objects.equals(this.titleFont, reportBarChartWithLabelsSettings.titleFont) &&
        Objects.equals(this.titleColor, reportBarChartWithLabelsSettings.titleColor) &&
        Objects.equals(this.titleAlignment, reportBarChartWithLabelsSettings.titleAlignment) &&
        Objects.equals(this.thresholds, reportBarChartWithLabelsSettings.thresholds) &&
        Objects.equals(this.stack, reportBarChartWithLabelsSettings.stack) &&
        Objects.equals(this.grid, reportBarChartWithLabelsSettings.grid) &&
        Objects.equals(this.yAxes, reportBarChartWithLabelsSettings.yAxes) &&
        Objects.equals(this.xAxis, reportBarChartWithLabelsSettings.xAxis) &&
        Objects.equals(this.barWidthSettings, reportBarChartWithLabelsSettings.barWidthSettings) &&
        Objects.equals(this.noAggregationBarWidthSettings, reportBarChartWithLabelsSettings.noAggregationBarWidthSettings) &&
        Objects.equals(this.states, reportBarChartWithLabelsSettings.states) &&
        Objects.equals(this.comparisonEnabled, reportBarChartWithLabelsSettings.comparisonEnabled) &&
        Objects.equals(this.timeForComparison, reportBarChartWithLabelsSettings.timeForComparison) &&
        Objects.equals(this.comparisonCustomIntervalValue, reportBarChartWithLabelsSettings.comparisonCustomIntervalValue) &&
        Objects.equals(this.comparisonXAxis, reportBarChartWithLabelsSettings.comparisonXAxis) &&
        Objects.equals(this.showLegend, reportBarChartWithLabelsSettings.showLegend) &&
        Objects.equals(this.legendColumnTitleFont, reportBarChartWithLabelsSettings.legendColumnTitleFont) &&
        Objects.equals(this.legendColumnTitleColor, reportBarChartWithLabelsSettings.legendColumnTitleColor) &&
        Objects.equals(this.legendLabelFont, reportBarChartWithLabelsSettings.legendLabelFont) &&
        Objects.equals(this.legendLabelColor, reportBarChartWithLabelsSettings.legendLabelColor) &&
        Objects.equals(this.legendValueFont, reportBarChartWithLabelsSettings.legendValueFont) &&
        Objects.equals(this.legendValueColor, reportBarChartWithLabelsSettings.legendValueColor) &&
        Objects.equals(this.legendConfig, reportBarChartWithLabelsSettings.legendConfig) &&
        Objects.equals(this.xaxis, reportBarChartWithLabelsSettings.xaxis) &&
        Objects.equals(this.yaxes, reportBarChartWithLabelsSettings.yaxes) &&
        Objects.equals(this.showBarLabel, reportBarChartWithLabelsSettings.showBarLabel) &&
        Objects.equals(this.barLabelFont, reportBarChartWithLabelsSettings.barLabelFont) &&
        Objects.equals(this.barLabelColor, reportBarChartWithLabelsSettings.barLabelColor) &&
        Objects.equals(this.showBarValue, reportBarChartWithLabelsSettings.showBarValue) &&
        Objects.equals(this.barValueFont, reportBarChartWithLabelsSettings.barValueFont) &&
        Objects.equals(this.barValueColor, reportBarChartWithLabelsSettings.barValueColor) &&
        Objects.equals(this.showBarBorder, reportBarChartWithLabelsSettings.showBarBorder) &&
        Objects.equals(this.barBorderWidth, reportBarChartWithLabelsSettings.barBorderWidth) &&
        Objects.equals(this.barBorderRadius, reportBarChartWithLabelsSettings.barBorderRadius) &&
        Objects.equals(this.barBackgroundSettings, reportBarChartWithLabelsSettings.barBackgroundSettings) &&
        Objects.equals(this.barUnits, reportBarChartWithLabelsSettings.barUnits) &&
        Objects.equals(this.barDecimals, reportBarChartWithLabelsSettings.barDecimals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showTitle, title, titleFont, titleColor, titleAlignment, thresholds, stack, grid, yAxes, xAxis, barWidthSettings, noAggregationBarWidthSettings, states, comparisonEnabled, timeForComparison, comparisonCustomIntervalValue, comparisonXAxis, showLegend, legendColumnTitleFont, legendColumnTitleColor, legendLabelFont, legendLabelColor, legendValueFont, legendValueColor, legendConfig, xaxis, yaxes, showBarLabel, barLabelFont, barLabelColor, showBarValue, barValueFont, barValueColor, showBarBorder, barBorderWidth, barBorderRadius, barBackgroundSettings, barUnits, barDecimals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportBarChartWithLabelsSettings {\n");
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
    sb.append("    showBarLabel: ").append(toIndentedString(showBarLabel)).append("\n");
    sb.append("    barLabelFont: ").append(toIndentedString(barLabelFont)).append("\n");
    sb.append("    barLabelColor: ").append(toIndentedString(barLabelColor)).append("\n");
    sb.append("    showBarValue: ").append(toIndentedString(showBarValue)).append("\n");
    sb.append("    barValueFont: ").append(toIndentedString(barValueFont)).append("\n");
    sb.append("    barValueColor: ").append(toIndentedString(barValueColor)).append("\n");
    sb.append("    showBarBorder: ").append(toIndentedString(showBarBorder)).append("\n");
    sb.append("    barBorderWidth: ").append(toIndentedString(barBorderWidth)).append("\n");
    sb.append("    barBorderRadius: ").append(toIndentedString(barBorderRadius)).append("\n");
    sb.append("    barBackgroundSettings: ").append(toIndentedString(barBackgroundSettings)).append("\n");
    sb.append("    barUnits: ").append(toIndentedString(barUnits)).append("\n");
    sb.append("    barDecimals: ").append(toIndentedString(barDecimals)).append("\n");
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

    // add `showBarLabel` to the URL query string
    if (getShowBarLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowBarLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowBarLabel()))));
    }

    // add `barLabelFont` to the URL query string
    if (getBarLabelFont() != null) {
      joiner.add(getBarLabelFont().toUrlQueryString(prefix + "barLabelFont" + suffix));
    }

    // add `barLabelColor` to the URL query string
    if (getBarLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarLabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarLabelColor()))));
    }

    // add `showBarValue` to the URL query string
    if (getShowBarValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowBarValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowBarValue()))));
    }

    // add `barValueFont` to the URL query string
    if (getBarValueFont() != null) {
      joiner.add(getBarValueFont().toUrlQueryString(prefix + "barValueFont" + suffix));
    }

    // add `barValueColor` to the URL query string
    if (getBarValueColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarValueColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarValueColor()))));
    }

    // add `showBarBorder` to the URL query string
    if (getShowBarBorder() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowBarBorder%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowBarBorder()))));
    }

    // add `barBorderWidth` to the URL query string
    if (getBarBorderWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarBorderWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarBorderWidth()))));
    }

    // add `barBorderRadius` to the URL query string
    if (getBarBorderRadius() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarBorderRadius%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarBorderRadius()))));
    }

    // add `barBackgroundSettings` to the URL query string
    if (getBarBackgroundSettings() != null) {
      joiner.add(getBarBackgroundSettings().toUrlQueryString(prefix + "barBackgroundSettings" + suffix));
    }

    // add `barUnits` to the URL query string
    if (getBarUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarUnits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarUnits()))));
    }

    // add `barDecimals` to the URL query string
    if (getBarDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbarDecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBarDecimals()))));
    }

    return joiner.toString();
  }
}

