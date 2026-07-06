# TwoFactorAuthControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
JwtPair authenticateByTwoFaConfigurationToken() // Get regular token pair after successfully configuring 2FA
JwtPair checkTwoFaVerificationCode(CheckTwoFaVerificationCodeArgs args) // Check 2FA verification code (checkTwoFaVerificationCode)
List<TwoFaProviderInfo> getAvailableTwoFaProviderInfos() // Get available 2FA providers (getAvailableTwoFaProviderInfos)
void requestTwoFaVerificationCode(RequestTwoFaVerificationCodeArgs args) // Request 2FA verification code (requestTwoFaVerificationCode)
```


## authenticateByTwoFaConfigurationToken

**POST** `/api/auth/2fa/login`

Get regular token pair after successfully configuring 2FA

Checks 2FA is configured, returning token pair on success.

```java
JwtPair authenticateByTwoFaConfigurationToken()
```

### Return type

`JwtPair`


## checkTwoFaVerificationCode

**POST** `/api/auth/2fa/verification/check`

Check 2FA verification code (checkTwoFaVerificationCode)

Checks 2FA verification code, and if it is correct the method returns a regular access and refresh token pair.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings), and also will block a user after X unsuccessful verification attempts if such behavior is configured (in TwoFactorAuthSettings).  Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.

```java
JwtPair checkTwoFaVerificationCode(CheckTwoFaVerificationCodeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckTwoFaVerificationCodeArgs.builder()
        .providerType(TwoFaProviderType)
        .verificationCode(String)
        .build()
```

### `CheckTwoFaVerificationCodeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `providerType` | `TwoFaProviderType` | **yes** |  | enum: `TOTP`, `SMS`, `EMAIL`, `BACKUP_CODE` |
| `verificationCode` | `String` | **yes** |  | |

### Return type

`JwtPair`


## getAvailableTwoFaProviderInfos

**GET** `/api/auth/2fa/providers`

Get available 2FA providers (getAvailableTwoFaProviderInfos)

Get the list of 2FA provider infos available for user to use. Example: ``` [   {     \"type\": \"EMAIL\",     \"default\": true,     \"contact\": \"ab*****ko@gmail.com\"   },   {     \"type\": \"TOTP\",     \"default\": false,     \"contact\": null   },   {     \"type\": \"SMS\",     \"default\": false,     \"contact\": \"+38********12\"   } ] ```

```java
List<TwoFaProviderInfo> getAvailableTwoFaProviderInfos()
```

### Return type

`List<TwoFaProviderInfo>`


## requestTwoFaVerificationCode

**POST** `/api/auth/2fa/verification/send`

Request 2FA verification code (requestTwoFaVerificationCode)

Request 2FA verification code.  To make a request to this endpoint, you need an access token with the scope of PRE_VERIFICATION_TOKEN, which is issued on username/password auth if 2FA is enabled.  The API method is rate limited (using rate limit config from TwoFactorAuthSettings). Will return a Bad Request error if provider is not configured for usage, and Too Many Requests error if rate limits are exceeded.

```java
void requestTwoFaVerificationCode(RequestTwoFaVerificationCodeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RequestTwoFaVerificationCodeArgs.builder()
        .providerType(TwoFaProviderType)
        .build()
```

### `RequestTwoFaVerificationCodeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `providerType` | `TwoFaProviderType` | **yes** |  | enum: `TOTP`, `SMS`, `EMAIL`, `BACKUP_CODE` |

### Return type

null (empty response body)

