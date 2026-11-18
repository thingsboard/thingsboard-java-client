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
import org.thingsboard.client.model.AlarmSearchStatus;
import org.thingsboard.client.model.AlarmSeverity;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmFilterConfig
 */
@JsonPropertyOrder({
  AlarmFilterConfig.JSON_PROPERTY_TYPE_LIST,
  AlarmFilterConfig.JSON_PROPERTY_STATUS_LIST,
  AlarmFilterConfig.JSON_PROPERTY_SEVERITY_LIST,
  AlarmFilterConfig.JSON_PROPERTY_ASSIGNEE_ID,
  AlarmFilterConfig.JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmFilterConfig {
  public static final String JSON_PROPERTY_TYPE_LIST = "typeList";
  @Nullable
  private List<String> typeList = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS_LIST = "statusList";
  @Nullable
  private List<AlarmSearchStatus> statusList = new ArrayList<>();

  public static final String JSON_PROPERTY_SEVERITY_LIST = "severityList";
  @Nullable
  private List<AlarmSeverity> severityList = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assigneeId";
  @Nullable
  private UserId assigneeId;

  public static final String JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS = "searchPropagatedAlarms";
  @Nullable
  private Boolean searchPropagatedAlarms;

  public AlarmFilterConfig() { 
  }

  public AlarmFilterConfig typeList(@Nullable List<String> typeList) {
    this.typeList = typeList;
    return this;
  }

  public AlarmFilterConfig addTypeListItem(String typeListItem) {
    if (this.typeList == null) {
      this.typeList = new ArrayList<>();
    }
    this.typeList.add(typeListItem);
    return this;
  }

  /**
   * Get typeList
   * @return typeList
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTypeList() {
    return typeList;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeList(@Nullable List<String> typeList) {
    this.typeList = typeList;
  }


  public AlarmFilterConfig statusList(@Nullable List<AlarmSearchStatus> statusList) {
    this.statusList = statusList;
    return this;
  }

  public AlarmFilterConfig addStatusListItem(AlarmSearchStatus statusListItem) {
    if (this.statusList == null) {
      this.statusList = new ArrayList<>();
    }
    this.statusList.add(statusListItem);
    return this;
  }

  /**
   * Get statusList
   * @return statusList
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlarmSearchStatus> getStatusList() {
    return statusList;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusList(@Nullable List<AlarmSearchStatus> statusList) {
    this.statusList = statusList;
  }


  public AlarmFilterConfig severityList(@Nullable List<AlarmSeverity> severityList) {
    this.severityList = severityList;
    return this;
  }

  public AlarmFilterConfig addSeverityListItem(AlarmSeverity severityListItem) {
    if (this.severityList == null) {
      this.severityList = new ArrayList<>();
    }
    this.severityList.add(severityListItem);
    return this;
  }

  /**
   * Get severityList
   * @return severityList
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SEVERITY_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlarmSeverity> getSeverityList() {
    return severityList;
  }


  @JsonProperty(value = JSON_PROPERTY_SEVERITY_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverityList(@Nullable List<AlarmSeverity> severityList) {
    this.severityList = severityList;
  }


  public AlarmFilterConfig assigneeId(@Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Get assigneeId
   * @return assigneeId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getAssigneeId() {
    return assigneeId;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigneeId(@Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
  }


  public AlarmFilterConfig searchPropagatedAlarms(@Nullable Boolean searchPropagatedAlarms) {
    this.searchPropagatedAlarms = searchPropagatedAlarms;
    return this;
  }

  /**
   * Get searchPropagatedAlarms
   * @return searchPropagatedAlarms
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSearchPropagatedAlarms() {
    return searchPropagatedAlarms;
  }


  @JsonProperty(value = JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchPropagatedAlarms(@Nullable Boolean searchPropagatedAlarms) {
    this.searchPropagatedAlarms = searchPropagatedAlarms;
  }


  /**
   * Return true if this AlarmFilterConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmFilterConfig alarmFilterConfig = (AlarmFilterConfig) o;
    return Objects.equals(this.typeList, alarmFilterConfig.typeList) &&
        Objects.equals(this.statusList, alarmFilterConfig.statusList) &&
        Objects.equals(this.severityList, alarmFilterConfig.severityList) &&
        Objects.equals(this.assigneeId, alarmFilterConfig.assigneeId) &&
        Objects.equals(this.searchPropagatedAlarms, alarmFilterConfig.searchPropagatedAlarms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeList, statusList, severityList, assigneeId, searchPropagatedAlarms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmFilterConfig {\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
    sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    searchPropagatedAlarms: ").append(toIndentedString(searchPropagatedAlarms)).append("\n");
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

    // add `typeList` to the URL query string
    if (getTypeList() != null) {
      for (int i = 0; i < getTypeList().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stypeList%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTypeList().get(i)))));
      }
    }

    // add `statusList` to the URL query string
    if (getStatusList() != null) {
      for (int i = 0; i < getStatusList().size(); i++) {
        if (getStatusList().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sstatusList%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getStatusList().get(i)))));
        }
      }
    }

    // add `severityList` to the URL query string
    if (getSeverityList() != null) {
      for (int i = 0; i < getSeverityList().size(); i++) {
        if (getSeverityList().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sseverityList%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getSeverityList().get(i)))));
        }
      }
    }

    // add `assigneeId` to the URL query string
    if (getAssigneeId() != null) {
      joiner.add(getAssigneeId().toUrlQueryString(prefix + "assigneeId" + suffix));
    }

    // add `searchPropagatedAlarms` to the URL query string
    if (getSearchPropagatedAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssearchPropagatedAlarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSearchPropagatedAlarms()))));
    }

    return joiner.toString();
  }
}

