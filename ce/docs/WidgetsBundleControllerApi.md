# WidgetsBundleControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteWidgetsBundle(DeleteWidgetsBundleArgs args) // Delete widgets bundle (deleteWidgetsBundle)
List<WidgetsBundle> getAllWidgetsBundles() // Get all Widget Bundles (getAllWidgetsBundles)
WidgetsBundle getWidgetsBundleById(GetWidgetsBundleByIdArgs args) // Get Widget Bundle (getWidgetsBundleById)
PageDataWidgetsBundle getWidgetsBundles(GetWidgetsBundlesArgs args) // Get Widget Bundles (getWidgetsBundles)
List<WidgetsBundle> getWidgetsBundlesList(GetWidgetsBundlesListArgs args) // Get Widgets Bundles By Ids (getWidgetsBundlesList)
WidgetsBundle saveWidgetsBundle(SaveWidgetsBundleArgs args) // Create Or Update Widget Bundle (saveWidgetsBundle)
void updateWidgetsBundleWidgetFqns(UpdateWidgetsBundleWidgetFqnsArgs args) // Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns)
void updateWidgetsBundleWidgetTypes(UpdateWidgetsBundleWidgetTypesArgs args) // Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes)
```


## deleteWidgetsBundle

**DELETE** `/api/widgetsBundle/{widgetsBundleId}`

Delete widgets bundle (deleteWidgetsBundle)

Deletes the widget bundle. Referencing non-existing Widget Bundle Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteWidgetsBundle(DeleteWidgetsBundleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteWidgetsBundleArgs.builder()
        .widgetsBundleId(String)
        .build()
```

### `DeleteWidgetsBundleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllWidgetsBundles

**GET** `/api/widgetsBundles/all`

Get all Widget Bundles (getAllWidgetsBundles)

Returns an array of Widget Bundle objects that are available for current user.Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.    Available for any authorized user. 

```java
List<WidgetsBundle> getAllWidgetsBundles()
```

### Return type

`List<WidgetsBundle>`


## getWidgetsBundleById

**GET** `/api/widgetsBundle/{widgetsBundleId}`

Get Widget Bundle (getWidgetsBundleById)

Get the Widget Bundle based on the provided Widget Bundle Id. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.   Available for any authorized user. 

```java
WidgetsBundle getWidgetsBundleById(GetWidgetsBundleByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetsBundleByIdArgs.builder()
        .widgetsBundleId(String)
        .build()
```

### `GetWidgetsBundleByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `inlineImages` | `Boolean` | no | Inline images as a data URL (Base64) | |

### Return type

`WidgetsBundle`


## getWidgetsBundles

**GET** `/api/widgetsBundles`

Get Widget Bundles (getWidgetsBundles)

Returns a page of Widget Bundle objects available for current user. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

```java
PageDataWidgetsBundle getWidgetsBundles(GetWidgetsBundlesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetsBundlesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetWidgetsBundlesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the widget bundle title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `tenantOnly` | `Boolean` | no | Optional boolean parameter to include only tenant-level bundles without system | |
| `fullSearch` | `Boolean` | no | Optional boolean parameter indicating extended search of widget bundles by description and by name / description of related widget types | |
| `scadaFirst` | `Boolean` | no | Optional boolean parameter indicating whether to fetch widgets bundles with SCADA symbols first. Works only when fullSearch parameter is enabled | |

### Return type

`PageDataWidgetsBundle`


## getWidgetsBundlesList

**GET** `/api/widgetsBundles/list`

Get Widgets Bundles By Ids (getWidgetsBundlesList)

Requested widgets bundles must be system level or owned by tenant of the user which is performing the request.   

```java
List<WidgetsBundle> getWidgetsBundlesList(GetWidgetsBundlesListArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetsBundlesListArgs.builder()
        .widgetsBundleIds(List<String>)
        .build()
```

### `GetWidgetsBundlesListArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleIds` | `List<String>` | **yes** | A list of widgets bundle ids, separated by comma ',' | |

### Return type

`List<WidgetsBundle>`


## saveWidgetsBundle

**POST** `/api/widgetsBundle`

Create Or Update Widget Bundle (saveWidgetsBundle)

Create or update the Widget Bundle. Widget Bundle represents a group(bundle) of widgets. Widgets are grouped into bundle by type or use case.  When creating the bundle, platform generates Widget Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Bundle Id will be present in the response. Specify existing Widget Bundle id to update the Widget Bundle. Referencing non-existing Widget Bundle Id will cause 'Not Found' error.  Widget Bundle alias is unique in the scope of tenant. Special Tenant Id '13814000-1dd2-11b2-8080-808080808080' is automatically used if the create bundle request is sent by user with 'SYS_ADMIN' authority.Remove 'id', 'tenantId' from the request body example (below) to create new Widgets Bundle entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
WidgetsBundle saveWidgetsBundle(SaveWidgetsBundleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveWidgetsBundleArgs.builder()
        .widgetsBundle(WidgetsBundle)
        .build()
```

### `SaveWidgetsBundleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundle` | `WidgetsBundle` | **yes** |  | |

### Return type

`WidgetsBundle`


## updateWidgetsBundleWidgetFqns

**POST** `/api/widgetsBundle/{widgetsBundleId}/widgetTypeFqns`

Update widgets bundle widgets list from widget type FQNs list (updateWidgetsBundleWidgetFqns)

Updates widgets bundle widgets list from widget type FQNs list.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void updateWidgetsBundleWidgetFqns(UpdateWidgetsBundleWidgetFqnsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateWidgetsBundleWidgetFqnsArgs.builder()
        .widgetsBundleId(String)
        .requestBody(List<String>)
        .build()
```

### `UpdateWidgetsBundleWidgetFqnsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

null (empty response body)


## updateWidgetsBundleWidgetTypes

**POST** `/api/widgetsBundle/{widgetsBundleId}/widgetTypes`

Update widgets bundle widgets types list (updateWidgetsBundleWidgetTypes)

Updates widgets bundle widgets list.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void updateWidgetsBundleWidgetTypes(UpdateWidgetsBundleWidgetTypesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateWidgetsBundleWidgetTypesArgs.builder()
        .widgetsBundleId(String)
        .requestBody(List<String>)
        .build()
```

### `UpdateWidgetsBundleWidgetTypesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

null (empty response body)

