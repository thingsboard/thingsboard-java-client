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
import org.thingsboard.client.model.MobileAppBundleId;
import org.thingsboard.client.model.MobileAppId;
import org.thingsboard.client.model.MobileLayoutConfig;
import org.thingsboard.client.model.OAuth2ClientInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * MobileAppBundleInfo
 */
@JsonPropertyOrder({
  MobileAppBundleInfo.JSON_PROPERTY_ID,
  MobileAppBundleInfo.JSON_PROPERTY_CREATED_TIME,
  MobileAppBundleInfo.JSON_PROPERTY_TENANT_ID,
  MobileAppBundleInfo.JSON_PROPERTY_TITLE,
  MobileAppBundleInfo.JSON_PROPERTY_DESCRIPTION,
  MobileAppBundleInfo.JSON_PROPERTY_ANDROID_APP_ID,
  MobileAppBundleInfo.JSON_PROPERTY_IOS_APP_ID,
  MobileAppBundleInfo.JSON_PROPERTY_LAYOUT_CONFIG,
  MobileAppBundleInfo.JSON_PROPERTY_OAUTH2_ENABLED,
  MobileAppBundleInfo.JSON_PROPERTY_ANDROID_PKG_NAME,
  MobileAppBundleInfo.JSON_PROPERTY_IOS_PKG_NAME,
  MobileAppBundleInfo.JSON_PROPERTY_OAUTH2_CLIENT_INFOS,
  MobileAppBundleInfo.JSON_PROPERTY_QR_CODE_ENABLED,
  MobileAppBundleInfo.JSON_PROPERTY_NAME
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class MobileAppBundleInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private MobileAppBundleId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nonnull
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nullable
  private String description;

  public static final String JSON_PROPERTY_ANDROID_APP_ID = "androidAppId";
  @Nullable
  private MobileAppId androidAppId;

  public static final String JSON_PROPERTY_IOS_APP_ID = "iosAppId";
  @Nullable
  private MobileAppId iosAppId;

  public static final String JSON_PROPERTY_LAYOUT_CONFIG = "layoutConfig";
  @Nullable
  private MobileLayoutConfig layoutConfig;

  public static final String JSON_PROPERTY_OAUTH2_ENABLED = "oauth2Enabled";
  @Nullable
  private Boolean oauth2Enabled;

  public static final String JSON_PROPERTY_ANDROID_PKG_NAME = "androidPkgName";
  @Nullable
  private String androidPkgName;

  public static final String JSON_PROPERTY_IOS_PKG_NAME = "iosPkgName";
  @Nullable
  private String iosPkgName;

  public static final String JSON_PROPERTY_OAUTH2_CLIENT_INFOS = "oauth2ClientInfos";
  @Nullable
  private List<OAuth2ClientInfo> oauth2ClientInfos = new ArrayList<>();

  public static final String JSON_PROPERTY_QR_CODE_ENABLED = "qrCodeEnabled";
  @Nullable
  private Boolean qrCodeEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public MobileAppBundleInfo() { 
  }

  @JsonCreator
  public MobileAppBundleInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public MobileAppBundleInfo id(@Nullable MobileAppBundleId id) {
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
  public MobileAppBundleId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable MobileAppBundleId id) {
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




  public MobileAppBundleInfo tenantId(@Nullable TenantId tenantId) {
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


  public MobileAppBundleInfo title(@Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Application bundle title. Cannot be empty
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


  public MobileAppBundleInfo description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Application bundle description.
   * @return description
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@Nullable String description) {
    this.description = description;
  }


  public MobileAppBundleInfo androidAppId(@Nullable MobileAppId androidAppId) {
    this.androidAppId = androidAppId;
    return this;
  }

  /**
   * Android application id
   * @return androidAppId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ANDROID_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppId getAndroidAppId() {
    return androidAppId;
  }


  @JsonProperty(value = JSON_PROPERTY_ANDROID_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidAppId(@Nullable MobileAppId androidAppId) {
    this.androidAppId = androidAppId;
  }


  public MobileAppBundleInfo iosAppId(@Nullable MobileAppId iosAppId) {
    this.iosAppId = iosAppId;
    return this;
  }

  /**
   * IOS application id
   * @return iosAppId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_IOS_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppId getIosAppId() {
    return iosAppId;
  }


  @JsonProperty(value = JSON_PROPERTY_IOS_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIosAppId(@Nullable MobileAppId iosAppId) {
    this.iosAppId = iosAppId;
  }


  public MobileAppBundleInfo layoutConfig(@Nullable MobileLayoutConfig layoutConfig) {
    this.layoutConfig = layoutConfig;
    return this;
  }

  /**
   * Application layout configuration
   * @return layoutConfig
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAYOUT_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileLayoutConfig getLayoutConfig() {
    return layoutConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_LAYOUT_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLayoutConfig(@Nullable MobileLayoutConfig layoutConfig) {
    this.layoutConfig = layoutConfig;
  }


  public MobileAppBundleInfo oauth2Enabled(@Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
    return this;
  }

  /**
   * Whether OAuth2 settings are enabled or not
   * @return oauth2Enabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOauth2Enabled() {
    return oauth2Enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth2Enabled(@Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
  }


  public MobileAppBundleInfo androidPkgName(@Nullable String androidPkgName) {
    this.androidPkgName = androidPkgName;
    return this;
  }

  /**
   * Android package name
   * @return androidPkgName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ANDROID_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAndroidPkgName() {
    return androidPkgName;
  }


  @JsonProperty(value = JSON_PROPERTY_ANDROID_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidPkgName(@Nullable String androidPkgName) {
    this.androidPkgName = androidPkgName;
  }


  public MobileAppBundleInfo iosPkgName(@Nullable String iosPkgName) {
    this.iosPkgName = iosPkgName;
    return this;
  }

  /**
   * IOS package name
   * @return iosPkgName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_IOS_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIosPkgName() {
    return iosPkgName;
  }


  @JsonProperty(value = JSON_PROPERTY_IOS_PKG_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIosPkgName(@Nullable String iosPkgName) {
    this.iosPkgName = iosPkgName;
  }


  public MobileAppBundleInfo oauth2ClientInfos(@Nullable List<OAuth2ClientInfo> oauth2ClientInfos) {
    this.oauth2ClientInfos = oauth2ClientInfos;
    return this;
  }

  public MobileAppBundleInfo addOauth2ClientInfosItem(OAuth2ClientInfo oauth2ClientInfosItem) {
    if (this.oauth2ClientInfos == null) {
      this.oauth2ClientInfos = new ArrayList<>();
    }
    this.oauth2ClientInfos.add(oauth2ClientInfosItem);
    return this;
  }

  /**
   * List of available oauth2 clients
   * @return oauth2ClientInfos
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH2_CLIENT_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuth2ClientInfo> getOauth2ClientInfos() {
    return oauth2ClientInfos;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH2_CLIENT_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth2ClientInfos(@Nullable List<OAuth2ClientInfo> oauth2ClientInfos) {
    this.oauth2ClientInfos = oauth2ClientInfos;
  }


  public MobileAppBundleInfo qrCodeEnabled(@Nullable Boolean qrCodeEnabled) {
    this.qrCodeEnabled = qrCodeEnabled;
    return this;
  }

  /**
   * Indicates if qr code is available for bundle
   * @return qrCodeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QR_CODE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getQrCodeEnabled() {
    return qrCodeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_QR_CODE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQrCodeEnabled(@Nullable Boolean qrCodeEnabled) {
    this.qrCodeEnabled = qrCodeEnabled;
  }


  /**
   * Mobile app bundle title
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this MobileAppBundleInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppBundleInfo mobileAppBundleInfo = (MobileAppBundleInfo) o;
    return Objects.equals(this.id, mobileAppBundleInfo.id) &&
        Objects.equals(this.createdTime, mobileAppBundleInfo.createdTime) &&
        Objects.equals(this.tenantId, mobileAppBundleInfo.tenantId) &&
        Objects.equals(this.title, mobileAppBundleInfo.title) &&
        Objects.equals(this.description, mobileAppBundleInfo.description) &&
        Objects.equals(this.androidAppId, mobileAppBundleInfo.androidAppId) &&
        Objects.equals(this.iosAppId, mobileAppBundleInfo.iosAppId) &&
        Objects.equals(this.layoutConfig, mobileAppBundleInfo.layoutConfig) &&
        Objects.equals(this.oauth2Enabled, mobileAppBundleInfo.oauth2Enabled) &&
        Objects.equals(this.androidPkgName, mobileAppBundleInfo.androidPkgName) &&
        Objects.equals(this.iosPkgName, mobileAppBundleInfo.iosPkgName) &&
        Objects.equals(this.oauth2ClientInfos, mobileAppBundleInfo.oauth2ClientInfos) &&
        Objects.equals(this.qrCodeEnabled, mobileAppBundleInfo.qrCodeEnabled) &&
        Objects.equals(this.name, mobileAppBundleInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, title, description, androidAppId, iosAppId, layoutConfig, oauth2Enabled, androidPkgName, iosPkgName, oauth2ClientInfos, qrCodeEnabled, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppBundleInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    androidAppId: ").append(toIndentedString(androidAppId)).append("\n");
    sb.append("    iosAppId: ").append(toIndentedString(iosAppId)).append("\n");
    sb.append("    layoutConfig: ").append(toIndentedString(layoutConfig)).append("\n");
    sb.append("    oauth2Enabled: ").append(toIndentedString(oauth2Enabled)).append("\n");
    sb.append("    androidPkgName: ").append(toIndentedString(androidPkgName)).append("\n");
    sb.append("    iosPkgName: ").append(toIndentedString(iosPkgName)).append("\n");
    sb.append("    oauth2ClientInfos: ").append(toIndentedString(oauth2ClientInfos)).append("\n");
    sb.append("    qrCodeEnabled: ").append(toIndentedString(qrCodeEnabled)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `androidAppId` to the URL query string
    if (getAndroidAppId() != null) {
      joiner.add(getAndroidAppId().toUrlQueryString(prefix + "androidAppId" + suffix));
    }

    // add `iosAppId` to the URL query string
    if (getIosAppId() != null) {
      joiner.add(getIosAppId().toUrlQueryString(prefix + "iosAppId" + suffix));
    }

    // add `layoutConfig` to the URL query string
    if (getLayoutConfig() != null) {
      joiner.add(getLayoutConfig().toUrlQueryString(prefix + "layoutConfig" + suffix));
    }

    // add `oauth2Enabled` to the URL query string
    if (getOauth2Enabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soauth2Enabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOauth2Enabled()))));
    }

    // add `androidPkgName` to the URL query string
    if (getAndroidPkgName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sandroidPkgName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAndroidPkgName()))));
    }

    // add `iosPkgName` to the URL query string
    if (getIosPkgName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%siosPkgName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIosPkgName()))));
    }

    // add `oauth2ClientInfos` to the URL query string
    if (getOauth2ClientInfos() != null) {
      for (int i = 0; i < getOauth2ClientInfos().size(); i++) {
        if (getOauth2ClientInfos().get(i) != null) {
          joiner.add(getOauth2ClientInfos().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%soauth2ClientInfos%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `qrCodeEnabled` to the URL query string
    if (getQrCodeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sqrCodeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQrCodeEnabled()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

