# RuleChainControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
RuleChain assignRuleChainToEdge(AssignRuleChainToEdgeArgs args) // Assign rule chain to edge (assignRuleChainToEdge)
void deleteRuleChain(DeleteRuleChainArgs args) // Delete rule chain (deleteRuleChain)
RuleChainData exportRuleChains(ExportRuleChainsArgs args) // Export Rule Chains
List<RuleChain> getAutoAssignToEdgeRuleChains() // Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains)
PageDataRuleChain getEdgeRuleChains(GetEdgeRuleChainsArgs args) // Get Edge Rule Chains (getEdgeRuleChains)
com.fasterxml.jackson.databind.JsonNode getLatestRuleNodeDebugInput(GetLatestRuleNodeDebugInputArgs args) // Get latest input message (getLatestRuleNodeDebugInput)
RuleChain getRuleChainById(GetRuleChainByIdArgs args) // Get Rule Chain (getRuleChainById)
RuleChainMetaData getRuleChainMetaData(GetRuleChainMetaDataArgs args) // Get Rule Chain (getRuleChainById)
Set<String> getRuleChainOutputLabels(GetRuleChainOutputLabelsArgs args) // Get Rule Chain output labels (getRuleChainOutputLabels)
List<RuleChainOutputLabelsUsage> getRuleChainOutputLabelsUsage(GetRuleChainOutputLabelsUsageArgs args) // Get output labels usage (getRuleChainOutputLabelsUsage)
PageDataRuleChain getRuleChains(GetRuleChainsArgs args) // Get Rule Chains (getRuleChains)
List<RuleChain> getRuleChainsByIds(GetRuleChainsByIdsArgs args) // Get Rule Chains By Ids (getRuleChainsByIds)
List<RuleChainImportResult> importRuleChains(ImportRuleChainsArgs args) // Import Rule Chains
Boolean isTbelEnabled() // Is TBEL script executor enabled
RuleChain saveRuleChain(SaveRuleChainArgs args) // Create Or Update Rule Chain (saveRuleChain)
RuleChainMetaData saveRuleChainMetaData(SaveRuleChainMetaDataArgs args) // Update Rule Chain Metadata
RuleChain setAutoAssignToEdgeRuleChain(SetAutoAssignToEdgeRuleChainArgs args) // Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain)
RuleChain setDeviceDefaultRuleChain(SetDeviceDefaultRuleChainArgs args) // Create Default Rule Chain (setDeviceDefaultRuleChain)
RuleChain setEdgeTemplateRootRuleChain(SetEdgeTemplateRootRuleChainArgs args) // Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain)
RuleChain setRootRuleChain(SetRootRuleChainArgs args) // Set Root Rule Chain (setRootRuleChain)
com.fasterxml.jackson.databind.JsonNode testRuleChainScript(TestRuleChainScriptArgs args) // Test Script function
RuleChain unassignRuleChainFromEdge(UnassignRuleChainFromEdgeArgs args) // Unassign rule chain from edge (unassignRuleChainFromEdge)
RuleChain unsetAutoAssignToEdgeRuleChain(UnsetAutoAssignToEdgeRuleChainArgs args) // Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain)
```


## assignRuleChainToEdge

**POST** `/api/edge/{edgeId}/ruleChain/{ruleChainId}`

Assign rule chain to edge (assignRuleChainToEdge)

Creates assignment of an existing rule chain to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment rule chain (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once rule chain will be delivered to edge service, it's going to start processing messages locally.   Only rule chain with type 'EDGE' can be assigned to edge.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain assignRuleChainToEdge(AssignRuleChainToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignRuleChainToEdgeArgs.builder()
        .edgeId(String)
        .ruleChainId(String)
        .build()
```

### `AssignRuleChainToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `ruleChainId` | `String` | **yes** |  | |

### Return type

`RuleChain`


## deleteRuleChain

**DELETE** `/api/ruleChain/{ruleChainId}`

Delete rule chain (deleteRuleChain)

