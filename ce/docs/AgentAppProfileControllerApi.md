# AgentAppProfileControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
void deleteAgentAppProfile(@Nonnull String profileId) // Delete Agent Application Profile (deleteAgentAppProfile)
AgentAppProfile getAgentAppProfileById(@Nonnull String profileId) // Get Agent Application Profile (getAgentAppProfileById)
AgentAppProfileInfo getAgentAppProfileInfoById(@Nonnull String profileId) // Get Agent Application Profile Info (getAgentAppProfileInfoById)
List<AgentAppProfileInfo> getAgentAppProfilesByAppType(@Nonnull AgentApplicationType appType) // Get Agent Application Profiles by app type (getAgentAppProfilesByAppType)
List<AgentAppProfile> getAgentAppProfilesByIds(@Nonnull List<String> agentAppProfileIds) // Get Agent Application Profiles By Ids (getAgentAppProfilesByIds)
PageDataAgentAppProfile getTenantAgentAppProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Agent Application Profiles (getTenantAgentAppProfiles)
AgentAppProfile materializeAgentAppProfile(@Nonnull AgentApplicationType appType, @Nonnull String templateVersion, @Nullable String composeType) // Create Agent Application Profile from template (materializeAgentAppProfile)
AgentAppProfile mergeAgentAppProfileForPreview(@Nonnull String templateVersion, @Nonnull AgentAppProfile agentAppProfile, @Nullable String composeType, @Nullable AgentAppEventActionType actionType, @Nullable Boolean setHostValues) // Merge template into application profile for preview (mergeAgentAppProfileForPreview)
AgentAppProfile saveAgentAppProfile(@Nonnull AgentAppProfile agentAppProfile) // Create or Update Agent Application Profile (saveAgentAppProfile)
```


## deleteAgentAppProfile

```
void deleteAgentAppProfile(@Nonnull String profileId)
```

**DELETE** `/api/agent/app/profile/{profileId}`

Delete Agent Application Profile (deleteAgentAppProfile)

Deletes the agent application profile. Cannot delete if referenced by applications.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String** | Profile Id | |

### Return type

null (empty response body)


## getAgentAppProfileById

```
AgentAppProfile getAgentAppProfileById(@Nonnull String profileId)
```

**GET** `/api/agent/app/profile/{profileId}`

Get Agent Application Profile (getAgentAppProfileById)

Fetch the Agent Application Profile by Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String** | Profile Id | |

### Return type

**AgentAppProfile**


## getAgentAppProfileInfoById

```
AgentAppProfileInfo getAgentAppProfileInfoById(@Nonnull String profileId)
```

**GET** `/api/agent/app/profile/info/{profileId}`

Get Agent Application Profile Info (getAgentAppProfileInfoById)

Fetch the Agent Application Profile Info by Id. Readable by any tenant admin without AGENT_APP_PROFILE permission, so agent/application screens can resolve the linked profile. Returns the full profile, config and arguments included - an application profile carries deployment configuration rather than credentials, so it is not gated like other profiles.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String** | Profile Id | |

### Return type

**AgentAppProfileInfo**


## getAgentAppProfilesByAppType

```
List<AgentAppProfileInfo> getAgentAppProfilesByAppType(@Nonnull AgentApplicationType appType)
```

**GET** `/api/agent/app/profiles/{appType}`

Get Agent Application Profiles by app type (getAgentAppProfilesByAppType)

Returns a list of agent application profiles filtered by application type.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appType** | **AgentApplicationType** | Application type, e.g. 'EDGE', 'GATEWAY', 'GENERIC' | [enum: GENERIC, EDGE, GATEWAY] |

### Return type

**List<AgentAppProfileInfo>**


## getAgentAppProfilesByIds

```
List<AgentAppProfile> getAgentAppProfilesByIds(@Nonnull List<String> agentAppProfileIds)
```

**GET** `/api/agent/app/profiles`

Get Agent Application Profiles By Ids (getAgentAppProfilesByIds)

Requested agent application profiles must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentAppProfileIds** | **List<String>** | A list of agent application profile ids, separated by comma ',' | |

### Return type

**List<AgentAppProfile>**


## getTenantAgentAppProfiles

```
PageDataAgentAppProfile getTenantAgentAppProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/agent/app/profiles`

Get Tenant Agent Application Profiles (getTenantAgentAppProfiles)

Returns a page of agent application profiles owned by tenant.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Optional search text | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataAgentAppProfile**


## materializeAgentAppProfile

```
AgentAppProfile materializeAgentAppProfile(@Nonnull AgentApplicationType appType, @Nonnull String templateVersion, @Nullable String composeType)
```

**POST** `/api/agent/app/profile/materialize/{appType}/{templateVersion}`

Create Agent Application Profile from template (materializeAgentAppProfile)

Creates an agent application profile from the default configuration of the template with the given app type and version. Used to materialize a predefined (virtual) profile shown in the UI into a real profile on first use. If a profile with the given app type and template version already exists, the existing profile is returned (the oldest one by created time) instead of creating a new one.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appType** | **AgentApplicationType** | Application type, e.g. 'EDGE', 'GATEWAY', 'GENERIC' | [enum: GENERIC, EDGE, GATEWAY] |
| **templateVersion** | **String** | The template version to materialize (e.g. '4.3.1.2EDGEPE') | |
| **composeType** | **String** | The compose type to select from the template (e.g. 'in_memory', 'kafka'). Defaults to the template's first compose type. | [optional] |

### Return type

**AgentAppProfile**


## mergeAgentAppProfileForPreview

```
AgentAppProfile mergeAgentAppProfileForPreview(@Nonnull String templateVersion, @Nonnull AgentAppProfile agentAppProfile, @Nullable String composeType, @Nullable AgentAppEventActionType actionType, @Nullable Boolean setHostValues)
```

**POST** `/api/agent/app/profiles/merge/{templateVersion}/preview`

Merge template into application profile for preview (mergeAgentAppProfileForPreview)

Merges the specified template into an agent application profile for preview purposes. The compose type determines which compose configuration variant from the template is used.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **templateVersion** | **String** | The template version to merge (e.g. '4.3.1.2EDGEPE') | |
| **agentAppProfile** | **AgentAppProfile** | Agent application profile to merge template with | |
| **composeType** | **String** | The compose type to select from the template (e.g. 'monolith', 'microservices') | [optional] |
| **actionType** | **AgentAppEventActionType** | The event action this merge previews (e.g. UPGRADE). Drives action-specific merge rules. | [optional] [enum: INSTALL, UPDATE, DELETE, RESTART, ROLLBACK, UPGRADE, AGENT_UPGRADE] |
| **setHostValues** | **Boolean** | Whether to auto-fill host values (e.g. CLOUD_RPC_HOST) from the platform base URL. Should be true only for the install preview; keep false when previewing the saved compose of an existing profile to preserve user-configured host values. | [optional] [default to false] |

### Return type

**AgentAppProfile**


## saveAgentAppProfile

```
AgentAppProfile saveAgentAppProfile(@Nonnull AgentAppProfile agentAppProfile)
```

**POST** `/api/agent/app/profile`

Create or Update Agent Application Profile (saveAgentAppProfile)

Creates or updates an agent application profile.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentAppProfile** | **AgentAppProfile** |  | |

### Return type

**AgentAppProfile**

