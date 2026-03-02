# EntityViewControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignEntityViewToCustomer**](#assignEntityViewToCustomer) | **POST** /api/customer/{customerId}/entityView/{entityViewId} | Assign Entity View to customer (assignEntityViewToCustomer) |
| [**assignEntityViewToEdge**](#assignEntityViewToEdge) | **POST** /api/edge/{edgeId}/entityView/{entityViewId} | Assign entity view to edge (assignEntityViewToEdge) |
| [**assignEntityViewToPublicCustomer**](#assignEntityViewToPublicCustomer) | **POST** /api/customer/public/entityView/{entityViewId} | Make entity view publicly available (assignEntityViewToPublicCustomer) |
| [**deleteEntityView**](#deleteEntityView) | **DELETE** /api/entityView/{entityViewId} | Delete entity view (deleteEntityView) |
| [**findEntityViewsByQuery**](#findEntityViewsByQuery) | **POST** /api/entityViews | Find related entity views (findEntityViewsByQuery) |
| [**getCustomerEntityViewInfos**](#getCustomerEntityViewInfos) | **GET** /api/customer/{customerId}/entityViewInfos | Get Customer Entity View info (getCustomerEntityViewInfos) |
| [**getCustomerEntityViews**](#getCustomerEntityViews) | **GET** /api/customer/{customerId}/entityViews | Get Customer Entity Views (getCustomerEntityViews) |
| [**getEdgeEntityViews**](#getEdgeEntityViews) | **GET** /api/edge/{edgeId}/entityViews | getEdgeEntityViews |
| [**getEntityViewById**](#getEntityViewById) | **GET** /api/entityView/{entityViewId} | Get entity view (getEntityViewById) |
| [**getEntityViewInfoById**](#getEntityViewInfoById) | **GET** /api/entityView/info/{entityViewId} | Get Entity View info (getEntityViewInfoById) |
| [**getEntityViewTypes**](#getEntityViewTypes) | **GET** /api/entityView/types | Get Entity View Types (getEntityViewTypes) |
| [**getEntityViewsByIdsV2**](#getEntityViewsByIdsV2) | **GET** /api/entityViews/list | Get Entity Views By Ids (getEntityViewsByIdsV2) |
| [**getTenantEntityViewByName**](#getTenantEntityViewByName) | **GET** /api/tenant/entityView | Get Entity View by name (getTenantEntityViewByName) |
| [**getTenantEntityViewInfos**](#getTenantEntityViewInfos) | **GET** /api/tenant/entityViewInfos | Get Tenant Entity Views (getTenantEntityViews) |
| [**getTenantEntityViews**](#getTenantEntityViews) | **GET** /api/tenant/entityViews | Get Tenant Entity Views (getTenantEntityViews) |
| [**saveEntityView**](#saveEntityView) | **POST** /api/entityView | Save or update entity view (saveEntityView) |
| [**unassignEntityViewFromCustomer**](#unassignEntityViewFromCustomer) | **DELETE** /api/customer/entityView/{entityViewId} | Unassign Entity View from customer (unassignEntityViewFromCustomer) |
| [**unassignEntityViewFromEdge**](#unassignEntityViewFromEdge) | **DELETE** /api/edge/{edgeId}/entityView/{entityViewId} | Unassign entity view from edge (unassignEntityViewFromEdge) |



## assignEntityViewToCustomer

> EntityView assignEntityViewToCustomer(customerId, entityViewId)

Assign Entity View to customer (assignEntityViewToCustomer)

Creates assignment of the Entity View to customer. Customer will be able to query Entity View afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityView**


## assignEntityViewToEdge

> EntityView assignEntityViewToEdge(edgeId, entityViewId)

Assign entity view to edge (assignEntityViewToEdge)

Creates assignment of an existing entity view to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment entity view (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once entity view will be delivered to edge service, it's going to be available for usage on remote edge instance.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **entityViewId** | **String** |  | |

### Return type

**EntityView**


## assignEntityViewToPublicCustomer

> EntityView assignEntityViewToPublicCustomer(entityViewId)

Make entity view publicly available (assignEntityViewToPublicCustomer)

Entity View will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the entity view.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityView**


## deleteEntityView

> deleteEntityView(entityViewId)

Delete entity view (deleteEntityView)

Delete the EntityView object based on the provided entity view id.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEntityViewsByQuery

> List<EntityView> findEntityViewsByQuery(entityViewSearchQuery)

Find related entity views (findEntityViewsByQuery)

Returns all entity views that are related to the specific entity. The entity id, relation type, entity view types, depth of the search, and other query parameters defined using complex 'EntityViewSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewSearchQuery** | **EntityViewSearchQuery** |  | |

### Return type

**List<EntityView>**


## getCustomerEntityViewInfos

> PageDataEntityViewInfo getCustomerEntityViewInfos(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Entity View info (getCustomerEntityViewInfos)

Returns a page of Entity View info objects assigned to customer. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityViewInfo**


## getCustomerEntityViews

> PageDataEntityView getCustomerEntityViews(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Entity Views (getCustomerEntityViews)

Returns a page of Entity View objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityView**


## getEdgeEntityViews

> PageDataEntityView getEdgeEntityViews(edgeId, pageSize, page, type, textSearch, sortProperty, sortOrder, startTime, endTime)

getEdgeEntityViews


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **pageSize** | **Integer** |  | |
| **page** | **Integer** |  | |
| **type** | **String** |  | [optional] |
| **textSearch** | **String** |  | [optional] |
| **sortProperty** | **String** |  | [optional] |
| **sortOrder** | **String** |  | [optional] |
| **startTime** | **Long** |  | [optional] |
| **endTime** | **Long** |  | [optional] |

### Return type

**PageDataEntityView**


## getEntityViewById

> EntityView getEntityViewById(entityViewId)

Get entity view (getEntityViewById)

Fetch the EntityView object based on the provided entity view id. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityView**


## getEntityViewInfoById

> EntityViewInfo getEntityViewInfoById(entityViewId)

Get Entity View info (getEntityViewInfoById)

Fetch the Entity View info object based on the provided Entity View Id. Entity Views Info extends the Entity View with customer title and 'is public' flag. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityViewInfo**


## getEntityViewTypes

> List<EntitySubtype> getEntityViewTypes()

Get Entity View Types (getEntityViewTypes)

Returns a set of unique entity view types based on entity views that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**List<EntitySubtype>**


## getEntityViewsByIdsV2

> List<EntityView> getEntityViewsByIdsV2(entityViewIds)

Get Entity Views By Ids (getEntityViewsByIdsV2)

Requested entity views must be owned by tenant or assigned to customer which user is performing the request. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewIds** | **List<String>** | A list of entity view ids, separated by comma ',' | |

### Return type

**List<EntityView>**


## getTenantEntityViewByName

> EntityView getTenantEntityViewByName(entityViewName)

Get Entity View by name (getTenantEntityViewByName)

Fetch the Entity View object based on the tenant id and entity view name.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewName** | **String** | Entity View name | |

### Return type

**EntityView**


## getTenantEntityViewInfos

> PageDataEntityViewInfo getTenantEntityViewInfos(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Entity Views (getTenantEntityViews)

Returns a page of entity views info owned by tenant. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, customerTitle] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityViewInfo**


## getTenantEntityViews

> PageDataEntityView getTenantEntityViews(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Entity Views (getTenantEntityViews)

Returns a page of entity views owned by tenant. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityView**


## saveEntityView

> EntityView saveEntityView(entityView, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Save or update entity view (saveEntityView)

Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Entity View entity.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityView** | **EntityView** |  | |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

**EntityView**


## unassignEntityViewFromCustomer

> EntityView unassignEntityViewFromCustomer(entityViewId)

Unassign Entity View from customer (unassignEntityViewFromCustomer)

Clears assignment of the Entity View to customer. Customer will not be able to query Entity View afterwards.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityView**


## unassignEntityViewFromEdge

> EntityView unassignEntityViewFromEdge(edgeId, entityViewId)

Unassign entity view from edge (unassignEntityViewFromEdge)

Clears assignment of the entity view to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity view (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity view locally.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **entityViewId** | **String** |  | |

### Return type

**EntityView**

