# WhiteLabelingControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void deleteCurrentLoginWhiteLabelParams(DeleteCurrentLoginWhiteLabelParamsArgs args) // Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams)
void deleteCurrentWhiteLabelParams(DeleteCurrentWhiteLabelParamsArgs args) // Delete General White Labeling configuration (deleteCurrentWhiteLabelParams)
LoginWhiteLabelingParams getCurrentLoginWhiteLabelParams(GetCurrentLoginWhiteLabelParamsArgs args) // Get Login White Labeling configuration (getCurrentWhiteLabelParams)
WhiteLabelingParams getCurrentWhiteLabelParams(GetCurrentWhiteLabelParamsArgs args) // Get White Labeling configuration (getCurrentWhiteLabelParams)
LoginWhiteLabelingParams getLoginWhiteLabelParams() // Get Login White Labeling parameters
com.fasterxml.jackson.databind.JsonNode getMailTemplates(GetMailTemplatesArgs args) // Get the Mail templates settings (getMailTemplates)
WhiteLabelingParams getWhiteLabelParams() // Get White Labeling parameters
Boolean isCustomerWhiteLabelingAllowed() // Check Customer White Labeling Allowed
Boolean isWhiteLabelingAllowed() // Check White Labeling Allowed
WhiteLabelingParams previewWhiteLabelParams(PreviewWhiteLabelParamsArgs args) // Preview Login White Labeling configuration (saveWhiteLabelParams)
LoginWhiteLabelingParams saveLoginWhiteLabelParams(SaveLoginWhiteLabelParamsArgs args) // Create Or Update Login White Labeling configuration (saveWhiteLabelParams)
com.fasterxml.jackson.databind.JsonNode saveMailTemplates(SaveMailTemplatesArgs args) // Save the Mail templates settings (saveMailTemplates)
WhiteLabelingParams saveWhiteLabelParams(SaveWhiteLabelParamsArgs args) // Create Or Update White Labeling configuration (saveWhiteLabelParams)
void tenantWhiteLabelingAllowed() // tenantWhiteLabelingAllowed
```


## deleteCurrentLoginWhiteLabelParams

**DELETE** `/api/whiteLabel/currentLoginWhiteLabelParams`

Delete Login White Labeling configuration (deleteCurrentLoginWhiteLabelParams)

Delete the Login White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void deleteCurrentLoginWhiteLabelParams(DeleteCurrentLoginWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCurrentLoginWhiteLabelParamsArgs.builder()
        .build()
```

### `DeleteCurrentLoginWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## deleteCurrentWhiteLabelParams

**DELETE** `/api/whiteLabel/currentWhiteLabelParams`

Delete General White Labeling configuration (deleteCurrentWhiteLabelParams)

