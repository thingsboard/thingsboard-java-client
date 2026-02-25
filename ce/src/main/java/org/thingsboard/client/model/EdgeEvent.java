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
import java.util.UUID;
import org.thingsboard.client.model.EdgeEventActionType;
import org.thingsboard.client.model.EdgeEventId;
import org.thingsboard.client.model.EdgeEventType;
import org.thingsboard.client.model.EdgeId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EdgeEvent
 */
@JsonPropertyOrder({
  EdgeEvent.JSON_PROPERTY_ID,
  EdgeEvent.JSON_PROPERTY_CREATED_TIME,
  EdgeEvent.JSON_PROPERTY_SEQ_ID,
  EdgeEvent.JSON_PROPERTY_TENANT_ID,
  EdgeEvent.JSON_PROPERTY_EDGE_ID,
  EdgeEvent.JSON_PROPERTY_ACTION,
  EdgeEvent.JSON_PROPERTY_ENTITY_ID,
  EdgeEvent.JSON_PROPERTY_UID,
  EdgeEvent.JSON_PROPERTY_TYPE,
  EdgeEvent.JSON_PROPERTY_BODY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EdgeEvent {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private EdgeEventId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_SEQ_ID = "seqId";
  @javax.annotation.Nullable
  private Long seqId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_EDGE_ID = "edgeId";
  @javax.annotation.Nullable
  private EdgeId edgeId;

  public static final String JSON_PROPERTY_ACTION = "action";
  @javax.annotation.Nullable
  private EdgeEventActionType action;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private UUID entityId;

  public static final String JSON_PROPERTY_UID = "uid";
  @javax.annotation.Nullable
  private String uid;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private EdgeEventType type;

  public static final String JSON_PROPERTY_BODY = "body";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode body = null;

  public EdgeEvent() { 
  }

  @JsonCreator
  public EdgeEvent(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public EdgeEvent id(@javax.annotation.Nullable EdgeEventId id) {
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
  public EdgeEventId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable EdgeEventId id) {
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




  public EdgeEvent seqId(@javax.annotation.Nullable Long seqId) {
    this.seqId = seqId;
    return this;
  }

  /**
   * Get seqId
   * @return seqId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SEQ_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSeqId() {
    return seqId;
  }


  @JsonProperty(value = JSON_PROPERTY_SEQ_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeqId(@javax.annotation.Nullable Long seqId) {
    this.seqId = seqId;
  }


  public EdgeEvent tenantId(@javax.annotation.Nullable TenantId tenantId) {
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


  public EdgeEvent edgeId(@javax.annotation.Nullable EdgeId edgeId) {
    this.edgeId = edgeId;
    return this;
  }

  /**
   * Get edgeId
   * @return edgeId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EdgeId getEdgeId() {
    return edgeId;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeId(@javax.annotation.Nullable EdgeId edgeId) {
    this.edgeId = edgeId;
  }


  public EdgeEvent action(@javax.annotation.Nullable EdgeEventActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EdgeEventActionType getAction() {
    return action;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(@javax.annotation.Nullable EdgeEventActionType action) {
    this.action = action;
  }


  public EdgeEvent entityId(@javax.annotation.Nullable UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable UUID entityId) {
    this.entityId = entityId;
  }


  public EdgeEvent uid(@javax.annotation.Nullable String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUid() {
    return uid;
  }


  @JsonProperty(value = JSON_PROPERTY_UID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(@javax.annotation.Nullable String uid) {
    this.uid = uid;
  }


  public EdgeEvent type(@javax.annotation.Nullable EdgeEventType type) {
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
  public EdgeEventType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable EdgeEventType type) {
    this.type = type;
  }


  public EdgeEvent body(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getBody() {
    return body;
  }


  @JsonProperty(value = JSON_PROPERTY_BODY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode body) {
    this.body = body;
  }


  /**
   * Return true if this EdgeEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeEvent edgeEvent = (EdgeEvent) o;
    return Objects.equals(this.id, edgeEvent.id) &&
        Objects.equals(this.createdTime, edgeEvent.createdTime) &&
        Objects.equals(this.seqId, edgeEvent.seqId) &&
        Objects.equals(this.tenantId, edgeEvent.tenantId) &&
        Objects.equals(this.edgeId, edgeEvent.edgeId) &&
        Objects.equals(this.action, edgeEvent.action) &&
        Objects.equals(this.entityId, edgeEvent.entityId) &&
        Objects.equals(this.uid, edgeEvent.uid) &&
        Objects.equals(this.type, edgeEvent.type) &&
        Objects.equals(this.body, edgeEvent.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, seqId, tenantId, edgeId, action, entityId, uid, type, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `seqId` to the URL query string
    if (getSeqId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseqId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeqId()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `edgeId` to the URL query string
    if (getEdgeId() != null) {
      joiner.add(getEdgeId().toUrlQueryString(prefix + "edgeId" + suffix));
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saction%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAction()))));
    }

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityId()))));
    }

    // add `uid` to the URL query string
    if (getUid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUid()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `body` to the URL query string
    if (getBody() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbody%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBody()))));
    }

    return joiner.toString();
  }
}

