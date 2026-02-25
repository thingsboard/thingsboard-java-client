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
 * VersionCreateConfig
 */
@JsonPropertyOrder({
  VersionCreateConfig.JSON_PROPERTY_SAVE_RELATIONS,
  VersionCreateConfig.JSON_PROPERTY_SAVE_ATTRIBUTES,
  VersionCreateConfig.JSON_PROPERTY_SAVE_CREDENTIALS,
  VersionCreateConfig.JSON_PROPERTY_SAVE_CALCULATED_FIELDS,
  VersionCreateConfig.JSON_PROPERTY_SAVE_PERMISSIONS,
  VersionCreateConfig.JSON_PROPERTY_SAVE_GROUP_ENTITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class VersionCreateConfig {
  public static final String JSON_PROPERTY_SAVE_RELATIONS = "saveRelations";
  @javax.annotation.Nullable
  private Boolean saveRelations;

  public static final String JSON_PROPERTY_SAVE_ATTRIBUTES = "saveAttributes";
  @javax.annotation.Nullable
  private Boolean saveAttributes;

  public static final String JSON_PROPERTY_SAVE_CREDENTIALS = "saveCredentials";
  @javax.annotation.Nullable
  private Boolean saveCredentials;

  public static final String JSON_PROPERTY_SAVE_CALCULATED_FIELDS = "saveCalculatedFields";
  @javax.annotation.Nullable
  private Boolean saveCalculatedFields;

  public static final String JSON_PROPERTY_SAVE_PERMISSIONS = "savePermissions";
  @javax.annotation.Nullable
  private Boolean savePermissions;

  public static final String JSON_PROPERTY_SAVE_GROUP_ENTITIES = "saveGroupEntities";
  @javax.annotation.Nullable
  private Boolean saveGroupEntities;

  public VersionCreateConfig() { 
  }

  public VersionCreateConfig saveRelations(@javax.annotation.Nullable Boolean saveRelations) {
    this.saveRelations = saveRelations;
    return this;
  }

  /**
   * Get saveRelations
   * @return saveRelations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveRelations() {
    return saveRelations;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_RELATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveRelations(@javax.annotation.Nullable Boolean saveRelations) {
    this.saveRelations = saveRelations;
  }


  public VersionCreateConfig saveAttributes(@javax.annotation.Nullable Boolean saveAttributes) {
    this.saveAttributes = saveAttributes;
    return this;
  }

  /**
   * Get saveAttributes
   * @return saveAttributes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveAttributes() {
    return saveAttributes;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveAttributes(@javax.annotation.Nullable Boolean saveAttributes) {
    this.saveAttributes = saveAttributes;
  }


  public VersionCreateConfig saveCredentials(@javax.annotation.Nullable Boolean saveCredentials) {
    this.saveCredentials = saveCredentials;
    return this;
  }

  /**
   * Get saveCredentials
   * @return saveCredentials
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveCredentials() {
    return saveCredentials;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_CREDENTIALS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveCredentials(@javax.annotation.Nullable Boolean saveCredentials) {
    this.saveCredentials = saveCredentials;
  }


  public VersionCreateConfig saveCalculatedFields(@javax.annotation.Nullable Boolean saveCalculatedFields) {
    this.saveCalculatedFields = saveCalculatedFields;
    return this;
  }

  /**
   * Get saveCalculatedFields
   * @return saveCalculatedFields
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveCalculatedFields() {
    return saveCalculatedFields;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_CALCULATED_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveCalculatedFields(@javax.annotation.Nullable Boolean saveCalculatedFields) {
    this.saveCalculatedFields = saveCalculatedFields;
  }


  public VersionCreateConfig savePermissions(@javax.annotation.Nullable Boolean savePermissions) {
    this.savePermissions = savePermissions;
    return this;
  }

  /**
   * Get savePermissions
   * @return savePermissions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSavePermissions() {
    return savePermissions;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_PERMISSIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSavePermissions(@javax.annotation.Nullable Boolean savePermissions) {
    this.savePermissions = savePermissions;
  }


  public VersionCreateConfig saveGroupEntities(@javax.annotation.Nullable Boolean saveGroupEntities) {
    this.saveGroupEntities = saveGroupEntities;
    return this;
  }

  /**
   * Get saveGroupEntities
   * @return saveGroupEntities
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SAVE_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSaveGroupEntities() {
    return saveGroupEntities;
  }


  @JsonProperty(value = JSON_PROPERTY_SAVE_GROUP_ENTITIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveGroupEntities(@javax.annotation.Nullable Boolean saveGroupEntities) {
    this.saveGroupEntities = saveGroupEntities;
  }


  /**
   * Return true if this VersionCreateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionCreateConfig versionCreateConfig = (VersionCreateConfig) o;
    return Objects.equals(this.saveRelations, versionCreateConfig.saveRelations) &&
        Objects.equals(this.saveAttributes, versionCreateConfig.saveAttributes) &&
        Objects.equals(this.saveCredentials, versionCreateConfig.saveCredentials) &&
        Objects.equals(this.saveCalculatedFields, versionCreateConfig.saveCalculatedFields) &&
        Objects.equals(this.savePermissions, versionCreateConfig.savePermissions) &&
        Objects.equals(this.saveGroupEntities, versionCreateConfig.saveGroupEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveRelations, saveAttributes, saveCredentials, saveCalculatedFields, savePermissions, saveGroupEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionCreateConfig {\n");
    sb.append("    saveRelations: ").append(toIndentedString(saveRelations)).append("\n");
    sb.append("    saveAttributes: ").append(toIndentedString(saveAttributes)).append("\n");
    sb.append("    saveCredentials: ").append(toIndentedString(saveCredentials)).append("\n");
    sb.append("    saveCalculatedFields: ").append(toIndentedString(saveCalculatedFields)).append("\n");
    sb.append("    savePermissions: ").append(toIndentedString(savePermissions)).append("\n");
    sb.append("    saveGroupEntities: ").append(toIndentedString(saveGroupEntities)).append("\n");
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

    // add `saveRelations` to the URL query string
    if (getSaveRelations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveRelations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveRelations()))));
    }

    // add `saveAttributes` to the URL query string
    if (getSaveAttributes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveAttributes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveAttributes()))));
    }

    // add `saveCredentials` to the URL query string
    if (getSaveCredentials() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveCredentials%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveCredentials()))));
    }

    // add `saveCalculatedFields` to the URL query string
    if (getSaveCalculatedFields() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveCalculatedFields%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveCalculatedFields()))));
    }

    // add `savePermissions` to the URL query string
    if (getSavePermissions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssavePermissions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSavePermissions()))));
    }

    // add `saveGroupEntities` to the URL query string
    if (getSaveGroupEntities() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssaveGroupEntities%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSaveGroupEntities()))));
    }

    return joiner.toString();
  }
}

