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
import org.thingsboard.client.model.AiModelConfig;
import org.thingsboard.client.model.AiModelId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AI model with the same JSON shape as an AI model, except that &#39;configuration.providerConfig&#39; is always null, so provider credentials are never exposed
 */
@JsonPropertyOrder({
  AiModelInfo.JSON_PROPERTY_ID,
  AiModelInfo.JSON_PROPERTY_CREATED_TIME,
  AiModelInfo.JSON_PROPERTY_TENANT_ID,
  AiModelInfo.JSON_PROPERTY_VERSION,
  AiModelInfo.JSON_PROPERTY_NAME,
  AiModelInfo.JSON_PROPERTY_CUSTOMER_ACCESS_ENABLED,
  AiModelInfo.JSON_PROPERTY_CONFIGURATION,
  AiModelInfo.JSON_PROPERTY_EXTERNAL_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AiModelInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AiModelId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_CUSTOMER_ACCESS_ENABLED = "customerAccessEnabled";
  @Nullable
  private Boolean customerAccessEnabled;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nullable
  private AiModelConfig _configuration;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @Nullable
  private AiModelId externalId;

  public AiModelInfo() { 
  }

  public AiModelInfo id(@Nullable AiModelId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiModelId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AiModelId id) {
    this.id = id;
  }


  public AiModelInfo createdTime(@Nullable Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedTime(@Nullable Long createdTime) {
    this.createdTime = createdTime;
  }


  public AiModelInfo tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public AiModelInfo version(@Nullable Long version) {
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


  public AiModelInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public AiModelInfo customerAccessEnabled(@Nullable Boolean customerAccessEnabled) {
    this.customerAccessEnabled = customerAccessEnabled;
    return this;
  }

  /**
   * Get customerAccessEnabled
   * @return customerAccessEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ACCESS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerAccessEnabled() {
    return customerAccessEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ACCESS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerAccessEnabled(@Nullable Boolean customerAccessEnabled) {
    this.customerAccessEnabled = customerAccessEnabled;
  }


  public AiModelInfo _configuration(@Nullable AiModelConfig _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiModelConfig getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@Nullable AiModelConfig _configuration) {
    this._configuration = _configuration;
  }


  public AiModelInfo externalId(@Nullable AiModelId externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiModelId getExternalId() {
    return externalId;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@Nullable AiModelId externalId) {
    this.externalId = externalId;
  }


  /**
   * Return true if this AiModelInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiModelInfo aiModelInfo = (AiModelInfo) o;
    return Objects.equals(this.id, aiModelInfo.id) &&
        Objects.equals(this.createdTime, aiModelInfo.createdTime) &&
        Objects.equals(this.tenantId, aiModelInfo.tenantId) &&
        Objects.equals(this.version, aiModelInfo.version) &&
        Objects.equals(this.name, aiModelInfo.name) &&
        Objects.equals(this.customerAccessEnabled, aiModelInfo.customerAccessEnabled) &&
        Objects.equals(this._configuration, aiModelInfo._configuration) &&
        Objects.equals(this.externalId, aiModelInfo.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, version, name, customerAccessEnabled, _configuration, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiModelInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerAccessEnabled: ").append(toIndentedString(customerAccessEnabled)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `customerAccessEnabled` to the URL query string
    if (getCustomerAccessEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerAccessEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerAccessEnabled()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      joiner.add(getExternalId().toUrlQueryString(prefix + "externalId" + suffix));
    }

    return joiner.toString();
  }
}

