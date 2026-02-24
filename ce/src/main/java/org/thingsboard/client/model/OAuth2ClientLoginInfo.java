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
 * OAuth2ClientLoginInfo
 */
@JsonPropertyOrder({
  OAuth2ClientLoginInfo.JSON_PROPERTY_NAME,
  OAuth2ClientLoginInfo.JSON_PROPERTY_ICON,
  OAuth2ClientLoginInfo.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class OAuth2ClientLoginInfo {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ICON = "icon";
  @javax.annotation.Nullable
  private String icon;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public OAuth2ClientLoginInfo() { 
  }

  public OAuth2ClientLoginInfo name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * OAuth2 client name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OAuth2ClientLoginInfo icon(@javax.annotation.Nullable String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Name of the icon, displayed on OAuth2 log in button
   * @return icon
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }


  @JsonProperty(value = JSON_PROPERTY_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(@javax.annotation.Nullable String icon) {
    this.icon = icon;
  }


  public OAuth2ClientLoginInfo url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * URI for OAuth2 log in. On HTTP GET request to this URI, it redirects to the OAuth2 provider page
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


  /**
   * Return true if this OAuth2ClientLoginInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ClientLoginInfo oauth2ClientLoginInfo = (OAuth2ClientLoginInfo) o;
    return Objects.equals(this.name, oauth2ClientLoginInfo.name) &&
        Objects.equals(this.icon, oauth2ClientLoginInfo.icon) &&
        Objects.equals(this.url, oauth2ClientLoginInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, icon, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ClientLoginInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `icon` to the URL query string
    if (getIcon() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sicon%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIcon()))));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%surl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUrl()))));
    }

    return joiner.toString();
  }
}

