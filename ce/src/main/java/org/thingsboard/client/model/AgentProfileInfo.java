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
import org.thingsboard.client.model.AgentProfileId;
import org.thingsboard.client.model.AgentProvisionType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentProfileInfo
 */
@JsonPropertyOrder({
  AgentProfileInfo.JSON_PROPERTY_ID,
  AgentProfileInfo.JSON_PROPERTY_CREATED_TIME,
  AgentProfileInfo.JSON_PROPERTY_TENANT_ID,
  AgentProfileInfo.JSON_PROPERTY_NAME,
  AgentProfileInfo.JSON_PROPERTY_DESCRIPTION,
  AgentProfileInfo.JSON_PROPERTY_PROVISION_KEY,
  AgentProfileInfo.JSON_PROPERTY_PROVISION_SECRET,
  AgentProfileInfo.JSON_PROPERTY_PROVISION_TYPE,
  AgentProfileInfo.JSON_PROPERTY_VERSION,
  AgentProfileInfo.JSON_PROPERTY_DEFAULT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentProfileInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentProfileId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nullable
  private String description;

  public static final String JSON_PROPERTY_PROVISION_KEY = "provisionKey";
  @Nullable
  private String provisionKey;

  public static final String JSON_PROPERTY_PROVISION_SECRET = "provisionSecret";
  @Nullable
  private String provisionSecret;

  public static final String JSON_PROPERTY_PROVISION_TYPE = "provisionType";
  @Nullable
  private AgentProvisionType provisionType;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  @Nullable
  private Boolean _default;

  public AgentProfileInfo() { 
  }

  @JsonCreator
  public AgentProfileInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public AgentProfileInfo id(@Nullable AgentProfileId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent Profile Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentProfileId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentProfileId id) {
    this.id = id;
  }


  /**
   * Timestamp of the profile creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public AgentProfileInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique profile name within tenant
   * @return name
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@Nonnull String name) {
    this.name = name;
  }


  public AgentProfileInfo description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Profile description
   * @return description
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@Nullable String description) {
    this.description = description;
  }


  public AgentProfileInfo provisionKey(@Nullable String provisionKey) {
    this.provisionKey = provisionKey;
    return this;
  }

  /**
   * Provision key for future auto-provisioning
   * @return provisionKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvisionKey() {
    return provisionKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionKey(@Nullable String provisionKey) {
    this.provisionKey = provisionKey;
  }


  public AgentProfileInfo provisionSecret(@Nullable String provisionSecret) {
    this.provisionSecret = provisionSecret;
    return this;
  }

  /**
   * Provision secret for future auto-provisioning
   * @return provisionSecret
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvisionSecret() {
    return provisionSecret;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_SECRET, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionSecret(@Nullable String provisionSecret) {
    this.provisionSecret = provisionSecret;
  }


  public AgentProfileInfo provisionType(@Nullable AgentProvisionType provisionType) {
    this.provisionType = provisionType;
    return this;
  }

  /**
   * Provisioning strategy. DISABLED by default.
   * @return provisionType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentProvisionType getProvisionType() {
    return provisionType;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionType(@Nullable AgentProvisionType provisionType) {
    this.provisionType = provisionType;
  }


  public AgentProfileInfo version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  public AgentProfileInfo _default(@Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Used to mark the default profile that will be assigned to agents when no profile is specified.
   * @return _default
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@Nullable Boolean _default) {
    this._default = _default;
  }


  /**
   * Return true if this AgentProfileInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentProfileInfo agentProfileInfo = (AgentProfileInfo) o;
    return Objects.equals(this.id, agentProfileInfo.id) &&
        Objects.equals(this.createdTime, agentProfileInfo.createdTime) &&
        Objects.equals(this.tenantId, agentProfileInfo.tenantId) &&
        Objects.equals(this.name, agentProfileInfo.name) &&
        Objects.equals(this.description, agentProfileInfo.description) &&
        Objects.equals(this.provisionKey, agentProfileInfo.provisionKey) &&
        Objects.equals(this.provisionSecret, agentProfileInfo.provisionSecret) &&
        Objects.equals(this.provisionType, agentProfileInfo.provisionType) &&
        Objects.equals(this.version, agentProfileInfo.version) &&
        Objects.equals(this._default, agentProfileInfo._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, description, provisionKey, provisionSecret, provisionType, version, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentProfileInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provisionKey: ").append(toIndentedString(provisionKey)).append("\n");
    sb.append("    provisionSecret: ").append(toIndentedString(provisionSecret)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `provisionKey` to the URL query string
    if (getProvisionKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovisionKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionKey()))));
    }

    // add `provisionSecret` to the URL query string
    if (getProvisionSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovisionSecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionSecret()))));
    }

    // add `provisionType` to the URL query string
    if (getProvisionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovisionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionType()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    return joiner.toString();
  }
}

