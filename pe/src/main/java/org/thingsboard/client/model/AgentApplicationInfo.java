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
import org.thingsboard.client.model.AgentApplicationId;
import org.thingsboard.client.model.AgentApplicationOrigin;
import org.thingsboard.client.model.AgentApplicationType;
import org.thingsboard.client.model.AgentId;
import org.thingsboard.client.model.DockerComposeConfig;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentApplicationInfo
 */
@JsonPropertyOrder({
  AgentApplicationInfo.JSON_PROPERTY_ID,
  AgentApplicationInfo.JSON_PROPERTY_CREATED_TIME,
  AgentApplicationInfo.JSON_PROPERTY_TENANT_ID,
  AgentApplicationInfo.JSON_PROPERTY_AGENT_ID,
  AgentApplicationInfo.JSON_PROPERTY_NAME,
  AgentApplicationInfo.JSON_PROPERTY_TEMPLATE_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_DESIRED_TEMPLATE_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_APP_TYPE,
  AgentApplicationInfo.JSON_PROPERTY_CONFIG,
  AgentApplicationInfo.JSON_PROPERTY_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_PROJECT_NAME,
  AgentApplicationInfo.JSON_PROPERTY_PENDING_DELETION,
  AgentApplicationInfo.JSON_PROPERTY_ORIGIN,
  AgentApplicationInfo.JSON_PROPERTY_APPLICATION_PROFILE_ID,
  AgentApplicationInfo.JSON_PROPERTY_PROFILE_CONFIG_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_CURRENT_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_NEXT_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_PROFILE_CONFIG_OUTDATED,
  AgentApplicationInfo.JSON_PROPERTY_PROFILE_NAME,
  AgentApplicationInfo.JSON_PROPERTY_PROFILE_TEMPLATE_VERSION,
  AgentApplicationInfo.JSON_PROPERTY_AGENT_NAME,
  AgentApplicationInfo.JSON_PROPERTY_RELATED_ENTITY_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentApplicationInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentApplicationId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  @Nonnull
  private AgentId agentId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_TEMPLATE_VERSION = "templateVersion";
  @Nonnull
  private String templateVersion;

  public static final String JSON_PROPERTY_DESIRED_TEMPLATE_VERSION = "desiredTemplateVersion";
  @Nullable
  private String desiredTemplateVersion;

  public static final String JSON_PROPERTY_APP_TYPE = "appType";
  @Nonnull
  private AgentApplicationType appType;

  public static final String JSON_PROPERTY_CONFIG = "config";
  @Nullable
  private DockerComposeConfig config;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_PROJECT_NAME = "projectName";
  @Nullable
  private String projectName;

  public static final String JSON_PROPERTY_PENDING_DELETION = "pendingDeletion";
  @Nullable
  private Boolean pendingDeletion;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  @Nullable
  private AgentApplicationOrigin origin;

  public static final String JSON_PROPERTY_APPLICATION_PROFILE_ID = "applicationProfileId";
  @Nullable
  private AgentAppProfileId applicationProfileId;

  public static final String JSON_PROPERTY_PROFILE_CONFIG_VERSION = "profileConfigVersion";
  @Nullable
  private Long profileConfigVersion;

  public static final String JSON_PROPERTY_CURRENT_VERSION = "currentVersion";
  @Nullable
  private String currentVersion;

  public static final String JSON_PROPERTY_NEXT_VERSION = "nextVersion";
  @Nullable
  private String nextVersion;

  public static final String JSON_PROPERTY_PROFILE_CONFIG_OUTDATED = "profileConfigOutdated";
  @Nullable
  private Boolean profileConfigOutdated;

  public static final String JSON_PROPERTY_PROFILE_NAME = "profileName";
  @Nullable
  private String profileName;

  public static final String JSON_PROPERTY_PROFILE_TEMPLATE_VERSION = "profileTemplateVersion";
  @Nullable
  private String profileTemplateVersion;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  @Nullable
  private String agentName;

  public static final String JSON_PROPERTY_RELATED_ENTITY_ID = "relatedEntityId";
  @Nullable
  private EntityId relatedEntityId;

  public AgentApplicationInfo() { 
  }

  @JsonCreator
  public AgentApplicationInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CURRENT_VERSION) String currentVersion, 
    @JsonProperty(JSON_PROPERTY_NEXT_VERSION) String nextVersion, 
    @JsonProperty(JSON_PROPERTY_PROFILE_CONFIG_OUTDATED) Boolean profileConfigOutdated, 
    @JsonProperty(JSON_PROPERTY_PROFILE_NAME) String profileName, 
    @JsonProperty(JSON_PROPERTY_PROFILE_TEMPLATE_VERSION) String profileTemplateVersion, 
    @JsonProperty(JSON_PROPERTY_AGENT_NAME) String agentName, 
    @JsonProperty(JSON_PROPERTY_RELATED_ENTITY_ID) EntityId relatedEntityId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.currentVersion = currentVersion;
    this.nextVersion = nextVersion;
    this.profileConfigOutdated = profileConfigOutdated;
    this.profileName = profileName;
    this.profileTemplateVersion = profileTemplateVersion;
    this.agentName = agentName;
    this.relatedEntityId = relatedEntityId;
  }

  public AgentApplicationInfo id(@Nullable AgentApplicationId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent Application Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentApplicationId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentApplicationId id) {
    this.id = id;
  }


  /**
   * Timestamp of the agent application creation, in milliseconds
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




  public AgentApplicationInfo agentId(@Nonnull AgentId agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Agent this application belongs to
   * @return agentId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_AGENT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AgentId getAgentId() {
    return agentId;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentId(@Nonnull AgentId agentId) {
    this.agentId = agentId;
  }


  public AgentApplicationInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Application name (not unique across tenant)
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


  public AgentApplicationInfo templateVersion(@Nonnull String templateVersion) {
    this.templateVersion = templateVersion;
    return this;
  }

  /**
   * Template version this application is based on
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


  public AgentApplicationInfo desiredTemplateVersion(@Nullable String desiredTemplateVersion) {
    this.desiredTemplateVersion = desiredTemplateVersion;
    return this;
  }

  /**
   * Get desiredTemplateVersion
   * @return desiredTemplateVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESIRED_TEMPLATE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDesiredTemplateVersion() {
    return desiredTemplateVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_DESIRED_TEMPLATE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredTemplateVersion(@Nullable String desiredTemplateVersion) {
    this.desiredTemplateVersion = desiredTemplateVersion;
  }


  public AgentApplicationInfo appType(@Nonnull AgentApplicationType appType) {
    this.appType = appType;
    return this;
  }

  /**
   * Application type
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


  public AgentApplicationInfo config(@Nullable DockerComposeConfig config) {
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


  public AgentApplicationInfo version(@Nullable Long version) {
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


  public AgentApplicationInfo projectName(@Nullable String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROJECT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProjectName() {
    return projectName;
  }


  @JsonProperty(value = JSON_PROPERTY_PROJECT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectName(@Nullable String projectName) {
    this.projectName = projectName;
  }


  public AgentApplicationInfo pendingDeletion(@Nullable Boolean pendingDeletion) {
    this.pendingDeletion = pendingDeletion;
    return this;
  }

  /**
   * Get pendingDeletion
   * @return pendingDeletion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PENDING_DELETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPendingDeletion() {
    return pendingDeletion;
  }


  @JsonProperty(value = JSON_PROPERTY_PENDING_DELETION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPendingDeletion(@Nullable Boolean pendingDeletion) {
    this.pendingDeletion = pendingDeletion;
  }


  public AgentApplicationInfo origin(@Nullable AgentApplicationOrigin origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Origin of the application (INSTALLED or DISCOVERED)
   * @return origin
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentApplicationOrigin getOrigin() {
    return origin;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGIN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrigin(@Nullable AgentApplicationOrigin origin) {
    this.origin = origin;
  }


  public AgentApplicationInfo applicationProfileId(@Nullable AgentAppProfileId applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
    return this;
  }

  /**
   * Application Profile Id. When set, config is read-only and inherited from the profile.
   * @return applicationProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_APPLICATION_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppProfileId getApplicationProfileId() {
    return applicationProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_APPLICATION_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationProfileId(@Nullable AgentAppProfileId applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
  }


  public AgentApplicationInfo profileConfigVersion(@Nullable Long profileConfigVersion) {
    this.profileConfigVersion = profileConfigVersion;
    return this;
  }

  /**
   * Get profileConfigVersion
   * @return profileConfigVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_CONFIG_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getProfileConfigVersion() {
    return profileConfigVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_CONFIG_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileConfigVersion(@Nullable Long profileConfigVersion) {
    this.profileConfigVersion = profileConfigVersion;
  }


  /**
   * Current version of the template this application is based on.
   * @return currentVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentVersion() {
    return currentVersion;
  }




  /**
   * Next version available for upgrade.
   * @return nextVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NEXT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextVersion() {
    return nextVersion;
  }




  /**
   * True if the app&#39;s config is outdated relative to its profile.
   * @return profileConfigOutdated
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_CONFIG_OUTDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getProfileConfigOutdated() {
    return profileConfigOutdated;
  }




  /**
   * Name of the application profile this app is based on.
   * @return profileName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProfileName() {
    return profileName;
  }




  /**
   * Template version of the application profile this app is based on.
   * @return profileTemplateVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_TEMPLATE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProfileTemplateVersion() {
    return profileTemplateVersion;
  }




  /**
   * Name of the owning agent.
   * @return agentName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentName() {
    return agentName;
  }




  /**
   * Related entity id (Edge or Gateway device) currently assigned to this application.
   * @return relatedEntityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATED_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getRelatedEntityId() {
    return relatedEntityId;
  }




  /**
   * Return true if this AgentApplicationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentApplicationInfo agentApplicationInfo = (AgentApplicationInfo) o;
    return Objects.equals(this.id, agentApplicationInfo.id) &&
        Objects.equals(this.createdTime, agentApplicationInfo.createdTime) &&
        Objects.equals(this.tenantId, agentApplicationInfo.tenantId) &&
        Objects.equals(this.agentId, agentApplicationInfo.agentId) &&
        Objects.equals(this.name, agentApplicationInfo.name) &&
        Objects.equals(this.templateVersion, agentApplicationInfo.templateVersion) &&
        Objects.equals(this.desiredTemplateVersion, agentApplicationInfo.desiredTemplateVersion) &&
        Objects.equals(this.appType, agentApplicationInfo.appType) &&
        Objects.equals(this.config, agentApplicationInfo.config) &&
        Objects.equals(this.version, agentApplicationInfo.version) &&
        Objects.equals(this.projectName, agentApplicationInfo.projectName) &&
        Objects.equals(this.pendingDeletion, agentApplicationInfo.pendingDeletion) &&
        Objects.equals(this.origin, agentApplicationInfo.origin) &&
        Objects.equals(this.applicationProfileId, agentApplicationInfo.applicationProfileId) &&
        Objects.equals(this.profileConfigVersion, agentApplicationInfo.profileConfigVersion) &&
        Objects.equals(this.currentVersion, agentApplicationInfo.currentVersion) &&
        Objects.equals(this.nextVersion, agentApplicationInfo.nextVersion) &&
        Objects.equals(this.profileConfigOutdated, agentApplicationInfo.profileConfigOutdated) &&
        Objects.equals(this.profileName, agentApplicationInfo.profileName) &&
        Objects.equals(this.profileTemplateVersion, agentApplicationInfo.profileTemplateVersion) &&
        Objects.equals(this.agentName, agentApplicationInfo.agentName) &&
        Objects.equals(this.relatedEntityId, agentApplicationInfo.relatedEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, agentId, name, templateVersion, desiredTemplateVersion, appType, config, version, projectName, pendingDeletion, origin, applicationProfileId, profileConfigVersion, currentVersion, nextVersion, profileConfigOutdated, profileName, profileTemplateVersion, agentName, relatedEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentApplicationInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
    sb.append("    desiredTemplateVersion: ").append(toIndentedString(desiredTemplateVersion)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    pendingDeletion: ").append(toIndentedString(pendingDeletion)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    applicationProfileId: ").append(toIndentedString(applicationProfileId)).append("\n");
    sb.append("    profileConfigVersion: ").append(toIndentedString(profileConfigVersion)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
    sb.append("    profileConfigOutdated: ").append(toIndentedString(profileConfigOutdated)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    profileTemplateVersion: ").append(toIndentedString(profileTemplateVersion)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    relatedEntityId: ").append(toIndentedString(relatedEntityId)).append("\n");
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

    // add `agentId` to the URL query string
    if (getAgentId() != null) {
      joiner.add(getAgentId().toUrlQueryString(prefix + "agentId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `templateVersion` to the URL query string
    if (getTemplateVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stemplateVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTemplateVersion()))));
    }

    // add `desiredTemplateVersion` to the URL query string
    if (getDesiredTemplateVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdesiredTemplateVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDesiredTemplateVersion()))));
    }

    // add `appType` to the URL query string
    if (getAppType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppType()))));
    }

    // add `config` to the URL query string
    if (getConfig() != null) {
      joiner.add(getConfig().toUrlQueryString(prefix + "config" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `projectName` to the URL query string
    if (getProjectName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprojectName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProjectName()))));
    }

    // add `pendingDeletion` to the URL query string
    if (getPendingDeletion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spendingDeletion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPendingDeletion()))));
    }

    // add `origin` to the URL query string
    if (getOrigin() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sorigin%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOrigin()))));
    }

    // add `applicationProfileId` to the URL query string
    if (getApplicationProfileId() != null) {
      joiner.add(getApplicationProfileId().toUrlQueryString(prefix + "applicationProfileId" + suffix));
    }

    // add `profileConfigVersion` to the URL query string
    if (getProfileConfigVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprofileConfigVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProfileConfigVersion()))));
    }

    // add `currentVersion` to the URL query string
    if (getCurrentVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentVersion()))));
    }

    // add `nextVersion` to the URL query string
    if (getNextVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snextVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextVersion()))));
    }

    // add `profileConfigOutdated` to the URL query string
    if (getProfileConfigOutdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprofileConfigOutdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProfileConfigOutdated()))));
    }

    // add `profileName` to the URL query string
    if (getProfileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprofileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProfileName()))));
    }

    // add `profileTemplateVersion` to the URL query string
    if (getProfileTemplateVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprofileTemplateVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProfileTemplateVersion()))));
    }

    // add `agentName` to the URL query string
    if (getAgentName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentName()))));
    }

    // add `relatedEntityId` to the URL query string
    if (getRelatedEntityId() != null) {
      joiner.add(getRelatedEntityId().toUrlQueryString(prefix + "relatedEntityId" + suffix));
    }

    return joiner.toString();
  }
}

