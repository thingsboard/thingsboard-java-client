# SignUpControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptPrivacyPolicy**](#acceptPrivacyPolicy) | **POST** /api/signup/acceptPrivacyPolicy | Accept privacy policy (acceptPrivacyPolicy) |
| [**acceptPrivacyPolicyAndTermsOfUse**](#acceptPrivacyPolicyAndTermsOfUse) | **POST** /api/signup/acceptPrivacyPolicyAndTermsOfUse | acceptPrivacyPolicyAndTermsOfUse |
| [**acceptTermsOfUse**](#acceptTermsOfUse) | **POST** /api/signup/acceptTermsOfUse | Accept Terms of Use (acceptTermsOfUse) |
| [**activateCloudEmail**](#activateCloudEmail) | **GET** /api/noauth/cloud/activateEmail | activateCloudEmail |
| [**activateCloudUserByEmailCode**](#activateCloudUserByEmailCode) | **POST** /api/noauth/cloud/activateByEmailCode | activateCloudUserByEmailCode |
| [**activateEmail**](#activateEmail) | **GET** /api/noauth/activateEmail | Activate User using code from Email (activateEmail) |
| [**activateUserByEmailCode**](#activateUserByEmailCode) | **POST** /api/noauth/activateByEmailCode | Activate and login using code from Email (activateUserByEmailCode) |
| [**cloudMobileLogin**](#cloudMobileLogin) | **GET** /api/noauth/cloud/login | Cloud mobile Login redirect (cloudMobileLogin) |
| [**deleteTenantAccount**](#deleteTenantAccount) | **POST** /api/signup/tenantAccount | deleteTenantAccount |
| [**getRecaptchaParams**](#getRecaptchaParams) | **GET** /api/noauth/signup/recaptchaParams | getRecaptchaParams |
| [**isDisplayWelcome**](#isDisplayWelcome) | **GET** /api/signup/displayWelcome | isDisplayWelcome |
| [**mobileLogin**](#mobileLogin) | **GET** /api/noauth/login | Mobile Login redirect (mobileLogin) |
| [**privacyPolicyAccepted**](#privacyPolicyAccepted) | **GET** /api/signup/privacyPolicyAccepted | Check privacy policy (privacyPolicyAccepted) |
| [**resendCloudEmailActivation**](#resendCloudEmailActivation) | **POST** /api/noauth/cloud/resendEmailActivation | resendCloudEmailActivation |
| [**resendEmailActivation**](#resendEmailActivation) | **POST** /api/noauth/resendEmailActivation | Resend Activation Email (resendEmailActivation) |
| [**setNotDisplayWelcome**](#setNotDisplayWelcome) | **POST** /api/signup/notDisplayWelcome | setNotDisplayWelcome |
| [**signUp**](#signUp) | **POST** /api/noauth/signup | User Sign Up (signUp) |
| [**termsOfUseAccepted**](#termsOfUseAccepted) | **GET** /api/signup/termsOfUseAccepted | Check Terms Of User (termsOfUseAccepted) |



## acceptPrivacyPolicy

> JwtPair acceptPrivacyPolicy()

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

## acceptPrivacyPolicyAndTermsOfUse

> JwtPair acceptPrivacyPolicyAndTermsOfUse()

acceptPrivacyPolicyAndTermsOfUse

## acceptTermsOfUse

> JwtPair acceptTermsOfUse()

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

## activateCloudEmail

> String activateCloudEmail(emailCode, pkgName, platform)

activateCloudEmail

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** |  | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## activateCloudUserByEmailCode

> JwtPair activateCloudUserByEmailCode(emailCode, pkgName, platform)

activateCloudUserByEmailCode

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** |  | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## activateEmail

> String activateEmail(emailCode, pkgName, platform)

Activate User using code from Email (activateEmail)

Activate the user using code(link) from the activation email. Validates the code an redirects according to the signup flow. Checks that user was not activated yet.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** | Activation token. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## activateUserByEmailCode

> JwtPair activateUserByEmailCode(emailCode, pkgName, platform)

Activate and login using code from Email (activateUserByEmailCode)

Activate the user using code(link) from the activation email and return the JWT Token. Sends the notification and email about user activation. Checks that user was not activated yet.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** | Activation token. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## cloudMobileLogin

> String cloudMobileLogin(pkgName, platform)

Cloud mobile Login redirect (cloudMobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on cloud mobile app.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile app package name. Used to identify the application and build the redirect link. | |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## deleteTenantAccount

> deleteTenantAccount(deleteTenantRequest)

deleteTenantAccount

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteTenantRequest** | **DeleteTenantRequest** |  | [optional] |


## getRecaptchaParams

> CaptchaClientParams getRecaptchaParams()

getRecaptchaParams

## isDisplayWelcome

> Boolean isDisplayWelcome()

isDisplayWelcome

## mobileLogin

> String mobileLogin(pkgName, platform)

Mobile Login redirect (mobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on mobile app.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile app package name. Used to identify the application and build the redirect link. | |
| **platform** | **String** | Platform type | [enum: ANDROID, IOS] |


## privacyPolicyAccepted

> Boolean privacyPolicyAccepted()

Check privacy policy (privacyPolicyAccepted)

Checks that current user accepted the privacy policy.

## resendCloudEmailActivation

> resendCloudEmailActivation(email, pkgName, platform)

resendCloudEmailActivation

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String** |  | |
| **pkgName** | **String** |  | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## resendEmailActivation

> resendEmailActivation(email, pkgName, platform)

Resend Activation Email (resendEmailActivation)

Request to resend the activation email for the user. Checks that user was not activated yet.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String** | Email of the user. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |


## setNotDisplayWelcome

> setNotDisplayWelcome()

setNotDisplayWelcome

## signUp

> SignUpResult signUp(signUpRequest)

User Sign Up (signUp)

Process user sign up request. Creates the Customer and corresponding User based on self Registration parameters for the domain. See [Self Registration Controller](/swagger-ui.html#/self-registration-controller) for more details.  The result is either &#39;SUCCESS&#39; or &#39;INACTIVE_USER_EXISTS&#39;. If Success, the user will receive an email with instruction to activate the account. The content of the email is customizable via the mail templates.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signUpRequest** | **SignUpRequest** |  | |


## termsOfUseAccepted

> Boolean termsOfUseAccepted()

Check Terms Of User (termsOfUseAccepted)

Checks that current user accepted the privacy policy.
