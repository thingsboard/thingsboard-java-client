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
import org.thingsboard.client.model.ActionStatus;
import org.thingsboard.client.model.ActionType;
import org.thingsboard.client.model.AuditLogId;
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import org.thingsboard.client.model.UserId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AuditLog
 */
@JsonPropertyOrder({
  AuditLog.JSON_PROPERTY_ID,
  AuditLog.JSON_PROPERTY_CREATED_TIME,
  AuditLog.JSON_PROPERTY_TENANT_ID,
  AuditLog.JSON_PROPERTY_CUSTOMER_ID,
  AuditLog.JSON_PROPERTY_ENTITY_ID,
  AuditLog.JSON_PROPERTY_ENTITY_NAME,
  AuditLog.JSON_PROPERTY_USER_ID,
  AuditLog.JSON_PROPERTY_USER_NAME,
  AuditLog.JSON_PROPERTY_ACTION_TYPE,
  AuditLog.JSON_PROPERTY_ACTION_DATA,
  AuditLog.JSON_PROPERTY_ACTION_STATUS,
  AuditLog.JSON_PROPERTY_ACTION_FAILURE_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AuditLog {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private AuditLogId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
  @javax.annotation.Nullable
  private String entityName;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @javax.annotation.Nullable
  private UserId userId;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  @javax.annotation.Nullable
  private String userName;

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @javax.annotation.Nullable
  private ActionType actionType;

  public static final String JSON_PROPERTY_ACTION_DATA = "actionData";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode actionData;

  public static final String JSON_PROPERTY_ACTION_STATUS = "actionStatus";
  @javax.annotation.Nullable
  private ActionStatus actionStatus;

  public static final String JSON_PROPERTY_ACTION_FAILURE_DETAILS = "actionFailureDetails";
  @javax.annotation.Nullable
  private String actionFailureDetails;

  public AuditLog() { 
  }

  @JsonCreator
  public AuditLog(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_ENTITY_ID) EntityId entityId, 
    @JsonProperty(JSON_PROPERTY_ENTITY_NAME) String entityName, 
    @JsonProperty(JSON_PROPERTY_USER_ID) UserId userId, 
    @JsonProperty(JSON_PROPERTY_USER_NAME) String userName, 
    @JsonProperty(JSON_PROPERTY_ACTION_TYPE) ActionType actionType, 
    @JsonProperty(JSON_PROPERTY_ACTION_DATA) com.fasterxml.jackson.databind.JsonNode actionData, 
    @JsonProperty(JSON_PROPERTY_ACTION_STATUS) ActionStatus actionStatus, 
    @JsonProperty(JSON_PROPERTY_ACTION_FAILURE_DETAILS) String actionFailureDetails
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.entityId = entityId;
    this.entityName = entityName;
    this.userId = userId;
    this.userName = userName;
    this.actionType = actionType;
    this.actionData = actionData;
    this.actionStatus = actionStatus;
    this.actionFailureDetails = actionFailureDetails;
  }

  public AuditLog id(@javax.annotation.Nullable AuditLogId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the auditLog Id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuditLogId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable AuditLogId id) {
    this.id = id;
  }


  /**
   * Timestamp of the auditLog creation, in milliseconds
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
   * JSON object with Entity id
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }




  /**
   * Name of the logged entity
   * @return entityName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityName() {
    return entityName;
  }




  /**
   * JSON object with User id.
   * @return userId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserId getUserId() {
    return userId;
  }




  /**
   * Unique user name(email) of the user that performed some action on logged entity
   * @return userName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserName() {
    return userName;
  }




  /**
   * String represented Action type
   * @return actionType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ActionType getActionType() {
    return actionType;
  }




  /**
   * JsonNode represented action data
   * @return actionData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getActionData() {
    return actionData;
  }




  /**
   * String represented Action status
   * @return actionStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ActionStatus getActionStatus() {
    return actionStatus;
  }




  /**
   * Failure action details info. An empty string in case of action status type &#39;SUCCESS&#39;, otherwise includes stack trace of the caused exception.
   * @return actionFailureDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTION_FAILURE_DETAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActionFailureDetails() {
    return actionFailureDetails;
  }




  /**
   * Return true if this AuditLog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return Objects.equals(this.id, auditLog.id) &&
        Objects.equals(this.createdTime, auditLog.createdTime) &&
        Objects.equals(this.tenantId, auditLog.tenantId) &&
        Objects.equals(this.customerId, auditLog.customerId) &&
        Objects.equals(this.entityId, auditLog.entityId) &&
        Objects.equals(this.entityName, auditLog.entityName) &&
        Objects.equals(this.userId, auditLog.userId) &&
        Objects.equals(this.userName, auditLog.userName) &&
        Objects.equals(this.actionType, auditLog.actionType) &&
        Objects.equals(this.actionData, auditLog.actionData) &&
        Objects.equals(this.actionStatus, auditLog.actionStatus) &&
        Objects.equals(this.actionFailureDetails, auditLog.actionFailureDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, entityId, entityName, userId, userName, actionType, actionData, actionStatus, actionFailureDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    actionData: ").append(toIndentedString(actionData)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    actionFailureDetails: ").append(toIndentedString(actionFailureDetails)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `entityName` to the URL query string
    if (getEntityName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityName()))));
    }

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(getUserId().toUrlQueryString(prefix + "userId" + suffix));
    }

    // add `userName` to the URL query string
    if (getUserName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserName()))));
    }

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionType()))));
    }

    // add `actionData` to the URL query string
    if (getActionData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionData%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionData()))));
    }

    // add `actionStatus` to the URL query string
    if (getActionStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionStatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionStatus()))));
    }

    // add `actionFailureDetails` to the URL query string
    if (getActionFailureDetails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactionFailureDetails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActionFailureDetails()))));
    }

    return joiner.toString();
  }
}

