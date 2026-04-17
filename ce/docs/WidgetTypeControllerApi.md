# WidgetTypeControllerApi

`ThingsboardClient` methods:

```
void deleteWidgetType(@Nonnull String widgetTypeId) // Delete widget type (deleteWidgetType)
List<String> getBundleWidgetTypeFqns(@Nonnull String widgetsBundleId) // Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns)
List<WidgetType> getBundleWidgetTypes(@Nonnull String widgetsBundleId) // Get all Widget types for specified Bundle (getBundleWidgetTypes)
List<WidgetTypeDetails> getBundleWidgetTypesDetails(@Nonnull String widgetsBundleId, @Nullable Boolean includeResources) // Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails)
PageDataWidgetTypeInfo getBundleWidgetTypesInfos(@Nonnull String widgetsBundleId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Boolean fullSearch, @Nullable String deprecatedFilter, @Nullable List<String> widgetTypeList) // Get Widget Type Info objects (getBundleWidgetTypesInfos)
WidgetType getWidgetType(@Nonnull String fqn) // Get Widget Type (getWidgetType)
WidgetTypeDetails getWidgetTypeById(@Nonnull String widgetTypeId, @Nullable Boolean includeResources) // Get Widget Type Details (getWidgetTypeById)
WidgetTypeInfo getWidgetTypeInfoById(@Nonnull String widgetTypeId) // Get Widget Type Info (getWidgetTypeInfoById)
PageDataWidgetTypeInfo getWidgetTypes(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Boolean tenantOnly, @Nullable Boolean fullSearch, @Nullable String deprecatedFilter, @Nullable List<String> widgetTypeList, @Nullable Boolean scadaFirst) // Get Widget Types (getWidgetTypes)
WidgetTypeDetails saveWidgetType(@Nonnull WidgetTypeDetails widgetTypeDetails, @Nullable Boolean updateExistingByFqn) // Create Or Update Widget Type (saveWidgetType)
```


## deleteWidgetType

```
void deleteWidgetType(@Nonnull String widgetTypeId)
```

**DELETE** `/api/widgetType/{widgetTypeId}`

Delete widget type (deleteWidgetType)

Deletes the  Widget Type. Referencing non-existing Widget Type Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getBundleWidgetTypeFqns

```
List<String> getBundleWidgetTypeFqns(@Nonnull String widgetsBundleId)
```

**GET** `/api/widgetTypeFqns`

Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns)

Returns an array of Widget Type fqns that belong to specified Widget Bundle.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | Widget Bundle Id | |

### Return type

**List<String>**


## getBundleWidgetTypes

```
List<WidgetType> getBundleWidgetTypes(@Nonnull String widgetsBundleId)
```

**GET** `/api/widgetsBundles/{widgetsBundleId}/widgetTypes`

Get all Widget types for specified Bundle (getBundleWidgetTypes)

Returns an array of Widget Type objects that belong to specified Widget Bundle.Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | Widget Bundle Id | |

### Return type

**List<WidgetType>**


## getBundleWidgetTypesDetails

```
List<WidgetTypeDetails> getBundleWidgetTypesDetails(@Nonnull String widgetsBundleId, @Nullable Boolean includeResources)
```

**GET** `/api/widgetTypesDetails`

Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails)

Returns an array of Widget Type Details objects that belong to specified Widget Bundle.Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.    Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | Widget Bundle Id | |
| **includeResources** | **Boolean** | Export used resources and replace resource links with resource metadata | [optional] |

### Return type

**List<WidgetTypeDetails>**


## getBundleWidgetTypesInfos

```
PageDataWidgetTypeInfo getBundleWidgetTypesInfos(@Nonnull String widgetsBundleId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Boolean fullSearch, @Nullable String deprecatedFilter, @Nullable List<String> widgetTypeList)
```

**GET** `/api/widgetTypesInfos`

Get Widget Type Info objects (getBundleWidgetTypesInfos)

