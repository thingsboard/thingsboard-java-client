# AuditLogControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
PageDataAuditLog getAuditLogs(GetAuditLogsArgs args) // Get all audit logs (getAuditLogs)
PageDataAuditLog getAuditLogsByCustomerId(GetAuditLogsByCustomerIdArgs args) // Get audit logs by customer id (getAuditLogsByCustomerId)
PageDataAuditLog getAuditLogsByEntityId(GetAuditLogsByEntityIdArgs args) // Get audit logs by entity id (getAuditLogsByEntityId)
PageDataAuditLog getAuditLogsByUserId(GetAuditLogsByUserIdArgs args) // Get audit logs by user id (getAuditLogsByUserId)
```


## getAuditLogs

**GET** `/api/audit/logs`

Get all audit logs (getAuditLogs)

Returns a page of audit logs related to all entities in the scope of the current user's Tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataAuditLog getAuditLogs(GetAuditLogsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAuditLogsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAuditLogsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | |
| `sortProperty` | `String` | no | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | enum: `createdTime`, `entityType`, `entityName`, `userName`, `actionType`, `actionStatus` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `actionTypes` | `String` | no | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | |

### Return type

`PageDataAuditLog`


## getAuditLogsByCustomerId

**GET** `/api/audit/logs/customer/{customerId}`

Get audit logs by customer id (getAuditLogsByCustomerId)

Returns a page of audit logs related to the targeted customer entities (devices, assets, etc.), and users actions (login, logout, etc.) that belong to this customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAuditLog getAuditLogsByCustomerId(GetAuditLogsByCustomerIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAuditLogsByCustomerIdArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAuditLogsByCustomerIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | |
| `sortProperty` | `String` | no | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | enum: `createdTime`, `entityType`, `entityName`, `userName`, `actionType`, `actionStatus` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `actionTypes` | `String` | no | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | |

### Return type

`PageDataAuditLog`


## getAuditLogsByEntityId

**GET** `/api/audit/logs/entity/{entityType}/{entityId}`

Get audit logs by entity id (getAuditLogsByEntityId)

Returns a page of audit logs related to the actions on the targeted entity. Basically, this API call is used to get the full lifecycle of some specific entity. For example to see when a device was created, updated, assigned to some customer, or even deleted from the system. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataAuditLog getAuditLogsByEntityId(GetAuditLogsByEntityIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAuditLogsByEntityIdArgs.builder()
        .entityType(String)
        .entityId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAuditLogsByEntityIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | |
| `sortProperty` | `String` | no | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | enum: `createdTime`, `entityType`, `entityName`, `userName`, `actionType`, `actionStatus` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `actionTypes` | `String` | no | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | |

### Return type

`PageDataAuditLog`


## getAuditLogsByUserId

**GET** `/api/audit/logs/user/{userId}`

Get audit logs by user id (getAuditLogsByUserId)

Returns a page of audit logs related to the actions of targeted user. For example, RPC call to a particular device, or alarm acknowledgment for a specific device, etc. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataAuditLog getAuditLogsByUserId(GetAuditLogsByUserIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAuditLogsByUserIdArgs.builder()
        .userId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAuditLogsByUserIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `userId` | `String` | **yes** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus. | |
| `sortProperty` | `String` | no | Property of audit log to sort by. See the 'Model' tab of the Response Class for more details. Note: entityType sort property is not defined in the AuditLog class, however, it can be used to sort audit logs by types of entities that were logged. | enum: `createdTime`, `entityType`, `entityName`, `userName`, `actionType`, `actionStatus` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the AuditLog class field: 'createdTime'. | |
| `actionTypes` | `String` | no | A String value representing comma-separated list of action types. This parameter is optional, but it can be used to filter results to fetch only audit logs of specific action types. For example, 'LOGIN', 'LOGOUT'. See the 'Model' tab of the Response Class for more details. | |

### Return type

`PageDataAuditLog`

