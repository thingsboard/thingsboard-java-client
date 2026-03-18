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
import org.thingsboard.client.model.ProcessingStrategy;
import org.thingsboard.client.model.QueueId;
import org.thingsboard.client.model.SubmitStrategy;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the queue.
 */
@JsonPropertyOrder({
  Queue.JSON_PROPERTY_ID,
  Queue.JSON_PROPERTY_CREATED_TIME,
  Queue.JSON_PROPERTY_TENANT_ID,
  Queue.JSON_PROPERTY_NAME,
  Queue.JSON_PROPERTY_TOPIC,
  Queue.JSON_PROPERTY_POLL_INTERVAL,
  Queue.JSON_PROPERTY_PARTITIONS,
  Queue.JSON_PROPERTY_CONSUMER_PER_PARTITION,
  Queue.JSON_PROPERTY_PACK_PROCESSING_TIMEOUT,
  Queue.JSON_PROPERTY_SUBMIT_STRATEGY,
  Queue.JSON_PROPERTY_PROCESSING_STRATEGY,
  Queue.JSON_PROPERTY_ADDITIONAL_INFO
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Queue {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private QueueId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  @Nullable
  private String topic;

  public static final String JSON_PROPERTY_POLL_INTERVAL = "pollInterval";
  @Nullable
  private Integer pollInterval;

  public static final String JSON_PROPERTY_PARTITIONS = "partitions";
  @Nullable
  private Integer partitions;

  public static final String JSON_PROPERTY_CONSUMER_PER_PARTITION = "consumerPerPartition";
  @Nullable
  private Boolean consumerPerPartition;

  public static final String JSON_PROPERTY_PACK_PROCESSING_TIMEOUT = "packProcessingTimeout";
  @Nullable
  private Long packProcessingTimeout;

  public static final String JSON_PROPERTY_SUBMIT_STRATEGY = "submitStrategy";
  @Nullable
  private SubmitStrategy submitStrategy;

  public static final String JSON_PROPERTY_PROCESSING_STRATEGY = "processingStrategy";
  @Nullable
  private ProcessingStrategy processingStrategy;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public Queue() { 
  }

  @JsonCreator
  public Queue(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public Queue id(@Nullable QueueId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QueueId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable QueueId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public Queue tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public Queue name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public Queue topic(@Nullable String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOPIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTopic() {
    return topic;
  }


  @JsonProperty(value = JSON_PROPERTY_TOPIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(@Nullable String topic) {
    this.topic = topic;
  }


  public Queue pollInterval(@Nullable Integer pollInterval) {
    this.pollInterval = pollInterval;
    return this;
  }

  /**
   * Get pollInterval
   * @return pollInterval
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_POLL_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPollInterval() {
    return pollInterval;
  }


  @JsonProperty(value = JSON_PROPERTY_POLL_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPollInterval(@Nullable Integer pollInterval) {
    this.pollInterval = pollInterval;
  }


  public Queue partitions(@Nullable Integer partitions) {
    this.partitions = partitions;
    return this;
  }

  /**
   * Get partitions
   * @return partitions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PARTITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPartitions() {
    return partitions;
  }


  @JsonProperty(value = JSON_PROPERTY_PARTITIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartitions(@Nullable Integer partitions) {
    this.partitions = partitions;
  }


  public Queue consumerPerPartition(@Nullable Boolean consumerPerPartition) {
    this.consumerPerPartition = consumerPerPartition;
    return this;
  }

  /**
   * Get consumerPerPartition
   * @return consumerPerPartition
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONSUMER_PER_PARTITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getConsumerPerPartition() {
    return consumerPerPartition;
  }


  @JsonProperty(value = JSON_PROPERTY_CONSUMER_PER_PARTITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerPerPartition(@Nullable Boolean consumerPerPartition) {
    this.consumerPerPartition = consumerPerPartition;
  }


  public Queue packProcessingTimeout(@Nullable Long packProcessingTimeout) {
    this.packProcessingTimeout = packProcessingTimeout;
    return this;
  }

  /**
   * Get packProcessingTimeout
   * @return packProcessingTimeout
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PACK_PROCESSING_TIMEOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPackProcessingTimeout() {
    return packProcessingTimeout;
  }


  @JsonProperty(value = JSON_PROPERTY_PACK_PROCESSING_TIMEOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackProcessingTimeout(@Nullable Long packProcessingTimeout) {
    this.packProcessingTimeout = packProcessingTimeout;
  }


  public Queue submitStrategy(@Nullable SubmitStrategy submitStrategy) {
    this.submitStrategy = submitStrategy;
    return this;
  }

  /**
   * Get submitStrategy
   * @return submitStrategy
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBMIT_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubmitStrategy getSubmitStrategy() {
    return submitStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBMIT_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitStrategy(@Nullable SubmitStrategy submitStrategy) {
    this.submitStrategy = submitStrategy;
  }


  public Queue processingStrategy(@Nullable ProcessingStrategy processingStrategy) {
    this.processingStrategy = processingStrategy;
    return this;
  }

  /**
   * Get processingStrategy
   * @return processingStrategy
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProcessingStrategy getProcessingStrategy() {
    return processingStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingStrategy(@Nullable ProcessingStrategy processingStrategy) {
    this.processingStrategy = processingStrategy;
  }


  public Queue additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this Queue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Queue queue = (Queue) o;
    return Objects.equals(this.id, queue.id) &&
        Objects.equals(this.createdTime, queue.createdTime) &&
        Objects.equals(this.tenantId, queue.tenantId) &&
        Objects.equals(this.name, queue.name) &&
        Objects.equals(this.topic, queue.topic) &&
        Objects.equals(this.pollInterval, queue.pollInterval) &&
        Objects.equals(this.partitions, queue.partitions) &&
        Objects.equals(this.consumerPerPartition, queue.consumerPerPartition) &&
        Objects.equals(this.packProcessingTimeout, queue.packProcessingTimeout) &&
        Objects.equals(this.submitStrategy, queue.submitStrategy) &&
        Objects.equals(this.processingStrategy, queue.processingStrategy) &&
        Objects.equals(this.additionalInfo, queue.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, topic, pollInterval, partitions, consumerPerPartition, packProcessingTimeout, submitStrategy, processingStrategy, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Queue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

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

