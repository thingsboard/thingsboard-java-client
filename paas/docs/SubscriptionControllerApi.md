# SubscriptionControllerApi

`ThingsboardClient` methods:

```
DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration() // getMergedTenantProfileConfiguration
DefaultTenantProfileConfiguration getTenantProfileConfigurationById(@Nonnull String tenantProfileId) // getTenantProfileConfigurationById
SubscriptionDetails getTenantSubscription() // getTenantSubscription
SubscriptionUsage getTenantSubscriptionUsage() // getTenantSubscriptionUsage
Boolean trendzUsed() // trendzUsed
```


## getMergedTenantProfileConfiguration

```
DefaultTenantProfileConfiguration getMergedTenantProfileConfiguration()
```

**GET** `/api/tenant/subscription/mergedProfileConfig`

getMergedTenantProfileConfiguration

### Return type

**DefaultTenantProfileConfiguration**


## getTenantProfileConfigurationById

```
DefaultTenantProfileConfiguration getTenantProfileConfigurationById(@Nonnull String tenantProfileId)
```

**GET** `/api/tenantProfile/{tenantProfileId}/profileConfig`

getTenantProfileConfigurationById


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** |  | |

### Return type

**DefaultTenantProfileConfiguration**


## getTenantSubscription

```
SubscriptionDetails getTenantSubscription()
```

**GET** `/api/tenant/subscription`

getTenantSubscription

### Return type

**SubscriptionDetails**


## getTenantSubscriptionUsage

```
SubscriptionUsage getTenantSubscriptionUsage()
```

**GET** `/api/tenant/subscription/usage`

getTenantSubscriptionUsage

### Return type

**SubscriptionUsage**


## trendzUsed

```
Boolean trendzUsed()
```

**GET** `/api/tenant/subscription/trendzUsed`

trendzUsed

### Return type

**Boolean**

