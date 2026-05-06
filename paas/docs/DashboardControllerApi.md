# DashboardControllerApi

`ThingsboardClient` methods:

```
void deleteDashboard(@Nonnull String dashboardId) // Delete the Dashboard (deleteDashboard)
List<Dashboard> exportGroupDashboards(@Nonnull String entityGroupId, @Nonnull Integer limit, @Nullable String acceptEncoding) // Export Dashboards (exportGroupDashboards)
PageDataDashboardInfo getAllDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get All Dashboards for current user (getAllDashboards)
PageDataDashboardInfo getCustomerDashboards(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Customer Dashboards (getCustomerDashboards)
HomeDashboardInfo getCustomerHomeDashboardInfo() // Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo)
Dashboard getDashboardById(@Nonnull String dashboardId, @Nullable Boolean includeResources, @Nullable String acceptEncoding) // Get Dashboard (getDashboardById)
DashboardInfo getDashboardInfoById(@Nonnull String dashboardId) // Get Dashboard Info (getDashboardInfoById)
PageDataDashboardInfo getDashboardsByEntityGroupId(@Nonnull String entityGroupId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get dashboards by Entity Group Id (getDashboardsByEntityGroupId)
List<DashboardInfo> getDashboardsByIds(@Nonnull List<String> dashboardIds) // Get dashboards by Dashboard Ids (getDashboardsByIds)
HomeDashboard getHomeDashboard(@Nullable String acceptEncoding) // Get Home Dashboard (getHomeDashboard)
HomeDashboardInfo getHomeDashboardInfo() // Get Home Dashboard Info (getHomeDashboardInfo)
Long getMaxDatapointsLimit() // Get max data points limit (getMaxDatapointsLimit)
Long getServerTime() // Get server time (getServerTime)
PageDataDashboardInfo getTenantDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean mobile, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Dashboards (getTenantDashboards)
PageDataDashboardInfo getTenantDashboardsByTenantId(@Nonnull String tenantId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Dashboards by System Administrator (getTenantDashboardsByTenantId)
HomeDashboardInfo getTenantHomeDashboardInfo() // Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
PageDataDashboardInfo getUserDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean mobile, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable String operation, @Nullable String userId) // Get Dashboards (getUserDashboards)
void importGroupDashboards(@Nonnull String entityGroupId, @Nonnull List<Dashboard> dashboard, @Nullable Boolean overwrite) // Import Dashboards (importGroupDashboards)
Dashboard saveDashboard(@Nonnull Dashboard dashboard, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds, @Nullable String acceptEncoding) // Create Or Update Dashboard (saveDashboard)
void setCustomerHomeDashboardInfo(@Nonnull HomeDashboardInfo homeDashboardInfo) // Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo)
void setTenantHomeDashboardInfo(@Nonnull HomeDashboardInfo homeDashboardInfo) // Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)
```


## deleteDashboard

```
void deleteDashboard(@Nonnull String dashboardId)
```

**DELETE** `/api/dashboard/{dashboardId}`

Delete the Dashboard (deleteDashboard)

Delete the Dashboard. Only users with 'TENANT_ADMIN') authority may delete the dashboards.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## exportGroupDashboards

```
List<Dashboard> exportGroupDashboards(@Nonnull String entityGroupId, @Nonnull Integer limit, @Nullable String acceptEncoding)
```

**GET** `/api/entityGroup/{entityGroupId}/dashboards/export`

Export Dashboards (exportGroupDashboards)

Export the dashboards that belong to specified group id.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **limit** | **Integer** | Limit of the entities to export | |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**List<Dashboard>**


## getAllDashboards

```
PageDataDashboardInfo getAllDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/dashboards/all`

Get All Dashboards for current user (getAllDashboards)

Returns a page of dashboard info objects owned by the tenant or the customer of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getCustomerDashboards

```
PageDataDashboardInfo getCustomerDashboards(@Nonnull String customerId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/customer/{customerId}/dashboards`

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getCustomerHomeDashboardInfo

```
HomeDashboardInfo getCustomerHomeDashboardInfo()
```

**GET** `/api/customer/dashboard/home/info`

Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding customer.   Available for users with 'CUSTOMER_USER' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

### Return type

**HomeDashboardInfo**


## getDashboardById

```
Dashboard getDashboardById(@Nonnull String dashboardId, @Nullable Boolean includeResources, @Nullable String acceptEncoding)
```

**GET** `/api/dashboard/{dashboardId}`

Get Dashboard (getDashboardById)

Get the dashboard based on 'dashboardId' parameter. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **includeResources** | **Boolean** | Export used resources and replace resource links with resource metadata | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**Dashboard**


## getDashboardInfoById

```
DashboardInfo getDashboardInfoById(@Nonnull String dashboardId)
```

**GET** `/api/dashboard/info/{dashboardId}`

Get Dashboard Info (getDashboardInfoById)

Get the information about the dashboard based on 'dashboardId' parameter. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**DashboardInfo**


## getDashboardsByEntityGroupId

```
PageDataDashboardInfo getDashboardsByEntityGroupId(@Nonnull String entityGroupId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/entityGroup/{entityGroupId}/dashboards`

Get dashboards by Entity Group Id (getDashboardsByEntityGroupId)

