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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.IntegrationId;
import org.thingsboard.client.model.IntegrationType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * IntegrationInfo
 */
@JsonPropertyOrder({
  IntegrationInfo.JSON_PROPERTY_ID,
  IntegrationInfo.JSON_PROPERTY_CREATED_TIME,
  IntegrationInfo.JSON_PROPERTY_TENANT_ID,
  IntegrationInfo.JSON_PROPERTY_NAME,
  IntegrationInfo.JSON_PROPERTY_TYPE,
  IntegrationInfo.JSON_PROPERTY_DEBUG_MODE,
  IntegrationInfo.JSON_PROPERTY_DEBUG_SETTINGS,
  IntegrationInfo.JSON_PROPERTY_ENABLED,
  IntegrationInfo.JSON_PROPERTY_REMOTE,
  IntegrationInfo.JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS,
  IntegrationInfo.JSON_PROPERTY_EDGE_TEMPLATE,
  IntegrationInfo.JSON_PROPERTY_VERSION,
  IntegrationInfo.JSON_PROPERTY_STATUS,
  IntegrationInfo.JSON_PROPERTY_STATS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class IntegrationInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private IntegrationId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private IntegrationType type;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @Nullable
  private Boolean debugMode;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_REMOTE = "remote";
  @Nullable
  private Boolean remote;

  public static final String JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS = "allowCreateDevicesOrAssets";
  @Nullable
  private Boolean allowCreateDevicesOrAssets;

  public static final String JSON_PROPERTY_EDGE_TEMPLATE = "edgeTemplate";
  @Nullable
  private Boolean edgeTemplate;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private Object status;

  public static final String JSON_PROPERTY_STATS = "stats";
  private JsonNullable<Object> stats = JsonNullable.<Object>of(null);

  public IntegrationInfo() { 
  }

  @JsonCreator
  public IntegrationInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public IntegrationInfo id(@Nullable IntegrationId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Integration Id. Specify this field to update the Integration. Referencing non-existing Integration Id will cause error. Omit this field to create new Integration.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable IntegrationId id) {
    this.id = id;
  }


  /**
   * Timestamp of the integration creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public IntegrationInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Integration Name
   * @return name
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@Nonnull String name) {
    this.name = name;
  }


  public IntegrationInfo type(@Nonnull IntegrationType type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the integration
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IntegrationType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull IntegrationType type) {
    this.type = type;
  }


  public IntegrationInfo debugMode(@Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Enable/disable debug. 
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


  public IntegrationInfo debugSettings(@Nullable DebugSettings debugSettings) {
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


  public IntegrationInfo enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Boolean flag to enable/disable the integration
   * @return enabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public IntegrationInfo remote(@Nullable Boolean remote) {
    this.remote = remote;
    return this;
  }

  /**
   * Boolean flag to enable/disable the integration to be executed remotely. Remote integration is launched in a separate microservice. Local integration is executed by the platform core
   * @return remote
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REMOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRemote() {
    return remote;
  }


  @JsonProperty(value = JSON_PROPERTY_REMOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemote(@Nullable Boolean remote) {
    this.remote = remote;
  }


  public IntegrationInfo allowCreateDevicesOrAssets(@Nullable Boolean allowCreateDevicesOrAssets) {
    this.allowCreateDevicesOrAssets = allowCreateDevicesOrAssets;
    return this;
  }

  /**
   * Boolean flag to allow/disallow the integration to create devices or assets that send message and do not exist in the system yet
   * @return allowCreateDevicesOrAssets
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowCreateDevicesOrAssets() {
    return allowCreateDevicesOrAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowCreateDevicesOrAssets(@Nullable Boolean allowCreateDevicesOrAssets) {
    this.allowCreateDevicesOrAssets = allowCreateDevicesOrAssets;
  }


  public IntegrationInfo edgeTemplate(@Nullable Boolean edgeTemplate) {
    this.edgeTemplate = edgeTemplate;
    return this;
  }

  /**
   * Boolean flag that specifies that is regular or edge template integration
   * @return edgeTemplate
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdgeTemplate() {
    return edgeTemplate;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeTemplate(@Nullable Boolean edgeTemplate) {
    this.edgeTemplate = edgeTemplate;
  }


  public IntegrationInfo version(@Nullable Long version) {
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


  public IntegrationInfo status(@Nullable Object status) {
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
  public Object getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@Nullable Object status) {
    this.status = status;
  }


  public IntegrationInfo stats(@Nullable Object stats) {
    this.stats = JsonNullable.<Object>of(stats);
    return this;
  }

  /**
   * Get stats
   * @return stats
   */
  @Nullable
  @JsonIgnore
  public Object getStats() {
        return stats.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_STATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStats_JsonNullable() {
    return stats;
  }
  
  @JsonProperty(JSON_PROPERTY_STATS)
  public void setStats_JsonNullable(JsonNullable<Object> stats) {
    this.stats = stats;
  }

  public void setStats(@Nullable Object stats) {
    this.stats = JsonNullable.<Object>of(stats);
  }


  /**
   * Return true if this IntegrationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationInfo integrationInfo = (IntegrationInfo) o;
    return Objects.equals(this.id, integrationInfo.id) &&
        Objects.equals(this.createdTime, integrationInfo.createdTime) &&
        Objects.equals(this.tenantId, integrationInfo.tenantId) &&
        Objects.equals(this.name, integrationInfo.name) &&
        Objects.equals(this.type, integrationInfo.type) &&
        Objects.equals(this.debugMode, integrationInfo.debugMode) &&
        Objects.equals(this.debugSettings, integrationInfo.debugSettings) &&
        Objects.equals(this.enabled, integrationInfo.enabled) &&
        Objects.equals(this.remote, integrationInfo.remote) &&
        Objects.equals(this.allowCreateDevicesOrAssets, integrationInfo.allowCreateDevicesOrAssets) &&
        Objects.equals(this.edgeTemplate, integrationInfo.edgeTemplate) &&
        Objects.equals(this.version, integrationInfo.version) &&
        Objects.equals(this.status, integrationInfo.status) &&
        equalsNullable(this.stats, integrationInfo.stats);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, type, debugMode, debugSettings, enabled, remote, allowCreateDevicesOrAssets, edgeTemplate, version, status, hashCodeNullable(stats));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    allowCreateDevicesOrAssets: ").append(toIndentedString(allowCreateDevicesOrAssets)).append("\n");
    sb.append("    edgeTemplate: ").append(toIndentedString(edgeTemplate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
    }

    // add `debugSettings` to the URL query string
    if (getDebugSettings() != null) {
      joiner.add(getDebugSettings().toUrlQueryString(prefix + "debugSettings" + suffix));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `remote` to the URL query string
    if (getRemote() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sremote%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRemote()))));
    }

    // add `allowCreateDevicesOrAssets` to the URL query string
    if (getAllowCreateDevicesOrAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallowCreateDevicesOrAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllowCreateDevicesOrAssets()))));
    }

    // add `edgeTemplate` to the URL query string
    if (getEdgeTemplate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeTemplate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeTemplate()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `stats` to the URL query string
    if (getStats() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstats%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStats()))));
    }

    return joiner.toString();
  }
}

