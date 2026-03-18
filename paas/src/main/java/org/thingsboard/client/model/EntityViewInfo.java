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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.EntityViewId;
import org.thingsboard.client.model.TelemetryEntityView;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityViewInfo
 */
@JsonPropertyOrder({
  EntityViewInfo.JSON_PROPERTY_ID,
  EntityViewInfo.JSON_PROPERTY_CREATED_TIME,
  EntityViewInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  EntityViewInfo.JSON_PROPERTY_ENTITY_ID,
  EntityViewInfo.JSON_PROPERTY_TENANT_ID,
  EntityViewInfo.JSON_PROPERTY_CUSTOMER_ID,
  EntityViewInfo.JSON_PROPERTY_NAME,
  EntityViewInfo.JSON_PROPERTY_TYPE,
  EntityViewInfo.JSON_PROPERTY_KEYS,
  EntityViewInfo.JSON_PROPERTY_START_TIME_MS,
  EntityViewInfo.JSON_PROPERTY_END_TIME_MS,
  EntityViewInfo.JSON_PROPERTY_VERSION,
  EntityViewInfo.JSON_PROPERTY_OWNER_NAME,
  EntityViewInfo.JSON_PROPERTY_GROUPS,
  EntityViewInfo.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityViewInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private EntityViewId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @Nonnull
  private EntityId entityId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private String type;

  public static final String JSON_PROPERTY_KEYS = "keys";
  @Nullable
  private TelemetryEntityView keys;

  public static final String JSON_PROPERTY_START_TIME_MS = "startTimeMs";
  @Nullable
  private Long startTimeMs;

  public static final String JSON_PROPERTY_END_TIME_MS = "endTimeMs";
  @Nullable
  private Long endTimeMs;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  @Nullable
  private String ownerName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @Nullable
  private List<EntityInfo> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public EntityViewInfo() { 
  }

  @JsonCreator
  public EntityViewInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_OWNER_NAME) String ownerName, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.ownerName = ownerName;
    this.ownerId = ownerId;
  }

  public EntityViewInfo id(@Nullable EntityViewId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Entity View Id. Specify this field to update the Entity View. Referencing non-existing Entity View Id will cause error. Omit this field to create new Entity View.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityViewId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable EntityViewId id) {
    this.id = id;
  }


  /**
   * Timestamp of the Entity View creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public EntityViewInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the entity view. May include: &#39;description&#39; (string).
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


  public EntityViewInfo entityId(@Nonnull EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * JSON object with the referenced Entity Id (Device or Asset).
   * @return entityId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(@Nonnull EntityId entityId) {
    this.entityId = entityId;
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




  /**
   * JSON object with Customer Id. Use &#39;assignEntityViewToCustomer&#39; to change the Customer Id.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public EntityViewInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Entity View name
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


  public EntityViewInfo type(@Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Device Profile Name
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull String type) {
    this.type = type;
  }


  public EntityViewInfo keys(@Nullable TelemetryEntityView keys) {
    this.keys = keys;
    return this;
  }

  /**
   * Set of telemetry and attribute keys to expose via Entity View.
   * @return keys
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TelemetryEntityView getKeys() {
    return keys;
  }


  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(@Nullable TelemetryEntityView keys) {
    this.keys = keys;
  }


  public EntityViewInfo startTimeMs(@Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * Represents the start time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval;
   * @return startTimeMs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTimeMs() {
    return startTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimeMs(@Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  public EntityViewInfo endTimeMs(@Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * Represents the end time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval;
   * @return endTimeMs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTimeMs() {
    return endTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTimeMs(@Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
  }


  public EntityViewInfo version(@Nullable Long version) {
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
   * Owner name
   * @return ownerName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerName() {
    return ownerName;
  }




  public EntityViewInfo groups(@Nullable List<EntityInfo> groups) {
    this.groups = groups;
    return this;
  }

  public EntityViewInfo addGroupsItem(EntityInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups
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
   * Return true if this EntityViewInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityViewInfo entityViewInfo = (EntityViewInfo) o;
    return Objects.equals(this.id, entityViewInfo.id) &&
        Objects.equals(this.createdTime, entityViewInfo.createdTime) &&
        Objects.equals(this.additionalInfo, entityViewInfo.additionalInfo) &&
        Objects.equals(this.entityId, entityViewInfo.entityId) &&
        Objects.equals(this.tenantId, entityViewInfo.tenantId) &&
        Objects.equals(this.customerId, entityViewInfo.customerId) &&
        Objects.equals(this.name, entityViewInfo.name) &&
        Objects.equals(this.type, entityViewInfo.type) &&
        Objects.equals(this.keys, entityViewInfo.keys) &&
        Objects.equals(this.startTimeMs, entityViewInfo.startTimeMs) &&
        Objects.equals(this.endTimeMs, entityViewInfo.endTimeMs) &&
        Objects.equals(this.version, entityViewInfo.version) &&
        Objects.equals(this.ownerName, entityViewInfo.ownerName) &&
        Objects.equals(this.groups, entityViewInfo.groups) &&
        Objects.equals(this.ownerId, entityViewInfo.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, entityId, tenantId, customerId, name, type, keys, startTimeMs, endTimeMs, version, ownerName, groups, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityViewInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `keys` to the URL query string
    if (getKeys() != null) {
      joiner.add(getKeys().toUrlQueryString(prefix + "keys" + suffix));
    }

    // add `startTimeMs` to the URL query string
    if (getStartTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTimeMs()))));
    }

    // add `endTimeMs` to the URL query string
    if (getEndTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTimeMs()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
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

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

