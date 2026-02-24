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
import org.thingsboard.client.model.ConverterType;
import org.thingsboard.client.model.DebugSettings;
import org.thingsboard.client.model.IntegrationType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Converter
 */
@JsonPropertyOrder({
  Converter.JSON_PROPERTY_ID,
  Converter.JSON_PROPERTY_CREATED_TIME,
  Converter.JSON_PROPERTY_TENANT_ID,
  Converter.JSON_PROPERTY_NAME,
  Converter.JSON_PROPERTY_TYPE,
  Converter.JSON_PROPERTY_INTEGRATION_TYPE,
  Converter.JSON_PROPERTY_DEBUG_MODE,
  Converter.JSON_PROPERTY_DEBUG_SETTINGS,
  Converter.JSON_PROPERTY_CONFIGURATION,
  Converter.JSON_PROPERTY_ADDITIONAL_INFO,
  Converter.JSON_PROPERTY_EDGE_TEMPLATE,
  Converter.JSON_PROPERTY_CONVERTER_VERSION,
  Converter.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Converter {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private ConverterId id;

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
  private ConverterType type;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  @javax.annotation.Nullable
  private IntegrationType integrationType;

  public static final String JSON_PROPERTY_DEBUG_MODE = "debugMode";
  @javax.annotation.Nullable
  private Boolean debugMode;

  public static final String JSON_PROPERTY_DEBUG_SETTINGS = "debugSettings";
  @javax.annotation.Nullable
  private DebugSettings debugSettings;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_EDGE_TEMPLATE = "edgeTemplate";
  @javax.annotation.Nullable
  private Boolean edgeTemplate;

  public static final String JSON_PROPERTY_CONVERTER_VERSION = "converterVersion";
  @javax.annotation.Nullable
  private Integer converterVersion;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public Converter() { 
  }

  @JsonCreator
  public Converter(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public Converter id(@javax.annotation.Nullable ConverterId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Converter Id. Specify this field to update the Converter. Referencing non-existing Converter Id will cause error. Omit this field to create new Converter.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConverterId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable ConverterId id) {
    this.id = id;
  }


  /**
   * Timestamp of the converter creation, in milliseconds
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




  public Converter name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Converter Name in scope of Tenant
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


  public Converter type(@javax.annotation.Nonnull ConverterType type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the converter to process incoming or outgoing messages
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConverterType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull ConverterType type) {
    this.type = type;
  }


  public Converter integrationType(@javax.annotation.Nullable IntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * The type of the integration to which the converter is dedicated
   * @return integrationType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationType getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(@javax.annotation.Nullable IntegrationType integrationType) {
    this.integrationType = integrationType;
  }


  public Converter debugMode(@javax.annotation.Nullable Boolean debugMode) {
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


  public Converter debugSettings(@javax.annotation.Nullable DebugSettings debugSettings) {
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


  public Converter _configuration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON object representing converter configuration. It should contain one of two possible fields: &#39;decoder&#39; or &#39;encoder&#39;. The former is used when the converter has UPLINK type, the latter is used - when DOWNLINK type. It can contain both &#39;decoder&#39; and &#39;encoder&#39; fields, when the correct one is specified for the appropriate converter type, another one can be set to &#39;null&#39;
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


  public Converter additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the converter
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


  public Converter edgeTemplate(@javax.annotation.Nullable Boolean edgeTemplate) {
    this.edgeTemplate = edgeTemplate;
    return this;
  }

  /**
   * Boolean flag that specifies that is regular or edge template converter
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


  public Converter converterVersion(@javax.annotation.Nullable Integer converterVersion) {
    this.converterVersion = converterVersion;
    return this;
  }

  /**
   * Get converterVersion
   * @return converterVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONVERTER_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getConverterVersion() {
    return converterVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CONVERTER_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConverterVersion(@javax.annotation.Nullable Integer converterVersion) {
    this.converterVersion = converterVersion;
  }


  public Converter version(@javax.annotation.Nullable Long version) {
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
   * Return true if this Converter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Converter converter = (Converter) o;
    return Objects.equals(this.id, converter.id) &&
        Objects.equals(this.createdTime, converter.createdTime) &&
        Objects.equals(this.tenantId, converter.tenantId) &&
        Objects.equals(this.name, converter.name) &&
        Objects.equals(this.type, converter.type) &&
        Objects.equals(this.integrationType, converter.integrationType) &&
        Objects.equals(this.debugMode, converter.debugMode) &&
        Objects.equals(this.debugSettings, converter.debugSettings) &&
        Objects.equals(this._configuration, converter._configuration) &&
        Objects.equals(this.additionalInfo, converter.additionalInfo) &&
        Objects.equals(this.edgeTemplate, converter.edgeTemplate) &&
        Objects.equals(this.converterVersion, converter.converterVersion) &&
        Objects.equals(this.version, converter.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, type, integrationType, debugMode, debugSettings, _configuration, additionalInfo, edgeTemplate, converterVersion, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Converter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    debugSettings: ").append(toIndentedString(debugSettings)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    edgeTemplate: ").append(toIndentedString(edgeTemplate)).append("\n");
    sb.append("    converterVersion: ").append(toIndentedString(converterVersion)).append("\n");
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

    // add `integrationType` to the URL query string
    if (getIntegrationType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrationType()))));
    }

    // add `debugMode` to the URL query string
    if (getDebugMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdebugMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDebugMode()))));
    }

    // add `debugSettings` to the URL query string
    if (getDebugSettings() != null) {
      joiner.add(getDebugSettings().toUrlQueryString(prefix + "debugSettings" + suffix));
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

    // add `converterVersion` to the URL query string
    if (getConverterVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconverterVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConverterVersion()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    return joiner.toString();
  }
}

