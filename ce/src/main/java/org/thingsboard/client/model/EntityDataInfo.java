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
 * EntityDataInfo
 */
@JsonPropertyOrder({
  EntityDataInfo.JSON_PROPERTY_HAS_RELATIONS,
  EntityDataInfo.JSON_PROPERTY_HAS_ATTRIBUTES,
  EntityDataInfo.JSON_PROPERTY_HAS_CREDENTIALS,
  EntityDataInfo.JSON_PROPERTY_HAS_CALCULATED_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityDataInfo {
  public static final String JSON_PROPERTY_HAS_RELATIONS = "hasRelations";
  @javax.annotation.Nullable
  private Boolean hasRelations;

  public static final String JSON_PROPERTY_HAS_ATTRIBUTES = "hasAttributes";
  @javax.annotation.Nullable
  private Boolean hasAttributes;

  public static final String JSON_PROPERTY_HAS_CREDENTIALS = "hasCredentials";
  @javax.annotation.Nullable
  private Boolean hasCredentials;

  public static final String JSON_PROPERTY_HAS_CALCULATED_FIELDS = "hasCalculatedFields";
  @javax.annotation.Nullable
  private Boolean hasCalculatedFields;

  public EntityDataInfo() { 
  }

  public EntityDataInfo hasRelations(@javax.annotation.Nullable Boolean hasRelations) {
    this.hasRelations = hasRelations;
    return this;
  }

  /**
   * Get hasRelations
   * @return hasRelations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasRelations() {
    return hasRelations;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasRelations(@javax.annotation.Nullable Boolean hasRelations) {
    this.hasRelations = hasRelations;
  }


  public EntityDataInfo hasAttributes(@javax.annotation.Nullable Boolean hasAttributes) {
    this.hasAttributes = hasAttributes;
    return this;
  }

  /**
   * Get hasAttributes
   * @return hasAttributes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasAttributes() {
    return hasAttributes;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAttributes(@javax.annotation.Nullable Boolean hasAttributes) {
    this.hasAttributes = hasAttributes;
  }


  public EntityDataInfo hasCredentials(@javax.annotation.Nullable Boolean hasCredentials) {
    this.hasCredentials = hasCredentials;
    return this;
  }

  /**
   * Get hasCredentials
   * @return hasCredentials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasCredentials() {
    return hasCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasCredentials(@javax.annotation.Nullable Boolean hasCredentials) {
    this.hasCredentials = hasCredentials;
  }


  public EntityDataInfo hasCalculatedFields(@javax.annotation.Nullable Boolean hasCalculatedFields) {
    this.hasCalculatedFields = hasCalculatedFields;
    return this;
  }

  /**
   * Get hasCalculatedFields
   * @return hasCalculatedFields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasCalculatedFields() {
    return hasCalculatedFields;
  }


  @JsonProperty(value = JSON_PROPERTY_HAS_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasCalculatedFields(@javax.annotation.Nullable Boolean hasCalculatedFields) {
    this.hasCalculatedFields = hasCalculatedFields;
  }


  /**
   * Return true if this EntityDataInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityDataInfo entityDataInfo = (EntityDataInfo) o;
    return Objects.equals(this.hasRelations, entityDataInfo.hasRelations) &&
        Objects.equals(this.hasAttributes, entityDataInfo.hasAttributes) &&
        Objects.equals(this.hasCredentials, entityDataInfo.hasCredentials) &&
        Objects.equals(this.hasCalculatedFields, entityDataInfo.hasCalculatedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasRelations, hasAttributes, hasCredentials, hasCalculatedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityDataInfo {\n");
    sb.append("    hasRelations: ").append(toIndentedString(hasRelations)).append("\n");
    sb.append("    hasAttributes: ").append(toIndentedString(hasAttributes)).append("\n");
    sb.append("    hasCredentials: ").append(toIndentedString(hasCredentials)).append("\n");
    sb.append("    hasCalculatedFields: ").append(toIndentedString(hasCalculatedFields)).append("\n");
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

    // add `hasRelations` to the URL query string
    if (getHasRelations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasRelations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasRelations()))));
    }

    // add `hasAttributes` to the URL query string
    if (getHasAttributes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasAttributes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasAttributes()))));
    }

    // add `hasCredentials` to the URL query string
    if (getHasCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasCredentials()))));
    }

    // add `hasCalculatedFields` to the URL query string
    if (getHasCalculatedFields() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasCalculatedFields%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasCalculatedFields()))));
    }

    return joiner.toString();
  }
}

