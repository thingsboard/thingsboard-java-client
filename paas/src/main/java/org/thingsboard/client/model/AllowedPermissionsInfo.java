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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.MergedUserPermissions;
import org.thingsboard.client.model.Operation;
import org.thingsboard.client.model.Resource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AllowedPermissionsInfo
 */
@JsonPropertyOrder({
  AllowedPermissionsInfo.JSON_PROPERTY_OPERATIONS_BY_RESOURCE,
  AllowedPermissionsInfo.JSON_PROPERTY_ALLOWED_FOR_GROUP_ROLE_OPERATIONS,
  AllowedPermissionsInfo.JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_OPERATIONS,
  AllowedPermissionsInfo.JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_GROUP_OPERATIONS,
  AllowedPermissionsInfo.JSON_PROPERTY_ALLOWED_RESOURCES,
  AllowedPermissionsInfo.JSON_PROPERTY_USER_PERMISSIONS,
  AllowedPermissionsInfo.JSON_PROPERTY_USER_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AllowedPermissionsInfo {
  public static final String JSON_PROPERTY_OPERATIONS_BY_RESOURCE = "operationsByResource";
  @Nullable
  private Map<String, Set<Operation>> operationsByResource = new HashMap<>();

  public static final String JSON_PROPERTY_ALLOWED_FOR_GROUP_ROLE_OPERATIONS = "allowedForGroupRoleOperations";
  @Nullable
  private Set<Operation> allowedForGroupRoleOperations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_OPERATIONS = "allowedForGroupOwnerOnlyOperations";
  @Nullable
  private Set<Operation> allowedForGroupOwnerOnlyOperations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_GROUP_OPERATIONS = "allowedForGroupOwnerOnlyGroupOperations";
  @Nullable
  private Set<Operation> allowedForGroupOwnerOnlyGroupOperations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ALLOWED_RESOURCES = "allowedResources";
  @Nullable
  private Set<Resource> allowedResources = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_USER_PERMISSIONS = "userPermissions";
  @Nullable
  private MergedUserPermissions userPermissions;

  public static final String JSON_PROPERTY_USER_OWNER_ID = "userOwnerId";
  @Nullable
  private EntityId userOwnerId;

  public AllowedPermissionsInfo() { 
  }

  public AllowedPermissionsInfo operationsByResource(@Nullable Map<String, Set<Operation>> operationsByResource) {
    this.operationsByResource = operationsByResource;
    return this;
  }

  public AllowedPermissionsInfo putOperationsByResourceItem(String key, Set<Operation> operationsByResourceItem) {
    if (this.operationsByResource == null) {
      this.operationsByResource = new HashMap<>();
    }
    this.operationsByResource.put(key, operationsByResourceItem);
    return this;
  }

  /**
   * Static map (vocabulary) of allowed operations by resource type
   * @return operationsByResource
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATIONS_BY_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Set<Operation>> getOperationsByResource() {
    return operationsByResource;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATIONS_BY_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationsByResource(@Nullable Map<String, Set<Operation>> operationsByResource) {
    this.operationsByResource = operationsByResource;
  }


  public AllowedPermissionsInfo allowedForGroupRoleOperations(@Nullable Set<Operation> allowedForGroupRoleOperations) {
    this.allowedForGroupRoleOperations = allowedForGroupRoleOperations;
    return this;
  }

  public AllowedPermissionsInfo addAllowedForGroupRoleOperationsItem(Operation allowedForGroupRoleOperationsItem) {
    if (this.allowedForGroupRoleOperations == null) {
      this.allowedForGroupRoleOperations = new LinkedHashSet<>();
    }
    this.allowedForGroupRoleOperations.add(allowedForGroupRoleOperationsItem);
    return this;
  }

  /**
   * Static set (vocabulary) of allowed operations for group roles
   * @return allowedForGroupRoleOperations
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_ROLE_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<Operation> getAllowedForGroupRoleOperations() {
    return allowedForGroupRoleOperations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_ROLE_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedForGroupRoleOperations(@Nullable Set<Operation> allowedForGroupRoleOperations) {
    this.allowedForGroupRoleOperations = allowedForGroupRoleOperations;
  }


  public AllowedPermissionsInfo allowedForGroupOwnerOnlyOperations(@Nullable Set<Operation> allowedForGroupOwnerOnlyOperations) {
    this.allowedForGroupOwnerOnlyOperations = allowedForGroupOwnerOnlyOperations;
    return this;
  }

  public AllowedPermissionsInfo addAllowedForGroupOwnerOnlyOperationsItem(Operation allowedForGroupOwnerOnlyOperationsItem) {
    if (this.allowedForGroupOwnerOnlyOperations == null) {
      this.allowedForGroupOwnerOnlyOperations = new LinkedHashSet<>();
    }
    this.allowedForGroupOwnerOnlyOperations.add(allowedForGroupOwnerOnlyOperationsItem);
    return this;
  }

  /**
   * Static set (vocabulary) of allowed operations for group owner
   * @return allowedForGroupOwnerOnlyOperations
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<Operation> getAllowedForGroupOwnerOnlyOperations() {
    return allowedForGroupOwnerOnlyOperations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedForGroupOwnerOnlyOperations(@Nullable Set<Operation> allowedForGroupOwnerOnlyOperations) {
    this.allowedForGroupOwnerOnlyOperations = allowedForGroupOwnerOnlyOperations;
  }


  public AllowedPermissionsInfo allowedForGroupOwnerOnlyGroupOperations(@Nullable Set<Operation> allowedForGroupOwnerOnlyGroupOperations) {
    this.allowedForGroupOwnerOnlyGroupOperations = allowedForGroupOwnerOnlyGroupOperations;
    return this;
  }

  public AllowedPermissionsInfo addAllowedForGroupOwnerOnlyGroupOperationsItem(Operation allowedForGroupOwnerOnlyGroupOperationsItem) {
    if (this.allowedForGroupOwnerOnlyGroupOperations == null) {
      this.allowedForGroupOwnerOnlyGroupOperations = new LinkedHashSet<>();
    }
    this.allowedForGroupOwnerOnlyGroupOperations.add(allowedForGroupOwnerOnlyGroupOperationsItem);
    return this;
  }

  /**
   * Static set (vocabulary) of allowed group operations for group owner
   * @return allowedForGroupOwnerOnlyGroupOperations
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_GROUP_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<Operation> getAllowedForGroupOwnerOnlyGroupOperations() {
    return allowedForGroupOwnerOnlyGroupOperations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_FOR_GROUP_OWNER_ONLY_GROUP_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedForGroupOwnerOnlyGroupOperations(@Nullable Set<Operation> allowedForGroupOwnerOnlyGroupOperations) {
    this.allowedForGroupOwnerOnlyGroupOperations = allowedForGroupOwnerOnlyGroupOperations;
  }


  public AllowedPermissionsInfo allowedResources(@Nullable Set<Resource> allowedResources) {
    this.allowedResources = allowedResources;
    return this;
  }

  public AllowedPermissionsInfo addAllowedResourcesItem(Resource allowedResourcesItem) {
    if (this.allowedResources == null) {
      this.allowedResources = new LinkedHashSet<>();
    }
    this.allowedResources.add(allowedResourcesItem);
    return this;
  }

  /**
   * Static set (vocabulary) of all possibly allowed resources. Static and depends only on the authority of the user
   * @return allowedResources
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<Resource> getAllowedResources() {
    return allowedResources;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALLOWED_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedResources(@Nullable Set<Resource> allowedResources) {
    this.allowedResources = allowedResources;
  }


  public AllowedPermissionsInfo userPermissions(@Nullable MergedUserPermissions userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  /**
   * JSON object with merged permission for all generic and group roles assigned to all user groups the user belongs to
   * @return userPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MergedUserPermissions getUserPermissions() {
    return userPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserPermissions(@Nullable MergedUserPermissions userPermissions) {
    this.userPermissions = userPermissions;
  }


  public AllowedPermissionsInfo userOwnerId(@Nullable EntityId userOwnerId) {
    this.userOwnerId = userOwnerId;
    return this;
  }

  /**
   * Owner Id of the user (Tenant or Customer)
   * @return userOwnerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getUserOwnerId() {
    return userOwnerId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserOwnerId(@Nullable EntityId userOwnerId) {
    this.userOwnerId = userOwnerId;
  }


  /**
   * Return true if this AllowedPermissionsInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedPermissionsInfo allowedPermissionsInfo = (AllowedPermissionsInfo) o;
    return Objects.equals(this.operationsByResource, allowedPermissionsInfo.operationsByResource) &&
        Objects.equals(this.allowedForGroupRoleOperations, allowedPermissionsInfo.allowedForGroupRoleOperations) &&
        Objects.equals(this.allowedForGroupOwnerOnlyOperations, allowedPermissionsInfo.allowedForGroupOwnerOnlyOperations) &&
        Objects.equals(this.allowedForGroupOwnerOnlyGroupOperations, allowedPermissionsInfo.allowedForGroupOwnerOnlyGroupOperations) &&
        Objects.equals(this.allowedResources, allowedPermissionsInfo.allowedResources) &&
        Objects.equals(this.userPermissions, allowedPermissionsInfo.userPermissions) &&
        Objects.equals(this.userOwnerId, allowedPermissionsInfo.userOwnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationsByResource, allowedForGroupRoleOperations, allowedForGroupOwnerOnlyOperations, allowedForGroupOwnerOnlyGroupOperations, allowedResources, userPermissions, userOwnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedPermissionsInfo {\n");
    sb.append("    operationsByResource: ").append(toIndentedString(operationsByResource)).append("\n");
    sb.append("    allowedForGroupRoleOperations: ").append(toIndentedString(allowedForGroupRoleOperations)).append("\n");
    sb.append("    allowedForGroupOwnerOnlyOperations: ").append(toIndentedString(allowedForGroupOwnerOnlyOperations)).append("\n");
    sb.append("    allowedForGroupOwnerOnlyGroupOperations: ").append(toIndentedString(allowedForGroupOwnerOnlyGroupOperations)).append("\n");
    sb.append("    allowedResources: ").append(toIndentedString(allowedResources)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    userOwnerId: ").append(toIndentedString(userOwnerId)).append("\n");
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

    // add `operationsByResource` to the URL query string
    if (getOperationsByResource() != null) {
      for (String _key : getOperationsByResource().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%soperationsByResource%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getOperationsByResource().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getOperationsByResource().get(_key)))));
      }
    }

    // add `allowedForGroupRoleOperations` to the URL query string
    if (getAllowedForGroupRoleOperations() != null) {
      int i = 0;
      for (Operation _item : getAllowedForGroupRoleOperations()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sallowedForGroupRoleOperations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    // add `allowedForGroupOwnerOnlyOperations` to the URL query string
    if (getAllowedForGroupOwnerOnlyOperations() != null) {
      int i = 0;
      for (Operation _item : getAllowedForGroupOwnerOnlyOperations()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sallowedForGroupOwnerOnlyOperations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    // add `allowedForGroupOwnerOnlyGroupOperations` to the URL query string
    if (getAllowedForGroupOwnerOnlyGroupOperations() != null) {
      int i = 0;
      for (Operation _item : getAllowedForGroupOwnerOnlyGroupOperations()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sallowedForGroupOwnerOnlyGroupOperations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    // add `allowedResources` to the URL query string
    if (getAllowedResources() != null) {
      int i = 0;
      for (Resource _item : getAllowedResources()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sallowedResources%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    // add `userPermissions` to the URL query string
    if (getUserPermissions() != null) {
      joiner.add(getUserPermissions().toUrlQueryString(prefix + "userPermissions" + suffix));
    }

    // add `userOwnerId` to the URL query string
    if (getUserOwnerId() != null) {
      joiner.add(getUserOwnerId().toUrlQueryString(prefix + "userOwnerId" + suffix));
    }

    return joiner.toString();
  }
}

