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
import org.thingsboard.client.model.OAuth2MapperConfig;
import org.thingsboard.client.model.PlatformType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OAuth2Client
 */
@JsonPropertyOrder({
  OAuth2Client.JSON_PROPERTY_ID,
  OAuth2Client.JSON_PROPERTY_CREATED_TIME,
  OAuth2Client.JSON_PROPERTY_ADDITIONAL_INFO,
  OAuth2Client.JSON_PROPERTY_TENANT_ID,
  OAuth2Client.JSON_PROPERTY_TITLE,
  OAuth2Client.JSON_PROPERTY_MAPPER_CONFIG,
  OAuth2Client.JSON_PROPERTY_CLIENT_ID,
  OAuth2Client.JSON_PROPERTY_CLIENT_SECRET,
  OAuth2Client.JSON_PROPERTY_AUTHORIZATION_URI,
  OAuth2Client.JSON_PROPERTY_ACCESS_TOKEN_URI,
  OAuth2Client.JSON_PROPERTY_SCOPE,
  OAuth2Client.JSON_PROPERTY_USER_INFO_URI,
  OAuth2Client.JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME,
  OAuth2Client.JSON_PROPERTY_JWK_SET_URI,
  OAuth2Client.JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD,
  OAuth2Client.JSON_PROPERTY_LOGIN_BUTTON_LABEL,
  OAuth2Client.JSON_PROPERTY_LOGIN_BUTTON_ICON,
  OAuth2Client.JSON_PROPERTY_PLATFORMS,
  OAuth2Client.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OAuth2Client {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private OAuth2ClientId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nonnull
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_MAPPER_CONFIG = "mapperConfig";
  @javax.annotation.Nonnull
  private OAuth2MapperConfig mapperConfig;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  @javax.annotation.Nonnull
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  @javax.annotation.Nonnull
  private String clientSecret;

  public static final String JSON_PROPERTY_AUTHORIZATION_URI = "authorizationUri";
  @javax.annotation.Nonnull
  private String authorizationUri;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_URI = "accessTokenUri";
  @javax.annotation.Nonnull
  private String accessTokenUri;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nonnull
  private List<String> scope = new ArrayList<>();

  public static final String JSON_PROPERTY_USER_INFO_URI = "userInfoUri";
  @javax.annotation.Nullable
  private String userInfoUri;

  public static final String JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME = "userNameAttributeName";
  @javax.annotation.Nonnull
  private String userNameAttributeName;

  public static final String JSON_PROPERTY_JWK_SET_URI = "jwkSetUri";
  @javax.annotation.Nullable
  private String jwkSetUri;

  public static final String JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD = "clientAuthenticationMethod";
  @javax.annotation.Nonnull
  private String clientAuthenticationMethod;

  public static final String JSON_PROPERTY_LOGIN_BUTTON_LABEL = "loginButtonLabel";
  @javax.annotation.Nonnull
  private String loginButtonLabel;

  public static final String JSON_PROPERTY_LOGIN_BUTTON_ICON = "loginButtonIcon";
  @javax.annotation.Nullable
  private String loginButtonIcon;

  public static final String JSON_PROPERTY_PLATFORMS = "platforms";
  @javax.annotation.Nullable
  private List<PlatformType> platforms = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public OAuth2Client() { 
  }

  @JsonCreator
  public OAuth2Client(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public OAuth2Client id(@javax.annotation.Nullable OAuth2ClientId id) {
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




  public OAuth2Client additionalInfo(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional info of OAuth2 client (e.g. providerName)
   * @return additionalInfo
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalInfo(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public OAuth2Client tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public OAuth2Client title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Oauth2 client title
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public OAuth2Client mapperConfig(@javax.annotation.Nonnull OAuth2MapperConfig mapperConfig) {
    this.mapperConfig = mapperConfig;
    return this;
  }

  /**
   * Config for mapping OAuth2 log in response to platform entities
   * @return mapperConfig
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_MAPPER_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OAuth2MapperConfig getMapperConfig() {
    return mapperConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_MAPPER_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMapperConfig(@javax.annotation.Nonnull OAuth2MapperConfig mapperConfig) {
    this.mapperConfig = mapperConfig;
  }


  public OAuth2Client clientId(@javax.annotation.Nonnull String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth2 client ID. Cannot be empty
   * @return clientId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLIENT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }


  @JsonProperty(value = JSON_PROPERTY_CLIENT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(@javax.annotation.Nonnull String clientId) {
    this.clientId = clientId;
  }


  public OAuth2Client clientSecret(@javax.annotation.Nonnull String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth2 client secret. Cannot be empty
   * @return clientSecret
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLIENT_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(value = JSON_PROPERTY_CLIENT_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(@javax.annotation.Nonnull String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public OAuth2Client authorizationUri(@javax.annotation.Nonnull String authorizationUri) {
    this.authorizationUri = authorizationUri;
    return this;
  }

  /**
   * Authorization URI of the OAuth2 provider. Cannot be empty
   * @return authorizationUri
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_AUTHORIZATION_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthorizationUri() {
    return authorizationUri;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTHORIZATION_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationUri(@javax.annotation.Nonnull String authorizationUri) {
    this.authorizationUri = authorizationUri;
  }


  public OAuth2Client accessTokenUri(@javax.annotation.Nonnull String accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
    return this;
  }

  /**
   * Access token URI of the OAuth2 provider. Cannot be empty
   * @return accessTokenUri
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccessTokenUri() {
    return accessTokenUri;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN_URI, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessTokenUri(@javax.annotation.Nonnull String accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
  }


  public OAuth2Client scope(@javax.annotation.Nonnull List<String> scope) {
    this.scope = scope;
    return this;
  }

  public OAuth2Client addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * OAuth scopes that will be requested from OAuth2 platform. Cannot be empty
   * @return scope
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScope(@javax.annotation.Nonnull List<String> scope) {
    this.scope = scope;
  }


  public OAuth2Client userInfoUri(@javax.annotation.Nullable String userInfoUri) {
    this.userInfoUri = userInfoUri;
    return this;
  }

  /**
   * User info URI of the OAuth2 provider
   * @return userInfoUri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_INFO_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserInfoUri() {
    return userInfoUri;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_INFO_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserInfoUri(@javax.annotation.Nullable String userInfoUri) {
    this.userInfoUri = userInfoUri;
  }


  public OAuth2Client userNameAttributeName(@javax.annotation.Nonnull String userNameAttributeName) {
    this.userNameAttributeName = userNameAttributeName;
    return this;
  }

  /**
   * Name of the username attribute in OAuth2 provider response. Cannot be empty
   * @return userNameAttributeName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserNameAttributeName() {
    return userNameAttributeName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserNameAttributeName(@javax.annotation.Nonnull String userNameAttributeName) {
    this.userNameAttributeName = userNameAttributeName;
  }


  public OAuth2Client jwkSetUri(@javax.annotation.Nullable String jwkSetUri) {
    this.jwkSetUri = jwkSetUri;
    return this;
  }

  /**
   * JSON Web Key URI of the OAuth2 provider
   * @return jwkSetUri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_JWK_SET_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJwkSetUri() {
    return jwkSetUri;
  }


  @JsonProperty(value = JSON_PROPERTY_JWK_SET_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwkSetUri(@javax.annotation.Nullable String jwkSetUri) {
    this.jwkSetUri = jwkSetUri;
  }


  public OAuth2Client clientAuthenticationMethod(@javax.annotation.Nonnull String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
    return this;
  }

  /**
   * Client authentication method to use: &#39;BASIC&#39; or &#39;POST&#39;. Cannot be empty
   * @return clientAuthenticationMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientAuthenticationMethod() {
    return clientAuthenticationMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientAuthenticationMethod(@javax.annotation.Nonnull String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
  }


  public OAuth2Client loginButtonLabel(@javax.annotation.Nonnull String loginButtonLabel) {
    this.loginButtonLabel = loginButtonLabel;
    return this;
  }

  /**
   * OAuth2 provider label. Cannot be empty
   * @return loginButtonLabel
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_LABEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLoginButtonLabel() {
    return loginButtonLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_LABEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoginButtonLabel(@javax.annotation.Nonnull String loginButtonLabel) {
    this.loginButtonLabel = loginButtonLabel;
  }


  public OAuth2Client loginButtonIcon(@javax.annotation.Nullable String loginButtonIcon) {
    this.loginButtonIcon = loginButtonIcon;
    return this;
  }

  /**
   * Log in button icon for OAuth2 provider
   * @return loginButtonIcon
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLoginButtonIcon() {
    return loginButtonIcon;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_ICON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginButtonIcon(@javax.annotation.Nullable String loginButtonIcon) {
    this.loginButtonIcon = loginButtonIcon;
  }


  public OAuth2Client platforms(@javax.annotation.Nullable List<PlatformType> platforms) {
    this.platforms = platforms;
    return this;
  }

  public OAuth2Client addPlatformsItem(PlatformType platformsItem) {
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
   * Return true if this OAuth2Client object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Client oauth2Client = (OAuth2Client) o;
    return Objects.equals(this.id, oauth2Client.id) &&
        Objects.equals(this.createdTime, oauth2Client.createdTime) &&
        Objects.equals(this.additionalInfo, oauth2Client.additionalInfo) &&
        Objects.equals(this.tenantId, oauth2Client.tenantId) &&
        Objects.equals(this.title, oauth2Client.title) &&
        Objects.equals(this.mapperConfig, oauth2Client.mapperConfig) &&
        Objects.equals(this.clientId, oauth2Client.clientId) &&
        Objects.equals(this.clientSecret, oauth2Client.clientSecret) &&
        Objects.equals(this.authorizationUri, oauth2Client.authorizationUri) &&
        Objects.equals(this.accessTokenUri, oauth2Client.accessTokenUri) &&
        Objects.equals(this.scope, oauth2Client.scope) &&
        Objects.equals(this.userInfoUri, oauth2Client.userInfoUri) &&
        Objects.equals(this.userNameAttributeName, oauth2Client.userNameAttributeName) &&
        Objects.equals(this.jwkSetUri, oauth2Client.jwkSetUri) &&
        Objects.equals(this.clientAuthenticationMethod, oauth2Client.clientAuthenticationMethod) &&
        Objects.equals(this.loginButtonLabel, oauth2Client.loginButtonLabel) &&
        Objects.equals(this.loginButtonIcon, oauth2Client.loginButtonIcon) &&
        Objects.equals(this.platforms, oauth2Client.platforms) &&
        Objects.equals(this.name, oauth2Client.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, title, mapperConfig, clientId, clientSecret, authorizationUri, accessTokenUri, scope, userInfoUri, userNameAttributeName, jwkSetUri, clientAuthenticationMethod, loginButtonLabel, loginButtonIcon, platforms, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Client {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    mapperConfig: ").append(toIndentedString(mapperConfig)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    authorizationUri: ").append(toIndentedString(authorizationUri)).append("\n");
    sb.append("    accessTokenUri: ").append(toIndentedString(accessTokenUri)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    userInfoUri: ").append(toIndentedString(userInfoUri)).append("\n");
    sb.append("    userNameAttributeName: ").append(toIndentedString(userNameAttributeName)).append("\n");
    sb.append("    jwkSetUri: ").append(toIndentedString(jwkSetUri)).append("\n");
    sb.append("    clientAuthenticationMethod: ").append(toIndentedString(clientAuthenticationMethod)).append("\n");
    sb.append("    loginButtonLabel: ").append(toIndentedString(loginButtonLabel)).append("\n");
    sb.append("    loginButtonIcon: ").append(toIndentedString(loginButtonIcon)).append("\n");
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

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `mapperConfig` to the URL query string
    if (getMapperConfig() != null) {
      joiner.add(getMapperConfig().toUrlQueryString(prefix + "mapperConfig" + suffix));
    }

    // add `clientId` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclientId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientId()))));
    }

    // add `clientSecret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclientSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientSecret()))));
    }

    // add `authorizationUri` to the URL query string
    if (getAuthorizationUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sauthorizationUri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAuthorizationUri()))));
    }

    // add `accessTokenUri` to the URL query string
    if (getAccessTokenUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccessTokenUri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccessTokenUri()))));
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      for (int i = 0; i < getScope().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sscope%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getScope().get(i)))));
      }
    }

    // add `userInfoUri` to the URL query string
    if (getUserInfoUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserInfoUri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserInfoUri()))));
    }

    // add `userNameAttributeName` to the URL query string
    if (getUserNameAttributeName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserNameAttributeName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserNameAttributeName()))));
    }

    // add `jwkSetUri` to the URL query string
    if (getJwkSetUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjwkSetUri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJwkSetUri()))));
    }

    // add `clientAuthenticationMethod` to the URL query string
    if (getClientAuthenticationMethod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclientAuthenticationMethod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientAuthenticationMethod()))));
    }

    // add `loginButtonLabel` to the URL query string
    if (getLoginButtonLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloginButtonLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoginButtonLabel()))));
    }

    // add `loginButtonIcon` to the URL query string
    if (getLoginButtonIcon() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloginButtonIcon%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoginButtonIcon()))));
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

