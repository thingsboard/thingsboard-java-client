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
import java.util.UUID;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.NotificationDeliveryMethod;
import org.thingsboard.client.model.NotificationInfo;
import org.thingsboard.client.model.NotificationRequestConfig;
import org.thingsboard.client.model.NotificationRequestId;
import org.thingsboard.client.model.NotificationRequestStats;
import org.thingsboard.client.model.NotificationRequestStatus;
import org.thingsboard.client.model.NotificationRuleId;
import org.thingsboard.client.model.NotificationTemplate;
import org.thingsboard.client.model.NotificationTemplateId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * NotificationRequestInfo
 */
@JsonPropertyOrder({
  NotificationRequestInfo.JSON_PROPERTY_ID,
  NotificationRequestInfo.JSON_PROPERTY_CREATED_TIME,
  NotificationRequestInfo.JSON_PROPERTY_TENANT_ID,
  NotificationRequestInfo.JSON_PROPERTY_TARGETS,
  NotificationRequestInfo.JSON_PROPERTY_TEMPLATE_ID,
  NotificationRequestInfo.JSON_PROPERTY_TEMPLATE,
  NotificationRequestInfo.JSON_PROPERTY_INFO,
  NotificationRequestInfo.JSON_PROPERTY_ADDITIONAL_CONFIG,
  NotificationRequestInfo.JSON_PROPERTY_ORIGINATOR_ENTITY_ID,
  NotificationRequestInfo.JSON_PROPERTY_RULE_ID,
  NotificationRequestInfo.JSON_PROPERTY_STATUS,
  NotificationRequestInfo.JSON_PROPERTY_STATS,
  NotificationRequestInfo.JSON_PROPERTY_TEMPLATE_NAME,
  NotificationRequestInfo.JSON_PROPERTY_DELIVERY_METHODS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class NotificationRequestInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private NotificationRequestId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  @javax.annotation.Nonnull
  private List<UUID> targets = new ArrayList<>();

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @javax.annotation.Nullable
  private NotificationTemplateId templateId;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  @javax.annotation.Nullable
  private NotificationTemplate template;

  public static final String JSON_PROPERTY_INFO = "info";
  @javax.annotation.Nullable
  private NotificationInfo info;

  public static final String JSON_PROPERTY_ADDITIONAL_CONFIG = "additionalConfig";
  @javax.annotation.Nullable
  private NotificationRequestConfig additionalConfig;

  public static final String JSON_PROPERTY_ORIGINATOR_ENTITY_ID = "originatorEntityId";
  @javax.annotation.Nullable
  private EntityId originatorEntityId;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  @javax.annotation.Nullable
  private NotificationRuleId ruleId;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private NotificationRequestStatus status;

  public static final String JSON_PROPERTY_STATS = "stats";
  @javax.annotation.Nullable
  private NotificationRequestStats stats;

  public static final String JSON_PROPERTY_TEMPLATE_NAME = "templateName";
  @javax.annotation.Nullable
  private String templateName;

  public static final String JSON_PROPERTY_DELIVERY_METHODS = "deliveryMethods";
  @javax.annotation.Nullable
  private List<NotificationDeliveryMethod> deliveryMethods = new ArrayList<>();

  public NotificationRequestInfo() { 
  }

  @JsonCreator
  public NotificationRequestInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public NotificationRequestInfo id(@javax.annotation.Nullable NotificationRequestId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRequestId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable NotificationRequestId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public NotificationRequestInfo tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public NotificationRequestInfo targets(@javax.annotation.Nonnull List<UUID> targets) {
    this.targets = targets;
    return this;
  }

  public NotificationRequestInfo addTargetsItem(UUID targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TARGETS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<UUID> getTargets() {
    return targets;
  }


  @JsonProperty(value = JSON_PROPERTY_TARGETS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargets(@javax.annotation.Nonnull List<UUID> targets) {
    this.targets = targets;
  }


  public NotificationRequestInfo templateId(@javax.annotation.Nullable NotificationTemplateId templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationTemplateId getTemplateId() {
    return templateId;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(@javax.annotation.Nullable NotificationTemplateId templateId) {
    this.templateId = templateId;
  }


  public NotificationRequestInfo template(@javax.annotation.Nullable NotificationTemplate template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationTemplate getTemplate() {
    return template;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(@javax.annotation.Nullable NotificationTemplate template) {
    this.template = template;
  }


  public NotificationRequestInfo info(@javax.annotation.Nullable NotificationInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationInfo getInfo() {
    return info;
  }


  @JsonProperty(value = JSON_PROPERTY_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(@javax.annotation.Nullable NotificationInfo info) {
    this.info = info;
  }


  public NotificationRequestInfo additionalConfig(@javax.annotation.Nullable NotificationRequestConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
    return this;
  }

  /**
   * Get additionalConfig
   * @return additionalConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRequestConfig getAdditionalConfig() {
    return additionalConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalConfig(@javax.annotation.Nullable NotificationRequestConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
  }


  public NotificationRequestInfo originatorEntityId(@javax.annotation.Nullable EntityId originatorEntityId) {
    this.originatorEntityId = originatorEntityId;
    return this;
  }

  /**
   * Get originatorEntityId
   * @return originatorEntityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOriginatorEntityId() {
    return originatorEntityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorEntityId(@javax.annotation.Nullable EntityId originatorEntityId) {
    this.originatorEntityId = originatorEntityId;
  }


  public NotificationRequestInfo ruleId(@javax.annotation.Nullable NotificationRuleId ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Get ruleId
   * @return ruleId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRuleId getRuleId() {
    return ruleId;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleId(@javax.annotation.Nullable NotificationRuleId ruleId) {
    this.ruleId = ruleId;
  }


  public NotificationRequestInfo status(@javax.annotation.Nullable NotificationRequestStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRequestStatus getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable NotificationRequestStatus status) {
    this.status = status;
  }


  public NotificationRequestInfo stats(@javax.annotation.Nullable NotificationRequestStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotificationRequestStats getStats() {
    return stats;
  }


  @JsonProperty(value = JSON_PROPERTY_STATS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStats(@javax.annotation.Nullable NotificationRequestStats stats) {
    this.stats = stats;
  }


  public NotificationRequestInfo templateName(@javax.annotation.Nullable String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Get templateName
   * @return templateName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateName(@javax.annotation.Nullable String templateName) {
    this.templateName = templateName;
  }


  public NotificationRequestInfo deliveryMethods(@javax.annotation.Nullable List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public NotificationRequestInfo addDeliveryMethodsItem(NotificationDeliveryMethod deliveryMethodsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotificationDeliveryMethod> getDeliveryMethods() {
    return deliveryMethods;
  }


  @JsonProperty(value = JSON_PROPERTY_DELIVERY_METHODS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryMethods(@javax.annotation.Nullable List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }


  /**
   * Return true if this NotificationRequestInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRequestInfo notificationRequestInfo = (NotificationRequestInfo) o;
    return Objects.equals(this.id, notificationRequestInfo.id) &&
        Objects.equals(this.createdTime, notificationRequestInfo.createdTime) &&
        Objects.equals(this.tenantId, notificationRequestInfo.tenantId) &&
        Objects.equals(this.targets, notificationRequestInfo.targets) &&
        Objects.equals(this.templateId, notificationRequestInfo.templateId) &&
        Objects.equals(this.template, notificationRequestInfo.template) &&
        Objects.equals(this.info, notificationRequestInfo.info) &&
        Objects.equals(this.additionalConfig, notificationRequestInfo.additionalConfig) &&
        Objects.equals(this.originatorEntityId, notificationRequestInfo.originatorEntityId) &&
        Objects.equals(this.ruleId, notificationRequestInfo.ruleId) &&
        Objects.equals(this.status, notificationRequestInfo.status) &&
        Objects.equals(this.stats, notificationRequestInfo.stats) &&
        Objects.equals(this.templateName, notificationRequestInfo.templateName) &&
        Objects.equals(this.deliveryMethods, notificationRequestInfo.deliveryMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, targets, templateId, template, info, additionalConfig, originatorEntityId, ruleId, status, stats, templateName, deliveryMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRequestInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    additionalConfig: ").append(toIndentedString(additionalConfig)).append("\n");
    sb.append("    originatorEntityId: ").append(toIndentedString(originatorEntityId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

    // add `targets` to the URL query string
    if (getTargets() != null) {
      for (int i = 0; i < getTargets().size(); i++) {
        if (getTargets().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%stargets%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getTargets().get(i)))));
        }
      }
    }

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      joiner.add(getTemplateId().toUrlQueryString(prefix + "templateId" + suffix));
    }

    // add `template` to the URL query string
    if (getTemplate() != null) {
      joiner.add(getTemplate().toUrlQueryString(prefix + "template" + suffix));
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(getInfo().toUrlQueryString(prefix + "info" + suffix));
    }

    // add `additionalConfig` to the URL query string
    if (getAdditionalConfig() != null) {
      joiner.add(getAdditionalConfig().toUrlQueryString(prefix + "additionalConfig" + suffix));
    }

    // add `originatorEntityId` to the URL query string
    if (getOriginatorEntityId() != null) {
      joiner.add(getOriginatorEntityId().toUrlQueryString(prefix + "originatorEntityId" + suffix));
    }

    // add `ruleId` to the URL query string
    if (getRuleId() != null) {
      joiner.add(getRuleId().toUrlQueryString(prefix + "ruleId" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `stats` to the URL query string
    if (getStats() != null) {
      joiner.add(getStats().toUrlQueryString(prefix + "stats" + suffix));
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

