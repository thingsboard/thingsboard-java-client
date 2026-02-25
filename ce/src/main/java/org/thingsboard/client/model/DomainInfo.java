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
import org.thingsboard.client.model.DomainId;
import org.thingsboard.client.model.OAuth2ClientInfo;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DomainInfo
 */
@JsonPropertyOrder({
  DomainInfo.JSON_PROPERTY_ID,
  DomainInfo.JSON_PROPERTY_CREATED_TIME,
  DomainInfo.JSON_PROPERTY_TENANT_ID,
  DomainInfo.JSON_PROPERTY_NAME,
  DomainInfo.JSON_PROPERTY_OAUTH2_ENABLED,
  DomainInfo.JSON_PROPERTY_PROPAGATE_TO_EDGE,
  DomainInfo.JSON_PROPERTY_OAUTH2_CLIENT_INFOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DomainInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private DomainId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_OAUTH2_ENABLED = "oauth2Enabled";
  @javax.annotation.Nullable
  private Boolean oauth2Enabled;

  public static final String JSON_PROPERTY_PROPAGATE_TO_EDGE = "propagateToEdge";
  @javax.annotation.Nullable
  private Boolean propagateToEdge;

  public static final String JSON_PROPERTY_OAUTH2_CLIENT_INFOS = "oauth2ClientInfos";
  @javax.annotation.Nullable
  private List<OAuth2ClientInfo> oauth2ClientInfos = new ArrayList<>();

  public DomainInfo() { 
  }

  @JsonCreator
  public DomainInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public DomainInfo id(@javax.annotation.Nullable DomainId id) {
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
  public DomainId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable DomainId id) {
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




  public DomainInfo tenantId(@javax.annotation.Nullable TenantId tenantId) {
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


  public DomainInfo name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Domain name. Cannot be empty
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public DomainInfo oauth2Enabled(@javax.annotation.Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
    return this;
  }

  /**
   * Whether OAuth2 settings are enabled or not
   * @return oauth2Enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOauth2Enabled() {
    return oauth2Enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH2_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth2Enabled(@javax.annotation.Nullable Boolean oauth2Enabled) {
    this.oauth2Enabled = oauth2Enabled;
  }


  public DomainInfo propagateToEdge(@javax.annotation.Nullable Boolean propagateToEdge) {
    this.propagateToEdge = propagateToEdge;
    return this;
  }

  /**
   * Whether OAuth2 settings are enabled on Edge or not
   * @return propagateToEdge
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToEdge() {
    return propagateToEdge;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToEdge(@javax.annotation.Nullable Boolean propagateToEdge) {
    this.propagateToEdge = propagateToEdge;
  }


  public DomainInfo oauth2ClientInfos(@javax.annotation.Nullable List<OAuth2ClientInfo> oauth2ClientInfos) {
    this.oauth2ClientInfos = oauth2ClientInfos;
    return this;
  }

  public DomainInfo addOauth2ClientInfosItem(OAuth2ClientInfo oauth2ClientInfosItem) {
    if (this.oauth2ClientInfos == null) {
      this.oauth2ClientInfos = new ArrayList<>();
    }
    this.oauth2ClientInfos.add(oauth2ClientInfosItem);
    return this;
  }

  /**
   * List of available oauth2 clients
   * @return oauth2ClientInfos
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OAUTH2_CLIENT_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuth2ClientInfo> getOauth2ClientInfos() {
    return oauth2ClientInfos;
  }


  @JsonProperty(value = JSON_PROPERTY_OAUTH2_CLIENT_INFOS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauth2ClientInfos(@javax.annotation.Nullable List<OAuth2ClientInfo> oauth2ClientInfos) {
    this.oauth2ClientInfos = oauth2ClientInfos;
  }


  /**
   * Return true if this DomainInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainInfo domainInfo = (DomainInfo) o;
    return Objects.equals(this.id, domainInfo.id) &&
        Objects.equals(this.createdTime, domainInfo.createdTime) &&
        Objects.equals(this.tenantId, domainInfo.tenantId) &&
        Objects.equals(this.name, domainInfo.name) &&
        Objects.equals(this.oauth2Enabled, domainInfo.oauth2Enabled) &&
        Objects.equals(this.propagateToEdge, domainInfo.propagateToEdge) &&
        Objects.equals(this.oauth2ClientInfos, domainInfo.oauth2ClientInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, oauth2Enabled, propagateToEdge, oauth2ClientInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oauth2Enabled: ").append(toIndentedString(oauth2Enabled)).append("\n");
    sb.append("    propagateToEdge: ").append(toIndentedString(propagateToEdge)).append("\n");
    sb.append("    oauth2ClientInfos: ").append(toIndentedString(oauth2ClientInfos)).append("\n");
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

    // add `oauth2Enabled` to the URL query string
    if (getOauth2Enabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soauth2Enabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOauth2Enabled()))));
    }

    // add `propagateToEdge` to the URL query string
    if (getPropagateToEdge() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToEdge%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToEdge()))));
    }

    // add `oauth2ClientInfos` to the URL query string
    if (getOauth2ClientInfos() != null) {
      for (int i = 0; i < getOauth2ClientInfos().size(); i++) {
        if (getOauth2ClientInfos().get(i) != null) {
          joiner.add(getOauth2ClientInfos().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%soauth2ClientInfos%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

