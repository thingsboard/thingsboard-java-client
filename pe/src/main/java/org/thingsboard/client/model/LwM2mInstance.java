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
import org.thingsboard.client.model.LwM2mResourceObserve;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * LwM2mInstance
 */
@JsonPropertyOrder({
  LwM2mInstance.JSON_PROPERTY_ID,
  LwM2mInstance.JSON_PROPERTY_RESOURCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class LwM2mInstance {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Integer id;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  @javax.annotation.Nullable
  private List<LwM2mResourceObserve> resources = new ArrayList<>();

  public LwM2mInstance() { 
  }

  public LwM2mInstance id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * LwM2M Instance id.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public LwM2mInstance resources(@javax.annotation.Nullable List<LwM2mResourceObserve> resources) {
    this.resources = resources;
    return this;
  }

  public LwM2mInstance addResourcesItem(LwM2mResourceObserve resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * LwM2M Resource observe.
   * @return resources
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LwM2mResourceObserve> getResources() {
    return resources;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOURCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(@javax.annotation.Nullable List<LwM2mResourceObserve> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this LwM2mInstance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LwM2mInstance lwM2mInstance = (LwM2mInstance) o;
    return Objects.equals(this.id, lwM2mInstance.id) &&
        Objects.equals(this.resources, lwM2mInstance.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LwM2mInstance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

    // add `resources` to the URL query string
    if (getResources() != null) {
      for (int i = 0; i < getResources().size(); i++) {
        if (getResources().get(i) != null) {
          joiner.add(getResources().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sresources%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

