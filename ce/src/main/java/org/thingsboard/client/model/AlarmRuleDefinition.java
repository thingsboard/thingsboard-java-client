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
import org.thingsboard.client.model.AlarmRuleCondition;
import org.thingsboard.client.model.DashboardId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmRuleDefinition
 */
@JsonPropertyOrder({
  AlarmRuleDefinition.JSON_PROPERTY_CONDITION,
  AlarmRuleDefinition.JSON_PROPERTY_ALARM_DETAILS,
  AlarmRuleDefinition.JSON_PROPERTY_DASHBOARD_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AlarmRuleDefinition {
  public static final String JSON_PROPERTY_CONDITION = "condition";
  @javax.annotation.Nonnull
  private AlarmRuleCondition condition;

  public static final String JSON_PROPERTY_ALARM_DETAILS = "alarmDetails";
  @javax.annotation.Nullable
  private String alarmDetails;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  @javax.annotation.Nullable
  private DashboardId dashboardId;

  public AlarmRuleDefinition() { 
  }

  public AlarmRuleDefinition condition(@javax.annotation.Nonnull AlarmRuleCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlarmRuleCondition getCondition() {
    return condition;
  }


  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCondition(@javax.annotation.Nonnull AlarmRuleCondition condition) {
    this.condition = condition;
  }


  public AlarmRuleDefinition alarmDetails(@javax.annotation.Nullable String alarmDetails) {
    this.alarmDetails = alarmDetails;
    return this;
  }

  /**
   * Get alarmDetails
   * @return alarmDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlarmDetails() {
    return alarmDetails;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmDetails(@javax.annotation.Nullable String alarmDetails) {
    this.alarmDetails = alarmDetails;
  }


  public AlarmRuleDefinition dashboardId(@javax.annotation.Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * Get dashboardId
   * @return dashboardId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardId(@javax.annotation.Nullable DashboardId dashboardId) {
    this.dashboardId = dashboardId;
  }


  /**
   * Return true if this AlarmRuleDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRuleDefinition alarmRuleDefinition = (AlarmRuleDefinition) o;
    return Objects.equals(this.condition, alarmRuleDefinition.condition) &&
        Objects.equals(this.alarmDetails, alarmRuleDefinition.alarmDetails) &&
        Objects.equals(this.dashboardId, alarmRuleDefinition.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, alarmDetails, dashboardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRuleDefinition {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    alarmDetails: ").append(toIndentedString(alarmDetails)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
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

    return joiner.toString();
  }
}

