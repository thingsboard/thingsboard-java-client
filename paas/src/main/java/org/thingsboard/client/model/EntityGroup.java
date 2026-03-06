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
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the entity group.
 */
@JsonPropertyOrder({
  EntityGroup.JSON_PROPERTY_ID,
  EntityGroup.JSON_PROPERTY_CREATED_TIME,
  EntityGroup.JSON_PROPERTY_TYPE,
  EntityGroup.JSON_PROPERTY_NAME,
  EntityGroup.JSON_PROPERTY_OWNER_ID,
  EntityGroup.JSON_PROPERTY_ADDITIONAL_INFO,
  EntityGroup.JSON_PROPERTY_CONFIGURATION,
  EntityGroup.JSON_PROPERTY_VERSION,
  EntityGroup.JSON_PROPERTY_GROUP_ALL,
  EntityGroup.JSON_PROPERTY_EDGE_GROUP_ALL,
  EntityGroup.JSON_PROPERTY_TENANT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityGroup {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private EntityGroupId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TENANT(EntityType.valueOf("TENANT")),
    
    CUSTOMER(EntityType.valueOf("CUSTOMER")),
    
    USER(EntityType.valueOf("USER")),
    
    DASHBOARD(EntityType.valueOf("DASHBOARD")),
    
    ASSET(EntityType.valueOf("ASSET")),
    
    DEVICE(EntityType.valueOf("DEVICE")),
    
    ALARM(EntityType.valueOf("ALARM")),
    
    ENTITY_GROUP(EntityType.valueOf("ENTITY_GROUP")),
    
    CONVERTER(EntityType.valueOf("CONVERTER")),
    
    INTEGRATION(EntityType.valueOf("INTEGRATION")),
    
    RULE_CHAIN(EntityType.valueOf("RULE_CHAIN")),
    
    RULE_NODE(EntityType.valueOf("RULE_NODE")),
    
    SCHEDULER_EVENT(EntityType.valueOf("SCHEDULER_EVENT")),
    
    BLOB_ENTITY(EntityType.valueOf("BLOB_ENTITY")),
    
    REPORT_TEMPLATE(EntityType.valueOf("REPORT_TEMPLATE")),
    
    REPORT(EntityType.valueOf("REPORT")),
    
    ENTITY_VIEW(EntityType.valueOf("ENTITY_VIEW")),
    
    WIDGETS_BUNDLE(EntityType.valueOf("WIDGETS_BUNDLE")),
    
    WIDGET_TYPE(EntityType.valueOf("WIDGET_TYPE")),
    
    ROLE(EntityType.valueOf("ROLE")),
    
    GROUP_PERMISSION(EntityType.valueOf("GROUP_PERMISSION")),
    
    TENANT_PROFILE(EntityType.valueOf("TENANT_PROFILE")),
    
    DEVICE_PROFILE(EntityType.valueOf("DEVICE_PROFILE")),
    
    ASSET_PROFILE(EntityType.valueOf("ASSET_PROFILE")),
    
    API_USAGE_STATE(EntityType.valueOf("API_USAGE_STATE")),
    
    TB_RESOURCE(EntityType.valueOf("TB_RESOURCE")),
    
    OTA_PACKAGE(EntityType.valueOf("OTA_PACKAGE")),
    
    EDGE(EntityType.valueOf("EDGE")),
    
    RPC(EntityType.valueOf("RPC")),
    
    QUEUE(EntityType.valueOf("QUEUE")),
    
    NOTIFICATION_TARGET(EntityType.valueOf("NOTIFICATION_TARGET")),
    
    NOTIFICATION_TEMPLATE(EntityType.valueOf("NOTIFICATION_TEMPLATE")),
    
    NOTIFICATION_REQUEST(EntityType.valueOf("NOTIFICATION_REQUEST")),
    
    NOTIFICATION(EntityType.valueOf("NOTIFICATION")),
    
    NOTIFICATION_RULE(EntityType.valueOf("NOTIFICATION_RULE")),
    
    QUEUE_STATS(EntityType.valueOf("QUEUE_STATS")),
    
    OAUTH2_CLIENT(EntityType.valueOf("OAUTH2_CLIENT")),
    
    DOMAIN(EntityType.valueOf("DOMAIN")),
    
    MOBILE_APP(EntityType.valueOf("MOBILE_APP")),
    
    MOBILE_APP_BUNDLE(EntityType.valueOf("MOBILE_APP_BUNDLE")),
    
    CALCULATED_FIELD(EntityType.valueOf("CALCULATED_FIELD")),
    
    JOB(EntityType.valueOf("JOB")),
    
    SECRET(EntityType.valueOf("SECRET")),
    
    ADMIN_SETTINGS(EntityType.valueOf("ADMIN_SETTINGS")),
    
    AI_MODEL(EntityType.valueOf("AI_MODEL")),
    
    API_KEY(EntityType.valueOf("API_KEY")),
    
    BILLING_CUSTOMER(EntityType.valueOf("BILLING_CUSTOMER")),
    
    SUBSCRIPTION_PLAN(EntityType.valueOf("SUBSCRIPTION_PLAN")),
    
    SUBSCRIPTION(EntityType.valueOf("SUBSCRIPTION")),
    
    COUPON(EntityType.valueOf("COUPON")),
    
    PRODUCT(EntityType.valueOf("PRODUCT")),
    
    SUBSCRIPTION_ADDON(EntityType.valueOf("SUBSCRIPTION_ADDON"));

    private EntityType value;

    TypeEnum(EntityType value) {
      this.value = value;
    }

    @JsonValue
    public EntityType getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(EntityType value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode _configuration;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_GROUP_ALL = "groupAll";
  @javax.annotation.Nullable
  private Boolean groupAll;

  public static final String JSON_PROPERTY_EDGE_GROUP_ALL = "edgeGroupAll";
  @javax.annotation.Nullable
  private Boolean edgeGroupAll;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public EntityGroup() { 
  }

  @JsonCreator
  public EntityGroup(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_EDGE_GROUP_ALL) Boolean edgeGroupAll
  ) {
  this();
    this.createdTime = createdTime;
    this.edgeGroupAll = edgeGroupAll;
  }

  public EntityGroup id(@javax.annotation.Nullable EntityGroupId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the EntityGroupId Id. Specify this field to update the Entity Group. Referencing non-existing Entity Group Id will cause error. Omit this field to create new Entity Group.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable EntityGroupId id) {
    this.id = id;
  }


  /**
   * Timestamp of the entity group creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public EntityGroup type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public EntityGroup name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the entity group
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


  public EntityGroup ownerId(@javax.annotation.Nullable EntityId ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * JSON object with the owner of the group - Tenant or Customer Id.
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }


  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(@javax.annotation.Nullable EntityId ownerId) {
    this.ownerId = ownerId;
  }


  public EntityGroup additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the entity group. May include: &#39;description&#39; (string), &#39;isPublic&#39; (boolean, whether this group is shared publicly), &#39;publicCustomerId&#39; (string, UUID of the public customer associated with this group).
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


  public EntityGroup _configuration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON with the configuration for UI components: list of columns, settings, actions, etc 
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode _configuration) {
    this._configuration = _configuration;
  }


  public EntityGroup version(@javax.annotation.Nullable Long version) {
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


  public EntityGroup groupAll(@javax.annotation.Nullable Boolean groupAll) {
    this.groupAll = groupAll;
    return this;
  }

  /**
   * Indicates special group &#39;All&#39; that contains all entities and can&#39;t be deleted.
   * @return groupAll
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUP_ALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getGroupAll() {
    return groupAll;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_ALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupAll(@javax.annotation.Nullable Boolean groupAll) {
    this.groupAll = groupAll;
  }


  /**
   * Indicates special edge group &#39;All&#39; that contains all entities and can&#39;t be deleted.
   * @return edgeGroupAll
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_GROUP_ALL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdgeGroupAll() {
    return edgeGroupAll;
  }




  public EntityGroup tenantId(@javax.annotation.Nullable TenantId tenantId) {
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


  /**
   * Return true if this EntityGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityGroup entityGroup = (EntityGroup) o;
    return Objects.equals(this.id, entityGroup.id) &&
        Objects.equals(this.createdTime, entityGroup.createdTime) &&
        Objects.equals(this.type, entityGroup.type) &&
        Objects.equals(this.name, entityGroup.name) &&
        Objects.equals(this.ownerId, entityGroup.ownerId) &&
        Objects.equals(this.additionalInfo, entityGroup.additionalInfo) &&
        Objects.equals(this._configuration, entityGroup._configuration) &&
        Objects.equals(this.version, entityGroup.version) &&
        Objects.equals(this.groupAll, entityGroup.groupAll) &&
        Objects.equals(this.edgeGroupAll, entityGroup.edgeGroupAll) &&
        Objects.equals(this.tenantId, entityGroup.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, type, name, ownerId, additionalInfo, _configuration, version, groupAll, edgeGroupAll, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    groupAll: ").append(toIndentedString(groupAll)).append("\n");
    sb.append("    edgeGroupAll: ").append(toIndentedString(edgeGroupAll)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfiguration()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `groupAll` to the URL query string
    if (getGroupAll() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgroupAll%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGroupAll()))));
    }

    // add `edgeGroupAll` to the URL query string
    if (getEdgeGroupAll() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeGroupAll%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeGroupAll()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    return joiner.toString();
  }
}

