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
import org.thingsboard.client.model.RelationsSearchParameters;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EdgeSearchQuery
 */
@JsonPropertyOrder({
  EdgeSearchQuery.JSON_PROPERTY_PARAMETERS,
  EdgeSearchQuery.JSON_PROPERTY_RELATION_TYPE,
  EdgeSearchQuery.JSON_PROPERTY_EDGE_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EdgeSearchQuery {
  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nullable
  private RelationsSearchParameters parameters;

  public static final String JSON_PROPERTY_RELATION_TYPE = "relationType";
  @javax.annotation.Nullable
  private String relationType;

  public static final String JSON_PROPERTY_EDGE_TYPES = "edgeTypes";
  @javax.annotation.Nullable
  private List<String> edgeTypes = new ArrayList<>();

  public EdgeSearchQuery() { 
  }

  public EdgeSearchQuery parameters(@javax.annotation.Nullable RelationsSearchParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Main search parameters.
   * @return parameters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationsSearchParameters getParameters() {
    return parameters;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(@javax.annotation.Nullable RelationsSearchParameters parameters) {
    this.parameters = parameters;
  }


  public EdgeSearchQuery relationType(@javax.annotation.Nullable String relationType) {
    this.relationType = relationType;
    return this;
  }

  /**
   * Type of the relation between root entity and edge (e.g. &#39;Contains&#39; or &#39;Manages&#39;).
   * @return relationType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRelationType() {
    return relationType;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationType(@javax.annotation.Nullable String relationType) {
    this.relationType = relationType;
  }


  public EdgeSearchQuery edgeTypes(@javax.annotation.Nullable List<String> edgeTypes) {
    this.edgeTypes = edgeTypes;
    return this;
  }

  public EdgeSearchQuery addEdgeTypesItem(String edgeTypesItem) {
    if (this.edgeTypes == null) {
      this.edgeTypes = new ArrayList<>();
    }
    this.edgeTypes.add(edgeTypesItem);
    return this;
  }

  /**
   * Array of edge types to filter the related entities (e.g. &#39;Silos&#39;, &#39;Stores&#39;).
   * @return edgeTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEdgeTypes() {
    return edgeTypes;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeTypes(@javax.annotation.Nullable List<String> edgeTypes) {
    this.edgeTypes = edgeTypes;
  }


  /**
   * Return true if this EdgeSearchQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeSearchQuery edgeSearchQuery = (EdgeSearchQuery) o;
    return Objects.equals(this.parameters, edgeSearchQuery.parameters) &&
        Objects.equals(this.relationType, edgeSearchQuery.relationType) &&
        Objects.equals(this.edgeTypes, edgeSearchQuery.edgeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, relationType, edgeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeSearchQuery {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
    sb.append("    edgeTypes: ").append(toIndentedString(edgeTypes)).append("\n");
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

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      joiner.add(getParameters().toUrlQueryString(prefix + "parameters" + suffix));
    }

    // add `relationType` to the URL query string
    if (getRelationType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelationType()))));
    }

    // add `edgeTypes` to the URL query string
    if (getEdgeTypes() != null) {
      for (int i = 0; i < getEdgeTypes().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sedgeTypes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getEdgeTypes().get(i)))));
      }
    }

    return joiner.toString();
  }
}

