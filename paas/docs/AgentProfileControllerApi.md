# AgentProfileControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
void assignAppProfileToAgentProfile(@Nonnull String agentProfileId, @Nonnull String applicationProfileId) // Assign App Profile to Agent Profile (assignAppProfileToAgentProfile)
void assignAppProfilesToAgentProfile(@Nonnull String agentProfileId, @Nullable List<String> appProfileIds) // Assign Multiple App Profiles to Agent Profile (assignAppProfilesToAgentProfile)
AgentBulkAction bulkOperation(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull BulkOperationRequest bulkOperationRequest) // Bulk Operation (bulkOperation)
void deleteAgentProfile(@Nonnull String agentProfileId) // Delete Agent Profile (deleteAgentProfile)
PageDataAgentBulkAction getAgentProfileAppProfileBulkActions(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String sortProperty, @Nullable String sortOrder) // Get Bulk Actions for Agent Profile and Application Profile (getAgentProfileAppProfileBulkActions)
List<AgentAppProfileRelationInfo> getAgentProfileAppProfileInfos(@Nonnull String agentProfileId) // Get Agent Profile App Profile Infos (getAgentProfileAppProfileInfos)
PageDataAgentBulkAction getAgentProfileBulkActions(@Nonnull String agentProfileId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String sortProperty, @Nullable String sortOrder) // Get Bulk Actions for Agent Profile (getAgentProfileBulkActions)
AgentProfile getAgentProfileById(@Nonnull String agentProfileId) // Get Agent Profile (getAgentProfileById)
AgentProfileInfo getAgentProfileInfoById(@Nonnull String agentProfileId) // Get Agent Profile Info (getAgentProfileInfoById)
AgentInstructions getAgentProvisionInstructions(@Nonnull String agentProfileId, @Nonnull String method) // Get Agent Provision Instructions (getAgentProvisionInstructions)
AgentProfileInfo getDefaultAgentProfileInfo() // Get Default Agent Profile (getDefaultAgentProfileInfo)
PageDataAgentProfileInfo getTenantAgentProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Agent Profile Infos (getTenantAgentProfileInfos)
PageDataAgentProfile getTenantAgentProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Agent Profiles (getTenantAgentProfiles)
BulkOperationPreview previewBulkOperation(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull BulkOperationRequest bulkOperationRequest) // Preview Bulk Operation (previewBulkOperation)
AgentProfile saveAgentProfile(@Nonnull AgentProfile agentProfile, @Nullable List<String> appProfileIds) // Create or Update Agent Profile (saveAgentProfile)
void setAppProfileRelatesOnAutoDiscovery(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull Boolean relate) // Set App Profile Relates On Auto-Discovery (setAppProfileRelatesOnAutoDiscovery)
AgentProfile setDefaultAgentProfile(@Nonnull String agentProfileId) // Make Agent Profile Default (setDefaultAgentProfile)
void unassignAppProfileFromAgentProfile(@Nonnull String agentProfileId, @Nonnull String applicationProfileId) // Unassign App Profile from Agent Profile (unassignAppProfileFromAgentProfile)
```


## assignAppProfileToAgentProfile

```
void assignAppProfileToAgentProfile(@Nonnull String agentProfileId, @Nonnull String applicationProfileId)
```

**POST** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}`

Assign App Profile to Agent Profile (assignAppProfileToAgentProfile)

Assigns the given agent application profile to the agent profile, making it available to applications managed by that agent profile.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |

### Return type

null (empty response body)


## assignAppProfilesToAgentProfile

```
void assignAppProfilesToAgentProfile(@Nonnull String agentProfileId, @Nullable List<String> appProfileIds)
```

**POST** `/api/agent/profile/{agentProfileId}/appProfiles/assign`

Assign Multiple App Profiles to Agent Profile (assignAppProfilesToAgentProfile)

