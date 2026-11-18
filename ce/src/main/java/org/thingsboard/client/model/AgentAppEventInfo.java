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
import org.thingsboard.client.model.AgentAppEventId;
import org.thingsboard.client.model.AgentAppEventStepStatesValue;
import org.thingsboard.client.model.AgentApplicationId;
import org.thingsboard.client.model.AgentId;
import org.thingsboard.client.model.AgentProcessingStatus;
import org.thingsboard.client.model.ProcessingStartStatus;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentAppEventInfo
 */
@JsonPropertyOrder({
  AgentAppEventInfo.JSON_PROPERTY_ID,
  AgentAppEventInfo.JSON_PROPERTY_CREATED_TIME,
  AgentAppEventInfo.JSON_PROPERTY_TENANT_ID,
  AgentAppEventInfo.JSON_PROPERTY_APPLICATION_ID,
  AgentAppEventInfo.JSON_PROPERTY_AGENT_ID,
  AgentAppEventInfo.JSON_PROPERTY_APPLICATION_NAME,
  AgentAppEventInfo.JSON_PROPERTY_ACTION_TYPE,
  AgentAppEventInfo.JSON_PROPERTY_START_STATUS,
  AgentAppEventInfo.JSON_PROPERTY_PROCESSING_STATUS,
  AgentAppEventInfo.JSON_PROPERTY_CURRENT_STEP_ID,
  AgentAppEventInfo.JSON_PROPERTY_CURRENT_ACTIVITY,
  AgentAppEventInfo.JSON_PROPERTY_ERROR_MESSAGE,
  AgentAppEventInfo.JSON_PROPERTY_UPDATED_TIME,
  AgentAppEventInfo.JSON_PROPERTY_STEP_STATES,
  AgentAppEventInfo.JSON_PROPERTY_BULK_ACTION_ID,
  AgentAppEventInfo.JSON_PROPERTY_RESOLVED_ARGUMENTS,
  AgentAppEventInfo.JSON_PROPERTY_WINNER_CONTAINER_ID,
  AgentAppEventInfo.JSON_PROPERTY_FINALIZE_DEADLINE_TS,
  AgentAppEventInfo.JSON_PROPERTY_CONTEXT_METADATA,
  AgentAppEventInfo.JSON_PROPERTY_AGENT_NAME
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppEventInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentAppEventId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
  @Nullable
  private AgentApplicationId applicationId;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  @Nullable
  private AgentId agentId;

  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  @Nullable
  private String applicationName;

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @Nullable
  private AgentAppEventActionType actionType;

  public static final String JSON_PROPERTY_START_STATUS = "startStatus";
  @Nullable
  private ProcessingStartStatus startStatus;

  public static final String JSON_PROPERTY_PROCESSING_STATUS = "processingStatus";
  @Nullable
  private AgentProcessingStatus processingStatus;

  public static final String JSON_PROPERTY_CURRENT_STEP_ID = "currentStepId";
  @Nullable
  private UUID currentStepId;

  public static final String JSON_PROPERTY_CURRENT_ACTIVITY = "currentActivity";
  @Nullable
  private String currentActivity;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  @Nullable
  private String errorMessage;

  public static final String JSON_PROPERTY_UPDATED_TIME = "updatedTime";
  @Nullable
  private Long updatedTime;

  public static final String JSON_PROPERTY_STEP_STATES = "stepStates";
  @Nullable
  private Map<String, AgentAppEventStepStatesValue> stepStates = new HashMap<>();

  public static final String JSON_PROPERTY_BULK_ACTION_ID = "bulkActionId";
  @Nullable
  private UUID bulkActionId;

  public static final String JSON_PROPERTY_RESOLVED_ARGUMENTS = "resolvedArguments";
  @Nullable
  private Map<String, String> resolvedArguments = new HashMap<>();

  public static final String JSON_PROPERTY_WINNER_CONTAINER_ID = "winnerContainerId";
  @Nullable
  private String winnerContainerId;

  public static final String JSON_PROPERTY_FINALIZE_DEADLINE_TS = "finalizeDeadlineTs";
  @Nullable
  private Long finalizeDeadlineTs;

  public static final String JSON_PROPERTY_CONTEXT_METADATA = "contextMetadata";
  @Nullable
  private Map<String, String> contextMetadata = new HashMap<>();

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  @Nullable
  private String agentName;

  public AgentAppEventInfo() { 
  }

  @JsonCreator
  public AgentAppEventInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_AGENT_NAME) String agentName
  ) {
  this();
    this.createdTime = createdTime;
    this.agentName = agentName;
  }

  public AgentAppEventInfo id(@Nullable AgentAppEventId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent App Event Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppEventId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentAppEventId id) {
    this.id = id;
  }


  /**
   * Timestamp of the event creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public AgentAppEventInfo tenantId(@Nullable TenantId tenantId) {
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


  public AgentAppEventInfo applicationId(@Nullable AgentApplicationId applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentApplicationId getApplicationId() {
    return applicationId;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationId(@Nullable AgentApplicationId applicationId) {
    this.applicationId = applicationId;
  }


  public AgentAppEventInfo agentId(@Nullable AgentId agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentId getAgentId() {
    return agentId;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(@Nullable AgentId agentId) {
    this.agentId = agentId;
  }


  public AgentAppEventInfo applicationName(@Nullable String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Get applicationName
   * @return applicationName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationName(@Nullable String applicationName) {
    this.applicationName = applicationName;
  }


  public AgentAppEventInfo actionType(@Nullable AgentAppEventActionType actionType) {
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


  public AgentAppEventInfo startStatus(@Nullable ProcessingStartStatus startStatus) {
    this.startStatus = startStatus;
    return this;
  }

  /**
   * Get startStatus
   * @return startStatus
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_START_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProcessingStartStatus getStartStatus() {
    return startStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_START_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartStatus(@Nullable ProcessingStartStatus startStatus) {
    this.startStatus = startStatus;
  }


  public AgentAppEventInfo processingStatus(@Nullable AgentProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * Get processingStatus
   * @return processingStatus
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentProcessingStatus getProcessingStatus() {
    return processingStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_PROCESSING_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingStatus(@Nullable AgentProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
  }


  public AgentAppEventInfo currentStepId(@Nullable UUID currentStepId) {
    this.currentStepId = currentStepId;
    return this;
  }

  /**
   * Get currentStepId
   * @return currentStepId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_STEP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getCurrentStepId() {
    return currentStepId;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_STEP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentStepId(@Nullable UUID currentStepId) {
    this.currentStepId = currentStepId;
  }


  public AgentAppEventInfo currentActivity(@Nullable String currentActivity) {
    this.currentActivity = currentActivity;
    return this;
  }

  /**
   * Get currentActivity
   * @return currentActivity
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_ACTIVITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentActivity() {
    return currentActivity;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_ACTIVITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentActivity(@Nullable String currentActivity) {
    this.currentActivity = currentActivity;
  }


  public AgentAppEventInfo errorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(@Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public AgentAppEventInfo updatedTime(@Nullable Long updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdatedTime() {
    return updatedTime;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedTime(@Nullable Long updatedTime) {
    this.updatedTime = updatedTime;
  }


  public AgentAppEventInfo stepStates(@Nullable Map<String, AgentAppEventStepStatesValue> stepStates) {
    this.stepStates = stepStates;
    return this;
  }

  public AgentAppEventInfo putStepStatesItem(String key, AgentAppEventStepStatesValue stepStatesItem) {
    if (this.stepStates == null) {
      this.stepStates = new HashMap<>();
    }
    this.stepStates.put(key, stepStatesItem);
    return this;
  }

  /**
   * Get stepStates
   * @return stepStates
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STEP_STATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, AgentAppEventStepStatesValue> getStepStates() {
    return stepStates;
  }


  @JsonProperty(value = JSON_PROPERTY_STEP_STATES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepStates(@Nullable Map<String, AgentAppEventStepStatesValue> stepStates) {
    this.stepStates = stepStates;
  }


  public AgentAppEventInfo bulkActionId(@Nullable UUID bulkActionId) {
    this.bulkActionId = bulkActionId;
    return this;
  }

  /**
   * Get bulkActionId
   * @return bulkActionId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BULK_ACTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getBulkActionId() {
    return bulkActionId;
  }


  @JsonProperty(value = JSON_PROPERTY_BULK_ACTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkActionId(@Nullable UUID bulkActionId) {
    this.bulkActionId = bulkActionId;
  }


  public AgentAppEventInfo resolvedArguments(@Nullable Map<String, String> resolvedArguments) {
    this.resolvedArguments = resolvedArguments;
    return this;
  }

  public AgentAppEventInfo putResolvedArgumentsItem(String key, String resolvedArgumentsItem) {
    if (this.resolvedArguments == null) {
      this.resolvedArguments = new HashMap<>();
    }
    this.resolvedArguments.put(key, resolvedArgumentsItem);
    return this;
  }

  /**
   * Get resolvedArguments
   * @return resolvedArguments
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOLVED_ARGUMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getResolvedArguments() {
    return resolvedArguments;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOLVED_ARGUMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolvedArguments(@Nullable Map<String, String> resolvedArguments) {
    this.resolvedArguments = resolvedArguments;
  }


  public AgentAppEventInfo winnerContainerId(@Nullable String winnerContainerId) {
    this.winnerContainerId = winnerContainerId;
    return this;
  }

  /**
   * Get winnerContainerId
   * @return winnerContainerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WINNER_CONTAINER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWinnerContainerId() {
    return winnerContainerId;
  }


  @JsonProperty(value = JSON_PROPERTY_WINNER_CONTAINER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWinnerContainerId(@Nullable String winnerContainerId) {
    this.winnerContainerId = winnerContainerId;
  }


  public AgentAppEventInfo finalizeDeadlineTs(@Nullable Long finalizeDeadlineTs) {
    this.finalizeDeadlineTs = finalizeDeadlineTs;
    return this;
  }

  /**
   * Get finalizeDeadlineTs
   * @return finalizeDeadlineTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FINALIZE_DEADLINE_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFinalizeDeadlineTs() {
    return finalizeDeadlineTs;
  }


  @JsonProperty(value = JSON_PROPERTY_FINALIZE_DEADLINE_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalizeDeadlineTs(@Nullable Long finalizeDeadlineTs) {
    this.finalizeDeadlineTs = finalizeDeadlineTs;
  }


  public AgentAppEventInfo contextMetadata(@Nullable Map<String, String> contextMetadata) {
    this.contextMetadata = contextMetadata;
    return this;
  }

  public AgentAppEventInfo putContextMetadataItem(String key, String contextMetadataItem) {
    if (this.contextMetadata == null) {
      this.contextMetadata = new HashMap<>();
    }
    this.contextMetadata.put(key, contextMetadataItem);
    return this;
  }

  /**
   * Get contextMetadata
   * @return contextMetadata
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTEXT_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getContextMetadata() {
    return contextMetadata;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTEXT_METADATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextMetadata(@Nullable Map<String, String> contextMetadata) {
    this.contextMetadata = contextMetadata;
  }


  /**
   * Name of the Agent that owns the Application.
   * @return agentName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentName() {
    return agentName;
  }




  /**
   * Return true if this AgentAppEventInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppEventInfo agentAppEventInfo = (AgentAppEventInfo) o;
    return Objects.equals(this.id, agentAppEventInfo.id) &&
        Objects.equals(this.createdTime, agentAppEventInfo.createdTime) &&
        Objects.equals(this.tenantId, agentAppEventInfo.tenantId) &&
        Objects.equals(this.applicationId, agentAppEventInfo.applicationId) &&
        Objects.equals(this.agentId, agentAppEventInfo.agentId) &&
        Objects.equals(this.applicationName, agentAppEventInfo.applicationName) &&
        Objects.equals(this.actionType, agentAppEventInfo.actionType) &&
        Objects.equals(this.startStatus, agentAppEventInfo.startStatus) &&
        Objects.equals(this.processingStatus, agentAppEventInfo.processingStatus) &&
        Objects.equals(this.currentStepId, agentAppEventInfo.currentStepId) &&
        Objects.equals(this.currentActivity, agentAppEventInfo.currentActivity) &&
        Objects.equals(this.errorMessage, agentAppEventInfo.errorMessage) &&
        Objects.equals(this.updatedTime, agentAppEventInfo.updatedTime) &&
        Objects.equals(this.stepStates, agentAppEventInfo.stepStates) &&
        Objects.equals(this.bulkActionId, agentAppEventInfo.bulkActionId) &&
        Objects.equals(this.resolvedArguments, agentAppEventInfo.resolvedArguments) &&
        Objects.equals(this.winnerContainerId, agentAppEventInfo.winnerContainerId) &&
        Objects.equals(this.finalizeDeadlineTs, agentAppEventInfo.finalizeDeadlineTs) &&
        Objects.equals(this.contextMetadata, agentAppEventInfo.contextMetadata) &&
        Objects.equals(this.agentName, agentAppEventInfo.agentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, applicationId, agentId, applicationName, actionType, startStatus, processingStatus, currentStepId, currentActivity, errorMessage, updatedTime, stepStates, bulkActionId, resolvedArguments, winnerContainerId, finalizeDeadlineTs, contextMetadata, agentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppEventInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    startStatus: ").append(toIndentedString(startStatus)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    currentStepId: ").append(toIndentedString(currentStepId)).append("\n");
    sb.append("    currentActivity: ").append(toIndentedString(currentActivity)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    stepStates: ").append(toIndentedString(stepStates)).append("\n");
    sb.append("    bulkActionId: ").append(toIndentedString(bulkActionId)).append("\n");
    sb.append("    resolvedArguments: ").append(toIndentedString(resolvedArguments)).append("\n");
    sb.append("    winnerContainerId: ").append(toIndentedString(winnerContainerId)).append("\n");
    sb.append("    finalizeDeadlineTs: ").append(toIndentedString(finalizeDeadlineTs)).append("\n");
    sb.append("    contextMetadata: ").append(toIndentedString(contextMetadata)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
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

    // add `applicationId` to the URL query string
    if (getApplicationId() != null) {
      joiner.add(getApplicationId().toUrlQueryString(prefix + "applicationId" + suffix));
    }

    // add `agentId` to the URL query string
    if (getAgentId() != null) {
      joiner.add(getAgentId().toUrlQueryString(prefix + "agentId" + suffix));
    }

    // add `applicationName` to the URL query string
    if (getApplicationName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapplicationName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApplicationName()))));
    }

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionType()))));
    }

    // add `startStatus` to the URL query string
    if (getStartStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartStatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartStatus()))));
    }

    // add `processingStatus` to the URL query string
    if (getProcessingStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprocessingStatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProcessingStatus()))));
    }

    // add `currentStepId` to the URL query string
    if (getCurrentStepId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentStepId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentStepId()))));
    }

    // add `currentActivity` to the URL query string
    if (getCurrentActivity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentActivity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentActivity()))));
    }

    // add `errorMessage` to the URL query string
    if (getErrorMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serrorMessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getErrorMessage()))));
    }

    // add `updatedTime` to the URL query string
    if (getUpdatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdatedTime()))));
    }

    // add `stepStates` to the URL query string
    if (getStepStates() != null) {
      for (String _key : getStepStates().keySet()) {
        if (getStepStates().get(_key) != null) {
          joiner.add(getStepStates().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstepStates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `bulkActionId` to the URL query string
    if (getBulkActionId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbulkActionId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBulkActionId()))));
    }

    // add `resolvedArguments` to the URL query string
    if (getResolvedArguments() != null) {
      for (String _key : getResolvedArguments().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sresolvedArguments%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getResolvedArguments().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getResolvedArguments().get(_key)))));
      }
    }

    // add `winnerContainerId` to the URL query string
    if (getWinnerContainerId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swinnerContainerId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWinnerContainerId()))));
    }

    // add `finalizeDeadlineTs` to the URL query string
    if (getFinalizeDeadlineTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfinalizeDeadlineTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFinalizeDeadlineTs()))));
    }

    // add `contextMetadata` to the URL query string
    if (getContextMetadata() != null) {
      for (String _key : getContextMetadata().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%scontextMetadata%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getContextMetadata().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getContextMetadata().get(_key)))));
      }
    }

    // add `agentName` to the URL query string
    if (getAgentName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentName()))));
    }

    return joiner.toString();
  }
}

