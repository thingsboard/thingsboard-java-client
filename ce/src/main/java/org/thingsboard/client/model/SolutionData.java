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
import javax.annotation.Nonnull;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.EntityExportData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Portable solution package containing exported entities grouped by type. Represents a self-contained snapshot that can be imported into another tenant.
 */
@JsonPropertyOrder({
  SolutionData.JSON_PROPERTY_ENTITIES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SolutionData {
  public static final String JSON_PROPERTY_ENTITIES = "entities";
  @Nonnull
  private Map<String, List<EntityExportData>> entities = new HashMap<>();

  public SolutionData() { 
  }

  public SolutionData entities(@Nonnull Map<String, List<EntityExportData>> entities) {
    this.entities = entities;
    return this;
  }

  public SolutionData putEntitiesItem(String key, List<EntityExportData> entitiesItem) {
    if (this.entities == null) {
      this.entities = new HashMap<>();
    }
    this.entities.put(key, entitiesItem);
    return this;
  }

  /**
   * Exported entities grouped by entity type. Each key is an entity type (e.g. DEVICE_PROFILE, RULE_CHAIN) and the value is a list of entity export data objects.
   * @return entities
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<EntityExportData>> getEntities() {
    return entities;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntities(@Nonnull Map<String, List<EntityExportData>> entities) {
    this.entities = entities;
  }


  /**
   * Return true if this SolutionData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionData solutionData = (SolutionData) o;
    return Objects.equals(this.entities, solutionData.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionData {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

    // add `entities` to the URL query string
    if (getEntities() != null) {
      for (String _key : getEntities().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sentities%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getEntities().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getEntities().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

