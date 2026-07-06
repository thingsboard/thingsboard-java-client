# DashboardControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Dashboard addDashboardCustomers(AddDashboardCustomersArgs args) // Adds the Dashboard Customers (addDashboardCustomers)
Dashboard assignDashboardToCustomer(AssignDashboardToCustomerArgs args) // Assign the Dashboard (assignDashboardToCustomer)
Dashboard assignDashboardToEdge(AssignDashboardToEdgeArgs args) // Assign dashboard to edge (assignDashboardToEdge)
Dashboard assignDashboardToPublicCustomer(AssignDashboardToPublicCustomerArgs args) // Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer)
void deleteDashboard(DeleteDashboardArgs args) // Delete the Dashboard (deleteDashboard)
PageDataDashboardInfo getCustomerDashboards(GetCustomerDashboardsArgs args) // Get Customer Dashboards (getCustomerDashboards)
Dashboard getDashboardById(GetDashboardByIdArgs args) // Get Dashboard (getDashboardById)
DashboardInfo getDashboardInfoById(GetDashboardInfoByIdArgs args) // Get Dashboard Info (getDashboardInfoById)
List<DashboardInfo> getDashboardsByIds(GetDashboardsByIdsArgs args) // Get dashboards by Dashboard Ids (getDashboardsByIds)
PageDataDashboardInfo getEdgeDashboards(GetEdgeDashboardsArgs args) // Get Edge Dashboards (getEdgeDashboards)
HomeDashboard getHomeDashboard(GetHomeDashboardArgs args) // Get Home Dashboard (getHomeDashboard)
HomeDashboardInfo getHomeDashboardInfo() // Get Home Dashboard Info (getHomeDashboardInfo)
Long getMaxDatapointsLimit() // Get max data points limit (getMaxDatapointsLimit)
Long getServerTime() // Get server time (getServerTime)
PageDataDashboardInfo getTenantDashboards(GetTenantDashboardsArgs args) // Get Tenant Dashboards (getTenantDashboards)
PageDataDashboardInfo getTenantDashboardsByTenantId(GetTenantDashboardsByTenantIdArgs args) // Get Tenant Dashboards by System Administrator (getTenantDashboardsByTenantId)
HomeDashboardInfo getTenantHomeDashboardInfo() // Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
Dashboard removeDashboardCustomers(RemoveDashboardCustomersArgs args) // Remove the Dashboard Customers (removeDashboardCustomers)
Dashboard saveDashboard(SaveDashboardArgs args) // Create Or Update Dashboard (saveDashboard)
void setTenantHomeDashboardInfo(SetTenantHomeDashboardInfoArgs args) // Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
Dashboard unassignDashboardFromCustomer(UnassignDashboardFromCustomerArgs args) // Unassign the Dashboard (unassignDashboardFromCustomer)
Dashboard unassignDashboardFromEdge(UnassignDashboardFromEdgeArgs args) // Unassign dashboard from edge (unassignDashboardFromEdge)
Dashboard unassignDashboardFromPublicCustomer(UnassignDashboardFromPublicCustomerArgs args) // Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer)
Dashboard updateDashboardCustomers(UpdateDashboardCustomersArgs args) // Update the Dashboard Customers (updateDashboardCustomers)
```


## addDashboardCustomers

**POST** `/api/dashboard/{dashboardId}/customers/add`

Adds the Dashboard Customers (addDashboardCustomers)

Adds the list of Customers to the existing list of assignments for the Dashboard. Keeps previous assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard addDashboardCustomers(AddDashboardCustomersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AddDashboardCustomersArgs.builder()
        .dashboardId(String)
        .requestBody(List<String>)
        .build()
```

### `AddDashboardCustomersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

`Dashboard`


## assignDashboardToCustomer

**POST** `/api/customer/{customerId}/dashboard/{dashboardId}`

Assign the Dashboard (assignDashboardToCustomer)

Assign the Dashboard to specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard assignDashboardToCustomer(AssignDashboardToCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDashboardToCustomerArgs.builder()
        .customerId(String)
        .dashboardId(String)
        .build()
```

### `AssignDashboardToCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Dashboard`


## assignDashboardToEdge

**POST** `/api/edge/{edgeId}/dashboard/{dashboardId}`

Assign dashboard to edge (assignDashboardToEdge)

Creates assignment of an existing dashboard to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment dashboard (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once dashboard will be delivered to edge service, it's going to be available for usage on remote edge instance.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard assignDashboardToEdge(AssignDashboardToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDashboardToEdgeArgs.builder()
        .edgeId(String)
        .dashboardId(String)
        .build()
```

### `AssignDashboardToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `dashboardId` | `String` | **yes** |  | |

### Return type

`Dashboard`


## assignDashboardToPublicCustomer

**POST** `/api/customer/public/dashboard/{dashboardId}`

Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer)

