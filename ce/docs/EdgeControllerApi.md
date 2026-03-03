# EdgeControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignEdgeToCustomer**](#assignEdgeToCustomer) | **POST** /api/customer/{customerId}/edge/{edgeId} | Assign edge to customer (assignEdgeToCustomer) |
| [**assignEdgeToPublicCustomer**](#assignEdgeToPublicCustomer) | **POST** /api/customer/public/edge/{edgeId} | Make edge publicly available (assignEdgeToPublicCustomer) |
| [**deleteEdge**](#deleteEdge) | **DELETE** /api/edge/{edgeId} | Delete edge (deleteEdge) |
| [**findEdgesByQuery**](#findEdgesByQuery) | **POST** /api/edges | Find related edges (findEdgesByQuery) |
| [**findMissingToRelatedRuleChains**](#findMissingToRelatedRuleChains) | **GET** /api/edge/missingToRelatedRuleChains/{edgeId} | Find missing rule chains (findMissingToRelatedRuleChains) |
| [**getCustomerEdgeInfos**](#getCustomerEdgeInfos) | **GET** /api/customer/{customerId}/edgeInfos | Get Customer Edge Infos (getCustomerEdgeInfos) |
| [**getCustomerEdges**](#getCustomerEdges) | **GET** /api/customer/{customerId}/edges | Get Customer Edges (getCustomerEdges) |
| [**getEdgeById**](#getEdgeById) | **GET** /api/edge/{edgeId} | Get Edge (getEdgeById) |
| [**getEdgeInfoById**](#getEdgeInfoById) | **GET** /api/edge/info/{edgeId} | Get Edge Info (getEdgeInfoById) |
| [**getEdgeInstallInstructions**](#getEdgeInstallInstructions) | **GET** /api/edge/instructions/install/{edgeId}/{method} | Get Edge Install Instructions (getEdgeInstallInstructions) |
| [**getEdgeList**](#getEdgeList) | **GET** /api/edges/list | Get Edges By Ids (getEdgeList) |
| [**getEdgeTypes**](#getEdgeTypes) | **GET** /api/edge/types | Get Edge Types (getEdgeTypes) |
| [**getEdgeUpgradeInstructions**](#getEdgeUpgradeInstructions) | **GET** /api/edge/instructions/upgrade/{edgeVersion}/{method} | Get Edge Upgrade Instructions (getEdgeUpgradeInstructions) |
| [**getEdges**](#getEdges) | **GET** /api/edges | Get Tenant Edges (getEdges) |
| [**getTenantEdgeByName**](#getTenantEdgeByName) | **GET** /api/tenant/edge | Get Tenant Edge by name (getTenantEdgeByName) |
| [**getTenantEdgeInfos**](#getTenantEdgeInfos) | **GET** /api/tenant/edgeInfos | Get Tenant Edge Infos (getTenantEdgeInfos) |
| [**getTenantEdges**](#getTenantEdges) | **GET** /api/tenant/edges | Get Tenant Edges (getTenantEdges) |
| [**isEdgeUpgradeAvailable**](#isEdgeUpgradeAvailable) | **GET** /api/edge/{edgeId}/upgrade/available | Is edge upgrade enabled (isEdgeUpgradeAvailable) |
| [**isEdgesSupportEnabled**](#isEdgesSupportEnabled) | **GET** /api/edges/enabled | Is edges support enabled (isEdgesSupportEnabled) |
| [**processEdgesBulkImport**](#processEdgesBulkImport) | **POST** /api/edge/bulk_import | Import the bulk of edges (processEdgesBulkImport) |
| [**saveEdge**](#saveEdge) | **POST** /api/edge | Create Or Update Edge (saveEdge) |
| [**setEdgeRootRuleChain**](#setEdgeRootRuleChain) | **POST** /api/edge/{edgeId}/{ruleChainId}/root | Set root rule chain for provided edge (setEdgeRootRuleChain) |
| [**syncEdge**](#syncEdge) | **POST** /api/edge/sync/{edgeId} | Sync edge (syncEdge) |
| [**unassignEdgeFromCustomer**](#unassignEdgeFromCustomer) | **DELETE** /api/customer/edge/{edgeId} | Unassign edge from customer (unassignEdgeFromCustomer) |



## assignEdgeToCustomer

> Edge assignEdgeToCustomer(customerId, edgeId)

Assign edge to customer (assignEdgeToCustomer)

Creates assignment of the edge to customer. Customer will be able to query edge afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**


## assignEdgeToPublicCustomer

> Edge assignEdgeToPublicCustomer(edgeId)

Make edge publicly available (assignEdgeToPublicCustomer)

Edge will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**


## deleteEdge

> deleteEdge(edgeId)

Delete edge (deleteEdge)

Deletes the edge. Referencing non-existing edge Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEdgesByQuery

> List<Edge> findEdgesByQuery(edgeSearchQuery)

Find related edges (findEdgesByQuery)

Returns all edges that are related to the specific entity. The entity id, relation type, edge types, depth of the search, and other query parameters defined using complex 'EdgeSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeSearchQuery** | **EdgeSearchQuery** |  | |

### Return type

**List<Edge>**


## findMissingToRelatedRuleChains

> String findMissingToRelatedRuleChains(edgeId)

Find missing rule chains (findMissingToRelatedRuleChains)

Returns list of rule chains ids that are not assigned to particular edge, but these rule chains are present in the already assigned rule chains to edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## getCustomerEdgeInfos

> PageDataEdgeInfo getCustomerEdgeInfos(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Edge Infos (getCustomerEdgeInfos)

Returns a page of edges info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Edge Info is an extension of the default Edge object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


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

**PageDataEdgeInfo**


## getCustomerEdges

> PageDataEdge getCustomerEdges(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

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

> Edge getEdgeById(edgeId)

Get Edge (getEdgeById)

Get the Edge object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**


## getEdgeInfoById

> EdgeInfo getEdgeInfoById(edgeId)

Get Edge Info (getEdgeInfoById)

Get the Edge Info object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EdgeInfo**


## getEdgeInstallInstructions

> EdgeInstructions getEdgeInstallInstructions(edgeId, method)

Get Edge Install Instructions (getEdgeInstallInstructions)

Get an install instructions for provided edge id.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **method** | **String** | Installation method ('docker', 'ubuntu' or 'centos') | [enum: docker, ubuntu, centos] |

### Return type

**EdgeInstructions**


## getEdgeList

> List<Edge> getEdgeList(edgeIds)

Get Edges By Ids (getEdgeList)

Requested edges must be owned by tenant or assigned to customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeIds** | **List<String>** | A list of edges ids, separated by comma ',' | |

### Return type

**List<Edge>**


## getEdgeTypes

> List<EntitySubtype> getEdgeTypes()

Get Edge Types (getEdgeTypes)

Returns a set of unique edge types based on edges that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**List<EntitySubtype>**


## getEdgeUpgradeInstructions

> EdgeInstructions getEdgeUpgradeInstructions(edgeVersion, method)

Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)

Get an upgrade instructions for provided edge version.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeVersion** | **String** | Edge version | |
| **method** | **String** | Upgrade method ('docker', 'ubuntu' or 'centos') | [enum: docker, ubuntu, centos] |

### Return type

**EdgeInstructions**


## getEdges

> PageDataEdge getEdges(pageSize, page, textSearch, sortProperty, sortOrder)

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


## getTenantEdgeByName

> Edge getTenantEdgeByName(edgeName)

Get Tenant Edge by name (getTenantEdgeByName)

Requested edge must be owned by tenant or customer that the user belongs to. Edge name is an unique property of edge. So it can be used to identify the edge.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeName** | **String** | Unique name of the edge | |

### Return type

**Edge**


## getTenantEdgeInfos

> PageDataEdgeInfo getTenantEdgeInfos(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Edge Infos (getTenantEdgeInfos)

Returns a page of edges info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Edge Info is an extension of the default Edge object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' authority.


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

**PageDataEdgeInfo**


## getTenantEdges

> PageDataEdge getTenantEdges(pageSize, page, type, textSearch, sortProperty, sortOrder)

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


## isEdgeUpgradeAvailable

> Boolean isEdgeUpgradeAvailable(edgeId)

Is edge upgrade enabled (isEdgeUpgradeAvailable)

Returns 'true' if upgrade available for connected edge, 'false' - otherwise.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Boolean**


## isEdgesSupportEnabled

> Boolean isEdgesSupportEnabled()

Is edges support enabled (isEdgesSupportEnabled)

Returns 'true' if edges support enabled on server, 'false' - otherwise.

### Return type

**Boolean**


## processEdgesBulkImport

> BulkImportResultEdge processEdgesBulkImport(bulkImportRequest)

Import the bulk of edges (processEdgesBulkImport)

There's an ability to import the bulk of edges using the only .csv file.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | **BulkImportRequest** |  | |

### Return type

**BulkImportResultEdge**


## saveEdge

> Edge saveEdge(edge)

Create Or Update Edge (saveEdge)

Create or update the Edge. When creating edge, platform generates Edge Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created edge id will be present in the response. Specify existing Edge id to update the edge. Referencing non-existing Edge Id will cause 'Not Found' error.  Edge name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the edge names and non-unique 'label' field for user-friendly visualization purposes.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Edge entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edge** | **Edge** |  | |

### Return type

**Edge**


## setEdgeRootRuleChain

> Edge setEdgeRootRuleChain(edgeId, ruleChainId)

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

> String syncEdge(edgeId)

Sync edge (syncEdge)

Starts synchronization process between edge and cloud.  All entities that are assigned to particular edge are going to be send to remote edge service.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**String**


## unassignEdgeFromCustomer

> Edge unassignEdgeFromCustomer(edgeId)

Unassign edge from customer (unassignEdgeFromCustomer)

Clears assignment of the edge to customer. Customer will not be able to query edge afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Edge**

