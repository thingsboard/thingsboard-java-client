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
import org.thingsboard.client.model.Aggregation;
import org.thingsboard.client.model.DataKeySettings;
import org.thingsboard.client.model.TimeWindowConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DataKey
 */
@JsonPropertyOrder({
  DataKey.JSON_PROPERTY_NAME,
  DataKey.JSON_PROPERTY_TYPE,
  DataKey.JSON_PROPERTY_LABEL,
  DataKey.JSON_PROPERTY_COLOR,
  DataKey.JSON_PROPERTY_DECIMALS,
  DataKey.JSON_PROPERTY_UNITS,
  DataKey.JSON_PROPERTY_AGGREGATION_TYPE,
  DataKey.JSON_PROPERTY_TIMEWINDOW,
  DataKey.JSON_PROPERTY_USE_POST_PROCESSING,
  DataKey.JSON_PROPERTY_POST_FUNC_BODY,
  DataKey.JSON_PROPERTY_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DataKey {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_COLOR = "color";
  @javax.annotation.Nullable
  private String color;

  public static final String JSON_PROPERTY_DECIMALS = "decimals";
  @javax.annotation.Nullable
  private Integer decimals;

  public static final String JSON_PROPERTY_UNITS = "units";
  @javax.annotation.Nullable
  private String units;

  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregationType";
  @javax.annotation.Nullable
  private Aggregation aggregationType;

  public static final String JSON_PROPERTY_TIMEWINDOW = "timewindow";
  @javax.annotation.Nullable
  private TimeWindowConfiguration timewindow;

  public static final String JSON_PROPERTY_USE_POST_PROCESSING = "usePostProcessing";
  @javax.annotation.Nullable
  private Boolean usePostProcessing;

  public static final String JSON_PROPERTY_POST_FUNC_BODY = "postFuncBody";
  @javax.annotation.Nullable
  private String postFuncBody;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  @javax.annotation.Nullable
  private DataKeySettings settings;

  public DataKey() { 
  }

  public DataKey name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public DataKey type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public DataKey label(@javax.annotation.Nullable String label) {
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


  public DataKey color(@javax.annotation.Nullable String color) {
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


  public DataKey decimals(@javax.annotation.Nullable Integer decimals) {
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


  public DataKey units(@javax.annotation.Nullable String units) {
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


  public DataKey aggregationType(@javax.annotation.Nullable Aggregation aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

  /**
   * Get aggregationType
   * @return aggregationType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AGGREGATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Aggregation getAggregationType() {
    return aggregationType;
  }


  @JsonProperty(value = JSON_PROPERTY_AGGREGATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationType(@javax.annotation.Nullable Aggregation aggregationType) {
    this.aggregationType = aggregationType;
  }


  public DataKey timewindow(@javax.annotation.Nullable TimeWindowConfiguration timewindow) {
    this.timewindow = timewindow;
    return this;
  }

  /**
   * Get timewindow
   * @return timewindow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeWindowConfiguration getTimewindow() {
    return timewindow;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimewindow(@javax.annotation.Nullable TimeWindowConfiguration timewindow) {
    this.timewindow = timewindow;
  }


  public DataKey usePostProcessing(@javax.annotation.Nullable Boolean usePostProcessing) {
    this.usePostProcessing = usePostProcessing;
    return this;
  }

  /**
   * Get usePostProcessing
   * @return usePostProcessing
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_POST_PROCESSING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsePostProcessing() {
    return usePostProcessing;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_POST_PROCESSING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePostProcessing(@javax.annotation.Nullable Boolean usePostProcessing) {
    this.usePostProcessing = usePostProcessing;
  }


  public DataKey postFuncBody(@javax.annotation.Nullable String postFuncBody) {
    this.postFuncBody = postFuncBody;
    return this;
  }

  /**
   * Get postFuncBody
   * @return postFuncBody
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POST_FUNC_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPostFuncBody() {
    return postFuncBody;
  }


  @JsonProperty(value = JSON_PROPERTY_POST_FUNC_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostFuncBody(@javax.annotation.Nullable String postFuncBody) {
    this.postFuncBody = postFuncBody;
  }


  public DataKey settings(@javax.annotation.Nullable DataKeySettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DataKeySettings getSettings() {
    return settings;
  }


  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(@javax.annotation.Nullable DataKeySettings settings) {
    this.settings = settings;
  }


  /**
   * Return true if this DataKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataKey dataKey = (DataKey) o;
    return Objects.equals(this.name, dataKey.name) &&
        Objects.equals(this.type, dataKey.type) &&
        Objects.equals(this.label, dataKey.label) &&
        Objects.equals(this.color, dataKey.color) &&
        Objects.equals(this.decimals, dataKey.decimals) &&
        Objects.equals(this.units, dataKey.units) &&
        Objects.equals(this.aggregationType, dataKey.aggregationType) &&
        Objects.equals(this.timewindow, dataKey.timewindow) &&
        Objects.equals(this.usePostProcessing, dataKey.usePostProcessing) &&
        Objects.equals(this.postFuncBody, dataKey.postFuncBody) &&
        Objects.equals(this.settings, dataKey.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, label, color, decimals, units, aggregationType, timewindow, usePostProcessing, postFuncBody, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    timewindow: ").append(toIndentedString(timewindow)).append("\n");
    sb.append("    usePostProcessing: ").append(toIndentedString(usePostProcessing)).append("\n");
    sb.append("    postFuncBody: ").append(toIndentedString(postFuncBody)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColor()))));
    }

    // add `decimals` to the URL query string
    if (getDecimals() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdecimals%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDecimals()))));
    }

    // add `units` to the URL query string
    if (getUnits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sunits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUnits()))));
    }

    // add `aggregationType` to the URL query string
    if (getAggregationType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saggregationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAggregationType()))));
    }

    // add `timewindow` to the URL query string
    if (getTimewindow() != null) {
      joiner.add(getTimewindow().toUrlQueryString(prefix + "timewindow" + suffix));
    }

    // add `usePostProcessing` to the URL query string
    if (getUsePostProcessing() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susePostProcessing%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsePostProcessing()))));
    }

    // add `postFuncBody` to the URL query string
    if (getPostFuncBody() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spostFuncBody%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPostFuncBody()))));
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(getSettings().toUrlQueryString(prefix + "settings" + suffix));
    }

    return joiner.toString();
  }
}

