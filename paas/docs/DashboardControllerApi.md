# DashboardControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteDashboard(DeleteDashboardArgs args) // Delete the Dashboard (deleteDashboard)
List<Dashboard> exportGroupDashboards(ExportGroupDashboardsArgs args) // Export Dashboards (exportGroupDashboards)
PageDataDashboardInfo getAllDashboards(GetAllDashboardsArgs args) // Get All Dashboards for current user (getAllDashboards)
PageDataDashboardInfo getCustomerDashboards(GetCustomerDashboardsArgs args) // Get Customer Dashboards (getCustomerDashboards)
HomeDashboardInfo getCustomerHomeDashboardInfo() // Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo)
Dashboard getDashboardById(GetDashboardByIdArgs args) // Get Dashboard (getDashboardById)
DashboardInfo getDashboardInfoById(GetDashboardInfoByIdArgs args) // Get Dashboard Info (getDashboardInfoById)
PageDataDashboardInfo getDashboardsByEntityGroupId(GetDashboardsByEntityGroupIdArgs args) // Get dashboards by Entity Group Id (getDashboardsByEntityGroupId)
List<DashboardInfo> getDashboardsByIds(GetDashboardsByIdsArgs args) // Get dashboards by Dashboard Ids (getDashboardsByIds)
HomeDashboard getHomeDashboard(GetHomeDashboardArgs args) // Get Home Dashboard (getHomeDashboard)
HomeDashboardInfo getHomeDashboardInfo() // Get Home Dashboard Info (getHomeDashboardInfo)
Long getMaxDatapointsLimit() // Get max data points limit (getMaxDatapointsLimit)
Long getServerTime() // Get server time (getServerTime)
PageDataDashboardInfo getTenantDashboards(GetTenantDashboardsArgs args) // Get Tenant Dashboards (getTenantDashboards)
PageDataDashboardInfo getTenantDashboardsByTenantId(GetTenantDashboardsByTenantIdArgs args) // Get Tenant Dashboards by System Administrator (getTenantDashboardsByTenantId)
HomeDashboardInfo getTenantHomeDashboardInfo() // Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
PageDataDashboardInfo getUserDashboards(GetUserDashboardsArgs args) // Get Dashboards (getUserDashboards)
void importGroupDashboards(ImportGroupDashboardsArgs args) // Import Dashboards (importGroupDashboards)
Dashboard saveDashboard(SaveDashboardArgs args) // Create Or Update Dashboard (saveDashboard)
void setCustomerHomeDashboardInfo(SetCustomerHomeDashboardInfoArgs args) // Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo)
void setTenantHomeDashboardInfo(SetTenantHomeDashboardInfoArgs args) // Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
```


## deleteDashboard

**DELETE** `/api/dashboard/{dashboardId}`

Delete the Dashboard (deleteDashboard)

Delete the Dashboard. Only users with 'TENANT_ADMIN') authority may delete the dashboards.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteDashboard(DeleteDashboardArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteDashboardArgs.builder()
        .dashboardId(String)
        .build()
```

### `DeleteDashboardArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## exportGroupDashboards

**GET** `/api/entityGroup/{entityGroupId}/dashboards/export`

Export Dashboards (exportGroupDashboards)

