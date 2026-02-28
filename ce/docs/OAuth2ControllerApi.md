# OAuth2ControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOauth2Client**](OAuth2ControllerApi.md#deleteOauth2Client) | **DELETE** /api/oauth2/client/{id} | Delete oauth2 client (deleteOauth2Client) |
| [**findTenantOAuth2ClientInfos**](OAuth2ControllerApi.md#findTenantOAuth2ClientInfos) | **GET** /api/oauth2/client/infos | Get OAuth2 Client infos (findTenantOAuth2ClientInfos) |
| [**findTenantOAuth2ClientInfosByIdsV2**](OAuth2ControllerApi.md#findTenantOAuth2ClientInfosByIdsV2) | **GET** /api/oauth2/client/list | Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIdsV2) |
| [**getLoginProcessingUrl**](OAuth2ControllerApi.md#getLoginProcessingUrl) | **GET** /api/oauth2/loginProcessingUrl | Get OAuth2 log in processing URL (getLoginProcessingUrl) |
| [**getOAuth2ClientById**](OAuth2ControllerApi.md#getOAuth2ClientById) | **GET** /api/oauth2/client/{id} | Get OAuth2 Client by id (getOAuth2ClientById) |
| [**getOAuth2Clients**](OAuth2ControllerApi.md#getOAuth2Clients) | **POST** /api/noauth/oauth2Clients | Get OAuth2 clients (getOAuth2Clients) |
| [**saveOAuth2Client**](OAuth2ControllerApi.md#saveOAuth2Client) | **POST** /api/oauth2/client | Save OAuth2 Client (saveOAuth2Client) |



## deleteOauth2Client

> deleteOauth2Client(id)

Delete oauth2 client (deleteOauth2Client)

Deletes the oauth2 client. Referencing non-existing oauth2 client Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findTenantOAuth2ClientInfos

> PageDataOAuth2ClientInfo findTenantOAuth2ClientInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get OAuth2 Client infos (findTenantOAuth2ClientInfos)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| Case-insensitive &#39;substring&#39; filter based on client&#39;s title | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] |

### Return type

[**PageDataOAuth2ClientInfo**](PageDataOAuth2ClientInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## findTenantOAuth2ClientInfosByIdsV2

> List&lt;OAuth2ClientInfo&gt; findTenantOAuth2ClientInfosByIdsV2(clientIds)

Get OAuth2 Client infos By Ids (findTenantOAuth2ClientInfosByIdsV2)

Fetch OAuth2 Client info objects based on the provided ids.   Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientIds** | [**List&lt;String&gt;**](String.md)| A list of oauth2 ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;OAuth2ClientInfo&gt;**](OAuth2ClientInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getLoginProcessingUrl

> String getLoginProcessingUrl()

Get OAuth2 log in processing URL (getLoginProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider, it makes a redirect to this path so that the platform can do further log in processing. This URL may be configured as &#39;security.oauth2.loginProcessingUrl&#39; property in yml configuration file, or as &#39;SECURITY_OAUTH2_LOGIN_PROCESSING_URL&#39; env variable. By default it is &#39;/login/oauth2/code/&#39;  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getOAuth2ClientById

> OAuth2Client getOAuth2ClientById(id)

Get OAuth2 Client by id (getOAuth2ClientById)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**OAuth2Client**](OAuth2Client.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getOAuth2Clients

> List&lt;OAuth2ClientLoginInfo&gt; getOAuth2Clients(pkgName, platform)

Get OAuth2 clients (getOAuth2Clients)

Get the list of OAuth2 clients to log in with, available for such domain scheme (HTTP or HTTPS) (if x-forwarded-proto request header is present - the scheme is known from it) and domain name and port (port may be known from x-forwarded-port header)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**| Mobile application package name, to find OAuth2 clients where there is configured mobile application with such package name | [optional] |
| **platform** | **String**| Platform type to search OAuth2 clients for which the usage with this platform type is allowed in the settings. If platform type is not one of allowable values - it will just be ignored | [optional] [enum: WEB, ANDROID, IOS] |

### Return type

[**List&lt;OAuth2ClientLoginInfo&gt;**](OAuth2ClientLoginInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveOAuth2Client

> OAuth2Client saveOAuth2Client(oauth2Client)

Save OAuth2 Client (saveOAuth2Client)

  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oauth2Client** | [**OAuth2Client**](OAuth2Client.md)|  | |

### Return type

[**OAuth2Client**](OAuth2Client.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

