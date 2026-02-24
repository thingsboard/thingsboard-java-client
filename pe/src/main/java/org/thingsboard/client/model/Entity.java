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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Entity
 */
@JsonPropertyOrder({
  Entity.JSON_PROPERTY_USED,
  Entity.JSON_PROPERTY_ACTIVE_COUNT,
  Entity.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Entity {
  public static final String JSON_PROPERTY_USED = "used";
  @javax.annotation.Nullable
  private Boolean used;

  public static final String JSON_PROPERTY_ACTIVE_COUNT = "activeCount";
  @javax.annotation.Nullable
  private Long activeCount;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  @javax.annotation.Nullable
  private Long totalCount;

  public Entity() { 
  }

  public Entity used(@javax.annotation.Nullable Boolean used) {
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsed() {
    return used;
  }


  @JsonProperty(value = JSON_PROPERTY_USED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsed(@javax.annotation.Nullable Boolean used) {
    this.used = used;
  }


  public Entity activeCount(@javax.annotation.Nullable Long activeCount) {
    this.activeCount = activeCount;
    return this;
  }

  /**
   * Get activeCount
   * @return activeCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getActiveCount() {
    return activeCount;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveCount(@javax.annotation.Nullable Long activeCount) {
    this.activeCount = activeCount;
  }


  public Entity totalCount(@javax.annotation.Nullable Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(@javax.annotation.Nullable Long totalCount) {
    this.totalCount = totalCount;
  }


  /**
   * Return true if this Entity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entity entity = (Entity) o;
    return Objects.equals(this.used, entity.used) &&
        Objects.equals(this.activeCount, entity.activeCount) &&
        Objects.equals(this.totalCount, entity.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(used, activeCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    activeCount: ").append(toIndentedString(activeCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

    // add `used` to the URL query string
    if (getUsed() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sused%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsed()))));
    }

    // add `activeCount` to the URL query string
    if (getActiveCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactiveCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActiveCount()))));
    }

    // add `totalCount` to the URL query string
    if (getTotalCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalCount()))));
    }

    return joiner.toString();
  }
}

