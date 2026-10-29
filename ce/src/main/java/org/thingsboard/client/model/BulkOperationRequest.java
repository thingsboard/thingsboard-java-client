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
import org.thingsboard.client.model.AgentAppEventActionType;
import org.thingsboard.client.model.AgentAppEventStepStatesValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BulkOperationRequest
 */
@JsonPropertyOrder({
  BulkOperationRequest.JSON_PROPERTY_ACTION_TYPE,
  BulkOperationRequest.JSON_PROPERTY_STEP_INPUTS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class BulkOperationRequest {
  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @Nullable
  private AgentAppEventActionType actionType;

  public static final String JSON_PROPERTY_STEP_INPUTS = "stepInputs";
  @Nullable
  private Map<String, AgentAppEventStepStatesValue> stepInputs = new HashMap<>();

  public BulkOperationRequest() { 
  }

  public BulkOperationRequest actionType(@Nullable AgentAppEventActionType actionType) {
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


  public BulkOperationRequest stepInputs(@Nullable Map<String, AgentAppEventStepStatesValue> stepInputs) {
    this.stepInputs = stepInputs;
    return this;
  }

  public BulkOperationRequest putStepInputsItem(String key, AgentAppEventStepStatesValue stepInputsItem) {
    if (this.stepInputs == null) {
      this.stepInputs = new HashMap<>();
    }
    this.stepInputs.put(key, stepInputsItem);
    return this;
  }

  /**
   * Get stepInputs
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


  /**
   * Return true if this BulkOperationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationRequest bulkOperationRequest = (BulkOperationRequest) o;
    return Objects.equals(this.actionType, bulkOperationRequest.actionType) &&
        Objects.equals(this.stepInputs, bulkOperationRequest.stepInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, stepInputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationRequest {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    stepInputs: ").append(toIndentedString(stepInputs)).append("\n");
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

    // add `stepInputs` to the URL query string
    if (getStepInputs() != null) {
      for (String _key : getStepInputs().keySet()) {
        if (getStepInputs().get(_key) != null) {
          joiner.add(getStepInputs().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstepInputs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

