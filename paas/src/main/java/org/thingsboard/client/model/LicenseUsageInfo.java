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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LicenseUsageInfo
 */
@JsonPropertyOrder({
  LicenseUsageInfo.JSON_PROPERTY_MAX_DEVICES,
  LicenseUsageInfo.JSON_PROPERTY_MAX_ASSETS,
  LicenseUsageInfo.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  LicenseUsageInfo.JSON_PROPERTY_DEVELOPMENT,
  LicenseUsageInfo.JSON_PROPERTY_PLAN,
  LicenseUsageInfo.JSON_PROPERTY_DEVICES_COUNT,
  LicenseUsageInfo.JSON_PROPERTY_ASSETS_COUNT,
  LicenseUsageInfo.JSON_PROPERTY_DASHBOARDS_COUNT,
  LicenseUsageInfo.JSON_PROPERTY_INTEGRATIONS_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LicenseUsageInfo {
  public static final String JSON_PROPERTY_MAX_DEVICES = "maxDevices";
  @javax.annotation.Nullable
  private Long maxDevices;

  public static final String JSON_PROPERTY_MAX_ASSETS = "maxAssets";
  @javax.annotation.Nullable
  private Long maxAssets;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @javax.annotation.Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_DEVELOPMENT = "development";
  @javax.annotation.Nullable
  private Boolean development;

  public static final String JSON_PROPERTY_PLAN = "plan";
  @javax.annotation.Nullable
  private String plan;

  public static final String JSON_PROPERTY_DEVICES_COUNT = "devicesCount";
  @javax.annotation.Nullable
  private Long devicesCount;

  public static final String JSON_PROPERTY_ASSETS_COUNT = "assetsCount";
  @javax.annotation.Nullable
  private Long assetsCount;

  public static final String JSON_PROPERTY_DASHBOARDS_COUNT = "dashboardsCount";
  @javax.annotation.Nullable
  private Long dashboardsCount;

  public static final String JSON_PROPERTY_INTEGRATIONS_COUNT = "integrationsCount";
  @javax.annotation.Nullable
  private Long integrationsCount;

  public LicenseUsageInfo() { 
  }

  public LicenseUsageInfo maxDevices(@javax.annotation.Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
    return this;
  }

  /**
   * Get maxDevices
   * @return maxDevices
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDevices() {
    return maxDevices;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDevices(@javax.annotation.Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
  }


  public LicenseUsageInfo maxAssets(@javax.annotation.Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
    return this;
  }

  /**
   * Get maxAssets
   * @return maxAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAssets() {
    return maxAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAssets(@javax.annotation.Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
  }


  public LicenseUsageInfo whiteLabelingEnabled(@javax.annotation.Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
    return this;
  }

  /**
   * Get whiteLabelingEnabled
   * @return whiteLabelingEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingEnabled() {
    return whiteLabelingEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingEnabled(@javax.annotation.Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
  }


  public LicenseUsageInfo development(@javax.annotation.Nullable Boolean development) {
    this.development = development;
    return this;
  }

  /**
   * Get development
   * @return development
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDevelopment() {
    return development;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevelopment(@javax.annotation.Nullable Boolean development) {
    this.development = development;
  }


  public LicenseUsageInfo plan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlan() {
    return plan;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(@javax.annotation.Nullable String plan) {
    this.plan = plan;
  }


  public LicenseUsageInfo devicesCount(@javax.annotation.Nullable Long devicesCount) {
    this.devicesCount = devicesCount;
    return this;
  }

  /**
   * Get devicesCount
   * @return devicesCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDevicesCount() {
    return devicesCount;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevicesCount(@javax.annotation.Nullable Long devicesCount) {
    this.devicesCount = devicesCount;
  }


  public LicenseUsageInfo assetsCount(@javax.annotation.Nullable Long assetsCount) {
    this.assetsCount = assetsCount;
    return this;
  }

  /**
   * Get assetsCount
   * @return assetsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssetsCount() {
    return assetsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetsCount(@javax.annotation.Nullable Long assetsCount) {
    this.assetsCount = assetsCount;
  }


  public LicenseUsageInfo dashboardsCount(@javax.annotation.Nullable Long dashboardsCount) {
    this.dashboardsCount = dashboardsCount;
    return this;
  }

  /**
   * Get dashboardsCount
   * @return dashboardsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARDS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDashboardsCount() {
    return dashboardsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARDS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardsCount(@javax.annotation.Nullable Long dashboardsCount) {
    this.dashboardsCount = dashboardsCount;
  }


  public LicenseUsageInfo integrationsCount(@javax.annotation.Nullable Long integrationsCount) {
    this.integrationsCount = integrationsCount;
    return this;
  }

  /**
   * Get integrationsCount
   * @return integrationsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIntegrationsCount() {
    return integrationsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationsCount(@javax.annotation.Nullable Long integrationsCount) {
    this.integrationsCount = integrationsCount;
  }


  /**
   * Return true if this LicenseUsageInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseUsageInfo licenseUsageInfo = (LicenseUsageInfo) o;
    return Objects.equals(this.maxDevices, licenseUsageInfo.maxDevices) &&
        Objects.equals(this.maxAssets, licenseUsageInfo.maxAssets) &&
        Objects.equals(this.whiteLabelingEnabled, licenseUsageInfo.whiteLabelingEnabled) &&
        Objects.equals(this.development, licenseUsageInfo.development) &&
        Objects.equals(this.plan, licenseUsageInfo.plan) &&
        Objects.equals(this.devicesCount, licenseUsageInfo.devicesCount) &&
        Objects.equals(this.assetsCount, licenseUsageInfo.assetsCount) &&
        Objects.equals(this.dashboardsCount, licenseUsageInfo.dashboardsCount) &&
        Objects.equals(this.integrationsCount, licenseUsageInfo.integrationsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDevices, maxAssets, whiteLabelingEnabled, development, plan, devicesCount, assetsCount, dashboardsCount, integrationsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseUsageInfo {\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    maxAssets: ").append(toIndentedString(maxAssets)).append("\n");
    sb.append("    whiteLabelingEnabled: ").append(toIndentedString(whiteLabelingEnabled)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    devicesCount: ").append(toIndentedString(devicesCount)).append("\n");
    sb.append("    assetsCount: ").append(toIndentedString(assetsCount)).append("\n");
    sb.append("    dashboardsCount: ").append(toIndentedString(dashboardsCount)).append("\n");
    sb.append("    integrationsCount: ").append(toIndentedString(integrationsCount)).append("\n");
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

    // add `maxDevices` to the URL query string
    if (getMaxDevices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDevices%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDevices()))));
    }

    // add `maxAssets` to the URL query string
    if (getMaxAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAssets()))));
    }

    // add `whiteLabelingEnabled` to the URL query string
    if (getWhiteLabelingEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingEnabled()))));
    }

    // add `development` to the URL query string
    if (getDevelopment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevelopment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevelopment()))));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splan%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlan()))));
    }

    // add `devicesCount` to the URL query string
    if (getDevicesCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevicesCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevicesCount()))));
    }

    // add `assetsCount` to the URL query string
    if (getAssetsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassetsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssetsCount()))));
    }

    // add `dashboardsCount` to the URL query string
    if (getDashboardsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboardsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboardsCount()))));
    }

    // add `integrationsCount` to the URL query string
    if (getIntegrationsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrationsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrationsCount()))));
    }

    return joiner.toString();
  }
}

