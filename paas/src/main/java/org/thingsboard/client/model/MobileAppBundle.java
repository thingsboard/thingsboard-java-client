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
import org.thingsboard.client.model.MobileAppId;
import org.thingsboard.client.model.MobileLayoutConfig;
import org.thingsboard.client.model.MobileSelfRegistrationParams;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Mobile Application Bundle.
 */
@JsonPropertyOrder({
  MobileAppBundle.JSON_PROPERTY_ID,
  MobileAppBundle.JSON_PROPERTY_CREATED_TIME,
  MobileAppBundle.JSON_PROPERTY_TENANT_ID,
  MobileAppBundle.JSON_PROPERTY_TITLE,
  MobileAppBundle.JSON_PROPERTY_DESCRIPTION,
  MobileAppBundle.JSON_PROPERTY_ANDROID_APP_ID,
  MobileAppBundle.JSON_PROPERTY_IOS_APP_ID,
  MobileAppBundle.JSON_PROPERTY_LAYOUT_CONFIG,
  MobileAppBundle.JSON_PROPERTY_SELF_REGISTRATION_PARAMS,
  MobileAppBundle.JSON_PROPERTY_OAUTH2_ENABLED,
  MobileAppBundle.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MobileAppBundle {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private MobileAppBundleId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_ANDROID_APP_ID = "androidAppId";
  @javax.annotation.Nullable
  private MobileAppId androidAppId;

  public static final String JSON_PROPERTY_IOS_APP_ID = "iosAppId";
  @javax.annotation.Nullable
  private MobileAppId iosAppId;

  public static final String JSON_PROPERTY_LAYOUT_CONFIG = "layoutConfig";
  @javax.annotation.Nullable
  private MobileLayoutConfig layoutConfig;

  public static final String JSON_PROPERTY_SELF_REGISTRATION_PARAMS = "selfRegistrationParams";
  @javax.annotation.Nullable
  private MobileSelfRegistrationParams selfRegistrationParams;

  public static final String JSON_PROPERTY_OAUTH2_ENABLED = "oauth2Enabled";
  @javax.annotation.Nullable
  private Boolean oauth2Enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public MobileAppBundle() { 
  }

  @JsonCreator
  public MobileAppBundle(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public MobileAppBundle id(@javax.annotation.Nullable MobileAppBundleId id) {
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
  public MobileAppBundleId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable MobileAppBundleId id) {
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




  public MobileAppBundle tenantId(@javax.annotation.Nullable TenantId tenantId) {
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


  public MobileAppBundle title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Application bundle title. Cannot be empty
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public MobileAppBundle description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Application bundle description.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public MobileAppBundle androidAppId(@javax.annotation.Nullable MobileAppId androidAppId) {
    this.androidAppId = androidAppId;
    return this;
  }

  /**
   * Android application id
   * @return androidAppId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ANDROID_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppId getAndroidAppId() {
    return androidAppId;
  }


  @JsonProperty(value = JSON_PROPERTY_ANDROID_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidAppId(@javax.annotation.Nullable MobileAppId androidAppId) {
    this.androidAppId = androidAppId;
  }


  public MobileAppBundle iosAppId(@javax.annotation.Nullable MobileAppId iosAppId) {
    this.iosAppId = iosAppId;
    return this;
  }

  /**
   * IOS application id
   * @return iosAppId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IOS_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileAppId getIosAppId() {
    return iosAppId;
  }


  @JsonProperty(value = JSON_PROPERTY_IOS_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIosAppId(@javax.annotation.Nullable MobileAppId iosAppId) {
    this.iosAppId = iosAppId;
  }


  public MobileAppBundle layoutConfig(@javax.annotation.Nullable MobileLayoutConfig layoutConfig) {
    this.layoutConfig = layoutConfig;
    return this;
  }

  /**
   * Application layout configuration
   * @return layoutConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAYOUT_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileLayoutConfig getLayoutConfig() {
    return layoutConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_LAYOUT_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLayoutConfig(@javax.annotation.Nullable MobileLayoutConfig layoutConfig) {
    this.layoutConfig = layoutConfig;
  }


  public MobileAppBundle selfRegistrationParams(@javax.annotation.Nullable MobileSelfRegistrationParams selfRegistrationParams) {
    this.selfRegistrationParams = selfRegistrationParams;
    return this;
  }

  /**
   * Application self registration configuration
   * @return selfRegistrationParams
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SELF_REGISTRATION_PARAMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobileSelfRegistrationParams getSelfRegistrationParams() {
    return selfRegistrationParams;
  }


  @JsonProperty(value = JSON_PROPERTY_SELF_REGISTRATION_PARAMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelfRegistrationParams(@javax.annotation.Nullable MobileSelfRegistrationParams selfRegistrationParams) {
    this.selfRegistrationParams = selfRegistrationParams;
  }


  public MobileAppBundle oauth2Enabled(@javax.annotation.Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
    return this;
  }

  /**
   * Whether OAuth2 settings are enabled or not
   * @return oauth2Enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOauth2Enabled() {
    return oauth2Enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth2Enabled(@javax.annotation.Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
  }


  /**
   * Mobile app bundle title
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this MobileAppBundle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppBundle mobileAppBundle = (MobileAppBundle) o;
    return Objects.equals(this.id, mobileAppBundle.id) &&
        Objects.equals(this.createdTime, mobileAppBundle.createdTime) &&
        Objects.equals(this.tenantId, mobileAppBundle.tenantId) &&
        Objects.equals(this.title, mobileAppBundle.title) &&
        Objects.equals(this.description, mobileAppBundle.description) &&
        Objects.equals(this.androidAppId, mobileAppBundle.androidAppId) &&
        Objects.equals(this.iosAppId, mobileAppBundle.iosAppId) &&
        Objects.equals(this.layoutConfig, mobileAppBundle.layoutConfig) &&
        Objects.equals(this.selfRegistrationParams, mobileAppBundle.selfRegistrationParams) &&
        Objects.equals(this.oauth2Enabled, mobileAppBundle.oauth2Enabled) &&
        Objects.equals(this.name, mobileAppBundle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, title, description, androidAppId, iosAppId, layoutConfig, selfRegistrationParams, oauth2Enabled, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppBundle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    androidAppId: ").append(toIndentedString(androidAppId)).append("\n");
    sb.append("    iosAppId: ").append(toIndentedString(iosAppId)).append("\n");
    sb.append("    layoutConfig: ").append(toIndentedString(layoutConfig)).append("\n");
    sb.append("    selfRegistrationParams: ").append(toIndentedString(selfRegistrationParams)).append("\n");
    sb.append("    oauth2Enabled: ").append(toIndentedString(oauth2Enabled)).append("\n");
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

    // add `selfRegistrationParams` to the URL query string
    if (getSelfRegistrationParams() != null) {
      joiner.add(getSelfRegistrationParams().toUrlQueryString(prefix + "selfRegistrationParams" + suffix));
    }

    // add `oauth2Enabled` to the URL query string
    if (getOauth2Enabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soauth2Enabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOauth2Enabled()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

