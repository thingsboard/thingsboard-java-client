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
import org.thingsboard.client.model.ReportId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationRequestConfig
 */
@JsonPropertyOrder({
  NotificationRequestConfig.JSON_PROPERTY_SENDING_DELAY_IN_SEC,
  NotificationRequestConfig.JSON_PROPERTY_REPORTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class NotificationRequestConfig {
  public static final String JSON_PROPERTY_SENDING_DELAY_IN_SEC = "sendingDelayInSec";
  @javax.annotation.Nullable
  private Integer sendingDelayInSec;

  public static final String JSON_PROPERTY_REPORTS = "reports";
  @javax.annotation.Nullable
  private List<ReportId> reports = new ArrayList<>();

  public NotificationRequestConfig() { 
  }

  public NotificationRequestConfig sendingDelayInSec(@javax.annotation.Nullable Integer sendingDelayInSec) {
    this.sendingDelayInSec = sendingDelayInSec;
    return this;
  }

  /**
   * Get sendingDelayInSec
   * maximum: 604800
   * @return sendingDelayInSec
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SENDING_DELAY_IN_SEC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSendingDelayInSec() {
    return sendingDelayInSec;
  }


  @JsonProperty(value = JSON_PROPERTY_SENDING_DELAY_IN_SEC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendingDelayInSec(@javax.annotation.Nullable Integer sendingDelayInSec) {
    this.sendingDelayInSec = sendingDelayInSec;
  }


  public NotificationRequestConfig reports(@javax.annotation.Nullable List<ReportId> reports) {
    this.reports = reports;
    return this;
  }

  public NotificationRequestConfig addReportsItem(ReportId reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

  /**
   * Get reports
   * @return reports
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ReportId> getReports() {
    return reports;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReports(@javax.annotation.Nullable List<ReportId> reports) {
    this.reports = reports;
  }


  /**
   * Return true if this NotificationRequestConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequestConfig notificationRequestConfig = (NotificationRequestConfig) o;
    return Objects.equals(this.sendingDelayInSec, notificationRequestConfig.sendingDelayInSec) &&
        Objects.equals(this.reports, notificationRequestConfig.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendingDelayInSec, reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequestConfig {\n");
    sb.append("    sendingDelayInSec: ").append(toIndentedString(sendingDelayInSec)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

    // add `sendingDelayInSec` to the URL query string
    if (getSendingDelayInSec() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssendingDelayInSec%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSendingDelayInSec()))));
    }

    // add `reports` to the URL query string
    if (getReports() != null) {
      for (int i = 0; i < getReports().size(); i++) {
        if (getReports().get(i) != null) {
          joiner.add(getReports().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sreports%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

