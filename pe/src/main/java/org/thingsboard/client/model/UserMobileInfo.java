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
import org.thingsboard.client.model.HomeDashboardInfo;
import org.thingsboard.client.model.MobileAppVersionInfo;
import org.thingsboard.client.model.StoreInfo;
import org.thingsboard.client.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * UserMobileInfo
 */
@JsonPropertyOrder({
  UserMobileInfo.JSON_PROPERTY_USER,
  UserMobileInfo.JSON_PROPERTY_STORE_INFO,
  UserMobileInfo.JSON_PROPERTY_VERSION_INFO,
  UserMobileInfo.JSON_PROPERTY_HOME_DASHBOARD_INFO,
  UserMobileInfo.JSON_PROPERTY_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UserMobileInfo {
  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private User user;

  public static final String JSON_PROPERTY_STORE_INFO = "storeInfo";
  @javax.annotation.Nullable
  private StoreInfo storeInfo;

  public static final String JSON_PROPERTY_VERSION_INFO = "versionInfo";
  @javax.annotation.Nullable
  private MobileAppVersionInfo versionInfo;

  public static final String JSON_PROPERTY_HOME_DASHBOARD_INFO = "homeDashboardInfo";
  @javax.annotation.Nullable
  private HomeDashboardInfo homeDashboardInfo;

  public static final String JSON_PROPERTY_PAGES = "pages";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode pages = null;

  public UserMobileInfo() { 
  }

  public UserMobileInfo user(@javax.annotation.Nullable User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public User getUser() {
    return user;
  }


  @JsonProperty(value = JSON_PROPERTY_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable User user) {
    this.user = user;
  }


  public UserMobileInfo storeInfo(@javax.annotation.Nullable StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    return this;
  }

  /**
   * Get storeInfo
   * @return storeInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STORE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StoreInfo getStoreInfo() {
    return storeInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_STORE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreInfo(@javax.annotation.Nullable StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
  }


  public UserMobileInfo versionInfo(@javax.annotation.Nullable MobileAppVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  /**
   * Get versionInfo
   * @return versionInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppVersionInfo getVersionInfo() {
    return versionInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionInfo(@javax.annotation.Nullable MobileAppVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
  }


  public UserMobileInfo homeDashboardInfo(@javax.annotation.Nullable HomeDashboardInfo homeDashboardInfo) {
    this.homeDashboardInfo = homeDashboardInfo;
    return this;
  }

  /**
   * Get homeDashboardInfo
   * @return homeDashboardInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HOME_DASHBOARD_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HomeDashboardInfo getHomeDashboardInfo() {
    return homeDashboardInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_HOME_DASHBOARD_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomeDashboardInfo(@javax.annotation.Nullable HomeDashboardInfo homeDashboardInfo) {
    this.homeDashboardInfo = homeDashboardInfo;
  }


  public UserMobileInfo pages(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getPages() {
    return pages;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPages(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode pages) {
    this.pages = pages;
  }


  /**
   * Return true if this UserMobileInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMobileInfo userMobileInfo = (UserMobileInfo) o;
    return Objects.equals(this.user, userMobileInfo.user) &&
        Objects.equals(this.storeInfo, userMobileInfo.storeInfo) &&
        Objects.equals(this.versionInfo, userMobileInfo.versionInfo) &&
        Objects.equals(this.homeDashboardInfo, userMobileInfo.homeDashboardInfo) &&
        Objects.equals(this.pages, userMobileInfo.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, storeInfo, versionInfo, homeDashboardInfo, pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMobileInfo {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
    sb.append("    homeDashboardInfo: ").append(toIndentedString(homeDashboardInfo)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(getUser().toUrlQueryString(prefix + "user" + suffix));
    }

    // add `storeInfo` to the URL query string
    if (getStoreInfo() != null) {
      joiner.add(getStoreInfo().toUrlQueryString(prefix + "storeInfo" + suffix));
    }

    // add `versionInfo` to the URL query string
    if (getVersionInfo() != null) {
      joiner.add(getVersionInfo().toUrlQueryString(prefix + "versionInfo" + suffix));
    }

    // add `homeDashboardInfo` to the URL query string
    if (getHomeDashboardInfo() != null) {
      joiner.add(getHomeDashboardInfo().toUrlQueryString(prefix + "homeDashboardInfo" + suffix));
    }

    // add `pages` to the URL query string
    if (getPages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPages()))));
    }

    return joiner.toString();
  }
}

