# BlobEntityControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteBlobEntity(DeleteBlobEntityArgs args) // Delete Blob Entity (deleteBlobEntity)
File downloadBlobEntity(DownloadBlobEntityArgs args) // Download Blob Entity By Id (downloadBlobEntity)
PageDataBlobEntityWithCustomerInfo getBlobEntities(GetBlobEntitiesArgs args) // Get Blob Entities (getBlobEntities)
List<BlobEntityInfo> getBlobEntitiesByIds(GetBlobEntitiesByIdsArgs args) // Get Blob Entities By Ids (getBlobEntitiesByIds)
BlobEntityWithCustomerInfo getBlobEntityInfoById(GetBlobEntityInfoByIdArgs args) // Get Blob Entity With Customer Info (getBlobEntityInfoById)
```


## deleteBlobEntity

**DELETE** `/api/blobEntity/{blobEntityId}`

Delete Blob Entity (deleteBlobEntity)

Delete Blob entity based on the provided Blob entity Id. Referencing non-existing Blob entity Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.   Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteBlobEntity(DeleteBlobEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteBlobEntityArgs.builder()
        .blobEntityId(String)
        .build()
```

### `DeleteBlobEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `blobEntityId` | `String` | **yes** | A string value representing the blob entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## downloadBlobEntity

**GET** `/api/blobEntity/{blobEntityId}/download`

Download Blob Entity By Id (downloadBlobEntity)

Download report file based on the provided Blob entity Id. Referencing non-existing Blob entity Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
File downloadBlobEntity(DownloadBlobEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadBlobEntityArgs.builder()
        .blobEntityId(String)
        .build()
```

### `DownloadBlobEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `blobEntityId` | `String` | **yes** | A string value representing the blob entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`File`


## getBlobEntities

**GET** `/api/blobEntities`

Get Blob Entities (getBlobEntities)

Returns a page of BlobEntityWithCustomerInfo object that are available for the current user. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityWithCustomerInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.) and info about the customer(customerTitle, customerIsPublic) of the user that scheduled generation of the dashboard report. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataBlobEntityWithCustomerInfo getBlobEntities(GetBlobEntitiesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBlobEntitiesArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetBlobEntitiesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `type` | `String` | no | A string value representing the blob entity type. For example, 'report' | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the blob entity name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `contentType`, `customerTitle` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |
| `startTime` | `Long` | no | The start timestamp in milliseconds of the search time range over the BlobEntityWithCustomerInfo class field: 'createdTime'. | |
| `endTime` | `Long` | no | The end timestamp in milliseconds of the search time range over the BlobEntityWithCustomerInfo class field: 'createdTime'. | |

### Return type

`PageDataBlobEntityWithCustomerInfo`


## getBlobEntitiesByIds

**GET** `/api/blobEntities/list`

Get Blob Entities By Ids (getBlobEntitiesByIds)

Requested blob entities must be owned by tenant or assigned to customer which user is performing the request. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.). See the 'Model' tab of the Response Class for more details.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<BlobEntityInfo> getBlobEntitiesByIds(GetBlobEntitiesByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBlobEntitiesByIdsArgs.builder()
        .blobEntityIds(List<String>)
        .build()
```

### `GetBlobEntitiesByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `blobEntityIds` | `List<String>` | **yes** | A list of blob entity ids, separated by comma ',' | |

### Return type

`List<BlobEntityInfo>`


## getBlobEntityInfoById

**GET** `/api/blobEntity/info/{blobEntityId}`

Get Blob Entity With Customer Info (getBlobEntityInfoById)

Fetch the BlobEntityWithCustomerInfo object based on the provided Blob entity Id. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityWithCustomerInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.) and info about the customer(customerTitle, customerIsPublic) of the user that scheduled generation of the dashboard report. Referencing non-existing Blob entity Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
BlobEntityWithCustomerInfo getBlobEntityInfoById(GetBlobEntityInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetBlobEntityInfoByIdArgs.builder()
        .blobEntityId(String)
        .build()
```

### `GetBlobEntityInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `blobEntityId` | `String` | **yes** | A string value representing the blob entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`BlobEntityWithCustomerInfo`

