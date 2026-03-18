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
import java.util.UUID;
import org.thingsboard.client.model.EntitySearchDirection;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.RelationTypeGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RelationsSearchParameters
 */
@JsonPropertyOrder({
  RelationsSearchParameters.JSON_PROPERTY_ROOT_ID,
  RelationsSearchParameters.JSON_PROPERTY_ROOT_TYPE,
  RelationsSearchParameters.JSON_PROPERTY_DIRECTION,
  RelationsSearchParameters.JSON_PROPERTY_RELATION_TYPE_GROUP,
  RelationsSearchParameters.JSON_PROPERTY_MAX_LEVEL,
  RelationsSearchParameters.JSON_PROPERTY_FETCH_LAST_LEVEL_ONLY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RelationsSearchParameters {
  public static final String JSON_PROPERTY_ROOT_ID = "rootId";
  @Nullable
  private UUID rootId;

  public static final String JSON_PROPERTY_ROOT_TYPE = "rootType";
  @Nullable
  private EntityType rootType;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  @Nullable
  private EntitySearchDirection direction;

  public static final String JSON_PROPERTY_RELATION_TYPE_GROUP = "relationTypeGroup";
  @Nullable
  private RelationTypeGroup relationTypeGroup;

  public static final String JSON_PROPERTY_MAX_LEVEL = "maxLevel";
  @Nullable
  private Integer maxLevel;

  public static final String JSON_PROPERTY_FETCH_LAST_LEVEL_ONLY = "fetchLastLevelOnly";
  @Nullable
  private Boolean fetchLastLevelOnly;

  public RelationsSearchParameters() { 
  }

  public RelationsSearchParameters rootId(@Nullable UUID rootId) {
    this.rootId = rootId;
    return this;
  }

  /**
   * Root entity id to start search from.
   * @return rootId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ROOT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getRootId() {
    return rootId;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootId(@Nullable UUID rootId) {
    this.rootId = rootId;
  }


  public RelationsSearchParameters rootType(@Nullable EntityType rootType) {
    this.rootType = rootType;
    return this;
  }

  /**
   * Type of the root entity.
   * @return rootType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ROOT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getRootType() {
    return rootType;
  }


  @JsonProperty(value = JSON_PROPERTY_ROOT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootType(@Nullable EntityType rootType) {
    this.rootType = rootType;
  }


  public RelationsSearchParameters direction(@Nullable EntitySearchDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Type of the root entity.
   * @return direction
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DIRECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntitySearchDirection getDirection() {
    return direction;
  }


  @JsonProperty(value = JSON_PROPERTY_DIRECTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(@Nullable EntitySearchDirection direction) {
    this.direction = direction;
  }


  public RelationsSearchParameters relationTypeGroup(@Nullable RelationTypeGroup relationTypeGroup) {
    this.relationTypeGroup = relationTypeGroup;
    return this;
  }

  /**
   * Type of the relation.
   * @return relationTypeGroup
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE_GROUP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationTypeGroup getRelationTypeGroup() {
    return relationTypeGroup;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE_GROUP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationTypeGroup(@Nullable RelationTypeGroup relationTypeGroup) {
    this.relationTypeGroup = relationTypeGroup;
  }


  public RelationsSearchParameters maxLevel(@Nullable Integer maxLevel) {
    this.maxLevel = maxLevel;
    return this;
  }

  /**
   * Maximum level of the search depth.
   * @return maxLevel
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxLevel() {
    return maxLevel;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_LEVEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLevel(@Nullable Integer maxLevel) {
    this.maxLevel = maxLevel;
  }


  public RelationsSearchParameters fetchLastLevelOnly(@Nullable Boolean fetchLastLevelOnly) {
    this.fetchLastLevelOnly = fetchLastLevelOnly;
    return this;
  }

  /**
   * Fetch entities that match the last level of search. Useful to find Devices that are strictly &#39;maxLevel&#39; relations away from the root entity.
   * @return fetchLastLevelOnly
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FETCH_LAST_LEVEL_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFetchLastLevelOnly() {
    return fetchLastLevelOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_FETCH_LAST_LEVEL_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFetchLastLevelOnly(@Nullable Boolean fetchLastLevelOnly) {
    this.fetchLastLevelOnly = fetchLastLevelOnly;
  }


  /**
   * Return true if this RelationsSearchParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationsSearchParameters relationsSearchParameters = (RelationsSearchParameters) o;
    return Objects.equals(this.rootId, relationsSearchParameters.rootId) &&
        Objects.equals(this.rootType, relationsSearchParameters.rootType) &&
        Objects.equals(this.direction, relationsSearchParameters.direction) &&
        Objects.equals(this.relationTypeGroup, relationsSearchParameters.relationTypeGroup) &&
        Objects.equals(this.maxLevel, relationsSearchParameters.maxLevel) &&
        Objects.equals(this.fetchLastLevelOnly, relationsSearchParameters.fetchLastLevelOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootId, rootType, direction, relationTypeGroup, maxLevel, fetchLastLevelOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationsSearchParameters {\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    rootType: ").append(toIndentedString(rootType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    relationTypeGroup: ").append(toIndentedString(relationTypeGroup)).append("\n");
    sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
    sb.append("    fetchLastLevelOnly: ").append(toIndentedString(fetchLastLevelOnly)).append("\n");
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

    // add `rootId` to the URL query string
    if (getRootId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srootId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRootId()))));
    }

    // add `rootType` to the URL query string
    if (getRootType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srootType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRootType()))));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdirection%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDirection()))));
    }

    // add `relationTypeGroup` to the URL query string
    if (getRelationTypeGroup() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelationTypeGroup%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelationTypeGroup()))));
    }

    // add `maxLevel` to the URL query string
    if (getMaxLevel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxLevel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxLevel()))));
    }

    // add `fetchLastLevelOnly` to the URL query string
    if (getFetchLastLevelOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfetchLastLevelOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFetchLastLevelOnly()))));
    }

    return joiner.toString();
  }
}

