

# OAuth2Client


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**OAuth2ClientId**](OAuth2ClientId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional info of OAuth2 client (e.g. providerName) |  |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] |
|**title** | **String** | Oauth2 client title |  |
|**mapperConfig** | [**OAuth2MapperConfig**](OAuth2MapperConfig.md) | Config for mapping OAuth2 log in response to platform entities |  |
|**clientId** | **String** | OAuth2 client ID. Cannot be empty |  |
|**clientSecret** | **String** | OAuth2 client secret. Cannot be empty |  |
|**authorizationUri** | **String** | Authorization URI of the OAuth2 provider. Cannot be empty |  |
|**accessTokenUri** | **String** | Access token URI of the OAuth2 provider. Cannot be empty |  |
|**scope** | **List&lt;String&gt;** | OAuth scopes that will be requested from OAuth2 platform. Cannot be empty |  |
|**userInfoUri** | **String** | User info URI of the OAuth2 provider |  [optional] |
|**userNameAttributeName** | **String** | Name of the username attribute in OAuth2 provider response. Cannot be empty |  |
|**jwkSetUri** | **String** | JSON Web Key URI of the OAuth2 provider |  [optional] |
|**clientAuthenticationMethod** | **String** | Client authentication method to use: &#39;BASIC&#39; or &#39;POST&#39;. Cannot be empty |  |
|**loginButtonLabel** | **String** | OAuth2 provider label. Cannot be empty |  |
|**loginButtonIcon** | **String** | Log in button icon for OAuth2 provider |  [optional] |
|**platforms** | **List&lt;PlatformType&gt;** | List of platforms for which usage of the OAuth2 client is allowed (empty for all allowed) |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |



