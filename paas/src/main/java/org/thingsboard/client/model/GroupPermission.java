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
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.GroupPermissionId;
import org.thingsboard.client.model.RoleId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the group permission.
 */
@JsonPropertyOrder({
  GroupPermission.JSON_PROPERTY_ID,
  GroupPermission.JSON_PROPERTY_CREATED_TIME,
  GroupPermission.JSON_PROPERTY_TENANT_ID,
  GroupPermission.JSON_PROPERTY_USER_GROUP_ID,
  GroupPermission.JSON_PROPERTY_ROLE_ID,
  GroupPermission.JSON_PROPERTY_ENTITY_GROUP_ID,
  GroupPermission.JSON_PROPERTY_ENTITY_GROUP_TYPE,
  GroupPermission.JSON_PROPERTY_IS_PUBLIC,
  GroupPermission.JSON_PROPERTY_NAME,
  GroupPermission.JSON_PROPERTY_PUBLIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class GroupPermission {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private GroupPermissionId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_USER_GROUP_ID = "userGroupId";
  @javax.annotation.Nonnull
  private EntityGroupId userGroupId;

  public static final String JSON_PROPERTY_ROLE_ID = "roleId";
  @javax.annotation.Nonnull
  private RoleId roleId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_ID = "entityGroupId";
  @javax.annotation.Nullable
  private EntityGroupId entityGroupId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_TYPE = "entityGroupType";
  @javax.annotation.Nullable
  private EntityType entityGroupType;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  @javax.annotation.Nullable
  private Boolean isPublic;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  @javax.annotation.Nullable
  private Boolean _public;

  public GroupPermission() { 
  }

  @JsonCreator
  public GroupPermission(
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

  public GroupPermission id(@javax.annotation.Nullable GroupPermissionId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Group Permission Id. Specify this field to update the Group Permission. Referencing non-existing Group Permission Id will cause error. Omit this field to create new Group Permission.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GroupPermissionId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable GroupPermissionId id) {
    this.id = id;
  }


  /**
   * Timestamp of the group permission creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with the Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public GroupPermission userGroupId(@javax.annotation.Nonnull EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

  /**
   * JSON object with the User Group Id. Represents the user group that will have permissions to perform operations against the corresponding entity group.
   * @return userGroupId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityGroupId getUserGroupId() {
    return userGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserGroupId(@javax.annotation.Nonnull EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
  }


  public GroupPermission roleId(@javax.annotation.Nonnull RoleId roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * JSON object with the Role Id. Represents the set of permissions. The role type (GENERIC or GROUP) determines whether &#39;entityGroupId&#39; is required.
   * @return roleId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROLE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RoleId getRoleId() {
    return roleId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleId(@javax.annotation.Nonnull RoleId roleId) {
    this.roleId = roleId;
  }


  public GroupPermission entityGroupId(@javax.annotation.Nullable EntityGroupId entityGroupId) {
    this.entityGroupId = entityGroupId;
    return this;
  }

  /**
   * JSON object with the Entity Group Id. Required when using a GROUP role — specifies the entity group to which the permissions apply. Must be null or omitted when using a GENERIC role.
   * @return entityGroupId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getEntityGroupId() {
    return entityGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupId(@javax.annotation.Nullable EntityGroupId entityGroupId) {
    this.entityGroupId = entityGroupId;
  }


  /**
   * Type of the entities in the group: DEVICE, ASSET, CUSTOMER, etc. Auto-populated from the referenced entity group. Null for generic permissions.
   * @return entityGroupType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getEntityGroupType() {
    return entityGroupType;
  }




  public GroupPermission isPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Get isPublic
   * @return isPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(@javax.annotation.Nullable Boolean isPublic) {
    this.isPublic = isPublic;
  }


  /**
   * Name of the Group Permissions. Auto-generated
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public GroupPermission _public(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(value = JSON_PROPERTY_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(@javax.annotation.Nullable Boolean _public) {
    this._public = _public;
  }


  /**
   * Return true if this GroupPermission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupPermission groupPermission = (GroupPermission) o;
    return Objects.equals(this.id, groupPermission.id) &&
        Objects.equals(this.createdTime, groupPermission.createdTime) &&
        Objects.equals(this.tenantId, groupPermission.tenantId) &&
        Objects.equals(this.userGroupId, groupPermission.userGroupId) &&
        Objects.equals(this.roleId, groupPermission.roleId) &&
        Objects.equals(this.entityGroupId, groupPermission.entityGroupId) &&
        Objects.equals(this.entityGroupType, groupPermission.entityGroupType) &&
        Objects.equals(this.isPublic, groupPermission.isPublic) &&
        Objects.equals(this.name, groupPermission.name) &&
        Objects.equals(this._public, groupPermission._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, userGroupId, roleId, entityGroupId, entityGroupType, isPublic, name, _public);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupPermission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    entityGroupId: ").append(toIndentedString(entityGroupId)).append("\n");
    sb.append("    entityGroupType: ").append(toIndentedString(entityGroupType)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

    // add `isPublic` to the URL query string
    if (getIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsPublic()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `public` to the URL query string
    if (getPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPublic()))));
    }

    return joiner.toString();
  }
}

