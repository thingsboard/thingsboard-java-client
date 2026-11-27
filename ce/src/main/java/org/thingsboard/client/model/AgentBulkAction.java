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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.thingsboard.client.model.AgentAppEventActionType;
import org.thingsboard.client.model.AgentBulkActionId;
import org.thingsboard.client.model.AgentBulkActionStatus;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentBulkAction
 */
@JsonPropertyOrder({
  AgentBulkAction.JSON_PROPERTY_ID,
  AgentBulkAction.JSON_PROPERTY_CREATED_TIME,
  AgentBulkAction.JSON_PROPERTY_TENANT_ID,
  AgentBulkAction.JSON_PROPERTY_AGENT_PROFILE_ID,
  AgentBulkAction.JSON_PROPERTY_APPLICATION_PROFILE_ID,
  AgentBulkAction.JSON_PROPERTY_ACTION_TYPE,
  AgentBulkAction.JSON_PROPERTY_STATUS,
  AgentBulkAction.JSON_PROPERTY_ERROR_MSG,
  AgentBulkAction.JSON_PROPERTY_PROCESSING_STARTED_TIME,
  AgentBulkAction.JSON_PROPERTY_TOTAL,
  AgentBulkAction.JSON_PROPERTY_SUBMITTED,
  AgentBulkAction.JSON_PROPERTY_SKIP_COUNTS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentBulkAction {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentBulkActionId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_AGENT_PROFILE_ID = "agentProfileId";
  @Nullable
  private UUID agentProfileId;

  public static final String JSON_PROPERTY_APPLICATION_PROFILE_ID = "applicationProfileId";
  @Nullable
  private UUID applicationProfileId;

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @Nullable
  private AgentAppEventActionType actionType;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private AgentBulkActionStatus status;

  public static final String JSON_PROPERTY_ERROR_MSG = "errorMsg";
  @Nullable
  private String errorMsg;

  public static final String JSON_PROPERTY_PROCESSING_STARTED_TIME = "processingStartedTime";
  @Nullable
  private Long processingStartedTime;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @Nullable
  private Integer total;

  public static final String JSON_PROPERTY_SUBMITTED = "submitted";
  @Nullable
  private Integer submitted;

  public static final String JSON_PROPERTY_SKIP_COUNTS = "skipCounts";
  @Nullable
  private Map<String, Integer> skipCounts = new HashMap<>();

  public AgentBulkAction() { 
  }

  @JsonCreator
  public AgentBulkAction(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public AgentBulkAction id(@Nullable AgentBulkActionId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent Bulk Action Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentBulkActionId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentBulkActionId id) {
    this.id = id;
  }


  /**
   * Timestamp of the bulk action creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public AgentBulkAction tenantId(@Nullable TenantId tenantId) {
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


  public AgentBulkAction agentProfileId(@Nullable UUID agentProfileId) {
    this.agentProfileId = agentProfileId;
    return this;
  }

  /**
   * Get agentProfileId
   * @return agentProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getAgentProfileId() {
    return agentProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentProfileId(@Nullable UUID agentProfileId) {
    this.agentProfileId = agentProfileId;
  }


  public AgentBulkAction applicationProfileId(@Nullable UUID applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
    return this;
  }

  /**
   * Get applicationProfileId
   * @return applicationProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getApplicationProfileId() {
    return applicationProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationProfileId(@Nullable UUID applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
  }


  public AgentBulkAction actionType(@Nullable AgentAppEventActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppEventActionType getActionType() {
    return actionType;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(@Nullable AgentAppEventActionType actionType) {
    this.actionType = actionType;
  }


  public AgentBulkAction status(@Nullable AgentBulkActionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentBulkActionStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@Nullable AgentBulkActionStatus status) {
    this.status = status;
  }


  public AgentBulkAction errorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * Get errorMsg
   * @return errorMsg
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR_MSG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMsg() {
    return errorMsg;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR_MSG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMsg(@Nullable String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public AgentBulkAction processingStartedTime(@Nullable Long processingStartedTime) {
    this.processingStartedTime = processingStartedTime;
    return this;
  }

  /**
   * Get processingStartedTime
   * @return processingStartedTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STARTED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProcessingStartedTime() {
    return processingStartedTime;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STARTED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingStartedTime(@Nullable Long processingStartedTime) {
    this.processingStartedTime = processingStartedTime;
  }


  public AgentBulkAction total(@Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotal() {
    return total;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(@Nullable Integer total) {
    this.total = total;
  }


  public AgentBulkAction submitted(@Nullable Integer submitted) {
    this.submitted = submitted;
    return this;
  }

  /**
   * Get submitted
   * @return submitted
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBMITTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSubmitted() {
    return submitted;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBMITTED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmitted(@Nullable Integer submitted) {
    this.submitted = submitted;
  }


  public AgentBulkAction skipCounts(@Nullable Map<String, Integer> skipCounts) {
    this.skipCounts = skipCounts;
    return this;
  }

  public AgentBulkAction putSkipCountsItem(String key, Integer skipCountsItem) {
    if (this.skipCounts == null) {
      this.skipCounts = new HashMap<>();
    }
    this.skipCounts.put(key, skipCountsItem);
    return this;
  }

  /**
   * Get skipCounts
   * @return skipCounts
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SKIP_COUNTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Integer> getSkipCounts() {
    return skipCounts;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIP_COUNTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipCounts(@Nullable Map<String, Integer> skipCounts) {
    this.skipCounts = skipCounts;
  }


  /**
   * Return true if this AgentBulkAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentBulkAction agentBulkAction = (AgentBulkAction) o;
    return Objects.equals(this.id, agentBulkAction.id) &&
        Objects.equals(this.createdTime, agentBulkAction.createdTime) &&
        Objects.equals(this.tenantId, agentBulkAction.tenantId) &&
        Objects.equals(this.agentProfileId, agentBulkAction.agentProfileId) &&
        Objects.equals(this.applicationProfileId, agentBulkAction.applicationProfileId) &&
        Objects.equals(this.actionType, agentBulkAction.actionType) &&
        Objects.equals(this.status, agentBulkAction.status) &&
        Objects.equals(this.errorMsg, agentBulkAction.errorMsg) &&
        Objects.equals(this.processingStartedTime, agentBulkAction.processingStartedTime) &&
        Objects.equals(this.total, agentBulkAction.total) &&
        Objects.equals(this.submitted, agentBulkAction.submitted) &&
        Objects.equals(this.skipCounts, agentBulkAction.skipCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, agentProfileId, applicationProfileId, actionType, status, errorMsg, processingStartedTime, total, submitted, skipCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentBulkAction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    agentProfileId: ").append(toIndentedString(agentProfileId)).append("\n");
    sb.append("    applicationProfileId: ").append(toIndentedString(applicationProfileId)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    processingStartedTime: ").append(toIndentedString(processingStartedTime)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    skipCounts: ").append(toIndentedString(skipCounts)).append("\n");
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

    // add `agentProfileId` to the URL query string
    if (getAgentProfileId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentProfileId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentProfileId()))));
    }

    // add `applicationProfileId` to the URL query string
    if (getApplicationProfileId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapplicationProfileId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApplicationProfileId()))));
    }

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionType()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `errorMsg` to the URL query string
    if (getErrorMsg() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serrorMsg%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getErrorMsg()))));
    }

    // add `processingStartedTime` to the URL query string
    if (getProcessingStartedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprocessingStartedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProcessingStartedTime()))));
    }

    // add `total` to the URL query string
    if (getTotal() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotal%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotal()))));
    }

    // add `submitted` to the URL query string
    if (getSubmitted() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubmitted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubmitted()))));
    }

    // add `skipCounts` to the URL query string
    if (getSkipCounts() != null) {
      for (String _key : getSkipCounts().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sskipCounts%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getSkipCounts().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getSkipCounts().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

