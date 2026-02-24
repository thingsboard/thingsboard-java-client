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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * BulkImportResultDevice
 */
@JsonPropertyOrder({
  BulkImportResultDevice.JSON_PROPERTY_CREATED,
  BulkImportResultDevice.JSON_PROPERTY_UPDATED,
  BulkImportResultDevice.JSON_PROPERTY_ERRORS,
  BulkImportResultDevice.JSON_PROPERTY_ERRORS_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class BulkImportResultDevice {
  public static final String JSON_PROPERTY_CREATED = "created";
  private JsonNullable<Object> created = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private JsonNullable<Object> updated = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<Object> errors = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ERRORS_LIST = "errorsList";
  @javax.annotation.Nullable
  private List<String> errorsList = new ArrayList<>();

  public BulkImportResultDevice() { 
  }

  public BulkImportResultDevice created(@javax.annotation.Nullable Object created) {
    this.created = JsonNullable.<Object>of(created);
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getCreated() {
        return created.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_CREATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCreated_JsonNullable() {
    return created;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED)
  public void setCreated_JsonNullable(JsonNullable<Object> created) {
    this.created = created;
  }

  public void setCreated(@javax.annotation.Nullable Object created) {
    this.created = JsonNullable.<Object>of(created);
  }


  public BulkImportResultDevice updated(@javax.annotation.Nullable Object updated) {
    this.updated = JsonNullable.<Object>of(updated);
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getUpdated() {
        return updated.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUpdated_JsonNullable() {
    return updated;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATED)
  public void setUpdated_JsonNullable(JsonNullable<Object> updated) {
    this.updated = updated;
  }

  public void setUpdated(@javax.annotation.Nullable Object updated) {
    this.updated = JsonNullable.<Object>of(updated);
  }


  public BulkImportResultDevice errors(@javax.annotation.Nullable Object errors) {
    this.errors = JsonNullable.<Object>of(errors);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getErrors() {
        return errors.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ERRORS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getErrors_JsonNullable() {
    return errors;
  }
  
  @JsonProperty(JSON_PROPERTY_ERRORS)
  public void setErrors_JsonNullable(JsonNullable<Object> errors) {
    this.errors = errors;
  }

  public void setErrors(@javax.annotation.Nullable Object errors) {
    this.errors = JsonNullable.<Object>of(errors);
  }


  public BulkImportResultDevice errorsList(@javax.annotation.Nullable List<String> errorsList) {
    this.errorsList = errorsList;
    return this;
  }

  public BulkImportResultDevice addErrorsListItem(String errorsListItem) {
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


  /**
   * Return true if this BulkImportResultDevice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkImportResultDevice bulkImportResultDevice = (BulkImportResultDevice) o;
    return equalsNullable(this.created, bulkImportResultDevice.created) &&
        equalsNullable(this.updated, bulkImportResultDevice.updated) &&
        equalsNullable(this.errors, bulkImportResultDevice.errors) &&
        Objects.equals(this.errorsList, bulkImportResultDevice.errorsList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(created), hashCodeNullable(updated), hashCodeNullable(errors), errorsList);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkImportResultDevice {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    errorsList: ").append(toIndentedString(errorsList)).append("\n");
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

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdated()))));
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

    return joiner.toString();
  }
}

