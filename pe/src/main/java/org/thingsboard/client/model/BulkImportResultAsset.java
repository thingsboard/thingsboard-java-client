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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BulkImportResultAsset
 */
@JsonPropertyOrder({
  BulkImportResultAsset.JSON_PROPERTY_CREATED,
  BulkImportResultAsset.JSON_PROPERTY_ERRORS,
  BulkImportResultAsset.JSON_PROPERTY_ERRORS_LIST,
  BulkImportResultAsset.JSON_PROPERTY_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class BulkImportResultAsset {
  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nullable
  private Integer created;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nullable
  private Integer errors;

  public static final String JSON_PROPERTY_ERRORS_LIST = "errorsList";
  @javax.annotation.Nullable
  private List<String> errorsList = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @javax.annotation.Nullable
  private Integer updated;

  public BulkImportResultAsset() { 
  }

  public BulkImportResultAsset created(@javax.annotation.Nullable Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCreated() {
    return created;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@javax.annotation.Nullable Integer created) {
    this.created = created;
  }


  public BulkImportResultAsset errors(@javax.annotation.Nullable Integer errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getErrors() {
    return errors;
  }


  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(@javax.annotation.Nullable Integer errors) {
    this.errors = errors;
  }


  public BulkImportResultAsset errorsList(@javax.annotation.Nullable List<String> errorsList) {
    this.errorsList = errorsList;
    return this;
  }

  public BulkImportResultAsset addErrorsListItem(String errorsListItem) {
    if (this.errorsList == null) {
      this.errorsList = new ArrayList<>();
    }
    this.errorsList.add(errorsListItem);
    return this;
  }

  /**
   * Get errorsList
   * @return errorsList
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ERRORS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getErrorsList() {
    return errorsList;
  }


  @JsonProperty(value = JSON_PROPERTY_ERRORS_LIST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorsList(@javax.annotation.Nullable List<String> errorsList) {
    this.errorsList = errorsList;
  }


  public BulkImportResultAsset updated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@javax.annotation.Nullable Integer updated) {
    this.updated = updated;
  }


  /**
   * Return true if this BulkImportResultAsset object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkImportResultAsset bulkImportResultAsset = (BulkImportResultAsset) o;
    return Objects.equals(this.created, bulkImportResultAsset.created) &&
        Objects.equals(this.errors, bulkImportResultAsset.errors) &&
        Objects.equals(this.errorsList, bulkImportResultAsset.errorsList) &&
        Objects.equals(this.updated, bulkImportResultAsset.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, errors, errorsList, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkImportResultAsset {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    errorsList: ").append(toIndentedString(errorsList)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreated()))));
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serrors%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getErrors()))));
    }

    // add `errorsList` to the URL query string
    if (getErrorsList() != null) {
      for (int i = 0; i < getErrorsList().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%serrorsList%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getErrorsList().get(i)))));
      }
    }

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdated()))));
    }

    return joiner.toString();
  }
}

