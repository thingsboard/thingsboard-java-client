# DashboardControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDashboardCustomers**](DashboardControllerApi.md#addDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers/add | Adds the Dashboard Customers (addDashboardCustomers) |
| [**assignDashboardToCustomer**](DashboardControllerApi.md#assignDashboardToCustomer) | **POST** /api/customer/{customerId}/dashboard/{dashboardId} | Assign the Dashboard (assignDashboardToCustomer) |
| [**assignDashboardToEdge**](DashboardControllerApi.md#assignDashboardToEdge) | **POST** /api/edge/{edgeId}/dashboard/{dashboardId} | Assign dashboard to edge (assignDashboardToEdge) |
| [**assignDashboardToPublicCustomer**](DashboardControllerApi.md#assignDashboardToPublicCustomer) | **POST** /api/customer/public/dashboard/{dashboardId} | Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer) |
| [**deleteDashboard**](DashboardControllerApi.md#deleteDashboard) | **DELETE** /api/dashboard/{dashboardId} | Delete the Dashboard (deleteDashboard) |
| [**getCustomerDashboards**](DashboardControllerApi.md#getCustomerDashboards) | **GET** /api/customer/{customerId}/dashboards | Get Customer Dashboards (getCustomerDashboards) |
| [**getDashboardById**](DashboardControllerApi.md#getDashboardById) | **GET** /api/dashboard/{dashboardId} | Get Dashboard (getDashboardById) |
| [**getDashboardInfoById**](DashboardControllerApi.md#getDashboardInfoById) | **GET** /api/dashboard/info/{dashboardId} | Get Dashboard Info (getDashboardInfoById) |
| [**getDashboardsByIdsV2**](DashboardControllerApi.md#getDashboardsByIdsV2) | **GET** /api/dashboards/list | Get dashboards by Dashboard Ids (getDashboardsByIdsV2) |
| [**getEdgeDashboards**](DashboardControllerApi.md#getEdgeDashboards) | **GET** /api/edge/{edgeId}/dashboards | Get Edge Dashboards (getEdgeDashboards) |
| [**getHomeDashboard**](DashboardControllerApi.md#getHomeDashboard) | **GET** /api/dashboard/home | Get Home Dashboard (getHomeDashboard) |
| [**getHomeDashboardInfo**](DashboardControllerApi.md#getHomeDashboardInfo) | **GET** /api/dashboard/home/info | Get Home Dashboard Info (getHomeDashboardInfo) |
| [**getMaxDatapointsLimit**](DashboardControllerApi.md#getMaxDatapointsLimit) | **GET** /api/dashboard/maxDatapointsLimit | Get max data points limit (getMaxDatapointsLimit) |
| [**getServerTime**](DashboardControllerApi.md#getServerTime) | **GET** /api/dashboard/serverTime | Get server time (getServerTime) |
| [**getTenantDashboards**](DashboardControllerApi.md#getTenantDashboards) | **GET** /api/tenant/{tenantId}/dashboards | Get Tenant Dashboards by System Administrator (getTenantDashboards) |
| [**getTenantDashboards1**](DashboardControllerApi.md#getTenantDashboards1) | **GET** /api/tenant/dashboards | Get Tenant Dashboards (getTenantDashboards) |
| [**getTenantHomeDashboardInfo**](DashboardControllerApi.md#getTenantHomeDashboardInfo) | **GET** /api/tenant/dashboard/home/info | Get Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |
| [**removeDashboardCustomers**](DashboardControllerApi.md#removeDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers/remove | Remove the Dashboard Customers (removeDashboardCustomers) |
| [**saveDashboard**](DashboardControllerApi.md#saveDashboard) | **POST** /api/dashboard | Create Or Update Dashboard (saveDashboard) |
| [**setTenantHomeDashboardInfo**](DashboardControllerApi.md#setTenantHomeDashboardInfo) | **POST** /api/tenant/dashboard/home/info | Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo) |
| [**unassignDashboardFromCustomer**](DashboardControllerApi.md#unassignDashboardFromCustomer) | **DELETE** /api/customer/{customerId}/dashboard/{dashboardId} | Unassign the Dashboard (unassignDashboardFromCustomer) |
| [**unassignDashboardFromEdge**](DashboardControllerApi.md#unassignDashboardFromEdge) | **DELETE** /api/edge/{edgeId}/dashboard/{dashboardId} | Unassign dashboard from edge (unassignDashboardFromEdge) |
| [**unassignDashboardFromPublicCustomer**](DashboardControllerApi.md#unassignDashboardFromPublicCustomer) | **DELETE** /api/customer/public/dashboard/{dashboardId} | Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer) |
| [**updateDashboardCustomers**](DashboardControllerApi.md#updateDashboardCustomers) | **POST** /api/dashboard/{dashboardId}/customers | Update the Dashboard Customers (updateDashboardCustomers) |



## addDashboardCustomers

> Dashboard addDashboardCustomers(dashboardId, requestBody)

Adds the Dashboard Customers (addDashboardCustomers)

Adds the list of Customers to the existing list of assignments for the Dashboard. Keeps previous assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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


## assignDashboardToCustomer

> Dashboard assignDashboardToCustomer(customerId, dashboardId)

Assign the Dashboard (assignDashboardToCustomer)

Assign the Dashboard to specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Dashboard**](Dashboard.md)

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


## assignDashboardToEdge

> Dashboard assignDashboardToEdge(edgeId, dashboardId)

Assign dashboard to edge (assignDashboardToEdge)

Creates assignment of an existing dashboard to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment dashboard (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once dashboard will be delivered to edge service, it&#39;s going to be available for usage on remote edge instance.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**|  | |
| **dashboardId** | **String**|  | |

### Return type

[**Dashboard**](Dashboard.md)

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


## assignDashboardToPublicCustomer

> Dashboard assignDashboardToPublicCustomer(dashboardId)

Assign the Dashboard to Public Customer (assignDashboardToPublicCustomer)

Assigns the dashboard to a special, auto-generated &#39;Public&#39; Customer. Once assigned, unauthenticated users may browse the dashboard. This method is useful if you like to embed the dashboard on public web pages to be available for users that are not logged in. Be aware that making the dashboard public does not mean that it automatically makes all devices and assets you use in the dashboard to be public.Use [assign Asset to Public Customer](#!/asset-controller/assignAssetToPublicCustomerUsingPOST) and [assign Device to Public Customer](#!/device-controller/assignDeviceToPublicCustomerUsingPOST) for this purpose. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Dashboard**](Dashboard.md)

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


## deleteDashboard

> deleteDashboard(dashboardId)

Delete the Dashboard (deleteDashboard)

Delete the Dashboard.  Available for users with &#39;TENANT_ADMIN&#39; authority.

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


## getCustomerDashboards

> PageDataDashboardInfo getCustomerDashboards(customerId, pageSize, page, mobile, textSearch, sortProperty, sortOrder)

Get Customer Dashboards (getCustomerDashboards)

Returns a page of dashboard info objects owned by the specified customer. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
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


## getDashboardsByIdsV2

> List&lt;DashboardInfo&gt; getDashboardsByIdsV2(dashboardIds)

Get dashboards by Dashboard Ids (getDashboardsByIdsV2)

Returns a list of DashboardInfo objects based on the provided ids.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

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


## getEdgeDashboards

> PageDataDashboardInfo getEdgeDashboards(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Dashboards (getEdgeDashboards)

Returns a page of dashboard info objects assigned to the specified edge. The Dashboard Info object contains lightweight information about the dashboard (e.g. title, image, assigned customers) but does not contain the heavyweight configuration JSON. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
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

Returns the home dashboard info object that is configured as &#39;homeDashboardId&#39; parameter in the &#39;additionalInfo&#39; of the corresponding tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

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


## removeDashboardCustomers

> Dashboard removeDashboardCustomers(dashboardId, requestBody)

Remove the Dashboard Customers (removeDashboardCustomers)

Removes the list of Customers from the existing list of assignments for the Dashboard. Keeps other assignments to customers that are not in the provided list. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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


## saveDashboard

> Dashboard saveDashboard(dashboard, acceptEncoding)

Create Or Update Dashboard (saveDashboard)

Create or update the Dashboard. When creating dashboard, platform generates Dashboard Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Dashboard id will be present in the response. Specify existing Dashboard id to update the dashboard. Referencing non-existing dashboard Id will cause &#39;Not Found&#39; error. Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Dashboard entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboard** | [**Dashboard**](Dashboard.md)| A JSON value representing the dashboard. | |
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


## setTenantHomeDashboardInfo

> setTenantHomeDashboardInfo(homeDashboardInfo)

Update Tenant Home Dashboard Info (getTenantHomeDashboardInfo)

Update the home dashboard assignment for the current tenant.   Available for users with &#39;TENANT_ADMIN&#39; authority.

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


## unassignDashboardFromCustomer

> Dashboard unassignDashboardFromCustomer(customerId, dashboardId)

Unassign the Dashboard (unassignDashboardFromCustomer)

Unassign the Dashboard from specified Customer or do nothing if the Dashboard is already assigned to that Customer. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Dashboard**](Dashboard.md)

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


## unassignDashboardFromEdge

> Dashboard unassignDashboardFromEdge(edgeId, dashboardId)

Unassign dashboard from edge (unassignDashboardFromEdge)

Clears assignment of the dashboard to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove dashboard (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove dashboard locally.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**|  | |
| **dashboardId** | **String**|  | |

### Return type

[**Dashboard**](Dashboard.md)

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


## unassignDashboardFromPublicCustomer

> Dashboard unassignDashboardFromPublicCustomer(dashboardId)

Unassign the Dashboard from Public Customer (unassignDashboardFromPublicCustomer)

Unassigns the dashboard from a special, auto-generated &#39;Public&#39; Customer. Once unassigned, unauthenticated users may no longer browse the dashboard. Returns the Dashboard object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Dashboard**](Dashboard.md)

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


## updateDashboardCustomers

> Dashboard updateDashboardCustomers(dashboardId, requestBody)

Update the Dashboard Customers (updateDashboardCustomers)

Updates the list of Customers that this Dashboard is assigned to. Removes previous assignments to customers that are not in the provided list. Returns the Dashboard object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

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

