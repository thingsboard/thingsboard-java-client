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
import org.thingsboard.client.model.LastVisitedDashboardInfo;
import org.thingsboard.client.model.StarredDashboardInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * UserDashboardsInfo
 */
@JsonPropertyOrder({
  UserDashboardsInfo.JSON_PROPERTY_LAST,
  UserDashboardsInfo.JSON_PROPERTY_STARRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UserDashboardsInfo {
  public static final String JSON_PROPERTY_LAST = "last";
  @javax.annotation.Nullable
  private List<LastVisitedDashboardInfo> last = new ArrayList<>();

  public static final String JSON_PROPERTY_STARRED = "starred";
  @javax.annotation.Nullable
  private List<StarredDashboardInfo> starred = new ArrayList<>();

  public UserDashboardsInfo() { 
  }

  public UserDashboardsInfo last(@javax.annotation.Nullable List<LastVisitedDashboardInfo> last) {
    this.last = last;
    return this;
  }

  public UserDashboardsInfo addLastItem(LastVisitedDashboardInfo lastItem) {
    if (this.last == null) {
      this.last = new ArrayList<>();
    }
    this.last.add(lastItem);
    return this;
  }

  /**
   * List of last visited dashboards.
   * @return last
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LastVisitedDashboardInfo> getLast() {
    return last;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLast(@javax.annotation.Nullable List<LastVisitedDashboardInfo> last) {
    this.last = last;
  }


  public UserDashboardsInfo starred(@javax.annotation.Nullable List<StarredDashboardInfo> starred) {
    this.starred = starred;
    return this;
  }

  public UserDashboardsInfo addStarredItem(StarredDashboardInfo starredItem) {
    if (this.starred == null) {
      this.starred = new ArrayList<>();
    }
    this.starred.add(starredItem);
    return this;
  }

  /**
   * List of starred dashboards.
   * @return starred
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STARRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StarredDashboardInfo> getStarred() {
    return starred;
  }


  @JsonProperty(value = JSON_PROPERTY_STARRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStarred(@javax.annotation.Nullable List<StarredDashboardInfo> starred) {
    this.starred = starred;
  }


  /**
   * Return true if this UserDashboardsInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDashboardsInfo userDashboardsInfo = (UserDashboardsInfo) o;
    return Objects.equals(this.last, userDashboardsInfo.last) &&
        Objects.equals(this.starred, userDashboardsInfo.starred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, starred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDashboardsInfo {\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
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

    // add `last` to the URL query string
    if (getLast() != null) {
      for (int i = 0; i < getLast().size(); i++) {
        if (getLast().get(i) != null) {
          joiner.add(getLast().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%slast%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `starred` to the URL query string
    if (getStarred() != null) {
      for (int i = 0; i < getStarred().size(); i++) {
        if (getStarred().get(i) != null) {
          joiner.add(getStarred().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sstarred%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

