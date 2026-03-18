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
import java.util.Arrays;
import org.thingsboard.client.model.AlarmCondition;
import org.thingsboard.client.model.AlarmSchedule;
import org.thingsboard.client.model.DashboardId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmRule
 */
@JsonPropertyOrder({
  AlarmRule.JSON_PROPERTY_CONDITION,
  AlarmRule.JSON_PROPERTY_ALARM_DETAILS,
  AlarmRule.JSON_PROPERTY_DASHBOARD_ID,
  AlarmRule.JSON_PROPERTY_SCHEDULE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmRule {
  public static final String JSON_PROPERTY_CONDITION = "condition";
  @Nullable
  private AlarmCondition condition;

  public static final String JSON_PROPERTY_ALARM_DETAILS = "alarmDetails";
  @Nullable
  private String alarmDetails;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  @Nullable
  private DashboardId dashboardId;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  @Nullable
  private AlarmSchedule schedule;

  public AlarmRule() { 
  }

  public AlarmRule condition(@Nullable AlarmCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * JSON object representing the alarm rule condition
   * @return condition
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmCondition getCondition() {
    return condition;
  }


  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(@Nullable AlarmCondition condition) {
    this.condition = condition;
  }


  public AlarmRule alarmDetails(@Nullable String alarmDetails) {
    this.alarmDetails = alarmDetails;
    return this;
  }

  /**
   * String value representing the additional details for an alarm rule
   * @return alarmDetails
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlarmDetails() {
    return alarmDetails;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmDetails(@Nullable String alarmDetails) {
    this.alarmDetails = alarmDetails;
  }


  public AlarmRule dashboardId(@Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * JSON object with the dashboard Id representing the reference to alarm details dashboard used by mobile application
   * @return dashboardId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardId(@Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
  }


  public AlarmRule schedule(@Nullable AlarmSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * JSON object representing time interval during which the rule is active
   * @return schedule
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(@Nullable AlarmSchedule schedule) {
    this.schedule = schedule;
  }


  /**
   * Return true if this AlarmRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRule alarmRule = (AlarmRule) o;
    return Objects.equals(this.condition, alarmRule.condition) &&
        Objects.equals(this.alarmDetails, alarmRule.alarmDetails) &&
        Objects.equals(this.dashboardId, alarmRule.dashboardId) &&
        Objects.equals(this.schedule, alarmRule.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, alarmDetails, dashboardId, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRule {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    alarmDetails: ").append(toIndentedString(alarmDetails)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

    // add `condition` to the URL query string
    if (getCondition() != null) {
      joiner.add(getCondition().toUrlQueryString(prefix + "condition" + suffix));
    }

    // add `alarmDetails` to the URL query string
    if (getAlarmDetails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarmDetails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarmDetails()))));
    }

    // add `dashboardId` to the URL query string
    if (getDashboardId() != null) {
      joiner.add(getDashboardId().toUrlQueryString(prefix + "dashboardId" + suffix));
    }

    // add `schedule` to the URL query string
    if (getSchedule() != null) {
      joiner.add(getSchedule().toUrlQueryString(prefix + "schedule" + suffix));
    }

    return joiner.toString();
  }
}

