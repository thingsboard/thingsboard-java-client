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
import org.thingsboard.client.model.AlarmCalculatedFieldConfiguration;
import org.thingsboard.client.model.CalculatedFieldId;
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmRuleDefinitionInfo
 */
@JsonPropertyOrder({
  AlarmRuleDefinitionInfo.JSON_PROPERTY_ID,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_CREATED_TIME,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_TENANT_ID,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_ENTITY_ID,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_NAME,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_DEBUG_SETTINGS,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_CONFIGURATION_VERSION,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_CONFIGURATION,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_VERSION,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_ENTITY_NAME,
  AlarmRuleDefinitionInfo.JSON_PROPERTY_DEBUG_MODE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmRuleDefinitionInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private CalculatedFieldId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  @Nullable
  private Integer configurationVersion;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nonnull
  private AlarmCalculatedFieldConfiguration _configuration;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  @Nullable
  private String entityName;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @Nullable
  private Boolean debugMode;

  public AlarmRuleDefinitionInfo() { 
  }

  @JsonCreator
  public AlarmRuleDefinitionInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public AlarmRuleDefinitionInfo id(@Nullable CalculatedFieldId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Alarm Rule Id. Referencing non-existing Alarm Rule Id will cause error.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalculatedFieldId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable CalculatedFieldId id) {
    this.id = id;
  }


  /**
   * Timestamp of the alarm rule creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public AlarmRuleDefinitionInfo tenantId(@Nullable TenantId tenantId) {
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


  public AlarmRuleDefinitionInfo entityId(@Nullable EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@Nullable EntityId entityId) {
    this.entityId = entityId;
  }


  public AlarmRuleDefinitionInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * User defined name of the alarm rule.
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


  public AlarmRuleDefinitionInfo debugSettings(@Nullable DebugSettings debugSettings) {
    this.debugSettings = debugSettings;
    return this;
  }

  /**
   * Debug settings object.
   * @return debugSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEBUG_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DebugSettings getDebugSettings() {
    return debugSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBUG_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugSettings(@Nullable DebugSettings debugSettings) {
    this.debugSettings = debugSettings;
  }


  public AlarmRuleDefinitionInfo configurationVersion(@Nullable Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }

  /**
   * Version of alarm rule configuration.
   * @return configurationVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationVersion(@Nullable Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
  }


  public AlarmRuleDefinitionInfo _configuration(@Nonnull AlarmCalculatedFieldConfiguration _configuration) {
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
  public AlarmCalculatedFieldConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(@Nonnull AlarmCalculatedFieldConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public AlarmRuleDefinitionInfo version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  public AlarmRuleDefinitionInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the alarm rule. May include: &#39;description&#39; (string).
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


  public AlarmRuleDefinitionInfo entityName(@Nullable String entityName) {
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


  public AlarmRuleDefinitionInfo debugMode(@Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Get debugMode
   * @return debugMode
   * @deprecated
   */
  @Deprecated
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEBUG_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDebugMode() {
    return debugMode;
  }


  @JsonProperty(value = JSON_PROPERTY_DEBUG_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebugMode(@Nullable Boolean debugMode) {
    this.debugMode = debugMode;
  }


  /**
   * Return true if this AlarmRuleDefinitionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRuleDefinitionInfo alarmRuleDefinitionInfo = (AlarmRuleDefinitionInfo) o;
    return Objects.equals(this.id, alarmRuleDefinitionInfo.id) &&
        Objects.equals(this.createdTime, alarmRuleDefinitionInfo.createdTime) &&
        Objects.equals(this.tenantId, alarmRuleDefinitionInfo.tenantId) &&
        Objects.equals(this.entityId, alarmRuleDefinitionInfo.entityId) &&
        Objects.equals(this.name, alarmRuleDefinitionInfo.name) &&
        Objects.equals(this.debugSettings, alarmRuleDefinitionInfo.debugSettings) &&
        Objects.equals(this.configurationVersion, alarmRuleDefinitionInfo.configurationVersion) &&
        Objects.equals(this._configuration, alarmRuleDefinitionInfo._configuration) &&
        Objects.equals(this.version, alarmRuleDefinitionInfo.version) &&
        Objects.equals(this.additionalInfo, alarmRuleDefinitionInfo.additionalInfo) &&
        Objects.equals(this.entityName, alarmRuleDefinitionInfo.entityName) &&
        Objects.equals(this.debugMode, alarmRuleDefinitionInfo.debugMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, entityId, name, debugSettings, configurationVersion, _configuration, version, additionalInfo, entityName, debugMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRuleDefinitionInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `debugSettings` to the URL query string
    if (getDebugSettings() != null) {
      joiner.add(getDebugSettings().toUrlQueryString(prefix + "debugSettings" + suffix));
    }

    // add `configurationVersion` to the URL query string
    if (getConfigurationVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigurationVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigurationVersion()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `entityName` to the URL query string
    if (getEntityName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityName()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
    }

    return joiner.toString();
  }
}

