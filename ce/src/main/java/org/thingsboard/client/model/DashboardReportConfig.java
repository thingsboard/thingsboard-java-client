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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DashboardReportConfig
 */
@JsonPropertyOrder({
  DashboardReportConfig.JSON_PROPERTY_BASE_URL,
  DashboardReportConfig.JSON_PROPERTY_DASHBOARD_ID,
  DashboardReportConfig.JSON_PROPERTY_STATE,
  DashboardReportConfig.JSON_PROPERTY_TIMEZONE,
  DashboardReportConfig.JSON_PROPERTY_USE_DASHBOARD_TIMEWINDOW,
  DashboardReportConfig.JSON_PROPERTY_TIMEWINDOW,
  DashboardReportConfig.JSON_PROPERTY_NAME_PATTERN,
  DashboardReportConfig.JSON_PROPERTY_TYPE,
  DashboardReportConfig.JSON_PROPERTY_USE_CURRENT_USER_CREDENTIALS,
  DashboardReportConfig.JSON_PROPERTY_USER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DashboardReportConfig {
  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @Nonnull
  private String baseUrl;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  @Nonnull
  private String dashboardId;

  public static final String JSON_PROPERTY_STATE = "state";
  @Nullable
  private String state;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  @Nonnull
  private String timezone;

  public static final String JSON_PROPERTY_USE_DASHBOARD_TIMEWINDOW = "useDashboardTimewindow";
  @Nullable
  private Boolean useDashboardTimewindow;

  public static final String JSON_PROPERTY_TIMEWINDOW = "timewindow";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode timewindow;

  public static final String JSON_PROPERTY_NAME_PATTERN = "namePattern";
  @Nonnull
  private String namePattern;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private String type;

  public static final String JSON_PROPERTY_USE_CURRENT_USER_CREDENTIALS = "useCurrentUserCredentials";
  @Nullable
  private Boolean useCurrentUserCredentials;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @Nonnull
  private String userId;

  public DashboardReportConfig() { 
  }

  public DashboardReportConfig baseUrl(@Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Base URL of ThingsBoard UI that should be accessible by Web Report Server.
   * @return baseUrl
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseUrl(@Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public DashboardReportConfig dashboardId(@Nonnull String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * A string value representing the dashboard id.
   * @return dashboardId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDashboardId(@Nonnull String dashboardId) {
    this.dashboardId = dashboardId;
  }


  public DashboardReportConfig state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Target dashboard state for dashboard report generation.
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


  public DashboardReportConfig timezone(@Nonnull String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone in which target dashboard will be presented in dashboard report.
   * @return timezone
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimezone(@Nonnull String timezone) {
    this.timezone = timezone;
  }


  public DashboardReportConfig useDashboardTimewindow(@Nullable Boolean useDashboardTimewindow) {
    this.useDashboardTimewindow = useDashboardTimewindow;
    return this;
  }

  /**
   * If set, timewindow configured in the target dashboard will be used during dashboard report generation.
   * @return useDashboardTimewindow
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_DASHBOARD_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseDashboardTimewindow() {
    return useDashboardTimewindow;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_DASHBOARD_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseDashboardTimewindow(@Nullable Boolean useDashboardTimewindow) {
    this.useDashboardTimewindow = useDashboardTimewindow;
  }


  public DashboardReportConfig timewindow(@Nullable com.fasterxml.jackson.databind.JsonNode timewindow) {
    this.timewindow = timewindow;
    return this;
  }

  /**
   * Specific dashboard timewindow that will be used during dashboard report generation.
   * @return timewindow
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getTimewindow() {
    return timewindow;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEWINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimewindow(@Nullable com.fasterxml.jackson.databind.JsonNode timewindow) {
    this.timewindow = timewindow;
  }


  public DashboardReportConfig namePattern(@Nonnull String namePattern) {
    this.namePattern = namePattern;
    return this;
  }

  /**
   * If set, timewindow configured in the target dashboard will be used during dashboard report generation.
   * @return namePattern
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME_PATTERN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNamePattern() {
    return namePattern;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME_PATTERN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNamePattern(@Nonnull String namePattern) {
    this.namePattern = namePattern;
  }


  public DashboardReportConfig type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Dashboard report file type, can be PDF | PNG | JPEG.
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable String type) {
    this.type = type;
  }


  public DashboardReportConfig useCurrentUserCredentials(@Nullable Boolean useCurrentUserCredentials) {
    this.useCurrentUserCredentials = useCurrentUserCredentials;
    return this;
  }

  /**
   * If set, credentials of user created this dashboard report configuration will be used to open dashboard UI during dashboard report generation.
   * @return useCurrentUserCredentials
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_CURRENT_USER_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseCurrentUserCredentials() {
    return useCurrentUserCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_CURRENT_USER_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseCurrentUserCredentials(@Nullable Boolean useCurrentUserCredentials) {
    this.useCurrentUserCredentials = useCurrentUserCredentials;
  }


  public DashboardReportConfig userId(@Nonnull String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * A string value representing the user id.
   * @return userId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@Nonnull String userId) {
    this.userId = userId;
  }


  /**
   * Return true if this DashboardReportConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportConfig dashboardReportConfig = (DashboardReportConfig) o;
    return Objects.equals(this.baseUrl, dashboardReportConfig.baseUrl) &&
        Objects.equals(this.dashboardId, dashboardReportConfig.dashboardId) &&
        Objects.equals(this.state, dashboardReportConfig.state) &&
        Objects.equals(this.timezone, dashboardReportConfig.timezone) &&
        Objects.equals(this.useDashboardTimewindow, dashboardReportConfig.useDashboardTimewindow) &&
        Objects.equals(this.timewindow, dashboardReportConfig.timewindow) &&
        Objects.equals(this.namePattern, dashboardReportConfig.namePattern) &&
        Objects.equals(this.type, dashboardReportConfig.type) &&
        Objects.equals(this.useCurrentUserCredentials, dashboardReportConfig.useCurrentUserCredentials) &&
        Objects.equals(this.userId, dashboardReportConfig.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, dashboardId, state, timezone, useDashboardTimewindow, timewindow, namePattern, type, useCurrentUserCredentials, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportConfig {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    useDashboardTimewindow: ").append(toIndentedString(useDashboardTimewindow)).append("\n");
    sb.append("    timewindow: ").append(toIndentedString(timewindow)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCurrentUserCredentials: ").append(toIndentedString(useCurrentUserCredentials)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbaseUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseUrl()))));
    }

    // add `dashboardId` to the URL query string
    if (getDashboardId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboardId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboardId()))));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getState()))));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimezone()))));
    }

    // add `useDashboardTimewindow` to the URL query string
    if (getUseDashboardTimewindow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseDashboardTimewindow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseDashboardTimewindow()))));
    }

    // add `timewindow` to the URL query string
    if (getTimewindow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimewindow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimewindow()))));
    }

    // add `namePattern` to the URL query string
    if (getNamePattern() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snamePattern%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNamePattern()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `useCurrentUserCredentials` to the URL query string
    if (getUseCurrentUserCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseCurrentUserCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseCurrentUserCredentials()))));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserId()))));
    }

    return joiner.toString();
  }
}

