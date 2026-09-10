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
import org.thingsboard.client.model.AgentId;
import org.thingsboard.client.model.AgentProfileId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentInfo
 */
@JsonPropertyOrder({
  AgentInfo.JSON_PROPERTY_ID,
  AgentInfo.JSON_PROPERTY_CREATED_TIME,
  AgentInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  AgentInfo.JSON_PROPERTY_TENANT_ID,
  AgentInfo.JSON_PROPERTY_CUSTOMER_ID,
  AgentInfo.JSON_PROPERTY_NAME,
  AgentInfo.JSON_PROPERTY_DESCRIPTION,
  AgentInfo.JSON_PROPERTY_ROUTING_KEY,
  AgentInfo.JSON_PROPERTY_SECRET,
  AgentInfo.JSON_PROPERTY_AGENT_PROFILE_ID,
  AgentInfo.JSON_PROPERTY_VERSION,
  AgentInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  AgentInfo.JSON_PROPERTY_CUSTOMER_IS_PUBLIC,
  AgentInfo.JSON_PROPERTY_AGENT_PROFILE_NAME,
  AgentInfo.JSON_PROPERTY_OWNER_NAME,
  AgentInfo.JSON_PROPERTY_GROUPS,
  AgentInfo.JSON_PROPERTY_ACTIVE,
  AgentInfo.JSON_PROPERTY_AGENT_VERSION,
  AgentInfo.JSON_PROPERTY_UPGRADE_TARGET_IMAGE_REF,
  AgentInfo.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nullable
  private String description;

  public static final String JSON_PROPERTY_ROUTING_KEY = "routingKey";
  @Nonnull
  private String routingKey;

  public static final String JSON_PROPERTY_SECRET = "secret";
  @Nonnull
  private String secret;

  public static final String JSON_PROPERTY_AGENT_PROFILE_ID = "agentProfileId";
  @Nullable
  private AgentProfileId agentProfileId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_CUSTOMER_IS_PUBLIC = "customerIsPublic";
  @Nullable
  private Boolean customerIsPublic;

  public static final String JSON_PROPERTY_AGENT_PROFILE_NAME = "agentProfileName";
  @Nullable
  private String agentProfileName;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  @Nullable
  private String ownerName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @Nullable
  private List<EntityInfo> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_ACTIVE = "active";
  @Nullable
  private Boolean active;

  public static final String JSON_PROPERTY_AGENT_VERSION = "agentVersion";
  @Nullable
  private String agentVersion;

  public static final String JSON_PROPERTY_UPGRADE_TARGET_IMAGE_REF = "upgradeTargetImageRef";
  @Nullable
  private String upgradeTargetImageRef;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public AgentInfo() { 
  }

  @JsonCreator
  public AgentInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_TITLE) String customerTitle, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IS_PUBLIC) Boolean customerIsPublic, 
    @JsonProperty(JSON_PROPERTY_AGENT_PROFILE_NAME) String agentProfileName, 
    @JsonProperty(JSON_PROPERTY_OWNER_NAME) String ownerName, 
    @JsonProperty(JSON_PROPERTY_ACTIVE) Boolean active, 
    @JsonProperty(JSON_PROPERTY_AGENT_VERSION) String agentVersion, 
    @JsonProperty(JSON_PROPERTY_UPGRADE_TARGET_IMAGE_REF) String upgradeTargetImageRef, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.customerTitle = customerTitle;
    this.customerIsPublic = customerIsPublic;
    this.agentProfileName = agentProfileName;
    this.ownerName = ownerName;
    this.active = active;
    this.agentVersion = agentVersion;
    this.upgradeTargetImageRef = upgradeTargetImageRef;
    this.ownerId = ownerId;
  }

  public AgentInfo id(@Nullable AgentId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent Id. Specify this field to update the Agent. Referencing non-existing Agent Id will cause error. Omit this field to create new Agent.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentId id) {
    this.id = id;
  }


  /**
   * Timestamp of the agent creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public AgentInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
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


  /**
   * JSON object with Tenant Id. Use &#39;assignAgentToTenant&#39; to change the Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public AgentInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Agent Name in scope of Tenant
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


  public AgentInfo description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Agent description
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


  public AgentInfo routingKey(@Nonnull String routingKey) {
    this.routingKey = routingKey;
    return this;
  }

  /**
   * Agent routing key used for authentication
   * @return routingKey
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRoutingKey() {
    return routingKey;
  }


  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingKey(@Nonnull String routingKey) {
    this.routingKey = routingKey;
  }


  public AgentInfo secret(@Nonnull String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Agent secret used for authentication
   * @return secret
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecret() {
    return secret;
  }


  @JsonProperty(value = JSON_PROPERTY_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecret(@Nonnull String secret) {
    this.secret = secret;
  }


  public AgentInfo agentProfileId(@Nullable AgentProfileId agentProfileId) {
    this.agentProfileId = agentProfileId;
    return this;
  }

  /**
   * JSON object with Agent Profile Id. Nullable.
   * @return agentProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentProfileId getAgentProfileId() {
    return agentProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentProfileId(@Nullable AgentProfileId agentProfileId) {
    this.agentProfileId = agentProfileId;
  }


  public AgentInfo version(@Nullable Long version) {
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
   * Title of the Customer that owns the agent.
   * @return customerTitle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }




  /**
   * Indicates special &#39;Public&#39; Customer that is auto-generated to use the agents on public dashboards.
   * @return customerIsPublic
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerIsPublic() {
    return customerIsPublic;
  }




  /**
   * Name of the Agent Profile the agent belongs to.
   * @return agentProfileName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_PROFILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentProfileName() {
    return agentProfileName;
  }




  /**
   * Owner name — tenant title if the agent is owned by a tenant, or customer title otherwise.
   * @return ownerName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerName() {
    return ownerName;
  }




  public AgentInfo groups(@Nullable List<EntityInfo> groups) {
    this.groups = groups;
    return this;
  }

  public AgentInfo addGroupsItem(EntityInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Entity groups that contain this agent (excluding the implicit &#39;All&#39; group).
   * @return groups
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityInfo> getGroups() {
    return groups;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(@Nullable List<EntityInfo> groups) {
    this.groups = groups;
  }


  /**
   * Whether the agent currently has an active connection (derived from server-scope &#39;active&#39; attribute).
   * @return active
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }




  /**
   * Agent software version reported on the last connect (derived from server-scope &#39;agentVersion&#39; attribute).
   * @return agentVersion
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentVersion() {
    return agentVersion;
  }




  /**
   * Image reference this agent should be upgraded to, or null when no upgrade applies. Resolved from the published version graph.
   * @return upgradeTargetImageRef
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPGRADE_TARGET_IMAGE_REF, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpgradeTargetImageRef() {
    return upgradeTargetImageRef;
  }




  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  /**
   * Return true if this AgentInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentInfo agentInfo = (AgentInfo) o;
    return Objects.equals(this.id, agentInfo.id) &&
        Objects.equals(this.createdTime, agentInfo.createdTime) &&
        Objects.equals(this.additionalInfo, agentInfo.additionalInfo) &&
        Objects.equals(this.tenantId, agentInfo.tenantId) &&
        Objects.equals(this.customerId, agentInfo.customerId) &&
        Objects.equals(this.name, agentInfo.name) &&
        Objects.equals(this.description, agentInfo.description) &&
        Objects.equals(this.routingKey, agentInfo.routingKey) &&
        Objects.equals(this.secret, agentInfo.secret) &&
        Objects.equals(this.agentProfileId, agentInfo.agentProfileId) &&
        Objects.equals(this.version, agentInfo.version) &&
        Objects.equals(this.customerTitle, agentInfo.customerTitle) &&
        Objects.equals(this.customerIsPublic, agentInfo.customerIsPublic) &&
        Objects.equals(this.agentProfileName, agentInfo.agentProfileName) &&
        Objects.equals(this.ownerName, agentInfo.ownerName) &&
        Objects.equals(this.groups, agentInfo.groups) &&
        Objects.equals(this.active, agentInfo.active) &&
        Objects.equals(this.agentVersion, agentInfo.agentVersion) &&
        Objects.equals(this.upgradeTargetImageRef, agentInfo.upgradeTargetImageRef) &&
        Objects.equals(this.ownerId, agentInfo.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, customerId, name, description, routingKey, secret, agentProfileId, version, customerTitle, customerIsPublic, agentProfileName, ownerName, groups, active, agentVersion, upgradeTargetImageRef, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    agentProfileId: ").append(toIndentedString(agentProfileId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    customerIsPublic: ").append(toIndentedString(customerIsPublic)).append("\n");
    sb.append("    agentProfileName: ").append(toIndentedString(agentProfileName)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    upgradeTargetImageRef: ").append(toIndentedString(upgradeTargetImageRef)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `routingKey` to the URL query string
    if (getRoutingKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroutingKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRoutingKey()))));
    }

    // add `secret` to the URL query string
    if (getSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecret()))));
    }

    // add `agentProfileId` to the URL query string
    if (getAgentProfileId() != null) {
      joiner.add(getAgentProfileId().toUrlQueryString(prefix + "agentProfileId" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `customerIsPublic` to the URL query string
    if (getCustomerIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerIsPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerIsPublic()))));
    }

    // add `agentProfileName` to the URL query string
    if (getAgentProfileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentProfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentProfileName()))));
    }

    // add `ownerName` to the URL query string
    if (getOwnerName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sownerName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOwnerName()))));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sgroups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactive%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActive()))));
    }

    // add `agentVersion` to the URL query string
    if (getAgentVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentVersion()))));
    }

    // add `upgradeTargetImageRef` to the URL query string
    if (getUpgradeTargetImageRef() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supgradeTargetImageRef%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpgradeTargetImageRef()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

