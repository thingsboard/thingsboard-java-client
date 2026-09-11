# CloudEndpointControllerApi

`ThingsboardClient` methods:

> Every method that takes input also has a request-object overload — `<method>(<Method>Args args)`,
> built via `<Method>Args.builder()...build()`. The `*Args` classes are nested in `ThingsboardApi`,
> e.g. `import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Prefer that overload in
> new code: adding an optional parameter to an endpoint changes the flat signatures documented
> below, but only adds a builder field to `*Args`.

```
void checkTenantWhiteLabelingAllowed() // checkTenantWhiteLabelingAllowed
Boolean hasDomainReadPermission() // hasDomainReadPermission
Boolean hasDomainWritePermission() // hasDomainWritePermission
Boolean tenantHasWhiteLabelRead() // tenantHasWhiteLabelRead
Boolean tenantHasWhiteLabelWrite() // tenantHasWhiteLabelWrite
```


## checkTenantWhiteLabelingAllowed

```
void checkTenantWhiteLabelingAllowed()
```

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabelingAllowed`

checkTenantWhiteLabelingAllowed

### Return type

null (empty response body)


## hasDomainReadPermission

```
Boolean hasDomainReadPermission()
```

**GET** `/api/cloudEndpoint/permission/domain/read`

hasDomainReadPermission

### Return type

**Boolean**


## hasDomainWritePermission

```
Boolean hasDomainWritePermission()
```

**GET** `/api/cloudEndpoint/permission/domain/write`

hasDomainWritePermission

### Return type

**Boolean**


## tenantHasWhiteLabelRead

```
Boolean tenantHasWhiteLabelRead()
```

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabel/read`

tenantHasWhiteLabelRead

### Return type

**Boolean**


## tenantHasWhiteLabelWrite

```
Boolean tenantHasWhiteLabelWrite()
```

**GET** `/api/cloudEndpoint/tenant/permission/whiteLabel/write`

tenantHasWhiteLabelWrite

### Return type

**Boolean**

