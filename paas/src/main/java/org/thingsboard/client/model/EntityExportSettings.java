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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityExportSettings
 */
@JsonPropertyOrder({
  EntityExportSettings.JSON_PROPERTY_EXPORT_RELATIONS,
  EntityExportSettings.JSON_PROPERTY_EXPORT_ATTRIBUTES,
  EntityExportSettings.JSON_PROPERTY_EXPORT_CREDENTIALS,
  EntityExportSettings.JSON_PROPERTY_EXPORT_CALCULATED_FIELDS,
  EntityExportSettings.JSON_PROPERTY_EXPORT_PERMISSIONS,
  EntityExportSettings.JSON_PROPERTY_EXPORT_GROUP_ENTITIES
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityExportSettings {
  public static final String JSON_PROPERTY_EXPORT_RELATIONS = "exportRelations";
  @Nullable
  private Boolean exportRelations;

  public static final String JSON_PROPERTY_EXPORT_ATTRIBUTES = "exportAttributes";
  @Nullable
  private Boolean exportAttributes;

  public static final String JSON_PROPERTY_EXPORT_CREDENTIALS = "exportCredentials";
  @Nullable
  private Boolean exportCredentials;

  public static final String JSON_PROPERTY_EXPORT_CALCULATED_FIELDS = "exportCalculatedFields";
  @Nullable
  private Boolean exportCalculatedFields;

  public static final String JSON_PROPERTY_EXPORT_PERMISSIONS = "exportPermissions";
  @Nullable
  private Boolean exportPermissions;

  public static final String JSON_PROPERTY_EXPORT_GROUP_ENTITIES = "exportGroupEntities";
  @Nullable
  private Boolean exportGroupEntities;

  public EntityExportSettings() { 
  }

  public EntityExportSettings exportRelations(@Nullable Boolean exportRelations) {
    this.exportRelations = exportRelations;
    return this;
  }

  /**
   * Get exportRelations
   * @return exportRelations
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportRelations() {
    return exportRelations;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportRelations(@Nullable Boolean exportRelations) {
    this.exportRelations = exportRelations;
  }


  public EntityExportSettings exportAttributes(@Nullable Boolean exportAttributes) {
    this.exportAttributes = exportAttributes;
    return this;
  }

  /**
   * Get exportAttributes
   * @return exportAttributes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportAttributes() {
    return exportAttributes;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportAttributes(@Nullable Boolean exportAttributes) {
    this.exportAttributes = exportAttributes;
  }


  public EntityExportSettings exportCredentials(@Nullable Boolean exportCredentials) {
    this.exportCredentials = exportCredentials;
    return this;
  }

  /**
   * Get exportCredentials
   * @return exportCredentials
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportCredentials() {
    return exportCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportCredentials(@Nullable Boolean exportCredentials) {
    this.exportCredentials = exportCredentials;
  }


  public EntityExportSettings exportCalculatedFields(@Nullable Boolean exportCalculatedFields) {
    this.exportCalculatedFields = exportCalculatedFields;
    return this;
  }

  /**
   * Get exportCalculatedFields
   * @return exportCalculatedFields
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportCalculatedFields() {
    return exportCalculatedFields;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportCalculatedFields(@Nullable Boolean exportCalculatedFields) {
    this.exportCalculatedFields = exportCalculatedFields;
  }


  public EntityExportSettings exportPermissions(@Nullable Boolean exportPermissions) {
    this.exportPermissions = exportPermissions;
    return this;
  }

  /**
   * Get exportPermissions
   * @return exportPermissions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportPermissions() {
    return exportPermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportPermissions(@Nullable Boolean exportPermissions) {
    this.exportPermissions = exportPermissions;
  }


  public EntityExportSettings exportGroupEntities(@Nullable Boolean exportGroupEntities) {
    this.exportGroupEntities = exportGroupEntities;
    return this;
  }

  /**
   * Get exportGroupEntities
   * @return exportGroupEntities
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPORT_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExportGroupEntities() {
    return exportGroupEntities;
  }


  @JsonProperty(value = JSON_PROPERTY_EXPORT_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportGroupEntities(@Nullable Boolean exportGroupEntities) {
    this.exportGroupEntities = exportGroupEntities;
  }


  /**
   * Return true if this EntityExportSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityExportSettings entityExportSettings = (EntityExportSettings) o;
    return Objects.equals(this.exportRelations, entityExportSettings.exportRelations) &&
        Objects.equals(this.exportAttributes, entityExportSettings.exportAttributes) &&
        Objects.equals(this.exportCredentials, entityExportSettings.exportCredentials) &&
        Objects.equals(this.exportCalculatedFields, entityExportSettings.exportCalculatedFields) &&
        Objects.equals(this.exportPermissions, entityExportSettings.exportPermissions) &&
        Objects.equals(this.exportGroupEntities, entityExportSettings.exportGroupEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportRelations, exportAttributes, exportCredentials, exportCalculatedFields, exportPermissions, exportGroupEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityExportSettings {\n");
    sb.append("    exportRelations: ").append(toIndentedString(exportRelations)).append("\n");
    sb.append("    exportAttributes: ").append(toIndentedString(exportAttributes)).append("\n");
    sb.append("    exportCredentials: ").append(toIndentedString(exportCredentials)).append("\n");
    sb.append("    exportCalculatedFields: ").append(toIndentedString(exportCalculatedFields)).append("\n");
    sb.append("    exportPermissions: ").append(toIndentedString(exportPermissions)).append("\n");
    sb.append("    exportGroupEntities: ").append(toIndentedString(exportGroupEntities)).append("\n");
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

    // add `exportRelations` to the URL query string
    if (getExportRelations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportRelations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportRelations()))));
    }

    // add `exportAttributes` to the URL query string
    if (getExportAttributes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportAttributes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportAttributes()))));
    }

    // add `exportCredentials` to the URL query string
    if (getExportCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportCredentials()))));
    }

    // add `exportCalculatedFields` to the URL query string
    if (getExportCalculatedFields() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportCalculatedFields%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportCalculatedFields()))));
    }

    // add `exportPermissions` to the URL query string
    if (getExportPermissions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportPermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportPermissions()))));
    }

    // add `exportGroupEntities` to the URL query string
    if (getExportGroupEntities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexportGroupEntities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExportGroupEntities()))));
    }

    return joiner.toString();
  }
}

