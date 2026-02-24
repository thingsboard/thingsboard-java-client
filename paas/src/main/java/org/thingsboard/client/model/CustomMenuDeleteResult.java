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
import org.thingsboard.client.model.CMAssigneeType;
import org.thingsboard.client.model.EntityInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CustomMenuDeleteResult
 */
@JsonPropertyOrder({
  CustomMenuDeleteResult.JSON_PROPERTY_SUCCESS,
  CustomMenuDeleteResult.JSON_PROPERTY_ASSIGNEE_TYPE,
  CustomMenuDeleteResult.JSON_PROPERTY_ASSIGNEE_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CustomMenuDeleteResult {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  @javax.annotation.Nullable
  private Boolean success;

  public static final String JSON_PROPERTY_ASSIGNEE_TYPE = "assigneeType";
  @javax.annotation.Nullable
  private CMAssigneeType assigneeType;

  public static final String JSON_PROPERTY_ASSIGNEE_LIST = "assigneeList";
  @javax.annotation.Nullable
  private List<EntityInfo> assigneeList = new ArrayList<>();

  public CustomMenuDeleteResult() { 
  }

  public CustomMenuDeleteResult success(@javax.annotation.Nullable Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(@javax.annotation.Nullable Boolean success) {
    this.success = success;
  }


  public CustomMenuDeleteResult assigneeType(@javax.annotation.Nullable CMAssigneeType assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * Get assigneeType
   * @return assigneeType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CMAssigneeType getAssigneeType() {
    return assigneeType;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigneeType(@javax.annotation.Nullable CMAssigneeType assigneeType) {
    this.assigneeType = assigneeType;
  }


  public CustomMenuDeleteResult assigneeList(@javax.annotation.Nullable List<EntityInfo> assigneeList) {
    this.assigneeList = assigneeList;
    return this;
  }

  public CustomMenuDeleteResult addAssigneeListItem(EntityInfo assigneeListItem) {
    if (this.assigneeList == null) {
      this.assigneeList = new ArrayList<>();
    }
    this.assigneeList.add(assigneeListItem);
    return this;
  }

  /**
   * Get assigneeList
   * @return assigneeList
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityInfo> getAssigneeList() {
    return assigneeList;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigneeList(@javax.annotation.Nullable List<EntityInfo> assigneeList) {
    this.assigneeList = assigneeList;
  }


  /**
   * Return true if this CustomMenuDeleteResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMenuDeleteResult customMenuDeleteResult = (CustomMenuDeleteResult) o;
    return Objects.equals(this.success, customMenuDeleteResult.success) &&
        Objects.equals(this.assigneeType, customMenuDeleteResult.assigneeType) &&
        Objects.equals(this.assigneeList, customMenuDeleteResult.assigneeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, assigneeType, assigneeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMenuDeleteResult {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    assigneeList: ").append(toIndentedString(assigneeList)).append("\n");
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

    // add `success` to the URL query string
    if (getSuccess() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssuccess%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSuccess()))));
    }

    // add `assigneeType` to the URL query string
    if (getAssigneeType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassigneeType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssigneeType()))));
    }

    // add `assigneeList` to the URL query string
    if (getAssigneeList() != null) {
      for (int i = 0; i < getAssigneeList().size(); i++) {
        if (getAssigneeList().get(i) != null) {
          joiner.add(getAssigneeList().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sassigneeList%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

