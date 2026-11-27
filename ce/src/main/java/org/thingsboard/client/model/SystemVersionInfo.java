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
import javax.annotation.Nonnull;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Version and edition of the platform build
 */
@JsonPropertyOrder({
  SystemVersionInfo.JSON_PROPERTY_VERSION,
  SystemVersionInfo.JSON_PROPERTY_ARTIFACT,
  SystemVersionInfo.JSON_PROPERTY_NAME,
  SystemVersionInfo.JSON_PROPERTY_TYPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SystemVersionInfo {
  public static final String JSON_PROPERTY_VERSION = "version";
  @Nonnull
  private String version;

  public static final String JSON_PROPERTY_ARTIFACT = "artifact";
  @Nullable
  private String artifact;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private String type;

  public SystemVersionInfo() { 
  }

  public SystemVersionInfo version(@Nonnull String version) {
    this.version = version;
    return this;
  }

  /**
   * Platform version, or &#39;unknown&#39; when the build information is not available
   * @return version
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@Nonnull String version) {
    this.version = version;
  }


  public SystemVersionInfo artifact(@Nullable String artifact) {
    this.artifact = artifact;
    return this;
  }

  /**
   * Build artifact; absent when the build information is not available
   * @return artifact
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ARTIFACT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArtifact() {
    return artifact;
  }


  @JsonProperty(value = JSON_PROPERTY_ARTIFACT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifact(@Nullable String artifact) {
    this.artifact = artifact;
  }


  public SystemVersionInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Build name; absent when the build information is not available
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public SystemVersionInfo type(@Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Platform edition
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull String type) {
    this.type = type;
  }


  /**
   * Return true if this SystemVersionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemVersionInfo systemVersionInfo = (SystemVersionInfo) o;
    return Objects.equals(this.version, systemVersionInfo.version) &&
        Objects.equals(this.artifact, systemVersionInfo.artifact) &&
        Objects.equals(this.name, systemVersionInfo.name) &&
        Objects.equals(this.type, systemVersionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, artifact, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemVersionInfo {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `artifact` to the URL query string
    if (getArtifact() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sartifact%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getArtifact()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

