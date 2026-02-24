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
import org.thingsboard.client.model.LegendPosition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LegendConfig
 */
@JsonPropertyOrder({
  LegendConfig.JSON_PROPERTY_POSITION,
  LegendConfig.JSON_PROPERTY_SORT_DATA_KEYS,
  LegendConfig.JSON_PROPERTY_SHOW_MIN,
  LegendConfig.JSON_PROPERTY_SHOW_MAX,
  LegendConfig.JSON_PROPERTY_SHOW_AVG,
  LegendConfig.JSON_PROPERTY_SHOW_TOTAL,
  LegendConfig.JSON_PROPERTY_SHOW_LATEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LegendConfig {
  public static final String JSON_PROPERTY_POSITION = "position";
  @javax.annotation.Nullable
  private LegendPosition position;

  public static final String JSON_PROPERTY_SORT_DATA_KEYS = "sortDataKeys";
  @javax.annotation.Nullable
  private Boolean sortDataKeys;

  public static final String JSON_PROPERTY_SHOW_MIN = "showMin";
  @javax.annotation.Nullable
  private Boolean showMin;

  public static final String JSON_PROPERTY_SHOW_MAX = "showMax";
  @javax.annotation.Nullable
  private Boolean showMax;

  public static final String JSON_PROPERTY_SHOW_AVG = "showAvg";
  @javax.annotation.Nullable
  private Boolean showAvg;

  public static final String JSON_PROPERTY_SHOW_TOTAL = "showTotal";
  @javax.annotation.Nullable
  private Boolean showTotal;

  public static final String JSON_PROPERTY_SHOW_LATEST = "showLatest";
  @javax.annotation.Nullable
  private Boolean showLatest;

  public LegendConfig() { 
  }

  public LegendConfig position(@javax.annotation.Nullable LegendPosition position) {
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
  public LegendPosition getPosition() {
    return position;
  }


  @JsonProperty(value = JSON_PROPERTY_POSITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(@javax.annotation.Nullable LegendPosition position) {
    this.position = position;
  }


  public LegendConfig sortDataKeys(@javax.annotation.Nullable Boolean sortDataKeys) {
    this.sortDataKeys = sortDataKeys;
    return this;
  }

  /**
   * Get sortDataKeys
   * @return sortDataKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SORT_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSortDataKeys() {
    return sortDataKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_SORT_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortDataKeys(@javax.annotation.Nullable Boolean sortDataKeys) {
    this.sortDataKeys = sortDataKeys;
  }


  public LegendConfig showMin(@javax.annotation.Nullable Boolean showMin) {
    this.showMin = showMin;
    return this;
  }

  /**
   * Get showMin
   * @return showMin
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowMin() {
    return showMin;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_MIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowMin(@javax.annotation.Nullable Boolean showMin) {
    this.showMin = showMin;
  }


  public LegendConfig showMax(@javax.annotation.Nullable Boolean showMax) {
    this.showMax = showMax;
    return this;
  }

  /**
   * Get showMax
   * @return showMax
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowMax() {
    return showMax;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_MAX, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowMax(@javax.annotation.Nullable Boolean showMax) {
    this.showMax = showMax;
  }


  public LegendConfig showAvg(@javax.annotation.Nullable Boolean showAvg) {
    this.showAvg = showAvg;
    return this;
  }

  /**
   * Get showAvg
   * @return showAvg
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_AVG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowAvg() {
    return showAvg;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_AVG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAvg(@javax.annotation.Nullable Boolean showAvg) {
    this.showAvg = showAvg;
  }


  public LegendConfig showTotal(@javax.annotation.Nullable Boolean showTotal) {
    this.showTotal = showTotal;
    return this;
  }

  /**
   * Get showTotal
   * @return showTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTotal() {
    return showTotal;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowTotal(@javax.annotation.Nullable Boolean showTotal) {
    this.showTotal = showTotal;
  }


  public LegendConfig showLatest(@javax.annotation.Nullable Boolean showLatest) {
    this.showLatest = showLatest;
    return this;
  }

  /**
   * Get showLatest
   * @return showLatest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLatest() {
    return showLatest;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowLatest(@javax.annotation.Nullable Boolean showLatest) {
    this.showLatest = showLatest;
  }


  /**
   * Return true if this LegendConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegendConfig legendConfig = (LegendConfig) o;
    return Objects.equals(this.position, legendConfig.position) &&
        Objects.equals(this.sortDataKeys, legendConfig.sortDataKeys) &&
        Objects.equals(this.showMin, legendConfig.showMin) &&
        Objects.equals(this.showMax, legendConfig.showMax) &&
        Objects.equals(this.showAvg, legendConfig.showAvg) &&
        Objects.equals(this.showTotal, legendConfig.showTotal) &&
        Objects.equals(this.showLatest, legendConfig.showLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, sortDataKeys, showMin, showMax, showAvg, showTotal, showLatest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegendConfig {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    sortDataKeys: ").append(toIndentedString(sortDataKeys)).append("\n");
    sb.append("    showMin: ").append(toIndentedString(showMin)).append("\n");
    sb.append("    showMax: ").append(toIndentedString(showMax)).append("\n");
    sb.append("    showAvg: ").append(toIndentedString(showAvg)).append("\n");
    sb.append("    showTotal: ").append(toIndentedString(showTotal)).append("\n");
    sb.append("    showLatest: ").append(toIndentedString(showLatest)).append("\n");
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

    // add `position` to the URL query string
    if (getPosition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sposition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPosition()))));
    }

    // add `sortDataKeys` to the URL query string
    if (getSortDataKeys() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssortDataKeys%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSortDataKeys()))));
    }

    // add `showMin` to the URL query string
    if (getShowMin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowMin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowMin()))));
    }

    // add `showMax` to the URL query string
    if (getShowMax() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowMax%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowMax()))));
    }

    // add `showAvg` to the URL query string
    if (getShowAvg() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowAvg%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowAvg()))));
    }

    // add `showTotal` to the URL query string
    if (getShowTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowTotal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowTotal()))));
    }

    // add `showLatest` to the URL query string
    if (getShowLatest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowLatest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowLatest()))));
    }

    return joiner.toString();
  }
}

