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
import org.thingsboard.client.model.ApiKeyId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the API key.
 */
@JsonPropertyOrder({
  ApiKeyInfo.JSON_PROPERTY_ID,
  ApiKeyInfo.JSON_PROPERTY_CREATED_TIME,
  ApiKeyInfo.JSON_PROPERTY_TENANT_ID,
  ApiKeyInfo.JSON_PROPERTY_USER_ID,
  ApiKeyInfo.JSON_PROPERTY_EXPIRATION_TIME,
  ApiKeyInfo.JSON_PROPERTY_DESCRIPTION,
  ApiKeyInfo.JSON_PROPERTY_ENABLED,
  ApiKeyInfo.JSON_PROPERTY_EXPIRED
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ApiKeyInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private ApiKeyId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @Nullable
  private UserId userId;

  public static final String JSON_PROPERTY_EXPIRATION_TIME = "expirationTime";
  @Nullable
  private Long expirationTime;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @Nonnull
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  @Nullable
  private Boolean expired;

  public ApiKeyInfo() { 
  }

  @JsonCreator
  public ApiKeyInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_EXPIRED) Boolean expired
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.expired = expired;
  }

  public ApiKeyInfo id(@Nullable ApiKeyId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the API Key Id. Specify this field to update the API Key. Referencing non-existing API Key Id will cause error. Omit this field to create new API Key.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApiKeyId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable ApiKeyId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Tenant Id of the API key cannot be changed.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public ApiKeyInfo userId(@Nullable UserId userId) {
    this.userId = userId;
    return this;
  }

  /**
   * JSON object with User Id. User Id of the API key cannot be changed.
   * @return userId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getUserId() {
    return userId;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(@Nullable UserId userId) {
    this.userId = userId;
  }


  public ApiKeyInfo expirationTime(@Nullable Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Expiration time of the API key.
   * @return expirationTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpirationTime() {
    return expirationTime;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationTime(@Nullable Long expirationTime) {
    this.expirationTime = expirationTime;
  }


  public ApiKeyInfo description(@Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * API Key description.
   * @return description
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@Nonnull String description) {
    this.description = description;
  }


  public ApiKeyInfo enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enabled/disabled API key.
   * @return enabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Indicates if the API key is expired based on current time. Returns false if expirationTime is 0 (no expiry).
   * @return expired
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExpired() {
    return expired;
  }




  /**
   * Return true if this ApiKeyInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyInfo apiKeyInfo = (ApiKeyInfo) o;
    return Objects.equals(this.id, apiKeyInfo.id) &&
        Objects.equals(this.createdTime, apiKeyInfo.createdTime) &&
        Objects.equals(this.tenantId, apiKeyInfo.tenantId) &&
        Objects.equals(this.userId, apiKeyInfo.userId) &&
        Objects.equals(this.expirationTime, apiKeyInfo.expirationTime) &&
        Objects.equals(this.description, apiKeyInfo.description) &&
        Objects.equals(this.enabled, apiKeyInfo.enabled) &&
        Objects.equals(this.expired, apiKeyInfo.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, userId, expirationTime, description, enabled, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(getUserId().toUrlQueryString(prefix + "userId" + suffix));
    }

    // add `expirationTime` to the URL query string
    if (getExpirationTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpirationTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpirationTime()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `expired` to the URL query string
    if (getExpired() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpired%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpired()))));
    }

    return joiner.toString();
  }
}

