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
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EventId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EventInfo
 */
@JsonPropertyOrder({
  EventInfo.JSON_PROPERTY_ID,
  EventInfo.JSON_PROPERTY_CREATED_TIME,
  EventInfo.JSON_PROPERTY_TENANT_ID,
  EventInfo.JSON_PROPERTY_TYPE,
  EventInfo.JSON_PROPERTY_UID,
  EventInfo.JSON_PROPERTY_ENTITY_ID,
  EventInfo.JSON_PROPERTY_BODY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EventInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private EventId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private String type;

  public static final String JSON_PROPERTY_UID = "uid";
  @Nullable
  private String uid;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_BODY = "body";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode body = null;

  public EventInfo() { 
  }

  @JsonCreator
  public EventInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_ENTITY_ID) EntityId entityId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.entityId = entityId;
  }

  public EventInfo id(@Nullable EventId id) {
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
  public EventId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable EventId id) {
    this.id = id;
  }


  /**
   * Timestamp of the event creation, in milliseconds
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




  public EventInfo type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Event type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable String type) {
    this.type = type;
  }


  public EventInfo uid(@Nullable String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * string
   * @return uid
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUid() {
    return uid;
  }


  @JsonProperty(value = JSON_PROPERTY_UID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(@Nullable String uid) {
    this.uid = uid;
  }


  /**
   * JSON object with Entity Id for which event is created.
   * @return entityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }




  public EventInfo body(@Nullable com.fasterxml.jackson.databind.JsonNode body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getBody() {
    return body;
  }


  @JsonProperty(value = JSON_PROPERTY_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(@Nullable com.fasterxml.jackson.databind.JsonNode body) {
    this.body = body;
  }


  /**
   * Return true if this EventInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInfo eventInfo = (EventInfo) o;
    return Objects.equals(this.id, eventInfo.id) &&
        Objects.equals(this.createdTime, eventInfo.createdTime) &&
        Objects.equals(this.tenantId, eventInfo.tenantId) &&
        Objects.equals(this.type, eventInfo.type) &&
        Objects.equals(this.uid, eventInfo.uid) &&
        Objects.equals(this.entityId, eventInfo.entityId) &&
        Objects.equals(this.body, eventInfo.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, type, uid, entityId, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `uid` to the URL query string
    if (getUid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUid()))));
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `body` to the URL query string
    if (getBody() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbody%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBody()))));
    }

    return joiner.toString();
  }
}

