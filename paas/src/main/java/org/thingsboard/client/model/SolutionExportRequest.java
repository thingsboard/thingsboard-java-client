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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.thingsboard.client.model.EntityExportSettings;
import org.thingsboard.client.model.EntityId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Solution export request specifying which entities to include and export settings.
 */
@JsonPropertyOrder({
  SolutionExportRequest.JSON_PROPERTY_ENTITY_IDS,
  SolutionExportRequest.JSON_PROPERTY_SETTINGS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SolutionExportRequest {
  public static final String JSON_PROPERTY_ENTITY_IDS = "entityIds";
  @Nullable
  private Set<EntityId> entityIds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  @Nullable
  private EntityExportSettings settings;

  public SolutionExportRequest() { 
  }

  public SolutionExportRequest entityIds(@Nullable Set<EntityId> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public SolutionExportRequest addEntityIdsItem(EntityId entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * Get entityIds
   * @return entityIds
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<EntityId> getEntityIds() {
    return entityIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ENTITY_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityIds(@Nullable Set<EntityId> entityIds) {
    this.entityIds = entityIds;
  }


  public SolutionExportRequest settings(@Nullable EntityExportSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Optional export settings controlling what additional data is included (relations, attributes, credentials, etc.). If not specified, default settings will be used that include all available data.
   * @return settings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityExportSettings getSettings() {
    return settings;
  }


  @JsonProperty(value = JSON_PROPERTY_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(@Nullable EntityExportSettings settings) {
    this.settings = settings;
  }


  /**
   * Return true if this SolutionExportRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionExportRequest solutionExportRequest = (SolutionExportRequest) o;
    return Objects.equals(this.entityIds, solutionExportRequest.entityIds) &&
        Objects.equals(this.settings, solutionExportRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionExportRequest {\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

    // add `entityIds` to the URL query string
    if (getEntityIds() != null) {
      int i = 0;
      for (EntityId _item : getEntityIds()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format(java.util.Locale.ROOT, "%sentityIds%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(getSettings().toUrlQueryString(prefix + "settings" + suffix));
    }

    return joiner.toString();
  }
}

