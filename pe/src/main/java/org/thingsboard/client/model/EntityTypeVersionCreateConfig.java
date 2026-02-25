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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.thingsboard.client.model.SyncStrategy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityTypeVersionCreateConfig
 */
@JsonPropertyOrder({
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_RELATIONS,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_ATTRIBUTES,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_CREDENTIALS,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_CALCULATED_FIELDS,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_PERMISSIONS,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SAVE_GROUP_ENTITIES,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_SYNC_STRATEGY,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_ENTITY_IDS,
  EntityTypeVersionCreateConfig.JSON_PROPERTY_ALL_ENTITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityTypeVersionCreateConfig {
  public static final String JSON_PROPERTY_SAVE_RELATIONS = "saveRelations";
  @javax.annotation.Nullable
  private Boolean saveRelations;

  public static final String JSON_PROPERTY_SAVE_ATTRIBUTES = "saveAttributes";
  @javax.annotation.Nullable
  private Boolean saveAttributes;

  public static final String JSON_PROPERTY_SAVE_CREDENTIALS = "saveCredentials";
  @javax.annotation.Nullable
  private Boolean saveCredentials;

  public static final String JSON_PROPERTY_SAVE_CALCULATED_FIELDS = "saveCalculatedFields";
  @javax.annotation.Nullable
  private Boolean saveCalculatedFields;

  public static final String JSON_PROPERTY_SAVE_PERMISSIONS = "savePermissions";
  @javax.annotation.Nullable
  private Boolean savePermissions;

  public static final String JSON_PROPERTY_SAVE_GROUP_ENTITIES = "saveGroupEntities";
  @javax.annotation.Nullable
  private Boolean saveGroupEntities;

  public static final String JSON_PROPERTY_SYNC_STRATEGY = "syncStrategy";
  @javax.annotation.Nullable
  private SyncStrategy syncStrategy;

  public static final String JSON_PROPERTY_ENTITY_IDS = "entityIds";
  @javax.annotation.Nullable
  private List<UUID> entityIds = new ArrayList<>();

  public static final String JSON_PROPERTY_ALL_ENTITIES = "allEntities";
  @javax.annotation.Nullable
  private Boolean allEntities;

  public EntityTypeVersionCreateConfig() { 
  }

  public EntityTypeVersionCreateConfig saveRelations(@javax.annotation.Nullable Boolean saveRelations) {
    this.saveRelations = saveRelations;
    return this;
  }

  /**
   * Get saveRelations
   * @return saveRelations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveRelations() {
    return saveRelations;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveRelations(@javax.annotation.Nullable Boolean saveRelations) {
    this.saveRelations = saveRelations;
  }


  public EntityTypeVersionCreateConfig saveAttributes(@javax.annotation.Nullable Boolean saveAttributes) {
    this.saveAttributes = saveAttributes;
    return this;
  }

  /**
   * Get saveAttributes
   * @return saveAttributes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveAttributes() {
    return saveAttributes;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveAttributes(@javax.annotation.Nullable Boolean saveAttributes) {
    this.saveAttributes = saveAttributes;
  }


  public EntityTypeVersionCreateConfig saveCredentials(@javax.annotation.Nullable Boolean saveCredentials) {
    this.saveCredentials = saveCredentials;
    return this;
  }

  /**
   * Get saveCredentials
   * @return saveCredentials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveCredentials() {
    return saveCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveCredentials(@javax.annotation.Nullable Boolean saveCredentials) {
    this.saveCredentials = saveCredentials;
  }


  public EntityTypeVersionCreateConfig saveCalculatedFields(@javax.annotation.Nullable Boolean saveCalculatedFields) {
    this.saveCalculatedFields = saveCalculatedFields;
    return this;
  }

  /**
   * Get saveCalculatedFields
   * @return saveCalculatedFields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveCalculatedFields() {
    return saveCalculatedFields;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveCalculatedFields(@javax.annotation.Nullable Boolean saveCalculatedFields) {
    this.saveCalculatedFields = saveCalculatedFields;
  }


  public EntityTypeVersionCreateConfig savePermissions(@javax.annotation.Nullable Boolean savePermissions) {
    this.savePermissions = savePermissions;
    return this;
  }

  /**
   * Get savePermissions
   * @return savePermissions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSavePermissions() {
    return savePermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSavePermissions(@javax.annotation.Nullable Boolean savePermissions) {
    this.savePermissions = savePermissions;
  }


  public EntityTypeVersionCreateConfig saveGroupEntities(@javax.annotation.Nullable Boolean saveGroupEntities) {
    this.saveGroupEntities = saveGroupEntities;
    return this;
  }

  /**
   * Get saveGroupEntities
   * @return saveGroupEntities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveGroupEntities() {
    return saveGroupEntities;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveGroupEntities(@javax.annotation.Nullable Boolean saveGroupEntities) {
    this.saveGroupEntities = saveGroupEntities;
  }


  public EntityTypeVersionCreateConfig syncStrategy(@javax.annotation.Nullable SyncStrategy syncStrategy) {
    this.syncStrategy = syncStrategy;
    return this;
  }

  /**
   * Get syncStrategy
   * @return syncStrategy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYNC_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyncStrategy getSyncStrategy() {
    return syncStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_SYNC_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncStrategy(@javax.annotation.Nullable SyncStrategy syncStrategy) {
    this.syncStrategy = syncStrategy;
  }


  public EntityTypeVersionCreateConfig entityIds(@javax.annotation.Nullable List<UUID> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public EntityTypeVersionCreateConfig addEntityIdsItem(UUID entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * Get entityIds
   * @return entityIds
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UUID> getEntityIds() {
    return entityIds;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityIds(@javax.annotation.Nullable List<UUID> entityIds) {
    this.entityIds = entityIds;
  }


  public EntityTypeVersionCreateConfig allEntities(@javax.annotation.Nullable Boolean allEntities) {
    this.allEntities = allEntities;
    return this;
  }

  /**
   * Get allEntities
   * @return allEntities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALL_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllEntities() {
    return allEntities;
  }


  @JsonProperty(value = JSON_PROPERTY_ALL_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllEntities(@javax.annotation.Nullable Boolean allEntities) {
    this.allEntities = allEntities;
  }


  /**
   * Return true if this EntityTypeVersionCreateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityTypeVersionCreateConfig entityTypeVersionCreateConfig = (EntityTypeVersionCreateConfig) o;
    return Objects.equals(this.saveRelations, entityTypeVersionCreateConfig.saveRelations) &&
        Objects.equals(this.saveAttributes, entityTypeVersionCreateConfig.saveAttributes) &&
        Objects.equals(this.saveCredentials, entityTypeVersionCreateConfig.saveCredentials) &&
        Objects.equals(this.saveCalculatedFields, entityTypeVersionCreateConfig.saveCalculatedFields) &&
        Objects.equals(this.savePermissions, entityTypeVersionCreateConfig.savePermissions) &&
        Objects.equals(this.saveGroupEntities, entityTypeVersionCreateConfig.saveGroupEntities) &&
        Objects.equals(this.syncStrategy, entityTypeVersionCreateConfig.syncStrategy) &&
        Objects.equals(this.entityIds, entityTypeVersionCreateConfig.entityIds) &&
        Objects.equals(this.allEntities, entityTypeVersionCreateConfig.allEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveRelations, saveAttributes, saveCredentials, saveCalculatedFields, savePermissions, saveGroupEntities, syncStrategy, entityIds, allEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeVersionCreateConfig {\n");
    sb.append("    saveRelations: ").append(toIndentedString(saveRelations)).append("\n");
    sb.append("    saveAttributes: ").append(toIndentedString(saveAttributes)).append("\n");
    sb.append("    saveCredentials: ").append(toIndentedString(saveCredentials)).append("\n");
    sb.append("    saveCalculatedFields: ").append(toIndentedString(saveCalculatedFields)).append("\n");
    sb.append("    savePermissions: ").append(toIndentedString(savePermissions)).append("\n");
    sb.append("    saveGroupEntities: ").append(toIndentedString(saveGroupEntities)).append("\n");
    sb.append("    syncStrategy: ").append(toIndentedString(syncStrategy)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    allEntities: ").append(toIndentedString(allEntities)).append("\n");
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

    // add `saveRelations` to the URL query string
    if (getSaveRelations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveRelations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveRelations()))));
    }

    // add `saveAttributes` to the URL query string
    if (getSaveAttributes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveAttributes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveAttributes()))));
    }

    // add `saveCredentials` to the URL query string
    if (getSaveCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveCredentials()))));
    }

    // add `saveCalculatedFields` to the URL query string
    if (getSaveCalculatedFields() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveCalculatedFields%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveCalculatedFields()))));
    }

    // add `savePermissions` to the URL query string
    if (getSavePermissions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssavePermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSavePermissions()))));
    }

    // add `saveGroupEntities` to the URL query string
    if (getSaveGroupEntities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveGroupEntities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveGroupEntities()))));
    }

    // add `syncStrategy` to the URL query string
    if (getSyncStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssyncStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSyncStrategy()))));
    }

    // add `entityIds` to the URL query string
    if (getEntityIds() != null) {
      for (int i = 0; i < getEntityIds().size(); i++) {
        if (getEntityIds().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sentityIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getEntityIds().get(i)))));
        }
      }
    }

    // add `allEntities` to the URL query string
    if (getAllEntities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallEntities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllEntities()))));
    }

    return joiner.toString();
  }
}

