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
 * AutoVersionCreateConfig
 */
@JsonPropertyOrder({
  AutoVersionCreateConfig.JSON_PROPERTY_SAVE_RELATIONS,
  AutoVersionCreateConfig.JSON_PROPERTY_SAVE_ATTRIBUTES,
  AutoVersionCreateConfig.JSON_PROPERTY_SAVE_CREDENTIALS,
  AutoVersionCreateConfig.JSON_PROPERTY_SAVE_CALCULATED_FIELDS,
  AutoVersionCreateConfig.JSON_PROPERTY_BRANCH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AutoVersionCreateConfig {
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

  public static final String JSON_PROPERTY_BRANCH = "branch";
  @javax.annotation.Nullable
  private String branch;

  public AutoVersionCreateConfig() { 
  }

  public AutoVersionCreateConfig saveRelations(@javax.annotation.Nullable Boolean saveRelations) {
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


  public AutoVersionCreateConfig saveAttributes(@javax.annotation.Nullable Boolean saveAttributes) {
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


  public AutoVersionCreateConfig saveCredentials(@javax.annotation.Nullable Boolean saveCredentials) {
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


  public AutoVersionCreateConfig saveCalculatedFields(@javax.annotation.Nullable Boolean saveCalculatedFields) {
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


  public AutoVersionCreateConfig branch(@javax.annotation.Nullable String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BRANCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBranch() {
    return branch;
  }


  @JsonProperty(value = JSON_PROPERTY_BRANCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(@javax.annotation.Nullable String branch) {
    this.branch = branch;
  }


  /**
   * Return true if this AutoVersionCreateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoVersionCreateConfig autoVersionCreateConfig = (AutoVersionCreateConfig) o;
    return Objects.equals(this.saveRelations, autoVersionCreateConfig.saveRelations) &&
        Objects.equals(this.saveAttributes, autoVersionCreateConfig.saveAttributes) &&
        Objects.equals(this.saveCredentials, autoVersionCreateConfig.saveCredentials) &&
        Objects.equals(this.saveCalculatedFields, autoVersionCreateConfig.saveCalculatedFields) &&
        Objects.equals(this.branch, autoVersionCreateConfig.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveRelations, saveAttributes, saveCredentials, saveCalculatedFields, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoVersionCreateConfig {\n");
    sb.append("    saveRelations: ").append(toIndentedString(saveRelations)).append("\n");
    sb.append("    saveAttributes: ").append(toIndentedString(saveAttributes)).append("\n");
    sb.append("    saveCredentials: ").append(toIndentedString(saveCredentials)).append("\n");
    sb.append("    saveCalculatedFields: ").append(toIndentedString(saveCalculatedFields)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

    // add `branch` to the URL query string
    if (getBranch() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbranch%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBranch()))));
    }

    return joiner.toString();
  }
}

