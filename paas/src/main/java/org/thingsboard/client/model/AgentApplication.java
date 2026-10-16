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
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentApplication
 */
@JsonPropertyOrder({
  AgentApplication.JSON_PROPERTY_ID,
  AgentApplication.JSON_PROPERTY_CREATED_TIME,
  AgentApplication.JSON_PROPERTY_TENANT_ID,
  AgentApplication.JSON_PROPERTY_AGENT_ID,
  AgentApplication.JSON_PROPERTY_NAME,
  AgentApplication.JSON_PROPERTY_TEMPLATE_VERSION,
  AgentApplication.JSON_PROPERTY_DESIRED_TEMPLATE_VERSION,
  AgentApplication.JSON_PROPERTY_APP_TYPE,
  AgentApplication.JSON_PROPERTY_CONFIG,
  AgentApplication.JSON_PROPERTY_VERSION,
  AgentApplication.JSON_PROPERTY_PROJECT_NAME,
  AgentApplication.JSON_PROPERTY_PENDING_DELETION,
  AgentApplication.JSON_PROPERTY_ORIGIN,
  AgentApplication.JSON_PROPERTY_APPLICATION_PROFILE_ID,
  AgentApplication.JSON_PROPERTY_PROFILE_CONFIG_VERSION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentApplication {
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

  public AgentApplication() { 
  }

  @JsonCreator
  public AgentApplication(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public AgentApplication id(@Nullable AgentApplicationId id) {
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




  public AgentApplication agentId(@Nonnull AgentId agentId) {
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


  public AgentApplication name(@Nullable String name) {
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


  public AgentApplication templateVersion(@Nonnull String templateVersion) {
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


  public AgentApplication desiredTemplateVersion(@Nullable String desiredTemplateVersion) {
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


  public AgentApplication appType(@Nonnull AgentApplicationType appType) {
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


  public AgentApplication config(@Nullable DockerComposeConfig config) {
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


  public AgentApplication version(@Nullable Long version) {
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


  public AgentApplication projectName(@Nullable String projectName) {
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


  public AgentApplication pendingDeletion(@Nullable Boolean pendingDeletion) {
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


  public AgentApplication origin(@Nullable AgentApplicationOrigin origin) {
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


  public AgentApplication applicationProfileId(@Nullable AgentAppProfileId applicationProfileId) {
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


  public AgentApplication profileConfigVersion(@Nullable Long profileConfigVersion) {
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
   * Return true if this AgentApplication object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentApplication agentApplication = (AgentApplication) o;
    return Objects.equals(this.id, agentApplication.id) &&
        Objects.equals(this.createdTime, agentApplication.createdTime) &&
        Objects.equals(this.tenantId, agentApplication.tenantId) &&
        Objects.equals(this.agentId, agentApplication.agentId) &&
        Objects.equals(this.name, agentApplication.name) &&
        Objects.equals(this.templateVersion, agentApplication.templateVersion) &&
        Objects.equals(this.desiredTemplateVersion, agentApplication.desiredTemplateVersion) &&
        Objects.equals(this.appType, agentApplication.appType) &&
        Objects.equals(this.config, agentApplication.config) &&
        Objects.equals(this.version, agentApplication.version) &&
        Objects.equals(this.projectName, agentApplication.projectName) &&
        Objects.equals(this.pendingDeletion, agentApplication.pendingDeletion) &&
        Objects.equals(this.origin, agentApplication.origin) &&
        Objects.equals(this.applicationProfileId, agentApplication.applicationProfileId) &&
        Objects.equals(this.profileConfigVersion, agentApplication.profileConfigVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, agentId, name, templateVersion, desiredTemplateVersion, appType, config, version, projectName, pendingDeletion, origin, applicationProfileId, profileConfigVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentApplication {\n");
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

    return joiner.toString();
  }
}

