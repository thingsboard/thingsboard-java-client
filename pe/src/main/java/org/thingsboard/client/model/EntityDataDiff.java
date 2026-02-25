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
import org.thingsboard.client.model.EntityExportData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityDataDiff
 */
@JsonPropertyOrder({
  EntityDataDiff.JSON_PROPERTY_CURRENT_VERSION,
  EntityDataDiff.JSON_PROPERTY_OTHER_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityDataDiff {
  public static final String JSON_PROPERTY_CURRENT_VERSION = "currentVersion";
  @javax.annotation.Nullable
  private EntityExportData currentVersion;

  public static final String JSON_PROPERTY_OTHER_VERSION = "otherVersion";
  @javax.annotation.Nullable
  private EntityExportData otherVersion;

  public EntityDataDiff() { 
  }

  public EntityDataDiff currentVersion(@javax.annotation.Nullable EntityExportData currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Get currentVersion
   * @return currentVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityExportData getCurrentVersion() {
    return currentVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentVersion(@javax.annotation.Nullable EntityExportData currentVersion) {
    this.currentVersion = currentVersion;
  }


  public EntityDataDiff otherVersion(@javax.annotation.Nullable EntityExportData otherVersion) {
    this.otherVersion = otherVersion;
    return this;
  }

  /**
   * Get otherVersion
   * @return otherVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTHER_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityExportData getOtherVersion() {
    return otherVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_OTHER_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherVersion(@javax.annotation.Nullable EntityExportData otherVersion) {
    this.otherVersion = otherVersion;
  }


  /**
   * Return true if this EntityDataDiff object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDataDiff entityDataDiff = (EntityDataDiff) o;
    return Objects.equals(this.currentVersion, entityDataDiff.currentVersion) &&
        Objects.equals(this.otherVersion, entityDataDiff.otherVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentVersion, otherVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDataDiff {\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    otherVersion: ").append(toIndentedString(otherVersion)).append("\n");
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

    // add `currentVersion` to the URL query string
    if (getCurrentVersion() != null) {
      joiner.add(getCurrentVersion().toUrlQueryString(prefix + "currentVersion" + suffix));
    }

    // add `otherVersion` to the URL query string
    if (getOtherVersion() != null) {
      joiner.add(getOtherVersion().toUrlQueryString(prefix + "otherVersion" + suffix));
    }

    return joiner.toString();
  }
}

