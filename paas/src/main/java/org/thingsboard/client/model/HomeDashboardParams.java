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
 * HomeDashboardParams
 */
@JsonPropertyOrder({
  HomeDashboardParams.JSON_PROPERTY_ID,
  HomeDashboardParams.JSON_PROPERTY_HIDE_TOOLBAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class HomeDashboardParams {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_HIDE_TOOLBAR = "hideToolbar";
  @javax.annotation.Nullable
  private Boolean hideToolbar;

  public HomeDashboardParams() { 
  }

  public HomeDashboardParams id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Home dashboard Id to assign for the new user.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public HomeDashboardParams hideToolbar(@javax.annotation.Nullable Boolean hideToolbar) {
    this.hideToolbar = hideToolbar;
    return this;
  }

  /**
   * Indicates if hide toolbar should be hidden.
   * @return hideToolbar
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HIDE_TOOLBAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideToolbar() {
    return hideToolbar;
  }


  @JsonProperty(value = JSON_PROPERTY_HIDE_TOOLBAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideToolbar(@javax.annotation.Nullable Boolean hideToolbar) {
    this.hideToolbar = hideToolbar;
  }


  /**
   * Return true if this HomeDashboardParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeDashboardParams homeDashboardParams = (HomeDashboardParams) o;
    return Objects.equals(this.id, homeDashboardParams.id) &&
        Objects.equals(this.hideToolbar, homeDashboardParams.hideToolbar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hideToolbar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeDashboardParams {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hideToolbar: ").append(toIndentedString(hideToolbar)).append("\n");
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

    // add `hideToolbar` to the URL query string
    if (getHideToolbar() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shideToolbar%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHideToolbar()))));
    }

    return joiner.toString();
  }
}

