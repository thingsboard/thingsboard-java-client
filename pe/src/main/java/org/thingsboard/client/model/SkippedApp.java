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
import org.thingsboard.client.model.AgentApplicationId;
import org.thingsboard.client.model.AgentId;
import org.thingsboard.client.model.SkipReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SkippedApp
 */
@JsonPropertyOrder({
  SkippedApp.JSON_PROPERTY_AGENT_ID,
  SkippedApp.JSON_PROPERTY_AGENT_NAME,
  SkippedApp.JSON_PROPERTY_APPLICATION_ID,
  SkippedApp.JSON_PROPERTY_APPLICATION_NAME,
  SkippedApp.JSON_PROPERTY_REASON,
  SkippedApp.JSON_PROPERTY_MSG
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SkippedApp {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  @Nullable
  private AgentId agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  @Nullable
  private String agentName;

  public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
  @Nullable
  private AgentApplicationId applicationId;

  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  @Nullable
  private String applicationName;

  public static final String JSON_PROPERTY_REASON = "reason";
  @Nullable
  private SkipReason reason;

  public static final String JSON_PROPERTY_MSG = "msg";
  @Nullable
  private String msg;

  public SkippedApp() { 
  }

  public SkippedApp agentId(@Nullable AgentId agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Agent Id owning the application
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


  public SkippedApp agentName(@Nullable String agentName) {
    this.agentName = agentName;
    return this;
  }

  /**
   * Agent name
   * @return agentName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(@Nullable String agentName) {
    this.agentName = agentName;
  }


  public SkippedApp applicationId(@Nullable AgentApplicationId applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Application Id
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


  public SkippedApp applicationName(@Nullable String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Application name
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


  public SkippedApp reason(@Nullable SkipReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for skipping
   * @return reason
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SkipReason getReason() {
    return reason;
  }


  @JsonProperty(value = JSON_PROPERTY_REASON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(@Nullable SkipReason reason) {
    this.reason = reason;
  }


  public SkippedApp msg(@Nullable String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Optional message in case of a failure
   * @return msg
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MSG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMsg() {
    return msg;
  }


  @JsonProperty(value = JSON_PROPERTY_MSG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsg(@Nullable String msg) {
    this.msg = msg;
  }


  /**
   * Return true if this SkippedApp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkippedApp skippedApp = (SkippedApp) o;
    return Objects.equals(this.agentId, skippedApp.agentId) &&
        Objects.equals(this.agentName, skippedApp.agentName) &&
        Objects.equals(this.applicationId, skippedApp.applicationId) &&
        Objects.equals(this.applicationName, skippedApp.applicationName) &&
        Objects.equals(this.reason, skippedApp.reason) &&
        Objects.equals(this.msg, skippedApp.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, applicationId, applicationName, reason, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkippedApp {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

    // add `agentId` to the URL query string
    if (getAgentId() != null) {
      joiner.add(getAgentId().toUrlQueryString(prefix + "agentId" + suffix));
    }

    // add `agentName` to the URL query string
    if (getAgentName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentName()))));
    }

    // add `applicationId` to the URL query string
    if (getApplicationId() != null) {
      joiner.add(getApplicationId().toUrlQueryString(prefix + "applicationId" + suffix));
    }

    // add `applicationName` to the URL query string
    if (getApplicationName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapplicationName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApplicationName()))));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreason%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReason()))));
    }

    // add `msg` to the URL query string
    if (getMsg() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smsg%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMsg()))));
    }

    return joiner.toString();
  }
}

