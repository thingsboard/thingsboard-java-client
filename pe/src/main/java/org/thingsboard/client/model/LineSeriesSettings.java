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
import org.thingsboard.client.model.ChartLineType;
import org.thingsboard.client.model.ChartShape;
import org.thingsboard.client.model.Font;
import org.thingsboard.client.model.LineSeriesStepType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LineSeriesSettings
 */
@JsonPropertyOrder({
  LineSeriesSettings.JSON_PROPERTY_SHOW_LINE,
  LineSeriesSettings.JSON_PROPERTY_STEP,
  LineSeriesSettings.JSON_PROPERTY_STEP_TYPE,
  LineSeriesSettings.JSON_PROPERTY_SMOOTH,
  LineSeriesSettings.JSON_PROPERTY_LINE_TYPE,
  LineSeriesSettings.JSON_PROPERTY_LINE_WIDTH,
  LineSeriesSettings.JSON_PROPERTY_SHOW_POINTS,
  LineSeriesSettings.JSON_PROPERTY_SHOW_POINT_LABEL,
  LineSeriesSettings.JSON_PROPERTY_POINT_LABEL_POSITION,
  LineSeriesSettings.JSON_PROPERTY_POINT_LABEL_FONT,
  LineSeriesSettings.JSON_PROPERTY_POINT_LABEL_COLOR,
  LineSeriesSettings.JSON_PROPERTY_ENABLE_POINT_LABEL_BACKGROUND,
  LineSeriesSettings.JSON_PROPERTY_POINT_LABEL_BACKGROUND,
  LineSeriesSettings.JSON_PROPERTY_POINT_SHAPE,
  LineSeriesSettings.JSON_PROPERTY_POINT_SIZE,
  LineSeriesSettings.JSON_PROPERTY_FILL_AREA_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class LineSeriesSettings {
  public static final String JSON_PROPERTY_SHOW_LINE = "showLine";
  @javax.annotation.Nullable
  private Boolean showLine;

  public static final String JSON_PROPERTY_STEP = "step";
  @javax.annotation.Nullable
  private Boolean step;

  public static final String JSON_PROPERTY_STEP_TYPE = "stepType";
  @javax.annotation.Nullable
  private LineSeriesStepType stepType;

  public static final String JSON_PROPERTY_SMOOTH = "smooth";
  @javax.annotation.Nullable
  private Boolean smooth;

  public static final String JSON_PROPERTY_LINE_TYPE = "lineType";
  @javax.annotation.Nullable
  private ChartLineType lineType;

  public static final String JSON_PROPERTY_LINE_WIDTH = "lineWidth";
  @javax.annotation.Nullable
  private Float lineWidth;

  public static final String JSON_PROPERTY_SHOW_POINTS = "showPoints";
  @javax.annotation.Nullable
  private Boolean showPoints;

  public static final String JSON_PROPERTY_SHOW_POINT_LABEL = "showPointLabel";
  @javax.annotation.Nullable
  private Boolean showPointLabel;

  public static final String JSON_PROPERTY_POINT_LABEL_POSITION = "pointLabelPosition";
  @javax.annotation.Nullable
  private ChartLabelPosition pointLabelPosition;

  public static final String JSON_PROPERTY_POINT_LABEL_FONT = "pointLabelFont";
  @javax.annotation.Nullable
  private Font pointLabelFont;

  public static final String JSON_PROPERTY_POINT_LABEL_COLOR = "pointLabelColor";
  @javax.annotation.Nullable
  private String pointLabelColor;

  public static final String JSON_PROPERTY_ENABLE_POINT_LABEL_BACKGROUND = "enablePointLabelBackground";
  @javax.annotation.Nullable
  private Boolean enablePointLabelBackground;

  public static final String JSON_PROPERTY_POINT_LABEL_BACKGROUND = "pointLabelBackground";
  @javax.annotation.Nullable
  private String pointLabelBackground;

  public static final String JSON_PROPERTY_POINT_SHAPE = "pointShape";
  @javax.annotation.Nullable
  private ChartShape pointShape;

  public static final String JSON_PROPERTY_POINT_SIZE = "pointSize";
  @javax.annotation.Nullable
  private Float pointSize;

  public static final String JSON_PROPERTY_FILL_AREA_SETTINGS = "fillAreaSettings";
  @javax.annotation.Nullable
  private ChartFillSettings fillAreaSettings;

  public LineSeriesSettings() { 
  }

  public LineSeriesSettings showLine(@javax.annotation.Nullable Boolean showLine) {
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


  public LineSeriesSettings step(@javax.annotation.Nullable Boolean step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   * @return step
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STEP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getStep() {
    return step;
  }


  @JsonProperty(value = JSON_PROPERTY_STEP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStep(@javax.annotation.Nullable Boolean step) {
    this.step = step;
  }


  public LineSeriesSettings stepType(@javax.annotation.Nullable LineSeriesStepType stepType) {
    this.stepType = stepType;
    return this;
  }

  /**
   * Get stepType
   * @return stepType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STEP_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LineSeriesStepType getStepType() {
    return stepType;
  }


  @JsonProperty(value = JSON_PROPERTY_STEP_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepType(@javax.annotation.Nullable LineSeriesStepType stepType) {
    this.stepType = stepType;
  }


  public LineSeriesSettings smooth(@javax.annotation.Nullable Boolean smooth) {
    this.smooth = smooth;
    return this;
  }

  /**
   * Get smooth
   * @return smooth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SMOOTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSmooth() {
    return smooth;
  }


  @JsonProperty(value = JSON_PROPERTY_SMOOTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmooth(@javax.annotation.Nullable Boolean smooth) {
    this.smooth = smooth;
  }


  public LineSeriesSettings lineType(@javax.annotation.Nullable ChartLineType lineType) {
    this.lineType = lineType;
    return this;
  }

  /**
   * Get lineType
   * @return lineType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartLineType getLineType() {
    return lineType;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(@javax.annotation.Nullable ChartLineType lineType) {
    this.lineType = lineType;
  }


  public LineSeriesSettings lineWidth(@javax.annotation.Nullable Float lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

  /**
   * Get lineWidth
   * @return lineWidth
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LINE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getLineWidth() {
    return lineWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_LINE_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineWidth(@javax.annotation.Nullable Float lineWidth) {
    this.lineWidth = lineWidth;
  }


  public LineSeriesSettings showPoints(@javax.annotation.Nullable Boolean showPoints) {
    this.showPoints = showPoints;
    return this;
  }

  /**
   * Get showPoints
   * @return showPoints
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPoints() {
    return showPoints;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowPoints(@javax.annotation.Nullable Boolean showPoints) {
    this.showPoints = showPoints;
  }


  public LineSeriesSettings showPointLabel(@javax.annotation.Nullable Boolean showPointLabel) {
    this.showPointLabel = showPointLabel;
    return this;
  }

  /**
   * Get showPointLabel
   * @return showPointLabel
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_POINT_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPointLabel() {
    return showPointLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_POINT_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowPointLabel(@javax.annotation.Nullable Boolean showPointLabel) {
    this.showPointLabel = showPointLabel;
  }


  public LineSeriesSettings pointLabelPosition(@javax.annotation.Nullable ChartLabelPosition pointLabelPosition) {
    this.pointLabelPosition = pointLabelPosition;
    return this;
  }

  /**
   * Get pointLabelPosition
   * @return pointLabelPosition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartLabelPosition getPointLabelPosition() {
    return pointLabelPosition;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointLabelPosition(@javax.annotation.Nullable ChartLabelPosition pointLabelPosition) {
    this.pointLabelPosition = pointLabelPosition;
  }


  public LineSeriesSettings pointLabelFont(@javax.annotation.Nullable Font pointLabelFont) {
    this.pointLabelFont = pointLabelFont;
    return this;
  }

  /**
   * Get pointLabelFont
   * @return pointLabelFont
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Font getPointLabelFont() {
    return pointLabelFont;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_FONT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointLabelFont(@javax.annotation.Nullable Font pointLabelFont) {
    this.pointLabelFont = pointLabelFont;
  }


  public LineSeriesSettings pointLabelColor(@javax.annotation.Nullable String pointLabelColor) {
    this.pointLabelColor = pointLabelColor;
    return this;
  }

  /**
   * Get pointLabelColor
   * @return pointLabelColor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPointLabelColor() {
    return pointLabelColor;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointLabelColor(@javax.annotation.Nullable String pointLabelColor) {
    this.pointLabelColor = pointLabelColor;
  }


  public LineSeriesSettings enablePointLabelBackground(@javax.annotation.Nullable Boolean enablePointLabelBackground) {
    this.enablePointLabelBackground = enablePointLabelBackground;
    return this;
  }

  /**
   * Get enablePointLabelBackground
   * @return enablePointLabelBackground
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLE_POINT_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnablePointLabelBackground() {
    return enablePointLabelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLE_POINT_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePointLabelBackground(@javax.annotation.Nullable Boolean enablePointLabelBackground) {
    this.enablePointLabelBackground = enablePointLabelBackground;
  }


  public LineSeriesSettings pointLabelBackground(@javax.annotation.Nullable String pointLabelBackground) {
    this.pointLabelBackground = pointLabelBackground;
    return this;
  }

  /**
   * Get pointLabelBackground
   * @return pointLabelBackground
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPointLabelBackground() {
    return pointLabelBackground;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_LABEL_BACKGROUND, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointLabelBackground(@javax.annotation.Nullable String pointLabelBackground) {
    this.pointLabelBackground = pointLabelBackground;
  }


  public LineSeriesSettings pointShape(@javax.annotation.Nullable ChartShape pointShape) {
    this.pointShape = pointShape;
    return this;
  }

  /**
   * Get pointShape
   * @return pointShape
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_SHAPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartShape getPointShape() {
    return pointShape;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_SHAPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointShape(@javax.annotation.Nullable ChartShape pointShape) {
    this.pointShape = pointShape;
  }


  public LineSeriesSettings pointSize(@javax.annotation.Nullable Float pointSize) {
    this.pointSize = pointSize;
    return this;
  }

  /**
   * Get pointSize
   * @return pointSize
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POINT_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getPointSize() {
    return pointSize;
  }


  @JsonProperty(value = JSON_PROPERTY_POINT_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointSize(@javax.annotation.Nullable Float pointSize) {
    this.pointSize = pointSize;
  }


  public LineSeriesSettings fillAreaSettings(@javax.annotation.Nullable ChartFillSettings fillAreaSettings) {
    this.fillAreaSettings = fillAreaSettings;
    return this;
  }

  /**
   * Get fillAreaSettings
   * @return fillAreaSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILL_AREA_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChartFillSettings getFillAreaSettings() {
    return fillAreaSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_FILL_AREA_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillAreaSettings(@javax.annotation.Nullable ChartFillSettings fillAreaSettings) {
    this.fillAreaSettings = fillAreaSettings;
  }


  /**
   * Return true if this LineSeriesSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineSeriesSettings lineSeriesSettings = (LineSeriesSettings) o;
    return Objects.equals(this.showLine, lineSeriesSettings.showLine) &&
        Objects.equals(this.step, lineSeriesSettings.step) &&
        Objects.equals(this.stepType, lineSeriesSettings.stepType) &&
        Objects.equals(this.smooth, lineSeriesSettings.smooth) &&
        Objects.equals(this.lineType, lineSeriesSettings.lineType) &&
        Objects.equals(this.lineWidth, lineSeriesSettings.lineWidth) &&
        Objects.equals(this.showPoints, lineSeriesSettings.showPoints) &&
        Objects.equals(this.showPointLabel, lineSeriesSettings.showPointLabel) &&
        Objects.equals(this.pointLabelPosition, lineSeriesSettings.pointLabelPosition) &&
        Objects.equals(this.pointLabelFont, lineSeriesSettings.pointLabelFont) &&
        Objects.equals(this.pointLabelColor, lineSeriesSettings.pointLabelColor) &&
        Objects.equals(this.enablePointLabelBackground, lineSeriesSettings.enablePointLabelBackground) &&
        Objects.equals(this.pointLabelBackground, lineSeriesSettings.pointLabelBackground) &&
        Objects.equals(this.pointShape, lineSeriesSettings.pointShape) &&
        Objects.equals(this.pointSize, lineSeriesSettings.pointSize) &&
        Objects.equals(this.fillAreaSettings, lineSeriesSettings.fillAreaSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showLine, step, stepType, smooth, lineType, lineWidth, showPoints, showPointLabel, pointLabelPosition, pointLabelFont, pointLabelColor, enablePointLabelBackground, pointLabelBackground, pointShape, pointSize, fillAreaSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineSeriesSettings {\n");
    sb.append("    showLine: ").append(toIndentedString(showLine)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    smooth: ").append(toIndentedString(smooth)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    showPoints: ").append(toIndentedString(showPoints)).append("\n");
    sb.append("    showPointLabel: ").append(toIndentedString(showPointLabel)).append("\n");
    sb.append("    pointLabelPosition: ").append(toIndentedString(pointLabelPosition)).append("\n");
    sb.append("    pointLabelFont: ").append(toIndentedString(pointLabelFont)).append("\n");
    sb.append("    pointLabelColor: ").append(toIndentedString(pointLabelColor)).append("\n");
    sb.append("    enablePointLabelBackground: ").append(toIndentedString(enablePointLabelBackground)).append("\n");
    sb.append("    pointLabelBackground: ").append(toIndentedString(pointLabelBackground)).append("\n");
    sb.append("    pointShape: ").append(toIndentedString(pointShape)).append("\n");
    sb.append("    pointSize: ").append(toIndentedString(pointSize)).append("\n");
    sb.append("    fillAreaSettings: ").append(toIndentedString(fillAreaSettings)).append("\n");
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

    // add `showLine` to the URL query string
    if (getShowLine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLine%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLine()))));
    }

    // add `step` to the URL query string
    if (getStep() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstep%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStep()))));
    }

    // add `stepType` to the URL query string
    if (getStepType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstepType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStepType()))));
    }

    // add `smooth` to the URL query string
    if (getSmooth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssmooth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmooth()))));
    }

    // add `lineType` to the URL query string
    if (getLineType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineType()))));
    }

    // add `lineWidth` to the URL query string
    if (getLineWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slineWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLineWidth()))));
    }

    // add `showPoints` to the URL query string
    if (getShowPoints() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowPoints%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowPoints()))));
    }

    // add `showPointLabel` to the URL query string
    if (getShowPointLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowPointLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowPointLabel()))));
    }

    // add `pointLabelPosition` to the URL query string
    if (getPointLabelPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spointLabelPosition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPointLabelPosition()))));
    }

    // add `pointLabelFont` to the URL query string
    if (getPointLabelFont() != null) {
      joiner.add(getPointLabelFont().toUrlQueryString(prefix + "pointLabelFont" + suffix));
    }

    // add `pointLabelColor` to the URL query string
    if (getPointLabelColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spointLabelColor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPointLabelColor()))));
    }

    // add `enablePointLabelBackground` to the URL query string
    if (getEnablePointLabelBackground() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senablePointLabelBackground%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnablePointLabelBackground()))));
    }

    // add `pointLabelBackground` to the URL query string
    if (getPointLabelBackground() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spointLabelBackground%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPointLabelBackground()))));
    }

    // add `pointShape` to the URL query string
    if (getPointShape() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spointShape%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPointShape()))));
    }

    // add `pointSize` to the URL query string
    if (getPointSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spointSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPointSize()))));
    }

    // add `fillAreaSettings` to the URL query string
    if (getFillAreaSettings() != null) {
      joiner.add(getFillAreaSettings().toUrlQueryString(prefix + "fillAreaSettings" + suffix));
    }

    return joiner.toString();
  }
}

