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
import org.thingsboard.client.model.OAuth2ClientRegistrationTemplateId;
import org.thingsboard.client.model.OAuth2MapperConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OAuth2ClientRegistrationTemplate
 */
@JsonPropertyOrder({
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_ID,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_CREATED_TIME,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_PROVIDER_ID,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_MAPPER_CONFIG,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_AUTHORIZATION_URI,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_ACCESS_TOKEN_URI,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_SCOPE,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_USER_INFO_URI,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_JWK_SET_URI,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_COMMENT,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_LOGIN_BUTTON_ICON,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_LOGIN_BUTTON_LABEL,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_HELP_LINK,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_NAME,
  OAuth2ClientRegistrationTemplate.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class OAuth2ClientRegistrationTemplate {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private OAuth2ClientRegistrationTemplateId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  @javax.annotation.Nonnull
  private String providerId;

  public static final String JSON_PROPERTY_MAPPER_CONFIG = "mapperConfig";
  @javax.annotation.Nullable
  private OAuth2MapperConfig mapperConfig;

  public static final String JSON_PROPERTY_AUTHORIZATION_URI = "authorizationUri";
  @javax.annotation.Nullable
  private String authorizationUri;

  public static final String JSON_PROPERTY_ACCESS_TOKEN_URI = "accessTokenUri";
  @javax.annotation.Nullable
  private String accessTokenUri;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable
  private List<String> scope = new ArrayList<>();

  public static final String JSON_PROPERTY_USER_INFO_URI = "userInfoUri";
  @javax.annotation.Nullable
  private String userInfoUri;

  public static final String JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME = "userNameAttributeName";
  @javax.annotation.Nullable
  private String userNameAttributeName;

  public static final String JSON_PROPERTY_JWK_SET_URI = "jwkSetUri";
  @javax.annotation.Nullable
  private String jwkSetUri;

  public static final String JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD = "clientAuthenticationMethod";
  @javax.annotation.Nullable
  private String clientAuthenticationMethod;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  @javax.annotation.Nullable
  private String comment;

  public static final String JSON_PROPERTY_LOGIN_BUTTON_ICON = "loginButtonIcon";
  @javax.annotation.Nullable
  private String loginButtonIcon;

  public static final String JSON_PROPERTY_LOGIN_BUTTON_LABEL = "loginButtonLabel";
  @javax.annotation.Nullable
  private String loginButtonLabel;

  public static final String JSON_PROPERTY_HELP_LINK = "helpLink";
  @javax.annotation.Nullable
  private String helpLink;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public OAuth2ClientRegistrationTemplate() { 
  }

  @JsonCreator
  public OAuth2ClientRegistrationTemplate(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public OAuth2ClientRegistrationTemplate id(@javax.annotation.Nullable OAuth2ClientRegistrationTemplateId id) {
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
  public OAuth2ClientRegistrationTemplateId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable OAuth2ClientRegistrationTemplateId id) {
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




  public OAuth2ClientRegistrationTemplate providerId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * OAuth2 provider identifier (e.g. its name)
   * @return providerId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDER_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(@javax.annotation.Nonnull String providerId) {
    this.providerId = providerId;
  }


  public OAuth2ClientRegistrationTemplate mapperConfig(@javax.annotation.Nullable OAuth2MapperConfig mapperConfig) {
    this.mapperConfig = mapperConfig;
    return this;
  }

  /**
   * Default config for mapping OAuth2 log in response to platform entities
   * @return mapperConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAPPER_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OAuth2MapperConfig getMapperConfig() {
    return mapperConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_MAPPER_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapperConfig(@javax.annotation.Nullable OAuth2MapperConfig mapperConfig) {
    this.mapperConfig = mapperConfig;
  }


  public OAuth2ClientRegistrationTemplate authorizationUri(@javax.annotation.Nullable String authorizationUri) {
    this.authorizationUri = authorizationUri;
    return this;
  }

  /**
   * Default authorization URI of the OAuth2 provider
   * @return authorizationUri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AUTHORIZATION_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthorizationUri() {
    return authorizationUri;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTHORIZATION_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationUri(@javax.annotation.Nullable String authorizationUri) {
    this.authorizationUri = authorizationUri;
  }


  public OAuth2ClientRegistrationTemplate accessTokenUri(@javax.annotation.Nullable String accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
    return this;
  }

  /**
   * Default access token URI of the OAuth2 provider
   * @return accessTokenUri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccessTokenUri() {
    return accessTokenUri;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS_TOKEN_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessTokenUri(@javax.annotation.Nullable String accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
  }


  public OAuth2ClientRegistrationTemplate scope(@javax.annotation.Nullable List<String> scope) {
    this.scope = scope;
    return this;
  }

  public OAuth2ClientRegistrationTemplate addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Default OAuth scopes that will be requested from OAuth2 platform
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(@javax.annotation.Nullable List<String> scope) {
    this.scope = scope;
  }


  public OAuth2ClientRegistrationTemplate userInfoUri(@javax.annotation.Nullable String userInfoUri) {
    this.userInfoUri = userInfoUri;
    return this;
  }

  /**
   * Default user info URI of the OAuth2 provider
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


  public OAuth2ClientRegistrationTemplate userNameAttributeName(@javax.annotation.Nullable String userNameAttributeName) {
    this.userNameAttributeName = userNameAttributeName;
    return this;
  }

  /**
   * Default name of the username attribute in OAuth2 provider log in response
   * @return userNameAttributeName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserNameAttributeName() {
    return userNameAttributeName;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_NAME_ATTRIBUTE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserNameAttributeName(@javax.annotation.Nullable String userNameAttributeName) {
    this.userNameAttributeName = userNameAttributeName;
  }


  public OAuth2ClientRegistrationTemplate jwkSetUri(@javax.annotation.Nullable String jwkSetUri) {
    this.jwkSetUri = jwkSetUri;
    return this;
  }

  /**
   * Default JSON Web Key URI of the OAuth2 provider
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


  public OAuth2ClientRegistrationTemplate clientAuthenticationMethod(@javax.annotation.Nullable String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
    return this;
  }

  /**
   * Default client authentication method to use: &#39;BASIC&#39; or &#39;POST&#39;
   * @return clientAuthenticationMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientAuthenticationMethod() {
    return clientAuthenticationMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_CLIENT_AUTHENTICATION_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAuthenticationMethod(@javax.annotation.Nullable String clientAuthenticationMethod) {
    this.clientAuthenticationMethod = clientAuthenticationMethod;
  }


  public OAuth2ClientRegistrationTemplate comment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comment for OAuth2 provider
   * @return comment
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getComment() {
    return comment;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(@javax.annotation.Nullable String comment) {
    this.comment = comment;
  }


  public OAuth2ClientRegistrationTemplate loginButtonIcon(@javax.annotation.Nullable String loginButtonIcon) {
    this.loginButtonIcon = loginButtonIcon;
    return this;
  }

  /**
   * Default log in button icon for OAuth2 provider
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


  public OAuth2ClientRegistrationTemplate loginButtonLabel(@javax.annotation.Nullable String loginButtonLabel) {
    this.loginButtonLabel = loginButtonLabel;
    return this;
  }

  /**
   * Default OAuth2 provider label
   * @return loginButtonLabel
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLoginButtonLabel() {
    return loginButtonLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_LOGIN_BUTTON_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginButtonLabel(@javax.annotation.Nullable String loginButtonLabel) {
    this.loginButtonLabel = loginButtonLabel;
  }


  public OAuth2ClientRegistrationTemplate helpLink(@javax.annotation.Nullable String helpLink) {
    this.helpLink = helpLink;
    return this;
  }

  /**
   * Help link for OAuth2 provider
   * @return helpLink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HELP_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHelpLink() {
    return helpLink;
  }


  @JsonProperty(value = JSON_PROPERTY_HELP_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelpLink(@javax.annotation.Nullable String helpLink) {
    this.helpLink = helpLink;
  }


  public OAuth2ClientRegistrationTemplate name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
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


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OAuth2ClientRegistrationTemplate additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this OAuth2ClientRegistrationTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ClientRegistrationTemplate oauth2ClientRegistrationTemplate = (OAuth2ClientRegistrationTemplate) o;
    return Objects.equals(this.id, oauth2ClientRegistrationTemplate.id) &&
        Objects.equals(this.createdTime, oauth2ClientRegistrationTemplate.createdTime) &&
        Objects.equals(this.providerId, oauth2ClientRegistrationTemplate.providerId) &&
        Objects.equals(this.mapperConfig, oauth2ClientRegistrationTemplate.mapperConfig) &&
        Objects.equals(this.authorizationUri, oauth2ClientRegistrationTemplate.authorizationUri) &&
        Objects.equals(this.accessTokenUri, oauth2ClientRegistrationTemplate.accessTokenUri) &&
        Objects.equals(this.scope, oauth2ClientRegistrationTemplate.scope) &&
        Objects.equals(this.userInfoUri, oauth2ClientRegistrationTemplate.userInfoUri) &&
        Objects.equals(this.userNameAttributeName, oauth2ClientRegistrationTemplate.userNameAttributeName) &&
        Objects.equals(this.jwkSetUri, oauth2ClientRegistrationTemplate.jwkSetUri) &&
        Objects.equals(this.clientAuthenticationMethod, oauth2ClientRegistrationTemplate.clientAuthenticationMethod) &&
        Objects.equals(this.comment, oauth2ClientRegistrationTemplate.comment) &&
        Objects.equals(this.loginButtonIcon, oauth2ClientRegistrationTemplate.loginButtonIcon) &&
        Objects.equals(this.loginButtonLabel, oauth2ClientRegistrationTemplate.loginButtonLabel) &&
        Objects.equals(this.helpLink, oauth2ClientRegistrationTemplate.helpLink) &&
        Objects.equals(this.name, oauth2ClientRegistrationTemplate.name) &&
        Objects.equals(this.additionalInfo, oauth2ClientRegistrationTemplate.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, providerId, mapperConfig, authorizationUri, accessTokenUri, scope, userInfoUri, userNameAttributeName, jwkSetUri, clientAuthenticationMethod, comment, loginButtonIcon, loginButtonLabel, helpLink, name, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ClientRegistrationTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    mapperConfig: ").append(toIndentedString(mapperConfig)).append("\n");
    sb.append("    authorizationUri: ").append(toIndentedString(authorizationUri)).append("\n");
    sb.append("    accessTokenUri: ").append(toIndentedString(accessTokenUri)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    userInfoUri: ").append(toIndentedString(userInfoUri)).append("\n");
    sb.append("    userNameAttributeName: ").append(toIndentedString(userNameAttributeName)).append("\n");
    sb.append("    jwkSetUri: ").append(toIndentedString(jwkSetUri)).append("\n");
    sb.append("    clientAuthenticationMethod: ").append(toIndentedString(clientAuthenticationMethod)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    loginButtonIcon: ").append(toIndentedString(loginButtonIcon)).append("\n");
    sb.append("    loginButtonLabel: ").append(toIndentedString(loginButtonLabel)).append("\n");
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sproviderId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProviderId()))));
    }

    // add `mapperConfig` to the URL query string
    if (getMapperConfig() != null) {
      joiner.add(getMapperConfig().toUrlQueryString(prefix + "mapperConfig" + suffix));
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

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComment()))));
    }

    // add `loginButtonIcon` to the URL query string
    if (getLoginButtonIcon() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloginButtonIcon%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoginButtonIcon()))));
    }

    // add `loginButtonLabel` to the URL query string
    if (getLoginButtonLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloginButtonLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoginButtonLabel()))));
    }

    // add `helpLink` to the URL query string
    if (getHelpLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shelpLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHelpLink()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

