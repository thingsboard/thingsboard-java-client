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
 * Model
 */
@JsonPropertyOrder({
  Model.JSON_PROPERTY_NAME,
  Model.JSON_PROPERTY_INFO,
  Model.JSON_PROPERTY_PHOTO
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Model {
  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_INFO = "info";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode info = null;

  public static final String JSON_PROPERTY_PHOTO = "photo";
  @Nullable
  private String photo;

  public Model() { 
  }

  public Model name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
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


  public Model info(@Nullable com.fasterxml.jackson.databind.JsonNode info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getInfo() {
    return info;
  }


  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(@Nullable com.fasterxml.jackson.databind.JsonNode info) {
    this.info = info;
  }


  public Model photo(@Nullable String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PHOTO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhoto() {
    return photo;
  }


  @JsonProperty(value = JSON_PROPERTY_PHOTO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoto(@Nullable String photo) {
    this.photo = photo;
  }


  /**
   * Return true if this Model object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.name, model.name) &&
        Objects.equals(this.info, model.info) &&
        Objects.equals(this.photo, model.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, info, photo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInfo()))));
    }

    // add `photo` to the URL query string
    if (getPhoto() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sphoto%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPhoto()))));
    }

    return joiner.toString();
  }
}

