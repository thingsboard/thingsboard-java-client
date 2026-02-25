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
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityViewId;
import org.thingsboard.client.model.TelemetryEntityView;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON object representing the entity view.
 */
@JsonPropertyOrder({
  EntityView.JSON_PROPERTY_ENTITY_ID,
  EntityView.JSON_PROPERTY_TENANT_ID,
  EntityView.JSON_PROPERTY_CUSTOMER_ID,
  EntityView.JSON_PROPERTY_NAME,
  EntityView.JSON_PROPERTY_TYPE,
  EntityView.JSON_PROPERTY_KEYS,
  EntityView.JSON_PROPERTY_START_TIME_MS,
  EntityView.JSON_PROPERTY_END_TIME_MS,
  EntityView.JSON_PROPERTY_VERSION,
  EntityView.JSON_PROPERTY_ID,
  EntityView.JSON_PROPERTY_CREATED_TIME,
  EntityView.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityView {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nonnull
  private EntityId entityId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_KEYS = "keys";
  @javax.annotation.Nullable
  private TelemetryEntityView keys;

  public static final String JSON_PROPERTY_START_TIME_MS = "startTimeMs";
  @javax.annotation.Nullable
  private Long startTimeMs;

  public static final String JSON_PROPERTY_END_TIME_MS = "endTimeMs";
  @javax.annotation.Nullable
  private Long endTimeMs;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private EntityViewId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public EntityView() { 
  }

  @JsonCreator
  public EntityView(
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.createdTime = createdTime;
  }

  public EntityView entityId(@javax.annotation.Nonnull EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * JSON object with the referenced Entity Id (Device or Asset).
   * @return entityId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(@javax.annotation.Nonnull EntityId entityId) {
    this.entityId = entityId;
  }


  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id. Use &#39;assignEntityViewToCustomer&#39; to change the Customer Id.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public EntityView name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Entity View name
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


  public EntityView type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Device Profile Name
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


  public EntityView keys(@javax.annotation.Nullable TelemetryEntityView keys) {
    this.keys = keys;
    return this;
  }

  /**
   * Set of telemetry and attribute keys to expose via Entity View.
   * @return keys
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TelemetryEntityView getKeys() {
    return keys;
  }


  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(@javax.annotation.Nullable TelemetryEntityView keys) {
    this.keys = keys;
  }


  public EntityView startTimeMs(@javax.annotation.Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  /**
   * Represents the start time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval;
   * @return startTimeMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTimeMs() {
    return startTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimeMs(@javax.annotation.Nullable Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  public EntityView endTimeMs(@javax.annotation.Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  /**
   * Represents the end time of the interval that is used to limit access to target device telemetry. Customer will not be able to see entity telemetry that is outside the specified interval;
   * @return endTimeMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTimeMs() {
    return endTimeMs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TIME_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTimeMs(@javax.annotation.Nullable Long endTimeMs) {
    this.endTimeMs = endTimeMs;
  }


  public EntityView version(@javax.annotation.Nullable Long version) {
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


  public EntityView id(@javax.annotation.Nullable EntityViewId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Entity View Id. Specify this field to update the Entity View. Referencing non-existing Entity View Id will cause error. Omit this field to create new Entity View.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityViewId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable EntityViewId id) {
    this.id = id;
  }


  /**
   * Timestamp of the Entity View creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public EntityView additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the device
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
   * Return true if this EntityView object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityView entityView = (EntityView) o;
    return Objects.equals(this.entityId, entityView.entityId) &&
        Objects.equals(this.tenantId, entityView.tenantId) &&
        Objects.equals(this.customerId, entityView.customerId) &&
        Objects.equals(this.name, entityView.name) &&
        Objects.equals(this.type, entityView.type) &&
        Objects.equals(this.keys, entityView.keys) &&
        Objects.equals(this.startTimeMs, entityView.startTimeMs) &&
        Objects.equals(this.endTimeMs, entityView.endTimeMs) &&
        Objects.equals(this.version, entityView.version) &&
        Objects.equals(this.id, entityView.id) &&
        Objects.equals(this.createdTime, entityView.createdTime) &&
        Objects.equals(this.additionalInfo, entityView.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, tenantId, customerId, name, type, keys, startTimeMs, endTimeMs, version, id, createdTime, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityView {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    endTimeMs: ").append(toIndentedString(endTimeMs)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `keys` to the URL query string
    if (getKeys() != null) {
      joiner.add(getKeys().toUrlQueryString(prefix + "keys" + suffix));
    }

    // add `startTimeMs` to the URL query string
    if (getStartTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTimeMs()))));
    }

    // add `endTimeMs` to the URL query string
    if (getEndTimeMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTimeMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTimeMs()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

