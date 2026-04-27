# OAuth2ControllerApi

`ThingsboardClient` methods:

```
void deleteOauth2Client(@Nonnull UUID id) // Delete oauth2 client (deleteOauth2Client)
PageDataOAuth2ClientInfo findOAuth2ClientInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get OAuth2 Client infos (findOAuth2ClientInfos)
List<OAuth2ClientInfo> findTenantOAuth2ClientInfosByIds(@Nonnull List<String> clientIds) // Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIds)
String getLoginProcessingUrl() // Get OAuth2 log in processing URL (getLoginProcessingUrl)
OAuth2Client getOAuth2ClientById(@Nonnull UUID id) // Get OAuth2 Client by id (getOAuth2ClientById)
List<OAuth2ClientLoginInfo> getOAuth2Clients(@Nullable String pkgName, @Nullable String platform) // Get OAuth2 clients (getOAuth2Clients)
OAuth2Client saveOAuth2Client(@Nonnull OAuth2Client oauth2Client) // Save OAuth2 Client (saveOAuth2Client)
```


## deleteOauth2Client

```
void deleteOauth2Client(@Nonnull UUID id)
```

**DELETE** `/api/oauth2/client/{id}`

Delete oauth2 client (deleteOauth2Client)

Deletes the oauth2 client. Referencing non-existing oauth2 client Id will cause an error.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

null (empty response body)


## findOAuth2ClientInfos

```
PageDataOAuth2ClientInfo findOAuth2ClientInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/oauth2/client/infos`

Get OAuth2 Client infos (findOAuth2ClientInfos)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | Case-insensitive 'substring' filter based on client's title | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

**PageDataOAuth2ClientInfo**


## findTenantOAuth2ClientInfosByIds

```
List<OAuth2ClientInfo> findTenantOAuth2ClientInfosByIds(@Nonnull List<String> clientIds)
```

**GET** `/api/oauth2/client/list`

Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIds)

Fetch OAuth2 Client info objects based on the provided ids.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientIds** | **List<String>** | A list of oauth2 ids, separated by comma ',' | |

### Return type

**List<OAuth2ClientInfo>**


## getLoginProcessingUrl

```
String getLoginProcessingUrl()
```

**GET** `/api/oauth2/loginProcessingUrl`

Get OAuth2 log in processing URL (getLoginProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider, it makes a redirect to this path so that the platform can do further log in processing. This URL may be configured as 'security.oauth2.loginProcessingUrl' property in yml configuration file, or as 'SECURITY_OAUTH2_LOGIN_PROCESSING_URL' env variable. By default it is '/login/oauth2/code/'  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.

### Return type

**String**


## getOAuth2ClientById

```
OAuth2Client getOAuth2ClientById(@Nonnull UUID id)
```

**GET** `/api/oauth2/client/{id}`

Get OAuth2 Client by id (getOAuth2ClientById)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID** |  | |

### Return type

**OAuth2Client**


## getOAuth2Clients

```
List<OAuth2ClientLoginInfo> getOAuth2Clients(@Nullable String pkgName, @Nullable String platform)
```

**POST** `/api/noauth/oauth2Clients`

Get OAuth2 clients (getOAuth2Clients)

Get the list of OAuth2 clients to log in with, available for such domain scheme (HTTP or HTTPS) (if x-forwarded-proto request header is present - the scheme is known from it) and domain name and port (port may be known from x-forwarded-port header)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile application package name, to find OAuth2 clients where there is configured mobile application with such package name | [optional] |
| **platform** | **String** | Platform type to search OAuth2 clients for which the usage with this platform type is allowed in the settings. If platform type is not one of allowable values - it will just be ignored | [optional] [enum: WEB, ANDROID, IOS] |

### Return type

**List<OAuth2ClientLoginInfo>**


## saveOAuth2Client

```
OAuth2Client saveOAuth2Client(@Nonnull OAuth2Client oauth2Client)
```

**POST** `/api/oauth2/client`

Save OAuth2 Client (saveOAuth2Client)

  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2Client** | **OAuth2Client** |  | |

### Return type

**OAuth2Client**

