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
import org.thingsboard.client.model.AdminSettingsId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Mail Settings.
 */
@JsonPropertyOrder({
  AdminSettings.JSON_PROPERTY_ID,
  AdminSettings.JSON_PROPERTY_CREATED_TIME,
  AdminSettings.JSON_PROPERTY_TENANT_ID,
  AdminSettings.JSON_PROPERTY_KEY,
  AdminSettings.JSON_PROPERTY_JSON_VALUE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AdminSettings {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AdminSettingsId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private String key;

  public static final String JSON_PROPERTY_JSON_VALUE = "jsonValue";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode jsonValue;

  public AdminSettings() { 
  }

  @JsonCreator
  public AdminSettings(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public AdminSettings id(@Nullable AdminSettingsId id) {
    this.id = id;
    return this;
  }

  /**
   * The Id of the Administration Settings, auto-generated, UUID
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AdminSettingsId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AdminSettingsId id) {
    this.id = id;
  }


  /**
   * Timestamp of the settings creation, in milliseconds
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




  public AdminSettings key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * The Administration Settings key, (e.g. &#39;general&#39; or &#39;mail&#39;)
   * @return key
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@Nullable String key) {
    this.key = key;
  }


  public AdminSettings jsonValue(@Nullable com.fasterxml.jackson.databind.JsonNode jsonValue) {
    this.jsonValue = jsonValue;
    return this;
  }

  /**
   * JSON representation of the Administration Settings value
   * @return jsonValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_JSON_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getJsonValue() {
    return jsonValue;
  }


  @JsonProperty(value = JSON_PROPERTY_JSON_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsonValue(@Nullable com.fasterxml.jackson.databind.JsonNode jsonValue) {
    this.jsonValue = jsonValue;
  }


  /**
   * Return true if this AdminSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminSettings adminSettings = (AdminSettings) o;
    return Objects.equals(this.id, adminSettings.id) &&
        Objects.equals(this.createdTime, adminSettings.createdTime) &&
        Objects.equals(this.tenantId, adminSettings.tenantId) &&
        Objects.equals(this.key, adminSettings.key) &&
        Objects.equals(this.jsonValue, adminSettings.jsonValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, key, jsonValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    jsonValue: ").append(toIndentedString(jsonValue)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `jsonValue` to the URL query string
    if (getJsonValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjsonValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJsonValue()))));
    }

    return joiner.toString();
  }
}

