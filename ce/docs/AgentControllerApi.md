# AgentControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
void deleteAgent(@Nonnull String agentId) // Delete agent (deleteAgent)
PageDataAgentAppEventInfo getAgentAppEventInfosByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus) // Get Agent App Event Infos by Agent Id (getAgentAppEventInfosByAgentId)
PageDataAgentAppEvent getAgentAppEventsByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Agent App Events by Agent Id (getAgentAppEventsByAgentId)
Agent getAgentById(@Nonnull String agentId) // Get Agent (getAgentById)
AgentInfo getAgentInfoById(@Nonnull String agentId) // Get Agent Info (getAgentInfoById)
List<AgentInfo> getAgentInfosByIds(@Nonnull List<String> agentIds) // Get Agent Infos By Ids (getAgentInfosByIds)
AgentInstructions getAgentInstallInstructions(@Nonnull String agentId, @Nonnull String method) // Get Agent Install Instructions (getAgentInstallInstructions)
String getAgentUpgradeTarget(@Nonnull String agentId) // Get the agent upgrade target (getAgentUpgradeTarget)
PageDataAgentInfo getCustomerAgentInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Agent Infos (getCustomerAgentInfos)
PageDataAgent getCustomerAgents(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Agents (getCustomerAgents)
String getLatestAgentImageRef() // Get the newest published agent image (getLatestAgentImageRef)
PageDataAgentInfo getTenantAgentInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Agent Infos (getTenantAgentInfos)
PageDataAgent getTenantAgents(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Agents (getTenantAgents)
Boolean isAgentUpgradeAvailable(@Nonnull String agentId) // Is agent upgrade available (isAgentUpgradeAvailable)
Agent saveAgent(@Nonnull Agent agent, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds) // Create Or Update Agent (saveAgent)
AgentAppEvent upgradeAgent(@Nonnull String agentId, @Nonnull AgentUpgradeRequest agentUpgradeRequest) // Upgrade Agent (upgradeAgent)
```


## deleteAgent

```
void deleteAgent(@Nonnull String agentId)
```

**DELETE** `/api/agent/{agentId}`

Delete agent (deleteAgent)

Deletes the agent and all the relations (from and to the agent). Referencing non-existing agent Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAgentAppEventInfosByAgentId

```
PageDataAgentAppEventInfo getAgentAppEventInfosByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus)
```

**GET** `/api/agent/{agentId}/eventInfos`

Get Agent App Event Infos by Agent Id (getAgentAppEventInfosByAgentId)

Returns a page of agent application events for all applications belonging to the specified agent, enriched with the application name for each event. Supports optional filtering by action type and status, and text search over the application name. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional text value to match against the application name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, updatedTime, actionType, startStatus, processingStatus] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **actionType** | **AgentAppEventActionType** | Optional filter by event action type | [optional] [enum: INSTALL, UPDATE, DELETE, RESTART, ROLLBACK, UPGRADE, AGENT_UPGRADE] |
| **processingStatus** | **AgentProcessingStatus** | Optional filter by event status | [optional] [enum: PENDING, QUEUED, PROCESSING, FINISHED, ERROR, START_FAILED] |

### Return type

**PageDataAgentAppEventInfo**


## getAgentAppEventsByAgentId

```
PageDataAgentAppEvent getAgentAppEventsByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/{agentId}/events`

Get Agent App Events by Agent Id (getAgentAppEventsByAgentId)

Returns a page of agent application events for all applications belonging to the specified agent. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value reserved for future event filtering | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, updatedTime] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentAppEvent**


## getAgentById

```
Agent getAgentById(@Nonnull String agentId)
```

**GET** `/api/agent/{agentId}`

Get Agent (getAgentById)

Fetch the Agent object based on the provided Agent Id. The server checks that the agent is owned by the same tenant.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Agent**


## getAgentInfoById

```
AgentInfo getAgentInfoById(@Nonnull String agentId)
```

**GET** `/api/agent/info/{agentId}`

Get Agent Info (getAgentInfoById)

Fetch the Agent Info object based on the provided Agent Id. Agent Info extends the Agent object and adds customer title and 'is public' flag.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AgentInfo**


## getAgentInfosByIds

```
List<AgentInfo> getAgentInfosByIds(@Nonnull List<String> agentIds)
```

**GET** `/api/agentInfos`

Get Agent Infos By Ids (getAgentInfosByIds)

Requested agents must be owned by tenant or assigned to customer which user is performing the request.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentIds** | **List<String>** | A list of agent ids, separated by comma ',' | |

### Return type

**List<AgentInfo>**


## getAgentInstallInstructions

```
AgentInstructions getAgentInstallInstructions(@Nonnull String agentId, @Nonnull String method)
```

**GET** `/api/agent/instructions/install/{agentId}/{method}`

Get Agent Install Instructions (getAgentInstallInstructions)

Returns the docker install command for the specified agent with the server address and gRPC port resolved server-side.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **method** | **String** | Installation method ('docker') | [enum: docker] |

### Return type

**AgentInstructions**


## getAgentUpgradeTarget

```
String getAgentUpgradeTarget(@Nonnull String agentId)
```

**GET** `/api/agent/{agentId}/upgrade/target`

Get the agent upgrade target (getAgentUpgradeTarget)

Returns the image reference the agent should be upgraded to, or an empty string when it already runs the newest published image or cannot be placed in the version graph.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getCustomerAgentInfos

```
PageDataAgentInfo getCustomerAgentInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/agentInfos`

Get Customer Agent Infos (getCustomerAgentInfos)

Returns a page of agent info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing agent name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentInfo**


## getCustomerAgents

```
PageDataAgent getCustomerAgents(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/agents`

Get Customer Agents (getCustomerAgents)

Returns a page of agent objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing agent name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgent**


## getLatestAgentImageRef

```
String getLatestAgentImageRef()
```

**GET** `/api/agent/upgrade/latest`

Get the newest published agent image (getLatestAgentImageRef)

Returns the newest agent image reference known from the version graph, or the floating tag while no version has been published. Lets a list of agents decide locally which rows are upgradable without asking per row.  Available for users with 'TENANT_ADMIN' authority.

### Return type

**String**


## getTenantAgentInfos

```
PageDataAgentInfo getTenantAgentInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/agentInfos`

Get Tenant Agent Infos (getTenantAgentInfos)

Returns a page of agent info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing agent name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentInfo**


## getTenantAgents

```
PageDataAgent getTenantAgents(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/agents`

Get Tenant Agents (getTenantAgents)

Returns a page of agents owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing agent name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgent**


## isAgentUpgradeAvailable

```
Boolean isAgentUpgradeAvailable(@Nonnull String agentId)
```

**GET** `/api/agent/{agentId}/upgrade/available`

Is agent upgrade available (isAgentUpgradeAvailable)

Returns 'true' when the agent reports an image older than the newest published one, 'false' otherwise — including when the agent runs a floating tag such as 'latest', whose current content cannot be told from the tag.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Boolean**


## saveAgent

```
Agent saveAgent(@Nonnull Agent agent, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds)
```

**POST** `/api/agent`

Create Or Update Agent (saveAgent)

Creates or Updates the Agent. When creating agent, platform generates Agent Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Agent id will be present in the response. Specify existing Agent id to update the agent. Referencing non-existing Agent Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Agent entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agent** | **Agent** | A JSON value representing the agent. | |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List<String>** | A list of entity group ids, separated by comma ',' | [optional] |

### Return type

**Agent**


## upgradeAgent

```
AgentAppEvent upgradeAgent(@Nonnull String agentId, @Nonnull AgentUpgradeRequest agentUpgradeRequest)
```

**POST** `/api/agent/{agentId}/upgrade`

Upgrade Agent (upgradeAgent)

Creates an agent-scoped upgrade event that makes the agent replace its own container with the given image. At most one agent upgrade can be active per agent, and it blocks all application events for that agent until it completes.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **agentUpgradeRequest** | **AgentUpgradeRequest** |  | |

### Return type

**AgentAppEvent**

