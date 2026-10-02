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
import javax.annotation.Nonnull;
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
 * SystemSetupRequest
 */
@JsonPropertyOrder({
  SystemSetupRequest.JSON_PROPERTY_EMAIL,
  SystemSetupRequest.JSON_PROPERTY_PASSWORD,
  SystemSetupRequest.JSON_PROPERTY_LOAD_DEMO
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SystemSetupRequest {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @Nonnull
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @Nonnull
  private String password;

  public static final String JSON_PROPERTY_LOAD_DEMO = "loadDemo";
  @Nullable
  private Boolean loadDemo;

  public SystemSetupRequest() { 
  }

  public SystemSetupRequest email(@Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@Nonnull String email) {
    this.email = email;
  }


  public SystemSetupRequest password(@Nonnull String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPassword() {
    return password;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(@Nonnull String password) {
    this.password = password;
  }


  public SystemSetupRequest loadDemo(@Nullable Boolean loadDemo) {
    this.loadDemo = loadDemo;
    return this;
  }

  /**
   * Get loadDemo
   * @return loadDemo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LOAD_DEMO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLoadDemo() {
    return loadDemo;
  }


  @JsonProperty(value = JSON_PROPERTY_LOAD_DEMO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadDemo(@Nullable Boolean loadDemo) {
    this.loadDemo = loadDemo;
  }


  /**
   * Return true if this SystemSetupRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemSetupRequest systemSetupRequest = (SystemSetupRequest) o;
    return Objects.equals(this.email, systemSetupRequest.email) &&
        Objects.equals(this.password, systemSetupRequest.password) &&
        Objects.equals(this.loadDemo, systemSetupRequest.loadDemo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, loadDemo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemSetupRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    loadDemo: ").append(toIndentedString(loadDemo)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmail()))));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPassword()))));
    }

    // add `loadDemo` to the URL query string
    if (getLoadDemo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sloadDemo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLoadDemo()))));
    }

    return joiner.toString();
  }
}