Assigns the given set of agent application profiles to the agent profile in a single request, replacing the previous assignment set. An explicitly empty 'appProfileIds' value (e.g. 'appProfileIds=') removes all assignments.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **appProfileIds** | **List<String>** | Agent application profile ids that replace the current assignment set. An explicitly empty value removes all assignments. | [optional] |

### Return type

null (empty response body)


## bulkOperation

```
AgentBulkAction bulkOperation(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull BulkOperationRequest bulkOperationRequest)
```

**POST** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}/bulk`

Bulk Operation (bulkOperation)

Enqueues a bulk operation over the applications of the given agent profile and application profile and returns the created bulk action to track its progress.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |
| **bulkOperationRequest** | **BulkOperationRequest** |  | |

### Return type

**AgentBulkAction**


## deleteAgentProfile

```
void deleteAgentProfile(@Nonnull String agentProfileId)
```

**DELETE** `/api/agent/profile/{agentProfileId}`

Delete Agent Profile (deleteAgentProfile)

Deletes the Agent Profile. Referencing a non-existing Agent Profile Id will cause an error. The default Agent Profile can not be deleted.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |

### Return type

null (empty response body)


## getAgentProfileAppProfileBulkActions

```
PageDataAgentBulkAction getAgentProfileAppProfileBulkActions(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}/bulk`

Get Bulk Actions for Agent Profile and Application Profile (getAgentProfileAppProfileBulkActions)

Returns a page of bulk actions previously submitted for the given agent profile and application profile pair. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataAgentBulkAction**


## getAgentProfileAppProfileInfos

```
List<AgentAppProfileRelationInfo> getAgentProfileAppProfileInfos(@Nonnull String agentProfileId)
```

**GET** `/api/agent/profile/{agentProfileId}/appProfilesInfo`

Get Agent Profile App Profile Infos (getAgentProfileAppProfileInfos)

Returns app profiles assigned to the given agent profile, enriched with template version, the count of AgentApplications using each app profile within this agent profile and the additional info of the assignment relation.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |

### Return type

**List<AgentAppProfileRelationInfo>**


## getAgentProfileBulkActions

```
PageDataAgentBulkAction getAgentProfileBulkActions(@Nonnull String agentProfileId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/agent/profile/{agentProfileId}/bulk`

Get Bulk Actions for Agent Profile (getAgentProfileBulkActions)

Returns a page of bulk actions previously submitted for the given agent profile. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataAgentBulkAction**


## getAgentProfileById

```
AgentProfile getAgentProfileById(@Nonnull String agentProfileId)
```

**GET** `/api/agent/profile/{agentProfileId}`

Get Agent Profile (getAgentProfileById)

Fetch the Agent Profile object based on the provided Agent Profile Id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |

### Return type

**AgentProfile**


## getAgentProfileInfoById

```
AgentProfileInfo getAgentProfileInfoById(@Nonnull String agentProfileId)
```

**GET** `/api/agent/profile/info/{agentProfileId}`

Get Agent Profile Info (getAgentProfileInfoById)

Fetch the Agent Profile Info object based on the provided Agent Profile Id. Agent Profile Info is a lightweight object that omits the auto-provision key and secret; it is readable by any tenant admin so agent screens can resolve the linked profile.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |

### Return type

**AgentProfileInfo**


## getAgentProvisionInstructions

```
AgentInstructions getAgentProvisionInstructions(@Nonnull String agentProfileId, @Nonnull String method)
```

**GET** `/api/agent/profile/instructions/provision/{agentProfileId}/{method}`

Get Agent Provision Instructions (getAgentProvisionInstructions)

Returns the auto-provision docker command for the specified agent profile with the server address and gRPC port resolved server-side.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **method** | **String** | Installation method ('docker') | [enum: docker] |

### Return type

**AgentInstructions**


## getDefaultAgentProfileInfo

```
AgentProfileInfo getDefaultAgentProfileInfo()
```

**GET** `/api/agent/profile/info/default`

Get Default Agent Profile (getDefaultAgentProfileInfo)

Fetch the Agent Profile Info object that is marked as default within the current tenant scope.  Available for users with 'TENANT_ADMIN' authority.

### Return type

**AgentProfileInfo**


## getTenantAgentProfileInfos

```
PageDataAgentProfileInfo getTenantAgentProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/agent/profileInfos`

Get Tenant Agent Profile Infos (getTenantAgentProfileInfos)

Returns a page of Agent Profile Info objects owned by the current tenant. Agent Profile Info is a lightweight object that contains only id and name of the profile. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** |  | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataAgentProfileInfo**


## getTenantAgentProfiles

```
PageDataAgentProfile getTenantAgentProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/agent/profiles`

Get Tenant Agent Profiles (getTenantAgentProfiles)

Returns a page of Agent Profile objects owned by the current tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** |  | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataAgentProfile**


## previewBulkOperation

```
BulkOperationPreview previewBulkOperation(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull BulkOperationRequest bulkOperationRequest)
```

**POST** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}/bulk/preview`

Preview Bulk Operation (previewBulkOperation)

Previews the effect of a bulk operation over the applications of the given agent profile and application profile without enqueuing it, returning the set of affected applications and the resulting actions.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |
| **bulkOperationRequest** | **BulkOperationRequest** |  | |

### Return type

**BulkOperationPreview**


## saveAgentProfile

```
AgentProfile saveAgentProfile(@Nonnull AgentProfile agentProfile, @Nullable List<String> appProfileIds)
```

**POST** `/api/agent/profile`

Create or Update Agent Profile (saveAgentProfile)

Creates or updates the Agent Profile. When an id is not present in the request, a new Agent Profile is created, otherwise the existing one is updated. Optionally synchronizes the agent application profile assignments in the same request: when the 'appProfileIds' parameter is absent, existing assignments are left untouched; when it is present, the assignment set is replaced with the given ids — including an explicitly empty value (e.g. 'appProfileIds='), which removes all assignments.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfile** | **AgentProfile** |  | |
| **appProfileIds** | **List<String>** | Agent application profile ids to assign to this agent profile. Absent: assignments are not modified. Present: assignments are replaced with the given ids; an explicitly empty value removes all assignments. | [optional] |

### Return type

**AgentProfile**


## setAppProfileRelatesOnAutoDiscovery

```
void setAppProfileRelatesOnAutoDiscovery(@Nonnull String agentProfileId, @Nonnull String applicationProfileId, @Nonnull Boolean relate)
```

**POST** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}/autoDiscovery`

Set App Profile Relates On Auto-Discovery (setAppProfileRelatesOnAutoDiscovery)

Enables or disables automatic assignment of the app profile to new auto-discovered applications with a matching template. Only one app profile per agent profile and template pair may relate on auto-discovery.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |
| **relate** | **Boolean** | Whether the app profile should be auto-assigned to new auto-discovered applications with a matching template | |

### Return type

null (empty response body)


## setDefaultAgentProfile

```
AgentProfile setDefaultAgentProfile(@Nonnull String agentProfileId)
```

**POST** `/api/agent/profile/{agentProfileId}/default`

Make Agent Profile Default (setDefaultAgentProfile)

Marks agent profile as default within a tenant scope.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |

### Return type

**AgentProfile**


## unassignAppProfileFromAgentProfile

```
void unassignAppProfileFromAgentProfile(@Nonnull String agentProfileId, @Nonnull String applicationProfileId)
```

**DELETE** `/api/agent/profile/{agentProfileId}/appProfile/{applicationProfileId}`

Unassign App Profile from Agent Profile (unassignAppProfileFromAgentProfile)

Removes the assignment of the given agent application profile from the agent profile.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentProfileId** | **String** | Agent Profile Id | |
| **applicationProfileId** | **String** | Agent Application Profile Id | |

### Return type

null (empty response body)

