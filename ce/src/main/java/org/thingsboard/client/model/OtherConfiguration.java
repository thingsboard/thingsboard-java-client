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
import org.thingsboard.client.model.PowerMode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OtherConfiguration
 */
@JsonPropertyOrder({
  OtherConfiguration.JSON_PROPERTY_POWER_MODE,
  OtherConfiguration.JSON_PROPERTY_PSM_ACTIVITY_TIMER,
  OtherConfiguration.JSON_PROPERTY_EDRX_CYCLE,
  OtherConfiguration.JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW,
  OtherConfiguration.JSON_PROPERTY_USE_OBJECT19_FOR_OTA_INFO,
  OtherConfiguration.JSON_PROPERTY_FW_UPDATE_STRATEGY,
  OtherConfiguration.JSON_PROPERTY_SW_UPDATE_STRATEGY,
  OtherConfiguration.JSON_PROPERTY_CLIENT_ONLY_OBSERVE_AFTER_CONNECT,
  OtherConfiguration.JSON_PROPERTY_FW_UPDATE_RESOURCE,
  OtherConfiguration.JSON_PROPERTY_SW_UPDATE_RESOURCE,
  OtherConfiguration.JSON_PROPERTY_DEFAULT_OBJECT_I_D_VER
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OtherConfiguration {
  public static final String JSON_PROPERTY_POWER_MODE = "powerMode";
  @Nullable
  private PowerMode powerMode;

  public static final String JSON_PROPERTY_PSM_ACTIVITY_TIMER = "psmActivityTimer";
  @Nullable
  private Long psmActivityTimer;

  public static final String JSON_PROPERTY_EDRX_CYCLE = "edrxCycle";
  @Nullable
  private Long edrxCycle;

  public static final String JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW = "pagingTransmissionWindow";
  @Nullable
  private Long pagingTransmissionWindow;

  public static final String JSON_PROPERTY_USE_OBJECT19_FOR_OTA_INFO = "useObject19ForOtaInfo";
  @Nullable
  private Boolean useObject19ForOtaInfo;

  public static final String JSON_PROPERTY_FW_UPDATE_STRATEGY = "fwUpdateStrategy";
  @Nullable
  private Integer fwUpdateStrategy;

  public static final String JSON_PROPERTY_SW_UPDATE_STRATEGY = "swUpdateStrategy";
  @Nullable
  private Integer swUpdateStrategy;

  public static final String JSON_PROPERTY_CLIENT_ONLY_OBSERVE_AFTER_CONNECT = "clientOnlyObserveAfterConnect";
  @Nullable
  private Integer clientOnlyObserveAfterConnect;

  public static final String JSON_PROPERTY_FW_UPDATE_RESOURCE = "fwUpdateResource";
  @Nullable
  private String fwUpdateResource;

  public static final String JSON_PROPERTY_SW_UPDATE_RESOURCE = "swUpdateResource";
  @Nullable
  private String swUpdateResource;

  public static final String JSON_PROPERTY_DEFAULT_OBJECT_I_D_VER = "defaultObjectIDVer";
  @Nullable
  private String defaultObjectIDVer;

  public OtherConfiguration() { 
  }

  public OtherConfiguration powerMode(@Nullable PowerMode powerMode) {
    this.powerMode = powerMode;
    return this;
  }

  /**
   * Get powerMode
   * @return powerMode
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_POWER_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerMode getPowerMode() {
    return powerMode;
  }


  @JsonProperty(value = JSON_PROPERTY_POWER_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerMode(@Nullable PowerMode powerMode) {
    this.powerMode = powerMode;
  }


  public OtherConfiguration psmActivityTimer(@Nullable Long psmActivityTimer) {
    this.psmActivityTimer = psmActivityTimer;
    return this;
  }

  /**
   * Get psmActivityTimer
   * @return psmActivityTimer
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PSM_ACTIVITY_TIMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPsmActivityTimer() {
    return psmActivityTimer;
  }


  @JsonProperty(value = JSON_PROPERTY_PSM_ACTIVITY_TIMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsmActivityTimer(@Nullable Long psmActivityTimer) {
    this.psmActivityTimer = psmActivityTimer;
  }


  public OtherConfiguration edrxCycle(@Nullable Long edrxCycle) {
    this.edrxCycle = edrxCycle;
    return this;
  }

  /**
   * Get edrxCycle
   * @return edrxCycle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDRX_CYCLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEdrxCycle() {
    return edrxCycle;
  }


  @JsonProperty(value = JSON_PROPERTY_EDRX_CYCLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdrxCycle(@Nullable Long edrxCycle) {
    this.edrxCycle = edrxCycle;
  }


  public OtherConfiguration pagingTransmissionWindow(@Nullable Long pagingTransmissionWindow) {
    this.pagingTransmissionWindow = pagingTransmissionWindow;
    return this;
  }

  /**
   * Get pagingTransmissionWindow
   * @return pagingTransmissionWindow
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPagingTransmissionWindow() {
    return pagingTransmissionWindow;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGING_TRANSMISSION_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagingTransmissionWindow(@Nullable Long pagingTransmissionWindow) {
    this.pagingTransmissionWindow = pagingTransmissionWindow;
  }


  public OtherConfiguration useObject19ForOtaInfo(@Nullable Boolean useObject19ForOtaInfo) {
    this.useObject19ForOtaInfo = useObject19ForOtaInfo;
    return this;
  }

  /**
   * Get useObject19ForOtaInfo
   * @return useObject19ForOtaInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_OBJECT19_FOR_OTA_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseObject19ForOtaInfo() {
    return useObject19ForOtaInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_OBJECT19_FOR_OTA_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseObject19ForOtaInfo(@Nullable Boolean useObject19ForOtaInfo) {
    this.useObject19ForOtaInfo = useObject19ForOtaInfo;
  }


  public OtherConfiguration fwUpdateStrategy(@Nullable Integer fwUpdateStrategy) {
    this.fwUpdateStrategy = fwUpdateStrategy;
    return this;
  }

  /**
   * Get fwUpdateStrategy
   * @return fwUpdateStrategy
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FW_UPDATE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFwUpdateStrategy() {
    return fwUpdateStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_FW_UPDATE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFwUpdateStrategy(@Nullable Integer fwUpdateStrategy) {
    this.fwUpdateStrategy = fwUpdateStrategy;
  }


  public OtherConfiguration swUpdateStrategy(@Nullable Integer swUpdateStrategy) {
    this.swUpdateStrategy = swUpdateStrategy;
    return this;
  }

  /**
   * Get swUpdateStrategy
   * @return swUpdateStrategy
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SW_UPDATE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSwUpdateStrategy() {
    return swUpdateStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_SW_UPDATE_STRATEGY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwUpdateStrategy(@Nullable Integer swUpdateStrategy) {
    this.swUpdateStrategy = swUpdateStrategy;
  }


  public OtherConfiguration clientOnlyObserveAfterConnect(@Nullable Integer clientOnlyObserveAfterConnect) {
    this.clientOnlyObserveAfterConnect = clientOnlyObserveAfterConnect;
    return this;
  }

  /**
   * Get clientOnlyObserveAfterConnect
   * @return clientOnlyObserveAfterConnect
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CLIENT_ONLY_OBSERVE_AFTER_CONNECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getClientOnlyObserveAfterConnect() {
    return clientOnlyObserveAfterConnect;
  }


  @JsonProperty(value = JSON_PROPERTY_CLIENT_ONLY_OBSERVE_AFTER_CONNECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientOnlyObserveAfterConnect(@Nullable Integer clientOnlyObserveAfterConnect) {
    this.clientOnlyObserveAfterConnect = clientOnlyObserveAfterConnect;
  }


  public OtherConfiguration fwUpdateResource(@Nullable String fwUpdateResource) {
    this.fwUpdateResource = fwUpdateResource;
    return this;
  }

  /**
   * Get fwUpdateResource
   * @return fwUpdateResource
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FW_UPDATE_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFwUpdateResource() {
    return fwUpdateResource;
  }


  @JsonProperty(value = JSON_PROPERTY_FW_UPDATE_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFwUpdateResource(@Nullable String fwUpdateResource) {
    this.fwUpdateResource = fwUpdateResource;
  }


  public OtherConfiguration swUpdateResource(@Nullable String swUpdateResource) {
    this.swUpdateResource = swUpdateResource;
    return this;
  }

  /**
   * Get swUpdateResource
   * @return swUpdateResource
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SW_UPDATE_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSwUpdateResource() {
    return swUpdateResource;
  }


  @JsonProperty(value = JSON_PROPERTY_SW_UPDATE_RESOURCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwUpdateResource(@Nullable String swUpdateResource) {
    this.swUpdateResource = swUpdateResource;
  }


  public OtherConfiguration defaultObjectIDVer(@Nullable String defaultObjectIDVer) {
    this.defaultObjectIDVer = defaultObjectIDVer;
    return this;
  }

  /**
   * Get defaultObjectIDVer
   * @return defaultObjectIDVer
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_OBJECT_I_D_VER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultObjectIDVer() {
    return defaultObjectIDVer;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_OBJECT_I_D_VER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultObjectIDVer(@Nullable String defaultObjectIDVer) {
    this.defaultObjectIDVer = defaultObjectIDVer;
  }


  /**
   * Return true if this OtherConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherConfiguration otherConfiguration = (OtherConfiguration) o;
    return Objects.equals(this.powerMode, otherConfiguration.powerMode) &&
        Objects.equals(this.psmActivityTimer, otherConfiguration.psmActivityTimer) &&
        Objects.equals(this.edrxCycle, otherConfiguration.edrxCycle) &&
        Objects.equals(this.pagingTransmissionWindow, otherConfiguration.pagingTransmissionWindow) &&
        Objects.equals(this.useObject19ForOtaInfo, otherConfiguration.useObject19ForOtaInfo) &&
        Objects.equals(this.fwUpdateStrategy, otherConfiguration.fwUpdateStrategy) &&
        Objects.equals(this.swUpdateStrategy, otherConfiguration.swUpdateStrategy) &&
        Objects.equals(this.clientOnlyObserveAfterConnect, otherConfiguration.clientOnlyObserveAfterConnect) &&
        Objects.equals(this.fwUpdateResource, otherConfiguration.fwUpdateResource) &&
        Objects.equals(this.swUpdateResource, otherConfiguration.swUpdateResource) &&
        Objects.equals(this.defaultObjectIDVer, otherConfiguration.defaultObjectIDVer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerMode, psmActivityTimer, edrxCycle, pagingTransmissionWindow, useObject19ForOtaInfo, fwUpdateStrategy, swUpdateStrategy, clientOnlyObserveAfterConnect, fwUpdateResource, swUpdateResource, defaultObjectIDVer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherConfiguration {\n");
    sb.append("    powerMode: ").append(toIndentedString(powerMode)).append("\n");
    sb.append("    psmActivityTimer: ").append(toIndentedString(psmActivityTimer)).append("\n");
    sb.append("    edrxCycle: ").append(toIndentedString(edrxCycle)).append("\n");
    sb.append("    pagingTransmissionWindow: ").append(toIndentedString(pagingTransmissionWindow)).append("\n");
    sb.append("    useObject19ForOtaInfo: ").append(toIndentedString(useObject19ForOtaInfo)).append("\n");
    sb.append("    fwUpdateStrategy: ").append(toIndentedString(fwUpdateStrategy)).append("\n");
    sb.append("    swUpdateStrategy: ").append(toIndentedString(swUpdateStrategy)).append("\n");
    sb.append("    clientOnlyObserveAfterConnect: ").append(toIndentedString(clientOnlyObserveAfterConnect)).append("\n");
    sb.append("    fwUpdateResource: ").append(toIndentedString(fwUpdateResource)).append("\n");
    sb.append("    swUpdateResource: ").append(toIndentedString(swUpdateResource)).append("\n");
    sb.append("    defaultObjectIDVer: ").append(toIndentedString(defaultObjectIDVer)).append("\n");
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

    // add `useObject19ForOtaInfo` to the URL query string
    if (getUseObject19ForOtaInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseObject19ForOtaInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseObject19ForOtaInfo()))));
    }

    // add `fwUpdateStrategy` to the URL query string
    if (getFwUpdateStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfwUpdateStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFwUpdateStrategy()))));
    }

    // add `swUpdateStrategy` to the URL query string
    if (getSwUpdateStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sswUpdateStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSwUpdateStrategy()))));
    }

    // add `clientOnlyObserveAfterConnect` to the URL query string
    if (getClientOnlyObserveAfterConnect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclientOnlyObserveAfterConnect%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClientOnlyObserveAfterConnect()))));
    }

    // add `fwUpdateResource` to the URL query string
    if (getFwUpdateResource() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfwUpdateResource%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFwUpdateResource()))));
    }

    // add `swUpdateResource` to the URL query string
    if (getSwUpdateResource() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sswUpdateResource%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSwUpdateResource()))));
    }

    // add `defaultObjectIDVer` to the URL query string
    if (getDefaultObjectIDVer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultObjectIDVer%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultObjectIDVer()))));
    }

    return joiner.toString();
  }
}

