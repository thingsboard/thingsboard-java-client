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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.HasIdObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TbImageDeleteResult
 */
@JsonPropertyOrder({
  TbImageDeleteResult.JSON_PROPERTY_SUCCESS,
  TbImageDeleteResult.JSON_PROPERTY_REFERENCES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TbImageDeleteResult {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  @Nullable
  private Boolean success;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  @Nullable
  private Map<String, List<HasIdObject>> references = new HashMap<>();

  public TbImageDeleteResult() { 
  }

  public TbImageDeleteResult success(@Nullable Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(value = JSON_PROPERTY_SUCCESS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(@Nullable Boolean success) {
    this.success = success;
  }


  public TbImageDeleteResult references(@Nullable Map<String, List<HasIdObject>> references) {
    this.references = references;
    return this;
  }

  public TbImageDeleteResult putReferencesItem(String key, List<HasIdObject> referencesItem) {
    if (this.references == null) {
      this.references = new HashMap<>();
    }
    this.references.put(key, referencesItem);
    return this;
  }

  /**
   * Get references
   * @return references
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REFERENCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<HasIdObject>> getReferences() {
    return references;
  }


  @JsonProperty(value = JSON_PROPERTY_REFERENCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(@Nullable Map<String, List<HasIdObject>> references) {
    this.references = references;
  }


  /**
   * Return true if this TbImageDeleteResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TbImageDeleteResult tbImageDeleteResult = (TbImageDeleteResult) o;
    return Objects.equals(this.success, tbImageDeleteResult.success) &&
        Objects.equals(this.references, tbImageDeleteResult.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TbImageDeleteResult {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

    // add `success` to the URL query string
    if (getSuccess() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssuccess%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSuccess()))));
    }

    // add `references` to the URL query string
    if (getReferences() != null) {
      for (String _key : getReferences().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sreferences%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getReferences().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getReferences().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

