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
import org.thingsboard.client.model.CalculatedFieldConfiguration;
import org.thingsboard.client.model.CalculatedFieldId;
import org.thingsboard.client.model.CalculatedFieldType;
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CalculatedFieldInfo
 */
@JsonPropertyOrder({
  CalculatedFieldInfo.JSON_PROPERTY_ID,
  CalculatedFieldInfo.JSON_PROPERTY_CREATED_TIME,
  CalculatedFieldInfo.JSON_PROPERTY_TENANT_ID,
  CalculatedFieldInfo.JSON_PROPERTY_ENTITY_ID,
  CalculatedFieldInfo.JSON_PROPERTY_TYPE,
  CalculatedFieldInfo.JSON_PROPERTY_NAME,
  CalculatedFieldInfo.JSON_PROPERTY_DEBUG_MODE,
  CalculatedFieldInfo.JSON_PROPERTY_DEBUG_SETTINGS,
  CalculatedFieldInfo.JSON_PROPERTY_CONFIGURATION_VERSION,
  CalculatedFieldInfo.JSON_PROPERTY_CONFIGURATION,
  CalculatedFieldInfo.JSON_PROPERTY_VERSION,
  CalculatedFieldInfo.JSON_PROPERTY_ENTITY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CalculatedFieldInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private CalculatedFieldId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private CalculatedFieldType type;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @javax.annotation.Nullable
  private Boolean debugMode;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @javax.annotation.Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  @javax.annotation.Nullable
  private Integer configurationVersion;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nonnull
  private CalculatedFieldConfiguration _configuration;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  @javax.annotation.Nullable
  private String entityName;

  public CalculatedFieldInfo() { 
  }

  @JsonCreator
  public CalculatedFieldInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public CalculatedFieldInfo id(@javax.annotation.Nullable CalculatedFieldId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Calculated Field Id. Referencing non-existing Calculated Field Id will cause error.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalculatedFieldId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable CalculatedFieldId id) {
    this.id = id;
  }


  /**
   * Timestamp of the calculated field creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public CalculatedFieldInfo tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public CalculatedFieldInfo entityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
  }


  public CalculatedFieldInfo type(@javax.annotation.Nullable CalculatedFieldType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CalculatedFieldType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable CalculatedFieldType type) {
    this.type = type;
  }


  public CalculatedFieldInfo name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * User defined name of the calculated field.
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


  public CalculatedFieldInfo debugMode(@javax.annotation.Nullable Boolean debugMode) {
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


  public CalculatedFieldInfo debugSettings(@javax.annotation.Nullable DebugSettings debugSettings) {
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


  public CalculatedFieldInfo configurationVersion(@javax.annotation.Nullable Integer configurationVersion) {
    this.configurationVersion = configurationVersion;
    return this;
  }

  /**
   * Version of calculated field configuration.
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


  public CalculatedFieldInfo _configuration(@javax.annotation.Nonnull CalculatedFieldConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CalculatedFieldConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(@javax.annotation.Nonnull CalculatedFieldConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public CalculatedFieldInfo version(@javax.annotation.Nullable Long version) {
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


  public CalculatedFieldInfo entityName(@javax.annotation.Nullable String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityName() {
    return entityName;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityName(@javax.annotation.Nullable String entityName) {
    this.entityName = entityName;
  }


  /**
   * Return true if this CalculatedFieldInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatedFieldInfo calculatedFieldInfo = (CalculatedFieldInfo) o;
    return Objects.equals(this.id, calculatedFieldInfo.id) &&
        Objects.equals(this.createdTime, calculatedFieldInfo.createdTime) &&
        Objects.equals(this.tenantId, calculatedFieldInfo.tenantId) &&
        Objects.equals(this.entityId, calculatedFieldInfo.entityId) &&
        Objects.equals(this.type, calculatedFieldInfo.type) &&
        Objects.equals(this.name, calculatedFieldInfo.name) &&
        Objects.equals(this.debugMode, calculatedFieldInfo.debugMode) &&
        Objects.equals(this.debugSettings, calculatedFieldInfo.debugSettings) &&
        Objects.equals(this.configurationVersion, calculatedFieldInfo.configurationVersion) &&
        Objects.equals(this._configuration, calculatedFieldInfo._configuration) &&
        Objects.equals(this.version, calculatedFieldInfo.version) &&
        Objects.equals(this.entityName, calculatedFieldInfo.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, entityId, type, name, debugMode, debugSettings, configurationVersion, _configuration, version, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedFieldInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
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

    // add `entityName` to the URL query string
    if (getEntityName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityName()))));
    }

    return joiner.toString();
  }
}

