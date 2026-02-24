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
 * Reset password request.
 */
@JsonPropertyOrder({
  ResetPasswordRequest.JSON_PROPERTY_RESET_TOKEN,
  ResetPasswordRequest.JSON_PROPERTY_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ResetPasswordRequest {
  public static final String JSON_PROPERTY_RESET_TOKEN = "resetToken";
  @javax.annotation.Nullable
  private String resetToken;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private String password;

  public ResetPasswordRequest() { 
  }

  public ResetPasswordRequest resetToken(@javax.annotation.Nullable String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

  /**
   * The reset token to verify
   * @return resetToken
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESET_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResetToken() {
    return resetToken;
  }


  @JsonProperty(value = JSON_PROPERTY_RESET_TOKEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResetToken(@javax.annotation.Nullable String resetToken) {
    this.resetToken = resetToken;
  }


  public ResetPasswordRequest password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * The new password to set
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  /**
   * Return true if this ResetPasswordRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return Objects.equals(this.resetToken, resetPasswordRequest.resetToken) &&
        Objects.equals(this.password, resetPasswordRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetToken, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

    // add `resetToken` to the URL query string
    if (getResetToken() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresetToken%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResetToken()))));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPassword()))));
    }

    return joiner.toString();
  }
}

