# ReportControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReport**](#createReport) | **POST** /api/v2/report | createReport |
| [**deleteReport**](#deleteReport) | **DELETE** /api/v2/report/{reportId} | Delete Report (deleteReport) |
| [**downloadReport**](#downloadReport) | **GET** /api/v2/report/{reportId}/download | downloadReport |
| [**getReportById**](#getReportById) | **GET** /api/v2/report/{reportId} | Get Report (getReportById) |
| [**getReportInfos**](#getReportInfos) | **GET** /api/v2/reportInfos/all | getReportInfos |
| [**getReports**](#getReports) | **GET** /api/v2/reports | getReports |
| [**getReports1**](#getReports1) | **GET** /api/v2/reportInfos | getReports |
| [**requestReport**](#requestReport) | **POST** /api/v2/report/request | requestReport |
| [**testReportAndDownload**](#testReportAndDownload) | **POST** /api/v2/report/test | Download test report (downloadTestReport) |



## createReport

> Report createReport(createReportRequest)

createReport

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createReportRequest** | **CreateReportRequest** |  | [optional] |


## deleteReport

> deleteReport(reportId)

Delete Report (deleteReport)

Deletes the report. Referencing non-existing Report Id will cause &#39;Not Found&#39; error.   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String** | A string value representing the report id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## downloadReport

> File downloadReport(reportId)

downloadReport

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **UUID** |  | |


## getReportById

> Report getReportById(reportId)

Get Report (getReportById)

Fetch the Report object based on the provided report Id. The platform uses Report to store generated reports information.Referencing non-existing Report Id will cause &#39;Not Found&#39; error.  Available for users with &#39;TENANT_ADMIN&#39; authority.   Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String** | A string value representing the report id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getReportInfos

> PageDataReportInfo getReportInfos(pageSize, page, reportTemplateId, userId, includeCustomers, textSearch, sortProperty, sortOrder)

getReportInfos

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **reportTemplateId** | **UUID** | Report template id | [optional] |
| **userId** | **UUID** | The user used for report generation. | [optional] |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on report&#39;s name or customer title | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |


## getReports

> PageDataReport getReports(pageSize, page, textSearch, sortProperty, sortOrder)

getReports

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive &#39;substring&#39; filter based on report&#39;s name or customer title | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |


## getReports1

> List&lt;ReportInfo&gt; getReports1(strReportIds)

getReports

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **strReportIds** | **List&lt;String&gt;** | A list of report ids, separated by comma &#39;,&#39; | |


## requestReport

> Job requestReport(reportRequest)

requestReport

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportRequest** | **ReportRequest** |  | |


## testReportAndDownload

> File testReportAndDownload(reportRequest)

Download test report (downloadTestReport)

Generate and download test report.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportRequest** | **ReportRequest** |  | |

