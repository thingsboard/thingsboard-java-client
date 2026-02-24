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
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * UserEmailInfo
 */
@JsonPropertyOrder({
  UserEmailInfo.JSON_PROPERTY_ID,
  UserEmailInfo.JSON_PROPERTY_EMAIL,
  UserEmailInfo.JSON_PROPERTY_FIRST_NAME,
  UserEmailInfo.JSON_PROPERTY_LAST_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UserEmailInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UserId id;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @javax.annotation.Nullable
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @javax.annotation.Nullable
  private String lastName;

  public UserEmailInfo() { 
  }

  public UserEmailInfo id(@javax.annotation.Nullable UserId id) {
    this.id = id;
    return this;
  }

  /**
   * User id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UserId id) {
    this.id = id;
  }


  public UserEmailInfo email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * User email
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public UserEmailInfo firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User first name
   * @return firstName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public UserEmailInfo lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User last name
   * @return lastName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastName() {
    return lastName;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  /**
   * Return true if this UserEmailInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEmailInfo userEmailInfo = (UserEmailInfo) o;
    return Objects.equals(this.id, userEmailInfo.id) &&
        Objects.equals(this.email, userEmailInfo.email) &&
        Objects.equals(this.firstName, userEmailInfo.firstName) &&
        Objects.equals(this.lastName, userEmailInfo.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEmailInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmail()))));
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirstName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirstName()))));
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastName()))));
    }

    return joiner.toString();
  }
}

