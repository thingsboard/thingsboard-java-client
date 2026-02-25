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
import java.util.UUID;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.NotificationTemplateId;
import org.thingsboard.client.model.ReportTemplateConfig;
import org.thingsboard.client.model.ReportTemplateId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ReportRequest
 */
@JsonPropertyOrder({
  ReportRequest.JSON_PROPERTY_REPORT_TEMPLATE_ID,
  ReportRequest.JSON_PROPERTY_REPORT_TEMPLATE_CONFIG,
  ReportRequest.JSON_PROPERTY_TIMEZONE,
  ReportRequest.JSON_PROPERTY_USER_ID,
  ReportRequest.JSON_PROPERTY_ORIGINATOR,
  ReportRequest.JSON_PROPERTY_TARGETS,
  ReportRequest.JSON_PROPERTY_NOTIFICATION_TEMPLATE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ReportRequest {
  public static final String JSON_PROPERTY_REPORT_TEMPLATE_ID = "reportTemplateId";
  @javax.annotation.Nullable
  private ReportTemplateId reportTemplateId;

  public static final String JSON_PROPERTY_REPORT_TEMPLATE_CONFIG = "reportTemplateConfig";
  @javax.annotation.Nullable
  private ReportTemplateConfig reportTemplateConfig;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  @javax.annotation.Nullable
  private String timezone;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private String userId;

  public static final String JSON_PROPERTY_ORIGINATOR = "originator";
  @javax.annotation.Nullable
  private EntityId originator;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  @javax.annotation.Nullable
  private List<UUID> targets = new ArrayList<>();

  public static final String JSON_PROPERTY_NOTIFICATION_TEMPLATE_ID = "notificationTemplateId";
  @javax.annotation.Nullable
  private NotificationTemplateId notificationTemplateId;

  public ReportRequest() { 
  }

  public ReportRequest reportTemplateId(@javax.annotation.Nullable ReportTemplateId reportTemplateId) {
    this.reportTemplateId = reportTemplateId;
    return this;
  }

  /**
   * Json object representing the report template id.
   * @return reportTemplateId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORT_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportTemplateId getReportTemplateId() {
    return reportTemplateId;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORT_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportTemplateId(@javax.annotation.Nullable ReportTemplateId reportTemplateId) {
    this.reportTemplateId = reportTemplateId;
  }


  public ReportRequest reportTemplateConfig(@javax.annotation.Nullable ReportTemplateConfig reportTemplateConfig) {
    this.reportTemplateConfig = reportTemplateConfig;
    return this;
  }

  /**
   * Json object representing the report template config.
   * @return reportTemplateConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORT_TEMPLATE_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportTemplateConfig getReportTemplateConfig() {
    return reportTemplateConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORT_TEMPLATE_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportTemplateConfig(@javax.annotation.Nullable ReportTemplateConfig reportTemplateConfig) {
    this.reportTemplateConfig = reportTemplateConfig;
  }


  public ReportRequest timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone used for report generation.
   * @return timezone
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMEZONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public ReportRequest userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * A string value representing the user id.
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public ReportRequest originator(@javax.annotation.Nullable EntityId originator) {
    this.originator = originator;
    return this;
  }

  /**
   * Json object representing the originator id.
   * @return originator
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOriginator() {
    return originator;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginator(@javax.annotation.Nullable EntityId originator) {
    this.originator = originator;
  }


  public ReportRequest targets(@javax.annotation.Nullable List<UUID> targets) {
    this.targets = targets;
    return this;
  }

  public ReportRequest addTargetsItem(UUID targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TARGETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UUID> getTargets() {
    return targets;
  }


  @JsonProperty(value = JSON_PROPERTY_TARGETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargets(@javax.annotation.Nullable List<UUID> targets) {
    this.targets = targets;
  }


  public ReportRequest notificationTemplateId(@javax.annotation.Nullable NotificationTemplateId notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
    return this;
  }

  /**
   * Get notificationTemplateId
   * @return notificationTemplateId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NOTIFICATION_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationTemplateId getNotificationTemplateId() {
    return notificationTemplateId;
  }


  @JsonProperty(value = JSON_PROPERTY_NOTIFICATION_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationTemplateId(@javax.annotation.Nullable NotificationTemplateId notificationTemplateId) {
    this.notificationTemplateId = notificationTemplateId;
  }


  /**
   * Return true if this ReportRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRequest reportRequest = (ReportRequest) o;
    return Objects.equals(this.reportTemplateId, reportRequest.reportTemplateId) &&
        Objects.equals(this.reportTemplateConfig, reportRequest.reportTemplateConfig) &&
        Objects.equals(this.timezone, reportRequest.timezone) &&
        Objects.equals(this.userId, reportRequest.userId) &&
        Objects.equals(this.originator, reportRequest.originator) &&
        Objects.equals(this.targets, reportRequest.targets) &&
        Objects.equals(this.notificationTemplateId, reportRequest.notificationTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportTemplateId, reportTemplateConfig, timezone, userId, originator, targets, notificationTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRequest {\n");
    sb.append("    reportTemplateId: ").append(toIndentedString(reportTemplateId)).append("\n");
    sb.append("    reportTemplateConfig: ").append(toIndentedString(reportTemplateConfig)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    notificationTemplateId: ").append(toIndentedString(notificationTemplateId)).append("\n");
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

    // add `reportTemplateId` to the URL query string
    if (getReportTemplateId() != null) {
      joiner.add(getReportTemplateId().toUrlQueryString(prefix + "reportTemplateId" + suffix));
    }

    // add `reportTemplateConfig` to the URL query string
    if (getReportTemplateConfig() != null) {
      joiner.add(getReportTemplateConfig().toUrlQueryString(prefix + "reportTemplateConfig" + suffix));
    }

    // add `timezone` to the URL query string
    if (getTimezone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimezone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimezone()))));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserId()))));
    }

    // add `originator` to the URL query string
    if (getOriginator() != null) {
      joiner.add(getOriginator().toUrlQueryString(prefix + "originator" + suffix));
    }

    // add `targets` to the URL query string
    if (getTargets() != null) {
      for (int i = 0; i < getTargets().size(); i++) {
        if (getTargets().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%stargets%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getTargets().get(i)))));
        }
      }
    }

    // add `notificationTemplateId` to the URL query string
    if (getNotificationTemplateId() != null) {
      joiner.add(getNotificationTemplateId().toUrlQueryString(prefix + "notificationTemplateId" + suffix));
    }

    return joiner.toString();
  }
}

