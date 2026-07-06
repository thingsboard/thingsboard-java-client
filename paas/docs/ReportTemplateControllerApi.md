# ReportTemplateControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteReportTemplate(DeleteReportTemplateArgs args) // Delete Report Template (deleteReportTemplate)
PageDataReportTemplateInfo getAllReportTemplateInfos(GetAllReportTemplateInfosArgs args) // Get All Report Templates for current user (getAllReportTemplateInfos)
ReportTemplate getReportTemplateById(GetReportTemplateByIdArgs args) // Get Report Template (getReportTemplateById)
ReportTemplateInfo getReportTemplateInfoById(GetReportTemplateInfoByIdArgs args) // Get Report Template Info (getReportTemplateInfoById)
List<ReportTemplateInfo> getReportTemplatesByIds(GetReportTemplatesByIdsArgs args) // Get report templates by Report Template Ids (getReportTemplatesByIds)
ReportTemplate saveReportTemplate(SaveReportTemplateArgs args) // Save Report Template (saveReportTemplate)
```


## deleteReportTemplate

**DELETE** `/api/reportTemplate/{reportTemplateId}`

Delete Report Template (deleteReportTemplate)

Deletes the report template. Referencing non-existing Report Template Id will cause 'Not Found' error.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteReportTemplate(DeleteReportTemplateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteReportTemplateArgs.builder()
        .reportTemplateId(String)
        .build()
```

### `DeleteReportTemplateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportTemplateId` | `String` | **yes** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllReportTemplateInfos

**GET** `/api/reportTemplateInfos/all`

Get All Report Templates for current user (getAllReportTemplateInfos)

Returns a page of report template info objects owned by the tenant or the customer of a current user. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the 'Model' tab of the Response Class for more details.  You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataReportTemplateInfo getAllReportTemplateInfos(GetAllReportTemplateInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllReportTemplateInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetAllReportTemplateInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `typeList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the ReportTemplateType enumeration value. | enum: `REPORT`, `SUB_REPORT` |
| `formatList` | `List<String>` | no | A list of string values separated by comma ',' representing one of the TbReportFormat enumeration value. | enum: `PDF`, `CSV` |
| `includeCustomers` | `Boolean` | no | Include customer or sub-customer entities | |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the report template name or customer title. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `ownerName` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataReportTemplateInfo`


## getReportTemplateById

**GET** `/api/reportTemplate/{reportTemplateId}`

Get Report Template (getReportTemplateById)

Fetch the ReportTemplate object based on the provided report template Id. Report Template extends Report Template Info object and adds 'configuration' - a JSON structure of report template configuration. See the 'Model' tab of the Response Class for more details. Referencing non-existing Report Template Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
ReportTemplate getReportTemplateById(GetReportTemplateByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportTemplateByIdArgs.builder()
        .reportTemplateId(String)
        .build()
```

### `GetReportTemplateByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportTemplateId` | `String` | **yes** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`ReportTemplate`


## getReportTemplateInfoById

**GET** `/api/reportTemplate/info/{reportTemplateId}`

Get Report Template Info (getReportTemplateInfoById)

Fetch the ReportTemplateInfo object based on the provided report template Id. Report Templates allows you to create reports according to the report template configuration. Report service uses report template configuration to generate report. See the 'Model' tab of the Response Class for more details. Referencing non-existing Report Template Id will cause 'Not Found' error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
ReportTemplateInfo getReportTemplateInfoById(GetReportTemplateInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportTemplateInfoByIdArgs.builder()
        .reportTemplateId(String)
        .build()
```

### `GetReportTemplateInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportTemplateId` | `String` | **yes** | A string value representing the report template id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`ReportTemplateInfo`


## getReportTemplatesByIds

**GET** `/api/reportTemplates`

Get report templates by Report Template Ids (getReportTemplatesByIds)

Returns a list of ReportTemplateInfo objects based on the provided ids. Filters the list based on the user permissions.   Available for users with 'TENANT_ADMIN' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<ReportTemplateInfo> getReportTemplatesByIds(GetReportTemplatesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetReportTemplatesByIdsArgs.builder()
        .reportTemplateIds(List<String>)
        .build()
```

### `GetReportTemplatesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportTemplateIds` | `List<String>` | **yes** | A list of report template ids, separated by comma ',' | |

### Return type

`List<ReportTemplateInfo>`


## saveReportTemplate

**POST** `/api/reportTemplate`

Save Report Template (saveReportTemplate)

Creates or Updates report template. Report Template extends Report Template Info object and adds 'configuration' - a JSON structure of report template configuration. See the 'Model' tab of the Response Class for more details. When creating report template, platform generates report template Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created report template id will be present in the response. Specify existing report template id to update the report template. Referencing non-existing report template Id will cause 'Not Found' error. Remove 'id', 'tenantId' and optionally 'customerId' from the request body example (below) to create new Report Template entity.   Available for users with 'TENANT_ADMIN' authority.   Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
ReportTemplate saveReportTemplate(SaveReportTemplateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveReportTemplateArgs.builder()
        .reportTemplate(ReportTemplate)
        .build()
```

### `SaveReportTemplateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `reportTemplate` | `ReportTemplate` | **yes** |  | |

### Return type

`ReportTemplate`

