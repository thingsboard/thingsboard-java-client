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
import org.thingsboard.client.model.EdqsApiMode;
import org.thingsboard.client.model.EdqsSyncStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EdqsState
 */
@JsonPropertyOrder({
  EdqsState.JSON_PROPERTY_EDQS_READY,
  EdqsState.JSON_PROPERTY_SYNC_STATUS,
  EdqsState.JSON_PROPERTY_API_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EdqsState {
  public static final String JSON_PROPERTY_EDQS_READY = "edqsReady";
  @javax.annotation.Nullable
  private Boolean edqsReady;

  public static final String JSON_PROPERTY_SYNC_STATUS = "syncStatus";
  @javax.annotation.Nullable
  private EdqsSyncStatus syncStatus;

  public static final String JSON_PROPERTY_API_MODE = "apiMode";
  @javax.annotation.Nullable
  private EdqsApiMode apiMode;

  public EdqsState() { 
  }

  public EdqsState edqsReady(@javax.annotation.Nullable Boolean edqsReady) {
    this.edqsReady = edqsReady;
    return this;
  }

  /**
   * Get edqsReady
   * @return edqsReady
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDQS_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdqsReady() {
    return edqsReady;
  }


  @JsonProperty(value = JSON_PROPERTY_EDQS_READY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdqsReady(@javax.annotation.Nullable Boolean edqsReady) {
    this.edqsReady = edqsReady;
  }


  public EdqsState syncStatus(@javax.annotation.Nullable EdqsSyncStatus syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

  /**
   * Get syncStatus
   * @return syncStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYNC_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EdqsSyncStatus getSyncStatus() {
    return syncStatus;
  }


  @JsonProperty(value = JSON_PROPERTY_SYNC_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncStatus(@javax.annotation.Nullable EdqsSyncStatus syncStatus) {
    this.syncStatus = syncStatus;
  }


  public EdqsState apiMode(@javax.annotation.Nullable EdqsApiMode apiMode) {
    this.apiMode = apiMode;
    return this;
  }

  /**
   * Get apiMode
   * @return apiMode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_API_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EdqsApiMode getApiMode() {
    return apiMode;
  }


  @JsonProperty(value = JSON_PROPERTY_API_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiMode(@javax.annotation.Nullable EdqsApiMode apiMode) {
    this.apiMode = apiMode;
  }


  /**
   * Return true if this EdqsState object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdqsState edqsState = (EdqsState) o;
    return Objects.equals(this.edqsReady, edqsState.edqsReady) &&
        Objects.equals(this.syncStatus, edqsState.syncStatus) &&
        Objects.equals(this.apiMode, edqsState.apiMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edqsReady, syncStatus, apiMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdqsState {\n");
    sb.append("    edqsReady: ").append(toIndentedString(edqsReady)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    apiMode: ").append(toIndentedString(apiMode)).append("\n");
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

    // add `edqsReady` to the URL query string
    if (getEdqsReady() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedqsReady%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdqsReady()))));
    }

    // add `syncStatus` to the URL query string
    if (getSyncStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssyncStatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSyncStatus()))));
    }

    // add `apiMode` to the URL query string
    if (getApiMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapiMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApiMode()))));
    }

    return joiner.toString();
  }
}

