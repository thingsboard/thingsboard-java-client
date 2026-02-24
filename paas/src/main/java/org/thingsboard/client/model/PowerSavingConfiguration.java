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
import org.thingsboard.client.model.PowerMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * PowerSavingConfiguration
 */
@JsonPropertyOrder({
  PowerSavingConfiguration.JSON_PROPERTY_POWER_MODE,
  PowerSavingConfiguration.JSON_PROPERTY_PSM_ACTIVITY_TIMER,
  PowerSavingConfiguration.JSON_PROPERTY_EDRX_CYCLE,
  PowerSavingConfiguration.JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class PowerSavingConfiguration {
  public static final String JSON_PROPERTY_POWER_MODE = "powerMode";
  @javax.annotation.Nullable
  private PowerMode powerMode;

  public static final String JSON_PROPERTY_PSM_ACTIVITY_TIMER = "psmActivityTimer";
  @javax.annotation.Nullable
  private Long psmActivityTimer;

  public static final String JSON_PROPERTY_EDRX_CYCLE = "edrxCycle";
  @javax.annotation.Nullable
  private Long edrxCycle;

  public static final String JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW = "pagingTransmissionWindow";
  @javax.annotation.Nullable
  private Long pagingTransmissionWindow;

  public PowerSavingConfiguration() { 
  }

  public PowerSavingConfiguration powerMode(@javax.annotation.Nullable PowerMode powerMode) {
    this.powerMode = powerMode;
    return this;
  }

  /**
   * Get powerMode
   * @return powerMode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_POWER_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerMode getPowerMode() {
    return powerMode;
  }


  @JsonProperty(value = JSON_PROPERTY_POWER_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerMode(@javax.annotation.Nullable PowerMode powerMode) {
    this.powerMode = powerMode;
  }


  public PowerSavingConfiguration psmActivityTimer(@javax.annotation.Nullable Long psmActivityTimer) {
    this.psmActivityTimer = psmActivityTimer;
    return this;
  }

  /**
   * Get psmActivityTimer
   * @return psmActivityTimer
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PSM_ACTIVITY_TIMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPsmActivityTimer() {
    return psmActivityTimer;
  }


  @JsonProperty(value = JSON_PROPERTY_PSM_ACTIVITY_TIMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsmActivityTimer(@javax.annotation.Nullable Long psmActivityTimer) {
    this.psmActivityTimer = psmActivityTimer;
  }


  public PowerSavingConfiguration edrxCycle(@javax.annotation.Nullable Long edrxCycle) {
    this.edrxCycle = edrxCycle;
    return this;
  }

  /**
   * Get edrxCycle
   * @return edrxCycle
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDRX_CYCLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEdrxCycle() {
    return edrxCycle;
  }


  @JsonProperty(value = JSON_PROPERTY_EDRX_CYCLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdrxCycle(@javax.annotation.Nullable Long edrxCycle) {
    this.edrxCycle = edrxCycle;
  }


  public PowerSavingConfiguration pagingTransmissionWindow(@javax.annotation.Nullable Long pagingTransmissionWindow) {
    this.pagingTransmissionWindow = pagingTransmissionWindow;
    return this;
  }

  /**
   * Get pagingTransmissionWindow
   * @return pagingTransmissionWindow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPagingTransmissionWindow() {
    return pagingTransmissionWindow;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagingTransmissionWindow(@javax.annotation.Nullable Long pagingTransmissionWindow) {
    this.pagingTransmissionWindow = pagingTransmissionWindow;
  }


  /**
   * Return true if this PowerSavingConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerSavingConfiguration powerSavingConfiguration = (PowerSavingConfiguration) o;
    return Objects.equals(this.powerMode, powerSavingConfiguration.powerMode) &&
        Objects.equals(this.psmActivityTimer, powerSavingConfiguration.psmActivityTimer) &&
        Objects.equals(this.edrxCycle, powerSavingConfiguration.edrxCycle) &&
        Objects.equals(this.pagingTransmissionWindow, powerSavingConfiguration.pagingTransmissionWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerMode, psmActivityTimer, edrxCycle, pagingTransmissionWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerSavingConfiguration {\n");
    sb.append("    powerMode: ").append(toIndentedString(powerMode)).append("\n");
    sb.append("    psmActivityTimer: ").append(toIndentedString(psmActivityTimer)).append("\n");
    sb.append("    edrxCycle: ").append(toIndentedString(edrxCycle)).append("\n");
    sb.append("    pagingTransmissionWindow: ").append(toIndentedString(pagingTransmissionWindow)).append("\n");
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

    // add `powerMode` to the URL query string
    if (getPowerMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spowerMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPowerMode()))));
    }

    // add `psmActivityTimer` to the URL query string
    if (getPsmActivityTimer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spsmActivityTimer%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPsmActivityTimer()))));
    }

    // add `edrxCycle` to the URL query string
    if (getEdrxCycle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedrxCycle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdrxCycle()))));
    }

    // add `pagingTransmissionWindow` to the URL query string
    if (getPagingTransmissionWindow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spagingTransmissionWindow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPagingTransmissionWindow()))));
    }

    return joiner.toString();
  }
}

