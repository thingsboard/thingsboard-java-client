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
import org.thingsboard.client.model.EdgeId;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EdgeInfo
 */
@JsonPropertyOrder({
  EdgeInfo.JSON_PROPERTY_ID,
  EdgeInfo.JSON_PROPERTY_CREATED_TIME,
  EdgeInfo.JSON_PROPERTY_TENANT_ID,
  EdgeInfo.JSON_PROPERTY_CUSTOMER_ID,
  EdgeInfo.JSON_PROPERTY_ROOT_RULE_CHAIN_ID,
  EdgeInfo.JSON_PROPERTY_NAME,
  EdgeInfo.JSON_PROPERTY_TYPE,
  EdgeInfo.JSON_PROPERTY_LABEL,
  EdgeInfo.JSON_PROPERTY_ROUTING_KEY,
  EdgeInfo.JSON_PROPERTY_SECRET,
  EdgeInfo.JSON_PROPERTY_VERSION,
  EdgeInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  EdgeInfo.JSON_PROPERTY_CUSTOMER_IS_PUBLIC,
  EdgeInfo.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EdgeInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private EdgeId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ROOT_RULE_CHAIN_ID = "rootRuleChainId";
  @javax.annotation.Nullable
  private RuleChainId rootRuleChainId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_ROUTING_KEY = "routingKey";
  @javax.annotation.Nonnull
  private String routingKey;

  public static final String JSON_PROPERTY_SECRET = "secret";
  @javax.annotation.Nonnull
  private String secret;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @javax.annotation.Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_CUSTOMER_IS_PUBLIC = "customerIsPublic";
  @javax.annotation.Nullable
  private Boolean customerIsPublic;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public EdgeInfo() { 
  }

  @JsonCreator
  public EdgeInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ROOT_RULE_CHAIN_ID) RuleChainId rootRuleChainId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.rootRuleChainId = rootRuleChainId;
  }

  public EdgeInfo id(@javax.annotation.Nullable EdgeId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Edge Id. Specify this field to update the Edge. Referencing non-existing Edge Id will cause error. Omit this field to create new Edge.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EdgeId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable EdgeId id) {
    this.id = id;
  }


  /**
   * Timestamp of the edge creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Use &#39;assignDeviceToTenant&#39; to change the Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id. Use &#39;assignEdgeToCustomer&#39; to change the Customer Id.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  /**
   * JSON object with Root Rule Chain Id. Use &#39;setEdgeRootRuleChain&#39; to change the Root Rule Chain Id.
   * @return rootRuleChainId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ROOT_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getRootRuleChainId() {
    return rootRuleChainId;
  }




  public EdgeInfo name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Edge Name in scope of Tenant
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


  public EdgeInfo type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Edge type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public EdgeInfo label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Label that may be used in widgets
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public EdgeInfo routingKey(@javax.annotation.Nonnull String routingKey) {
    this.routingKey = routingKey;
    return this;
  }

  /**
   * Edge routing key (&#39;username&#39;) to authorize on cloud
   * @return routingKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRoutingKey() {
    return routingKey;
  }


  @JsonProperty(value = JSON_PROPERTY_ROUTING_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingKey(@javax.annotation.Nonnull String routingKey) {
    this.routingKey = routingKey;
  }


  public EdgeInfo secret(@javax.annotation.Nonnull String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Edge secret (&#39;password&#39;) to authorize on cloud
   * @return secret
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecret() {
    return secret;
  }


  @JsonProperty(value = JSON_PROPERTY_SECRET, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecret(@javax.annotation.Nonnull String secret) {
    this.secret = secret;
  }


  public EdgeInfo version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  public EdgeInfo customerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = customerTitle;
    return this;
  }

  /**
   * Get customerTitle
   * @return customerTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerTitle(@javax.annotation.Nullable String customerTitle) {
    this.customerTitle = customerTitle;
  }


  public EdgeInfo customerIsPublic(@javax.annotation.Nullable Boolean customerIsPublic) {
    this.customerIsPublic = customerIsPublic;
    return this;
  }

  /**
   * Get customerIsPublic
   * @return customerIsPublic
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerIsPublic() {
    return customerIsPublic;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerIsPublic(@javax.annotation.Nullable Boolean customerIsPublic) {
    this.customerIsPublic = customerIsPublic;
  }


  public EdgeInfo additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
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
   * Return true if this EdgeInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeInfo edgeInfo = (EdgeInfo) o;
    return Objects.equals(this.id, edgeInfo.id) &&
        Objects.equals(this.createdTime, edgeInfo.createdTime) &&
        Objects.equals(this.tenantId, edgeInfo.tenantId) &&
        Objects.equals(this.customerId, edgeInfo.customerId) &&
        Objects.equals(this.rootRuleChainId, edgeInfo.rootRuleChainId) &&
        Objects.equals(this.name, edgeInfo.name) &&
        Objects.equals(this.type, edgeInfo.type) &&
        Objects.equals(this.label, edgeInfo.label) &&
        Objects.equals(this.routingKey, edgeInfo.routingKey) &&
        Objects.equals(this.secret, edgeInfo.secret) &&
        Objects.equals(this.version, edgeInfo.version) &&
        Objects.equals(this.customerTitle, edgeInfo.customerTitle) &&
        Objects.equals(this.customerIsPublic, edgeInfo.customerIsPublic) &&
        Objects.equals(this.additionalInfo, edgeInfo.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, rootRuleChainId, name, type, label, routingKey, secret, version, customerTitle, customerIsPublic, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    rootRuleChainId: ").append(toIndentedString(rootRuleChainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    customerIsPublic: ").append(toIndentedString(customerIsPublic)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `rootRuleChainId` to the URL query string
    if (getRootRuleChainId() != null) {
      joiner.add(getRootRuleChainId().toUrlQueryString(prefix + "rootRuleChainId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `routingKey` to the URL query string
    if (getRoutingKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sroutingKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRoutingKey()))));
    }

    // add `secret` to the URL query string
    if (getSecret() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecret%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecret()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `customerIsPublic` to the URL query string
    if (getCustomerIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerIsPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerIsPublic()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

