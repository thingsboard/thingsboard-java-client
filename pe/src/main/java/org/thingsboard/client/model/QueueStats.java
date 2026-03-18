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
import org.thingsboard.client.model.QueueStatsId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * QueueStats
 */
@JsonPropertyOrder({
  QueueStats.JSON_PROPERTY_ID,
  QueueStats.JSON_PROPERTY_CREATED_TIME,
  QueueStats.JSON_PROPERTY_TENANT_ID,
  QueueStats.JSON_PROPERTY_QUEUE_NAME,
  QueueStats.JSON_PROPERTY_SERVICE_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class QueueStats {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private QueueStatsId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_QUEUE_NAME = "queueName";
  @Nullable
  private String queueName;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  @Nullable
  private String serviceId;

  public QueueStats() { 
  }

  @JsonCreator
  public QueueStats(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public QueueStats id(@Nullable QueueStatsId id) {
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
  public QueueStatsId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable QueueStatsId id) {
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




  public QueueStats tenantId(@Nullable TenantId tenantId) {
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


  public QueueStats queueName(@Nullable String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Get queueName
   * @return queueName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueueName() {
    return queueName;
  }


  @JsonProperty(value = JSON_PROPERTY_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueueName(@Nullable String queueName) {
    this.queueName = queueName;
  }


  public QueueStats serviceId(@Nullable String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(@Nullable String serviceId) {
    this.serviceId = serviceId;
  }


  /**
   * Return true if this QueueStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueStats queueStats = (QueueStats) o;
    return Objects.equals(this.id, queueStats.id) &&
        Objects.equals(this.createdTime, queueStats.createdTime) &&
        Objects.equals(this.tenantId, queueStats.tenantId) &&
        Objects.equals(this.queueName, queueStats.queueName) &&
        Objects.equals(this.serviceId, queueStats.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, queueName, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueStats {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

    // add `queueName` to the URL query string
    if (getQueueName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squeueName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQueueName()))));
    }

    // add `serviceId` to the URL query string
    if (getServiceId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserviceId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServiceId()))));
    }

    return joiner.toString();
  }
}

