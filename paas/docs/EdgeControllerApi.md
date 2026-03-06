# EdgeControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode activateInstance(@Nonnull String licenseSecret, @Nonnull String releaseDate) // Activate edge instance (activateInstance)
com.fasterxml.jackson.databind.JsonNode checkInstance(@Nonnull Object body) // Check edge license (checkInstance)
void deleteEdge(@Nonnull String edgeId) // Delete edge (deleteEdge)
List<Edge> findEdgesByQuery(@Nonnull EdgeSearchQuery edgeSearchQuery) // Find related edges (findEdgesByQuery)
String findMissingToRelatedRuleChains(@Nonnull String edgeId) // Find missing rule chains (findMissingToRelatedRuleChains)
PageDataEdgeInfo getAllEdgeInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get All Edge Infos for current user (getAllEdgeInfos)
PageDataEdgeInfo getCustomerEdgeInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Edge Infos (getCustomerEdgeInfos)
PageDataEdge getCustomerEdges(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Edges (getCustomerEdges)
Edge getEdgeById(@Nonnull String edgeId) // Get Edge (getEdgeById)
EdgeInfo getEdgeInfoById(@Nonnull String edgeId) // Get Edge Info (getEdgeInfoById)
EdgeInstructions getEdgeInstallInstructions(@Nonnull String edgeId, @Nonnull String method) // Get Edge Install Instructions (getEdgeInstallInstructions)
List<Edge> getEdgeList(@Nonnull List<String> edgeIds) // Get Edges By Ids (getEdgeList)
List<EntitySubtype> getEdgeTypes() // Get Edge Types (getEdgeTypes)
EdgeInstructions getEdgeUpgradeInstructions(@Nonnull String edgeVersion, @Nonnull String method) // Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)
PageDataEdge getEdges(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Edges (getEdges)
PageDataEdge getEdgesByEntityGroupId(@Nonnull String entityGroupId, @Nonnull String pageSize, @Nonnull String page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get edges by Entity Group Id (getEdgesByEntityGroupId)
Edge getTenantEdgeByName(@Nonnull String edgeName) // Get Tenant Edge by name (getTenantEdgeByName)
PageDataEdge getTenantEdges(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Edges (getTenantEdges)
PageDataEdge getUserEdges(@Nonnull String pageSize, @Nonnull String page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Edges (getUserEdges)
Boolean isEdgeUpgradeAvailable(@Nonnull String edgeId) // Is edge upgrade enabled (isEdgeUpgradeAvailable)
Boolean isEdgesSupportEnabled() // Is edges support enabled (isEdgesSupportEnabled)
BulkImportResultEdge processEdgesBulkImport(@Nonnull BulkImportRequest bulkImportRequest) // Import the bulk of edges (processEdgesBulkImport)
Edge saveEdge(@Nonnull Edge edge, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds) // Create Or Update Edge (saveEdge)
Edge setEdgeRootRuleChain(@Nonnull String edgeId, @Nonnull String ruleChainId) // Set root rule chain for provided edge (setEdgeRootRuleChain)
String syncEdge(@Nonnull String edgeId) // Sync edge (syncEdge)
```


## activateInstance

```
com.fasterxml.jackson.databind.JsonNode activateInstance(@Nonnull String licenseSecret, @Nonnull String releaseDate)
```

**POST** `/api/license/activateInstance`

Activate edge instance (activateInstance)

Activates edge license on license portal.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseSecret** | **String** |  | |
| **releaseDate** | **String** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## checkInstance

```
com.fasterxml.jackson.databind.JsonNode checkInstance(@Nonnull Object body)
```

**POST** `/api/license/checkInstance`

Check edge license (checkInstance)

Checks license request from edge service by forwarding request to license portal.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** |  | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## deleteEdge

```
void deleteEdge(@Nonnull String edgeId)
```

**DELETE** `/api/edge/{edgeId}`

Delete edge (deleteEdge)

Deletes the edge. Referencing non-existing edge Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEdgesByQuery

```
List<Edge> findEdgesByQuery(@Nonnull EdgeSearchQuery edgeSearchQuery)
```

**POST** `/api/edges`

Find related edges (findEdgesByQuery)

Returns all edges that are related to the specific entity. The entity id, relation type, edge types, depth of the search, and other query parameters defined using complex 'EdgeSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeSearchQuery** | **EdgeSearchQuery** |  | |

### Return type

**List<Edge>**


## findMissingToRelatedRuleChains

```
String findMissingToRelatedRuleChains(@Nonnull String edgeId)
```

**GET** `/api/edge/missingToRelatedRuleChains/{edgeId}`

Find missing rule chains (findMissingToRelatedRuleChains)

Returns list of rule chains ids that are not assigned to particular edge, but these rule chains are present in the already assigned rule chains to edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getAllEdgeInfos

```
PageDataEdgeInfo getAllEdgeInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/edgeInfos/all`

Get All Edge Infos for current user (getAllEdgeInfos)

Returns a page of edge info objects owned by the tenant or the customer of a current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** | A string value representing the edge type. For example, 'default' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdgeInfo**


## getCustomerEdgeInfos

```
PageDataEdgeInfo getCustomerEdgeInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/edgeInfos`

Get Customer Edge Infos (getCustomerEdgeInfos)

Returns a page of edge info objects owned by the specified customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** | A string value representing the edge type. For example, 'default' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdgeInfo**


## getCustomerEdges

```
PageDataEdge getCustomerEdges(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/edges`

Get Customer Edges (getCustomerEdges)

Returns a page of edges objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | A string value representing the edge type. For example, 'default' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdge**


## getEdgeById

```
Edge getEdgeById(@Nonnull String edgeId)
```

**GET** `/api/edge/{edgeId}`

Get Edge (getEdgeById)

Get the Edge object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**


## getEdgeInfoById

```
EdgeInfo getEdgeInfoById(@Nonnull String edgeId)
```

**GET** `/api/edge/info/{edgeId}`

Get Edge Info (getEdgeInfoById)

Get the Edge info object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EdgeInfo**


## getEdgeInstallInstructions

```
EdgeInstructions getEdgeInstallInstructions(@Nonnull String edgeId, @Nonnull String method)
```

**GET** `/api/edge/instructions/install/{edgeId}/{method}`

Get Edge Install Instructions (getEdgeInstallInstructions)

Get an install instructions for provided edge id.If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **method** | **String** | Installation method ('docker', 'ubuntu' or 'centos') | [enum: docker, ubuntu, centos] |

### Return type

**EdgeInstructions**


## getEdgeList

```
List<Edge> getEdgeList(@Nonnull List<String> edgeIds)
```

**GET** `/api/edges/list`

Get Edges By Ids (getEdgeList)

Requested edges must be owned by tenant or assigned to customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeIds** | **List<String>** | A list of edges ids, separated by comma ',' | |

### Return type

**List<Edge>**


## getEdgeTypes

```
List<EntitySubtype> getEdgeTypes()
```

**GET** `/api/edge/types`

Get Edge Types (getEdgeTypes)

Returns a set of unique edge types based on edges that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**List<EntitySubtype>**


## getEdgeUpgradeInstructions

```
EdgeInstructions getEdgeUpgradeInstructions(@Nonnull String edgeVersion, @Nonnull String method)
```

**GET** `/api/edge/instructions/upgrade/{edgeVersion}/{method}`

Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)

Get an upgrade instructions for provided edge version.If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeVersion** | **String** | Edge version | |
| **method** | **String** | Upgrade method ('docker', 'ubuntu' or 'centos') | [enum: docker, ubuntu, centos] |

### Return type

**EdgeInstructions**


## getEdges

```
PageDataEdge getEdges(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/edges`

Get Tenant Edges (getEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdge**


## getEdgesByEntityGroupId

```
PageDataEdge getEdgesByEntityGroupId(@Nonnull String entityGroupId, @Nonnull String pageSize, @Nonnull String page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/entityGroup/{entityGroupId}/edges`

Get edges by Entity Group Id (getEdgesByEntityGroupId)

Returns a page of Edge objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdge**


## getTenantEdgeByName

```
Edge getTenantEdgeByName(@Nonnull String edgeName)
```

**GET** `/api/tenant/edge`

Get Tenant Edge by name (getTenantEdgeByName)

Requested edge must be owned by tenant or customer that the user belongs to. Edge name is an unique property of edge. So it can be used to identify the edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeName** | **String** | Unique name of the edge | |

### Return type

**Edge**


## getTenantEdges

```
PageDataEdge getTenantEdges(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/edges`

Get Tenant Edges (getTenantEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** | A string value representing the edge type. For example, 'default' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdge**


## getUserEdges

```
PageDataEdge getUserEdges(@Nonnull String pageSize, @Nonnull String page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/user/edges`

Get Edges (getUserEdges)

Returns a page of edges available for current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **type** | **String** | A string value representing the edge type. For example, 'default' | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the edge name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEdge**


## isEdgeUpgradeAvailable

```
Boolean isEdgeUpgradeAvailable(@Nonnull String edgeId)
```

**GET** `/api/edge/{edgeId}/upgrade/available`

Is edge upgrade enabled (isEdgeUpgradeAvailable)

Returns 'true' if upgrade available for connected edge, 'false' - otherwise.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Boolean**


## isEdgesSupportEnabled

```
Boolean isEdgesSupportEnabled()
```

**GET** `/api/edges/enabled`

Is edges support enabled (isEdgesSupportEnabled)

Returns 'true' if edges support enabled on server, 'false' - otherwise.

### Return type

**Boolean**


## processEdgesBulkImport

```
BulkImportResultEdge processEdgesBulkImport(@Nonnull BulkImportRequest bulkImportRequest)
```

**POST** `/api/edge/bulk_import`

Import the bulk of edges (processEdgesBulkImport)

There's an ability to import the bulk of edges using the only .csv file.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | **BulkImportRequest** |  | |

### Return type

**BulkImportResultEdge**


## saveEdge

```
Edge saveEdge(@Nonnull Edge edge, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds)
```

**POST** `/api/edge`

Create Or Update Edge (saveEdge)

Create or update the Edge. When creating edge, platform generates Edge Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created edge id will be present in the response. Specify existing Edge id to update the edge. Referencing non-existing Edge Id will cause 'Not Found' error.  Edge name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the edge names and non-unique 'label' field for user-friendly visualization purposes.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Edge entity. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edge** | **Edge** |  | |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List<String>** | A list of entity group ids, separated by comma ',' | [optional] |

### Return type

**Edge**


## setEdgeRootRuleChain

```
Edge setEdgeRootRuleChain(@Nonnull String edgeId, @Nonnull String ruleChainId)
```

**POST** `/api/edge/{edgeId}/{ruleChainId}/root`

Set root rule chain for provided edge (setEdgeRootRuleChain)

Change root rule chain of the edge to the new provided rule chain.  This operation will send a notification to update root rule chain on remote edge service.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **ruleChainId** | **String** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**


## syncEdge

```
String syncEdge(@Nonnull String edgeId)
```

**POST** `/api/edge/sync/{edgeId}`

Sync edge (syncEdge)

Starts synchronization process between edge and cloud.  All entities that are assigned to particular edge are going to be send to remote edge service.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**

