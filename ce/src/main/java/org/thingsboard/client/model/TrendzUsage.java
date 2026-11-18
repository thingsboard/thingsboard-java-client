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
import org.thingsboard.client.model.Entity;
import org.thingsboard.client.model.SimpleEntity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TrendzUsage
 */
@JsonPropertyOrder({
  TrendzUsage.JSON_PROPERTY_USED,
  TrendzUsage.JSON_PROPERTY_ANOMALY_USAGE,
  TrendzUsage.JSON_PROPERTY_PREDICTION_USAGE,
  TrendzUsage.JSON_PROPERTY_CALCULATION_USAGE,
  TrendzUsage.JSON_PROPERTY_VIEW_USAGE,
  TrendzUsage.JSON_PROPERTY_METRIC_USAGE,
  TrendzUsage.JSON_PROPERTY_CHAT_USAGE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TrendzUsage {
  public static final String JSON_PROPERTY_USED = "used";
  @Nullable
  private Boolean used;

  public static final String JSON_PROPERTY_ANOMALY_USAGE = "anomalyUsage";
  @Nullable
  private Entity anomalyUsage;

  public static final String JSON_PROPERTY_PREDICTION_USAGE = "predictionUsage";
  @Nullable
  private Entity predictionUsage;

  public static final String JSON_PROPERTY_CALCULATION_USAGE = "calculationUsage";
  @Nullable
  private Entity calculationUsage;

  public static final String JSON_PROPERTY_VIEW_USAGE = "viewUsage";
  @Nullable
  private SimpleEntity viewUsage;

  public static final String JSON_PROPERTY_METRIC_USAGE = "metricUsage";
  @Nullable
  private SimpleEntity metricUsage;

  public static final String JSON_PROPERTY_CHAT_USAGE = "chatUsage";
  @Nullable
  private SimpleEntity chatUsage;

  public TrendzUsage() { 
  }

  public TrendzUsage used(@Nullable Boolean used) {
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsed() {
    return used;
  }


  @JsonProperty(value = JSON_PROPERTY_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsed(@Nullable Boolean used) {
    this.used = used;
  }


  public TrendzUsage anomalyUsage(@Nullable Entity anomalyUsage) {
    this.anomalyUsage = anomalyUsage;
    return this;
  }

  /**
   * Get anomalyUsage
   * @return anomalyUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ANOMALY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Entity getAnomalyUsage() {
    return anomalyUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_ANOMALY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnomalyUsage(@Nullable Entity anomalyUsage) {
    this.anomalyUsage = anomalyUsage;
  }


  public TrendzUsage predictionUsage(@Nullable Entity predictionUsage) {
    this.predictionUsage = predictionUsage;
    return this;
  }

  /**
   * Get predictionUsage
   * @return predictionUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PREDICTION_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Entity getPredictionUsage() {
    return predictionUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_PREDICTION_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictionUsage(@Nullable Entity predictionUsage) {
    this.predictionUsage = predictionUsage;
  }


  public TrendzUsage calculationUsage(@Nullable Entity calculationUsage) {
    this.calculationUsage = calculationUsage;
    return this;
  }

  /**
   * Get calculationUsage
   * @return calculationUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CALCULATION_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Entity getCalculationUsage() {
    return calculationUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_CALCULATION_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculationUsage(@Nullable Entity calculationUsage) {
    this.calculationUsage = calculationUsage;
  }


  public TrendzUsage viewUsage(@Nullable SimpleEntity viewUsage) {
    this.viewUsage = viewUsage;
    return this;
  }

  /**
   * Get viewUsage
   * @return viewUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VIEW_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SimpleEntity getViewUsage() {
    return viewUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_VIEW_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewUsage(@Nullable SimpleEntity viewUsage) {
    this.viewUsage = viewUsage;
  }


  public TrendzUsage metricUsage(@Nullable SimpleEntity metricUsage) {
    this.metricUsage = metricUsage;
    return this;
  }

  /**
   * Get metricUsage
   * @return metricUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_METRIC_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SimpleEntity getMetricUsage() {
    return metricUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_METRIC_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricUsage(@Nullable SimpleEntity metricUsage) {
    this.metricUsage = metricUsage;
  }


  public TrendzUsage chatUsage(@Nullable SimpleEntity chatUsage) {
    this.chatUsage = chatUsage;
    return this;
  }

  /**
   * Get chatUsage
   * @return chatUsage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CHAT_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SimpleEntity getChatUsage() {
    return chatUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAT_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChatUsage(@Nullable SimpleEntity chatUsage) {
    this.chatUsage = chatUsage;
  }


  /**
   * Return true if this TrendzUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendzUsage trendzUsage = (TrendzUsage) o;
    return Objects.equals(this.used, trendzUsage.used) &&
        Objects.equals(this.anomalyUsage, trendzUsage.anomalyUsage) &&
        Objects.equals(this.predictionUsage, trendzUsage.predictionUsage) &&
        Objects.equals(this.calculationUsage, trendzUsage.calculationUsage) &&
        Objects.equals(this.viewUsage, trendzUsage.viewUsage) &&
        Objects.equals(this.metricUsage, trendzUsage.metricUsage) &&
        Objects.equals(this.chatUsage, trendzUsage.chatUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(used, anomalyUsage, predictionUsage, calculationUsage, viewUsage, metricUsage, chatUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendzUsage {\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    anomalyUsage: ").append(toIndentedString(anomalyUsage)).append("\n");
    sb.append("    predictionUsage: ").append(toIndentedString(predictionUsage)).append("\n");
    sb.append("    calculationUsage: ").append(toIndentedString(calculationUsage)).append("\n");
    sb.append("    viewUsage: ").append(toIndentedString(viewUsage)).append("\n");
    sb.append("    metricUsage: ").append(toIndentedString(metricUsage)).append("\n");
    sb.append("    chatUsage: ").append(toIndentedString(chatUsage)).append("\n");
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

    // add `used` to the URL query string
    if (getUsed() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sused%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsed()))));
    }

    // add `anomalyUsage` to the URL query string
    if (getAnomalyUsage() != null) {
      joiner.add(getAnomalyUsage().toUrlQueryString(prefix + "anomalyUsage" + suffix));
    }

    // add `predictionUsage` to the URL query string
    if (getPredictionUsage() != null) {
      joiner.add(getPredictionUsage().toUrlQueryString(prefix + "predictionUsage" + suffix));
    }

    // add `calculationUsage` to the URL query string
    if (getCalculationUsage() != null) {
      joiner.add(getCalculationUsage().toUrlQueryString(prefix + "calculationUsage" + suffix));
    }

    // add `viewUsage` to the URL query string
    if (getViewUsage() != null) {
      joiner.add(getViewUsage().toUrlQueryString(prefix + "viewUsage" + suffix));
    }

    // add `metricUsage` to the URL query string
    if (getMetricUsage() != null) {
      joiner.add(getMetricUsage().toUrlQueryString(prefix + "metricUsage" + suffix));
    }

    // add `chatUsage` to the URL query string
    if (getChatUsage() != null) {
      joiner.add(getChatUsage().toUrlQueryString(prefix + "chatUsage" + suffix));
    }

    return joiner.toString();
  }
}

