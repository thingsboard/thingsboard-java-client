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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.Mapping;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BulkImportRequest
 */
@JsonPropertyOrder({
  BulkImportRequest.JSON_PROPERTY_FILE,
  BulkImportRequest.JSON_PROPERTY_MAPPING,
  BulkImportRequest.JSON_PROPERTY_CUSTOMER_ID,
  BulkImportRequest.JSON_PROPERTY_ENTITY_GROUP_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class BulkImportRequest {
  public static final String JSON_PROPERTY_FILE = "file";
  @javax.annotation.Nullable
  private String _file;

  public static final String JSON_PROPERTY_MAPPING = "mapping";
  @javax.annotation.Nullable
  private Mapping mapping;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_ID = "entityGroupId";
  @javax.annotation.Nullable
  private String entityGroupId;

  public BulkImportRequest() { 
  }

  public BulkImportRequest _file(@javax.annotation.Nullable String _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFile() {
    return _file;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(@javax.annotation.Nullable String _file) {
    this._file = _file;
  }


  public BulkImportRequest mapping(@javax.annotation.Nullable Mapping mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAPPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Mapping getMapping() {
    return mapping;
  }


  @JsonProperty(value = JSON_PROPERTY_MAPPING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapping(@javax.annotation.Nullable Mapping mapping) {
    this.mapping = mapping;
  }


  public BulkImportRequest customerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable CustomerId customerId) {
    this.customerId = customerId;
  }


  public BulkImportRequest entityGroupId(@javax.annotation.Nullable String entityGroupId) {
    this.entityGroupId = entityGroupId;
    return this;
  }

  /**
   * Get entityGroupId
   * @return entityGroupId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityGroupId() {
    return entityGroupId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupId(@javax.annotation.Nullable String entityGroupId) {
    this.entityGroupId = entityGroupId;
  }


  /**
   * Return true if this BulkImportRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkImportRequest bulkImportRequest = (BulkImportRequest) o;
    return Objects.equals(this._file, bulkImportRequest._file) &&
        Objects.equals(this.mapping, bulkImportRequest.mapping) &&
        Objects.equals(this.customerId, bulkImportRequest.customerId) &&
        Objects.equals(this.entityGroupId, bulkImportRequest.entityGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, mapping, customerId, entityGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkImportRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    entityGroupId: ").append(toIndentedString(entityGroupId)).append("\n");
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

    // add `file` to the URL query string
    if (getFile() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfile%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFile()))));
    }

    // add `mapping` to the URL query string
    if (getMapping() != null) {
      joiner.add(getMapping().toUrlQueryString(prefix + "mapping" + suffix));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `entityGroupId` to the URL query string
    if (getEntityGroupId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityGroupId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityGroupId()))));
    }

    return joiner.toString();
  }
}

