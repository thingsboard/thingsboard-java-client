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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.AgentAppConfigType;
import org.thingsboard.client.model.AgentAppTemplateStartStepsInner;
import org.thingsboard.client.model.AgentApplicationType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentAppTemplate
 */
@JsonPropertyOrder({
  AgentAppTemplate.JSON_PROPERTY_TENANT_ID,
  AgentAppTemplate.JSON_PROPERTY_APP_TYPE,
  AgentAppTemplate.JSON_PROPERTY_CONFIG_TYPE,
  AgentAppTemplate.JSON_PROPERTY_CURRENT_VERSION,
  AgentAppTemplate.JSON_PROPERTY_NEXT_VERSION,
  AgentAppTemplate.JSON_PROPERTY_START_STEPS,
  AgentAppTemplate.JSON_PROPERTY_UPGRADE_STEPS,
  AgentAppTemplate.JSON_PROPERTY_DELETE_STEPS,
  AgentAppTemplate.JSON_PROPERTY_ROLLBACK_STEPS,
  AgentAppTemplate.JSON_PROPERTY_RESTART_STEPS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppTemplate {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_APP_TYPE = "appType";
  @Nonnull
  private AgentApplicationType appType;

  public static final String JSON_PROPERTY_CONFIG_TYPE = "configType";
  @Nullable
  private AgentAppConfigType configType;

  public static final String JSON_PROPERTY_CURRENT_VERSION = "currentVersion";
  @Nonnull
  private String currentVersion;

  public static final String JSON_PROPERTY_NEXT_VERSION = "nextVersion";
  @Nullable
  private String nextVersion;

  public static final String JSON_PROPERTY_START_STEPS = "startSteps";
  @Nullable
  private List<AgentAppTemplateStartStepsInner> startSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_UPGRADE_STEPS = "upgradeSteps";
  @Nullable
  private List<AgentAppTemplateStartStepsInner> upgradeSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_DELETE_STEPS = "deleteSteps";
  @Nullable
  private List<AgentAppTemplateStartStepsInner> deleteSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_ROLLBACK_STEPS = "rollbackSteps";
  @Nullable
  private List<AgentAppTemplateStartStepsInner> rollbackSteps = new ArrayList<>();

  public static final String JSON_PROPERTY_RESTART_STEPS = "restartSteps";
  @Nullable
  private List<AgentAppTemplateStartStepsInner> restartSteps = new ArrayList<>();

  public AgentAppTemplate() { 
  }

  @JsonCreator
  public AgentAppTemplate(
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.tenantId = tenantId;
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




  public AgentAppTemplate appType(@Nonnull AgentApplicationType appType) {
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


  public AgentAppTemplate configType(@Nullable AgentAppConfigType configType) {
    this.configType = configType;
    return this;
  }

  /**
   * Config type (e.g. &#39;DOCKER_COMPOSE&#39;); the compose body lives in the template&#39;s compose-template step, not here
   * @return configType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIG_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppConfigType getConfigType() {
    return configType;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIG_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigType(@Nullable AgentAppConfigType configType) {
    this.configType = configType;
  }


  public AgentAppTemplate currentVersion(@Nonnull String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Current template version
   * @return currentVersion
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrentVersion() {
    return currentVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentVersion(@Nonnull String currentVersion) {
    this.currentVersion = currentVersion;
  }


  public AgentAppTemplate nextVersion(@Nullable String nextVersion) {
    this.nextVersion = nextVersion;
    return this;
  }

  /**
   * Next template version
   * @return nextVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NEXT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextVersion() {
    return nextVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_NEXT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextVersion(@Nullable String nextVersion) {
    this.nextVersion = nextVersion;
  }


  public AgentAppTemplate startSteps(@Nullable List<AgentAppTemplateStartStepsInner> startSteps) {
    this.startSteps = startSteps;
    return this;
  }

  public AgentAppTemplate addStartStepsItem(AgentAppTemplateStartStepsInner startStepsItem) {
    if (this.startSteps == null) {
      this.startSteps = new ArrayList<>();
    }
    this.startSteps.add(startStepsItem);
    return this;
  }

  /**
   * Start steps
   * @return startSteps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_START_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentAppTemplateStartStepsInner> getStartSteps() {
    return startSteps;
  }


  @JsonProperty(value = JSON_PROPERTY_START_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartSteps(@Nullable List<AgentAppTemplateStartStepsInner> startSteps) {
    this.startSteps = startSteps;
  }


  public AgentAppTemplate upgradeSteps(@Nullable List<AgentAppTemplateStartStepsInner> upgradeSteps) {
    this.upgradeSteps = upgradeSteps;
    return this;
  }

  public AgentAppTemplate addUpgradeStepsItem(AgentAppTemplateStartStepsInner upgradeStepsItem) {
    if (this.upgradeSteps == null) {
      this.upgradeSteps = new ArrayList<>();
    }
    this.upgradeSteps.add(upgradeStepsItem);
    return this;
  }

  /**
   * Upgrade steps
   * @return upgradeSteps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPGRADE_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentAppTemplateStartStepsInner> getUpgradeSteps() {
    return upgradeSteps;
  }


  @JsonProperty(value = JSON_PROPERTY_UPGRADE_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpgradeSteps(@Nullable List<AgentAppTemplateStartStepsInner> upgradeSteps) {
    this.upgradeSteps = upgradeSteps;
  }


  public AgentAppTemplate deleteSteps(@Nullable List<AgentAppTemplateStartStepsInner> deleteSteps) {
    this.deleteSteps = deleteSteps;
    return this;
  }

  public AgentAppTemplate addDeleteStepsItem(AgentAppTemplateStartStepsInner deleteStepsItem) {
    if (this.deleteSteps == null) {
      this.deleteSteps = new ArrayList<>();
    }
    this.deleteSteps.add(deleteStepsItem);
    return this;
  }

  /**
   * Delete steps
   * @return deleteSteps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DELETE_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentAppTemplateStartStepsInner> getDeleteSteps() {
    return deleteSteps;
  }


  @JsonProperty(value = JSON_PROPERTY_DELETE_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteSteps(@Nullable List<AgentAppTemplateStartStepsInner> deleteSteps) {
    this.deleteSteps = deleteSteps;
  }


  public AgentAppTemplate rollbackSteps(@Nullable List<AgentAppTemplateStartStepsInner> rollbackSteps) {
    this.rollbackSteps = rollbackSteps;
    return this;
  }

  public AgentAppTemplate addRollbackStepsItem(AgentAppTemplateStartStepsInner rollbackStepsItem) {
    if (this.rollbackSteps == null) {
      this.rollbackSteps = new ArrayList<>();
    }
    this.rollbackSteps.add(rollbackStepsItem);
    return this;
  }

  /**
   * Rollback steps
   * @return rollbackSteps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLLBACK_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentAppTemplateStartStepsInner> getRollbackSteps() {
    return rollbackSteps;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLLBACK_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRollbackSteps(@Nullable List<AgentAppTemplateStartStepsInner> rollbackSteps) {
    this.rollbackSteps = rollbackSteps;
  }


  public AgentAppTemplate restartSteps(@Nullable List<AgentAppTemplateStartStepsInner> restartSteps) {
    this.restartSteps = restartSteps;
    return this;
  }

  public AgentAppTemplate addRestartStepsItem(AgentAppTemplateStartStepsInner restartStepsItem) {
    if (this.restartSteps == null) {
      this.restartSteps = new ArrayList<>();
    }
    this.restartSteps.add(restartStepsItem);
    return this;
  }

  /**
   * Restart steps
   * @return restartSteps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESTART_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentAppTemplateStartStepsInner> getRestartSteps() {
    return restartSteps;
  }


  @JsonProperty(value = JSON_PROPERTY_RESTART_STEPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestartSteps(@Nullable List<AgentAppTemplateStartStepsInner> restartSteps) {
    this.restartSteps = restartSteps;
  }


  /**
   * Return true if this AgentAppTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppTemplate agentAppTemplate = (AgentAppTemplate) o;
    return Objects.equals(this.tenantId, agentAppTemplate.tenantId) &&
        Objects.equals(this.appType, agentAppTemplate.appType) &&
        Objects.equals(this.configType, agentAppTemplate.configType) &&
        Objects.equals(this.currentVersion, agentAppTemplate.currentVersion) &&
        Objects.equals(this.nextVersion, agentAppTemplate.nextVersion) &&
        Objects.equals(this.startSteps, agentAppTemplate.startSteps) &&
        Objects.equals(this.upgradeSteps, agentAppTemplate.upgradeSteps) &&
        Objects.equals(this.deleteSteps, agentAppTemplate.deleteSteps) &&
        Objects.equals(this.rollbackSteps, agentAppTemplate.rollbackSteps) &&
        Objects.equals(this.restartSteps, agentAppTemplate.restartSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, appType, configType, currentVersion, nextVersion, startSteps, upgradeSteps, deleteSteps, rollbackSteps, restartSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppTemplate {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
    sb.append("    startSteps: ").append(toIndentedString(startSteps)).append("\n");
    sb.append("    upgradeSteps: ").append(toIndentedString(upgradeSteps)).append("\n");
    sb.append("    deleteSteps: ").append(toIndentedString(deleteSteps)).append("\n");
    sb.append("    rollbackSteps: ").append(toIndentedString(rollbackSteps)).append("\n");
    sb.append("    restartSteps: ").append(toIndentedString(restartSteps)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `appType` to the URL query string
    if (getAppType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppType()))));
    }

    // add `configType` to the URL query string
    if (getConfigType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigType()))));
    }

    // add `currentVersion` to the URL query string
    if (getCurrentVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentVersion()))));
    }

    // add `nextVersion` to the URL query string
    if (getNextVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snextVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNextVersion()))));
    }

    // add `startSteps` to the URL query string
    if (getStartSteps() != null) {
      for (int i = 0; i < getStartSteps().size(); i++) {
        if (getStartSteps().get(i) != null) {
          joiner.add(getStartSteps().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstartSteps%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `upgradeSteps` to the URL query string
    if (getUpgradeSteps() != null) {
      for (int i = 0; i < getUpgradeSteps().size(); i++) {
        if (getUpgradeSteps().get(i) != null) {
          joiner.add(getUpgradeSteps().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%supgradeSteps%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deleteSteps` to the URL query string
    if (getDeleteSteps() != null) {
      for (int i = 0; i < getDeleteSteps().size(); i++) {
        if (getDeleteSteps().get(i) != null) {
          joiner.add(getDeleteSteps().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdeleteSteps%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `rollbackSteps` to the URL query string
    if (getRollbackSteps() != null) {
      for (int i = 0; i < getRollbackSteps().size(); i++) {
        if (getRollbackSteps().get(i) != null) {
          joiner.add(getRollbackSteps().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%srollbackSteps%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `restartSteps` to the URL query string
    if (getRestartSteps() != null) {
      for (int i = 0; i < getRestartSteps().size(); i++) {
        if (getRestartSteps().get(i) != null) {
          joiner.add(getRestartSteps().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%srestartSteps%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

