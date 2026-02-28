# LoginEndpointApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**login**](#login) | **POST** /api/auth/login | Login method to get user JWT token data |
| [**refreshToken**](#refreshToken) | **POST** /api/auth/token | Refresh user JWT token data |



## login

> LoginResponse login(loginRequest)

Login method to get user JWT token data

Login method used to authenticate user and get JWT token data.  Value of the response **token** field can be used as **X-Authorization** header value:  &#x60;X-Authorization: Bearer $JWT_TOKEN_VALUE&#x60;.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginRequest** | **LoginRequest** | Login request | [optional] |


## refreshToken

> LoginResponse refreshToken(refreshTokenRequest)

Refresh user JWT token data

Method to refresh JWT token. Provide a valid refresh token to get a new JWT token.  The response contains a new token that can be used for authorization.  &#x60;X-Authorization: Bearer $JWT_TOKEN_VALUE&#x60;

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshTokenRequest** | **RefreshTokenRequest** | Refresh token request | [optional] |

