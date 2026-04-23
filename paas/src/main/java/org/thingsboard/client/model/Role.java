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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.RoleId;
import org.thingsboard.client.model.RoleType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the role.
 */
@JsonPropertyOrder({
  Role.JSON_PROPERTY_ID,
  Role.JSON_PROPERTY_CREATED_TIME,
  Role.JSON_PROPERTY_ADDITIONAL_INFO,
  Role.JSON_PROPERTY_TENANT_ID,
  Role.JSON_PROPERTY_CUSTOMER_ID,
  Role.JSON_PROPERTY_NAME,
  Role.JSON_PROPERTY_TYPE,
  Role.JSON_PROPERTY_PERMISSIONS,
  Role.JSON_PROPERTY_EXCLUDED_PERMISSIONS,
  Role.JSON_PROPERTY_VERSION,
  Role.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Role {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private RoleId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

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
  private RoleType type;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  @Nonnull
  private com.fasterxml.jackson.databind.JsonNode permissions;

  public static final String JSON_PROPERTY_EXCLUDED_PERMISSIONS = "excludedPermissions";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode excludedPermissions;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public Role() { 
  }

  @JsonCreator
  public Role(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.ownerId = ownerId;
  }

  public Role id(@Nullable RoleId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Role Id. Specify this field to update the Role. Referencing non-existing Role Id will cause error. Omit this field to create new Role.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoleId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable RoleId id) {
    this.id = id;
  }


  /**
   * Timestamp of the role creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public Role additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the role. May include: &#39;description&#39; (string).
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
   * JSON object with Customer Id. 
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public Role name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Role Name
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


  public Role type(@Nonnull RoleType type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the role: generic or group
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoleType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull RoleType type) {
    this.type = type;
  }


  public Role permissions(@Nonnull com.fasterxml.jackson.databind.JsonNode permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * JSON object with the set of permissions. Structure is specific for role type
   * @return permissions
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_PERMISSIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public com.fasterxml.jackson.databind.JsonNode getPermissions() {
    return permissions;
  }


  @JsonProperty(value = JSON_PROPERTY_PERMISSIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissions(@Nonnull com.fasterxml.jackson.databind.JsonNode permissions) {
    this.permissions = permissions;
  }


  public Role excludedPermissions(@Nullable com.fasterxml.jackson.databind.JsonNode excludedPermissions) {
    this.excludedPermissions = excludedPermissions;
    return this;
  }

  /**
   * JSON object with the set of excluded permissions. Only applicable for generic roles. Structure is the same as permissions
   * @return excludedPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXCLUDED_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getExcludedPermissions() {
    return excludedPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_EXCLUDED_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedPermissions(@Nullable com.fasterxml.jackson.databind.JsonNode excludedPermissions) {
    this.excludedPermissions = excludedPermissions;
  }


  public Role version(@Nullable Long version) {
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
   * Return true if this Role object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.createdTime, role.createdTime) &&
        Objects.equals(this.additionalInfo, role.additionalInfo) &&
        Objects.equals(this.tenantId, role.tenantId) &&
        Objects.equals(this.customerId, role.customerId) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.type, role.type) &&
        Objects.equals(this.permissions, role.permissions) &&
        Objects.equals(this.excludedPermissions, role.excludedPermissions) &&
        Objects.equals(this.version, role.version) &&
        Objects.equals(this.ownerId, role.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, customerId, name, type, permissions, excludedPermissions, version, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    excludedPermissions: ").append(toIndentedString(excludedPermissions)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPermissions()))));
    }

    // add `excludedPermissions` to the URL query string
    if (getExcludedPermissions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexcludedPermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExcludedPermissions()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

