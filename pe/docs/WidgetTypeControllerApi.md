# WidgetTypeControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteWidgetType(DeleteWidgetTypeArgs args) // Delete widget type (deleteWidgetType)
List<String> getBundleWidgetTypeFqns(GetBundleWidgetTypeFqnsArgs args) // Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns)
List<WidgetType> getBundleWidgetTypes(GetBundleWidgetTypesArgs args) // Get all Widget types for specified Bundle (getBundleWidgetTypes)
List<WidgetTypeDetails> getBundleWidgetTypesDetails(GetBundleWidgetTypesDetailsArgs args) // Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails)
PageDataWidgetTypeInfo getBundleWidgetTypesInfos(GetBundleWidgetTypesInfosArgs args) // Get Widget Type Info objects (getBundleWidgetTypesInfos)
WidgetType getWidgetType(GetWidgetTypeArgs args) // Get Widget Type (getWidgetType)
WidgetTypeDetails getWidgetTypeById(GetWidgetTypeByIdArgs args) // Get Widget Type Details (getWidgetTypeById)
WidgetTypeInfo getWidgetTypeInfoById(GetWidgetTypeInfoByIdArgs args) // Get Widget Type Info (getWidgetTypeInfoById)
PageDataWidgetTypeInfo getWidgetTypes(GetWidgetTypesArgs args) // Get Widget Types (getWidgetTypes)
WidgetTypeDetails saveWidgetType(SaveWidgetTypeArgs args) // Create Or Update Widget Type (saveWidgetType)
```


## deleteWidgetType

**DELETE** `/api/widgetType/{widgetTypeId}`

Delete widget type (deleteWidgetType)

Deletes the  Widget Type. Referencing non-existing Widget Type Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteWidgetType(DeleteWidgetTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteWidgetTypeArgs.builder()
        .widgetTypeId(String)
        .build()
```

### `DeleteWidgetTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetTypeId` | `String` | **yes** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getBundleWidgetTypeFqns

**GET** `/api/widgetTypeFqns`

Get all Widget type fqns for specified Bundle (getBundleWidgetTypeFqns)

