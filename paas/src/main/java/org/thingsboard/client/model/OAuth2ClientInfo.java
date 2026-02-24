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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.OAuth2ClientId;
import org.thingsboard.client.model.PlatformType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OAuth2ClientInfo
 */
@JsonPropertyOrder({
  OAuth2ClientInfo.JSON_PROPERTY_ID,
  OAuth2ClientInfo.JSON_PROPERTY_CREATED_TIME,
  OAuth2ClientInfo.JSON_PROPERTY_TITLE,
  OAuth2ClientInfo.JSON_PROPERTY_PROVIDER_NAME,
  OAuth2ClientInfo.JSON_PROPERTY_PLATFORMS,
  OAuth2ClientInfo.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class OAuth2ClientInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private OAuth2ClientId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  @javax.annotation.Nullable
  private String providerName;

  public static final String JSON_PROPERTY_PLATFORMS = "platforms";
  @javax.annotation.Nullable
  private List<PlatformType> platforms = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public OAuth2ClientInfo() { 
  }

  @JsonCreator
  public OAuth2ClientInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public OAuth2ClientInfo id(@javax.annotation.Nullable OAuth2ClientId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OAuth2ClientId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable OAuth2ClientId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public OAuth2ClientInfo title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Oauth2 client registration title (e.g. My google)
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public OAuth2ClientInfo providerName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Oauth2 client provider name (e.g. Google)
   * @return providerName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVIDER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
  }


  public OAuth2ClientInfo platforms(@javax.annotation.Nullable List<PlatformType> platforms) {
    this.platforms = platforms;
    return this;
  }

  public OAuth2ClientInfo addPlatformsItem(PlatformType platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * List of platforms for which usage of the OAuth2 client is allowed (empty for all allowed)
   * @return platforms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PLATFORMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PlatformType> getPlatforms() {
    return platforms;
  }


  @JsonProperty(value = JSON_PROPERTY_PLATFORMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatforms(@javax.annotation.Nullable List<PlatformType> platforms) {
    this.platforms = platforms;
  }


  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this OAuth2ClientInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ClientInfo oauth2ClientInfo = (OAuth2ClientInfo) o;
    return Objects.equals(this.id, oauth2ClientInfo.id) &&
        Objects.equals(this.createdTime, oauth2ClientInfo.createdTime) &&
        Objects.equals(this.title, oauth2ClientInfo.title) &&
        Objects.equals(this.providerName, oauth2ClientInfo.providerName) &&
        Objects.equals(this.platforms, oauth2ClientInfo.platforms) &&
        Objects.equals(this.name, oauth2ClientInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, title, providerName, platforms, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ClientInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `providerName` to the URL query string
    if (getProviderName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sproviderName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProviderName()))));
    }

    // add `platforms` to the URL query string
    if (getPlatforms() != null) {
      for (int i = 0; i < getPlatforms().size(); i++) {
        if (getPlatforms().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%splatforms%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getPlatforms().get(i)))));
        }
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

