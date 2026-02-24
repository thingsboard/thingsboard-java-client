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
import org.thingsboard.client.model.TsValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ComparisonTsValue
 */
@JsonPropertyOrder({
  ComparisonTsValue.JSON_PROPERTY_CURRENT,
  ComparisonTsValue.JSON_PROPERTY_PREVIOUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ComparisonTsValue {
  public static final String JSON_PROPERTY_CURRENT = "current";
  @javax.annotation.Nullable
  private TsValue current;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  @javax.annotation.Nullable
  private TsValue previous;

  public ComparisonTsValue() { 
  }

  public ComparisonTsValue current(@javax.annotation.Nullable TsValue current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TsValue getCurrent() {
    return current;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(@javax.annotation.Nullable TsValue current) {
    this.current = current;
  }


  public ComparisonTsValue previous(@javax.annotation.Nullable TsValue previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREVIOUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TsValue getPrevious() {
    return previous;
  }


  @JsonProperty(value = JSON_PROPERTY_PREVIOUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(@javax.annotation.Nullable TsValue previous) {
    this.previous = previous;
  }


  /**
   * Return true if this ComparisonTsValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonTsValue comparisonTsValue = (ComparisonTsValue) o;
    return Objects.equals(this.current, comparisonTsValue.current) &&
        Objects.equals(this.previous, comparisonTsValue.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonTsValue {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

    // add `current` to the URL query string
    if (getCurrent() != null) {
      joiner.add(getCurrent().toUrlQueryString(prefix + "current" + suffix));
    }

    // add `previous` to the URL query string
    if (getPrevious() != null) {
      joiner.add(getPrevious().toUrlQueryString(prefix + "previous" + suffix));
    }

    return joiner.toString();
  }
}

