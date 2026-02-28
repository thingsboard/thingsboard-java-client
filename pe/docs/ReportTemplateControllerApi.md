# ReportTemplateControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReportTemplate**](ReportTemplateControllerApi.md#deleteReportTemplate) | **DELETE** /api/reportTemplate/{reportTemplateId} | Delete Report Template (deleteReportTemplate) |
| [**getAllReportTemplateInfos**](ReportTemplateControllerApi.md#getAllReportTemplateInfos) | **GET** /api/reportTemplateInfos/all | Get All Report Templates for current user (getAllReportTemplateInfos) |
| [**getReportTemplateById**](ReportTemplateControllerApi.md#getReportTemplateById) | **GET** /api/reportTemplate/{reportTemplateId} | Get Report Template (getReportTemplateById) |
| [**getReportTemplateInfoById**](ReportTemplateControllerApi.md#getReportTemplateInfoById) | **GET** /api/reportTemplate/info/{reportTemplateId} | Get Report Template Info (getReportTemplateInfoById) |
| [**getReportTemplatesByIds**](ReportTemplateControllerApi.md#getReportTemplatesByIds) | **GET** /api/reportTemplates | Get report templates by Report Template Ids (getReportTemplatesByIds) |
| [**saveReportTemplate**](ReportTemplateControllerApi.md#saveReportTemplate) | **POST** /api/reportTemplate | Save Report Template (saveReportTemplate) |



## deleteReportTemplate

> deleteReportTemplate(reportTemplateId)

Delete Report Template (deleteReportTemplate)

Deletes the report template. Referencing non-existing Report Template Id will cause &#39;Not Found&#39; error.   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String**| A string value representing the report template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getAllReportTemplateInfos

> PageDataReportTemplateInfo getAllReportTemplateInfos(pageSize, page, typeList, formatList, includeCustomers, textSearch, sortProperty, sortOrder)

Get All Report Templates for current user (getAllReportTemplateInfos)

Returns a page of report template info objects owned by the tenant or the customer of a current user. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the &#39;Model&#39; tab of the Response Class for more details.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **typeList** | [**List&lt;String&gt;**](String.md)| A list of string values separated by comma &#39;,&#39; representing one of the ReportTemplateType enumeration value. | [optional] [enum: REPORT, SUB_REPORT] |
| **formatList** | [**List&lt;String&gt;**](String.md)| A list of string values separated by comma &#39;,&#39; representing one of the TbReportFormat enumeration value. | [optional] [enum: PDF, CSV] |
| **includeCustomers** | **Boolean**| Include customer or sub-customer entities | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the report template name or customer title. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, ownerName] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataReportTemplateInfo**](PageDataReportTemplateInfo.md)

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


## getReportTemplateById

> ReportTemplate getReportTemplateById(reportTemplateId)

Get Report Template (getReportTemplateById)

Fetch the ReportTemplate object based on the provided report template Id. Report Template extends Report Template Info object and adds &#39;configuration&#39; - a JSON structure of report template configuration. See the &#39;Model&#39; tab of the Response Class for more details. Referencing non-existing Report Template Id will cause &#39;Not Found&#39; error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String**| A string value representing the report template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**ReportTemplate**](ReportTemplate.md)

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


## getReportTemplateInfoById

> ReportTemplateInfo getReportTemplateInfoById(reportTemplateId)

Get Report Template Info (getReportTemplateInfoById)

Fetch the ReportTemplateInfo object based on the provided report template Id. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the &#39;Model&#39; tab of the Response Class for more details. Referencing non-existing Report Template Id will cause &#39;Not Found&#39; error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String**| A string value representing the report template id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**ReportTemplateInfo**](ReportTemplateInfo.md)

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


## getReportTemplatesByIds

> List&lt;ReportTemplateInfo&gt; getReportTemplatesByIds(reportTemplateIds)

Get report templates by Report Template Ids (getReportTemplatesByIds)

Returns a list of ReportTemplateInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with &#39;TENANT_ADMIN&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateIds** | [**List&lt;String&gt;**](String.md)| A list of report template ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;ReportTemplateInfo&gt;**](ReportTemplateInfo.md)

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


## saveReportTemplate

> ReportTemplate saveReportTemplate(reportTemplate)

Save Report Template (saveReportTemplate)

Creates or Updates report template. Report Template extends Report Template Info object and adds &#39;configuration&#39; - a JSON structure of report template configuration. See the &#39;Model&#39; tab of the Response Class for more details. When creating report template, platform generates report template Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created report template id will be present in the response. Specify existing report template id to update the report template. Referencing non-existing report template Id will cause &#39;Not Found&#39; error. Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Report Template entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.   Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplate** | [**ReportTemplate**](ReportTemplate.md)|  | |

### Return type

[**ReportTemplate**](ReportTemplate.md)

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

