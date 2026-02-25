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
import org.thingsboard.client.model.AlarmRuleSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmConditionValueAlarmRuleSchedule
 */
@JsonPropertyOrder({
  AlarmConditionValueAlarmRuleSchedule.JSON_PROPERTY_STATIC_VALUE,
  AlarmConditionValueAlarmRuleSchedule.JSON_PROPERTY_DYNAMIC_VALUE_ARGUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmConditionValueAlarmRuleSchedule {
  public static final String JSON_PROPERTY_STATIC_VALUE = "staticValue";
  @javax.annotation.Nullable
  private AlarmRuleSchedule staticValue;

  public static final String JSON_PROPERTY_DYNAMIC_VALUE_ARGUMENT = "dynamicValueArgument";
  @javax.annotation.Nullable
  private String dynamicValueArgument;

  public AlarmConditionValueAlarmRuleSchedule() { 
  }

  public AlarmConditionValueAlarmRuleSchedule staticValue(@javax.annotation.Nullable AlarmRuleSchedule staticValue) {
    this.staticValue = staticValue;
    return this;
  }

  /**
   * Get staticValue
   * @return staticValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATIC_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmRuleSchedule getStaticValue() {
    return staticValue;
  }


  @JsonProperty(value = JSON_PROPERTY_STATIC_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStaticValue(@javax.annotation.Nullable AlarmRuleSchedule staticValue) {
    this.staticValue = staticValue;
  }


  public AlarmConditionValueAlarmRuleSchedule dynamicValueArgument(@javax.annotation.Nullable String dynamicValueArgument) {
    this.dynamicValueArgument = dynamicValueArgument;
    return this;
  }

  /**
   * Get dynamicValueArgument
   * @return dynamicValueArgument
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DYNAMIC_VALUE_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDynamicValueArgument() {
    return dynamicValueArgument;
  }


  @JsonProperty(value = JSON_PROPERTY_DYNAMIC_VALUE_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicValueArgument(@javax.annotation.Nullable String dynamicValueArgument) {
    this.dynamicValueArgument = dynamicValueArgument;
  }


  /**
   * Return true if this AlarmConditionValueAlarmRuleSchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmConditionValueAlarmRuleSchedule alarmConditionValueAlarmRuleSchedule = (AlarmConditionValueAlarmRuleSchedule) o;
    return Objects.equals(this.staticValue, alarmConditionValueAlarmRuleSchedule.staticValue) &&
        Objects.equals(this.dynamicValueArgument, alarmConditionValueAlarmRuleSchedule.dynamicValueArgument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staticValue, dynamicValueArgument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmConditionValueAlarmRuleSchedule {\n");
    sb.append("    staticValue: ").append(toIndentedString(staticValue)).append("\n");
    sb.append("    dynamicValueArgument: ").append(toIndentedString(dynamicValueArgument)).append("\n");
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

    // add `staticValue` to the URL query string
    if (getStaticValue() != null) {
      joiner.add(getStaticValue().toUrlQueryString(prefix + "staticValue" + suffix));
    }

    // add `dynamicValueArgument` to the URL query string
    if (getDynamicValueArgument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdynamicValueArgument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDynamicValueArgument()))));
    }

    return joiner.toString();
  }
}

