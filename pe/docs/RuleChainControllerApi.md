# RuleChainControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignRuleChainToEdge**](#assignRuleChainToEdge) | **POST** /api/edge/{edgeId}/ruleChain/{ruleChainId} | Assign rule chain to edge (assignRuleChainToEdge) |
| [**deleteRuleChain**](#deleteRuleChain) | **DELETE** /api/ruleChain/{ruleChainId} | Delete rule chain (deleteRuleChain) |
| [**exportRuleChains**](#exportRuleChains) | **GET** /api/ruleChains/export | Export Rule Chains |
| [**getAutoAssignToEdgeRuleChains**](#getAutoAssignToEdgeRuleChains) | **GET** /api/ruleChain/autoAssignToEdgeRuleChains | Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains) |
| [**getEdgeRuleChains**](#getEdgeRuleChains) | **GET** /api/edge/{edgeId}/ruleChains | Get Edge Rule Chains (getEdgeRuleChains) |
| [**getLatestRuleNodeDebugInput**](#getLatestRuleNodeDebugInput) | **GET** /api/ruleNode/{ruleNodeId}/debugIn | Get latest input message (getLatestRuleNodeDebugInput) |
| [**getRuleChainById**](#getRuleChainById) | **GET** /api/ruleChain/{ruleChainId} | Get Rule Chain (getRuleChainById) |
| [**getRuleChainMetaData**](#getRuleChainMetaData) | **GET** /api/ruleChain/{ruleChainId}/metadata | Get Rule Chain (getRuleChainById) |
| [**getRuleChainOutputLabels**](#getRuleChainOutputLabels) | **GET** /api/ruleChain/{ruleChainId}/output/labels | Get Rule Chain output labels (getRuleChainOutputLabels) |
| [**getRuleChainOutputLabelsUsage**](#getRuleChainOutputLabelsUsage) | **GET** /api/ruleChain/{ruleChainId}/output/labels/usage | Get output labels usage (getRuleChainOutputLabelsUsage) |
| [**getRuleChains**](#getRuleChains) | **GET** /api/ruleChains | Get Rule Chains (getRuleChains) |
| [**getRuleChainsByIds**](#getRuleChainsByIds) | **GET** /api/ruleChains/list | Get Rule Chains By Ids (getRuleChainsByIds) |
| [**importRuleChains**](#importRuleChains) | **POST** /api/ruleChains/import | Import Rule Chains |
| [**isTbelEnabled**](#isTbelEnabled) | **GET** /api/ruleChain/tbelEnabled | Is TBEL script executor enabled |
| [**saveRuleChain**](#saveRuleChain) | **POST** /api/ruleChain | Create Or Update Rule Chain (saveRuleChain) |
| [**saveRuleChainMetaData**](#saveRuleChainMetaData) | **POST** /api/ruleChain/metadata | Update Rule Chain Metadata |
| [**setAutoAssignToEdgeRuleChain**](#setAutoAssignToEdgeRuleChain) | **POST** /api/ruleChain/{ruleChainId}/autoAssignToEdge | Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain) |
| [**setDeviceDefaultRuleChain**](#setDeviceDefaultRuleChain) | **POST** /api/ruleChain/device/default | Create Default Rule Chain (setDeviceDefaultRuleChain) |
| [**setEdgeTemplateRootRuleChain**](#setEdgeTemplateRootRuleChain) | **POST** /api/ruleChain/{ruleChainId}/edgeTemplateRoot | Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain) |
| [**setRootRuleChain**](#setRootRuleChain) | **POST** /api/ruleChain/{ruleChainId}/root | Set Root Rule Chain (setRootRuleChain) |
| [**testRuleChainScript**](#testRuleChainScript) | **POST** /api/ruleChain/testScript | Test Script function |
| [**unassignRuleChainFromEdge**](#unassignRuleChainFromEdge) | **DELETE** /api/edge/{edgeId}/ruleChain/{ruleChainId} | Unassign rule chain from edge (unassignRuleChainFromEdge) |
| [**unsetAutoAssignToEdgeRuleChain**](#unsetAutoAssignToEdgeRuleChain) | **DELETE** /api/ruleChain/{ruleChainId}/autoAssignToEdge | Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain) |



## assignRuleChainToEdge

> RuleChain assignRuleChainToEdge(edgeId, ruleChainId)

Assign rule chain to edge (assignRuleChainToEdge)

Creates assignment of an existing rule chain to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment rule chain (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once rule chain will be delivered to edge service, it's going to start processing messages locally.   Only rule chain with type 'EDGE' can be assigned to edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **ruleChainId** | **String** |  | |

### Return type

**RuleChain**


## deleteRuleChain

> deleteRuleChain(ruleChainId)

Delete rule chain (deleteRuleChain)

Deletes the rule chain. Referencing non-existing rule chain Id will cause an error. Referencing rule chain that is used in the device profiles will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## exportRuleChains

> RuleChainData exportRuleChains(limit)

Export Rule Chains

Exports all tenant rule chains as one JSON.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer** | A limit of rule chains to export. | |

### Return type

**RuleChainData**


## getAutoAssignToEdgeRuleChains

> List<RuleChain> getAutoAssignToEdgeRuleChains()

Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains)

Returns a list of Rule Chains that will be assigned to a newly created edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.

### Return type

**List<RuleChain>**


## getEdgeRuleChains

> PageDataRuleChain getEdgeRuleChains(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Rule Chains (getEdgeRuleChains)

Returns a page of Rule Chains assigned to the specified edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the rule chain name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, root] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataRuleChain**


## getLatestRuleNodeDebugInput

> com.fasterxml.jackson.databind.JsonNode getLatestRuleNodeDebugInput(ruleNodeId)

Get latest input message (getLatestRuleNodeDebugInput)

Gets the input message from the debug events for specified Rule Chain Id. Referencing non-existing rule chain Id will cause an error.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleNodeId** | **String** | A string value representing the rule node id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getRuleChainById

> RuleChain getRuleChainById(ruleChainId)

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain object based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChain**


## getRuleChainMetaData

> RuleChainMetaData getRuleChainMetaData(ruleChainId)

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain Metadata object based on the provided Rule Chain Id. The metadata object contains information about the rule nodes and their connections.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChainMetaData**


## getRuleChainOutputLabels

> Set<String> getRuleChainOutputLabels(ruleChainId)

Get Rule Chain output labels (getRuleChainOutputLabels)

Fetch the unique labels for the \"output\" Rule Nodes that belong to the Rule Chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Set<String>**


## getRuleChainOutputLabelsUsage

> List<RuleChainOutputLabelsUsage> getRuleChainOutputLabelsUsage(ruleChainId)

Get output labels usage (getRuleChainOutputLabelsUsage)

Fetch the list of rule chains and the relation types (labels) they use to process output of the current rule chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<RuleChainOutputLabelsUsage>**


## getRuleChains

> PageDataRuleChain getRuleChains(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Rule Chains (getRuleChains)

Returns a page of Rule Chains owned by tenant. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | Rule chain type (CORE or EDGE) | [optional] [enum: CORE, EDGE] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the rule chain name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, root] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataRuleChain**


## getRuleChainsByIds

> List<RuleChain> getRuleChainsByIds(ruleChainIds)

Get Rule Chains By Ids (getRuleChainsByIds)

Requested rule chains must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainIds** | **List<String>** | A list of rule chain ids, separated by comma ',' | |

### Return type

**List<RuleChain>**


## importRuleChains

> List<RuleChainImportResult> importRuleChains(ruleChainData, overwrite)

Import Rule Chains

Imports all tenant rule chains as one JSON.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainData** | **RuleChainData** |  | |
| **overwrite** | **Boolean** | Enables overwrite for existing rule chains with the same name. | [optional] [default to false] |

### Return type

**List<RuleChainImportResult>**


## isTbelEnabled

> Boolean isTbelEnabled()

Is TBEL script executor enabled

Returns 'True' if the TBEL script execution is enabled  Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## saveRuleChain

> RuleChain saveRuleChain(ruleChain)

Create Or Update Rule Chain (saveRuleChain)

Create or update the Rule Chain. When creating Rule Chain, platform generates Rule Chain Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Rule Chain Id will be present in the response. Specify existing Rule Chain id to update the rule chain. Referencing non-existing rule chain Id will cause 'Not Found' error.  The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate 'metadata' object.Remove 'id', 'tenantId' from the request body example (below) to create new Rule Chain entity.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChain** | **RuleChain** |  | |

### Return type

**RuleChain**


## saveRuleChainMetaData

> RuleChainMetaData saveRuleChainMetaData(ruleChainMetaData, updateRelated)

Update Rule Chain Metadata

Updates the rule chain metadata. The metadata object contains information about the rule nodes and their connections.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainMetaData** | **RuleChainMetaData** |  | |
| **updateRelated** | **Boolean** | Update related rule nodes. | [optional] [default to true] |

### Return type

**RuleChainMetaData**


## setAutoAssignToEdgeRuleChain

> RuleChain setAutoAssignToEdgeRuleChain(ruleChainId)

Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain)

Makes the rule chain to be automatically assigned for any new edge that will be created. Does not assign this rule chain for already created edges.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChain**


## setDeviceDefaultRuleChain

> RuleChain setDeviceDefaultRuleChain(defaultRuleChainCreateRequest)

Create Default Rule Chain (setDeviceDefaultRuleChain)

Create rule chain from template, based on the specified name in the request. Creates the rule chain based on the template that is used to create root rule chain.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **defaultRuleChainCreateRequest** | **DefaultRuleChainCreateRequest** |  | |

### Return type

**RuleChain**


## setEdgeTemplateRootRuleChain

> RuleChain setEdgeTemplateRootRuleChain(ruleChainId)

Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain)

Makes the rule chain to be root rule chain for any new edge that will be created. Does not update root rule chain for already created edges.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChain**


## setRootRuleChain

> RuleChain setRootRuleChain(ruleChainId)

Set Root Rule Chain (setRootRuleChain)

Makes the rule chain to be root rule chain. Updates previous root rule chain as well.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChain**


## testRuleChainScript

> com.fasterxml.jackson.databind.JsonNode testRuleChainScript(body, scriptLang)

Test Script function

Execute the Script function and return the result. The format of request:   ```json {   \"script\": \"Your Function as String\",   \"scriptType\": \"One of: update, generate, filter, switch, json, string\",   \"argNames\": [\"msg\", \"metadata\", \"type\"],   \"msg\": \"{\\\"temperature\\\": 42}\",    \"metadata\": {     \"deviceName\": \"Device A\",     \"deviceType\": \"Thermometer\"   },   \"msgType\": \"POST_TELEMETRY_REQUEST\" } ```   Expected result JSON contains \"output\" and \"error\".  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | Test JS request. See API call description above. | |
| **scriptLang** | **ScriptLanguage** | Script language: JS or TBEL | [optional] [enum: JS, TBEL] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## unassignRuleChainFromEdge

> RuleChain unassignRuleChainFromEdge(edgeId, ruleChainId)

Unassign rule chain from edge (unassignRuleChainFromEdge)

Clears assignment of the rule chain to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove rule chain (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove rule chain locally.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **ruleChainId** | **String** |  | |

### Return type

**RuleChain**


## unsetAutoAssignToEdgeRuleChain

> RuleChain unsetAutoAssignToEdgeRuleChain(ruleChainId)

Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain)

Removes the rule chain from the list of rule chains that are going to be automatically assigned for any new edge that will be created. Does not unassign this rule chain for already assigned edges.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**RuleChain**

