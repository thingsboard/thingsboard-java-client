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
import javax.annotation.Nonnull;
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
 * LoginResponse
 */
@JsonPropertyOrder({
  LoginResponse.JSON_PROPERTY_TOKEN,
  LoginResponse.JSON_PROPERTY_REFRESH_TOKEN,
  LoginResponse.JSON_PROPERTY_SCOPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class LoginResponse {
  public static final String JSON_PROPERTY_TOKEN = "token";
  @Nonnull
  private String token;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  @Nullable
  private String refreshToken;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @Nullable
  private Authority scope;

  public LoginResponse() { 
  }

  public LoginResponse token(@Nonnull String token) {
    this.token = token;
    return this;
  }

  /**
   * JWT token
   * @return token
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getToken() {
    return token;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToken(@Nonnull String token) {
    this.token = token;
  }


  public LoginResponse refreshToken(@Nullable String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Refresh token. Absent when the token is a two-factor authentication token (see scope)
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


  public LoginResponse scope(@Nullable Authority scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Set only when two-factor authentication is required: PRE_VERIFICATION_TOKEN when the user must verify a code, MFA_CONFIGURATION_TOKEN when the user must configure two-factor authentication first. The token then grants access only to the two-factor authentication API
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
   * Return true if this LoginResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(this.token, loginResponse.token) &&
        Objects.equals(this.refreshToken, loginResponse.refreshToken) &&
        Objects.equals(this.scope, loginResponse.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, refreshToken, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
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

