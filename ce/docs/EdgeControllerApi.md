# EdgeControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Edge assignEdgeToCustomer(AssignEdgeToCustomerArgs args) // Assign edge to customer (assignEdgeToCustomer)
Edge assignEdgeToPublicCustomer(AssignEdgeToPublicCustomerArgs args) // Make edge publicly available (assignEdgeToPublicCustomer)
void deleteEdge(DeleteEdgeArgs args) // Delete edge (deleteEdge)
List<Edge> findEdgesByQuery(FindEdgesByQueryArgs args) // Find related edges (findEdgesByQuery)
String findMissingToRelatedRuleChains(FindMissingToRelatedRuleChainsArgs args) // Find missing rule chains (findMissingToRelatedRuleChains)
PageDataEdgeInfo getCustomerEdgeInfos(GetCustomerEdgeInfosArgs args) // Get Customer Edge Infos (getCustomerEdgeInfos)
PageDataEdge getCustomerEdges(GetCustomerEdgesArgs args) // Get Customer Edges (getCustomerEdges)
Edge getEdgeById(GetEdgeByIdArgs args) // Get Edge (getEdgeById)
EdgeInfo getEdgeInfoById(GetEdgeInfoByIdArgs args) // Get Edge Info (getEdgeInfoById)
EdgeInstructions getEdgeInstallInstructions(GetEdgeInstallInstructionsArgs args) // Get Edge Install Instructions (getEdgeInstallInstructions)
List<Edge> getEdgeList(GetEdgeListArgs args) // Get Edges By Ids (getEdgeList)
List<EntitySubtype> getEdgeTypes() // Get Edge Types (getEdgeTypes)
EdgeInstructions getEdgeUpgradeInstructions(GetEdgeUpgradeInstructionsArgs args) // Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)
PageDataEdge getEdges(GetEdgesArgs args) // Get Tenant Edges (getEdges)
Edge getTenantEdgeByName(GetTenantEdgeByNameArgs args) // Get Tenant Edge by name (getTenantEdgeByName)
PageDataEdgeInfo getTenantEdgeInfos(GetTenantEdgeInfosArgs args) // Get Tenant Edge Infos (getTenantEdgeInfos)
PageDataEdge getTenantEdges(GetTenantEdgesArgs args) // Get Tenant Edges (getTenantEdges)
Boolean isEdgeUpgradeAvailable(IsEdgeUpgradeAvailableArgs args) // Is edge upgrade enabled (isEdgeUpgradeAvailable)
Boolean isEdgesSupportEnabled() // Is edges support enabled (isEdgesSupportEnabled)
BulkImportResultEdge processEdgesBulkImport(ProcessEdgesBulkImportArgs args) // Import the bulk of edges (processEdgesBulkImport)
Edge saveEdge(SaveEdgeArgs args) // Create Or Update Edge (saveEdge)
Edge setEdgeRootRuleChain(SetEdgeRootRuleChainArgs args) // Set root rule chain for provided edge (setEdgeRootRuleChain)
String syncEdge(SyncEdgeArgs args) // Sync edge (syncEdge)
Edge unassignEdgeFromCustomer(UnassignEdgeFromCustomerArgs args) // Unassign edge from customer (unassignEdgeFromCustomer)
```


## assignEdgeToCustomer

**POST** `/api/customer/{customerId}/edge/{edgeId}`

Assign edge to customer (assignEdgeToCustomer)

Creates assignment of the edge to customer. Customer will be able to query edge afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Edge assignEdgeToCustomer(AssignEdgeToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEdgeToCustomerArgs.builder()
        .customerId(String)
        .edgeId(String)
        .build()
```

### `AssignEdgeToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Edge`


## assignEdgeToPublicCustomer

**POST** `/api/customer/public/edge/{edgeId}`

Make edge publicly available (assignEdgeToPublicCustomer)

Edge will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the edge.  Available for users with 'TENANT_ADMIN' authority.

```java
Edge assignEdgeToPublicCustomer(AssignEdgeToPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEdgeToPublicCustomerArgs.builder()
        .edgeId(String)
        .build()
```

### `AssignEdgeToPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Edge`


## deleteEdge

**DELETE** `/api/edge/{edgeId}`

Delete edge (deleteEdge)

Deletes the edge. Referencing non-existing edge Id will cause an error.  Available for users with 'TENANT_ADMIN' authority.

```java
void deleteEdge(DeleteEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteEdgeArgs.builder()
        .edgeId(String)
        .build()
```

### `DeleteEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEdgesByQuery

**POST** `/api/edges`

Find related edges (findEdgesByQuery)

Returns all edges that are related to the specific entity. The entity id, relation type, edge types, depth of the search, and other query parameters defined using complex 'EdgeSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<Edge> findEdgesByQuery(FindEdgesByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEdgesByQueryArgs.builder()
        .edgeSearchQuery(EdgeSearchQuery)
        .build()
