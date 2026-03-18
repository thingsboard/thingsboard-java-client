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
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.RuleChainType;
import org.thingsboard.client.model.RuleNodeId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the rule chain.
 */
@JsonPropertyOrder({
  RuleChain.JSON_PROPERTY_ID,
  RuleChain.JSON_PROPERTY_CREATED_TIME,
  RuleChain.JSON_PROPERTY_ADDITIONAL_INFO,
  RuleChain.JSON_PROPERTY_TENANT_ID,
  RuleChain.JSON_PROPERTY_NAME,
  RuleChain.JSON_PROPERTY_TYPE,
  RuleChain.JSON_PROPERTY_FIRST_RULE_NODE_ID,
  RuleChain.JSON_PROPERTY_ROOT,
  RuleChain.JSON_PROPERTY_DEBUG_MODE,
  RuleChain.JSON_PROPERTY_CONFIGURATION,
  RuleChain.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RuleChain {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private RuleChainId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nonnull
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private RuleChainType type;

  public static final String JSON_PROPERTY_FIRST_RULE_NODE_ID = "firstRuleNodeId";
  @javax.annotation.Nullable
  private RuleNodeId firstRuleNodeId;

  public static final String JSON_PROPERTY_ROOT = "root";
  @javax.annotation.Nullable
  private Boolean root;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @javax.annotation.Nullable
  private Boolean debugMode;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public RuleChain() { 
  }

  @JsonCreator
  public RuleChain(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public RuleChain id(@javax.annotation.Nullable RuleChainId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Rule Chain Id. Specify this field to update the Rule Chain. Referencing non-existing Rule Chain Id will cause error. Omit this field to create new rule chain.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable RuleChainId id) {
    this.id = id;
  }


  /**
   * Timestamp of the rule chain creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public RuleChain additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
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
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public RuleChain name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Rule Chain name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public RuleChain type(@javax.annotation.Nullable RuleChainType type) {
    this.type = type;
    return this;
  }

  /**
   * Rule Chain type. &#39;EDGE&#39; rule chains are processing messages on the edge devices only.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable RuleChainType type) {
    this.type = type;
  }


  public RuleChain firstRuleNodeId(@javax.annotation.Nullable RuleNodeId firstRuleNodeId) {
    this.firstRuleNodeId = firstRuleNodeId;
    return this;
  }

  /**
   * JSON object with Rule Chain Id. Pointer to the first rule node that should receive all messages pushed to this rule chain.
   * @return firstRuleNodeId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRST_RULE_NODE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleNodeId getFirstRuleNodeId() {
    return firstRuleNodeId;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_RULE_NODE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstRuleNodeId(@javax.annotation.Nullable RuleNodeId firstRuleNodeId) {
    this.firstRuleNodeId = firstRuleNodeId;
  }


  public RuleChain root(@javax.annotation.Nullable Boolean root) {
    this.root = root;
    return this;
  }

  /**
   * Indicates root rule chain. The root rule chain process messages from all devices and entities by default. User may configure default rule chain per device profile.
   * @return root
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROOT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRoot() {
    return root;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoot(@javax.annotation.Nullable Boolean root) {
    this.root = root;
  }


  public RuleChain debugMode(@javax.annotation.Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Reserved for future usage.
   * @return debugMode
   */
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


  public RuleChain _configuration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
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


  public RuleChain version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  /**
   * Return true if this RuleChain object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChain ruleChain = (RuleChain) o;
    return Objects.equals(this.id, ruleChain.id) &&
        Objects.equals(this.createdTime, ruleChain.createdTime) &&
        Objects.equals(this.additionalInfo, ruleChain.additionalInfo) &&
        Objects.equals(this.tenantId, ruleChain.tenantId) &&
        Objects.equals(this.name, ruleChain.name) &&
        Objects.equals(this.type, ruleChain.type) &&
        Objects.equals(this.firstRuleNodeId, ruleChain.firstRuleNodeId) &&
        Objects.equals(this.root, ruleChain.root) &&
        Objects.equals(this.debugMode, ruleChain.debugMode) &&
        Objects.equals(this._configuration, ruleChain._configuration) &&
        Objects.equals(this.version, ruleChain.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, name, type, firstRuleNodeId, root, debugMode, _configuration, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChain {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstRuleNodeId: ").append(toIndentedString(firstRuleNodeId)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `firstRuleNodeId` to the URL query string
    if (getFirstRuleNodeId() != null) {
      joiner.add(getFirstRuleNodeId().toUrlQueryString(prefix + "firstRuleNodeId" + suffix));
    }

    // add `root` to the URL query string
    if (getRoot() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroot%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRoot()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    return joiner.toString();
  }
}

