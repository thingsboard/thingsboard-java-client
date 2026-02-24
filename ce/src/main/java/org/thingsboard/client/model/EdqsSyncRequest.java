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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.thingsboard.client.model.ObjectType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EdqsSyncRequest
 */
@JsonPropertyOrder({
  EdqsSyncRequest.JSON_PROPERTY_OBJECT_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EdqsSyncRequest {
  public static final String JSON_PROPERTY_OBJECT_TYPES = "objectTypes";
  @javax.annotation.Nullable
  private Set<ObjectType> objectTypes = new LinkedHashSet<>();

  public EdqsSyncRequest() { 
  }

  public EdqsSyncRequest objectTypes(@javax.annotation.Nullable Set<ObjectType> objectTypes) {
    this.objectTypes = objectTypes;
    return this;
  }

  public EdqsSyncRequest addObjectTypesItem(ObjectType objectTypesItem) {
    if (this.objectTypes == null) {
      this.objectTypes = new LinkedHashSet<>();
    }
    this.objectTypes.add(objectTypesItem);
    return this;
  }

  /**
   * Get objectTypes
   * @return objectTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OBJECT_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<ObjectType> getObjectTypes() {
    return objectTypes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_OBJECT_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectTypes(@javax.annotation.Nullable Set<ObjectType> objectTypes) {
    this.objectTypes = objectTypes;
  }


  /**
   * Return true if this EdqsSyncRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdqsSyncRequest edqsSyncRequest = (EdqsSyncRequest) o;
    return Objects.equals(this.objectTypes, edqsSyncRequest.objectTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdqsSyncRequest {\n");
    sb.append("    objectTypes: ").append(toIndentedString(objectTypes)).append("\n");
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

    // add `objectTypes` to the URL query string
    if (getObjectTypes() != null) {
      int i = 0;
      for (ObjectType _item : getObjectTypes()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sobjectTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    return joiner.toString();
  }
}

