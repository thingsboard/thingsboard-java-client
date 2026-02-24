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
import org.thingsboard.client.model.ConverterId;
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.IntegrationId;
import org.thingsboard.client.model.IntegrationType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the integration.
 */
@JsonPropertyOrder({
  Integration.JSON_PROPERTY_ID,
  Integration.JSON_PROPERTY_CREATED_TIME,
  Integration.JSON_PROPERTY_TENANT_ID,
  Integration.JSON_PROPERTY_NAME,
  Integration.JSON_PROPERTY_TYPE,
  Integration.JSON_PROPERTY_DEBUG_MODE,
  Integration.JSON_PROPERTY_DEBUG_SETTINGS,
  Integration.JSON_PROPERTY_ENABLED,
  Integration.JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS,
  Integration.JSON_PROPERTY_VERSION,
  Integration.JSON_PROPERTY_DEFAULT_CONVERTER_ID,
  Integration.JSON_PROPERTY_DOWNLINK_CONVERTER_ID,
  Integration.JSON_PROPERTY_ROUTING_KEY,
  Integration.JSON_PROPERTY_SECRET,
  Integration.JSON_PROPERTY_CONFIGURATION,
  Integration.JSON_PROPERTY_ADDITIONAL_INFO,
  Integration.JSON_PROPERTY_EDGE_TEMPLATE,
  Integration.JSON_PROPERTY_REMOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Integration {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private IntegrationId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private IntegrationType type;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @javax.annotation.Nullable
  private Boolean debugMode;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @javax.annotation.Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS = "allowCreateDevicesOrAssets";
  @javax.annotation.Nullable
  private Boolean allowCreateDevicesOrAssets;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_DEFAULT_CONVERTER_ID = "defaultConverterId";
  @javax.annotation.Nonnull
  private ConverterId defaultConverterId;

  public static final String JSON_PROPERTY_DOWNLINK_CONVERTER_ID = "downlinkConverterId";
  @javax.annotation.Nullable
  private ConverterId downlinkConverterId;

  public static final String JSON_PROPERTY_ROUTING_KEY = "routingKey";
  @javax.annotation.Nonnull
  private String routingKey;

  public static final String JSON_PROPERTY_SECRET = "secret";
  @javax.annotation.Nullable
  private String secret;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nonnull
  private com.fasterxml.jackson.databind.JsonNode _configuration;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_EDGE_TEMPLATE = "edgeTemplate";
  @javax.annotation.Nullable
  private Boolean edgeTemplate;

  public static final String JSON_PROPERTY_REMOTE = "remote";
  @javax.annotation.Nullable
  private Boolean remote;

  public Integration() { 
  }

  @JsonCreator
  public Integration(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public Integration id(@javax.annotation.Nullable IntegrationId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Integration Id. Specify this field to update the Integration. Referencing non-existing Integration Id will cause error. Omit this field to create new Integration.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable IntegrationId id) {
    this.id = id;
  }


  /**
   * Timestamp of the integration creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public Integration name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Integration Name
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


  public Integration type(@javax.annotation.Nonnull IntegrationType type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the integration
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IntegrationType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull IntegrationType type) {
    this.type = type;
  }


  public Integration debugMode(@javax.annotation.Nullable Boolean debugMode) {
    this.debugMode = debugMode;
    return this;
  }

  /**
   * Enable/disable debug. 
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


  public Integration debugSettings(@javax.annotation.Nullable DebugSettings debugSettings) {
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


  public Integration enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Boolean flag to enable/disable the integration
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public Integration allowCreateDevicesOrAssets(@javax.annotation.Nullable Boolean allowCreateDevicesOrAssets) {
    this.allowCreateDevicesOrAssets = allowCreateDevicesOrAssets;
    return this;
  }

  /**
   * Boolean flag to allow/disallow the integration to create devices or assets that send message and do not exist in the system yet
   * @return allowCreateDevicesOrAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowCreateDevicesOrAssets() {
    return allowCreateDevicesOrAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOW_CREATE_DEVICES_OR_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowCreateDevicesOrAssets(@javax.annotation.Nullable Boolean allowCreateDevicesOrAssets) {
    this.allowCreateDevicesOrAssets = allowCreateDevicesOrAssets;
  }


  public Integration version(@javax.annotation.Nullable Long version) {
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


  public Integration defaultConverterId(@javax.annotation.Nonnull ConverterId defaultConverterId) {
    this.defaultConverterId = defaultConverterId;
    return this;
  }

  /**
   * JSON object with the Uplink Converter Id
   * @return defaultConverterId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_CONVERTER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConverterId getDefaultConverterId() {
    return defaultConverterId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_CONVERTER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultConverterId(@javax.annotation.Nonnull ConverterId defaultConverterId) {
    this.defaultConverterId = defaultConverterId;
  }


  public Integration downlinkConverterId(@javax.annotation.Nullable ConverterId downlinkConverterId) {
    this.downlinkConverterId = downlinkConverterId;
    return this;
  }

  /**
   * JSON object with the Downlink Converter Id
   * @return downlinkConverterId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOWNLINK_CONVERTER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConverterId getDownlinkConverterId() {
    return downlinkConverterId;
  }


  @JsonProperty(value = JSON_PROPERTY_DOWNLINK_CONVERTER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownlinkConverterId(@javax.annotation.Nullable ConverterId downlinkConverterId) {
    this.downlinkConverterId = downlinkConverterId;
  }


  public Integration routingKey(@javax.annotation.Nonnull String routingKey) {
    this.routingKey = routingKey;
    return this;
  }

  /**
   * String value used by HTTP based integrations for the base URL construction and by the remote integrations. Remote integration uses this value along with the &#39;secret&#39; for kind of security and validation to be able to connect to the platform using Grpc
   * @return routingKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRoutingKey() {
    return routingKey;
  }


  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingKey(@javax.annotation.Nonnull String routingKey) {
    this.routingKey = routingKey;
  }


  public Integration secret(@javax.annotation.Nullable String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * String value used by the remote integrations. Remote integration uses this value along with the &#39;routingKey&#39; for kind of security and validation to be able to connect to the platform using Grpc
   * @return secret
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecret() {
    return secret;
  }


  @JsonProperty(value = JSON_PROPERTY_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecret(@javax.annotation.Nullable String secret) {
    this.secret = secret;
  }


  public Integration _configuration(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON object representing integration configuration. Each integration type has specific configuration with the connectivity parameters (like &#39;host&#39; and &#39;port&#39; for MQTT type or &#39;baseUrl&#39; for HTTP based type, etc.) and other important parameters dependent on the integration type
   * @return _configuration
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
  }


  public Integration additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the integration
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


  public Integration edgeTemplate(@javax.annotation.Nullable Boolean edgeTemplate) {
    this.edgeTemplate = edgeTemplate;
    return this;
  }

  /**
   * Boolean flag that specifies that is regular or edge template integration
   * @return edgeTemplate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdgeTemplate() {
    return edgeTemplate;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeTemplate(@javax.annotation.Nullable Boolean edgeTemplate) {
    this.edgeTemplate = edgeTemplate;
  }


  public Integration remote(@javax.annotation.Nullable Boolean remote) {
    this.remote = remote;
    return this;
  }

  /**
   * Boolean flag to enable/disable the integration to be executed remotely. Remote integration is launched in a separate microservice. Local integration is executed by the platform core
   * @return remote
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REMOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRemote() {
    return remote;
  }


  @JsonProperty(value = JSON_PROPERTY_REMOTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemote(@javax.annotation.Nullable Boolean remote) {
    this.remote = remote;
  }


  /**
   * Return true if this Integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Integration integration = (Integration) o;
    return Objects.equals(this.id, integration.id) &&
        Objects.equals(this.createdTime, integration.createdTime) &&
        Objects.equals(this.tenantId, integration.tenantId) &&
        Objects.equals(this.name, integration.name) &&
        Objects.equals(this.type, integration.type) &&
        Objects.equals(this.debugMode, integration.debugMode) &&
        Objects.equals(this.debugSettings, integration.debugSettings) &&
        Objects.equals(this.enabled, integration.enabled) &&
        Objects.equals(this.allowCreateDevicesOrAssets, integration.allowCreateDevicesOrAssets) &&
        Objects.equals(this.version, integration.version) &&
        Objects.equals(this.defaultConverterId, integration.defaultConverterId) &&
        Objects.equals(this.downlinkConverterId, integration.downlinkConverterId) &&
        Objects.equals(this.routingKey, integration.routingKey) &&
        Objects.equals(this.secret, integration.secret) &&
        Objects.equals(this._configuration, integration._configuration) &&
        Objects.equals(this.additionalInfo, integration.additionalInfo) &&
        Objects.equals(this.edgeTemplate, integration.edgeTemplate) &&
        Objects.equals(this.remote, integration.remote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, type, debugMode, debugSettings, enabled, allowCreateDevicesOrAssets, version, defaultConverterId, downlinkConverterId, routingKey, secret, _configuration, additionalInfo, edgeTemplate, remote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Integration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    allowCreateDevicesOrAssets: ").append(toIndentedString(allowCreateDevicesOrAssets)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    defaultConverterId: ").append(toIndentedString(defaultConverterId)).append("\n");
    sb.append("    downlinkConverterId: ").append(toIndentedString(downlinkConverterId)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    edgeTemplate: ").append(toIndentedString(edgeTemplate)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
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

    // add `allowCreateDevicesOrAssets` to the URL query string
    if (getAllowCreateDevicesOrAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallowCreateDevicesOrAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllowCreateDevicesOrAssets()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `defaultConverterId` to the URL query string
    if (getDefaultConverterId() != null) {
      joiner.add(getDefaultConverterId().toUrlQueryString(prefix + "defaultConverterId" + suffix));
    }

    // add `downlinkConverterId` to the URL query string
    if (getDownlinkConverterId() != null) {
      joiner.add(getDownlinkConverterId().toUrlQueryString(prefix + "downlinkConverterId" + suffix));
    }

    // add `routingKey` to the URL query string
    if (getRoutingKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroutingKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRoutingKey()))));
    }

    // add `secret` to the URL query string
    if (getSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecret()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `edgeTemplate` to the URL query string
    if (getEdgeTemplate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeTemplate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeTemplate()))));
    }

    // add `remote` to the URL query string
    if (getRemote() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sremote%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRemote()))));
    }

    return joiner.toString();
  }
}

