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
import org.thingsboard.client.model.TenantInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * PageDataTenantInfo
 */
@JsonPropertyOrder({
  PageDataTenantInfo.JSON_PROPERTY_DATA,
  PageDataTenantInfo.JSON_PROPERTY_TOTAL_PAGES,
  PageDataTenantInfo.JSON_PROPERTY_TOTAL_ELEMENTS,
  PageDataTenantInfo.JSON_PROPERTY_HAS_NEXT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class PageDataTenantInfo {
  public static final String JSON_PROPERTY_DATA = "data";
  @Nullable
  private List<TenantInfo> data = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_PAGES = "totalPages";
  @Nullable
  private Integer totalPages;

  public static final String JSON_PROPERTY_TOTAL_ELEMENTS = "totalElements";
  @Nullable
  private Long totalElements;

  public static final String JSON_PROPERTY_HAS_NEXT = "hasNext";
  @Nullable
  private Boolean hasNext;

  public PageDataTenantInfo() { 
  }

  @JsonCreator
  public PageDataTenantInfo(
    @JsonProperty(JSON_PROPERTY_TOTAL_PAGES) Integer totalPages, 
    @JsonProperty(JSON_PROPERTY_TOTAL_ELEMENTS) Long totalElements, 
    @JsonProperty(JSON_PROPERTY_HAS_NEXT) Boolean hasNext
  ) {
  this();
    this.totalPages = totalPages;
    this.totalElements = totalElements;
    this.hasNext = hasNext;
  }

  public PageDataTenantInfo data(@Nullable List<TenantInfo> data) {
    this.data = data;
    return this;
  }

  public PageDataTenantInfo addDataItem(TenantInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of the entities
   * @return data
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TenantInfo> getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@Nullable List<TenantInfo> data) {
    this.data = data;
  }


  /**
   * Total number of available pages. Calculated based on the &#39;pageSize&#39; request parameter and total number of entities that match search criteria
   * @return totalPages
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_PAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotalPages() {
    return totalPages;
  }




  /**
   * Total number of elements in all available pages
   * @return totalElements
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_ELEMENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalElements() {
    return totalElements;
  }




  /**
   * &#39;false&#39; value indicates the end of the result set
   * @return hasNext
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_NEXT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasNext() {
    return hasNext;
  }




  /**
   * Return true if this PageDataTenantInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageDataTenantInfo pageDataTenantInfo = (PageDataTenantInfo) o;
    return Objects.equals(this.data, pageDataTenantInfo.data) &&
        Objects.equals(this.totalPages, pageDataTenantInfo.totalPages) &&
        Objects.equals(this.totalElements, pageDataTenantInfo.totalElements) &&
        Objects.equals(this.hasNext, pageDataTenantInfo.hasNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalPages, totalElements, hasNext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDataTenantInfo {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `totalPages` to the URL query string
    if (getTotalPages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalPages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalPages()))));
    }

    // add `totalElements` to the URL query string
    if (getTotalElements() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalElements%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalElements()))));
    }

    // add `hasNext` to the URL query string
    if (getHasNext() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasNext%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasNext()))));
    }

    return joiner.toString();
  }
}

