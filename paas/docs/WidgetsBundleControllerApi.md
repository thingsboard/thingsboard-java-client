# WidgetsBundleControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWidgetsBundle**](#deleteWidgetsBundle) | **DELETE** /api/widgetsBundle/{widgetsBundleId} | Delete widgets bundle (deleteWidgetsBundle) |
| [**getAllWidgetsBundles**](#getAllWidgetsBundles) | **GET** /api/widgetsBundles/all | Get all Widget Bundles (getAllWidgetsBundles) |
| [**getWidgetsBundleById**](#getWidgetsBundleById) | **GET** /api/widgetsBundle/{widgetsBundleId} | Get Widget Bundle (getWidgetsBundleById) |
| [**getWidgetsBundles**](#getWidgetsBundles) | **GET** /api/widgetsBundles | Get Widget Bundles (getWidgetsBundles) |
| [**getWidgetsBundlesList**](#getWidgetsBundlesList) | **GET** /api/widgetsBundles/list | Get Widgets Bundles By Ids (getWidgetsBundlesList) |
| [**saveWidgetsBundle**](#saveWidgetsBundle) | **POST** /api/widgetsBundle | Create Or Update Widget Bundle (saveWidgetsBundle) |
| [**updateWidgetsBundleWidgetFqns**](#updateWidgetsBundleWidgetFqns) | **POST** /api/widgetsBundle/{widgetsBundleId}/widgetTypeFqns | Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns) |
| [**updateWidgetsBundleWidgetTypes**](#updateWidgetsBundleWidgetTypes) | **POST** /api/widgetsBundle/{widgetsBundleId}/widgetTypes | Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes) |



## deleteWidgetsBundle

> deleteWidgetsBundle(widgetsBundleId)

Delete widgets bundle (deleteWidgetsBundle)

Deletes the widget bundle. Referencing non-existing Widget Bundle Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllWidgetsBundles

> List<WidgetsBundle> getAllWidgetsBundles()

Get all Widget Bundles (getAllWidgetsBundles)

Returns an array of Widget Bundle objects that are available for current user.Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.    Available for any authorized user. 

### Return type

**List<WidgetsBundle>**


## getWidgetsBundleById

> WidgetsBundle getWidgetsBundleById(widgetsBundleId, inlineImages)

Get Widget Bundle (getWidgetsBundleById)

Get the Widget Bundle based on the provided Widget Bundle Id. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.   Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **inlineImages** | **Boolean** | Inline images as a data URL (Base64) | [optional] |

### Return type

**WidgetsBundle**


## getWidgetsBundles

> PageDataWidgetsBundle getWidgetsBundles(pageSize, page, textSearch, sortProperty, sortOrder, tenantOnly, fullSearch, scadaFirst)

Get Widget Bundles (getWidgetsBundles)

Returns a page of Widget Bundle objects available for current user. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the widget bundle title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title, tenantId] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **tenantOnly** | **Boolean** | Optional boolean parameter to include only tenant-level bundles without system | [optional] |
| **fullSearch** | **Boolean** | Optional boolean parameter indicating extended search of widget bundles by description and by name / description of related widget types | [optional] |
| **scadaFirst** | **Boolean** | Optional boolean parameter indicating whether to fetch widgets bundles with SCADA symbols first. Works only when fullSearch parameter is enabled | [optional] |

### Return type

**PageDataWidgetsBundle**


## getWidgetsBundlesList

> List<WidgetsBundle> getWidgetsBundlesList(widgetsBundleIds)

Get Widgets Bundles By Ids (getWidgetsBundlesList)

Requested widgets bundles must be system level or owned by tenant of the user which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleIds** | **List<String>** | A list of widgets bundle ids, separated by comma ',' | |

### Return type

**List<WidgetsBundle>**


## saveWidgetsBundle

> WidgetsBundle saveWidgetsBundle(widgetsBundle)

Create Or Update Widget Bundle (saveWidgetsBundle)

Create or update the Widget Bundle. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  When creating the bundle, platform generates Widget Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Bundle Id will be present in the response. Specify existing Widget Bundle id to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause 'Not Found' error.  Widget Bundle alias is unique in the scope of tenant. Special Tenant Id '13814000-1dd2-11b2-8080-808080808080' is automatically used if the create bundle request is sent by user with 'SYS_ADMIN' authority.Remove 'id', 'tenantId' from the request body example (below) to create new Widgets Bundle entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundle** | **WidgetsBundle** |  | |

### Return type

**WidgetsBundle**


## updateWidgetsBundleWidgetFqns

> updateWidgetsBundleWidgetFqns(widgetsBundleId, requestBody)

Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns)

Updates widgets bundle widgets list from widget type FQNs list.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

null (empty response body)


## updateWidgetsBundleWidgetTypes

> updateWidgetsBundleWidgetTypes(widgetsBundleId, requestBody)

Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes)

Updates widgets bundle widgets list.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **widgetsBundleId** | **String** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

null (empty response body)

