# AgentApplicationControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
AgentApplication assignRelatedEntityToAgentApp(@Nonnull String agentApplicationId, @Nonnull String entityType, @Nonnull String entityId) // Assign Related Entity to Agent Application (assignRelatedEntityToAgentApp)
AgentApplication attachToProfile(@Nonnull String agentApplicationId, @Nonnull String profileId) // Attach Application to Profile (attachToProfile)
void cancelAgentAppEvent(@Nonnull String agentApplicationId, @Nonnull String agentAppEventId) // Cancel Agent Application Event (cancelAgentAppEvent)
AgentAppEvent createAgentAppEvent(@Nonnull String agentApplicationId, @Nonnull AgentAppEventRequest agentAppEventRequest) // Execute Agent Application Event (createAgentAppEvent)
AgentApplication detachFromProfile(@Nonnull String agentApplicationId) // Detach Application from Profile (detachFromProfile)
AgentAppEvent getAgentAppEventById(@Nonnull String agentAppEventId) // Get Agent Application Event (getAgentAppEventById)
PageDataAgentAppEvent getAgentAppEvents(@Nonnull String agentApplicationId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus, @Nullable String sortProperty, @Nullable String sortOrder) // Get Agent Application Events (getAgentAppEvents)
PageDataAgentAppUnit getAgentAppUnits(@Nonnull String agentApplicationId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppUnitType type, @Nullable String sortProperty, @Nullable String sortOrder) // Get Agent Application Units (getAgentAppUnits)
AgentApplicationInfo getAgentApplicationById(@Nonnull String agentApplicationId) // Get Agent Application (getAgentApplicationById)
AgentApplication getAgentApplicationByRelatedEntity(@Nonnull String entityType, @Nonnull String entityId) // Get Agent Application by Related Entity (getAgentApplicationByRelatedEntity)
PageDataAgentApplicationInfo getAgentApplicationsByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Agent Applications by Agent Id (getAgentApplicationsByAgentId)
List<GetManagedRelatedEntityIds200ResponseInner> getManagedRelatedEntityIds(@Nonnull String entityType) // Get Managed Related Entity Ids (getManagedRelatedEntityIds)
PageDataEntityInfo getRelatedEntityCandidates(@Nonnull String entityType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String currentEntityId) // Get Related Entity Candidates (getRelatedEntityCandidates)
AgentAppInstallResponse installAgentApp(@Nonnull AgentAppEventRequest agentAppEventRequest) // Install Agent Application (installAgentApp)
AgentApplication mergeAgentApplicationForPreview(@Nonnull String templateVersion, @Nullable AgentApplicationType appType, @Nullable String composeType, @Nullable AgentAppEventActionType actionType, @Nullable Boolean setHostValues, @Nullable String relatedEntityType, @Nullable String relatedEntityId, @Nullable AgentApplication agentApplication) // Merge template into application for preview (mergeAgentApplicationForPreview)
AgentApplication unassignRelatedEntityFromAgentApp(@Nonnull String agentApplicationId) // Unassign Related Entity from Agent Application (unassignRelatedEntityFromAgentApp)
AgentApplication updateAgentApplication(@Nonnull AgentApplication agentApplication) // Update Agent Application (saveAgentApplication)
```


## assignRelatedEntityToAgentApp

```
AgentApplication assignRelatedEntityToAgentApp(@Nonnull String agentApplicationId, @Nonnull String entityType, @Nonnull String entityId)
```

**POST** `/api/agent/app/{agentApplicationId}/relatedEntity/{entityType}/{entityId}`

Assign Related Entity to Agent Application (assignRelatedEntityToAgentApp)

Links an Edge or Gateway Device to the specified agent application and re-merges entity credentials into the compose.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityType** | **String** | Related entity type (EDGE or DEVICE) | |
| **entityId** | **String** | Related entity id | |

### Return type

**AgentApplication**


## attachToProfile

```
AgentApplication attachToProfile(@Nonnull String agentApplicationId, @Nonnull String profileId)
```

**POST** `/api/agent/app/{agentApplicationId}/attach/{profileId}`

Attach Application to Profile (attachToProfile)

Re-attaches the application to a profile. The application adopts the profile's template version without running any upgrade or downgrade steps. After attachment the profile becomes the source of the config; the app's own credentials are carried over.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **profileId** | **String** |  | |

### Return type

**AgentApplication**


## cancelAgentAppEvent

```
void cancelAgentAppEvent(@Nonnull String agentApplicationId, @Nonnull String agentAppEventId)
```

**POST** `/api/agent/app/{agentApplicationId}/event/{agentAppEventId}/cancel`

Cancel Agent Application Event (cancelAgentAppEvent)

Force-cancels an in-flight or pending agent application event, marking it as ERROR. Cannot cancel events that are already in a terminal state (FINISHED or ERROR).  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **agentAppEventId** | **String** | A string value representing the agent app event id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## createAgentAppEvent

```
AgentAppEvent createAgentAppEvent(@Nonnull String agentApplicationId, @Nonnull AgentAppEventRequest agentAppEventRequest)
```

**POST** `/api/agent/app/{agentApplicationId}/event`

Execute Agent Application Event (createAgentAppEvent)

Creates an event for the specified agent application. The action type determines the operation (UPDATE, DELETE, RESTART, UPGRADE, ROLLBACK). Step inputs can be provided for actions that require them. Returns the created event so the caller can open a progress view.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **agentAppEventRequest** | **AgentAppEventRequest** | A JSON value representing the event request. | |

### Return type

**AgentAppEvent**


## detachFromProfile

```
AgentApplication detachFromProfile(@Nonnull String agentApplicationId)
```

**POST** `/api/agent/app/{agentApplicationId}/detach`

Detach Application from Profile (detachFromProfile)

Detaches the application from its profile. The application keeps the effective config it already carries (profile config with its own credentials merged in) and becomes standalone and editable.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AgentApplication**


## getAgentAppEventById

```
AgentAppEvent getAgentAppEventById(@Nonnull String agentAppEventId)
```

**GET** `/api/agent/app/event/{agentAppEventId}`

Get Agent Application Event (getAgentAppEventById)

Fetches a single agent application event by id. Works for orphan events whose application has been deleted (application_id is nullable).  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentAppEventId** | **String** | A string value representing the agent app event id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AgentAppEvent**


## getAgentAppEvents

```
PageDataAgentAppEvent getAgentAppEvents(@Nonnull String agentApplicationId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppEventActionType actionType, @Nullable AgentProcessingStatus processingStatus, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/app/{agentApplicationId}/events`

Get Agent Application Events (getAgentAppEvents)

Returns a page of events for the specified agent application. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional case-insensitive substring matched against the event action type and processing status | [optional] |
| **actionType** | **AgentAppEventActionType** | Optional action type filter | [optional] [enum: INSTALL, UPDATE, DELETE, RESTART, ROLLBACK, UPGRADE, AGENT_UPGRADE] |
| **processingStatus** | **AgentProcessingStatus** | Optional processing status filter | [optional] [enum: PENDING, QUEUED, PROCESSING, FINISHED, ERROR, START_FAILED] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, updatedTime] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentAppEvent**


## getAgentAppUnits

```
PageDataAgentAppUnit getAgentAppUnits(@Nonnull String agentApplicationId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable AgentAppUnitType type, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/app/{agentApplicationId}/units`

Get Agent Application Units (getAgentAppUnits)

Returns a page of units (containers, volumes, networks) for the specified agent application. Live per-unit data such as `image` and `state` lives in server-scope attributes on each unit and should be fetched separately via the standard telemetry/attributes API.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive substring match against the unit identifier | [optional] |
| **type** | **AgentAppUnitType** | Optional unit type filter (CONTAINER, VOLUME, NETWORK) | [optional] [enum: CONTAINER, VOLUME, NETWORK] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, identifier, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentAppUnit**


## getAgentApplicationById

```
AgentApplicationInfo getAgentApplicationById(@Nonnull String agentApplicationId)
```

**GET** `/api/agent/app/{agentApplicationId}`

Get Agent Application (getAgentApplicationById)

Fetch the Agent Application object based on the provided Agent Application Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AgentApplicationInfo**


## getAgentApplicationByRelatedEntity

```
AgentApplication getAgentApplicationByRelatedEntity(@Nonnull String entityType, @Nonnull String entityId)
```

**GET** `/api/agent/apps/{entityType}/{entityId}`

Get Agent Application by Related Entity (getAgentApplicationByRelatedEntity)

Returns the agent application linked to the specified entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Entity type | |
| **entityId** | **String** | Entity id | |

### Return type

**AgentApplication**


## getAgentApplicationsByAgentId

```
PageDataAgentApplicationInfo getAgentApplicationsByAgentId(@Nonnull String agentId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/{agentId}/apps`

Get Agent Applications by Agent Id (getAgentApplicationsByAgentId)

Returns a page of agent applications that belong to the specified agent. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | A string value representing the agent id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing application name | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentApplicationInfo**


## getManagedRelatedEntityIds

```
List<GetManagedRelatedEntityIds200ResponseInner> getManagedRelatedEntityIds(@Nonnull String entityType)
```

**GET** `/api/agent/app/managedRelatedEntities/{entityType}`

Get Managed Related Entity Ids (getManagedRelatedEntityIds)

Returns the ids of entities of the given type that are already linked to an agent application.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Related entity type (EDGE or DEVICE) | |

### Return type

**List<GetManagedRelatedEntityIds200ResponseInner>**


## getRelatedEntityCandidates

```
PageDataEntityInfo getRelatedEntityCandidates(@Nonnull String entityType, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String currentEntityId)
```

**GET** `/api/agent/app/relatedEntityCandidates`

Get Related Entity Candidates (getRelatedEntityCandidates)

Returns a page of Edges or Gateway Devices (devices with 'gateway' set in additional info) that can be linked to an agent application. Entities already linked to another application are excluded unless passed as 'currentEntityId'. Results are sorted by name. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Related entity type (EDGE or DEVICE) | [enum: EDGE, DEVICE] |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional String value representing entity name | [optional] |
| **currentEntityId** | **String** | Optional id of the entity currently linked to the edited application; it is kept in the result even though it is managed | [optional] |

### Return type

**PageDataEntityInfo**


## installAgentApp

```
AgentAppInstallResponse installAgentApp(@Nonnull AgentAppEventRequest agentAppEventRequest)
```

**POST** `/api/agent/app/event`

Install Agent Application (installAgentApp)

Creates a new agent application and an INSTALL event in a single operation. Returns both the created application and the INSTALL event so the caller can open a progress view without a second round-trip. The request body must include the application object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentAppEventRequest** | **AgentAppEventRequest** | A JSON value representing the install event request with the application. | |

### Return type

**AgentAppInstallResponse**


## mergeAgentApplicationForPreview

```
AgentApplication mergeAgentApplicationForPreview(@Nonnull String templateVersion, @Nullable AgentApplicationType appType, @Nullable String composeType, @Nullable AgentAppEventActionType actionType, @Nullable Boolean setHostValues, @Nullable String relatedEntityType, @Nullable String relatedEntityId, @Nullable AgentApplication agentApplication)
```

**POST** `/api/agent/app/merge/{templateVersion}/preview`

Merge template into application for preview (mergeAgentApplicationForPreview)

Merges the specified template into an agent application for preview purposes. If no application is provided in the body, a new one is created from the template. The compose type determines which compose configuration variant from the template is used. Optionally provide relatedEntityType and relatedEntityId to auto-fill entity credentials (Edge routing key/secret or Gateway access token) into the compose.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateVersion** | **String** | The template version to merge (e.g. '4.3.1.2EDGEPE') | |
| **appType** | **AgentApplicationType** | Application type (EDGE, GATEWAY, GENERIC). Required when no application body is supplied. | [optional] [enum: GENERIC, EDGE, GATEWAY] |
| **composeType** | **String** | The compose type to select from the template (e.g. 'monolith', 'microservices') | [optional] |
| **actionType** | **AgentAppEventActionType** | The event action this merge previews (e.g. UPGRADE). Drives action-specific merge rules. | [optional] [enum: INSTALL, UPDATE, DELETE, RESTART, ROLLBACK, UPGRADE, AGENT_UPGRADE] |
| **setHostValues** | **Boolean** | Whether to auto-fill host values (e.g. CLOUD_RPC_HOST) from the platform base URL. Should be true only for the install preview; keep false when previewing the saved compose of an existing application to preserve user-configured host values. | [optional] [default to false] |
| **relatedEntityType** | **String** | Related entity type (EDGE or DEVICE) | [optional] |
| **relatedEntityId** | **String** | Related entity id | [optional] |
| **agentApplication** | **AgentApplication** | Optional agent application to merge with. If null, a new application is created from the template. | [optional] |

### Return type

**AgentApplication**


## unassignRelatedEntityFromAgentApp

```
AgentApplication unassignRelatedEntityFromAgentApp(@Nonnull String agentApplicationId)
```

**DELETE** `/api/agent/app/{agentApplicationId}/relatedEntity`

Unassign Related Entity from Agent Application (unassignRelatedEntityFromAgentApp)

Removes the link between an agent application and its related Edge or Gateway Device.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplicationId** | **String** | A string value representing the agent application id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**AgentApplication**


## updateAgentApplication

```
AgentApplication updateAgentApplication(@Nonnull AgentApplication agentApplication)
```

**PUT** `/api/agent/app`

Update Agent Application (saveAgentApplication)

Updates the Agent Application.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentApplication** | **AgentApplication** | A JSON value representing the agent application. | |

### Return type

**AgentApplication**

