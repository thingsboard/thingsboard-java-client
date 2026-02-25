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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * VersionLoadConfig
 */
@JsonPropertyOrder({
  VersionLoadConfig.JSON_PROPERTY_LOAD_RELATIONS,
  VersionLoadConfig.JSON_PROPERTY_LOAD_ATTRIBUTES,
  VersionLoadConfig.JSON_PROPERTY_LOAD_CREDENTIALS,
  VersionLoadConfig.JSON_PROPERTY_LOAD_CALCULATED_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class VersionLoadConfig {
  public static final String JSON_PROPERTY_LOAD_RELATIONS = "loadRelations";
  @javax.annotation.Nullable
  private Boolean loadRelations;

  public static final String JSON_PROPERTY_LOAD_ATTRIBUTES = "loadAttributes";
  @javax.annotation.Nullable
  private Boolean loadAttributes;

  public static final String JSON_PROPERTY_LOAD_CREDENTIALS = "loadCredentials";
  @javax.annotation.Nullable
  private Boolean loadCredentials;

  public static final String JSON_PROPERTY_LOAD_CALCULATED_FIELDS = "loadCalculatedFields";
  @javax.annotation.Nullable
  private Boolean loadCalculatedFields;

  public VersionLoadConfig() { 
  }

  public VersionLoadConfig loadRelations(@javax.annotation.Nullable Boolean loadRelations) {
    this.loadRelations = loadRelations;
    return this;
  }

  /**
   * Get loadRelations
   * @return loadRelations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLoadRelations() {
    return loadRelations;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadRelations(@javax.annotation.Nullable Boolean loadRelations) {
    this.loadRelations = loadRelations;
  }


  public VersionLoadConfig loadAttributes(@javax.annotation.Nullable Boolean loadAttributes) {
    this.loadAttributes = loadAttributes;
    return this;
  }

  /**
   * Get loadAttributes
   * @return loadAttributes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLoadAttributes() {
    return loadAttributes;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadAttributes(@javax.annotation.Nullable Boolean loadAttributes) {
    this.loadAttributes = loadAttributes;
  }


  public VersionLoadConfig loadCredentials(@javax.annotation.Nullable Boolean loadCredentials) {
    this.loadCredentials = loadCredentials;
    return this;
  }

  /**
   * Get loadCredentials
   * @return loadCredentials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLoadCredentials() {
    return loadCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadCredentials(@javax.annotation.Nullable Boolean loadCredentials) {
    this.loadCredentials = loadCredentials;
  }


  public VersionLoadConfig loadCalculatedFields(@javax.annotation.Nullable Boolean loadCalculatedFields) {
    this.loadCalculatedFields = loadCalculatedFields;
    return this;
  }

  /**
   * Get loadCalculatedFields
   * @return loadCalculatedFields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLoadCalculatedFields() {
    return loadCalculatedFields;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadCalculatedFields(@javax.annotation.Nullable Boolean loadCalculatedFields) {
    this.loadCalculatedFields = loadCalculatedFields;
  }


  /**
   * Return true if this VersionLoadConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionLoadConfig versionLoadConfig = (VersionLoadConfig) o;
    return Objects.equals(this.loadRelations, versionLoadConfig.loadRelations) &&
        Objects.equals(this.loadAttributes, versionLoadConfig.loadAttributes) &&
        Objects.equals(this.loadCredentials, versionLoadConfig.loadCredentials) &&
        Objects.equals(this.loadCalculatedFields, versionLoadConfig.loadCalculatedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadRelations, loadAttributes, loadCredentials, loadCalculatedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionLoadConfig {\n");
    sb.append("    loadRelations: ").append(toIndentedString(loadRelations)).append("\n");
    sb.append("    loadAttributes: ").append(toIndentedString(loadAttributes)).append("\n");
    sb.append("    loadCredentials: ").append(toIndentedString(loadCredentials)).append("\n");
    sb.append("    loadCalculatedFields: ").append(toIndentedString(loadCalculatedFields)).append("\n");
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

    // add `loadRelations` to the URL query string
    if (getLoadRelations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloadRelations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoadRelations()))));
    }

    // add `loadAttributes` to the URL query string
    if (getLoadAttributes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloadAttributes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoadAttributes()))));
    }

    // add `loadCredentials` to the URL query string
    if (getLoadCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloadCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoadCredentials()))));
    }

    // add `loadCalculatedFields` to the URL query string
    if (getLoadCalculatedFields() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloadCalculatedFields%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoadCalculatedFields()))));
    }

    return joiner.toString();
  }
}

