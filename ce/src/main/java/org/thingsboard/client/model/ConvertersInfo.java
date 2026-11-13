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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ConvertersInfo
 */
@JsonPropertyOrder({
  ConvertersInfo.JSON_PROPERTY_LIBRARY,
  ConvertersInfo.JSON_PROPERTY_EXISTING,
  ConvertersInfo.JSON_PROPERTY_KEYS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ConvertersInfo {
  public static final String JSON_PROPERTY_LIBRARY = "library";
  @Nullable
  private Boolean library;

  public static final String JSON_PROPERTY_EXISTING = "existing";
  @Nullable
  private Boolean existing;

  public static final String JSON_PROPERTY_KEYS = "keys";
  @Nullable
  private Set<String> keys = new LinkedHashSet<>();

  public ConvertersInfo() { 
  }

  public ConvertersInfo library(@Nullable Boolean library) {
    this.library = library;
    return this;
  }

  /**
   * Get library
   * @return library
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LIBRARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLibrary() {
    return library;
  }


  @JsonProperty(value = JSON_PROPERTY_LIBRARY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLibrary(@Nullable Boolean library) {
    this.library = library;
  }


  public ConvertersInfo existing(@Nullable Boolean existing) {
    this.existing = existing;
    return this;
  }

  /**
   * Get existing
   * @return existing
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXISTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExisting() {
    return existing;
  }


  @JsonProperty(value = JSON_PROPERTY_EXISTING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExisting(@Nullable Boolean existing) {
    this.existing = existing;
  }


  public ConvertersInfo keys(@Nullable Set<String> keys) {
    this.keys = keys;
    return this;
  }

  public ConvertersInfo addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new LinkedHashSet<>();
    }
    this.keys.add(keysItem);
    return this;
  }

  /**
   * Get keys
   * @return keys
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<String> getKeys() {
    return keys;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(@Nullable Set<String> keys) {
    this.keys = keys;
  }


  /**
   * Return true if this ConvertersInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertersInfo convertersInfo = (ConvertersInfo) o;
    return Objects.equals(this.library, convertersInfo.library) &&
        Objects.equals(this.existing, convertersInfo.existing) &&
        Objects.equals(this.keys, convertersInfo.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(library, existing, keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertersInfo {\n");
    sb.append("    library: ").append(toIndentedString(library)).append("\n");
    sb.append("    existing: ").append(toIndentedString(existing)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

    // add `library` to the URL query string
    if (getLibrary() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slibrary%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLibrary()))));
    }

    // add `existing` to the URL query string
    if (getExisting() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexisting%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExisting()))));
    }

    // add `keys` to the URL query string
    if (getKeys() != null) {
      int i = 0;
      for (String _item : getKeys()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%skeys%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    return joiner.toString();
  }
}

