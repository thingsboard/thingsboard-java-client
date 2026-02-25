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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.SolutionTemplateLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantSolutionTemplateDetails
 */
@JsonPropertyOrder({
  TenantSolutionTemplateDetails.JSON_PROPERTY_ID,
  TenantSolutionTemplateDetails.JSON_PROPERTY_TITLE,
  TenantSolutionTemplateDetails.JSON_PROPERTY_LEVEL,
  TenantSolutionTemplateDetails.JSON_PROPERTY_INSTALL_TIMEOUT_MS,
  TenantSolutionTemplateDetails.JSON_PROPERTY_TENANT_TELEMETRY_KEYS,
  TenantSolutionTemplateDetails.JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS,
  TenantSolutionTemplateDetails.JSON_PROPERTY_IMAGE_URLS,
  TenantSolutionTemplateDetails.JSON_PROPERTY_HIGHLIGHTS,
  TenantSolutionTemplateDetails.JSON_PROPERTY_DESCRIPTION,
  TenantSolutionTemplateDetails.JSON_PROPERTY_INSTALLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantSolutionTemplateDetails {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_LEVEL = "level";
  @javax.annotation.Nullable
  private SolutionTemplateLevel level;

  public static final String JSON_PROPERTY_INSTALL_TIMEOUT_MS = "installTimeoutMs";
  @javax.annotation.Nullable
  private Long installTimeoutMs;

  public static final String JSON_PROPERTY_TENANT_TELEMETRY_KEYS = "tenantTelemetryKeys";
  @javax.annotation.Nullable
  private List<String> tenantTelemetryKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS = "tenantAttributeKeys";
  @javax.annotation.Nullable
  private List<String> tenantAttributeKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGE_URLS = "imageUrls";
  @javax.annotation.Nullable
  private List<String> imageUrls = new ArrayList<>();

  public static final String JSON_PROPERTY_HIGHLIGHTS = "highlights";
  @javax.annotation.Nullable
  private String highlights;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_INSTALLED = "installed";
  @javax.annotation.Nullable
  private Boolean installed;

  public TenantSolutionTemplateDetails() { 
  }

  public TenantSolutionTemplateDetails id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the solution template
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public TenantSolutionTemplateDetails title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Template Title
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


  public TenantSolutionTemplateDetails level(@javax.annotation.Nullable SolutionTemplateLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the subscription that is required to unlock the template
   * @return level
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SolutionTemplateLevel getLevel() {
    return level;
  }


  @JsonProperty(value = JSON_PROPERTY_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(@javax.annotation.Nullable SolutionTemplateLevel level) {
    this.level = level;
  }


  public TenantSolutionTemplateDetails installTimeoutMs(@javax.annotation.Nullable Long installTimeoutMs) {
    this.installTimeoutMs = installTimeoutMs;
    return this;
  }

  /**
   * Timeout for the installation UI to wait while template is installing
   * @return installTimeoutMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTALL_TIMEOUT_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInstallTimeoutMs() {
    return installTimeoutMs;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTALL_TIMEOUT_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallTimeoutMs(@javax.annotation.Nullable Long installTimeoutMs) {
    this.installTimeoutMs = installTimeoutMs;
  }


  public TenantSolutionTemplateDetails tenantTelemetryKeys(@javax.annotation.Nullable List<String> tenantTelemetryKeys) {
    this.tenantTelemetryKeys = tenantTelemetryKeys;
    return this;
  }

  public TenantSolutionTemplateDetails addTenantTelemetryKeysItem(String tenantTelemetryKeysItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_TELEMETRY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTenantTelemetryKeys() {
    return tenantTelemetryKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_TELEMETRY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantTelemetryKeys(@javax.annotation.Nullable List<String> tenantTelemetryKeys) {
    this.tenantTelemetryKeys = tenantTelemetryKeys;
  }


  public TenantSolutionTemplateDetails tenantAttributeKeys(@javax.annotation.Nullable List<String> tenantAttributeKeys) {
    this.tenantAttributeKeys = tenantAttributeKeys;
    return this;
  }

  public TenantSolutionTemplateDetails addTenantAttributeKeysItem(String tenantAttributeKeysItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTenantAttributeKeys() {
    return tenantAttributeKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ATTRIBUTE_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantAttributeKeys(@javax.annotation.Nullable List<String> tenantAttributeKeys) {
    this.tenantAttributeKeys = tenantAttributeKeys;
  }


  public TenantSolutionTemplateDetails imageUrls(@javax.annotation.Nullable List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public TenantSolutionTemplateDetails addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

  /**
   * Get imageUrls
   * @return imageUrls
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE_URLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getImageUrls() {
    return imageUrls;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE_URLS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrls(@javax.annotation.Nullable List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }


  public TenantSolutionTemplateDetails highlights(@javax.annotation.Nullable String highlights) {
    this.highlights = highlights;
    return this;
  }

  /**
   * Get highlights
   * @return highlights
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIGHLIGHTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHighlights() {
    return highlights;
  }


  @JsonProperty(value = JSON_PROPERTY_HIGHLIGHTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlights(@javax.annotation.Nullable String highlights) {
    this.highlights = highlights;
  }


  public TenantSolutionTemplateDetails description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
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


  public TenantSolutionTemplateDetails installed(@javax.annotation.Nullable Boolean installed) {
    this.installed = installed;
    return this;
  }

  /**
   * Get installed
   * @return installed
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTALLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInstalled() {
    return installed;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTALLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstalled(@javax.annotation.Nullable Boolean installed) {
    this.installed = installed;
  }


  /**
   * Return true if this TenantSolutionTemplateDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantSolutionTemplateDetails tenantSolutionTemplateDetails = (TenantSolutionTemplateDetails) o;
    return Objects.equals(this.id, tenantSolutionTemplateDetails.id) &&
        Objects.equals(this.title, tenantSolutionTemplateDetails.title) &&
        Objects.equals(this.level, tenantSolutionTemplateDetails.level) &&
        Objects.equals(this.installTimeoutMs, tenantSolutionTemplateDetails.installTimeoutMs) &&
        Objects.equals(this.tenantTelemetryKeys, tenantSolutionTemplateDetails.tenantTelemetryKeys) &&
        Objects.equals(this.tenantAttributeKeys, tenantSolutionTemplateDetails.tenantAttributeKeys) &&
        Objects.equals(this.imageUrls, tenantSolutionTemplateDetails.imageUrls) &&
        Objects.equals(this.highlights, tenantSolutionTemplateDetails.highlights) &&
        Objects.equals(this.description, tenantSolutionTemplateDetails.description) &&
        Objects.equals(this.installed, tenantSolutionTemplateDetails.installed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, level, installTimeoutMs, tenantTelemetryKeys, tenantAttributeKeys, imageUrls, highlights, description, installed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantSolutionTemplateDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    installTimeoutMs: ").append(toIndentedString(installTimeoutMs)).append("\n");
    sb.append("    tenantTelemetryKeys: ").append(toIndentedString(tenantTelemetryKeys)).append("\n");
    sb.append("    tenantAttributeKeys: ").append(toIndentedString(tenantAttributeKeys)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `imageUrls` to the URL query string
    if (getImageUrls() != null) {
      for (int i = 0; i < getImageUrls().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%simageUrls%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getImageUrls().get(i)))));
      }
    }

    // add `highlights` to the URL query string
    if (getHighlights() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shighlights%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHighlights()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `installed` to the URL query string
    if (getInstalled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstalled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstalled()))));
    }

    return joiner.toString();
  }
}

