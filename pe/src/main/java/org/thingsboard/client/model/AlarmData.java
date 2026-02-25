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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.AlarmAssignee;
import org.thingsboard.client.model.AlarmId;
import org.thingsboard.client.model.AlarmSeverity;
import org.thingsboard.client.model.AlarmStatus;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.TsValue;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmData
 */
@JsonPropertyOrder({
  AlarmData.JSON_PROPERTY_ENTITY_ID,
  AlarmData.JSON_PROPERTY_LATEST,
  AlarmData.JSON_PROPERTY_ID,
  AlarmData.JSON_PROPERTY_CREATED_TIME,
  AlarmData.JSON_PROPERTY_TENANT_ID,
  AlarmData.JSON_PROPERTY_CUSTOMER_ID,
  AlarmData.JSON_PROPERTY_TYPE,
  AlarmData.JSON_PROPERTY_ORIGINATOR,
  AlarmData.JSON_PROPERTY_SEVERITY,
  AlarmData.JSON_PROPERTY_ACKNOWLEDGED,
  AlarmData.JSON_PROPERTY_CLEARED,
  AlarmData.JSON_PROPERTY_ASSIGNEE_ID,
  AlarmData.JSON_PROPERTY_START_TS,
  AlarmData.JSON_PROPERTY_END_TS,
  AlarmData.JSON_PROPERTY_ACK_TS,
  AlarmData.JSON_PROPERTY_CLEAR_TS,
  AlarmData.JSON_PROPERTY_ASSIGN_TS,
  AlarmData.JSON_PROPERTY_PROPAGATE,
  AlarmData.JSON_PROPERTY_PROPAGATE_TO_OWNER,
  AlarmData.JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY,
  AlarmData.JSON_PROPERTY_PROPAGATE_TO_TENANT,
  AlarmData.JSON_PROPERTY_PROPAGATE_RELATION_TYPES,
  AlarmData.JSON_PROPERTY_ORIGINATOR_NAME,
  AlarmData.JSON_PROPERTY_ORIGINATOR_LABEL,
  AlarmData.JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME,
  AlarmData.JSON_PROPERTY_ASSIGNEE,
  AlarmData.JSON_PROPERTY_NAME,
  AlarmData.JSON_PROPERTY_STATUS,
  AlarmData.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmData {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_LATEST = "latest";
  @javax.annotation.Nullable
  private Map<String, Map<String, TsValue>> latest = new HashMap<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private AlarmId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_ORIGINATOR = "originator";
  @javax.annotation.Nonnull
  private EntityId originator;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  @javax.annotation.Nonnull
  private AlarmSeverity severity;

  public static final String JSON_PROPERTY_ACKNOWLEDGED = "acknowledged";
  @javax.annotation.Nonnull
  private Boolean acknowledged;

  public static final String JSON_PROPERTY_CLEARED = "cleared";
  @javax.annotation.Nonnull
  private Boolean cleared;

  public static final String JSON_PROPERTY_ASSIGNEE_ID = "assigneeId";
  @javax.annotation.Nullable
  private UserId assigneeId;

  public static final String JSON_PROPERTY_START_TS = "startTs";
  @javax.annotation.Nullable
  private Long startTs;

  public static final String JSON_PROPERTY_END_TS = "endTs";
  @javax.annotation.Nullable
  private Long endTs;

  public static final String JSON_PROPERTY_ACK_TS = "ackTs";
  @javax.annotation.Nullable
  private Long ackTs;

  public static final String JSON_PROPERTY_CLEAR_TS = "clearTs";
  @javax.annotation.Nullable
  private Long clearTs;

  public static final String JSON_PROPERTY_ASSIGN_TS = "assignTs";
  @javax.annotation.Nullable
  private Long assignTs;

  public static final String JSON_PROPERTY_PROPAGATE = "propagate";
  @javax.annotation.Nullable
  private Boolean propagate;

  public static final String JSON_PROPERTY_PROPAGATE_TO_OWNER = "propagateToOwner";
  @javax.annotation.Nullable
  private Boolean propagateToOwner;

  public static final String JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY = "propagateToOwnerHierarchy";
  @javax.annotation.Nullable
  private Boolean propagateToOwnerHierarchy;

  public static final String JSON_PROPERTY_PROPAGATE_TO_TENANT = "propagateToTenant";
  @javax.annotation.Nullable
  private Boolean propagateToTenant;

  public static final String JSON_PROPERTY_PROPAGATE_RELATION_TYPES = "propagateRelationTypes";
  @javax.annotation.Nullable
  private List<String> propagateRelationTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_ORIGINATOR_NAME = "originatorName";
  @javax.annotation.Nullable
  private String originatorName;

  public static final String JSON_PROPERTY_ORIGINATOR_LABEL = "originatorLabel";
  @javax.annotation.Nullable
  private String originatorLabel;

  public static final String JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME = "originatorDisplayName";
  @javax.annotation.Nullable
  private String originatorDisplayName;

  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  @javax.annotation.Nullable
  private AlarmAssignee assignee;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private AlarmStatus status;

  public static final String JSON_PROPERTY_DETAILS = "details";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode details = null;

  public AlarmData() { 
  }

  @JsonCreator
  public AlarmData(
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

  public AlarmData entityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
  }


  public AlarmData latest(@javax.annotation.Nullable Map<String, Map<String, TsValue>> latest) {
    this.latest = latest;
    return this;
  }

  public AlarmData putLatestItem(String key, Map<String, TsValue> latestItem) {
    if (this.latest == null) {
      this.latest = new HashMap<>();
    }
    this.latest.put(key, latestItem);
    return this;
  }

  /**
   * Get latest
   * @return latest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Map<String, TsValue>> getLatest() {
    return latest;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatest(@javax.annotation.Nullable Map<String, Map<String, TsValue>> latest) {
    this.latest = latest;
  }


  public AlarmData id(@javax.annotation.Nullable AlarmId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the alarm Id. Specify this field to update the alarm. Referencing non-existing alarm Id will cause error. Omit this field to create new alarm.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable AlarmId id) {
    this.id = id;
  }


  /**
   * Timestamp of the alarm creation, in milliseconds
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




  public AlarmData type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * representing type of the Alarm
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public AlarmData originator(@javax.annotation.Nonnull EntityId originator) {
    this.originator = originator;
    return this;
  }

  /**
   * JSON object with alarm originator id
   * @return originator
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityId getOriginator() {
    return originator;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginator(@javax.annotation.Nonnull EntityId originator) {
    this.originator = originator;
  }


  public AlarmData severity(@javax.annotation.Nonnull AlarmSeverity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Alarm severity
   * @return severity
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SEVERITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlarmSeverity getSeverity() {
    return severity;
  }


  @JsonProperty(value = JSON_PROPERTY_SEVERITY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeverity(@javax.annotation.Nonnull AlarmSeverity severity) {
    this.severity = severity;
  }


  public AlarmData acknowledged(@javax.annotation.Nonnull Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Acknowledged
   * @return acknowledged
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACKNOWLEDGED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAcknowledged() {
    return acknowledged;
  }


  @JsonProperty(value = JSON_PROPERTY_ACKNOWLEDGED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcknowledged(@javax.annotation.Nonnull Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }


  public AlarmData cleared(@javax.annotation.Nonnull Boolean cleared) {
    this.cleared = cleared;
    return this;
  }

  /**
   * Cleared
   * @return cleared
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CLEARED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCleared() {
    return cleared;
  }


  @JsonProperty(value = JSON_PROPERTY_CLEARED, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCleared(@javax.annotation.Nonnull Boolean cleared) {
    this.cleared = cleared;
  }


  public AlarmData assigneeId(@javax.annotation.Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Alarm assignee user id
   * @return assigneeId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getAssigneeId() {
    return assigneeId;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssigneeId(@javax.annotation.Nullable UserId assigneeId) {
    this.assigneeId = assigneeId;
  }


  public AlarmData startTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Timestamp of the alarm start time, in milliseconds
   * @return startTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTs() {
    return startTs;
  }


  @JsonProperty(value = JSON_PROPERTY_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTs(@javax.annotation.Nullable Long startTs) {
    this.startTs = startTs;
  }


  public AlarmData endTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Timestamp of the alarm end time(last time update), in milliseconds
   * @return endTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTs() {
    return endTs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTs(@javax.annotation.Nullable Long endTs) {
    this.endTs = endTs;
  }


  public AlarmData ackTs(@javax.annotation.Nullable Long ackTs) {
    this.ackTs = ackTs;
    return this;
  }

  /**
   * Timestamp of the alarm acknowledgement, in milliseconds
   * @return ackTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACK_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAckTs() {
    return ackTs;
  }


  @JsonProperty(value = JSON_PROPERTY_ACK_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAckTs(@javax.annotation.Nullable Long ackTs) {
    this.ackTs = ackTs;
  }


  public AlarmData clearTs(@javax.annotation.Nullable Long clearTs) {
    this.clearTs = clearTs;
    return this;
  }

  /**
   * Timestamp of the alarm clearing, in milliseconds
   * @return clearTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLEAR_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getClearTs() {
    return clearTs;
  }


  @JsonProperty(value = JSON_PROPERTY_CLEAR_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearTs(@javax.annotation.Nullable Long clearTs) {
    this.clearTs = clearTs;
  }


  public AlarmData assignTs(@javax.annotation.Nullable Long assignTs) {
    this.assignTs = assignTs;
    return this;
  }

  /**
   * Timestamp of the alarm assignment, in milliseconds
   * @return assignTs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGN_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssignTs() {
    return assignTs;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGN_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignTs(@javax.annotation.Nullable Long assignTs) {
    this.assignTs = assignTs;
  }


  public AlarmData propagate(@javax.annotation.Nullable Boolean propagate) {
    this.propagate = propagate;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to parent entities of alarm originator
   * @return propagate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagate() {
    return propagate;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagate(@javax.annotation.Nullable Boolean propagate) {
    this.propagate = propagate;
  }


  public AlarmData propagateToOwner(@javax.annotation.Nullable Boolean propagateToOwner) {
    this.propagateToOwner = propagateToOwner;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) of alarm originator
   * @return propagateToOwner
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToOwner() {
    return propagateToOwner;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToOwner(@javax.annotation.Nullable Boolean propagateToOwner) {
    this.propagateToOwner = propagateToOwner;
  }


  public AlarmData propagateToOwnerHierarchy(@javax.annotation.Nullable Boolean propagateToOwnerHierarchy) {
    this.propagateToOwnerHierarchy = propagateToOwnerHierarchy;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the owner (tenant or customer) and all parent owners in the customer hierarchy
   * @return propagateToOwnerHierarchy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToOwnerHierarchy() {
    return propagateToOwnerHierarchy;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_OWNER_HIERARCHY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToOwnerHierarchy(@javax.annotation.Nullable Boolean propagateToOwnerHierarchy) {
    this.propagateToOwnerHierarchy = propagateToOwnerHierarchy;
  }


  public AlarmData propagateToTenant(@javax.annotation.Nullable Boolean propagateToTenant) {
    this.propagateToTenant = propagateToTenant;
    return this;
  }

  /**
   * Propagation flag to specify if alarm should be propagated to the tenant entity
   * @return propagateToTenant
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPropagateToTenant() {
    return propagateToTenant;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_TO_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateToTenant(@javax.annotation.Nullable Boolean propagateToTenant) {
    this.propagateToTenant = propagateToTenant;
  }


  public AlarmData propagateRelationTypes(@javax.annotation.Nullable List<String> propagateRelationTypes) {
    this.propagateRelationTypes = propagateRelationTypes;
    return this;
  }

  public AlarmData addPropagateRelationTypesItem(String propagateRelationTypesItem) {
    if (this.propagateRelationTypes == null) {
      this.propagateRelationTypes = new ArrayList<>();
    }
    this.propagateRelationTypes.add(propagateRelationTypesItem);
    return this;
  }

  /**
   * JSON array of relation types that should be used for propagation. By default, &#39;propagateRelationTypes&#39; array is empty which means that the alarm will be propagated based on any relation type to parent entities. This parameter should be used only in case when &#39;propagate&#39; parameter is set to true, otherwise, &#39;propagateRelationTypes&#39; array will be ignored.
   * @return propagateRelationTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_RELATION_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPropagateRelationTypes() {
    return propagateRelationTypes;
  }


  @JsonProperty(value = JSON_PROPERTY_PROPAGATE_RELATION_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagateRelationTypes(@javax.annotation.Nullable List<String> propagateRelationTypes) {
    this.propagateRelationTypes = propagateRelationTypes;
  }


  public AlarmData originatorName(@javax.annotation.Nullable String originatorName) {
    this.originatorName = originatorName;
    return this;
  }

  /**
   * Alarm originator name
   * @return originatorName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorName() {
    return originatorName;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorName(@javax.annotation.Nullable String originatorName) {
    this.originatorName = originatorName;
  }


  public AlarmData originatorLabel(@javax.annotation.Nullable String originatorLabel) {
    this.originatorLabel = originatorLabel;
    return this;
  }

  /**
   * Alarm originator label
   * @return originatorLabel
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorLabel() {
    return originatorLabel;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorLabel(@javax.annotation.Nullable String originatorLabel) {
    this.originatorLabel = originatorLabel;
  }


  public AlarmData originatorDisplayName(@javax.annotation.Nullable String originatorDisplayName) {
    this.originatorDisplayName = originatorDisplayName;
    return this;
  }

  /**
   * Originator display name
   * @return originatorDisplayName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorDisplayName() {
    return originatorDisplayName;
  }


  @JsonProperty(value = JSON_PROPERTY_ORIGINATOR_DISPLAY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorDisplayName(@javax.annotation.Nullable String originatorDisplayName) {
    this.originatorDisplayName = originatorDisplayName;
  }


  public AlarmData assignee(@javax.annotation.Nullable AlarmAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Alarm assignee
   * @return assignee
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmAssignee getAssignee() {
    return assignee;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSIGNEE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignee(@javax.annotation.Nullable AlarmAssignee assignee) {
    this.assignee = assignee;
  }


  /**
   * representing type of the Alarm
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }




  /**
   * status of the Alarm
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlarmStatus getStatus() {
    return status;
  }




  public AlarmData details(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getDetails() {
    return details;
  }


  @JsonProperty(value = JSON_PROPERTY_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode details) {
    this.details = details;
  }


  /**
   * Return true if this AlarmData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmData alarmData = (AlarmData) o;
    return Objects.equals(this.entityId, alarmData.entityId) &&
        Objects.equals(this.latest, alarmData.latest) &&
        Objects.equals(this.id, alarmData.id) &&
        Objects.equals(this.createdTime, alarmData.createdTime) &&
        Objects.equals(this.tenantId, alarmData.tenantId) &&
        Objects.equals(this.customerId, alarmData.customerId) &&
        Objects.equals(this.type, alarmData.type) &&
        Objects.equals(this.originator, alarmData.originator) &&
        Objects.equals(this.severity, alarmData.severity) &&
        Objects.equals(this.acknowledged, alarmData.acknowledged) &&
        Objects.equals(this.cleared, alarmData.cleared) &&
        Objects.equals(this.assigneeId, alarmData.assigneeId) &&
        Objects.equals(this.startTs, alarmData.startTs) &&
        Objects.equals(this.endTs, alarmData.endTs) &&
        Objects.equals(this.ackTs, alarmData.ackTs) &&
        Objects.equals(this.clearTs, alarmData.clearTs) &&
        Objects.equals(this.assignTs, alarmData.assignTs) &&
        Objects.equals(this.propagate, alarmData.propagate) &&
        Objects.equals(this.propagateToOwner, alarmData.propagateToOwner) &&
        Objects.equals(this.propagateToOwnerHierarchy, alarmData.propagateToOwnerHierarchy) &&
        Objects.equals(this.propagateToTenant, alarmData.propagateToTenant) &&
        Objects.equals(this.propagateRelationTypes, alarmData.propagateRelationTypes) &&
        Objects.equals(this.originatorName, alarmData.originatorName) &&
        Objects.equals(this.originatorLabel, alarmData.originatorLabel) &&
        Objects.equals(this.originatorDisplayName, alarmData.originatorDisplayName) &&
        Objects.equals(this.assignee, alarmData.assignee) &&
        Objects.equals(this.name, alarmData.name) &&
        Objects.equals(this.status, alarmData.status) &&
        Objects.equals(this.details, alarmData.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, latest, id, createdTime, tenantId, customerId, type, originator, severity, acknowledged, cleared, assigneeId, startTs, endTs, ackTs, clearTs, assignTs, propagate, propagateToOwner, propagateToOwnerHierarchy, propagateToTenant, propagateRelationTypes, originatorName, originatorLabel, originatorDisplayName, assignee, name, status, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmData {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    ackTs: ").append(toIndentedString(ackTs)).append("\n");
    sb.append("    clearTs: ").append(toIndentedString(clearTs)).append("\n");
    sb.append("    assignTs: ").append(toIndentedString(assignTs)).append("\n");
    sb.append("    propagate: ").append(toIndentedString(propagate)).append("\n");
    sb.append("    propagateToOwner: ").append(toIndentedString(propagateToOwner)).append("\n");
    sb.append("    propagateToOwnerHierarchy: ").append(toIndentedString(propagateToOwnerHierarchy)).append("\n");
    sb.append("    propagateToTenant: ").append(toIndentedString(propagateToTenant)).append("\n");
    sb.append("    propagateRelationTypes: ").append(toIndentedString(propagateRelationTypes)).append("\n");
    sb.append("    originatorName: ").append(toIndentedString(originatorName)).append("\n");
    sb.append("    originatorLabel: ").append(toIndentedString(originatorLabel)).append("\n");
    sb.append("    originatorDisplayName: ").append(toIndentedString(originatorDisplayName)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `latest` to the URL query string
    if (getLatest() != null) {
      for (String _key : getLatest().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%slatest%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getLatest().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getLatest().get(_key)))));
      }
    }

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

    // add `propagate` to the URL query string
    if (getPropagate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagate()))));
    }

    // add `propagateToOwner` to the URL query string
    if (getPropagateToOwner() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToOwner%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToOwner()))));
    }

    // add `propagateToOwnerHierarchy` to the URL query string
    if (getPropagateToOwnerHierarchy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spropagateToOwnerHierarchy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPropagateToOwnerHierarchy()))));
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdetails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDetails()))));
    }

    return joiner.toString();
  }
}

