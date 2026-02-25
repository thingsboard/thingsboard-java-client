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
 * Change Password Request
 */
@JsonPropertyOrder({
  ChangePasswordRequest.JSON_PROPERTY_CURRENT_PASSWORD,
  ChangePasswordRequest.JSON_PROPERTY_NEW_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ChangePasswordRequest {
  public static final String JSON_PROPERTY_CURRENT_PASSWORD = "currentPassword";
  @javax.annotation.Nullable
  private String currentPassword;

  public static final String JSON_PROPERTY_NEW_PASSWORD = "newPassword";
  @javax.annotation.Nullable
  private String newPassword;

  public ChangePasswordRequest() { 
  }

  public ChangePasswordRequest currentPassword(@javax.annotation.Nullable String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * The old password
   * @return currentPassword
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentPassword() {
    return currentPassword;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPassword(@javax.annotation.Nullable String currentPassword) {
    this.currentPassword = currentPassword;
  }


  public ChangePasswordRequest newPassword(@javax.annotation.Nullable String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * The new password
   * @return newPassword
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NEW_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNewPassword() {
    return newPassword;
  }


  @JsonProperty(value = JSON_PROPERTY_NEW_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewPassword(@javax.annotation.Nullable String newPassword) {
    this.newPassword = newPassword;
  }


  /**
   * Return true if this ChangePasswordRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) o;
    return Objects.equals(this.currentPassword, changePasswordRequest.currentPassword) &&
        Objects.equals(this.newPassword, changePasswordRequest.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordRequest {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

    // add `currentPassword` to the URL query string
    if (getCurrentPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentPassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPassword()))));
    }

    // add `newPassword` to the URL query string
    if (getNewPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snewPassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNewPassword()))));
    }

    return joiner.toString();
  }
}

