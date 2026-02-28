# AuditLogControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs**](#getAuditLogs) | **GET** /api/audit/logs | Get all audit logs (getAuditLogs) |
| [**getAuditLogsByCustomerId**](#getAuditLogsByCustomerId) | **GET** /api/audit/logs/customer/{customerId} | Get audit logs by customer id (getAuditLogsByCustomerId) |
| [**getAuditLogsByEntityId**](#getAuditLogsByEntityId) | **GET** /api/audit/logs/entity/{entityType}/{entityId} | Get audit logs by entity id (getAuditLogsByEntityId) |
| [**getAuditLogsByUserId**](#getAuditLogsByUserId) | **GET** /api/audit/logs/user/{userId} | Get audit logs by user id (getAuditLogsByUserId) |



## getAuditLogs

> PageDataAuditLog getAuditLogs(pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime, actionTypes)

Get all audit logs (getAuditLogs)

Returns a page of audit logs related to all entities in the scope of the current user's Tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the audit logs.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | [optional] |
| **sortProperty** | **String** | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | [optional] [enum: createdTime, entityType, entityName, userName, actionType, actionStatus] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **actionTypes** | **String** | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | [optional] |

### Return type

**PageDataAuditLog**


## getAuditLogsByCustomerId

> PageDataAuditLog getAuditLogsByCustomerId(customerId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime, actionTypes)

Get audit logs by customer id (getAuditLogsByCustomerId)

Returns a page of audit logs related to the targeted customer entities (devices, assets, etc.), and users actions (login, logout, etc.) that belong to this customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the audit logs.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | [optional] |
| **sortProperty** | **String** | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | [optional] [enum: createdTime, entityType, entityName, userName, actionType, actionStatus] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **actionTypes** | **String** | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | [optional] |

### Return type

**PageDataAuditLog**


## getAuditLogsByEntityId

> PageDataAuditLog getAuditLogsByEntityId(entityType, entityId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime, actionTypes)

Get audit logs by entity id (getAuditLogsByEntityId)

Returns a page of audit logs related to the actions on the targeted entity. Basically, this API call is used to get the full lifecycle of some specific entity. For example to see when a device was created, updated, assigned to some customer, or even deleted from the system. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the audit logs.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | [optional] |
| **sortProperty** | **String** | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | [optional] [enum: createdTime, entityType, entityName, userName, actionType, actionStatus] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **actionTypes** | **String** | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | [optional] |

### Return type

**PageDataAuditLog**


## getAuditLogsByUserId

> PageDataAuditLog getAuditLogsByUserId(userId, pageSize, page, textSearch, sortProperty, sortOrder, startTime, endTime, actionTypes)

Get audit logs by user id (getAuditLogsByUserId)

Returns a page of audit logs related to the actions of targeted user. For example, RPC call to a particular device, or alarm acknowledgment for a specific device, etc. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the audit logs.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | [optional] |
| **sortProperty** | **String** | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | [optional] [enum: createdTime, entityType, entityName, userName, actionType, actionStatus] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long** | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **endTime** | **Long** | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | [optional] |
| **actionTypes** | **String** | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | [optional] |

### Return type

**PageDataAuditLog**

