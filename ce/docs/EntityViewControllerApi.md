# EntityViewControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
EntityView assignEntityViewToCustomer(AssignEntityViewToCustomerArgs args) // Assign Entity View to customer (assignEntityViewToCustomer)
EntityView assignEntityViewToEdge(AssignEntityViewToEdgeArgs args) // Assign entity view to edge (assignEntityViewToEdge)
EntityView assignEntityViewToPublicCustomer(AssignEntityViewToPublicCustomerArgs args) // Make entity view publicly available (assignEntityViewToPublicCustomer)
void deleteEntityView(DeleteEntityViewArgs args) // Delete entity view (deleteEntityView)
List<EntityView> findEntityViewsByQuery(FindEntityViewsByQueryArgs args) // Find related entity views (findEntityViewsByQuery)
PageDataEntityViewInfo getCustomerEntityViewInfos(GetCustomerEntityViewInfosArgs args) // Get Customer Entity View info (getCustomerEntityViewInfos)
PageDataEntityView getCustomerEntityViews(GetCustomerEntityViewsArgs args) // Get Customer Entity Views (getCustomerEntityViews)
PageDataEntityView getEdgeEntityViews(GetEdgeEntityViewsArgs args) // getEdgeEntityViews
EntityView getEntityViewById(GetEntityViewByIdArgs args) // Get entity view (getEntityViewById)
EntityViewInfo getEntityViewInfoById(GetEntityViewInfoByIdArgs args) // Get Entity View info (getEntityViewInfoById)
List<EntitySubtype> getEntityViewTypes() // Get Entity View Types (getEntityViewTypes)
List<EntityView> getEntityViewsByIds(GetEntityViewsByIdsArgs args) // Get Entity Views By Ids (getEntityViewsByIds)
EntityView getTenantEntityViewByName(GetTenantEntityViewByNameArgs args) // Get Entity View by name (getTenantEntityViewByName)
PageDataEntityViewInfo getTenantEntityViewInfos(GetTenantEntityViewInfosArgs args) // Get Tenant Entity Views (getTenantEntityViews)
PageDataEntityView getTenantEntityViews(GetTenantEntityViewsArgs args) // Get Tenant Entity Views (getTenantEntityViews)
EntityView saveEntityView(SaveEntityViewArgs args) // Save or update entity view (saveEntityView)
EntityView unassignEntityViewFromCustomer(UnassignEntityViewFromCustomerArgs args) // Unassign Entity View from customer (unassignEntityViewFromCustomer)
EntityView unassignEntityViewFromEdge(UnassignEntityViewFromEdgeArgs args) // Unassign entity view from edge (unassignEntityViewFromEdge)
```


## assignEntityViewToCustomer

**POST** `/api/customer/{customerId}/entityView/{entityViewId}`

Assign Entity View to customer (assignEntityViewToCustomer)

Creates assignment of the Entity View to customer. Customer will be able to query Entity View afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
EntityView assignEntityViewToCustomer(AssignEntityViewToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEntityViewToCustomerArgs.builder()
        .customerId(String)
        .entityViewId(String)
        .build()
```

### `AssignEntityViewToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityView`


## assignEntityViewToEdge

**POST** `/api/edge/{edgeId}/entityView/{entityViewId}`

Assign entity view to edge (assignEntityViewToEdge)