Returns a page of Dashboard objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataDashboardInfo**


## getDashboardsByIds

```
List<DashboardInfo> getDashboardsByIds(@Nonnull List<String> dashboardIds)
```

**GET** `/api/dashboards`

Get dashboards by Dashboard Ids (getDashboardsByIds)

Returns a list of DashboardInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardIds** | **List<String>** | A list of dashboard ids, separated by comma ',' | |

### Return type

**List<DashboardInfo>**


## getHomeDashboard

```
HomeDashboard getHomeDashboard(@Nullable String acceptEncoding)
```

**GET** `/api/dashboard/home`

Get Home Dashboard (getHomeDashboard)

Returns the home dashboard object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**HomeDashboard**


## getHomeDashboardInfo

```
HomeDashboardInfo getHomeDashboardInfo()
```

**GET** `/api/dashboard/home/info`

Get Home Dashboard Info (getHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the User. If 'homeDashboardId' parameter is not set on the User level and the User has authority 'CUSTOMER_USER', check the same parameter for the corresponding Customer. If 'homeDashboardId' parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**HomeDashboardInfo**


## getMaxDatapointsLimit

```
Long getMaxDatapointsLimit()
```

**GET** `/api/dashboard/maxDatapointsLimit`

Get max data points limit (getMaxDatapointsLimit)

Get the maximum number of data points that dashboard may request from the server per in a single subscription command. This value impacts the time window behavior. It impacts 'Max values' parameter in case user selects 'None' as 'Data aggregation function'. It also impacts the 'Grouping interval' in case of any other 'Data aggregation function' is selected. The actual value of the limit is configurable in the system configuration file.

### Return type

**Long**


## getServerTime

```
Long getServerTime()
```

**GET** `/api/dashboard/serverTime`

Get server time (getServerTime)

Get the server time (milliseconds since January 1, 1970 UTC). Used to adjust view of the dashboards according to the difference between browser and server time.

### Return type

**Long**


## getTenantDashboards

```
PageDataDashboardInfo getTenantDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean mobile, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/dashboards`

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


## getTenantDashboardsByTenantId

```
PageDataDashboardInfo getTenantDashboardsByTenantId(@Nonnull String tenantId, @Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenant/{tenantId}/dashboards`

Get Tenant Dashboards by System Administrator (getTenantDashboardsByTenantId)

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


## getTenantHomeDashboardInfo

```
HomeDashboardInfo getTenantHomeDashboardInfo()
```

**GET** `/api/tenant/dashboard/home/info`

Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Returns the home dashboard info object that is configured as 'homeDashboardId' parameter in the 'additionalInfo' of the corresponding tenant.   Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

### Return type

**HomeDashboardInfo**


## getUserDashboards

```
PageDataDashboardInfo getUserDashboards(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable Boolean mobile, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder, @Nullable String operation, @Nullable String userId)
```

**GET** `/api/user/dashboards`

Get Dashboards (getUserDashboards)

Returns a page of Dashboard Info objects available for specified or current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **mobile** | **Boolean** | Exclude dashboards that are hidden for mobile | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the dashboard title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **operation** | **String** | Filter by allowed operations for the current user | [optional] |
| **userId** | **String** | A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**PageDataDashboardInfo**


## importGroupDashboards

```
void importGroupDashboards(@Nonnull String entityGroupId, @Nonnull List<Dashboard> dashboard, @Nullable Boolean overwrite)
```

**POST** `/api/entityGroup/{entityGroupId}/dashboards/import`

Import Dashboards (importGroupDashboards)

Import the dashboards to specified group.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **dashboard** | **List<Dashboard>** |  | |
| **overwrite** | **Boolean** | Overwrite dashboards with the same name | [optional] [default to false] |

### Return type

null (empty response body)


## saveDashboard

```
Dashboard saveDashboard(@Nonnull Dashboard dashboard, @Nullable String entityGroupId, @Nullable List<String> entityGroupIds, @Nullable String acceptEncoding)
```

**POST** `/api/dashboard`

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause 'Not Found' error. Only users with 'TENANT_ADMIN') authority may create the dashboards.Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Dashboard entity.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboard** | **Dashboard** | A JSON value representing the dashboard. | |
| **entityGroupId** | **String** |  | [optional] |
| **entityGroupIds** | **List<String>** | A list of entity group ids, separated by comma ',' | [optional] |
| **acceptEncoding** | **String** |  | [optional] |

### Return type

**Dashboard**


## setCustomerHomeDashboardInfo

```
void setCustomerHomeDashboardInfo(@Nonnull HomeDashboardInfo homeDashboardInfo)
```

**POST** `/api/customer/dashboard/home/info`

Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo)

Update the home dashboard assignment for the current customer.   Available for users with 'CUSTOMER_USER' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **homeDashboardInfo** | **HomeDashboardInfo** |  | |

### Return type

null (empty response body)


## setTenantHomeDashboardInfo

```
void setTenantHomeDashboardInfo(@Nonnull HomeDashboardInfo homeDashboardInfo)
```

**POST** `/api/tenant/dashboard/home/info`

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **homeDashboardInfo** | **HomeDashboardInfo** |  | |

### Return type

null (empty response body)

