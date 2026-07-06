# SubscriptionControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration() // getMergedTenantProfileConfiguration
DefaultTenantProfileConfiguration getTenantProfileConfigurationById(GetTenantProfileConfigurationByIdArgs args) // getTenantProfileConfigurationById
SubscriptionDetails getTenantSubscription() // getTenantSubscription
SubscriptionUsage getTenantSubscriptionUsage() // getTenantSubscriptionUsage
Boolean trendzUsed() // trendzUsed
```


## getMergedTenantProfileConfiguration

**GET** `/api/tenant/subscription/mergedProfileConfig`

getMergedTenantProfileConfiguration

```java
DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration()
```

### Return type

`DefaultTenantProfileConfiguration`


## getTenantProfileConfigurationById

**GET** `/api/tenantProfile/{tenantProfileId}/profileConfig`

getTenantProfileConfigurationById

```java
DefaultTenantProfileConfiguration getTenantProfileConfigurationById(GetTenantProfileConfigurationByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetTenantProfileConfigurationByIdArgs.builder()
        .tenantProfileId(String)
        .build()
```

### `GetTenantProfileConfigurationByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `tenantProfileId` | `String` | **yes** |  | |

### Return type

`DefaultTenantProfileConfiguration`


## getTenantSubscription

**GET** `/api/tenant/subscription`

getTenantSubscription

```java
SubscriptionDetails getTenantSubscription()
```

### Return type

`SubscriptionDetails`


## getTenantSubscriptionUsage

**GET** `/api/tenant/subscription/usage`

getTenantSubscriptionUsage

```java
SubscriptionUsage getTenantSubscriptionUsage()
```

### Return type

`SubscriptionUsage`


## trendzUsed

**GET** `/api/tenant/subscription/trendzUsed`

trendzUsed

```java
Boolean trendzUsed()
```

### Return type

`Boolean`

