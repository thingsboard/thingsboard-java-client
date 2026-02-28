# DashboardReportControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadDashboardReport**](DashboardReportControllerApi.md#downloadDashboardReport) | **POST** /api/report/{dashboardId}/download | Download dashboard report (downloadDashboardReport) |
| [**downloadTestReport**](DashboardReportControllerApi.md#downloadTestReport) | **POST** /api/report/test | Download test report (downloadTestReport) |



## downloadDashboardReport

> File downloadDashboardReport(dashboardId, body)

Download dashboard report (downloadDashboardReport)

Generate and download a report from the specified dashboard. The request payload is a JSON object with params of report. For example:  &#x60;&#x60;&#x60;json {     \&quot;type\&quot;: \&quot;pdf\&quot;,     \&quot;timezone\&quot;: \&quot;Europe/Kiev\&quot;,     \&quot;timewindow\&quot;: {         \&quot;displayValue\&quot;: \&quot;\&quot;,         \&quot;hideInterval\&quot;: false,         \&quot;hideLastInterval\&quot;: false,         \&quot;hideQuickInterval\&quot;: false,         \&quot;hideAggregation\&quot;: false,         \&quot;hideAggInterval\&quot;: false,         \&quot;hideTimezone\&quot;: false,         \&quot;selectedTab\&quot;: 0,         \&quot;realtime\&quot;: {             \&quot;realtimeType\&quot;: 0,             \&quot;interval\&quot;: 1000,             \&quot;timewindowMs\&quot;: 60000,             \&quot;quickInterval\&quot;: \&quot;CURRENT_DAY\&quot;         },         \&quot;history\&quot;: {             \&quot;historyType\&quot;: 0,             \&quot;interval\&quot;: 1000,             \&quot;timewindowMs\&quot;: 60000,             \&quot;fixedTimewindow\&quot;: {                 \&quot;startTimeMs\&quot;: 1703687976592,                 \&quot;endTimeMs\&quot;: 1703774376592             },             \&quot;quickInterval\&quot;: \&quot;CURRENT_DAY\&quot;         },         \&quot;aggregation\&quot;: {             \&quot;type\&quot;: \&quot;AVG\&quot;,             \&quot;limit\&quot;: 25000         }     },     \&quot;state\&quot;: null } &#x60;&#x60;&#x60;   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardId** | **String**| A string value representing the dashboard id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **body** | **Object**|  | |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf, image/jpeg, image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## downloadTestReport

> File downloadTestReport(dashboardReportConfig, reportsServerEndpointUrl)

Download test report (downloadTestReport)

Generate and download test report.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardReportConfig** | [**DashboardReportConfig**](DashboardReportConfig.md)|  | |
| **reportsServerEndpointUrl** | **String**| A string value representing the report server endpoint. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/pdf, image/jpeg, image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