Deletes the rule chain. Referencing non-existing rule chain Id will cause an error. Referencing rule chain that is used in the device profiles will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteRuleChain(DeleteRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteRuleChainArgs.builder()
        .ruleChainId(String)
        .build()
```

### `DeleteRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## exportRuleChains

**GET** `/api/ruleChains/export`

Export Rule Chains

Exports all tenant rule chains as one JSON.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChainData exportRuleChains(ExportRuleChainsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ExportRuleChainsArgs.builder()
        .limit(Integer)
        .build()
```

### `ExportRuleChainsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `limit` | `Integer` | **yes** | A limit of rule chains to export. | |

### Return type

`RuleChainData`


## getAutoAssignToEdgeRuleChains

**GET** `/api/ruleChain/autoAssignToEdgeRuleChains`

Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains)

Returns a list of Rule Chains that will be assigned to a newly created edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.

```java
List<RuleChain> getAutoAssignToEdgeRuleChains()
```

### Return type

`List<RuleChain>`


## getEdgeRuleChains

**GET** `/api/edge/{edgeId}/ruleChains`

Get Edge Rule Chains (getEdgeRuleChains)

Returns a page of Rule Chains assigned to the specified edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataRuleChain getEdgeRuleChains(GetEdgeRuleChainsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeRuleChainsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeRuleChainsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the rule chain name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `root` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataRuleChain`


## getLatestRuleNodeDebugInput

**GET** `/api/ruleNode/{ruleNodeId}/debugIn`

Get latest input message (getLatestRuleNodeDebugInput)

Gets the input message from the debug events for specified Rule Chain Id. Referencing non-existing rule chain Id will cause an error.   Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode getLatestRuleNodeDebugInput(GetLatestRuleNodeDebugInputArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLatestRuleNodeDebugInputArgs.builder()
        .ruleNodeId(String)
        .build()
```

### `GetLatestRuleNodeDebugInputArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleNodeId` | `String` | **yes** | A string value representing the rule node id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getRuleChainById

**GET** `/api/ruleChain/{ruleChainId}`

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain object based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain getRuleChainById(GetRuleChainByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainByIdArgs.builder()
        .ruleChainId(String)
        .build()
```

### `GetRuleChainByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChain`


## getRuleChainMetaData

**GET** `/api/ruleChain/{ruleChainId}/metadata`

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain Metadata object based on the provided Rule Chain Id. The metadata object contains information about the rule nodes and their connections.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChainMetaData getRuleChainMetaData(GetRuleChainMetaDataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainMetaDataArgs.builder()
        .ruleChainId(String)
        .build()
```

### `GetRuleChainMetaDataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChainMetaData`


## getRuleChainOutputLabels

**GET** `/api/ruleChain/{ruleChainId}/output/labels`

Get Rule Chain output labels (getRuleChainOutputLabels)

Fetch the unique labels for the \"output\" Rule Nodes that belong to the Rule Chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.

```java
Set<String> getRuleChainOutputLabels(GetRuleChainOutputLabelsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainOutputLabelsArgs.builder()
        .ruleChainId(String)
        .build()
```

### `GetRuleChainOutputLabelsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Set<String>`


## getRuleChainOutputLabelsUsage

**GET** `/api/ruleChain/{ruleChainId}/output/labels/usage`

Get output labels usage (getRuleChainOutputLabelsUsage)

Fetch the list of rule chains and the relation types (labels) they use to process output of the current rule chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.

```java
List<RuleChainOutputLabelsUsage> getRuleChainOutputLabelsUsage(GetRuleChainOutputLabelsUsageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainOutputLabelsUsageArgs.builder()
        .ruleChainId(String)
        .build()
```

### `GetRuleChainOutputLabelsUsageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<RuleChainOutputLabelsUsage>`


## getRuleChains

**GET** `/api/ruleChains`

Get Rule Chains (getRuleChains)

Returns a page of Rule Chains owned by tenant. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataRuleChain getRuleChains(GetRuleChainsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetRuleChainsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | Rule chain type (CORE or EDGE) | enum: `CORE`, `EDGE` |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the rule chain name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `root` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataRuleChain`


## getRuleChainsByIds

**GET** `/api/ruleChains/list`

Get Rule Chains By Ids (getRuleChainsByIds)

Requested rule chains must be owned by tenant which is performing the request.   

```java
List<RuleChain> getRuleChainsByIds(GetRuleChainsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRuleChainsByIdsArgs.builder()
        .ruleChainIds(List<String>)
        .build()
```

### `GetRuleChainsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainIds` | `List<String>` | **yes** | A list of rule chain ids, separated by comma ',' | |

### Return type

`List<RuleChain>`


## importRuleChains

**POST** `/api/ruleChains/import`

Import Rule Chains

Imports all tenant rule chains as one JSON.  Available for users with 'TENANT_ADMIN' authority.

```java
List<RuleChainImportResult> importRuleChains(ImportRuleChainsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ImportRuleChainsArgs.builder()
        .ruleChainData(RuleChainData)
        .build()
```

### `ImportRuleChainsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainData` | `RuleChainData` | **yes** |  | |
| `overwrite` | `Boolean` | no | Enables overwrite for existing rule chains with the same name. | default: `false` |

### Return type

`List<RuleChainImportResult>`


## isTbelEnabled

**GET** `/api/ruleChain/tbelEnabled`

Is TBEL script executor enabled

Returns 'True' if the TBEL script execution is enabled  Available for users with 'TENANT_ADMIN' authority.

```java
Boolean isTbelEnabled()
```

### Return type

`Boolean`


## saveRuleChain

**POST** `/api/ruleChain`

Create Or Update Rule Chain (saveRuleChain)

Create or update the Rule Chain. When creating Rule Chain, platform generates Rule Chain Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Rule Chain Id will be present in the response. Specify existing Rule Chain id to update the rule chain. Referencing non-existing rule chain Id will cause 'Not Found' error.  The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.Remove 'id', 'tenantId' from the request body example (below) to create new Rule Chain entity.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain saveRuleChain(SaveRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveRuleChainArgs.builder()
        .ruleChain(RuleChain)
        .build()
```

### `SaveRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChain` | `RuleChain` | **yes** |  | |

### Return type

`RuleChain`


## saveRuleChainMetaData

**POST** `/api/ruleChain/metadata`

Update Rule Chain Metadata

Updates the rule chain metadata. The metadata object contains information about the rule nodes and their connections.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChainMetaData saveRuleChainMetaData(SaveRuleChainMetaDataArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveRuleChainMetaDataArgs.builder()
        .ruleChainMetaData(RuleChainMetaData)
        .build()
```

### `SaveRuleChainMetaDataArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainMetaData` | `RuleChainMetaData` | **yes** |  | |
| `updateRelated` | `Boolean` | no | Update related rule nodes. | default: `true` |

### Return type

`RuleChainMetaData`


## setAutoAssignToEdgeRuleChain

**POST** `/api/ruleChain/{ruleChainId}/autoAssignToEdge`

Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain)

Makes the rule chain to be automatically assigned for any new edge that will be created. Does not assign this rule chain for already created edges.   Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain setAutoAssignToEdgeRuleChain(SetAutoAssignToEdgeRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetAutoAssignToEdgeRuleChainArgs.builder()
        .ruleChainId(String)
        .build()
```

### `SetAutoAssignToEdgeRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChain`


## setDeviceDefaultRuleChain

**POST** `/api/ruleChain/device/default`

Create Default Rule Chain (setDeviceDefaultRuleChain)

Create rule chain from template, based on the specified name in the request. Creates the rule chain based on the template that is used to create root rule chain.   Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain setDeviceDefaultRuleChain(SetDeviceDefaultRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetDeviceDefaultRuleChainArgs.builder()
        .defaultRuleChainCreateRequest(DefaultRuleChainCreateRequest)
        .build()
```

### `SetDeviceDefaultRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `defaultRuleChainCreateRequest` | `DefaultRuleChainCreateRequest` | **yes** |  | |

### Return type

`RuleChain`


## setEdgeTemplateRootRuleChain

**POST** `/api/ruleChain/{ruleChainId}/edgeTemplateRoot`

Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain)

Makes the rule chain to be root rule chain for any new edge that will be created. Does not update root rule chain for already created edges.   Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain setEdgeTemplateRootRuleChain(SetEdgeTemplateRootRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetEdgeTemplateRootRuleChainArgs.builder()
        .ruleChainId(String)
        .build()
```

### `SetEdgeTemplateRootRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChain`


## setRootRuleChain

**POST** `/api/ruleChain/{ruleChainId}/root`

Set Root Rule Chain (setRootRuleChain)

Makes the rule chain to be root rule chain. Updates previous root rule chain as well.   Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain setRootRuleChain(SetRootRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetRootRuleChainArgs.builder()
        .ruleChainId(String)
        .build()
```

### `SetRootRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChain`


## testRuleChainScript

**POST** `/api/ruleChain/testScript`

Test Script function

Execute the Script function and return the result. The format of request:   ```json {   \"script\": \"Your Function as String\",   \"scriptType\": \"One of: update, generate, filter, switch, json, string\",   \"argNames\": [\"msg\", \"metadata\", \"type\"],   \"msg\": \"{\\\"temperature\\\": 42}\",    \"metadata\": {     \"deviceName\": \"Device A\",     \"deviceType\": \"Thermometer\"   },   \"msgType\": \"POST_TELEMETRY_REQUEST\" } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.

```java
com.fasterxml.jackson.databind.JsonNode testRuleChainScript(TestRuleChainScriptArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
TestRuleChainScriptArgs.builder()
        .body(Object)
        .build()
```

### `TestRuleChainScriptArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** | Test JS request. See API call description above. | |
| `scriptLang` | `ScriptLanguage` | no | Script language: JS or TBEL | enum: `JS`, `TBEL` |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## unassignRuleChainFromEdge

**DELETE** `/api/edge/{edgeId}/ruleChain/{ruleChainId}`

Unassign rule chain from edge (unassignRuleChainFromEdge)

Clears assignment of the rule chain to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove rule chain (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove rule chain locally.  Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain unassignRuleChainFromEdge(UnassignRuleChainFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignRuleChainFromEdgeArgs.builder()
        .edgeId(String)
        .ruleChainId(String)
        .build()
```

### `UnassignRuleChainFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `ruleChainId` | `String` | **yes** |  | |

### Return type

`RuleChain`


## unsetAutoAssignToEdgeRuleChain

**DELETE** `/api/ruleChain/{ruleChainId}/autoAssignToEdge`

Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain)

Removes the rule chain from the list of rule chains that are going to be automatically assigned for any new edge that will be created. Does not unassign this rule chain for already assigned edges.   Available for users with 'TENANT_ADMIN' authority.

```java
RuleChain unsetAutoAssignToEdgeRuleChain(UnsetAutoAssignToEdgeRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnsetAutoAssignToEdgeRuleChainArgs.builder()
        .ruleChainId(String)
        .build()
```

### `UnsetAutoAssignToEdgeRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`RuleChain`

