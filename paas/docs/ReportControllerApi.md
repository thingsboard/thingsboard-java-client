# ReportControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Report createReport(CreateReportArgs args) // createReport
void deleteReport(DeleteReportArgs args) // Delete Report (deleteReport)
File downloadReport(DownloadReportArgs args) // downloadReport
Report getReportById(GetReportByIdArgs args) // Get Report (getReportById)
PageDataReportInfo getReportInfos(GetReportInfosArgs args) // getReportInfos
List<ReportInfo> getReportInfosByIds(GetReportInfosByIdsArgs args) // getReportInfosByIds
PageDataReport getReports(GetReportsArgs args) // getReports
Job requestReport(RequestReportArgs args) // requestReport
File testReportAndDownload(TestReportAndDownloadArgs args) // Download test report (testReportAndDownload)
```


## createReport

**POST** `/api/v2/report`

createReport

```java
Report createReport(CreateReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CreateReportArgs.builder()
        .build()
```

### `CreateReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `createReportRequest` | `CreateReportRequest` | no |  | |

### Return type

`Report`


## deleteReport

**DELETE** `/api/v2/report/{reportId}`

Delete Report (deleteReport)

Deletes the report. Referencing non-existing Report Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteReport(DeleteReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteReportArgs.builder()
        .reportId(String)
        .build()
```

### `DeleteReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportId` | `String` | **yes** | A string value representing the report id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## downloadReport

**GET** `/api/v2/report/{reportId}/download`

downloadReport

```java
File downloadReport(DownloadReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadReportArgs.builder()
        .reportId(UUID)
        .build()
```

### `DownloadReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportId` | `UUID` | **yes** |  | |

### Return type

`File`


## getReportById

**GET** `/api/v2/report/{reportId}`

Get Report (getReportById)

Fetch the Report object based on the provided report Id. The platform uses Report to store generated reports information.Referencing non-existing Report Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Report getReportById(GetReportByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportByIdArgs.builder()
        .reportId(String)
        .build()
```

### `GetReportByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportId` | `String` | **yes** | A string value representing the report id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Report`


## getReportInfos

**GET** `/api/v2/reportInfos/all`

getReportInfos

```java
PageDataReportInfo getReportInfos(GetReportInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetReportInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `reportTemplateId` | `UUID` | no | Report template id | |
| `userId` | `UUID` | no | The user used for report generation. | |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on report's name or customer title | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataReportInfo`


## getReportInfosByIds

**GET** `/api/v2/reportInfos`

getReportInfosByIds

```java
List<ReportInfo> getReportInfosByIds(GetReportInfosByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportInfosByIdsArgs.builder()
        .strReportIds(List<String>)
        .build()
```

### `GetReportInfosByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `strReportIds` | `List<String>` | **yes** | A list of report ids, separated by comma ',' | |

### Return type

`List<ReportInfo>`


## getReports

**GET** `/api/v2/reports`

getReports

```java
PageDataReport getReports(GetReportsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetReportsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on report's name or customer title | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataReport`


## requestReport

**POST** `/api/v2/report/request`

requestReport

```java
Job requestReport(RequestReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RequestReportArgs.builder()
        .reportRequest(ReportRequest)
        .build()
```

### `RequestReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportRequest` | `ReportRequest` | **yes** |  | |

### Return type

`Job`


## testReportAndDownload

**POST** `/api/v2/report/test`

Download test report (testReportAndDownload)

Generate and download test report.  Available for users with 'TENANT_ADMIN' authority.

```java
File testReportAndDownload(TestReportAndDownloadArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
TestReportAndDownloadArgs.builder()
        .reportRequest(ReportRequest)
        .build()
```

### `TestReportAndDownloadArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportRequest` | `ReportRequest` | **yes** |  | |

### Return type

`File`