```

### `FindEdgesByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeSearchQuery` | `EdgeSearchQuery` | **yes** |  | |

### Return type

`List<Edge>`


## findMissingToRelatedRuleChains

**GET** `/api/edge/missingToRelatedRuleChains/{edgeId}`

Find missing rule chains (findMissingToRelatedRuleChains)

Returns list of rule chains ids that are not assigned to particular edge, but these rule chains are present in the already assigned rule chains to edge.  Available for users with 'TENANT_ADMIN' authority.

```java
String findMissingToRelatedRuleChains(FindMissingToRelatedRuleChainsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindMissingToRelatedRuleChainsArgs.builder()
        .edgeId(String)
        .build()
```

### `FindMissingToRelatedRuleChainsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`String`


## getCustomerEdgeInfos

**GET** `/api/customer/{customerId}/edgeInfos`

Get Customer Edge Infos (getCustomerEdgeInfos)

Returns a page of edges info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Edge Info is an extension of the default Edge object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataEdgeInfo getCustomerEdgeInfos(GetCustomerEdgeInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerEdgeInfosArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerEdgeInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | A string value representing the edge type. For example, 'default' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEdgeInfo`


## getCustomerEdges

**GET** `/api/customer/{customerId}/edges`

Get Customer Edges (getCustomerEdges)

Returns a page of edges objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataEdge getCustomerEdges(GetCustomerEdgesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerEdgesArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerEdgesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | A string value representing the edge type. For example, 'default' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEdge`


## getEdgeById

**GET** `/api/edge/{edgeId}`

Get Edge (getEdgeById)

Get the Edge object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Edge getEdgeById(GetEdgeByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeByIdArgs.builder()
        .edgeId(String)
        .build()
```

### `GetEdgeByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Edge`


## getEdgeInfoById

**GET** `/api/edge/info/{edgeId}`

Get Edge Info (getEdgeInfoById)

Get the Edge Info object based on the provided Edge Id. If the user has the authority of 'Tenant Administrator', the server checks that the edge is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the edge is assigned to the same customer.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
EdgeInfo getEdgeInfoById(GetEdgeInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeInfoByIdArgs.builder()
        .edgeId(String)
        .build()
```

### `GetEdgeInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EdgeInfo`


## getEdgeInstallInstructions

**GET** `/api/edge/instructions/install/{edgeId}/{method}`

Get Edge Install Instructions (getEdgeInstallInstructions)

Get an install instructions for provided edge id.  Available for users with 'TENANT_ADMIN' authority.

```java
EdgeInstructions getEdgeInstallInstructions(GetEdgeInstallInstructionsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeInstallInstructionsArgs.builder()
        .edgeId(String)
        .method(String)
        .build()
```

### `GetEdgeInstallInstructionsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `method` | `String` | **yes** | Installation method ('docker', 'ubuntu' or 'centos') | enum: `docker`, `ubuntu`, `centos` |

### Return type

`EdgeInstructions`


## getEdgeList

**GET** `/api/edges/list`

Get Edges By Ids (getEdgeList)

Requested edges must be owned by tenant or assigned to customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<Edge> getEdgeList(GetEdgeListArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeListArgs.builder()
        .edgeIds(List<String>)
        .build()
```

### `GetEdgeListArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeIds` | `List<String>` | **yes** | A list of edges ids, separated by comma ',' | |

### Return type

`List<Edge>`


## getEdgeTypes

**GET** `/api/edge/types`

Get Edge Types (getEdgeTypes)

Returns a set of unique edge types based on edges that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntitySubtype> getEdgeTypes()
```

### Return type

`List<EntitySubtype>`


## getEdgeUpgradeInstructions

**GET** `/api/edge/instructions/upgrade/{edgeVersion}/{method}`

Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)

Get an upgrade instructions for provided edge version.  Available for users with 'TENANT_ADMIN' authority.

```java
EdgeInstructions getEdgeUpgradeInstructions(GetEdgeUpgradeInstructionsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeUpgradeInstructionsArgs.builder()
        .edgeVersion(String)
        .method(String)
        .build()
```

### `GetEdgeUpgradeInstructionsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeVersion` | `String` | **yes** | Edge version | |
| `method` | `String` | **yes** | Upgrade method ('docker', 'ubuntu' or 'centos') | enum: `docker`, `ubuntu`, `centos` |

### Return type

`EdgeInstructions`


## getEdges

**GET** `/api/edges`

Get Tenant Edges (getEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataEdge getEdges(GetEdgesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEdge`


## getTenantEdgeByName

**GET** `/api/tenant/edge`

Get Tenant Edge by name (getTenantEdgeByName)

Requested edge must be owned by tenant or customer that the user belongs to. Edge name is an unique property of edge. So it can be used to identify the edge.  Available for users with 'TENANT_ADMIN' authority.

```java
Edge getTenantEdgeByName(GetTenantEdgeByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEdgeByNameArgs.builder()
        .edgeName(String)
        .build()
```

### `GetTenantEdgeByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeName` | `String` | **yes** | Unique name of the edge | |

### Return type

`Edge`


## getTenantEdgeInfos

**GET** `/api/tenant/edgeInfos`

Get Tenant Edge Infos (getTenantEdgeInfos)

Returns a page of edges info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Edge Info is an extension of the default Edge object that contains information about the assigned customer name.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataEdgeInfo getTenantEdgeInfos(GetTenantEdgeInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEdgeInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantEdgeInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | A string value representing the edge type. For example, 'default' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEdgeInfo`


## getTenantEdges

**GET** `/api/tenant/edges`

Get Tenant Edges (getTenantEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataEdge getTenantEdges(GetTenantEdgesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEdgesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantEdgesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | A string value representing the edge type. For example, 'default' | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the edge name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `label`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEdge`


## isEdgeUpgradeAvailable

**GET** `/api/edge/{edgeId}/upgrade/available`

Is edge upgrade enabled (isEdgeUpgradeAvailable)

Returns 'true' if upgrade available for connected edge, 'false' - otherwise.

```java
Boolean isEdgeUpgradeAvailable(IsEdgeUpgradeAvailableArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
IsEdgeUpgradeAvailableArgs.builder()
        .edgeId(String)
        .build()
```

### `IsEdgeUpgradeAvailableArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Boolean`


## isEdgesSupportEnabled

**GET** `/api/edges/enabled`

Is edges support enabled (isEdgesSupportEnabled)

Returns 'true' if edges support enabled on server, 'false' - otherwise.

```java
Boolean isEdgesSupportEnabled()
```

### Return type

`Boolean`


## processEdgesBulkImport

**POST** `/api/edge/bulk_import`

Import the bulk of edges (processEdgesBulkImport)

There's an ability to import the bulk of edges using the only .csv file.  Available for users with 'TENANT_ADMIN' authority.

```java
BulkImportResultEdge processEdgesBulkImport(ProcessEdgesBulkImportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ProcessEdgesBulkImportArgs.builder()
        .bulkImportRequest(BulkImportRequest)
        .build()
```

### `ProcessEdgesBulkImportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `bulkImportRequest` | `BulkImportRequest` | **yes** |  | |

### Return type

`BulkImportResultEdge`


## saveEdge

**POST** `/api/edge`

Create Or Update Edge (saveEdge)

Create or update the Edge. When creating edge, platform generates Edge Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created edge id will be present in the response. Specify existing Edge id to update the edge. Referencing non-existing Edge Id will cause 'Not Found' error.  Edge name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the edge names and non-unique 'label' field for user-friendly visualization purposes.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Edge entity.   Available for users with 'TENANT_ADMIN' authority.

```java
Edge saveEdge(SaveEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEdgeArgs.builder()
        .edge(Edge)
        .build()
```

### `SaveEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edge` | `Edge` | **yes** |  | |

### Return type

`Edge`


## setEdgeRootRuleChain

**POST** `/api/edge/{edgeId}/{ruleChainId}/root`

Set root rule chain for provided edge (setEdgeRootRuleChain)

Change root rule chain of the edge to the new provided rule chain.  This operation will send a notification to update root rule chain on remote edge service.  Available for users with 'TENANT_ADMIN' authority.

```java
Edge setEdgeRootRuleChain(SetEdgeRootRuleChainArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetEdgeRootRuleChainArgs.builder()
        .edgeId(String)
        .ruleChainId(String)
        .build()
```

### `SetEdgeRootRuleChainArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `ruleChainId` | `String` | **yes** | A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Edge`


## syncEdge

**POST** `/api/edge/sync/{edgeId}`

Sync edge (syncEdge)

Starts synchronization process between edge and cloud.  All entities that are assigned to particular edge are going to be send to remote edge service.  Available for users with 'TENANT_ADMIN' authority.

```java
String syncEdge(SyncEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SyncEdgeArgs.builder()
        .edgeId(String)
        .build()
```

### `SyncEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`String`


## unassignEdgeFromCustomer

**DELETE** `/api/customer/edge/{edgeId}`

Unassign edge from customer (unassignEdgeFromCustomer)

Clears assignment of the edge to customer. Customer will not be able to query edge afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
Edge unassignEdgeFromCustomer(UnassignEdgeFromCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignEdgeFromCustomerArgs.builder()
        .edgeId(String)
        .build()
```

### `UnassignEdgeFromCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Edge`

