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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.EntityGroupId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * MergedGroupTypePermissionInfo
 */
@JsonPropertyOrder({
  MergedGroupTypePermissionInfo.JSON_PROPERTY_ENTITY_GROUP_IDS,
  MergedGroupTypePermissionInfo.JSON_PROPERTY_HAS_GENERIC_READ
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class MergedGroupTypePermissionInfo {
  public static final String JSON_PROPERTY_ENTITY_GROUP_IDS = "entityGroupIds";
  @Nullable
  private List<EntityGroupId> entityGroupIds = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_GENERIC_READ = "hasGenericRead";
  @Nullable
  private Boolean hasGenericRead;

  public MergedGroupTypePermissionInfo() { 
  }

  public MergedGroupTypePermissionInfo entityGroupIds(@Nullable List<EntityGroupId> entityGroupIds) {
    this.entityGroupIds = entityGroupIds;
    return this;
  }

  public MergedGroupTypePermissionInfo addEntityGroupIdsItem(EntityGroupId entityGroupIdsItem) {
    if (this.entityGroupIds == null) {
      this.entityGroupIds = new ArrayList<>();
    }
    this.entityGroupIds.add(entityGroupIdsItem);
    return this;
  }

  /**
   * List of Entity Groups in case of group roles are assigned to the user (user group)
   * @return entityGroupIds
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityGroupId> getEntityGroupIds() {
    return entityGroupIds;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupIds(@Nullable List<EntityGroupId> entityGroupIds) {
    this.entityGroupIds = entityGroupIds;
  }


  public MergedGroupTypePermissionInfo hasGenericRead(@Nullable Boolean hasGenericRead) {
    this.hasGenericRead = hasGenericRead;
    return this;
  }

  /**
   * Indicates if generic permission assigned to the user group.
   * @return hasGenericRead
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_GENERIC_READ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasGenericRead() {
    return hasGenericRead;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_GENERIC_READ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasGenericRead(@Nullable Boolean hasGenericRead) {
    this.hasGenericRead = hasGenericRead;
  }


  /**
   * Return true if this MergedGroupTypePermissionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergedGroupTypePermissionInfo mergedGroupTypePermissionInfo = (MergedGroupTypePermissionInfo) o;
    return Objects.equals(this.entityGroupIds, mergedGroupTypePermissionInfo.entityGroupIds) &&
        Objects.equals(this.hasGenericRead, mergedGroupTypePermissionInfo.hasGenericRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityGroupIds, hasGenericRead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergedGroupTypePermissionInfo {\n");
    sb.append("    entityGroupIds: ").append(toIndentedString(entityGroupIds)).append("\n");
    sb.append("    hasGenericRead: ").append(toIndentedString(hasGenericRead)).append("\n");
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

    // add `entityGroupIds` to the URL query string
    if (getEntityGroupIds() != null) {
      for (int i = 0; i < getEntityGroupIds().size(); i++) {
        if (getEntityGroupIds().get(i) != null) {
          joiner.add(getEntityGroupIds().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sentityGroupIds%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `hasGenericRead` to the URL query string
    if (getHasGenericRead() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasGenericRead%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasGenericRead()))));
    }

    return joiner.toString();
  }
}