Assigns the dashboard to a special, auto-generated 'Public' Customer. Once assigned, unauthenticated users may browse the dashboard. This method is useful if you like to embed the dashboard on public web pages to be available for users that are not logged in. Be aware that making the dashboard public does not mean that it automatically makes all devices and assets you use in the dashboard to be public.Use [assign Asset to Public Customer](#!/asset-controller/assignAssetToPublicCustomerUsingPOST) and [assign Device to Public Customer](#!/device-controller/assignDeviceToPublicCustomerUsingPOST) for this purpose. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard assignDashboardToPublicCustomer(AssignDashboardToPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignDashboardToPublicCustomerArgs.builder()
        .dashboardId(String)
        .build()
```

### `AssignDashboardToPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Dashboard`


## deleteDashboard

**DELETE** `/api/dashboard/{dashboardId}`

Delete the Dashboard (deleteDashboard)

Delete the Dashboard.  Available for users with 'TENANT_ADMIN' authority.

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


## getCustomerDashboards

**GET** `/api/customer/{customerId}/dashboards`

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

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
| `mobile` | `Boolean` | no | Exclude dashboards that are hidden for mobile | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


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


## getDashboardsByIds

**GET** `/api/dashboards/list`

Get dashboards by Dashboard Ids (getDashboardsByIds)

Returns a list of DashboardInfo objects based on the provided ids.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

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


## getEdgeDashboards

**GET** `/api/edge/{edgeId}/dashboards`

Get Edge Dashboards (getEdgeDashboards)

Returns a page of dashboard info objects assigned to the specified edge. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataDashboardInfo getEdgeDashboards(GetEdgeDashboardsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeDashboardsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeDashboardsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the dashboard title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataDashboardInfo`


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

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding tenant.   Available for users with 'TENANT_ADMIN' authority.

```java
HomeDashboardInfo getTenantHomeDashboardInfo()
```

### Return type

`HomeDashboardInfo`


## removeDashboardCustomers

**POST** `/api/dashboard/{dashboardId}/customers/remove`

Remove the Dashboard Customers (removeDashboardCustomers)

Removes the list of Customers from the existing list of assignments for the Dashboard. Keeps other assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard removeDashboardCustomers(RemoveDashboardCustomersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RemoveDashboardCustomersArgs.builder()
        .dashboardId(String)
        .requestBody(List<String>)
        .build()
```

### `RemoveDashboardCustomersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

`Dashboard`


## saveDashboard

**POST** `/api/dashboard`

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Dashboard entity.   Available for users with 'TENANT_ADMIN' authority.

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
| `acceptEncoding` | `String` | no |  | |

### Return type

`Dashboard`


## setTenantHomeDashboardInfo

**POST** `/api/tenant/dashboard/home/info`

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with 'TENANT_ADMIN' authority.

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


## unassignDashboardFromCustomer

**DELETE** `/api/customer/{customerId}/dashboard/{dashboardId}`

Unassign the Dashboard (unassignDashboardFromCustomer)

Unassign the Dashboard from specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard unassignDashboardFromCustomer(UnassignDashboardFromCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignDashboardFromCustomerArgs.builder()
        .customerId(String)
        .dashboardId(String)
        .build()
```

### `UnassignDashboardFromCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | **yes** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Dashboard`


## unassignDashboardFromEdge

**DELETE** `/api/edge/{edgeId}/dashboard/{dashboardId}`

Unassign dashboard from edge (unassignDashboardFromEdge)

Clears assignment of the dashboard to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove dashboard (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove dashboard locally.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard unassignDashboardFromEdge(UnassignDashboardFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignDashboardFromEdgeArgs.builder()
        .edgeId(String)
        .dashboardId(String)
        .build()
```

### `UnassignDashboardFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `dashboardId` | `String` | **yes** |  | |

### Return type

`Dashboard`


## unassignDashboardFromPublicCustomer

**DELETE** `/api/customer/public/dashboard/{dashboardId}`

Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer)

Unassigns the dashboard from a special, auto-generated 'Public' Customer. Once unassigned, unauthenticated users may no longer browse the dashboard. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard unassignDashboardFromPublicCustomer(UnassignDashboardFromPublicCustomerArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignDashboardFromPublicCustomerArgs.builder()
        .dashboardId(String)
        .build()
```

### `UnassignDashboardFromPublicCustomerArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Dashboard`


## updateDashboardCustomers

**POST** `/api/dashboard/{dashboardId}/customers`

Update the Dashboard Customers (updateDashboardCustomers)

Updates the list of Customers that this Dashboard is assigned to. Removes previous assignments to customers that are not in the provided list. Returns the Dashboard object.   Available for users with 'TENANT_ADMIN' authority.

```java
Dashboard updateDashboardCustomers(UpdateDashboardCustomersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateDashboardCustomersArgs.builder()
        .dashboardId(String)
        .build()
```

### `UpdateDashboardCustomersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | no |  | |

### Return type

`Dashboard`

