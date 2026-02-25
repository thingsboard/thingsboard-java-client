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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TrendzSummary
 */
@JsonPropertyOrder({
  TrendzSummary.JSON_PROPERTY_METRIC_SUMMARY_ITEMS,
  TrendzSummary.JSON_PROPERTY_ANOMALY_MODEL_SUMMARY_ITEMS,
  TrendzSummary.JSON_PROPERTY_CALCULATION_FIELD_SUMMARY_ITEMS,
  TrendzSummary.JSON_PROPERTY_PREDICTION_MODEL_SUMMARY_ITEMS,
  TrendzSummary.JSON_PROPERTY_VIEW_SUMMARY_ITEMS,
  TrendzSummary.JSON_PROPERTY_AI_SUMMARY_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TrendzSummary {
  public static final String JSON_PROPERTY_METRIC_SUMMARY_ITEMS = "metricSummaryItems";
  @javax.annotation.Nullable
  private List<Object> metricSummaryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_ANOMALY_MODEL_SUMMARY_ITEMS = "anomalyModelSummaryItems";
  @javax.annotation.Nullable
  private List<Object> anomalyModelSummaryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_CALCULATION_FIELD_SUMMARY_ITEMS = "calculationFieldSummaryItems";
  @javax.annotation.Nullable
  private List<Object> calculationFieldSummaryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_PREDICTION_MODEL_SUMMARY_ITEMS = "predictionModelSummaryItems";
  @javax.annotation.Nullable
  private List<Object> predictionModelSummaryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_VIEW_SUMMARY_ITEMS = "viewSummaryItems";
  @javax.annotation.Nullable
  private List<Object> viewSummaryItems = new ArrayList<>();

  public static final String JSON_PROPERTY_AI_SUMMARY_ITEMS = "aiSummaryItems";
  @javax.annotation.Nullable
  private List<Object> aiSummaryItems = new ArrayList<>();

  public TrendzSummary() { 
  }

  public TrendzSummary metricSummaryItems(@javax.annotation.Nullable List<Object> metricSummaryItems) {
    this.metricSummaryItems = metricSummaryItems;
    return this;
  }

  public TrendzSummary addMetricSummaryItemsItem(Object metricSummaryItemsItem) {
    if (this.metricSummaryItems == null) {
      this.metricSummaryItems = new ArrayList<>();
    }
    this.metricSummaryItems.add(metricSummaryItemsItem);
    return this;
  }

  /**
   * Get metricSummaryItems
   * @return metricSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_METRIC_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getMetricSummaryItems() {
    return metricSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_METRIC_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricSummaryItems(@javax.annotation.Nullable List<Object> metricSummaryItems) {
    this.metricSummaryItems = metricSummaryItems;
  }


  public TrendzSummary anomalyModelSummaryItems(@javax.annotation.Nullable List<Object> anomalyModelSummaryItems) {
    this.anomalyModelSummaryItems = anomalyModelSummaryItems;
    return this;
  }

  public TrendzSummary addAnomalyModelSummaryItemsItem(Object anomalyModelSummaryItemsItem) {
    if (this.anomalyModelSummaryItems == null) {
      this.anomalyModelSummaryItems = new ArrayList<>();
    }
    this.anomalyModelSummaryItems.add(anomalyModelSummaryItemsItem);
    return this;
  }

  /**
   * Get anomalyModelSummaryItems
   * @return anomalyModelSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANOMALY_MODEL_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getAnomalyModelSummaryItems() {
    return anomalyModelSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_ANOMALY_MODEL_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnomalyModelSummaryItems(@javax.annotation.Nullable List<Object> anomalyModelSummaryItems) {
    this.anomalyModelSummaryItems = anomalyModelSummaryItems;
  }


  public TrendzSummary calculationFieldSummaryItems(@javax.annotation.Nullable List<Object> calculationFieldSummaryItems) {
    this.calculationFieldSummaryItems = calculationFieldSummaryItems;
    return this;
  }

  public TrendzSummary addCalculationFieldSummaryItemsItem(Object calculationFieldSummaryItemsItem) {
    if (this.calculationFieldSummaryItems == null) {
      this.calculationFieldSummaryItems = new ArrayList<>();
    }
    this.calculationFieldSummaryItems.add(calculationFieldSummaryItemsItem);
    return this;
  }

  /**
   * Get calculationFieldSummaryItems
   * @return calculationFieldSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CALCULATION_FIELD_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getCalculationFieldSummaryItems() {
    return calculationFieldSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_CALCULATION_FIELD_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculationFieldSummaryItems(@javax.annotation.Nullable List<Object> calculationFieldSummaryItems) {
    this.calculationFieldSummaryItems = calculationFieldSummaryItems;
  }


  public TrendzSummary predictionModelSummaryItems(@javax.annotation.Nullable List<Object> predictionModelSummaryItems) {
    this.predictionModelSummaryItems = predictionModelSummaryItems;
    return this;
  }

  public TrendzSummary addPredictionModelSummaryItemsItem(Object predictionModelSummaryItemsItem) {
    if (this.predictionModelSummaryItems == null) {
      this.predictionModelSummaryItems = new ArrayList<>();
    }
    this.predictionModelSummaryItems.add(predictionModelSummaryItemsItem);
    return this;
  }

  /**
   * Get predictionModelSummaryItems
   * @return predictionModelSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREDICTION_MODEL_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getPredictionModelSummaryItems() {
    return predictionModelSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_PREDICTION_MODEL_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictionModelSummaryItems(@javax.annotation.Nullable List<Object> predictionModelSummaryItems) {
    this.predictionModelSummaryItems = predictionModelSummaryItems;
  }


  public TrendzSummary viewSummaryItems(@javax.annotation.Nullable List<Object> viewSummaryItems) {
    this.viewSummaryItems = viewSummaryItems;
    return this;
  }

  public TrendzSummary addViewSummaryItemsItem(Object viewSummaryItemsItem) {
    if (this.viewSummaryItems == null) {
      this.viewSummaryItems = new ArrayList<>();
    }
    this.viewSummaryItems.add(viewSummaryItemsItem);
    return this;
  }

  /**
   * Get viewSummaryItems
   * @return viewSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VIEW_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getViewSummaryItems() {
    return viewSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_VIEW_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewSummaryItems(@javax.annotation.Nullable List<Object> viewSummaryItems) {
    this.viewSummaryItems = viewSummaryItems;
  }


  public TrendzSummary aiSummaryItems(@javax.annotation.Nullable List<Object> aiSummaryItems) {
    this.aiSummaryItems = aiSummaryItems;
    return this;
  }

  public TrendzSummary addAiSummaryItemsItem(Object aiSummaryItemsItem) {
    if (this.aiSummaryItems == null) {
      this.aiSummaryItems = new ArrayList<>();
    }
    this.aiSummaryItems.add(aiSummaryItemsItem);
    return this;
  }

  /**
   * Get aiSummaryItems
   * @return aiSummaryItems
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AI_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getAiSummaryItems() {
    return aiSummaryItems;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_SUMMARY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiSummaryItems(@javax.annotation.Nullable List<Object> aiSummaryItems) {
    this.aiSummaryItems = aiSummaryItems;
  }


  /**
   * Return true if this TrendzSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendzSummary trendzSummary = (TrendzSummary) o;
    return Objects.equals(this.metricSummaryItems, trendzSummary.metricSummaryItems) &&
        Objects.equals(this.anomalyModelSummaryItems, trendzSummary.anomalyModelSummaryItems) &&
        Objects.equals(this.calculationFieldSummaryItems, trendzSummary.calculationFieldSummaryItems) &&
        Objects.equals(this.predictionModelSummaryItems, trendzSummary.predictionModelSummaryItems) &&
        Objects.equals(this.viewSummaryItems, trendzSummary.viewSummaryItems) &&
        Objects.equals(this.aiSummaryItems, trendzSummary.aiSummaryItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricSummaryItems, anomalyModelSummaryItems, calculationFieldSummaryItems, predictionModelSummaryItems, viewSummaryItems, aiSummaryItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendzSummary {\n");
    sb.append("    metricSummaryItems: ").append(toIndentedString(metricSummaryItems)).append("\n");
    sb.append("    anomalyModelSummaryItems: ").append(toIndentedString(anomalyModelSummaryItems)).append("\n");
    sb.append("    calculationFieldSummaryItems: ").append(toIndentedString(calculationFieldSummaryItems)).append("\n");
    sb.append("    predictionModelSummaryItems: ").append(toIndentedString(predictionModelSummaryItems)).append("\n");
    sb.append("    viewSummaryItems: ").append(toIndentedString(viewSummaryItems)).append("\n");
    sb.append("    aiSummaryItems: ").append(toIndentedString(aiSummaryItems)).append("\n");
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

    // add `metricSummaryItems` to the URL query string
    if (getMetricSummaryItems() != null) {
      for (int i = 0; i < getMetricSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%smetricSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getMetricSummaryItems().get(i)))));
      }
    }

    // add `anomalyModelSummaryItems` to the URL query string
    if (getAnomalyModelSummaryItems() != null) {
      for (int i = 0; i < getAnomalyModelSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sanomalyModelSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getAnomalyModelSummaryItems().get(i)))));
      }
    }

    // add `calculationFieldSummaryItems` to the URL query string
    if (getCalculationFieldSummaryItems() != null) {
      for (int i = 0; i < getCalculationFieldSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scalculationFieldSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getCalculationFieldSummaryItems().get(i)))));
      }
    }

    // add `predictionModelSummaryItems` to the URL query string
    if (getPredictionModelSummaryItems() != null) {
      for (int i = 0; i < getPredictionModelSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%spredictionModelSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getPredictionModelSummaryItems().get(i)))));
      }
    }

    // add `viewSummaryItems` to the URL query string
    if (getViewSummaryItems() != null) {
      for (int i = 0; i < getViewSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sviewSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getViewSummaryItems().get(i)))));
      }
    }

    // add `aiSummaryItems` to the URL query string
    if (getAiSummaryItems() != null) {
      for (int i = 0; i < getAiSummaryItems().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%saiSummaryItems%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getAiSummaryItems().get(i)))));
      }
    }

    return joiner.toString();
  }
}

