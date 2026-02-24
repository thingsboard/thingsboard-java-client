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
import org.thingsboard.client.model.EntityFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityAlias
 */
@JsonPropertyOrder({
  EntityAlias.JSON_PROPERTY_ID,
  EntityAlias.JSON_PROPERTY_ALIAS,
  EntityAlias.JSON_PROPERTY_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityAlias {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  @javax.annotation.Nullable
  private String alias;

  public static final String JSON_PROPERTY_FILTER = "filter";
  @javax.annotation.Nullable
  private EntityFilter filter;

  public EntityAlias() { 
  }

  public EntityAlias id(@javax.annotation.Nullable String id) {
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
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public EntityAlias alias(@javax.annotation.Nullable String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }


  @JsonProperty(value = JSON_PROPERTY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(@javax.annotation.Nullable String alias) {
    this.alias = alias;
  }


  public EntityAlias filter(@javax.annotation.Nullable EntityFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityFilter getFilter() {
    return filter;
  }


  @JsonProperty(value = JSON_PROPERTY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(@javax.annotation.Nullable EntityFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this EntityAlias object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityAlias entityAlias = (EntityAlias) o;
    return Objects.equals(this.id, entityAlias.id) &&
        Objects.equals(this.alias, entityAlias.alias) &&
        Objects.equals(this.filter, entityAlias.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityAlias {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `alias` to the URL query string
    if (getAlias() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salias%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlias()))));
    }

    // add `filter` to the URL query string
    if (getFilter() != null) {
      joiner.add(getFilter().toUrlQueryString(prefix + "filter" + suffix));
    }

    return joiner.toString();
  }
}

