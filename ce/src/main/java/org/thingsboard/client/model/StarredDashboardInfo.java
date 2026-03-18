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
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * StarredDashboardInfo
 */
@JsonPropertyOrder({
  StarredDashboardInfo.JSON_PROPERTY_ID,
  StarredDashboardInfo.JSON_PROPERTY_TITLE,
  StarredDashboardInfo.JSON_PROPERTY_STARRED_AT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class StarredDashboardInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private UUID id;

  public static final String JSON_PROPERTY_TITLE = "title";
  @Nullable
  private String title;

  public static final String JSON_PROPERTY_STARRED_AT = "starredAt";
  @Nullable
  private Long starredAt;

  public StarredDashboardInfo() { 
  }

  @JsonCreator
  public StarredDashboardInfo(
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
  this();
    this.id = id;
  }

  /**
   * JSON object with Dashboard id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }




  public StarredDashboardInfo title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the dashboard.
   * @return title
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@Nullable String title) {
    this.title = title;
  }


  public StarredDashboardInfo starredAt(@Nullable Long starredAt) {
    this.starredAt = starredAt;
    return this;
  }

  /**
   * Starred timestamp
   * @return starredAt
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STARRED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStarredAt() {
    return starredAt;
  }


  @JsonProperty(value = JSON_PROPERTY_STARRED_AT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStarredAt(@Nullable Long starredAt) {
    this.starredAt = starredAt;
  }


  /**
   * Return true if this StarredDashboardInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarredDashboardInfo starredDashboardInfo = (StarredDashboardInfo) o;
    return Objects.equals(this.id, starredDashboardInfo.id) &&
        Objects.equals(this.title, starredDashboardInfo.title) &&
        Objects.equals(this.starredAt, starredDashboardInfo.starredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, starredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarredDashboardInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `starredAt` to the URL query string
    if (getStarredAt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstarredAt%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStarredAt()))));
    }

    return joiner.toString();
  }
}

