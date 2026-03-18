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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RepositorySettingsInfo
 */
@JsonPropertyOrder({
  RepositorySettingsInfo.JSON_PROPERTY_CONFIGURED,
  RepositorySettingsInfo.JSON_PROPERTY_READ_ONLY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RepositorySettingsInfo {
  public static final String JSON_PROPERTY_CONFIGURED = "configured";
  @Nullable
  private Boolean configured;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  @Nullable
  private Boolean readOnly;

  public RepositorySettingsInfo() { 
  }

  public RepositorySettingsInfo configured(@Nullable Boolean configured) {
    this.configured = configured;
    return this;
  }

  /**
   * Get configured
   * @return configured
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getConfigured() {
    return configured;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigured(@Nullable Boolean configured) {
    this.configured = configured;
  }


  public RepositorySettingsInfo readOnly(@Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(@Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  /**
   * Return true if this RepositorySettingsInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositorySettingsInfo repositorySettingsInfo = (RepositorySettingsInfo) o;
    return Objects.equals(this.configured, repositorySettingsInfo.configured) &&
        Objects.equals(this.readOnly, repositorySettingsInfo.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositorySettingsInfo {\n");
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

    // add `configured` to the URL query string
    if (getConfigured() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigured%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigured()))));
    }

    // add `readOnly` to the URL query string
    if (getReadOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreadOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReadOnly()))));
    }

    return joiner.toString();
  }
}

