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
import org.thingsboard.client.model.TrendzSynchronizationResultType;
import org.thingsboard.client.model.TrendzSynchronizationStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TrendzSynchronizationResult
 */
@JsonPropertyOrder({
  TrendzSynchronizationResult.JSON_PROPERTY_VERSION,
  TrendzSynchronizationResult.JSON_PROPERTY_UPDATED_TS,
  TrendzSynchronizationResult.JSON_PROPERTY_TYPE,
  TrendzSynchronizationResult.JSON_PROPERTY_STATUS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TrendzSynchronizationResult {
  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private String version;

  public static final String JSON_PROPERTY_UPDATED_TS = "updatedTs";
  @Nullable
  private Long updatedTs;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private TrendzSynchronizationResultType type;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private TrendzSynchronizationStatus status;

  public TrendzSynchronizationResult() { 
  }

  public TrendzSynchronizationResult version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable String version) {
    this.version = version;
  }


  public TrendzSynchronizationResult updatedTs(@Nullable Long updatedTs) {
    this.updatedTs = updatedTs;
    return this;
  }

  /**
   * Get updatedTs
   * @return updatedTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdatedTs() {
    return updatedTs;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedTs(@Nullable Long updatedTs) {
    this.updatedTs = updatedTs;
  }


  public TrendzSynchronizationResult type(@Nullable TrendzSynchronizationResultType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TrendzSynchronizationResultType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable TrendzSynchronizationResultType type) {
    this.type = type;
  }


  public TrendzSynchronizationResult status(@Nullable TrendzSynchronizationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TrendzSynchronizationStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@Nullable TrendzSynchronizationStatus status) {
    this.status = status;
  }


  /**
   * Return true if this TrendzSynchronizationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendzSynchronizationResult trendzSynchronizationResult = (TrendzSynchronizationResult) o;
    return Objects.equals(this.version, trendzSynchronizationResult.version) &&
        Objects.equals(this.updatedTs, trendzSynchronizationResult.updatedTs) &&
        Objects.equals(this.type, trendzSynchronizationResult.type) &&
        Objects.equals(this.status, trendzSynchronizationResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, updatedTs, type, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendzSynchronizationResult {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    updatedTs: ").append(toIndentedString(updatedTs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `updatedTs` to the URL query string
    if (getUpdatedTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdatedTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdatedTs()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    return joiner.toString();
  }
}

