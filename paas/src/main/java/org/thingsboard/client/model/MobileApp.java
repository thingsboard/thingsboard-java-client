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
import org.thingsboard.client.model.MobileAppId;
import org.thingsboard.client.model.MobileAppStatus;
import org.thingsboard.client.model.MobileAppVersionInfo;
import org.thingsboard.client.model.PlatformType;
import org.thingsboard.client.model.StoreInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Mobile Application.
 */
@JsonPropertyOrder({
  MobileApp.JSON_PROPERTY_ID,
  MobileApp.JSON_PROPERTY_CREATED_TIME,
  MobileApp.JSON_PROPERTY_TENANT_ID,
  MobileApp.JSON_PROPERTY_PKG_NAME,
  MobileApp.JSON_PROPERTY_TITLE,
  MobileApp.JSON_PROPERTY_APP_SECRET,
  MobileApp.JSON_PROPERTY_PLATFORM_TYPE,
  MobileApp.JSON_PROPERTY_STATUS,
  MobileApp.JSON_PROPERTY_VERSION_INFO,
  MobileApp.JSON_PROPERTY_STORE_INFO,
  MobileApp.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MobileApp {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private MobileAppId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_PKG_NAME = "pkgName";
  @javax.annotation.Nonnull
  private String pkgName;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
  @javax.annotation.Nonnull
  private String appSecret;

  public static final String JSON_PROPERTY_PLATFORM_TYPE = "platformType";
  @javax.annotation.Nonnull
  private PlatformType platformType;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private MobileAppStatus status;

  public static final String JSON_PROPERTY_VERSION_INFO = "versionInfo";
  @javax.annotation.Nullable
  private MobileAppVersionInfo versionInfo;

  public static final String JSON_PROPERTY_STORE_INFO = "storeInfo";
  @javax.annotation.Nullable
  private StoreInfo storeInfo;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public MobileApp() { 
  }

  @JsonCreator
  public MobileApp(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public MobileApp id(@javax.annotation.Nullable MobileAppId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable MobileAppId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public MobileApp tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * JSON object with Tenant Id
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


  public MobileApp pkgName(@javax.annotation.Nonnull String pkgName) {
    this.pkgName = pkgName;
    return this;
  }

  /**
   * Application package name. Cannot be empty
   * @return pkgName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PKG_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPkgName() {
    return pkgName;
  }


  @JsonProperty(value = JSON_PROPERTY_PKG_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPkgName(@javax.annotation.Nonnull String pkgName) {
    this.pkgName = pkgName;
  }


  public MobileApp title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Application title
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public MobileApp appSecret(@javax.annotation.Nonnull String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

  /**
   * Application secret. The length must be at least 16 characters
   * @return appSecret
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_APP_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAppSecret() {
    return appSecret;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppSecret(@javax.annotation.Nonnull String appSecret) {
    this.appSecret = appSecret;
  }


  public MobileApp platformType(@javax.annotation.Nonnull PlatformType platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * Application platform type: ANDROID or IOS
   * @return platformType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PLATFORM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PlatformType getPlatformType() {
    return platformType;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORM_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatformType(@javax.annotation.Nonnull PlatformType platformType) {
    this.platformType = platformType;
  }


  public MobileApp status(@javax.annotation.Nonnull MobileAppStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Application status: PUBLISHED, DEPRECATED, SUSPENDED, DRAFT
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MobileAppStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull MobileAppStatus status) {
    this.status = status;
  }


  public MobileApp versionInfo(@javax.annotation.Nullable MobileAppVersionInfo versionInfo) {
    this.versionInfo = versionInfo;
    return this;
  }

  /**
   * Application version info
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


  public MobileApp storeInfo(@javax.annotation.Nullable StoreInfo storeInfo) {
    this.storeInfo = storeInfo;
    return this;
  }

  /**
   * Application store information
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


  /**
   * Mobile app package name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this MobileApp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileApp mobileApp = (MobileApp) o;
    return Objects.equals(this.id, mobileApp.id) &&
        Objects.equals(this.createdTime, mobileApp.createdTime) &&
        Objects.equals(this.tenantId, mobileApp.tenantId) &&
        Objects.equals(this.pkgName, mobileApp.pkgName) &&
        Objects.equals(this.title, mobileApp.title) &&
        Objects.equals(this.appSecret, mobileApp.appSecret) &&
        Objects.equals(this.platformType, mobileApp.platformType) &&
        Objects.equals(this.status, mobileApp.status) &&
        Objects.equals(this.versionInfo, mobileApp.versionInfo) &&
        Objects.equals(this.storeInfo, mobileApp.storeInfo) &&
        Objects.equals(this.name, mobileApp.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, pkgName, title, appSecret, platformType, status, versionInfo, storeInfo, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileApp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    pkgName: ").append(toIndentedString(pkgName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
    sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `pkgName` to the URL query string
    if (getPkgName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spkgName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPkgName()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `appSecret` to the URL query string
    if (getAppSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppSecret()))));
    }

    // add `platformType` to the URL query string
    if (getPlatformType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splatformType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlatformType()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `versionInfo` to the URL query string
    if (getVersionInfo() != null) {
      joiner.add(getVersionInfo().toUrlQueryString(prefix + "versionInfo" + suffix));
    }

    // add `storeInfo` to the URL query string
    if (getStoreInfo() != null) {
      joiner.add(getStoreInfo().toUrlQueryString(prefix + "storeInfo" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

