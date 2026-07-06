# MobileAppControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteMobileApp(DeleteMobileAppArgs args) // Delete Mobile App by ID (deleteMobileApp)
LoginMobileInfo getLoginMobileInfo(GetLoginMobileInfoArgs args) // Get mobile app login info (getLoginMobileInfo)
MobileApp getMobileAppById(GetMobileAppByIdArgs args) // Get mobile info by id (getMobileAppById)
PageDataMobileApp getTenantMobileApps(GetTenantMobileAppsArgs args) // Get mobile app infos (getTenantMobileApps)
UserMobileInfo getUserMobileInfo(GetUserMobileInfoArgs args) // Get user mobile app basic info (getUserMobileInfo)
MobileApp saveMobileApp(SaveMobileAppArgs args) // Save Or update Mobile app (saveMobileApp)
```


## deleteMobileApp

**DELETE** `/api/mobile/app/{id}`

Delete Mobile App by ID (deleteMobileApp)

Deletes Mobile App by ID. Referencing non-existing mobile app Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteMobileApp(DeleteMobileAppArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteMobileAppArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteMobileAppArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getLoginMobileInfo

**GET** `/api/noauth/mobile`

Get mobile app login info (getLoginMobileInfo)

```java
LoginMobileInfo getLoginMobileInfo(GetLoginMobileInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetLoginMobileInfoArgs.builder()
        .pkgName(String)
        .platform(String)
        .build()
```

### `GetLoginMobileInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | **yes** | Mobile application package name | |
| `platform` | `String` | **yes** | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`LoginMobileInfo`


## getMobileAppById

**GET** `/api/mobile/app/{id}`

Get mobile info by id (getMobileAppById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
MobileApp getMobileAppById(GetMobileAppByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetMobileAppByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetMobileAppByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`MobileApp`


## getTenantMobileApps

**GET** `/api/mobile/app`

Get mobile app infos (getTenantMobileApps)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataMobileApp getTenantMobileApps(GetTenantMobileAppsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantMobileAppsArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantMobileAppsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `platformType` | `PlatformType` | no | Platform type: ANDROID or IOS | enum: `WEB`, `ANDROID`, `IOS` |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on app's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataMobileApp`


## getUserMobileInfo

**GET** `/api/mobile`

Get user mobile app basic info (getUserMobileInfo)

  Available for any authorized user. 

```java
UserMobileInfo getUserMobileInfo(GetUserMobileInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetUserMobileInfoArgs.builder()
        .pkgName(String)
        .platform(String)
        .build()
```

### `GetUserMobileInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | **yes** | Mobile application package name | |
| `platform` | `String` | **yes** | Platform type | enum: `ANDROID`, `IOS` |

### Return type

`UserMobileInfo`


## saveMobileApp

**POST** `/api/mobile/app`

Save Or update Mobile app (saveMobileApp)

Create or update the Mobile app. When creating mobile app, platform generates Mobile App Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Id will be present in the response. Specify existing Mobile App Id to update the mobile app. Referencing non-existing Mobile App Id will cause 'Not Found' error.  The pair of mobile app package name and platform type is unique for entire platform setup.    Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
MobileApp saveMobileApp(SaveMobileAppArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveMobileAppArgs.builder()
        .mobileApp(MobileApp)
        .build()
```

### `SaveMobileAppArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `mobileApp` | `MobileApp` | **yes** |  | |

### Return type

`MobileApp`

