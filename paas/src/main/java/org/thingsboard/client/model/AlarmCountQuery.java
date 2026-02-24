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
import org.thingsboard.client.model.AlarmSearchStatus;
import org.thingsboard.client.model.AlarmSeverity;
import org.thingsboard.client.model.EntityFilter;
import org.thingsboard.client.model.KeyFilter;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the alarm count query.
 */
@JsonPropertyOrder({
  AlarmCountQuery.JSON_PROPERTY_START_TS,
  AlarmCountQuery.JSON_PROPERTY_END_TS,
  AlarmCountQuery.JSON_PROPERTY_TIME_WINDOW,
  AlarmCountQuery.JSON_PROPERTY_TYPE_LIST,
  AlarmCountQuery.JSON_PROPERTY_STATUS_LIST,
  AlarmCountQuery.JSON_PROPERTY_SEVERITY_LIST,
  AlarmCountQuery.JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS,
  AlarmCountQuery.JSON_PROPERTY_ASSIGNEE_ID,
  AlarmCountQuery.JSON_PROPERTY_ENTITY_FILTER,
  AlarmCountQuery.JSON_PROPERTY_KEY_FILTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AlarmCountQuery {
  public static final String JSON_PROPERTY_START_TS = "startTs";
  @javax.annotation.Nullable
  private Long startTs;

  public static final String JSON_PROPERTY_END_TS = "endTs";
  @javax.annotation.Nullable
  private Long endTs;

  public static final String JSON_PROPERTY_TIME_WINDOW = "timeWindow";
  @javax.annotation.Nullable
  private Long timeWindow;

  public static final String JSON_PROPERTY_TYPE_LIST = "typeList";
  @javax.annotation.Nullable
  private List<String> typeList = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS_LIST = "statusList";
  @javax.annotation.Nullable
  private List<AlarmSearchStatus> statusList = new ArrayList<>();

  public static final String JSON_PROPERTY_SEVERITY_LIST = "severityList";
  @javax.annotation.Nullable
  private List<AlarmSeverity> severityList = new ArrayList<>();

  public static final String JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS = "searchPropagatedAlarms";
  @javax.annotation.Nullable
  private Boolean searchPropagatedAlarms;

  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assigneeId";
  @javax.annotation.Nullable
  private UserId assigneeId;

  public static final String JSON_PROPERTY_ENTITY_FILTER = "entityFilter";
  @javax.annotation.Nullable
  private EntityFilter entityFilter;

  public static final String JSON_PROPERTY_KEY_FILTERS = "keyFilters";
  @javax.annotation.Nullable
  private List<KeyFilter> keyFilters = new ArrayList<>();

  public AlarmCountQuery() { 
  }

  public AlarmCountQuery startTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Get startTs
   * @return startTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTs() {
    return startTs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
  }


  public AlarmCountQuery endTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTs() {
    return endTs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
  }


  public AlarmCountQuery timeWindow(@javax.annotation.Nullable Long timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  /**
   * Get timeWindow
   * @return timeWindow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeWindow() {
    return timeWindow;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeWindow(@javax.annotation.Nullable Long timeWindow) {
    this.timeWindow = timeWindow;
  }


  public AlarmCountQuery typeList(@javax.annotation.Nullable List<String> typeList) {
    this.typeList = typeList;
    return this;
  }

  public AlarmCountQuery addTypeListItem(String typeListItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTypeList() {
    return typeList;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeList(@javax.annotation.Nullable List<String> typeList) {
    this.typeList = typeList;
  }


  public AlarmCountQuery statusList(@javax.annotation.Nullable List<AlarmSearchStatus> statusList) {
    this.statusList = statusList;
    return this;
  }

  public AlarmCountQuery addStatusListItem(AlarmSearchStatus statusListItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlarmSearchStatus> getStatusList() {
    return statusList;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusList(@javax.annotation.Nullable List<AlarmSearchStatus> statusList) {
    this.statusList = statusList;
  }


  public AlarmCountQuery severityList(@javax.annotation.Nullable List<AlarmSeverity> severityList) {
    this.severityList = severityList;
    return this;
  }

  public AlarmCountQuery addSeverityListItem(AlarmSeverity severityListItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SEVERITY_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlarmSeverity> getSeverityList() {
    return severityList;
  }


  @JsonProperty(value = JSON_PROPERTY_SEVERITY_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverityList(@javax.annotation.Nullable List<AlarmSeverity> severityList) {
    this.severityList = severityList;
  }


  public AlarmCountQuery searchPropagatedAlarms(@javax.annotation.Nullable Boolean searchPropagatedAlarms) {
    this.searchPropagatedAlarms = searchPropagatedAlarms;
    return this;
  }

  /**
   * Get searchPropagatedAlarms
   * @return searchPropagatedAlarms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSearchPropagatedAlarms() {
    return searchPropagatedAlarms;
  }


  @JsonProperty(value = JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchPropagatedAlarms(@javax.annotation.Nullable Boolean searchPropagatedAlarms) {
    this.searchPropagatedAlarms = searchPropagatedAlarms;
  }


  public AlarmCountQuery assigneeId(@javax.annotation.Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Get assigneeId
   * @return assigneeId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getAssigneeId() {
    return assigneeId;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigneeId(@javax.annotation.Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
  }


  public AlarmCountQuery entityFilter(@javax.annotation.Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Get entityFilter
   * @return entityFilter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityFilter getEntityFilter() {
    return entityFilter;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityFilter(@javax.annotation.Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
  }


  public AlarmCountQuery keyFilters(@javax.annotation.Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
    return this;
  }

  public AlarmCountQuery addKeyFiltersItem(KeyFilter keyFiltersItem) {
    if (this.keyFilters == null) {
      this.keyFilters = new ArrayList<>();
    }
    this.keyFilters.add(keyFiltersItem);
    return this;
  }

  /**
   * Get keyFilters
   * @return keyFilters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<KeyFilter> getKeyFilters() {
    return keyFilters;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyFilters(@javax.annotation.Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
  }


  /**
   * Return true if this AlarmCountQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmCountQuery alarmCountQuery = (AlarmCountQuery) o;
    return Objects.equals(this.startTs, alarmCountQuery.startTs) &&
        Objects.equals(this.endTs, alarmCountQuery.endTs) &&
        Objects.equals(this.timeWindow, alarmCountQuery.timeWindow) &&
        Objects.equals(this.typeList, alarmCountQuery.typeList) &&
        Objects.equals(this.statusList, alarmCountQuery.statusList) &&
        Objects.equals(this.severityList, alarmCountQuery.severityList) &&
        Objects.equals(this.searchPropagatedAlarms, alarmCountQuery.searchPropagatedAlarms) &&
        Objects.equals(this.assigneeId, alarmCountQuery.assigneeId) &&
        Objects.equals(this.entityFilter, alarmCountQuery.entityFilter) &&
        Objects.equals(this.keyFilters, alarmCountQuery.keyFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTs, endTs, timeWindow, typeList, statusList, severityList, searchPropagatedAlarms, assigneeId, entityFilter, keyFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmCountQuery {\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
    sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
    sb.append("    searchPropagatedAlarms: ").append(toIndentedString(searchPropagatedAlarms)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
    sb.append("    keyFilters: ").append(toIndentedString(keyFilters)).append("\n");
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

    // add `startTs` to the URL query string
    if (getStartTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTs()))));
    }

    // add `endTs` to the URL query string
    if (getEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTs()))));
    }

    // add `timeWindow` to the URL query string
    if (getTimeWindow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimeWindow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeWindow()))));
    }

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

    // add `searchPropagatedAlarms` to the URL query string
    if (getSearchPropagatedAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssearchPropagatedAlarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSearchPropagatedAlarms()))));
    }

    // add `assigneeId` to the URL query string
    if (getAssigneeId() != null) {
      joiner.add(getAssigneeId().toUrlQueryString(prefix + "assigneeId" + suffix));
    }

    // add `entityFilter` to the URL query string
    if (getEntityFilter() != null) {
      joiner.add(getEntityFilter().toUrlQueryString(prefix + "entityFilter" + suffix));
    }

    // add `keyFilters` to the URL query string
    if (getKeyFilters() != null) {
      for (int i = 0; i < getKeyFilters().size(); i++) {
        if (getKeyFilters().get(i) != null) {
          joiner.add(getKeyFilters().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%skeyFilters%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

