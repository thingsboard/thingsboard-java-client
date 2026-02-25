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
import org.thingsboard.client.model.MapperType;
import org.thingsboard.client.model.OAuth2BasicMapperConfig;
import org.thingsboard.client.model.OAuth2CustomMapperConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OAuth2MapperConfig
 */
@JsonPropertyOrder({
  OAuth2MapperConfig.JSON_PROPERTY_ALLOW_USER_CREATION,
  OAuth2MapperConfig.JSON_PROPERTY_ACTIVATE_USER,
  OAuth2MapperConfig.JSON_PROPERTY_TYPE,
  OAuth2MapperConfig.JSON_PROPERTY_BASIC,
  OAuth2MapperConfig.JSON_PROPERTY_CUSTOM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OAuth2MapperConfig {
  public static final String JSON_PROPERTY_ALLOW_USER_CREATION = "allowUserCreation";
  @javax.annotation.Nullable
  private Boolean allowUserCreation;

  public static final String JSON_PROPERTY_ACTIVATE_USER = "activateUser";
  @javax.annotation.Nullable
  private Boolean activateUser;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private MapperType type;

  public static final String JSON_PROPERTY_BASIC = "basic";
  @javax.annotation.Nullable
  private OAuth2BasicMapperConfig basic;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  @javax.annotation.Nullable
  private OAuth2CustomMapperConfig custom;

  public OAuth2MapperConfig() { 
  }

  public OAuth2MapperConfig allowUserCreation(@javax.annotation.Nullable Boolean allowUserCreation) {
    this.allowUserCreation = allowUserCreation;
    return this;
  }

  /**
   * Whether user should be created if not yet present on the platform after successful authentication
   * @return allowUserCreation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOW_USER_CREATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowUserCreation() {
    return allowUserCreation;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOW_USER_CREATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUserCreation(@javax.annotation.Nullable Boolean allowUserCreation) {
    this.allowUserCreation = allowUserCreation;
  }


  public OAuth2MapperConfig activateUser(@javax.annotation.Nullable Boolean activateUser) {
    this.activateUser = activateUser;
    return this;
  }

  /**
   * Whether user credentials should be activated when user is created after successful authentication
   * @return activateUser
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVATE_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActivateUser() {
    return activateUser;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVATE_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivateUser(@javax.annotation.Nullable Boolean activateUser) {
    this.activateUser = activateUser;
  }


  public OAuth2MapperConfig type(@javax.annotation.Nonnull MapperType type) {
    this.type = type;
    return this;
  }

  /**
   * Type of OAuth2 mapper. Depending on this param, different mapper config fields must be specified
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MapperType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull MapperType type) {
    this.type = type;
  }


  public OAuth2MapperConfig basic(@javax.annotation.Nullable OAuth2BasicMapperConfig basic) {
    this.basic = basic;
    return this;
  }

  /**
   * Mapper config for BASIC and GITHUB mapper types
   * @return basic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BASIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OAuth2BasicMapperConfig getBasic() {
    return basic;
  }


  @JsonProperty(value = JSON_PROPERTY_BASIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasic(@javax.annotation.Nullable OAuth2BasicMapperConfig basic) {
    this.basic = basic;
  }


  public OAuth2MapperConfig custom(@javax.annotation.Nullable OAuth2CustomMapperConfig custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Mapper config for CUSTOM mapper type
   * @return custom
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OAuth2CustomMapperConfig getCustom() {
    return custom;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustom(@javax.annotation.Nullable OAuth2CustomMapperConfig custom) {
    this.custom = custom;
  }


  /**
   * Return true if this OAuth2MapperConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2MapperConfig oauth2MapperConfig = (OAuth2MapperConfig) o;
    return Objects.equals(this.allowUserCreation, oauth2MapperConfig.allowUserCreation) &&
        Objects.equals(this.activateUser, oauth2MapperConfig.activateUser) &&
        Objects.equals(this.type, oauth2MapperConfig.type) &&
        Objects.equals(this.basic, oauth2MapperConfig.basic) &&
        Objects.equals(this.custom, oauth2MapperConfig.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowUserCreation, activateUser, type, basic, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2MapperConfig {\n");
    sb.append("    allowUserCreation: ").append(toIndentedString(allowUserCreation)).append("\n");
    sb.append("    activateUser: ").append(toIndentedString(activateUser)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

    // add `allowUserCreation` to the URL query string
    if (getAllowUserCreation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallowUserCreation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllowUserCreation()))));
    }

    // add `activateUser` to the URL query string
    if (getActivateUser() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactivateUser%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActivateUser()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `basic` to the URL query string
    if (getBasic() != null) {
      joiner.add(getBasic().toUrlQueryString(prefix + "basic" + suffix));
    }

    // add `custom` to the URL query string
    if (getCustom() != null) {
      joiner.add(getCustom().toUrlQueryString(prefix + "custom" + suffix));
    }

    return joiner.toString();
  }
}

