# EntityViewControllerApi

`ThingsboardClient` methods:

```
void deleteEntityView(@Nonnull String entityViewId) // Delete entity view (deleteEntityView)
List<EntityView> findEntityViewsByQuery(@Nonnull EntityViewSearchQuery entityViewSearchQuery) // Find related entity views (findEntityViewsByQuery)
PageDataEntityViewInfo getAllEntityViewInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get All Entity View Infos for current user (getAllEntityViewInfos)
PageDataEntityViewInfo getCustomerEntityViewInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Entity View Infos (getCustomerEntityViewInfos)
PageDataEntityView getCustomerEntityViews(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Entity Views (getCustomerEntityViews)
EntityView getEntityViewById(@Nonnull String entityViewId) // Get entity view (getEntityViewById)
EntityViewInfo getEntityViewInfoById(@Nonnull String entityViewId) // Get entity view info (getEntityViewInfoById)
List<EntitySubtype> getEntityViewTypes() // Get Entity View Types (getEntityViewTypes)
PageDataEntityView getEntityViewsByEntityGroupId(@Nonnull String entityGroupId, @Nonnull String pageSize, @Nonnull String page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get entity views by Entity Group Id (getEntityViewsByEntityGroupId)
List<EntityView> getEntityViewsByIds(@Nonnull List<String> entityViewIds) // Get Entity Views By Ids (getEntityViewsByIds)
EntityView getTenantEntityViewByName(@Nonnull String entityViewName) // Get Entity View by name (getTenantEntityViewByName)
PageDataEntityView getTenantEntityViews(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Entity Views (getTenantEntityViews)
PageDataEntityView getUserEntityViews(@Nonnull String pageSize, @Nonnull String page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Entity Views (getUserEntityViews)
EntityView saveEntityView(@Nonnull EntityView entityView, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds, @Nullable NameConflictPolicy nameConflictPolicy, @Nullable String uniquifySeparator, @Nullable UniquifyStrategy uniquifyStrategy) // Save or update entity view (saveEntityView)
```


## deleteEntityView

```
void deleteEntityView(@Nonnull String entityViewId)
```

**DELETE** `/api/entityView/{entityViewId}`

Delete entity view (deleteEntityView)

Delete the EntityView object based on the provided entity view id.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## findEntityViewsByQuery

```
List<EntityView> findEntityViewsByQuery(@Nonnull EntityViewSearchQuery entityViewSearchQuery)
```

**POST** `/api/entityViews`

Find related entity views (findEntityViewsByQuery)

Returns all entity views that are related to the specific entity. The entity id, relation type, entity view types, depth of the search, and other query parameters defined using complex 'EntityViewSearchQuery' object. See 'Model' tab of the Parameters for more info.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewSearchQuery** | **EntityViewSearchQuery** |  | |

### Return type

**List<EntityView>**


## getAllEntityViewInfos

```
PageDataEntityViewInfo getAllEntityViewInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/entityViewInfos/all`

Get All Entity View Infos for current user (getAllEntityViewInfos)

Returns a page of entity view info objects owned by the tenant or the customer of a current user. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityViewInfo**


## getCustomerEntityViewInfos

```
PageDataEntityViewInfo getCustomerEntityViewInfos(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/entityViewInfos`

Get Customer Entity View Infos (getCustomerEntityViewInfos)

Returns a page of entity view info objects owned by the specified customer. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityViewInfo**


## getCustomerEntityViews

```
PageDataEntityView getCustomerEntityViews(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/entityViews`

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


## getEntityViewById

```
EntityView getEntityViewById(@Nonnull String entityViewId)
```

**GET** `/api/entityView/{entityViewId}`

Get entity view (getEntityViewById)

Fetch the EntityView object based on the provided entity view id. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityView**


## getEntityViewInfoById

```
EntityViewInfo getEntityViewInfoById(@Nonnull String entityViewId)
```

**GET** `/api/entityView/info/{entityViewId}`

Get entity view info (getEntityViewInfoById)

Fetch the Entity View info object based on the provided entity view id. Entity Views Info extends the Entity View with owner name. Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewId** | **String** | A string value representing the entity view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityViewInfo**


## getEntityViewTypes

```
List<EntitySubtype> getEntityViewTypes()
```

**GET** `/api/entityView/types`

Get Entity View Types (getEntityViewTypes)

Returns a set of unique entity view types based on entity views that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**List<EntitySubtype>**


## getEntityViewsByEntityGroupId

```
PageDataEntityView getEntityViewsByEntityGroupId(@Nonnull String entityGroupId, @Nonnull String pageSize, @Nonnull String page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/entityGroup/{entityGroupId}/entityViews`

Get entity views by Entity Group Id (getEntityViewsByEntityGroupId)

Returns a page of Entity View objects that belongs to specified Entity View Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityView**


## getEntityViewsByIds

```
List<EntityView> getEntityViewsByIds(@Nonnull List<String> entityViewIds)
```

**GET** `/api/entityViews/list`

Get Entity Views By Ids (getEntityViewsByIds)

Requested entity views must be owned by tenant or assigned to customer which user is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewIds** | **List<String>** | A list of entity view ids, separated by comma ',' | |

### Return type

**List<EntityView>**


## getTenantEntityViewByName

```
EntityView getTenantEntityViewByName(@Nonnull String entityViewName)
```

**GET** `/api/tenant/entityView`

Get Entity View by name (getTenantEntityViewByName)

Fetch the Entity View object based on the tenant id and entity view name.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityViewName** | **String** | Entity View name | |

### Return type

**EntityView**


## getTenantEntityViews

```
PageDataEntityView getTenantEntityViews(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/entityViews`

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


## getUserEntityViews

```
PageDataEntityView getUserEntityViews(@Nonnull String pageSize, @Nonnull String page, @Nullable String type, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/user/entityViews`

Get Entity Views (getUserEntityViews)

Returns a page of entity views that are available for the current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **type** | **String** |   ## Entity View Filter  Allows to filter entity views based on their type and the **'starts with'** expression over their name. For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':  ```json {   \"type\": \"entityViewType\",   \"entityViewType\": \"Concrete Mixer\",   \"entityViewNameFilter\": \"CAT\" } ``` | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity view name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityView**


## saveEntityView

```
EntityView saveEntityView(@Nonnull EntityView entityView, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds, @Nullable NameConflictPolicy nameConflictPolicy, @Nullable String uniquifySeparator, @Nullable UniquifyStrategy uniquifyStrategy)
```

**POST** `/api/entityView`

Save or update entity view (saveEntityView)

Entity Views limit the degree of exposure of the Device or Asset telemetry and attributes to the Customers. Every Entity View references exactly one entity (device or asset) and defines telemetry and attribute keys that will be visible to the assigned Customer. As a Tenant Administrator you are able to create multiple EVs per Device or Asset and assign them to different Customers. See the 'Model' tab for more details.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Entity View entity.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityView** | **EntityView** |  | |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List<String>** | A list of entity group ids, separated by comma ',' | [optional] |
| **nameConflictPolicy** | **NameConflictPolicy** | Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String** | Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is '-'; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-7fsh4f'. | [optional] [default to _] |
| **uniquifyStrategy** | **UniquifyStrategy** | Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name 'test-name', created entity will have name like 'test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

**EntityView**

