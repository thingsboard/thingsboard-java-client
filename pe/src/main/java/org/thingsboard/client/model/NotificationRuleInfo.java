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
import javax.annotation.Nonnull;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.NotificationDeliveryMethod;
import org.thingsboard.client.model.NotificationRuleConfig;
import org.thingsboard.client.model.NotificationRuleId;
import org.thingsboard.client.model.NotificationRuleRecipientsConfig;
import org.thingsboard.client.model.NotificationRuleTriggerConfig;
import org.thingsboard.client.model.NotificationRuleTriggerType;
import org.thingsboard.client.model.NotificationTemplateId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationRuleInfo
 */
@JsonPropertyOrder({
  NotificationRuleInfo.JSON_PROPERTY_ID,
  NotificationRuleInfo.JSON_PROPERTY_CREATED_TIME,
  NotificationRuleInfo.JSON_PROPERTY_TENANT_ID,
  NotificationRuleInfo.JSON_PROPERTY_NAME,
  NotificationRuleInfo.JSON_PROPERTY_ENABLED,
  NotificationRuleInfo.JSON_PROPERTY_TEMPLATE_ID,
  NotificationRuleInfo.JSON_PROPERTY_TRIGGER_TYPE,
  NotificationRuleInfo.JSON_PROPERTY_TRIGGER_CONFIG,
  NotificationRuleInfo.JSON_PROPERTY_RECIPIENTS_CONFIG,
  NotificationRuleInfo.JSON_PROPERTY_ADDITIONAL_CONFIG,
  NotificationRuleInfo.JSON_PROPERTY_TEMPLATE_NAME,
  NotificationRuleInfo.JSON_PROPERTY_DELIVERY_METHODS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class NotificationRuleInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private NotificationRuleId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @Nonnull
  private NotificationTemplateId templateId;

  public static final String JSON_PROPERTY_TRIGGER_TYPE = "triggerType";
  @Nonnull
  private NotificationRuleTriggerType triggerType;

  public static final String JSON_PROPERTY_TRIGGER_CONFIG = "triggerConfig";
  @Nonnull
  private NotificationRuleTriggerConfig triggerConfig;

  public static final String JSON_PROPERTY_RECIPIENTS_CONFIG = "recipientsConfig";
  @Nonnull
  private NotificationRuleRecipientsConfig recipientsConfig;

  public static final String JSON_PROPERTY_ADDITIONAL_CONFIG = "additionalConfig";
  @Nullable
  private NotificationRuleConfig additionalConfig;

  public static final String JSON_PROPERTY_TEMPLATE_NAME = "templateName";
  @Nullable
  private String templateName;

  public static final String JSON_PROPERTY_DELIVERY_METHODS = "deliveryMethods";
  @Nullable
  private List<NotificationDeliveryMethod> deliveryMethods = new ArrayList<>();

  public NotificationRuleInfo() { 
  }

  @JsonCreator
  public NotificationRuleInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public NotificationRuleInfo id(@Nullable NotificationRuleId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRuleId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable NotificationRuleId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public NotificationRuleInfo tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public NotificationRuleInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@Nonnull String name) {
    this.name = name;
  }


  public NotificationRuleInfo enabled(@Nullable Boolean enabled) {
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


  public NotificationRuleInfo templateId(@Nonnull NotificationTemplateId templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationTemplateId getTemplateId() {
    return templateId;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateId(@Nonnull NotificationTemplateId templateId) {
    this.templateId = templateId;
  }


  public NotificationRuleInfo triggerType(@Nonnull NotificationRuleTriggerType triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * Get triggerType
   * @return triggerType
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TRIGGER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRuleTriggerType getTriggerType() {
    return triggerType;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIGGER_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTriggerType(@Nonnull NotificationRuleTriggerType triggerType) {
    this.triggerType = triggerType;
  }


  public NotificationRuleInfo triggerConfig(@Nonnull NotificationRuleTriggerConfig triggerConfig) {
    this.triggerConfig = triggerConfig;
    return this;
  }

  /**
   * Get triggerConfig
   * @return triggerConfig
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TRIGGER_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRuleTriggerConfig getTriggerConfig() {
    return triggerConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIGGER_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTriggerConfig(@Nonnull NotificationRuleTriggerConfig triggerConfig) {
    this.triggerConfig = triggerConfig;
  }


  public NotificationRuleInfo recipientsConfig(@Nonnull NotificationRuleRecipientsConfig recipientsConfig) {
    this.recipientsConfig = recipientsConfig;
    return this;
  }

  /**
   * Get recipientsConfig
   * @return recipientsConfig
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRuleRecipientsConfig getRecipientsConfig() {
    return recipientsConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_RECIPIENTS_CONFIG, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipientsConfig(@Nonnull NotificationRuleRecipientsConfig recipientsConfig) {
    this.recipientsConfig = recipientsConfig;
  }


  public NotificationRuleInfo additionalConfig(@Nullable NotificationRuleConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
    return this;
  }

  /**
   * Get additionalConfig
   * @return additionalConfig
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRuleConfig getAdditionalConfig() {
    return additionalConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalConfig(@Nullable NotificationRuleConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
  }


  public NotificationRuleInfo templateName(@Nullable String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Get templateName
   * @return templateName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateName(@Nullable String templateName) {
    this.templateName = templateName;
  }


  public NotificationRuleInfo deliveryMethods(@Nullable List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public NotificationRuleInfo addDeliveryMethodsItem(NotificationDeliveryMethod deliveryMethodsItem) {
    if (this.deliveryMethods == null) {
      this.deliveryMethods = new ArrayList<>();
    }
    this.deliveryMethods.add(deliveryMethodsItem);
    return this;
  }

  /**
   * Get deliveryMethods
   * @return deliveryMethods
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotificationDeliveryMethod> getDeliveryMethods() {
    return deliveryMethods;
  }


  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryMethods(@Nullable List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }


  /**
   * Return true if this NotificationRuleInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleInfo notificationRuleInfo = (NotificationRuleInfo) o;
    return Objects.equals(this.id, notificationRuleInfo.id) &&
        Objects.equals(this.createdTime, notificationRuleInfo.createdTime) &&
        Objects.equals(this.tenantId, notificationRuleInfo.tenantId) &&
        Objects.equals(this.name, notificationRuleInfo.name) &&
        Objects.equals(this.enabled, notificationRuleInfo.enabled) &&
        Objects.equals(this.templateId, notificationRuleInfo.templateId) &&
        Objects.equals(this.triggerType, notificationRuleInfo.triggerType) &&
        Objects.equals(this.triggerConfig, notificationRuleInfo.triggerConfig) &&
        Objects.equals(this.recipientsConfig, notificationRuleInfo.recipientsConfig) &&
        Objects.equals(this.additionalConfig, notificationRuleInfo.additionalConfig) &&
        Objects.equals(this.templateName, notificationRuleInfo.templateName) &&
        Objects.equals(this.deliveryMethods, notificationRuleInfo.deliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, enabled, templateId, triggerType, triggerConfig, recipientsConfig, additionalConfig, templateName, deliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    triggerConfig: ").append(toIndentedString(triggerConfig)).append("\n");
    sb.append("    recipientsConfig: ").append(toIndentedString(recipientsConfig)).append("\n");
    sb.append("    additionalConfig: ").append(toIndentedString(additionalConfig)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    deliveryMethods: ").append(toIndentedString(deliveryMethods)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      joiner.add(getTemplateId().toUrlQueryString(prefix + "templateId" + suffix));
    }

    // add `triggerType` to the URL query string
    if (getTriggerType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%striggerType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTriggerType()))));
    }

    // add `triggerConfig` to the URL query string
    if (getTriggerConfig() != null) {
      joiner.add(getTriggerConfig().toUrlQueryString(prefix + "triggerConfig" + suffix));
    }

    // add `recipientsConfig` to the URL query string
    if (getRecipientsConfig() != null) {
      joiner.add(getRecipientsConfig().toUrlQueryString(prefix + "recipientsConfig" + suffix));
    }

    // add `additionalConfig` to the URL query string
    if (getAdditionalConfig() != null) {
      joiner.add(getAdditionalConfig().toUrlQueryString(prefix + "additionalConfig" + suffix));
    }

    // add `templateName` to the URL query string
    if (getTemplateName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stemplateName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTemplateName()))));
    }

    // add `deliveryMethods` to the URL query string
    if (getDeliveryMethods() != null) {
      for (int i = 0; i < getDeliveryMethods().size(); i++) {
        if (getDeliveryMethods().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sdeliveryMethods%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getDeliveryMethods().get(i)))));
        }
      }
    }

    return joiner.toString();
  }
}

