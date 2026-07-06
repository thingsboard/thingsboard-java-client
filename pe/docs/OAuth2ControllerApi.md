# OAuth2ControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteOauth2Client(DeleteOauth2ClientArgs args) // Delete oauth2 client (deleteOauth2Client)
PageDataOAuth2ClientInfo findOAuth2ClientInfos(FindOAuth2ClientInfosArgs args) // Get OAuth2 Client infos (findOAuth2ClientInfos)
List<OAuth2ClientInfo> findTenantOAuth2ClientInfosByIds(FindTenantOAuth2ClientInfosByIdsArgs args) // Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIds)
String getLoginProcessingUrl() // Get OAuth2 log in processing URL (getLoginProcessingUrl)
OAuth2Client getOAuth2ClientById(GetOAuth2ClientByIdArgs args) // Get OAuth2 Client by id (getOAuth2ClientById)
List<OAuth2ClientLoginInfo> getOAuth2Clients(GetOAuth2ClientsArgs args) // Get OAuth2 clients (getOAuth2Clients)
OAuth2Client saveOAuth2Client(SaveOAuth2ClientArgs args) // Save OAuth2 Client (saveOAuth2Client)
```


## deleteOauth2Client

**DELETE** `/api/oauth2/client/{id}`

Delete oauth2 client (deleteOauth2Client)

Deletes the oauth2 client. Referencing non-existing oauth2 client Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
void deleteOauth2Client(DeleteOauth2ClientArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteOauth2ClientArgs.builder()
        .id(UUID)
        .build()
```

### `DeleteOauth2ClientArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

null (empty response body)


## findOAuth2ClientInfos

**GET** `/api/oauth2/client/infos`

Get OAuth2 Client infos (findOAuth2ClientInfos)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
PageDataOAuth2ClientInfo findOAuth2ClientInfos(FindOAuth2ClientInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindOAuth2ClientInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `FindOAuth2ClientInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | Case-insensitive 'substring' filter based on client's title | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | |

### Return type

`PageDataOAuth2ClientInfo`


## findTenantOAuth2ClientInfosByIds

**GET** `/api/oauth2/client/list`

Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIds)

Fetch OAuth2 Client info objects based on the provided ids.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
List<OAuth2ClientInfo> findTenantOAuth2ClientInfosByIds(FindTenantOAuth2ClientInfosByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindTenantOAuth2ClientInfosByIdsArgs.builder()
        .clientIds(List<String>)
        .build()
```

### `FindTenantOAuth2ClientInfosByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `clientIds` | `List<String>` | **yes** | A list of oauth2 ids, separated by comma ',' | |

### Return type

`List<OAuth2ClientInfo>`


## getLoginProcessingUrl

**GET** `/api/oauth2/loginProcessingUrl`

Get OAuth2 log in processing URL (getLoginProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider, it makes a redirect to this path so that the platform can do further log in processing. This URL may be configured as 'security.oauth2.loginProcessingUrl' property in yml configuration file, or as 'SECURITY_OAUTH2_LOGIN_PROCESSING_URL' env variable. By default it is '/login/oauth2/code/'  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
String getLoginProcessingUrl()
```

### Return type

`String`


## getOAuth2ClientById

**GET** `/api/oauth2/client/{id}`

Get OAuth2 Client by id (getOAuth2ClientById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
OAuth2Client getOAuth2ClientById(GetOAuth2ClientByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOAuth2ClientByIdArgs.builder()
        .id(UUID)
        .build()
```

### `GetOAuth2ClientByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |

### Return type

`OAuth2Client`


## getOAuth2Clients

**POST** `/api/noauth/oauth2Clients`

Get OAuth2 clients (getOAuth2Clients)

Get the list of OAuth2 clients to log in with, available for such domain scheme (HTTP or HTTPS) (if x-forwarded-proto request header is present - the scheme is known from it) and domain name and port (port may be known from x-forwarded-port header)

```java
List<OAuth2ClientLoginInfo> getOAuth2Clients(GetOAuth2ClientsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOAuth2ClientsArgs.builder()
        .build()
```

### `GetOAuth2ClientsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pkgName` | `String` | no | Mobile application package name, to find OAuth2 clients where there is configured mobile application with such package name | |
| `platform` | `String` | no | Platform type to search OAuth2 clients for which the usage with this platform type is allowed in the settings. If platform type is not one of allowable values - it will just be ignored | enum: `WEB`, `ANDROID`, `IOS` |

### Return type

`List<OAuth2ClientLoginInfo>`


## saveOAuth2Client

**POST** `/api/oauth2/client`

Save OAuth2 Client (saveOAuth2Client)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
OAuth2Client saveOAuth2Client(SaveOAuth2ClientArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveOAuth2ClientArgs.builder()
        .oauth2Client(OAuth2Client)
        .build()
```

### `SaveOAuth2ClientArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `oauth2Client` | `OAuth2Client` | **yes** |  | |

### Return type

`OAuth2Client`

