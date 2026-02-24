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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.thingsboard.client.model.AlarmSearchStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ClearRule
 */
@JsonPropertyOrder({
  ClearRule.JSON_PROPERTY_ALARM_STATUSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ClearRule {
  public static final String JSON_PROPERTY_ALARM_STATUSES = "alarmStatuses";
  @javax.annotation.Nullable
  private Set<AlarmSearchStatus> alarmStatuses = new LinkedHashSet<>();

  public ClearRule() { 
  }

  public ClearRule alarmStatuses(@javax.annotation.Nullable Set<AlarmSearchStatus> alarmStatuses) {
    this.alarmStatuses = alarmStatuses;
    return this;
  }

  public ClearRule addAlarmStatusesItem(AlarmSearchStatus alarmStatusesItem) {
    if (this.alarmStatuses == null) {
      this.alarmStatuses = new LinkedHashSet<>();
    }
    this.alarmStatuses.add(alarmStatusesItem);
    return this;
  }

  /**
   * Get alarmStatuses
   * @return alarmStatuses
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_STATUSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<AlarmSearchStatus> getAlarmStatuses() {
    return alarmStatuses;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ALARM_STATUSES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmStatuses(@javax.annotation.Nullable Set<AlarmSearchStatus> alarmStatuses) {
    this.alarmStatuses = alarmStatuses;
  }


  /**
   * Return true if this ClearRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearRule clearRule = (ClearRule) o;
    return Objects.equals(this.alarmStatuses, clearRule.alarmStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearRule {\n");
    sb.append("    alarmStatuses: ").append(toIndentedString(alarmStatuses)).append("\n");
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

    // add `alarmStatuses` to the URL query string
    if (getAlarmStatuses() != null) {
      int i = 0;
      for (AlarmSearchStatus _item : getAlarmStatuses()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%salarmStatuses%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    return joiner.toString();
  }
}

