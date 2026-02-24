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
  EntityTypeLoadResult.JSON_PROPERTY_DELETED,
  EntityTypeLoadResult.JSON_PROPERTY_GROUPS_CREATED,
  EntityTypeLoadResult.JSON_PROPERTY_GROUPS_UPDATED,
  EntityTypeLoadResult.JSON_PROPERTY_GROUPS_DELETED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityTypeLoadResult {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @javax.annotation.Nullable
  private EntityType entityType;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable
  private Integer created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @javax.annotation.Nullable
  private Integer updated;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  @javax.annotation.Nullable
  private Integer deleted;

  public static final String JSON_PROPERTY_GROUPS_CREATED = "groupsCreated";
  @javax.annotation.Nullable
  private Integer groupsCreated;

  public static final String JSON_PROPERTY_GROUPS_UPDATED = "groupsUpdated";
  @javax.annotation.Nullable
  private Integer groupsUpdated;

  public static final String JSON_PROPERTY_GROUPS_DELETED = "groupsDeleted";
  @javax.annotation.Nullable
  private Integer groupsDeleted;

  public EntityTypeLoadResult() { 
  }

  public EntityTypeLoadResult entityType(@javax.annotation.Nullable EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(@javax.annotation.Nullable EntityType entityType) {
    this.entityType = entityType;
  }


  public EntityTypeLoadResult created(@javax.annotation.Nullable Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable Integer created) {
    this.created = created;
  }


  public EntityTypeLoadResult updated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
  }


  public EntityTypeLoadResult deleted(@javax.annotation.Nullable Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDeleted() {
    return deleted;
  }


  @JsonProperty(value = JSON_PROPERTY_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(@javax.annotation.Nullable Integer deleted) {
    this.deleted = deleted;
  }


  public EntityTypeLoadResult groupsCreated(@javax.annotation.Nullable Integer groupsCreated) {
    this.groupsCreated = groupsCreated;
    return this;
  }

  /**
   * Get groupsCreated
   * @return groupsCreated
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getGroupsCreated() {
    return groupsCreated;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupsCreated(@javax.annotation.Nullable Integer groupsCreated) {
    this.groupsCreated = groupsCreated;
  }


  public EntityTypeLoadResult groupsUpdated(@javax.annotation.Nullable Integer groupsUpdated) {
    this.groupsUpdated = groupsUpdated;
    return this;
  }

  /**
   * Get groupsUpdated
   * @return groupsUpdated
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getGroupsUpdated() {
    return groupsUpdated;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupsUpdated(@javax.annotation.Nullable Integer groupsUpdated) {
    this.groupsUpdated = groupsUpdated;
  }


  public EntityTypeLoadResult groupsDeleted(@javax.annotation.Nullable Integer groupsDeleted) {
    this.groupsDeleted = groupsDeleted;
    return this;
  }

  /**
   * Get groupsDeleted
   * @return groupsDeleted
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getGroupsDeleted() {
    return groupsDeleted;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS_DELETED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupsDeleted(@javax.annotation.Nullable Integer groupsDeleted) {
    this.groupsDeleted = groupsDeleted;
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
        Objects.equals(this.deleted, entityTypeLoadResult.deleted) &&
        Objects.equals(this.groupsCreated, entityTypeLoadResult.groupsCreated) &&
        Objects.equals(this.groupsUpdated, entityTypeLoadResult.groupsUpdated) &&
        Objects.equals(this.groupsDeleted, entityTypeLoadResult.groupsDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, created, updated, deleted, groupsCreated, groupsUpdated, groupsDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeLoadResult {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    groupsCreated: ").append(toIndentedString(groupsCreated)).append("\n");
    sb.append("    groupsUpdated: ").append(toIndentedString(groupsUpdated)).append("\n");
    sb.append("    groupsDeleted: ").append(toIndentedString(groupsDeleted)).append("\n");
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

    // add `groupsCreated` to the URL query string
    if (getGroupsCreated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgroupsCreated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGroupsCreated()))));
    }

    // add `groupsUpdated` to the URL query string
    if (getGroupsUpdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgroupsUpdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGroupsUpdated()))));
    }

    // add `groupsDeleted` to the URL query string
    if (getGroupsDeleted() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sgroupsDeleted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getGroupsDeleted()))));
    }

    return joiner.toString();
  }
}

