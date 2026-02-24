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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.SchedulerEventId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ScheduledReportInfo
 */
@JsonPropertyOrder({
  ScheduledReportInfo.JSON_PROPERTY_ID,
  ScheduledReportInfo.JSON_PROPERTY_CREATED_TIME,
  ScheduledReportInfo.JSON_PROPERTY_TENANT_ID,
  ScheduledReportInfo.JSON_PROPERTY_CUSTOMER_ID,
  ScheduledReportInfo.JSON_PROPERTY_ORIGINATOR_ID,
  ScheduledReportInfo.JSON_PROPERTY_NAME,
  ScheduledReportInfo.JSON_PROPERTY_TYPE,
  ScheduledReportInfo.JSON_PROPERTY_SCHEDULE,
  ScheduledReportInfo.JSON_PROPERTY_ENABLED,
  ScheduledReportInfo.JSON_PROPERTY_VERSION,
  ScheduledReportInfo.JSON_PROPERTY_TEMPLATE_INFO,
  ScheduledReportInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  ScheduledReportInfo.JSON_PROPERTY_USER_NAME,
  ScheduledReportInfo.JSON_PROPERTY_OWNER_ID,
  ScheduledReportInfo.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ScheduledReportInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private SchedulerEventId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ORIGINATOR_ID = "originatorId";
  @javax.annotation.Nullable
  private EntityId originatorId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode schedule;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_TEMPLATE_INFO = "templateInfo";
  @javax.annotation.Nullable
  private EntityInfo templateInfo;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @javax.annotation.Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable
  private String userName;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public ScheduledReportInfo() { 
  }

  @JsonCreator
  public ScheduledReportInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ORIGINATOR_ID) EntityId originatorId, 
    @JsonProperty(JSON_PROPERTY_TEMPLATE_INFO) EntityInfo templateInfo, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_TITLE) String customerTitle, 
    @JsonProperty(JSON_PROPERTY_USER_NAME) String userName, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.originatorId = originatorId;
    this.templateInfo = templateInfo;
    this.customerTitle = customerTitle;
    this.userName = userName;
    this.ownerId = ownerId;
  }

  public ScheduledReportInfo id(@javax.annotation.Nullable SchedulerEventId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the scheduler event Id. Specify this field to update the scheduler event. Referencing non-existing scheduler event Id will cause error. Omit this field to create new scheduler event
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SchedulerEventId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable SchedulerEventId id) {
    this.id = id;
  }


  /**
   * Timestamp of the scheduler event creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  /**
   * JSON object with Originator Id
   * @return originatorId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOriginatorId() {
    return originatorId;
  }




  public ScheduledReportInfo name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * scheduler event name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public ScheduledReportInfo type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * scheduler event type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public ScheduledReportInfo schedule(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * a JSON value with schedule time configuration
   * @return schedule
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getSchedule() {
    return schedule;
  }


  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode schedule) {
    this.schedule = schedule;
  }


  public ScheduledReportInfo enabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enable/disable scheduler
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


  public ScheduledReportInfo version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  /**
   * Report template info
   * @return templateInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TEMPLATE_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityInfo getTemplateInfo() {
    return templateInfo;
  }




  /**
   * Customer title
   * @return customerTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }




  /**
   * Report user name
   * @return userName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserName() {
    return userName;
  }




  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  public ScheduledReportInfo additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the scheduler event
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this ScheduledReportInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledReportInfo scheduledReportInfo = (ScheduledReportInfo) o;
    return Objects.equals(this.id, scheduledReportInfo.id) &&
        Objects.equals(this.createdTime, scheduledReportInfo.createdTime) &&
        Objects.equals(this.tenantId, scheduledReportInfo.tenantId) &&
        Objects.equals(this.customerId, scheduledReportInfo.customerId) &&
        Objects.equals(this.originatorId, scheduledReportInfo.originatorId) &&
        Objects.equals(this.name, scheduledReportInfo.name) &&
        Objects.equals(this.type, scheduledReportInfo.type) &&
        Objects.equals(this.schedule, scheduledReportInfo.schedule) &&
        Objects.equals(this.enabled, scheduledReportInfo.enabled) &&
        Objects.equals(this.version, scheduledReportInfo.version) &&
        Objects.equals(this.templateInfo, scheduledReportInfo.templateInfo) &&
        Objects.equals(this.customerTitle, scheduledReportInfo.customerTitle) &&
        Objects.equals(this.userName, scheduledReportInfo.userName) &&
        Objects.equals(this.ownerId, scheduledReportInfo.ownerId) &&
        Objects.equals(this.additionalInfo, scheduledReportInfo.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, originatorId, name, type, schedule, enabled, version, templateInfo, customerTitle, userName, ownerId, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledReportInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    originatorId: ").append(toIndentedString(originatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    templateInfo: ").append(toIndentedString(templateInfo)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `originatorId` to the URL query string
    if (getOriginatorId() != null) {
      joiner.add(getOriginatorId().toUrlQueryString(prefix + "originatorId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `schedule` to the URL query string
    if (getSchedule() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sschedule%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSchedule()))));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnabled()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `templateInfo` to the URL query string
    if (getTemplateInfo() != null) {
      joiner.add(getTemplateInfo().toUrlQueryString(prefix + "templateInfo" + suffix));
    }

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `userName` to the URL query string
    if (getUserName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserName()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