Export the dashboards that belong to specified group id.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<Dashboard> exportGroupDashboards(ExportGroupDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ExportGroupDashboardsArgs.builder()
        .entityGroupId(String)
        .limit(Integer)
        .build()
```

### `ExportGroupDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `limit` | `Integer` | **yes** | Limit of the entities to export | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`List<Dashboard>`


## getAllDashboards

**GET** `/api/dashboards/all`

Get All Dashboards for current user (getAllDashboards)

Returns a page of dashboard info objects owned by the tenant or the customer of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataDashboardInfo getAllDashboards(GetAllDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllDashboardsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


## getCustomerDashboards

**GET** `/api/customer/{customerId}/dashboards`

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataDashboardInfo getCustomerDashboards(GetCustomerDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomerDashboardsArgs.builder()
        .customerId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomerDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


## getCustomerHomeDashboardInfo

**GET** `/api/customer/dashboard/home/info`

Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding customer.   Available for users with 'CUSTOMER_USER' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
HomeDashboardInfo getCustomerHomeDashboardInfo()
```

### Return type

`HomeDashboardInfo`


## getDashboardById

**GET** `/api/dashboard/{dashboardId}`

Get Dashboard (getDashboardById)

Get the dashboard based on 'dashboardId' parameter. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Dashboard getDashboardById(GetDashboardByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDashboardByIdArgs.builder()
        .dashboardId(String)
        .build()
```

### `GetDashboardByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `includeResources` | `Boolean` | no | Export used resources and replace resource links with resource metadata | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`Dashboard`


## getDashboardInfoById

**GET** `/api/dashboard/info/{dashboardId}`

Get Dashboard Info (getDashboardInfoById)

Get the information about the dashboard based on 'dashboardId' parameter. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.

```java
DashboardInfo getDashboardInfoById(GetDashboardInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDashboardInfoByIdArgs.builder()
        .dashboardId(String)
        .build()
```

### `GetDashboardInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`DashboardInfo`


## getDashboardsByEntityGroupId

**GET** `/api/entityGroup/{entityGroupId}/dashboards`

Get dashboards by Entity Group Id (getDashboardsByEntityGroupId)

Returns a page of Dashboard objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataDashboardInfo getDashboardsByEntityGroupId(GetDashboardsByEntityGroupIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDashboardsByEntityGroupIdArgs.builder()
        .entityGroupId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetDashboardsByEntityGroupIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


## getDashboardsByIds

**GET** `/api/dashboards`

Get dashboards by Dashboard Ids (getDashboardsByIds)

Returns a list of DashboardInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<DashboardInfo> getDashboardsByIds(GetDashboardsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetDashboardsByIdsArgs.builder()
        .dashboardIds(List<String>)
        .build()
```

### `GetDashboardsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardIds` | `List<String>` | **yes** | A list of dashboard ids, separated by comma ',' | |

### Return type

`List<DashboardInfo>`


## getHomeDashboard

**GET** `/api/dashboard/home`

Get Home Dashboard (getHomeDashboard)

Returns the home dashboard object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
HomeDashboard getHomeDashboard(GetHomeDashboardArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetHomeDashboardArgs.builder()
        .build()
```

### `GetHomeDashboardArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `acceptEncoding` | `String` | no |  | |

### Return type

`HomeDashboard`


## getHomeDashboardInfo

**GET** `/api/dashboard/home/info`

Get Home Dashboard Info (getHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
HomeDashboardInfo getHomeDashboardInfo()
```

### Return type

`HomeDashboardInfo`


## getMaxDatapointsLimit

**GET** `/api/dashboard/maxDatapointsLimit`

Get max data points limit (getMaxDatapointsLimit)

Get the maximum number of data points that dashboard may request from the server per in a single subscription command. This value impacts the time window behavior. It impacts 'Max values' parameter in case user selects 'None' as 'Data aggregation function'. It also impacts the 'Grouping interval' in case of any other 'Data aggregation function' is selected. The actual value of the limit is configurable in the system configuration file.

```java
Long getMaxDatapointsLimit()
```

### Return type

`Long`


## getServerTime

**GET** `/api/dashboard/serverTime`

Get server time (getServerTime)

Get the server time (milliseconds since January 1, 1970 UTC). Used to adjust view of the dashboards according to the difference between browser and server time.

```java
Long getServerTime()
```

### Return type

`Long`


## getTenantDashboards

**GET** `/api/tenant/dashboards`

Get Tenant Dashboards (getTenantDashboards)

Returns a page of dashboard info objects owned by the tenant of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataDashboardInfo getTenantDashboards(GetTenantDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantDashboardsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `mobile` | `Boolean` | no | Exclude dashboards that are hidden for mobile | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


## getTenantDashboardsByTenantId

**GET** `/api/tenant/{tenantId}/dashboards`

Get Tenant Dashboards by System Administrator (getTenantDashboardsByTenantId)

Returns a page of dashboard info objects owned by tenant. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.

```java
PageDataDashboardInfo getTenantDashboardsByTenantId(GetTenantDashboardsByTenantIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantDashboardsByTenantIdArgs.builder()
        .tenantId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantDashboardsByTenantIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantId` | `String` | **yes** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


## getTenantHomeDashboardInfo

**GET** `/api/tenant/dashboard/home/info`

Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding tenant.   Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
HomeDashboardInfo getTenantHomeDashboardInfo()
```

### Return type

`HomeDashboardInfo`


## getUserDashboards

**GET** `/api/user/dashboards`

Get Dashboards (getUserDashboards)

Returns a page of Dashboard Info objects available for specified or current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataDashboardInfo getUserDashboards(GetUserDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserDashboardsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetUserDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `mobile` | `Boolean` | no | Exclude dashboards that are hidden for mobile | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `operation` | `String` | no | Filter by allowed operations for the current user | |
| `userId` | `String` | no | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`PageDataDashboardInfo`


## importGroupDashboards

**POST** `/api/entityGroup/{entityGroupId}/dashboards/import`

Import Dashboards (importGroupDashboards)

Import the dashboards to specified group.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
void importGroupDashboards(ImportGroupDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ImportGroupDashboardsArgs.builder()
        .entityGroupId(String)
        .dashboard(List<Dashboard>)
        .build()
```

### `ImportGroupDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `dashboard` | `List<Dashboard>` | **yes** |  | |
| `overwrite` | `Boolean` | no | Overwrite dashboards with the same name | default: `false` |

### Return type

null (empty response body)


## saveDashboard

**POST** `/api/dashboard`

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause 'Not Found' error. Only users with 'TENANT_ADMIN') authority may create the dashboards.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Dashboard entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Dashboard saveDashboard(SaveDashboardArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveDashboardArgs.builder()
        .dashboard(Dashboard)
        .build()
```

### `SaveDashboardArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboard` | `Dashboard` | **yes** | A JSON value representing the dashboard. | |
| `entityGroupId` | `String` | no |  | |
| `entityGroupIds` | `List<String>` | no | A list of entity group ids, separated by comma ',' | |
| `acceptEncoding` | `String` | no |  | |

### Return type

`Dashboard`


## setCustomerHomeDashboardInfo

**POST** `/api/customer/dashboard/home/info`

Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo)

Update the home dashboard assignment for the current customer.   Available for users with 'CUSTOMER_USER' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void setCustomerHomeDashboardInfo(SetCustomerHomeDashboardInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetCustomerHomeDashboardInfoArgs.builder()
        .homeDashboardInfo(HomeDashboardInfo)
        .build()
```

### `SetCustomerHomeDashboardInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `homeDashboardInfo` | `HomeDashboardInfo` | **yes** |  | |

### Return type

null (empty response body)


## setTenantHomeDashboardInfo

**POST** `/api/tenant/dashboard/home/info`

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void setTenantHomeDashboardInfo(SetTenantHomeDashboardInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SetTenantHomeDashboardInfoArgs.builder()
        .homeDashboardInfo(HomeDashboardInfo)
        .build()
```

### `SetTenantHomeDashboardInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `homeDashboardInfo` | `HomeDashboardInfo` | **yes** |  | |

### Return type

null (empty response body)