Get the Widget Type Info objects based on the provided parameters. Widget Type Info is a lightweight object that represents Widget Type but does not contain the heavyweight widget descriptor JSON  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | Widget Bundle Id | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the widget type name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, deprecated, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **fullSearch** | **Boolean** | Optional boolean parameter indicating whether search widgets by description not only by name | [optional] |
| **deprecatedFilter** | **String** | Optional string parameter indicating whether to include deprecated widgets | [optional] [enum: ALL, ACTUAL, DEPRECATED] |
| **widgetTypeList** | **List<String>** | A list of string values separated by comma ',' representing one of the widget type value | [optional] [enum: timeseries, latest, control, alarm, static] |

### Return type

**PageDataWidgetTypeInfo**


## getWidgetType

```
WidgetType getWidgetType(@Nonnull String fqn)
```

**GET** `/api/widgetType`

Get Widget Type (getWidgetType)

Get the Widget Type by FQN. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.  Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fqn** | **String** | Widget Type fqn | |

### Return type

**WidgetType**


## getWidgetTypeById

```
WidgetTypeDetails getWidgetTypeById(@Nonnull String widgetTypeId, @Nullable Boolean includeResources)
```

**GET** `/api/widgetType/{widgetTypeId}`

Get Widget Type Details (getWidgetTypeById)

Get the Widget Type Details based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **includeResources** | **Boolean** | Export used resources and replace resource links with resource metadata | [optional] |

### Return type

**WidgetTypeDetails**


## getWidgetTypeInfoById

```
WidgetTypeInfo getWidgetTypeInfoById(@Nonnull String widgetTypeId)
```

**GET** `/api/widgetTypeInfo/{widgetTypeId}`

Get Widget Type Info (getWidgetTypeInfoById)

Get the Widget Type Info based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeId** | **String** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**WidgetTypeInfo**


## getWidgetTypes

```
PageDataWidgetTypeInfo getWidgetTypes(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable Boolean tenantOnly, @Nullable Boolean fullSearch, @Nullable String deprecatedFilter, @Nullable List<String> widgetTypeList, @Nullable Boolean scadaFirst)
```

**GET** `/api/widgetTypes`

Get Widget Types (getWidgetTypes)

Returns a page of Widget Type objects available for current user. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the widget type name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, deprecated, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **tenantOnly** | **Boolean** | Optional boolean parameter indicating whether only tenant widget types should be returned | [optional] |
| **fullSearch** | **Boolean** | Optional boolean parameter indicating whether search widgets by description not only by name | [optional] |
| **deprecatedFilter** | **String** | Optional string parameter indicating whether to include deprecated widgets | [optional] [enum: ALL, ACTUAL, DEPRECATED] |
| **widgetTypeList** | **List<String>** | A list of string values separated by comma ',' representing one of the widget type value | [optional] [enum: timeseries, latest, control, alarm, static] |
| **scadaFirst** | **Boolean** | Optional boolean parameter indicating whether to fetch SCADA symbol widgets first | [optional] |

### Return type

**PageDataWidgetTypeInfo**


## saveWidgetType

```
WidgetTypeDetails saveWidgetType(@Nonnull WidgetTypeDetails widgetTypeDetails, @Nullable Boolean updateExistingByFqn)
```

**POST** `/api/widgetType`

Create Or Update Widget Type (saveWidgetType)

Create or update the Widget Type. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. When creating the Widget Type, platform generates Widget Type Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Type Id will be present in the response. Specify existing Widget Type id to update the Widget Type. Referencing non-existing Widget Type Id will cause 'Not Found' error.  Widget Type fqn is unique in the scope of System or Tenant. Special Tenant Id '13814000-1dd2-11b2-8080-808080808080' is automatically used if the create request is sent by user with 'SYS_ADMIN' authority.Remove 'id', 'tenantId' rom the request body example (below) to create new Widget Type entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetTypeDetails** | **WidgetTypeDetails** |  | |
| **updateExistingByFqn** | **Boolean** | Optional boolean parameter indicating whether to update existing widget type by FQN if present instead of creating new one | [optional] |

### Return type

**WidgetTypeDetails**

