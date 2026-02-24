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
import org.thingsboard.client.model.ProcessingStrategyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ProcessingStrategy
 */
@JsonPropertyOrder({
  ProcessingStrategy.JSON_PROPERTY_TYPE,
  ProcessingStrategy.JSON_PROPERTY_RETRIES,
  ProcessingStrategy.JSON_PROPERTY_FAILURE_PERCENTAGE,
  ProcessingStrategy.JSON_PROPERTY_PAUSE_BETWEEN_RETRIES,
  ProcessingStrategy.JSON_PROPERTY_MAX_PAUSE_BETWEEN_RETRIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ProcessingStrategy {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ProcessingStrategyType type;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  @javax.annotation.Nullable
  private Integer retries;

  public static final String JSON_PROPERTY_FAILURE_PERCENTAGE = "failurePercentage";
  @javax.annotation.Nullable
  private Double failurePercentage;

  public static final String JSON_PROPERTY_PAUSE_BETWEEN_RETRIES = "pauseBetweenRetries";
  @javax.annotation.Nullable
  private Long pauseBetweenRetries;

  public static final String JSON_PROPERTY_MAX_PAUSE_BETWEEN_RETRIES = "maxPauseBetweenRetries";
  @javax.annotation.Nullable
  private Long maxPauseBetweenRetries;

  public ProcessingStrategy() { 
  }

  public ProcessingStrategy type(@javax.annotation.Nullable ProcessingStrategyType type) {
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
  public ProcessingStrategyType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable ProcessingStrategyType type) {
    this.type = type;
  }


  public ProcessingStrategy retries(@javax.annotation.Nullable Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Get retries
   * @return retries
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRetries() {
    return retries;
  }


  @JsonProperty(value = JSON_PROPERTY_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetries(@javax.annotation.Nullable Integer retries) {
    this.retries = retries;
  }


  public ProcessingStrategy failurePercentage(@javax.annotation.Nullable Double failurePercentage) {
    this.failurePercentage = failurePercentage;
    return this;
  }

  /**
   * Get failurePercentage
   * @return failurePercentage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FAILURE_PERCENTAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFailurePercentage() {
    return failurePercentage;
  }


  @JsonProperty(value = JSON_PROPERTY_FAILURE_PERCENTAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailurePercentage(@javax.annotation.Nullable Double failurePercentage) {
    this.failurePercentage = failurePercentage;
  }


  public ProcessingStrategy pauseBetweenRetries(@javax.annotation.Nullable Long pauseBetweenRetries) {
    this.pauseBetweenRetries = pauseBetweenRetries;
    return this;
  }

  /**
   * Get pauseBetweenRetries
   * @return pauseBetweenRetries
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAUSE_BETWEEN_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPauseBetweenRetries() {
    return pauseBetweenRetries;
  }


  @JsonProperty(value = JSON_PROPERTY_PAUSE_BETWEEN_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPauseBetweenRetries(@javax.annotation.Nullable Long pauseBetweenRetries) {
    this.pauseBetweenRetries = pauseBetweenRetries;
  }


  public ProcessingStrategy maxPauseBetweenRetries(@javax.annotation.Nullable Long maxPauseBetweenRetries) {
    this.maxPauseBetweenRetries = maxPauseBetweenRetries;
    return this;
  }

  /**
   * Get maxPauseBetweenRetries
   * @return maxPauseBetweenRetries
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_PAUSE_BETWEEN_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxPauseBetweenRetries() {
    return maxPauseBetweenRetries;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_PAUSE_BETWEEN_RETRIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPauseBetweenRetries(@javax.annotation.Nullable Long maxPauseBetweenRetries) {
    this.maxPauseBetweenRetries = maxPauseBetweenRetries;
  }


  /**
   * Return true if this ProcessingStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessingStrategy processingStrategy = (ProcessingStrategy) o;
    return Objects.equals(this.type, processingStrategy.type) &&
        Objects.equals(this.retries, processingStrategy.retries) &&
        Objects.equals(this.failurePercentage, processingStrategy.failurePercentage) &&
        Objects.equals(this.pauseBetweenRetries, processingStrategy.pauseBetweenRetries) &&
        Objects.equals(this.maxPauseBetweenRetries, processingStrategy.maxPauseBetweenRetries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, retries, failurePercentage, pauseBetweenRetries, maxPauseBetweenRetries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingStrategy {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    failurePercentage: ").append(toIndentedString(failurePercentage)).append("\n");
    sb.append("    pauseBetweenRetries: ").append(toIndentedString(pauseBetweenRetries)).append("\n");
    sb.append("    maxPauseBetweenRetries: ").append(toIndentedString(maxPauseBetweenRetries)).append("\n");
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

    // add `retries` to the URL query string
    if (getRetries() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sretries%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRetries()))));
    }

    // add `failurePercentage` to the URL query string
    if (getFailurePercentage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfailurePercentage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFailurePercentage()))));
    }

    // add `pauseBetweenRetries` to the URL query string
    if (getPauseBetweenRetries() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spauseBetweenRetries%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPauseBetweenRetries()))));
    }

    // add `maxPauseBetweenRetries` to the URL query string
    if (getMaxPauseBetweenRetries() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxPauseBetweenRetries%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxPauseBetweenRetries()))));
    }

    return joiner.toString();
  }
}

