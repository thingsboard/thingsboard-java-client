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
import org.thingsboard.client.model.MobileAppBundleId;
import org.thingsboard.client.model.QRCodeConfig;
import org.thingsboard.client.model.QrCodeSettingsId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the mobile apps configuration
 */
@JsonPropertyOrder({
  QrCodeSettings.JSON_PROPERTY_ID,
  QrCodeSettings.JSON_PROPERTY_CREATED_TIME,
  QrCodeSettings.JSON_PROPERTY_TENANT_ID,
  QrCodeSettings.JSON_PROPERTY_USE_SYSTEM_SETTINGS,
  QrCodeSettings.JSON_PROPERTY_USE_DEFAULT_APP,
  QrCodeSettings.JSON_PROPERTY_MOBILE_APP_BUNDLE_ID,
  QrCodeSettings.JSON_PROPERTY_QR_CODE_CONFIG,
  QrCodeSettings.JSON_PROPERTY_ANDROID_ENABLED,
  QrCodeSettings.JSON_PROPERTY_IOS_ENABLED,
  QrCodeSettings.JSON_PROPERTY_GOOGLE_PLAY_LINK,
  QrCodeSettings.JSON_PROPERTY_APP_STORE_LINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class QrCodeSettings {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private QrCodeSettingsId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_USE_SYSTEM_SETTINGS = "useSystemSettings";
  @javax.annotation.Nullable
  private Boolean useSystemSettings;

  public static final String JSON_PROPERTY_USE_DEFAULT_APP = "useDefaultApp";
  @javax.annotation.Nullable
  private Boolean useDefaultApp;

  public static final String JSON_PROPERTY_MOBILE_APP_BUNDLE_ID = "mobileAppBundleId";
  @javax.annotation.Nullable
  private MobileAppBundleId mobileAppBundleId;

  public static final String JSON_PROPERTY_QR_CODE_CONFIG = "qrCodeConfig";
  @javax.annotation.Nonnull
  private QRCodeConfig qrCodeConfig;

  public static final String JSON_PROPERTY_ANDROID_ENABLED = "androidEnabled";
  @javax.annotation.Nullable
  private Boolean androidEnabled;

  public static final String JSON_PROPERTY_IOS_ENABLED = "iosEnabled";
  @javax.annotation.Nullable
  private Boolean iosEnabled;

  public static final String JSON_PROPERTY_GOOGLE_PLAY_LINK = "googlePlayLink";
  @javax.annotation.Nullable
  private String googlePlayLink;

  public static final String JSON_PROPERTY_APP_STORE_LINK = "appStoreLink";
  @javax.annotation.Nullable
  private String appStoreLink;

  public QrCodeSettings() { 
  }

  @JsonCreator
  public QrCodeSettings(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_GOOGLE_PLAY_LINK) String googlePlayLink, 
    @JsonProperty(JSON_PROPERTY_APP_STORE_LINK) String appStoreLink
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.googlePlayLink = googlePlayLink;
    this.appStoreLink = appStoreLink;
  }

  public QrCodeSettings id(@javax.annotation.Nullable QrCodeSettingsId id) {
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
  public QrCodeSettingsId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable QrCodeSettingsId id) {
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




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public QrCodeSettings useSystemSettings(@javax.annotation.Nullable Boolean useSystemSettings) {
    this.useSystemSettings = useSystemSettings;
    return this;
  }

  /**
   * Use settings from system level
   * @return useSystemSettings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_SYSTEM_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseSystemSettings() {
    return useSystemSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_SYSTEM_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseSystemSettings(@javax.annotation.Nullable Boolean useSystemSettings) {
    this.useSystemSettings = useSystemSettings;
  }


  public QrCodeSettings useDefaultApp(@javax.annotation.Nullable Boolean useDefaultApp) {
    this.useDefaultApp = useDefaultApp;
    return this;
  }

  /**
   * Type of application: true means use default Thingsboard app
   * @return useDefaultApp
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_DEFAULT_APP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseDefaultApp() {
    return useDefaultApp;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_DEFAULT_APP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseDefaultApp(@javax.annotation.Nullable Boolean useDefaultApp) {
    this.useDefaultApp = useDefaultApp;
  }


  public QrCodeSettings mobileAppBundleId(@javax.annotation.Nullable MobileAppBundleId mobileAppBundleId) {
    this.mobileAppBundleId = mobileAppBundleId;
    return this;
  }

  /**
   * Mobile app bundle.
   * @return mobileAppBundleId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_APP_BUNDLE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppBundleId getMobileAppBundleId() {
    return mobileAppBundleId;
  }


  @JsonProperty(value = JSON_PROPERTY_MOBILE_APP_BUNDLE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileAppBundleId(@javax.annotation.Nullable MobileAppBundleId mobileAppBundleId) {
    this.mobileAppBundleId = mobileAppBundleId;
  }


  public QrCodeSettings qrCodeConfig(@javax.annotation.Nonnull QRCodeConfig qrCodeConfig) {
    this.qrCodeConfig = qrCodeConfig;
    return this;
  }

  /**
   * QR code config configuration.
   * @return qrCodeConfig
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_QR_CODE_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public QRCodeConfig getQrCodeConfig() {
    return qrCodeConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_QR_CODE_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQrCodeConfig(@javax.annotation.Nonnull QRCodeConfig qrCodeConfig) {
    this.qrCodeConfig = qrCodeConfig;
  }


  public QrCodeSettings androidEnabled(@javax.annotation.Nullable Boolean androidEnabled) {
    this.androidEnabled = androidEnabled;
    return this;
  }

  /**
   * Indicates if google play link is available
   * @return androidEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANDROID_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAndroidEnabled() {
    return androidEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ANDROID_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidEnabled(@javax.annotation.Nullable Boolean androidEnabled) {
    this.androidEnabled = androidEnabled;
  }


  public QrCodeSettings iosEnabled(@javax.annotation.Nullable Boolean iosEnabled) {
    this.iosEnabled = iosEnabled;
    return this;
  }

  /**
   * Indicates if apple store link is available
   * @return iosEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IOS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIosEnabled() {
    return iosEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_IOS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIosEnabled(@javax.annotation.Nullable Boolean iosEnabled) {
    this.iosEnabled = iosEnabled;
  }


  /**
   * Get googlePlayLink
   * @return googlePlayLink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GOOGLE_PLAY_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGooglePlayLink() {
    return googlePlayLink;
  }




  /**
   * Get appStoreLink
   * @return appStoreLink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_APP_STORE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppStoreLink() {
    return appStoreLink;
  }




  /**
   * Return true if this QrCodeSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QrCodeSettings qrCodeSettings = (QrCodeSettings) o;
    return Objects.equals(this.id, qrCodeSettings.id) &&
        Objects.equals(this.createdTime, qrCodeSettings.createdTime) &&
        Objects.equals(this.tenantId, qrCodeSettings.tenantId) &&
        Objects.equals(this.useSystemSettings, qrCodeSettings.useSystemSettings) &&
        Objects.equals(this.useDefaultApp, qrCodeSettings.useDefaultApp) &&
        Objects.equals(this.mobileAppBundleId, qrCodeSettings.mobileAppBundleId) &&
        Objects.equals(this.qrCodeConfig, qrCodeSettings.qrCodeConfig) &&
        Objects.equals(this.androidEnabled, qrCodeSettings.androidEnabled) &&
        Objects.equals(this.iosEnabled, qrCodeSettings.iosEnabled) &&
        Objects.equals(this.googlePlayLink, qrCodeSettings.googlePlayLink) &&
        Objects.equals(this.appStoreLink, qrCodeSettings.appStoreLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, useSystemSettings, useDefaultApp, mobileAppBundleId, qrCodeConfig, androidEnabled, iosEnabled, googlePlayLink, appStoreLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QrCodeSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    useSystemSettings: ").append(toIndentedString(useSystemSettings)).append("\n");
    sb.append("    useDefaultApp: ").append(toIndentedString(useDefaultApp)).append("\n");
    sb.append("    mobileAppBundleId: ").append(toIndentedString(mobileAppBundleId)).append("\n");
    sb.append("    qrCodeConfig: ").append(toIndentedString(qrCodeConfig)).append("\n");
    sb.append("    androidEnabled: ").append(toIndentedString(androidEnabled)).append("\n");
    sb.append("    iosEnabled: ").append(toIndentedString(iosEnabled)).append("\n");
    sb.append("    googlePlayLink: ").append(toIndentedString(googlePlayLink)).append("\n");
    sb.append("    appStoreLink: ").append(toIndentedString(appStoreLink)).append("\n");
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

    // add `useSystemSettings` to the URL query string
    if (getUseSystemSettings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseSystemSettings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseSystemSettings()))));
    }

    // add `useDefaultApp` to the URL query string
    if (getUseDefaultApp() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseDefaultApp%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseDefaultApp()))));
    }

    // add `mobileAppBundleId` to the URL query string
    if (getMobileAppBundleId() != null) {
      joiner.add(getMobileAppBundleId().toUrlQueryString(prefix + "mobileAppBundleId" + suffix));
    }

    // add `qrCodeConfig` to the URL query string
    if (getQrCodeConfig() != null) {
      joiner.add(getQrCodeConfig().toUrlQueryString(prefix + "qrCodeConfig" + suffix));
    }

    // add `androidEnabled` to the URL query string
    if (getAndroidEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sandroidEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAndroidEnabled()))));
    }

    // add `iosEnabled` to the URL query string
    if (getIosEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%siosEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIosEnabled()))));
    }

    // add `googlePlayLink` to the URL query string
    if (getGooglePlayLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgooglePlayLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGooglePlayLink()))));
    }

    // add `appStoreLink` to the URL query string
    if (getAppStoreLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappStoreLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppStoreLink()))));
    }

    return joiner.toString();
  }
}

