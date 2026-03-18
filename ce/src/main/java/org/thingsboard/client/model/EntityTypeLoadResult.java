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
import org.thingsboard.client.model.EntityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityTypeLoadResult
 */
@JsonPropertyOrder({
  EntityTypeLoadResult.JSON_PROPERTY_ENTITY_TYPE,
  EntityTypeLoadResult.JSON_PROPERTY_CREATED,
  EntityTypeLoadResult.JSON_PROPERTY_UPDATED,
  EntityTypeLoadResult.JSON_PROPERTY_DELETED
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityTypeLoadResult {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @Nullable
  private EntityType entityType;

  public static final String JSON_PROPERTY_CREATED = "created";
  @Nullable
  private Integer created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @Nullable
  private Integer updated;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  @Nullable
  private Integer deleted;

  public EntityTypeLoadResult() { 
  }

  public EntityTypeLoadResult entityType(@Nullable EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(@Nullable EntityType entityType) {
    this.entityType = entityType;
  }


  public EntityTypeLoadResult created(@Nullable Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@Nullable Integer created) {
    this.created = created;
  }


  public EntityTypeLoadResult updated(@Nullable Integer updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@Nullable Integer updated) {
    this.updated = updated;
  }


  public EntityTypeLoadResult deleted(@Nullable Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDeleted() {
    return deleted;
  }


  @JsonProperty(value = JSON_PROPERTY_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(@Nullable Integer deleted) {
    this.deleted = deleted;
  }


  /**
   * Return true if this EntityTypeLoadResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityTypeLoadResult entityTypeLoadResult = (EntityTypeLoadResult) o;
    return Objects.equals(this.entityType, entityTypeLoadResult.entityType) &&
        Objects.equals(this.created, entityTypeLoadResult.created) &&
        Objects.equals(this.updated, entityTypeLoadResult.updated) &&
        Objects.equals(this.deleted, entityTypeLoadResult.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, created, updated, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeLoadResult {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityType()))));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreated()))));
    }

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdated()))));
    }

    // add `deleted` to the URL query string
    if (getDeleted() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeleted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeleted()))));
    }

    return joiner.toString();
  }
}

