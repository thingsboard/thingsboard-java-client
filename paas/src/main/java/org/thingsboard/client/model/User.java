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
import org.thingsboard.client.model.Authority;
import org.thingsboard.client.model.CustomMenuId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the User.
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_CREATED_TIME,
  User.JSON_PROPERTY_TENANT_ID,
  User.JSON_PROPERTY_CUSTOMER_ID,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_AUTHORITY,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_PHONE,
  User.JSON_PROPERTY_CUSTOM_MENU_ID,
  User.JSON_PROPERTY_VERSION,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_OWNER_ID,
  User.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class User {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UserId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nonnull
  private String email;

  public static final String JSON_PROPERTY_AUTHORITY = "authority";
  @javax.annotation.Nonnull
  private Authority authority;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private String lastName;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private String phone;

  public static final String JSON_PROPERTY_CUSTOM_MENU_ID = "customMenuId";
  @javax.annotation.Nullable
  private CustomMenuId customMenuId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public User() { 
  }

  @JsonCreator
  public User(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
    this.ownerId = ownerId;
  }

  public User id(@javax.annotation.Nullable UserId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the User Id. Specify this field to update the device. Referencing non-existing User Id will cause error. Omit this field to create new customer.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UserId id) {
    this.id = id;
  }


  /**
   * Timestamp of the user creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public User tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
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


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public User customerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * JSON object with the Customer Id.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public User email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user
   * @return email
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public User authority(@javax.annotation.Nonnull Authority authority) {
    this.authority = authority;
    return this;
  }

  /**
   * Authority
   * @return authority
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AUTHORITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Authority getAuthority() {
    return authority;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTHORITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthority(@javax.annotation.Nonnull Authority authority) {
    this.authority = authority;
  }


  public User firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public User lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastName() {
    return lastName;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public User phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the user
   * @return phone
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhone() {
    return phone;
  }


  @JsonProperty(value = JSON_PROPERTY_PHONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public User customMenuId(@javax.annotation.Nullable CustomMenuId customMenuId) {
    this.customMenuId = customMenuId;
    return this;
  }

  /**
   * Get customMenuId
   * @return customMenuId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOM_MENU_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomMenuId getCustomMenuId() {
    return customMenuId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM_MENU_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomMenuId(@javax.annotation.Nullable CustomMenuId customMenuId) {
    this.customMenuId = customMenuId;
  }


  public User version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  /**
   * Duplicates the email of the user, readonly
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  public User additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the user
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.createdTime, user.createdTime) &&
        Objects.equals(this.tenantId, user.tenantId) &&
        Objects.equals(this.customerId, user.customerId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.authority, user.authority) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.customMenuId, user.customMenuId) &&
        Objects.equals(this.version, user.version) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.ownerId, user.ownerId) &&
        Objects.equals(this.additionalInfo, user.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, email, authority, firstName, lastName, phone, customMenuId, version, name, ownerId, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    customMenuId: ").append(toIndentedString(customMenuId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

