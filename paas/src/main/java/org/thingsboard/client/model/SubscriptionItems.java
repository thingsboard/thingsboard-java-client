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
 * SubscriptionItems
 */
@JsonPropertyOrder({
  SubscriptionItems.JSON_PROPERTY_EXTRA_DEVICE_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_EXTRA_CUSTOMER_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_EXTRA_INTEGRATION_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_EXTRA_CALCULATED_FIELD_COUNT,
  SubscriptionItems.JSON_PROPERTY_TRAFFIC_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_COMPUTE_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_STORAGE_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_ALARM_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_EMAIL_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_SMS_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_AI_CREDITS_PACK_COUNT,
  SubscriptionItems.JSON_PROPERTY_EDGE_ENABLED,
  SubscriptionItems.JSON_PROPERTY_EXTRA_EDGE_COUNT,
  SubscriptionItems.JSON_PROPERTY_TRENDZ_ENABLED,
  SubscriptionItems.JSON_PROPERTY_WHITE_LABELING_ADDON_ENABLED
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SubscriptionItems {
  public static final String JSON_PROPERTY_EXTRA_DEVICE_PACK_COUNT = "extraDevicePackCount";
  @Nullable
  private Long extraDevicePackCount;

  public static final String JSON_PROPERTY_EXTRA_CUSTOMER_PACK_COUNT = "extraCustomerPackCount";
  @Nullable
  private Long extraCustomerPackCount;

  public static final String JSON_PROPERTY_EXTRA_INTEGRATION_PACK_COUNT = "extraIntegrationPackCount";
  @Nullable
  private Long extraIntegrationPackCount;

  public static final String JSON_PROPERTY_EXTRA_CALCULATED_FIELD_COUNT = "extraCalculatedFieldCount";
  @Nullable
  private Long extraCalculatedFieldCount;

  public static final String JSON_PROPERTY_TRAFFIC_PACK_COUNT = "trafficPackCount";
  @Nullable
  private Long trafficPackCount;

  public static final String JSON_PROPERTY_COMPUTE_PACK_COUNT = "computePackCount";
  @Nullable
  private Long computePackCount;

  public static final String JSON_PROPERTY_STORAGE_PACK_COUNT = "storagePackCount";
  @Nullable
  private Long storagePackCount;

  public static final String JSON_PROPERTY_ALARM_PACK_COUNT = "alarmPackCount";
  @Nullable
  private Long alarmPackCount;

  public static final String JSON_PROPERTY_EMAIL_PACK_COUNT = "emailPackCount";
  @Nullable
  private Long emailPackCount;

  public static final String JSON_PROPERTY_SMS_PACK_COUNT = "smsPackCount";
  @Nullable
  private Long smsPackCount;

  public static final String JSON_PROPERTY_AI_CREDITS_PACK_COUNT = "aiCreditsPackCount";
  @Nullable
  private Long aiCreditsPackCount;

  public static final String JSON_PROPERTY_EDGE_ENABLED = "edgeEnabled";
  @Nullable
  private Boolean edgeEnabled;

  public static final String JSON_PROPERTY_EXTRA_EDGE_COUNT = "extraEdgeCount";
  @Nullable
  private Long extraEdgeCount;

  public static final String JSON_PROPERTY_TRENDZ_ENABLED = "trendzEnabled";
  @Nullable
  private Boolean trendzEnabled;

  public static final String JSON_PROPERTY_WHITE_LABELING_ADDON_ENABLED = "whiteLabelingAddonEnabled";
  @Nullable
  private Boolean whiteLabelingAddonEnabled;

  public SubscriptionItems() { 
  }

  public SubscriptionItems extraDevicePackCount(@Nullable Long extraDevicePackCount) {
    this.extraDevicePackCount = extraDevicePackCount;
    return this;
  }

  /**
   * Get extraDevicePackCount
   * @return extraDevicePackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTRA_DEVICE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtraDevicePackCount() {
    return extraDevicePackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_DEVICE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraDevicePackCount(@Nullable Long extraDevicePackCount) {
    this.extraDevicePackCount = extraDevicePackCount;
  }


  public SubscriptionItems extraCustomerPackCount(@Nullable Long extraCustomerPackCount) {
    this.extraCustomerPackCount = extraCustomerPackCount;
    return this;
  }

  /**
   * Get extraCustomerPackCount
   * @return extraCustomerPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTRA_CUSTOMER_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtraCustomerPackCount() {
    return extraCustomerPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_CUSTOMER_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraCustomerPackCount(@Nullable Long extraCustomerPackCount) {
    this.extraCustomerPackCount = extraCustomerPackCount;
  }


  public SubscriptionItems extraIntegrationPackCount(@Nullable Long extraIntegrationPackCount) {
    this.extraIntegrationPackCount = extraIntegrationPackCount;
    return this;
  }

  /**
   * Get extraIntegrationPackCount
   * @return extraIntegrationPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTRA_INTEGRATION_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtraIntegrationPackCount() {
    return extraIntegrationPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_INTEGRATION_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraIntegrationPackCount(@Nullable Long extraIntegrationPackCount) {
    this.extraIntegrationPackCount = extraIntegrationPackCount;
  }


  public SubscriptionItems extraCalculatedFieldCount(@Nullable Long extraCalculatedFieldCount) {
    this.extraCalculatedFieldCount = extraCalculatedFieldCount;
    return this;
  }

  /**
   * Get extraCalculatedFieldCount
   * @return extraCalculatedFieldCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTRA_CALCULATED_FIELD_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtraCalculatedFieldCount() {
    return extraCalculatedFieldCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_CALCULATED_FIELD_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraCalculatedFieldCount(@Nullable Long extraCalculatedFieldCount) {
    this.extraCalculatedFieldCount = extraCalculatedFieldCount;
  }


  public SubscriptionItems trafficPackCount(@Nullable Long trafficPackCount) {
    this.trafficPackCount = trafficPackCount;
    return this;
  }

  /**
   * Get trafficPackCount
   * @return trafficPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRAFFIC_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTrafficPackCount() {
    return trafficPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_TRAFFIC_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficPackCount(@Nullable Long trafficPackCount) {
    this.trafficPackCount = trafficPackCount;
  }


  public SubscriptionItems computePackCount(@Nullable Long computePackCount) {
    this.computePackCount = computePackCount;
    return this;
  }

  /**
   * Get computePackCount
   * @return computePackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COMPUTE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getComputePackCount() {
    return computePackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_COMPUTE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputePackCount(@Nullable Long computePackCount) {
    this.computePackCount = computePackCount;
  }


  public SubscriptionItems storagePackCount(@Nullable Long storagePackCount) {
    this.storagePackCount = storagePackCount;
    return this;
  }

  /**
   * Get storagePackCount
   * @return storagePackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STORAGE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStoragePackCount() {
    return storagePackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_STORAGE_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoragePackCount(@Nullable Long storagePackCount) {
    this.storagePackCount = storagePackCount;
  }


  public SubscriptionItems alarmPackCount(@Nullable Long alarmPackCount) {
    this.alarmPackCount = alarmPackCount;
    return this;
  }

  /**
   * Get alarmPackCount
   * @return alarmPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAlarmPackCount() {
    return alarmPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmPackCount(@Nullable Long alarmPackCount) {
    this.alarmPackCount = alarmPackCount;
  }


  public SubscriptionItems emailPackCount(@Nullable Long emailPackCount) {
    this.emailPackCount = emailPackCount;
    return this;
  }

  /**
   * Get emailPackCount
   * @return emailPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEmailPackCount() {
    return emailPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailPackCount(@Nullable Long emailPackCount) {
    this.emailPackCount = emailPackCount;
  }


  public SubscriptionItems smsPackCount(@Nullable Long smsPackCount) {
    this.smsPackCount = smsPackCount;
    return this;
  }

  /**
   * Get smsPackCount
   * @return smsPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SMS_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSmsPackCount() {
    return smsPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_SMS_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsPackCount(@Nullable Long smsPackCount) {
    this.smsPackCount = smsPackCount;
  }


  public SubscriptionItems aiCreditsPackCount(@Nullable Long aiCreditsPackCount) {
    this.aiCreditsPackCount = aiCreditsPackCount;
    return this;
  }

  /**
   * Get aiCreditsPackCount
   * @return aiCreditsPackCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AI_CREDITS_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCreditsPackCount() {
    return aiCreditsPackCount;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_CREDITS_PACK_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiCreditsPackCount(@Nullable Long aiCreditsPackCount) {
    this.aiCreditsPackCount = aiCreditsPackCount;
  }


  public SubscriptionItems edgeEnabled(@Nullable Boolean edgeEnabled) {
    this.edgeEnabled = edgeEnabled;
    return this;
  }

  /**
   * Get edgeEnabled
   * @return edgeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdgeEnabled() {
    return edgeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeEnabled(@Nullable Boolean edgeEnabled) {
    this.edgeEnabled = edgeEnabled;
  }


  public SubscriptionItems extraEdgeCount(@Nullable Long extraEdgeCount) {
    this.extraEdgeCount = extraEdgeCount;
    return this;
  }

  /**
   * Get extraEdgeCount
   * @return extraEdgeCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTRA_EDGE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExtraEdgeCount() {
    return extraEdgeCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTRA_EDGE_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraEdgeCount(@Nullable Long extraEdgeCount) {
    this.extraEdgeCount = extraEdgeCount;
  }


  public SubscriptionItems trendzEnabled(@Nullable Boolean trendzEnabled) {
    this.trendzEnabled = trendzEnabled;
    return this;
  }

  /**
   * Get trendzEnabled
   * @return trendzEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrendzEnabled() {
    return trendzEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrendzEnabled(@Nullable Boolean trendzEnabled) {
    this.trendzEnabled = trendzEnabled;
  }


  public SubscriptionItems whiteLabelingAddonEnabled(@Nullable Boolean whiteLabelingAddonEnabled) {
    this.whiteLabelingAddonEnabled = whiteLabelingAddonEnabled;
    return this;
  }

  /**
   * Get whiteLabelingAddonEnabled
   * @return whiteLabelingAddonEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ADDON_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingAddonEnabled() {
    return whiteLabelingAddonEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ADDON_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingAddonEnabled(@Nullable Boolean whiteLabelingAddonEnabled) {
    this.whiteLabelingAddonEnabled = whiteLabelingAddonEnabled;
  }


  /**
   * Return true if this SubscriptionItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionItems subscriptionItems = (SubscriptionItems) o;
    return Objects.equals(this.extraDevicePackCount, subscriptionItems.extraDevicePackCount) &&
        Objects.equals(this.extraCustomerPackCount, subscriptionItems.extraCustomerPackCount) &&
        Objects.equals(this.extraIntegrationPackCount, subscriptionItems.extraIntegrationPackCount) &&
        Objects.equals(this.extraCalculatedFieldCount, subscriptionItems.extraCalculatedFieldCount) &&
        Objects.equals(this.trafficPackCount, subscriptionItems.trafficPackCount) &&
        Objects.equals(this.computePackCount, subscriptionItems.computePackCount) &&
        Objects.equals(this.storagePackCount, subscriptionItems.storagePackCount) &&
        Objects.equals(this.alarmPackCount, subscriptionItems.alarmPackCount) &&
        Objects.equals(this.emailPackCount, subscriptionItems.emailPackCount) &&
        Objects.equals(this.smsPackCount, subscriptionItems.smsPackCount) &&
        Objects.equals(this.aiCreditsPackCount, subscriptionItems.aiCreditsPackCount) &&
        Objects.equals(this.edgeEnabled, subscriptionItems.edgeEnabled) &&
        Objects.equals(this.extraEdgeCount, subscriptionItems.extraEdgeCount) &&
        Objects.equals(this.trendzEnabled, subscriptionItems.trendzEnabled) &&
        Objects.equals(this.whiteLabelingAddonEnabled, subscriptionItems.whiteLabelingAddonEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraDevicePackCount, extraCustomerPackCount, extraIntegrationPackCount, extraCalculatedFieldCount, trafficPackCount, computePackCount, storagePackCount, alarmPackCount, emailPackCount, smsPackCount, aiCreditsPackCount, edgeEnabled, extraEdgeCount, trendzEnabled, whiteLabelingAddonEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionItems {\n");
    sb.append("    extraDevicePackCount: ").append(toIndentedString(extraDevicePackCount)).append("\n");
    sb.append("    extraCustomerPackCount: ").append(toIndentedString(extraCustomerPackCount)).append("\n");
    sb.append("    extraIntegrationPackCount: ").append(toIndentedString(extraIntegrationPackCount)).append("\n");
    sb.append("    extraCalculatedFieldCount: ").append(toIndentedString(extraCalculatedFieldCount)).append("\n");
    sb.append("    trafficPackCount: ").append(toIndentedString(trafficPackCount)).append("\n");
    sb.append("    computePackCount: ").append(toIndentedString(computePackCount)).append("\n");
    sb.append("    storagePackCount: ").append(toIndentedString(storagePackCount)).append("\n");
    sb.append("    alarmPackCount: ").append(toIndentedString(alarmPackCount)).append("\n");
    sb.append("    emailPackCount: ").append(toIndentedString(emailPackCount)).append("\n");
    sb.append("    smsPackCount: ").append(toIndentedString(smsPackCount)).append("\n");
    sb.append("    aiCreditsPackCount: ").append(toIndentedString(aiCreditsPackCount)).append("\n");
    sb.append("    edgeEnabled: ").append(toIndentedString(edgeEnabled)).append("\n");
    sb.append("    extraEdgeCount: ").append(toIndentedString(extraEdgeCount)).append("\n");
    sb.append("    trendzEnabled: ").append(toIndentedString(trendzEnabled)).append("\n");
    sb.append("    whiteLabelingAddonEnabled: ").append(toIndentedString(whiteLabelingAddonEnabled)).append("\n");
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

    // add `extraDevicePackCount` to the URL query string
    if (getExtraDevicePackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextraDevicePackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtraDevicePackCount()))));
    }

    // add `extraCustomerPackCount` to the URL query string
    if (getExtraCustomerPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextraCustomerPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtraCustomerPackCount()))));
    }

    // add `extraIntegrationPackCount` to the URL query string
    if (getExtraIntegrationPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextraIntegrationPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtraIntegrationPackCount()))));
    }

    // add `extraCalculatedFieldCount` to the URL query string
    if (getExtraCalculatedFieldCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextraCalculatedFieldCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtraCalculatedFieldCount()))));
    }

    // add `trafficPackCount` to the URL query string
    if (getTrafficPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strafficPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrafficPackCount()))));
    }

    // add `computePackCount` to the URL query string
    if (getComputePackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scomputePackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getComputePackCount()))));
    }

    // add `storagePackCount` to the URL query string
    if (getStoragePackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstoragePackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStoragePackCount()))));
    }

    // add `alarmPackCount` to the URL query string
    if (getAlarmPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarmPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarmPackCount()))));
    }

    // add `emailPackCount` to the URL query string
    if (getEmailPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semailPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmailPackCount()))));
    }

    // add `smsPackCount` to the URL query string
    if (getSmsPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssmsPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmsPackCount()))));
    }

    // add `aiCreditsPackCount` to the URL query string
    if (getAiCreditsPackCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saiCreditsPackCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAiCreditsPackCount()))));
    }

    // add `edgeEnabled` to the URL query string
    if (getEdgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeEnabled()))));
    }

    // add `extraEdgeCount` to the URL query string
    if (getExtraEdgeCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sextraEdgeCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExtraEdgeCount()))));
    }

    // add `trendzEnabled` to the URL query string
    if (getTrendzEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strendzEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrendzEnabled()))));
    }

    // add `whiteLabelingAddonEnabled` to the URL query string
    if (getWhiteLabelingAddonEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingAddonEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingAddonEnabled()))));
    }

    return joiner.toString();
  }
}

