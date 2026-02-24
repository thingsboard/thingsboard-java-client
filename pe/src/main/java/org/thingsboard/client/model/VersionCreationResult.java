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
import org.thingsboard.client.model.EntityVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * VersionCreationResult
 */
@JsonPropertyOrder({
  VersionCreationResult.JSON_PROPERTY_VERSION,
  VersionCreationResult.JSON_PROPERTY_ADDED,
  VersionCreationResult.JSON_PROPERTY_MODIFIED,
  VersionCreationResult.JSON_PROPERTY_REMOVED,
  VersionCreationResult.JSON_PROPERTY_ERROR,
  VersionCreationResult.JSON_PROPERTY_DONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class VersionCreationResult {
  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private EntityVersion version;

  public static final String JSON_PROPERTY_ADDED = "added";
  @javax.annotation.Nullable
  private Integer added;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  @javax.annotation.Nullable
  private Integer modified;

  public static final String JSON_PROPERTY_REMOVED = "removed";
  @javax.annotation.Nullable
  private Integer removed;

  public static final String JSON_PROPERTY_ERROR = "error";
  @javax.annotation.Nullable
  private String error;

  public static final String JSON_PROPERTY_DONE = "done";
  @javax.annotation.Nullable
  private Boolean done;

  public VersionCreationResult() { 
  }

  public VersionCreationResult version(@javax.annotation.Nullable EntityVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityVersion getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable EntityVersion version) {
    this.version = version;
  }


  public VersionCreationResult added(@javax.annotation.Nullable Integer added) {
    this.added = added;
    return this;
  }

  /**
   * Get added
   * @return added
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAdded() {
    return added;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdded(@javax.annotation.Nullable Integer added) {
    this.added = added;
  }


  public VersionCreationResult modified(@javax.annotation.Nullable Integer modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getModified() {
    return modified;
  }


  @JsonProperty(value = JSON_PROPERTY_MODIFIED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModified(@javax.annotation.Nullable Integer modified) {
    this.modified = modified;
  }


  public VersionCreationResult removed(@javax.annotation.Nullable Integer removed) {
    this.removed = removed;
    return this;
  }

  /**
   * Get removed
   * @return removed
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REMOVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRemoved() {
    return removed;
  }


  @JsonProperty(value = JSON_PROPERTY_REMOVED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoved(@javax.annotation.Nullable Integer removed) {
    this.removed = removed;
  }


  public VersionCreationResult error(@javax.annotation.Nullable String error) {
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


  public VersionCreationResult done(@javax.annotation.Nullable Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDone() {
    return done;
  }


  @JsonProperty(value = JSON_PROPERTY_DONE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(@javax.annotation.Nullable Boolean done) {
    this.done = done;
  }


  /**
   * Return true if this VersionCreationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionCreationResult versionCreationResult = (VersionCreationResult) o;
    return Objects.equals(this.version, versionCreationResult.version) &&
        Objects.equals(this.added, versionCreationResult.added) &&
        Objects.equals(this.modified, versionCreationResult.modified) &&
        Objects.equals(this.removed, versionCreationResult.removed) &&
        Objects.equals(this.error, versionCreationResult.error) &&
        Objects.equals(this.done, versionCreationResult.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, added, modified, removed, error, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionCreationResult {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
      joiner.add(getVersion().toUrlQueryString(prefix + "version" + suffix));
    }

    // add `added` to the URL query string
    if (getAdded() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadded%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdded()))));
    }

    // add `modified` to the URL query string
    if (getModified() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smodified%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getModified()))));
    }

    // add `removed` to the URL query string
    if (getRemoved() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sremoved%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRemoved()))));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serror%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getError()))));
    }

    // add `done` to the URL query string
    if (getDone() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdone%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDone()))));
    }

    return joiner.toString();
  }
}

