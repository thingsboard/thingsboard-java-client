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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.SchedulerEventId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SchedulerEventWithCustomerInfo
 */
@JsonPropertyOrder({
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_ID,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_CREATED_TIME,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_TENANT_ID,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_CUSTOMER_ID,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_ORIGINATOR_ID,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_NAME,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_TYPE,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_SCHEDULE,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_ENABLED,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_VERSION,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_CUSTOMER_IS_PUBLIC,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_TIMESTAMPS,
  SchedulerEventWithCustomerInfo.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SchedulerEventWithCustomerInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private SchedulerEventId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ORIGINATOR_ID = "originatorId";
  @Nullable
  private EntityId originatorId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private String type;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode schedule;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @Nullable
  private Boolean enabled;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_CUSTOMER_IS_PUBLIC = "customerIsPublic";
  @Nullable
  private Boolean customerIsPublic;

  public static final String JSON_PROPERTY_TIMESTAMPS = "timestamps";
  @Nullable
  private List<Long> timestamps = new ArrayList<>();

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public SchedulerEventWithCustomerInfo() { 
  }

  @JsonCreator
  public SchedulerEventWithCustomerInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ORIGINATOR_ID) EntityId originatorId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IS_PUBLIC) Boolean customerIsPublic, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.originatorId = originatorId;
    this.customerIsPublic = customerIsPublic;
    this.ownerId = ownerId;
  }

  public SchedulerEventWithCustomerInfo id(@Nullable SchedulerEventId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the scheduler event Id. Specify this field to update the scheduler event. Referencing non-existing scheduler event Id will cause error. Omit this field to create new scheduler event
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SchedulerEventId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable SchedulerEventId id) {
    this.id = id;
  }


  /**
   * Timestamp of the scheduler event creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public SchedulerEventWithCustomerInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the scheduler event
   * @return additionalInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * JSON object with Tenant Id
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  /**
   * JSON object with Originator Id
   * @return originatorId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOriginatorId() {
    return originatorId;
  }




  public SchedulerEventWithCustomerInfo name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * scheduler event name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public SchedulerEventWithCustomerInfo type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * scheduler event type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable String type) {
    this.type = type;
  }


  public SchedulerEventWithCustomerInfo schedule(@Nullable com.fasterxml.jackson.databind.JsonNode schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * a JSON value with schedule time configuration
   * @return schedule
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getSchedule() {
    return schedule;
  }


  @JsonProperty(value = JSON_PROPERTY_SCHEDULE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(@Nullable com.fasterxml.jackson.databind.JsonNode schedule) {
    this.schedule = schedule;
  }


  public SchedulerEventWithCustomerInfo enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enable/disable scheduler
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


  public SchedulerEventWithCustomerInfo version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  public SchedulerEventWithCustomerInfo customerTitle(@Nullable String customerTitle) {
    this.customerTitle = customerTitle;
    return this;
  }

  /**
   * Title of the customer
   * @return customerTitle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerTitle(@Nullable String customerTitle) {
    this.customerTitle = customerTitle;
  }


  /**
   * Parameter that specifies if customer is public
   * @return customerIsPublic
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerIsPublic() {
    return customerIsPublic;
  }




  public SchedulerEventWithCustomerInfo timestamps(@Nullable List<Long> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public SchedulerEventWithCustomerInfo addTimestampsItem(Long timestampsItem) {
    if (this.timestamps == null) {
      this.timestamps = new ArrayList<>();
    }
    this.timestamps.add(timestampsItem);
    return this;
  }

  /**
   * Get timestamps
   * @return timestamps
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMESTAMPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getTimestamps() {
    return timestamps;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMESTAMPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamps(@Nullable List<Long> timestamps) {
    this.timestamps = timestamps;
  }


  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  /**
   * Return true if this SchedulerEventWithCustomerInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulerEventWithCustomerInfo schedulerEventWithCustomerInfo = (SchedulerEventWithCustomerInfo) o;
    return Objects.equals(this.id, schedulerEventWithCustomerInfo.id) &&
        Objects.equals(this.createdTime, schedulerEventWithCustomerInfo.createdTime) &&
        Objects.equals(this.additionalInfo, schedulerEventWithCustomerInfo.additionalInfo) &&
        Objects.equals(this.tenantId, schedulerEventWithCustomerInfo.tenantId) &&
        Objects.equals(this.customerId, schedulerEventWithCustomerInfo.customerId) &&
        Objects.equals(this.originatorId, schedulerEventWithCustomerInfo.originatorId) &&
        Objects.equals(this.name, schedulerEventWithCustomerInfo.name) &&
        Objects.equals(this.type, schedulerEventWithCustomerInfo.type) &&
        Objects.equals(this.schedule, schedulerEventWithCustomerInfo.schedule) &&
        Objects.equals(this.enabled, schedulerEventWithCustomerInfo.enabled) &&
        Objects.equals(this.version, schedulerEventWithCustomerInfo.version) &&
        Objects.equals(this.customerTitle, schedulerEventWithCustomerInfo.customerTitle) &&
        Objects.equals(this.customerIsPublic, schedulerEventWithCustomerInfo.customerIsPublic) &&
        Objects.equals(this.timestamps, schedulerEventWithCustomerInfo.timestamps) &&
        Objects.equals(this.ownerId, schedulerEventWithCustomerInfo.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, customerId, originatorId, name, type, schedule, enabled, version, customerTitle, customerIsPublic, timestamps, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulerEventWithCustomerInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    originatorId: ").append(toIndentedString(originatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    customerIsPublic: ").append(toIndentedString(customerIsPublic)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
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

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `customerIsPublic` to the URL query string
    if (getCustomerIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerIsPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerIsPublic()))));
    }

    // add `timestamps` to the URL query string
    if (getTimestamps() != null) {
      for (int i = 0; i < getTimestamps().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stimestamps%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getTimestamps().get(i)))));
      }
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

