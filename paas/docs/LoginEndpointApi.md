# LoginEndpointApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
LoginResponse login(@Nullable LoginRequest loginRequest) // Login method to get user JWT token data
LoginResponse refreshToken(@Nullable RefreshTokenRequest refreshTokenRequest) // Refresh user JWT token data
```


## login

```
LoginResponse login(@Nullable LoginRequest loginRequest)
```

**POST** `/api/auth/login`

Login method to get user JWT token data

Login method used to authenticate user and get JWT token data.  Value of the response **token** field can be used as **X-Authorization** header value:  `X-Authorization: Bearer $JWT_TOKEN_VALUE`.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginRequest** | **LoginRequest** | Login request | [optional] |

### Return type

**LoginResponse**


## refreshToken

```
LoginResponse refreshToken(@Nullable RefreshTokenRequest refreshTokenRequest)
```

**POST** `/api/auth/token`

Refresh user JWT token data

Method to refresh JWT token. Provide a valid refresh token to get a new JWT token.  The response contains a new token that can be used for authorization.  `X-Authorization: Bearer $JWT_TOKEN_VALUE`


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshTokenRequest** | **RefreshTokenRequest** | Refresh token request | [optional] |

### Return type

**LoginResponse**

