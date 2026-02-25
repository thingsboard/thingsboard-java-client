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
 * A JSON value representing the JWT Settings.
 */
@JsonPropertyOrder({
  JwtSettings.JSON_PROPERTY_TOKEN_EXPIRATION_TIME,
  JwtSettings.JSON_PROPERTY_REFRESH_TOKEN_EXP_TIME,
  JwtSettings.JSON_PROPERTY_TOKEN_ISSUER,
  JwtSettings.JSON_PROPERTY_TOKEN_SIGNING_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class JwtSettings {
  public static final String JSON_PROPERTY_TOKEN_EXPIRATION_TIME = "tokenExpirationTime";
  @javax.annotation.Nullable
  private Integer tokenExpirationTime;

  public static final String JSON_PROPERTY_REFRESH_TOKEN_EXP_TIME = "refreshTokenExpTime";
  @javax.annotation.Nullable
  private Integer refreshTokenExpTime;

  public static final String JSON_PROPERTY_TOKEN_ISSUER = "tokenIssuer";
  @javax.annotation.Nullable
  private String tokenIssuer;

  public static final String JSON_PROPERTY_TOKEN_SIGNING_KEY = "tokenSigningKey";
  @javax.annotation.Nullable
  private String tokenSigningKey;

  public JwtSettings() { 
  }

  public JwtSettings tokenExpirationTime(@javax.annotation.Nullable Integer tokenExpirationTime) {
    this.tokenExpirationTime = tokenExpirationTime;
    return this;
  }

  /**
   * The JWT will expire after seconds.
   * @return tokenExpirationTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOKEN_EXPIRATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTokenExpirationTime() {
    return tokenExpirationTime;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN_EXPIRATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenExpirationTime(@javax.annotation.Nullable Integer tokenExpirationTime) {
    this.tokenExpirationTime = tokenExpirationTime;
  }


  public JwtSettings refreshTokenExpTime(@javax.annotation.Nullable Integer refreshTokenExpTime) {
    this.refreshTokenExpTime = refreshTokenExpTime;
    return this;
  }

  /**
   * The JWT can be refreshed during seconds.
   * @return refreshTokenExpTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN_EXP_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRefreshTokenExpTime() {
    return refreshTokenExpTime;
  }


  @JsonProperty(value = JSON_PROPERTY_REFRESH_TOKEN_EXP_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefreshTokenExpTime(@javax.annotation.Nullable Integer refreshTokenExpTime) {
    this.refreshTokenExpTime = refreshTokenExpTime;
  }


  public JwtSettings tokenIssuer(@javax.annotation.Nullable String tokenIssuer) {
    this.tokenIssuer = tokenIssuer;
    return this;
  }

  /**
   * The JWT issuer.
   * @return tokenIssuer
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOKEN_ISSUER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenIssuer() {
    return tokenIssuer;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN_ISSUER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenIssuer(@javax.annotation.Nullable String tokenIssuer) {
    this.tokenIssuer = tokenIssuer;
  }


  public JwtSettings tokenSigningKey(@javax.annotation.Nullable String tokenSigningKey) {
    this.tokenSigningKey = tokenSigningKey;
    return this;
  }

  /**
   * The JWT key is used to sing token. Base64 encoded.
   * @return tokenSigningKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOKEN_SIGNING_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenSigningKey() {
    return tokenSigningKey;
  }


  @JsonProperty(value = JSON_PROPERTY_TOKEN_SIGNING_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenSigningKey(@javax.annotation.Nullable String tokenSigningKey) {
    this.tokenSigningKey = tokenSigningKey;
  }


  /**
   * Return true if this JwtSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtSettings jwtSettings = (JwtSettings) o;
    return Objects.equals(this.tokenExpirationTime, jwtSettings.tokenExpirationTime) &&
        Objects.equals(this.refreshTokenExpTime, jwtSettings.refreshTokenExpTime) &&
        Objects.equals(this.tokenIssuer, jwtSettings.tokenIssuer) &&
        Objects.equals(this.tokenSigningKey, jwtSettings.tokenSigningKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenExpirationTime, refreshTokenExpTime, tokenIssuer, tokenSigningKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtSettings {\n");
    sb.append("    tokenExpirationTime: ").append(toIndentedString(tokenExpirationTime)).append("\n");
    sb.append("    refreshTokenExpTime: ").append(toIndentedString(refreshTokenExpTime)).append("\n");
    sb.append("    tokenIssuer: ").append(toIndentedString(tokenIssuer)).append("\n");
    sb.append("    tokenSigningKey: ").append(toIndentedString(tokenSigningKey)).append("\n");
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

    // add `tokenExpirationTime` to the URL query string
    if (getTokenExpirationTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stokenExpirationTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTokenExpirationTime()))));
    }

    // add `refreshTokenExpTime` to the URL query string
    if (getRefreshTokenExpTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srefreshTokenExpTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRefreshTokenExpTime()))));
    }

    // add `tokenIssuer` to the URL query string
    if (getTokenIssuer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stokenIssuer%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTokenIssuer()))));
    }

    // add `tokenSigningKey` to the URL query string
    if (getTokenSigningKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stokenSigningKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTokenSigningKey()))));
    }

    return joiner.toString();
  }
}

