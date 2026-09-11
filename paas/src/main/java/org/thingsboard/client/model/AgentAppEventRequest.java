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
import org.thingsboard.client.model.AgentAppEventStepStatesValue;
import org.thingsboard.client.model.AgentApplication;
import org.thingsboard.client.model.EntityId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Request payload for creating an agent application event (install, update, upgrade, restart, delete, etc.).
 */
@JsonPropertyOrder({
  AgentAppEventRequest.JSON_PROPERTY_ACTION_TYPE,
  AgentAppEventRequest.JSON_PROPERTY_APPLICATION,
  AgentAppEventRequest.JSON_PROPERTY_STEP_INPUTS,
  AgentAppEventRequest.JSON_PROPERTY_RELATED_ENTITY_ID,
  AgentAppEventRequest.JSON_PROPERTY_BULK_ACTION_ID,
  AgentAppEventRequest.JSON_PROPERTY_SKIP_PROFILE_REFETCH
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppEventRequest {
  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @Nullable
  private AgentAppEventActionType actionType;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  @Nullable
  private AgentApplication application;

  public static final String JSON_PROPERTY_STEP_INPUTS = "stepInputs";
  @Nullable
  private Map<String, AgentAppEventStepStatesValue> stepInputs = new HashMap<>();

  public static final String JSON_PROPERTY_RELATED_ENTITY_ID = "relatedEntityId";
  @Nullable
  private EntityId relatedEntityId;

  public static final String JSON_PROPERTY_BULK_ACTION_ID = "bulkActionId";
  @Nullable
  private UUID bulkActionId;

  public static final String JSON_PROPERTY_SKIP_PROFILE_REFETCH = "skipProfileRefetch";
  @Nullable
  private Boolean skipProfileRefetch;

  public AgentAppEventRequest() { 
  }

  public AgentAppEventRequest actionType(@Nullable AgentAppEventActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Action to perform against the agent application.
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


  public AgentAppEventRequest application(@Nullable AgentApplication application) {
    this.application = application;
    return this;
  }

  /**
   * Agent application payload supplied by the caller. Used to carry name/config changes for UPDATE and the target state for INSTALL/UPGRADE.
   * @return application
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentApplication getApplication() {
    return application;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(@Nullable AgentApplication application) {
    this.application = application;
  }


  public AgentAppEventRequest stepInputs(@Nullable Map<String, AgentAppEventStepStatesValue> stepInputs) {
    this.stepInputs = stepInputs;
    return this;
  }

  public AgentAppEventRequest putStepInputsItem(String key, AgentAppEventStepStatesValue stepInputsItem) {
    if (this.stepInputs == null) {
      this.stepInputs = new HashMap<>();
    }
    this.stepInputs.put(key, stepInputsItem);
    return this;
  }

  /**
   * Per-step input overrides keyed by step id (e.g. pullImages flag, backup volume selection).
   * @return stepInputs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STEP_INPUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, AgentAppEventStepStatesValue> getStepInputs() {
    return stepInputs;
  }


  @JsonProperty(value = JSON_PROPERTY_STEP_INPUTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepInputs(@Nullable Map<String, AgentAppEventStepStatesValue> stepInputs) {
    this.stepInputs = stepInputs;
  }


  public AgentAppEventRequest relatedEntityId(@Nullable EntityId relatedEntityId) {
    this.relatedEntityId = relatedEntityId;
    return this;
  }

  /**
   * INSTALL-action optional related entity (Edge or Gateway Device) to link to the application in the same operation. When set, the application is created and the relation is assigned atomically. Ignored for non-INSTALL actions.
   * @return relatedEntityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATED_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getRelatedEntityId() {
    return relatedEntityId;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATED_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedEntityId(@Nullable EntityId relatedEntityId) {
    this.relatedEntityId = relatedEntityId;
  }


  public AgentAppEventRequest bulkActionId(@Nullable UUID bulkActionId) {
    this.bulkActionId = bulkActionId;
    return this;
  }

  /**
   * Optional bulk-action correlation id. When the same value is used across multiple application events, duplicates are deduplicated server-side.
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


  public AgentAppEventRequest skipProfileRefetch(@Nullable Boolean skipProfileRefetch) {
    this.skipProfileRefetch = skipProfileRefetch;
    return this;
  }

  /**
   * UPDATE-action flag for profile-managed apps. When true, the compose is not re-resolved from the (possibly upgraded) profile — only the credentials carried by &#x60;application.config&#x60; are applied. Ignored for non-UPDATE actions and for non-profile-managed apps.
   * @return skipProfileRefetch
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SKIP_PROFILE_REFETCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSkipProfileRefetch() {
    return skipProfileRefetch;
  }


  @JsonProperty(value = JSON_PROPERTY_SKIP_PROFILE_REFETCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipProfileRefetch(@Nullable Boolean skipProfileRefetch) {
    this.skipProfileRefetch = skipProfileRefetch;
  }


  /**
   * Return true if this AgentAppEventRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppEventRequest agentAppEventRequest = (AgentAppEventRequest) o;
    return Objects.equals(this.actionType, agentAppEventRequest.actionType) &&
        Objects.equals(this.application, agentAppEventRequest.application) &&
        Objects.equals(this.stepInputs, agentAppEventRequest.stepInputs) &&
        Objects.equals(this.relatedEntityId, agentAppEventRequest.relatedEntityId) &&
        Objects.equals(this.bulkActionId, agentAppEventRequest.bulkActionId) &&
        Objects.equals(this.skipProfileRefetch, agentAppEventRequest.skipProfileRefetch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, application, stepInputs, relatedEntityId, bulkActionId, skipProfileRefetch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppEventRequest {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    stepInputs: ").append(toIndentedString(stepInputs)).append("\n");
    sb.append("    relatedEntityId: ").append(toIndentedString(relatedEntityId)).append("\n");
    sb.append("    bulkActionId: ").append(toIndentedString(bulkActionId)).append("\n");
    sb.append("    skipProfileRefetch: ").append(toIndentedString(skipProfileRefetch)).append("\n");
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

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionType()))));
    }

    // add `application` to the URL query string
    if (getApplication() != null) {
      joiner.add(getApplication().toUrlQueryString(prefix + "application" + suffix));
    }

    // add `stepInputs` to the URL query string
    if (getStepInputs() != null) {
      for (String _key : getStepInputs().keySet()) {
        if (getStepInputs().get(_key) != null) {
          joiner.add(getStepInputs().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstepInputs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `relatedEntityId` to the URL query string
    if (getRelatedEntityId() != null) {
      joiner.add(getRelatedEntityId().toUrlQueryString(prefix + "relatedEntityId" + suffix));
    }

    // add `bulkActionId` to the URL query string
    if (getBulkActionId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbulkActionId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBulkActionId()))));
    }

    // add `skipProfileRefetch` to the URL query string
    if (getSkipProfileRefetch() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sskipProfileRefetch%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSkipProfileRefetch()))));
    }

    return joiner.toString();
  }
}

