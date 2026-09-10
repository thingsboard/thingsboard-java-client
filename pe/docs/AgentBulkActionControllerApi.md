# AgentBulkActionControllerApi

`ThingsboardClient` methods:

```
AgentBulkAction getAgentBulkAction(@Nonnull String bulkActionId) // Get Agent Bulk Action (getAgentBulkAction)
AgentBulkActionEventStats getAgentBulkActionEventStats(@Nonnull String bulkActionId) // Get Agent Bulk Action Event Stats (getAgentBulkActionEventStats)
PageDataAgentAppEventInfo getAgentBulkActionEvents(@Nonnull String bulkActionId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus, @Nullable String sortProperty, @Nullable String sortOrder) // Get Agent Bulk Action Events (getAgentBulkActionEvents)
```


## getAgentBulkAction

```
AgentBulkAction getAgentBulkAction(@Nonnull String bulkActionId)
```

**GET** `/api/agent/bulk/{bulkActionId}`

Get Agent Bulk Action (getAgentBulkAction)

Fetch the Agent Bulk Action object based on the provided Bulk Action Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkActionId** | **String** | Bulk Action Id | |

### Return type

**AgentBulkAction**


## getAgentBulkActionEventStats

```
AgentBulkActionEventStats getAgentBulkActionEventStats(@Nonnull String bulkActionId)
```

**GET** `/api/agent/bulk/{bulkActionId}/eventStats`

Get Agent Bulk Action Event Stats (getAgentBulkActionEventStats)

Returns the number of agent application events produced by the given bulk action per processing status, together with their total.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkActionId** | **String** | Bulk Action Id | |

### Return type

**AgentBulkActionEventStats**


## getAgentBulkActionEvents

```
PageDataAgentAppEventInfo getAgentBulkActionEvents(@Nonnull String bulkActionId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/bulk/{bulkActionId}/events`

Get Agent Bulk Action Events (getAgentBulkActionEvents)

Returns a page of agent application events produced by the given bulk action, optionally filtered by action type and status. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkActionId** | **String** | Bulk Action Id | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on the event fields | [optional] |
| **actionType** | **AgentAppEventActionType** | A string value representing the action type to filter by, e.g. 'UPDATE' | [optional] [enum: INSTALL, UPDATE, DELETE, RESTART, ROLLBACK, UPGRADE, AGENT_UPGRADE] |
| **processingStatus** | **AgentProcessingStatus** | A string value representing the event status to filter by, e.g. 'FINISHED' | [optional] [enum: PENDING, QUEUED, PROCESSING, FINISHED, ERROR, START_FAILED] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataAgentAppEventInfo**

