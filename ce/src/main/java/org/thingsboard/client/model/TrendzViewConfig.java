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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TrendzViewConfig
 */
@JsonPropertyOrder({
  TrendzViewConfig.JSON_PROPERTY_ID,
  TrendzViewConfig.JSON_PROPERTY_NAME,
  TrendzViewConfig.JSON_PROPERTY_RUNTIME_FILTERS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TrendzViewConfig {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_RUNTIME_FILTERS = "runtimeFilters";
  @Nullable
  private List<Object> runtimeFilters = new ArrayList<>();

  public TrendzViewConfig() { 
  }

  public TrendzViewConfig id(@Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable UUID id) {
    this.id = id;
  }


  public TrendzViewConfig name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public TrendzViewConfig runtimeFilters(@Nullable List<Object> runtimeFilters) {
    this.runtimeFilters = runtimeFilters;
    return this;
  }

  public TrendzViewConfig addRuntimeFiltersItem(Object runtimeFiltersItem) {
    if (this.runtimeFilters == null) {
      this.runtimeFilters = new ArrayList<>();
    }
    this.runtimeFilters.add(runtimeFiltersItem);
    return this;
  }

  /**
   * Get runtimeFilters
   * @return runtimeFilters
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RUNTIME_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getRuntimeFilters() {
    return runtimeFilters;
  }


  @JsonProperty(value = JSON_PROPERTY_RUNTIME_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntimeFilters(@Nullable List<Object> runtimeFilters) {
    this.runtimeFilters = runtimeFilters;
  }


  /**
   * Return true if this TrendzViewConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendzViewConfig trendzViewConfig = (TrendzViewConfig) o;
    return Objects.equals(this.id, trendzViewConfig.id) &&
        Objects.equals(this.name, trendzViewConfig.name) &&
        Objects.equals(this.runtimeFilters, trendzViewConfig.runtimeFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, runtimeFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendzViewConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runtimeFilters: ").append(toIndentedString(runtimeFilters)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `runtimeFilters` to the URL query string
    if (getRuntimeFilters() != null) {
      for (int i = 0; i < getRuntimeFilters().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sruntimeFilters%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getRuntimeFilters().get(i)))));
      }
    }

    return joiner.toString();
  }
}

