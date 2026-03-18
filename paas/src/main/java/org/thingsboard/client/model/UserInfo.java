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
import org.thingsboard.client.model.Authority;
import org.thingsboard.client.model.CustomMenuId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * UserInfo
 */
@JsonPropertyOrder({
  UserInfo.JSON_PROPERTY_ID,
  UserInfo.JSON_PROPERTY_CREATED_TIME,
  UserInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  UserInfo.JSON_PROPERTY_TENANT_ID,
  UserInfo.JSON_PROPERTY_CUSTOMER_ID,
  UserInfo.JSON_PROPERTY_EMAIL,
  UserInfo.JSON_PROPERTY_AUTHORITY,
  UserInfo.JSON_PROPERTY_FIRST_NAME,
  UserInfo.JSON_PROPERTY_LAST_NAME,
  UserInfo.JSON_PROPERTY_PHONE,
  UserInfo.JSON_PROPERTY_CUSTOM_MENU_ID,
  UserInfo.JSON_PROPERTY_VERSION,
  UserInfo.JSON_PROPERTY_OWNER_NAME,
  UserInfo.JSON_PROPERTY_GROUPS,
  UserInfo.JSON_PROPERTY_NAME,
  UserInfo.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class UserInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private UserId id;

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

  public static final String JSON_PROPERTY_EMAIL = "email";
  @Nonnull
  private String email;

  public static final String JSON_PROPERTY_AUTHORITY = "authority";
  @Nonnull
  private Authority authority;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @Nullable
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @Nullable
  private String lastName;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @Nullable
  private String phone;

  public static final String JSON_PROPERTY_CUSTOM_MENU_ID = "customMenuId";
  @Nullable
  private CustomMenuId customMenuId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  @Nullable
  private String ownerName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @Nullable
  private List<EntityInfo> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public UserInfo() { 
  }

  @JsonCreator
  public UserInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_OWNER_NAME) String ownerName, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.ownerName = ownerName;
    this.name = name;
    this.ownerId = ownerId;
  }

  public UserInfo id(@Nullable UserId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the User Id. Specify this field to update the device. Referencing non-existing User Id will cause error. Omit this field to create new customer.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable UserId id) {
    this.id = id;
  }


  /**
   * Timestamp of the user creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public UserInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the user. May include: &#39;defaultDashboardId&#39; (string, UUID of the default dashboard), &#39;defaultDashboardFullscreen&#39; (boolean), &#39;homeDashboardId&#39; (string, UUID of the home dashboard), &#39;homeDashboardHideToolbar&#39; (boolean), &#39;lang&#39; (string, user locale, e.g. &#39;en_US&#39;), &#39;authProviderName&#39; (string, name of the authentication provider).
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


  public UserInfo tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
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


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public UserInfo customerId(@Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * JSON object with the Customer Id.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public UserInfo email(@Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user
   * @return email
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@Nonnull String email) {
    this.email = email;
  }


  public UserInfo authority(@Nonnull Authority authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Authority
   * @return authority
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_AUTHORITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Authority getAuthority() {
    return authority;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTHORITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthority(@Nonnull Authority authority) {
    this.authority = authority;
  }


  public UserInfo firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }


  public UserInfo lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastName() {
    return lastName;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }


  public UserInfo phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the user
   * @return phone
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhone() {
    return phone;
  }


  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@Nullable String phone) {
    this.phone = phone;
  }


  public UserInfo customMenuId(@Nullable CustomMenuId customMenuId) {
    this.customMenuId = customMenuId;
    return this;
  }

  /**
   * Get customMenuId
   * @return customMenuId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOM_MENU_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomMenuId getCustomMenuId() {
    return customMenuId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM_MENU_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomMenuId(@Nullable CustomMenuId customMenuId) {
    this.customMenuId = customMenuId;
  }


  public UserInfo version(@Nullable Long version) {
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




  public UserInfo groups(@Nullable List<EntityInfo> groups) {
    this.groups = groups;
    return this;
  }

  public UserInfo addGroupsItem(EntityInfo groupsItem) {
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
   * Duplicates the email of the user, readonly
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
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
   * Return true if this UserInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.createdTime, userInfo.createdTime) &&
        Objects.equals(this.additionalInfo, userInfo.additionalInfo) &&
        Objects.equals(this.tenantId, userInfo.tenantId) &&
        Objects.equals(this.customerId, userInfo.customerId) &&
        Objects.equals(this.email, userInfo.email) &&
        Objects.equals(this.authority, userInfo.authority) &&
        Objects.equals(this.firstName, userInfo.firstName) &&
        Objects.equals(this.lastName, userInfo.lastName) &&
        Objects.equals(this.phone, userInfo.phone) &&
        Objects.equals(this.customMenuId, userInfo.customMenuId) &&
        Objects.equals(this.version, userInfo.version) &&
        Objects.equals(this.ownerName, userInfo.ownerName) &&
        Objects.equals(this.groups, userInfo.groups) &&
        Objects.equals(this.name, userInfo.name) &&
        Objects.equals(this.ownerId, userInfo.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, customerId, email, authority, firstName, lastName, phone, customMenuId, version, ownerName, groups, name, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    customMenuId: ").append(toIndentedString(customMenuId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmail()))));
    }

    // add `authority` to the URL query string
    if (getAuthority() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sauthority%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAuthority()))));
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirstName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirstName()))));
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastName()))));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sphone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPhone()))));
    }

    // add `customMenuId` to the URL query string
    if (getCustomMenuId() != null) {
      joiner.add(getCustomMenuId().toUrlQueryString(prefix + "customMenuId" + suffix));
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

