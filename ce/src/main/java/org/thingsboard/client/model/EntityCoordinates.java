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
 * EntityCoordinates
 */
@JsonPropertyOrder({
  EntityCoordinates.JSON_PROPERTY_LATITUDE_KEY_NAME,
  EntityCoordinates.JSON_PROPERTY_LONGITUDE_KEY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityCoordinates {
  public static final String JSON_PROPERTY_LATITUDE_KEY_NAME = "latitudeKeyName";
  @javax.annotation.Nonnull
  private String latitudeKeyName;

  public static final String JSON_PROPERTY_LONGITUDE_KEY_NAME = "longitudeKeyName";
  @javax.annotation.Nonnull
  private String longitudeKeyName;

  public EntityCoordinates() { 
  }

  public EntityCoordinates latitudeKeyName(@javax.annotation.Nonnull String latitudeKeyName) {
    this.latitudeKeyName = latitudeKeyName;
    return this;
  }

  /**
   * Get latitudeKeyName
   * @return latitudeKeyName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LATITUDE_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLatitudeKeyName() {
    return latitudeKeyName;
  }


  @JsonProperty(value = JSON_PROPERTY_LATITUDE_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitudeKeyName(@javax.annotation.Nonnull String latitudeKeyName) {
    this.latitudeKeyName = latitudeKeyName;
  }


  public EntityCoordinates longitudeKeyName(@javax.annotation.Nonnull String longitudeKeyName) {
    this.longitudeKeyName = longitudeKeyName;
    return this;
  }

  /**
   * Get longitudeKeyName
   * @return longitudeKeyName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LONGITUDE_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLongitudeKeyName() {
    return longitudeKeyName;
  }


  @JsonProperty(value = JSON_PROPERTY_LONGITUDE_KEY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitudeKeyName(@javax.annotation.Nonnull String longitudeKeyName) {
    this.longitudeKeyName = longitudeKeyName;
  }


  /**
   * Return true if this EntityCoordinates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityCoordinates entityCoordinates = (EntityCoordinates) o;
    return Objects.equals(this.latitudeKeyName, entityCoordinates.latitudeKeyName) &&
        Objects.equals(this.longitudeKeyName, entityCoordinates.longitudeKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitudeKeyName, longitudeKeyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityCoordinates {\n");
    sb.append("    latitudeKeyName: ").append(toIndentedString(latitudeKeyName)).append("\n");
    sb.append("    longitudeKeyName: ").append(toIndentedString(longitudeKeyName)).append("\n");
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

    // add `latitudeKeyName` to the URL query string
    if (getLatitudeKeyName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatitudeKeyName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatitudeKeyName()))));
    }

    // add `longitudeKeyName` to the URL query string
    if (getLongitudeKeyName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slongitudeKeyName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongitudeKeyName()))));
    }

    return joiner.toString();
  }
}

