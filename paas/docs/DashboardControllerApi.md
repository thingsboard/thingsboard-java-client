# DashboardControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDashboard**](DashboardControllerApi.md#deleteDashboard) | **DELETE** /api/dashboard/{dashboardId} | Delete the Dashboard (deleteDashboard) |
| [**exportGroupDashboards**](DashboardControllerApi.md#exportGroupDashboards) | **GET** /api/entityGroup/{entityGroupId}/dashboards/export | Export Dashboards (exportGroupDashboards) |
| [**getAllDashboards**](DashboardControllerApi.md#getAllDashboards) | **GET** /api/dashboards/all | Get All Dashboards for current user (getAllDashboards) |
| [**getCustomerDashboards**](DashboardControllerApi.md#getCustomerDashboards) | **GET** /api/customer/{customerId}/dashboards | Get Customer Dashboards (getCustomerDashboards) |
| [**getCustomerHomeDashboardInfo**](DashboardControllerApi.md#getCustomerHomeDashboardInfo) | **GET** /api/customer/dashboard/home/info | Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo) |
| [**getDashboardById**](DashboardControllerApi.md#getDashboardById) | **GET** /api/dashboard/{dashboardId} | Get Dashboard (getDashboardById) |
| [**getDashboardInfoById**](DashboardControllerApi.md#getDashboardInfoById) | **GET** /api/dashboard/info/{dashboardId} | Get Dashboard Info (getDashboardInfoById) |
| [**getDashboardsByEntityGroupId**](DashboardControllerApi.md#getDashboardsByEntityGroupId) | **GET** /api/entityGroup/{entityGroupId}/dashboards | Get dashboards by Entity Group Id (getDashboardsByEntityGroupId) |
| [**getDashboardsByIds**](DashboardControllerApi.md#getDashboardsByIds) | **GET** /api/dashboards | Get dashboards by Dashboard Ids (getDashboardsByIds) |
| [**getHomeDashboard**](DashboardControllerApi.md#getHomeDashboard) | **GET** /api/dashboard/home | Get Home Dashboard (getHomeDashboard) |
| [**getHomeDashboardInfo**](DashboardControllerApi.md#getHomeDashboardInfo) | **GET** /api/dashboard/home/info | Get Home Dashboard Info (getHomeDashboardInfo) |
| [**getMaxDatapointsLimit**](DashboardControllerApi.md#getMaxDatapointsLimit) | **GET** /api/dashboard/maxDatapointsLimit | Get max data points limit (getMaxDatapointsLimit) |
| [**getServerTime**](DashboardControllerApi.md#getServerTime) | **GET** /api/dashboard/serverTime | Get server time (getServerTime) |
| [**getTenantDashboards**](DashboardControllerApi.md#getTenantDashboards) | **GET** /api/tenant/{tenantId}/dashboards | Get Tenant Dashboards by System Administrator (getTenantDashboards) |
| [**getTenantDashboards1**](DashboardControllerApi.md#getTenantDashboards1) | **GET** /api/tenant/dashboards | Get Tenant Dashboards (getTenantDashboards) |
| [**getTenantHomeDashboardInfo**](DashboardControllerApi.md#getTenantHomeDashboardInfo) | **GET** /api/tenant/dashboard/home/info | Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |
| [**getUserDashboards**](DashboardControllerApi.md#getUserDashboards) | **GET** /api/user/dashboards | Get Dashboards (getUserDashboards) |
| [**importGroupDashboards**](DashboardControllerApi.md#importGroupDashboards) | **POST** /api/entityGroup/{entityGroupId}/dashboards/import | Import Dashboards (importGroupDashboards) |
| [**saveDashboard**](DashboardControllerApi.md#saveDashboard) | **POST** /api/dashboard | Create Or Update Dashboard (saveDashboard) |
| [**setCustomerHomeDashboardInfo**](DashboardControllerApi.md#setCustomerHomeDashboardInfo) | **POST** /api/customer/dashboard/home/info | Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo) |
| [**setTenantHomeDashboardInfo**](DashboardControllerApi.md#setTenantHomeDashboardInfo) | **POST** /api/tenant/dashboard/home/info | Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |



## deleteDashboard

> deleteDashboard(dashboardId)

Delete the Dashboard (deleteDashboard)

Delete the Dashboard. Only users with &#39;TENANT_ADMIN&#39;) authority may delete the dashboards.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## exportGroupDashboards

> List&lt;Dashboard&gt; exportGroupDashboards(entityGroupId, limit, acceptEncoding)

Export Dashboards (exportGroupDashboards)

Export the dashboards that belong to specified group id.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **limit** | **Integer**| Limit of the entities to export | |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**List&lt;Dashboard&gt;**](Dashboard.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getAllDashboards

> PageDataDashboardInfo getAllDashboards(pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get All Dashboards for current user (getAllDashboards)

Returns a page of dashboard info objects owned by the tenant or the customer of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean**| Include customer or sub-customer entities | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomerDashboards

> PageDataDashboardInfo getCustomerDashboards(customerId, pageSize, page, includeCustomers, textSearch, sortProperty, sortOrder)

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean**| Include customer or sub-customer entities | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getCustomerHomeDashboardInfo

> HomeDashboardInfo getCustomerHomeDashboardInfo()

Get Customer Home Dashboard Info (getCustomerHomeDashboardInfo)

Returns the home dashboard info object that is configured as &#39;homeDashboardId&#39; parameter in the &#39;additionalInfo&#39; of the corresponding customer.   Available for users with &#39;CUSTOMER_USER&#39; authority.  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

This endpoint does not need any parameter.

### Return type

[**HomeDashboardInfo**](HomeDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDashboardById

> getDashboardById(dashboardId, includeResources, acceptEncoding)

Get Dashboard (getDashboardById)

Get the dashboard based on &#39;dashboardId&#39; parameter. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **includeResources** | **Boolean**| Export used resources and replace resource links with resource metadata | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDashboardInfoById

> DashboardInfo getDashboardInfoById(dashboardId)

Get Dashboard Info (getDashboardInfoById)

Get the information about the dashboard based on &#39;dashboardId&#39; parameter. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**DashboardInfo**](DashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDashboardsByEntityGroupId

> PageDataDashboardInfo getDashboardsByEntityGroupId(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get dashboards by Entity Group Id (getDashboardsByEntityGroupId)

Returns a page of Dashboard objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDashboardsByIds

> List&lt;DashboardInfo&gt; getDashboardsByIds(dashboardIds)

Get dashboards by Dashboard Ids (getDashboardsByIds)

Returns a list of DashboardInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardIds** | [**List&lt;String&gt;**](String.md)| A list of dashboard ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;DashboardInfo&gt;**](DashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getHomeDashboard

> getHomeDashboard(acceptEncoding)

Get Home Dashboard (getHomeDashboard)

Returns the home dashboard object that is configured as &#39;homeDashboardId&#39; parameter in the &#39;additionalInfo&#39; of the User. If &#39;homeDashboardId&#39; parameter is not set on the User level and the User has authority &#39;CUSTOMER_USER&#39;, check the same parameter for the corresponding Customer. If &#39;homeDashboardId&#39; parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user. The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptEncoding** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getHomeDashboardInfo

> HomeDashboardInfo getHomeDashboardInfo()

Get Home Dashboard Info (getHomeDashboardInfo)

Returns the home dashboard info object that is configured as &#39;homeDashboardId&#39; parameter in the &#39;additionalInfo&#39; of the User. If &#39;homeDashboardId&#39; parameter is not set on the User level and the User has authority &#39;CUSTOMER_USER&#39;, check the same parameter for the corresponding Customer. If &#39;homeDashboardId&#39; parameter is not set on the User and Customer levels then checks the same parameter for the Tenant that owns the user.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**HomeDashboardInfo**](HomeDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getMaxDatapointsLimit

> Long getMaxDatapointsLimit()

Get max data points limit (getMaxDatapointsLimit)

Get the maximum number of data points that dashboard may request from the server per in a single subscription command. This value impacts the time window behavior. It impacts &#39;Max values&#39; parameter in case user selects &#39;None&#39; as &#39;Data aggregation function&#39;. It also impacts the &#39;Grouping interval&#39; in case of any other &#39;Data aggregation function&#39; is selected. The actual value of the limit is configurable in the system configuration file.

### Parameters

This endpoint does not need any parameter.

### Return type

**Long**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getServerTime

> Long getServerTime()

Get server time (getServerTime)

Get the server time (milliseconds since January 1, 1970 UTC). Used to adjust view of the dashboards according to the difference between browser and server time.

### Parameters

This endpoint does not need any parameter.

### Return type

**Long**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantDashboards

> PageDataDashboardInfo getTenantDashboards(tenantId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Dashboards by System Administrator (getTenantDashboards)

Returns a page of dashboard info objects owned by tenant. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantDashboards1

> PageDataDashboardInfo getTenantDashboards1(pageSize, page, mobile, textSearch, sortProperty, sortOrder)

Get Tenant Dashboards (getTenantDashboards)

Returns a page of dashboard info objects owned by the tenant of a current user. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **mobile** | **Boolean**| Exclude dashboards that are hidden for mobile | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantHomeDashboardInfo

> HomeDashboardInfo getTenantHomeDashboardInfo()

Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Returns the home dashboard info object that is configured as &#39;homeDashboardId&#39; parameter in the &#39;additionalInfo&#39; of the corresponding tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

This endpoint does not need any parameter.

### Return type

[**HomeDashboardInfo**](HomeDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getUserDashboards

> PageDataDashboardInfo getUserDashboards(pageSize, page, mobile, textSearch, sortProperty, sortOrder, operation, userId)

Get Dashboards (getUserDashboards)

Returns a page of Dashboard Info objects available for specified or current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **mobile** | **Boolean**| Exclude dashboards that are hidden for mobile | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the dashboard title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, title] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **operation** | **String**| Filter by allowed operations for the current user | [optional] |
| **userId** | **String**| A string value representing the user id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |

### Return type

[**PageDataDashboardInfo**](PageDataDashboardInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## importGroupDashboards

> importGroupDashboards(entityGroupId, dashboard, overwrite)

Import Dashboards (importGroupDashboards)

Import the dashboards to specified group.The Dashboard object is a heavyweight object that contains information about the dashboard (e.g. title, image, assigned customers) and also configuration JSON (e.g. layouts, widgets, entity aliases).  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **dashboard** | [**List&lt;Dashboard&gt;**](Dashboard.md)|  | |
| **overwrite** | **Boolean**| Overwrite dashboards with the same name | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveDashboard

> Dashboard saveDashboard(dashboard, entityGroupId, entityGroupIds, acceptEncoding)

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause &#39;Not Found&#39; error. Only users with &#39;TENANT_ADMIN&#39;) authority may create the dashboards.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Dashboard entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboard** | [**Dashboard**](Dashboard.md)| A JSON value representing the dashboard. | |
| **entityGroupId** | **String**|  | [optional] |
| **entityGroupIds** | [**List&lt;String&gt;**](String.md)| A list of entity group ids, separated by comma &#39;,&#39; | [optional] |
| **acceptEncoding** | **String**|  | [optional] |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## setCustomerHomeDashboardInfo

> setCustomerHomeDashboardInfo(homeDashboardInfo)

Update Customer Home Dashboard Info (setCustomerHomeDashboardInfo)

Update the home dashboard assignment for the current customer.   Available for users with &#39;CUSTOMER_USER&#39; authority.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **homeDashboardInfo** | [**HomeDashboardInfo**](HomeDashboardInfo.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## setTenantHomeDashboardInfo

> setTenantHomeDashboardInfo(homeDashboardInfo)

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **homeDashboardInfo** | [**HomeDashboardInfo**](HomeDashboardInfo.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

