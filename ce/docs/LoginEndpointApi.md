# LoginEndpointApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
LoginResponse login(LoginArgs args) // Login method to get user JWT token data
LoginResponse refreshToken(RefreshTokenArgs args) // Refresh user JWT token data
```


## login

**POST** `/api/auth/login`

Login method to get user JWT token data

Login method used to authenticate user and get JWT token data.  Value of the response **token** field can be used as **X-Authorization** header value:  `X-Authorization: Bearer $JWT_TOKEN_VALUE`.

```java
LoginResponse login(LoginArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
LoginArgs.builder()
        .build()
```

### `LoginArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `loginRequest` | `LoginRequest` | no | Login request | |

### Return type

`LoginResponse`


## refreshToken

**POST** `/api/auth/token`

Refresh user JWT token data

Method to refresh JWT token. Provide a valid refresh token to get a new JWT token.  The response contains a new token that can be used for authorization.  `X-Authorization: Bearer $JWT_TOKEN_VALUE`

```java
LoginResponse refreshToken(RefreshTokenArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RefreshTokenArgs.builder()
        .build()
```

### `RefreshTokenArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `refreshTokenRequest` | `RefreshTokenRequest` | no | Refresh token request | |

### Return type

`LoginResponse`

