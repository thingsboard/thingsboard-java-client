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
 * DefaultDashboardParams
 */
@JsonPropertyOrder({
  DefaultDashboardParams.JSON_PROPERTY_ID,
  DefaultDashboardParams.JSON_PROPERTY_FULLSCREEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DefaultDashboardParams {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_FULLSCREEN = "fullscreen";
  @javax.annotation.Nullable
  private Boolean fullscreen;

  public DefaultDashboardParams() { 
  }

  public DefaultDashboardParams id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Default dashboard Id to assign for the new user.
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


  public DefaultDashboardParams fullscreen(@javax.annotation.Nullable Boolean fullscreen) {
    this.fullscreen = fullscreen;
    return this;
  }

  /**
   * Set default dashboard to full screen mode.
   * @return fullscreen
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FULLSCREEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFullscreen() {
    return fullscreen;
  }


  @JsonProperty(value = JSON_PROPERTY_FULLSCREEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullscreen(@javax.annotation.Nullable Boolean fullscreen) {
    this.fullscreen = fullscreen;
  }


  /**
   * Return true if this DefaultDashboardParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultDashboardParams defaultDashboardParams = (DefaultDashboardParams) o;
    return Objects.equals(this.id, defaultDashboardParams.id) &&
        Objects.equals(this.fullscreen, defaultDashboardParams.fullscreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullscreen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultDashboardParams {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullscreen: ").append(toIndentedString(fullscreen)).append("\n");
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

    // add `fullscreen` to the URL query string
    if (getFullscreen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfullscreen%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFullscreen()))));
    }

    return joiner.toString();
  }
}

