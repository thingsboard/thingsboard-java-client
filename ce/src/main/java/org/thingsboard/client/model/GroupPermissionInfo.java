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
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.GroupPermissionId;
import org.thingsboard.client.model.Role;
import org.thingsboard.client.model.RoleId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * GroupPermissionInfo
 */
@JsonPropertyOrder({
  GroupPermissionInfo.JSON_PROPERTY_ID,
  GroupPermissionInfo.JSON_PROPERTY_CREATED_TIME,
  GroupPermissionInfo.JSON_PROPERTY_TENANT_ID,
  GroupPermissionInfo.JSON_PROPERTY_USER_GROUP_ID,
  GroupPermissionInfo.JSON_PROPERTY_ROLE_ID,
  GroupPermissionInfo.JSON_PROPERTY_ENTITY_GROUP_ID,
  GroupPermissionInfo.JSON_PROPERTY_ENTITY_GROUP_TYPE,
  GroupPermissionInfo.JSON_PROPERTY_ROLE,
  GroupPermissionInfo.JSON_PROPERTY_ENTITY_GROUP_NAME,
  GroupPermissionInfo.JSON_PROPERTY_ENTITY_GROUP_OWNER_ID,
  GroupPermissionInfo.JSON_PROPERTY_ENTITY_GROUP_OWNER_NAME,
  GroupPermissionInfo.JSON_PROPERTY_USER_GROUP_NAME,
  GroupPermissionInfo.JSON_PROPERTY_USER_GROUP_OWNER_ID,
  GroupPermissionInfo.JSON_PROPERTY_USER_GROUP_OWNER_NAME,
  GroupPermissionInfo.JSON_PROPERTY_NAME,
  GroupPermissionInfo.JSON_PROPERTY_PUBLIC,
  GroupPermissionInfo.JSON_PROPERTY_READ_ONLY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class GroupPermissionInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private GroupPermissionId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_USER_GROUP_ID = "userGroupId";
  @Nonnull
  private EntityGroupId userGroupId;

  public static final String JSON_PROPERTY_ROLE_ID = "roleId";
  @Nonnull
  private RoleId roleId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_ID = "entityGroupId";
  @Nullable
  private EntityGroupId entityGroupId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_TYPE = "entityGroupType";
  @Nullable
  private EntityType entityGroupType;

  public static final String JSON_PROPERTY_ROLE = "role";
  @Nullable
  private Role role;

  public static final String JSON_PROPERTY_ENTITY_GROUP_NAME = "entityGroupName";
  @Nullable
  private String entityGroupName;

  public static final String JSON_PROPERTY_ENTITY_GROUP_OWNER_ID = "entityGroupOwnerId";
  @Nullable
  private EntityId entityGroupOwnerId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_OWNER_NAME = "entityGroupOwnerName";
  @Nullable
  private String entityGroupOwnerName;

  public static final String JSON_PROPERTY_USER_GROUP_NAME = "userGroupName";
  @Nullable
  private String userGroupName;

  public static final String JSON_PROPERTY_USER_GROUP_OWNER_ID = "userGroupOwnerId";
  @Nullable
  private EntityId userGroupOwnerId;

  public static final String JSON_PROPERTY_USER_GROUP_OWNER_NAME = "userGroupOwnerName";
  @Nullable
  private String userGroupOwnerName;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @Nullable
  private Boolean _public;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  @Nullable
  private Boolean readOnly;

  public GroupPermissionInfo() { 
  }

  @JsonCreator
  public GroupPermissionInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_ENTITY_GROUP_TYPE) EntityType entityGroupType, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.entityGroupType = entityGroupType;
    this.name = name;
  }

  public GroupPermissionInfo id(@Nullable GroupPermissionId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GroupPermissionId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable GroupPermissionId id) {
    this.id = id;
  }


  /**
   * Timestamp of the group permission creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with the Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public GroupPermissionInfo userGroupId(@Nonnull EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

  /**
   * JSON object with the User Group Id. Represents the user group that will have permissions to perform operations against the corresponding entity group.
   * @return userGroupId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityGroupId getUserGroupId() {
    return userGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserGroupId(@Nonnull EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
  }


  public GroupPermissionInfo roleId(@Nonnull RoleId roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * JSON object with the Role Id. Represents the set of permissions. The role type (GENERIC or GROUP) determines whether &#39;entityGroupId&#39; is required.
   * @return roleId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROLE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoleId getRoleId() {
    return roleId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleId(@Nonnull RoleId roleId) {
    this.roleId = roleId;
  }


  public GroupPermissionInfo entityGroupId(@Nullable EntityGroupId entityGroupId) {
    this.entityGroupId = entityGroupId;
    return this;
  }

  /**
   * JSON object with the Entity Group Id. Required when using a GROUP role — specifies the entity group to which the permissions apply. Must be null or omitted when using a GENERIC role.
   * @return entityGroupId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getEntityGroupId() {
    return entityGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupId(@Nullable EntityGroupId entityGroupId) {
    this.entityGroupId = entityGroupId;
  }


  /**
   * Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. Auto-populated from the referenced entity group. Null for generic permissions.
   * @return entityGroupType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getEntityGroupType() {
    return entityGroupType;
  }




  public GroupPermissionInfo role(@Nullable Role role) {
    this.role = role;
    return this;
  }

  /**
   * Represent set of permissions.
   * @return role
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Role getRole() {
    return role;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(@Nullable Role role) {
    this.role = role;
  }


  public GroupPermissionInfo entityGroupName(@Nullable String entityGroupName) {
    this.entityGroupName = entityGroupName;
    return this;
  }

  /**
   * Entity Group Name.
   * @return entityGroupName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityGroupName() {
    return entityGroupName;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupName(@Nullable String entityGroupName) {
    this.entityGroupName = entityGroupName;
  }


  public GroupPermissionInfo entityGroupOwnerId(@Nullable EntityId entityGroupOwnerId) {
    this.entityGroupOwnerId = entityGroupOwnerId;
    return this;
  }

  /**
   * Entity Group Owner Id (Tenant or Customer).
   * @return entityGroupOwnerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityGroupOwnerId() {
    return entityGroupOwnerId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupOwnerId(@Nullable EntityId entityGroupOwnerId) {
    this.entityGroupOwnerId = entityGroupOwnerId;
  }


  public GroupPermissionInfo entityGroupOwnerName(@Nullable String entityGroupOwnerName) {
    this.entityGroupOwnerName = entityGroupOwnerName;
    return this;
  }

  /**
   * Name of the entity group owner (Tenant or Customer title).
   * @return entityGroupOwnerName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityGroupOwnerName() {
    return entityGroupOwnerName;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupOwnerName(@Nullable String entityGroupOwnerName) {
    this.entityGroupOwnerName = entityGroupOwnerName;
  }


  public GroupPermissionInfo userGroupName(@Nullable String userGroupName) {
    this.userGroupName = userGroupName;
    return this;
  }

  /**
   * User Group Name.
   * @return userGroupName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserGroupName() {
    return userGroupName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupName(@Nullable String userGroupName) {
    this.userGroupName = userGroupName;
  }


  public GroupPermissionInfo userGroupOwnerId(@Nullable EntityId userGroupOwnerId) {
    this.userGroupOwnerId = userGroupOwnerId;
    return this;
  }

  /**
   * User Group Owner Id (Tenant or Customer).
   * @return userGroupOwnerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getUserGroupOwnerId() {
    return userGroupOwnerId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupOwnerId(@Nullable EntityId userGroupOwnerId) {
    this.userGroupOwnerId = userGroupOwnerId;
  }


  public GroupPermissionInfo userGroupOwnerName(@Nullable String userGroupOwnerName) {
    this.userGroupOwnerName = userGroupOwnerName;
    return this;
  }

  /**
   * Name of the user group owner (Tenant or Customer title).
   * @return userGroupOwnerName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserGroupOwnerName() {
    return userGroupOwnerName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupOwnerName(@Nullable String userGroupOwnerName) {
    this.userGroupOwnerName = userGroupOwnerName;
  }


  /**
   * Name of the Group Permissions. Auto-generated
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public GroupPermissionInfo _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@Nullable Boolean _public) {
    this._public = _public;
  }


  public GroupPermissionInfo readOnly(@Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(@Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  /**
   * Return true if this GroupPermissionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPermissionInfo groupPermissionInfo = (GroupPermissionInfo) o;
    return Objects.equals(this.id, groupPermissionInfo.id) &&
        Objects.equals(this.createdTime, groupPermissionInfo.createdTime) &&
        Objects.equals(this.tenantId, groupPermissionInfo.tenantId) &&
        Objects.equals(this.userGroupId, groupPermissionInfo.userGroupId) &&
        Objects.equals(this.roleId, groupPermissionInfo.roleId) &&
        Objects.equals(this.entityGroupId, groupPermissionInfo.entityGroupId) &&
        Objects.equals(this.entityGroupType, groupPermissionInfo.entityGroupType) &&
        Objects.equals(this.role, groupPermissionInfo.role) &&
        Objects.equals(this.entityGroupName, groupPermissionInfo.entityGroupName) &&
        Objects.equals(this.entityGroupOwnerId, groupPermissionInfo.entityGroupOwnerId) &&
        Objects.equals(this.entityGroupOwnerName, groupPermissionInfo.entityGroupOwnerName) &&
        Objects.equals(this.userGroupName, groupPermissionInfo.userGroupName) &&
        Objects.equals(this.userGroupOwnerId, groupPermissionInfo.userGroupOwnerId) &&
        Objects.equals(this.userGroupOwnerName, groupPermissionInfo.userGroupOwnerName) &&
        Objects.equals(this.name, groupPermissionInfo.name) &&
        Objects.equals(this._public, groupPermissionInfo._public) &&
        Objects.equals(this.readOnly, groupPermissionInfo.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, userGroupId, roleId, entityGroupId, entityGroupType, role, entityGroupName, entityGroupOwnerId, entityGroupOwnerName, userGroupName, userGroupOwnerId, userGroupOwnerName, name, _public, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupPermissionInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    entityGroupId: ").append(toIndentedString(entityGroupId)).append("\n");
    sb.append("    entityGroupType: ").append(toIndentedString(entityGroupType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    entityGroupName: ").append(toIndentedString(entityGroupName)).append("\n");
    sb.append("    entityGroupOwnerId: ").append(toIndentedString(entityGroupOwnerId)).append("\n");
    sb.append("    entityGroupOwnerName: ").append(toIndentedString(entityGroupOwnerName)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
    sb.append("    userGroupOwnerId: ").append(toIndentedString(userGroupOwnerId)).append("\n");
    sb.append("    userGroupOwnerName: ").append(toIndentedString(userGroupOwnerName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

    // add `userGroupId` to the URL query string
    if (getUserGroupId() != null) {
      joiner.add(getUserGroupId().toUrlQueryString(prefix + "userGroupId" + suffix));
    }

    // add `roleId` to the URL query string
    if (getRoleId() != null) {
      joiner.add(getRoleId().toUrlQueryString(prefix + "roleId" + suffix));
    }

    // add `entityGroupId` to the URL query string
    if (getEntityGroupId() != null) {
      joiner.add(getEntityGroupId().toUrlQueryString(prefix + "entityGroupId" + suffix));
    }

    // add `entityGroupType` to the URL query string
    if (getEntityGroupType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityGroupType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityGroupType()))));
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      joiner.add(getRole().toUrlQueryString(prefix + "role" + suffix));
    }

    // add `entityGroupName` to the URL query string
    if (getEntityGroupName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityGroupName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityGroupName()))));
    }

    // add `entityGroupOwnerId` to the URL query string
    if (getEntityGroupOwnerId() != null) {
      joiner.add(getEntityGroupOwnerId().toUrlQueryString(prefix + "entityGroupOwnerId" + suffix));
    }

    // add `entityGroupOwnerName` to the URL query string
    if (getEntityGroupOwnerName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityGroupOwnerName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityGroupOwnerName()))));
    }

    // add `userGroupName` to the URL query string
    if (getUserGroupName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserGroupName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserGroupName()))));
    }

    // add `userGroupOwnerId` to the URL query string
    if (getUserGroupOwnerId() != null) {
      joiner.add(getUserGroupOwnerId().toUrlQueryString(prefix + "userGroupOwnerId" + suffix));
    }

    // add `userGroupOwnerName` to the URL query string
    if (getUserGroupOwnerName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserGroupOwnerName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserGroupOwnerName()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    // add `readOnly` to the URL query string
    if (getReadOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreadOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReadOnly()))));
    }

    return joiner.toString();
  }
}