Creates assignment of an existing entity view to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment entity view (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once entity view will be delivered to edge service, it's going to be available for usage on remote edge instance.

```java
EntityView assignEntityViewToEdge(AssignEntityViewToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEntityViewToEdgeArgs.builder()
        .edgeId(String)
        .entityViewId(String)
        .build()
```

### `AssignEntityViewToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `entityViewId` | `String` | **yes** |  | |

### Return type

`EntityView`


## assignEntityViewToPublicCustomer

**POST** `/api/customer/public/entityView/{entityViewId}`

Make entity view publicly available (assignEntityViewToPublicCustomer)

Entity View will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the entity view.  Available for users with 'TENANT_ADMIN' authority.

```java
EntityView assignEntityViewToPublicCustomer(AssignEntityViewToPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEntityViewToPublicCustomerArgs.builder()
        .entityViewId(String)
        .build()
```

### `AssignEntityViewToPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityView`


## deleteEntityView

**DELETE** `/api/entityView/{entityViewId}`

Delete entity view (deleteEntityView)

Delete the EntityView object based on the provided entity view id.   Available for users with 'TENANT_ADMIN' authority.

```java
void deleteEntityView(DeleteEntityViewArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteEntityViewArgs.builder()
        .entityViewId(String)
        .build()
```

### `DeleteEntityViewArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEntityViewsByQuery

**POST** `/api/entityViews`

Find related entity views (findEntityViewsByQuery)

Returns all entity views that are related to the specific entity. The entity id, relation type, entity view types, depth of the search, and other query parameters defined using complex 'EntityViewSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntityView> findEntityViewsByQuery(FindEntityViewsByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityViewsByQueryArgs.builder()
        .entityViewSearchQuery(EntityViewSearchQuery)
        .build()
```

### `FindEntityViewsByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewSearchQuery` | `EntityViewSearchQuery` | **yes** |  | |

### Return type

`List<EntityView>`


## getCustomerEntityViewInfos

**GET** `/api/customer/{customerId}/entityViewInfos`

Get Customer Entity View info (getCustomerEntityViewInfos)

Returns a page of Entity View info objects assigned to customer. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataEntityViewInfo getCustomerEntityViewInfos(GetCustomerEntityViewInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerEntityViewInfosArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerEntityViewInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the entity view name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityViewInfo`


## getCustomerEntityViews

**GET** `/api/customer/{customerId}/entityViews`

Get Customer Entity Views (getCustomerEntityViews)

Returns a page of Entity View objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataEntityView getCustomerEntityViews(GetCustomerEntityViewsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerEntityViewsArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerEntityViewsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the entity view name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityView`


## getEdgeEntityViews

**GET** `/api/edge/{edgeId}/entityViews`

getEdgeEntityViews

```java
PageDataEntityView getEdgeEntityViews(GetEdgeEntityViewsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeEntityViewsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeEntityViewsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `pageSize` | `Integer` | **yes** |  | |
| `page` | `Integer` | **yes** |  | |
| `type` | `String` | no |  | |
| `textSearch` | `String` | no |  | |
| `sortProperty` | `String` | no |  | |
| `sortOrder` | `String` | no |  | |
| `startTime` | `Long` | no |  | |
| `endTime` | `Long` | no |  | |

### Return type

`PageDataEntityView`


## getEntityViewById

**GET** `/api/entityView/{entityViewId}`

Get entity view (getEntityViewById)

Fetch the EntityView object based on the provided entity view id. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
EntityView getEntityViewById(GetEntityViewByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityViewByIdArgs.builder()
        .entityViewId(String)
        .build()
```

### `GetEntityViewByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityView`


## getEntityViewInfoById

**GET** `/api/entityView/info/{entityViewId}`

Get Entity View info (getEntityViewInfoById)

Fetch the Entity View info object based on the provided Entity View Id. Entity Views Info extends the Entity View with customer title and 'is public' flag. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
EntityViewInfo getEntityViewInfoById(GetEntityViewInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityViewInfoByIdArgs.builder()
        .entityViewId(String)
        .build()
```

### `GetEntityViewInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityViewInfo`


## getEntityViewTypes

**GET** `/api/entityView/types`

Get Entity View Types (getEntityViewTypes)

Returns a set of unique entity view types based on entity views that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<EntitySubtype> getEntityViewTypes()
```

### Return type

`List<EntitySubtype>`


## getEntityViewsByIds

**GET** `/api/entityViews/list`

Get Entity Views By Ids (getEntityViewsByIds)

Requested entity views must be owned by tenant or assigned to customer which user is performing the request. 

```java
List<EntityView> getEntityViewsByIds(GetEntityViewsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityViewsByIdsArgs.builder()
        .entityViewIds(List<String>)
        .build()
```

### `GetEntityViewsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewIds` | `List<String>` | **yes** | A list of entity view ids, separated by comma ',' | |

### Return type

`List<EntityView>`


## getTenantEntityViewByName

**GET** `/api/tenant/entityView`

Get Entity View by name (getTenantEntityViewByName)

Fetch the Entity View object based on the tenant id and entity view name.   Available for users with 'TENANT_ADMIN' authority.

```java
EntityView getTenantEntityViewByName(GetTenantEntityViewByNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEntityViewByNameArgs.builder()
        .entityViewName(String)
        .build()
```

### `GetTenantEntityViewByNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewName` | `String` | **yes** | Entity View name | |

### Return type

`EntityView`


## getTenantEntityViewInfos

**GET** `/api/tenant/entityViewInfos`

Get Tenant Entity Views (getTenantEntityViews)

Returns a page of entity views info owned by tenant. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataEntityViewInfo getTenantEntityViewInfos(GetTenantEntityViewInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEntityViewInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantEntityViewInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the entity view name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityViewInfo`


## getTenantEntityViews

**GET** `/api/tenant/entityViews`

Get Tenant Entity Views (getTenantEntityViews)

Returns a page of entity views owned by tenant. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataEntityView getTenantEntityViews(GetTenantEntityViewsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantEntityViewsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantEntityViewsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the entity view name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityView`


## saveEntityView

**POST** `/api/entityView`

Save or update entity view (saveEntityView)

Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Entity View entity.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
EntityView saveEntityView(SaveEntityViewArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityViewArgs.builder()
        .entityView(EntityView)
        .build()
```

### `SaveEntityViewArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityView` | `EntityView` | **yes** |  | |
| `nameConflictPolicy` | `NameConflictPolicy` | no | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | default: `FAIL` enum: `FAIL`, `UNIQUIFY` |
| `uniquifySeparator` | `String` | no | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | default: `_` |
| `uniquifyStrategy` | `UniquifyStrategy` | no | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | default: `RANDOM` enum: `RANDOM`, `INCREMENTAL` |

### Return type

`EntityView`


## unassignEntityViewFromCustomer

**DELETE** `/api/customer/entityView/{entityViewId}`

Unassign Entity View from customer (unassignEntityViewFromCustomer)

Clears assignment of the Entity View to customer. Customer will not be able to query Entity View afterwards.  Available for users with 'TENANT_ADMIN' authority.

```java
EntityView unassignEntityViewFromCustomer(UnassignEntityViewFromCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignEntityViewFromCustomerArgs.builder()
        .entityViewId(String)
        .build()
```

### `UnassignEntityViewFromCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityViewId` | `String` | **yes** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityView`


## unassignEntityViewFromEdge

**DELETE** `/api/edge/{edgeId}/entityView/{entityViewId}`

Unassign entity view from edge (unassignEntityViewFromEdge)

Clears assignment of the entity view to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity view (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity view locally.

```java
EntityView unassignEntityViewFromEdge(UnassignEntityViewFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignEntityViewFromEdgeArgs.builder()
        .edgeId(String)
        .entityViewId(String)
        .build()
```

### `UnassignEntityViewFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `entityViewId` | `String` | **yes** |  | |

### Return type

`EntityView`

