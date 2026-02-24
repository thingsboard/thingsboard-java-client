

# JwtSettings

A JSON value representing the JWT Settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenExpirationTime** | **Integer** | The JWT will expire after seconds. |  [optional] |
|**refreshTokenExpTime** | **Integer** | The JWT can be refreshed during seconds. |  [optional] |
|**tokenIssuer** | **String** | The JWT issuer. |  [optional] |
|**tokenSigningKey** | **String** | The JWT key is used to sing token. Base64 encoded. |  [optional] |



