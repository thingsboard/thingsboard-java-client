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
import org.thingsboard.client.model.EntityInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * CfReprocessingTaskFailure
 */
@JsonPropertyOrder({
  CfReprocessingTaskFailure.JSON_PROPERTY_ERROR,
  CfReprocessingTaskFailure.JSON_PROPERTY_ENTITY_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CfReprocessingTaskFailure {
  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public static final String JSON_PROPERTY_ENTITY_INFO = "entityInfo";
  @javax.annotation.Nullable
  private EntityInfo entityInfo;

  public CfReprocessingTaskFailure() { 
  }

  public CfReprocessingTaskFailure error(@javax.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }


  public CfReprocessingTaskFailure entityInfo(@javax.annotation.Nullable EntityInfo entityInfo) {
    this.entityInfo = entityInfo;
    return this;
  }

  /**
   * Get entityInfo
   * @return entityInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityInfo getEntityInfo() {
    return entityInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityInfo(@javax.annotation.Nullable EntityInfo entityInfo) {
    this.entityInfo = entityInfo;
  }


  /**
   * Return true if this CfReprocessingTaskFailure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfReprocessingTaskFailure cfReprocessingTaskFailure = (CfReprocessingTaskFailure) o;
    return Objects.equals(this.error, cfReprocessingTaskFailure.error) &&
        Objects.equals(this.entityInfo, cfReprocessingTaskFailure.entityInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, entityInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfReprocessingTaskFailure {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    entityInfo: ").append(toIndentedString(entityInfo)).append("\n");
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

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serror%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getError()))));
    }

    // add `entityInfo` to the URL query string
    if (getEntityInfo() != null) {
      joiner.add(getEntityInfo().toUrlQueryString(prefix + "entityInfo" + suffix));
    }

    return joiner.toString();
  }
}

