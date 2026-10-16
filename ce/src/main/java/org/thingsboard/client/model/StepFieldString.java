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
 * StepFieldString
 */
@JsonPropertyOrder({
  StepFieldString.JSON_PROPERTY_VALUE,
  StepFieldString.JSON_PROPERTY_USER_CHOICE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class StepFieldString {
  public static final String JSON_PROPERTY_VALUE = "value";
  @Nullable
  private String value;

  public static final String JSON_PROPERTY_USER_CHOICE = "userChoice";
  @Nullable
  private Boolean userChoice;

  public StepFieldString() { 
  }

  public StepFieldString value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@Nullable String value) {
    this.value = value;
  }


  public StepFieldString userChoice(@Nullable Boolean userChoice) {
    this.userChoice = userChoice;
    return this;
  }

  /**
   * Get userChoice
   * @return userChoice
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_CHOICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUserChoice() {
    return userChoice;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_CHOICE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserChoice(@Nullable Boolean userChoice) {
    this.userChoice = userChoice;
  }


  /**
   * Return true if this StepFieldString object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepFieldString stepFieldString = (StepFieldString) o;
    return Objects.equals(this.value, stepFieldString.value) &&
        Objects.equals(this.userChoice, stepFieldString.userChoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, userChoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepFieldString {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    userChoice: ").append(toIndentedString(userChoice)).append("\n");
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

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `userChoice` to the URL query string
    if (getUserChoice() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserChoice%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserChoice()))));
    }

    return joiner.toString();
  }
}

