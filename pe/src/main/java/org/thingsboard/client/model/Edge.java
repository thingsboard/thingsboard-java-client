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
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the edge.
 */
@JsonPropertyOrder({
  Edge.JSON_PROPERTY_ID,
  Edge.JSON_PROPERTY_CREATED_TIME,
  Edge.JSON_PROPERTY_TENANT_ID,
  Edge.JSON_PROPERTY_CUSTOMER_ID,
  Edge.JSON_PROPERTY_ROOT_RULE_CHAIN_ID,
  Edge.JSON_PROPERTY_NAME,
  Edge.JSON_PROPERTY_TYPE,
  Edge.JSON_PROPERTY_LABEL,
  Edge.JSON_PROPERTY_ROUTING_KEY,
  Edge.JSON_PROPERTY_SECRET,
  Edge.JSON_PROPERTY_EDGE_LICENSE_KEY,
  Edge.JSON_PROPERTY_CLOUD_ENDPOINT,
  Edge.JSON_PROPERTY_VERSION,
  Edge.JSON_PROPERTY_OWNER_ID,
  Edge.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Edge {
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

  public static final String JSON_PROPERTY_EDGE_LICENSE_KEY = "edgeLicenseKey";
  @javax.annotation.Nonnull
  private String edgeLicenseKey;

  public static final String JSON_PROPERTY_CLOUD_ENDPOINT = "cloudEndpoint";
  @javax.annotation.Nonnull
  private String cloudEndpoint;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public Edge() { 
  }

  @JsonCreator
  public Edge(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ROOT_RULE_CHAIN_ID) RuleChainId rootRuleChainId, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.rootRuleChainId = rootRuleChainId;
    this.ownerId = ownerId;
  }

  public Edge id(@javax.annotation.Nullable EdgeId id) {
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




  public Edge name(@javax.annotation.Nonnull String name) {
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


  public Edge type(@javax.annotation.Nonnull String type) {
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


  public Edge label(@javax.annotation.Nullable String label) {
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


  public Edge routingKey(@javax.annotation.Nonnull String routingKey) {
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


  public Edge secret(@javax.annotation.Nonnull String secret) {
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


  public Edge edgeLicenseKey(@javax.annotation.Nonnull String edgeLicenseKey) {
    this.edgeLicenseKey = edgeLicenseKey;
    return this;
  }

  /**
   * Edge license key obtained from license portal
   * @return edgeLicenseKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_EDGE_LICENSE_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEdgeLicenseKey() {
    return edgeLicenseKey;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_LICENSE_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEdgeLicenseKey(@javax.annotation.Nonnull String edgeLicenseKey) {
    this.edgeLicenseKey = edgeLicenseKey;
  }


  public Edge cloudEndpoint(@javax.annotation.Nonnull String cloudEndpoint) {
    this.cloudEndpoint = cloudEndpoint;
    return this;
  }

  /**
   * Edge uses this cloud URL to activate and periodically check it&#39;s license
   * @return cloudEndpoint
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLOUD_ENDPOINT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCloudEndpoint() {
    return cloudEndpoint;
  }


  @JsonProperty(value = JSON_PROPERTY_CLOUD_ENDPOINT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudEndpoint(@javax.annotation.Nonnull String cloudEndpoint) {
    this.cloudEndpoint = cloudEndpoint;
  }


  public Edge version(@javax.annotation.Nullable Long version) {
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


  /**
   * Get ownerId
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  public Edge additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
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
   * Return true if this Edge object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Edge edge = (Edge) o;
    return Objects.equals(this.id, edge.id) &&
        Objects.equals(this.createdTime, edge.createdTime) &&
        Objects.equals(this.tenantId, edge.tenantId) &&
        Objects.equals(this.customerId, edge.customerId) &&
        Objects.equals(this.rootRuleChainId, edge.rootRuleChainId) &&
        Objects.equals(this.name, edge.name) &&
        Objects.equals(this.type, edge.type) &&
        Objects.equals(this.label, edge.label) &&
        Objects.equals(this.routingKey, edge.routingKey) &&
        Objects.equals(this.secret, edge.secret) &&
        Objects.equals(this.edgeLicenseKey, edge.edgeLicenseKey) &&
        Objects.equals(this.cloudEndpoint, edge.cloudEndpoint) &&
        Objects.equals(this.version, edge.version) &&
        Objects.equals(this.ownerId, edge.ownerId) &&
        Objects.equals(this.additionalInfo, edge.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, rootRuleChainId, name, type, label, routingKey, secret, edgeLicenseKey, cloudEndpoint, version, ownerId, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
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
    sb.append("    edgeLicenseKey: ").append(toIndentedString(edgeLicenseKey)).append("\n");
    sb.append("    cloudEndpoint: ").append(toIndentedString(cloudEndpoint)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

    // add `edgeLicenseKey` to the URL query string
    if (getEdgeLicenseKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeLicenseKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeLicenseKey()))));
    }

    // add `cloudEndpoint` to the URL query string
    if (getCloudEndpoint() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scloudEndpoint%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCloudEndpoint()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

