# CloudEndpointControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void checkTenantWhiteLabelingAllowed() // checkTenantWhiteLabelingAllowed
Boolean hasDomainReadPermission() // hasDomainReadPermission
Boolean hasDomainWritePermission() // hasDomainWritePermission
Boolean tenantHasWhiteLabelRead() // tenantHasWhiteLabelRead
Boolean tenantHasWhiteLabelWrite() // tenantHasWhiteLabelWrite
```


## checkTenantWhiteLabelingAllowed

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabelingAllowed`

checkTenantWhiteLabelingAllowed

```java
void checkTenantWhiteLabelingAllowed()
```

### Return type

null (empty response body)


## hasDomainReadPermission

**GET** `/api/cloudEndpoint/permission/domain/read`

hasDomainReadPermission

```java
Boolean hasDomainReadPermission()
```

### Return type

`Boolean`


## hasDomainWritePermission

**GET** `/api/cloudEndpoint/permission/domain/write`

hasDomainWritePermission

```java
Boolean hasDomainWritePermission()
```

### Return type

`Boolean`


## tenantHasWhiteLabelRead

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabel/read`

tenantHasWhiteLabelRead

```java
Boolean tenantHasWhiteLabelRead()
```

### Return type

`Boolean`


## tenantHasWhiteLabelWrite

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabel/write`

tenantHasWhiteLabelWrite

```java
Boolean tenantHasWhiteLabelWrite()
```

### Return type

`Boolean`

