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
import org.thingsboard.client.model.DeliveryMethodNotificationTemplate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationTemplateConfig
 */
@JsonPropertyOrder({
  NotificationTemplateConfig.JSON_PROPERTY_DELIVERY_METHODS_TEMPLATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class NotificationTemplateConfig {
  public static final String JSON_PROPERTY_DELIVERY_METHODS_TEMPLATES = "deliveryMethodsTemplates";
  @javax.annotation.Nonnull
  private Map<String, DeliveryMethodNotificationTemplate> deliveryMethodsTemplates = new HashMap<>();

  public NotificationTemplateConfig() { 
  }

  public NotificationTemplateConfig deliveryMethodsTemplates(@javax.annotation.Nonnull Map<String, DeliveryMethodNotificationTemplate> deliveryMethodsTemplates) {
    this.deliveryMethodsTemplates = deliveryMethodsTemplates;
    return this;
  }

  public NotificationTemplateConfig putDeliveryMethodsTemplatesItem(String key, DeliveryMethodNotificationTemplate deliveryMethodsTemplatesItem) {
    if (this.deliveryMethodsTemplates == null) {
      this.deliveryMethodsTemplates = new HashMap<>();
    }
    this.deliveryMethodsTemplates.put(key, deliveryMethodsTemplatesItem);
    return this;
  }

  /**
   * Get deliveryMethodsTemplates
   * @return deliveryMethodsTemplates
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS_TEMPLATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, DeliveryMethodNotificationTemplate> getDeliveryMethodsTemplates() {
    return deliveryMethodsTemplates;
  }


  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS_TEMPLATES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeliveryMethodsTemplates(@javax.annotation.Nonnull Map<String, DeliveryMethodNotificationTemplate> deliveryMethodsTemplates) {
    this.deliveryMethodsTemplates = deliveryMethodsTemplates;
  }


  /**
   * Return true if this NotificationTemplateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateConfig notificationTemplateConfig = (NotificationTemplateConfig) o;
    return Objects.equals(this.deliveryMethodsTemplates, notificationTemplateConfig.deliveryMethodsTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMethodsTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateConfig {\n");
    sb.append("    deliveryMethodsTemplates: ").append(toIndentedString(deliveryMethodsTemplates)).append("\n");
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

    // add `deliveryMethodsTemplates` to the URL query string
    if (getDeliveryMethodsTemplates() != null) {
      for (String _key : getDeliveryMethodsTemplates().keySet()) {
        if (getDeliveryMethodsTemplates().get(_key) != null) {
          joiner.add(getDeliveryMethodsTemplates().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdeliveryMethodsTemplates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

