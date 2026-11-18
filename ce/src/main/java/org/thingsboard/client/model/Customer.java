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
import org.thingsboard.client.model.CustomMenuId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Customer
 */
@JsonPropertyOrder({
  Customer.JSON_PROPERTY_ID,
  Customer.JSON_PROPERTY_CREATED_TIME,
  Customer.JSON_PROPERTY_ADDITIONAL_INFO,
  Customer.JSON_PROPERTY_COUNTRY,
  Customer.JSON_PROPERTY_STATE,
  Customer.JSON_PROPERTY_CITY,
  Customer.JSON_PROPERTY_ADDRESS,
  Customer.JSON_PROPERTY_ADDRESS2,
  Customer.JSON_PROPERTY_ZIP,
  Customer.JSON_PROPERTY_PHONE,
  Customer.JSON_PROPERTY_EMAIL,
  Customer.JSON_PROPERTY_TITLE,
  Customer.JSON_PROPERTY_TENANT_ID,
  Customer.JSON_PROPERTY_PARENT_CUSTOMER_ID,
  Customer.JSON_PROPERTY_VERSION,
  Customer.JSON_PROPERTY_CUSTOM_MENU_ID,
  Customer.JSON_PROPERTY_CUSTOMER_ID,
  Customer.JSON_PROPERTY_NAME,
  Customer.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Customer {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private CustomerId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @Nullable
  private String country;

  public static final String JSON_PROPERTY_STATE = "state";
  @Nullable
  private String state;

  public static final String JSON_PROPERTY_CITY = "city";
  @Nullable
  private String city;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @Nullable
  private String address;

  public static final String JSON_PROPERTY_ADDRESS2 = "address2";
  @Nullable
  private String address2;

  public static final String JSON_PROPERTY_ZIP = "zip";
  @Nullable
  private String zip;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @Nullable
  private String phone;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @Nullable
  private String email;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nonnull
  private String title;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_PARENT_CUSTOMER_ID = "parentCustomerId";
  @Nullable
  private CustomerId parentCustomerId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_CUSTOM_MENU_ID = "customMenuId";
  @Nullable
  private CustomMenuId customMenuId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public Customer() { 
  }

  @JsonCreator
  public Customer(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.customerId = customerId;
    this.name = name;
    this.ownerId = ownerId;
  }

  public Customer id(@Nullable CustomerId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the customer Id. Specify this field to update the customer. Referencing non-existing customer Id will cause error. Omit this field to create new customer.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable CustomerId id) {
    this.id = id;
  }


  /**
   * Timestamp of the customer creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public Customer additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the customer. May include: &#39;description&#39; (string), &#39;homeDashboardId&#39; (string, UUID of the home dashboard), &#39;homeDashboardHideToolbar&#39; (boolean, whether to hide the dashboard toolbar), &#39;isPublic&#39; (boolean, whether this is a public customer).
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


  public Customer country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNTRY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(@Nullable String country) {
    this.country = country;
  }


  public Customer state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getState() {
    return state;
  }


  @JsonProperty(value = JSON_PROPERTY_STATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@Nullable String state) {
    this.state = state;
  }


  public Customer city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }


  @JsonProperty(value = JSON_PROPERTY_CITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(@Nullable String city) {
    this.city = city;
  }


  public Customer address(@Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * Address Line 1
   * @return address
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddress() {
    return address;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDRESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(@Nullable String address) {
    this.address = address;
  }


  public Customer address2(@Nullable String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address Line 2
   * @return address2
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDRESS2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddress2() {
    return address2;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDRESS2, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress2(@Nullable String address2) {
    this.address2 = address2;
  }


  public Customer zip(@Nullable String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * @return zip
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ZIP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getZip() {
    return zip;
  }


  @JsonProperty(value = JSON_PROPERTY_ZIP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(@Nullable String zip) {
    this.zip = zip;
  }


  public Customer phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number
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


  public Customer email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@Nullable String email) {
    this.email = email;
  }


  public Customer title(@Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the customer
   * @return title
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@Nonnull String title) {
    this.title = title;
  }


  public Customer tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * JSON object with Tenant Id
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


  public Customer parentCustomerId(@Nullable CustomerId parentCustomerId) {
    this.parentCustomerId = parentCustomerId;
    return this;
  }

  /**
   * JSON object with parent Customer Id
   * @return parentCustomerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PARENT_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getParentCustomerId() {
    return parentCustomerId;
  }


  @JsonProperty(value = JSON_PROPERTY_PARENT_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentCustomerId(@Nullable CustomerId parentCustomerId) {
    this.parentCustomerId = parentCustomerId;
  }


  public Customer version(@Nullable Long version) {
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


  public Customer customMenuId(@Nullable CustomMenuId customMenuId) {
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


  /**
   * JSON object with parent Customer Id
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  /**
   * Name of the customer. Read-only, duplicated from title for backward compatibility
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
   * Return true if this Customer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.createdTime, customer.createdTime) &&
        Objects.equals(this.additionalInfo, customer.additionalInfo) &&
        Objects.equals(this.country, customer.country) &&
        Objects.equals(this.state, customer.state) &&
        Objects.equals(this.city, customer.city) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.address2, customer.address2) &&
        Objects.equals(this.zip, customer.zip) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.title, customer.title) &&
        Objects.equals(this.tenantId, customer.tenantId) &&
        Objects.equals(this.parentCustomerId, customer.parentCustomerId) &&
        Objects.equals(this.version, customer.version) &&
        Objects.equals(this.customMenuId, customer.customMenuId) &&
        Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.ownerId, customer.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, country, state, city, address, address2, zip, phone, email, title, tenantId, parentCustomerId, version, customMenuId, customerId, name, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    parentCustomerId: ").append(toIndentedString(parentCustomerId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customMenuId: ").append(toIndentedString(customMenuId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scountry%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCountry()))));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getState()))));
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCity()))));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saddress%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAddress()))));
    }

    // add `address2` to the URL query string
    if (getAddress2() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saddress2%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAddress2()))));
    }

    // add `zip` to the URL query string
    if (getZip() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%szip%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getZip()))));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sphone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPhone()))));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmail()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `parentCustomerId` to the URL query string
    if (getParentCustomerId() != null) {
      joiner.add(getParentCustomerId().toUrlQueryString(prefix + "parentCustomerId" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `customMenuId` to the URL query string
    if (getCustomMenuId() != null) {
      joiner.add(getCustomMenuId().toUrlQueryString(prefix + "customMenuId" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
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

