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
import org.thingsboard.client.model.OllamaAuth;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OllamaProviderConfig
 */
@JsonPropertyOrder({
  OllamaProviderConfig.JSON_PROPERTY_BASE_URL,
  OllamaProviderConfig.JSON_PROPERTY_AUTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OllamaProviderConfig {
  public static final String JSON_PROPERTY_BASE_URL = "baseUrl";
  @javax.annotation.Nonnull
  private String baseUrl;

  public static final String JSON_PROPERTY_AUTH = "auth";
  @javax.annotation.Nonnull
  private OllamaAuth auth;

  public OllamaProviderConfig() { 
  }

  public OllamaProviderConfig baseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Get baseUrl
   * @return baseUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_BASE_URL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseUrl(@javax.annotation.Nonnull String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public OllamaProviderConfig auth(@javax.annotation.Nonnull OllamaAuth auth) {
    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AUTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OllamaAuth getAuth() {
    return auth;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTH, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuth(@javax.annotation.Nonnull OllamaAuth auth) {
    this.auth = auth;
  }


  /**
   * Return true if this OllamaProviderConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OllamaProviderConfig ollamaProviderConfig = (OllamaProviderConfig) o;
    return Objects.equals(this.baseUrl, ollamaProviderConfig.baseUrl) &&
        Objects.equals(this.auth, ollamaProviderConfig.auth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, auth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OllamaProviderConfig {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

    // add `baseUrl` to the URL query string
    if (getBaseUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbaseUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBaseUrl()))));
    }

    // add `auth` to the URL query string
    if (getAuth() != null) {
      joiner.add(getAuth().toUrlQueryString(prefix + "auth" + suffix));
    }

    return joiner.toString();
  }
}

