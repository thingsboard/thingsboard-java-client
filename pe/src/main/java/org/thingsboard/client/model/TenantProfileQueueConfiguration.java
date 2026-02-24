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
import org.thingsboard.client.model.ProcessingStrategy;
import org.thingsboard.client.model.SubmitStrategy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantProfileQueueConfiguration
 */
@JsonPropertyOrder({
  TenantProfileQueueConfiguration.JSON_PROPERTY_NAME,
  TenantProfileQueueConfiguration.JSON_PROPERTY_TOPIC,
  TenantProfileQueueConfiguration.JSON_PROPERTY_POLL_INTERVAL,
  TenantProfileQueueConfiguration.JSON_PROPERTY_PARTITIONS,
  TenantProfileQueueConfiguration.JSON_PROPERTY_CONSUMER_PER_PARTITION,
  TenantProfileQueueConfiguration.JSON_PROPERTY_PACK_PROCESSING_TIMEOUT,
  TenantProfileQueueConfiguration.JSON_PROPERTY_SUBMIT_STRATEGY,
  TenantProfileQueueConfiguration.JSON_PROPERTY_PROCESSING_STRATEGY,
  TenantProfileQueueConfiguration.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TenantProfileQueueConfiguration {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  @javax.annotation.Nullable
  private String topic;

  public static final String JSON_PROPERTY_POLL_INTERVAL = "pollInterval";
  @javax.annotation.Nullable
  private Integer pollInterval;

  public static final String JSON_PROPERTY_PARTITIONS = "partitions";
  @javax.annotation.Nullable
  private Integer partitions;

  public static final String JSON_PROPERTY_CONSUMER_PER_PARTITION = "consumerPerPartition";
  @javax.annotation.Nullable
  private Boolean consumerPerPartition;

  public static final String JSON_PROPERTY_PACK_PROCESSING_TIMEOUT = "packProcessingTimeout";
  @javax.annotation.Nullable
  private Long packProcessingTimeout;

  public static final String JSON_PROPERTY_SUBMIT_STRATEGY = "submitStrategy";
  @javax.annotation.Nullable
  private SubmitStrategy submitStrategy;

  public static final String JSON_PROPERTY_PROCESSING_STRATEGY = "processingStrategy";
  @javax.annotation.Nullable
  private ProcessingStrategy processingStrategy;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public TenantProfileQueueConfiguration() { 
  }

  public TenantProfileQueueConfiguration name(@javax.annotation.Nullable String name) {
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


  public TenantProfileQueueConfiguration topic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOPIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTopic() {
    return topic;
  }


  @JsonProperty(value = JSON_PROPERTY_TOPIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
  }


  public TenantProfileQueueConfiguration pollInterval(@javax.annotation.Nullable Integer pollInterval) {
    this.pollInterval = pollInterval;
    return this;
  }

  /**
   * Get pollInterval
   * @return pollInterval
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POLL_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPollInterval() {
    return pollInterval;
  }


  @JsonProperty(value = JSON_PROPERTY_POLL_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPollInterval(@javax.annotation.Nullable Integer pollInterval) {
    this.pollInterval = pollInterval;
  }


  public TenantProfileQueueConfiguration partitions(@javax.annotation.Nullable Integer partitions) {
    this.partitions = partitions;
    return this;
  }

  /**
   * Get partitions
   * @return partitions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PARTITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPartitions() {
    return partitions;
  }


  @JsonProperty(value = JSON_PROPERTY_PARTITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartitions(@javax.annotation.Nullable Integer partitions) {
    this.partitions = partitions;
  }


  public TenantProfileQueueConfiguration consumerPerPartition(@javax.annotation.Nullable Boolean consumerPerPartition) {
    this.consumerPerPartition = consumerPerPartition;
    return this;
  }

  /**
   * Get consumerPerPartition
   * @return consumerPerPartition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONSUMER_PER_PARTITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getConsumerPerPartition() {
    return consumerPerPartition;
  }


  @JsonProperty(value = JSON_PROPERTY_CONSUMER_PER_PARTITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerPerPartition(@javax.annotation.Nullable Boolean consumerPerPartition) {
    this.consumerPerPartition = consumerPerPartition;
  }


  public TenantProfileQueueConfiguration packProcessingTimeout(@javax.annotation.Nullable Long packProcessingTimeout) {
    this.packProcessingTimeout = packProcessingTimeout;
    return this;
  }

  /**
   * Get packProcessingTimeout
   * @return packProcessingTimeout
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PACK_PROCESSING_TIMEOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPackProcessingTimeout() {
    return packProcessingTimeout;
  }


  @JsonProperty(value = JSON_PROPERTY_PACK_PROCESSING_TIMEOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackProcessingTimeout(@javax.annotation.Nullable Long packProcessingTimeout) {
    this.packProcessingTimeout = packProcessingTimeout;
  }


  public TenantProfileQueueConfiguration submitStrategy(@javax.annotation.Nullable SubmitStrategy submitStrategy) {
    this.submitStrategy = submitStrategy;
    return this;
  }

  /**
   * Get submitStrategy
   * @return submitStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBMIT_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubmitStrategy getSubmitStrategy() {
    return submitStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBMIT_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitStrategy(@javax.annotation.Nullable SubmitStrategy submitStrategy) {
    this.submitStrategy = submitStrategy;
  }


  public TenantProfileQueueConfiguration processingStrategy(@javax.annotation.Nullable ProcessingStrategy processingStrategy) {
    this.processingStrategy = processingStrategy;
    return this;
  }

  /**
   * Get processingStrategy
   * @return processingStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProcessingStrategy getProcessingStrategy() {
    return processingStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingStrategy(@javax.annotation.Nullable ProcessingStrategy processingStrategy) {
    this.processingStrategy = processingStrategy;
  }


  public TenantProfileQueueConfiguration additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this TenantProfileQueueConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantProfileQueueConfiguration tenantProfileQueueConfiguration = (TenantProfileQueueConfiguration) o;
    return Objects.equals(this.name, tenantProfileQueueConfiguration.name) &&
        Objects.equals(this.topic, tenantProfileQueueConfiguration.topic) &&
        Objects.equals(this.pollInterval, tenantProfileQueueConfiguration.pollInterval) &&
        Objects.equals(this.partitions, tenantProfileQueueConfiguration.partitions) &&
        Objects.equals(this.consumerPerPartition, tenantProfileQueueConfiguration.consumerPerPartition) &&
        Objects.equals(this.packProcessingTimeout, tenantProfileQueueConfiguration.packProcessingTimeout) &&
        Objects.equals(this.submitStrategy, tenantProfileQueueConfiguration.submitStrategy) &&
        Objects.equals(this.processingStrategy, tenantProfileQueueConfiguration.processingStrategy) &&
        Objects.equals(this.additionalInfo, tenantProfileQueueConfiguration.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, topic, pollInterval, partitions, consumerPerPartition, packProcessingTimeout, submitStrategy, processingStrategy, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantProfileQueueConfiguration {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    pollInterval: ").append(toIndentedString(pollInterval)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
    sb.append("    consumerPerPartition: ").append(toIndentedString(consumerPerPartition)).append("\n");
    sb.append("    packProcessingTimeout: ").append(toIndentedString(packProcessingTimeout)).append("\n");
    sb.append("    submitStrategy: ").append(toIndentedString(submitStrategy)).append("\n");
    sb.append("    processingStrategy: ").append(toIndentedString(processingStrategy)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `topic` to the URL query string
    if (getTopic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stopic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTopic()))));
    }

    // add `pollInterval` to the URL query string
    if (getPollInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spollInterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPollInterval()))));
    }

    // add `partitions` to the URL query string
    if (getPartitions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spartitions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPartitions()))));
    }

    // add `consumerPerPartition` to the URL query string
    if (getConsumerPerPartition() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconsumerPerPartition%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConsumerPerPartition()))));
    }

    // add `packProcessingTimeout` to the URL query string
    if (getPackProcessingTimeout() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spackProcessingTimeout%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPackProcessingTimeout()))));
    }

    // add `submitStrategy` to the URL query string
    if (getSubmitStrategy() != null) {
      joiner.add(getSubmitStrategy().toUrlQueryString(prefix + "submitStrategy" + suffix));
    }

    // add `processingStrategy` to the URL query string
    if (getProcessingStrategy() != null) {
      joiner.add(getProcessingStrategy().toUrlQueryString(prefix + "processingStrategy" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

