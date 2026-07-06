# MobileAppBundleControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteMobileAppBundle(DeleteMobileAppBundleArgs args) // Delete Mobile App Bundle by ID (deleteMobileAppBundle)
MobileAppBundleInfo getMobileAppBundleInfoById(GetMobileAppBundleInfoByIdArgs args) // Get mobile app bundle info by id (getMobileAppBundleInfoById)
PageDataMobileAppBundleInfo getTenantMobileAppBundleInfos(GetTenantMobileAppBundleInfosArgs args) // Get mobile app bundle infos (getTenantMobileAppBundleInfos)
MobileAppBundle saveMobileAppBundle(SaveMobileAppBundleArgs args) // Save Or update Mobile app bundle (saveMobileAppBundle)
void updateMobileAppBundleOauth2Clients(UpdateMobileAppBundleOauth2ClientsArgs args) // Update oauth2 clients (updateMobileAppBundleOauth2Clients)
```


## deleteMobileAppBundle

**DELETE** `/api/mobile/bundle/{id}`

Delete Mobile App Bundle by ID (deleteMobileAppBundle)

Deletes Mobile App Bundle by ID. Referencing non-existing mobile app bundle Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void deleteMobileAppBundle(DeleteMobileAppBundleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteMobileAppBundleArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteMobileAppBundleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## getMobileAppBundleInfoById

**GET** `/api/mobile/bundle/info/{id}`

Get mobile app bundle info by id (getMobileAppBundleInfoById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
MobileAppBundleInfo getMobileAppBundleInfoById(GetMobileAppBundleInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetMobileAppBundleInfoByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetMobileAppBundleInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`MobileAppBundleInfo`


## getTenantMobileAppBundleInfos

**GET** `/api/mobile/bundle/infos`

Get mobile app bundle infos (getTenantMobileAppBundleInfos)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
PageDataMobileAppBundleInfo getTenantMobileAppBundleInfos(GetTenantMobileAppBundleInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantMobileAppBundleInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetTenantMobileAppBundleInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on app's name | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataMobileAppBundleInfo`


## saveMobileAppBundle

**POST** `/api/mobile/bundle`

Save Or update Mobile app bundle (saveMobileAppBundle)

Create or update the Mobile app bundle that represents tha pair of ANDROID and IOS app and mobile settings like oauth2 clients, self-registration and layout configuration.When creating mobile app bundle, platform generates Mobile App Bundle Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Mobile App Bundle Id will be present in the response. Referencing non-existing Mobile App Bundle Id will cause 'Not Found' error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
MobileAppBundle saveMobileAppBundle(SaveMobileAppBundleArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveMobileAppBundleArgs.builder()
        .mobileAppBundle(MobileAppBundle)
        .build()
```

### `SaveMobileAppBundleArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `mobileAppBundle` | `MobileAppBundle` | **yes** |  | |
| `oauth2ClientIds` | `List<String>` | no | A list of oauth2 client ids, separated by comma ',' | |

### Return type

`MobileAppBundle`


## updateMobileAppBundleOauth2Clients

**PUT** `/api/mobile/bundle/{id}/oauth2Clients`

Update oauth2 clients (updateMobileAppBundleOauth2Clients)

Update oauth2 clients of the specified mobile app bundle.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

```java
void updateMobileAppBundleOauth2Clients(UpdateMobileAppBundleOauth2ClientsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateMobileAppBundleOauth2ClientsArgs.builder()
        .id(UUID)
        .UUID(List<UUID>)
        .build()
```

### `UpdateMobileAppBundleOauth2ClientsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |
| `UUID` | `List<UUID>` | **yes** |  | |

### Return type

null (empty response body)

