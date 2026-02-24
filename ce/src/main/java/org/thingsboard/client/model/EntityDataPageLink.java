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
import org.thingsboard.client.model.EntityDataSortOrder;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityDataPageLink
 */
@JsonPropertyOrder({
  EntityDataPageLink.JSON_PROPERTY_PAGE_SIZE,
  EntityDataPageLink.JSON_PROPERTY_PAGE,
  EntityDataPageLink.JSON_PROPERTY_TEXT_SEARCH,
  EntityDataPageLink.JSON_PROPERTY_SORT_ORDER,
  EntityDataPageLink.JSON_PROPERTY_DYNAMIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityDataPageLink {
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

  public EntityDataPageLink() { 
  }

  public EntityDataPageLink pageSize(@javax.annotation.Nullable Integer pageSize) {
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


  public EntityDataPageLink page(@javax.annotation.Nullable Integer page) {
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


  public EntityDataPageLink textSearch(@javax.annotation.Nullable String textSearch) {
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


  public EntityDataPageLink sortOrder(@javax.annotation.Nullable EntityDataSortOrder sortOrder) {
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


  public EntityDataPageLink dynamic(@javax.annotation.Nullable Boolean dynamic) {
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
   * Return true if this EntityDataPageLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDataPageLink entityDataPageLink = (EntityDataPageLink) o;
    return Objects.equals(this.pageSize, entityDataPageLink.pageSize) &&
        Objects.equals(this.page, entityDataPageLink.page) &&
        Objects.equals(this.textSearch, entityDataPageLink.textSearch) &&
        Objects.equals(this.sortOrder, entityDataPageLink.sortOrder) &&
        Objects.equals(this.dynamic, entityDataPageLink.dynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, page, textSearch, sortOrder, dynamic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDataPageLink {\n");
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

