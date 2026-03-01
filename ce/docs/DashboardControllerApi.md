# DashboardControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDashboardCustomers**](#addDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers/add | Adds the Dashboard Customers (addDashboardCustomers) |
| [**assignDashboardToCustomer**](#assignDashboardToCustomer) | **POST** /api/customer/{customerId}/dashboard/{dashboardId} | Assign the Dashboard (assignDashboardToCustomer) |
| [**assignDashboardToEdge**](#assignDashboardToEdge) | **POST** /api/edge/{edgeId}/dashboard/{dashboardId} | Assign dashboard to edge (assignDashboardToEdge) |
| [**assignDashboardToPublicCustomer**](#assignDashboardToPublicCustomer) | **POST** /api/customer/public/dashboard/{dashboardId} | Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer) |
| [**deleteDashboard**](#deleteDashboard) | **DELETE** /api/dashboard/{dashboardId} | Delete the Dashboard (deleteDashboard) |
| [**getCustomerDashboards**](#getCustomerDashboards) | **GET** /api/customer/{customerId}/dashboards | Get Customer Dashboards (getCustomerDashboards) |
| [**getDashboardById**](#getDashboardById) | **GET** /api/dashboard/{dashboardId} | Get Dashboard (getDashboardById) |
| [**getDashboardInfoById**](#getDashboardInfoById) | **GET** /api/dashboard/info/{dashboardId} | Get Dashboard Info (getDashboardInfoById) |
| [**getDashboardsByIdsV2**](#getDashboardsByIdsV2) | **GET** /api/dashboards/list | Get dashboards by Dashboard Ids (getDashboardsByIdsV2) |
| [**getEdgeDashboards**](#getEdgeDashboards) | **GET** /api/edge/{edgeId}/dashboards | Get Edge Dashboards (getEdgeDashboards) |
| [**getHomeDashboard**](#getHomeDashboard) | **GET** /api/dashboard/home | Get Home Dashboard (getHomeDashboard) |
| [**getHomeDashboardInfo**](#getHomeDashboardInfo) | **GET** /api/dashboard/home/info | Get Home Dashboard Info (getHomeDashboardInfo) |
| [**getMaxDatapointsLimit**](#getMaxDatapointsLimit) | **GET** /api/dashboard/maxDatapointsLimit | Get max data points limit (getMaxDatapointsLimit) |
| [**getServerTime**](#getServerTime) | **GET** /api/dashboard/serverTime | Get server time (getServerTime) |
| [**getTenantDashboards**](#getTenantDashboards) | **GET** /api/tenant/{tenantId}/dashboards | Get Tenant Dashboards by System Administrator (getTenantDashboards) |
| [**getTenantDashboards1**](#getTenantDashboards1) | **GET** /api/tenant/dashboards | Get Tenant Dashboards (getTenantDashboards) |
| [**getTenantHomeDashboardInfo**](#getTenantHomeDashboardInfo) | **GET** /api/tenant/dashboard/home/info | Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |
| [**removeDashboardCustomers**](#removeDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers/remove | Remove the Dashboard Customers (removeDashboardCustomers) |
| [**saveDashboard**](#saveDashboard) | **POST** /api/dashboard | Create Or Update Dashboard (saveDashboard) |
| [**setTenantHomeDashboardInfo**](#setTenantHomeDashboardInfo) | **POST** /api/tenant/dashboard/home/info | Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |
| [**unassignDashboardFromCustomer**](#unassignDashboardFromCustomer) | **DELETE** /api/customer/{customerId}/dashboard/{dashboardId} | Unassign the Dashboard (unassignDashboardFromCustomer) |
| [**unassignDashboardFromEdge**](#unassignDashboardFromEdge) | **DELETE** /api/edge/{edgeId}/dashboard/{dashboardId} | Unassign dashboard from edge (unassignDashboardFromEdge) |
| [**unassignDashboardFromPublicCustomer**](#unassignDashboardFromPublicCustomer) | **DELETE** /api/customer/public/dashboard/{dashboardId} | Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer) |
| [**updateDashboardCustomers**](#updateDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers | Update the Dashboard Customers (updateDashboardCustomers) |



## addDashboardCustomers

> Dashboard addDashboardCustomers(dashboardId, requestBody)

Adds the Dashboard Customers (addDashboardCustomers)

Adds the list of Customers to the existing list of assignments for the Dashboard. Keeps previous assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

**Dashboard**


## assignDashboardToCustomer

> Dashboard assignDashboardToCustomer(customerId, dashboardId)

Assign the Dashboard (assignDashboardToCustomer)

Assign the Dashboard to specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Dashboard**


## assignDashboardToEdge

> Dashboard assignDashboardToEdge(edgeId, dashboardId)

Assign dashboard to edge (assignDashboardToEdge)

Creates assignment of an existing dashboard to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment dashboard (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once dashboard will be delivered to edge service, it's going to be available for usage on remote edge instance.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **dashboardId** | **String** |  | |

### Return type

**Dashboard**


## assignDashboardToPublicCustomer

> Dashboard assignDashboardToPublicCustomer(dashboardId)

Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer)

Assigns the dashboard to a special, auto-generated 'Public' Customer. Once assigned, unauthenticated users may browse the dashboard. This method is useful if you like to embed the dashboard on public web pages to be available for users that are not logged in. Be aware that making the dashboard public does not mean that it automatically makes all devices and assets you use in the dashboard to be public.Use [assign Asset to Public Customer](#!/asset-controller/assignAssetToPublicCustomerUsingPOST) and [assign Device to Public Customer](#!/device-controller/assignDeviceToPublicCustomerUsingPOST) for this purpose. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Dashboard**


## deleteDashboard

> deleteDashboard(dashboardId)

Delete the Dashboard (deleteDashboard)

Delete the Dashboard.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getCustomerDashboards

> PageDataDashboardInfo getCustomerDashboards(customerId, pageSize, page, mobile, textSearch, sortProperty, sortOrder)

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **mobile** | **Boolean** | Exclude dashboards that are hidden for mobile | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getDashboardById

> getDashboardById(dashboardId, includeResources, acceptEncoding)

Get Dashboard (getDashboardById)

Get the dashboard based on 'dashboardId' parameter. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **includeResources** | **Boolean** | Export used resources and replace resource links with resource metadata | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

null (empty response body)


## getDashboardInfoById

> DashboardInfo getDashboardInfoById(dashboardId)

Get Dashboard Info (getDashboardInfoById)

Get the information about the dashboard based on 'dashboardId' parameter. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**DashboardInfo**


## getDashboardsByIdsV2

> List<DashboardInfo> getDashboardsByIdsV2(dashboardIds)

Get dashboards by Dashboard Ids (getDashboardsByIdsV2)

Returns a list of DashboardInfo objects based on the provided ids.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardIds** | **List<String>** | A list of dashboard ids, separated by comma ',' | |

### Return type

**List<DashboardInfo>**


## getEdgeDashboards

> PageDataDashboardInfo getEdgeDashboards(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Dashboards (getEdgeDashboards)

Returns a page of dashboard info objects assigned to the specified edge. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getHomeDashboard

> getHomeDashboard(acceptEncoding)

Get Home Dashboard (getHomeDashboard)

Returns the home dashboard object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptEncoding** | **String** |  | [optional] |

### Return type

null (empty response body)


## getHomeDashboardInfo

> HomeDashboardInfo getHomeDashboardInfo()

Get Home Dashboard Info (getHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**HomeDashboardInfo**


## getMaxDatapointsLimit

> Long getMaxDatapointsLimit()

Get max data points limit (getMaxDatapointsLimit)

Get the maximum number of data points that dashboard may request from the server per in a single subscription command. This value impacts the time window behavior. It impacts 'Max values' parameter in case user selects 'None' as 'Data aggregation function'. It also impacts the 'Grouping interval' in case of any other 'Data aggregation function' is selected. The actual value of the limit is configurable in the system configuration file.

### Return type

**Long**


## getServerTime

> Long getServerTime()

Get server time (getServerTime)

Get the server time (milliseconds since January 1, 1970 UTC). Used to adjust view of the dashboards according to the difference between browser and server time.

### Return type

**Long**


## getTenantDashboards

> PageDataDashboardInfo getTenantDashboards(tenantId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Dashboards by System Administrator (getTenantDashboards)

Returns a page of dashboard info objects owned by tenant. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String** | A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getTenantDashboards1

> PageDataDashboardInfo getTenantDashboards1(pageSize, page, mobile, textSearch, sortProperty, sortOrder)

Get Tenant Dashboards (getTenantDashboards)

Returns a page of dashboard info objects owned by the tenant of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **mobile** | **Boolean** | Exclude dashboards that are hidden for mobile | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getTenantHomeDashboardInfo

> HomeDashboardInfo getTenantHomeDashboardInfo()

Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding tenant.   Available for users with 'TENANT_ADMIN' authority.

### Return type

**HomeDashboardInfo**


## removeDashboardCustomers

> Dashboard removeDashboardCustomers(dashboardId, requestBody)

Remove the Dashboard Customers (removeDashboardCustomers)

Removes the list of Customers from the existing list of assignments for the Dashboard. Keeps other assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

**Dashboard**


## saveDashboard

> Dashboard saveDashboard(dashboard, acceptEncoding)

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Dashboard entity.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboard** | **Dashboard** | A JSON value representing the dashboard. | |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**Dashboard**


## setTenantHomeDashboardInfo

> setTenantHomeDashboardInfo(homeDashboardInfo)

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **homeDashboardInfo** | **HomeDashboardInfo** |  | |

### Return type

null (empty response body)


## unassignDashboardFromCustomer

> Dashboard unassignDashboardFromCustomer(customerId, dashboardId)

Unassign the Dashboard (unassignDashboardFromCustomer)

Unassign the Dashboard from specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Dashboard**


## unassignDashboardFromEdge

> Dashboard unassignDashboardFromEdge(edgeId, dashboardId)

Unassign dashboard from edge (unassignDashboardFromEdge)

Clears assignment of the dashboard to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove dashboard (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove dashboard locally.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **dashboardId** | **String** |  | |

### Return type

**Dashboard**


## unassignDashboardFromPublicCustomer

> Dashboard unassignDashboardFromPublicCustomer(dashboardId)

Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer)

Unassigns the dashboard from a special, auto-generated 'Public' Customer. Once unassigned, unauthenticated users may no longer browse the dashboard. Returns the Dashboard object.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Dashboard**


## updateDashboardCustomers

> Dashboard updateDashboardCustomers(dashboardId, requestBody)

Update the Dashboard Customers (updateDashboardCustomers)

Updates the list of Customers that this Dashboard is assigned to. Removes previous assignments to customers that are not in the provided list. Returns the Dashboard object.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | [optional] |

### Return type

**Dashboard**

