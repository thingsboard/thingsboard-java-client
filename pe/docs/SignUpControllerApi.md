# SignUpControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptPrivacyPolicy**](#acceptPrivacyPolicy) | **POST** /api/signup/acceptPrivacyPolicy | Accept privacy policy (acceptPrivacyPolicy) |
| [**acceptTermsOfUse**](#acceptTermsOfUse) | **POST** /api/signup/acceptTermsOfUse | Accept Terms of Use (acceptTermsOfUse) |
| [**activateEmail**](#activateEmail) | **GET** /api/noauth/activateEmail | Activate User using code from Email (activateEmail) |
| [**activateUserByEmailCode**](#activateUserByEmailCode) | **POST** /api/noauth/activateByEmailCode | Activate and login using code from Email (activateUserByEmailCode) |
| [**mobileLogin**](#mobileLogin) | **GET** /api/noauth/login | Mobile Login redirect (mobileLogin) |
| [**privacyPolicyAccepted**](#privacyPolicyAccepted) | **GET** /api/signup/privacyPolicyAccepted | Check privacy policy (privacyPolicyAccepted) |
| [**resendEmailActivation**](#resendEmailActivation) | **POST** /api/noauth/resendEmailActivation | Resend Activation Email (resendEmailActivation) |
| [**signUp**](#signUp) | **POST** /api/noauth/signup | User Sign Up (signUp) |
| [**termsOfUseAccepted**](#termsOfUseAccepted) | **GET** /api/signup/termsOfUseAccepted | Check Terms Of User (termsOfUseAccepted) |



## acceptPrivacyPolicy

> com.fasterxml.jackson.databind.JsonNode acceptPrivacyPolicy()

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

## acceptTermsOfUse

> com.fasterxml.jackson.databind.JsonNode acceptTermsOfUse()

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

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
