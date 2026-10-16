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
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.RoleId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * The Share Group Request JSON
 */
@JsonPropertyOrder({
  ShareGroupRequest.JSON_PROPERTY_OWNER_ID,
  ShareGroupRequest.JSON_PROPERTY_ALL_USER_GROUP,
  ShareGroupRequest.JSON_PROPERTY_USER_GROUP_ID,
  ShareGroupRequest.JSON_PROPERTY_READ_ELSE_WRITE,
  ShareGroupRequest.JSON_PROPERTY_ROLE_IDS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ShareGroupRequest {
  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ALL_USER_GROUP = "allUserGroup";
  @Nonnull
  private Boolean allUserGroup;

  public static final String JSON_PROPERTY_USER_GROUP_ID = "userGroupId";
  @Nullable
  private EntityGroupId userGroupId;

  public static final String JSON_PROPERTY_READ_ELSE_WRITE = "readElseWrite";
  @Nullable
  private Boolean readElseWrite;

  public static final String JSON_PROPERTY_ROLE_IDS = "roleIds";
  @Nullable
  private List<RoleId> roleIds = new ArrayList<>();

  public ShareGroupRequest() { 
  }

  public ShareGroupRequest ownerId(@Nullable EntityId ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * In case &#39;allUserGroup&#39; is set to true, this property specifies the owner of the user group &#39;All&#39;. Either Tenant or Customer Id.
   * @return ownerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(@Nullable EntityId ownerId) {
    this.ownerId = ownerId;
  }


  public ShareGroupRequest allUserGroup(@Nonnull Boolean allUserGroup) {
    this.allUserGroup = allUserGroup;
    return this;
  }

  /**
   * Indicate that the group should be shared with user group &#39;All&#39; that belongs to Tenant or Customer (see &#39;ownerId&#39; property description).
   * @return allUserGroup
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ALL_USER_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAllUserGroup() {
    return allUserGroup;
  }


  @JsonProperty(value = JSON_PROPERTY_ALL_USER_GROUP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllUserGroup(@Nonnull Boolean allUserGroup) {
    this.allUserGroup = allUserGroup;
  }


  public ShareGroupRequest userGroupId(@Nullable EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

  /**
   * In case &#39;allUserGroup&#39; is set to false, this property specifies the specific user group that the entity group should be shared with.
   * @return userGroupId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getUserGroupId() {
    return userGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupId(@Nullable EntityGroupId userGroupId) {
    this.userGroupId = userGroupId;
  }


  public ShareGroupRequest readElseWrite(@Nullable Boolean readElseWrite) {
    this.readElseWrite = readElseWrite;
    return this;
  }

  /**
   * Used if &#39;roleIds&#39; property is not present. if the value is &#39;true&#39;, creates role with read-only permissions. If the value is &#39;false&#39;, creates role with write permissions.
   * @return readElseWrite
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ELSE_WRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadElseWrite() {
    return readElseWrite;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ELSE_WRITE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadElseWrite(@Nullable Boolean readElseWrite) {
    this.readElseWrite = readElseWrite;
  }


  public ShareGroupRequest roleIds(@Nullable List<RoleId> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public ShareGroupRequest addRoleIdsItem(RoleId roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * List of group role Ids that should be used to share the entity group with the user group. If not set, the platform will create new role (see &#39;readElseWrite&#39; property description)
   * @return roleIds
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ROLE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RoleId> getRoleIds() {
    return roleIds;
  }


  @JsonProperty(value = JSON_PROPERTY_ROLE_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleIds(@Nullable List<RoleId> roleIds) {
    this.roleIds = roleIds;
  }


  /**
   * Return true if this ShareGroupRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareGroupRequest shareGroupRequest = (ShareGroupRequest) o;
    return Objects.equals(this.ownerId, shareGroupRequest.ownerId) &&
        Objects.equals(this.allUserGroup, shareGroupRequest.allUserGroup) &&
        Objects.equals(this.userGroupId, shareGroupRequest.userGroupId) &&
        Objects.equals(this.readElseWrite, shareGroupRequest.readElseWrite) &&
        Objects.equals(this.roleIds, shareGroupRequest.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, allUserGroup, userGroupId, readElseWrite, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareGroupRequest {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    allUserGroup: ").append(toIndentedString(allUserGroup)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    readElseWrite: ").append(toIndentedString(readElseWrite)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `allUserGroup` to the URL query string
    if (getAllUserGroup() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallUserGroup%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllUserGroup()))));
    }

    // add `userGroupId` to the URL query string
    if (getUserGroupId() != null) {
      joiner.add(getUserGroupId().toUrlQueryString(prefix + "userGroupId" + suffix));
    }

    // add `readElseWrite` to the URL query string
    if (getReadElseWrite() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreadElseWrite%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReadElseWrite()))));
    }

    // add `roleIds` to the URL query string
    if (getRoleIds() != null) {
      for (int i = 0; i < getRoleIds().size(); i++) {
        if (getRoleIds().get(i) != null) {
          joiner.add(getRoleIds().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sroleIds%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

