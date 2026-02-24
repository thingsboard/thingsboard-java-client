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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.AlarmConditionFilter;
import org.thingsboard.client.model.AlarmConditionSpec;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmCondition
 */
@JsonPropertyOrder({
  AlarmCondition.JSON_PROPERTY_CONDITION,
  AlarmCondition.JSON_PROPERTY_SPEC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AlarmCondition {
  public static final String JSON_PROPERTY_CONDITION = "condition";
  @javax.annotation.Nullable
  private List<AlarmConditionFilter> condition = new ArrayList<>();

  public static final String JSON_PROPERTY_SPEC = "spec";
  @javax.annotation.Nullable
  private AlarmConditionSpec spec;

  public AlarmCondition() { 
  }

  public AlarmCondition condition(@javax.annotation.Nullable List<AlarmConditionFilter> condition) {
    this.condition = condition;
    return this;
  }

  public AlarmCondition addConditionItem(AlarmConditionFilter conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlarmConditionFilter> getCondition() {
    return condition;
  }


  @JsonProperty(value = JSON_PROPERTY_CONDITION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(@javax.annotation.Nullable List<AlarmConditionFilter> condition) {
    this.condition = condition;
  }


  public AlarmCondition spec(@javax.annotation.Nullable AlarmConditionSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * JSON object representing alarm condition type
   * @return spec
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SPEC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmConditionSpec getSpec() {
    return spec;
  }


  @JsonProperty(value = JSON_PROPERTY_SPEC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpec(@javax.annotation.Nullable AlarmConditionSpec spec) {
    this.spec = spec;
  }


  /**
   * Return true if this AlarmCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmCondition alarmCondition = (AlarmCondition) o;
    return Objects.equals(this.condition, alarmCondition.condition) &&
        Objects.equals(this.spec, alarmCondition.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmCondition {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

    // add `condition` to the URL query string
    if (getCondition() != null) {
      for (int i = 0; i < getCondition().size(); i++) {
        if (getCondition().get(i) != null) {
          joiner.add(getCondition().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scondition%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `spec` to the URL query string
    if (getSpec() != null) {
      joiner.add(getSpec().toUrlQueryString(prefix + "spec" + suffix));
    }

    return joiner.toString();
  }
}

