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
import org.thingsboard.client.model.Alarm;
import org.thingsboard.client.model.AlarmAssignee;
import org.thingsboard.client.model.AlarmId;
import org.thingsboard.client.model.AlarmSeverity;
import org.thingsboard.client.model.AlarmStatus;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmInfo
 */
@JsonPropertyOrder({
  AlarmInfo.JSON_PROPERTY_CREATED_TIME,
  AlarmInfo.JSON_PROPERTY_TENANT_ID,
  AlarmInfo.JSON_PROPERTY_CUSTOMER_ID,
  AlarmInfo.JSON_PROPERTY_ORIGINATOR_NAME,
  AlarmInfo.JSON_PROPERTY_ORIGINATOR_LABEL,
  AlarmInfo.JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME,
  AlarmInfo.JSON_PROPERTY_ASSIGNEE,
  AlarmInfo.JSON_PROPERTY_NAME,
  AlarmInfo.JSON_PROPERTY_STATUS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmInfo extends Alarm {
  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ORIGINATOR_NAME = "originatorName";
  @Nullable
  private String originatorName;

  public static final String JSON_PROPERTY_ORIGINATOR_LABEL = "originatorLabel";
  @Nullable
  private String originatorLabel;

  public static final String JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME = "originatorDisplayName";
  @Nullable
  private String originatorDisplayName;

  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  @Nullable
  private AlarmAssignee assignee;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nonnull
  private AlarmStatus status;

  public AlarmInfo() { 
  }

  @JsonCreator
  public AlarmInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_STATUS) AlarmStatus status
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.name = name;
    this.status = status;
  }

  /**
   * Timestamp of the alarm creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
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




  public AlarmInfo originatorName(@Nullable String originatorName) {
    this.originatorName = originatorName;
    return this;
  }

  /**
   * Alarm originator name
   * @return originatorName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorName() {
    return originatorName;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorName(@Nullable String originatorName) {
    this.originatorName = originatorName;
  }


  public AlarmInfo originatorLabel(@Nullable String originatorLabel) {
    this.originatorLabel = originatorLabel;
    return this;
  }

  /**
   * Alarm originator label
   * @return originatorLabel
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorLabel() {
    return originatorLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorLabel(@Nullable String originatorLabel) {
    this.originatorLabel = originatorLabel;
  }


  public AlarmInfo originatorDisplayName(@Nullable String originatorDisplayName) {
    this.originatorDisplayName = originatorDisplayName;
    return this;
  }

  /**
   * Originator display name
   * @return originatorDisplayName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorDisplayName() {
    return originatorDisplayName;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorDisplayName(@Nullable String originatorDisplayName) {
    this.originatorDisplayName = originatorDisplayName;
  }


  public AlarmInfo assignee(@Nullable AlarmAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Alarm assignee
   * @return assignee
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmAssignee getAssignee() {
    return assignee;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignee(@Nullable AlarmAssignee assignee) {
    this.assignee = assignee;
  }


  /**
   * representing type of the Alarm
   * @return name
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }




  /**
   * status of the Alarm
   * @return status
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlarmStatus getStatus() {
    return status;
  }




  @Override
  public AlarmInfo id(@Nullable AlarmId id) {
    this.setId(id);
    return this;
  }

  @Override
  public AlarmInfo type(@Nonnull String type) {
    this.setType(type);
    return this;
  }

  @Override
  public AlarmInfo originator(@Nonnull EntityId originator) {
    this.setOriginator(originator);
    return this;
  }

  @Override
  public AlarmInfo severity(@Nonnull AlarmSeverity severity) {
    this.setSeverity(severity);
    return this;
  }

  @Override
  public AlarmInfo acknowledged(@Nonnull Boolean acknowledged) {
    this.setAcknowledged(acknowledged);
    return this;
  }

  @Override
  public AlarmInfo cleared(@Nonnull Boolean cleared) {
    this.setCleared(cleared);
    return this;
  }

  @Override
  public AlarmInfo assigneeId(@Nullable UserId assigneeId) {
    this.setAssigneeId(assigneeId);
    return this;
  }

  @Override
  public AlarmInfo startTs(@Nullable Long startTs) {
    this.setStartTs(startTs);
    return this;
  }

  @Override
  public AlarmInfo endTs(@Nullable Long endTs) {
    this.setEndTs(endTs);
    return this;
  }

  @Override
  public AlarmInfo ackTs(@Nullable Long ackTs) {
    this.setAckTs(ackTs);
    return this;
  }

  @Override
  public AlarmInfo clearTs(@Nullable Long clearTs) {
    this.setClearTs(clearTs);
    return this;
  }

  @Override
  public AlarmInfo assignTs(@Nullable Long assignTs) {
    this.setAssignTs(assignTs);
    return this;
  }

  @Override
  public AlarmInfo details(@Nullable com.fasterxml.jackson.databind.JsonNode details) {
    this.setDetails(details);
    return this;
  }

  @Override
  public AlarmInfo propagate(@Nullable Boolean propagate) {
    this.setPropagate(propagate);
    return this;
  }

  @Override
  public AlarmInfo propagateToOwner(@Nullable Boolean propagateToOwner) {
    this.setPropagateToOwner(propagateToOwner);
    return this;
  }

  @Override
  public AlarmInfo propagateToTenant(@Nullable Boolean propagateToTenant) {
    this.setPropagateToTenant(propagateToTenant);
    return this;
  }

  @Override
  public AlarmInfo propagateRelationTypes(@Nullable List<String> propagateRelationTypes) {
    this.setPropagateRelationTypes(propagateRelationTypes);
    return this;
  }

  @Override
  public AlarmInfo addPropagateRelationTypesItem(String propagateRelationTypesItem) {
    super.addPropagateRelationTypesItem(propagateRelationTypesItem);
    return this;
  }

  /**
   * Return true if this AlarmInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmInfo alarmInfo = (AlarmInfo) o;
    return Objects.equals(this.createdTime, alarmInfo.createdTime) &&
        Objects.equals(this.tenantId, alarmInfo.tenantId) &&
        Objects.equals(this.customerId, alarmInfo.customerId) &&
        Objects.equals(this.originatorName, alarmInfo.originatorName) &&
        Objects.equals(this.originatorLabel, alarmInfo.originatorLabel) &&
        Objects.equals(this.originatorDisplayName, alarmInfo.originatorDisplayName) &&
        Objects.equals(this.assignee, alarmInfo.assignee) &&
        Objects.equals(this.name, alarmInfo.name) &&
        Objects.equals(this.status, alarmInfo.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, tenantId, customerId, originatorName, originatorLabel, originatorDisplayName, assignee, name, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    originatorName: ").append(toIndentedString(originatorName)).append("\n");
    sb.append("    originatorLabel: ").append(toIndentedString(originatorLabel)).append("\n");
    sb.append("    originatorDisplayName: ").append(toIndentedString(originatorDisplayName)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `originator` to the URL query string
    if (getOriginator() != null) {
      joiner.add(getOriginator().toUrlQueryString(prefix + "originator" + suffix));
    }

    // add `severity` to the URL query string
    if (getSeverity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sseverity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSeverity()))));
    }

    // add `acknowledged` to the URL query string
    if (getAcknowledged() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sacknowledged%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAcknowledged()))));
    }

    // add `cleared` to the URL query string
    if (getCleared() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scleared%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCleared()))));
    }

    // add `assigneeId` to the URL query string
    if (getAssigneeId() != null) {
      joiner.add(getAssigneeId().toUrlQueryString(prefix + "assigneeId" + suffix));
    }

    // add `startTs` to the URL query string
    if (getStartTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstartTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStartTs()))));
    }

    // add `endTs` to the URL query string
    if (getEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTs()))));
    }

    // add `ackTs` to the URL query string
    if (getAckTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sackTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAckTs()))));
    }

    // add `clearTs` to the URL query string
    if (getClearTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclearTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClearTs()))));
    }

    // add `assignTs` to the URL query string
    if (getAssignTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassignTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssignTs()))));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdetails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDetails()))));
    }

    // add `propagate` to the URL query string
    if (getPropagate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagate()))));
    }

    // add `propagateToOwner` to the URL query string
    if (getPropagateToOwner() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToOwner%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToOwner()))));
    }

    // add `propagateToTenant` to the URL query string
    if (getPropagateToTenant() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToTenant%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToTenant()))));
    }

    // add `propagateRelationTypes` to the URL query string
    if (getPropagateRelationTypes() != null) {
      for (int i = 0; i < getPropagateRelationTypes().size(); i++) {
        joiner.add(String.format(java.util.Locale.ROOT, "%spropagateRelationTypes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(getPropagateRelationTypes().get(i)))));
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `originatorName` to the URL query string
    if (getOriginatorName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soriginatorName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriginatorName()))));
    }

    // add `originatorLabel` to the URL query string
    if (getOriginatorLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soriginatorLabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriginatorLabel()))));
    }

    // add `originatorDisplayName` to the URL query string
    if (getOriginatorDisplayName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soriginatorDisplayName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOriginatorDisplayName()))));
    }

    // add `assignee` to the URL query string
    if (getAssignee() != null) {
      joiner.add(getAssignee().toUrlQueryString(prefix + "assignee" + suffix));
    }

    return joiner.toString();
  }
}

