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
 * OAuth2CustomMapperConfig
 */
@JsonPropertyOrder({
  OAuth2CustomMapperConfig.JSON_PROPERTY_URL,
  OAuth2CustomMapperConfig.JSON_PROPERTY_USERNAME,
  OAuth2CustomMapperConfig.JSON_PROPERTY_PASSWORD,
  OAuth2CustomMapperConfig.JSON_PROPERTY_SEND_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OAuth2CustomMapperConfig {
  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @javax.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_SEND_TOKEN = "sendToken";
  @javax.annotation.Nullable
  private Boolean sendToken;

  public OAuth2CustomMapperConfig() { 
  }

  public OAuth2CustomMapperConfig url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public OAuth2CustomMapperConfig username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USERNAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }


  @JsonProperty(value = JSON_PROPERTY_USERNAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public OAuth2CustomMapperConfig password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public OAuth2CustomMapperConfig sendToken(@javax.annotation.Nullable Boolean sendToken) {
    this.sendToken = sendToken;
    return this;
  }

  /**
   * Get sendToken
   * @return sendToken
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SEND_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSendToken() {
    return sendToken;
  }


  @JsonProperty(value = JSON_PROPERTY_SEND_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendToken(@javax.annotation.Nullable Boolean sendToken) {
    this.sendToken = sendToken;
  }


  /**
   * Return true if this OAuth2CustomMapperConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2CustomMapperConfig oauth2CustomMapperConfig = (OAuth2CustomMapperConfig) o;
    return Objects.equals(this.url, oauth2CustomMapperConfig.url) &&
        Objects.equals(this.username, oauth2CustomMapperConfig.username) &&
        Objects.equals(this.password, oauth2CustomMapperConfig.password) &&
        Objects.equals(this.sendToken, oauth2CustomMapperConfig.sendToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, username, password, sendToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2CustomMapperConfig {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sendToken: ").append(toIndentedString(sendToken)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%surl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUrl()))));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susername%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsername()))));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPassword()))));
    }

    // add `sendToken` to the URL query string
    if (getSendToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssendToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSendToken()))));
    }

    return joiner.toString();
  }
}

