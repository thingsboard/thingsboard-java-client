# ReportControllerApi

`ThingsboardClient` methods:

```
Report createReport(@Nullable CreateReportRequest createReportRequest) // createReport
void deleteReport(@Nonnull String reportId) // Delete Report (deleteReport)
File downloadReport(@Nonnull UUID reportId) // downloadReport
Report getReportById(@Nonnull String reportId) // Get Report (getReportById)
PageDataReportInfo getReportInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable UUID reportTemplateId, @Nullable UUID userId, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // getReportInfos
List<ReportInfo> getReportInfosByIds(@Nonnull List<String> strReportIds) // getReportInfosByIds
PageDataReport getReports(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // getReports
Job requestReport(@Nonnull ReportRequest reportRequest) // requestReport
File testReportAndDownload(@Nonnull ReportRequest reportRequest) // Download test report (testReportAndDownload)
```


## createReport

```
Report createReport(@Nullable CreateReportRequest createReportRequest)
```

**POST** `/api/v2/report`

createReport


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createReportRequest** | **CreateReportRequest** |  | [optional] |

### Return type

**Report**


## deleteReport

```
void deleteReport(@Nonnull String reportId)
```

**DELETE** `/api/v2/report/{reportId}`

Delete Report (deleteReport)

Deletes the report. Referencing non-existing Report Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String** | A string value representing the report id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## downloadReport

```
File downloadReport(@Nonnull UUID reportId)
```

**GET** `/api/v2/report/{reportId}/download`

downloadReport


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **UUID** |  | |

### Return type

**File**


## getReportById

```
Report getReportById(@Nonnull String reportId)
```

**GET** `/api/v2/report/{reportId}`

Get Report (getReportById)

Fetch the Report object based on the provided report Id. The platform uses Report to store generated reports information.Referencing non-existing Report Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String** | A string value representing the report id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**Report**


## getReportInfos

```
PageDataReportInfo getReportInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable UUID reportTemplateId, @Nullable UUID userId, @Nullable Boolean includeCustomers, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/v2/reportInfos/all`

getReportInfos


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **reportTemplateId** | **UUID** | Report template id | [optional] |
| **userId** | **UUID** | The user used for report generation. | [optional] |
| **includeCustomers** | **Boolean** | Include customer or sub-customer entities | [optional] |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on report's name or customer title | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataReportInfo**


## getReportInfosByIds

```
List<ReportInfo> getReportInfosByIds(@Nonnull List<String> strReportIds)
```

**GET** `/api/v2/reportInfos`

getReportInfosByIds


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **strReportIds** | **List<String>** | A list of report ids, separated by comma ',' | |

### Return type

**List<ReportInfo>**


## getReports

```
PageDataReport getReports(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/v2/reports`

getReports


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on report's name or customer title | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataReport**


## requestReport

```
Job requestReport(@Nonnull ReportRequest reportRequest)
```

**POST** `/api/v2/report/request`

requestReport


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportRequest** | **ReportRequest** |  | |

### Return type

**Job**


## testReportAndDownload

```
File testReportAndDownload(@Nonnull ReportRequest reportRequest)
```

**POST** `/api/v2/report/test`

Download test report (testReportAndDownload)

Generate and download test report.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportRequest** | **ReportRequest** |  | |

### Return type

**File**

