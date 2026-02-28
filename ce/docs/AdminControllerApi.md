# AdminControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoCommitSettingsExists**](AdminControllerApi.md#autoCommitSettingsExists) | **GET** /api/admin/autoCommitSettings/exists | Check auto commit settings exists (autoCommitSettingsExists) |
| [**checkRepositoryAccess**](AdminControllerApi.md#checkRepositoryAccess) | **POST** /api/admin/repositorySettings/checkAccess | Check repository access (checkRepositoryAccess) |
| [**checkUpdates**](AdminControllerApi.md#checkUpdates) | **GET** /api/admin/updates | Check for new Platform Releases (checkUpdates) |
| [**codeProcessingUrl**](AdminControllerApi.md#codeProcessingUrl) | **GET** /api/admin/mail/oauth2/code | codeProcessingUrl |
| [**deleteAutoCommitSettings**](AdminControllerApi.md#deleteAutoCommitSettings) | **DELETE** /api/admin/autoCommitSettings | Delete auto commit settings (deleteAutoCommitSettings) |
| [**deleteRepositorySettings**](AdminControllerApi.md#deleteRepositorySettings) | **DELETE** /api/admin/repositorySettings | Delete repository settings (deleteRepositorySettings) |
| [**getAdminSettings**](AdminControllerApi.md#getAdminSettings) | **GET** /api/admin/settings/{key} | Get the Administration Settings object using key (getAdminSettings) |
| [**getAuthorizationUrl**](AdminControllerApi.md#getAuthorizationUrl) | **GET** /api/admin/mail/oauth2/authorize | Redirect user to mail provider login page.  |
| [**getAutoCommitSettings**](AdminControllerApi.md#getAutoCommitSettings) | **GET** /api/admin/autoCommitSettings | Get auto commit settings (getAutoCommitSettings) |
| [**getFeaturesInfo**](AdminControllerApi.md#getFeaturesInfo) | **GET** /api/admin/featuresInfo | Get features info (getFeaturesInfo) |
| [**getJwtSettings**](AdminControllerApi.md#getJwtSettings) | **GET** /api/admin/jwtSettings | Get the JWT Settings object (getJwtSettings) |
| [**getMailProcessingUrl**](AdminControllerApi.md#getMailProcessingUrl) | **GET** /api/admin/mail/oauth2/loginProcessingUrl | Get OAuth2 log in processing URL (getMailProcessingUrl) |
| [**getRepositorySettings**](AdminControllerApi.md#getRepositorySettings) | **GET** /api/admin/repositorySettings | Get repository settings (getRepositorySettings) |
| [**getRepositorySettingsInfo**](AdminControllerApi.md#getRepositorySettingsInfo) | **GET** /api/admin/repositorySettings/info | getRepositorySettingsInfo |
| [**getSecuritySettings**](AdminControllerApi.md#getSecuritySettings) | **GET** /api/admin/securitySettings | Get the Security Settings object (getSecuritySettings) |
| [**getSystemInfo**](AdminControllerApi.md#getSystemInfo) | **GET** /api/admin/systemInfo | Get system info (getSystemInfo) |
| [**repositorySettingsExists**](AdminControllerApi.md#repositorySettingsExists) | **GET** /api/admin/repositorySettings/exists | Check repository settings exists (repositorySettingsExists) |
| [**saveAdminSettings**](AdminControllerApi.md#saveAdminSettings) | **POST** /api/admin/settings | Creates or Updates the Administration Settings (saveAdminSettings) |
| [**saveAutoCommitSettings**](AdminControllerApi.md#saveAutoCommitSettings) | **POST** /api/admin/autoCommitSettings | Creates or Updates the auto commit settings (saveAutoCommitSettings) |
| [**saveJwtSettings**](AdminControllerApi.md#saveJwtSettings) | **POST** /api/admin/jwtSettings | Update JWT Settings (saveJwtSettings) |
| [**saveRepositorySettings**](AdminControllerApi.md#saveRepositorySettings) | **POST** /api/admin/repositorySettings | Creates or Updates the repository settings (saveRepositorySettings) |
| [**saveSecuritySettings**](AdminControllerApi.md#saveSecuritySettings) | **POST** /api/admin/securitySettings | Update Security Settings (saveSecuritySettings) |
| [**sendTestMail**](AdminControllerApi.md#sendTestMail) | **POST** /api/admin/settings/testMail | Send test email (sendTestMail) |
| [**sendTestSms**](AdminControllerApi.md#sendTestSms) | **POST** /api/admin/settings/testSms | Send test sms (sendTestSms) |



## autoCommitSettingsExists

> Boolean autoCommitSettingsExists()

Check auto commit settings exists (autoCommitSettingsExists)

Check whether the auto commit settings exists.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## checkRepositoryAccess

> checkRepositoryAccess(repositorySettings)

Check repository access (checkRepositoryAccess)

Attempts to check repository access.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | [**RepositorySettings**](RepositorySettings.md)|  | |

### Return type

null (empty response body)

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


## checkUpdates

> UpdateMessage checkUpdates()

Check for new Platform Releases (checkUpdates)

Check notifications about new platform releases.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**UpdateMessage**](UpdateMessage.md)

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


## codeProcessingUrl

> codeProcessingUrl(code, state)

codeProcessingUrl

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**|  | |
| **state** | **String**|  | |

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


## deleteAutoCommitSettings

> deleteAutoCommitSettings()

Delete auto commit settings (deleteAutoCommitSettings)

Deletes the auto commit settings.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

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


## deleteRepositorySettings

> deleteRepositorySettings()

Delete repository settings (deleteRepositorySettings)

Deletes the repository settings.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

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


## getAdminSettings

> AdminSettings getAdminSettings(key)

Get the Administration Settings object using key (getAdminSettings)

Get the Administration Settings object using specified string key. Referencing non-existing key will cause an error.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**| A string value of the key (e.g. &#39;general&#39; or &#39;mail&#39;). | |

### Return type

[**AdminSettings**](AdminSettings.md)

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


## getAuthorizationUrl

> String getAuthorizationUrl()

Redirect user to mail provider login page. 

After user logged in and provided accessprovider sends authorization code to specified redirect uri.)

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/text, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getAutoCommitSettings

> Map&lt;String, AutoVersionCreateConfig&gt; getAutoCommitSettings()

Get auto commit settings (getAutoCommitSettings)

Get the auto commit settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**Map&lt;String, AutoVersionCreateConfig&gt;**](AutoVersionCreateConfig.md)

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


## getFeaturesInfo

> FeaturesInfo getFeaturesInfo()

Get features info (getFeaturesInfo)

Get information about enabled/disabled features.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**FeaturesInfo**](FeaturesInfo.md)

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


## getJwtSettings

> JwtSettings getJwtSettings()

Get the JWT Settings object (getJwtSettings)

Get the JWT Settings object that contains JWT token policy, etc.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**JwtSettings**](JwtSettings.md)

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


## getMailProcessingUrl

> String getMailProcessingUrl()

Get OAuth2 log in processing URL (getMailProcessingUrl)

Returns the URL enclosed in double quotes. After successful authentication with OAuth2 provider and user consent for requested scope, it makes a redirect to this path so that the platform can do further log in processing and generating access tokens.   Available for users with &#39;SYS_ADMIN&#39; authority.

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


## getRepositorySettings

> RepositorySettings getRepositorySettings()

Get repository settings (getRepositorySettings)

Get the repository settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**RepositorySettings**](RepositorySettings.md)

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


## getRepositorySettingsInfo

> RepositorySettingsInfo getRepositorySettingsInfo()

getRepositorySettingsInfo

### Parameters

This endpoint does not need any parameter.

### Return type

[**RepositorySettingsInfo**](RepositorySettingsInfo.md)

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


## getSecuritySettings

> SecuritySettings getSecuritySettings()

Get the Security Settings object (getSecuritySettings)

Get the Security Settings object that contains password policy, etc.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**SecuritySettings**](SecuritySettings.md)

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


## getSystemInfo

> SystemInfo getSystemInfo()

Get system info (getSystemInfo)

Get main information about system.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**SystemInfo**](SystemInfo.md)

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


## repositorySettingsExists

> Boolean repositorySettingsExists()

Check repository settings exists (repositorySettingsExists)

Check whether the repository settings exists.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## saveAdminSettings

> AdminSettings saveAdminSettings(adminSettings)

Creates or Updates the Administration Settings (saveAdminSettings)

Creates or Updates the Administration Settings. Platform generates random Administration Settings Id during settings creation. The Administration Settings Id will be present in the response. Specify the Administration Settings Id when you would like to update the Administration Settings. Referencing non-existing Administration Settings Id will cause an error.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | [**AdminSettings**](AdminSettings.md)|  | |

### Return type

[**AdminSettings**](AdminSettings.md)

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


## saveAutoCommitSettings

> Map&lt;String, AutoVersionCreateConfig&gt; saveAutoCommitSettings(requestBody)

Creates or Updates the auto commit settings (saveAutoCommitSettings)

Creates or Updates the auto commit settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, AutoVersionCreateConfig&gt;**](AutoVersionCreateConfig.md)|  | |

### Return type

[**Map&lt;String, AutoVersionCreateConfig&gt;**](AutoVersionCreateConfig.md)

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


## saveJwtSettings

> JwtPair saveJwtSettings(jwtSettings)

Update JWT Settings (saveJwtSettings)

Updates the JWT Settings object that contains JWT token policy, etc. The tokenSigningKey field is a Base64 encoded string.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwtSettings** | [**JwtSettings**](JwtSettings.md)|  | |

### Return type

[**JwtPair**](JwtPair.md)

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


## saveRepositorySettings

> RepositorySettings saveRepositorySettings(repositorySettings)

Creates or Updates the repository settings (saveRepositorySettings)

Creates or Updates the repository settings object.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **repositorySettings** | [**RepositorySettings**](RepositorySettings.md)|  | |

### Return type

[**RepositorySettings**](RepositorySettings.md)

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


## saveSecuritySettings

> SecuritySettings saveSecuritySettings(securitySettings)

Update Security Settings (saveSecuritySettings)

Updates the Security Settings object that contains password policy, etc.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **securitySettings** | [**SecuritySettings**](SecuritySettings.md)|  | |

### Return type

[**SecuritySettings**](SecuritySettings.md)

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


## sendTestMail

> sendTestMail(adminSettings)

Send test email (sendTestMail)

Attempts to send test email to the System Administrator User using Mail Settings provided as a parameter. You may change the &#39;To&#39; email in the user profile of the System Administrator.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminSettings** | [**AdminSettings**](AdminSettings.md)|  | |

### Return type

null (empty response body)

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


## sendTestSms

> sendTestSms(testSmsRequest)

Send test sms (sendTestSms)

Attempts to send test sms to the System Administrator User using SMS Settings and phone number provided as a parameters of the request.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testSmsRequest** | [**TestSmsRequest**](TestSmsRequest.md)|  | |

### Return type

null (empty response body)

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

