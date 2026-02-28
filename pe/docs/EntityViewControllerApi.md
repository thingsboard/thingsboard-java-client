# EntityViewControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEntityView**](#deleteEntityView) | **DELETE** /api/entityView/{entityViewId} | Delete entity view (deleteEntityView) |
| [**findByQuery1**](#findByQuery1) | **POST** /api/entityViews | Find related entity views (findByQuery) |
| [**getAllEntityViewInfos**](#getAllEntityViewInfos) | **GET** /api/entityViewInfos/all | Get All Entity View Infos for current user (getAllEntityViewInfos) |
| [**getCustomerEntityViewInfos**](#getCustomerEntityViewInfos) | **GET** /api/customer/{customerId}/entityViewInfos | Get Customer Entity View Infos (getCustomerEntityViewInfos) |
| [**getCustomerEntityViews**](#getCustomerEntityViews) | **GET** /api/customer/{customerId}/entityViews | Get Customer Entity Views (getCustomerEntityViews) |
| [**getEntityViewById**](#getEntityViewById) | **GET** /api/entityView/{entityViewId} | Get entity view (getEntityViewById) |
| [**getEntityViewInfoById**](#getEntityViewInfoById) | **GET** /api/entityView/info/{entityViewId} | Get entity view info (getEntityViewInfoById) |
| [**getEntityViewTypes**](#getEntityViewTypes) | **GET** /api/entityView/types | Get Entity View Types (getEntityViewTypes) |
| [**getEntityViewsByEntityGroupId**](#getEntityViewsByEntityGroupId) | **GET** /api/entityGroup/{entityGroupId}/entityViews | Get entity views by Entity Group Id (getEntityViewsByEntityGroupId) |
| [**getEntityViewsByIdsV2**](#getEntityViewsByIdsV2) | **GET** /api/entityViews/list | Get Entity Views By Ids (getEntityViewsByIds) |
| [**getTenantEntityViewByName**](#getTenantEntityViewByName) | **GET** /api/tenant/entityView | Get Entity View by name (getTenantEntityViewByName) |
| [**getTenantEntityViews**](#getTenantEntityViews) | **GET** /api/tenant/entityViews | Get Tenant Entity Views (getTenantEntityViews) |
| [**getUserEntityViews**](#getUserEntityViews) | **GET** /api/user/entityViews | Get Entity Views (getUserEntityViews) |
| [**saveEntityView**](#saveEntityView) | **POST** /api/entityView | Save or update entity view (saveEntityView) |



## deleteEntityView

> deleteEntityView(entityViewId)

Delete entity view (deleteEntityView)

Delete the EntityView object based on the provided entity view id.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## findByQuery1

> List&lt;EntityView&gt; findByQuery1(entityViewSearchQuery)

Find related entity views (findByQuery)

Returns all entity views that are related to the specific entity. The entity id, relation type, entity view types, depth of the search, and other query parameters defined using complex &#39;EntityViewSearchQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewSearchQuery** | **EntityViewSearchQuery** |  | |


## getAllEntityViewInfos

> PageDataEntityViewInfo getAllEntityViewInfos(pageSize, page, includeCustomers, type, textSearch, sortProperty, sortOrder)

Get All Entity View Infos for current user (getAllEntityViewInfos)

Returns a page of entity view info objects owned by the tenant or the customer of a current user. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getCustomerEntityViewInfos

> PageDataEntityViewInfo getCustomerEntityViewInfos(customerId, pageSize, page, includeCustomers, type, textSearch, sortProperty, sortOrder)

Get Customer Entity View Infos (getCustomerEntityViewInfos)

Returns a page of entity view info objects owned by the specified customer. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getCustomerEntityViews

> PageDataEntityView getCustomerEntityViews(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Entity Views (getCustomerEntityViews)

Returns a page of Entity View objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getEntityViewById

> EntityView getEntityViewById(entityViewId)

Get entity view (getEntityViewById)

Fetch the EntityView object based on the provided entity view id. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the &#39;Model&#39; tab for more details.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getEntityViewInfoById

> EntityViewInfo getEntityViewInfoById(entityViewId)

Get entity view info (getEntityViewInfoById)

Fetch the Entity View info object based on the provided entity view id. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the &#39;Model&#39; tab for more details.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getEntityViewTypes

> List&lt;EntitySubtype&gt; getEntityViewTypes()

Get Entity View Types (getEntityViewTypes)

Returns a set of unique entity view types based on entity views that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

## getEntityViewsByEntityGroupId

> PageDataEntityView getEntityViewsByEntityGroupId(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get entity views by Entity Group Id (getEntityViewsByEntityGroupId)

Returns a page of Entity View objects that belongs to specified Entity View Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getEntityViewsByIdsV2

> List&lt;EntityView&gt; getEntityViewsByIdsV2(entityViewIds)

Get Entity Views By Ids (getEntityViewsByIds)

Requested entity views must be owned by tenant or assigned to customer which user is performing the request.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewIds** | **List&lt;String&gt;** | A list of entity view ids, separated by comma &#39;,&#39; | |


## getTenantEntityViewByName

> EntityView getTenantEntityViewByName(entityViewName)

Get Entity View by name (getTenantEntityViewByName)

Fetch the Entity View object based on the tenant id and entity view name.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewName** | **String** | Entity View name | |


## getTenantEntityViews

> PageDataEntityView getTenantEntityViews(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Entity Views (getTenantEntityViews)

Returns a page of entity views owned by tenant. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getUserEntityViews

> PageDataEntityView getUserEntityViews(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Entity Views (getUserEntityViews)

Returns a page of entity views that are available for the current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **&#39;starts with&#39;** expression over their name. For example, this entity filter selects all &#39;Concrete Mixer&#39; entity views which name starts with &#39;CAT&#39;:  &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;entityViewType\&quot;,   \&quot;entityViewType\&quot;: \&quot;Concrete Mixer\&quot;,   \&quot;entityViewNameFilter\&quot;: \&quot;CAT\&quot; } &#x60;&#x60;&#x60; | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## saveEntityView

> EntityView saveEntityView(entityView, entityGroupId, entityGroupIds, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Save or update entity view (saveEntityView)

Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the &#39;Model&#39; tab for more details.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Entity View entity.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityView** | **EntityView** |  | |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List&lt;String&gt;** | A list of entity group ids, separated by comma &#39;,&#39; | [optional] |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is &#39;-&#39;; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-7fsh4f&#39;. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

