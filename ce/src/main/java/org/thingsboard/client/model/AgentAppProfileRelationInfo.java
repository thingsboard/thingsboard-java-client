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
import org.thingsboard.client.model.AgentAppProfileId;
import org.thingsboard.client.model.AgentApplicationType;
import org.thingsboard.client.model.AgentProfileId;
import org.thingsboard.client.model.DockerComposeConfig;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentAppProfileRelationInfo
 */
@JsonPropertyOrder({
  AgentAppProfileRelationInfo.JSON_PROPERTY_ID,
  AgentAppProfileRelationInfo.JSON_PROPERTY_CREATED_TIME,
  AgentAppProfileRelationInfo.JSON_PROPERTY_TENANT_ID,
  AgentAppProfileRelationInfo.JSON_PROPERTY_NAME,
  AgentAppProfileRelationInfo.JSON_PROPERTY_DESCRIPTION,
  AgentAppProfileRelationInfo.JSON_PROPERTY_APP_TYPE,
  AgentAppProfileRelationInfo.JSON_PROPERTY_TEMPLATE_VERSION,
  AgentAppProfileRelationInfo.JSON_PROPERTY_CONFIG,
  AgentAppProfileRelationInfo.JSON_PROPERTY_VERSION,
  AgentAppProfileRelationInfo.JSON_PROPERTY_TEMPLATE_CURRENT_VERSION,
  AgentAppProfileRelationInfo.JSON_PROPERTY_AGENT_PROFILE_ID,
  AgentAppProfileRelationInfo.JSON_PROPERTY_ASSIGNED_APPLICATIONS_COUNT,
  AgentAppProfileRelationInfo.JSON_PROPERTY_ADDITIONAL_INFO
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppProfileRelationInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentAppProfileId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nullable
  private String description;

  public static final String JSON_PROPERTY_APP_TYPE = "appType";
  @Nonnull
  private AgentApplicationType appType;

  public static final String JSON_PROPERTY_TEMPLATE_VERSION = "templateVersion";
  @Nonnull
  private String templateVersion;

  public static final String JSON_PROPERTY_CONFIG = "config";
  @Nullable
  private DockerComposeConfig config;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_TEMPLATE_CURRENT_VERSION = "templateCurrentVersion";
  @Nullable
  private String templateCurrentVersion;

  public static final String JSON_PROPERTY_AGENT_PROFILE_ID = "agentProfileId";
  @Nullable
  private AgentProfileId agentProfileId;

  public static final String JSON_PROPERTY_ASSIGNED_APPLICATIONS_COUNT = "assignedApplicationsCount";
  @Nullable
  private Long assignedApplicationsCount;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public AgentAppProfileRelationInfo() { 
  }

  @JsonCreator
  public AgentAppProfileRelationInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_TEMPLATE_CURRENT_VERSION) String templateCurrentVersion, 
    @JsonProperty(JSON_PROPERTY_AGENT_PROFILE_ID) AgentProfileId agentProfileId, 
    @JsonProperty(JSON_PROPERTY_ASSIGNED_APPLICATIONS_COUNT) Long assignedApplicationsCount, 
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO) com.fasterxml.jackson.databind.JsonNode additionalInfo
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.templateCurrentVersion = templateCurrentVersion;
    this.agentProfileId = agentProfileId;
    this.assignedApplicationsCount = assignedApplicationsCount;
    this.additionalInfo = additionalInfo;
  }

  public AgentAppProfileRelationInfo id(@Nullable AgentAppProfileId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent Application Profile Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppProfileId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentAppProfileId id) {
    this.id = id;
  }


  /**
   * Timestamp of the profile creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public AgentAppProfileRelationInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique profile name within tenant
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


  public AgentAppProfileRelationInfo description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Profile description
   * @return description
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@Nullable String description) {
    this.description = description;
  }


  public AgentAppProfileRelationInfo appType(@Nonnull AgentApplicationType appType) {
    this.appType = appType;
    return this;
  }

  /**
   * Application type: EDGE, GATEWAY, or GENERIC
   * @return appType
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_APP_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AgentApplicationType getAppType() {
    return appType;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppType(@Nonnull AgentApplicationType appType) {
    this.appType = appType;
  }


  public AgentAppProfileRelationInfo templateVersion(@Nonnull String templateVersion) {
    this.templateVersion = templateVersion;
    return this;
  }

  /**
   * Template version this profile is based on
   * @return templateVersion
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTemplateVersion() {
    return templateVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateVersion(@Nonnull String templateVersion) {
    this.templateVersion = templateVersion;
  }


  public AgentAppProfileRelationInfo config(@Nullable DockerComposeConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DockerComposeConfig getConfig() {
    return config;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(@Nullable DockerComposeConfig config) {
    this.config = config;
  }


  public AgentAppProfileRelationInfo version(@Nullable Long version) {
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


  /**
   * Current version of the template this profile points to.
   * @return templateCurrentVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplateCurrentVersion() {
    return templateCurrentVersion;
  }




  /**
   * JSON object with the Agent Profile Id this app profile is assigned to.
   * @return agentProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentProfileId getAgentProfileId() {
    return agentProfileId;
  }




  /**
   * Number of AgentApplications using this app profile within the agent profile.
   * @return assignedApplicationsCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNED_APPLICATIONS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssignedApplicationsCount() {
    return assignedApplicationsCount;
  }




  /**
   * Additional info of the assignment relation between the agent profile and this app profile.
   * @return additionalInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }




  /**
   * Return true if this AgentAppProfileRelationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppProfileRelationInfo agentAppProfileRelationInfo = (AgentAppProfileRelationInfo) o;
    return Objects.equals(this.id, agentAppProfileRelationInfo.id) &&
        Objects.equals(this.createdTime, agentAppProfileRelationInfo.createdTime) &&
        Objects.equals(this.tenantId, agentAppProfileRelationInfo.tenantId) &&
        Objects.equals(this.name, agentAppProfileRelationInfo.name) &&
        Objects.equals(this.description, agentAppProfileRelationInfo.description) &&
        Objects.equals(this.appType, agentAppProfileRelationInfo.appType) &&
        Objects.equals(this.templateVersion, agentAppProfileRelationInfo.templateVersion) &&
        Objects.equals(this.config, agentAppProfileRelationInfo.config) &&
        Objects.equals(this.version, agentAppProfileRelationInfo.version) &&
        Objects.equals(this.templateCurrentVersion, agentAppProfileRelationInfo.templateCurrentVersion) &&
        Objects.equals(this.agentProfileId, agentAppProfileRelationInfo.agentProfileId) &&
        Objects.equals(this.assignedApplicationsCount, agentAppProfileRelationInfo.assignedApplicationsCount) &&
        Objects.equals(this.additionalInfo, agentAppProfileRelationInfo.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, description, appType, templateVersion, config, version, templateCurrentVersion, agentProfileId, assignedApplicationsCount, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppProfileRelationInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    templateCurrentVersion: ").append(toIndentedString(templateCurrentVersion)).append("\n");
    sb.append("    agentProfileId: ").append(toIndentedString(agentProfileId)).append("\n");
    sb.append("    assignedApplicationsCount: ").append(toIndentedString(assignedApplicationsCount)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `appType` to the URL query string
    if (getAppType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppType()))));
    }

    // add `templateVersion` to the URL query string
    if (getTemplateVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stemplateVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTemplateVersion()))));
    }

    // add `config` to the URL query string
    if (getConfig() != null) {
      joiner.add(getConfig().toUrlQueryString(prefix + "config" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `templateCurrentVersion` to the URL query string
    if (getTemplateCurrentVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stemplateCurrentVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTemplateCurrentVersion()))));
    }

    // add `agentProfileId` to the URL query string
    if (getAgentProfileId() != null) {
      joiner.add(getAgentProfileId().toUrlQueryString(prefix + "agentProfileId" + suffix));
    }

    // add `assignedApplicationsCount` to the URL query string
    if (getAssignedApplicationsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassignedApplicationsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssignedApplicationsCount()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

