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
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.RuleNodeId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RuleNode
 */
@JsonPropertyOrder({
  RuleNode.JSON_PROPERTY_ID,
  RuleNode.JSON_PROPERTY_CREATED_TIME,
  RuleNode.JSON_PROPERTY_RULE_CHAIN_ID,
  RuleNode.JSON_PROPERTY_TYPE,
  RuleNode.JSON_PROPERTY_NAME,
  RuleNode.JSON_PROPERTY_DEBUG_SETTINGS,
  RuleNode.JSON_PROPERTY_SINGLETON_MODE,
  RuleNode.JSON_PROPERTY_QUEUE_NAME,
  RuleNode.JSON_PROPERTY_CONFIGURATION_VERSION,
  RuleNode.JSON_PROPERTY_CONFIGURATION,
  RuleNode.JSON_PROPERTY_EXTERNAL_ID,
  RuleNode.JSON_PROPERTY_ADDITIONAL_INFO,
  RuleNode.JSON_PROPERTY_DEBUG_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RuleNode {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private RuleNodeId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_RULE_CHAIN_ID = "ruleChainId";
  @javax.annotation.Nullable
  private RuleChainId ruleChainId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @javax.annotation.Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_SINGLETON_MODE = "singletonMode";
  @javax.annotation.Nullable
  private Boolean singletonMode;

  public static final String JSON_PROPERTY_QUEUE_NAME = "queueName";
  @javax.annotation.Nullable
  private String queueName;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  @javax.annotation.Nullable
  private Integer configurationVersion;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private RuleNodeId externalId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @javax.annotation.Nullable
  private Boolean debugMode;

  public RuleNode() { 
  }

  @JsonCreator
  public RuleNode(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_RULE_CHAIN_ID) RuleChainId ruleChainId
  ) {
  this();
    this.createdTime = createdTime;
    this.ruleChainId = ruleChainId;
  }

  public RuleNode id(@javax.annotation.Nullable RuleNodeId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleNodeId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable RuleNodeId id) {
    this.id = id;
  }


  /**
   * Timestamp of the rule node creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with the Rule Chain Id. 
   * @return ruleChainId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getRuleChainId() {
    return ruleChainId;
  }




  public RuleNode type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Full Java Class Name of the rule node implementation. 
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public RuleNode name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * User defined name of the rule node. Used on UI and for logging. 
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


  public RuleNode debugSettings(@javax.annotation.Nullable DebugSettings debugSettings) {
    this.debugSettings = debugSettings;
    return this;
  }

  /**
   * Debug settings object.
   * @return debugSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEBUG_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DebugSettings getDebugSettings() {
    return debugSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBUG_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugSettings(@javax.annotation.Nullable DebugSettings debugSettings) {
    this.debugSettings = debugSettings;
  }


  public RuleNode singletonMode(@javax.annotation.Nullable Boolean singletonMode) {
    this.singletonMode = singletonMode;
    return this;
  }

  /**
   * Enable/disable singleton mode. 
   * @return singletonMode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SINGLETON_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSingletonMode() {
    return singletonMode;
  }


  @JsonProperty(value = JSON_PROPERTY_SINGLETON_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingletonMode(@javax.annotation.Nullable Boolean singletonMode) {
    this.singletonMode = singletonMode;
  }


  public RuleNode queueName(@javax.annotation.Nullable String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Queue name. 
   * @return queueName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueueName() {
    return queueName;
  }


  @JsonProperty(value = JSON_PROPERTY_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueueName(@javax.annotation.Nullable String queueName) {
    this.queueName = queueName;
  }


  public RuleNode configurationVersion(@javax.annotation.Nullable Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }

  /**
   * Version of rule node configuration. 
   * @return configurationVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationVersion(@javax.annotation.Nullable Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }


  public RuleNode _configuration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON with the rule node configuration. Structure depends on the rule node implementation.
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
  }


  public RuleNode externalId(@javax.annotation.Nullable RuleNodeId externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleNodeId getExternalId() {
    return externalId;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@javax.annotation.Nullable RuleNodeId externalId) {
    this.externalId = externalId;
  }


  public RuleNode additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the rule node. May include: &#39;layoutX&#39; (number, X coordinate for visualization), &#39;layoutY&#39; (number, Y coordinate for visualization), &#39;description&#39; (string).
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


  public RuleNode debugMode(@javax.annotation.Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Get debugMode
   * @return debugMode
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEBUG_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDebugMode() {
    return debugMode;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBUG_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugMode(@javax.annotation.Nullable Boolean debugMode) {
    this.debugMode = debugMode;
  }


  /**
   * Return true if this RuleNode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleNode ruleNode = (RuleNode) o;
    return Objects.equals(this.id, ruleNode.id) &&
        Objects.equals(this.createdTime, ruleNode.createdTime) &&
        Objects.equals(this.ruleChainId, ruleNode.ruleChainId) &&
        Objects.equals(this.type, ruleNode.type) &&
        Objects.equals(this.name, ruleNode.name) &&
        Objects.equals(this.debugSettings, ruleNode.debugSettings) &&
        Objects.equals(this.singletonMode, ruleNode.singletonMode) &&
        Objects.equals(this.queueName, ruleNode.queueName) &&
        Objects.equals(this.configurationVersion, ruleNode.configurationVersion) &&
        Objects.equals(this._configuration, ruleNode._configuration) &&
        Objects.equals(this.externalId, ruleNode.externalId) &&
        Objects.equals(this.additionalInfo, ruleNode.additionalInfo) &&
        Objects.equals(this.debugMode, ruleNode.debugMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, ruleChainId, type, name, debugSettings, singletonMode, queueName, configurationVersion, _configuration, externalId, additionalInfo, debugMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleNode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    ruleChainId: ").append(toIndentedString(ruleChainId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    singletonMode: ").append(toIndentedString(singletonMode)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
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

    // add `ruleChainId` to the URL query string
    if (getRuleChainId() != null) {
      joiner.add(getRuleChainId().toUrlQueryString(prefix + "ruleChainId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `debugSettings` to the URL query string
    if (getDebugSettings() != null) {
      joiner.add(getDebugSettings().toUrlQueryString(prefix + "debugSettings" + suffix));
    }

    // add `singletonMode` to the URL query string
    if (getSingletonMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssingletonMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSingletonMode()))));
    }

    // add `queueName` to the URL query string
    if (getQueueName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squeueName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQueueName()))));
    }

    // add `configurationVersion` to the URL query string
    if (getConfigurationVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigurationVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigurationVersion()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      joiner.add(getExternalId().toUrlQueryString(prefix + "externalId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
    }

    return joiner.toString();
  }
}

