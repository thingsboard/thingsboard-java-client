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
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.TenantProfileId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantInfo
 */
@JsonPropertyOrder({
  TenantInfo.JSON_PROPERTY_ID,
  TenantInfo.JSON_PROPERTY_CREATED_TIME,
  TenantInfo.JSON_PROPERTY_COUNTRY,
  TenantInfo.JSON_PROPERTY_STATE,
  TenantInfo.JSON_PROPERTY_CITY,
  TenantInfo.JSON_PROPERTY_ADDRESS,
  TenantInfo.JSON_PROPERTY_ADDRESS2,
  TenantInfo.JSON_PROPERTY_ZIP,
  TenantInfo.JSON_PROPERTY_PHONE,
  TenantInfo.JSON_PROPERTY_EMAIL,
  TenantInfo.JSON_PROPERTY_TITLE,
  TenantInfo.JSON_PROPERTY_REGION,
  TenantInfo.JSON_PROPERTY_TENANT_PROFILE_ID,
  TenantInfo.JSON_PROPERTY_VERSION,
  TenantInfo.JSON_PROPERTY_TENANT_PROFILE_NAME,
  TenantInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  TenantInfo.JSON_PROPERTY_NAME
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private TenantId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

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

  public static final String JSON_PROPERTY_REGION = "region";
  @Nullable
  private String region;

  public static final String JSON_PROPERTY_TENANT_PROFILE_ID = "tenantProfileId";
  @Nullable
  private TenantProfileId tenantProfileId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_TENANT_PROFILE_NAME = "tenantProfileName";
  @Nullable
  private String tenantProfileName;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public TenantInfo() { 
  }

  @JsonCreator
  public TenantInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public TenantInfo id(@Nullable TenantId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the tenant Id. Specify this field to update the tenant. Referencing non-existing tenant Id will cause error. Omit this field to create new tenant.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable TenantId id) {
    this.id = id;
  }


  /**
   * Timestamp of the tenant creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public TenantInfo country(@Nullable String country) {
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


  public TenantInfo state(@Nullable String state) {
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


  public TenantInfo city(@Nullable String city) {
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


  public TenantInfo address(@Nullable String address) {
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


  public TenantInfo address2(@Nullable String address2) {
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


  public TenantInfo zip(@Nullable String zip) {
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


  public TenantInfo phone(@Nullable String phone) {
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


  public TenantInfo email(@Nullable String email) {
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


  public TenantInfo title(@Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the tenant
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


  public TenantInfo region(@Nullable String region) {
    this.region = region;
    return this;
  }

  /**
   * Geo region of the tenant
   * @return region
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REGION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }


  @JsonProperty(value = JSON_PROPERTY_REGION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(@Nullable String region) {
    this.region = region;
  }


  public TenantInfo tenantProfileId(@Nullable TenantProfileId tenantProfileId) {
    this.tenantProfileId = tenantProfileId;
    return this;
  }

  /**
   * JSON object with Tenant Profile Id
   * @return tenantProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantProfileId getTenantProfileId() {
    return tenantProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantProfileId(@Nullable TenantProfileId tenantProfileId) {
    this.tenantProfileId = tenantProfileId;
  }


  public TenantInfo version(@Nullable Long version) {
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


  public TenantInfo tenantProfileName(@Nullable String tenantProfileName) {
    this.tenantProfileName = tenantProfileName;
    return this;
  }

  /**
   * Tenant Profile name
   * @return tenantProfileName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_PROFILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantProfileName() {
    return tenantProfileName;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_PROFILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantProfileName(@Nullable String tenantProfileName) {
    this.tenantProfileName = tenantProfileName;
  }


  public TenantInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the tenant. May include: &#39;description&#39; (string), &#39;homeDashboardId&#39; (string, UUID of the home dashboard), &#39;homeDashboardHideToolbar&#39; (boolean, whether to hide the dashboard toolbar).
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
   * Name of the tenant. Read-only, duplicated from title for backward compatibility
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this TenantInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantInfo tenantInfo = (TenantInfo) o;
    return Objects.equals(this.id, tenantInfo.id) &&
        Objects.equals(this.createdTime, tenantInfo.createdTime) &&
        Objects.equals(this.country, tenantInfo.country) &&
        Objects.equals(this.state, tenantInfo.state) &&
        Objects.equals(this.city, tenantInfo.city) &&
        Objects.equals(this.address, tenantInfo.address) &&
        Objects.equals(this.address2, tenantInfo.address2) &&
        Objects.equals(this.zip, tenantInfo.zip) &&
        Objects.equals(this.phone, tenantInfo.phone) &&
        Objects.equals(this.email, tenantInfo.email) &&
        Objects.equals(this.title, tenantInfo.title) &&
        Objects.equals(this.region, tenantInfo.region) &&
        Objects.equals(this.tenantProfileId, tenantInfo.tenantProfileId) &&
        Objects.equals(this.version, tenantInfo.version) &&
        Objects.equals(this.tenantProfileName, tenantInfo.tenantProfileName) &&
        Objects.equals(this.additionalInfo, tenantInfo.additionalInfo) &&
        Objects.equals(this.name, tenantInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, country, state, city, address, address2, zip, phone, email, title, region, tenantProfileId, version, tenantProfileName, additionalInfo, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tenantProfileId: ").append(toIndentedString(tenantProfileId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tenantProfileName: ").append(toIndentedString(tenantProfileName)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `region` to the URL query string
    if (getRegion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sregion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRegion()))));
    }

    // add `tenantProfileId` to the URL query string
    if (getTenantProfileId() != null) {
      joiner.add(getTenantProfileId().toUrlQueryString(prefix + "tenantProfileId" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `tenantProfileName` to the URL query string
    if (getTenantProfileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantProfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantProfileName()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