Delete the White Labeling configuration that corresponds to the authority of the user.   Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
void deleteCurrentWhiteLabelParams(DeleteCurrentWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCurrentWhiteLabelParamsArgs.builder()
        .build()
```

### `DeleteCurrentWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getCurrentLoginWhiteLabelParams

**GET** `/api/whiteLabel/currentLoginWhiteLabelParams`

Get Login White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the Login  White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the Login White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let's assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
LoginWhiteLabelingParams getCurrentLoginWhiteLabelParams(GetCurrentLoginWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCurrentLoginWhiteLabelParamsArgs.builder()
        .build()
```

### `GetCurrentLoginWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`LoginWhiteLabelingParams`


## getCurrentWhiteLabelParams

**GET** `/api/whiteLabel/currentWhiteLabelParams`

Get White Labeling configuration (getCurrentWhiteLabelParams)

Fetch the White Labeling configuration that corresponds to the authority of the user. The API call is designed to load the White Labeling configuration for edition. So, the result is NOT merged with the parent level White Labeling configuration. Let's assume there is a custom White Labeling  configured on a system level. And there is no custom White Labeling  items configured on a tenant level. In such a case, the API call will return default object for the tenant administrator.   Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
WhiteLabelingParams getCurrentWhiteLabelParams(GetCurrentWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCurrentWhiteLabelParamsArgs.builder()
        .build()
```

### `GetCurrentWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`WhiteLabelingParams`


## getLoginWhiteLabelParams

**GET** `/api/noauth/whiteLabel/loginWhiteLabelParams`

Get Login White Labeling parameters

Returns login white-labeling parameters based on the hostname from request.

```java
LoginWhiteLabelingParams getLoginWhiteLabelParams()
```

### Return type

`LoginWhiteLabelingParams`


## getMailTemplates

**GET** `/api/whiteLabel/mailTemplates`

Get the Mail templates settings (getMailTemplates)

Fetch Mail template settings.   Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
com.fasterxml.jackson.databind.JsonNode getMailTemplates(GetMailTemplatesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetMailTemplatesArgs.builder()
        .build()
```

### `GetMailTemplatesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `systemByDefault` | `Boolean` | no | Use system settings if settings are not defined on tenant level. | default: `false` |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## getWhiteLabelParams

**GET** `/api/whiteLabel/whiteLabelParams`

Get White Labeling parameters

Returns white-labeling parameters for the current user.

```java
WhiteLabelingParams getWhiteLabelParams()
```

### Return type

`WhiteLabelingParams`


## isCustomerWhiteLabelingAllowed

**GET** `/api/whiteLabel/isCustomerWhiteLabelingAllowed`

Check Customer White Labeling Allowed

Check if the White Labeling is enabled for the customers of the current tenant  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.  Available for users with 'TENANT_ADMIN' authority.

```java
Boolean isCustomerWhiteLabelingAllowed()
```

### Return type

`Boolean`


## isWhiteLabelingAllowed

**GET** `/api/whiteLabel/isWhiteLabelingAllowed`

Check White Labeling Allowed

Check if the White Labeling is enabled for the current user owner (tenant or customer)  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
Boolean isWhiteLabelingAllowed()
```

### Return type

`Boolean`


## previewWhiteLabelParams

**POST** `/api/whiteLabel/previewWhiteLabelParams`

Preview Login White Labeling configuration (saveWhiteLabelParams)

Merge the White Labeling configuration with the parent configuration and return the result.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
WhiteLabelingParams previewWhiteLabelParams(PreviewWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
PreviewWhiteLabelParamsArgs.builder()
        .whiteLabelingParams(WhiteLabelingParams)
        .build()
```

### `PreviewWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `whiteLabelingParams` | `WhiteLabelingParams` | **yes** |  | |

### Return type

`WhiteLabelingParams`


## saveLoginWhiteLabelParams

**POST** `/api/whiteLabel/loginWhiteLabelParams`

Create Or Update Login White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
LoginWhiteLabelingParams saveLoginWhiteLabelParams(SaveLoginWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveLoginWhiteLabelParamsArgs.builder()
        .loginWhiteLabelingParams(LoginWhiteLabelingParams)
        .build()
```

### `SaveLoginWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `loginWhiteLabelingParams` | `LoginWhiteLabelingParams` | **yes** |  | |
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`LoginWhiteLabelingParams`


## saveMailTemplates

**POST** `/api/whiteLabel/mailTemplates`

Save the Mail templates settings (saveMailTemplates)

Creates or Updates the Mail templates settings.  Available for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
com.fasterxml.jackson.databind.JsonNode saveMailTemplates(SaveMailTemplatesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveMailTemplatesArgs.builder()
        .body(Object)
        .build()
```

### `SaveMailTemplatesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `body` | `Object` | **yes** | A JSON value representing the Administration Settings. | |

### Return type

`com.fasterxml.jackson.databind.JsonNode`


## saveWhiteLabelParams

**POST** `/api/whiteLabel/whiteLabelParams`

Create Or Update White Labeling configuration (saveWhiteLabelParams)

Creates or Updates the White Labeling configuration.  Security check is performed to verify that the user has 'WRITE' permission for the white labeling resource.

```java
WhiteLabelingParams saveWhiteLabelParams(SaveWhiteLabelParamsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveWhiteLabelParamsArgs.builder()
        .whiteLabelingParams(WhiteLabelingParams)
        .build()
```

### `SaveWhiteLabelParamsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `whiteLabelingParams` | `WhiteLabelingParams` | **yes** |  | |
| `customerId` | `String` | no | A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`WhiteLabelingParams`


## tenantWhiteLabelingAllowed

**GET** `/api/tenant/whiteLabelingAllowed`

tenantWhiteLabelingAllowed

```java
void tenantWhiteLabelingAllowed()
```

### Return type

null (empty response body)

