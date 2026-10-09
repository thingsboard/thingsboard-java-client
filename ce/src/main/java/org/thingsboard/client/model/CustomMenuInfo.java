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
import org.thingsboard.client.model.CMAssigneeType;
import org.thingsboard.client.model.CMScope;
import org.thingsboard.client.model.CustomMenuId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the custom menu basic info fields
 */
@JsonPropertyOrder({
  CustomMenuInfo.JSON_PROPERTY_ID,
  CustomMenuInfo.JSON_PROPERTY_CREATED_TIME,
  CustomMenuInfo.JSON_PROPERTY_TENANT_ID,
  CustomMenuInfo.JSON_PROPERTY_CUSTOMER_ID,
  CustomMenuInfo.JSON_PROPERTY_NAME,
  CustomMenuInfo.JSON_PROPERTY_SCOPE,
  CustomMenuInfo.JSON_PROPERTY_ASSIGNEE_TYPE,
  CustomMenuInfo.JSON_PROPERTY_USER_GROUP_NAMES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class CustomMenuInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private CustomMenuId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @Nonnull
  private CMScope scope;

  public static final String JSON_PROPERTY_ASSIGNEE_TYPE = "assigneeType";
  @Nonnull
  private CMAssigneeType assigneeType;

  public static final String JSON_PROPERTY_USER_GROUP_NAMES = "userGroupNames";
  @Nullable
  private List<String> userGroupNames = new ArrayList<>();

  public CustomMenuInfo() { 
  }

  @JsonCreator
  public CustomMenuInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
  }

  public CustomMenuInfo id(@Nullable CustomMenuId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomMenuId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable CustomMenuId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id that owns the menu.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id that owns the menu.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public CustomMenuInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Custom menu name
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


  public CustomMenuInfo scope(@Nonnull CMScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Custom menu scope. Possible values: SYSTEM, TENANT, CUSTOMER
   * @return scope
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CMScope getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScope(@Nonnull CMScope scope) {
    this.scope = scope;
  }


  public CustomMenuInfo assigneeType(@Nonnull CMAssigneeType assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * Custom menu assignee type. Possible values are: All (all users of specified scope), CUSTOMERS (specified customers), USERS (specified list of users), NO_ASSIGN (no assignees), USER_GROUPS (user groups)
   * @return assigneeType
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CMAssigneeType getAssigneeType() {
    return assigneeType;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssigneeType(@Nonnull CMAssigneeType assigneeType) {
    this.assigneeType = assigneeType;
  }


  public CustomMenuInfo userGroupNames(@Nullable List<String> userGroupNames) {
    this.userGroupNames = userGroupNames;
    return this;
  }

  public CustomMenuInfo addUserGroupNamesItem(String userGroupNamesItem) {
    if (this.userGroupNames == null) {
      this.userGroupNames = new ArrayList<>();
    }
    this.userGroupNames.add(userGroupNamesItem);
    return this;
  }

  /**
   * User group names menu is applied to
   * @return userGroupNames
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_NAMES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUserGroupNames() {
    return userGroupNames;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_GROUP_NAMES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupNames(@Nullable List<String> userGroupNames) {
    this.userGroupNames = userGroupNames;
  }


  /**
   * Return true if this CustomMenuInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMenuInfo customMenuInfo = (CustomMenuInfo) o;
    return Objects.equals(this.id, customMenuInfo.id) &&
        Objects.equals(this.createdTime, customMenuInfo.createdTime) &&
        Objects.equals(this.tenantId, customMenuInfo.tenantId) &&
        Objects.equals(this.customerId, customMenuInfo.customerId) &&
        Objects.equals(this.name, customMenuInfo.name) &&
        Objects.equals(this.scope, customMenuInfo.scope) &&
        Objects.equals(this.assigneeType, customMenuInfo.assigneeType) &&
        Objects.equals(this.userGroupNames, customMenuInfo.userGroupNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, name, scope, assigneeType, userGroupNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMenuInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    userGroupNames: ").append(toIndentedString(userGroupNames)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScope()))));
    }

    // add `assigneeType` to the URL query string
    if (getAssigneeType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassigneeType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssigneeType()))));
    }

    // add `userGroupNames` to the URL query string
    if (getUserGroupNames() != null) {
      for (int i = 0; i < getUserGroupNames().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%suserGroupNames%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getUserGroupNames().get(i)))));
      }
    }

    return joiner.toString();
  }
}

