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
import org.thingsboard.client.model.AlarmRuleKeyFilterPredicate;
import org.thingsboard.client.model.ComplexOperation;
import org.thingsboard.client.model.EntityKeyValueType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmRuleConditionFilter
 */
@JsonPropertyOrder({
  AlarmRuleConditionFilter.JSON_PROPERTY_ARGUMENT,
  AlarmRuleConditionFilter.JSON_PROPERTY_VALUE_TYPE,
  AlarmRuleConditionFilter.JSON_PROPERTY_OPERATION,
  AlarmRuleConditionFilter.JSON_PROPERTY_PREDICATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AlarmRuleConditionFilter {
  public static final String JSON_PROPERTY_ARGUMENT = "argument";
  @javax.annotation.Nonnull
  private String argument;

  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  @javax.annotation.Nonnull
  private EntityKeyValueType valueType;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  @javax.annotation.Nullable
  private ComplexOperation operation;

  public static final String JSON_PROPERTY_PREDICATES = "predicates";
  @javax.annotation.Nonnull
  private List<AlarmRuleKeyFilterPredicate> predicates = new ArrayList<>();

  public AlarmRuleConditionFilter() { 
  }

  public AlarmRuleConditionFilter argument(@javax.annotation.Nonnull String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * Get argument
   * @return argument
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ARGUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArgument() {
    return argument;
  }


  @JsonProperty(value = JSON_PROPERTY_ARGUMENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArgument(@javax.annotation.Nonnull String argument) {
    this.argument = argument;
  }


  public AlarmRuleConditionFilter valueType(@javax.annotation.Nonnull EntityKeyValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType
   * @return valueType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityKeyValueType getValueType() {
    return valueType;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValueType(@javax.annotation.Nonnull EntityKeyValueType valueType) {
    this.valueType = valueType;
  }


  public AlarmRuleConditionFilter operation(@javax.annotation.Nullable ComplexOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComplexOperation getOperation() {
    return operation;
  }


  @JsonProperty(value = JSON_PROPERTY_OPERATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(@javax.annotation.Nullable ComplexOperation operation) {
    this.operation = operation;
  }


  public AlarmRuleConditionFilter predicates(@javax.annotation.Nonnull List<AlarmRuleKeyFilterPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public AlarmRuleConditionFilter addPredicatesItem(AlarmRuleKeyFilterPredicate predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

  /**
   * Get predicates
   * @return predicates
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PREDICATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AlarmRuleKeyFilterPredicate> getPredicates() {
    return predicates;
  }


  @JsonProperty(value = JSON_PROPERTY_PREDICATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPredicates(@javax.annotation.Nonnull List<AlarmRuleKeyFilterPredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   * Return true if this AlarmRuleConditionFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRuleConditionFilter alarmRuleConditionFilter = (AlarmRuleConditionFilter) o;
    return Objects.equals(this.argument, alarmRuleConditionFilter.argument) &&
        Objects.equals(this.valueType, alarmRuleConditionFilter.valueType) &&
        Objects.equals(this.operation, alarmRuleConditionFilter.operation) &&
        Objects.equals(this.predicates, alarmRuleConditionFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, valueType, operation, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRuleConditionFilter {\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

    // add `argument` to the URL query string
    if (getArgument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sargument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getArgument()))));
    }

    // add `valueType` to the URL query string
    if (getValueType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalueType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValueType()))));
    }

    // add `operation` to the URL query string
    if (getOperation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soperation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOperation()))));
    }

    // add `predicates` to the URL query string
    if (getPredicates() != null) {
      for (int i = 0; i < getPredicates().size(); i++) {
        if (getPredicates().get(i) != null) {
          joiner.add(getPredicates().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%spredicates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