Returns an array of Widget Type fqns that belong to specified Widget Bundle.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<String> getBundleWidgetTypeFqns(GetBundleWidgetTypeFqnsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBundleWidgetTypeFqnsArgs.builder()
        .widgetsBundleId(String)
        .build()
```

### `GetBundleWidgetTypeFqnsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | Widget Bundle Id | |

### Return type

`List<String>`


## getBundleWidgetTypes

**GET** `/api/widgetsBundle/{widgetsBundleId}/widgetTypes`

Get all Widget types for specified Bundle (getBundleWidgetTypes)

Returns an array of Widget Type objects that belong to specified Widget Bundle.Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<WidgetType> getBundleWidgetTypes(GetBundleWidgetTypesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBundleWidgetTypesArgs.builder()
        .widgetsBundleId(String)
        .build()
```

### `GetBundleWidgetTypesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | Widget Bundle Id | |

### Return type

`List<WidgetType>`


## getBundleWidgetTypesDetails

**GET** `/api/widgetTypesDetails`

Get all Widget types details for specified Bundle (getBundleWidgetTypesDetails)

Returns an array of Widget Type Details objects that belong to specified Widget Bundle.Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.    Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
List<WidgetTypeDetails> getBundleWidgetTypesDetails(GetBundleWidgetTypesDetailsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBundleWidgetTypesDetailsArgs.builder()
        .widgetsBundleId(String)
        .build()
```

### `GetBundleWidgetTypesDetailsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | Widget Bundle Id | |
| `includeResources` | `Boolean` | no | Export used resources and replace resource links with resource metadata | |

### Return type

`List<WidgetTypeDetails>`


## getBundleWidgetTypesInfos

**GET** `/api/widgetTypesInfos`

Get Widget Type Info objects (getBundleWidgetTypesInfos)

Get the Widget Type Info objects based on the provided parameters. Widget Type Info is a lightweight object that represents Widget Type but does not contain the heavyweight widget descriptor JSON  Available for any authorized user. 

```java
PageDataWidgetTypeInfo getBundleWidgetTypesInfos(GetBundleWidgetTypesInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBundleWidgetTypesInfosArgs.builder()
        .widgetsBundleId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetBundleWidgetTypesInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetsBundleId` | `String` | **yes** | Widget Bundle Id | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the widget type name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deprecated`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `fullSearch` | `Boolean` | no | Optional boolean parameter indicating whether search widgets by description not only by name | |
| `deprecatedFilter` | `String` | no | Optional string parameter indicating whether to include deprecated widgets | enum: `ALL`, `ACTUAL`, `DEPRECATED` |
| `widgetTypeList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the widget type value | enum: `timeseries`, `latest`, `control`, `alarm`, `static` |

### Return type

`PageDataWidgetTypeInfo`


## getWidgetType

**GET** `/api/widgetType`

Get Widget Type (getWidgetType)

Get the Widget Type by FQN. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory.  Available for any authorized user. 

```java
WidgetType getWidgetType(GetWidgetTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetTypeArgs.builder()
        .fqn(String)
        .build()
```

### `GetWidgetTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fqn` | `String` | **yes** | Widget Type fqn | |

### Return type

`WidgetType`


## getWidgetTypeById

**GET** `/api/widgetType/{widgetTypeId}`

Get Widget Type Details (getWidgetTypeById)

Get the Widget Type Details based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
WidgetTypeDetails getWidgetTypeById(GetWidgetTypeByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetTypeByIdArgs.builder()
        .widgetTypeId(String)
        .build()
```

### `GetWidgetTypeByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetTypeId` | `String` | **yes** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `includeResources` | `Boolean` | no | Export used resources and replace resource links with resource metadata | |

### Return type

`WidgetTypeDetails`


## getWidgetTypeInfoById

**GET** `/api/widgetTypeInfo/{widgetTypeId}`

Get Widget Type Info (getWidgetTypeInfoById)

Get the Widget Type Info based on the provided Widget Type Id. Widget Type Details extend Widget Type and add image and description properties. Those properties are useful to edit the Widget Type but they are not required for Dashboard rendering.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
WidgetTypeInfo getWidgetTypeInfoById(GetWidgetTypeInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetTypeInfoByIdArgs.builder()
        .widgetTypeId(String)
        .build()
```

### `GetWidgetTypeInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetTypeId` | `String` | **yes** | A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`WidgetTypeInfo`


## getWidgetTypes

**GET** `/api/widgetTypes`

Get Widget Types (getWidgetTypes)

Returns a page of Widget Type objects available for current user. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for any authorized user. 

```java
PageDataWidgetTypeInfo getWidgetTypes(GetWidgetTypesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetWidgetTypesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetWidgetTypesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the widget type name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `deprecated`, `tenantId` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC, DESC` |
| `tenantOnly` | `Boolean` | no | Optional boolean parameter indicating whether only tenant widget types should be returned | |
| `fullSearch` | `Boolean` | no | Optional boolean parameter indicating whether search widgets by description not only by name | |
| `deprecatedFilter` | `String` | no | Optional string parameter indicating whether to include deprecated widgets | enum: `ALL`, `ACTUAL`, `DEPRECATED` |
| `widgetTypeList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the widget type value | enum: `timeseries`, `latest`, `control`, `alarm`, `static` |
| `scadaFirst` | `Boolean` | no | Optional boolean parameter indicating whether to fetch SCADA symbol widgets first | |

### Return type

`PageDataWidgetTypeInfo`


## saveWidgetType

**POST** `/api/widgetType`

Create Or Update Widget Type (saveWidgetType)

Create or update the Widget Type. Widget Type represents the template for widget creation. Widget Type and Widget are similar to class and object in OOP theory. When creating the Widget Type, platform generates Widget Type Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Widget Type Id will be present in the response. Specify existing Widget Type id to update the Widget Type. Referencing non-existing Widget Type Id will cause 'Not Found' error.  Widget Type fqn is unique in the scope of System or Tenant. Special Tenant Id '13814000-1dd2-11b2-8080-808080808080' is automatically used if the create request is sent by user with 'SYS_ADMIN' authority.Remove 'id', 'tenantId' rom the request body example (below) to create new Widget Type entity.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
WidgetTypeDetails saveWidgetType(SaveWidgetTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveWidgetTypeArgs.builder()
        .widgetTypeDetails(WidgetTypeDetails)
        .build()
```

### `SaveWidgetTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `widgetTypeDetails` | `WidgetTypeDetails` | **yes** |  | |
| `updateExistingByFqn` | `Boolean` | no | Optional boolean parameter indicating whether to update existing widget type by FQN if present instead of creating new one | |

### Return type

`WidgetTypeDetails`

