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
import org.thingsboard.client.model.SolutionTemplateLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantSolutionTemplateInfo
 */
@JsonPropertyOrder({
  TenantSolutionTemplateInfo.JSON_PROPERTY_ID,
  TenantSolutionTemplateInfo.JSON_PROPERTY_TITLE,
  TenantSolutionTemplateInfo.JSON_PROPERTY_LEVEL,
  TenantSolutionTemplateInfo.JSON_PROPERTY_INSTALL_TIMEOUT_MS,
  TenantSolutionTemplateInfo.JSON_PROPERTY_TENANT_TELEMETRY_KEYS,
  TenantSolutionTemplateInfo.JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS,
  TenantSolutionTemplateInfo.JSON_PROPERTY_PREVIEW_IMAGE_URL,
  TenantSolutionTemplateInfo.JSON_PROPERTY_VIDEO_PREVIEW_IMAGE_URL,
  TenantSolutionTemplateInfo.JSON_PROPERTY_PREVIEW_MP4_URL,
  TenantSolutionTemplateInfo.JSON_PROPERTY_PREVIEW_WEBM_URL,
  TenantSolutionTemplateInfo.JSON_PROPERTY_INSTALLED
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantSolutionTemplateInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nullable
  private String title;

  public static final String JSON_PROPERTY_LEVEL = "level";
  @Nullable
  private SolutionTemplateLevel level;

  public static final String JSON_PROPERTY_INSTALL_TIMEOUT_MS = "installTimeoutMs";
  @Nullable
  private Long installTimeoutMs;

  public static final String JSON_PROPERTY_TENANT_TELEMETRY_KEYS = "tenantTelemetryKeys";
  @Nullable
  private List<String> tenantTelemetryKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS = "tenantAttributeKeys";
  @Nullable
  private List<String> tenantAttributeKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_PREVIEW_IMAGE_URL = "previewImageUrl";
  @Nullable
  private String previewImageUrl;

  public static final String JSON_PROPERTY_VIDEO_PREVIEW_IMAGE_URL = "videoPreviewImageUrl";
  @Nullable
  private String videoPreviewImageUrl;

  public static final String JSON_PROPERTY_PREVIEW_MP4_URL = "previewMp4Url";
  @Nullable
  private String previewMp4Url;

  public static final String JSON_PROPERTY_PREVIEW_WEBM_URL = "previewWebmUrl";
  @Nullable
  private String previewWebmUrl;

  public static final String JSON_PROPERTY_INSTALLED = "installed";
  @Nullable
  private Boolean installed;

  public TenantSolutionTemplateInfo() { 
  }

  public TenantSolutionTemplateInfo id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the solution template
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable String id) {
    this.id = id;
  }


  public TenantSolutionTemplateInfo title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Template Title
   * @return title
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@Nullable String title) {
    this.title = title;
  }


  public TenantSolutionTemplateInfo level(@Nullable SolutionTemplateLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the subscription that is required to unlock the template
   * @return level
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SolutionTemplateLevel getLevel() {
    return level;
  }


  @JsonProperty(value = JSON_PROPERTY_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(@Nullable SolutionTemplateLevel level) {
    this.level = level;
  }


  public TenantSolutionTemplateInfo installTimeoutMs(@Nullable Long installTimeoutMs) {
    this.installTimeoutMs = installTimeoutMs;
    return this;
  }

  /**
   * Timeout for the installation UI to wait while template is installing
   * @return installTimeoutMs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTALL_TIMEOUT_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInstallTimeoutMs() {
    return installTimeoutMs;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTALL_TIMEOUT_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallTimeoutMs(@Nullable Long installTimeoutMs) {
    this.installTimeoutMs = installTimeoutMs;
  }


  public TenantSolutionTemplateInfo tenantTelemetryKeys(@Nullable List<String> tenantTelemetryKeys) {
    this.tenantTelemetryKeys = tenantTelemetryKeys;
    return this;
  }

  public TenantSolutionTemplateInfo addTenantTelemetryKeysItem(String tenantTelemetryKeysItem) {
    if (this.tenantTelemetryKeys == null) {
      this.tenantTelemetryKeys = new ArrayList<>();
    }
    this.tenantTelemetryKeys.add(tenantTelemetryKeysItem);
    return this;
  }

  /**
   * What keys to delete during template uninstall
   * @return tenantTelemetryKeys
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_TELEMETRY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTenantTelemetryKeys() {
    return tenantTelemetryKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_TELEMETRY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantTelemetryKeys(@Nullable List<String> tenantTelemetryKeys) {
    this.tenantTelemetryKeys = tenantTelemetryKeys;
  }


  public TenantSolutionTemplateInfo tenantAttributeKeys(@Nullable List<String> tenantAttributeKeys) {
    this.tenantAttributeKeys = tenantAttributeKeys;
    return this;
  }

  public TenantSolutionTemplateInfo addTenantAttributeKeysItem(String tenantAttributeKeysItem) {
    if (this.tenantAttributeKeys == null) {
      this.tenantAttributeKeys = new ArrayList<>();
    }
    this.tenantAttributeKeys.add(tenantAttributeKeysItem);
    return this;
  }

  /**
   * What attributes to delete during template uninstall
   * @return tenantAttributeKeys
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTenantAttributeKeys() {
    return tenantAttributeKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantAttributeKeys(@Nullable List<String> tenantAttributeKeys) {
    this.tenantAttributeKeys = tenantAttributeKeys;
  }


  public TenantSolutionTemplateInfo previewImageUrl(@Nullable String previewImageUrl) {
    this.previewImageUrl = previewImageUrl;
    return this;
  }

  /**
   * URL of the preview image
   * @return previewImageUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIEW_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPreviewImageUrl() {
    return previewImageUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIEW_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewImageUrl(@Nullable String previewImageUrl) {
    this.previewImageUrl = previewImageUrl;
  }


  public TenantSolutionTemplateInfo videoPreviewImageUrl(@Nullable String videoPreviewImageUrl) {
    this.videoPreviewImageUrl = videoPreviewImageUrl;
    return this;
  }

  /**
   * Video preview image URL
   * @return videoPreviewImageUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VIDEO_PREVIEW_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVideoPreviewImageUrl() {
    return videoPreviewImageUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_VIDEO_PREVIEW_IMAGE_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoPreviewImageUrl(@Nullable String videoPreviewImageUrl) {
    this.videoPreviewImageUrl = videoPreviewImageUrl;
  }


  public TenantSolutionTemplateInfo previewMp4Url(@Nullable String previewMp4Url) {
    this.previewMp4Url = previewMp4Url;
    return this;
  }

  /**
   * Video MP4 URL
   * @return previewMp4Url
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIEW_MP4_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPreviewMp4Url() {
    return previewMp4Url;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIEW_MP4_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewMp4Url(@Nullable String previewMp4Url) {
    this.previewMp4Url = previewMp4Url;
  }


  public TenantSolutionTemplateInfo previewWebmUrl(@Nullable String previewWebmUrl) {
    this.previewWebmUrl = previewWebmUrl;
    return this;
  }

  /**
   * Video WEBM URL
   * @return previewWebmUrl
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIEW_WEBM_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPreviewWebmUrl() {
    return previewWebmUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIEW_WEBM_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewWebmUrl(@Nullable String previewWebmUrl) {
    this.previewWebmUrl = previewWebmUrl;
  }


  public TenantSolutionTemplateInfo installed(@Nullable Boolean installed) {
    this.installed = installed;
    return this;
  }

  /**
   * Indicates that template is already installed for the current tenant
   * @return installed
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTALLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInstalled() {
    return installed;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTALLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstalled(@Nullable Boolean installed) {
    this.installed = installed;
  }


  /**
   * Return true if this TenantSolutionTemplateInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantSolutionTemplateInfo tenantSolutionTemplateInfo = (TenantSolutionTemplateInfo) o;
    return Objects.equals(this.id, tenantSolutionTemplateInfo.id) &&
        Objects.equals(this.title, tenantSolutionTemplateInfo.title) &&
        Objects.equals(this.level, tenantSolutionTemplateInfo.level) &&
        Objects.equals(this.installTimeoutMs, tenantSolutionTemplateInfo.installTimeoutMs) &&
        Objects.equals(this.tenantTelemetryKeys, tenantSolutionTemplateInfo.tenantTelemetryKeys) &&
        Objects.equals(this.tenantAttributeKeys, tenantSolutionTemplateInfo.tenantAttributeKeys) &&
        Objects.equals(this.previewImageUrl, tenantSolutionTemplateInfo.previewImageUrl) &&
        Objects.equals(this.videoPreviewImageUrl, tenantSolutionTemplateInfo.videoPreviewImageUrl) &&
        Objects.equals(this.previewMp4Url, tenantSolutionTemplateInfo.previewMp4Url) &&
        Objects.equals(this.previewWebmUrl, tenantSolutionTemplateInfo.previewWebmUrl) &&
        Objects.equals(this.installed, tenantSolutionTemplateInfo.installed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, level, installTimeoutMs, tenantTelemetryKeys, tenantAttributeKeys, previewImageUrl, videoPreviewImageUrl, previewMp4Url, previewWebmUrl, installed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantSolutionTemplateInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    installTimeoutMs: ").append(toIndentedString(installTimeoutMs)).append("\n");
    sb.append("    tenantTelemetryKeys: ").append(toIndentedString(tenantTelemetryKeys)).append("\n");
    sb.append("    tenantAttributeKeys: ").append(toIndentedString(tenantAttributeKeys)).append("\n");
    sb.append("    previewImageUrl: ").append(toIndentedString(previewImageUrl)).append("\n");
    sb.append("    videoPreviewImageUrl: ").append(toIndentedString(videoPreviewImageUrl)).append("\n");
    sb.append("    previewMp4Url: ").append(toIndentedString(previewMp4Url)).append("\n");
    sb.append("    previewWebmUrl: ").append(toIndentedString(previewWebmUrl)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
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
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `level` to the URL query string
    if (getLevel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slevel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLevel()))));
    }

    // add `installTimeoutMs` to the URL query string
    if (getInstallTimeoutMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstallTimeoutMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstallTimeoutMs()))));
    }

    // add `tenantTelemetryKeys` to the URL query string
    if (getTenantTelemetryKeys() != null) {
      for (int i = 0; i < getTenantTelemetryKeys().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stenantTelemetryKeys%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTenantTelemetryKeys().get(i)))));
      }
    }

    // add `tenantAttributeKeys` to the URL query string
    if (getTenantAttributeKeys() != null) {
      for (int i = 0; i < getTenantAttributeKeys().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stenantAttributeKeys%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTenantAttributeKeys().get(i)))));
      }
    }

    // add `previewImageUrl` to the URL query string
    if (getPreviewImageUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreviewImageUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreviewImageUrl()))));
    }

    // add `videoPreviewImageUrl` to the URL query string
    if (getVideoPreviewImageUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svideoPreviewImageUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVideoPreviewImageUrl()))));
    }

    // add `previewMp4Url` to the URL query string
    if (getPreviewMp4Url() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreviewMp4Url%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreviewMp4Url()))));
    }

    // add `previewWebmUrl` to the URL query string
    if (getPreviewWebmUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spreviewWebmUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPreviewWebmUrl()))));
    }

    // add `installed` to the URL query string
    if (getInstalled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstalled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstalled()))));
    }

    return joiner.toString();
  }
}

