# ReportTemplateControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReportTemplate**](#deleteReportTemplate) | **DELETE** /api/reportTemplate/{reportTemplateId} | Delete Report Template (deleteReportTemplate) |
| [**getAllReportTemplateInfos**](#getAllReportTemplateInfos) | **GET** /api/reportTemplateInfos/all | Get All Report Templates for current user (getAllReportTemplateInfos) |
| [**getReportTemplateById**](#getReportTemplateById) | **GET** /api/reportTemplate/{reportTemplateId} | Get Report Template (getReportTemplateById) |
| [**getReportTemplateInfoById**](#getReportTemplateInfoById) | **GET** /api/reportTemplate/info/{reportTemplateId} | Get Report Template Info (getReportTemplateInfoById) |
| [**getReportTemplatesByIds**](#getReportTemplatesByIds) | **GET** /api/reportTemplates | Get report templates by Report Template Ids (getReportTemplatesByIds) |
| [**saveReportTemplate**](#saveReportTemplate) | **POST** /api/reportTemplate | Save Report Template (saveReportTemplate) |



## deleteReportTemplate

> deleteReportTemplate(reportTemplateId)

Delete Report Template (deleteReportTemplate)

Deletes the report template. Referencing non-existing Report Template Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllReportTemplateInfos

> PageDataReportTemplateInfo getAllReportTemplateInfos(pageSize, page, typeList, formatList, includeCustomers, textSearch, sortProperty, sortOrder)

Get All Report Templates for current user (getAllReportTemplateInfos)

Returns a page of report template info objects owned by the tenant or the customer of a current user. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the 'Model' tab of the Response Class for more details.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **typeList** | **List<String>** | A list of string values separated by comma ',' representing one of the ReportTemplateType enumeration value. | [optional] [enum: REPORT, SUB_REPORT] |
| **formatList** | **List<String>** | A list of string values separated by comma ',' representing one of the TbReportFormat enumeration value. | [optional] [enum: PDF, CSV] |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the report template name or customer title. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, ownerName] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataReportTemplateInfo**


## getReportTemplateById

> ReportTemplate getReportTemplateById(reportTemplateId)

Get Report Template (getReportTemplateById)

Fetch the ReportTemplate object based on the provided report template Id. Report Template extends Report Template Info object and adds 'configuration' - a JSON structure of report template configuration. See the 'Model' tab of the Response Class for more details. Referencing non-existing Report Template Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**ReportTemplate**


## getReportTemplateInfoById

> ReportTemplateInfo getReportTemplateInfoById(reportTemplateId)

Get Report Template Info (getReportTemplateInfoById)

Fetch the ReportTemplateInfo object based on the provided report template Id. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the 'Model' tab of the Response Class for more details. Referencing non-existing Report Template Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateId** | **String** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**ReportTemplateInfo**


## getReportTemplatesByIds

> List<ReportTemplateInfo> getReportTemplatesByIds(reportTemplateIds)

Get report templates by Report Template Ids (getReportTemplatesByIds)

Returns a list of ReportTemplateInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplateIds** | **List<String>** | A list of report template ids, separated by comma ',' | |

### Return type

**List<ReportTemplateInfo>**


## saveReportTemplate

> ReportTemplate saveReportTemplate(reportTemplate)

Save Report Template (saveReportTemplate)

Creates or Updates report template. Report Template extends Report Template Info object and adds 'configuration' - a JSON structure of report template configuration. See the 'Model' tab of the Response Class for more details. When creating report template, platform generates report template Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created report template id will be present in the response. Specify existing report template id to update the report template. Referencing non-existing report template Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Report Template entity.   Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportTemplate** | **ReportTemplate** |  | |

### Return type

**ReportTemplate**

