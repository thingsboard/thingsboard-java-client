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
import org.thingsboard.client.model.SignUpFieldId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SignUpField
 */
@JsonPropertyOrder({
  SignUpField.JSON_PROPERTY_ID,
  SignUpField.JSON_PROPERTY_LABEL,
  SignUpField.JSON_PROPERTY_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SignUpField {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private SignUpFieldId id;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nonnull
  private String label;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  @javax.annotation.Nullable
  private Boolean required;

  public SignUpField() { 
  }

  public SignUpField id(@javax.annotation.Nonnull SignUpFieldId id) {
    this.id = id;
    return this;
  }

  /**
   * Signup field id
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SignUpFieldId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull SignUpFieldId id) {
    this.id = id;
  }


  public SignUpField label(@javax.annotation.Nonnull String label) {
    this.label = label;
    return this;
  }

  /**
   * Signup field label
   * @return label
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(@javax.annotation.Nonnull String label) {
    this.label = label;
  }


  public SignUpField required(@javax.annotation.Nullable Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Indicates if field is required
   * @return required
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REQUIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(value = JSON_PROPERTY_REQUIRED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(@javax.annotation.Nullable Boolean required) {
    this.required = required;
  }


  /**
   * Return true if this SignUpField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpField signUpField = (SignUpField) o;
    return Objects.equals(this.id, signUpField.id) &&
        Objects.equals(this.label, signUpField.label) &&
        Objects.equals(this.required, signUpField.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `required` to the URL query string
    if (getRequired() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srequired%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRequired()))));
    }

    return joiner.toString();
  }
}

