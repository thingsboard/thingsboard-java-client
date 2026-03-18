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
import javax.annotation.Nonnull;
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
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.JobConfiguration;
import org.thingsboard.client.model.JobId;
import org.thingsboard.client.model.JobResult;
import org.thingsboard.client.model.JobStatus;
import org.thingsboard.client.model.JobType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Job
 */
@JsonPropertyOrder({
  Job.JSON_PROPERTY_ID,
  Job.JSON_PROPERTY_CREATED_TIME,
  Job.JSON_PROPERTY_TENANT_ID,
  Job.JSON_PROPERTY_TYPE,
  Job.JSON_PROPERTY_KEY,
  Job.JSON_PROPERTY_ENTITY_ID,
  Job.JSON_PROPERTY_ENTITY_NAME,
  Job.JSON_PROPERTY_STATUS,
  Job.JSON_PROPERTY_CONFIGURATION,
  Job.JSON_PROPERTY_RESULT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Job {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private JobId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nonnull
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private JobType type;

  public static final String JSON_PROPERTY_KEY = "key";
  @Nonnull
  private String key;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @Nonnull
  private EntityId entityId;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  @Nullable
  private String entityName;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nonnull
  private JobStatus status;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nonnull
  private JobConfiguration _configuration;

  public static final String JSON_PROPERTY_RESULT = "result";
  @Nonnull
  private JobResult result;

  public Job() { 
  }

  @JsonCreator
  public Job(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public Job id(@Nullable JobId id) {
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
  public JobId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable JobId id) {
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




  public Job tenantId(@Nonnull TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(@Nonnull TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public Job type(@Nonnull JobType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JobType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull JobType type) {
    this.type = type;
  }


  public Job key(@Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(@Nonnull String key) {
    this.key = key;
  }


  public Job entityId(@Nonnull EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(@Nonnull EntityId entityId) {
    this.entityId = entityId;
  }


  public Job entityName(@Nullable String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityName() {
    return entityName;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityName(@Nullable String entityName) {
    this.entityName = entityName;
  }


  public Job status(@Nonnull JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JobStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@Nonnull JobStatus status) {
    this.status = status;
  }


  public Job _configuration(@Nonnull JobConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JobConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(@Nonnull JobConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public Job result(@Nonnull JobResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JobResult getResult() {
    return result;
  }


  @JsonProperty(value = JSON_PROPERTY_RESULT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(@Nonnull JobResult result) {
    this.result = result;
  }


  /**
   * Return true if this Job object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.createdTime, job.createdTime) &&
        Objects.equals(this.tenantId, job.tenantId) &&
        Objects.equals(this.type, job.type) &&
        Objects.equals(this.key, job.key) &&
        Objects.equals(this.entityId, job.entityId) &&
        Objects.equals(this.entityName, job.entityName) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this._configuration, job._configuration) &&
        Objects.equals(this.result, job.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, type, key, entityId, entityName, status, _configuration, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `entityName` to the URL query string
    if (getEntityName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityName()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `result` to the URL query string
    if (getResult() != null) {
      joiner.add(getResult().toUrlQueryString(prefix + "result" + suffix));
    }

    return joiner.toString();
  }
}

