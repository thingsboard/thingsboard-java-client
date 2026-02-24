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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.DomainId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.WhiteLabelingType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * WhiteLabeling
 */
@JsonPropertyOrder({
  WhiteLabeling.JSON_PROPERTY_TENANT_ID,
  WhiteLabeling.JSON_PROPERTY_CUSTOMER_ID,
  WhiteLabeling.JSON_PROPERTY_TYPE,
  WhiteLabeling.JSON_PROPERTY_SETTINGS,
  WhiteLabeling.JSON_PROPERTY_DOMAIN_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class WhiteLabeling {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private WhiteLabelingType type;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode settings = null;

  public static final String JSON_PROPERTY_DOMAIN_ID = "domainId";
  @javax.annotation.Nullable
  private DomainId domainId;

  public WhiteLabeling() { 
  }

  public WhiteLabeling tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
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


  public WhiteLabeling customerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public WhiteLabeling type(@javax.annotation.Nullable WhiteLabelingType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WhiteLabelingType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable WhiteLabelingType type) {
    this.type = type;
  }


  public WhiteLabeling settings(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getSettings() {
    return settings;
  }


  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode settings) {
    this.settings = settings;
  }


  public WhiteLabeling domainId(@javax.annotation.Nullable DomainId domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * Get domainId
   * @return domainId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOMAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DomainId getDomainId() {
    return domainId;
  }


  @JsonProperty(value = JSON_PROPERTY_DOMAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainId(@javax.annotation.Nullable DomainId domainId) {
    this.domainId = domainId;
  }


  /**
   * Return true if this WhiteLabeling object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhiteLabeling whiteLabeling = (WhiteLabeling) o;
    return Objects.equals(this.tenantId, whiteLabeling.tenantId) &&
        Objects.equals(this.customerId, whiteLabeling.customerId) &&
        Objects.equals(this.type, whiteLabeling.type) &&
        Objects.equals(this.settings, whiteLabeling.settings) &&
        Objects.equals(this.domainId, whiteLabeling.domainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, customerId, type, settings, domainId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhiteLabeling {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssettings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSettings()))));
    }

    // add `domainId` to the URL query string
    if (getDomainId() != null) {
      joiner.add(getDomainId().toUrlQueryString(prefix + "domainId" + suffix));
    }

    return joiner.toString();
  }
}

