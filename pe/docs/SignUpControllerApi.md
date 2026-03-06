# SignUpControllerApi

`ThingsboardClient` methods:

```
com.fasterxml.jackson.databind.JsonNode acceptPrivacyPolicy() // Accept privacy policy (acceptPrivacyPolicy)
com.fasterxml.jackson.databind.JsonNode acceptTermsOfUse() // Accept Terms of Use (acceptTermsOfUse)
String activateEmail(@Nonnull String emailCode, @Nullable String pkgName, @Nullable String platform) // Activate User using code from Email (activateEmail)
JwtPair activateUserByEmailCode(@Nonnull String emailCode, @Nullable String pkgName, @Nullable String platform) // Activate and login using code from Email (activateUserByEmailCode)
String mobileLogin(@Nonnull String pkgName, @Nonnull String platform) // Mobile Login redirect (mobileLogin)
Boolean privacyPolicyAccepted() // Check privacy policy (privacyPolicyAccepted)
void resendEmailActivation(@Nonnull String email, @Nullable String pkgName, @Nullable String platform) // Resend Activation Email (resendEmailActivation)
SignUpResult signUp(@Nonnull SignUpRequest signUpRequest) // User Sign Up (signUp)
Boolean termsOfUseAccepted() // Check Terms Of User (termsOfUseAccepted)
```


## acceptPrivacyPolicy

```
com.fasterxml.jackson.databind.JsonNode acceptPrivacyPolicy()
```

**POST** `/api/signup/acceptPrivacyPolicy`

Accept privacy policy (acceptPrivacyPolicy)

Accept privacy policy by the current user.

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## acceptTermsOfUse

```
com.fasterxml.jackson.databind.JsonNode acceptTermsOfUse()
```

**POST** `/api/signup/acceptTermsOfUse`

Accept Terms of Use (acceptTermsOfUse)

Accept Terms of Use by the current user.

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## activateEmail

```
String activateEmail(@Nonnull String emailCode, @Nullable String pkgName, @Nullable String platform)
```

**GET** `/api/noauth/activateEmail`

Activate User using code from Email (activateEmail)

Activate the user using code(link) from the activation email. Validates the code an redirects according to the signup flow. Checks that user was not activated yet.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** | Activation token. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

**String**


## activateUserByEmailCode

```
JwtPair activateUserByEmailCode(@Nonnull String emailCode, @Nullable String pkgName, @Nullable String platform)
```

**POST** `/api/noauth/activateByEmailCode`

Activate and login using code from Email (activateUserByEmailCode)

Activate the user using code(link) from the activation email and return the JWT Token. Sends the notification and email about user activation. Checks that user was not activated yet.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailCode** | **String** | Activation token. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

**JwtPair**


## mobileLogin

```
String mobileLogin(@Nonnull String pkgName, @Nonnull String platform)
```

**GET** `/api/noauth/login`

Mobile Login redirect (mobileLogin)

This method generates redirect to the special link that is handled by mobile application. Useful for email verification flow on mobile app.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pkgName** | **String** | Mobile app package name. Used to identify the application and build the redirect link. | |
| **platform** | **String** | Platform type | [enum: ANDROID, IOS] |

### Return type

**String**


## privacyPolicyAccepted

```
Boolean privacyPolicyAccepted()
```

**GET** `/api/signup/privacyPolicyAccepted`

Check privacy policy (privacyPolicyAccepted)

Checks that current user accepted the privacy policy.

### Return type

**Boolean**


## resendEmailActivation

```
void resendEmailActivation(@Nonnull String email, @Nullable String pkgName, @Nullable String platform)
```

**POST** `/api/noauth/resendEmailActivation`

Resend Activation Email (resendEmailActivation)

Request to resend the activation email for the user. Checks that user was not activated yet.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String** | Email of the user. | |
| **pkgName** | **String** | Optional package name of the mobile application. | [optional] |
| **platform** | **String** | Platform type | [optional] [enum: ANDROID, IOS] |

### Return type

null (empty response body)


## signUp

```
SignUpResult signUp(@Nonnull SignUpRequest signUpRequest)
```

**POST** `/api/noauth/signup`

User Sign Up (signUp)

Process user sign up request. Creates the Customer and corresponding User based on self Registration parameters for the domain. See [Self Registration Controller](/swagger-ui.html#/self-registration-controller) for more details.  The result is either 'SUCCESS' or 'INACTIVE_USER_EXISTS'. If Success, the user will receive an email with instruction to activate the account. The content of the email is customizable via the mail templates.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signUpRequest** | **SignUpRequest** |  | |

### Return type

**SignUpResult**


## termsOfUseAccepted

```
Boolean termsOfUseAccepted()
```

**GET** `/api/signup/termsOfUseAccepted`

Check Terms Of User (termsOfUseAccepted)

Checks that current user accepted the privacy policy.

### Return type

**Boolean**

