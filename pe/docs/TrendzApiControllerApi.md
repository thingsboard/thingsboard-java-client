# TrendzApiControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TrendzSummary getTrendzSummary() // Get Trendz Summary (getTrendzSummary)
TrendzUsage getTrendzUsage() // Get Trendz Usage (getTrendzUsage)
TrendzViewConfig getTrendzViewById(GetTrendzViewByIdArgs args) // Get Trendz View by Id (getTrendzViewById)
PageDataTrendzViewConfigLite getTrendzViews(GetTrendzViewsArgs args) // Get Trendz Views (getTrendzViews)
```


## getTrendzSummary

**GET** `/api/trendz/summary`

Get Trendz Summary (getTrendzSummary)

Fetch the Trendz summary object. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
TrendzSummary getTrendzSummary()
```

### Return type

`TrendzSummary`


## getTrendzUsage

**GET** `/api/trendz/usage`

Get Trendz Usage (getTrendzUsage)

Fetch the Trendz usage object. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
TrendzUsage getTrendzUsage()
```

### Return type

`TrendzUsage`


## getTrendzViewById

**GET** `/api/trendz/view/{viewId}`

Get Trendz View by Id (getTrendzViewById)

Fetch the Trendz View object based on the provided Trendz View Id. Can only be used if Trendz is already synchronized and integration is enabled.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
TrendzViewConfig getTrendzViewById(GetTrendzViewByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTrendzViewByIdArgs.builder()
        .viewId(String)
        .build()
```

### `GetTrendzViewByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `viewId` | `String` | **yes** | A string value representing the Trendz view id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`TrendzViewConfig`


## getTrendzViews

**GET** `/api/trendz/view/all`

Get Trendz Views (getTrendzViews)

Returns a page of Trendz views that are available for the current user. Can only be used if Trendz is already synchronized and integration is enabled. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataTrendzViewConfigLite getTrendzViews(GetTrendzViewsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTrendzViewsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTrendzViewsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the Trendz view name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `name`, `createdAt`, `updatedAt`, `favorite` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataTrendzViewConfigLite`

