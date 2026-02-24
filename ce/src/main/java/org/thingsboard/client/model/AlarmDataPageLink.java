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
import org.thingsboard.client.model.EntityDataSortOrder;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmDataPageLink
 */
@JsonPropertyOrder({
  AlarmDataPageLink.JSON_PROPERTY_START_TS,
  AlarmDataPageLink.JSON_PROPERTY_END_TS,
  AlarmDataPageLink.JSON_PROPERTY_TIME_WINDOW,
  AlarmDataPageLink.JSON_PROPERTY_TYPE_LIST,
  AlarmDataPageLink.JSON_PROPERTY_STATUS_LIST,
  AlarmDataPageLink.JSON_PROPERTY_SEVERITY_LIST,
  AlarmDataPageLink.JSON_PROPERTY_SEARCH_PROPAGATED_ALARMS,
  AlarmDataPageLink.JSON_PROPERTY_ASSIGNEE_ID,
  AlarmDataPageLink.JSON_PROPERTY_PAGE_SIZE,
  AlarmDataPageLink.JSON_PROPERTY_PAGE,
  AlarmDataPageLink.JSON_PROPERTY_TEXT_SEARCH,
  AlarmDataPageLink.JSON_PROPERTY_SORT_ORDER,
  AlarmDataPageLink.JSON_PROPERTY_DYNAMIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AlarmDataPageLink {
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

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  @javax.annotation.Nullable
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE = "page";
  @javax.annotation.Nullable
  private Integer page;

  public static final String JSON_PROPERTY_TEXT_SEARCH = "textSearch";
  @javax.annotation.Nullable
  private String textSearch;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  @javax.annotation.Nullable
  private EntityDataSortOrder sortOrder;

  public static final String JSON_PROPERTY_DYNAMIC = "dynamic";
  @javax.annotation.Nullable
  private Boolean dynamic;

  public AlarmDataPageLink() { 
  }

  public AlarmDataPageLink startTs(@javax.annotation.Nullable Long startTs) {
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


  public AlarmDataPageLink endTs(@javax.annotation.Nullable Long endTs) {
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


  public AlarmDataPageLink timeWindow(@javax.annotation.Nullable Long timeWindow) {
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


  public AlarmDataPageLink typeList(@javax.annotation.Nullable List<String> typeList) {
    this.typeList = typeList;
    return this;
  }

  public AlarmDataPageLink addTypeListItem(String typeListItem) {
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


  public AlarmDataPageLink statusList(@javax.annotation.Nullable List<AlarmSearchStatus> statusList) {
    this.statusList = statusList;
    return this;
  }

  public AlarmDataPageLink addStatusListItem(AlarmSearchStatus statusListItem) {
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


  public AlarmDataPageLink severityList(@javax.annotation.Nullable List<AlarmSeverity> severityList) {
    this.severityList = severityList;
    return this;
  }

  public AlarmDataPageLink addSeverityListItem(AlarmSeverity severityListItem) {
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


  public AlarmDataPageLink searchPropagatedAlarms(@javax.annotation.Nullable Boolean searchPropagatedAlarms) {
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


  public AlarmDataPageLink assigneeId(@javax.annotation.Nullable UserId assigneeId) {
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


  public AlarmDataPageLink pageSize(@javax.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(@javax.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlarmDataPageLink page(@javax.annotation.Nullable Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPage() {
    return page;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(@javax.annotation.Nullable Integer page) {
    this.page = page;
  }


  public AlarmDataPageLink textSearch(@javax.annotation.Nullable String textSearch) {
    this.textSearch = textSearch;
    return this;
  }

  /**
   * Get textSearch
   * @return textSearch
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEXT_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTextSearch() {
    return textSearch;
  }


  @JsonProperty(value = JSON_PROPERTY_TEXT_SEARCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextSearch(@javax.annotation.Nullable String textSearch) {
    this.textSearch = textSearch;
  }


  public AlarmDataPageLink sortOrder(@javax.annotation.Nullable EntityDataSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SORT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityDataSortOrder getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(value = JSON_PROPERTY_SORT_ORDER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(@javax.annotation.Nullable EntityDataSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }


  public AlarmDataPageLink dynamic(@javax.annotation.Nullable Boolean dynamic) {
    this.dynamic = dynamic;
    return this;
  }

  /**
   * Get dynamic
   * @return dynamic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DYNAMIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDynamic() {
    return dynamic;
  }


  @JsonProperty(value = JSON_PROPERTY_DYNAMIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamic(@javax.annotation.Nullable Boolean dynamic) {
    this.dynamic = dynamic;
  }


  /**
   * Return true if this AlarmDataPageLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmDataPageLink alarmDataPageLink = (AlarmDataPageLink) o;
    return Objects.equals(this.startTs, alarmDataPageLink.startTs) &&
        Objects.equals(this.endTs, alarmDataPageLink.endTs) &&
        Objects.equals(this.timeWindow, alarmDataPageLink.timeWindow) &&
        Objects.equals(this.typeList, alarmDataPageLink.typeList) &&
        Objects.equals(this.statusList, alarmDataPageLink.statusList) &&
        Objects.equals(this.severityList, alarmDataPageLink.severityList) &&
        Objects.equals(this.searchPropagatedAlarms, alarmDataPageLink.searchPropagatedAlarms) &&
        Objects.equals(this.assigneeId, alarmDataPageLink.assigneeId) &&
        Objects.equals(this.pageSize, alarmDataPageLink.pageSize) &&
        Objects.equals(this.page, alarmDataPageLink.page) &&
        Objects.equals(this.textSearch, alarmDataPageLink.textSearch) &&
        Objects.equals(this.sortOrder, alarmDataPageLink.sortOrder) &&
        Objects.equals(this.dynamic, alarmDataPageLink.dynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTs, endTs, timeWindow, typeList, statusList, severityList, searchPropagatedAlarms, assigneeId, pageSize, page, textSearch, sortOrder, dynamic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmDataPageLink {\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
    sb.append("    severityList: ").append(toIndentedString(severityList)).append("\n");
    sb.append("    searchPropagatedAlarms: ").append(toIndentedString(searchPropagatedAlarms)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    textSearch: ").append(toIndentedString(textSearch)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
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

    // add `pageSize` to the URL query string
    if (getPageSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spageSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPageSize()))));
    }

    // add `page` to the URL query string
    if (getPage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPage()))));
    }

    // add `textSearch` to the URL query string
    if (getTextSearch() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stextSearch%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTextSearch()))));
    }

    // add `sortOrder` to the URL query string
    if (getSortOrder() != null) {
      joiner.add(getSortOrder().toUrlQueryString(prefix + "sortOrder" + suffix));
    }

    // add `dynamic` to the URL query string
    if (getDynamic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdynamic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDynamic()))));
    }

    return joiner.toString();
  }
}

