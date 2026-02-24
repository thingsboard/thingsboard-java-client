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
 * ChartFillSettingsGradient
 */
@JsonPropertyOrder({
  ChartFillSettingsGradient.JSON_PROPERTY_START,
  ChartFillSettingsGradient.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ChartFillSettingsGradient {
  public static final String JSON_PROPERTY_START = "start";
  @javax.annotation.Nullable
  private Float start;

  public static final String JSON_PROPERTY_END = "end";
  @javax.annotation.Nullable
  private Float end;

  public ChartFillSettingsGradient() { 
  }

  public ChartFillSettingsGradient start(@javax.annotation.Nullable Float start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getStart() {
    return start;
  }


  @JsonProperty(value = JSON_PROPERTY_START, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(@javax.annotation.Nullable Float start) {
    this.start = start;
  }


  public ChartFillSettingsGradient end(@javax.annotation.Nullable Float end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getEnd() {
    return end;
  }


  @JsonProperty(value = JSON_PROPERTY_END, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(@javax.annotation.Nullable Float end) {
    this.end = end;
  }


  /**
   * Return true if this ChartFillSettingsGradient object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartFillSettingsGradient chartFillSettingsGradient = (ChartFillSettingsGradient) o;
    return Objects.equals(this.start, chartFillSettingsGradient.start) &&
        Objects.equals(this.end, chartFillSettingsGradient.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartFillSettingsGradient {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

    // add `start` to the URL query string
    if (getStart() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstart%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStart()))));
    }

    // add `end` to the URL query string
    if (getEnd() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%send%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnd()))));
    }

    return joiner.toString();
  }
}

