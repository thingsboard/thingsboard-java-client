# QrCodeSettingsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplicationRedirect**](QrCodeSettingsControllerApi.md#getApplicationRedirect) | **GET** /api/noauth/qr | getApplicationRedirect |
| [**getMergedMobileAppSettings**](QrCodeSettingsControllerApi.md#getMergedMobileAppSettings) | **GET** /api/mobile/qr/merged | Get QR code configuration for home page (getMobileAppQrCodeConfig) |
| [**getMobileAppDeepLink**](QrCodeSettingsControllerApi.md#getMobileAppDeepLink) | **GET** /api/mobile/qr/deepLink | Get the deep link to the associated mobile application (getMobileAppDeepLink) |
| [**getQrCodeSettings**](QrCodeSettingsControllerApi.md#getQrCodeSettings) | **GET** /api/mobile/qr/settings | Get Mobile application settings (getMobileAppSettings) |
| [**getUserTokenByMobileSecret**](QrCodeSettingsControllerApi.md#getUserTokenByMobileSecret) | **GET** /api/noauth/qr/{secret} | Get User Token (getUserTokenByMobileSecret) |
| [**saveQrCodeSettings**](QrCodeSettingsControllerApi.md#saveQrCodeSettings) | **POST** /api/mobile/qr/settings | Create Or Update the Mobile application settings (saveMobileAppSettings) |



## getApplicationRedirect

> Object getApplicationRedirect(userAgent)

getApplicationRedirect

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userAgent** | **String**|  | |

### Return type

**Object**

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


## getMergedMobileAppSettings

> QrCodeSettings getMergedMobileAppSettings()

Get QR code configuration for home page (getMobileAppQrCodeConfig)

The response payload contains ui configuration of qr code  Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**QrCodeSettings**](QrCodeSettings.md)

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


## getMobileAppDeepLink

> String getMobileAppDeepLink()

Get the deep link to the associated mobile application (getMobileAppDeepLink)

Fetch the url that takes user to linked mobile application   Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getQrCodeSettings

> QrCodeSettings getQrCodeSettings()

Get Mobile application settings (getMobileAppSettings)

The response payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for any authorized user. 

### Parameters

This endpoint does not need any parameter.

### Return type

[**QrCodeSettings**](QrCodeSettings.md)

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


## getUserTokenByMobileSecret

> JwtPair getUserTokenByMobileSecret(secret)

Get User Token (getUserTokenByMobileSecret)

Returns the token of the User based on the provided secret key.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **secret** | **String**| A string value representing short-lived secret key | |

### Return type

[**JwtPair**](JwtPair.md)

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


## saveQrCodeSettings

> QrCodeSettings saveQrCodeSettings(qrCodeSettings)

Create Or Update the Mobile application settings (saveMobileAppSettings)

The request payload contains configuration for android/iOS applications and platform qr code widget settings.  Available for users with &#39;SYS_ADMIN&#39; or &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **qrCodeSettings** | [**QrCodeSettings**](QrCodeSettings.md)|  | |

### Return type

[**QrCodeSettings**](QrCodeSettings.md)

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

