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
 * AlarmRuleCustomTimeScheduleItem
 */
@JsonPropertyOrder({
  AlarmRuleCustomTimeScheduleItem.JSON_PROPERTY_DAY_OF_WEEK,
  AlarmRuleCustomTimeScheduleItem.JSON_PROPERTY_ENABLED,
  AlarmRuleCustomTimeScheduleItem.JSON_PROPERTY_ENDS_ON,
  AlarmRuleCustomTimeScheduleItem.JSON_PROPERTY_STARTS_ON
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmRuleCustomTimeScheduleItem {
  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  @Nullable
  private Integer dayOfWeek;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENDS_ON = "endsOn";
  @Nullable
  private Long endsOn;

  public static final String JSON_PROPERTY_STARTS_ON = "startsOn";
  @Nullable
  private Long startsOn;

  public AlarmRuleCustomTimeScheduleItem() { 
  }

  public AlarmRuleCustomTimeScheduleItem dayOfWeek(@Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DAY_OF_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(value = JSON_PROPERTY_DAY_OF_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(@Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public AlarmRuleCustomTimeScheduleItem enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public AlarmRuleCustomTimeScheduleItem endsOn(@Nullable Long endsOn) {
    this.endsOn = endsOn;
    return this;
  }

  /**
   * Get endsOn
   * @return endsOn
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENDS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndsOn() {
    return endsOn;
  }


  @JsonProperty(value = JSON_PROPERTY_ENDS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndsOn(@Nullable Long endsOn) {
    this.endsOn = endsOn;
  }


  public AlarmRuleCustomTimeScheduleItem startsOn(@Nullable Long startsOn) {
    this.startsOn = startsOn;
    return this;
  }

  /**
   * Get startsOn
   * @return startsOn
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STARTS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartsOn() {
    return startsOn;
  }


  @JsonProperty(value = JSON_PROPERTY_STARTS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsOn(@Nullable Long startsOn) {
    this.startsOn = startsOn;
  }


  /**
   * Return true if this AlarmRuleCustomTimeScheduleItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRuleCustomTimeScheduleItem alarmRuleCustomTimeScheduleItem = (AlarmRuleCustomTimeScheduleItem) o;
    return Objects.equals(this.dayOfWeek, alarmRuleCustomTimeScheduleItem.dayOfWeek) &&
        Objects.equals(this.enabled, alarmRuleCustomTimeScheduleItem.enabled) &&
        Objects.equals(this.endsOn, alarmRuleCustomTimeScheduleItem.endsOn) &&
        Objects.equals(this.startsOn, alarmRuleCustomTimeScheduleItem.startsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, enabled, endsOn, startsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRuleCustomTimeScheduleItem {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endsOn: ").append(toIndentedString(endsOn)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
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

    // add `dayOfWeek` to the URL query string
    if (getDayOfWeek() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdayOfWeek%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDayOfWeek()))));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `endsOn` to the URL query string
    if (getEndsOn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendsOn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndsOn()))));
    }

    // add `startsOn` to the URL query string
    if (getStartsOn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartsOn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartsOn()))));
    }

    return joiner.toString();
  }
}

