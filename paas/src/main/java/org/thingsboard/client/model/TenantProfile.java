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
import org.thingsboard.client.model.TenantProfileData;
import org.thingsboard.client.model.TenantProfileId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the tenant profile.
 */
@JsonPropertyOrder({
  TenantProfile.JSON_PROPERTY_ID,
  TenantProfile.JSON_PROPERTY_CREATED_TIME,
  TenantProfile.JSON_PROPERTY_NAME,
  TenantProfile.JSON_PROPERTY_DESCRIPTION,
  TenantProfile.JSON_PROPERTY_DEFAULT,
  TenantProfile.JSON_PROPERTY_ISOLATED_TB_RULE_ENGINE,
  TenantProfile.JSON_PROPERTY_PROFILE_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantProfile {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private TenantProfileId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  @javax.annotation.Nullable
  private Boolean _default;

  public static final String JSON_PROPERTY_ISOLATED_TB_RULE_ENGINE = "isolatedTbRuleEngine";
  @javax.annotation.Nullable
  private Boolean isolatedTbRuleEngine;

  public static final String JSON_PROPERTY_PROFILE_DATA = "profileData";
  @javax.annotation.Nullable
  private TenantProfileData profileData;

  public TenantProfile() { 
  }

  @JsonCreator
  public TenantProfile(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public TenantProfile id(@javax.annotation.Nullable TenantProfileId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the tenant profile Id. Specify this field to update the tenant profile. Referencing non-existing tenant profile Id will cause error. Omit this field to create new tenant profile.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantProfileId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable TenantProfileId id) {
    this.id = id;
  }


  /**
   * Timestamp of the tenant profile creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public TenantProfile name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tenant profile
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


  public TenantProfile description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the tenant profile
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public TenantProfile _default(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Default Tenant profile to be used.
   * @return _default
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
  }


  public TenantProfile isolatedTbRuleEngine(@javax.annotation.Nullable Boolean isolatedTbRuleEngine) {
    this.isolatedTbRuleEngine = isolatedTbRuleEngine;
    return this;
  }

  /**
   * If enabled, will push all messages related to this tenant and processed by the rule engine into separate queue. Useful for complex microservices deployments, to isolate processing of the data for specific tenants
   * @return isolatedTbRuleEngine
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ISOLATED_TB_RULE_ENGINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsolatedTbRuleEngine() {
    return isolatedTbRuleEngine;
  }


  @JsonProperty(value = JSON_PROPERTY_ISOLATED_TB_RULE_ENGINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsolatedTbRuleEngine(@javax.annotation.Nullable Boolean isolatedTbRuleEngine) {
    this.isolatedTbRuleEngine = isolatedTbRuleEngine;
  }


  public TenantProfile profileData(@javax.annotation.Nullable TenantProfileData profileData) {
    this.profileData = profileData;
    return this;
  }

  /**
   * Get profileData
   * @return profileData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantProfileData getProfileData() {
    return profileData;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileData(@javax.annotation.Nullable TenantProfileData profileData) {
    this.profileData = profileData;
  }


  /**
   * Return true if this TenantProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantProfile tenantProfile = (TenantProfile) o;
    return Objects.equals(this.id, tenantProfile.id) &&
        Objects.equals(this.createdTime, tenantProfile.createdTime) &&
        Objects.equals(this.name, tenantProfile.name) &&
        Objects.equals(this.description, tenantProfile.description) &&
        Objects.equals(this._default, tenantProfile._default) &&
        Objects.equals(this.isolatedTbRuleEngine, tenantProfile.isolatedTbRuleEngine) &&
        Objects.equals(this.profileData, tenantProfile.profileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, name, description, _default, isolatedTbRuleEngine, profileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    isolatedTbRuleEngine: ").append(toIndentedString(isolatedTbRuleEngine)).append("\n");
    sb.append("    profileData: ").append(toIndentedString(profileData)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    // add `isolatedTbRuleEngine` to the URL query string
    if (getIsolatedTbRuleEngine() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sisolatedTbRuleEngine%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIsolatedTbRuleEngine()))));
    }

    // add `profileData` to the URL query string
    if (getProfileData() != null) {
      joiner.add(getProfileData().toUrlQueryString(prefix + "profileData" + suffix));
    }

    return joiner.toString();
  }
}

