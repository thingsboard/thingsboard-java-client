# SignUpControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptPrivacyPolicy**](SignUpControllerApi.md#acceptPrivacyPolicy) | **POST** /api/signup/acceptPrivacyPolicy | Accept privacy policy (acceptPrivacyPolicy) |
| [**acceptPrivacyPolicyAndTermsOfUse**](SignUpControllerApi.md#acceptPrivacyPolicyAndTermsOfUse) | **POST** /api/signup/acceptPrivacyPolicyAndTermsOfUse | acceptPrivacyPolicyAndTermsOfUse |
| [**acceptTermsOfUse**](SignUpControllerApi.md#acceptTermsOfUse) | **POST** /api/signup/acceptTermsOfUse | Accept Terms of Use (acceptTermsOfUse) |
| [**activateCloudEmail**](SignUpControllerApi.md#activateCloudEmail) | **GET** /api/noauth/cloud/activateEmail | activateCloudEmail |
| [**activateCloudUserByEmailCode**](SignUpControllerApi.md#activateCloudUserByEmailCode) | **POST** /api/noauth/cloud/activateByEmailCode | activateCloudUserByEmailCode |
| [**activateEmail**](SignUpControllerApi.md#activateEmail) | **GET** /api/noauth/activateEmail | Activate User using code from Email (activateEmail) |
| [**activateUserByEmailCode**](SignUpControllerApi.md#activateUserByEmailCode) | **POST** /api/noauth/activateByEmailCode | Activate and login using code from Email (activateUserByEmailCode) |
| [**cloudMobileLogin**](SignUpControllerApi.md#cloudMobileLogin) | **GET** /api/noauth/cloud/login | Cloud mobile Login redirect (cloudMobileLogin) |
| [**deleteTenantAccount**](SignUpControllerApi.md#deleteTenantAccount) | **POST** /api/signup/tenantAccount | deleteTenantAccount |
| [**getRecaptchaParams**](SignUpControllerApi.md#getRecaptchaParams) | **GET** /api/noauth/signup/recaptchaParams | getRecaptchaParams |
| [**isDisplayWelcome**](SignUpControllerApi.md#isDisplayWelcome) | **GET** /api/signup/displayWelcome | isDisplayWelcome |
| [**mobileLogin**](SignUpControllerApi.md#mobileLogin) | **GET** /api/noauth/login | Mobile Login redirect (mobileLogin) |
| [**privacyPolicyAccepted**](SignUpControllerApi.md#privacyPolicyAccepted) | **GET** /api/signup/privacyPolicyAccepted | Check privacy policy (privacyPolicyAccepted) |
| [**resendCloudEmailActivation**](SignUpControllerApi.md#resendCloudEmailActivation) | **POST** /api/noauth/cloud/resendEmailActivation | resendCloudEmailActivation |
| [**resendEmailActivation**](SignUpControllerApi.md#resendEmailActivation) | **POST** /api/noauth/resendEmailActivation | Resend Activation Email (resendEmailActivation) |
| [**setNotDisplayWelcome**](SignUpControllerApi.md#setNotDisplayWelcome) | **POST** /api/signup/notDisplayWelcome | setNotDisplayWelcome |
| [**signUp**](SignUpControllerApi.md#signUp) | **POST** /api/noauth/signup | User Sign Up (signUp) |
| [**termsOfUseAccepted**](SignUpControllerApi.md#termsOfUseAccepted) | **GET** /api/signup/termsOfUseAccepted | Check Terms Of User (termsOfUseAccepted) |



## acceptPrivacyPolicy

> JwtPair acceptPrivacyPolicy()

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

### Parameters

This endpoint does not need any parameter.

### Return type

[**JwtPair**](JwtPair.md)

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


## acceptPrivacyPolicyAndTermsOfUse

> JwtPair acceptPrivacyPolicyAndTermsOfUse()

acceptPrivacyPolicyAndTermsOfUse

### Parameters

This endpoint does not need any parameter.

### Return type

[**JwtPair**](JwtPair.md)

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


## acceptTermsOfUse

> JwtPair acceptTermsOfUse()

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

### Parameters

This endpoint does not need any parameter.

### Return type

[**JwtPair**](JwtPair.md)

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


## activateCloudEmail

> String activateCloudEmail(emailCode, pkgName, platform)

activateCloudEmail

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String**|  | |
| **pkgName** | **String**| Optional package name of the mobile application. | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

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


## activateCloudUserByEmailCode

> JwtPair activateCloudUserByEmailCode(emailCode, pkgName, platform)

activateCloudUserByEmailCode

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String**|  | |
| **pkgName** | **String**| Optional package name of the mobile application. | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

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


## activateEmail

> String activateEmail(emailCode, pkgName, platform)

Activate User using code from Email (activateEmail)

Activate the user using code(link) from the activation email. Validates the code an redirects according to the signup flow. Checks that user was not activated yet.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String**| Activation token. | |
| **pkgName** | **String**| Optional package name of the mobile application. | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

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


## activateUserByEmailCode

> JwtPair activateUserByEmailCode(emailCode, pkgName, platform)

Activate and login using code from Email (activateUserByEmailCode)

Activate the user using code(link) from the activation email and return the JWT Token. Sends the notification and email about user activation. Checks that user was not activated yet.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String**| Activation token. | |
| **pkgName** | **String**| Optional package name of the mobile application. | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

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


## cloudMobileLogin

> String cloudMobileLogin(pkgName, platform)

Cloud mobile Login redirect (cloudMobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on cloud mobile app.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**| Mobile app package name. Used to identify the application and build the redirect link. | |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

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


## deleteTenantAccount

> deleteTenantAccount(deleteTenantRequest)

deleteTenantAccount

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteTenantRequest** | [**DeleteTenantRequest**](DeleteTenantRequest.md)|  | [optional] |

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


## getRecaptchaParams

> CaptchaClientParams getRecaptchaParams()

getRecaptchaParams

### Parameters

This endpoint does not need any parameter.

### Return type

[**CaptchaClientParams**](CaptchaClientParams.md)

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


## isDisplayWelcome

> Boolean isDisplayWelcome()

isDisplayWelcome

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


## mobileLogin

> String mobileLogin(pkgName, platform)

Mobile Login redirect (mobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on mobile app.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String**| Mobile app package name. Used to identify the application and build the redirect link. | |
| **platform** | **String**| Platform type | [enum: ANDROID, IOS] |

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


## privacyPolicyAccepted

> Boolean privacyPolicyAccepted()

Check privacy policy (privacyPolicyAccepted)

Checks that current user accepted the privacy policy.

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


## resendCloudEmailActivation

> resendCloudEmailActivation(email, pkgName, platform)

resendCloudEmailActivation

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**|  | |
| **pkgName** | **String**|  | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

null (empty response body)

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


## resendEmailActivation

> resendEmailActivation(email, pkgName, platform)

Resend Activation Email (resendEmailActivation)

Request to resend the activation email for the user. Checks that user was not activated yet.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Email of the user. | |
| **pkgName** | **String**| Optional package name of the mobile application. | [optional] |
| **platform** | **String**| Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

null (empty response body)

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


## setNotDisplayWelcome

> setNotDisplayWelcome()

setNotDisplayWelcome

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


## signUp

> SignUpResult signUp(signUpRequest)

User Sign Up (signUp)

Process user sign up request. Creates the Customer and corresponding User based on self Registration parameters for the domain. See [Self Registration Controller](/swagger-ui.html#/self-registration-controller) for more details.  The result is either &#39;SUCCESS&#39; or &#39;INACTIVE_USER_EXISTS&#39;. If Success, the user will receive an email with instruction to activate the account. The content of the email is customizable via the mail templates.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signUpRequest** | [**SignUpRequest**](SignUpRequest.md)|  | |

### Return type

[**SignUpResult**](SignUpResult.md)

### Authorization

No authorization required

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


## termsOfUseAccepted

> Boolean termsOfUseAccepted()

Check Terms Of User (termsOfUseAccepted)

Checks that current user accepted the privacy policy.

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

