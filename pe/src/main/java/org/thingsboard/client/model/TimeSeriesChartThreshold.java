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
import org.thingsboard.client.model.ChartLineType;
import org.thingsboard.client.model.ChartShape;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.ThresholdLabelPosition;
import org.thingsboard.client.model.ValueSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TimeSeriesChartThreshold
 */
@JsonPropertyOrder({
  TimeSeriesChartThreshold.JSON_PROPERTY_TYPE,
  TimeSeriesChartThreshold.JSON_PROPERTY_VALUE,
  TimeSeriesChartThreshold.JSON_PROPERTY_LATEST_KEY_TYPE,
  TimeSeriesChartThreshold.JSON_PROPERTY_LATEST_KEY,
  TimeSeriesChartThreshold.JSON_PROPERTY_ENTITY_KEY_TYPE,
  TimeSeriesChartThreshold.JSON_PROPERTY_ENTITY_ALIAS,
  TimeSeriesChartThreshold.JSON_PROPERTY_ENTITY_KEY,
  TimeSeriesChartThreshold.JSON_PROPERTY_Y_AXIS_ID,
  TimeSeriesChartThreshold.JSON_PROPERTY_UNITS,
  TimeSeriesChartThreshold.JSON_PROPERTY_DECIMALS,
  TimeSeriesChartThreshold.JSON_PROPERTY_LINE_COLOR,
  TimeSeriesChartThreshold.JSON_PROPERTY_LINE_TYPE,
  TimeSeriesChartThreshold.JSON_PROPERTY_LINE_WIDTH,
  TimeSeriesChartThreshold.JSON_PROPERTY_START_SYMBOL,
  TimeSeriesChartThreshold.JSON_PROPERTY_START_SYMBOL_SIZE,
  TimeSeriesChartThreshold.JSON_PROPERTY_END_SYMBOL,
  TimeSeriesChartThreshold.JSON_PROPERTY_END_SYMBOL_SIZE,
  TimeSeriesChartThreshold.JSON_PROPERTY_SHOW_LABEL,
  TimeSeriesChartThreshold.JSON_PROPERTY_LABEL_POSITION,
  TimeSeriesChartThreshold.JSON_PROPERTY_LABEL_FONT,
  TimeSeriesChartThreshold.JSON_PROPERTY_LABEL_COLOR,
  TimeSeriesChartThreshold.JSON_PROPERTY_ENABLE_LABEL_BACKGROUND,
  TimeSeriesChartThreshold.JSON_PROPERTY_LABEL_BACKGROUND,
  TimeSeriesChartThreshold.JSON_PROPERTY_YAXIS_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TimeSeriesChartThreshold {
  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private ValueSourceType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  @Nullable
  private Double value;

  public static final String JSON_PROPERTY_LATEST_KEY_TYPE = "latestKeyType";
  @Nullable
  private String latestKeyType;

  public static final String JSON_PROPERTY_LATEST_KEY = "latestKey";
  @Nullable
  private String latestKey;

  public static final String JSON_PROPERTY_ENTITY_KEY_TYPE = "entityKeyType";
  @Nullable
  private String entityKeyType;

  public static final String JSON_PROPERTY_ENTITY_ALIAS = "entityAlias";
  @Nullable
  private String entityAlias;

  public static final String JSON_PROPERTY_ENTITY_KEY = "entityKey";
  @Nullable
  private String entityKey;

  public static final String JSON_PROPERTY_Y_AXIS_ID = "yAxisId";
  @Nullable
  private String yAxisId;

  public static final String JSON_PROPERTY_UNITS = "units";
  @Nullable
  private String units;

  public static final String JSON_PROPERTY_DECIMALS = "decimals";
  @Nullable
  private Integer decimals;

  public static final String JSON_PROPERTY_LINE_COLOR = "lineColor";
  @Nullable
  private String lineColor;

  public static final String JSON_PROPERTY_LINE_TYPE = "lineType";
  @Nullable
  private ChartLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "lineWidth";
  @Nullable
  private Float lineWidth;

  public static final String JSON_PROPERTY_START_SYMBOL = "startSymbol";
  @Nullable
  private ChartShape startSymbol;

  public static final String JSON_PROPERTY_START_SYMBOL_SIZE = "startSymbolSize";
  @Nullable
  private Float startSymbolSize;

  public static final String JSON_PROPERTY_END_SYMBOL = "endSymbol";
  @Nullable
  private ChartShape endSymbol;

  public static final String JSON_PROPERTY_END_SYMBOL_SIZE = "endSymbolSize";
  @Nullable
  private Float endSymbolSize;

  public static final String JSON_PROPERTY_SHOW_LABEL = "showLabel";
  @Nullable
  private Boolean showLabel;

  public static final String JSON_PROPERTY_LABEL_POSITION = "labelPosition";
  @Nullable
  private ThresholdLabelPosition labelPosition;

  public static final String JSON_PROPERTY_LABEL_FONT = "labelFont";
  @Nullable
  private Font labelFont;

  public static final String JSON_PROPERTY_LABEL_COLOR = "labelColor";
  @Nullable
  private String labelColor;

  public static final String JSON_PROPERTY_ENABLE_LABEL_BACKGROUND = "enableLabelBackground";
  @Nullable
  private Boolean enableLabelBackground;

  public static final String JSON_PROPERTY_LABEL_BACKGROUND = "labelBackground";
  @Nullable
  private String labelBackground;

  public static final String JSON_PROPERTY_YAXIS_ID = "yaxisId";
  @Nullable
  private String yaxisId;

  public TimeSeriesChartThreshold() { 
  }

  public TimeSeriesChartThreshold type(@Nullable ValueSourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ValueSourceType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable ValueSourceType type) {
    this.type = type;
  }


  public TimeSeriesChartThreshold value(@Nullable Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@Nullable Double value) {
    this.value = value;
  }


  public TimeSeriesChartThreshold latestKeyType(@Nullable String latestKeyType) {
    this.latestKeyType = latestKeyType;
    return this;
  }

  /**
   * Get latestKeyType
   * @return latestKeyType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestKeyType() {
    return latestKeyType;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestKeyType(@Nullable String latestKeyType) {
    this.latestKeyType = latestKeyType;
  }


  public TimeSeriesChartThreshold latestKey(@Nullable String latestKey) {
    this.latestKey = latestKey;
    return this;
  }

  /**
   * Get latestKey
   * @return latestKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestKey() {
    return latestKey;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestKey(@Nullable String latestKey) {
    this.latestKey = latestKey;
  }


  public TimeSeriesChartThreshold entityKeyType(@Nullable String entityKeyType) {
    this.entityKeyType = entityKeyType;
    return this;
  }

  /**
   * Get entityKeyType
   * @return entityKeyType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityKeyType() {
    return entityKeyType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKeyType(@Nullable String entityKeyType) {
    this.entityKeyType = entityKeyType;
  }


  public TimeSeriesChartThreshold entityAlias(@Nullable String entityAlias) {
    this.entityAlias = entityAlias;
    return this;
  }

  /**
   * Get entityAlias
   * @return entityAlias
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityAlias() {
    return entityAlias;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityAlias(@Nullable String entityAlias) {
    this.entityAlias = entityAlias;
  }


  public TimeSeriesChartThreshold entityKey(@Nullable String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * Get entityKey
   * @return entityKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityKey() {
    return entityKey;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKey(@Nullable String entityKey) {
    this.entityKey = entityKey;
  }


  public TimeSeriesChartThreshold yAxisId(@Nullable String yAxisId) {
    this.yAxisId = yAxisId;
    return this;
  }

  /**
   * Get yAxisId
   * @return yAxisId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_Y_AXIS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getyAxisId() {
    return yAxisId;
  }


  @JsonProperty(value = JSON_PROPERTY_Y_AXIS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setyAxisId(@Nullable String yAxisId) {
    this.yAxisId = yAxisId;
  }


  public TimeSeriesChartThreshold units(@Nullable String units) {
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


  public TimeSeriesChartThreshold decimals(@Nullable Integer decimals) {
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


  public TimeSeriesChartThreshold lineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
    return this;
  }

  /**
   * Get lineColor
   * @return lineColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLineColor() {
    return lineColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineColor(@Nullable String lineColor) {
    this.lineColor = lineColor;
  }


  public TimeSeriesChartThreshold lineType(@Nullable ChartLineType lineType) {
    this.lineType = lineType;
    return this;
  }

  /**
   * Get lineType
   * @return lineType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartLineType getLineType() {
    return lineType;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(@Nullable ChartLineType lineType) {
    this.lineType = lineType;
  }


  public TimeSeriesChartThreshold lineWidth(@Nullable Float lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

  /**
   * Get lineWidth
   * @return lineWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getLineWidth() {
    return lineWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineWidth(@Nullable Float lineWidth) {
    this.lineWidth = lineWidth;
  }


  public TimeSeriesChartThreshold startSymbol(@Nullable ChartShape startSymbol) {
    this.startSymbol = startSymbol;
    return this;
  }

  /**
   * Get startSymbol
   * @return startSymbol
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_START_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartShape getStartSymbol() {
    return startSymbol;
  }


  @JsonProperty(value = JSON_PROPERTY_START_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartSymbol(@Nullable ChartShape startSymbol) {
    this.startSymbol = startSymbol;
  }


  public TimeSeriesChartThreshold startSymbolSize(@Nullable Float startSymbolSize) {
    this.startSymbolSize = startSymbolSize;
    return this;
  }

  /**
   * Get startSymbolSize
   * @return startSymbolSize
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_START_SYMBOL_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getStartSymbolSize() {
    return startSymbolSize;
  }


  @JsonProperty(value = JSON_PROPERTY_START_SYMBOL_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartSymbolSize(@Nullable Float startSymbolSize) {
    this.startSymbolSize = startSymbolSize;
  }


  public TimeSeriesChartThreshold endSymbol(@Nullable ChartShape endSymbol) {
    this.endSymbol = endSymbol;
    return this;
  }

  /**
   * Get endSymbol
   * @return endSymbol
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_END_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartShape getEndSymbol() {
    return endSymbol;
  }


  @JsonProperty(value = JSON_PROPERTY_END_SYMBOL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndSymbol(@Nullable ChartShape endSymbol) {
    this.endSymbol = endSymbol;
  }


  public TimeSeriesChartThreshold endSymbolSize(@Nullable Float endSymbolSize) {
    this.endSymbolSize = endSymbolSize;
    return this;
  }

  /**
   * Get endSymbolSize
   * @return endSymbolSize
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_END_SYMBOL_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getEndSymbolSize() {
    return endSymbolSize;
  }


  @JsonProperty(value = JSON_PROPERTY_END_SYMBOL_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndSymbolSize(@Nullable Float endSymbolSize) {
    this.endSymbolSize = endSymbolSize;
  }


  public TimeSeriesChartThreshold showLabel(@Nullable Boolean showLabel) {
    this.showLabel = showLabel;
    return this;
  }

  /**
   * Get showLabel
   * @return showLabel
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLabel() {
    return showLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLabel(@Nullable Boolean showLabel) {
    this.showLabel = showLabel;
  }


  public TimeSeriesChartThreshold labelPosition(@Nullable ThresholdLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
    return this;
  }

  /**
   * Get labelPosition
   * @return labelPosition
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ThresholdLabelPosition getLabelPosition() {
    return labelPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelPosition(@Nullable ThresholdLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }


  public TimeSeriesChartThreshold labelFont(@Nullable Font labelFont) {
    this.labelFont = labelFont;
    return this;
  }

  /**
   * Get labelFont
   * @return labelFont
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getLabelFont() {
    return labelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelFont(@Nullable Font labelFont) {
    this.labelFont = labelFont;
  }


  public TimeSeriesChartThreshold labelColor(@Nullable String labelColor) {
    this.labelColor = labelColor;
    return this;
  }

  /**
   * Get labelColor
   * @return labelColor
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabelColor() {
    return labelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelColor(@Nullable String labelColor) {
    this.labelColor = labelColor;
  }


  public TimeSeriesChartThreshold enableLabelBackground(@Nullable Boolean enableLabelBackground) {
    this.enableLabelBackground = enableLabelBackground;
    return this;
  }

  /**
   * Get enableLabelBackground
   * @return enableLabelBackground
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLE_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableLabelBackground() {
    return enableLabelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableLabelBackground(@Nullable Boolean enableLabelBackground) {
    this.enableLabelBackground = enableLabelBackground;
  }


  public TimeSeriesChartThreshold labelBackground(@Nullable String labelBackground) {
    this.labelBackground = labelBackground;
    return this;
  }

  /**
   * Get labelBackground
   * @return labelBackground
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabelBackground() {
    return labelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelBackground(@Nullable String labelBackground) {
    this.labelBackground = labelBackground;
  }


  public TimeSeriesChartThreshold yaxisId(@Nullable String yaxisId) {
    this.yaxisId = yaxisId;
    return this;
  }

  /**
   * Get yaxisId
   * @return yaxisId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_YAXIS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getYaxisId() {
    return yaxisId;
  }


  @JsonProperty(value = JSON_PROPERTY_YAXIS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYaxisId(@Nullable String yaxisId) {
    this.yaxisId = yaxisId;
  }


  /**
   * Return true if this TimeSeriesChartThreshold object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesChartThreshold timeSeriesChartThreshold = (TimeSeriesChartThreshold) o;
    return Objects.equals(this.type, timeSeriesChartThreshold.type) &&
        Objects.equals(this.value, timeSeriesChartThreshold.value) &&
        Objects.equals(this.latestKeyType, timeSeriesChartThreshold.latestKeyType) &&
        Objects.equals(this.latestKey, timeSeriesChartThreshold.latestKey) &&
        Objects.equals(this.entityKeyType, timeSeriesChartThreshold.entityKeyType) &&
        Objects.equals(this.entityAlias, timeSeriesChartThreshold.entityAlias) &&
        Objects.equals(this.entityKey, timeSeriesChartThreshold.entityKey) &&
        Objects.equals(this.yAxisId, timeSeriesChartThreshold.yAxisId) &&
        Objects.equals(this.units, timeSeriesChartThreshold.units) &&
        Objects.equals(this.decimals, timeSeriesChartThreshold.decimals) &&
        Objects.equals(this.lineColor, timeSeriesChartThreshold.lineColor) &&
        Objects.equals(this.lineType, timeSeriesChartThreshold.lineType) &&
        Objects.equals(this.lineWidth, timeSeriesChartThreshold.lineWidth) &&
        Objects.equals(this.startSymbol, timeSeriesChartThreshold.startSymbol) &&
        Objects.equals(this.startSymbolSize, timeSeriesChartThreshold.startSymbolSize) &&
        Objects.equals(this.endSymbol, timeSeriesChartThreshold.endSymbol) &&
        Objects.equals(this.endSymbolSize, timeSeriesChartThreshold.endSymbolSize) &&
        Objects.equals(this.showLabel, timeSeriesChartThreshold.showLabel) &&
        Objects.equals(this.labelPosition, timeSeriesChartThreshold.labelPosition) &&
        Objects.equals(this.labelFont, timeSeriesChartThreshold.labelFont) &&
        Objects.equals(this.labelColor, timeSeriesChartThreshold.labelColor) &&
        Objects.equals(this.enableLabelBackground, timeSeriesChartThreshold.enableLabelBackground) &&
        Objects.equals(this.labelBackground, timeSeriesChartThreshold.labelBackground) &&
        Objects.equals(this.yaxisId, timeSeriesChartThreshold.yaxisId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, latestKeyType, latestKey, entityKeyType, entityAlias, entityKey, yAxisId, units, decimals, lineColor, lineType, lineWidth, startSymbol, startSymbolSize, endSymbol, endSymbolSize, showLabel, labelPosition, labelFont, labelColor, enableLabelBackground, labelBackground, yaxisId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesChartThreshold {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    latestKeyType: ").append(toIndentedString(latestKeyType)).append("\n");
    sb.append("    latestKey: ").append(toIndentedString(latestKey)).append("\n");
    sb.append("    entityKeyType: ").append(toIndentedString(entityKeyType)).append("\n");
    sb.append("    entityAlias: ").append(toIndentedString(entityAlias)).append("\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
    sb.append("    yAxisId: ").append(toIndentedString(yAxisId)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    lineColor: ").append(toIndentedString(lineColor)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    startSymbol: ").append(toIndentedString(startSymbol)).append("\n");
    sb.append("    startSymbolSize: ").append(toIndentedString(startSymbolSize)).append("\n");
    sb.append("    endSymbol: ").append(toIndentedString(endSymbol)).append("\n");
    sb.append("    endSymbolSize: ").append(toIndentedString(endSymbolSize)).append("\n");
    sb.append("    showLabel: ").append(toIndentedString(showLabel)).append("\n");
    sb.append("    labelPosition: ").append(toIndentedString(labelPosition)).append("\n");
    sb.append("    labelFont: ").append(toIndentedString(labelFont)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
    sb.append("    enableLabelBackground: ").append(toIndentedString(enableLabelBackground)).append("\n");
    sb.append("    labelBackground: ").append(toIndentedString(labelBackground)).append("\n");
    sb.append("    yaxisId: ").append(toIndentedString(yaxisId)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `latestKeyType` to the URL query string
    if (getLatestKeyType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestKeyType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestKeyType()))));
    }

    // add `latestKey` to the URL query string
    if (getLatestKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestKey()))));
    }

    // add `entityKeyType` to the URL query string
    if (getEntityKeyType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityKeyType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityKeyType()))));
    }

    // add `entityAlias` to the URL query string
    if (getEntityAlias() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityAlias%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityAlias()))));
    }

    // add `entityKey` to the URL query string
    if (getEntityKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityKey()))));
    }

    // add `yAxisId` to the URL query string
    if (getyAxisId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syAxisId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getyAxisId()))));
    }

    // add `units` to the URL query string
    if (getUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnits()))));
    }

    // add `decimals` to the URL query string
    if (getDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDecimals()))));
    }

    // add `lineColor` to the URL query string
    if (getLineColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineColor()))));
    }

    // add `lineType` to the URL query string
    if (getLineType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineType()))));
    }

    // add `lineWidth` to the URL query string
    if (getLineWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineWidth()))));
    }

    // add `startSymbol` to the URL query string
    if (getStartSymbol() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartSymbol%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartSymbol()))));
    }

    // add `startSymbolSize` to the URL query string
    if (getStartSymbolSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartSymbolSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartSymbolSize()))));
    }

    // add `endSymbol` to the URL query string
    if (getEndSymbol() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendSymbol%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndSymbol()))));
    }

    // add `endSymbolSize` to the URL query string
    if (getEndSymbolSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendSymbolSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndSymbolSize()))));
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

    // add `yaxisId` to the URL query string
    if (getYaxisId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%syaxisId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getYaxisId()))));
    }

    return joiner.toString();
  }
}

