# SelfRegistrationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebSelfRegistrationParams**](SelfRegistrationControllerApi.md#deleteWebSelfRegistrationParams) | **DELETE** /api/selfRegistration/selfRegistrationParams | deleteWebSelfRegistrationParams |
| [**getPrivacyPolicy**](SelfRegistrationControllerApi.md#getPrivacyPolicy) | **GET** /api/noauth/selfRegistration/privacyPolicy | Get Privacy Policy for Self Registration form (getPrivacyPolicy) |
| [**getSignUpSelfRegistrationParams**](SelfRegistrationControllerApi.md#getSignUpSelfRegistrationParams) | **GET** /api/noauth/selfRegistration/signUpSelfRegistrationParams | Get Self Registration form parameters without authentication (getSignUpSelfRegistrationParams) |
| [**getTermsOfUse**](SelfRegistrationControllerApi.md#getTermsOfUse) | **GET** /api/noauth/selfRegistration/termsOfUse | Get Terms of Use for Self Registration form (getTermsOfUse) |
| [**getWebSelfRegistrationParams**](SelfRegistrationControllerApi.md#getWebSelfRegistrationParams) | **GET** /api/selfRegistration/selfRegistrationParams | Get Self Registration parameters (getSelfRegistrationParams) |
| [**saveWebSelfRegistrationParams**](SelfRegistrationControllerApi.md#saveWebSelfRegistrationParams) | **POST** /api/selfRegistration/selfRegistrationParams | Create Or Update Self Registration parameters (saveSelfRegistrationParams) |



## deleteWebSelfRegistrationParams

> deleteWebSelfRegistrationParams()

deleteWebSelfRegistrationParams

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


## getPrivacyPolicy

> String getPrivacyPolicy(pkgName, platform)

Get Privacy Policy for Self Registration form (getPrivacyPolicy)

Fetch the Privacy Policy based on the domain name from the request. Available for non-authorized users. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**|  | [optional] |
| **platform** | [**PlatformType**](.md)|  | [optional] [enum: WEB, ANDROID, IOS] |

### Return type

**String**

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


## getSignUpSelfRegistrationParams

> SignUpSelfRegistrationParams getSignUpSelfRegistrationParams(pkgName, platformType)

Get Self Registration form parameters without authentication (getSignUpSelfRegistrationParams)

Fetch the Self Registration parameters based on the domain name from the request. Available for non-authorized users. Contains the information to customize the sign-up form.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**|  | [optional] |
| **platformType** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

[**SignUpSelfRegistrationParams**](SignUpSelfRegistrationParams.md)

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


## getTermsOfUse

> String getTermsOfUse(pkgName, platform)

Get Terms of Use for Self Registration form (getTermsOfUse)

Fetch the Terms of Use based on the domain name from the request. Available for non-authorized users. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**|  | [optional] |
| **platform** | [**PlatformType**](.md)|  | [optional] [enum: WEB, ANDROID, IOS] |

### Return type

**String**

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


## getWebSelfRegistrationParams

> SelfRegistrationParams getWebSelfRegistrationParams()

Get Self Registration parameters (getSelfRegistrationParams)

Fetch the Self Registration parameters object for the tenant of the current user.   Available for users with &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;READ&#39; permission for the white labeling resource.

### Parameters

This endpoint does not need any parameter.

### Return type

[**SelfRegistrationParams**](SelfRegistrationParams.md)

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


## saveWebSelfRegistrationParams

> WebSelfRegistrationParams saveWebSelfRegistrationParams(webSelfRegistrationParams)

Create Or Update Self Registration parameters (saveSelfRegistrationParams)

Creates or Updates the Self Registration parameters. When creating, platform generates Admin Settings Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Admin Settings Id will be present in the response. Specify existing Admin Settings Id to update the Self Registration parameters. Referencing non-existing Admin Settings Id will cause &#39;Not Found&#39; error.  Self Registration allows users to signup for using the platform and automatically create a Customer account for them. You may configure default dashboard and user roles that will be assigned for this Customer. This allows you to build out-of-the-box solutions for customers. Ability to white-label the login and main pages helps to brand the platform.  Available for users with &#39;TENANT_ADMIN&#39; authority.  Security check is performed to verify that the user has &#39;WRITE&#39; permission for the white labeling resource.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webSelfRegistrationParams** | [**WebSelfRegistrationParams**](WebSelfRegistrationParams.md)|  | |

### Return type

[**WebSelfRegistrationParams**](WebSelfRegistrationParams.md)

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

