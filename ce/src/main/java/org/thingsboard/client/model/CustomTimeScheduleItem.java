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
 * CustomTimeScheduleItem
 */
@JsonPropertyOrder({
  CustomTimeScheduleItem.JSON_PROPERTY_ENABLED,
  CustomTimeScheduleItem.JSON_PROPERTY_DAY_OF_WEEK,
  CustomTimeScheduleItem.JSON_PROPERTY_STARTS_ON,
  CustomTimeScheduleItem.JSON_PROPERTY_ENDS_ON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class CustomTimeScheduleItem {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  @javax.annotation.Nullable
  private Integer dayOfWeek;

  public static final String JSON_PROPERTY_STARTS_ON = "startsOn";
  @javax.annotation.Nullable
  private Long startsOn;

  public static final String JSON_PROPERTY_ENDS_ON = "endsOn";
  @javax.annotation.Nullable
  private Long endsOn;

  public CustomTimeScheduleItem() { 
  }

  public CustomTimeScheduleItem enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  public CustomTimeScheduleItem dayOfWeek(@javax.annotation.Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DAY_OF_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(value = JSON_PROPERTY_DAY_OF_WEEK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(@javax.annotation.Nullable Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public CustomTimeScheduleItem startsOn(@javax.annotation.Nullable Long startsOn) {
    this.startsOn = startsOn;
    return this;
  }

  /**
   * Get startsOn
   * @return startsOn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STARTS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartsOn() {
    return startsOn;
  }


  @JsonProperty(value = JSON_PROPERTY_STARTS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsOn(@javax.annotation.Nullable Long startsOn) {
    this.startsOn = startsOn;
  }


  public CustomTimeScheduleItem endsOn(@javax.annotation.Nullable Long endsOn) {
    this.endsOn = endsOn;
    return this;
  }

  /**
   * Get endsOn
   * @return endsOn
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENDS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndsOn() {
    return endsOn;
  }


  @JsonProperty(value = JSON_PROPERTY_ENDS_ON, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndsOn(@javax.annotation.Nullable Long endsOn) {
    this.endsOn = endsOn;
  }


  /**
   * Return true if this CustomTimeScheduleItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTimeScheduleItem customTimeScheduleItem = (CustomTimeScheduleItem) o;
    return Objects.equals(this.enabled, customTimeScheduleItem.enabled) &&
        Objects.equals(this.dayOfWeek, customTimeScheduleItem.dayOfWeek) &&
        Objects.equals(this.startsOn, customTimeScheduleItem.startsOn) &&
        Objects.equals(this.endsOn, customTimeScheduleItem.endsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, dayOfWeek, startsOn, endsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTimeScheduleItem {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
    sb.append("    endsOn: ").append(toIndentedString(endsOn)).append("\n");
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

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `dayOfWeek` to the URL query string
    if (getDayOfWeek() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdayOfWeek%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDayOfWeek()))));
    }

    // add `startsOn` to the URL query string
    if (getStartsOn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartsOn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartsOn()))));
    }

    // add `endsOn` to the URL query string
    if (getEndsOn() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendsOn%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndsOn()))));
    }

    return joiner.toString();
  }
}

