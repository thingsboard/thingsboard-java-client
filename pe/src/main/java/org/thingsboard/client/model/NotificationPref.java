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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationPref
 */
@JsonPropertyOrder({
  NotificationPref.JSON_PROPERTY_ENABLED,
  NotificationPref.JSON_PROPERTY_ENABLED_DELIVERY_METHODS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class NotificationPref {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENABLED_DELIVERY_METHODS = "enabledDeliveryMethods";
  @javax.annotation.Nonnull
  private Map<String, Boolean> enabledDeliveryMethods = new HashMap<>();

  public NotificationPref() { 
  }

  public NotificationPref enabled(@javax.annotation.Nullable Boolean enabled) {
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


  public NotificationPref enabledDeliveryMethods(@javax.annotation.Nonnull Map<String, Boolean> enabledDeliveryMethods) {
    this.enabledDeliveryMethods = enabledDeliveryMethods;
    return this;
  }

  public NotificationPref putEnabledDeliveryMethodsItem(String key, Boolean enabledDeliveryMethodsItem) {
    if (this.enabledDeliveryMethods == null) {
      this.enabledDeliveryMethods = new HashMap<>();
    }
    this.enabledDeliveryMethods.put(key, enabledDeliveryMethodsItem);
    return this;
  }

  /**
   * Get enabledDeliveryMethods
   * @return enabledDeliveryMethods
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENABLED_DELIVERY_METHODS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Boolean> getEnabledDeliveryMethods() {
    return enabledDeliveryMethods;
  }


  @JsonProperty(value = JSON_PROPERTY_ENABLED_DELIVERY_METHODS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabledDeliveryMethods(@javax.annotation.Nonnull Map<String, Boolean> enabledDeliveryMethods) {
    this.enabledDeliveryMethods = enabledDeliveryMethods;
  }


  /**
   * Return true if this NotificationPref object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPref notificationPref = (NotificationPref) o;
    return Objects.equals(this.enabled, notificationPref.enabled) &&
        Objects.equals(this.enabledDeliveryMethods, notificationPref.enabledDeliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enabledDeliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPref {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledDeliveryMethods: ").append(toIndentedString(enabledDeliveryMethods)).append("\n");
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

    // add `enabledDeliveryMethods` to the URL query string
    if (getEnabledDeliveryMethods() != null) {
      for (String _key : getEnabledDeliveryMethods().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%senabledDeliveryMethods%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getEnabledDeliveryMethods().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getEnabledDeliveryMethods().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

