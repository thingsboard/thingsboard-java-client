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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DataKeyComparisonSettings
 */
@JsonPropertyOrder({
  DataKeyComparisonSettings.JSON_PROPERTY_SHOW_VALUES_FOR_COMPARISON,
  DataKeyComparisonSettings.JSON_PROPERTY_COMPARISON_VALUES_LABEL,
  DataKeyComparisonSettings.JSON_PROPERTY_COLOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DataKeyComparisonSettings {
  public static final String JSON_PROPERTY_SHOW_VALUES_FOR_COMPARISON = "showValuesForComparison";
  @javax.annotation.Nullable
  private Boolean showValuesForComparison;

  public static final String JSON_PROPERTY_COMPARISON_VALUES_LABEL = "comparisonValuesLabel";
  @javax.annotation.Nullable
  private String comparisonValuesLabel;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private String color;

  public DataKeyComparisonSettings() { 
  }

  public DataKeyComparisonSettings showValuesForComparison(@javax.annotation.Nullable Boolean showValuesForComparison) {
    this.showValuesForComparison = showValuesForComparison;
    return this;
  }

  /**
   * Get showValuesForComparison
   * @return showValuesForComparison
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_VALUES_FOR_COMPARISON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowValuesForComparison() {
    return showValuesForComparison;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_VALUES_FOR_COMPARISON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowValuesForComparison(@javax.annotation.Nullable Boolean showValuesForComparison) {
    this.showValuesForComparison = showValuesForComparison;
  }


  public DataKeyComparisonSettings comparisonValuesLabel(@javax.annotation.Nullable String comparisonValuesLabel) {
    this.comparisonValuesLabel = comparisonValuesLabel;
    return this;
  }

  /**
   * Get comparisonValuesLabel
   * @return comparisonValuesLabel
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPARISON_VALUES_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getComparisonValuesLabel() {
    return comparisonValuesLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPARISON_VALUES_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparisonValuesLabel(@javax.annotation.Nullable String comparisonValuesLabel) {
    this.comparisonValuesLabel = comparisonValuesLabel;
  }


  public DataKeyComparisonSettings color(@javax.annotation.Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColor() {
    return color;
  }


  @JsonProperty(value = JSON_PROPERTY_COLOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(@javax.annotation.Nullable String color) {
    this.color = color;
  }


  /**
   * Return true if this DataKeyComparisonSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataKeyComparisonSettings dataKeyComparisonSettings = (DataKeyComparisonSettings) o;
    return Objects.equals(this.showValuesForComparison, dataKeyComparisonSettings.showValuesForComparison) &&
        Objects.equals(this.comparisonValuesLabel, dataKeyComparisonSettings.comparisonValuesLabel) &&
        Objects.equals(this.color, dataKeyComparisonSettings.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showValuesForComparison, comparisonValuesLabel, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataKeyComparisonSettings {\n");
    sb.append("    showValuesForComparison: ").append(toIndentedString(showValuesForComparison)).append("\n");
    sb.append("    comparisonValuesLabel: ").append(toIndentedString(comparisonValuesLabel)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

    // add `showValuesForComparison` to the URL query string
    if (getShowValuesForComparison() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowValuesForComparison%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowValuesForComparison()))));
    }

    // add `comparisonValuesLabel` to the URL query string
    if (getComparisonValuesLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomparisonValuesLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComparisonValuesLabel()))));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    return joiner.toString();
  }
}

