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
import org.thingsboard.client.model.Authority;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * JWT Pair
 */
@JsonPropertyOrder({
  JwtPair.JSON_PROPERTY_TOKEN,
  JwtPair.JSON_PROPERTY_REFRESH_TOKEN,
  JwtPair.JSON_PROPERTY_SCOPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class JwtPair {
  public static final String JSON_PROPERTY_TOKEN = "token";
  @Nullable
  private String token;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  @Nullable
  private String refreshToken;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @Nullable
  private Authority scope;

  public JwtPair() { 
  }

  public JwtPair token(@Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * The JWT Access Token. Used to perform API calls.
   * @return token
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@Nullable String token) {
    this.token = token;
  }


  public JwtPair refreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The JWT Refresh Token. Used to get new JWT Access Token if old one has expired.
   * @return refreshToken
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public JwtPair scope(@Nullable Authority scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Authority getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(@Nullable Authority scope) {
    this.scope = scope;
  }


  /**
   * Return true if this JwtPair object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtPair jwtPair = (JwtPair) o;
    return Objects.equals(this.token, jwtPair.token) &&
        Objects.equals(this.refreshToken, jwtPair.refreshToken) &&
        Objects.equals(this.scope, jwtPair.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, refreshToken, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtPair {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stoken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getToken()))));
    }

    // add `refreshToken` to the URL query string
    if (getRefreshToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srefreshToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRefreshToken()))));
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScope()))));
    }

    return joiner.toString();
  }
}

