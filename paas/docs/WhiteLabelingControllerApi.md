# WhiteLabelingControllerApi

`ThingsboardClient` methods:

```
void deleteCurrentLoginWhiteLabelParams(@Nullable String customerId) // Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams)
void deleteCurrentWhiteLabelParams(@Nullable String customerId) // Delete General White Labeling configuration (deleteCurrentWhiteLabelParams)
LoginWhiteLabelingParams getCurrentLoginWhiteLabelParams(@Nullable String customerId) // Get Login White Labeling configuration (getCurrentWhiteLabelParams)
WhiteLabelingParams getCurrentWhiteLabelParams(@Nullable String customerId) // Get White Labeling configuration (getCurrentWhiteLabelParams)
LoginWhiteLabelingParams getLoginWhiteLabelParams() // Get Login White Labeling parameters
com.fasterxml.jackson.databind.JsonNode getMailTemplates(@Nullable Boolean systemByDefault) // Get the Mail templates settings (getMailTemplates)
WhiteLabelingParams getWhiteLabelParams() // Get White Labeling parameters
Boolean isCustomerWhiteLabelingAllowed() // Check Customer White Labeling Allowed
Boolean isWhiteLabelingAllowed() // Check White Labeling Allowed
WhiteLabelingParams previewWhiteLabelParams(@Nonnull WhiteLabelingParams whiteLabelingParams) // Preview Login White Labeling configuration (saveWhiteLabelParams)
LoginWhiteLabelingParams saveLoginWhiteLabelParams(@Nonnull LoginWhiteLabelingParams loginWhiteLabelingParams, @Nullable String customerId) // Create Or Update Login White Labeling configuration (saveWhiteLabelParams)
com.fasterxml.jackson.databind.JsonNode saveMailTemplates(@Nonnull Object body) // Save the Mail templates settings (saveMailTemplates)
WhiteLabelingParams saveWhiteLabelParams(@Nonnull WhiteLabelingParams whiteLabelingParams, @Nullable String customerId) // Create Or Update White Labeling configuration (saveWhiteLabelParams)
void tenantWhiteLabelingAllowed() // tenantWhiteLabelingAllowed
```


## deleteCurrentLoginWhiteLabelParams

```
void deleteCurrentLoginWhiteLabelParams(@Nullable String customerId)
```

**DELETE** `/api/whiteLabel/currentLoginWhiteLabelParams`

Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams)

Delete the Login White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

null (empty response body)


## deleteCurrentWhiteLabelParams

```
void deleteCurrentWhiteLabelParams(@Nullable String customerId)
```

**DELETE** `/api/whiteLabel/currentWhiteLabelParams`

Delete General White Labeling configuration (deleteCurrentWhiteLabelParams)

Delete the White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

null (empty response body)


## getCurrentLoginWhiteLabelParams

```
LoginWhiteLabelingParams getCurrentLoginWhiteLabelParams(@Nullable String customerId)
```

**GET** `/api/whiteLabel/currentLoginWhiteLabelParams`

Get Login White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the Login  White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the Login White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let's assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has 'READ' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**LoginWhiteLabelingParams**


## getCurrentWhiteLabelParams

```
WhiteLabelingParams getCurrentWhiteLabelParams(@Nullable String customerId)
```

**GET** `/api/whiteLabel/currentWhiteLabelParams`

Get White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let's assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has 'READ' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**WhiteLabelingParams**


## getLoginWhiteLabelParams

```
LoginWhiteLabelingParams getLoginWhiteLabelParams()
```

**GET** `/api/noauth/whiteLabel/loginWhiteLabelParams`

Get Login White Labeling parameters

Returns login white-labeling parameters based on the hostname from request.

### Return type

**LoginWhiteLabelingParams**


## getMailTemplates

```
com.fasterxml.jackson.databind.JsonNode getMailTemplates(@Nullable Boolean systemByDefault)
```

**GET** `/api/whiteLabel/mailTemplates`

Get the Mail templates settings (getMailTemplates)

Fetch Mail template settings.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **systemByDefault** | **Boolean** | Use system settings if settings are not defined on tenant level. | [optional] [default to false] |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## getWhiteLabelParams

```
WhiteLabelingParams getWhiteLabelParams()
```

**GET** `/api/whiteLabel/whiteLabelParams`

Get White Labeling parameters

Returns white-labeling parameters for the current user.

### Return type

**WhiteLabelingParams**


## isCustomerWhiteLabelingAllowed

```
Boolean isCustomerWhiteLabelingAllowed()
```

**GET** `/api/whiteLabel/isCustomerWhiteLabelingAllowed`

Check Customer White Labeling Allowed

Check if the White Labeling is enabled for the customers of the current tenant  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.  Available for users with 'TENANT_ADMIN' authority.

### Return type

**Boolean**


## isWhiteLabelingAllowed

```
Boolean isWhiteLabelingAllowed()
```

**GET** `/api/whiteLabel/isWhiteLabelingAllowed`

Check White Labeling Allowed

Check if the White Labeling is enabled for the current user owner (tenant or customer)  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

### Return type

**Boolean**


## previewWhiteLabelParams

```
WhiteLabelingParams previewWhiteLabelParams(@Nonnull WhiteLabelingParams whiteLabelingParams)
```

**POST** `/api/whiteLabel/previewWhiteLabelParams`

Preview Login White Labeling configuration (saveWhiteLabelParams)

Merge the White Labeling configuration with the parent configuration and return the result.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **whiteLabelingParams** | **WhiteLabelingParams** |  | |

### Return type

**WhiteLabelingParams**


## saveLoginWhiteLabelParams

```
LoginWhiteLabelingParams saveLoginWhiteLabelParams(@Nonnull LoginWhiteLabelingParams loginWhiteLabelingParams, @Nullable String customerId)
```

**POST** `/api/whiteLabel/loginWhiteLabelParams`

Create Or Update Login White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginWhiteLabelingParams** | **LoginWhiteLabelingParams** |  | |
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**LoginWhiteLabelingParams**


## saveMailTemplates

```
com.fasterxml.jackson.databind.JsonNode saveMailTemplates(@Nonnull Object body)
```

**POST** `/api/whiteLabel/mailTemplates`

Save the Mail templates settings (saveMailTemplates)

Creates or Updates the Mail templates settings.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object** | A JSON value representing the Administration Settings. | |

### Return type

**com.fasterxml.jackson.databind.JsonNode**


## saveWhiteLabelParams

```
WhiteLabelingParams saveWhiteLabelParams(@Nonnull WhiteLabelingParams whiteLabelingParams, @Nullable String customerId)
```

**POST** `/api/whiteLabel/whiteLabelParams`

Create Or Update White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **whiteLabelingParams** | **WhiteLabelingParams** |  | |
| **customerId** | **String** | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | [optional] |

### Return type

**WhiteLabelingParams**


## tenantWhiteLabelingAllowed

```
void tenantWhiteLabelingAllowed()
```

**GET** `/api/tenant/whiteLabelingAllowed`

tenantWhiteLabelingAllowed

### Return type

null (empty response body)

